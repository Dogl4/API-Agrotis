package br.com.dogla.agrotis.controllers;

import br.com.dogla.agrotis.models.Laboratory;
import br.com.dogla.agrotis.services.LaboratoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @RequestMapping(value = "/{laboratoryId}", method = RequestMethod.PUT)
    public ResponseEntity<?> update(@PathVariable("laboratoryId") Long laboratoryId, @RequestBody Laboratory laboratory) {
        try {
            Laboratory laboratory1 = laboratoryService.updateLaboratory(laboratoryId, laboratory);
            return ResponseEntity.status(HttpStatus.CREATED).body(laboratory1);
        } catch (Error efe) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(efe.getMessage());
        }
    }

    @RequestMapping(value = "/{laboratoryId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@PathVariable("laboratoryId") Long laboratoryId) {
        try {
            laboratoryService.deleteByIdLaboratory(laboratoryId);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
        } catch (Error efe) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(efe.getMessage());
        }
    }
}
