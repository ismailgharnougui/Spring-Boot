package tn.esprit.springprojoctismail.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springprojoctismail.entity.Reservation;
import tn.esprit.springprojoctismail.repository.ReservationRepository;

import java.util.List;


@Service
@AllArgsConstructor

public class ReservationService implements IReservationService{

    @Autowired
    ReservationRepository reservationRepository;



    @Override
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    @Override
    public Reservation addReservation(Reservation r)
    {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r)
    {
        return reservationRepository.save(r);
    }


    @Override
    public void deleteReservation(Long idReservation) {
        reservationRepository.deleteById(idReservation);

    }







}
