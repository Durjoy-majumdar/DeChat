package wc3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

/* renamed from: wc3.h0 */
public class C53143h0 {

    /* renamed from: a */
    public long f148278a = System.currentTimeMillis();

    /* renamed from: b */
    public ConcurrentLinkedDeque<C53144a> f148279b = new ConcurrentLinkedDeque<>();

    /* renamed from: c */
    public HashMap<String, C53144a> f148280c = new HashMap<>();

    /* renamed from: wc3.h0$a */
    public class C53144a {

        /* renamed from: a */
        public String f148281a;

        /* renamed from: b */
        public long f148282b;

        /* renamed from: c */
        public String f148283c;

        public C53144a(C53143h0 h0Var, String str, long j, String str2) {
            this.f148281a = str;
            this.f148282b = j;
            this.f148283c = str2;
        }
    }

    /* renamed from: a */
    public void mo73829a(String str, long j) {
        this.f148279b.add(new C53144a(this, str, j, ""));
        if (str.equals("onPageStarted") || str.equals("onPageFinished") || str.equals("getA8KeyStart") || str.equals("getA8KeyEnd") || str.equals("firstScreenTimestamp") || str.equals("firstScreenTime")) {
            if (this.f148280c.get(str) == null) {
                this.f148280c.put(str, new C53144a(this, str, j, ""));
            }
            this.f148280c.get(str).f148282b = j;
        }
    }

    /* renamed from: b */
    public long mo73830b(String str, long j) {
        ConcurrentLinkedDeque<C53144a> concurrentLinkedDeque = this.f148279b;
        if (concurrentLinkedDeque != null && !concurrentLinkedDeque.isEmpty()) {
            Iterator<C53144a> it = this.f148279b.iterator();
            while (it.hasNext()) {
                C53144a next = it.next();
                if (next.f148281a.equals(str)) {
                    return next.f148282b;
                }
            }
        }
        return j;
    }
}
