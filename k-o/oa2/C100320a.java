package oa2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ra2.C101365a;
import te3.C101798ju;
import te3.C50178ku;

/* renamed from: oa2.a */
public class C100320a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f293895d;

    /* renamed from: e */
    public C47350c f293896e;

    /* renamed from: f */
    public C101798ju f293897f;

    public C100320a(int i, C101365a aVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 940;
        bVar.f127068c = "/cgi-bin/micromsg-bin/checkmusic";
        bVar.f127066a = new C101798ju();
        bVar.f127067b = new C50178ku();
        C47350c a = bVar.mo72403a();
        this.f293896e = a;
        C101798ju juVar = (C101798ju) a.f127055a.f127080a;
        this.f293897f = juVar;
        juVar.f298570o = i;
        juVar.f298569n = aVar.field_appId;
        juVar.f298564f = aVar.field_songAlbumUrl;
        juVar.f298565g = aVar.field_songHAlbumUrl;
        juVar.f298567i = aVar.field_songWifiUrl;
        juVar.f298568j = aVar.field_songWapLinkUrl;
        juVar.f298566h = aVar.field_songWebUrl;
        juVar.f298563e = aVar.field_songName;
        juVar.f298562d = aVar.field_musicId;
        juVar.f298573r = aVar.field_songSinger;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f293895d = nVar;
        return dispatch(gVar, this.f293896e, this);
    }

    public int getType() {
        return 940;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Music.NetSceneCheckMusic", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f293895d.onSceneEnd(i2, i3, str, this);
    }
}
