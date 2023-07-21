package com.example.jpainheritance.domain.singletable;

import com.example.jpainheritance.domain.joinedstrategy.JRetiredEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JRetiredEmployeeRepo extends JpaRepository<JRetiredEmployee,Integer> {
}
