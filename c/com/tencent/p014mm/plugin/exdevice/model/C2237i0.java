package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.plugin.exdevice.model.C2242s0;

/* renamed from: com.tencent.mm.plugin.exdevice.model.i0 */
public class C2237i0 implements C2242s0.C2243a {

    /* renamed from: a */
    public final /* synthetic */ ExdeviceWCLanSDKUtil f12306a;

    public C2237i0(ExdeviceWCLanSDKUtil exdeviceWCLanSDKUtil) {
        this.f12306a = exdeviceWCLanSDKUtil;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2128a(int r7, java.lang.Object... r8) {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.exdevice.ExdeviceWCLanSDKUtil"
            r1 = 14
            if (r7 != r1) goto L_0x00cd
            if (r8 == 0) goto L_0x00cd
            int r7 = r8.length
            r1 = 1
            if (r7 < r1) goto L_0x00cd
            r7 = 0
            r8 = r8[r7]
            boolean r2 = r8 instanceof byte[]
            if (r2 != 0) goto L_0x0015
            goto L_0x00cd
        L_0x0015:
            byte[] r8 = (byte[]) r8
            r2 = 0
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x003b }
            r3.<init>(r8)     // Catch:{ Exception -> 0x003b }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x003b }
            r8.<init>(r3)     // Catch:{ Exception -> 0x003b }
            java.lang.String r3 = "deviceInfo"
            org.json.JSONObject r8 = r8.getJSONObject(r3)     // Catch:{ Exception -> 0x003b }
            java.lang.String r3 = "deviceType"
            java.lang.String r3 = r8.getString(r3)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r4 = "deviceId"
            java.lang.String r2 = r8.getString(r4)     // Catch:{ Exception -> 0x0035 }
            goto L_0x0048
        L_0x0035:
            r4 = move-exception
            goto L_0x003f
        L_0x0037:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L_0x003f
        L_0x003b:
            r8 = move-exception
            r4 = r8
            r8 = r2
            r3 = r8
        L_0x003f:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r7] = r4
            java.lang.String r4 = "JSON decode failed in get device profile callback %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r4, r5)
        L_0x0048:
            if (r3 == 0) goto L_0x00c8
            if (r2 != 0) goto L_0x004e
            goto L_0x00c8
        L_0x004e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "get device deviceType ="
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = ",deviceId = "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            z71.c r3 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            z71.b r3 = r3.mo74334bD(r2)
            if (r3 != 0) goto L_0x007e
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r7] = r2
            java.lang.String r7 = "hdInfo null, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r7, r8)
            return
        L_0x007e:
            com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil r7 = r6.f12306a
            java.util.HashMap<java.lang.String, byte[]> r7 = r7.f12291g
            java.lang.String r8 = r8.toString()
            byte[] r8 = r8.getBytes()
            r7.put(r2, r8)
            com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent r7 = new com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent
            r7.<init>()
            com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent$a r8 = r7.f9107d
            r8.f9108a = r2
            com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil r8 = r6.f12306a
            java.util.HashMap<java.lang.String, java.lang.String> r8 = r8.f12293i
            boolean r8 = r8.containsKey(r2)
            if (r8 == 0) goto L_0x00bf
            com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil r8 = r6.f12306a
            java.util.HashMap<java.lang.String, java.lang.String> r8 = r8.f12293i
            java.lang.Object r8 = r8.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r0 != 0) goto L_0x00b8
            com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent$a r0 = r7.f9107d
            byte[] r8 = r8.getBytes()
            r0.f9109b = r8
        L_0x00b8:
            com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil r8 = r6.f12306a
            java.util.HashMap<java.lang.String, java.lang.String> r8 = r8.f12293i
            r8.remove(r2)
        L_0x00bf:
            com.tencent.mm.autogen.events.ExDeviceLanDeviceScanResultEvent$a r8 = r7.f9107d
            r8.getClass()
            r7.publish()
            return
        L_0x00c8:
            java.lang.String r7 = "deviceType or deviceId is null in mWCLanGetDeviceProfileCallbackReceiver! "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r7)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C2237i0.mo2128a(int, java.lang.Object[]):void");
    }
}
