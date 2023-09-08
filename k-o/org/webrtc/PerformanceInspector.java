package org.webrtc;

import android.os.SystemClock;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001d"}, mo182094d2 = {"Lorg/webrtc/PerformanceInspector;", "", "", "resetAll", "Lrx3/b0;", "reset", "", "currentTicks", "notifyAnimationFrameStart", "onBackground", "Lorg/webrtc/PerformanceStatistics;", "performance", "flush", "Ljava/util/concurrent/atomic/AtomicInteger;", "frameCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "lastFrameTick", "J", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "frameTimeRecords", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "lastNFrameTimeTotal", "frameTimeTotal", "jankFrameTimeTotal", "jank", "bigJank", "<init>", "()V", "Companion", "libmmwebrtc_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class PerformanceInspector {
    public static final double BigJankFrameCheckTime = 125.0d;
    public static final Companion Companion = new Companion((C8480h) null);
    public static final int JankCheckFrameCount = 3;
    public static final double JankFrameCheckTime = 83.33333333333333d;
    public static final String TAG = "WebRTC.PerformanceInspector";
    private final AtomicInteger bigJank = new AtomicInteger(0);
    private final AtomicInteger frameCounter = new AtomicInteger(-1);
    private final ConcurrentLinkedQueue<Long> frameTimeRecords = new ConcurrentLinkedQueue<>();
    private long frameTimeTotal;
    private final AtomicInteger jank = new AtomicInteger(0);
    private long jankFrameTimeTotal;
    private long lastFrameTick;
    private long lastNFrameTimeTotal;

    @Metadata(mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo182094d2 = {"Lorg/webrtc/PerformanceInspector$Companion;", "", "()V", "BigJankFrameCheckTime", "", "JankCheckFrameCount", "", "JankFrameCheckTime", "TAG", "", "libmmwebrtc_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    private final long currentTicks() {
        return SystemClock.elapsedRealtime();
    }

    private final void reset(boolean z) {
        this.frameTimeTotal = 0;
        this.jankFrameTimeTotal = 0;
        this.jank.set(0);
        this.bigJank.set(0);
        if (z) {
            this.frameCounter.set(-1);
            this.lastNFrameTimeTotal = 0;
            this.lastFrameTick = 0;
            this.frameTimeRecords.clear();
        }
    }

    public final void flush(PerformanceStatistics performanceStatistics) {
        C87412m.m108594g(performanceStatistics, "performance");
        performanceStatistics.jank = this.jank.get();
        performanceStatistics.bigJank = this.bigJank.get();
        long j = this.frameTimeTotal;
        performanceStatistics.stutter = j > 0 ? ((double) this.jankFrameTimeTotal) / ((double) j) : 0.0d;
        reset(false);
    }

    public final void notifyAnimationFrameStart() {
        long currentTicks = currentTicks();
        if (this.frameCounter.incrementAndGet() == 0) {
            this.lastFrameTick = currentTicks;
            return;
        }
        long j = currentTicks - this.lastFrameTick;
        this.frameTimeTotal += j;
        if (this.frameTimeRecords.size() < 3) {
            this.frameTimeRecords.add(Long.valueOf(j));
            this.lastNFrameTimeTotal += j;
        } else {
            if (((long) 3) * j > ((long) 2) * this.lastNFrameTimeTotal) {
                double d = (double) j;
                if (d > 83.33333333333333d) {
                    this.jank.getAndIncrement();
                    this.jankFrameTimeTotal += j;
                }
                if (d > 125.0d) {
                    this.bigJank.getAndIncrement();
                }
            }
            Long remove = this.frameTimeRecords.remove();
            this.frameTimeRecords.add(Long.valueOf(j));
            long j2 = this.lastNFrameTimeTotal;
            C87412m.m108593f(remove, "front");
            this.lastNFrameTimeTotal = j2 + (j - remove.longValue());
        }
        this.lastFrameTick = currentTicks;
    }

    public final void onBackground() {
        reset(true);
    }
}
