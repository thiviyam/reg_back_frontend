//package com.example.demo.models;
//
//import java.io.Serializable;
//import java.util.Objects;
//
//public class Menucomposite implements Serializable
//{
//
//	private String foodName;
//    private int kitId;
//
//    public Menucomposite() {
//    }
//
//    public Menucomposite(String foodName, int kitId) {
//        this.foodName = foodName;
//        this.kitId = kitId;
//    }
//
//    @Override
//    public boolean equals(Object o) 
//    {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        
//        Menucomposite menu = (Menucomposite) o;
//        return foodName.equals(menu.foodName) &&
//        		kitId==(menu.kitId);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(foodName, kitId);
//    }
//	
//	
//}
