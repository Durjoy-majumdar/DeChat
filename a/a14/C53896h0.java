package a14;

import f14.C58883h;
import gy3.C8480h;
import gy3.C87412m;
import wx3.C15601d;
import wx3.C66206a;
import wx3.C66207b;
import wx3.C66210e;
import wx3.C66212f;
import wx3.C66217g;

/* renamed from: a14.h0 */
public abstract class C53896h0 extends C66206a implements C66210e {

    /* renamed from: d */
    public static final C53897a f151143d = new C53897a((C8480h) null);

    /* renamed from: a14.h0$a */
    public static final class C53897a extends C66207b<C66210e, C53896h0> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53897a(C8480h hVar) {
            super(C66210e.C66211a.f190251d, C53891g0.f151139d);
            int i = C66210e.f190250O0;
        }
    }

    public C53896h0() {
        super(C66210e.C66211a.f190251d);
    }

    /* renamed from: S */
    public abstract void mo74497S(C66212f fVar, Runnable runnable);

    /* renamed from: c0 */
    public final <T> C15601d<T> mo74563c0(C15601d<? super T> dVar) {
        return new C58883h(this, dVar);
    }

    /* renamed from: f0 */
    public void mo74564f0(C66212f fVar, Runnable runnable) {
        mo74497S(fVar, runnable);
    }

    public <E extends C66212f.C66215b> E get(C66212f.C15602c<E> cVar) {
        C87412m.m108594g(cVar, "key");
        if (cVar instanceof C66207b) {
            C66207b bVar = (C66207b) cVar;
            C66212f.C15602c<?> key = getKey();
            C87412m.m108594g(key, "key");
            if (key == bVar || bVar.f190246e == key) {
                E e = (C66212f.C66215b) bVar.f190245d.invoke(this);
                if (e instanceof C66212f.C66215b) {
                    return e;
                }
            }
        } else if (C66210e.C66211a.f190251d == cVar) {
            return this;
        }
        return null;
    }

    /* renamed from: h0 */
    public boolean mo74565h0(C66212f fVar) {
        return !(this instanceof C53868c3);
    }

    public C66212f minusKey(C66212f.C15602c<?> cVar) {
        C87412m.m108594g(cVar, "key");
        if (cVar instanceof C66207b) {
            C66207b bVar = (C66207b) cVar;
            C66212f.C15602c<?> key = getKey();
            C87412m.m108594g(key, "key");
            if ((key == bVar || bVar.f190246e == key) && ((C66212f.C66215b) bVar.f190245d.invoke(this)) != null) {
                return C66217g.f190253d;
            }
        } else if (C66210e.C66211a.f190251d == cVar) {
            return C66217g.f190253d;
        }
        return this;
    }

    /* renamed from: s */
    public final void mo74566s(C15601d<?> dVar) {
        ((C58883h) dVar).mo84070l();
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + C53942r0.m60572a(this);
    }
}
