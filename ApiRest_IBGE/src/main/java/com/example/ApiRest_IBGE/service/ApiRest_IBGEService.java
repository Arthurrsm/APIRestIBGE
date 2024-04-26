package com.example.ApiRest_IBGE.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ApiRest_IBGEService {
    public String consultarURL(String apiUrl){
        String dados = "";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()){
            dados = responseEntity.getBody();
            System.out.println(dados);
        } else {
            dados = "Falha ao obter dados. Código de status: " + responseEntity.getStatusCode();
        }
        return dados;
    }

    public String consultarNoticiaseReleases(){
        return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias");
    }

    public String consultarRealeases(){
        return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=release");
    }

    public String consultarNoticias(){
        return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=noticia");
    }


}