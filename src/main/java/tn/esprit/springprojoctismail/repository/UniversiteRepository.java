package tn.esprit.springprojoctismail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springprojoctismail.entity.Universite;

import java.util.List;

public interface UniversiteRepository  extends JpaRepository<Universite, Long>
{
    Universite findByNomUniversiteLike(String nomUniversite);

}