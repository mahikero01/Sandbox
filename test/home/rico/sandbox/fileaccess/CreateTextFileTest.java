package home.rico.sandbox.fileaccess;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreateTextFileTest {

	@Test
	public void test() {
		CreateTextFile.openFile();
		CreateTextFile.addRecords();
		CreateTextFile.closeFile();
	}

}
