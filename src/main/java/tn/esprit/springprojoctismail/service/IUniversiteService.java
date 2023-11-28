package tn.esprit.springprojoctismail.service;



import tn.esprit.springprojoctismail.entity.Foyer;
import tn.esprit.springprojoctismail.entity.Universite;

import java.util.List;
import java.util.Set;

public interface IUniversiteService {
    public List<Universite> retrieveAllUniversites();
    public Universite retrieveUniversite (Long idUniversite);

    public Universite addUniversite (Universite u);
    public Universite updateUniversite (Universite u);

    public void deleteUniversite(Long idUniversite);

    public void assignUniversiteToFoyer(Long idUniversite, Long idFoyer);
    public Set<Foyer> retrieveFoyerByUniversite(Long idUniversite);

    public Universite affecterFoyerAUniversite(long idFoyer, String
            nomUniversite);

    public Universite desaffecterFoyerAUniversite( long idUniversite);

}
