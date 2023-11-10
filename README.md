# Barber Shop Management System

## Introduction

The Barber Shop Management System is a Java-based application designed to streamline and manage the booking process in a barbershop. It offers a comprehensive solution for customers to book appointments with various barbers, select different haircut services, and effectively manage their reservations.
This system not only provides a user-friendly interface for customers but also assists barbers in organizing their schedules and services efficiently. Through the utilization of various design patterns and a well-structured architecture, it aims to simplify the process of scheduling appointments and managing barber services.

## Project Overview
The Barber Shop Management System presents an innovative solution tailored to streamline and revolutionize the traditional booking process prevalent in barbershops. The core idea behind this Java-based application is to create an efficient and user-friendly platform that facilitates seamless appointments between customers and barbers. By allowing customers to effortlessly book appointments with a diverse range of skilled barbers and choose from an array of haircut services, the system enhances the overall experience. This system aims to simplify and automate the scheduling process, fostering a more organized workflow for barbers while providing customers with a convenient and hassle-free booking experience.

The primary objective of the project is to offer a comprehensive management tool that caters to the diverse needs of both customers and barbers. It strives to optimize the operational aspects of barbershops by centralizing and digitizing the booking process, thus enhancing efficiency and customer satisfaction. By implementing various design patterns such as Strategy, Factory Method, Decorator, Observer, Adapter, and Singleton, the system aims to establish a well-structured and adaptable framework, ensuring a smooth and dynamic experience for both customers and barbers.

## Project Structure

The Barber Shop Management System boasts a comprehensive and organized structure, employing various design patterns across different directories:

- `main.java`: This primary directory houses the core Java code and acts as the main entry point for the application.
- `strategy`: Embracing the Strategy pattern, this directory includes classes defining different barber categories, such as `JuniorBarber`, `StylistBarber`, and `ProBarber`.
- `factory`: Leveraging the Factory Method pattern, it contains classes responsible for creating different haircut services like `ClassicHaircutFactory`, `FadeHaircutFactory`, `KidsHaircutFactory`, and `ShaveFactory`.
- `decorator`: Implements the Decorator pattern, offering dynamic responsibilities to the haircut services. It encompasses classes such as `ClassicHaircut`, `FadeHaircut`, and others.
- `observer`: Houses the Observer pattern, comprising the `BookingObserver` interface and implementations like `BookingObserverImpl`. This facilitates real-time observation of booking events.
- `adapter`: Integrates the Adapter pattern, providing classes like `TimeAdapter` that enable the system to adapt and process time formats efficiently.
- `singleton`: Encompasses the Singleton pattern, ensuring a single instance for classes like `BookingObserverImpl`, allowing centralized booking event observation.

Each directory serves a unique purpose, adhering to specific design patterns, ensuring a well-organized and maintainable codebase that caters to various functionalities within the application.


## Design Patterns
This project utilizes several design patterns:

### Features and Design Patterns:

1. **Appointment Booking:**
   - **Description:** Allows customers to book appointments with different barbers and select various haircut services.
   - **Design Pattern:** Utilizes the Factory Method pattern to create diverse haircut services (Classic, Fade, Kids, Shave).

2. **Barber Categorization:**
   - **Description:** Categorizes barbers as Junior, Stylist, or Pro, each with varying levels of experience and expertise.
   - **Design Pattern:** Implements the Strategy pattern to define distinct behaviors for different barber categories.

3. **Service Customization:**
   - **Description:** Offers the flexibility to add additional features to haircut services dynamically.
   - **Design Pattern:** Utilizes the Decorator pattern, allowing the addition of new responsibilities to existing services.

4. **Real-time Booking Updates:**
   - **Description:** Notifies users about new bookings or updates in real-time.
   - **Design Pattern:** Leverages the Observer pattern to observe booking events and notify relevant parties instantly.

5. **Time Adaptation:**
   - **Description:** Handles time formats effectively for streamlined processing.
   - **Design Pattern:** Incorporates the Adapter pattern to adapt and process time formats efficiently within the system.

6. **Singleton Instance:**
   - **Description:** Ensures only a single instance exists for specific classes within the system.
   - **Design Pattern:** Utilizes the Singleton pattern for centralized observation of booking events, ensuring a single instance for classes like `BookingObserverImpl`.

### Overall Design Patterns:

The amalgamation of the six design patterns orchestrates a well-structured and adaptable framework within the system:
- **Factory Method** caters to the creation of diverse haircut services, ensuring extensibility and flexibility in service creation.
- **Strategy** delineates different behaviors for varied barber categories, promoting scalability and easy management.
- **Decorator** enables dynamic addition of features to services, promoting modularity and customization.
- **Observer** allows real-time updates for booking events, fostering a responsive and interactive system.
- **Adapter** ensures effective handling of time formats, enhancing system adaptability and seamless processing.
- **Singleton** guarantees a single instance for specific classes, providing centralized and controlled observation for booking events.

## UML Diagram

![AITU](https://github.com/diaslmb/SDP_Final/assets/55086787/36b3d37f-c3e6-4c0c-805e-37acabe33582)


## Conclusion

The Barber Shop Management System stands as an innovative platform that revolutionizes the traditional booking process in barbershops. By integrating a range of design patterns such as Factory Method, Strategy, Decorator, Observer, Adapter, and Singleton, the system successfully provides a seamless experience for both customers and barbers. It allows customers to effortlessly book appointments with various barbers and choose from a variety of services, optimizing the operational aspects of the shop.

### Challenges Faced:

During the project development, several challenges emerged, notably in integrating the Adapter pattern to ensure efficient time format handling. Overcoming this involved detailed analysis of time processing requirements and adapting the system to handle diverse time formats seamlessly. Another significant challenge was designing a robust Observer pattern implementation for real-time booking updates. This required meticulous planning and implementation to ensure effective real-time notifications.

### Future Improvements:

In the future, the system can be further enhanced by implementing a user interface to facilitate a more interactive and user-friendly experience for customers. Additionally, introducing a database integration to store and manage booking records would provide more extensive functionalities for both customers and barbers. Further improvements could involve enhancing the adaptability of the Adapter pattern to handle a broader range of time formats effectively. Also, extending the functionalities for barbers to manage their schedules and services more efficiently would be beneficial.

These improvements aim to refine the system's usability, scalability, and robustness, ensuring a more comprehensive and convenient experience for customers and an optimized management tool for barbers.

## How to Use
To run the project, clone the repository and compile the Java files. Ensure you have a Java development environment set up.

## Testing
Testing details and steps will be added in future updates.

## License
This project is licensed under the MIT License.

## Author
- Dias Ilyas
- Contact: dakesi03@gmail.com

## Acknowledgments
Special thanks to the contributors and the open-source community for their guidance and support.
