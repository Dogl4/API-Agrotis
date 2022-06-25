package br.com.dogla.agrotis.services;

import br.com.dogla.agrotis.models.Solicitation;
import br.com.dogla.agrotis.repository.ISolicitation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitationService {

    @Autowired
    private ISolicitation iSolicitation;

    public Solicitation createSolicitation(Solicitation solicitation) {
        return iSolicitation.save(solicitation);
    }

    public List<Solicitation> listAllSolicitations() {
        return iSolicitation.findAll();
    }

    public Solicitation getByIdSolicitation(Long id) {
        return iSolicitation.findById(id).get();
    }

    public Solicitation updateSolicitation(Long id, Solicitation solicitation) {
        Solicitation solicitation1 = this.getByIdSolicitation(id);
        return iSolicitation.save(solicitation1);
    }

    public void deleteByIdSolicitation(Long id) {
        iSolicitation.deleteById(id);
    }
}
