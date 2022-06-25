package br.com.dogla.agrotis.services;

import br.com.dogla.agrotis.models.Property;
import br.com.dogla.agrotis.repository.IProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropertyService {

    @Autowired
    private IProperty iProperty;

    public Property createProperty(Property property) {
        return iProperty.save(property);
    }

    public List<Property> listAllProperties() {
        return iProperty.findAll();
    }

    public Optional<Property> getByIdProperty(Long id) {
        return iProperty.findById(id);
    }
}
