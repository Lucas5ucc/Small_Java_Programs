package org.academiadecodigo.bootcamp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueWords implements Iterable<String> {

    private Set<String> words = new HashSet<String>();

    public UniqueWords(String s) {

        for (String word : s.split(" ")) {
            words.add(word);
        }
    }
    @Override
    public Iterator<String> iterator() {
        return words.iterator();
    }

}
