package br.com.seteideias.interceptorfeignclient.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PartnerPlatform {

	private String name;
	private String quoteId;
	private Long deliveryMethodId; 
	private Integer partnerPlatformId;

}
