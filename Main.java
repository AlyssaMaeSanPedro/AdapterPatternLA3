public class Main {

    public static void main(String[] args){

        Laptop laptop = new Laptop();
        PowerOutlet lt = new LaptopAdapter(laptop);

        Refrigerator  refrigerator  = new Refrigerator();
        PowerOutlet fridge = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger  smartphoneCharger = new SmartphoneCharger();
        PowerOutlet phone = new SmartphoneAdapter(smartphoneCharger);

        System.out.println(lt.plugIn());
        System.out.println(fridge.plugIn());
        System.out.println(phone.plugIn());

        System.out.println();

    }
}