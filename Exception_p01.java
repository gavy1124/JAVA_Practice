package JAVA_Practice;

import java.io.File;

public class Exception_p01 {

	public static void main(String[] args) {
		try {
			File f = createFile("");
			System.out.print(f.getName() + "파일이 성공적으로 생성되었습니다.");
		}catch(Exception e) {
			System.out.print(e.getMessage() + "다시 입력해 주시기 바랍니다.");
			 
		}
	}

	
	
	
	static File createFile(String fileName) throws Exception {
		if (fileName == null || fileName.equals(""))
			throw new Exception("파일이름이 유효하지 않습니다.");
		File f = new File(fileName);
		return f;
	}
	
}
