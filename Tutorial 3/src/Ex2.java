import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import exer.chap03.TextIOPlus;

public class Ex2 {
    public static void main (String[] args){
        String progText= TextIOPlus.readTextFileContent(Ex2.class,"Hello.j");
        CompilationUnit codeUnit = JavaParser.parse(progText);
        System.out.println(codeUnit);
    }
}

