package br.com.seteideias.interceptorfeignclient.entity.cargon;

import lombok.Data;

@Data
public class BodyToCargon {
    //JA IMPORTADO PARA O SENDER
    private String numero;
    private String start_date;
    private String end_date;

}
