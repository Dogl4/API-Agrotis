package br.com.dogla.agrotis.controllers;

import br.com.dogla.agrotis.models.Laboratory;
import br.com.dogla.agrotis.models.Solicitation;
import br.com.dogla.agrotis.services.SolicitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/solicitation")
public class SolicitationController {

    @Autowired
    private SolicitationService solicitationService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Solicitation> listAll() {
        return solicitationService.listAllSolicitations();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{solicitationId}", method = RequestMethod.GET)
    public Solicitation getById(@PathVariable("solicitationId") Long solicitationId) {
        return solicitationService.getByIdSolicitation(solicitationId);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Solicitation create(@RequestBody Solicitation solicitation) {
        return solicitationService.createSolicitation(solicitation);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/{solicitationId}", method = RequestMethod.PUT)
    public Solicitation update(@PathVariable("solicitationId") Long solicitationId,
            @RequestBody Solicitation solicitation) {
        return solicitationService.updateSolicitation(solicitationId, solicitation);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(value = "/{solicitationId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("solicitationId") Long solicitationId) {
        solicitationService.deleteByIdSolicitation(solicitationId);
    }
}
