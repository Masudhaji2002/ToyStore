import java.util.ArrayList;
import java.util.Random;

public class PlayingToys implements getPrizeToys_I, choicePrizeToys_I, changeDrop_I, addToys_I {
    private ArrayList<String> prizeToys;
    private Toy toy;

    public PlayingToys(ArrayList<String> prizeToys) {
        this.prizeToys = prizeToys;
    }


    @Override
    public void addToys(Toy newToy) {
        prizeToys.add(newToy.getNameToys());
    }

    @Override
    public void changeDrop(Toy toy, double newDropFrequency) {
        toy.setDropFrequency(newDropFrequency);

    }

    @Override
    public void choicePrizeToys() {
        if(prizeToys.isEmpty()){
            System.out.println("Нет призовых игрушек в наличии");
        } else {
            //Генерируем случайное число от 0 до 1
            Random random = new Random();
            double chance = random.nextDouble();

            //Пороговое значение для вероятности ничего не выиграть
            double noWinThreshold = 0.2;

            if (chance < noWinThreshold) {
                System.out.println("Увы, вы ничего не выиграли.");
            } else {
                // Выбираем случайную призовую игрушку из списка и "выдаем" ее
                int randomIndex = random.nextInt(prizeToys.size());
                String randomPrizeToy = prizeToys.get(randomIndex);
                System.out.println("Вы получили призовую игрушку: " + randomPrizeToy);
            }
        }

    }

    @Override
    public void getPrizeToys() {
        if(prizeToys.isEmpty()){
            System.out.println("Нет призовых игрушек в наличии");
        } else{
            for (String prizeToy : prizeToys){
                System.out.println(prizeToy);
            }
        }

    }
}
