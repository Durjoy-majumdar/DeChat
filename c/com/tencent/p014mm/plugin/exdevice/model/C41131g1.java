package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import junit.framework.Assert;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49697hf2;
import te3.C50257lf2;
import te3.C51018qv3;
import te3.C52043xz3;
import te3.C52191yz3;
import y71.C53502m;
import z71.C53753b;

/* renamed from: com.tencent.mm.plugin.exdevice.model.g1 */
public class C41131g1 extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f110802d = null;

    /* renamed from: e */
    public C11385n f110803e = null;

    /* renamed from: f */
    public String f110804f;

    public C41131g1(long j, String str, String str2, long j2, long j3, byte[] bArr, int i) {
        Log.m105925i("MicroMsg.exdevice.NetSceneSendHardDeviceMsg", "NetSceneSendHardDeviceMsg deviceType = %s, deviceId = %s, sessionId = %d, createTime = %d, data length = %d, msgType = %d", str, str2, Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(bArr.length), Integer.valueOf(i));
        this.f110804f = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52043xz3();
        bVar.f127067b = new C52191yz3();
        bVar.f127069d = 538;
        bVar.f127068c = "/cgi-bin/micromsg-bin/sendharddevicemsg";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f110802d = a;
        C52043xz3 xz32 = (C52043xz3) a.f127055a.f127080a;
        C49697hf2 hf22 = new C49697hf2();
        hf22.f134596d = str;
        hf22.f134597e = str2;
        xz32.f145041d = hf22;
        C50257lf2 lf22 = new C50257lf2();
        lf22.f137387d = j2;
        lf22.f137388e = (int) j3;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        lf22.f137389f = qv32;
        lf22.f137390g = i;
        xz32.f145042e = lf22;
        if (j != 0) {
            C51018qv3 qv33 = new C51018qv3();
            qv33.mo73350k(C53502m.m60037a().mo74175b(j, 2));
            xz32.f145043f = qv33;
            return;
        }
        C53753b bD = C41166r1.Bx0().mo74334bD(str2);
        if (bD != null) {
            C51018qv3 qv34 = new C51018qv3();
            qv34.mo73350k(bD.field_sessionBuf);
            xz32.f145043f = qv34;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f110803e = nVar;
        return dispatch(gVar, this.f110802d, this);
    }

    public int getType() {
        return 538;
    }

    /* renamed from: j1 */
    public long mo64198j1() {
        Assert.assertNotNull(this.f110802d);
        return ((C52043xz3) this.f110802d.mo72394a()).f145042e.f137387d;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.exdevice.NetSceneSendHardDeviceMsg", "onGYNetEnd netId = " + i + " errType = " + i2 + " errCode = " + i3 + str);
        this.f110803e.onSceneEnd(i2, i3, str, this);
    }
}
