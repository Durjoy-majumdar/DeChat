package p267x;

import a14.C0000n0;
import android.view.View;
import d14.C58085t0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C45983e0;
import gy3.C87413o;
import kotlin.ResultKt;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p175j0.C60667k2;
import p175j0.C60690y0;
import p560i2.C108322d;
import p560i2.C108328i;
import p560i2.C108329n;
import p560i2.C33181m;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", mo125469f = "Magnifier.kt", mo125470l = {365}, mo125471m = "invokeSuspend")
/* renamed from: x.k1 */
public final class C111925k1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f335060d;

    /* renamed from: e */
    public /* synthetic */ Object f335061e;

    /* renamed from: f */
    public final /* synthetic */ C111884a2 f335062f;

    /* renamed from: g */
    public final /* synthetic */ C111959t1 f335063g;

    /* renamed from: h */
    public final /* synthetic */ View f335064h;

    /* renamed from: i */
    public final /* synthetic */ C108322d f335065i;

    /* renamed from: j */
    public final /* synthetic */ float f335066j;

    /* renamed from: n */
    public final /* synthetic */ C58085t0<C13598b0> f335067n;

    /* renamed from: o */
    public final /* synthetic */ C60667k2<C32226l<C108328i, C13598b0>> f335068o;

    /* renamed from: p */
    public final /* synthetic */ C60667k2<Boolean> f335069p;

    /* renamed from: q */
    public final /* synthetic */ C60667k2<C112539e> f335070q;

    /* renamed from: r */
    public final /* synthetic */ C60667k2<C32226l<C108322d, C112539e>> f335071r;

    /* renamed from: s */
    public final /* synthetic */ C60690y0<C112539e> f335072s;

    /* renamed from: t */
    public final /* synthetic */ C60667k2<Float> f335073t;

    @C91590f(mo125468c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", mo125469f = "Magnifier.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: x.k1$a */
    public static final class C111926a extends C91594j implements C32227p<C13598b0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C111975z1 f335074d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111926a(C111975z1 z1Var, C15601d<? super C111926a> dVar) {
            super(2, dVar);
            this.f335074d = z1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C111926a(this.f335074d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C111926a) create((C13598b0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f335074d.updateContent();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: x.k1$b */
    public static final class C111927b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111975z1 f335075d;

        /* renamed from: e */
        public final /* synthetic */ C108322d f335076e;

        /* renamed from: f */
        public final /* synthetic */ C60667k2<Boolean> f335077f;

        /* renamed from: g */
        public final /* synthetic */ C60667k2<C112539e> f335078g;

        /* renamed from: h */
        public final /* synthetic */ C60667k2<C32226l<C108322d, C112539e>> f335079h;

        /* renamed from: i */
        public final /* synthetic */ C60690y0<C112539e> f335080i;

        /* renamed from: j */
        public final /* synthetic */ C60667k2<Float> f335081j;

        /* renamed from: n */
        public final /* synthetic */ C45983e0 f335082n;

        /* renamed from: o */
        public final /* synthetic */ C60667k2<C32226l<C108328i, C13598b0>> f335083o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111927b(C111975z1 z1Var, C108322d dVar, C60667k2<Boolean> k2Var, C60667k2<C112539e> k2Var2, C60667k2<? extends C32226l<? super C108322d, C112539e>> k2Var3, C60690y0<C112539e> y0Var, C60667k2<Float> k2Var4, C45983e0 e0Var, C60667k2<? extends C32226l<? super C108328i, C13598b0>> k2Var5) {
            super(0);
            this.f335075d = z1Var;
            this.f335076e = dVar;
            this.f335077f = k2Var;
            this.f335078g = k2Var2;
            this.f335079h = k2Var3;
            this.f335080i = y0Var;
            this.f335081j = k2Var4;
            this.f335082n = e0Var;
            this.f335083o = k2Var5;
        }

        public Object invoke() {
            if (this.f335077f.getValue().booleanValue()) {
                C111975z1 z1Var = this.f335075d;
                long j = this.f335078g.getValue().f336959a;
                Object invoke = this.f335079h.getValue().invoke(this.f335076e);
                C60690y0<C112539e> y0Var = this.f335080i;
                long j2 = ((C112539e) invoke).f336959a;
                z1Var.mo163625a(j, C112540f.m153747c(j2) ? C112539e.m153742g(y0Var.getValue().f336959a, j2) : C112539e.f336957d, this.f335081j.getValue().floatValue());
                long b = this.f335075d.mo163626b();
                C45983e0 e0Var = this.f335082n;
                C108322d dVar = this.f335076e;
                C60667k2<C32226l<C108328i, C13598b0>> k2Var = this.f335083o;
                if (!C33181m.m39965a(b, e0Var.f124000d)) {
                    e0Var.f124000d = b;
                    C32226l value = k2Var.getValue();
                    if (value != null) {
                        value.invoke(new C108328i(dVar.mo143040q(C108329n.m146744b(b))));
                    }
                }
            } else {
                this.f335075d.dismiss();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111925k1(C111884a2 a2Var, C111959t1 t1Var, View view, C108322d dVar, float f, C58085t0<C13598b0> t0Var, C60667k2<? extends C32226l<? super C108328i, C13598b0>> k2Var, C60667k2<Boolean> k2Var2, C60667k2<C112539e> k2Var3, C60667k2<? extends C32226l<? super C108322d, C112539e>> k2Var4, C60690y0<C112539e> y0Var, C60667k2<Float> k2Var5, C15601d<? super C111925k1> dVar2) {
        super(2, dVar2);
        this.f335062f = a2Var;
        this.f335063g = t1Var;
        this.f335064h = view;
        this.f335065i = dVar;
        this.f335066j = f;
        this.f335067n = t0Var;
        this.f335068o = k2Var;
        this.f335069p = k2Var2;
        this.f335070q = k2Var3;
        this.f335071r = k2Var4;
        this.f335072s = y0Var;
        this.f335073t = k2Var5;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C111925k1 k1Var = new C111925k1(this.f335062f, this.f335063g, this.f335064h, this.f335065i, this.f335066j, this.f335067n, this.f335068o, this.f335069p, this.f335070q, this.f335071r, this.f335072s, this.f335073t, dVar);
        k1Var.f335061e = obj;
        return k1Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111925k1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: x.z1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r19
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r1.f335060d
            r3 = 1
            if (r2 == 0) goto L_0x0020
            if (r2 != r3) goto L_0x0018
            java.lang.Object r0 = r1.f335061e
            r2 = r0
            x.z1 r2 = (p267x.C111975z1) r2
            kotlin.ResultKt.throwOnFailure(r20)     // Catch:{ all -> 0x0015 }
            goto L_0x00ad
        L_0x0015:
            r0 = move-exception
            goto L_0x00b3
        L_0x0018:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r20)
            java.lang.Object r2 = r1.f335061e
            r4 = r2
            a14.n0 r4 = (a14.C0000n0) r4
            x.a2 r2 = r1.f335062f
            x.t1 r5 = r1.f335063g
            android.view.View r6 = r1.f335064h
            i2.d r7 = r1.f335065i
            float r8 = r1.f335066j
            x.z1 r2 = r2.mo163624b(r5, r6, r7, r8)
            gy3.e0 r15 = new gy3.e0
            r15.<init>()
            long r5 = r2.mo163626b()
            i2.d r7 = r1.f335065i
            j0.k2<fy3.l<i2.i, rx3.b0>> r8 = r1.f335068o
            java.lang.Object r8 = r8.getValue()
            fy3.l r8 = (fy3.C32226l) r8
            if (r8 == 0) goto L_0x005b
            long r9 = p560i2.C108329n.m146744b(r5)
            long r9 = r7.mo143040q(r9)
            i2.i r7 = new i2.i
            r7.<init>(r9)
            r8.invoke(r7)
        L_0x005b:
            r15.f124000d = r5
            d14.t0<rx3.b0> r5 = r1.f335067n
            x.k1$a r6 = new x.k1$a
            r7 = 0
            r6.<init>(r2, r7)
            d14.n0 r8 = new d14.n0
            r8.<init>(r5, r6)
            d14.n r9 = new d14.n
            r9.<init>(r8, r7)
            r5 = 0
            r6 = 0
            r8 = 3
            r10 = 0
            r7 = r9
            r9 = r10
            a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)
            x.k1$b r4 = new x.k1$b     // Catch:{ all -> 0x0015 }
            i2.d r11 = r1.f335065i     // Catch:{ all -> 0x0015 }
            j0.k2<java.lang.Boolean> r12 = r1.f335069p     // Catch:{ all -> 0x0015 }
            j0.k2<z0.e> r13 = r1.f335070q     // Catch:{ all -> 0x0015 }
            j0.k2<fy3.l<i2.d, z0.e>> r14 = r1.f335071r     // Catch:{ all -> 0x0015 }
            j0.y0<z0.e> r5 = r1.f335072s     // Catch:{ all -> 0x0015 }
            j0.k2<java.lang.Float> r6 = r1.f335073t     // Catch:{ all -> 0x0015 }
            j0.k2<fy3.l<i2.i, rx3.b0>> r7 = r1.f335068o     // Catch:{ all -> 0x0015 }
            r9 = r4
            r10 = r2
            r8 = r15
            r15 = r5
            r16 = r6
            r17 = r8
            r18 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0015 }
            d14.f r4 = p175j0.C108500f2.m146999f(r4)     // Catch:{ all -> 0x0015 }
            r1.f335061e = r2     // Catch:{ all -> 0x0015 }
            r1.f335060d = r3     // Catch:{ all -> 0x0015 }
            e14.u r3 = e14.C58508u.f167540d     // Catch:{ all -> 0x0015 }
            d14.a r4 = (d14.C58012a) r4     // Catch:{ all -> 0x0015 }
            java.lang.Object r3 = r4.mo31880a(r3, r1)     // Catch:{ all -> 0x0015 }
            if (r3 != r0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0015 }
        L_0x00aa:
            if (r3 != r0) goto L_0x00ad
            return r0
        L_0x00ad:
            r2.dismiss()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x00b3:
            r2.dismiss()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p267x.C111925k1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
