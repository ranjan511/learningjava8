
* Functions/Methods as first class citizens, function to variable, then pass varibale as method param
    Function<String,String> addSomeString = (name) -> name.toUpperCase().concat("default")
* Imperative vs Declarative style of Programming ( java )
  * Imperative  :- 
    * Focuses on how to perform the operations
    * Embraces Object mutability
    * We write the code on what needs to be done on each step.
    * used with classic Object Oriented Programming
  * Declarative
    * Focuses on what is the result you want
    * Embraces Object immutability
    * Analogous to Sql
    * Use the functions that are already part of the library to achieve an objective

* Functional Interface
*  Lambda :- Function without name / Anonymous function
*  Not tied to any class like regular method
*  Can also be assigned to variable and passed around as variable
* (Input) -> {Lambda body }
*  used to implement Functional Interfaces
*  SAM Single Abstract method Interfaces
* Functonal Interfaces :- Runnable, Comparator
* Boilerplate  code reduced using lambda 
  