package br.com.seteideias.interceptorfeignclient.entity.uello;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    public String key;
    public String number;
    public String data;
    public String serie;
    public String total;
}
