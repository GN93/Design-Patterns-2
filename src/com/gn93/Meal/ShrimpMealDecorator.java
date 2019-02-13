package com.gn93.Meal;

public class ShrimpMealDecorator extends MealDecorator {

    public ShrimpMealDecorator(Meal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addSchrimp();
    }

    public void addSchrimp(){
        System.out.println(" schrimp +");
    }
}
