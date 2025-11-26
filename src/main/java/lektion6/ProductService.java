package lektion6;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Mono<Product> createNewProduct(ProductValidatorDTO dto) {
        Product product = new Product(
                null,
                dto.name(),
                dto.description(),
                dto.price(),
                dto.discontinued()
        );
        return productRepository.save(product);
    }

    public Mono<Void> deleteProductById(Long id) {
        return productRepository.deleteById(id);
    }

    public Flux<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
