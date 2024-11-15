
# The DeliBarn



    
    


## Overview

    This is a sandwich ordering system that allows users to customize 
    their sandwich order by selecting various 
    options such as bread type, toppings(meats, vegetables, cheeses, and sauces)    
    and drink or chips add-ons. The system calculates the total price of the selected items
    based on the selected items and provides an order summary

Key Features
    
    -Customizable sandwich orders with various toppings
    -Option to add chips or drinks to the order
    -Price calculation based on user choices
    -Order summary with product details


# Usage

    When you run the program, you will be greeted with a home screen where you can choose
    between:

    New Order: Start a new sandwich order.
    Exit: Exit the application.
   
    If you choose New Order, the system will walk you through the following steps:
    -Select a bread type (White, Wheat, Rye, Wrap).
    -Choose a size for your sandwich (4, 8, 12 inches).
    -Select up to 4 regular toppings (Lettuce, Tomato, Onion, Pickles, Cheese).
    -Add meat, cheese, vegetables, and sauces to your sandwich.
    -Choose whether you'd like your sandwich toasted.
    
    You can also choose to add chips or a drink to your order, after which the system will display the total price.



## Example

    Here's an example of a basic order:

    

## Code Structure

Main Class

    The entry point of the application (Main.java), which handles user interaction through the command line.
    It handles the flow of the program, prompting the user for input and calling methods to process the sandwich order.

Product Interface

    Product.java is an interface that defines the calculatePrice() method, ensuring 
    that all products (Sandwich, Chips, Drink) implement this method for price calculation.

Items 

    Sandwich: A customizable sandwich object with properties such as 
    bread type, size, toppings, and whether it's toasted.
    Chips: Chips with a flavor and a fixed price, implemented as a product.
    Drink: A drink with a size and flavor, also treated as a product.

Order Class

    Order.java manages the entire customer order, including the    list of products 
    (sandwiches, drinks, chips) and 
    provides methods to add, remove, and calculate the total price of items in the order.
## Unique Piece of Code

    One of the key features of this project is the use of the Product interface, which is implemented 
    by all product classes (like Sandwich, Chips, Drink). 
    This design pattern ensures polymorphism and simplifies the calculation of total order prices.

Why its Unique 

    The Product interface allows you to treat different items (sandwiches, drinks, chips) as products, 
    even though they have different characteristics and 
    pricing strategies. By using the 
    same method signature, calculatePrice(), across all product classes.
    This in turn keeps the pricing logic encapsulated withing each product class
    avoiding complex dependencies and making the codebase easier to extend(add in new products)
## Diagram 