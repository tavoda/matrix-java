package org.matrix.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.matrix.client.model.Event;

import java.io.File;
import java.io.IOException;

/**
 * Created by tavoda on 7/12/17.
 */
public class ParseExamplesTest {
	ObjectMapper mapper = new ObjectMapper();

	@Test
	public void eventLoadTest() throws IOException {
		File resourceDir = new File("src/test/resources/event/");
		Assert.assertTrue(resourceDir.isDirectory());
		resourceDir.listFiles(it -> parseFile(it, Event.class) );
	}

	@Test
	public void apiResultLoadTest() throws IOException {
		File resourceDir = new File("src/test/resources/api-result/");
		Assert.assertTrue(resourceDir.isDirectory());
		resourceDir.listFiles(it -> {
			String[] split = it.getName().split("[-.]");
			String className = "org.matrix.client.model." + split[0];
			try {
				Class clazz = Class.forName(className);
				parseFile(it, clazz);
			} catch (ClassNotFoundException e) {
				System.out.println("Can not parse file " + it + " no suitable result class " + className);
			}
			return false;
		} );
	}

	private boolean parseFile(File file, Class resultClazz) {
		try {
			System.out.println("\n### Parsing file: " + file.getPath());
			Object result = mapper.readValue(file, resultClazz);
			Assert.assertNotNull(result);
			Assert.assertThat(result, CoreMatchers.instanceOf(resultClazz));
			System.out.println(result);
		} catch (IOException e) {
			System.out.println("\n#####################################################\nError parsing file " + file.getPath() + ": " + e.getMessage());
		}
		return false;
	}
}
