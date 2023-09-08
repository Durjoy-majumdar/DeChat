package p1192e9;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: e9.h */
public final class C116710h implements ComponentContainer {

    /* renamed from: a */
    public final Set<Class<?>> f350030a;

    /* renamed from: b */
    public final Set<Class<?>> f350031b;

    /* renamed from: c */
    public final ComponentContainer f350032c;

    public C116710h(Iterable<Dependency> iterable, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (Dependency next : iterable) {
            if (next.f339213c == 0) {
                hashSet.add(next.f339211a);
            } else {
                hashSet2.add(next.f339211a);
            }
        }
        this.f350030a = Collections.unmodifiableSet(hashSet);
        this.f350031b = Collections.unmodifiableSet(hashSet2);
        this.f350032c = componentContainer;
    }

    public final <T> T get(Class<T> cls) {
        if (this.f350030a.contains(cls)) {
            return this.f350032c.get(cls);
        }
        throw new IllegalArgumentException(String.format("Requesting %s is not allowed.", new Object[]{cls}));
    }

    public final <T> Provider<T> getProvider(Class<T> cls) {
        if (this.f350031b.contains(cls)) {
            return this.f350032c.getProvider(cls);
        }
        throw new IllegalArgumentException(String.format("Requesting Provider<%s> is not allowed.", new Object[]{cls}));
    }
}
