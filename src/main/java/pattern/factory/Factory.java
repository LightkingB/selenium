package pattern.factory;

enum DoughnutTypes {
    CHERRY,
    CHOCOLATE,
    ALMOND
}

public class Factory {
    public static void main(String[] args) {
        DoughnutFactory factory = new DoughnutFactory();
        Doughnut cherry = factory.getDoughnut(DoughnutTypes.CHERRY);
        Doughnut chocolate = factory.getDoughnut(DoughnutTypes.CHOCOLATE);
        Doughnut almond = factory.getDoughnut(DoughnutTypes.ALMOND);

        cherry.eat();
        chocolate.eat();
        almond.eat();
    }
}

class DoughnutFactory {
    Doughnut getDoughnut(DoughnutTypes type) {
        Doughnut toReturn = null;
        switch (type) {
            case CHERRY:
                toReturn = new CherryDoughnut();
                break;
            case CHOCOLATE:
                toReturn = new ChocolateDoughnut();
                break;
            case ALMOND:
                toReturn = new AlmondDoughnut();
                break;
            default:
                throw new IllegalArgumentException("Wrong doughnut type:" + type);
        }
        return toReturn;
    }
}

interface Doughnut {
    void eat();
}

class CherryDoughnut implements Doughnut {
    @Override
    public void eat() {
        System.out.println("You are eating Cherry doughnut!");
    }
}

class ChocolateDoughnut implements Doughnut {
    @Override
    public void eat() {
        System.out.println("You are eating Chocolate doughnut!");
    }
}

class AlmondDoughnut implements Doughnut {
    @Override
    public void eat() {
        System.out.println("You are eating Almond doughnut!");
    }
}

