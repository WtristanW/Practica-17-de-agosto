package com.unidad1.pro4u1.service;


import com.unidad1.pro4u1.domain.Albums;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service

public class AlbumsService {

    //creamos un objeto de tipo lista de la clase albums
    public List<Albums> buscarAlbums(){
    
        //crear lista con arraylist
        List<Albums> miMusica = new ArrayList<>();

        //agragar un elemento a la lista
        miMusica.add(
            new Albums(
                "Tristella", 
                "Tristella es una balada conmovedora que profundiza en los temas de la pérdida, la memoria y la naturaleza duradera del amor.",
                "https://imgs.search.brave.com/02dnQ3w7fdJLo3oi2PSm4qXGYZqOwPZF2WhDrV16aR4/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9zb3Vy/Y2UuYm9vbXBsYXlt/dXNpYy5jb20vZ3Jv/dXAxMC9NMDAvMDUv/MTUvZDcxMzJjN2Q1/YTMzNDZhYWExOWY5/OGU1ZDUzMjYwZjFI/MzAwMFczMDAwXzMy/MF8zMjAuanBn"
            )
        );
        
        miMusica.add(
            new Albums(
                "Pecador", 
                "Pecador explora la tensión entre los deseos personales y la búsqueda de la fama.",
                "https://imgs.search.brave.com/kcvHHKt-r91EZ2i9RHsZU2sfa0S3MWwSCd2qb-0SdQM/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9pLmF1/ZGlvbWFjay5jb20v/ZGVsdWtlbGVsZS8w/ZGNjODM0ZmIzLndl/YnA_d2lkdGg9MzYw"
            )
        );
        
        miMusica.add(
            new Albums(
                "Medusa", 
                "Medusa crea una vívida narrativa metafórica que se inspira en la mitología griega para expresar el poder abrumador del amor y la atracción.",
                "https://imgs.search.brave.com/6gTdV7oIfRM__8MC4jaKpjQ9nu6tBGl7kGI6FUsZnlY/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9pLmF1/ZGlvbWFjay5jb20v/am9obi1taWNoYWVs/LWhvd2VsbC0xLzY2/ZjYwMGU2NjMud2Vi/cD93aWR0aD00MTY"
            )
        );
        
        miMusica.add(
            new Albums(
                "The King", 
                "The King cuenta una historia de poder, codicia y la naturaleza cíclica de la tiranía. ",
                "https://imgs.search.brave.com/FiVa_AvlnpvBOA5F3B1XXRT2Yau3tkjQ5EvSAPHOYDM/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9pMS5z/bmRjZG4uY29tL2Fy/dHdvcmtzLWZ6Ymcw/c29TYlFQcElaSG0t/ZFFSQ2RRLXQxMDgw/eDEwODAuanBn"
            )
        );
        
        miMusica.add(
            new Albums(
                "Amigos", 
                "Amigos profundiza en la agitación emocional del amor no correspondido, capturando la esencia del anhelo y el dolor.",
                "https://imgs.search.brave.com/kW-0tK3BhQ6HPPB6ZSwgtGy7xPEPcHB1xv7gP_JbY20/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9mYXN0/bHktczMuYWxsbXVz/aWMuY29tL3JlbGVh/c2UvbXIwMDA1NTkw/ODQwL2Zyb250LzQw/MC9aYmJoeFhfMnZF/TUk5WVBFUG5uYndO/X002OV9VSTlyckpT/VnZXTDIteUFnPS5q/cGc"
            )
        );
        
        miMusica.add(
            new Albums(
                "Wellweman", 
                "Wellweman cuenta la historia de la tripulación de un barco ballenero y su arduo viaje en el mar, luchando contra una ballena que han perseguido.",
                "https://imgs.search.brave.com/1ugsrxY9W6iNiReANBsdMW8jyE_w2sIBwZd4tpT1OL4/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly91cGxv/YWQud2lraW1lZGlh/Lm9yZy93aWtpcGVk/aWEvZW4vdGh1bWIv/Zi9mOS9OYXRoYW5f/RXZhbnNfLV9XZWxs/ZXJtYW4ucG5nLzI1/MHB4LU5hdGhhbl9F/dmFuc18tX1dlbGxl/cm1hbi5wbmc_dXRt/X3NvdXJjZT1lbi53/aWtpcGVkaWEub3Jn/JnV0bV9jYW1wYWln/bj1wYXJzZXImdXRt/X2NvbnRlbnQ9dGh1/bWJuYWls"
            )
        );
        
        miMusica.add(
            new Albums(
                "Calm Down",
                "Calm Down transmite una historia de enamoramiento y anhelo de una conexión romántica, con el telón de fondo de una escena de fiesta.",
                "https://imgs.search.brave.com/KSWUmzmTTVcOuwVyLoJYCesMiELL7V_mum6wcUytNFY/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9pLmF1/ZGlvbWFjay5jb20v/aGVpc3JlbWEvMzNm/ODg2MDQ2Ni53ZWJw/P3dpZHRoPTQxNg"
            )
        );
        
        miMusica.add(
            new Albums(
                "Aloha", 
                "Aloha es una canción vibrante y sensual que celebra la alegría de estar enamorado y el encanto del baile.",
                "https://imgs.search.brave.com/qFcZB5MLAivwN8d8WzjZ68UcPKmhZIhOdO27xHmKAhw/rs:fit:500:0:1:0/g:ce/aHR0cHM6Ly9pMS5z/bmRjZG4uY29tL2Fy/dHdvcmtzLTdIRnpv/a3EwR3RObElkQnYt/bVBCcHJRLXQxMDgw/eDEwODAuanBn"
            )
        );
        
        
        
        return miMusica;
    }
    
}
