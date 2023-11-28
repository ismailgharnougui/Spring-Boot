package tn.esprit.springprojoctismail.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springprojoctismail.entity.Chambre;

import java.util.List;

public interface ChambreRepository  extends JpaRepository<Chambre, Long>
{
    List<Chambre> findAllByNumeroChambreIn(List<Long> numChambre);
 // Chambre findAllByNumeroChambreIn(Long numChambre);
// List<Chambre> findAllByReservationIsNullAndAnneeReservation(int annee);
}
