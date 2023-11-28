package tn.esprit.springprojoctismail.service;


import tn.esprit.springprojoctismail.entity.Chambre;

import java.util.List;

public interface IChambreService {
    public List<Chambre> retrieveAllChambres();
    public Chambre retrieveChambre (Long idChambre);

    public Chambre addChambre (Chambre c);
    public Chambre updateChambre (Chambre c);

    public void deleteChambre(Long idChambre);



}
