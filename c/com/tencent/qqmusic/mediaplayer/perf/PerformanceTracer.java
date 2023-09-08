package com.tencent.qqmusic.mediaplayer.perf;

import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class PerformanceTracer {
    private IDataSource dataSource;
    private long lastTimeStampNanoSecond = 0;
    private long playStartTimestampNanoSec = 0;
    private final Map<String, SpeedCheck> speedMap = new LinkedHashMap();
    private long totalPcmInByte;
    private long totalTimeCostInNanoSec = 0;

    public static class OverallInfo {
        public final IDataSource dataSource;
        public final long timeCostInMs;
        public final long totalPcmToBePlayed;

        public OverallInfo(IDataSource iDataSource, long j, long j2) {
            this.dataSource = iDataSource;
            this.timeCostInMs = j;
            this.totalPcmToBePlayed = j2;
        }
    }

    public static class SpeedCheck {

        /* renamed from: f */
        private static final double f56929f = 1000000.0d;
        private double avg;
        private double max;
        private double min;
        private final String name;
        private long totalBufferLength;
        private long totalTimeNanoSecond;

        /* access modifiers changed from: private */
        public void compute() {
            this.avg = (((double) this.totalBufferLength) * f56929f) / ((double) this.totalTimeNanoSecond);
        }

        /* access modifiers changed from: private */
        public void update(int i, long j) {
            this.totalBufferLength += (long) i;
            this.totalTimeNanoSecond += j;
            double d = (((double) i) * f56929f) / ((double) j);
            double d2 = this.max;
            if (d > d2 || d2 == 0.0d) {
                this.max = d;
                return;
            }
            double d3 = this.min;
            if (d < d3 || d3 == 0.0d) {
                this.min = d;
            }
        }

        public double getAvg() {
            return this.avg;
        }

        public double getMax() {
            return this.max;
        }

        public double getMin() {
            return this.min;
        }

        public String getName() {
            return this.name;
        }

        public long getTotalBufferLength() {
            return this.totalBufferLength;
        }

        public long getTotalTimeMs() {
            return Math.round(((double) this.totalTimeNanoSecond) / f56929f);
        }

        public void reset() {
            this.avg = 0.0d;
            this.max = 0.0d;
            this.min = 0.0d;
            this.totalTimeNanoSecond = 0;
            this.totalBufferLength = 0;
        }

        public String toString() {
            compute();
            return String.format(Locale.getDefault(), "%10s%15.2f%15.2f%15.2f%10d%15d", new Object[]{this.name, Double.valueOf(this.avg), Double.valueOf(this.max), Double.valueOf(this.min), Long.valueOf(this.totalTimeNanoSecond), Long.valueOf(this.totalBufferLength)});
        }

        private SpeedCheck(String str) {
            this.name = str;
        }
    }

    public interface Visitor {
        void visitSpeedCheck(List<SpeedCheck> list, OverallInfo overallInfo);
    }

    public static class BufferSizeCheck {
        private int lastSize = 0;
        private int maxMismatch = 0;
        private final String name;
        private int sizeMismatchCount = 0;

        public BufferSizeCheck(String str) {
            this.name = str;
        }

        public int getMaxMismatch() {
            return this.maxMismatch;
        }

        public String getName() {
            return this.name;
        }

        public int getSizeMismatchCount() {
            return this.sizeMismatchCount;
        }

        public void onEnd(int i) {
            int i2 = this.lastSize;
            if (i != i2) {
                int i3 = i2 - i;
                if (Math.abs(i3) > this.maxMismatch) {
                    this.maxMismatch = i3;
                }
                this.sizeMismatchCount++;
            }
        }

        public void onStart(int i) {
            this.lastSize = i;
        }
    }

    private SpeedCheck getSpeedCheck(String str) {
        SpeedCheck speedCheck = this.speedMap.get(str);
        if (speedCheck != null) {
            return speedCheck;
        }
        SpeedCheck speedCheck2 = new SpeedCheck(str);
        this.speedMap.put(str, speedCheck2);
        return speedCheck2;
    }

    public void accept(Visitor visitor) {
        ArrayList arrayList = new ArrayList(this.speedMap.values());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((SpeedCheck) it.next()).compute();
        }
        visitor.visitSpeedCheck(arrayList, new OverallInfo(this.dataSource, Math.round(((double) this.totalTimeCostInNanoSec) / 1000000.0d), this.totalPcmInByte));
    }

    public void end(String str, int i) {
        getSpeedCheck(str).update(i, System.nanoTime() - this.lastTimeStampNanoSecond);
    }

    public void init(IDataSource iDataSource) {
        this.dataSource = iDataSource;
        this.lastTimeStampNanoSecond = 0;
        for (SpeedCheck reset : this.speedMap.values()) {
            reset.reset();
        }
    }

    public void playEnd() {
    }

    public void playStart() {
        this.totalPcmInByte = 0;
    }

    public void roundEnd(int i) {
        this.totalPcmInByte += (long) i;
        this.totalTimeCostInNanoSec += System.nanoTime() - this.playStartTimestampNanoSec;
    }

    public void roundStart() {
        this.playStartTimestampNanoSec = System.nanoTime();
    }

    public void start(String str) {
        getSpeedCheck(str);
        this.lastTimeStampNanoSecond = System.nanoTime();
    }
}
