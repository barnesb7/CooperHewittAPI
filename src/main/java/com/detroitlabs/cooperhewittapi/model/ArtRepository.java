package com.detroitlabs.cooperhewittapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtRepository {
    private List<ArtPiece> artObjects = new ArrayList();



    @JsonProperty("artObjects")
    public void setAllArtPieces(List<ArtPiece> artObjects){
        this.artObjects = artObjects;
    }

    @JsonProperty("artObjects")
    public List<ArtPiece> getAllArtObjects(){
        return this.artObjects;
    }
}
