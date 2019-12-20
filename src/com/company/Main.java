package com.company;

public class Main {

    public void main(String[] args) {
	// creat Student object
        ProJect2 mark = new ProJect2();
        ProJect2 tontan = new ProJect2();
        ProJect2 dream = new ProJect2();

        //input data to object
        mark.name = "x Mark";
        mark.id = "001";
        mark.major = "CIS";
        tontan.name = "tan ton";
        tontan.id = "002";
        tontan.major = "CIS";
        dream.name = "dream all night";
        dream.id = "003";
        dream.major = "CIS";



        //get data form object
        System.out.println("1. "+mark.name+""+mark.major);
        System.out.println("2."+tontan.name+""+tontan.major);
        System.out.println("3. "+dream.name+""+dream.major);

//add Student to array
        ProJect2[] oopStudents = {mark,tontan,dream};
        System.out.println("1. "+oopStudents[0].name);
        System.out.println("2."+oopStudents[0].name);
        System.out.println("3."+oopStudents[0].name);

        find_CIS_ProJect2(oopStudents);
    }
    //To find CIS Student
    public void find_CIS_ProJect2(ProJect2[] Students) {
        for (int i = 0 ; i<Students.length; i++){
        if (Students[i].major == "CIS"){
            System.out.println(i+1 + ". " + Students[i].name);
        }
    }

    }
}
