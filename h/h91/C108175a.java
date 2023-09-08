package h91;

import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* renamed from: h91.a */
public final class C108175a {

    /* renamed from: a */
    public static final C108176a f323906a = new C108176a((C8480h) null);

    /* renamed from: h91.a$a */
    public static final class C108176a {
        public C108176a(C8480h hVar) {
        }

        /* renamed from: a */
        public final ArrayList<Class<?>> mo158583a(Class<?> cls) {
            if (cls == null) {
                return null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            mo158584b(cls, linkedHashSet);
            return new ArrayList<>(linkedHashSet);
        }

        /* renamed from: b */
        public final void mo158584b(Class<?> cls, HashSet<Class<?>> hashSet) {
            Class<? super Object> cls2;
            while (cls2 != null) {
                Class[] interfaces = cls2.getInterfaces();
                C87412m.m108593f(interfaces, "interfaces");
                for (Class cls3 : interfaces) {
                    if (hashSet.add(cls3)) {
                        mo158584b(cls3, hashSet);
                    }
                }
                Class<? super Object> superclass = cls2.getSuperclass();
                cls2 = cls;
                cls2 = superclass;
            }
        }
    }
}
