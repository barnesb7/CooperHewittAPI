package com.detroitlabs.cooperhewittapi.controller;

import com.detroitlabs.cooperhewittapi.model.ArtPiece;
import com.detroitlabs.cooperhewittapi.model.ArtRepository;
import com.detroitlabs.cooperhewittapi.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ArtController {

    @Autowired
    private ArtService artService;


    @RequestMapping("/")
    public String displayHome(ModelMap modelMap){
        ArtRepository artRepository = artService.fetchArtData();
        List<ArtPiece> allArt = artRepository.getAllArtObjects();
        modelMap.put("allArt", allArt);
        return "index";
    }

    @RequestMapping("/allart")
    public String displayAllArt(){
        return "allArt";
    }

    @RequestMapping("/allsongs")
    public String displayAllSongs(){
        return "allSongs";
    }
}
