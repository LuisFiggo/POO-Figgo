package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.exeption.ModelNotFoundException;
import pe.edu.upeu.sysventas.repository.IcrudGenericoRepository;
import pe.edu.upeu.sysventas.service.ICrudGenericoService;

import java.util.List;

public abstract class CrudGenericoServiceImp<T ,ID> implements ICrudGenericoService<T, ID> {
    protected abstract IcrudGenericoRepository<T, ID> getRepo();

    @Override
    public T sava(T entity) {
        return getRepo().save(entity);
    }

    @Override
    public T update(ID id, T entity) {
        if (getRepo().existsById(id)){
            throw new ModelNotFoundException("ID no existe:"+id);
        }
        return null;
    }

    @Override
    public List<T> findAll() {
        return getRepo().findAll();
    }

    @Override
    public T findById(ID id) {
        return getRepo().findById(id).orElseThrow(()->new ModelNotFoundException("ID no existe:"+id));
    }

    @Override
    public void delete(ID id) {
        if (getRepo().existsById(id)) {
            throw new ModelNotFoundException("ID no existe:" + id);
        }
        getRepo().deleteById(id);
    }
}
