package OOPAdvanced2GoodMorning.person;

import OOPAdvanced2GoodMorning.person.Bus;
import  OOPAdvanced2GoodMorning.person.Hyodoable;
import  OOPAdvanced2GoodMorning.person.Person;
import OOPAdvanced2GoodMorning.person.occupation.Musician;
import OOPAdvanced2GoodMorning.person.occupation.PersonalTrainer;
import  OOPAdvanced2GoodMorning.person.occupation.Programmer;
public class Main {
    public static void main(String[] args) {
        Hyodoable musician = new Musician("아이유", false);
        Hyodoable personalTrainer = new PersonalTrainer("김계란",10);
        Hyodoable programmer = new Programmer("조영현", true);


        Bus bus = new Bus();

        bus.test(musician);
        bus.test(personalTrainer);
        bus.test(programmer);
    }
}