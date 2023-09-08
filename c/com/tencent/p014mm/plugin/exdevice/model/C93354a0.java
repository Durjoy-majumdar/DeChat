package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.plugin.exdevice.model.C2242s0;

/* renamed from: com.tencent.mm.plugin.exdevice.model.a0 */
public class C93354a0 implements C2242s0.C2243a {

    /* renamed from: a */
    public final /* synthetic */ C93367y f269398a;

    public C93354a0(C93367y yVar) {
        this.f269398a = yVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2128a(int r8, java.lang.Object... r9) {
        /*
            r7 = this;
            java.lang.String r0 = "profile"
            java.lang.String r1 = "MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice"
            r2 = 14
            if (r8 != r2) goto L_0x0102
            if (r9 == 0) goto L_0x0102
            int r8 = r9.length
            r2 = 1
            if (r8 < r2) goto L_0x0102
            r8 = 0
            r9 = r9[r8]
            boolean r3 = r9 instanceof byte[]
            if (r3 != 0) goto L_0x0018
            goto L_0x0102
        L_0x0018:
            byte[] r9 = (byte[]) r9
            r3 = 0
            java.lang.String r4 = new java.lang.String     // Catch:{ Exception -> 0x005d }
            r4.<init>(r9)     // Catch:{ Exception -> 0x005d }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x005d }
            r9.<init>(r4)     // Catch:{ Exception -> 0x005d }
            java.lang.String r4 = "deviceInfo"
            org.json.JSONObject r4 = r9.getJSONObject(r4)     // Catch:{ Exception -> 0x005d }
            java.lang.String r5 = "deviceType"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ Exception -> 0x005a }
            java.lang.String r6 = "deviceId"
            java.lang.String r3 = r4.getString(r6)     // Catch:{ Exception -> 0x0056 }
            boolean r6 = r9.isNull(r0)     // Catch:{ Exception -> 0x0056 }
            if (r6 == 0) goto L_0x0044
            java.lang.String r9 = "json have not profile, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r9)     // Catch:{ Exception -> 0x0056 }
            return
        L_0x0044:
            org.json.JSONArray r9 = r9.getJSONArray(r0)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r0 = "discover package profiles %s"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0056 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0056 }
            r6[r8] = r9     // Catch:{ Exception -> 0x0056 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r0, r6)     // Catch:{ Exception -> 0x0056 }
            goto L_0x006b
        L_0x0056:
            r9 = move-exception
            r0 = r3
            r3 = r5
            goto L_0x0060
        L_0x005a:
            r9 = move-exception
            r0 = r3
            goto L_0x0060
        L_0x005d:
            r9 = move-exception
            r0 = r3
            r4 = r0
        L_0x0060:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r8] = r9
            java.lang.String r9 = "JSON decode failed in discover package callback %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r9, r5)
            r5 = r3
            r3 = r0
        L_0x006b:
            if (r5 == 0) goto L_0x007b
            if (r3 == 0) goto L_0x007b
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r8] = r5
            r9[r2] = r3
            java.lang.String r0 = "discover package deviceType %s, deviceId %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r9)
        L_0x007b:
            com.tencent.mm.plugin.exdevice.model.y r9 = r7.f269398a
            java.util.List<z71.b> r9 = r9.f269463v
            java.util.LinkedList r9 = (java.util.LinkedList) r9
            int r9 = r9.size()
        L_0x0085:
            if (r8 >= r9) goto L_0x0102
            com.tencent.mm.plugin.exdevice.model.y r0 = r7.f269398a
            java.util.List<z71.b> r0 = r0.f269463v
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            java.lang.Object r0 = r0.get(r8)
            z71.b r0 = (z71.C53753b) r0
            java.lang.String r0 = r0.field_deviceID
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00ff
            com.tencent.mm.plugin.exdevice.model.y r0 = r7.f269398a
            java.util.List<z71.b> r0 = r0.f269463v
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            java.lang.Object r0 = r0.get(r8)
            z71.b r0 = (z71.C53753b) r0
            java.lang.String r0 = r0.field_deviceType
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00ff
            com.tencent.mm.plugin.exdevice.model.y r0 = r7.f269398a
            java.util.List<z71.b> r0 = r0.f269463v
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            java.lang.Object r0 = r0.get(r8)
            z71.b r0 = (z71.C53753b) r0
            java.lang.String r0 = r0.f150091H
            java.lang.String r1 = "wechat_to_device"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00ff
            com.tencent.mm.plugin.exdevice.model.y r0 = r7.f269398a
            java.util.List<z71.b> r1 = r0.f269464w
            java.util.List<z71.b> r0 = r0.f269463v
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            java.lang.Object r0 = r0.get(r8)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00ff
            com.tencent.mm.plugin.exdevice.model.y r0 = r7.f269398a
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.f269466y
            java.lang.String r1 = r4.toString()
            r0.put(r3, r1)
            com.tencent.mm.plugin.exdevice.model.y r0 = r7.f269398a
            java.util.List<z71.b> r1 = r0.f269464w
            java.util.List<z71.b> r0 = r0.f269463v
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            java.lang.Object r0 = r0.get(r8)
            z71.b r0 = (z71.C53753b) r0
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r0)
            com.tencent.mm.plugin.exdevice.model.y r0 = r7.f269398a
            java.util.List<z71.b> r1 = r0.f269464w
            com.tencent.p014mm.plugin.exdevice.model.C93367y.m117899a(r0, r1)
        L_0x00ff:
            int r8 = r8 + 1
            goto L_0x0085
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C93354a0.mo2128a(int, java.lang.Object[]):void");
    }
}
