package p1049ul;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import p1005ma.C88718b;

/* renamed from: ul.a */
public final class C90687a {

    /* renamed from: a */
    public static final Set<String> f260503a = new TreeSet();

    /* renamed from: b */
    public static final List<C90689b> f260504b = new ArrayList();

    /* renamed from: c */
    public static final Map<String, ClassLoader> f260505c = new ConcurrentHashMap(64);

    /* renamed from: d */
    public static final C90688a f260506d = new C90688a("load-lib-spin");

    /* renamed from: e */
    public static final Method[] f260507e = {null};

    /* renamed from: f */
    public static final ThreadLocal<Boolean> f260508f = new ThreadLocal<>();

    /* renamed from: g */
    public static final ThreadLocal<Boolean> f260509g = new ThreadLocal<>();

    /* renamed from: ul.a$a */
    public static final class C90688a {
        public C90688a(String str) {
        }

        public synchronized void finalize() {
            super.finalize();
        }
    }

    /* renamed from: ul.a$b */
    public interface C90689b {
        /* renamed from: a */
        boolean mo124824a(String str, UnsatisfiedLinkError unsatisfiedLinkError);

        /* renamed from: b */
        void mo124825b(String str, String str2, ClassLoader classLoader);
    }

    static {
        Pattern.compile("lib([^\\s/]+?)\\.so");
    }

    public C90687a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static void m113697a(String str, String str2, ClassLoader classLoader) {
        List<C90689b> list = f260504b;
        synchronized (list) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((C90689b) it.next()).mo124825b(str, str2, classLoader);
            }
        }
    }

    /* renamed from: b */
    public static void m113698b(int i, String str, String str2, Object... objArr) {
        ThreadLocal<Boolean> threadLocal = f260508f;
        Boolean bool = threadLocal.get();
        if (bool == null || !bool.booleanValue()) {
            threadLocal.set(Boolean.TRUE);
            if (i == 0) {
                C88718b.f256076a.mo123154v(str, str2, objArr);
            } else if (i == 1) {
                C88718b.m110679a(str, str2, objArr);
            } else if (i == 2) {
                C88718b.m110681c(str, str2, objArr);
            } else if (i == 3) {
                C88718b.m110682d(str, str2, objArr);
            } else if (i == 4) {
                C88718b.m110680b(str, str2, objArr);
            }
            threadLocal.set(Boolean.FALSE);
        } else if (objArr == null || objArr.length == 0) {
            Log.println(i, str, str2);
        } else {
            Log.println(i, str, String.format(str2, objArr));
        }
    }
}
