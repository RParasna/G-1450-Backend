package com.RP.G1450.model;

import jakarta.persistence.*;

@Entity
@Table(name = "applicant")
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String cardFirstName;
    private String cardMiddleName;
    private String cardLastName;
    private String streetName;
    private String buildingType;
    private Long buildingNum;
    private String city;
    private String state;
    private String zipCode;
    private String signature;
    private Long telephoneNumber;
    private String email;
    private Long cardNumber;
    private String expiryDate;
    private String cardType;
    private Float payment;

    public Applicant() {
    }

    public Applicant(Long id, String firstName, String middleName, String lastName, String cardFirstName, String cardMiddleName, String cardLastName, String streetName, String buildingType, Long buildingNum, String city, String state, String zipCode, String signature, Long telephoneNumber, String email, Long cardNumber, String expiryDate, String cardType, Float payment) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cardFirstName = cardFirstName;
        this.cardMiddleName = cardMiddleName;
        this.cardLastName = cardLastName;
        this.streetName = streetName;
        this.buildingType = buildingType;
        this.buildingNum = buildingNum;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.signature = signature;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cardType = cardType;
        this.payment = payment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCardFirstName() {
        return cardFirstName;
    }

    public void setCardFirstName(String cardFirstName) {
        this.cardFirstName = cardFirstName;
    }

    public String getCardMiddleName() {
        return cardMiddleName;
    }

    public void setCardMiddleName(String cardMiddleName) {
        this.cardMiddleName = cardMiddleName;
    }

    public String getCardLastName() {
        return cardLastName;
    }

    public void setCardLastName(String cardLastName) {
        this.cardLastName = cardLastName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public Long getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(Long buildingNum) {
        this.buildingNum = buildingNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(Long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Float getPayment() {
        return payment;
    }

    public void setPayment(Float payment) {
        this.payment = payment;
    }
}
