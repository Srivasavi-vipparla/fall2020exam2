/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4.runtime;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class Engineer extends Person {

    private String eng_branch, job_Title, company_name;

    public Engineer(String eng_branch, String job_Title, String company_name, String fName, String lName, int age) {
        super(fName, lName, age);
        this.eng_branch = eng_branch;
        this.job_Title = job_Title;
        this.company_name = company_name;

    }

    public String getJob_Title() {
        return job_Title;
    }

    @Override
    public String getPersonDetails() {
        return super.getPersonDetails() + getJob_Title() + " Engineer";

    }

    @Override
    public String toString() {
        return super.toString() + "\nEngineer{" + "eng_branch=" + eng_branch + ", job_Title=" + job_Title + ", company_name=" + company_name + '}';
    }

}
