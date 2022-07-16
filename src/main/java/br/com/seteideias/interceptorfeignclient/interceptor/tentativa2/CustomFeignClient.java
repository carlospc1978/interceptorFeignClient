package br.com.seteideias.interceptorfeignclient.interceptor.tentativa2;

import br.com.seteideias.interceptorfeignclient.exception.DeliveryException;
import feign.Client;
import feign.Request;
import feign.Response;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.util.StreamUtils;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Log4j2
public class CustomFeignClient extends Client.Default {

    public CustomFeignClient(SSLSocketFactory sslContextFactory, HostnameVerifier hostnameVerifier) {
        super(sslContextFactory, hostnameVerifier);
    }

//    @SneakyThrows
    @Override
    public Response execute(Request request, Request.Options options) throws IOException {

        Response response = super.execute(request, options);
        log.info("response.status.: {}",response.status());

        InputStream bodyStream = response.body().asInputStream();
        System.out.println("bodyStream->>>>>>>>>>>>>> " +bodyStream);

        String responseBody = StreamUtils.copyToString(bodyStream, StandardCharsets.UTF_8);

        System.out.println("responseBody->>>>>>>>>>>>>> " + responseBody);
        System.out.println("response.toBuilder->>>>>>>>>>>>>> " + response.toBuilder().body(responseBody, StandardCharsets.UTF_8).build());
        System.out.println("*****************************************");
        //TODO do whatever you want with the responseBody - parse and modify it


        if (response.status() >= 400 && response.status() < 500) {
            log.error("OPS... RESPOSTA ERRADA.: {}",responseBody);
            String mensagem = "OPS... RESPOSTA ERRADA.:  " +responseBody;
//            System.out.println("*****************************************");
//            System.out.println("*****************************************");
//            System.out.println("response.status() >= 400 && response.status() <500->>>>>>>>>>>>>> " + response.status());
//            System.out.println("*****************************************");
//            System.out.println("*****************************************");
            try {
                throw new DeliveryException();
            } catch (DeliveryException e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        return response.toBuilder().body(responseBody, StandardCharsets.UTF_8).build();
    }
}
