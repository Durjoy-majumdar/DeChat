package za1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49186dt;
import te3.C49328et;

/* renamed from: za1.a */
public class C53766a extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150911d;

    /* renamed from: e */
    public C11385n f150912e;

    /* renamed from: f */
    public int f150913f = -1;

    /* renamed from: g */
    public String f150914g;

    public C53766a(String str, int i, int i2) {
        this.f150914g = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49186dt();
        bVar.f127067b = new C49328et();
        bVar.f127068c = "/cgi-bin/micromsg-bin/checkcamerascan";
        bVar.f127069d = 782;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f150911d = bVar.mo72403a();
        Log.m105925i("MicroMsg.NetSceneCheckUrlAvailableInWx", "hy: checking url: %s", str);
        C49186dt dtVar = (C49186dt) this.f150911d.f127055a.f127080a;
        dtVar.f132517d = this.f150914g;
        dtVar.f132518e = i;
        dtVar.f132519f = i2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150912e = nVar;
        return dispatch(gVar, this.f150911d, this);
    }

    public int getType() {
        return 782;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneCheckUrlAvailableInWx", "hy: on get camera url end. errType; %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49328et etVar = (C49328et) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            this.f150913f = etVar.f133108d;
        }
        this.f150912e.onSceneEnd(i2, i3, str, this);
    }
}
