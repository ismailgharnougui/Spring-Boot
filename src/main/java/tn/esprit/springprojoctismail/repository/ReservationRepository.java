package tn.esprit.springprojoctismail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springprojoctismail.entity.Reservation;

public interface ReservationRepository  extends JpaRepository<Reservation, Long>
{
}