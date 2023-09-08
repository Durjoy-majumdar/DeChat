package p1192e9;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.inject.Provider;

/* renamed from: e9.g */
public final /* synthetic */ class C116709g implements Provider {

    /* renamed from: a */
    public final ComponentFactory f350028a;

    /* renamed from: b */
    public final ComponentContainer f350029b;

    public C116709g(ComponentFactory componentFactory, ComponentContainer componentContainer) {
        this.f350028a = componentFactory;
        this.f350029b = componentContainer;
    }

    public final Object get() {
        return this.f350028a.create(this.f350029b);
    }
}
