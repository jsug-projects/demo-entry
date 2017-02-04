package jsug.flaky;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class EntryService {

    @Scheduled(fixedDelay = 10000)
    public void fix() {
        System.out.println("fix");
    }
}
