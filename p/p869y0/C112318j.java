package p869y0;

import com.google.firebase.analytics.FirebaseAnalytics;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import p1140p1.C110100f;
import p560i2.C33183o;
import p721v0.C65503j;
import rx3.C13603j;

/* renamed from: y0.j */
public final class C112318j implements C66478i {

    /* renamed from: a */
    public final C112321l f336326a;

    /* renamed from: b */
    public final C65503j f336327b;

    /* renamed from: c */
    public C33183o f336328c;

    /* renamed from: y0.j$a */
    public static final class C112319a extends C87413o implements C32226l<C112321l, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C112321l f336329d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112319a(C112321l lVar) {
            super(1);
            this.f336329d = lVar;
        }

        public Object invoke(Object obj) {
            C112321l lVar = (C112321l) obj;
            C87412m.m108594g(lVar, FirebaseAnalytics.C113379b.DESTINATION);
            if (C87412m.m108589b(lVar, this.f336329d)) {
                return Boolean.FALSE;
            }
            if (lVar.f336331e != null) {
                C112308c0.m153192f(lVar);
                return Boolean.TRUE;
            }
            throw new IllegalStateException("Move focus landed at the root.".toString());
        }
    }

    public C112318j(C112321l lVar, int i, C8480h hVar) {
        lVar = (i & 1) != 0 ? new C112321l(C112306b0.Inactive, (C32226l) null, 2, (C8480h) null) : lVar;
        C87412m.m108594g(lVar, "focusModifier");
        this.f336326a = lVar;
        C110100f<C112321l> fVar = C112323m.f336346a;
        this.f336327b = lVar.mo74972i0(C112323m.f336347b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:155:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01e3 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo90560a(int r15) {
        /*
            r14 = this;
            y0.l r0 = r14.f336326a
            y0.l r0 = p869y0.C112310d0.m153197b(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            i2.o r2 = r14.f336328c
            java.lang.String r3 = "layoutDirection"
            r4 = 0
            if (r2 == 0) goto L_0x0201
            r5 = 1
            if (r15 != r5) goto L_0x0016
            r6 = 1
            goto L_0x0017
        L_0x0016:
            r6 = 0
        L_0x0017:
            r7 = 8
            r8 = 7
            r9 = 6
            r10 = 5
            r11 = 2
            r12 = 4
            r13 = 3
            if (r6 == 0) goto L_0x0029
            y0.s r2 = r0.f336339p
            y0.t r2 = (p869y0.C112334t) r2
            y0.w r2 = r2.f336354b
            goto L_0x00d3
        L_0x0029:
            if (r15 != r11) goto L_0x002d
            r6 = 1
            goto L_0x002e
        L_0x002d:
            r6 = 0
        L_0x002e:
            if (r6 == 0) goto L_0x0038
            y0.s r2 = r0.f336339p
            y0.t r2 = (p869y0.C112334t) r2
            y0.w r2 = r2.f336355c
            goto L_0x00d3
        L_0x0038:
            if (r15 != r10) goto L_0x003c
            r6 = 1
            goto L_0x003d
        L_0x003c:
            r6 = 0
        L_0x003d:
            if (r6 == 0) goto L_0x0047
            y0.s r2 = r0.f336339p
            y0.t r2 = (p869y0.C112334t) r2
            y0.w r2 = r2.f336356d
            goto L_0x00d3
        L_0x0047:
            if (r15 != r9) goto L_0x004b
            r6 = 1
            goto L_0x004c
        L_0x004b:
            r6 = 0
        L_0x004c:
            if (r6 == 0) goto L_0x0056
            y0.s r2 = r0.f336339p
            y0.t r2 = (p869y0.C112334t) r2
            y0.w r2 = r2.f336357e
            goto L_0x00d3
        L_0x0056:
            if (r15 != r13) goto L_0x005a
            r6 = 1
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            if (r6 == 0) goto L_0x008b
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x0072
            if (r2 != r5) goto L_0x006c
            y0.s r2 = r0.f336339p
            y0.t r2 = (p869y0.C112334t) r2
            y0.w r2 = r2.f336361i
            goto L_0x0078
        L_0x006c:
            rx3.j r15 = new rx3.j
            r15.<init>()
            throw r15
        L_0x0072:
            y0.s r2 = r0.f336339p
            y0.t r2 = (p869y0.C112334t) r2
            y0.w r2 = r2.f336360h
        L_0x0078:
            y0.w r6 = p869y0.C112339w.f336368b
            boolean r6 = gy3.C87412m.m108589b(r2, r6)
            if (r6 != 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r2 = r4
        L_0x0082:
            if (r2 != 0) goto L_0x00d3
            y0.s r2 = r0.f336339p
            y0.t r2 = (p869y0.C112334t) r2
            y0.w r2 = r2.f336358f
            goto L_0x00d3
        L_0x008b:
            if (r15 != r12) goto L_0x008f
            r6 = 1
            goto L_0x0090
        L_0x008f:
            r6 = 0
        L_0x0090:
            if (r6 == 0) goto L_0x00c0
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x00a7
            if (r2 != r5) goto L_0x00a1
            y0.s r2 = r0.f336339p
            y0.t r2 = (p869y0.C112334t) r2
            y0.w r2 = r2.f336360h
            goto L_0x00ad
        L_0x00a1:
            rx3.j r15 = new rx3.j
            r15.<init>()
            throw r15
        L_0x00a7:
            y0.s r2 = r0.f336339p
            y0.t r2 = (p869y0.C112334t) r2
            y0.w r2 = r2.f336361i
        L_0x00ad:
            y0.w r6 = p869y0.C112339w.f336368b
            boolean r6 = gy3.C87412m.m108589b(r2, r6)
            if (r6 != 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r2 = r4
        L_0x00b7:
            if (r2 != 0) goto L_0x00d3
            y0.s r2 = r0.f336339p
            y0.t r2 = (p869y0.C112334t) r2
            y0.w r2 = r2.f336359g
            goto L_0x00d3
        L_0x00c0:
            if (r15 != r8) goto L_0x00c4
            r2 = 1
            goto L_0x00c5
        L_0x00c4:
            r2 = 0
        L_0x00c5:
            if (r2 == 0) goto L_0x00ca
            y0.w r2 = p869y0.C112339w.f336368b
            goto L_0x00d3
        L_0x00ca:
            if (r15 != r7) goto L_0x00ce
            r2 = 1
            goto L_0x00cf
        L_0x00ce:
            r2 = 0
        L_0x00cf:
            if (r2 == 0) goto L_0x01f5
            y0.w r2 = p869y0.C112339w.f336368b
        L_0x00d3:
            y0.w r6 = p869y0.C112339w.f336368b
            boolean r6 = gy3.C87412m.m108589b(r2, r6)
            if (r6 != 0) goto L_0x00df
            r2.mo164065a()
            return r5
        L_0x00df:
            y0.l r2 = r14.f336326a
            i2.o r6 = r14.f336328c
            if (r6 == 0) goto L_0x01f1
            y0.j$a r3 = new y0.j$a
            r3.<init>(r0)
            java.lang.String r0 = "$this$focusSearch"
            gy3.C87412m.m108594g(r2, r0)
            if (r15 != r5) goto L_0x00f3
            r0 = 1
            goto L_0x00f4
        L_0x00f3:
            r0 = 0
        L_0x00f4:
            if (r0 == 0) goto L_0x00f7
            goto L_0x00f9
        L_0x00f7:
            if (r15 != r11) goto L_0x00fb
        L_0x00f9:
            r0 = 1
            goto L_0x00fc
        L_0x00fb:
            r0 = 0
        L_0x00fc:
            if (r0 == 0) goto L_0x0124
            if (r15 != r5) goto L_0x0102
            r0 = 1
            goto L_0x0103
        L_0x0102:
            r0 = 0
        L_0x0103:
            if (r0 == 0) goto L_0x010b
            boolean r0 = p869y0.C112312e0.m153202b(r2, r3)
            goto L_0x0191
        L_0x010b:
            if (r15 != r11) goto L_0x010f
            r0 = 1
            goto L_0x0110
        L_0x010f:
            r0 = 0
        L_0x0110:
            if (r0 == 0) goto L_0x0118
            boolean r0 = p869y0.C112312e0.m153201a(r2, r3)
            goto L_0x0191
        L_0x0118:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "This function should only be used for 1-D focus search"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x0124:
            if (r15 != r13) goto L_0x0128
            r0 = 1
            goto L_0x0129
        L_0x0128:
            r0 = 0
        L_0x0129:
            if (r0 == 0) goto L_0x012c
            goto L_0x012e
        L_0x012c:
            if (r15 != r12) goto L_0x0130
        L_0x012e:
            r0 = 1
            goto L_0x0131
        L_0x0130:
            r0 = 0
        L_0x0131:
            if (r0 == 0) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            if (r15 != r10) goto L_0x0138
        L_0x0136:
            r0 = 1
            goto L_0x0139
        L_0x0138:
            r0 = 0
        L_0x0139:
            if (r0 == 0) goto L_0x013c
            goto L_0x013e
        L_0x013c:
            if (r15 != r9) goto L_0x0140
        L_0x013e:
            r0 = 1
            goto L_0x0141
        L_0x0140:
            r0 = 0
        L_0x0141:
            if (r0 == 0) goto L_0x0148
            boolean r0 = p869y0.C112314f0.m153211h(r2, r15, r3)
            goto L_0x0191
        L_0x0148:
            if (r15 != r8) goto L_0x014c
            r0 = 1
            goto L_0x014d
        L_0x014c:
            r0 = 0
        L_0x014d:
            if (r0 == 0) goto L_0x016b
            int r0 = r6.ordinal()
            if (r0 == 0) goto L_0x015f
            if (r0 != r5) goto L_0x0159
            r0 = 3
            goto L_0x0160
        L_0x0159:
            rx3.j r15 = new rx3.j
            r15.<init>()
            throw r15
        L_0x015f:
            r0 = 4
        L_0x0160:
            y0.l r2 = p869y0.C112310d0.m153197b(r2)
            if (r2 == 0) goto L_0x0190
            boolean r0 = p869y0.C112314f0.m153211h(r2, r0, r3)
            goto L_0x0191
        L_0x016b:
            if (r15 != r7) goto L_0x016f
            r0 = 1
            goto L_0x0170
        L_0x016f:
            r0 = 0
        L_0x0170:
            if (r0 == 0) goto L_0x01e5
            y0.l r0 = p869y0.C112310d0.m153197b(r2)
            if (r0 == 0) goto L_0x017c
            y0.l r4 = p869y0.C112310d0.m153198c(r0)
        L_0x017c:
            boolean r0 = gy3.C87412m.m108589b(r4, r2)
            if (r0 != 0) goto L_0x0190
            if (r4 != 0) goto L_0x0185
            goto L_0x0190
        L_0x0185:
            java.lang.Object r0 = r3.invoke(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0191
        L_0x0190:
            r0 = 0
        L_0x0191:
            if (r0 != 0) goto L_0x01e3
            y0.l r0 = r14.f336326a
            y0.b0 r0 = r0.f336333g
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x01b0
            if (r0 == r5) goto L_0x01b0
            if (r0 == r11) goto L_0x01b0
            if (r0 == r13) goto L_0x01ae
            if (r0 == r12) goto L_0x01b0
            if (r0 != r10) goto L_0x01a8
            goto L_0x01ae
        L_0x01a8:
            rx3.j r15 = new rx3.j
            r15.<init>()
            throw r15
        L_0x01ae:
            r0 = 0
            goto L_0x01b1
        L_0x01b0:
            r0 = 1
        L_0x01b1:
            if (r0 == 0) goto L_0x01e0
            y0.l r0 = r14.f336326a
            y0.b0 r0 = r0.f336333g
            boolean r0 = r0.mo90559a()
            if (r0 == 0) goto L_0x01be
            goto L_0x01e0
        L_0x01be:
            if (r15 != r5) goto L_0x01c2
            r0 = 1
            goto L_0x01c3
        L_0x01c2:
            r0 = 0
        L_0x01c3:
            if (r0 == 0) goto L_0x01c6
            goto L_0x01c8
        L_0x01c6:
            if (r15 != r11) goto L_0x01ca
        L_0x01c8:
            r0 = 1
            goto L_0x01cb
        L_0x01ca:
            r0 = 0
        L_0x01cb:
            if (r0 == 0) goto L_0x01e0
            r14.mo90561b(r1)
            y0.l r0 = r14.f336326a
            y0.b0 r0 = r0.f336333g
            boolean r0 = r0.mo90559a()
            if (r0 != 0) goto L_0x01db
            goto L_0x01e0
        L_0x01db:
            boolean r15 = r14.mo90560a(r15)
            goto L_0x01e1
        L_0x01e0:
            r15 = 0
        L_0x01e1:
            if (r15 == 0) goto L_0x01e4
        L_0x01e3:
            r1 = 1
        L_0x01e4:
            return r1
        L_0x01e5:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid FocusDirection"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x01f1:
            gy3.C87412m.m108603p(r3)
            throw r4
        L_0x01f5:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "invalid FocusDirection"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x0201:
            gy3.C87412m.m108603p(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p869y0.C112318j.mo90560a(int):boolean");
    }

    /* renamed from: b */
    public void mo90561b(boolean z) {
        C112306b0 b0Var;
        C112321l lVar = this.f336326a;
        C112306b0 b0Var2 = lVar.f336333g;
        if (C112308c0.m153189c(lVar, z)) {
            C112321l lVar2 = this.f336326a;
            int ordinal = b0Var2.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                b0Var = C112306b0.Active;
            } else if (ordinal == 3 || ordinal == 4) {
                b0Var = C112306b0.Deactivated;
            } else if (ordinal == 5) {
                b0Var = C112306b0.Inactive;
            } else {
                throw new C13603j();
            }
            lVar2.mo164050b(b0Var);
        }
    }
}
