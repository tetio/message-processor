package net.portic.message.processor.core.stages.prepare;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class PreparersFactory {
    private final Map<String, Preparer> preparersMap;

    public Preparer getPreparerStage(String preparerType) {
        return preparersMap.get(preparerType);
    }
}
