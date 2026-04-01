public class Main {
    public static void main(String[] args) {

        GarmentFactory[] factories = {
            new ProfessionalFactory(),
            new CasualFactory(),
            new PartyFactory()
        };

        for (GarmentFactory factory : factories) {
            Top top = factory.createTop();
            Pants pants = factory.createPants();
            Shoes shoes = factory.createShoes();

            top.wear();
            pants.wear();
            shoes.wear();

            System.out.println("-----");
        }
    }
}
