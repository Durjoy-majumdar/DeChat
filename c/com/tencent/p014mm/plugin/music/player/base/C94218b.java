package com.tencent.p014mm.plugin.music.player.base;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import ha2.C98329e;
import ja2.C98927b;
import la2.C99357e;
import la2.C99364n;
import qc0.C101106m;
import sa2.C101563e;
import sa2.C36648d;

/* renamed from: com.tencent.mm.plugin.music.player.base.b */
public class C94218b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f272180d;

    /* renamed from: e */
    public final /* synthetic */ C94221e f272181e;

    public C94218b(C94221e eVar, boolean z) {
        this.f272181e = eVar;
        this.f272180d = z;
    }

    public void run() {
        Log.m105925i("MicroMsg.Music.BasePlayer", "onError, needRetry:%b", Boolean.valueOf(this.f272180d));
        C94221e eVar = this.f272181e;
        C94226i iVar = eVar.f272184a;
        C101106m mVar = eVar.f272185b;
        boolean z = this.f272180d;
        C101563e.C101564a aVar = (C101563e.C101564a) iVar;
        aVar.getClass();
        C101106m k = C99364n.m129616h().mo138832k();
        if (k != null) {
            Log.m105925i("MicroMsg.Music.MusicPlayer", "onError, needRetry:%b", Boolean.valueOf(z));
            if (z) {
                C101563e.m133349C(C101563e.this, mVar, 20);
            } else {
                C101563e.m133349C(C101563e.this, mVar, 21);
            }
            if (k.mo140555a(mVar)) {
                Log.m105924i("MicroMsg.Music.MusicPlayer", "stop");
                C101563e.this.mo32210j();
                if (z) {
                    Log.m105924i("MicroMsg.Music.MusicPlayer", "retry system media player again");
                    C101563e.this.mo141043E(k, true);
                    C101563e.this.f297325s = new C98927b(mVar, C98329e.m127106b(mVar.f295960e));
                    C101563e eVar2 = C101563e.this;
                    C98927b bVar = eVar2.f297325s;
                    bVar.f289999q = eVar2.f297329w;
                    if (bVar.f289995j) {
                        bVar.f289995j = false;
                        ThreadPool.post(bVar, "music_download_thread");
                    }
                    C101563e eVar3 = C101563e.this;
                    C99357e eVar4 = eVar3.f297305g;
                    if (eVar4 != null) {
                        eVar4.mo138797A0(eVar3.f297325s);
                        return;
                    }
                    return;
                }
                MMHandlerThread.postToMainThread(new C36648d(aVar));
                C101563e eVar5 = C101563e.this;
                eVar5.mo141032w(eVar5.f297323q);
                return;
            }
            Log.m105924i("MicroMsg.Music.MusicPlayer", "send stop event");
            C101563e eVar6 = C101563e.this;
            eVar6.mo141032w(eVar6.f297323q);
        }
    }
}
