
package patıka;

class Employe {
    String name;
    int salary;
    int workHours;
    int hireYear;
    public Employe(int salary, int workHours, int hireYear, String name) {
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.name = name;
    }

    public int tax() {
        if (salary >= 1000) {
            int kesılen = (salary * 3) / 100;
            salary = salary - kesılen;
        }
        return salary;
    }

    public int bonus() {
        int bonushesapla = 0;
        if (workHours > 40) {
            bonushesapla = (workHours - 40) * 30;

        }
        return bonushesapla;
    }

    public int raiseSalary() {
        int yıl = 2021;
        if (yıl - hireYear < 10 && yıl-hireYear > 0) {
            salary = salary + ((salary * 5) / 100);
        } else if (yıl - hireYear > 9 && yıl - hireYear < 20) {
            salary = salary + ((salary * 10) / 100);
        } else if (yıl - hireYear > 19) {
            salary = salary + ((salary * 15) / 100);
        }
        return salary;
    }
    public void ToStrig(Employe x1) {
        System.out.println("Maaşınız : " + x1.tax());
        System.out.println("Bonus paranız :  " + x1.bonus());
        System.out.println("Maaş artışınız :  " + x1.raiseSalary());
        System.out.println("İsim : " + x1.name);
    }
}
public class Patıka {

   
    public static void main(String[] args) {
       Employe x1 = new Employe(1200, 60, 2012, "ahmet");
        x1.ToStrig(x1);
    }
    
}
