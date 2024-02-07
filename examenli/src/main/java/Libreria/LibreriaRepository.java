package Libreria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibreriaRepository extends JpaRepository <Libreria, Integer> {

}
