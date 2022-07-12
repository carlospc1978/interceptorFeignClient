package br.com.seteideias.interceptorfeignclient.controller;

import br.com.seteideias.interceptorfeignclient.entity.TransportOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimulaLerAFilaController {

    @PostMapping
    public void simulaTerLidoAFilaDe_RECEIVED_ORDER(@RequestBody TransportOrder order){

        // vou simular apenas pedidos para a Uello
        System.out.println(order.toString());

    }

}
