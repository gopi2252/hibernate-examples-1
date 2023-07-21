package com.example.jpainheritance.domain.singletable;

import com.example.jpainheritance.domain.joinedstrategy.JActiveEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JActiveEmployeeRepo extends JpaRepository<JActiveEmployee,Integer> {
}
