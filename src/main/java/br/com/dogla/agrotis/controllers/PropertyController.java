package br.com.dogla.agrotis.controllers;

import br.com.dogla.agrotis.models.Property;
import br.com.dogla.agrotis.services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/property")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "")
    public Property create(@RequestBody Property property) {
        return propertyService.createProperty(property);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Property> listAll() {
        return propertyService.listAllProperties();
    }

    @RequestMapping(value = "/{propertyId}", method = RequestMethod.GET)
    public Optional<Property> getById(@PathVariable("propertyId") Long propertyId) {
        return propertyService.getByIdProperty(propertyId);
    }

    @RequestMapping(value = "/{propertyId}", method = RequestMethod.PUT)
    public ResponseEntity<?> update(@PathVariable("propertyId") Long propertyId, @RequestBody Property property) {
        try {
            Property property1 = propertyService.updateProperty(propertyId, property);
            return ResponseEntity.status(HttpStatus.CREATED).body(property1);
        } catch (Error efe) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(efe.getMessage());
        }
    }

    @RequestMapping(value = "/{propertyId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@PathVariable("propertyId") Long propertyId) {
        try {
            propertyService.deleteByIdProperty(propertyId);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
        } catch (Error efe) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(efe.getMessage());
        }
    }
}
