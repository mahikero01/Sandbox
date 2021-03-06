package home.rico.sandbox.fileaccess;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {
	
	public FileAndDirectoryInfo() {
		System.out.println("Enter file or directory name\n");
	}
	
	public void checkPath() throws IOException{
		Scanner input = new Scanner(System.in); 
		Path path = Paths.get(input.nextLine());
		
		if( Files.exists(path) ){
			System.out.printf("%s exists%n", path.getFileName());
			System.out.printf("%s a directory%n", Files.isDirectory(path) ? "is" : "is not");
			System.out.printf("%s an absolute path%n", path.isAbsolute() ? "is" : "is not");
			System.out.printf("Last Modified: %s%n", Files.getLastModifiedTime(path));
			System.out.printf("Size: %s%n", Files.size(path));
			System.out.printf("Path: %s%n", path);
			System.out.printf("Absolute Path: %s%n", path.toAbsolutePath());
		
		
			if (Files.isDirectory(path)) {
				System.out.printf("%nDirectory Contents%n");
				
				DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
				
				for (Path p : directoryStream) {
					System.out.println(p);
				}
			}
			
		} else {
			System.out.printf("%s Does not exist%n", path);
		}
	}
	
}
