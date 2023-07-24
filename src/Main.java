import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PlayingToys playingToys = new PlayingToys(new ArrayList<>());

        //Добавляем игрушки
        Toy toy1 = new Toy(1, 5, "Плюшевый медведь", 50);
        Toy toy2 = new Toy(2, 4, "Плюшевый заец", 60);
        Toy toy3 = new Toy(3, 2, "Мяч", 10);
        Toy toy4 = new Toy(4, 1, "Самурайский меч", 40);
        Toy toy5 = new Toy(5, 5, "Кукда Барби", 10);
        Toy toy6 = new Toy(6, 2, "Аниме фигурка", 20);
        Toy toy7 = new Toy(7, 20, "Брелок", 80);
        Toy toy8 = new Toy(8, 6, "Плюшевая акула", 30);
        Toy toy9 = new Toy(9, 5, "Плюшевый кот", 50);
        Toy toy10 = new Toy(10, 10, "Плюшевая мышь", 70);

        //Добавляем в список
        playingToys.addToys(toy1);
        playingToys.addToys(toy2);
        playingToys.addToys(toy3);
        playingToys.addToys(toy4);
        playingToys.addToys(toy5);
        playingToys.addToys(toy6);
        playingToys.addToys(toy7);
        playingToys.addToys(toy8);
        playingToys.addToys(toy9);
        playingToys.addToys(toy10);

        //Изменяем вероятность падения данной игрушки
        playingToys.changeDrop(toy1, 40);

        //Выводим список
        playingToys.getPrizeToys();

        //Выводим выигрышь или проигрышь
        playingToys.choicePrizeToys();
        playingToys.choicePrizeToys();
        playingToys.choicePrizeToys();
        playingToys.choicePrizeToys();




    }
}