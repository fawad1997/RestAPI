package restful;

import model.Customer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;


@Path("customer")
public class DemoAPI {

    static List<Customer> customerList = new ArrayList<Customer>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getCustomersJSON() {
        customerList.add(new Customer(1, "Azhar", "China"));
        customerList.add(new Customer(2, "Customer2", "Rusia"));
        return customerList;
    }

    @GET
    @Path("/getxml")
    @Produces(MediaType.APPLICATION_XML)
    public List<Customer> getCustomersXML() {

        customerList.add(new Customer(1, "Azhar", "China"));
        customerList.add(new Customer(2, "Customer2", "Rusia"));
        return customerList;
    }

    @GET
    @Path("/{no}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer produceCustomerDetailsinJSON(@PathParam("no") int no) {

        Customer cust = new Customer();
        cust.setCustNo(no);
        cust.setCustName("Fawad");
        cust.setCustCountry("Pakistan");
        customerList.add(cust);
        return cust;
    }
}