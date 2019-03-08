package com.detroitlabs.cooperhewittapi.service;

import com.detroitlabs.cooperhewittapi.model.ArtRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ArtService {

    public ArtRepository fetchArtData(){
         RestTemplate restTemplate = new RestTemplate();
         return restTemplate.getForObject("https://www.rijksmuseum.nl/api/en/collection?key=rputun7N&format=json&toppieces=true", ArtRepository.class);
    }

}
