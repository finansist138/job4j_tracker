package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

class JobTest {

    @Test
    public void whenJobAscByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Programmer", 2),
                new Job("Cleaner", 9),
                new Job("Driver", 5));
       jobs.sort(new JobAscByName());
       List<Job> expected = Arrays.asList(
               new Job("Cleaner", 9),
               new Job("Driver", 5),
               new Job("Programmer", 2));
       assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenJobAscByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Programmer", 2),
                new Job("Cleaner", 9),
                new Job("Driver", 5));
        jobs.sort(new JobAscByPriority());
        List<Job> expected = Arrays.asList(
                new Job("Programmer", 2),
                new Job("Driver", 5),
                new Job("Cleaner", 9));
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenJobDescByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Programmer", 2),
                new Job("Cleaner", 9),
                new Job("Driver", 5));
        jobs.sort(new JobDescByName());
        List<Job> expected = Arrays.asList(
                new Job("Programmer", 2),
                new Job("Driver", 5),
                new Job("Cleaner", 9));
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenJobDescByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Programmer", 2),
                new Job("Cleaner", 9),
                new Job("Driver", 5));
        jobs.sort(new JobDescByPriority());
        List<Job> expected = Arrays.asList(
                new Job("Cleaner", 9),
                new Job("Driver", 5),
                new Job("Programmer", 2));
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompatorByPriorityAndName() {
        Comparator<Job> comparator = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = comparator.compare(
                new Job("Programmer", 2),
                new Job("Cleaner", 9));
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenCompatorAscByPriorityAndDescByName() {
        Comparator<Job> comparator = new JobAscByPriority().thenComparing(new JobDescByName());
        int rsl = comparator.compare(
                new Job("Programmer", 2),
                new Job("Cleaner", 9));
        assertThat(rsl).isLessThan(0);
    }
}