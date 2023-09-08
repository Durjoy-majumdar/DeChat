package mu3;

import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import mu3.C117560b;

/* renamed from: mu3.a */
public final class C109639a {

    /* renamed from: c */
    public static final ThreadLocal<C109639a> f328233c = new ThreadLocal<>();

    /* renamed from: d */
    public static C109639a f328234d = null;

    /* renamed from: e */
    public static final ConcurrentHashMap<String, C109639a> f328235e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public static final AtomicLong f328236f = new AtomicLong(0);

    /* renamed from: a */
    public final String f328237a;

    /* renamed from: b */
    public final C117573d f328238b = new C117573d(new C117560b(new C109640a(this)));

    /* renamed from: mu3.a$a */
    public class C109640a implements C117560b.C109641a {
        public C109640a(C109639a aVar) {
        }
    }

    public C109639a(String str) {
        this.f328237a = str;
        f328235e.put(str, this);
    }

    /* renamed from: a */
    public static C109639a m148950a(String str) {
        return new C109639a(str + "@" + f328236f.getAndIncrement());
    }

    /* renamed from: b */
    public static C109639a m148951b() {
        if (f328234d == null) {
            String c = m148952c(Looper.getMainLooper());
            C109639a aVar = f328235e.get(c);
            if (aVar == null) {
                aVar = new C109639a(c);
            }
            f328234d = aVar;
        }
        return f328234d;
    }

    /* renamed from: c */
    public static String m148952c(Looper looper) {
        if (looper == null) {
            return null;
        }
        Thread thread = looper.getThread();
        return thread.getName() + "@" + thread.getId();
    }

    /* renamed from: d */
    public static C109639a m148953d() {
        return Looper.getMainLooper() == Looper.myLooper() ? m148951b() : f328233c.get();
    }

    /* renamed from: e */
    public static String m148954e() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return m148951b().f328237a;
        }
        C109639a aVar = f328233c.get();
        if (aVar == null) {
            return null;
        }
        return aVar.f328237a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C109639a) {
            return ((C109639a) obj).f328237a.equals(this.f328237a);
        }
        return false;
    }

    public int hashCode() {
        return this.f328237a.hashCode();
    }

    public String toString() {
        return "[" + this.f328237a + "]";
    }
}
