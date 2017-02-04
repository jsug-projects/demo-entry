package jsug.flaky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class ScheduleConfig {

//    @Autowired
//    private EntryService entryService;
//
//    @Scheduled(fixedDelay = 10000)
//    public void poll() {
//        entryService.fix();
//    }
}
