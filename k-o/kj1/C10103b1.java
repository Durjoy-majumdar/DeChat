package kj1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import lj1.C10538e;
import nj3.C76874e0;

/* renamed from: kj1.b1 */
public final class C10103b1 extends C10538e {

    /* renamed from: h */
    public final int f30908h;

    /* renamed from: i */
    public final String f30909i = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10103b1(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f30908h = e1Var.f31001t;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f30909i;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return C85875k4.m106197n0() && (C85875k4.m106154K(this.f31809a.f30985d.getTaskId()) || C85875k4.m106199o0());
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        if (C85875k4.m106209x(e1Var.f30985d.getTaskId()) || C85861e4.m106115b(e1Var.f30985d)) {
            e0Var.mo107144g(this.f30908h, MMApplicationContext.getContext().getString(C0966R.string.bfn), C0966R.raw.icons_outlined_merge);
        } else {
            e0Var.mo107144g(this.f30908h, MMApplicationContext.getContext().getString(C0966R.string.f361404jm3), C0966R.raw.icons_outlined_sperated);
        }
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f30908h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        r7 = r6.f153423l;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10525t(kj1.C10125e1 r11) {
        /*
            r10 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            java.lang.String r2 = "<this>"
            gy3.C87412m.m108594g(r11, r2)
            kj1.e1 r2 = r10.f31809a
            com.tencent.mm.ui.MMActivity r2 = r2.f30985d
            com.tencent.mm.ui.MMActivity r3 = r11.f30985d
            android.content.Intent r3 = r3.getIntent()
            r4 = 0
            if (r3 != 0) goto L_0x001e
            java.lang.String r3 = r11.f30980a
            java.lang.String r5 = "checkAnchorSplitScreen intent null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            goto L_0x004c
        L_0x001e:
            ok1.e r5 = ok1.C62042e.f176370a
            boolean r5 = r5.mo87030O0()
            if (r5 == 0) goto L_0x004c
            cj1.b1$a r5 = cj1.C54738b1.f153409B
            cj1.b1 r6 = r5.mo560b(r3)
            if (r6 == 0) goto L_0x0039
            java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r7 = r6.f153423l
            if (r7 == 0) goto L_0x0039
            java.lang.Object r7 = sx3.C110818d0.m150916N(r7)
            com.tencent.mm.live.api.LiveConfig r7 = (com.tencent.p014mm.live.api.LiveConfig) r7
            goto L_0x003a
        L_0x0039:
            r7 = r4
        L_0x003a:
            if (r7 != 0) goto L_0x003d
            goto L_0x0049
        L_0x003d:
            androidx.lifecycle.i0 r8 = r11.mo10534b(r1)
            cl1.u r8 = (cl1.C55001u) r8
            te3.c21 r8 = r8.f154420q
            long r8 = r8.f182392d
            r7.f157064e = r8
        L_0x0049:
            r5.mo562d(r3, r6)
        L_0x004c:
            r11.mo10538f()
            androidx.lifecycle.i0 r3 = r11.mo10534b(r0)
            cl1.o r3 = (cl1.C54991o) r3
            r5 = 1
            r3.f154334k3 = r5
            int r3 = r2.getTaskId()
            com.tencent.p014mm.p136ui.C85878m2.m106216e(r3, r4)
            boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106199o0()
            if (r3 == 0) goto L_0x00bb
            com.tencent.mm.ui.MMActivity r3 = r11.f30985d
            android.content.Intent r3 = r3.getIntent()
            if (r3 != 0) goto L_0x0075
            java.lang.String r11 = r11.f30980a
            java.lang.String r0 = "checkVisitorSplitScreen intent null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            goto L_0x00bb
        L_0x0075:
            fj1.b r11 = fj1.C45795b.f123698n
            if (r11 == 0) goto L_0x00bb
            androidx.lifecycle.i0 r11 = r11.mo71262a(r1)
            cl1.u r11 = (cl1.C55001u) r11
            com.tencent.mm.live.api.LiveConfig$b r1 = new com.tencent.mm.live.api.LiveConfig$b
            r1.<init>()
            r1.f157091a = r5
            te3.c21 r6 = r11.f154420q
            long r6 = r6.f182392d
            r1.f157093c = r6
            java.lang.String r6 = r11.f154423t
            r1.f157106p = r6
            long r6 = r11.f154416j
            r1.f157101k = r6
            androidx.lifecycle.i0 r6 = r11.business(r0)
            cl1.o r6 = (cl1.C54991o) r6
            java.lang.String r6 = r6.f154345o
            r1.f157096f = r6
            androidx.lifecycle.i0 r11 = r11.business(r0)
            cl1.o r11 = (cl1.C54991o) r11
            java.lang.String r11 = r11.f154252S0
            r1.f157102l = r11
            com.tencent.mm.live.api.LiveConfig r11 = r1.mo76374a()
            cj1.b1 r0 = new cj1.b1
            r0.<init>()
            java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r1 = r0.f153423l
            r1.add(r11)
            cj1.b1$a r11 = cj1.C54738b1.f153409B
            r11.mo562d(r3, r0)
        L_0x00bb:
            com.tencent.p014mm.p136ui.C85861e4.m106119f(r2, r5, r5, r4)
            boolean r11 = com.tencent.p014mm.p136ui.C85875k4.m106199o0()
            if (r11 == 0) goto L_0x00cf
            android.content.Intent r11 = r2.getIntent()
            if (r11 == 0) goto L_0x00cf
            java.lang.String r0 = "KEY_PARAMS_FROM_SPLIT_SCREEN"
            r11.putExtra(r0, r5)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kj1.C10103b1.mo10525t(kj1.e1):void");
    }
}
