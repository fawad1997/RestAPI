package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer
{
    private int custNo;
    private String custName;
    private String custCountry;

    public Customer() {
    }

    public Customer(int custNo, String custName, String custCountry) {
        this.custNo = custNo;
        this.custName = custName;
        this.custCountry = custCountry;
    }

    public int getCustNo() {
        return custNo;
    }
    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getCustCountry() {
        return custCountry;
    }
    public void setCustCountry(String custCountry) {
        this.custCountry = custCountry;
    }
}