package com.tencent.maas.instamovie;

import com.tencent.maas.profiling.PFS12;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MJTaskTrace {
    public static final int TASK_TRAIT_NETWORK = 0;
    private final Map<Long, Entry> entryMap = new HashMap();
    private final String name;

    public class Entry {
        private final double duration;
        private final boolean hasSubTask;

        /* renamed from: id */
        private final long f339542id;
        private final boolean isComplete;
        private final String name;
        private final BitSet traits;

        public Entry(long j, String str, double d, long j2, boolean z, boolean z2) {
            this.f339542id = j;
            this.name = str;
            this.duration = d;
            BitSet bitSet = new BitSet();
            this.traits = bitSet;
            if ((j2 & 0) != 0) {
                bitSet.set(0);
            }
            this.isComplete = z;
            this.hasSubTask = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.f339542id == entry.f339542id && this.duration == entry.duration && this.isComplete == entry.isComplete && this.hasSubTask == entry.hasSubTask;
        }

        public double getDuration() {
            return this.duration;
        }

        public long getId() {
            return this.f339542id;
        }

        public String getName() {
            return this.name;
        }

        public BitSet getTraits() {
            return this.traits;
        }

        public boolean hasSubTask() {
            return this.hasSubTask;
        }

        public int hashCode() {
            long j = this.f339542id;
            return (int) (j ^ (j >>> 32));
        }

        public boolean isComplete() {
            return this.isComplete;
        }

        public String toString() {
            return "Entry{id=" + this.f339542id + ", name='" + this.name + '\'' + ", duration=" + this.duration + ", traits=" + this.traits + ", isComplete=" + this.isComplete + ", hasSubTask=" + this.hasSubTask + '}';
        }
    }

    public MJTaskTrace(double d, ByteBuffer byteBuffer) {
        PFS12.TimeTrace parseFrom = PFS12.TimeTrace.parseFrom(byteBuffer);
        this.name = parseFrom.getTraceName();
        for (PFS12.TaskTimeTrace next : parseFrom.getTaskTimeTraceList()) {
            boolean z = !Double.isNaN(next.getDuration());
            Entry entry = new Entry((long) next.getTaskId(), next.getTaskName(), z ? next.getDuration() : d - next.getStartTime(), next.getTaskTraits(), z, next.getSubTaskIdCount() > 0);
            this.entryMap.put(Long.valueOf(entry.getId()), entry);
        }
    }

    public String getName() {
        return this.name;
    }

    public List<Entry> getRunningLeafEntries() {
        ArrayList arrayList = new ArrayList();
        for (Entry next : this.entryMap.values()) {
            if (!next.isComplete() && !next.hasSubTask()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
