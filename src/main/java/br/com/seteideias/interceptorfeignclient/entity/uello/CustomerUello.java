package br.com.seteideias.interceptorfeignclient.entity.uello;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerUello {
    public String name;
    public String email;
    public String phone;
    public String document;
    public String state_inscription;
    public Address address;
}
