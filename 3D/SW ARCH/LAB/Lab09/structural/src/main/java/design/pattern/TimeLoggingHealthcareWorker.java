package design.pattern;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator{

    public TimeLoggingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.println("Decorate "+ worker.getName() +" with TimeLogging");
    }

    @Override
    public void service(){
        LocalDateTime myDateObj = LocalDateTime.now();  
        System.out.print(
            myDateObj.format(DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss", Locale.ENGLISH))
            + " ICT " + 
            myDateObj.format(DateTimeFormatter.ofPattern("yyyy"))
            + " "
            );
        super.service();
    }

}
