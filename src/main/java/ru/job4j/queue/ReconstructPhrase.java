package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;
    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        int size = evenElements.size();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            stringBuilder.append(evenElements.peek());
            evenElements.poll();
            evenElements.poll();
            i++;
        }
        return String.valueOf(stringBuilder);
    }

    private String getDescendingElements() {
        int size = descendingElements.size();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            stringBuilder.append(descendingElements.peekLast());
            descendingElements.pollLast();
        }
        return String.valueOf(stringBuilder);
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}