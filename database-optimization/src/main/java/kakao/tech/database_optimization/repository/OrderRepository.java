package kakao.tech.database_optimization.repository;

import kakao.tech.database_optimization.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
