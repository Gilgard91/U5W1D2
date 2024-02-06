package com.epicode.U5D1.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@NoArgsConstructor

public class Menu {
	private List<Pizza> pizzaList;
	private List<Drink> drinkList;
	private List<Topping> toppingList;

	public Menu(List<Pizza> pizzaList, List<Drink> drinkList, List<Topping> toppingList) {
		this.pizzaList = pizzaList;
		this.drinkList = drinkList;
		this.toppingList = toppingList;
	}

	public void printMenu() {
		System.out.println("******* Menu *******");
		System.out.println("PIZZAS");
		this.pizzaList.forEach(System.out::println);
		System.out.println();

		System.out.println("TOPPINGS");
		this.toppingList.forEach(System.out::println);
		System.out.println();

		System.out.println("DRINKS");
		this.drinkList.forEach(System.out::println);
		System.out.println();

	}
}
