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

Este projeto demonstra a criação de uma hierarquia de classes em Java para representar diferentes raças de cachorros. Ele inclui a classe base `Cachorro` e duas subclasses específicas: `Rottweiler` e `Pitbull`. Cada classe possui atributos, métodos para manipular esses atributos, e métodos para realizar ações como comer e exibir informações.

---

## ⚙️ Features

- Criação da classe base `Cachorro` com atributos e métodos essenciais.
- Subclasses `Rottweiler` e `Pitbull` que herdam da classe `Cachorro`.
- Método `comer` que ajusta o peso do cachorro com base na quantidade de ração consumida.
- Método `imprimirDados` para exibir informações detalhadas dos cachorros.

---

## 🎨 Layout

Não se aplica.

---

## 🚀 How to run the project

1. Clone o repositório:
    ```sh
    git clone <URL_DO_REPOSITORIO>
    ```

2. Navegue até o diretório do projeto:
    ```sh
    cd <DIRETORIO_DO_PROJETO>
    ```

3. Compile os arquivos Java:
    ```sh
    javac Canil.java Rottweiler.java Pitbull.java Cachorro.java
    ```

4. Execute a aplicação:
    ```sh
    java  src/canil.java 
    ```

Exemplo de código em `Canil.java`:

```java
public class Canil {
    public static void main(String[] args) {
        // Criando um Rottweiler
        Rottweiler rottweiler = new Rottweiler(4, "Preto e Marrom", 30.0);
        rottweiler.imprimirDados();
        rottweiler.comer(1000); // Comendo 1kg de ração
        rottweiler.imprimirDados();

        // Criando um Pitbull
        Pitbull pitbull = new Pitbull(4, "Branco", 25.0);
        pitbull.imprimirDados();
        pitbull.comer(500); // Comendo 500g de ração
        pitbull.imprimirDados();
    }
}
```

---

## 🛠 Technologies

As seguintes ferramentas foram usadas na construção do projeto:

- **Java**

---

## Contribution ✨

Help the community make this project even more amazing. Read how to contribute by clicking **[here](https://github.com/oVitorio/.github/blob/main/CONTRIBUTING.md)**. I am convinced that together we will achieve incredible things!

---

## 📝 License

This project is under the license [MIT License](./LICENSE).

---

## 👨‍💻 Contributors

💜 A big thanks 👏 to these folks who brought this project from the realm of ideas to execution!

<table>
  <tr>
    <td align="center"><a href="https://github.com/oVitorio-ac"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/88901960?v=4" width="100px;" alt=""/><br /><sub><b>Vitório Cavaleiro</b></sub></a><br /><a href="https://github.com/oVitorio-ac" title="github-oVitorio-ac">👨‍🚀</a></td>
     <td align="center"><a href="https://github.com/murilocorf"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/102771200?v=4" width="100px;" alt=""/><br /><sub><b>Murilo Cornachioni</b></sub></a><br /><a href="https://github.com/murilocorf" title="github-murilocorf">👨‍🚀</a></td>
  </tr>
</table>
