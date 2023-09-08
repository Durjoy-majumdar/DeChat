package sp0;

import java.util.HashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: sp0.j */
public class C90299j {

    /* renamed from: b */
    public static AtomicInteger f259242b = new AtomicInteger(1);

    /* renamed from: a */
    public HashMap<String, C90291h> f259243a = new HashMap<>();

    /* renamed from: sp0.j$b */
    public static class C90301b {

        /* renamed from: a */
        public static C90299j f259244a = new C90299j((C90300a) null);
    }

    public C90299j(C90300a aVar) {
    }

    /* renamed from: a */
    public C90291h mo124533a(String str) {
        if (this.f259243a.containsKey(str)) {
            return this.f259243a.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo124534b(String str) {
        if (!this.f259243a.containsKey(str)) {
            return false;
        }
        C90291h remove = this.f259243a.remove(str);
        synchronized (remove.f259188a) {
            remove.f259188a.clear();
        }
        ((ConcurrentSkipListSet) remove.f259190c).clear();
        ((ConcurrentSkipListSet) remove.f259189b).clear();
        return true;
    }
}
