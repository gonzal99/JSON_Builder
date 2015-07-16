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
    public Project(){
        projectName = "";
        projectDescription = "";
        projectStartDate = "";
        projectBuildNumber = "";
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectBuildNumber() {
        return projectBuildNumber;
    }

    public void setProjectBuildNumber(String projectBuildNumber) {
        this.projectBuildNumber = projectBuildNumber;
    }

    public String getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(String projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }
}
