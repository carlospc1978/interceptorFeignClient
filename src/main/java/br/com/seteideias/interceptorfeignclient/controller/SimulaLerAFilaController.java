package br.com.seteideias.interceptorfeignclient.controller;

import br.com.seteideias.interceptorfeignclient.entity.TransportOrder;
import br.com.seteideias.interceptorfeignclient.exception.BackResponse;
import br.com.seteideias.interceptorfeignclient.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class SimulaLerAFilaController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<BackResponse> simulaTerLidoAFilaDe_RECEIVED_ORDER(@Valid @RequestBody TransportOrder order) {

        orderService.send(order);

        ResponseEntity responseEntity = new ResponseEntity("OK - ", HttpStatus.OK);

        BackResponse backResponse = new BackResponse(responseEntity.getStatusCode().toString(),"menasagem dois");

        return ResponseEntity.ok(backResponse);
    }




}
