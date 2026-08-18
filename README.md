# Click Target Game (OOP Edition)

A 2D target-clicking game built in Java using the Processing library, refactored to demonstrate Object-Oriented Programming (OOP) design patterns.

## Features

* **Encapsulated `Mole` Target:** Encapsulates target attributes—such as screen positioning, hit-box boundaries, dynamic movement, and rendering—into a standalone class.
* **Separation of Concerns:** `Sketch.java` manages input listeners and the rendering loop, while `Mole.java` handles target state logic.
* **Modular Code Structure:** Simplifies adding new target types, modifying game parameters, or instantiating multiple targets.

## Project Structure

| File | Function / Role |
| :--- | :--- |
| **`Main.java`** | Entry point to launch the Processing application |
| **`Sketch.java`** | Main canvas loop, mouse input listeners, and game state manager |
| **`Mole.java`** | Target class defining object state, hit detection, and rendering methods |

## How to Run

1. Clone the repository:
   ```bash
   git clone [https://github.com/mohammad-ahmaddev/Click-Target-Game-OOP.git](https://github.com/mohammad-ahmaddev/Click-Target-Game-OOP.git)
