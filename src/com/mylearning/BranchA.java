package com.mylearning;

public class BranchA  extends Company{


    String branchName;
    String cityName;
    String State;
    int pinCode;
    String address;
    String branchHead;

    @Override
    public String toString() {
        return "BranchA{" +
                "branchName='" + branchName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", State='" + State + '\'' +
                ", pinCode=" + pinCode +
                ", address='" + address + '\'' +
                ", branchHead='" + branchHead + '\'' +
                ", domain='" + domain + '\'' +
                '}';
    }

    String domain;




    public BranchA() {
    }

    public BranchA(String branchName, String cityName, String state, int pinCode, String branchHead,String domain) {
        this.branchName = branchName;
        this.cityName = cityName;
        this. State = state;
        this.pinCode = pinCode;
        this.branchHead = branchHead;
        this.domain=domain;

    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getAddress() {
        return address;
    }



    public String getBranchHead() {
        return branchHead;
    }

    public void setBranchHead(String branchHead) {
        branchHead = branchHead;
    }

}




