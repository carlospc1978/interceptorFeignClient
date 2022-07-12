package br.com.seteideias.interceptorfeignclient.service;

import br.com.seteideias.interceptorfeignclient.entity.TransportOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    //simula o tratamento de payload necessario para poder enviar a uello

    @Autowired
    PartnerService partnerService;

    public void send(TransportOrder transportOrder) {

    }

}
