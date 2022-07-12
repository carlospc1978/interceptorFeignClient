package br.com.seteideias.interceptorfeignclient.strategy;

import br.com.seteideias.interceptorfeignclient.entity.TransportOrder;
import org.springframework.stereotype.Service;

@Service
public abstract class SendPartner {

    public abstract void execute(TransportOrder transportOrder);

    public abstract void update(TransportOrder transportOrder);

}
