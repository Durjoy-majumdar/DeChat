package p283z4;

import p1167z8.C112608f;
import p283z4.C119049a;

/* renamed from: z4.c */
public final class C119060c<V> extends C119049a<V> {
    /* renamed from: i */
    public boolean mo183732i(V v) {
        if (v == null) {
            v = C119049a.f356564j;
        }
        if (!C119049a.f356563i.mo183726b(this, (Object) null, v)) {
            return false;
        }
        C119049a.m167811c(this);
        return true;
    }

    /* renamed from: j */
    public boolean mo183733j(Throwable th) {
        th.getClass();
        if (!C119049a.f356563i.mo183726b(this, (Object) null, new C119049a.C119053d(th))) {
            return false;
        }
        C119049a.m167811c(this);
        return true;
    }

    /* renamed from: k */
    public boolean mo183734k(C112608f<? extends V> fVar) {
        C119049a.C119057g gVar;
        C119049a.C119053d dVar;
        fVar.getClass();
        Object obj = this.f356565d;
        if (obj == null) {
            if (fVar.isDone()) {
                if (!C119049a.f356563i.mo183726b(this, (Object) null, C119049a.m167813f(fVar))) {
                    return false;
                }
                C119049a.m167811c(this);
            } else {
                gVar = new C119049a.C119057g(this, fVar);
                if (C119049a.f356563i.mo183726b(this, (Object) null, gVar)) {
                    try {
                        fVar.addListener(gVar, C16099b.INSTANCE);
                    } catch (Throwable unused) {
                        dVar = C119049a.C119053d.f356572b;
                    }
                } else {
                    obj = this.f356565d;
                }
            }
            return true;
        }
        if (!(obj instanceof C119049a.C119052c)) {
            return false;
        }
        fVar.cancel(((C119049a.C119052c) obj).f356570a);
        return false;
        C119049a.f356563i.mo183726b(this, gVar, dVar);
        return true;
    }
}
