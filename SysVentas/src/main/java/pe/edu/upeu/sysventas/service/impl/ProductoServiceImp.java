package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.model.Producto;
import pe.edu.upeu.sysventas.repository.IcrudGenericoRepository;
import pe.edu.upeu.sysventas.repository.ProductoRepository;
import pe.edu.upeu.sysventas.service.IProductoService;

public class ProductoServiceImp extends CrudGenericoServiceImp<Producto, Long> implements IProductoService {
    private final ProductoRepository productoRepository;

    public ProductoServiceImp(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    protected IcrudGenericoRepository<Producto, Long> getRepo() {
        return productoRepository;
    }
}
