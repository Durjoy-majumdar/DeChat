package eb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.yd4;
import te3.zd4;

/* renamed from: eb1.s */
public class C7631s extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f25933d;

    /* renamed from: e */
    public C47350c f25934e;

    /* renamed from: f */
    public boolean f25935f = false;

    /* renamed from: g */
    public boolean f25936g = false;

    public C7631s(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new yd4();
        bVar.f127067b = new zd4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/switchopface";
        bVar.f127069d = 938;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f25934e = a;
        ((yd4) a.f127055a.f127080a).f145240d = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f25933d = nVar;
        return dispatch(gVar, this.f25934e, this);
    }

    public int getType() {
        return 938;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        zd4 zd4 = (zd4) ((C47350c) uVar).f127056b.f127083a;
        this.f25935f = zd4.f145845d;
        this.f25936g = zd4.f145846e;
        Log.m105925i("MicroMsg.NetSceneFaceSwitchOpFace", "hy: NetSceneFaceSwitchOpFace errType: %d, errCode: %d, errMsg: %s, hasBio: %b, isOpen: %b", Integer.valueOf(i2), Integer.valueOf(i3), str, Boolean.valueOf(this.f25935f), Boolean.valueOf(this.f25936g));
        C11385n nVar = this.f25933d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
