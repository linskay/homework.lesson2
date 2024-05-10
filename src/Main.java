public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, наставник!:)");

        var dog = 8.0; /// задание 1
        var cat = 3.6;
        var paper = 763789;
        System.out.println("This is a dog ("+dog+"), and that is a cat ("+cat+"), and this is a paper (" + paper + ")");

        dog = 4 + dog; /// задание 2
        cat = 4 + cat;
        paper = 4 + paper;
        System.out.println("прим.: это после +4: "+"This is a dog (" + dog + "), and that is a cat (" + cat + "), and this is a paper (" + paper + ")");

        dog = dog - 3.5; /// задание 3
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("прим.: это послe вычитания: "+"This is a dog (" + dog + "), and that is a cat (" + cat  +"), and this is a paper (" + paper + ")");

        var friend = 19; /// задание 4
        System.out.println("Friend сейчас = "+ friend);
        friend = 2 + friend;
        System.out.println("Friend после сложения = " + friend );
        friend = friend / 7;
        System.out.println("Friend после деления = " + friend );

        var frog = 3.5; /// задание 5
        System.out.println("Frog сейчас = " + frog );
        frog = frog * 10;
        System.out.println("Frog после умножения = " + frog );
        frog = frog / 3.5;
        System.out.println("Frog после деления = " + frog );
        frog = frog + 4;
        System.out.println("Frog после сложения = " + frog);

        var box1 = 78.2; /// задание 6+7
        var box2 = 82.7;
        var resultBoxPlus = box1 + box2;
        var resultBoxMinus = box2 - box1;
        var resultBoxVariance = box2 % box1; /// 7 задание
        System.out.println("Общая масса двух бойцов = " + resultBoxPlus + " , разница = " + resultBoxMinus + " кг, а разница в процентах (относит. боксера с меньшей массой) = " + resultBoxVariance + "%");

        var time = 640; /// задание 8
        var timeDay = 8;
        var team = time / timeDay;
        System.out.println("Всего работников в компании — " + team + " человек");
        team = team + 94;
        time = team * timeDay;
        System.out.println("Если в компании работает " + team + " человек, то всего " + time + " часов работы может быть поделено между сотрудниками");

    }
}