package z72;

import com.tencent.p014mm.gogcv.Api;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p740wo.C53193b;

/* renamed from: z72.g */
public class C102980g extends C117747y implements C1311n {

    /* renamed from: f */
    public static Api f303906f = new Api();

    /* renamed from: g */
    public static boolean f303907g;

    /* renamed from: h */
    public static boolean f303908h;

    /* renamed from: d */
    public C47350c f303909d;

    /* renamed from: e */
    public C11385n f303910e;

    public C102980g(C102978c cVar, int i, long j, C102979f fVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C53757d();
        bVar.f127067b = new C53758e();
        bVar.f127069d = 5865;
        bVar.f127068c = "/cgi-bin/micromsg-bin/mulmediareportcgi";
        C47350c a = bVar.mo72403a();
        this.f303909d = a;
        C53757d dVar = (C53757d) a.f127055a.f127080a;
        dVar.f150902g = cVar;
        dVar.f150901f = i;
        dVar.f150900e = j;
        dVar.f150899d = (long) C86709a0.m107523b().mo121110g();
        if (i == 2) {
            cVar.f303901z = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(cVar.f303886h);
            String str = cVar.f303886h;
            cVar.f303885g = Util.safeParseLong(str.substring(0, str.indexOf(64)));
        }
        Log.m105925i("MicroMsg.NetSceneMultiMediaReport", "NetSceneMultiMediaReport init, MediaScene:%s, mediaid:%s, MediaType:%s, MediaSource:%s, to_username:%s, chatromid:%s, sns_url:%s, fileid:%s, filekey:%s, md5:%s, createtime:%s, media_width:%s, media_height:%s, thumb_url:%s, video_len:%s, video_fps:%s, audio_sample_rate:%s, video_codec:%s, audio_codec:%s, qrcode_url：%s, chatroom_size:%s, uuid:%s", Integer.valueOf(i), Long.valueOf(cVar.f303882d), Integer.valueOf(cVar.f303883e), Integer.valueOf(cVar.f303884f), cVar.f303886h, Long.valueOf(cVar.f303885g), cVar.f303887i, cVar.f303888j, cVar.f303889n, cVar.f303890o, Long.valueOf(cVar.f303891p), Integer.valueOf(cVar.f303892q), Integer.valueOf(cVar.f303893r), cVar.f303894s, Integer.valueOf(cVar.f303895t), Integer.valueOf(cVar.f303896u), Integer.valueOf(cVar.f303897v), cVar.f303898w, cVar.f303899x, cVar.f303900y, Integer.valueOf(cVar.f303901z), cVar.f303879A);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f303910e = nVar;
        return dispatch(gVar, this.f303909d, this);
    }

    public int getType() {
        return 5865;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneMultiMediaReport", "onGYNetEnd, errType:%d, errCode:%d", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f303910e.onSceneEnd(i2, i3, str, this);
    }
}
