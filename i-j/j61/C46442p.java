package j61;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import sf0.C48374j0;
import te3.C51018qv3;
import te3.C51033qz1;
import te3.C51178rz1;

/* renamed from: j61.p */
public class C46442p extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f125097d;

    /* renamed from: e */
    public C11385n f125098e;

    /* renamed from: f */
    public byte[] f125099f = null;

    /* renamed from: g */
    public String f125100g;

    public C46442p(String str, byte[] bArr) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51033qz1();
        bVar.f127067b = new C51178rz1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmgetemotiondonorlist";
        bVar.f127069d = 299;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f125097d = bVar.mo72403a();
        this.f125099f = bArr;
        this.f125100g = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125098e = nVar;
        C51033qz1 qz12 = (C51033qz1) this.f125097d.f127055a.f127080a;
        byte[] bArr = this.f125099f;
        if (bArr != null) {
            qz12.f140622e = C48374j0.m53712a(bArr);
        } else {
            qz12.f140622e = new C51018qv3();
        }
        qz12.f140621d = this.f125100g;
        return dispatch(gVar, this.f125097d, this);
    }

    public int getType() {
        return 299;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.emoji.NetSceneGetEmotionDonorList", "ErrType:" + i2 + "   errCode:" + i3);
        C51018qv3 qv32 = ((C51178rz1) ((C47350c) uVar).f127056b.f127083a).f141233f;
        if (qv32 != null) {
            this.f125099f = C48374j0.m53715d(qv32);
        }
        this.f125098e.onSceneEnd(i2, i3, str, this);
    }
}
