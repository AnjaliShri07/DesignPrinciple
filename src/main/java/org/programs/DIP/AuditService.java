package org.programs.DIP;

//Dependency Inversion Principle (DIP)
//Depend on abstractions, not concrete classes
public class AuditService {
    private final Logger logger;

    public AuditService(Logger logger) {
        this.logger = logger;
    }

    public void record(String message) {
        logger.log(message);
    }
}
/*✅ Why? Swap out FileLogger with DatabaseLogger without changing AuditService.*/