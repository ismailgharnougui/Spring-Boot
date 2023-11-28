package tn.esprit.springprojoctismail.service;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.springprojoctismail.entity.Bloc;
import tn.esprit.springprojoctismail.entity.Foyer;
import tn.esprit.springprojoctismail.entity.Universite;
import tn.esprit.springprojoctismail.repository.FoyerRepository;
import tn.esprit.springprojoctismail.repository.UniversiteRepository;


import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor

public class UniversiteService implements IUniversiteService {

    @Autowired //dit à spring d'injecter un objet on le met toujours au dessus de l'objet
    UniversiteRepository universiteRepository;
    @Autowired
    FoyerRepository foyerRepository;


    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }


    @Override
    public void deleteUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);

    }

    @Override
    public void assignUniversiteToFoyer(Long idUniversite, Long idFoyer) {

    }

    @Override
    public Set<Foyer> retrieveFoyerByUniversite(Long idUniversite) {
        return null;
    }


    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String
            nomUniversite) {
        Foyer foyer = foyerRepository.findById(idFoyer).orElse(null);
        Universite universite =
                universiteRepository.findByNomUniversiteLike(nomUniversite);
        universite.setFoyer(foyer);
        return universiteRepository.save(universite);
    }

    @Override
    public Universite desaffecterFoyerAUniversite( long idUniversite) {
        Universite universite =
                universiteRepository.findById(idUniversite).orElse(null);
        universite.setFoyer(null);
        return universiteRepository.save(universite);
    }


}
