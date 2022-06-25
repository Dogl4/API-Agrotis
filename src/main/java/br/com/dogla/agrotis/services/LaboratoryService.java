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

    public Laboratory updateLaboratory(Long id, Laboratory laboratory) {
        Laboratory laboratoryDao = new Laboratory();
        if (iLaboratory.existsById(id)) {
            laboratoryDao.setNome(laboratory.getNome());
            laboratoryDao.setId(laboratory.getId());
            return iLaboratory.save(laboratoryDao);
        } else {
            throw new java.lang.Error("Laboratory not found.");
        }
    }

    public void deleteByIdLaboratory(Long id) {
        if (iLaboratory.existsById(id)) {
            iLaboratory.deleteById(id);
        } else {
            throw new java.lang.Error("Laboratory not found.");
        }
    }
}
