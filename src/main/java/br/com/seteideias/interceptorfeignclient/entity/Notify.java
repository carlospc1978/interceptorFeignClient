package br.com.seteideias.interceptorfeignclient.entity;

import lombok.*;

@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Notify {

	private Boolean whatsapp;
	private Boolean email;
	private Boolean sms;
}
