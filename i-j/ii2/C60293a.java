package ii2;

import java.util.HashSet;
import java.util.Set;
import sx3.C64187h0;

/* renamed from: ii2.a */
public abstract class C60293a implements C60295c {
    /* renamed from: a */
    public Set<Class<?>> mo85283a() {
        Set<Class<?>> b = mo80776b();
        HashSet hashSet = new HashSet(mo85284c());
        for (Class constructors : b) {
            Object newInstance = constructors.getConstructors()[0].newInstance(new Object[0]);
            if (newInstance instanceof C60295c) {
                hashSet.addAll(((C60295c) newInstance).mo85283a());
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public Set<Class<?>> mo80776b() {
        return C64187h0.f181908d;
    }

    /* renamed from: c */
    public Set<Class<?>> mo85284c() {
        return C64187h0.f181908d;
    }
}
