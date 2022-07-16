package br.com.seteideias.interceptorfeignclient.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class InterceptorFeign implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        System.out.println();
        requestTemplate.body();

        if (requestAttributes == null) {
            return;
        }
        HttpServletRequest request = requestAttributes.getRequest();
        if (request == null) {
            return;
        } else {
            System.out.println("2 -> " + request.getMethod());

        }

        HttpServletResponse response = requestAttributes.getResponse();
        if (response == null) {
            return;
        } else {

            System.out.println("response.getStatus -> " + response.getStatus());
            System.out.println("response.Content-lenght TAMANHO -> " + response.getHeader("Content-lenght"));

            try {
                System.out.println("response -> " + response.toString());
            } catch (Exception e) {
                System.out.println("response Exception -> " + e.getMessage());
            }


        }
    }

}
