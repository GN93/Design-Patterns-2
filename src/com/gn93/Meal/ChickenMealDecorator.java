package com.gn93.Meal;

public class ChickenMealDecorator extends MealDecorator {

    public ChickenMealDecorator(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addChicken();
    }

    public void addChicken(){
        System.out.println(" chicken +");
    }
}
