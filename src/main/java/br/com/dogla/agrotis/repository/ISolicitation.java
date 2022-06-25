package br.com.dogla.agrotis.repository;

import br.com.dogla.agrotis.models.Solicitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISolicitation extends JpaRepository<Solicitation, Long> {
}
