package tn.esprit.springprojoctismail.service;


import tn.esprit.springprojoctismail.entity.Reservation;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation (Long idReservation);

    public Reservation addReservation (Reservation r);
    public Reservation updateReservation (Reservation r);

    public void deleteReservation(Long idReservation);



}
