package kj1;

import android.content.Context;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import lj1.C10538e;
import nj3.C76874e0;
import ok1.C62042e;
import qo3.C77407n;
import rl1.C13022d0;

/* renamed from: kj1.t2 */
public final class C10234t2 extends C10538e {

    /* renamed from: h */
    public final String f31249h = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10234t2(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31249h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return mo10573y() || mo10572x();
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        int q = mo10524q();
        int i = e1Var.f30967N;
        if (q == i) {
            e0Var.mo107135b(i, C0966R.string.n9f, C0966R.raw.icons_outlined_winningrecord);
            return;
        }
        int i2 = e1Var.f30996o;
        if (q == i2) {
            e0Var.mo107135b(i2, C0966R.string.dy6, C0966R.raw.icons_outlined_winningrecord);
            return;
        }
        int i3 = e1Var.f30979Z;
        if (q == i3) {
            e0Var.mo107135b(i3, C0966R.string.n97, C0966R.raw.icons_outlined_winningrecord);
        }
    }

    /* renamed from: q */
    public int mo10524q() {
        if (mo10573y() && mo10572x()) {
            return this.f31809a.f30967N;
        }
        if (mo10573y()) {
            return this.f31809a.f30996o;
        }
        if (mo10572x()) {
            return this.f31809a.f30979Z;
        }
        return -1;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        C87412m.m108594g(e1Var, "<this>");
        int q = mo10524q();
        if (q == e1Var.f30967N) {
            C77407n nVar = new C77407n((Context) e1Var.f30985d, 1, true);
            nVar.f225771i = new C10218r2(e1Var);
            nVar.f225782p = new C10230s2(this, e1Var);
            nVar.mo107573q();
        } else if (q == e1Var.f30996o) {
            mo10571w(e1Var);
        } else if (q == e1Var.f30979Z) {
            mo10570v(e1Var);
        }
    }

    /* renamed from: v */
    public final void mo10570v(C10125e1 e1Var) {
        FinderJumpInfo finderJumpInfo = ((C54991o) e1Var.mo10534b(C54991o.class)).f154270V3;
        if (finderJumpInfo != null) {
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76780ML(e1Var.f30985d, finderJumpInfo, 0);
        }
        C62042e.f176370a.mo87013I1(7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x00b1, code lost:
        r15 = r15.f31008a;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10571w(kj1.C10125e1 r15) {
        /*
            r14 = this;
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            android.content.Intent r12 = new android.content.Intent
            r12.<init>()
            java.lang.String r1 = "KEY_LOTTERY_HISTORY_SCENE"
            r13 = 2
            r12.putExtra(r1, r13)
            androidx.lifecycle.i0 r1 = r15.mo10534b(r0)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            long r1 = r1.f182392d
            java.lang.String r3 = "KEY_LOTTERY_HISTORY_LIVE_ID"
            r12.putExtra(r3, r1)
            androidx.lifecycle.i0 r1 = r15.mo10534b(r0)
            cl1.u r1 = (cl1.C55001u) r1
            long r1 = r1.f154416j
            java.lang.String r3 = "KEY_LOTTERY_HISTORY_OBJECT_ID"
            r12.putExtra(r3, r1)
            androidx.lifecycle.i0 r1 = r15.mo10534b(r0)
            cl1.u r1 = (cl1.C55001u) r1
            java.lang.String r1 = r1.f154423t
            java.lang.String r2 = "KEY_LOTTERY_HISTORY_OBJECT_NONCE_ID"
            r12.putExtra(r2, r1)
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r1 = r15.mo10534b(r1)
            cl1.o r1 = (cl1.C54991o) r1
            java.lang.String r1 = r1.f154345o
            java.lang.String r2 = "KEY_LIVE_ANCHOR_USERNAME"
            r12.putExtra(r2, r1)
            java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r2 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            tf0.p1 r1 = (tf0.C64916p1) r1
            kj1.e1 r2 = r14.f31809a
            com.tencent.mm.ui.MMActivity r2 = r2.f30985d
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 124(0x7c, float:1.74E-43)
            r11 = 0
            r3 = r12
            tf0.C64916p1.C64917a.m76443j(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            java.lang.Class<tf0.o1> r1 = tf0.C13883o1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r2 = "getService(IActivityRouter::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            tf0.o1 r1 = (tf0.C13883o1) r1
            kj1.e1 r2 = r14.f31809a
            com.tencent.mm.ui.MMActivity r2 = r2.f30985d
            r3 = 0
            r1.mo13295yB(r2, r12, r3)
            androidx.lifecycle.i0 r0 = r15.mo10534b(r0)
            cl1.u r0 = (cl1.C55001u) r0
            byte[] r0 = r0.f154417n
            java.lang.String r1 = "KEY_LIVE_COOKIES"
            r12.putExtra(r1, r0)
            java.lang.String r0 = "KEY_LOTTERY_HISTORY_SOURCE"
            r12.putExtra(r0, r13)
            java.lang.Class<ak1.w> r0 = ak1.C54116w.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r1 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            r2 = r0
            ak1.w r2 = (ak1.C54116w) r2
            ak1.f0$v0 r3 = ak1.C54067f0.C0071v0.ENTER_WIN_RECORD_BY_RIGHH_CORNER
            r5 = 0
            r6 = 0
            r7 = 12
            r8 = 0
            java.lang.String r4 = ""
            ak1.C54116w.my0(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            kj1.e1$b r15 = r15.f30988g
            r1 = 0
            if (r15 == 0) goto L_0x00ba
            kj1.e1$a r15 = r15.f31008a
            if (r15 == 0) goto L_0x00ba
            android.view.View r15 = r15.mo10546f()
            goto L_0x00bb
        L_0x00ba:
            r15 = r1
        L_0x00bb:
            r2 = 25561(0x63d9, float:3.5819E-41)
            java.lang.String r3 = "finder_live_win_record_clk"
            r0.mo86153W7(r3, r15, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kj1.C10234t2.mo10571w(kj1.e1):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo10572x() {
        /*
            r4 = this;
            kj1.e1 r0 = r4.f31809a
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r0.mo10534b(r1)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r1 = r0.f154265U3
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x002d
            c50.b r1 = c50.C54655b.f153178f1
            if (r1 == 0) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            if (r1 != 0) goto L_0x0025
            i50.a r1 = i50.C60251a.f171781k1
            if (r1 == 0) goto L_0x001f
            r1 = 1
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r1 = 0
            goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            if (r1 != 0) goto L_0x002d
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r0.f154270V3
            if (r0 == 0) goto L_0x002d
            r2 = 1
        L_0x002d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kj1.C10234t2.mo10572x():boolean");
    }

    /* renamed from: y */
    public final boolean mo10573y() {
        return C87412m.m108589b(((C13022d0) this.f31809a.mo10534b(C13022d0.class)).f37101q.getValue(), Boolean.TRUE);
    }
}
