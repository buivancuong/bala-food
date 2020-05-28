package com.example.balafood.ui.suggest;

import com.example.balafood.model.suggest.DayNutrition;
import com.example.balafood.model.suggest.Food;

import java.util.List;

public interface FoodSuggestContractor {

    interface View {
        void showSuggestFoodList(List<Food> foodList);
        void updateStackBarNutritionChart(DayNutrition dayNutrition);
    }

    interface Presenter {
        List<Food> generateFoodList();
        DayNutrition updateDayNutrition();
    }

}
