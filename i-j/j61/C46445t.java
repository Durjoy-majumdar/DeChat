package j61;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50610ny2;
import te3.C50754oy2;

/* renamed from: j61.t */
public class C46445t extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f125112d;

    /* renamed from: e */
    public C11385n f125113e;

    /* renamed from: f */
    public String f125114f;

    /* renamed from: g */
    public int f125115g;

    public C46445t(String str, int i) {
        this.f125114f = str;
        if (!Util.isNullOrNil(str) && str.equals(String.valueOf(17))) {
            this.f125114f = "com.tencent.xin.emoticon.tusiji";
        }
        this.f125115g = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50610ny2();
        bVar.f127067b = new C50754oy2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/modemotionpack";
        bVar.f127069d = 413;
        bVar.f127070e = 212;
        bVar.f127071f = 1000000212;
        this.f125112d = bVar.mo72403a();
        Log.m105925i("MicroMsg.emoji.NetSceneModEmotionPack", "NetSceneModEmotionPack: %s, %s", str, Integer.valueOf(i));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125113e = nVar;
        C47350c cVar = this.f125112d;
        C50610ny2 ny22 = (C50610ny2) cVar.f127055a.f127080a;
        ny22.f138835d = this.f125114f;
        ny22.f138836e = this.f125115g;
        return dispatch(gVar, cVar, this);
    }

    public int getType() {
        return 413;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105919d("MicroMsg.emoji.NetSceneModEmotionPack", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", Integer.valueOf(i2), Integer.valueOf(i3), str2);
        if (i4 == 0 && i5 == 0) {
            if (this.f125115g == 1) {
                C115669n.INSTANCE.idkeyStat(165, 2, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(165, 4, 1, false);
            }
            this.f125113e.onSceneEnd(i4, i5, str2, this);
            return;
        }
        this.f125113e.onSceneEnd(i4, i5, str2, this);
        if (this.f125115g == 1) {
            C115669n.INSTANCE.idkeyStat(165, 3, 1, false);
            Log.m105924i("MicroMsg.emoji.NetSceneModEmotionPack", "del tukiz failed  ");
            return;
        }
        C115669n.INSTANCE.idkeyStat(165, 5, 1, false);
        Log.m105925i("MicroMsg.emoji.NetSceneModEmotionPack", "del emoji failed md5:%s", this.f125114f);
    }
}
