package kakao.tech.database_optimization.repository;

import kakao.tech.database_optimization.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProductRepository, Long> {
}
