package com.mylearning;


public class Company {
    public static void main(String[] args) {

        Company com=new Company();

        BranchA a=new BranchA("PimpalgaonBranch","Pimpalgaon","Maharashtra",433434,"jk kumar","steel");

        BranchB b=new BranchB("OjharBranch","Ojhar","Maharashtra",123456,"Himanshu Vaishya","cloths");

        BranchC c=new BranchC("DelhiBranch","Delhi","Delhi",903456,"op nadda","Cement");


        System.out.println(b.toString());

        System.out.println(a.getBranchHead());

        System.out.println(c.getBranchHead());



    }
}