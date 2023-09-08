package p241t0;

import gy3.C87412m;
import hy3.C108274e;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: t0.c0 */
public final class C110841c0 implements Map.Entry<Object, Object>, C108274e.C108275a {

    /* renamed from: d */
    public final Object f331598d;

    /* renamed from: e */
    public Object f331599e;

    /* renamed from: f */
    public final /* synthetic */ C110844d0<Object, Object> f331600f;

    public C110841c0(C110844d0<Object, Object> d0Var) {
        this.f331600f = d0Var;
        Map.Entry<? extends K, ? extends V> entry = d0Var.f331608g;
        C87412m.m108591d(entry);
        this.f331598d = entry.getKey();
        Map.Entry<? extends K, ? extends V> entry2 = d0Var.f331608g;
        C87412m.m108591d(entry2);
        this.f331599e = entry2.getValue();
    }

    public Object getKey() {
        return this.f331598d;
    }

    public Object getValue() {
        return this.f331599e;
    }

    public Object setValue(Object obj) {
        C110844d0<Object, Object> d0Var = this.f331600f;
        if (d0Var.f331605d.mo162570a().f331670d == d0Var.f331607f) {
            Object obj2 = this.f331599e;
            d0Var.f331605d.put(this.f331598d, obj);
            this.f331599e = obj;
            return obj2;
        }
        throw new ConcurrentModificationException();
    }
}
