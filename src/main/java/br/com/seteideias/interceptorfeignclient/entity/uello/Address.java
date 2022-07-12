package br.com.seteideias.interceptorfeignclient.entity.uello;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    public String address;
    public String number;
    public String complement;
    public String reference;
    public String postcode;
    public String neighborhood;
    public String city;
    public String uf;
    public Geolocation geolocation;
}
