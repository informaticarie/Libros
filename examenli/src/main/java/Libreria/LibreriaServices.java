package Libreria;

import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import java.util.List;
@Service
@RequiredArgsConstructor



public class LibreriaServices {

    private final LibreriaRepository libreriaRepo;

    public void createLibro(Libreria libreria) {

        libreriaRepo.save(libreria);
    }

    public List<Libreria> readPerson() {
        return libreriaRepo.findAll();
    }

    public Optional<Libreria> readPerso(Integer id){
        return libreriaRepo.findById(id);
    }

    public void delete(Integer id){

         libreriaRepo.deleteById(id);
    }

}
