package ca0;

import a14.C0000n0;
import a14.C53965x0;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import kotlin.ResultKt;
import p175j0.C108504h;
import p175j0.C60690y0;
import p415q0.C110261c;
import p560i2.C108319b;
import p631o1.C109827a0;
import p631o1.C109854n0;
import p631o1.C109893x;
import p631o1.C109894x0;
import p631o1.C109899z;
import p721v0.C65503j;
import rx3.C13598b0;
import sx3.C110818d0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ca0.j0 */
public final class C54686j0 {

    @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.widget.WaveAnimationKt$WaveAnimation$1$1", mo125469f = "WaveAnimation.kt", mo125470l = {33}, mo125471m = "invokeSuspend")
    /* renamed from: ca0.j0$a */
    public static final class C54687a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f153263d;

        /* renamed from: e */
        public final /* synthetic */ C60690y0<Integer> f153264e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54687a(C60690y0<Integer> y0Var, C15601d<? super C54687a> dVar) {
            super(2, dVar);
            this.f153264e = y0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54687a(this.f153264e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54687a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f153263d;
            if (i == 0 || i == 1) {
                ResultKt.throwOnFailure(obj);
                do {
                    this.f153264e.setValue(Integer.valueOf(this.f153264e.getValue().intValue() + 1));
                    this.f153263d = 1;
                } while (C53965x0.m60607b(100, this) != aVar);
                return aVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: ca0.j0$c */
    public static final class C54688c extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f153265d;

        /* renamed from: e */
        public final /* synthetic */ boolean f153266e;

        /* renamed from: f */
        public final /* synthetic */ C65503j f153267f;

        /* renamed from: g */
        public final /* synthetic */ int f153268g;

        /* renamed from: h */
        public final /* synthetic */ int f153269h;

        /* renamed from: i */
        public final /* synthetic */ int f153270i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54688c(long j, boolean z, C65503j jVar, int i, int i2, int i3) {
            super(2);
            this.f153265d = j;
            this.f153266e = z;
            this.f153267f = jVar;
            this.f153268g = i;
            this.f153269h = i2;
            this.f153270i = i3;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C54686j0.m61557a(this.f153265d, this.f153266e, this.f153267f, this.f153268g, (C108504h) obj, this.f153269h | 1, this.f153270i);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca0.j0$b */
    public static final class C54689b extends C87413o implements C32227p<C109894x0, C108319b, C109899z> {

        /* renamed from: d */
        public final /* synthetic */ int f153271d;

        /* renamed from: e */
        public final /* synthetic */ C60690y0<Integer> f153272e;

        /* renamed from: f */
        public final /* synthetic */ boolean f153273f;

        /* renamed from: g */
        public final /* synthetic */ long f153274g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54689b(int i, C60690y0<Integer> y0Var, boolean z, long j) {
            super(2);
            this.f153271d = i;
            this.f153272e = y0Var;
            this.f153273f = z;
            this.f153274g = j;
        }

        public Object invoke(Object obj, Object obj2) {
            C109894x0 x0Var = (C109894x0) obj;
            long j = ((C108319b) obj2).f324343a;
            C87412m.m108594g(x0Var, "$this$SubcomposeLayout");
            float h = ((float) C108319b.m146697h(j)) / ((float) this.f153271d);
            C109854n0 K = ((C109893x) C110818d0.m150914L(x0Var.mo161192q0(0, C110261c.m149879c(1758179946, true, new C104351m0(this.f153272e, this.f153271d, this.f153273f, 0.1f, ((float) C108319b.m146696g(j)) / 2.0f, this.f153274g, h, h * 0.2f))))).mo161155K(j);
            return C109827a0.C109828a.m149247b(x0Var, C108319b.m146697h(j), C108319b.m146696g(j), (Map) null, new C104348k0(K), 4, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011e, code lost:
        if (r0 == p175j0.C108504h.C60656a.f172772a) goto L_0x0120;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m61557a(long r16, boolean r18, p721v0.C65503j r19, int r20, p175j0.C108504h r21, int r22, int r23) {
        /*
            r6 = r16
            r8 = r19
            r9 = r22
            java.lang.String r0 = "modifier"
            gy3.C87412m.m108594g(r8, r0)
            r0 = 1020563745(0x3cd49121, float:0.02594811)
            r1 = r21
            j0.h r10 = r1.mo51623z(r0)
            r0 = r23 & 1
            r1 = 4
            r2 = 2
            if (r0 == 0) goto L_0x001d
            r0 = r9 | 6
            goto L_0x002d
        L_0x001d:
            r0 = r9 & 14
            if (r0 != 0) goto L_0x002c
            boolean r0 = r10.mo51594k(r6)
            if (r0 == 0) goto L_0x0029
            r0 = 4
            goto L_0x002a
        L_0x0029:
            r0 = 2
        L_0x002a:
            r0 = r0 | r9
            goto L_0x002d
        L_0x002c:
            r0 = r9
        L_0x002d:
            r3 = r23 & 2
            if (r3 == 0) goto L_0x0036
            r0 = r0 | 48
            r11 = r18
            goto L_0x0048
        L_0x0036:
            r3 = r9 & 112(0x70, float:1.57E-43)
            r11 = r18
            if (r3 != 0) goto L_0x0048
            boolean r3 = r10.mo51586g(r11)
            if (r3 == 0) goto L_0x0045
            r3 = 32
            goto L_0x0047
        L_0x0045:
            r3 = 16
        L_0x0047:
            r0 = r0 | r3
        L_0x0048:
            r3 = r23 & 4
            if (r3 == 0) goto L_0x004f
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004f:
            r3 = r9 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x005f
            boolean r3 = r10.mo51619x(r8)
            if (r3 == 0) goto L_0x005c
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r3 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r0 = r0 | r3
        L_0x005f:
            r3 = r23 & 8
            if (r3 == 0) goto L_0x0066
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0079
        L_0x0066:
            r4 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0079
            r4 = r20
            boolean r5 = r10.mo51592j(r4)
            if (r5 == 0) goto L_0x0075
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r0 = r0 | r5
            goto L_0x007b
        L_0x0079:
            r4 = r20
        L_0x007b:
            r12 = r0
            r0 = r12 & 5851(0x16db, float:8.199E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r0 != r5) goto L_0x008f
            boolean r0 = r10.mo51575a()
            if (r0 != 0) goto L_0x0089
            goto L_0x008f
        L_0x0089:
            r10.mo51581d()
            r5 = r4
            goto L_0x013c
        L_0x008f:
            if (r3 == 0) goto L_0x0096
            r0 = 20
            r13 = 20
            goto L_0x0097
        L_0x0096:
            r13 = r4
        L_0x0097:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo51557H(r0)
            java.lang.Object r0 = r10.mo51606q()
            int r3 = p175j0.C108504h.f324828a
            java.lang.Object r3 = p175j0.C108504h.C60656a.f172772a
            r4 = 0
            r14 = 0
            if (r0 != r3) goto L_0x00b4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            j0.y0 r0 = p175j0.C108500f2.m146996c(r0, r4, r2, r4)
            r10.mo51553F(r0)
        L_0x00b4:
            r10.mo51565P()
            r5 = r0
            j0.y0 r5 = (p175j0.C60690y0) r5
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r18)
            r15 = 1157296644(0x44faf204, float:2007.563)
            r10.mo51557H(r15)
            boolean r15 = r10.mo51619x(r5)
            java.lang.Object r2 = r10.mo51606q()
            if (r15 != 0) goto L_0x00d0
            if (r2 != r3) goto L_0x00d8
        L_0x00d0:
            ca0.j0$a r2 = new ca0.j0$a
            r2.<init>(r5, r4)
            r10.mo51553F(r2)
        L_0x00d8:
            r10.mo51565P()
            fy3.p r2 = (fy3.C32227p) r2
            int r3 = r12 >> 3
            r3 = r3 & 14
            r3 = r3 | 64
            p175j0.C60655g0.m70932c(r0, r2, r10, r3)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r0[r14] = r2
            r2 = 1
            r0[r2] = r5
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r18)
            r3 = 2
            r0[r3] = r2
            a1.w r2 = new a1.w
            r2.<init>(r6)
            r3 = 3
            r0[r3] = r2
            r2 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r10.mo51557H(r2)
            r2 = 0
            r3 = 0
        L_0x0108:
            if (r2 >= r1) goto L_0x0114
            r4 = r0[r2]
            boolean r4 = r10.mo51619x(r4)
            r3 = r3 | r4
            int r2 = r2 + 1
            goto L_0x0108
        L_0x0114:
            java.lang.Object r0 = r10.mo51606q()
            if (r3 != 0) goto L_0x0120
            int r1 = p175j0.C108504h.f324828a
            java.lang.Object r1 = p175j0.C108504h.C60656a.f172772a
            if (r0 != r1) goto L_0x012f
        L_0x0120:
            ca0.j0$b r15 = new ca0.j0$b
            r0 = r15
            r1 = r13
            r2 = r5
            r3 = r18
            r4 = r16
            r0.<init>(r1, r2, r3, r4)
            r10.mo51553F(r15)
        L_0x012f:
            r10.mo51565P()
            fy3.p r0 = (fy3.C32227p) r0
            int r1 = r12 >> 6
            r1 = r1 & 14
            p631o1.C109880u0.m149371b(r8, r0, r10, r1, r14)
            r5 = r13
        L_0x013c:
            j0.v1 r10 = r10.mo51596l()
            if (r10 != 0) goto L_0x0143
            goto L_0x0156
        L_0x0143:
            ca0.j0$c r12 = new ca0.j0$c
            r0 = r12
            r1 = r16
            r3 = r18
            r4 = r19
            r6 = r22
            r7 = r23
            r0.<init>(r1, r3, r4, r5, r6, r7)
            r10.mo51650a(r12)
        L_0x0156:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca0.C54686j0.m61557a(long, boolean, v0.j, int, j0.h, int, int):void");
    }
}
