package com.northwind.orders.service.model.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("Orders")
public class Order {

    @Id
    @Column("OrderID")
    private Integer orderId;

    @Column("CustomerID")
    private String customerId;

    @Column("EmployeeID")
    private Integer employeeId;

    @Column("OrderDate")
    private java.sql.Timestamp orderDate;

    @Column("RequiredDate")
    private java.sql.Timestamp requiredDate;

    @Column("ShippedDate")
    private java.sql.Timestamp shippedDate;

    @Column("ShipVia")
    private Integer shipVia;

    @Column("Freight")
    private Double freight;

    @Column("ShipName")
    private String shipName;

    @Column("ShipAddress")
    private String shipAddress;

    @Column("ShipCity")
    private String shipCity;

    @Column("ShipRegion")
    private String shipRegion;

    @Column("ShipPostalCode")
    private String shipPostalCode;

    @Column("ShipCountry")
    private String shipCountry;

    public Order() {
    }

    public Order(Integer orderId, String customerId, Integer employeeId, java.sql.Timestamp orderDate, java.sql.Timestamp requiredDate, java.sql.Timestamp shippedDate, Integer shipVia, Double freight, String shipName, String shipAddress, String shipCity, String shipRegion, String shipPostalCode, String shipCountry) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.freight = freight;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.shipCity = shipCity;
        this.shipRegion = shipRegion;
        this.shipPostalCode = shipPostalCode;
        this.shipCountry = shipCountry;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public java.sql.Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(java.sql.Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public java.sql.Timestamp getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(java.sql.Timestamp requiredDate) {
        this.requiredDate = requiredDate;
    }

    public java.sql.Timestamp getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(java.sql.Timestamp shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Integer getShipVia() {
        return shipVia;
    }

    public void setShipVia(Integer shipVia) {
        this.shipVia = shipVia;
    }

    public Double getFreight() {
        return freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    public String getShipPostalCode() {
        return shipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    @Override
    public String toString() {

        return "Order{" + "orderId=" + orderId + ", customerId=" + customerId + ", employeeId=" + employeeId + ", orderDate=" + orderDate + ", requiredDate=" + requiredDate + ", shippedDate=" + shippedDate + ", shipVia=" + shipVia + ", freight=" + freight + ", shipName=" + shipName + ", shipAddress=" + shipAddress + ", shipCity=" + shipCity + ", shipRegion=" + shipRegion + ", shipPostalCode=" + shipPostalCode + ", shipCountry=" + shipCountry + '}';
    }
}
