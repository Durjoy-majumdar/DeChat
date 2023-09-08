package mp3;

import android.os.Looper;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;
import kp3.C88253a;

/* renamed from: mp3.h */
public class C88824h {

    /* renamed from: a */
    public static Map<String, C88819d> f256226a = new ConcurrentHashMap();

    /* renamed from: b */
    public static Map<Thread, C88819d> f256227b = new HashMap();

    /* renamed from: c */
    public static boolean f256228c = false;

    /* renamed from: d */
    public static ThreadLocal<C88819d> f256229d = new ThreadLocal<>();

    static {
        m110910d();
    }

    /* renamed from: a */
    public static C88819d m110907a() {
        C88819d dVar;
        C88819d dVar2 = f256229d.get();
        if (dVar2 != null && ((HashMap) f256227b).size() == 0) {
            return dVar2;
        }
        synchronized (C88824h.class) {
            dVar = (C88819d) ((HashMap) f256227b).remove(Thread.currentThread());
        }
        if (dVar2 != null && dVar == null) {
            return dVar2;
        }
        if (dVar != null) {
            f256229d.set(dVar);
            return dVar;
        }
        if (Looper.myLooper() != null) {
            dVar = new C88825i(Looper.myLooper(), Looper.myLooper().toString());
        } else if (dVar == null) {
            C88253a.m109904c("Vending.SchedulerProvider", "This is not a handler thread! %s", Thread.currentThread());
            return new C88818c();
        }
        f256229d.set(dVar);
        return dVar;
    }

    /* renamed from: b */
    public static void m110908b(String str, C88819d dVar) {
        Class<C88824h> cls = C88824h.class;
        Assert.assertNotNull("Scheduler type is null", str);
        Locale locale = Locale.ENGLISH;
        String upperCase = str.toUpperCase(locale);
        if (f256226a.containsKey(upperCase)) {
            new IllegalStateException("Fatal error! Duplicate scheduler type " + str.toUpperCase(locale));
        }
        f256226a.put(upperCase, dVar);
        if (dVar instanceof C88825i) {
            synchronized (cls) {
                f256227b.put(((C88825i) dVar).mo123216a().getThread(), dVar);
            }
        } else if (dVar instanceof C88826j) {
            synchronized (cls) {
                Map<Thread, C88819d> map = f256227b;
                ((C88826j) dVar).getClass();
                map.put((Object) null, dVar);
            }
        }
    }

    /* renamed from: c */
    public static C88819d m110909c(String str) {
        Assert.assertNotNull("Scheduler type is null", str);
        Map<String, C88819d> map = f256226a;
        Locale locale = Locale.ENGLISH;
        C88819d dVar = (C88819d) ((ConcurrentHashMap) map).get(str.toUpperCase(locale));
        Assert.assertNotNull("Scheduler type not found: " + str.toUpperCase(locale), dVar);
        return dVar;
    }

    /* renamed from: d */
    public static synchronized void m110910d() {
        synchronized (C88824h.class) {
            if (!f256228c) {
                C88253a.m109903b("Vending.SchedulerProvider", "SchedulerProvider provided.", new Object[0]);
                f256228c = true;
                m110908b("Vending.UI", C88819d.f256219UI);
                m110908b("Vending.LOGIC", C88819d.LOGIC);
                m110908b("Vending.HEAVY_WORK", C88819d.HEAVY_WORK);
            }
        }
    }
}
