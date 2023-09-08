package a14;

import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87413o;
import rx3.C13604l;
import wx3.C15601d;
import wx3.C66210e;
import wx3.C66212f;
import wx3.C66217g;
import yx3.C66705e;

/* renamed from: a14.e0 */
public final class C53876e0 {

    /* renamed from: a14.e0$a */
    public static final class C53877a extends C87413o implements C32227p<C66212f, C66212f.C66215b, C66212f> {

        /* renamed from: d */
        public static final C53877a f151121d = new C53877a();

        public C53877a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C66212f fVar = (C66212f) obj;
            C66212f.C66215b bVar = (C66212f.C66215b) obj2;
            return bVar instanceof C53871d0 ? fVar.plus(((C53871d0) bVar).mo74500l()) : fVar.plus(bVar);
        }
    }

    /* renamed from: a14.e0$b */
    public static final class C53878b extends C87413o implements C32227p<C66212f, C66212f.C66215b, C66212f> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C66212f> f151122d;

        /* renamed from: e */
        public final /* synthetic */ boolean f151123e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53878b(C8479f0<C66212f> f0Var, boolean z) {
            super(2);
            this.f151122d = f0Var;
            this.f151123e = z;
        }

        public Object invoke(Object obj, Object obj2) {
            C66212f fVar = (C66212f) obj;
            C66212f.C66215b bVar = (C66212f.C66215b) obj2;
            if (!(bVar instanceof C53871d0)) {
                return fVar.plus(bVar);
            }
            C66212f.C66215b bVar2 = ((C66212f) this.f151122d.f27484d).get(bVar.getKey());
            if (bVar2 == null) {
                C53871d0 d0Var = (C53871d0) bVar;
                if (this.f151123e) {
                    d0Var = d0Var.mo74500l();
                }
                return fVar.plus(d0Var);
            }
            C8479f0<C66212f> f0Var = this.f151122d;
            f0Var.f27484d = ((C66212f) f0Var.f27484d).minusKey(bVar.getKey());
            return fVar.plus(((C53871d0) bVar).mo74499k(bVar2));
        }
    }

    /* renamed from: a */
    public static final C66212f m60397a(C66212f fVar, C66212f fVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        C53882f0 f0Var = C53882f0.f151128d;
        boolean booleanValue = ((Boolean) fVar.fold(bool, f0Var)).booleanValue();
        boolean booleanValue2 = ((Boolean) fVar2.fold(bool, f0Var)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return fVar.plus(fVar2);
        }
        C8479f0 f0Var2 = new C8479f0();
        f0Var2.f27484d = fVar2;
        C66217g gVar = C66217g.f190253d;
        C66212f fVar3 = (C66212f) fVar.fold(gVar, new C53878b(f0Var2, z));
        if (booleanValue2) {
            f0Var2.f27484d = ((C66212f) f0Var2.f27484d).fold(gVar, C53877a.f151121d);
        }
        return fVar3.plus((C66212f) f0Var2.f27484d);
    }

    /* renamed from: b */
    public static final C66212f m60398b(C0000n0 n0Var, C66212f fVar) {
        C66212f a = m60397a(n0Var.getCoroutineContext(), fVar, true);
        C53896h0 h0Var = C53872d1.f151117a;
        if (a == h0Var) {
            return a;
        }
        int i = C66210e.f190250O0;
        return a.get(C66210e.C66211a.f190251d) == null ? a.plus(h0Var) : a;
    }

    /* renamed from: c */
    public static final C53874d3<?> m60399c(C15601d<?> dVar, C66212f fVar, Object obj) {
        C53874d3<?> d3Var = null;
        if (!(dVar instanceof C66705e)) {
            return null;
        }
        if (!(fVar.get(C53880e3.f151125d) != null)) {
            return null;
        }
        C66705e eVar = (C66705e) dVar;
        while (true) {
            if (!(eVar instanceof C53972z0) && (eVar = eVar.getCallerFrame()) != null) {
                if (eVar instanceof C53874d3) {
                    d3Var = (C53874d3) eVar;
                    break;
                }
            } else {
                break;
            }
        }
        if (d3Var != null) {
            d3Var.f151120g.set(new C13604l(fVar, obj));
        }
        return d3Var;
    }
}
