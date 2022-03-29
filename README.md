**Gymkhana Management System-**

**Models:**

1. President.java` `(class)
1. VicePresident.java` `(class)
1. GSec.java` `(class)
1. Society.java` `(class)
1. Secretary.java` `(class)
1. SocietyMember.java` `(class)
1. Student.java` `(class)
1. Event.java` `(class)

**Controllers:**

1. PresidentController.java` `(interface)
1. VicePresidentController.java` `(interface)
1. GSecController.java` `(abstract class)
1. SocietyController.java` `(abstract class)
1. StudentController.java` `(abstract class)

**Student:**

` `**Parent Class:** _None_

**Model Attributes:**

- _String_ name
- _String_ rollNumber
- _String_ phone
- _String_ email

**Controller Methods:**

- _void_ addStudent(Scanner) : Creates a new student.
- _Student_ getStudent(Scanner) : Fetch a student object based on roll number.

**SocietyMember:**

` `**Parent Class:** _Student_

**Model Attributes:**

- _String_ societyName

**Event:**

` `**Parent Class:** _None_

**Model Attributes:**

- _String_ date
- _String name_
- _ArrayList<String>_ tasks
- _int_ budget

**Society:**

` `**Parent Class:** _None_

**Model Attributes:**

- _String_ name
- _Secretary_ secretary
- _HashMap<String //RollNo, SocietyMember> societyMembers_
- _ArrayList<Event>_ events

**Controller Methods:**

- _void_ inductStudent(Scanner) : Adds a student into society.
- _void_ holdPolls(Scanner) : Holds elections for secretary.
- _Society_ getSociety(Scanner) : Select a society from the list of societies.

**Secretary:**

` `**Parent Class:** _SocietyMember_

**GSec:**

**Parent Class:** _Student_

**Model Attributes:**

- _String_ counselName //Tech or Cult or Sports
- _ArrayList<Society>_ counselSocieties //List of societies under GSec

**Controller Methods:**

- _void_ proposeBudget(Scanner) : Propose budget to be approved to the President.
- _void_ holdPolls(int) : Hold GSec Elections.

**VicePresident:**

**Parent Class:** _Student_

**Controller Methods:**

- _void_ discussEvent(Scanner) : Assign an event to a Society.
- _void_ holdPolls(int) : Hold VP Elections.

**President:**

**Model Attributes:**

- _String_ name
- _String_ phone
- _String_ email

**Controller Methods:**

- _void_ sanctionFund(Scanner) : Pass scanner as input to identify the event for which fund is being sanctioned.
- _boolean_ approveBudget(int) : Pass in the budget as integer in the input.

**Class Diagrams:**

![](public/Aspose.Words.e0235046-954e-43f0-a6a3-02ce1941d1d6.001.png)

Inheritance flow
