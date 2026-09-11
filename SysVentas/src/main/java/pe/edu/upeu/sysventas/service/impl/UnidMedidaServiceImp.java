package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.model.UnidMedida;
import pe.edu.upeu.sysventas.repository.IcrudGenericoRepository;
import pe.edu.upeu.sysventas.repository.UnidMedidaRepository;
import pe.edu.upeu.sysventas.service.IUnidMedidaService;

public class UnidMedidaServiceImp extends CrudGenericoServiceImp<UnidMedida, Long> implements IUnidMedidaService {
    private final UnidMedidaRepository unidMedidaRepository;

    public UnidMedidaServiceImp(UnidMedidaRepository unidMedidaRepository) {
        this.unidMedidaRepository = unidMedidaRepository;
    }

    @Override
    protected IcrudGenericoRepository<UnidMedida, Long> getRepo() {
        return unidMedidaRepository;
    }
}
