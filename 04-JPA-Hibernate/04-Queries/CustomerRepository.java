package com.shrutika.examples.jpa.queries;
import com.shrutika.examples.jpa.mapping.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query("select c from Customer c where c.name like concat('%', :name, '%')")
    List<Customer> search(@Param("name") String name);
}
