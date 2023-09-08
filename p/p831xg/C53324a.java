package p831xg;

import android.content.Context;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50611ny3;
import te3.C50755oy3;

/* renamed from: xg.a */
public class C53324a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f148926d;

    /* renamed from: e */
    public C47350c f148927e;

    /* renamed from: f */
    public Context f148928f;

    /* renamed from: g */
    public long f148929g = System.currentTimeMillis();

    public C53324a(Context context, String str, int i) {
        this.f148928f = context;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 4790;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/mmgettagjump";
        bVar.f127066a = new C50611ny3();
        bVar.f127067b = new C50755oy3();
        C47350c a = bVar.mo72403a();
        this.f148927e = a;
        C50611ny3 ny32 = (C50611ny3) a.f127055a.f127080a;
        ny32.f138838e = str;
        ny32.f138837d = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f148926d = nVar;
        return dispatch(gVar, this.f148927e, this);
    }

    public int getType() {
        return 4790;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.TopStory.NetSceneTopStory", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, Long.valueOf(System.currentTimeMillis() - this.f148929g));
        this.f148926d.onSceneEnd(i2, i3, str, this);
    }
}
