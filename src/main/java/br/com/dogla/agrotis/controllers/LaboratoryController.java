package br.com.dogla.agrotis.controllers;

import br.com.dogla.agrotis.models.Laboratory;
import br.com.dogla.agrotis.services.LaboratoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/laboratory")
public class LaboratoryController {

    @Autowired
    private LaboratoryService laboratoryService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "")
    public Laboratory create(@RequestBody Laboratory laboratory) {
        return laboratoryService.createLaboratory(laboratory);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Laboratory> listAll() {
        return laboratoryService.listAllLaboratories();
    }

    @RequestMapping(value = "/{laboratoryId}", method = RequestMethod.GET)
    public Optional<Laboratory> getById(@PathVariable("laboratoryId") Long laboratoryId) {
        return laboratoryService.getByIdLaboratory(laboratoryId);
    }
}
