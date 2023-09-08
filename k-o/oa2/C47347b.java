package oa2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import qc0.C77328l;
import ra2.C101365a;
import sf0.C48374j0;
import te3.C51350t62;
import te3.C51499u62;

/* renamed from: oa2.b */
public class C47347b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f127045d;

    /* renamed from: e */
    public C47350c f127046e;

    /* renamed from: f */
    public C51499u62 f127047f;

    /* renamed from: g */
    public C101365a f127048g;

    /* renamed from: h */
    public boolean f127049h;

    /* renamed from: i */
    public boolean f127050i;

    public C47347b(C101365a aVar, boolean z, boolean z2) {
        this.f127048g = aVar;
        this.f127049h = z;
        this.f127050i = z2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51350t62();
        bVar.f127067b = new C51499u62();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getqqmusiclyric";
        bVar.f127069d = 520;
        C47350c a = bVar.mo72403a();
        this.f127046e = a;
        C51350t62 t622 = (C51350t62) a.f127055a.f127080a;
        t622.f141984d = aVar.field_songId;
        String str = aVar.field_songWebUrl;
        if (str != null) {
            t622.f141985e = C48374j0.m53712a(str.getBytes());
        }
        String str2 = aVar.field_songMId;
        if (str2 != null) {
            t622.f141988h = C48374j0.m53712a(str2.getBytes());
        }
        t622.f141986f = C77328l.m93192a() ^ true ? 1 : 0;
        t622.f141987g = C77328l.m93193b() ? 1 : 0;
        Log.m105925i("MicroMsg.Music.NetSceneGetQQMusicLyric", "songId=%d, url=%s IsOutsideGFW=%d ShakeMusicGlobalSwitch=%d", Integer.valueOf(aVar.field_songId), aVar.field_songWebUrl, Integer.valueOf(t622.f141986f), Integer.valueOf(t622.f141987g));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f127045d = nVar;
        return dispatch(gVar, this.f127046e, this);
    }

    public int getType() {
        return 520;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Music.NetSceneGetQQMusicLyric", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f127047f = (C51499u62) this.f127046e.f127056b.f127083a;
            this.f127045d.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f127045d.onSceneEnd(i2, i3, str, this);
    }
}
