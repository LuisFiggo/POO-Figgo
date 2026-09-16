package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.model.UnidMedida;
import pe.edu.upeu.sysventas.repository.IcrudGenericoRepository;
import pe.edu.upeu.sysventas.repository.UnidadMedidaRepository;
import pe.edu.upeu.sysventas.service.IUnidadMedidaService;

public class UnidadMedidaServiceImp extends CrudGenericoServiceImp<UnidMedida, Long> implements IUnidadMedidaService {
    private final UnidadMedidaRepository unidMedidaRepository;

    public UnidadMedidaServiceImp(UnidadMedidaRepository unidMedidaRepository) {
        this.unidMedidaRepository = unidMedidaRepository;
    }

    @Override
    protected IcrudGenericoRepository<UnidMedida, Long> getRepo() {
        return unidMedidaRepository;
    }
}
