package br.com.seteideias.interceptorfeignclient.interceptor.tentativa2;

import feign.Client;
import feign.Request;
import feign.Response;
import org.springframework.util.StreamUtils;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;


public class CustomFeignClient extends Client.Default {

    public CustomFeignClient(SSLSocketFactory sslContextFactory, HostnameVerifier hostnameVerifier) {
        super(sslContextFactory, hostnameVerifier);
    }

    @Override
    public Response execute(Request request, Request.Options options) throws IOException {

        Response response = super.execute(request, options);
        System.out.println("*****************************************");
        System.out.println("response.status.: " + response.status());

        InputStream bodyStream = response.body().asInputStream();
        System.out.println("bodyStream->>>>>>>>>>>>>> " +bodyStream);

        String responseBody = StreamUtils.copyToString(bodyStream, StandardCharsets.UTF_8);

        System.out.println("responseBody->>>>>>>>>>>>>> " +responseBody);
        System.out.println("response.toBuilder->>>>>>>>>>>>>> " +response.toBuilder().body(responseBody, StandardCharsets.UTF_8).build());
        System.out.println("*****************************************");
        //TODO do whatever you want with the responseBody - parse and modify it


        if(response.status() >= 400 && response.status() <500){
        System.out.println("*****************************************");
        System.out.println("*****************************************");
        System.out.println("response.status() >= 400 && response.status() <500->>>>>>>>>>>>>> " +responseBody);
        System.out.println("*****************************************");
        System.out.println("*****************************************");

        }

        return response.toBuilder().body(responseBody, StandardCharsets.UTF_8).build();
    }
}
