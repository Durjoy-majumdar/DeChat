package com.tencent.tav.report;

public class AverageTimeReporter {
    private long count = 0;
    private long total = 0;

    public void add(long j) {
        this.total += j;
        this.count++;
    }

    public long average() {
        long j = this.count;
        if (j == 0) {
            return 0;
        }
        return this.total / j;
    }

    public double averageDouble() {
        long j = this.count;
        if (j == 0) {
            return 0.0d;
        }
        return ((double) this.total) / ((double) j);
    }

    public long getCount() {
        return this.count;
    }

    public long getTotal() {
        return this.total;
    }

    public void reset() {
        this.total = 0;
        this.count = 0;
    }

    public String toString() {
        return "AverageTimeReporter{total=" + this.total + ", count=" + this.count + ", average=" + averageDouble() + '}';
    }

    public void add(AverageTimeReporter averageTimeReporter) {
        if (averageTimeReporter != null) {
            this.total += averageTimeReporter.getTotal();
            this.count += averageTimeReporter.getCount();
        }
    }
}
