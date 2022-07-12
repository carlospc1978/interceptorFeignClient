package br.com.seteideias.interceptorfeignclient.entity.uello;

import lombok.Data;

@Data
public class OrderUelloResponse {
    public boolean status;
    public String message;
    public DataUello data;
}
