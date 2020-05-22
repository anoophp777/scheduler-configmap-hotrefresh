package com.example.configmap;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.scope.refresh.RefreshScopeRefreshedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;

@SpringBootApplication(scanBasePackages = "com.example.configmap")
@EnableScheduling
public class ConfigmapApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigmapApplication.class, args);
	}

}

interface RefreshScheduler {
	/**
	 * Used after refresh context for scheduler bean initialization
	 */
	default void materializeAfterRefresh() {
	}
}

