package com.tencent.mars.xlog;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

public class LogLengthFilter {
    private static final double RATIO = 0.3d;
    private final int capacity;
    private final AtomicLong filteredCount;
    private final HashMap<Integer, LengthCounter> lengthCounter;
    private final Queue<LengthCounter> lengthQueue;
    private final int threshold;

    public class LengthCounter {
        public int count;
        public int length;

        public LengthCounter(int i, int i2) {
            this.length = i;
            this.count = i2;
        }
    }

    public LogLengthFilter() {
        this(100);
    }

    public synchronized boolean add(int i) {
        boolean z;
        LengthCounter lengthCounter2 = this.lengthCounter.get(Integer.valueOf(i));
        z = false;
        if (lengthCounter2 == null) {
            lengthCounter2 = new LengthCounter(i, 0);
            this.lengthCounter.put(Integer.valueOf(i), lengthCounter2);
        }
        lengthCounter2.count++;
        if (this.lengthQueue.size() == this.capacity) {
            this.lengthQueue.remove().count--;
        }
        this.lengthQueue.add(lengthCounter2);
        if (this.lengthQueue.size() == this.capacity && lengthCounter2.count >= this.threshold) {
            z = true;
        }
        if (z) {
            this.filteredCount.incrementAndGet();
        }
        return z;
    }

    public long getAndSet(long j) {
        return this.filteredCount.getAndSet(j);
    }

    public LogLengthFilter(int i) {
        this.filteredCount = new AtomicLong(0);
        this.lengthQueue = new ArrayDeque();
        this.lengthCounter = new HashMap<>();
        this.capacity = i;
        this.threshold = (int) (((double) i) * RATIO);
    }
}
