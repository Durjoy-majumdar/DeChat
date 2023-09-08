package hi0;

import te3.e75;
import te3.k75;

/* renamed from: hi0.h */
public final class C32918h extends C87491a<Boolean, k75> {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r8 = r8.f136602d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo58858b(java.lang.String r6, java.lang.String r7, java.lang.Object r8) {
        /*
            r5 = this;
            te3.k75 r8 = (te3.k75) r8
            java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage> r6 = com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage.class
            java.lang.Object r6 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r6)
            com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage r6 = (com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage) r6
            r0 = 0
            if (r8 == 0) goto L_0x0014
            te3.e75 r8 = r8.f136602d
            if (r8 == 0) goto L_0x0014
            int r8 = r8.f132768f
            goto L_0x0015
        L_0x0014:
            r8 = 0
        L_0x0015:
            r6.getClass()
            if (r7 == 0) goto L_0x0023
            int r1 = r7.length()
            if (r1 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 0
            goto L_0x0024
        L_0x0023:
            r1 = 1
        L_0x0024:
            if (r1 == 0) goto L_0x0027
            goto L_0x005e
        L_0x0027:
            com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage$b r0 = com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage.f79982e
            r1 = -1
            if (r0 == 0) goto L_0x0043
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x003b
            int r0 = eb0.C31543z5.m39455e()     // Catch:{ Exception -> 0x0039 }
            long r0 = (long) r0
            goto L_0x0042
        L_0x0039:
            goto L_0x0043
        L_0x003b:
            long r0 = eb0.C31543z5.m39452b()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
        L_0x0042:
            r1 = r0
        L_0x0043:
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x004d
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
        L_0x004d:
            com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage$c r6 = r6.f79985b
            ki0.g r0 = new ki0.g
            r0.<init>()
            r0.field_appId = r7
            r0.field_timestamp = r1
            r0.field_reportId = r8
            boolean r0 = r6.replace(r0)
        L_0x005e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            boolean r8 = r6.booleanValue()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "call appId:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = ", ret:"
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = r0.toString()
            java.lang.String r8 = "MicroMsg.AppBrand.CmdInvalidCode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hi0.C32918h.mo58858b(java.lang.String, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* renamed from: d */
    public e75 mo58859d(Object obj) {
        k75 k75 = (k75) obj;
        if (k75 != null) {
            return k75.f136602d;
        }
        return null;
    }

    /* renamed from: e */
    public String mo58860e() {
        return "CmdInvalidCode";
    }
}
