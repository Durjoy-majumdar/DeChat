package p1192e9;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.inject.Provider;

/* renamed from: e9.f */
public final class C116708f<T> implements Provider<T> {

    /* renamed from: c */
    public static final Object f350025c = new Object();

    /* renamed from: a */
    public volatile Object f350026a = f350025c;

    /* renamed from: b */
    public volatile Provider<T> f350027b;

    public C116708f(ComponentFactory<T> componentFactory, ComponentContainer componentContainer) {
        this.f350027b = new C116709g(componentFactory, componentContainer);
    }

    public final T get() {
        T t = this.f350026a;
        T t2 = f350025c;
        if (t == t2) {
            synchronized (this) {
                t = this.f350026a;
                if (t == t2) {
                    t = this.f350027b.get();
                    this.f350026a = t;
                    this.f350027b = null;
                }
            }
        }
        return t;
    }
}
