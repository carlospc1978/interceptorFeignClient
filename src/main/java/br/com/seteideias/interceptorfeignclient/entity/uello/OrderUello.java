package br.com.seteideias.interceptorfeignclient.entity.uello;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class OrderUello {
    public int operation;
    public Company company;
    public String number;
    public CustomerUello customer;
    public Invoice invoice;
    public List<Volume> volumes;
}
