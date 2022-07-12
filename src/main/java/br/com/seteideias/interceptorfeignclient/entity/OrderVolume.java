package br.com.seteideias.interceptorfeignclient.entity;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class OrderVolume {

	private BigDecimal costOfGoods;
	private String name;
	private String orderVolumeNumber;
	private String volumeTypeCode;
	private Double width;
	private Double height;
	private Double length;
	private Double weight;
	private String productsNature;
	private Integer productsQuantity;
	private Boolean isIcmsExempt;

	private OrderVolumeInvoice orderVolumeInvoice;
}
