public class Main {
    public static void main(String[] args) {

        var dog = 8.0; /// задание 1
        var cat = 3.6;
        var paper = 763789;
        System.out.println("This is a dog ("+dog+"), and that is a cat ("+cat+"), and this is a paper ("+paper+")");

        var resultDog = 4 + dog; /// задание 2
        var resultCat = 4 + cat;
        var resultPaper = 4 + paper;
        System.out.println("прим.: это после +4: "+"This is a dog ("+resultDog+"), and that is a cat ("+resultCat+"), and this is a paper ("+resultPaper+")");

        var resultDogMinus = resultDog - 3.5; /// задание 3 (нужно от исходных переменных отнять или полученных во 2 задании?)
        var resultCatMinus = resultCat - 1.6;
        var resultPaperMinus = resultPaper - 7639;
        System.out.println("прим.: это послe вычитания: "+"This is a dog ("+resultDogMinus+"), and that is a cat ("+resultCatMinus+"), and this is a paper ("+resultPaperMinus+")");

        var friend = 19; /// задание 4
        System.out.println("Friend сейчас = "+ friend);
        var resultFriendPlus = 2 + friend;
        System.out.println("Friend после сложения = " + resultFriendPlus);
        var resultFriendDivision = resultFriendPlus / 7;
        System.out.println("Friend после деления = " + resultFriendDivision);

        var frog = 3.5; /// задание 5
        System.out.println("Frog сейчас = " + frog);
        var resultFrogMultiply = frog * 10;
        System.out.println("Frog после умножения = " + resultFrogMultiply);
        var resultFrogDivision = resultFrogMultiply / 3.5;
        System.out.println("Frog после деления = " + resultFrogDivision);
        var resultFrogPlus = resultFrogDivision + 4;
        System.out.println("Frog после сложения = " + resultFrogPlus);

        var box1 = 78.2; /// задание 6+7 (7 задание условие не понятно, нет данных, сделала на примере этого задания)
        var box2 = 82.7;
        var resultBoxPlus = box1 + box2;
        var resultBoxMinus = box2 - box1;
        var resultBoxVariance = box2 % box1; /// 7 задание (?)
        System.out.println("Общая масса двух бойцов = " + resultBoxPlus + " , разница = " + resultBoxMinus + " кг, а разница в процентах (относит. боксера с меньшей массой) = " + resultBoxVariance + "%");

        var time = 640; /// задание 8
        var timeDay = 8;
        var team = time / timeDay;
        System.out.println("Всего работников в компании — " + team + " человек");
        var teamPlus = team + 94;
        var timePlus = teamPlus * timeDay;
        System.out.println("Если в компании работает " + teamPlus + " человек, то всего " + timePlus + " часов работы может быть поделено между сотрудниками");

    }
}