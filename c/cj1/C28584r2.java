package cj1;

import android.content.Context;
import android.content.Intent;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: cj1.r2 */
public final class C28584r2 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54738b1 f78453d;

    /* renamed from: e */
    public final /* synthetic */ Context f78454e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<String> f78455f;

    /* renamed from: g */
    public final /* synthetic */ Intent f78456g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28584r2(C54738b1 b1Var, Context context, C8479f0<String> f0Var, Intent intent) {
        super(1);
        this.f78453d = b1Var;
        this.f78454e = context;
        this.f78455f = f0Var;
        this.f78456g = intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r2 = ((cl1.C55001u) r2.mo71262a(cl1.C55001u.class)).f154420q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r14.booleanValue()
            java.lang.Class<ir.n> r14 = p565ir.C60606n.class
            cj1.b1 r0 = r13.f78453d
            com.tencent.mm.live.api.LiveConfig r0 = r0.mo75635d()
            java.lang.String r1 = "Finder.LiveJumpChecker"
            if (r0 == 0) goto L_0x00b0
            long r2 = r0.f157064e
            r4 = 0
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x004c
            fj1.b r2 = fj1.C45795b.f123698n
            if (r2 == 0) goto L_0x0034
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            androidx.lifecycle.i0 r2 = r2.mo71262a(r3)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            if (r2 == 0) goto L_0x0034
            long r3 = r0.f157064e
            long r7 = r2.f182392d
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r0 == 0) goto L_0x004c
            cj1.k2 r7 = cj1.C54781k2.f153552a
            android.content.Context r8 = r13.f78454e
            cj1.b1 r9 = r13.f78453d
            gy3.f0<java.lang.String> r14 = r13.f78455f
            T r14 = r14.f27484d
            r10 = r14
            java.lang.String r10 = (java.lang.String) r10
            android.content.Intent r12 = r13.f78456g
            java.lang.String r11 = ""
            r7.mo75689j(r8, r9, r10, r11, r12)
            goto L_0x00b5
        L_0x004c:
            di3.d r0 = di3.C86312j.m106911c(r14)
            ir.n r0 = (p565ir.C60606n) r0
            boolean r0 = r0.mo85017L5()
            if (r0 == 0) goto L_0x007e
            android.content.Context r14 = r13.f78454e
            android.content.res.Resources r0 = r14.getResources()
            r2 = 2131826238(0x7f11163e, float:1.9285355E38)
            java.lang.String r0 = r0.getString(r2)
            android.widget.Toast r14 = nj3.C76912y0.makeText((android.content.Context) r14, (java.lang.CharSequence) r0, (int) r6)
            r14.show()
            android.content.Context r14 = r13.f78454e
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getString(r2)
            java.lang.String r14 = java.lang.String.valueOf(r14)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
            goto L_0x00b5
        L_0x007e:
            di3.d r14 = di3.C86312j.m106911c(r14)
            ir.n r14 = (p565ir.C60606n) r14
            boolean r14 = r14.mo85002F()
            if (r14 == 0) goto L_0x00b5
            android.content.Context r14 = r13.f78454e
            android.content.res.Resources r0 = r14.getResources()
            r2 = 2131827263(0x7f111a3f, float:1.9287434E38)
            java.lang.String r0 = r0.getString(r2)
            android.widget.Toast r14 = nj3.C76912y0.makeText((android.content.Context) r14, (java.lang.CharSequence) r0, (int) r6)
            r14.show()
            android.content.Context r14 = r13.f78454e
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getString(r2)
            java.lang.String r14 = java.lang.String.valueOf(r14)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
            goto L_0x00b5
        L_0x00b0:
            java.lang.String r14 = "jumpAnchorLiveUI Fail! liveConfig == null !!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r14)
        L_0x00b5:
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C28584r2.invoke(java.lang.Object):java.lang.Object");
    }
}
