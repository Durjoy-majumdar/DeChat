package p759y;

import fy3.C32227p;
import gy3.C59741c0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import p257w.C111647j;
import p257w.C111653l1;
import p257w.C111656m1;
import p257w.C111670x0;
import p257w.C111671y0;
import p257w.C37893b1;
import p257w.C37901h;
import p257w.C37903i;
import p257w.C37906k1;
import p257w.C37907l;
import p257w.C37919o;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: y.p0 */
public final class C112273p0 {

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", mo125469f = "ScrollExtensions.kt", mo125470l = {40}, mo125471m = "animateScrollBy")
    /* renamed from: y.p0$a */
    public static final class C112274a extends C66704d {

        /* renamed from: d */
        public Object f336195d;

        /* renamed from: e */
        public /* synthetic */ Object f336196e;

        /* renamed from: f */
        public int f336197f;

        public C112274a(C15601d<? super C112274a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f336196e = obj;
            this.f336197f |= Integer.MIN_VALUE;
            return C112273p0.m153168a((C112302z0) null, 0.0f, (C37901h<Float>) null, this);
        }
    }

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", mo125469f = "ScrollExtensions.kt", mo125470l = {41}, mo125471m = "invokeSuspend")
    /* renamed from: y.p0$b */
    public static final class C112275b extends C91594j implements C32227p<C112278q0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f336198d;

        /* renamed from: e */
        public /* synthetic */ Object f336199e;

        /* renamed from: f */
        public final /* synthetic */ float f336200f;

        /* renamed from: g */
        public final /* synthetic */ C37901h<Float> f336201g;

        /* renamed from: h */
        public final /* synthetic */ C59741c0 f336202h;

        /* renamed from: y.p0$b$a */
        public static final class C112276a extends C87413o implements C32227p<Float, Float, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C59741c0 f336203d;

            /* renamed from: e */
            public final /* synthetic */ C112278q0 f336204e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C112276a(C59741c0 c0Var, C112278q0 q0Var) {
                super(2);
                this.f336203d = c0Var;
                this.f336204e = q0Var;
            }

            public Object invoke(Object obj, Object obj2) {
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                C59741c0 c0Var = this.f336203d;
                float f = c0Var.f170634d;
                c0Var.f170634d = f + this.f336204e.mo90555a(floatValue - f);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112275b(float f, C37901h<Float> hVar, C59741c0 c0Var, C15601d<? super C112275b> dVar) {
            super(2, dVar);
            this.f336200f = f;
            this.f336201g = hVar;
            this.f336202h = c0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C112275b bVar = new C112275b(this.f336200f, this.f336201g, this.f336202h, dVar);
            bVar.f336199e = obj;
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112275b) create((C112278q0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f336198d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                float f = this.f336200f;
                C37901h<Float> hVar = this.f336201g;
                C112276a aVar2 = new C112276a(this.f336202h, (C112278q0) this.f336199e);
                this.f336198d = 1;
                C37906k1<Float, C37907l> k1Var = C111656m1.f334256a;
                Float f2 = new Float(0.0f);
                Float f3 = new Float(f);
                C111653l1 l1Var = (C111653l1) k1Var;
                C37919o oVar = (C37919o) l1Var.f334248a.invoke(new Float(0.0f));
                if (oVar == null) {
                    C37919o oVar2 = (C37919o) l1Var.f334248a.invoke(f2);
                    C87412m.m108594g(oVar2, "<this>");
                    oVar = oVar2.mo61403c();
                }
                C37919o oVar3 = oVar;
                C37893b1 b1Var = new C37893b1(hVar, k1Var, f2, f3, oVar3);
                Object a = C111671y0.m152193a(new C111647j(k1Var, f2, oVar3, 0, 0, false, 56, (C8480h) null), b1Var, Long.MIN_VALUE, new C111670x0(aVar2, k1Var), this);
                if (a != aVar) {
                    a = C13598b0.f38549a;
                }
                if (a != aVar) {
                    a = C13598b0.f38549a;
                }
                if (a == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m153168a(p759y.C112302z0 r7, float r8, p257w.C37901h<java.lang.Float> r9, wx3.C15601d<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof p759y.C112273p0.C112274a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            y.p0$a r0 = (p759y.C112273p0.C112274a) r0
            int r1 = r0.f336197f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f336197f = r1
            goto L_0x0018
        L_0x0013:
            y.p0$a r0 = new y.p0$a
            r0.<init>(r10)
        L_0x0018:
            r4 = r0
            java.lang.Object r10 = r4.f336196e
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r4.f336197f
            r2 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r2) goto L_0x002c
            java.lang.Object r7 = r4.f336195d
            gy3.c0 r7 = (gy3.C59741c0) r7
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0055
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r10)
            gy3.c0 r10 = new gy3.c0
            r10.<init>()
            r3 = 0
            y.p0$b r5 = new y.p0$b
            r1 = 0
            r5.<init>(r8, r9, r10, r1)
            r8 = 1
            r6 = 0
            r4.f336195d = r10
            r4.f336197f = r2
            r1 = r7
            r2 = r3
            r3 = r5
            r5 = r8
            java.lang.Object r7 = p759y.C112302z0.C112303a.m153183a(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L_0x0054
            return r0
        L_0x0054:
            r7 = r10
        L_0x0055:
            float r7 = r7.f170634d
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112273p0.m153168a(y.z0, float, w.h, wx3.d):java.lang.Object");
    }

    /* renamed from: b */
    public static /* synthetic */ Object m153169b(C112302z0 z0Var, float f, C37901h hVar, C15601d dVar, int i, Object obj) {
        if ((i & 2) != 0) {
            hVar = C37903i.m41594b(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        return m153168a(z0Var, f, hVar, dVar);
    }
}
