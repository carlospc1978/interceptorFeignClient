package br.com.seteideias.interceptorfeignclient.entity.uello;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Volume {
    public String identifier;
    public String weight;
    public String volume;
}
