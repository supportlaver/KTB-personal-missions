package kakao.tech.database_optimization.repository;

import kakao.tech.database_optimization.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
