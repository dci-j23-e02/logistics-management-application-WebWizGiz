### Assignment: Implementing Factory Method Pattern in a Logistics Management Application

#### Background
You are tasked with enhancing a logistics management application to support multiple types of transportation, starting with trucks and expanding to include sea transportation. The initial version of your application is tightly coupled to the `Truck` class, making it difficult to introduce new transportation methods without significant code changes. Your goal is to refactor the application using the Factory Method pattern to easily incorporate different types of transportation, such as trucks and ships, with minimal changes to the existing codebase.

#### Objectives
1. Refactor the application to use the Factory Method pattern, allowing for easy addition of new transportation types.
2. Implement a common interface for all transportation types to ensure consistency and enable polymorphic behavior.
3. Demonstrate how the application can create different transportation types without being coupled to concrete classes.

#### Requirements
- **Transport Interface**: This interface declares a method called `deliver`, which is common to all objects that can be produced by the creator and its subclasses.
- **Concrete Products**: Implement `Truck` and `Ship` classes as different implementations of the `Transport` interface. Each class should implement the `deliver` method according to its transportation method (land for trucks, sea for ships).
- **Creator Class**: Create an abstract `Logistics` class that declares the factory method `createTransport`. This method should return an object that implements the `Transport` interface.
- **Concrete Creators**: Implement `RoadLogistics` and `SeaLogistics` classes that extend the `Logistics` class. Override the `createTransport` method to return an instance of `Truck` or `Ship`, respectively.
- **Client Code**: Write a client code that uses the `Logistics` class to create and use transportation objects without being aware of the concrete classes.

#### Assignment Tasks

1. **Define the Transport Interface**:
```java
public interface Transport {
    void deliver();
}
```

2. **Implement Concrete Products**:
```java
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by land in a box.");
    }
}

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by sea in a container.");
    }
}
```

3. **Declare the Creator Class**:
```java
public abstract class Logistics {
    public abstract Transport createTransport();
}
```

4. **Implement Concrete Creators**:
```java
public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
```

5. **Demonstrate Client Code**:
```java
public class LogisticsClient {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        Transport transport = logistics.createTransport();
        transport.deliver();

        logistics = new SeaLogistics();
        transport = logistics.createTransport();
        transport.deliver();
    }
}
```

#### Deliverables
- **Transport.java**: The Transport interface file.
- **Truck.java** and **Ship.java**: The Concrete Product class files.
- **Logistics.java**: The Creator abstract class file.
- **RoadLogistics.java** and **SeaLogistics.java**: The Concrete Creator class files.
- **LogisticsClient.java**: The client code demonstrating the use of the Factory Method pattern.

This assignment will help you understand how to apply the Factory Method pattern to decouple object creation from its usage, allowing for flexibility and scalability in applications that may need to support various types of products or services.
