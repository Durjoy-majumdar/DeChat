package p172io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.flutter.embedding.android.MotionEventTracker */
public final class MotionEventTracker {
    private static MotionEventTracker INSTANCE;
    private final LongSparseArray<MotionEvent> eventById = new LongSparseArray<>();
    private final PriorityQueue<Long> unusedEvents = new PriorityQueue<>();

    /* renamed from: io.flutter.embedding.android.MotionEventTracker$MotionEventId */
    public static class MotionEventId {
        private static final AtomicLong ID_COUNTER = new AtomicLong(0);
        /* access modifiers changed from: private */

        /* renamed from: id */
        public final long f324797id;

        private MotionEventId(long j) {
            this.f324797id = j;
        }

        public static MotionEventId createUnique() {
            return from(ID_COUNTER.incrementAndGet());
        }

        public static MotionEventId from(long j) {
            return new MotionEventId(j);
        }

        public long getId() {
            return this.f324797id;
        }
    }

    private MotionEventTracker() {
    }

    public static MotionEventTracker getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MotionEventTracker();
        }
        return INSTANCE;
    }

    public MotionEvent pop(MotionEventId motionEventId) {
        while (!this.unusedEvents.isEmpty() && this.unusedEvents.peek().longValue() < motionEventId.f324797id) {
            this.eventById.remove(this.unusedEvents.poll().longValue());
        }
        if (!this.unusedEvents.isEmpty() && this.unusedEvents.peek().longValue() == motionEventId.f324797id) {
            this.unusedEvents.poll();
        }
        MotionEvent motionEvent = this.eventById.get(motionEventId.f324797id);
        this.eventById.remove(motionEventId.f324797id);
        return motionEvent;
    }

    public MotionEventId track(MotionEvent motionEvent) {
        MotionEventId createUnique = MotionEventId.createUnique();
        this.eventById.put(createUnique.f324797id, MotionEvent.obtain(motionEvent));
        this.unusedEvents.add(Long.valueOf(createUnique.f324797id));
        return createUnique;
    }
}
