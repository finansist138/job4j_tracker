package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ComparatorTest {

    @Test
    public void whenItemAscByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "Petr"),
                new Item(2, "Stanislav"),
                new Item(3, "Artem"));
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(3, "Artem"),
                new Item(1, "Petr"),
                new Item(2, "Stanislav"));
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void whenItemDescByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "Petr"),
                new Item(2, "Stanislav"),
                new Item(3, "Artem"));
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(2, "Stanislav"),
                new Item(1, "Petr"),
                new Item(3, "Artem"));
        assertThat(items).isEqualTo(expected);
    }
}