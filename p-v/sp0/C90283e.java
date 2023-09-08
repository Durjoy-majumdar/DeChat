package sp0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import tp0.C90567d;

/* renamed from: sp0.e */
public class C90283e {

    /* renamed from: b */
    public static AtomicInteger f259174b = new AtomicInteger(1);

    /* renamed from: a */
    public HashMap<String, C90280d> f259175a = new HashMap<>();

    /* renamed from: sp0.e$b */
    public static class C90285b {

        /* renamed from: a */
        public static C90283e f259176a = new C90283e((C90284a) null);
    }

    public C90283e(C90284a aVar) {
    }

    /* renamed from: a */
    public C90280d mo124502a(String str) {
        if (this.f259175a.containsKey(str)) {
            return this.f259175a.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo124503b(String str) {
        if (!this.f259175a.containsKey(str)) {
            return false;
        }
        C90280d remove = this.f259175a.remove(str);
        synchronized (remove.f259173i) {
            Iterator<C90567d> it = remove.f259173i.iterator();
            while (it.hasNext()) {
                it.next().f260208g = false;
            }
            remove.f259173i.clear();
        }
        return true;
    }
}
