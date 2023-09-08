package p350jh;

import android.os.Handler;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import ea2.C20561h;
import ea2.C20571i;
import nb0.C88912b;
import p213oh.C11412b;

/* renamed from: jh.c */
public class C21240c implements C21245h {

    /* renamed from: a */
    public boolean f60045a = false;

    /* renamed from: b */
    public volatile boolean f60046b = true;

    /* renamed from: c */
    public C21243f f60047c;

    /* renamed from: d */
    public C88912b f60048d;

    public C21240c(C21243f fVar) {
        this.f60047c = fVar;
    }

    /* renamed from: a */
    public void mo33231a(C21241d dVar) {
        Handler handler;
        Object[] objArr = {Boolean.valueOf(this.f60045a)};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioDownloadProcess", "download process end, download finish:%b", objArr);
        if (C21242e.f60052f == null) {
            synchronized (C21242e.class) {
                if (C21242e.f60052f == null) {
                    C21242e.f60052f = new C21242e();
                }
            }
        }
        C21242e eVar = C21242e.f60052f;
        synchronized (eVar.f60053a) {
            eVar.f60056d.remove(dVar);
            if (eVar.f60056d.size() <= 4) {
                eVar.f60057e = 4;
                eVar.mo33232a(4);
            }
        }
        eVar.f60054b.remove(dVar);
        if (this.f60045a) {
            C21243f fVar = this.f60047c;
            if (fVar != null) {
                C88912b bVar = this.f60048d;
                C21238a aVar = (C21238a) fVar;
                String str = "";
                synchronized (aVar.f60039a.f60043d) {
                    if (bVar != null) {
                        aVar.f60039a.f60040a.remove(bVar.f256417b);
                        str = bVar.f256417b;
                        aVar.f60039a.f60042c.add(bVar.f256417b);
                    }
                }
                Log.m105925i("MicroMsg.Audio.AudioDownloadMgr", "download finish, src:%s", str);
                C21244g gVar = aVar.f60039a.f60044e;
                if (gVar != null) {
                    C20561h.C20569h hVar = (C20561h.C20569h) gVar;
                    Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "loadCache audio:%s", bVar.f256416a);
                    C88912b n = C20561h.this.mo32173n(bVar.f256416a);
                    boolean z = n != null && !TextUtils.isEmpty(n.f256418c) && C20561h.this.f57849A.mo33567e(n.f256418c);
                    Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "cached:%b", Boolean.valueOf(z));
                    if (!z && (handler = C20561h.this.f57857I) != null) {
                        handler.post(new C20571i(hVar, bVar));
                    }
                }
            }
        } else {
            C21243f fVar2 = this.f60047c;
            if (fVar2 != null) {
                ((C21238a) fVar2).mo33230a(this.f60048d);
            }
        }
        this.f60046b = true;
        dVar.f60051i = null;
        this.f60047c = null;
    }
}
