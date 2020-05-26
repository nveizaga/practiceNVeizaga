package com.jalasoft.practicenv;

import ch.qos.logback.core.boolex.EvaluationException;
import com.jalasoft.practicenv.transport.Bicycle;
import com.jalasoft.practicenv.transport.Car;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.jalasoft.practicenv.storage.StorageProperties;
import com.jalasoft.practicenv.controller.ListLandTransport;
import com.jalasoft.practicenv.order.Order;
import com.jalasoft.practicenv.order.Detail;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class Main {
    public static void main(String[] args){

        System.out.println("Hello!");
        System.out.println("**************************Practice3*************************");
        ListLandTransport trans = new ListLandTransport();
        trans.addLand(new Bicycle("Cross",500,false,false));
        trans.addLand(new Car("Audi", 20000, true,false));
        trans.display();

        System.out.println("**************************Practice4**************************");

        Detail detail1 = new Detail("cod1", "cocina", 2, 1000, 10, 1990, "ped1");
        Detail detail2 = new Detail("cod2", "lavadora", 1, 2500, 0, 2500, "ped1");
        Detail detail3 = new Detail("cod3", "plancha", 5, 300, 50, 1450, "ped1");
        Detail detail4 = new Detail("cod4", "mesa", 2, 700, 30, 1370, "ped2");
        Detail detail5 = new Detail("cod5", "muebles", 1, 3500, 0, 3500, "ped2");
        Detail detail6 = new Detail("cod6", "comoda", 3, 800, 100, 2300,"ped2");
        Detail detail7 = new Detail("cod7", "camisa", 10, 100, 100, 900, "ped3");
        Detail detail8 = new Detail("cod8", "polera", 20, 80, 0, 1600, "ped3");
        Detail detail9 = new Detail("cod9", "zapatos", 8, 400, 200, 3000, "ped3");
        List<Detail> detailsOrder1 = new ArrayList<>();
        detailsOrder1.add(detail1);
        detailsOrder1.add(detail2);
        detailsOrder1.add(detail3);
        List<Detail> detailsOrder2 = new ArrayList<>();
        detailsOrder2.add(detail4);
        detailsOrder2.add(detail5);
        detailsOrder2.add(detail6);
        List<Detail> detailsOrder3 = new ArrayList<>();
        detailsOrder3.add(detail7);
        detailsOrder3.add(detail8);
        detailsOrder3.add(detail9);

        Order order1 = new Order("ped1", "normal","Juan Perez","2020-05-05",detailsOrder1);
        Order order2 = new Order("ped2", "programado", "Maria Guaman", "2020-05-03",detailsOrder2);
        Order order3 = new Order("ped3", "normal", "Juan Perez", "2020-05-10",detailsOrder3);
        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        System.out.println("1. Select client from order");
        orders.stream()
                .map(order -> order.getClient()).distinct()
                .forEach(value -> System.out.println(value));

        System.out.println("2. Select client from order where orderType is normal");
        orders.stream().filter(order -> order.getOrderType() == "normal")
                .map(order -> order.getClient()).distinct()
                .forEach(value -> System.out.println(value));

        System.out.println("3. Select codOrder from Order where dateOrder is " +  "2020-05-05");
        orders.stream().filter(order -> order.getDateOrder() == "2020-05-05")
                .map(order -> order.getCodOrder())
                .forEach(value -> System.out.println(value));

        System.out.println("4. Select product from Detail,Order where order.codOrder" +
                "= detail.codOrder and order.codeOrder = ped1");
        orders.stream().filter(order -> order.getCodOrder() == "ped1")
                .map(order -> order.getDetailsOrder())
                .flatMap(details -> details.stream())
                .filter(detail -> detail.getCodeOrder() == "ped1")
                .map(detail -> detail.getProduct())
                .forEach(value -> System.out.println(value));

        System.out.println("5. Select detail.product from Detail, Order where Order.codOrder"+
                "= detail.codOrder and detail.quantity > 8 ");
        orders.stream().map(order -> order.getDetailsOrder())
                .flatMap(details -> details.stream())
                .filter(detail -> detail.getQuantity()>8)
                .map(detail -> detail.getProduct())
                .forEach(value -> System.out.println(value));

        SpringApplication.run(Main.class, args);



    }
}

