import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        Characteristics:
//        - Strength, Agility, Intelligence - no less than 10 pts each
//        - Strength + Ability + Intelligence = no greater than 50
//        - Magic missile causes damage to the target HP totaling 5 times intelligence of caster
//        - Magic missile has damage modifier which is random number from 0.5 to 1.5 that is multiplied to amount of damage inflicted by caster
//        - Magic missile must have 60-70% chance of defeating a level 10 Orc with 1000 HP after 10 turns


//                (1) What level of intelligence would the Mage need to achieve the scenario, with a damage multiplier unchanged from 0.5 to 1.5?
//                (2) For a Mage with 10 points of intelligence, what would the base number of the Magic Missile damage need to be to achieve the scenario?

        Random rand= new Random();

//        (1) Testing INTELLIGENCE value

//        Intelligence for (1) (21 achieves desired outcome under these conditions - found through multiple tests and changes)
        int intel1 = 21;

//        Random strength/agility values
        int stren1 = rand.nextInt(10) + 10;
        int agil1 = 50-intel1-stren1;

        System.out.println("\nFor #1, Intelligence = " + intel1 + ", Strength = " + stren1 + ", Agility = " + agil1);

//        Damage = 5 * intelligence
        int dam1 = intel1*5;

//        Actual damage = damage*modifier
//        Multiplier = random double from 0.5 to 1.5
        double max = 1.5d;
        double min = 0.5d;

        double damMod1 = rand.nextDouble() * (max - min) + (min);
        double damage1 = dam1*damMod1;

        double damMod2 = rand.nextDouble() * (max - min) + (min);
        double damage2 = dam1*damMod2;

        double damMod3 = rand.nextDouble() * (max - min) + (min);
        double damage3 = dam1*damMod3;

        double damMod4 = rand.nextDouble() * (max - min) + (min);
        double damage4 = dam1*damMod4;

        double damMod5 = rand.nextDouble() * (max - min) + (min);
        double damage5 = dam1*damMod5;

        double damMod6 = rand.nextDouble() * (max - min) + (min);
        double damage6 = dam1*damMod6;

        double damMod7 = rand.nextDouble() * (max - min) + (min);
        double damage7 = dam1*damMod7;

        double damMod8 = rand.nextDouble() * (max - min) + (min);
        double damage8 = dam1*damMod8;

        double damMod9 = rand.nextDouble() * (max - min) + (min);
        double damage9 = dam1*damMod9;

        double damMod10 = rand.nextDouble() * (max - min) + (min);
        double damage10 = dam1*damMod10;

//        Total damage to Orc = damage1+damage2+...damage10 --> has to equal or be greater than 1000 60-70% of the time
        int totalDamtoOrc1 = (int)(damage1+damage2+damage3+damage4+damage5+damage6+damage7+damage8+damage9+damage10);
        System.out.println("The total damage to the Orc is " + totalDamtoOrc1 + ".");


//        (2) Testing BASE NUMBER value

//        Intelligence for (2) kept at 10
        int intel2 = 10;

//        Random strength/agility values
        int stren2 = rand.nextInt(20) + 10;
        int agil2 = 50-intel2-stren2;

        System.out.println("\nFor #2, Intelligence = " + intel2 + ", Strength = " + stren2 + ", Agility = " + agil2);

//        Base number of damage for (2) (10.43 achieves desired outcome under these conditions - found through multiple tests and changes)
        double dam2 = intel2*10.43;

//        Actual damage = damage*modifier
//        Multiplier = random double from 0.5 to 1.5

        double damMod11 = rand.nextDouble() * (max - min) + (min);
        double damage11 = dam2*damMod11;

        double damMod12 = rand.nextDouble() * (max - min) + (min);
        double damage12 = dam2*damMod12;

        double damMod13 = rand.nextDouble() * (max - min) + (min);
        double damage13 = dam2*damMod13;

        double damMod14 = rand.nextDouble() * (max - min) + (min);
        double damage14 = dam2*damMod14;

        double damMod15 = rand.nextDouble() * (max - min) + (min);
        double damage15 = dam2*damMod15;

        double damMod16 = rand.nextDouble() * (max - min) + (min);
        double damage16 = dam2*damMod16;

        double damMod17 = rand.nextDouble() * (max - min) + (min);
        double damage17 = dam2*damMod17;

        double damMod18 = rand.nextDouble() * (max - min) + (min);
        double damage18 = dam2*damMod18;

        double damMod19 = rand.nextDouble() * (max - min) + (min);
        double damage19 = dam2*damMod19;

        double damMod20 = rand.nextDouble() * (max - min) + (min);
        double damage20 = dam2*damMod20;

//        Total damage to Orc = damage11+damage12+...damage20 --> has to equal or be greater than 1000 60-70% of the time
        int totalDamtoOrc2 = (int)(damage11+damage12+damage13+damage14+damage15+damage16+damage17+damage18+damage19+damage20);
        System.out.println("The total damage to the Orc is " + totalDamtoOrc2 + ".");

    }

}
