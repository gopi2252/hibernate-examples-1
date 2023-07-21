package com.example.jpainheritance.repo;

import com.example.jpainheritance.domain.msuper.OrderHeader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderHeaderRepo extends JpaRepository<OrderHeader,Long> {
}
