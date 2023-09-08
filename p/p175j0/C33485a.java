package p175j0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: j0.a */
public abstract class C33485a<T> implements C24665d<T> {

    /* renamed from: a */
    public final T f90677a;

    /* renamed from: b */
    public final List<T> f90678b = new ArrayList();

    /* renamed from: c */
    public T f90679c;

    public C33485a(T t) {
        this.f90677a = t;
        this.f90679c = t;
    }

    /* renamed from: a */
    public T mo51484a() {
        return this.f90679c;
    }

    /* renamed from: b */
    public void mo51485b() {
    }

    public final void clear() {
        ((ArrayList) this.f90678b).clear();
        this.f90679c = this.f90677a;
        mo59167j();
    }

    /* renamed from: d */
    public void mo51488d(T t) {
        ((ArrayList) this.f90678b).add(this.f90679c);
        this.f90679c = t;
    }

    /* renamed from: f */
    public void mo51490f() {
    }

    /* renamed from: i */
    public void mo51493i() {
        if (!this.f90678b.isEmpty()) {
            List<T> list = this.f90678b;
            this.f90679c = ((ArrayList) list).remove(((ArrayList) list).size() - 1);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: j */
    public abstract void mo59167j();
}
