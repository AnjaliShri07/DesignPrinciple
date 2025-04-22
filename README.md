Principle | Real Example | Benefit | Java 17 Feature
SRP | Separate Order & Notification classes | Separation of responsibilities | record, class
OCP | Add new Payment types | No change in base logic | sealed interface
LSP | Email/SMS interchangeable | Safe polymorphism | sealed
ISP | Viewer doesn’t edit | No bloated interfaces | Split interfaces
DIP | Logger abstraction | Loose coupling | Interfaces + constructor injection
