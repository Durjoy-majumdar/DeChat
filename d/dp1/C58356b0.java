package dp1;

import eb0.C31543z5;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: dp1.b0 */
public final class C58356b0 {

    /* renamed from: a */
    public static final C58356b0 f167106a = new C58356b0();

    /* renamed from: b */
    public static final ConcurrentHashMap<Long, C58357a> f167107b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final Set<C58357a> f167108c = Collections.synchronizedSet(new HashSet());

    /* renamed from: dp1.b0$a */
    public static final class C58357a {

        /* renamed from: a */
        public long f167109a;

        /* renamed from: b */
        public long f167110b;

        /* renamed from: c */
        public long f167111c;

        /* renamed from: d */
        public long f167112d;

        /* renamed from: e */
        public long f167113e;

        /* renamed from: f */
        public long f167114f;
    }

    /* renamed from: a */
    public final C58357a mo83108a(long j) {
        ConcurrentHashMap<Long, C58357a> concurrentHashMap = f167107b;
        C58357a aVar = concurrentHashMap.get(Long.valueOf(j));
        if (aVar != null) {
            return aVar;
        }
        C58357a aVar2 = new C58357a();
        concurrentHashMap.put(Long.valueOf(j), aVar2);
        return aVar2;
    }

    /* renamed from: b */
    public final void mo83109b(Long l) {
        if (l != null) {
            l.longValue();
            C58357a a = mo83108a(l.longValue());
            if (!(a.f167111c == 0)) {
                a = null;
            }
            if (a != null) {
                a.f167111c = C31543z5.m39453c();
                return;
            }
            f167107b.remove(l);
            mo83109b(l);
        }
    }

    /* renamed from: c */
    public final void mo83110c(Long l) {
        if (l != null) {
            l.longValue();
            C58357a a = mo83108a(l.longValue());
            if (!(a.f167109a == 0)) {
                a = null;
            }
            if (a != null) {
                a.f167109a = C31543z5.m39453c();
                return;
            }
            f167107b.remove(l);
            mo83110c(l);
        }
    }
}
