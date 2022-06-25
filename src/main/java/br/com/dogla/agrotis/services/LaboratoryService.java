package br.com.dogla.agrotis.services;

import br.com.dogla.agrotis.models.Laboratory;
import br.com.dogla.agrotis.repository.ILaboratory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaboratoryService {

    @Autowired
    private ILaboratory iLaboratory;

    public Laboratory createLaboratory(Laboratory laboratory) {
        return iLaboratory.save(laboratory);
    }

    public List<Laboratory> listAllLaboratories() {
        return iLaboratory.findAll();
    }

    public Optional<Laboratory> getByIdLaboratory(Long id) {
        return iLaboratory.findById(id);
    }
}
