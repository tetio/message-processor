package net.portic.message.processor.application.stages.prepare;

import lombok.extern.slf4j.Slf4j;
import net.portic.message.processor.core.stages.Stage;
import net.portic.message.processor.core.stages.prepare.Preparer;
import org.springframework.stereotype.Service;

@Service(MSG33Preparer.BEAN_ID)
@Slf4j
public class MSG33Preparer extends Stage implements Preparer {
    public static final String BEAN_ID = "MSG33Preparer";

    @Override
    public void prepare() {
        log.info("Preparing processing for MSG33");
    }
}
