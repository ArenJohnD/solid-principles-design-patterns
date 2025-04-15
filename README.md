# Lab-Assignment-6-SOLID-Principles-with-Design-Pattern

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the **Student** object has methods like **borrowBook()**, **borrowJournal()** with a parameter of title, which directly depend on specific resource types.

To adhere to the **Dependency Inversion Principle (DIP)** and ensure flexibility for future changes (such as introducing audiobooks or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other SOLID principles.

Make sure you have a TestProgram that will validate the proposed refactored code.


### UML Class Diagram:
![UML Class Diagram](https://github.com/user-attachments/assets/a37af527-e86e-4fc4-bba2-cbbf1d07bf26)
