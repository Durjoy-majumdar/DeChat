package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.plugin.exdevice.model.C2242s0;

/* renamed from: com.tencent.mm.plugin.exdevice.model.h0 */
public class C2236h0 implements C2242s0.C2243a {

    /* renamed from: a */
    public final /* synthetic */ ExdeviceWCLanSDKUtil f12305a;

    public C2236h0(ExdeviceWCLanSDKUtil exdeviceWCLanSDKUtil) {
        this.f12305a = exdeviceWCLanSDKUtil;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2128a(int r7, java.lang.Object... r8) {
        /*
            r6 = this;
            java.lang.String r0 = "manufacturerData"
            java.lang.String r1 = "MicroMsg.exdevice.ExdeviceWCLanSDKUtil"
            r2 = 10
            if (r7 != r2) goto L_0x0099
            if (r8 != 0) goto L_0x000c
            goto L_0x0099
        L_0x000c:
            r7 = 0
            r8 = r8[r7]
            byte[] r8 = (byte[]) r8
            r2 = 0
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x007e }
            r3.<init>(r8)     // Catch:{ Exception -> 0x007e }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x007e }
            r8.<init>(r3)     // Catch:{ Exception -> 0x007e }
            java.lang.String r3 = "deviceInfo"
            org.json.JSONObject r3 = r8.getJSONObject(r3)     // Catch:{ Exception -> 0x007e }
            java.lang.String r4 = "deviceType"
            java.lang.String r4 = r3.getString(r4)     // Catch:{ Exception -> 0x007e }
            java.lang.String r5 = "deviceId"
            java.lang.String r2 = r3.getString(r5)     // Catch:{ Exception -> 0x007a }
            boolean r3 = r8.isNull(r0)     // Catch:{ Exception -> 0x007a }
            if (r3 != 0) goto L_0x003f
            java.lang.String r8 = r8.getString(r0)     // Catch:{ Exception -> 0x007a }
            com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil r0 = r6.f12305a     // Catch:{ Exception -> 0x007a }
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.f12293i     // Catch:{ Exception -> 0x007a }
            r0.put(r2, r8)     // Catch:{ Exception -> 0x007a }
        L_0x003f:
            com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent r8 = new com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent     // Catch:{ Exception -> 0x007a }
            r8.<init>()     // Catch:{ Exception -> 0x007a }
            com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent$a r0 = r8.f9107d     // Catch:{ Exception -> 0x007a }
            r0.f9108a = r2     // Catch:{ Exception -> 0x007a }
            com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil r0 = r6.f12305a     // Catch:{ Exception -> 0x007a }
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.f12293i     // Catch:{ Exception -> 0x007a }
            boolean r0 = r0.containsKey(r2)     // Catch:{ Exception -> 0x007a }
            if (r0 == 0) goto L_0x0071
            com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil r0 = r6.f12305a     // Catch:{ Exception -> 0x007a }
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.f12293i     // Catch:{ Exception -> 0x007a }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x007a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x007a }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x007a }
            if (r3 != 0) goto L_0x006a
            com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent$a r3 = r8.f9107d     // Catch:{ Exception -> 0x007a }
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x007a }
            r3.f9109b = r0     // Catch:{ Exception -> 0x007a }
        L_0x006a:
            com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil r0 = r6.f12305a     // Catch:{ Exception -> 0x007a }
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.f12293i     // Catch:{ Exception -> 0x007a }
            r0.remove(r2)     // Catch:{ Exception -> 0x007a }
        L_0x0071:
            com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent$a r0 = r8.f9107d     // Catch:{ Exception -> 0x007a }
            r0.getClass()     // Catch:{ Exception -> 0x007a }
            r8.publish()     // Catch:{ Exception -> 0x007a }
            goto L_0x008e
        L_0x007a:
            r8 = move-exception
            r0 = r2
            r2 = r4
            goto L_0x0080
        L_0x007e:
            r8 = move-exception
            r0 = r2
        L_0x0080:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r8, r3, r7)
            java.lang.String r7 = "json decode failed in disc package callback!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r7)
            r4 = r2
            r2 = r0
        L_0x008e:
            if (r4 == 0) goto L_0x0094
            if (r2 != 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            return
        L_0x0094:
            java.lang.String r7 = "deviceType or deviceId is null in mWCLanDeviceDiscPackageCallbackReceiver! "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r7)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C2236h0.mo2128a(int, java.lang.Object[]):void");
    }
}
