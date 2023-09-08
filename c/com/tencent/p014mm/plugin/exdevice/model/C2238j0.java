package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.plugin.exdevice.model.C2242s0;

/* renamed from: com.tencent.mm.plugin.exdevice.model.j0 */
public class C2238j0 implements C2242s0.C2243a {

    /* renamed from: a */
    public final /* synthetic */ ExdeviceWCLanSDKUtil f12307a;

    public C2238j0(ExdeviceWCLanSDKUtil exdeviceWCLanSDKUtil) {
        this.f12307a = exdeviceWCLanSDKUtil;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2128a(int r9, java.lang.Object... r10) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.exdevice.ExdeviceWCLanSDKUtil"
            r1 = 13
            if (r9 != r1) goto L_0x0090
            if (r10 == 0) goto L_0x0090
            int r9 = r10.length
            r1 = 2
            if (r9 < r1) goto L_0x0090
            r9 = 0
            r2 = r10[r9]
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x0090
            r3 = 1
            r10 = r10[r3]
            boolean r4 = r10 instanceof java.lang.Integer
            if (r4 != 0) goto L_0x001c
            goto L_0x0090
        L_0x001c:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r4 = 0
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x003e }
            r5.<init>(r2)     // Catch:{ Exception -> 0x003e }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x003e }
            r2.<init>(r5)     // Catch:{ Exception -> 0x003e }
            java.lang.String r5 = "deviceId"
            java.lang.String r5 = r2.getString(r5)     // Catch:{ Exception -> 0x003e }
            java.lang.String r6 = "deviceType"
            java.lang.String r4 = r2.getString(r6)     // Catch:{ Exception -> 0x003c }
            goto L_0x004c
        L_0x003c:
            r2 = move-exception
            goto L_0x0040
        L_0x003e:
            r2 = move-exception
            r5 = r4
        L_0x0040:
            java.lang.Object[] r6 = new java.lang.Object[r9]
            java.lang.String r7 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r7, r6)
            java.lang.String r2 = "JSON decode failed in device ConnState notify callback"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
        L_0x004c:
            if (r10 == r3) goto L_0x005f
            com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil r10 = r8.f12307a
            r10.f12299o = r9
            java.util.HashMap<java.lang.String, java.lang.Boolean> r9 = r10.f12292h
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r9.put(r5, r10)
            java.lang.String r9 = "device disconnect!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            goto L_0x006f
        L_0x005f:
            com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil r9 = r8.f12307a
            r9.f12299o = r1
            java.util.HashMap<java.lang.String, java.lang.Boolean> r9 = r9.f12292h
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r9.put(r5, r10)
            java.lang.String r9 = "device connect!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
        L_0x006f:
            com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil r9 = r8.f12307a
            boolean r10 = r9.f12298n
            if (r10 == 0) goto L_0x0090
            int r10 = r9.f12299o
            if (r10 != r1) goto L_0x007c
            r9.mo2126a(r3, r5)
        L_0x007c:
            com.tencent.mm.autogen.events.ExDeviceLanDeviceConnectStateEvent r9 = new com.tencent.mm.autogen.events.ExDeviceLanDeviceConnectStateEvent
            r9.<init>()
            com.tencent.mm.autogen.events.ExDeviceLanDeviceConnectStateEvent$a r10 = r9.f9103d
            r10.f9104a = r5
            com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil r0 = r8.f12307a
            int r0 = r0.f12299o
            r10.f9105b = r0
            r10.f9106c = r4
            r9.publish()
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C2238j0.mo2128a(int, java.lang.Object[]):void");
    }
}
