package br.com.dogla.agrotis.repository;

import br.com.dogla.agrotis.models.Laboratory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaboratory extends JpaRepository<Laboratory, Long> {
}
