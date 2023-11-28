package tn.esprit.springprojoctismail.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springprojoctismail.entity.Etudiant;
import tn.esprit.springprojoctismail.repository.EtudiantRepository;

import java.util.List;


@Service
@AllArgsConstructor

public class EtudiantService implements IEtudiantService{

    @Autowired
    EtudiantRepository etudiantRepository;



    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant)
    {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e)
    {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e)
    {
        return etudiantRepository.save(e);
    }


    @Override
    public void deleteEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);

    }







}
