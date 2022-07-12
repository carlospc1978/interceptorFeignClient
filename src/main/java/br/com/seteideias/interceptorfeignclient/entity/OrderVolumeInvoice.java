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
public class OrderVolumeInvoice {

	private String invoiceSeries;
	private String invoiceNumber;
	private String invoiceKey;
	private String invoiceDate;
	private BigDecimal invoiceTotalValue;
	private BigDecimal invoiceProductsValue;
	
}
