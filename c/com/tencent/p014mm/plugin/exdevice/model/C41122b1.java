package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49697hf2;
import te3.C49986jf2;
import te3.C50125kf2;
import te3.C51018qv3;
import y71.C53502m;
import y71.C53503o;
import z71.C53753b;

/* renamed from: com.tencent.mm.plugin.exdevice.model.b1 */
public class C41122b1 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f110784d = null;

    /* renamed from: e */
    public C47350c f110785e = null;

    /* renamed from: f */
    public String f110786f;

    /* renamed from: g */
    public String f110787g;

    public C41122b1(String str, String str2, String str3, int i, byte[] bArr) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49986jf2();
        bVar.f127067b = new C50125kf2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/harddeviceauth";
        bVar.f127069d = 541;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f110785e = a;
        C49986jf2 jf22 = (C49986jf2) a.f127055a.f127080a;
        C49697hf2 hf22 = new C49697hf2();
        hf22.f134596d = str2;
        hf22.f134597e = str3;
        jf22.f136098d = hf22;
        jf22.f136099e = i;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        jf22.f136100f = qv32;
        this.f110786f = str3;
        this.f110787g = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f110784d = nVar;
        return dispatch(gVar, this.f110785e, this);
    }

    public int getType() {
        return 541;
    }

    /* renamed from: j1 */
    public byte[] mo64193j1() {
        try {
            return ((C50125kf2) this.f110785e.f127056b.f127083a).f136762f.f140574f.f257327a;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.exdevice.NetSceneHardDeviceAuth", e, "", new Object[0]);
            return null;
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105924i("MicroMsg.exdevice.NetSceneHardDeviceAuth", "onGYNetEnd netId = " + i + " errType = " + i4 + " errCode = " + i5 + str2);
        C53753b bD = C41166r1.Bx0().mo74334bD(this.f110786f);
        if (i4 == 0 && i5 == 0) {
            C50125kf2 kf22 = (C50125kf2) this.f110785e.f127056b.f127083a;
            if (bD != null) {
                byte[] j1 = mo64193j1();
                if (j1 != null) {
                    bD.field_authBuf = j1;
                }
                bD.f150110v = kf22.f136764h;
                bD.f150109u = kf22.f136763g;
                bD.f150108t = true;
                byte[] bArr4 = null;
                try {
                    bArr2 = ((C50125kf2) this.f110785e.f127056b.f127083a).f136760d.f140574f.f257327a;
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.exdevice.NetSceneHardDeviceAuth", e, "", new Object[0]);
                    bArr2 = null;
                }
                if (bArr2 != null) {
                    bArr3 = j1;
                    C53502m.m60037a().mo74181h(bD.field_mac, bArr2, 2);
                    if (C53502m.m60039c().f110806a != null) {
                        ((C53503o) C53502m.m60039c().f110806a).mo74185c(bD.field_mac, bArr2);
                    }
                    bD.field_sessionKey = bArr2;
                } else {
                    bArr3 = j1;
                }
                try {
                    bArr4 = ((C50125kf2) this.f110785e.f127056b.f127083a).f136761e.f140574f.f257327a;
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.exdevice.NetSceneHardDeviceAuth", e2, "", new Object[0]);
                }
                if (bArr4 != null) {
                    C53502m.m60037a().mo74181h(bD.field_mac, bArr4, 3);
                    bD.field_sessionBuf = bArr4;
                }
                byte[] j15 = mo64193j1();
                if (bArr3 != null) {
                    C53502m.m60037a().mo74181h(bD.field_mac, j15, 1);
                    bD.field_authBuf = bArr3;
                }
                bD.f150111w = System.currentTimeMillis() / 1000;
                bD.f150108t = true;
                if (2 == C53502m.m60037a().mo74176c(bD.field_mac)) {
                    C41166r1.yx0();
                    ExdeviceEventManager.m44540n(this.f110787g, bD.field_url, 2, bD.field_deviceID);
                }
                C53502m.m60037a().mo74182i(bD.field_mac);
                Log.m105925i("MicroMsg.exdevice.NetSceneHardDeviceAuth", "update local device auth infos = %b", Boolean.valueOf(C41166r1.Bx0().update(bD, new String[0])));
            } else {
                Log.m105920e("MicroMsg.exdevice.NetSceneHardDeviceAuth", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceIdServer == null");
            }
        } else {
            if (bD != null) {
                C53502m.m60037a().mo74174a(bD.field_mac);
                C41166r1.yx0();
                ExdeviceEventManager.m44540n(this.f110787g, bD.field_url, 4, bD.field_deviceID);
            }
            C41166r1.yx0().mo64181m(this.f110787g, 3);
        }
        this.f110784d.onSceneEnd(i4, i5, str2, this);
    }
}
