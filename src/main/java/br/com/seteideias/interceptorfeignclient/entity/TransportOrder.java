package br.com.seteideias.interceptorfeignclient.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode
public class TransportOrder {

    private String id;
    private String companyId;
    private String applicationId;
    private String sellerId;

    private PartnerPlatform partnerPlatform;
    private Customer customer;
    private List<OrderVolume> orderVolume;
    private String orderType;
    private String orderSubType;
    private String orderNumber;
    private String salesOrderNumber;
    private String originZipCode;
    private String estimatedDeliveryDate;
    private BigDecimal providerShippingCosts;
    private BigDecimal customerShippingCosts;
    private String salesChannel;
    private Boolean scheduled;
    private int numberAttempts;
//    private List<ErrorMessage> errorMessage;
//    private NotifiedDetail notifiedDetail;

    private String title;
    List<String> requiredSkills = new ArrayList<>();
    private Integer rank;
//    List<WayPoint> wayPoints = new ArrayList<>();
//
//    private TipoOperacaoEnum tipoOperacao;
    private String brokerFulfillmentMethod;
    private String deliveryMethodId;
    private Object responseObject;
    private String originWarehouseCode;

}
