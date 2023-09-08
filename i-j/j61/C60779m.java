package j61;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50330lz1;
import te3.C64505kz1;

/* renamed from: j61.m */
public class C60779m extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f173113d;

    /* renamed from: e */
    public C11385n f173114e;

    /* renamed from: f */
    public String f173115f;

    /* renamed from: g */
    public String f173116g;

    /* renamed from: h */
    public String f173117h;

    public C60779m(String str, String str2, String str3) {
        Log.m105925i("MicroMsg.emoji.NetSceneGetEmotionActivity", "NetSceneGetEmotionActivity: %s, %s, %s", str, str2, str3);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64505kz1();
        bVar.f127067b = new C50330lz1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getemotionactivity";
        bVar.f127069d = 368;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f173113d = bVar.mo72403a();
        this.f173115f = str;
        this.f173116g = str2;
        this.f173117h = str3;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f173114e = nVar;
        C47350c cVar = this.f173113d;
        C64505kz1 kz12 = (C64505kz1) cVar.f127055a.f127080a;
        kz12.f184003d = this.f173115f;
        kz12.f184004e = this.f173116g;
        kz12.f184005f = this.f173117h;
        return dispatch(gVar, cVar, this);
    }

    public int getType() {
        return 368;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.emoji.NetSceneGetEmotionActivity", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f173114e.onSceneEnd(i2, i3, str, this);
    }
}
