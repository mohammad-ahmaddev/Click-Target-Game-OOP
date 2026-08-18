# Click Target Game (OOP Edition)

A 2D target-clicking game built in Java using the Processing library, refactored to demonstrate Object-Oriented Programming (OOP) design patterns.

## Features

* **Encapsulated `Mole` Target:** Encapsulates target attributes—such as screen positioning, hit-box boundaries, dynamic movement, and rendering—into a standalone class.
* **Separation of Concerns:** `Sketch.java` manages input listeners and the rendering loop, while `Mole.java` handles target state logic.
* **Modular Code Structure:** Simplifies adding new target types, modifying game parameters, or instantiating multiple targets.

## How to Run

1. Clone or download this repository.
2. Open the project in your Java IDE (IntelliJ IDEA, Eclipse, or VS Code).
3. Ensure the **Processing core library** (`core.jar`) is added to your project dependencies/classpath.
4. Run `Main.java`.

## Requirements

* Java JDK 8 or higher
* Processing 3/4 `core.jar` library
