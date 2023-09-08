package p155g0;

import a14.C53930o0;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p1166z0.C112541g;
import p152f0.C107343g0;
import p152f0.C107351i1;
import p152f0.C107394p2;
import p152f0.C107414t0;
import p175j0.C108504h;
import p190l1.C109119z;
import p544h2.C32658d;
import p631o1.C109857o;
import p631o1.C109861p;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: g0.c0 */
public final class C107610c0 {

    @C91590f(mo125468c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1", mo125469f = "TextFieldSelectionManager.kt", mo125470l = {821}, mo125471m = "invokeSuspend")
    /* renamed from: g0.c0$a */
    public static final class C107611a extends C91594j implements C32227p<C109119z, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f321982d;

        /* renamed from: e */
        public /* synthetic */ Object f321983e;

        /* renamed from: f */
        public final /* synthetic */ C107351i1 f321984f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107611a(C107351i1 i1Var, C15601d<? super C107611a> dVar) {
            super(2, dVar);
            this.f321984f = i1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C107611a aVar = new C107611a(this.f321984f, dVar);
            aVar.f321983e = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C107611a) create((C109119z) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f321982d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C107351i1 i1Var = this.f321984f;
                this.f321982d = 1;
                Object f = C53930o0.m60559f(new C107414t0((C109119z) this.f321983e, i1Var, (C15601d<? super C107414t0>) null), this);
                if (f != aVar) {
                    f = C13598b0.f38549a;
                }
                if (f == aVar) {
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

    /* renamed from: g0.c0$b */
    public static final class C107612b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f321985d;

        /* renamed from: e */
        public final /* synthetic */ C32658d f321986e;

        /* renamed from: f */
        public final /* synthetic */ C107601b0 f321987f;

        /* renamed from: g */
        public final /* synthetic */ int f321988g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107612b(boolean z, C32658d dVar, C107601b0 b0Var, int i) {
            super(2);
            this.f321985d = z;
            this.f321986e = dVar;
            this.f321987f = b0Var;
            this.f321988g = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C107610c0.m145778a(this.f321985d, this.f321986e, this.f321987f, (C108504h) obj, this.f321988g | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g0.c0$c */
    public /* synthetic */ class C107613c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f321989a;

        static {
            int[] iArr = new int[C107343g0.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            f321989a = iArr;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (r1 == p175j0.C108504h.C60656a.f172772a) goto L_0x0032;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m145778a(boolean r10, p544h2.C32658d r11, p155g0.C107601b0 r12, p175j0.C108504h r13, int r14) {
        /*
            java.lang.String r0 = "direction"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "manager"
            gy3.C87412m.m108594g(r12, r0)
            fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0> r0 = p175j0.C24715p.f70494a
            r0 = -1344558920(0xffffffffafdba8b8, float:-3.995575E-10)
            j0.h r13 = r13.mo51623z(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13.mo51557H(r1)
            boolean r0 = r13.mo51619x(r0)
            boolean r1 = r13.mo51619x(r12)
            r0 = r0 | r1
            java.lang.Object r1 = r13.mo51606q()
            if (r0 != 0) goto L_0x0032
            int r0 = p175j0.C108504h.f324828a
            java.lang.Object r0 = p175j0.C108504h.C60656a.f172772a
            if (r1 != r0) goto L_0x003a
        L_0x0032:
            g0.a0 r1 = new g0.a0
            r1.<init>(r12, r10)
            r13.mo51553F(r1)
        L_0x003a:
            r13.mo51565P()
            f0.i1 r1 = (p152f0.C107351i1) r1
            long r2 = r12.mo158022i(r10)
            c2.z r0 = r12.mo158023j()
            long r4 = r0.f78286b
            boolean r5 = p735w1.C38006x.m41699g(r4)
            int r0 = p721v0.C65503j.f188489K0
            v0.j$a r0 = p721v0.C65503j.C65504a.f188490d
            g0.c0$a r4 = new g0.c0$a
            r6 = 0
            r4.<init>(r1, r6)
            v0.j r6 = p190l1.C109099h0.m148137a(r0, r1, r4)
            r7 = 0
            r0 = 196608(0x30000, float:2.75506E-40)
            int r1 = r14 << 3
            r4 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r4
            r1 = r1 & 896(0x380, float:1.256E-42)
            r9 = r0 | r1
            r1 = r2
            r3 = r10
            r4 = r11
            r8 = r13
            p155g0.C107594a.m145754c(r1, r3, r4, r5, r6, r7, r8, r9)
            j0.v1 r13 = r13.mo51596l()
            if (r13 != 0) goto L_0x0075
            goto L_0x007d
        L_0x0075:
            g0.c0$b r0 = new g0.c0$b
            r0.<init>(r10, r11, r12, r14)
            r13.mo51650a(r0)
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p155g0.C107610c0.m145778a(boolean, h2.d, g0.b0, j0.h, int):void");
    }

    /* renamed from: b */
    public static final boolean m145779b(C107601b0 b0Var, boolean z) {
        C109857o oVar;
        C107601b0 b0Var2 = b0Var;
        C87412m.m108594g(b0Var2, "<this>");
        C107394p2 p2Var = b0Var2.f321957d;
        if (p2Var != null && (oVar = p2Var.f321318f) != null) {
            C109857o c = C109861p.m149327c(oVar);
            C112541g b = C109861p.m149326b(oVar);
            long Q = c.mo161177Q(C112540f.m153745a(b.f336961a, b.f336962b));
            long Q2 = c.mo161177Q(C112540f.m153745a(b.f336963c, b.f336962b));
            long Q3 = c.mo161177Q(C112540f.m153745a(b.f336963c, b.f336964d));
            long Q4 = c.mo161177Q(C112540f.m153745a(b.f336961a, b.f336964d));
            float c2 = C112539e.m153738c(Q);
            float[] fArr = {C112539e.m153738c(Q2), C112539e.m153738c(Q4), C112539e.m153738c(Q3)};
            for (int i = 0; i < 3; i++) {
                c2 = Math.min(c2, fArr[i]);
            }
            float d = C112539e.m153739d(Q);
            float[] fArr2 = {C112539e.m153739d(Q2), C112539e.m153739d(Q4), C112539e.m153739d(Q3)};
            for (int i2 = 0; i2 < 3; i2++) {
                d = Math.min(d, fArr2[i2]);
            }
            float c3 = C112539e.m153738c(Q);
            float[] fArr3 = {C112539e.m153738c(Q2), C112539e.m153738c(Q4), C112539e.m153738c(Q3)};
            int i3 = 0;
            for (int i4 = 3; i3 < i4; i4 = 3) {
                c3 = Math.max(c3, fArr3[i3]);
                i3++;
            }
            float d2 = C112539e.m153739d(Q);
            float[] fArr4 = {C112539e.m153739d(Q2), C112539e.m153739d(Q4), C112539e.m153739d(Q3)};
            for (int i5 = 0; i5 < 3; i5++) {
                d2 = Math.max(d2, fArr4[i5]);
            }
            long E = oVar.mo161176E(C112540f.m153745a(c2, d));
            long E2 = oVar.mo161176E(C112540f.m153745a(c3, d2));
            float c4 = C112539e.m153738c(E);
            float d3 = C112539e.m153739d(E);
            float c5 = C112539e.m153738c(E2);
            float d4 = C112539e.m153739d(E2);
            long i6 = b0Var.mo158022i(z);
            float c6 = C112539e.m153738c(i6);
            if (c4 <= c6 && c6 <= c5) {
                float d5 = C112539e.m153739d(i6);
                if (d3 <= d5 && d5 <= d4) {
                    return true;
                }
            }
        }
        return false;
    }
}
