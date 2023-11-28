package tn.esprit.springprojoctismail.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.springprojoctismail.entity.Bloc;
import tn.esprit.springprojoctismail.entity.Foyer;
import tn.esprit.springprojoctismail.entity.Universite;
import tn.esprit.springprojoctismail.repository.BlocRepository;
import tn.esprit.springprojoctismail.repository.FoyerRepository;
import tn.esprit.springprojoctismail.repository.UniversiteRepository;


import java.util.List;


@Service
@AllArgsConstructor

public class FoyerService implements IFoyerService{

    @Autowired
    FoyerRepository foyerRepository;
UniversiteRepository universiteRepository;
BlocRepository blocRepository;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer retrieveFoyer(Long idFoyer)
    {
        return foyerRepository.findById(idFoyer).get();
    }

    @Override
    public Foyer addFoyer(Foyer f)
    {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f)
    {
        return foyerRepository.save(f);
    }


    @Override
    public void deleteFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);

    }





    @Transactional
    public Foyer ajouterFoyerEtAffecterAUniversite  (Foyer foyer, long
            idUniversite) {
        Universite universite =
                universiteRepository.findById(idUniversite).orElse(null);
        foyerRepository.save(foyer);
        for(Bloc bloc : foyer.getBlocs())
        {
            bloc.setFoyer(foyer);
            blocRepository.save(bloc);
        }
        assert universite != null;
        universite.setFoyer(foyer);
        universiteRepository.save(universite);
        return foyer;
    }

}
