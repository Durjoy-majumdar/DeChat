package rg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.vl4;
import te3.wl4;

/* renamed from: rg0.d */
public final class C12999d extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f37059d;

    /* renamed from: e */
    public C47350c f37060e;

    /* renamed from: f */
    public C13000e f37061f;

    /* renamed from: g */
    public String f37062g;

    public C12999d(C13000e eVar, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new vl4();
        bVar.f127067b = new wl4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/updatesafedevice";
        bVar.f127069d = 361;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f37060e = a;
        this.f37061f = eVar;
        this.f37062g = str;
        vl4 vl4 = (vl4) a.f127055a.f127080a;
        vl4.f143551d = eVar.field_uid;
        vl4.f143552e = str;
        vl4.f143553f = eVar.field_devicetype;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        if (Util.isNullOrNil(this.f37061f.field_uid) || Util.isNullOrNil(this.f37062g) || Util.isNullOrNil(this.f37061f.field_devicetype)) {
            Log.m105920e("MicroMsg.NetscenUpdateSafeDevice", "null device is or device name or device type");
            return -1;
        }
        this.f37059d = nVar;
        return dispatch(gVar, this.f37060e, this);
    }

    public int getType() {
        return 361;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetscenUpdateSafeDevice", "errType = " + i2 + ", errCode = " + i3);
        if (i2 == 0 && i3 == 0) {
            this.f37061f.field_name = this.f37062g;
        }
        this.f37059d.onSceneEnd(i2, i3, str, this);
    }
}
