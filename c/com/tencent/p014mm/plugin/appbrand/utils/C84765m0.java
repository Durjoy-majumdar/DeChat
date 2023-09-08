package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/utils/m0;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.utils.m0 */
final class C84765m0 implements C80916r<IPCVoid, IPCString> {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r9) {
        /*
            r8 = this;
            com.tencent.mm.ipcinvoker.type.IPCVoid r9 = (com.tencent.p014mm.ipcinvoker.type.IPCVoid) r9
            java.lang.String r9 = "MicroMsg.AppBrandVoipHelper"
            java.lang.Class<vz.f> r0 = p734vz.C90876f.class
            r1 = 1
            r2 = 0
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x003c }
            java.lang.String r4 = "phone"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x003c }
            java.lang.String r4 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            gy3.C87412m.m108592e(r3, r4)     // Catch:{ Exception -> 0x003c }
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ Exception -> 0x003c }
            int r3 = r3.getCallState()     // Catch:{ Exception -> 0x003c }
            r4 = 2
            if (r3 == r1) goto L_0x0025
            if (r3 == r4) goto L_0x0025
            r5 = 0
            goto L_0x0026
        L_0x0025:
            r5 = 1
        L_0x0026:
            java.lang.String r6 = "isPhoneInUse, isPhoneInUse:%s, callState:%s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x003a }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x003a }
            r4[r2] = r7     // Catch:{ Exception -> 0x003a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x003a }
            r4[r1] = r3     // Catch:{ Exception -> 0x003a }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r6, r4)     // Catch:{ Exception -> 0x003a }
            goto L_0x0047
        L_0x003a:
            r3 = move-exception
            goto L_0x003e
        L_0x003c:
            r3 = move-exception
            r5 = 0
        L_0x003e:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r2] = r3
            java.lang.String r6 = "isPhoneInUse, exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r3, r6, r4)
        L_0x0047:
            if (r5 == 0) goto L_0x005b
            com.tencent.mm.ipcinvoker.type.IPCString r9 = new com.tencent.mm.ipcinvoker.type.IPCString
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 2131831439(0x7f112a8f, float:1.9295904E38)
            java.lang.String r0 = r0.getString(r1)
            r9.<init>(r0)
            goto L_0x00f4
        L_0x005b:
            di3.d r3 = di3.C86312j.m106911c(r0)
            vz.f r3 = (p734vz.C90876f) r3
            boolean r3 = r3.mo124867WV()
            if (r3 != 0) goto L_0x00e4
            di3.d r3 = di3.C86312j.m106911c(r0)
            vz.f r3 = (p734vz.C90876f) r3
            boolean r3 = r3.mo124868Wj()
            if (r3 != 0) goto L_0x00e4
            boolean r3 = p182kk.C61104a.m71644D()
            if (r3 == 0) goto L_0x007a
            goto L_0x00e4
        L_0x007a:
            di3.d r0 = di3.C86312j.m106911c(r0)
            vz.f r0 = (p734vz.C90876f) r0
            boolean r0 = r0.mo124869yj()
            if (r0 != 0) goto L_0x00d3
            java.lang.Class<com.tencent.mm.plugin.appbrand.backgroundrunning.s> r0 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81591s.class
            boolean r3 = di3.C86312j.m106916h(r0)
            if (r3 == 0) goto L_0x00c7
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.appbrand.backgroundrunning.s r0 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81591s) r0
            java.util.List r0 = r0.mo113854fA()
            java.util.Iterator r0 = r0.iterator()
        L_0x009c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00c7
            java.lang.Object r3 = r0.next()
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp r3 = (com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) r3
            int r4 = r3.f239209f
            r5 = 4
            boolean r4 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81583j.m100070b(r4, r5)
            if (r4 == 0) goto L_0x00b7
            java.lang.String r0 = "isAnyAppInVOIP, already exist wxa using VOIP"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            goto L_0x00c8
        L_0x00b7:
            int r3 = r3.f239209f
            r4 = 16
            boolean r3 = com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81583j.m100070b(r3, r4)
            if (r3 == 0) goto L_0x009c
            java.lang.String r0 = "isAnyAppInVOIP, already exist wxa using VOIP 1v1"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            goto L_0x00c8
        L_0x00c7:
            r1 = 0
        L_0x00c8:
            if (r1 == 0) goto L_0x00cb
            goto L_0x00d3
        L_0x00cb:
            com.tencent.mm.ipcinvoker.type.IPCString r9 = new com.tencent.mm.ipcinvoker.type.IPCString
            java.lang.String r0 = ""
            r9.<init>(r0)
            goto L_0x00f4
        L_0x00d3:
            com.tencent.mm.ipcinvoker.type.IPCString r9 = new com.tencent.mm.ipcinvoker.type.IPCString
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 2131831442(0x7f112a92, float:1.929591E38)
            java.lang.String r0 = r0.getString(r1)
            r9.<init>(r0)
            goto L_0x00f4
        L_0x00e4:
            com.tencent.mm.ipcinvoker.type.IPCString r9 = new com.tencent.mm.ipcinvoker.type.IPCString
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 2131831443(0x7f112a93, float:1.9295912E38)
            java.lang.String r0 = r0.getString(r1)
            r9.<init>(r0)
        L_0x00f4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.utils.C84765m0.invoke(java.lang.Object):java.lang.Object");
    }
}
