package tn.esprit.springprojoctismail.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.springprojoctismail.entity.Bloc;

import java.util.List;


public interface BlocRepository extends JpaRepository<Bloc, Long>
{
}
