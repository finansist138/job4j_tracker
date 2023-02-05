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
        StringBuilder stringBuilder = new StringBuilder();
        while (evenElements.size() != 0) {
            stringBuilder.append(evenElements.poll());
            evenElements.poll();
        }
        return String.valueOf(stringBuilder);
    }

    private String getDescendingElements() {
        StringBuilder stringBuilder = new StringBuilder();
        while (descendingElements.size() != 0) {
            stringBuilder.append(descendingElements.pollLast());
        }
        return String.valueOf(stringBuilder);
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}