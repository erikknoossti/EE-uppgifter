package lektion4;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product findByName(String name) {
        return productRepository.findByName(name)
                .orElseThrow(() -> new ProductNotFoundException(name));
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
