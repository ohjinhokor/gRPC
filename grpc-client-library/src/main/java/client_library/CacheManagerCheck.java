package client_library;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class CacheManagerCheck implements CommandLineRunner {
	private final CacheManager cacheManager;

	@Override
	public void run(String... strings) {
		log.info("\n\n" + "=========================================================\n"
			+ "Using Cache Manager: " + this.cacheManager.getClass().getName() + "\n"
			+ "=========================================================\n\n");
	}
}
