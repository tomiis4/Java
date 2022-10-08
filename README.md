# JAVA Cheatsheet

## Variables
### Types
```java
int x = 5;
char x = 'A';
long x = 9999999;
double x = 5.5555;
float x = 3.14;
boolean x = true;
String x  = "ABCDEFG"

int[] x = {1, 2, 3, 4, 5};
```
## Input/Output
### Output
```java
System.out.println("Hello, world");
```
### Input
```java
import java.util.Scanner;

Scanner myInput = new Scanner(System.in);
String inputValue = myObj.nextLine();
```

## Loops
### For loop
```java
for (int i=0; i<5; i++) {}
```
### While loop
```java
while (true) {}
```

## Function/Return/Class
### Class
```java
public class ClassName {}
```
### Function
```java
// Normal
public static void name() {}

// Main
public static void main(String[] args) {}
```
### Return
```java
public static int name() { return 5; }
```

## Another file
### Import file
```java
anotherFileClass x = new anotherFileClass();
String y = x.classFunction();
```
## Logic
### Try/Catch
```java
try {} catch (Exception e) {}
```
### If/Else If/ Else
```java
if (x) {} else if (y) {} else {}
```
### Switch/Case
```java
switch (x) { case "y": break; }
```

## Converting
### String to X
```java
// to the int
Integer.parseInt(x);

// to the float
Float.parseFloat(x);
```
