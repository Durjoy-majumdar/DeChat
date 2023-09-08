package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48696ad;
import te3.C52244zc;

/* renamed from: com.tencent.mm.plugin.exdevice.model.u0 */
public class C41170u0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f110923d = null;

    /* renamed from: e */
    public C47350c f110924e = null;

    public C41170u0(String str, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52244zc();
        bVar.f127067b = new C48696ad();
        bVar.f127068c = "/cgi-bin/micromsg-bin/bindharddevice";
        bVar.f127069d = 536;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f110924e = a;
        C52244zc zcVar = (C52244zc) a.f127055a.f127080a;
        zcVar.f145801d = Util.nullAsNil(str);
        zcVar.f145802e = Util.nullAsNil(Integer.valueOf(i));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f110923d = nVar;
        return dispatch(gVar, this.f110924e, this);
    }

    public int getType() {
        return 536;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        r7 = r7.f127056b.f127083a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r7, int r8, int r9, java.lang.String r10, com.tencent.p014mm.network.C114799u r11, byte[] r12) {
        /*
            r6 = this;
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "onGYNetEnd netId = "
            r11.append(r12)
            r11.append(r7)
            java.lang.String r7 = " errType = "
            r11.append(r7)
            r11.append(r8)
            java.lang.String r7 = " errCode = "
            r11.append(r7)
            r11.append(r9)
            r11.append(r10)
            java.lang.String r7 = r11.toString()
            java.lang.String r11 = "MicroMsg.exdevice.NetSceneBindHardDevice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
            if (r8 != 0) goto L_0x012f
            if (r9 != 0) goto L_0x012f
            ob0.c r7 = r6.f110924e
            if (r7 == 0) goto L_0x003a
            ob0.c$d r7 = r7.f127056b
            pe3.a r7 = r7.f127083a
            if (r7 == 0) goto L_0x003a
            te3.ad r7 = (te3.C48696ad) r7
            goto L_0x003b
        L_0x003a:
            r7 = 0
        L_0x003b:
            r12 = 2
            java.lang.Object[] r0 = new java.lang.Object[r12]
            te3.hf2 r1 = r7.f130440d
            java.lang.String r2 = r1.f134597e
            r3 = 0
            r0[r3] = r2
            java.lang.String r1 = r1.f134596d
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "hardDevice : DeviceIdServer = %s, DeviceType = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r0)
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            te3.if2 r1 = r7.f130441e
            java.lang.String r4 = r1.f135284e
            r0[r3] = r4
            java.lang.String r4 = r1.f135283d
            r0[r2] = r4
            java.lang.String r4 = r1.f135285f
            r0[r12] = r4
            r4 = 3
            java.lang.String r5 = r1.f135286g
            r0[r4] = r5
            r4 = 4
            int r1 = r1.f135287h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r4] = r1
            r1 = 5
            int r4 = r7.f130442f
            if (r4 != 0) goto L_0x0077
            java.lang.String r4 = "sync"
            goto L_0x0079
        L_0x0077:
            java.lang.String r4 = "async"
        L_0x0079:
            r0[r1] = r4
            java.lang.String r1 = "hardDeviceAttr : AuthKey = %s, BrandName = %s, Mac = %s, connProto = %s, ConnStrategy = %s, bindFlag = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r0)
            z71.c r0 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            te3.if2 r1 = r7.f130441e
            java.lang.String r1 = r1.f135283d
            te3.hf2 r4 = r7.f130440d
            java.lang.String r4 = r4.f134597e
            z71.b r0 = r0.mo74332TE(r1, r4)
            if (r0 == 0) goto L_0x00b6
            z71.c r0 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            te3.hf2 r1 = r7.f130440d
            java.lang.String r1 = r1.f134597e
            te3.if2 r4 = r7.f130441e
            java.lang.String r4 = r4.f135283d
            boolean r0 = r0.mo74336jo(r1, r4)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            te3.if2 r4 = r7.f130441e
            java.lang.String r4 = r4.f135283d
            r1[r3] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            r1[r2] = r4
            java.lang.String r4 = "delete local deviceinfo : %s, ret : %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r4, r1)
            goto L_0x00b7
        L_0x00b6:
            r0 = 1
        L_0x00b7:
            z71.b r1 = new z71.b
            r1.<init>()
            te3.hf2 r4 = r7.f130440d
            te3.if2 r7 = r7.f130441e
            com.tencent.p014mm.plugin.exdevice.model.C41175x.m44615a(r1, r4, r7)
            java.lang.String r7 = ""
            r1.field_url = r7
            y71.i r7 = y71.C53502m.m60037a()
            long r4 = r1.field_mac
            y71.i$a r7 = r7.mo74177d(r4)
            if (r7 == 0) goto L_0x011e
            int r7 = r7.f150449e
            if (r7 != r12) goto L_0x011e
            java.lang.String r7 = "before do bind netscene, stop the channel now"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
            com.tencent.mm.plugin.exdevice.model.m r7 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.xx0()
            long r11 = r1.field_mac
            r7.mo64204b(r11)
            y71.i r7 = y71.C53502m.m60037a()
            long r11 = r1.field_mac
            java.util.HashMap<java.lang.Long, y71.i$a> r4 = r7.f150444a
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            boolean r4 = r4.containsKey(r5)
            java.lang.String r5 = "MicroMsg.exdevice.ExdeviceInfoManager"
            if (r4 == 0) goto L_0x0111
            java.util.HashMap<java.lang.Long, y71.i$a> r7 = r7.f150444a
            java.lang.Long r4 = java.lang.Long.valueOf(r11)
            r7.remove(r4)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r7[r3] = r11
            java.lang.String r11 = "remove the device from map : %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r11, r7)
            goto L_0x011e
        L_0x0111:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r7[r3] = r11
            java.lang.String r11 = "device id not contains in the map : %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r11, r7)
        L_0x011e:
            if (r0 == 0) goto L_0x0128
            z71.c r7 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            r7.insert(r1)
            goto L_0x012f
        L_0x0128:
            z71.c r7 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            r7.mo74338mI(r1)
        L_0x012f:
            ob0.n r7 = r6.f110923d
            r7.onSceneEnd(r8, r9, r10, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C41170u0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
