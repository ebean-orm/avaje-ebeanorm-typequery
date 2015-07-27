package org.querytest;

import org.example.domain.Customer;
import org.example.domain.typequery.QCustomer;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class QCustomerTest {

  @Test
  public void testQuery() {

//    List<Contact> contacts
//        = new QContact()
//        .email.like("asd")
//        .notes.title.like("asd")
//        .orderBy()
//          .id.desc()
//        .findList();
//
//    Customer customer =
    List<Customer> customers = new QCustomer()
        .id.eq(1234)
        .status.equalTo(Customer.Status.BAD)
        .status.in(Customer.Status.GOOD, Customer.Status.MIDDLING)
            //.status.eq(Order.Status.APPROVED)
        .name.like("asd")
        .name.istartsWith("ASdf")
        .registered.after(new Date())
        .contacts.email.endsWith("@foo.com")
        .contacts.notes.id.greaterThan(123L)
        .orderBy().id.asc()
        .findList();

//    //Customer customer3 =
//    new QCustomer()
//        .id.gt(12)
//        .or()
//          .id.lt(1234)
//          .and()
//            .name.like("one")
//            .name.like("two")
//          .endAnd()
//        .endOr()
//        .orderBy().id.asc()
//        .findList();
//
//    //where t0.id > ?  and (t0.id < ?  or (t0.name like ?  and t0.name like ? ) )  order by t0.id; --bind(12,1234,one,two)
//
////    List<Customer> customers
////        = new QCustomer()
////          .name.like("asd")
////          .findList();
//
//    Customer.find.where()
//        .gt("id", 1234)
//        .disjunction().eq("id", 1234).like("name", "asd")
//        .endJunction().findList();

//    QCustomer c = QCustomer.I;
//    ExpressionList<Customer> expr = new QCustomer().expr();
//    expr.eq(c.contacts.email, 123);
  }
}
