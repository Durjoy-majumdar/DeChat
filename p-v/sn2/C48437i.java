package sn2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C51012qt2;
import te3.C51155rt2;

/* renamed from: sn2.i */
public class C48437i extends C48436g {

    /* renamed from: f */
    public C11385n f129616f;

    /* renamed from: g */
    public final C47350c f129617g;

    public C48437i(byte[] bArr, int i, int i2, int i3, long j, int i4, boolean z, int i5) {
        super(bArr, i3, j, i4, z, i5);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51012qt2();
        bVar.f127067b = new C51155rt2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmqqshakemusic";
        bVar.f127069d = 5245;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129617g = a;
        C51012qt2 qt22 = (C51012qt2) a.f127055a.f127080a;
        qt22.f140543f = new C89349b(bArr, 0, bArr.length);
        qt22.f140541d = 0;
        qt22.f140546i = z ? 1 : 0;
        qt22.f140544g = i2;
        qt22.f140545h = i;
        qt22.f140542e = i4 + "";
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C51012qt2 qt22 = (C51012qt2) this.f129617g.f127055a.f127080a;
        Log.m105925i("MicroMsg.NetSceneShakeMusicAndSing", "doScene id: %s, offset: %d, endFlag: %d， seq: %d， data length: %d", qt22.f140542e, Integer.valueOf(qt22.f140545h), Integer.valueOf(qt22.f140546i), Integer.valueOf(qt22.f140544g), Integer.valueOf(qt22.f140543f.mo123703f().length));
        this.f129616f = nVar;
        return dispatch(gVar, this.f129617g, this);
    }

    public int getType() {
        return 5245;
    }

    /* renamed from: j1 */
    public C49335eu3 mo73108j1() {
        return (C51155rt2) this.f129617g.f127056b.f127083a;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C51155rt2 rt22 = (C51155rt2) this.f129617g.f127056b.f127083a;
        Log.m105925i("MicroMsg.NetSceneShakeMusicAndSing", "errType: %d, errCode: %d, errMsg: %s, rep: appId: %s， endFlag: %d, maxPacketSize: %d, interval: %d, music size: %d", Integer.valueOf(i2), Integer.valueOf(i3), str, rt22.f141138h, Integer.valueOf(rt22.f141137g), Integer.valueOf(rt22.f141136f), Integer.valueOf(rt22.f141135e), Integer.valueOf(rt22.f141139i.size()));
        if (i2 == 0 && i3 == 0 && rt22.f141137g == 1) {
            this.f129614d = true;
        }
        this.f129616f.onSceneEnd(i2, i3, str, this);
    }
}
