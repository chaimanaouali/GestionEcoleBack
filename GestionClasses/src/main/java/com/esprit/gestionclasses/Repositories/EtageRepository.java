package com.esprit.gestionclasses.Repositories;

import com.esprit.gestionclasses.Entities.Etage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtageRepository  extends JpaRepository<Etage, Integer> {
}
