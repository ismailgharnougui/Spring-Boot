package tn.esprit.springprojoctismail.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springprojoctismail.entity.Etudiant;

public interface EtudiantRepository  extends JpaRepository<Etudiant, Long>
{
}

