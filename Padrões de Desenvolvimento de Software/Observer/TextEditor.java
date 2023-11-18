import java.io.*;

public class TextEditor extends Editor {

    public Editor events;
    public File file;

    public TextEditor() {
        this.events = new Editor("open", "save");
    }

    public String insertLine(String text) {
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            bw.newLine();
            bw.close();
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public String removeLine(String lineRemove) {

        try {
            File tempFile = new File(file.getAbsolutePath() + ".temporario");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line = null;
            while ((line = br.readLine()) != null) {
                if (!line.trim().equals(lineRemove)) {
                    pw.println(line);
                    pw.flush();
                }
            }
            pw.close();
            pw.flush();
            if (!tempFile.renameTo(file)) {
                return "Linha deletada: " + lineRemove + "\n";
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public String openFile(String filePath) {
        this.file = new File(filePath);
        events.notifyObservers("open", file);
        return "Arquivo aberto\n";
    }

    public String saveFile(File file) {
        events.notifyObservers("save", file);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                String line = br.readLine();
                System.out.println(line);
            }

            br.close();
            fr.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return "\nArquivo salvo\n";
    }
}
