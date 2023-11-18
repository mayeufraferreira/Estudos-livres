import java.io.File;

public class Main {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.openFile("C:\\Users\\mayka\\IdeaProjects\\Observer\\src\\arquivo.txt");
        System.out.println(textEditor.removeLine("teste"));
        textEditor.saveFile(new File("C:\\Users\\mayka\\IdeaProjects\\Observer\\src\\arquivo.txt"));
    }

}