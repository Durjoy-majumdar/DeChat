package androidx.compose.foundation.lazy.layout;

import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedHashMap;
import p175j0.C108504h;
import p175j0.C60667k2;
import p560i2.C108319b;
import p631o1.C109894x0;
import p631o1.C109899z;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: androidx.compose.foundation.lazy.layout.l */
public final class C103585l {

    /* renamed from: androidx.compose.foundation.lazy.layout.l$a */
    public static final class C103586a extends C87413o implements C32227p<C109894x0, C108319b, C109899z> {

        /* renamed from: d */
        public final /* synthetic */ C103581i f305913d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<C103589m, C108319b, C109899z> f305914e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103586a(C103581i iVar, C32227p<? super C103589m, ? super C108319b, ? extends C109899z> pVar) {
            super(2);
            this.f305913d = iVar;
            this.f305914e = pVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C109894x0 x0Var = (C109894x0) obj;
            long j = ((C108319b) obj2).f324343a;
            C87412m.m108594g(x0Var, "$this$null");
            C103581i iVar = this.f305913d;
            iVar.getClass();
            if (!C87412m.m108589b(x0Var, iVar.f305904d) || !C108319b.m146691b(j, iVar.f305905e)) {
                iVar.f305904d = x0Var;
                iVar.f305905e = j;
                ((LinkedHashMap) iVar.f305903c).clear();
            }
            return this.f305914e.invoke(new C103590n(this.f305913d, x0Var), new C108319b(j));
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.layout.l$b */
    public static final class C103587b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C103583j f305915d;

        /* renamed from: e */
        public final /* synthetic */ C65503j f305916e;

        /* renamed from: f */
        public final /* synthetic */ C103591o f305917f;

        /* renamed from: g */
        public final /* synthetic */ C32227p<C103589m, C108319b, C109899z> f305918g;

        /* renamed from: h */
        public final /* synthetic */ int f305919h;

        /* renamed from: i */
        public final /* synthetic */ int f305920i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103587b(C103583j jVar, C65503j jVar2, C103591o oVar, C32227p<? super C103589m, ? super C108319b, ? extends C109899z> pVar, int i, int i2) {
            super(2);
            this.f305915d = jVar;
            this.f305916e = jVar2;
            this.f305917f = oVar;
            this.f305918g = pVar;
            this.f305919h = i;
            this.f305920i = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C103585l.m137711a(this.f305915d, this.f305916e, this.f305917f, this.f305918g, (C108504h) obj, this.f305919h | 1, this.f305920i);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.layout.l$c */
    public static final class C103588c extends C87413o implements C32224a<C103583j> {

        /* renamed from: d */
        public final /* synthetic */ C60667k2<C103583j> f305921d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103588c(C60667k2<? extends C103583j> k2Var) {
            super(0);
            this.f305921d = k2Var;
        }

        public Object invoke() {
            return this.f305921d.getValue();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m137711a(androidx.compose.foundation.lazy.layout.C103583j r15, p721v0.C65503j r16, androidx.compose.foundation.lazy.layout.C103591o r17, fy3.C32227p<? super androidx.compose.foundation.lazy.layout.C103589m, ? super p560i2.C108319b, ? extends p631o1.C109899z> r18, p175j0.C108504h r19, int r20, int r21) {
        /*
            r1 = r15
            r4 = r18
            r5 = r20
            java.lang.String r0 = "itemProvider"
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = "measurePolicy"
            gy3.C87412m.m108594g(r4, r0)
            fy3.q<j0.d<?>, j0.b2, j0.t1, rx3.b0> r0 = p175j0.C24715p.f70494a
            r0 = 852831187(0x32d52bd3, float:2.4816392E-8)
            r2 = r19
            j0.h r0 = r2.mo51623z(r0)
            r2 = r21 & 1
            if (r2 == 0) goto L_0x0021
            r2 = r5 | 6
            goto L_0x0031
        L_0x0021:
            r2 = r5 & 14
            if (r2 != 0) goto L_0x0030
            boolean r2 = r0.mo51619x(r15)
            if (r2 == 0) goto L_0x002d
            r2 = 4
            goto L_0x002e
        L_0x002d:
            r2 = 2
        L_0x002e:
            r2 = r2 | r5
            goto L_0x0031
        L_0x0030:
            r2 = r5
        L_0x0031:
            r3 = r21 & 2
            if (r3 == 0) goto L_0x0038
            r2 = r2 | 48
            goto L_0x004b
        L_0x0038:
            r6 = r5 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004b
            r6 = r16
            boolean r7 = r0.mo51619x(r6)
            if (r7 == 0) goto L_0x0047
            r7 = 32
            goto L_0x0049
        L_0x0047:
            r7 = 16
        L_0x0049:
            r2 = r2 | r7
            goto L_0x004d
        L_0x004b:
            r6 = r16
        L_0x004d:
            r7 = r21 & 4
            if (r7 == 0) goto L_0x0054
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0067
            r8 = r17
            boolean r9 = r0.mo51619x(r8)
            if (r9 == 0) goto L_0x0063
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r2 = r2 | r9
            goto L_0x0069
        L_0x0067:
            r8 = r17
        L_0x0069:
            r9 = r21 & 8
            if (r9 == 0) goto L_0x0070
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x0070:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0080
            boolean r9 = r0.mo51619x(r4)
            if (r9 == 0) goto L_0x007d
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r2 = r2 | r9
        L_0x0080:
            r9 = r2 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x0094
            boolean r9 = r0.mo51575a()
            if (r9 != 0) goto L_0x008d
            goto L_0x0094
        L_0x008d:
            r0.mo51581d()
            r2 = r6
            r3 = r8
            goto L_0x0156
        L_0x0094:
            if (r3 == 0) goto L_0x009b
            int r3 = p721v0.C65503j.f188489K0
            v0.j$a r3 = p721v0.C65503j.C65504a.f188490d
            goto L_0x009c
        L_0x009b:
            r3 = r6
        L_0x009c:
            if (r7 == 0) goto L_0x00a1
            r6 = 0
            r13 = r6
            goto L_0x00a2
        L_0x00a1:
            r13 = r8
        L_0x00a2:
            r6 = r2 & 14
            j0.k2 r14 = p175j0.C108500f2.m146998e(r15, r0, r6)
            r6 = -579869653(0xffffffffdd6fe42b, float:-1.08037428E18)
            r0.mo51557H(r6)
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            s0.l<s0.f, ?> r7 = p683s0.C110679f.f331091d
            r8 = 0
            s0.h r9 = p683s0.C110687h.f331111d
            r11 = 8
            r12 = 4
            r10 = r0
            java.lang.Object r6 = p683s0.C110676d.m150647a(r6, r7, r8, r9, r10, r11, r12)
            s0.f r6 = (p683s0.C110679f) r6
            j0.f1<s0.i> r7 = p683s0.C110690k.f331112a
            java.lang.Object r7 = r0.mo51598m(r7)
            s0.i r7 = (p683s0.C110688i) r7
            r6.f331094c = r7
            r0.mo51565P()
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo51557H(r7)
            java.lang.Object r8 = r0.mo51606q()
            int r9 = p175j0.C108504h.f324828a
            java.lang.Object r9 = p175j0.C108504h.C60656a.f172772a
            if (r8 != r9) goto L_0x00ea
            androidx.compose.foundation.lazy.layout.i r8 = new androidx.compose.foundation.lazy.layout.i
            androidx.compose.foundation.lazy.layout.l$c r10 = new androidx.compose.foundation.lazy.layout.l$c
            r10.<init>(r14)
            r8.<init>(r6, r10)
            r0.mo51553F(r8)
        L_0x00ea:
            r0.mo51565P()
            androidx.compose.foundation.lazy.layout.i r8 = (androidx.compose.foundation.lazy.layout.C103581i) r8
            r0.mo51557H(r7)
            java.lang.Object r6 = r0.mo51606q()
            if (r6 != r9) goto L_0x0105
            o1.w0 r6 = new o1.w0
            androidx.compose.foundation.lazy.layout.k r7 = new androidx.compose.foundation.lazy.layout.k
            r7.<init>(r8)
            r6.<init>(r7)
            r0.mo51553F(r6)
        L_0x0105:
            r0.mo51565P()
            o1.w0 r6 = (p631o1.C109888w0) r6
            r7 = 617316839(0x24cb81e7, float:8.825728E-17)
            r0.mo51557H(r7)
            if (r13 != 0) goto L_0x0113
            goto L_0x0120
        L_0x0113:
            int r7 = r2 >> 6
            r7 = r7 & 14
            r7 = r7 | 64
            r7 = r7 | 512(0x200, float:7.175E-43)
            androidx.compose.foundation.lazy.layout.C103596q.m137729a(r13, r8, r6, r0, r7)
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x0120:
            r0.mo51565P()
            r7 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r0.mo51557H(r7)
            boolean r7 = r0.mo51619x(r8)
            boolean r10 = r0.mo51619x(r4)
            r7 = r7 | r10
            java.lang.Object r10 = r0.mo51606q()
            if (r7 != 0) goto L_0x013a
            if (r10 != r9) goto L_0x0142
        L_0x013a:
            androidx.compose.foundation.lazy.layout.l$a r10 = new androidx.compose.foundation.lazy.layout.l$a
            r10.<init>(r8, r4)
            r0.mo51553F(r10)
        L_0x0142:
            r0.mo51565P()
            r8 = r10
            fy3.p r8 = (fy3.C32227p) r8
            r2 = r2 & 112(0x70, float:1.57E-43)
            r7 = 8
            r10 = r7 | r2
            r11 = 0
            r7 = r3
            r9 = r0
            p631o1.C109880u0.m149370a(r6, r7, r8, r9, r10, r11)
            r2 = r3
            r3 = r13
        L_0x0156:
            j0.v1 r7 = r0.mo51596l()
            if (r7 != 0) goto L_0x015d
            goto L_0x016d
        L_0x015d:
            androidx.compose.foundation.lazy.layout.l$b r8 = new androidx.compose.foundation.lazy.layout.l$b
            r0 = r8
            r1 = r15
            r4 = r18
            r5 = r20
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo51650a(r8)
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.C103585l.m137711a(androidx.compose.foundation.lazy.layout.j, v0.j, androidx.compose.foundation.lazy.layout.o, fy3.p, j0.h, int, int):void");
    }
}
