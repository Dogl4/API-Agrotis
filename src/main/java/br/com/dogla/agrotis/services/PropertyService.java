package br.com.dogla.agrotis.services;

import br.com.dogla.agrotis.models.Property;
import br.com.dogla.agrotis.models.Solicitation;
import br.com.dogla.agrotis.repository.IProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.RuntimeErrorException;
import javax.persistence.EntityExistsException;
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

    public Property updateProperty(Long id, Property property) {
        Property propertyDao = new Property();
        if (iProperty.existsById(id)) {
            propertyDao.setNome(property.getNome());
            propertyDao.setId(property.getId());
            return iProperty.save(propertyDao);
        } else {
            throw new java.lang.Error("Property not found.");
        }
    }

    public void deleteByIdProperty(Long id) {
        if (iProperty.existsById(id)) {
            iProperty.deleteById(id);
        } else {
            throw new java.lang.Error("Property not found.");
        }
    }
}
