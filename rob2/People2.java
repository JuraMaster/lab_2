package lab.rob2;

import lab.rob1.People;

public class People2 {

    public People people;

    public People2(People people) {
        this.people = people;
    }

    public void moreInfo() {
        System.out.println("У нас діє акція!\uD83E\uDD11");
        System.out.println("Правила: ");
        System.out.println("Потрібно відгадати товар із закритими очима");
        System.out.println("Приз: скидка на цей товар");
    }

    public double bonus(){
        if (people.getTimeWorkInCompany() >= 1.2 && people.getTimeWorkInCompany() < 5){
            double bonus = 0.05;
            System.out.println(people.getPeopleName()+":"+" Зарплата збільшена на 5% = "+people.getSalary()*bonus);
            System.out.println("Зарпалата: \uD83E\uDD11"+(people.getSalary()+(people.getSalary()*bonus)));
            System.out.println();
        }else if(people.getTimeWorkInCompany() >= 5){
            double bonus = 0.15;
            System.out.println(people.getPeopleName()+":"+" Зарплата збільшена на 15% = "+people.getSalary()*bonus);
            System.out.println("Зарпалата: \uD83E\uDD11"+(people.getSalary()+(people.getSalary()*bonus)));
            System.out.println();
        }else{
            System.out.println(people.getPeopleName()+":"+" Надбавки немає!");
            System.out.println("Зарпалата: \uD83E\uDD11"+people.getSalary());
            System.out.println();
        }
        return 0;
    }


}
