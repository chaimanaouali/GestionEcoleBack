package com.example.gestionenseignant.repositories;

import com.example.gestionenseignant.entities.Enseignant;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;

@Repository
public interface IEnseignantRepository extends JpaRepository<Enseignant, Integer> {
    @Query("SELECT e FROM Enseignant e WHERE e.nom LIKE %:nom%")
    public Page<Enseignant> findEnseignantsByName(@Param("nom") String nom, Pageable pageable);
}
