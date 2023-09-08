package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49697hf2;
import te3.mk4;
import te3.nk4;

/* renamed from: com.tencent.mm.plugin.exdevice.model.i1 */
public class C41135i1 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f110813d;

    /* renamed from: e */
    public C47350c f110814e;

    /* renamed from: f */
    public C49697hf2 f110815f;

    public C41135i1(C49697hf2 hf22, int i) {
        this.f110815f = hf22;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new mk4();
        bVar.f127067b = new nk4();
        bVar.f127069d = 537;
        bVar.f127068c = "/cgi-bin/micromsg-bin/unbindharddevice";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f110814e = a;
        mk4 mk4 = (mk4) a.f127055a.f127080a;
        mk4.f138087d = hf22;
        mk4.f138088e = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f110813d = nVar;
        return dispatch(gVar, this.f110814e, this);
    }

    public int getType() {
        return 537;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0090, code lost:
        r9 = r9.f127056b.f127083a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r5, int r6, int r7, java.lang.String r8, com.tencent.p014mm.network.C114799u r9, byte[] r10) {
        /*
            r4 = this;
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r10 = 0
            r9[r10] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r0 = 1
            r9[r0] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r1 = 2
            r9[r1] = r5
            r5 = 3
            r9[r5] = r8
            java.lang.String r5 = "MicroMsg.exdevice.NetSceneUnBindHardDevice"
            java.lang.String r1 = "onGYNetEnd netId = %d, errType= %d, errCode = %d , errMsg =%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r9)
            com.tencent.mm.plugin.exdevice.model.p0 r9 = com.tencent.p014mm.plugin.exdevice.model.C41154p0.INSTANCE
            r1 = 0
            r9.mo64219g(r1)
            z71.c r9 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            te3.hf2 r1 = r4.f110815f
            java.lang.String r1 = r1.f134597e
            z71.b r9 = r9.mo74334bD(r1)
            if (r9 == 0) goto L_0x006b
            com.tencent.mm.plugin.exdevice.model.h r1 = y71.C53502m.m60039c()
            y71.k r1 = r1.f110806a
            if (r1 == 0) goto L_0x0055
            com.tencent.mm.plugin.exdevice.model.h r1 = y71.C53502m.m60039c()
            y71.k r1 = r1.f110806a
            long r2 = r9.field_mac
            y71.o r1 = (y71.C53503o) r1
            boolean r9 = r1.mo74187e(r2)
            if (r9 != 0) goto L_0x0055
            java.lang.String r9 = "stopChannel Failed!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r9)
        L_0x0055:
            z71.c r9 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
            te3.hf2 r1 = r4.f110815f
            java.lang.String r2 = r1.f134597e
            java.lang.String r1 = r1.f134596d
            boolean r9 = r9.mo74336jo(r2, r1)
            if (r9 != 0) goto L_0x0078
            java.lang.String r9 = "deleteByDeviceId Failed!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r9)
            goto L_0x0078
        L_0x006b:
            java.lang.Object[] r9 = new java.lang.Object[r0]
            te3.hf2 r1 = r4.f110815f
            java.lang.String r1 = r1.f134597e
            r9[r10] = r1
            java.lang.String r1 = "getByDeviceIdServer Failed!!! DeviceIDServer = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r1, r9)
        L_0x0078:
            if (r6 != 0) goto L_0x007c
            if (r7 == 0) goto L_0x008c
        L_0x007c:
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r0 = 537(0x219, float:7.52E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9[r10] = r0
            java.lang.String r10 = "scene.getType() = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r10, r9)
        L_0x008c:
            ob0.c r9 = r4.f110814e
            if (r9 == 0) goto L_0x0099
            ob0.c$d r9 = r9.f127056b
            pe3.a r9 = r9.f127083a
            if (r9 == 0) goto L_0x0099
            te3.nk4 r9 = (te3.nk4) r9
            goto L_0x009a
        L_0x0099:
            r9 = 0
        L_0x009a:
            if (r9 != 0) goto L_0x00a1
            java.lang.String r9 = "UnbindHardDevice resp or req is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r9)
        L_0x00a1:
            ob0.n r5 = r4.f110813d
            r5.onSceneEnd(r6, r7, r8, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C41135i1.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
