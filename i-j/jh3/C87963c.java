package jh3;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kj2.C117407d;
import zt3.C119157j;

/* renamed from: jh3.c */
public class C87963c {

    /* renamed from: a */
    public static final AtomicBoolean f254550a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final ConcurrentHashMap<Long, AtomicLong> f254551b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final Runnable f254552c = new C87964a();

    /* renamed from: jh3.c$a */
    public class C87964a implements Runnable {
        public void run() {
            for (Map.Entry next : C87963c.f254551b.entrySet()) {
                long andSet = ((AtomicLong) next.getValue()).getAndSet(0);
                if (andSet > 0) {
                    C117407d.INSTANCE.idkeyStat(963, ((Long) next.getKey()).longValue(), andSet, false);
                }
            }
            C87963c.f254550a.set(false);
        }
    }

    /* renamed from: a */
    public static void m109462a(long j, long j2, boolean z) {
        if (z) {
            C117407d.INSTANCE.idkeyStat(963, j, j2, true);
            return;
        }
        ConcurrentHashMap<Long, AtomicLong> concurrentHashMap = f254551b;
        AtomicLong atomicLong = concurrentHashMap.get(Long.valueOf(j));
        if (atomicLong == null) {
            concurrentHashMap.putIfAbsent(Long.valueOf(j), new AtomicLong(0));
            atomicLong = concurrentHashMap.get(Long.valueOf(j));
        }
        atomicLong.addAndGet(j2);
        if (f254550a.compareAndSet(false, true)) {
            ((C119157j) C119157j.f356862d).mo183878i(f254552c, 1500);
        }
    }
}
