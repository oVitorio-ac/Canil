<p align="center">
<a href="#-about-the-project">About</a> •
<a href="#-features">Features</a> •
<a href="#-layout">Layout</a> •
<a href="#-how-to-run-the-project">How to Run</a> •
<a href="#-technologies">Technologies</a> •
<a href="#-how-to-contribute-to-the-project">Contribute</a> •
<a href="#user-content--license">License</a> •
<a href="#-contributors">Contributors</a>
</p>

## 💻 About the project

This project demonstrates the creation of a class hierarchy in Java to represent different dog breeds. It includes the base class `Dog` and two specific subclasses: `Rottweiler` and `Pitbull`. Each class has attributes, methods to manipulate these attributes, and methods to perform actions such as eating and displaying information.

---
## ⚙️ Features

- Creation of the base class `Dog` with essential attributes and methods.
- Subclasses `Rottweiler` and `Pitbull` that inherit from the `Dog` class.
- Method `eat` that adjusts the dog's weight based on the amount of food consumed.
- Method `printData` to display detailed information about the dogs.

---
## 🎨 Layout

Not applicable.

---

## 🚀 How to run the project

1. Clone the repository:
```sh
git clone <REPOSITORY_URL>
```

2. Navigate to the project directory:
```sh
cd <PROJECT_DIRECTORY>
```

3. Compile the Java files:
```sh
javac Canil.java Rottweiler.java Pitbull.java Dog.java
```

4. Run the application:
```sh
java src/canil.java
```

Example code in `Canil.java`:

```java
public class Canil {
public static void main(String[] args) {
// Creating a Rottweiler
Rottweiler rottweiler = new Rottweiler(4, "Black and Brown", 30.0);
rottweiler.printData();
rottweiler.comer(1000); // Eating 1kg of dog food
rottweiler.printData();
// Creating a Pitbull
Pitbull pitbull = new Pitbull(4, "White", 25.0);
pitbull.printData();
pitbull.comer(500); // Eating 500g of dog food
pitbull.printData();
}
}
```

---

## 🛠 Technologies

The following tools were used to build the project:

- **IDEA using for developing is the e Apache Netbeans**
- **Java Ant**

---

## Contribution ✨

Help the community make this project even more amazing. Read how to contribute by clicking **[here](https://github.com/oVitorio/.github/blob/main/CONTRIBUTING.md)**. I am convinced that together we will achieve incredible things!

--- ## 📝 License This project is under the license [MIT License](./LICENSE).

--- ## 👨‍💻 Contributors 💜 A big thanks 👏 to these folks who brought this project from the realm of ideas to execution!

<table> <tr> <td align="center"><a href="https://github.com/oVitorio-ac"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/88901960?v=4" width="100px;" alt=""/><br /><sub><b>Vitório Cavaleiro</b></sub></a><br /><a href="https://github.com/oVitorio-ac" title="github-oVitorio-ac">👨‍🚀</a></td> <td align="center"><a href="https://github.com/murilocorf"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/102771200?v=4" width="100px;" alt=""/><br /><sub><b>Murilo Cornachioni</b></sub></a><br /><a href="https://github.com/murilocorf" title="github-murilocorf">👨‍🚀</a></td> </tr> </table>
