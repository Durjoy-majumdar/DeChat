package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.i */
public class C68618i extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 1192;
    private static final String NAME = "operateWxappStarItem";

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0112  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r19, org.json.JSONObject r20, int r21) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r0 = r20
            r3 = r21
            java.lang.Class<ky2.i> r4 = ky2.C10432i.class
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.h1> r5 = com.tencent.p014mm.plugin.appbrand.appusage.C68585h1.class
            if (r2 == 0) goto L_0x015b
            if (r0 != 0) goto L_0x0012
            goto L_0x015b
        L_0x0012:
            java.lang.String r6 = "actionType"
            int r7 = r0.optInt(r6)
            java.lang.String r8 = "username"
            java.lang.String r0 = r0.optString(r8)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r8 == 0) goto L_0x0026
            return
        L_0x0026:
            java.lang.String r8 = "ok"
            java.lang.String r9 = "errno"
            java.lang.String r10 = "makeReturnJson, errno: %d, reason: %s"
            java.lang.String r11 = "MicroMsg.AppBrandJsApi"
            r12 = 2
            r13 = 1
            r14 = 0
            if (r7 == r13) goto L_0x0122
            if (r7 == r12) goto L_0x006a
            r15 = 3
            if (r7 == r15) goto L_0x006a
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r4 = "fail:jsapi invalid request data"
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r5 == 0) goto L_0x004d
            java.lang.Object[] r5 = new java.lang.Object[r12]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r5[r14] = r6
            r5[r13] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r10, r5)
        L_0x004d:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r5.put(r9, r0)     // Catch:{ Exception -> 0x0056 }
            goto L_0x0061
        L_0x0056:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r14] = r6
            java.lang.String r6 = "makeReturnJson with JSONObject, put errno, e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r6, r0)
        L_0x0061:
            java.lang.String r0 = r1.mo115115p(r4, r5)
            r2.mo109647a(r3, r0)
            goto L_0x015b
        L_0x006a:
            di3.d r15 = di3.C86312j.m106911c(r5)
            com.tencent.mm.plugin.appbrand.appusage.h1 r15 = (com.tencent.p014mm.plugin.appbrand.appusage.C68585h1) r15
            boolean r15 = r15.mo94243l8(r0, r14)
            java.lang.String r12 = "MicroMsg.AppBrand.operateStarItem"
            if (r15 != 0) goto L_0x00b4
            di3.d r16 = di3.C86312j.m106911c(r4)
            ky2.i r16 = (ky2.C10432i) r16
            boolean r16 = r16.mo10750e()
            di3.d r17 = di3.C86312j.m106911c(r4)
            ky2.i r17 = (ky2.C10432i) r17
            int r14 = r17.Oh0()
            if (r16 != 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            if (r14 != r13) goto L_0x0093
        L_0x0091:
            r14 = 1
            goto L_0x0094
        L_0x0093:
            r14 = 0
        L_0x0094:
            if (r14 != 0) goto L_0x00b4
            di3.d r0 = di3.C86312j.m106911c(r4)
            ky2.i r0 = (ky2.C10432i) r0
            android.content.Context r4 = r19.getContext()
            if (r4 != 0) goto L_0x00a7
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            goto L_0x00ab
        L_0x00a7:
            android.content.Context r4 = r19.getContext()
        L_0x00ab:
            r0.mo10755m4(r4)
            java.lang.String r0 = "TeenMode forbid add"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            goto L_0x00e8
        L_0x00b4:
            if (r15 == 0) goto L_0x00cf
            di3.d r4 = di3.C86312j.m106911c(r5)
            com.tencent.mm.plugin.appbrand.appusage.h1 r4 = (com.tencent.p014mm.plugin.appbrand.appusage.C68585h1) r4
            r14 = 0
            boolean r0 = r4.mo94244mJ(r0, r14)
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = "remove collection success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            goto L_0x00e6
        L_0x00c9:
            java.lang.String r0 = "remove collection fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            goto L_0x00e8
        L_0x00cf:
            r14 = 0
            di3.d r4 = di3.C86312j.m106911c(r5)
            com.tencent.mm.plugin.appbrand.appusage.h1 r4 = (com.tencent.p014mm.plugin.appbrand.appusage.C68585h1) r4
            int r0 = r4.rg0(r0, r14)
            java.lang.String r4 = "add collection"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
            r4 = -3
            if (r0 == r4) goto L_0x00e8
            if (r0 == 0) goto L_0x00e6
            r0 = 2
            goto L_0x00e9
        L_0x00e6:
            r0 = 0
            goto L_0x00e9
        L_0x00e8:
            r0 = 1
        L_0x00e9:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r4.put(r6, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r5 = "errCode"
            r4.put(r5, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x0112
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r6 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r0[r6] = r5
            r0[r13] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r10, r0)
            goto L_0x0113
        L_0x0112:
            r6 = 0
        L_0x0113:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r4.put(r9, r0)
            java.lang.String r0 = r1.mo115114o(r8, r4)
            r2.mo109647a(r3, r0)
            goto L_0x015b
        L_0x0122:
            r6 = 0
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            di3.d r5 = di3.C86312j.m106911c(r5)
            com.tencent.mm.plugin.appbrand.appusage.h1 r5 = (com.tencent.p014mm.plugin.appbrand.appusage.C68585h1) r5
            boolean r0 = r5.mo94243l8(r0, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r5 = "isItemStared"
            r4.put(r5, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r0 == 0) goto L_0x014d
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r0[r6] = r5
            r0[r13] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r10, r0)
        L_0x014d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r4.put(r9, r0)
            java.lang.String r0 = r1.mo115114o(r8, r4)
            r2.mo109647a(r3, r0)
        L_0x015b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.profile.C68618i.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
