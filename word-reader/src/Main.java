import java.util.Iterator;


public class Main {

    private static final String FILE_PATH = "resources/lorem_ipsum.txt";


    public static void main(String[] args) {

        WordRead wordReader = new WordRead(FILE_PATH);

        for (String word: wordReader) {
            System.out.println(word);
        }

        Iterator<String> iterator = wordReader.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
