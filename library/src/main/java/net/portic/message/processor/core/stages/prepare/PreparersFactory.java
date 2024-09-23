package net.portic.message.processor.core.stages.prepare;

import lombok.RequiredArgsConstructor;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PreparersFactory {
    private final Map<String, Preparer> preparersMap;

    public Preparer getPreparerStage(String preparerType) {
        return preparersMap.get(preparerType);
    }
}
