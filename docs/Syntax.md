## Syntax

* Datatypes
    * byte, short, int, long, float, double, boolean, char.
* Variable Types
    * Local variables

    Similar to how an object stores its state in fields, a method will often store its temporary state in local variables. The syntax for declaring a local variable is similar to declaring a field (for example, int count = 0;). There is no special keyword designating a variable as local; that determination comes entirely from the location in which the variable is declared — which is between the opening and closing braces of a method. As such, local variables are only visible to the methods in which they are declared; they are not accessible from the rest of the class.
    * Instance variables (Non-Static Fields)

    Instance Variables (Non-Static Fields) Technically speaking, objects store their individual states in "non-static fields", that is, fields declared without the static keyword. Non-static fields are also known as instance variables because their values are unique to each instance of a class (to each object, in other words).
    * Class/static variables

    A class variable is any field declared with the static modifier; this tells the compiler that there is exactly one copy of this variable in existence, regardless of how many times the class has been instantiated.
    * Parameters

    Parameters are always classified as "variables" not "fields". This applies to other parameter-accepting constructs as well (such as constructors and exception handlers) that you'll learn about later in the tutorial.
* Basic Operators
    * Arithmetic Operators: +, -, *, /, %, ++, --
    * Relational Operators: ==, !=, >, <, >=, <=
    * Bitwise Operators: &, |, ^, ~, <<, >>, >>>
    * Logical Operators: &&, ||, !
    * Assignment Operators: =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=
    * Misc Operators
    * Conditional Operator ( ? : )
    * instance of Operator
    * Operator Precedence

    ![OP](https://github.com/kaiyuean/presentation1/blob/master/resources/OperatorPrecedence.png)
* Loop Control
    * while
    * for
    * do...while
* Decision Making
    * if
    * if...else
    * nested(if/else) 
    * switch
* Enum Type: An enum type is a special data type that enables for a variable to be a set of predefined constants. The variable must be equal to one of the values that have been predefined for it. 

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY 
    }
* String
* Array
* Date & Time