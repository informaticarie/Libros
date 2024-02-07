package Libreria;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/libros")
@RequiredArgsConstructor

public class LibreriaController {

    private final LibreriaServices libreriaServices;

    @PostMapping("/create")
    public void createLibro(@RequestBody Libreria libreria) {
       
        libreriaServices.createLibro(libreria);
        
    }

    @DeleteMapping("/delete/{libroId}")
    public void delete(@PathVariable("libroId") Integer libroId){
        libreriaServices.delete(libroId);
    }
    

}
