package net.portic.message.processor.core.stages.prepare;

import lombok.extern.slf4j.Slf4j;
import net.portic.message.processor.core.stages.Stage;
import org.springframework.stereotype.Service;

@Service(GenericPreparer.BEAN_ID)
@Slf4j
public class GenericPreparer extends Stage implements Preparer {
    public static final String BEAN_ID = "GenericPreparer";

    @Override
    public void prepare() {
        log.info("Generic preparer");
    }
}
