package com.tencent.p014mm.plugin.exdevice.model;

import te3.C50603nw1;

/* renamed from: com.tencent.mm.plugin.exdevice.model.r0 */
public class C41165r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C50603nw1 f110898d;

    /* renamed from: e */
    public final /* synthetic */ C41154p0 f110899e;

    public C41165r0(C41154p0 p0Var, C50603nw1 nw12) {
        this.f110899e = p0Var;
        this.f110898d = nw12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            com.tencent.mm.plugin.exdevice.model.p0 r0 = r14.f110899e
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.mo64219g(r1)
            z71.c r0 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            r0.getClass()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            android.database.Cursor r0 = r0.getAll()
            if (r0 == 0) goto L_0x0032
            boolean r2 = r0.moveToFirst()
            if (r2 == 0) goto L_0x0032
        L_0x0021:
            z71.b r2 = new z71.b
            r2.<init>()
            r2.convertFrom(r0)
            r1.add(r2)
            boolean r2 = r0.moveToNext()
            if (r2 != 0) goto L_0x0021
        L_0x0032:
            if (r0 == 0) goto L_0x0037
            r0.close()
        L_0x0037:
            java.util.Iterator r0 = r1.iterator()
        L_0x003b:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "MicroMsg.exdevice.GetBoundDeviceLogic"
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x00a4
            java.lang.Object r1 = r0.next()
            z71.b r1 = (z71.C53753b) r1
            te3.nw1 r6 = r14.f110898d
            java.util.LinkedList<te3.vy2> r6 = r6.f138807e
            java.util.Iterator r6 = r6.iterator()
        L_0x0054:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0078
            java.lang.Object r7 = r6.next()
            te3.vy2 r7 = (te3.C51756vy2) r7
            te3.hf2 r7 = r7.f143770d
            java.lang.String r8 = r1.field_deviceType
            java.lang.String r9 = r7.f134596d
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0054
            java.lang.String r8 = r1.field_deviceID
            java.lang.String r7 = r7.f134597e
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0054
            r6 = 1
            goto L_0x0079
        L_0x0078:
            r6 = 0
        L_0x0079:
            if (r6 != 0) goto L_0x003b
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r6 = r1.field_deviceID
            r3[r4] = r6
            java.lang.String r6 = r1.field_deviceType
            r3[r5] = r6
            java.lang.String r5 = "delete deviceId %s, deviceType %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r5, r3)
            com.tencent.mm.plugin.exdevice.model.p0 r2 = r14.f110899e
            com.tencent.p014mm.plugin.exdevice.model.C41154p0.m44593a(r2, r1)
            z71.c r2 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            java.lang.String r3 = r1.field_deviceID
            java.lang.String r5 = r1.field_deviceType
            r2.mo74336jo(r3, r5)
            com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager r2 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.yx0()
            java.lang.String r1 = r1.field_deviceID
            r2.mo64182o(r1, r4)
            goto L_0x003b
        L_0x00a4:
            te3.nw1 r0 = r14.f110898d
            java.util.LinkedList<te3.vy2> r0 = r0.f138807e
            java.util.Iterator r0 = r0.iterator()
        L_0x00ac:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x021f
            java.lang.Object r1 = r0.next()
            te3.vy2 r1 = (te3.C51756vy2) r1
            te3.if2 r6 = r1.f143771e
            te3.hf2 r7 = r1.f143770d
            if (r7 == 0) goto L_0x00ac
            if (r6 == 0) goto L_0x00ac
            java.lang.String r8 = r7.f134597e
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x00c9
            goto L_0x00ac
        L_0x00c9:
            r8 = 3
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r10 = r7.f134597e
            r9[r4] = r10
            java.lang.String r10 = r7.f134596d
            r9[r5] = r10
            int r10 = r1.f143772f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r3] = r10
            java.lang.String r10 = "ModHardDevice deviceId = %s, deviceType = %s, BindFlag = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r10, r9)
            z71.c r9 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            java.lang.String r10 = r7.f134597e
            z71.b r9 = r9.mo74334bD(r10)
            int r1 = r1.f143772f
            if (r3 != r1) goto L_0x011e
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r7 = r7.f134597e
            r1[r4] = r7
            java.lang.String r7 = r6.f135285f
            r1[r5] = r7
            java.lang.String r6 = r6.f135283d
            r1[r3] = r6
            java.lang.String r6 = "This Device is unbind, Just leave. deviceId = %s, mac = %s, brandName = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r6, r1)
            if (r9 == 0) goto L_0x00ac
            com.tencent.mm.plugin.exdevice.model.p0 r1 = r14.f110899e
            com.tencent.p014mm.plugin.exdevice.model.C41154p0.m44593a(r1, r9)
            z71.c r1 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            java.lang.String r6 = r9.field_deviceID
            java.lang.String r7 = r9.field_deviceType
            r1.mo74336jo(r6, r7)
            com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager r1 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.yx0()
            java.lang.String r6 = r9.field_deviceID
            r1.mo64182o(r6, r4)
            goto L_0x00ac
        L_0x011e:
            z71.b r1 = new z71.b
            r1.<init>()
            java.lang.String r10 = r7.f134597e
            r1.field_deviceID = r10
            java.lang.String r10 = r7.f134596d
            r1.field_deviceType = r10
            java.lang.String r10 = r6.f135286g
            r1.field_connProto = r10
            int r10 = r6.f135287h
            r1.field_connStrategy = r10
            int r10 = r6.f135288i
            r1.field_closeStrategy = r10
            int r10 = r6.f135299w
            if (r10 != r3) goto L_0x0143
            if (r9 == 0) goto L_0x0143
            java.lang.String r11 = r9.f150113y
            if (r11 == 0) goto L_0x0143
            r6.f135292p = r11
        L_0x0143:
            java.lang.String r11 = r6.f135292p
            r1.f150113y = r11
            java.lang.String r11 = r6.f135297u
            r1.f150087D = r11
            java.lang.String r11 = r6.f135296t
            r1.f150086C = r11
            java.lang.String r11 = r6.f135295s
            r1.f150085B = r11
            int r11 = r6.f135298v
            r1.f150088E = r11
            java.lang.String r11 = r6.f135293q
            r1.f150114z = r11
            java.lang.String r11 = r6.f135294r
            r1.f150084A = r11
            r1.f150089F = r10
            long r10 = r6.f135300x
            r1.f150090G = r10
            java.lang.String r10 = r6.f135301y
            r1.f150091H = r10
            java.lang.String r10 = r6.f135302z
            r1.f150092I = r10
            java.lang.String r10 = r6.f135281A
            r1.f150093J = r10
            java.lang.String r10 = r6.f135282B
            r1.f150094K = r10
            r1.f150108t = r5
            java.lang.String r10 = ""
            r1.field_url = r10
            java.lang.String r10 = r6.f135285f
            java.lang.String r10 = d81.C45288e.m50140k(r10)
            long r10 = d81.C45288e.m50137h(r10)
            r1.field_mac = r10
            java.lang.String r10 = new java.lang.String
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r7.f134596d
            r11.append(r12)
            java.lang.String r12 = r7.f134597e
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            byte[] r10 = r10.getBytes()
            java.lang.String r10 = p823sg.C90193h.m112878f(r10)
            r1.field_md5Str = r10
            java.lang.String r10 = r6.f135284e
            r1.field_authKey = r10
            java.lang.String r6 = r6.f135283d
            r1.field_brandName = r6
            long r10 = r1.field_mac
            r12 = 0
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x01bf
            long r10 = java.lang.System.currentTimeMillis()
            r1.field_mac = r10
        L_0x01bf:
            if (r9 != 0) goto L_0x01d5
            z71.c r6 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            boolean r6 = r6.insert(r1)
            if (r6 == 0) goto L_0x01e2
            com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager r9 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.yx0()
            java.lang.String r10 = r1.field_deviceID
            r9.mo64182o(r10, r5)
            goto L_0x01e2
        L_0x01d5:
            z71.c r6 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            int r6 = r6.mo74338mI(r1)
            if (r6 != 0) goto L_0x01e1
            r6 = 0
            goto L_0x01e2
        L_0x01e1:
            r6 = 1
        L_0x01e2:
            r9 = 8
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r9[r4] = r6
            java.lang.String r6 = r1.field_brandName
            r9[r5] = r6
            java.lang.String r6 = r1.field_deviceID
            r9[r3] = r6
            java.lang.String r6 = r7.f134596d
            r9[r8] = r6
            r6 = 4
            java.lang.String r7 = r1.field_connProto
            r9[r6] = r7
            r6 = 5
            int r7 = r1.field_connStrategy
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9[r6] = r7
            r6 = 6
            int r7 = r1.field_closeStrategy
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9[r6] = r7
            r6 = 7
            long r7 = r1.field_mac
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r9[r6] = r1
            java.lang.String r1 = "insert HardDeviceInfo %s, brandName = %s, deviceID = %s, deviceType = %s, connProto = %s, connStrategy = %s, closeStrategy = %s, mac = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r9)
            goto L_0x00ac
        L_0x021f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C41165r0.run():void");
    }
}
