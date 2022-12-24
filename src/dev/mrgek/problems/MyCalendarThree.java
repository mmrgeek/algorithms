package dev.mrgek.problems;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MyCalendarThree {

    record TimeSlot(int start, int end) {
    }

    private final List<TimeSlot> slots = new ArrayList<>();

    public int book(int start, int end) {

        final var slot = new TimeSlot(start, end);

        final var events = new AtomicInteger(1);

        slots.forEach(currentSlot -> {
            if ((slot.start >= currentSlot.start && slot.start <= currentSlot.end) || (slot.end >= currentSlot.start && slot.end <= currentSlot.end))
                events.getAndIncrement();
        });

        slots.add(slot);

        return events.get();
    }
}
