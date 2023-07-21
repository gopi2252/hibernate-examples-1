package com.example.jpainheritance.domain.joinedstrategy;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "j_retirementemployee")
public class JRetiredEmployee extends JEmployee {
    private int e_pension;

    public JRetiredEmployee(int e_id, String e_name, int e_pension) {
        super(e_id, e_name);
        this.e_pension = e_pension;
    }

    public JRetiredEmployee() {
        super();

    }



    public int getE_pension() {
        return e_pension;
    }

    public void setE_pension(int e_pension) {
        this.e_pension = e_pension;
    }


}
