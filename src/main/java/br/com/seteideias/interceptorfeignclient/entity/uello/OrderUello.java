package br.com.seteideias.interceptorfeignclient.entity.uello;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderUello {
    public int operation;
    public Company company;
    public String number;
    public CustomerUello customer;
    public Invoice invoice;
    public List<Volume> volumes;
}
