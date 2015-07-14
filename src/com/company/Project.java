package com.company;

import java.util.ArrayList;

/**
 * Created by gonzal99 on 7/14/2015.
 */
public class Project {
    private String projectName;
    private String projectDescription;
    private String projectStartDate;
    private String projectBuildNumber;
    private ArrayList<Contributor> contributors;
    public Project(String projectName,String projectDescription, String projectStartDate, String projectBuildNumberr){
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectStartDate = projectStartDate;
        this.projectBuildNumber = projectBuildNumberr;
        contributors = new ArrayList<Contributor>();
    }
    public void addContributor(Contributor contributor){
        contributors.add(contributor);
    }


}
