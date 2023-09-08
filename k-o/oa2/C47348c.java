package oa2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51072r82;
import te3.C51210s82;

/* renamed from: oa2.c */
public class C47348c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f127051d;

    /* renamed from: e */
    public C47350c f127052e;

    /* renamed from: f */
    public String f127053f = "";

    /* renamed from: g */
    public String f127054g = "";

    public C47348c(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 769;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getshakemusicurl";
        bVar.f127066a = new C51072r82();
        bVar.f127067b = new C51210s82();
        C47350c a = bVar.mo72403a();
        this.f127052e = a;
        ((C51072r82) a.f127055a.f127080a).f140760d = str;
        this.f127054g = str;
        Log.m105925i("MicroMsg.Music.NetSceneGetShakeMusicUrl", "request music url:%s", str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f127051d = nVar;
        return dispatch(gVar, this.f127052e, this);
    }

    public int getType() {
        return 769;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Music.NetSceneGetShakeMusicUrl", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C51210s82 s822 = (C51210s82) this.f127052e.f127056b.f127083a;
            this.f127051d.onSceneEnd(i2, i3, str, this);
            if (s822 != null) {
                String str2 = s822.f141373d;
                this.f127053f = str2;
                Log.m105925i("MicroMsg.Music.NetSceneGetShakeMusicUrl", "tempPlayUrl:%s", str2);
                return;
            }
            Log.m105920e("MicroMsg.Music.NetSceneGetShakeMusicUrl", "response is null");
            return;
        }
        this.f127051d.onSceneEnd(i2, i3, str, this);
    }
}
