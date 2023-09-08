package kj1;

import ak1.C54067f0;
import ak1.C54116w;
import al1.C0084x;
import android.os.Bundle;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import di3.C86312j;
import gy3.C87412m;
import lj1.C10538e;
import nj3.C76874e0;
import sk1.C63947a;

/* renamed from: kj1.c2 */
public final class C10112c2 extends C10538e {

    /* renamed from: h */
    public final int f30925h;

    /* renamed from: i */
    public final String f30926i = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10112c2(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f30925h = e1Var.f30998q;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f30926i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        r1 = (r1 = r1.f166251b).f166244n;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10519k() {
        /*
            r4 = this;
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            kj1.e1 r2 = r4.f31809a
            androidx.lifecycle.i0 r2 = r2.mo10534b(r1)
            cl1.o r2 = (cl1.C54991o) r2
            int r2 = r2.f154388y0
            r3 = 2048(0x800, float:2.87E-42)
            boolean r2 = o40.C61926c.m72696u(r2, r3)
            if (r2 == 0) goto L_0x005a
            kj1.e1 r2 = r4.f31809a
            androidx.lifecycle.i0 r1 = r2.mo10534b(r1)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.f154186C
            if (r1 == 0) goto L_0x005a
            kj1.e1 r1 = r4.f31809a
            androidx.lifecycle.i0 r1 = r1.mo10534b(r0)
            cl1.u r1 = (cl1.C55001u) r1
            d50.h r1 = r1.f154421r
            if (r1 == 0) goto L_0x0039
            d50.g r1 = r1.f166251b
            if (r1 == 0) goto L_0x0039
            te3.zp2 r1 = r1.f166244n
            if (r1 == 0) goto L_0x0039
            java.lang.String r1 = r1.f186828z
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x005a
            java.lang.Class<ir.n> r1 = p565ir.C60606n.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ir.n r1 = (p565ir.C60606n) r1
            kj1.e1 r2 = r4.f31809a
            androidx.lifecycle.i0 r0 = r2.mo10534b(r0)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            boolean r0 = r1.mo85075nB(r0)
            if (r0 != 0) goto L_0x005a
            r0 = 1
            goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kj1.C10112c2.mo10519k():boolean");
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        String str;
        boolean z;
        Class cls = C54991o.class;
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        String str2 = e1Var.f30980a;
        Log.m105924i(str2, "prepareVisitorMenuItems liveInfo:" + C63947a.f181274a.mo88736v(((C55001u) e1Var.mo10534b(C55001u.class)).f154420q));
        if (((C54991o) e1Var.mo10534b(cls)).f154228M2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(MMApplicationContext.getContext().getResources().getString(C0966R.string.dib));
            sb.append(10);
            C0084x xVar = ((C54991o) e1Var.mo10534b(cls)).f154228M2;
            sb.append(xVar != null ? xVar.f515a : null);
            str = sb.toString();
        } else {
            str = MMApplicationContext.getContext().getResources().getString(C0966R.string.dx4);
            C87412m.m108593f(str, "{\n            MMApplicat…on_cast_screen)\n        }");
        }
        String str3 = str;
        int i = this.f30925h;
        int color = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2939n);
        if (((C54991o) e1Var.mo10534b(cls)).f154341n != null) {
            FinderObject finderObject = ((C54991o) e1Var.mo10534b(cls)).f154341n;
            if (!(finderObject != null && finderObject.f164794id == 0)) {
                z = false;
                e0Var.mo107150j(i, str3, C0966R.raw.finder_live_icons_outlined_cast_screen, color, z);
                ((C54116w) C86312j.m106911c(C54116w.class)).Mx0(C54067f0.C0055f.CAST_SCREEN_EXPOSE);
            }
        }
        z = true;
        e0Var.mo107150j(i, str3, C0966R.raw.finder_live_icons_outlined_cast_screen, color, z);
        ((C54116w) C86312j.m106911c(C54116w.class)).Mx0(C54067f0.C0055f.CAST_SCREEN_EXPOSE);
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f30925h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        C87412m.m108594g(e1Var, "<this>");
        ((C54116w) C86312j.m106911c(C54116w.class)).Mx0(C54067f0.C0055f.CAST_SCREEN_CLICK_MENU);
        e1Var.mo10539g(C58124b.C58125b.FINDER_LIVE_CAST_SCREEN_SHOW, (Bundle) null);
    }
}
