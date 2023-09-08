package p224ra;

import com.tencent.p014mm.plugin.appbrand.C1523c3;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: ra.e */
public class C89909e {

    /* renamed from: a */
    public static LinkedHashMap<String, C89908c> f258367a = new LinkedHashMap<>();

    /* renamed from: b */
    public static Map<Class<? extends C36266d>, Object> f258368b = new HashMap();

    /* renamed from: ra.e$a */
    public class C89910a implements InvocationHandler {
        public Object invoke(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    static {
        C89907a aVar = new C89907a();
        Log.m105925i("Luggage.Luggage", "plugin:[%s] installed", "luggage-core");
        f258367a.put("luggage-core", aVar);
    }

    /* renamed from: a */
    public static <T extends C12964b> T m112436a(Class<T> cls) {
        if (cls == null) {
            return null;
        }
        ((C1523c3) C86312j.m106911c(C1523c3.class)).waitFor();
        ListIterator listIterator = new ArrayList(f258367a.values()).listIterator(f258367a.size());
        while (listIterator.hasPrevious()) {
            C89908c cVar = (C89908c) listIterator.previous();
            if (cVar != null && cVar.mo124210a() != null && cVar.mo124210a().get(cls) != null) {
                return (C12964b) cVar.mo124210a().get(cls);
            }
        }
        Log.m105929w("Luggage.Luggage", "no customize found for [%s]", cls.getCanonicalName());
        return null;
    }

    /* renamed from: b */
    public static <T extends C36266d> T m112437b(Class<T> cls) {
        if (((HashMap) f258368b).get(cls) != null) {
            return (C36266d) ((HashMap) f258368b).get(cls);
        }
        C89910a aVar = new C89910a();
        T t = (C36266d) Proxy.newProxyInstance(C36266d.class.getClassLoader(), new Class[]{cls}, aVar);
        ((HashMap) f258368b).put(cls, t);
        return t;
    }

    /* renamed from: c */
    public static <T extends C36266d> T m112438c(Class<T> cls) {
        return m112439d(cls, true);
    }

    /* renamed from: d */
    public static <T extends C36266d> T m112439d(Class<T> cls, boolean z) {
        if (cls != null) {
            ListIterator listIterator = new ArrayList(f258367a.values()).listIterator(f258367a.size());
            while (listIterator.hasPrevious()) {
                C89908c cVar = (C89908c) listIterator.previous();
                if (cVar != null && cVar.mo124211b() != null && cVar.mo124211b().get(cls) != null) {
                    return (C36266d) cVar.mo124211b().get(cls);
                }
            }
            Log.m105929w("Luggage.Luggage", "no profiler found for [%s], genDummy[%b]", cls.getCanonicalName(), Boolean.valueOf(z));
            if (z) {
                return m112437b(cls);
            }
            return null;
        } else if (z) {
            return m112437b(cls);
        } else {
            return null;
        }
    }

    /* renamed from: e */
    public static <T extends C12964b> void m112440e(Class<T> cls, T t) {
        if (cls != null && t != null) {
            f258367a.get("luggage-core").mo124210a().put(cls, t);
        }
    }

    /* renamed from: f */
    public static <T extends C36266d> void m112441f(Class<T> cls, T t) {
        if (cls != null && t != null) {
            f258367a.get("luggage-core").mo124211b().put(cls, t);
        }
    }
}
