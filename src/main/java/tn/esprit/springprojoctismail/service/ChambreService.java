package tn.esprit.springprojoctismail.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.springprojoctismail.entity.Chambre;
import tn.esprit.springprojoctismail.repository.ChambreRepository;

import java.util.List;


@Service
@AllArgsConstructor

public class ChambreService implements IChambreService{

    @Autowired
    ChambreRepository chambreRepository;



    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }


    @Override
    public void deleteChambre(Long idChambre) {
        chambreRepository.deleteById(idChambre);

    }
/*
    @Scheduled(cron = "0 0 0 1 1 ?")
    public List<Chambre> afficherChambresNonReservees() {
        int anneeEnCours = java.time.Year.now().getValue();
        List<Chambre> chambresNonReservees = chambreRepository.findAllByReservationIsNullAndAnneeReservation(anneeEnCours);

        for (Chambre chambre : chambresNonReservees) {
            System.out.println("Chambre non réservée : " + chambre.getNumeroChambre());
        }
        return chambresNonReservees;
    }

*/



}
