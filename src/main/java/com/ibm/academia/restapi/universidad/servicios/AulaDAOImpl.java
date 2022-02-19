package com.ibm.academia.restapi.universidad.servicios;

import com.ibm.academia.restapi.universidad.enumeradores.TipoPizarron;
import com.ibm.academia.restapi.universidad.modelo.entidades.Aula;


import com.ibm.academia.restapi.universidad.repositorios.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AulaDAOImpl extends GenericoDAOImpl<Aula, AulaRepository> implements AulaDAO {

    @Autowired
    AulaDAOImpl(AulaRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Aula> findAulasByTipoPizarron(TipoPizarron tipoPizarron) {
        return repository.findAulasByTipoPizarron(tipoPizarron);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Aula> findAulasByPabellonNombre(String pabellonNombre) {
        return repository.findAulasByPabellonNombre(pabellonNombre);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Aula> findAulasByNumAula(Integer numAula) {
        return repository.findAulasByNumAula(numAula);
    }
}
