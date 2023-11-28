package tn.esprit.springprojoctismail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springprojoctismail.entity.Foyer;

public interface FoyerRepository  extends JpaRepository<Foyer, Long>
{

 //  Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer,int idUniversite);
}
