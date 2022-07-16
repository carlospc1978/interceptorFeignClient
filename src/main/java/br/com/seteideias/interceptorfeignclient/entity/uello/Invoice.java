package br.com.seteideias.interceptorfeignclient.entity.uello;

import lombok.Data;

@Data
public class Invoice {
    private String key;
    private String number;
    private String data;
    private String serie;
    private String total;
}
