package br.com.seteideias.interceptorfeignclient.service;

import br.com.seteideias.interceptorfeignclient.client.OrderFindCTECargon;
import br.com.seteideias.interceptorfeignclient.client.OrderSenderUello;
import br.com.seteideias.interceptorfeignclient.entity.TransportOrder;
import br.com.seteideias.interceptorfeignclient.entity.cargon.BodyToCargon;
import br.com.seteideias.interceptorfeignclient.entity.cargon.CargonResponse;
import br.com.seteideias.interceptorfeignclient.entity.uello.Invoice;
import br.com.seteideias.interceptorfeignclient.entity.uello.OrderUello;
import br.com.seteideias.interceptorfeignclient.entity.uello.OrderUelloResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    //simula o tratamento de payload necessario para poder enviar a uello
    @Autowired
    private OrderFindCTECargon orderFindCTECargon;

    @Autowired
    private OrderSenderUello orderSenderUello;

    @Autowired
    PartnerService partnerService;
    @Value("${client.cargon.bearerToken}")
    private String bearerToken;

    @Value("${client.cargon.toogle_buscarNaCargon}")
    boolean apiCargonAtiva;

    @Value("${client.uello.apikey}")
    String apiUello;

    public void send(TransportOrder transportOrder) {

        BodyToCargon bodyToCargon = null;
        CargonResponse cargonResponse = new CargonResponse();

        if (apiCargonAtiva) {
            bodyToCargon = new BodyToCargon();
            bodyToCargon.setNumero(transportOrder.getOrderNumber());

            cargonResponse = orderFindCTECargon.getCTE(bearerToken, bodyToCargon);
        }

        Invoice invoice = quebrarNumeroDeRetornoDaCargon(cargonResponse.getChaveCte());

        OrderUello orderUello = OrderUello.builder()
                .invoice(invoice)
                .build();
        orderUello.setInvoice(invoice);

        // agora antes de criar o pedido, o novo contexto será carregado
        orderSenderUello.createOrder(apiUello, orderUello);

    }

    private Invoice quebrarNumeroDeRetornoDaCargon(String numeroAQuebrar) {

        Invoice invoice = new Invoice();
        invoice.setKey(numeroAQuebrar);
        invoice.setNumber(numeroAQuebrar.substring(27, 35));
        invoice.setData(numeroAQuebrar.substring(27, 35));
        invoice.setSerie(numeroAQuebrar.substring(4, 7));
        invoice.setTotal(null);

        return invoice;
    }

}
