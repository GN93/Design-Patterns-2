package com.gn93.Meal;

public abstract class MealDecorator extends Meal{

    Meal meal;

    public MealDecorator(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void prepareMeal() {
        System.out.println("Rice +");
    }
}
