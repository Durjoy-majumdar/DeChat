package p257w;

import a14.C53930o0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.ResultKt;
import my3.C61595o;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import p257w.C37919o;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: w.b */
public final class C111626b<T, V extends C37919o> {

    /* renamed from: a */
    public final C37906k1<T, V> f334164a;

    /* renamed from: b */
    public final T f334165b;

    /* renamed from: c */
    public final C111647j<T, V> f334166c;

    /* renamed from: d */
    public final C60690y0 f334167d;

    /* renamed from: e */
    public final C60690y0 f334168e;

    /* renamed from: f */
    public final C65921o0 f334169f;

    /* renamed from: g */
    public final C37944w0<T> f334170g;

    /* renamed from: h */
    public final V f334171h;

    /* renamed from: i */
    public final V f334172i;

    /* renamed from: j */
    public V f334173j;

    /* renamed from: k */
    public V f334174k;

    @C91590f(mo125468c = "androidx.compose.animation.core.Animatable$snapTo$2", mo125469f = "Animatable.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: w.b$a */
    public static final class C111627a extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C111626b<T, V> f334175d;

        /* renamed from: e */
        public final /* synthetic */ T f334176e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111627a(C111626b<T, V> bVar, T t, C15601d<? super C111627a> dVar) {
            super(1, dVar);
            this.f334175d = bVar;
            this.f334176e = t;
        }

        public final C15601d<C13598b0> create(C15601d<?> dVar) {
            return new C111627a(this.f334175d, this.f334176e, dVar);
        }

        public Object invoke(Object obj) {
            return ((C111627a) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C111626b<T, V> bVar = this.f334175d;
            C111647j<T, V> jVar = bVar.f334166c;
            jVar.f334236f.mo61404d();
            jVar.f334237g = Long.MIN_VALUE;
            ((C108494d2) bVar.f334167d).setValue(Boolean.FALSE);
            Object a = C111626b.m152136a(this.f334175d, this.f334176e);
            ((C108494d2) this.f334175d.f334166c.f334235e).setValue(a);
            ((C108494d2) this.f334175d.f334168e).setValue(a);
            return C13598b0.f38549a;
        }
    }

    public C111626b(T t, C37906k1<T, V> k1Var, T t2) {
        C87412m.m108594g(k1Var, "typeConverter");
        this.f334164a = k1Var;
        this.f334165b = t2;
        this.f334166c = new C111647j(k1Var, t, (C37919o) null, 0, 0, false, 60, (C8480h) null);
        this.f334167d = C108500f2.m146996c(Boolean.FALSE, (C108497e2) null, 2, (Object) null);
        this.f334168e = C108500f2.m146996c(t, (C108497e2) null, 2, (Object) null);
        this.f334169f = new C65921o0();
        this.f334170g = new C37944w0(0.0f, 0.0f, t2, 3, (C8480h) null);
        V v = (C37919o) k1Var.mo61399a().invoke(t);
        int b = v.mo61402b();
        for (int i = 0; i < b; i++) {
            v.mo61405e(i, Float.NEGATIVE_INFINITY);
        }
        this.f334171h = v;
        V v2 = (C37919o) this.f334164a.mo61399a().invoke(t);
        int b2 = v2.mo61402b();
        for (int i2 = 0; i2 < b2; i2++) {
            v2.mo61405e(i2, Float.POSITIVE_INFINITY);
        }
        this.f334172i = v2;
        this.f334173j = v;
        this.f334174k = v2;
    }

    /* renamed from: a */
    public static final Object m152136a(C111626b bVar, Object obj) {
        if (C87412m.m108589b(bVar.f334173j, bVar.f334171h) && C87412m.m108589b(bVar.f334174k, bVar.f334172i)) {
            return obj;
        }
        C37919o oVar = (C37919o) bVar.f334164a.mo61399a().invoke(obj);
        int b = oVar.mo61402b();
        boolean z = false;
        for (int i = 0; i < b; i++) {
            if (oVar.mo61401a(i) < bVar.f334173j.mo61401a(i) || oVar.mo61401a(i) > bVar.f334174k.mo61401a(i)) {
                oVar.mo61405e(i, C61595o.m72296d(oVar.mo61401a(i), bVar.f334173j.mo61401a(i), bVar.f334174k.mo61401a(i)));
                z = true;
            }
        }
        return z ? bVar.f334164a.mo61400b().invoke(oVar) : obj;
    }

    /* renamed from: b */
    public static Object m152137b(C111626b bVar, Object obj, C37901h hVar, Object obj2, C32226l lVar, C15601d dVar, int i, Object obj3) {
        C111626b bVar2 = bVar;
        C37944w0<T> w0Var = (i & 2) != 0 ? bVar2.f334170g : hVar;
        T invoke = (i & 4) != 0 ? bVar2.f334164a.mo61400b().invoke(bVar2.f334166c.f334236f) : obj2;
        C32226l lVar2 = (i & 8) != 0 ? null : lVar;
        Object c = bVar.mo163295c();
        C37906k1<T, V> k1Var = bVar2.f334164a;
        C87412m.m108594g(w0Var, "animationSpec");
        C87412m.m108594g(k1Var, "typeConverter");
        C37893b1 b1Var = new C37893b1(w0Var, k1Var, c, obj, (C37919o) k1Var.mo61399a().invoke(invoke));
        long j = bVar2.f334166c.f334237g;
        C65921o0 o0Var = bVar2.f334169f;
        C111624a aVar = new C111624a(bVar, invoke, b1Var, j, lVar2, (C15601d<? super C111624a>) null);
        C37917n0 n0Var = C37917n0.Default;
        o0Var.getClass();
        return C53930o0.m60559f(new C65923p0(n0Var, o0Var, aVar, (C15601d<? super C65923p0>) null), dVar);
    }

    /* renamed from: c */
    public final T mo163295c() {
        return this.f334166c.getValue();
    }

    /* renamed from: d */
    public final Object mo163296d(T t, C15601d<? super C13598b0> dVar) {
        C65921o0 o0Var = this.f334169f;
        C111627a aVar = new C111627a(this, t, (C15601d<? super C111627a>) null);
        C37917n0 n0Var = C37917n0.Default;
        o0Var.getClass();
        Object f = C53930o0.m60559f(new C65923p0(n0Var, o0Var, aVar, (C15601d<? super C65923p0>) null), dVar);
        return f == C15911a.COROUTINE_SUSPENDED ? f : C13598b0.f38549a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C111626b(Object obj, C37906k1 k1Var, Object obj2, int i, C8480h hVar) {
        this(obj, k1Var, (i & 4) != 0 ? null : obj2);
    }
}
