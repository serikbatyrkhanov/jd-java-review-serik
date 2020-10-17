package com.cybertek.streams.exercises;

import com.cybertek.enums.Status;
import com.cybertek.oop.encapsulation.User;
import com.cybertek.oop.inheritance.Project;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    /*Task-1*/
    public static List<Project> getListOfProject() {
        return DataGenerator.getProjects();
    }


    /*Task-2*/
    public static List<Project> getListOfProject(Status status) {
        return DataGenerator.getProjects().stream().filter(project -> project.getProjectStatus().equals(status)).collect(Collectors.toList());
    }

    /*Task-3*/
//    public static List<Project> getListOfProject(User manager){
//        DataGenerator.getUsers().stream().filter(user -> user.getRole().getDescription().equals("Manager")).collect(Collectors.toList());
//    }


    /*Task-4
    public static List<Project> getProjectByProjectCode(String projectCode){

    }
    */

    /*Task-5
    public static List<User> getListUsers(){

    }
    */

    /*Task-6
    public static User getUserByFirstName(String firstName){

    }
    */

    /*Task-7
    public static String getUserByUserId(Long id){

    }
    */

    /*Task-8
    public static List<User> deleteUser(String firstName){

    }
    */

    /*Task-9
    public static List<Project> updateProjectStatus(Status oldStatus,Status newStatus){

    }
    */

    /*Task-10
    public static List<Project> findProjectByManager(User manager){

    }
    */

    /*Task-11 - Period
    public static Integer totalProjectDurationForManager(User manager){

    }
    */

    /*Task-12
    public static long findTotalMaleInCompany(){

    }
    */


}
