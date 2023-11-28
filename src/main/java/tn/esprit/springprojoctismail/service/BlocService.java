package tn.esprit.springprojoctismail.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springprojoctismail.entity.Bloc;
import tn.esprit.springprojoctismail.entity.Chambre;
import tn.esprit.springprojoctismail.repository.BlocRepository;
import tn.esprit.springprojoctismail.repository.ChambreRepository;


import java.util.List;

@Service
@AllArgsConstructor

public class BlocService implements IBlocService{

    @Autowired
    BlocRepository blocRepository;
//ChambreRepository chambreRepository;


    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }


    @Override
    public void deleteBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);

    }
/*
    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) {
        Bloc bloc = blocRepository.findById(idBloc).orElse(null);
        List<Chambre> chambreList =
                chambreRepository.findAllByNumeroChambreIn(numChambre);
        for(Chambre chambre: chambreList) {
            chambre.setBloc(bloc);
            chambreRepository.save(chambre);
        }
        return bloc;
    }


*/


}
