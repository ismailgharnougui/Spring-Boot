package tn.esprit.springprojoctismail.service;


import tn.esprit.springprojoctismail.entity.Foyer;

import java.util.List;
import java.util.Set;

public interface IFoyerService {
    public List<Foyer> retrieveAllFoyers();
    public Foyer retrieveFoyer (Long idFoyer);

    public Foyer addFoyer (Foyer f);
    public Foyer updateFoyer (Foyer f);

    public void deleteFoyer(Long idFoyer);
    public Foyer ajouterFoyerEtAffecterAUniversite  (Foyer foyer, long
            idUniversite);

}
