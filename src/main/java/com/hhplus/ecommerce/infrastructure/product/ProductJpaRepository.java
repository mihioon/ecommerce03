package com.hhplus.ecommerce.infrastructure.product;

import com.hhplus.ecommerce.domain.product.object.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<Product, Long> {
    public Product findProductByProductId(Long param);
}
