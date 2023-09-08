package p71;

import ob0.C35142u;

/* renamed from: p71.f */
public class C47436f implements C35142u {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0084, code lost:
        r10 = r10.f127056b.f127083a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r10, int r11, java.lang.String r12, ob0.C117747y r13) {
        /*
            r9 = this;
            com.tencent.mm.plugin.exdevice.model.p0 r0 = com.tencent.p014mm.plugin.exdevice.model.C41154p0.INSTANCE
            r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onSceneEnd errType = "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = ", errCode = "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = ",errMsg = "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            java.lang.String r1 = "MicroMsg.exdevice.GetBoundDeviceLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            r12 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            if (r13 != 0) goto L_0x0058
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12[r4] = r11
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12[r3] = r10
            java.lang.String r10 = "scene == null, do scene failed : %d, %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r10, r12)
            android.app.ProgressDialog r10 = r0.f110873d
            if (r10 == 0) goto L_0x01d9
            boolean r10 = r10.isShowing()
            if (r10 == 0) goto L_0x01d9
            android.app.ProgressDialog r10 = r0.f110873d
            r10.dismiss()
            r0.f110873d = r2
            goto L_0x01d9
        L_0x0058:
            java.lang.Object[] r5 = new java.lang.Object[r3]
            int r6 = r13.getType()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r4] = r6
            java.lang.String r6 = "scene.getType() = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r5)
            int r5 = r13.getType()
            r6 = 539(0x21b, float:7.55E-43)
            r7 = 3
            java.lang.String r8 = "scene.getType() = %s, %s, %s"
            if (r5 != r6) goto L_0x0131
            r0.f110874e = r4
            if (r10 != 0) goto L_0x00f4
            if (r11 == 0) goto L_0x007e
            goto L_0x00f4
        L_0x007e:
            com.tencent.mm.plugin.exdevice.model.x0 r13 = (com.tencent.p014mm.plugin.exdevice.model.C41176x0) r13
            ob0.c r10 = r13.f110935e
            if (r10 == 0) goto L_0x008d
            ob0.c$d r10 = r10.f127056b
            pe3.a r10 = r10.f127083a
            if (r10 == 0) goto L_0x008d
            te3.nw1 r10 = (te3.C50603nw1) r10
            goto L_0x008e
        L_0x008d:
            r10 = r2
        L_0x008e:
            if (r10 == 0) goto L_0x00d4
            java.util.LinkedList<te3.vy2> r11 = r10.f138807e
            if (r11 != 0) goto L_0x0095
            goto L_0x00d4
        L_0x0095:
            java.lang.Object[] r12 = new java.lang.Object[r3]
            int r11 = r11.size()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12[r4] = r11
            java.lang.String r11 = "hard device_cnt:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r11, r12)
            com.tencent.mm.sdk.platformtools.MMHandlerThread r11 = f40.C86709a0.m107525e()
            com.tencent.mm.plugin.exdevice.model.r0 r12 = new com.tencent.mm.plugin.exdevice.model.r0
            r12.<init>(r0, r10)
            r11.postToWorker(r12)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.exdevice.model.p0$b> r10 = r0.f110876g
            if (r10 == 0) goto L_0x00c1
            java.lang.Object r10 = r10.get()
            com.tencent.mm.plugin.exdevice.model.p0$b r10 = (com.tencent.p014mm.plugin.exdevice.model.C41154p0.C41156b) r10
            if (r10 == 0) goto L_0x00c1
            r10.mo64221a(r3)
        L_0x00c1:
            android.app.ProgressDialog r10 = r0.f110873d
            if (r10 == 0) goto L_0x01d9
            boolean r10 = r10.isShowing()
            if (r10 == 0) goto L_0x01d9
            android.app.ProgressDialog r10 = r0.f110873d
            r10.dismiss()
            r0.f110873d = r2
            goto L_0x01d9
        L_0x00d4:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.exdevice.model.p0$b> r10 = r0.f110876g
            if (r10 == 0) goto L_0x00e3
            java.lang.Object r10 = r10.get()
            com.tencent.mm.plugin.exdevice.model.p0$b r10 = (com.tencent.p014mm.plugin.exdevice.model.C41154p0.C41156b) r10
            if (r10 == 0) goto L_0x00e3
            r10.mo64221a(r4)
        L_0x00e3:
            android.app.ProgressDialog r10 = r0.f110873d
            if (r10 == 0) goto L_0x01d9
            boolean r10 = r10.isShowing()
            if (r10 == 0) goto L_0x01d9
            android.app.ProgressDialog r10 = r0.f110873d
            r10.dismiss()
            goto L_0x01d9
        L_0x00f4:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            int r13 = r13.getType()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r5[r4] = r13
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r5[r3] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r5[r12] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r8, r5)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.exdevice.model.p0$b> r10 = r0.f110876g
            if (r10 == 0) goto L_0x011e
            java.lang.Object r10 = r10.get()
            com.tencent.mm.plugin.exdevice.model.p0$b r10 = (com.tencent.p014mm.plugin.exdevice.model.C41154p0.C41156b) r10
            if (r10 == 0) goto L_0x011e
            r10.mo64221a(r4)
        L_0x011e:
            android.app.ProgressDialog r10 = r0.f110873d
            if (r10 == 0) goto L_0x01d9
            boolean r10 = r10.isShowing()
            if (r10 == 0) goto L_0x01d9
            android.app.ProgressDialog r10 = r0.f110873d
            r10.dismiss()
            r0.f110873d = r2
            goto L_0x01d9
        L_0x0131:
            int r5 = r13.getType()
            r6 = 6693(0x1a25, float:9.379E-42)
            if (r5 != r6) goto L_0x01d9
            r0.f110875f = r4
            if (r10 != 0) goto L_0x01be
            if (r11 == 0) goto L_0x0141
            goto L_0x01be
        L_0x0141:
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            r12[r4] = r5
            java.lang.String r5 = "update get bound hard device time : %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r12)
            java.lang.String r12 = "exdevice_kv"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r12 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r12)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            f40.e r6 = f40.C86709a0.m107523b()
            int r6 = r6.mo121110g()
            r5.append(r6)
            java.lang.String r6 = "_iot"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r12.putLong(r5, r10)
            com.tencent.mm.plugin.exdevice.model.a1 r13 = (com.tencent.p014mm.plugin.exdevice.model.C41120a1) r13
            ob0.c r10 = r13.f110783e
            if (r10 == 0) goto L_0x0184
            ob0.c$d r10 = r10.f127056b
            pe3.a r10 = r10.f127083a
            if (r10 == 0) goto L_0x0184
            r2 = r10
            te3.ab2 r2 = (te3.C48689ab2) r2
        L_0x0184:
            if (r2 != 0) goto L_0x018c
            java.lang.String r10 = "nsResp == null, bind iot device"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r10)
            goto L_0x01d9
        L_0x018c:
            java.lang.Object[] r10 = new java.lang.Object[r3]
            int r11 = r2.f130416d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r4] = r11
            java.lang.String r11 = "device_cnt:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r11, r10)
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.util.LinkedList<te3.at2> r11 = r2.f130417e
            int r11 = r11.size()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r4] = r11
            java.lang.String r11 = "device_list_size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r11, r10)
            zt3.t r10 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.exdevice.model.q0 r11 = new com.tencent.mm.plugin.exdevice.model.q0
            r11.<init>(r0, r2)
            zt3.j r10 = (zt3.C119157j) r10
            java.lang.String r12 = "updateIotDevice"
            r10.mo183876g(r11, r12)
            goto L_0x01d9
        L_0x01be:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r13 = r13.getType()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r0[r4] = r13
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r0[r3] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r0[r12] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r8, r0)
        L_0x01d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p71.C47436f.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
