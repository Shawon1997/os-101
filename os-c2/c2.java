N.B- At first all code i did in my vs code and copy from them. But between the line code there is a huge gap sorry for that plase look into it🙏🙏

Q1 a) What do you know about client server architecture?
The functionality of client-server architecture is in various tiers. Below are the types where different layers operate in accordance with their type.
     Single Tier Architecture 
A single-tier architecture is an architecture in which the entire application resides on the user's machine. Before networking became so easy and cheap, this was fre- quently the design of choice.
Like if I run my HTML page run in server then only one html page will be shown this is Single Tier Architecture
2nd Tier Architecture
The 2-tier Architecture is based on a client-server machine. In this type of architecture, the applications on client-side interact directly with the database present at the server-side. This interaction between client and server uses Application Program Interface like ODBC and JDBC

3rd/n Tier Architecture  
Three-tier architecture is a well-established software application architecture that organizes applications into three logical or n logical and physical computing tiers: the presentation tier, or user interface; the application tier, where data is processed; and the data tier, where the data associated with the application is stored and managed.
 b)What is the difference between DNS and IP address? 
 • IP and DNS are both naming systems for addressing namespaces allocated for entities in a Network.

 •  While the Ip addresses are the actual locations where the entities are located, DNS only gives the entity a Name, based on some standard rules. For exmple , DNS is similar to aq Name of place , and IP addresses to the physical location of the place. When a user types a Domain Name, the DNS translate the domain name into an IP address and locates the host physically.

 •  Also the DNS assigns an alphanumerical name to an entity that is easily remember by the users, and hte IPassigns a numerical value to the network entity.




Q2. What is CAP theorem, discuss a scenario where CAP theorem helps you choose a technology over the other or helps you make a design decision. 
The CAP theorem is a belief from theoretical computer science about distributed data stores that claims, in the event of a network failure on a distributed database, it is possible to provide either consistency or availability—but not both.

Consistency:
A system is said to be consistent if all nodes see the same data at the same time.

Availability:
Availability in a distributed system ensures that the system remains operational 100% of the time.

Partition Tolerance:
This condition states that the system does not fail, regardless of whether messages are dropped or delayed between nodes in a system.

B. NoSQL databases are great for distributed networks. They allow for horizontal scaling, and they can quickly scale across multiple nodes. When deciding which NoSQL database to use, it’s important to keep the CAP theorem in mind.


Q3 What are SOLID principles? Explain with examples wherever possible.
In solid principle it has 5 differents thing in it’s own 5 word like..

 Single-responsibility principle
 Open-closed principle
 Liskov substitution principle 
 Interface segregation principle 
 Dependency inversion principle
 
 Single-responsibility principle:A class should only have a single responsibility, that is, only changes to one part of the software’s specification 12. SOLID Principles 2 should be able to affect the specification of the class.
public class TextPrinter {
    TextManipulator textManipulator;
    public TextPrinter(TextManipulator textManipulator) {
        this.textManipulator = textManipulator;
    }
    public void printText() {
        System.out.println(textManipulator.getText());
    }
    public void printOutEachWordOfText() {
        System.out.println(Arrays.toString(textManipulator.getText().split(" ")));
    }
    public void printRangeOfCharacters(int startingIndex, int endIndex) {
        System.out.println(textManipulator.getText().substring(startingIndex, endIndex));
    }
}
 
 Open-closed principle:Software entities ... should be open for extension, but closed for modification.
Open Close Principle:
class rectangle
{
public length;
public function __construct(length)
{
length = length;
}
public function area()
{
return pow(length*length);
}
}
class AreaCalculator
{
public function sum()
{
foreach (shapes as shape) {
area[] = shape->area();
}
return array_sum(area);
}
}
 
 
 
 
 
 
Liskov substitution principle :
This principle suggests that “parent classes should be easily substituted with their child classes without blowing up the application”. Let’s take following example to understand this
public class Animal {
   public void makeNoise() {
       System.out.println("I am making noise");
   }
}
public class Dog extends Animal {
   @Override
   public void makeNoise() {
       System.out.println("bow wow");
   }
}
 
public class Cat extends Animal {
   @Override
   public void makeNoise() {
       System.out.println("meow meow");
   }
}
class DumbDog extends Animal {
   @Override
   public void makeNoise() {
       throw new RuntimeException("I can't make noise");
   }
}
 Interface segregation principle:This principle suggests that “many client specific interfaces are better than one general interface”. This is the first principle which is applied on interface, all the above three principles applies on classes. Let’s take following example to understand this principle.

public interface MyOnClickListener {
   void onClick(View v);
   boolean onLongClick(View v);
}
Dependency inversion principle:
This principle suggest that “classes should depend on abstraction but not on concretion”. What does it mean that we should be having object of interface which helps us to communicate with the concrete classes. What do we gain from this is, we hide the actual implementation of class A from the class B. So if class A changes the class B doesn’t need to care or know about the changes.

 Q4 In the following diagram (it intentionally contains pseudo code) There is an interface DataManager with two functions. The three classes implement this interface and provide implementation to the read and write methods. The write method throws an exception in the InMemoryRealmManager class because it doesn’t need the write() method

A. Which of the design principles: solid principles or clean code pattern is being violated in this scenario.
 B. Rectify/fix it with the best practices and also demonstrate the corresponding pseudo code.

 It violate the solid principles
 
Definition of solid principles-
 
Because here in every time declare the new class and modify something that not a good work.
We can modify it with the help of interface like
Create inharitance class of database 
And declare the method like read() and write()

And then create interface class to implements it as you need thats it.

