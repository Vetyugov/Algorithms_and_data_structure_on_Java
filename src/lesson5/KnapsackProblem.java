package lesson5;

public class KnapsackProblem {
    public int [] mass;//Массив масс элементов
    public int [] value;//Массив ценностей элементов
    public int weight; //Максимальная вместимость рюкзака
    public int maxValue = 0; //Максимальная ценность предметов в рюкзаке
    public int currentValue = 0;
    public int currentMass = 0;

    public KnapsackProblem( int [] mass, int [] value, int weight) {
        this.mass = mass;
        this.value = value;
        this.weight = weight;
    }
    public void solve(){
        search(0,0,0);
        System.out.println("Наибольшая ценность грузов: " + maxValue);
    }



    private void search(int currentMass, int currentValue, int number){
        if (currentMass > weight ){
            return;
        } else if (currentValue > maxValue){
            maxValue = currentValue;
        }
        if (number > mass.length-1){
            return;
        }
        search(currentMass + mass[number], currentValue + value[number], number+1);
        search(currentMass, currentValue, number+1);
    }

}
