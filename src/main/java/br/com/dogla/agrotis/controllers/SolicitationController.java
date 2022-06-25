package br.com.dogla.agrotis.controllers;

import br.com.dogla.agrotis.models.Solicitation;
import br.com.dogla.agrotis.services.SolicitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
