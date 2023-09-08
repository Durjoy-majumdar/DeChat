package p759y;

import fy3.C32226l;
import gy3.C59741c0;
import gy3.C87412m;
import gy3.C87413o;
import p257w.C111640g;
import p257w.C37907l;
import p257w.C37940v;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: y.g */
public final class C112223g implements C112195b0 {

    /* renamed from: a */
    public final C37940v<Float> f336005a;

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.DefaultFlingBehavior", mo125469f = "Scrollable.kt", mo125470l = {442}, mo125471m = "performFling")
    /* renamed from: y.g$a */
    public static final class C112224a extends C66704d {

        /* renamed from: d */
        public Object f336006d;

        /* renamed from: e */
        public /* synthetic */ Object f336007e;

        /* renamed from: f */
        public final /* synthetic */ C112223g f336008f;

        /* renamed from: g */
        public int f336009g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112224a(C112223g gVar, C15601d<? super C112224a> dVar) {
            super(dVar);
            this.f336008f = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f336007e = obj;
            this.f336009g |= Integer.MIN_VALUE;
            return this.f336008f.mo163922a((C112278q0) null, 0.0f, this);
        }
    }

    /* renamed from: y.g$b */
    public static final class C112225b extends C87413o implements C32226l<C111640g<Float, C37907l>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59741c0 f336010d;

        /* renamed from: e */
        public final /* synthetic */ C112278q0 f336011e;

        /* renamed from: f */
        public final /* synthetic */ C59741c0 f336012f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112225b(C59741c0 c0Var, C112278q0 q0Var, C59741c0 c0Var2) {
            super(1);
            this.f336010d = c0Var;
            this.f336011e = q0Var;
            this.f336012f = c0Var2;
        }

        public Object invoke(Object obj) {
            C111640g gVar = (C111640g) obj;
            C87412m.m108594g(gVar, "$this$animateDecay");
            float floatValue = ((Number) gVar.mo163316b()).floatValue() - this.f336010d.f170634d;
            float a = this.f336011e.mo90555a(floatValue);
            this.f336010d.f170634d = ((Number) gVar.mo163316b()).floatValue();
            this.f336012f.f170634d = ((Number) gVar.mo163317c()).floatValue();
            if (Math.abs(floatValue - a) > 0.5f) {
                gVar.mo163315a();
            }
            return C13598b0.f38549a;
        }
    }

    public C112223g(C37940v<Float> vVar) {
        C87412m.m108594g(vVar, "flingDecay");
        this.f336005a = vVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo163922a(p759y.C112278q0 r18, float r19, wx3.C15601d<? super java.lang.Float> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof p759y.C112223g.C112224a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            y.g$a r2 = (p759y.C112223g.C112224a) r2
            int r3 = r2.f336009g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f336009g = r3
            goto L_0x001c
        L_0x0017:
            y.g$a r2 = new y.g$a
            r2.<init>(r0, r1)
        L_0x001c:
            r7 = r2
            java.lang.Object r1 = r7.f336007e
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r7.f336009g
            r4 = 1
            if (r3 == 0) goto L_0x0038
            if (r3 != r4) goto L_0x0030
            java.lang.Object r2 = r7.f336006d
            gy3.c0 r2 = (gy3.C59741c0) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0080
        L_0x0030:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r1)
            float r1 = java.lang.Math.abs(r19)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0083
            gy3.c0 r1 = new gy3.c0
            r1.<init>()
            r3 = r19
            r1.f170634d = r3
            gy3.c0 r5 = new gy3.c0
            r5.<init>()
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 28
            r16 = 0
            r9 = r19
            w.j r3 = p257w.C111651k.m152177a(r8, r9, r10, r12, r14, r15, r16)
            w.v<java.lang.Float> r6 = r0.f336005a
            r8 = 0
            y.g$b r9 = new y.g$b
            r10 = r18
            r9.<init>(r5, r10, r1)
            r10 = 2
            r11 = 0
            r7.f336006d = r1
            r7.f336009g = r4
            r4 = r6
            r5 = r8
            r6 = r9
            r8 = r10
            r9 = r11
            java.lang.Object r3 = p257w.C111671y0.m152194b(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L_0x007f
            return r2
        L_0x007f:
            r2 = r1
        L_0x0080:
            float r1 = r2.f170634d
            goto L_0x0086
        L_0x0083:
            r3 = r19
            r1 = r3
        L_0x0086:
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112223g.mo163922a(y.q0, float, wx3.d):java.lang.Object");
    }
}
