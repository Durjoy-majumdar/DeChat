package p004b0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import p175j0.C108494d2;
import p257w.C111626b;
import p257w.C111654m;
import p257w.C37892b0;
import p257w.C37901h;
import p257w.C37944w0;
import p560i2.C33177j;
import p560i2.C33179k;
import rx3.C13598b0;
import sx3.C36903g0;
import sx3.C64175a0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: b0.m */
public final class C103956m {

    /* renamed from: a */
    public final C0000n0 f307435a;

    /* renamed from: b */
    public final boolean f307436b;

    /* renamed from: c */
    public final Map<Object, C103935c> f307437c = new LinkedHashMap();

    /* renamed from: d */
    public Map<Object, Integer> f307438d = C36903g0.f97931d;

    /* renamed from: e */
    public int f307439e = -1;

    /* renamed from: f */
    public int f307440f;

    /* renamed from: g */
    public int f307441g = -1;

    /* renamed from: h */
    public int f307442h;

    /* renamed from: i */
    public final Set<Object> f307443i = new LinkedHashSet();

    @C91590f(mo125468c = "androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1", mo125469f = "LazyListItemPlacementAnimator.kt", mo125470l = {357}, mo125471m = "invokeSuspend")
    /* renamed from: b0.m$a */
    public static final class C103957a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f307444d;

        /* renamed from: e */
        public final /* synthetic */ C103930a1 f307445e;

        /* renamed from: f */
        public final /* synthetic */ C37892b0<C33177j> f307446f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103957a(C103930a1 a1Var, C37892b0<C33177j> b0Var, C15601d<? super C103957a> dVar) {
            super(2, dVar);
            this.f307445e = a1Var;
            this.f307446f = b0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C103957a(this.f307445e, this.f307446f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C103957a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C37901h hVar;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f307444d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (((Boolean) ((C108494d2) this.f307445e.f307318b.f334167d).getValue()).booleanValue()) {
                    C37892b0<C33177j> b0Var = this.f307446f;
                    hVar = b0Var instanceof C37944w0 ? (C37944w0) b0Var : C103959n.f307450a;
                } else {
                    hVar = this.f307446f;
                }
                C37901h hVar2 = hVar;
                C103930a1 a1Var = this.f307445e;
                C111626b<C33177j, C111654m> bVar = a1Var.f307318b;
                C33177j jVar = new C33177j(a1Var.f307319c);
                this.f307444d = 1;
                if (C111626b.m152137b(bVar, jVar, hVar2, (Object) null, (C32226l) null, this, 12, (Object) null) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException unused) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ((C108494d2) this.f307445e.f307320d).setValue(Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    public C103956m(C0000n0 n0Var, boolean z) {
        C87412m.m108594g(n0Var, "scope");
        this.f307435a = n0Var;
        this.f307436b = z;
    }

    /* renamed from: a */
    public final int mo145577a(int i, int i2, int i3, long j, boolean z, int i4, int i5) {
        boolean z2 = false;
        int i6 = this.f307441g;
        boolean z3 = z ? i6 > i : i6 < i;
        int i7 = this.f307439e;
        if (z ? i7 < i : i7 > i) {
            z2 = true;
        }
        int i8 = -1;
        if (z3) {
            int i9 = i - this.f307441g;
            if (!z) {
                i8 = 1;
            }
            return i4 + this.f307442h + (i3 * ((i9 * i8) - 1)) + mo145578b(j);
        } else if (!z2) {
            return i5;
        } else {
            int i15 = this.f307439e - i;
            if (!z) {
                i8 = 1;
            }
            return ((this.f307440f - i2) - (i3 * ((i15 * i8) - 1))) + mo145578b(j);
        }
    }

    /* renamed from: b */
    public final int mo145578b(long j) {
        if (this.f307436b) {
            return C33177j.m39962a(j);
        }
        int i = C33177j.f90051c;
        return (int) (j >> 32);
    }

    /* renamed from: c */
    public final void mo145579c(C103940e0 e0Var, C103935c cVar) {
        C103940e0 e0Var2 = e0Var;
        C103935c cVar2 = cVar;
        while (((ArrayList) cVar2.f307330b).size() > e0Var2.f307364i.size()) {
            C64175a0.m75515w(cVar2.f307330b);
        }
        while (((ArrayList) cVar2.f307330b).size() < e0Var2.f307364i.size()) {
            int size = ((ArrayList) cVar2.f307330b).size();
            long c = e0Var2.mo145557c(size);
            List<C103930a1> list = cVar2.f307330b;
            long j = cVar2.f307329a;
            ((ArrayList) list).add(new C103930a1(C33179k.m39964a(((int) (c >> 32)) - ((int) (j >> 32)), C33177j.m39962a(c) - C33177j.m39962a(j)), e0Var2.mo145556b(size), (C8480h) null));
        }
        ArrayList arrayList = (ArrayList) cVar2.f307330b;
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            C103930a1 a1Var = (C103930a1) arrayList.get(i);
            long j2 = a1Var.f307319c;
            long j3 = cVar2.f307329a;
            long a = C33179k.m39964a(((int) (j2 >> 32)) + ((int) (j3 >> 32)), C33177j.m39962a(j2) + C33177j.m39962a(j3));
            int i2 = i;
            long c2 = e0Var2.mo145557c(i2);
            a1Var.f307317a = e0Var2.mo145556b(i2);
            C37892b0<C33177j> a2 = e0Var2.mo145555a(i2);
            if (!(a == c2)) {
                long j4 = cVar2.f307329a;
                a1Var.f307319c = C33179k.m39964a(((int) (c2 >> 32)) - ((int) (j4 >> 32)), C33177j.m39962a(c2) - C33177j.m39962a(j4));
                if (a2 != null) {
                    ((C108494d2) a1Var.f307320d).setValue(Boolean.TRUE);
                    C53895h.m60466d(this.f307435a, (C66212f) null, (C53934p0) null, new C103957a(a1Var, a2, (C15601d<? super C103957a>) null), 3, (Object) null);
                    i = i2 + 1;
                }
            }
            i = i2 + 1;
        }
    }
}
