package com.unidad1.pro4u1.controller;

import com.unidad1.pro4u1.domain.Albums;
import java.util.List;
import com.unidad1.pro4u1.service.AlbumsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CartasController {
    
    private final AlbumsService albumService;

    public CartasController(AlbumsService albumService) {
        this.albumService = albumService;
    }
            
    @RequestMapping("/")
    
    public String listarController(Model modelo){
    
        List<Albums> albums = albumService.buscarAlbums();
        
        modelo.addAttribute("yes", albums);
        
        return "home";
    
    }
}
