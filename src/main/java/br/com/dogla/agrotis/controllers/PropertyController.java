package br.com.dogla.agrotis.controllers;

import br.com.dogla.agrotis.models.Property;
import br.com.dogla.agrotis.services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/property")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Property> listAll() {
        return propertyService.listAllProperties();
    }

    @RequestMapping(value = "/{propertyId}", method = RequestMethod.GET)
    public Optional<Property> getById(@PathVariable("propertyId") Long propertyId) {
        return propertyService.getByIdProperty(propertyId);
    }
}
