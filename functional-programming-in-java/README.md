Java 8 New Features:
(2014 March 18th)

# Functional Programming 

## Lambda Expression
Nameless, without return type and without modifiers.

### Convert a method/function to Lambda Expression/Function
#### Ex-1
Normal Method
```
    public void m1(){
    System.out.println("Hello");
    }
```
Lambda Function
```
()->System.out.println("Hello");
```

#### Ex-2
Normal Method
```
    public void sum(int a ,int b){
    System.out.println("Sum = "+(a+b));
    }
```
Lambda Function
```
(a,b)->System.out.println("Sum = "+(a+b);
```
#### Ex-3
> Without curly braces we cannot use return keyword. compiler will consider returned value automatically.
> within curly braces if we want to return some value compulsory we should use return statement.


Normal Method
```
    public int square(int a){
        return a*a;
    }
```
Lambda Function
```
     (a)->a*a; or
     a->a*a; or
     a->{return a*a;}
```


    
## Functional Interface
A interface Which contains a single abstract method(SAM) knows as a functional interface.
#### Ex - 

1. Runnable  
2. Comparable
3. CompareTo
4. Callable
5. ActionListener

## Default Methods and static methods
## Predefined Functional Interface

1. Predicate
2. Function
3. Consumer
4. Supplier
5. etc


## Double colon Operator(::)
    1. Method reference
    2. constructor reference

## Streams

## Date and Time API

## Optional Class

## Nashron Javascript Engine