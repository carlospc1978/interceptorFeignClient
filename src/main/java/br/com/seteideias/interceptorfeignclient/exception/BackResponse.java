package br.com.seteideias.interceptorfeignclient.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BackResponse {

    private String message;
    private String message2;

}
