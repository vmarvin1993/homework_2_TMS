public class Tempweatherr {
    public static void main(String[] args) {
        int temperature = -4;
        if (temperature >-5){
            System.out.println("Тепло");
        } else if (temperature > -20){
            System.out.println("нормально");
        } else if (-20 >= temperature){
            System.out.println("Холодно");
        }
    }
}
