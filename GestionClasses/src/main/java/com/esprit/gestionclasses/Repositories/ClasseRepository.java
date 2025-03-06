package com.esprit.gestionclasses.Repositories;

import com.esprit.gestionclasses.Entities.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasseRepository  extends JpaRepository<Classe, Integer> {

}
