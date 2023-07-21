import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class WordRead implements Iterable<String> {

    private final String filename;

    public WordRead(String filename) {
        this.filename = filename;
    }

    @Override
    public Iterator<String> iterator() {
        return new WordReadIterator();
    }
    private class WordReadIterator implements Iterator<String> {
        private BufferedReader inputBufferedReader;

        private String[] words;
        private String currentLine;
        private int wordsIndex;
        public WordReadIterator() {

            try {
                inputBufferedReader = new BufferedReader(new FileReader(filename));
                currentLine = readsLineOfText();
                words = getLineWord(currentLine);

            } catch (FileNotFoundException e) {

                throw new IllegalArgumentException(e);

            }

        }

        private String readsLineOfText() {

            String line = null;

            try {

                line = inputBufferedReader.readLine();

                if (line == null) {
                    inputBufferedReader.close();
                    return null;
                }

                if (line.equals("") || line.matches("\\W+")) {
                    return readsLineOfText();
                }
            } catch (IOException e) {

                currentLine = null;
            }

            return line;

        }

        private String[] getLineWord(String line) {

            return
                line != null
                    ?
                line.split("\\W+")
                    :
                    new String[0];
        }

        @Override
        public boolean hasNext() {
            // currentLine is null when stream is over
            return currentLine != null;
        }

        @Override
        public String next() {

            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            String result = words[wordsIndex];
            wordsIndex++;

            if (wordsIndex == words.length) {

                currentLine = readsLineOfText();
                words = getLineWord(currentLine);
                wordsIndex = 0;

            }

            return result;

        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

}
