package com.mylearning;

public class BranchB extends BranchA {


    public BranchB(String branchName, String cityName, String state, int pinCode, String branchHead,String domain) {
        super.branchName=branchName;
        super.cityName=cityName;
        super.State=state;
        super.pinCode=pinCode;
        super.branchHead=branchHead;
        super.domain=domain;
    }

    @Override
    public String toString() {
        return "BranchB{" +
                "branchName='" + branchName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", State='" + State + '\'' +
                ", pinCode=" + pinCode +
                ", address='" + address + '\'' +
                ", branchHead='" + branchHead + '\'' +
                ", domain='" + domain + '\'' +
                '}';
    }
}