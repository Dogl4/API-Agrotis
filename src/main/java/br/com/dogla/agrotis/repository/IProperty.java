package br.com.dogla.agrotis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dogla.agrotis.models.Property;

@Repository
public interface IProperty extends JpaRepository<Property, Long> {
}
