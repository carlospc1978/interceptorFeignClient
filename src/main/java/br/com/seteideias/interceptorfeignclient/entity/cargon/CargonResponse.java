package br.com.seteideias.interceptorfeignclient.entity.cargon;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CargonResponse {
//JA IMPORTADO PARA O SENDER
    private String cte;
    @JsonProperty("chave_cte")
    private String chaveCte;
    @JsonProperty("order_number")
    private String orderNumber;
    private List<String> nfs = new ArrayList<>();

}
