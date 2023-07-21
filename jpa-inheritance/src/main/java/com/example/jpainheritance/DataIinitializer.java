package com.example.jpainheritance;

import com.example.jpainheritance.domain.joinedstrategy.JActiveEmployee;
import com.example.jpainheritance.domain.joinedstrategy.JRetiredEmployee;
import com.example.jpainheritance.domain.msuper.OrderHeader;
import com.example.jpainheritance.domain.singletable.ActiveEmployee;
import com.example.jpainheritance.domain.singletable.JActiveEmployeeRepo;
import com.example.jpainheritance.domain.singletable.JRetiredEmployeeRepo;
import com.example.jpainheritance.domain.singletable.RetiredEmployee;
import com.example.jpainheritance.repo.ActiveEmployeeRepo;
import com.example.jpainheritance.repo.OrderHeaderRepo;
import com.example.jpainheritance.repo.RetiredEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataIinitializer  implements CommandLineRunner {

    //private OrderHeaderRepo repo;

    @Autowired
    private ActiveEmployeeRepo activeEmployeeRepo;

    @Autowired
    private RetiredEmployeeRepo retiredEmployeeRepo;


    @Autowired
    private JActiveEmployeeRepo jActiveEmployeeRepo;

    @Autowired
    private JRetiredEmployeeRepo jRetiredEmployeeRepo;
//    public DataIinitializer(OrderHeaderRepo repo){
//        this.repo = repo;
//    }



    @Override
    public void run(String... args) throws Exception {

        //Mapped super class
        //OrderHeader header = new OrderHeader();
        //header.setCustomerName("Kranthi");
       // repo.save(header);

        //Single Table inheritance
//        ActiveEmployee ae1=new ActiveEmployee(101,"Karun",10000,5);
//        ActiveEmployee ae2=new ActiveEmployee(102,"Rishab",12000,7);
//
//        RetiredEmployee re1=new RetiredEmployee(103,"Ramesh",5000);
//        RetiredEmployee re2=new RetiredEmployee(104,"Raj",4000);
//
//        activeEmployeeRepo.save(ae1);
//        activeEmployeeRepo.save(ae2);
//
//        retiredEmployeeRepo.save(re1);
//        retiredEmployeeRepo.save(re2);

        JActiveEmployee ae1=new JActiveEmployee(101,"Karun",10000,5);
        JActiveEmployee ae2=new JActiveEmployee(102,"Rishab",12000,7);

        JRetiredEmployee re1=new JRetiredEmployee(103,"Ramesh",5000);
        JRetiredEmployee re2=new JRetiredEmployee(104,"Raj",4000);

        jActiveEmployeeRepo.save(ae1);
        jActiveEmployeeRepo.save(ae2);

        jRetiredEmployeeRepo.save(re1);
        jRetiredEmployeeRepo.save(re2);
    }
}
