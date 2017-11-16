package main.Java;

public class Main
{
    public static void main(String[] args) throws IllegalAccessException
    {

        System.out.println("Testing Cook Book Class");

        User Chefkoch = new User(true, "Kai", "Okamoto", "test");
        User Burger = new User(false, "Kim", "Griffith", "test");
        User Drogenmueller = new User(false, "Nick", "Drogenmueller", "test");

        Recipe Apfel = new Recipe(Chefkoch,"Apfel");

        Ingredient Banane = new Ingredient("Banane", 200, "g");
        Ingredient Quark = new Ingredient ("Quark", 250, "g");

        Recipe Bananenquark = new Recipe(Chefkoch, "Bananenquark");

        Bananenquark.setCookingProcess("Banane schälen, schnippeln, mit Quark vermischen und voila, fertig.");
        Bananenquark.addIngredientToList(Quark);
        Bananenquark.addIngredientToList(Banane);

        Valuation val1 = new Valuation(5,"Super lecker",Chefkoch);
        Valuation val2 = new Valuation(5,"eklig, schleimig",Drogenmueller);
        Valuation val3 = new Valuation(2,"frisch und gesund",Burger);

        Burger.deleteRecipe(Bananenquark);


        System.out.println();
        System.out.println(val1.getAuthor().getFirstname()+" "+val1.getAuthor().getLastname()+" sagt: "+ val1.getComment().toUpperCase());
        Bananenquark.setValuationList(val1);
        Chefkoch.deleteValuation(Bananenquark,val1);
        Bananenquark.setValuationList(val2);
        Bananenquark.setValuationList(val3);

        Bananenquark.setDifficulty(1);


        //BASIC TEST FOR RECIPE INFO//
        Bananenquark.recipeCalculator(1);
        System.out.println();
        Bananenquark.printCook();
        System.out.println();
        System.out.println("Personenanzahl: "+Bananenquark.getNumberOfPeople());
        System.out.println();
        System.out.println("Scbwierigikeitsstufe: "+ Bananenquark.getDifficulty());
        System.out.println();
        System.out.println("Zutaten:");
        Bananenquark.printIngredientList();
        System.out.println();
        System.out.println("Zubereitung:");
        System.out.println(Bananenquark.getCookingProcess());
        System.out.println();
        if(val3.checkIfUserIsAuthor(Burger))
        {
            val3.setScore(9);
        }

        System.out.println("Durchschnittliche Bewertung: "+Bananenquark.getAvgScore());

        // TEST FOR CALCULATING THE INGREDIENT QUANTITY//
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Bananenquark.recipeCalculator(2);
        System.out.println(Bananenquark.getNumberOfPeople());
        Bananenquark.printIngredientList();

        // TEST WITH CHANGING THE GIVEN SCORE //

        Bananenquark.setValuationList(val3);
        System.out.println(Bananenquark.getAvgScore());


        //TEST WITH ADDING AND REMOVING A NEW VALUATION//
        Valuation val4 = new Valuation(3,"nomnomnom",Burger);
        Bananenquark.setValuationList(val4);
        System.out.println(Bananenquark.getAvgScore());
        //Bananenquark.removeValuation(val4);
        System.out.println(Bananenquark.getAvgScore());
        System.out.println(val3.getComment());


        Bananenquark.setDuration(3);
        System.out.println(Bananenquark.getDuration().toMinutes());
        Bananenquark.setDuration(10);
        System.out.println(Bananenquark.getDuration().toMillis());

        System.out.println();
    }
}
