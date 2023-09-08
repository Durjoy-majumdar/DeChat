package il1;

import hp3.C87581a;
import rx3.C13604l;
import wx3.C15601d;

/* renamed from: il1.p1 */
public final class C9086p1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C15601d<C13604l<Boolean, String>> f28654a;

    /* renamed from: b */
    public final /* synthetic */ C9093q1 f28655b;

    public C9086p1(C15601d<? super C13604l<Boolean, String>> dVar, C9093q1 q1Var) {
        this.f28654a = dVar;
        this.f28655b = q1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (r3 == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f6, code lost:
        if (r3 == null) goto L_0x00f8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r8) {
        /*
            r7 = this;
            ob0.b$c r8 = (ob0.C89132b.C89134c) r8
            boolean r0 = bi1.C0283d.m246d(r8)
            r1 = 2131821584(0x7f110410, float:1.9275915E38)
            java.lang.String r2 = "FinderLiveChargeIncreaseDurationWidget"
            r3 = 0
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x00a6
            T r8 = r8.f256796d
            te3.w31 r8 = (te3.C51778w31) r8
            java.util.LinkedList<te3.nh0> r8 = r8.f143843d
            java.lang.String r0 = "resp.resp.ret_list"
            gy3.C87412m.m108593f(r8, r0)
            java.lang.Object r8 = sx3.C110818d0.m150916N(r8)
            te3.nh0 r8 = (te3.C50542nh0) r8
            if (r8 == 0) goto L_0x0029
            int r0 = r8.f138603e
            if (r0 != 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 == 0) goto L_0x004f
            wx3.d<rx3.l<java.lang.Boolean, java.lang.String>> r8 = r7.f28654a
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            rx3.l r0 = new rx3.l
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            il1.q1 r2 = r7.f28655b
            android.content.Context r2 = r2.f28669a
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131821585(0x7f110411, float:1.9275917E38)
            java.lang.String r2 = r2.getString(r3)
            r0.<init>(r1, r2)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
            r8.resumeWith(r0)
            goto L_0x011b
        L_0x004f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "modifyChargeFreeTimeDuration ret:"
            r0.append(r6)
            if (r8 != 0) goto L_0x005e
            java.lang.String r6 = ""
            goto L_0x005f
        L_0x005e:
            r6 = r8
        L_0x005f:
            org.json.JSONObject r6 = o40.C61937h.m72709h(r6)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            if (r8 == 0) goto L_0x0081
            java.lang.String r8 = r8.f138604f
            if (r8 == 0) goto L_0x0081
            int r0 = r8.length()
            if (r0 != 0) goto L_0x007a
            r4 = 1
        L_0x007a:
            r0 = r4 ^ 1
            if (r0 == 0) goto L_0x007f
            r3 = r8
        L_0x007f:
            if (r3 != 0) goto L_0x008d
        L_0x0081:
            il1.q1 r8 = r7.f28655b
            android.content.Context r8 = r8.f28669a
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r3 = r8.getString(r1)
        L_0x008d:
            java.lang.String r8 = "ret?.retMsg?.takeIf { !i…string.app_modify_failed)"
            gy3.C87412m.m108593f(r3, r8)
            wx3.d<rx3.l<java.lang.Boolean, java.lang.String>> r8 = r7.f28654a
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            rx3.l r0 = new rx3.l
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r1, r3)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
            r8.resumeWith(r0)
            goto L_0x011b
        L_0x00a6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "modifyChargeFreeTimeDuration errType "
            r0.append(r6)
            if (r8 == 0) goto L_0x00b9
            int r6 = r8.f256793a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x00ba
        L_0x00b9:
            r6 = r3
        L_0x00ba:
            r0.append(r6)
            java.lang.String r6 = ",errCode:"
            r0.append(r6)
            if (r8 == 0) goto L_0x00cb
            int r6 = r8.f256794b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x00cc
        L_0x00cb:
            r6 = r3
        L_0x00cc:
            r0.append(r6)
            java.lang.String r6 = ",errMsg:"
            r0.append(r6)
            if (r8 == 0) goto L_0x00d9
            java.lang.String r6 = r8.f256795c
            goto L_0x00da
        L_0x00d9:
            r6 = r3
        L_0x00da:
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            if (r8 == 0) goto L_0x00f8
            java.lang.String r8 = r8.f256795c
            if (r8 == 0) goto L_0x00f8
            int r0 = r8.length()
            if (r0 != 0) goto L_0x00f1
            r4 = 1
        L_0x00f1:
            r0 = r4 ^ 1
            if (r0 == 0) goto L_0x00f6
            r3 = r8
        L_0x00f6:
            if (r3 != 0) goto L_0x0109
        L_0x00f8:
            il1.q1 r8 = r7.f28655b
            android.content.Context r8 = r8.f28669a
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r3 = r8.getString(r1)
            java.lang.String r8 = "context.resources.getStr…string.app_modify_failed)"
            gy3.C87412m.m108593f(r3, r8)
        L_0x0109:
            wx3.d<rx3.l<java.lang.Boolean, java.lang.String>> r8 = r7.f28654a
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            rx3.l r0 = new rx3.l
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r1, r3)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
            r8.resumeWith(r0)
        L_0x011b:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C9086p1.call(java.lang.Object):java.lang.Object");
    }
}
