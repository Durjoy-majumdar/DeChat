package la2;

import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.plugin.music.player.base.AudioPlayerUtils;
import com.tencent.p014mm.plugin.music.player.base.C94223g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.qqmusic.mediaplayer.CommonPlayer;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService;
import ha2.C32752h;
import ha2.C98329e;
import ja2.C98927b;
import java.net.URL;
import ka2.C99111a;
import ka2.C99119b;
import qc0.C101106m;
import sa2.C101555a;
import sa2.C101563e;
import sa2.C101567h;
import xa2.C102584b;
import za2.C102985c;

/* renamed from: la2.k */
public abstract class C99361k implements C61260d {

    /* renamed from: a */
    public C101563e f291349a = new C101563e();

    /* renamed from: b */
    public C101567h f291350b = new C101567h();

    /* renamed from: c */
    public C99111a f291351c = new C99111a();

    /* renamed from: d */
    public Runnable f291352d = new C99362a();

    /* renamed from: la2.k$a */
    public class C99362a implements Runnable {
        public C99362a() {
        }

        public void run() {
            boolean k = C99361k.this.mo138822a().mo32211k();
            boolean f = C99361k.this.mo138822a().mo32206f();
            Log.m105925i("MicroMsg.Music.MusicBasePlayEngine", "stopMusicDelayRunnable, isStartPlayMusic:%b, isPlayingMusic:%b", Boolean.valueOf(k), Boolean.valueOf(f));
            if (k && !f) {
                C99361k.this.mo138822a().mo32210j();
            }
        }
    }

    /* renamed from: a */
    public abstract C94223g mo138822a();

    /* renamed from: b */
    public void mo138823b(C94223g.C94224a aVar) {
        ((C101555a) mo138822a()).mo141033x(aVar);
    }

    /* renamed from: c */
    public void mo138824c(C101106m mVar) {
        if (C102985c.m136170a(mVar)) {
            C99111a aVar = this.f291351c;
            aVar.getClass();
            Log.m105924i("MicroMsg.Music.BaseMusicPlayer", "onErrorEvent");
            aVar.mo141024o(mVar, -1);
        } else if (mVar == null || !C102985c.m136171b(mVar.f295959d)) {
            C101563e eVar = this.f291349a;
            eVar.getClass();
            Log.m105924i("MicroMsg.Music.BaseMusicPlayer", "onErrorEvent");
            eVar.mo141024o(mVar, -1);
        } else {
            C101567h hVar = this.f291350b;
            hVar.getClass();
            Log.m105924i("MicroMsg.Music.BaseMusicPlayer", "onErrorEvent");
            hVar.mo141024o(mVar, -1);
        }
    }

    /* renamed from: d */
    public void mo138825d() {
        Log.m105924i("MicroMsg.Music.MusicBasePlayEngine", "sendPreemptedEvent");
        MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
        MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
        aVar.f9337a = 10;
        aVar.f9341e = "preempted";
        aVar.f9344h = "not from app brand appid";
        aVar.f9342f = true;
        musicPlayerEvent.asyncPublish(Looper.getMainLooper());
    }

    /* renamed from: e */
    public void mo138826e(C101106m mVar) {
        if (C102985c.m136170a(mVar)) {
            Log.m105924i("MicroMsg.Music.MusicBasePlayEngine", "use exoMusicPlayer");
            mo138827f();
            C99111a aVar = this.f291351c;
            aVar.mo138487F();
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - aVar.f290603C;
            C101106m mVar2 = aVar.f290615q;
            if (mVar2 != null && mVar2.mo140555a(mVar) && j <= 1000) {
                aVar.f290615q = mVar;
                Log.m105921e("MicroMsg.Music.ExoMusicPlayer", "startPlay, is playing for music src:%s, don't play again in 3 second, interval:%d", aVar.f290624z, Long.valueOf(j));
            } else if (mVar == null) {
                Log.m105920e("MicroMsg.Music.ExoMusicPlayer", "music is null");
            } else {
                C99357e eVar = aVar.f297305g;
                if (eVar != null) {
                    eVar.mo138806w0(mVar, false);
                }
                aVar.f290603C = currentTimeMillis;
                Log.m105925i("MicroMsg.Music.ExoMusicPlayer", "startPlay, currentTime:%d, startTime:%d", Long.valueOf(currentTimeMillis), Integer.valueOf(mVar.f295943D));
                if (aVar.f290619u != null && aVar.mo32206f()) {
                    aVar.f290619u.stop();
                }
                aVar.f290601A = 0;
                aVar.f290602B = mVar.f295943D;
                aVar.f290605E = SystemClock.elapsedRealtime();
                aVar.f290615q = mVar;
                aVar.mo141027r(mVar);
                Log.m105925i("MicroMsg.Music.ExoMusicPlayer", "startPlay startTime:%d", Integer.valueOf(aVar.f290602B));
                MMHandlerThread.postToMainThread(new C99119b(aVar));
            }
        } else if (C102985c.m136171b(mVar.f295959d)) {
            Log.m105924i("MicroMsg.Music.MusicBasePlayEngine", "use qqMusicPlayer");
            mo138827f();
            if (!mVar.f295952M) {
                if (((C99364n) this).f291355e.mo138776O(mVar.f295959d)) {
                    mVar.f295952M = true;
                    Log.m105925i("MicroMsg.Music.MusicBasePlayEngine", "support useNetworkDataPlay, MusicType:%d", Integer.valueOf(mVar.f295959d));
                }
            }
            C101567h hVar = this.f291350b;
            hVar.mo141048E();
            long currentTimeMillis2 = System.currentTimeMillis();
            long j2 = currentTimeMillis2 - hVar.f297336A;
            C101106m mVar3 = hVar.f297342q;
            if (mVar3 == null || !mVar3.mo140555a(mVar) || j2 > 20) {
                hVar.f297307i = 0;
                hVar.f297308j = SystemClock.elapsedRealtime();
                hVar.f297309n = 0;
                C99357e eVar2 = hVar.f297305g;
                if (eVar2 != null) {
                    eVar2.mo138806w0(mVar, false);
                }
                hVar.f297336A = currentTimeMillis2;
                hVar.f297342q = mVar;
                Log.m105925i("MicroMsg.Music.QQMusicPlayer", "startPlay, currentTime:%d, startTime:%d", Long.valueOf(currentTimeMillis2), Integer.valueOf(mVar.f295943D));
                if (hVar.f297343r != null && hVar.mo32206f()) {
                    hVar.f297343r.stop();
                }
                AudioPlayerUtils.m19993a();
                hVar.f297350y = 0;
                hVar.f297351z = mVar.f295943D;
                URL url = null;
                hVar.f297337B = null;
                hVar.f297338C = false;
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "initPlayer");
                C101106m mVar4 = hVar.f297342q;
                String str = mVar4.f295955Q;
                hVar.f297348w = str;
                String str2 = mVar4.f295971s;
                hVar.f297349x = str2;
                Log.m105925i("MicroMsg.Music.QQMusicPlayer", "mSrc:%s mSongLocalPath:%s", str, str2);
                Log.m105925i("MicroMsg.Music.QQMusicPlayer", "field_songWifiUrl:%s", hVar.f297342q.f295966n);
                if (!Util.isNullOrNil(hVar.f297348w) && Util.isNullOrNil(hVar.f297349x)) {
                    C32752h.m39807f(hVar.f297348w);
                    String str3 = hVar.f297348w;
                    if (str3 != null) {
                        C32752h.f89141c.put(str3, 0);
                    }
                    C32752h.m39806e(hVar.f297348w, 0);
                    C101106m mVar5 = hVar.f297342q;
                    String str4 = mVar5.f295955Q;
                    boolean z = mVar5.f295952M;
                    if (!TextUtils.isEmpty(str4)) {
                        C32752h.f89145g.put(str4, Boolean.valueOf(z));
                    }
                }
                if (!Util.isNullOrNil(hVar.f297349x)) {
                    Log.m105925i("MicroMsg.Music.QQMusicPlayer", "play with local file, filePath:%s", hVar.f297349x);
                    if (hVar.f297343r == null) {
                        hVar.f297343r = new CommonPlayer(hVar.f297341F);
                    }
                    hVar.f297343r.reset();
                    if (hVar.f297349x.startsWith("file://")) {
                        hVar.f297349x = hVar.f297349x.substring(7);
                    }
                    try {
                        hVar.f297343r.setDataSource(hVar.f297349x);
                        hVar.f297343r.prepare();
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.Music.QQMusicPlayer", "initPlayer exception:" + e.getMessage());
                        Log.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", e, "initPlayer", new Object[0]);
                        hVar.mo141024o(hVar.f297342q, 501);
                        hVar.mo141047D(hVar.f297342q, 501);
                    }
                } else {
                    try {
                        url = new URL(hVar.f297348w);
                    } catch (Exception e2) {
                        Log.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", e2, "initPlayer", new Object[0]);
                        Log.m105920e("MicroMsg.Music.QQMusicPlayer", "new URL exception:" + e2.getMessage());
                    }
                    if (url == null) {
                        Log.m105920e("MicroMsg.Music.QQMusicPlayer", "initPlayer url is null");
                        hVar.mo141024o(hVar.f297342q, 500);
                        hVar.mo141047D(hVar.f297342q, 500);
                        hVar.mo141022m();
                    } else {
                        if (hVar.f297343r == null) {
                            hVar.f297343r = new CommonPlayer(hVar.f297341F);
                        }
                        hVar.f297343r.reset();
                        if (hVar.f297347v == null) {
                            hVar.f297347v = new C102584b();
                        }
                        C101106m mVar6 = hVar.f297342q;
                        String str5 = mVar6 == null ? "invalidReferrer" : mVar6.f295957S;
                        Log.m105924i("MicroMsg.Music.QQMusicPlayer", "initPlayer, referrer: " + str5);
                        hVar.f297347v.mo142210a(hVar.f297348w, str5);
                        try {
                            Log.m105925i("MicroMsg.Music.QQMusicPlayer", "QQMusicPlayer temp cache dir:%s", hVar.f297339D);
                            if (!TextUtils.isEmpty(hVar.f297339D)) {
                                hVar.f297343r.setOnlinePlayCacheDir(hVar.f297339D);
                            }
                            hVar.f297343r.setDataSource((IMediaHTTPService) hVar.f297347v, Uri.parse(url.toString()));
                            hVar.f297343r.prepare();
                        } catch (Exception e3) {
                            Log.m105920e("MicroMsg.Music.QQMusicPlayer", "initPlayer exception:" + e3.getMessage());
                            Log.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", e3, "initPlayer", new Object[0]);
                            hVar.mo141024o(hVar.f297342q, 501);
                            hVar.mo141047D(hVar.f297342q, 501);
                        }
                    }
                }
                hVar.mo141049F((float) hVar.f297342q.f295950K);
                hVar.mo141050G(hVar.f297342q.f295951L);
                hVar.mo141022m();
            } else {
                hVar.f297342q = mVar;
                Log.m105921e("MicroMsg.Music.QQMusicPlayer", "startPlay, is playing for music src:%s, don't play again in 3 second, interval:%d", hVar.f297348w, Long.valueOf(j2));
            }
        } else {
            Log.m105924i("MicroMsg.Music.MusicBasePlayEngine", "use musicPlayer");
            mo138827f();
            C101563e eVar3 = this.f291349a;
            eVar3.mo141044F();
            Log.m105924i("MicroMsg.Music.MusicPlayer", "init and start download");
            eVar3.mo32210j();
            C98927b bVar = new C98927b(mVar, C98329e.m127106b(mVar.f295960e));
            eVar3.f297325s = bVar;
            bVar.f289999q = eVar3.f297329w;
            C99357e eVar4 = eVar3.f297305g;
            if (eVar4 != null) {
                eVar4.mo138806w0(mVar, false);
                Log.m105924i("MicroMsg.Music.MusicPlayer", "initIdKeyStatData");
                eVar3.f297305g.mo138800c0();
                eVar3.f297305g.mo138797A0(eVar3.f297325s);
            }
            eVar3.f297323q = mVar;
            eVar3.mo141043E(mVar, false);
            Log.m105925i("MicroMsg.Music.MusicPlayer", "startPlay src:%s,  playUrl:%s", mVar.f295966n, mVar.f295955Q);
            C98927b bVar2 = eVar3.f297325s;
            if (bVar2.f289995j) {
                bVar2.f289995j = false;
                ThreadPool.post(bVar2, "music_download_thread");
            }
            eVar3.mo141022m();
        }
        if (mVar.f295959d != 11) {
            mo138825d();
        }
    }

    /* renamed from: f */
    public void mo138827f() {
        if (this.f291349a.mo32206f()) {
            this.f291349a.mo32210j();
        }
        if (this.f291350b.mo32206f()) {
            this.f291350b.mo32210j();
        }
        if (this.f291351c.mo32206f()) {
            this.f291351c.mo32210j();
        }
    }

    /* renamed from: g */
    public void mo138828g(C94223g.C94224a aVar) {
        ((C101555a) mo138822a()).mo141020A(aVar);
        if (this.f291349a.f297311p.size() > 0) {
            this.f291349a.mo141020A(aVar);
        }
        if (this.f291350b.f297311p.size() > 0) {
            this.f291350b.mo141020A(aVar);
        }
        if (this.f291351c.f297311p.size() > 0) {
            this.f291351c.mo141020A(aVar);
        }
    }
}
