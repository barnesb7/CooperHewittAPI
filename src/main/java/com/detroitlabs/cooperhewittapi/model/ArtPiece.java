package com.detroitlabs.cooperhewittapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtPiece {
    private String title;
    private WebImage webImage;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("webImage")
    public void setWebImage(WebImage webImage){
        this.webImage = webImage;
    }

    @JsonProperty("webImage")
    public WebImage getWebImage() {
        return webImage;
    }

}
