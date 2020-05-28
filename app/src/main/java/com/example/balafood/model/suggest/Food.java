package com.example.balafood.model.suggest;

public class Food {

    private String foodName;
    private double gluxit;
    private double fiber;
    private double fat;
    private double protein;
    private double kcalo;

    public Food() {
    }

    private Food(FoodBuilder foodBuilder) {
        this.foodName = foodBuilder.foodName;
        this.gluxit = foodBuilder.gluxit;
        this.fiber = foodBuilder.fiber;
        this.fat = foodBuilder.fat;
        this.protein = foodBuilder.protein;
        this.kcalo = foodBuilder.kcalo;
    }

    public static class FoodBuilder {
        private String foodName = "";
        private double gluxit = 0;
        private double fiber = 0;
        private double fat = 0;
        private double protein = 0;
        private double kcalo = 0;

        public FoodBuilder setFoodName(String foodName) {
            this.foodName = foodName;
            return this;
        }

        public FoodBuilder setGluxit(double gluxit) {
            this.gluxit = gluxit;
            return this;
        }

        public FoodBuilder setFiber(double fiber) {
            this.fiber = fiber;
            return this;
        }

        public FoodBuilder setFat(double fat) {
            this.fat = fat;
            return this;
        }

        public FoodBuilder setProtein(double protein) {
            this.protein = protein;
            return this;
        }

        public  FoodBuilder setKCalo(double kcalo) {
            this.kcalo = kcalo;
            return this;
        }

        public Food builder() {
            return new Food(this);
        }
    }

    public String getFoodName() {
        return this.foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getGluxit() {
        return this.gluxit;
    }
    public void setGluxit(double gluxit) {
        this.gluxit = gluxit;
    }

    public double getFiber() {
        return this.fiber;
    }
    public void setFiber(double fiber) {
        this.fiber = fiber;
    }

    public double getFat() {
        return this.fat;
    }
    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getProtein() {
        return this.protein;
    }
    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getKcalo() {
        return this.kcalo;
    }
    public void setKcalo(double kcalo) {
        this.kcalo = kcalo;
    }

}
