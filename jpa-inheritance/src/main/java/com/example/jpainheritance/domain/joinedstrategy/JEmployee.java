package com.example.jpainheritance.domain.joinedstrategy;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="employee_details_joined")
@Inheritance(strategy= InheritanceType.JOINED)
public class JEmployee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int e_id;
    private String e_name;



    public JEmployee(int e_id, String e_name) {
        super();
        this.e_id = e_id;
        this.e_name = e_name;
    }



    public JEmployee() {
        super();

    }



    public int getE_id() {
        return e_id;
    }



    public void setE_id(int e_id) {
        this.e_id = e_id;
    }



    public String getE_name() {
        return e_name;
    }



    public void setE_name(String e_name) {
        this.e_name = e_name;
    }


}
