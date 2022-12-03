public class Main {

    public static void main(String[] args) {
      //Задание 1
      var dog = 8.0;
      var cat = 3.6;
      var paper = 763789;

      System.out.println(dog);
      System.out.println(cat);
      System.out.println(paper);

      //Задание 2
      dog = dog + 4;
      cat = cat + 4;
      paper = paper + 4;
      System.out.println(dog);
      System.out.println(cat);
      System.out.println(paper);

      //Задание 3
      dog = dog - 3.5;
      cat = cat - 1.6;
      paper = paper - 7639;
      System.out.println(dog);
      System.out.println(cat);
      System.out.println(paper);

      //Задание 4
      var friend = 19;
      friend = friend + 2;
      friend = friend / 3;
      System.out.println(friend);

      //Задаине 5
      var frog = 3.5;
      System.out.println(frog);
      frog = frog * 10;
      System.out.println(frog);
      frog = frog / 3.5;
      System.out.println(frog);
      frog = frog + 4;
      System.out.println(frog);

      //Задание 6
      var boxerWeight1 = 78.2;
      var boxerWeight2 = 82.7;
      var totalWeight = boxerWeight1 + boxerWeight2;
      System.out.println("Общий вес бойцов = " + totalWeight + " кг");
      //Задание 7
      var differenceWeight = boxerWeight2 - boxerWeight1;
      System.out.println("Разница между весами бойцов (через вычитание) = " + differenceWeight + " кг");
      var differenceWeight2 = boxerWeight2 % boxerWeight1;
      System.out.println("Разница между весами бойцов (через остаток деления) = " + differenceWeight2 + " кг");

      //Задание 8
      var workHours = 640;
      var workHoursWorker = 8;
      var numberWorkers = workHours / workHoursWorker;
      System.out.println("Всего работников в компании - " + numberWorkers + " человек");
      numberWorkers = numberWorkers + 94;
      workHours = numberWorkers * workHoursWorker;
      System.out.println("Если в компании работает " + numberWorkers + " человек, то всего " + workHours + " часов работы может быть поделено между сотрудниками.");




    }
}