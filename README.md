### ✅ **SOLID Principles Summary Table**

| Principle | Full Form | Definition | Goal | When to Use | Real-world Example |
|-----------|-----------|------------|------|--------------|---------------------|
| **S** | **Single Responsibility Principle** | A class should have only one reason to change. | Improves cohesion and maintainability. | When your class is doing multiple things (e.g., logic + I/O). | Split `Invoice` class into `InvoiceCalculator` and `InvoicePrinter`. |
| **O** | **Open/Closed Principle** | Software entities should be open for extension, but closed for modification. | Enable adding new functionality without changing existing code. | When adding new types/behaviors (like new payment methods). | Adding a `PayPalPayment` class without changing existing `Payment` logic. |
| **L** | **Liskov Substitution Principle** | Subtypes must be substitutable for their base types without altering correctness. | Avoid runtime surprises from derived classes. | When using inheritance or interfaces. | Substituting `Penguin` for `Bird` shouldn’t break behavior. |
| **I** | **Interface Segregation Principle** | No client should be forced to depend on methods it does not use. | Encourage smaller, role-specific interfaces. | When a class implements an interface but doesn’t need all methods. | Separate `Printer` and `Scanner` interfaces instead of `IMachine`. |
| **D** | **Dependency Inversion Principle** | High-level modules should not depend on low-level modules. Both should depend on abstractions. | Decouple components and promote flexibility. | When high-level logic depends directly on implementations. | Use `NotificationService` interface for `EmailNotification` and `SMSNotification`. |
