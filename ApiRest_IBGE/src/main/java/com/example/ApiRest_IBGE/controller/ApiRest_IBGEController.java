package com.example.ApiRest_IBGE.controller;

import com.example.ApiRest_IBGE.service.ApiRest_IBGEService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRest_IBGEController {
    ApiRest_IBGEService service = new ApiRest_IBGEService();

    @GetMapping("/noticiasereleases")
    public String consultarNoticiaseReleases(){ return service.consultarNoticiaseReleases();}

    @GetMapping("/noticias")
    public String consultarNoticias(){ return service.consultarNoticias();}

    @GetMapping("/releases")
    public String consultarReleases(){ return service.consultarRealeases();}

}
