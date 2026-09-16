package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.model.Categoria;
import pe.edu.upeu.sysventas.repository.CategoriaRepository;
import pe.edu.upeu.sysventas.repository.IcrudGenericoRepository;
import pe.edu.upeu.sysventas.service.ICategoriaService;

public class CategoriaServiceImp extends CrudGenericoServiceImp<Categoria, Long> implements ICategoriaService {
    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImp(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    protected IcrudGenericoRepository<Categoria, Long> getRepo() {
        return categoriaRepository;
    }
}
