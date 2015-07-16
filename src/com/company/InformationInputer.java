package com.company;

import java.io.*;
import java.util.Scanner;

/**
 * Created by gonzal99 on 7/14/2015.
 */
public class InformationInputer extends Project{
    Scanner scanner;
    FileReader fileReader;
    BufferedReader bufferedReader;

    public InformationInputer() throws IOException {
        super();
        fileReader = new FileReader(getFileName());
        bufferedReader = new BufferedReader(fileReader);
        parseFile();
    }

    public String getFileName() {
        Scanner tmp = new Scanner(System.in);
        System.out.println("Configuration file path: ");
        String uPath = tmp.next();
        File file = new File(uPath);
        if (file.exists()) {
            return uPath;
        } else {
            System.out.println("File not found!");
            getFileName();
        }
        return null;
    }

    private void parseFile() throws IOException {
        StringBuilder buffer = new StringBuilder();
        while (bufferedReader.ready()) {

            char temp = (char) bufferedReader.read();
            if (temp == '=') {
                String command = buffer.toString();
                System.out.println(command);
                //bufferedReader.skip(1);
                switch (command) {
                    case "ProjectName":
                        setProjectName();
                        buffer = new StringBuilder();
                    case "ProjectDescription":
                        setProjectDescription();
                        buffer = new StringBuilder();
                    case "ProjectStartDate":
                        setProjectStartDate();
                        buffer = new StringBuilder();
                    case "ProjectBuildNumber":
                        setProjectBuildNumber();
                        buffer = new StringBuilder();
                    case "ProjectFinal":
                        setProjectIsFinal();
                        buffer = new StringBuilder();
                    case "ProjectContributors":
                        setProjectContributors();
                        buffer = new StringBuilder();
                }
            }else{
                buffer.append(temp);
            }

        }
    }

    private void setProjectContributors() {
    }

    private void setProjectIsFinal() {
    }

    private void setProjectBuildNumber() {
    }

    private void setProjectName() throws IOException {
        StringBuilder buffer = new StringBuilder();
        bufferedReader.skip(1);
        while(bufferedReader.ready()){
            char temp = (char)bufferedReader.read();
            if(temp == ';'){
                break;
            }
            buffer.append(temp);
        }
        String name = buffer.toString();
        name = name.substring(0,name.length()-1);
        System.out.println(name);
        this.setProjectName(name);
        bufferedReader.skip(1);
    }

    private void setProjectDescription() throws IOException {
        StringBuilder buffer = new StringBuilder();
        bufferedReader.skip(1);
        while(bufferedReader.ready()){
            char temp = (char)bufferedReader.read();
            if(temp == ';'){
                break;
            }
            buffer.append(temp);
        }
        String description = buffer.toString();
        description = description.substring(0,description.length()-1);
        System.out.println(description);
        this.setProjectDescription(description);
        bufferedReader.skip(1);
    }

    private void setProjectStartDate() {

    }
}
