package net.portic.message.processor.application.stages.prepare;

import lombok.extern.slf4j.Slf4j;
import net.portic.message.processor.core.stages.Stage;
import net.portic.message.processor.core.stages.prepare.Preparer;

import org.springframework.stereotype.Service;

@Service(MSG01Preparer.BEAN_ID)
@Slf4j
public class MSG01Preparer extends Stage implements Preparer {
    public static final String BEAN_ID = "MSG01Preparer";

    @Override
    public void prepare() {
        log.info("Preparing processing for MSG01");
    }
}
