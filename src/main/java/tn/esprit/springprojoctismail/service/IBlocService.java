package tn.esprit.springprojoctismail.service;



import tn.esprit.springprojoctismail.entity.Bloc;

import java.util.List;


public interface IBlocService {
    public List<Bloc> retrieveAllBlocs();
    public Bloc retrieveBloc (Long idBloc);

    public Bloc addBloc (Bloc b);
    public Bloc updateBloc (Bloc b);

    public void deleteBloc(Long idBloc);


   // public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) ;


}
