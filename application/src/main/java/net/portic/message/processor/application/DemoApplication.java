package net.portic.message.processor.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.portic.message.processor.application.stages.prepare.MSG01Preparer;
import net.portic.message.processor.application.stages.prepare.MSG12Preparer;
import net.portic.message.processor.application.stages.prepare.MSG33Preparer;
import net.portic.message.processor.core.stages.prepare.PreparersFactory;

@Slf4j
@ComponentScan(basePackages = {
		"net.portic.message.processor.core.*", 
		"net.portic.message.processor.application.*"
})
@RequiredArgsConstructor
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Value("${preparer_for_msg12}")
	private String preparer4Msg12;

	@Value("${preparer_for_msg15}")
	private String preparer4Msg15;

	private final PreparersFactory preparerStageFactory;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		log.info("Hello spring boot");
		preparerStageFactory.getPreparerStage(MSG01Preparer.BEAN_ID).prepare();
		preparerStageFactory.getPreparerStage(MSG12Preparer.BEAN_ID).prepare();
		preparerStageFactory.getPreparerStage(MSG33Preparer.BEAN_ID).prepare();

		// from config file
		log.info("INI - From config file");
		preparerStageFactory.getPreparerStage(preparer4Msg12).prepare();
		preparerStageFactory.getPreparerStage(preparer4Msg15).prepare();
		log.info("END - From config file");

	}
}
