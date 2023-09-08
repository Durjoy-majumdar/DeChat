package sa2;

import android.os.Looper;
import android.os.SystemClock;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.plugin.music.player.base.AudioPlayerUtils;
import com.tencent.p014mm.plugin.music.player.base.C94223g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.BaseMediaPlayer;
import com.tencent.qqmusic.mediaplayer.CommonPlayer;
import com.tencent.qqmusic.mediaplayer.PlayerListenerCallback;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import ha2.C32752h;
import ha2.C98330i;
import java.util.Iterator;
import la2.C99355b;
import la2.C99357e;
import la2.C99364n;
import p910lj.C76701a;
import qc0.C101106m;
import qc0.C12155j;
import ua2.C101991b;
import xa2.C102584b;
import za2.C102984b;

/* renamed from: sa2.h */
public class C101567h extends C101555a {

    /* renamed from: A */
    public long f297336A = 0;

    /* renamed from: B */
    public AudioFormat.AudioType f297337B = AudioFormat.AudioType.UNSUPPORT;

    /* renamed from: C */
    public boolean f297338C = false;

    /* renamed from: D */
    public String f297339D = "";

    /* renamed from: E */
    public boolean f297340E = false;

    /* renamed from: F */
    public PlayerListenerCallback f297341F = new C101568a();

    /* renamed from: q */
    public C101106m f297342q;

    /* renamed from: r */
    public CommonPlayer f297343r;

    /* renamed from: s */
    public C12155j f297344s;

    /* renamed from: t */
    public boolean f297345t;

    /* renamed from: u */
    public C101570b f297346u;

    /* renamed from: v */
    public C102584b f297347v;

    /* renamed from: w */
    public String f297348w = "";

    /* renamed from: x */
    public String f297349x;

    /* renamed from: y */
    public int f297350y = 0;

    /* renamed from: z */
    public int f297351z = 0;

    /* renamed from: sa2.h$a */
    public class C101568a implements PlayerListenerCallback {

        /* renamed from: d */
        public C101106m f297352d = null;

        /* renamed from: sa2.h$a$a */
        public class C101569a implements Runnable {
            public C101569a(C101568a aVar) {
            }

            public void run() {
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.h29), 0).show();
            }
        }

        public C101568a() {
        }

        public void onBufferingUpdate(BaseMediaPlayer baseMediaPlayer, int i) {
        }

        public void onCompletion(BaseMediaPlayer baseMediaPlayer) {
            Log.m105924i("MicroMsg.Music.QQMusicPlayer", "onCompletion");
        }

        public void onError(BaseMediaPlayer baseMediaPlayer, int i, int i2, int i3) {
            Log.m105921e("MicroMsg.Music.QQMusicPlayer", "onError what:%d, extra:%d, errCode:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            C101106m k = C99364n.m129616h().mo138832k();
            if (k == null) {
                Log.m105920e("MicroMsg.Music.QQMusicPlayer", "onError, currentMusic is null");
                return;
            }
            C101106m mVar = C101567h.this.f297342q;
            this.f297352d = mVar;
            if (mVar == null) {
                Log.m105920e("MicroMsg.Music.QQMusicPlayer", "onError, cbMusic is null");
                return;
            }
            boolean isNetworkConnected = NetStatusUtil.isNetworkConnected(MMApplicationContext.getContext());
            if (i2 == 80 && isNetworkConnected) {
                Log.m105920e("MicroMsg.Music.QQMusicPlayer", "connect success, but download is fail!");
            }
            C101567h hVar = C101567h.this;
            int i4 = hVar.f297350y;
            if (i4 >= 1) {
                Log.m105921e("MicroMsg.Music.QQMusicPlayer", "errorCount %d", Integer.valueOf(i4));
                return;
            }
            hVar.f297350y = i4 + 1;
            hVar.mo141051H();
            C101567h.this.mo141047D(this.f297352d, i2);
            if (k.mo140555a(this.f297352d)) {
                C101567h.this.mo32210j();
                MMHandlerThread.postToMainThread(new C101569a(this));
            }
            C101567h.this.mo141032w(this.f297352d);
            C101567h.this.mo141024o(this.f297352d, i2);
            C101567h hVar2 = C101567h.this;
            C101570b bVar = hVar2.f297346u;
            if (bVar != null) {
                bVar.f297354d = true;
                hVar2.f297346u = null;
            }
            if (i == 91 && i2 == 55) {
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "unknow format ,delete file");
                String str = C101567h.this.f297348w;
                LruCache<String, String> lruCache = C32752h.f89139a;
                Logger.m21791i("MicroMsg.Music.PieceFileCache", "deleteFileByUrl");
                C98330i.m127111a(C102984b.m136168e(str));
            }
        }

        public void onPrepared(BaseMediaPlayer baseMediaPlayer) {
            Log.m105924i("MicroMsg.Music.QQMusicPlayer", "onPrepared");
        }

        public void onSeekComplete(BaseMediaPlayer baseMediaPlayer, int i) {
            Log.m105925i("MicroMsg.Music.QQMusicPlayer", "onSeekComplete seekPosition:%d", Integer.valueOf(i));
            int i2 = C101567h.this.f297351z;
            if (i2 != 0) {
                Log.m105925i("MicroMsg.Music.QQMusicPlayer", "seek complete to startTime :%d", Integer.valueOf(i2));
                C101567h.this.f297351z = 0;
                return;
            }
            Log.m105924i("MicroMsg.Music.QQMusicPlayer", "_onSeekComplete");
            C101106m mVar = this.f297352d;
            if (mVar == null) {
                Log.m105920e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
                return;
            }
            C101567h.this.mo141029t(mVar);
            if (C101567h.this.mo32206f()) {
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "seek end, send play event!");
                C101567h.this.mo141028s(this.f297352d);
            }
        }

        public void onStarted(BaseMediaPlayer baseMediaPlayer) {
            Log.m105924i("MicroMsg.Music.QQMusicPlayer", "onStarted");
        }

        public void onStateChanged(BaseMediaPlayer baseMediaPlayer, int i) {
            Log.m105925i("MicroMsg.Music.QQMusicPlayer", "onStateChanged state %d", Integer.valueOf(i));
            if (i == 3) {
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "onStateChanged PREPARING!");
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "_onPreparing");
                C101567h hVar = C101567h.this;
                C101106m mVar = hVar.f297342q;
                this.f297352d = mVar;
                if (mVar == null) {
                    Log.m105920e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
                } else {
                    hVar.mo141027r(mVar);
                }
            } else if (i == 2) {
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "onStateChanged PREPARED!");
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "_onPrepared");
                int i2 = C101567h.this.f297351z;
                if (i2 != 0) {
                    Log.m105925i("MicroMsg.Music.QQMusicPlayer", "seek to startTime:%d", Integer.valueOf(i2));
                    C101567h hVar2 = C101567h.this;
                    hVar2.mo32203a(hVar2.f297351z);
                }
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "start to play");
                if (C101567h.this.mo141035z()) {
                    C101567h hVar3 = C101567h.this;
                    C101106m mVar2 = hVar3.f297342q;
                    if (mVar2 == null) {
                        Log.m105920e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
                        return;
                    }
                    hVar3.mo141026q(mVar2);
                    try {
                        CommonPlayer commonPlayer = C101567h.this.f297343r;
                        if (commonPlayer != null) {
                            commonPlayer.start();
                            if (!(C101567h.this.f297343r.getCurrentAudioInformation() == null || C101567h.this.f297343r.getCurrentAudioInformation().getAudioType() == null)) {
                                Log.m105925i("MicroMsg.Music.QQMusicPlayer", "getAudioType:%d", Integer.valueOf(C101567h.this.f297343r.getCurrentAudioInformation().getAudioType().getValue()));
                                C101567h hVar4 = C101567h.this;
                                hVar4.f297337B = hVar4.f297343r.getCurrentAudioInformation().getAudioType();
                                C101567h.m133364C(C101567h.this);
                            }
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", e, "_onPrepared", new Object[0]);
                        C101567h hVar5 = C101567h.this;
                        hVar5.mo141024o(hVar5.f297342q, 502);
                        C101567h hVar6 = C101567h.this;
                        hVar6.mo141047D(hVar6.f297342q, 502);
                    }
                    C101567h.this.f297345t = true;
                    return;
                }
                Log.m105920e("MicroMsg.Music.QQMusicPlayer", "request focus error");
            } else if (i == 4) {
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "onStateChanged STARTED!");
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "_onStart");
                C101567h hVar7 = C101567h.this;
                C101106m mVar3 = hVar7.f297342q;
                this.f297352d = mVar3;
                if (mVar3 == null) {
                    Log.m105920e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
                    return;
                }
                hVar7.f297308j = SystemClock.elapsedRealtime();
                C101567h hVar8 = C101567h.this;
                if (hVar8.f297303e == "pause") {
                    hVar8.mo141028s(this.f297352d);
                } else {
                    hVar8.mo141031v(this.f297352d);
                }
                C101567h hVar9 = C101567h.this;
                C101570b bVar = hVar9.f297346u;
                if (bVar != null) {
                    bVar.f297354d = true;
                }
                C101570b bVar2 = new C101570b((C101568a) null);
                hVar9.f297346u = bVar2;
                bVar2.f297354d = false;
                ThreadPool.post(bVar2, "music_play_progress_runnable");
            } else if (i == 5) {
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "onStateChanged PAUSED!");
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "_onPause");
                if (this.f297352d == null) {
                    Log.m105920e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
                    return;
                }
                C101567h hVar10 = C101567h.this;
                long j = hVar10.f297309n;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C101567h hVar11 = C101567h.this;
                hVar10.f297309n = j + (elapsedRealtime - hVar11.f297308j);
                hVar11.mo141025p(this.f297352d);
            } else if (i == 6) {
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "onStateChanged STOPPED!");
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "_onStop");
                if (this.f297352d == null) {
                    Log.m105920e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
                    return;
                }
                C101106m k = C99364n.m129616h().mo138832k();
                if (k == null) {
                    Log.m105920e("MicroMsg.Music.QQMusicPlayer", "currentMusic is null");
                } else if (k.mo140555a(this.f297352d)) {
                    C101567h.this.mo141032w(this.f297352d);
                } else {
                    C101567h hVar12 = C101567h.this;
                    C101106m mVar4 = this.f297352d;
                    hVar12.getClass();
                    Log.m105924i("MicroMsg.Music.BaseMusicPlayer", "onStopForReportEvent");
                    MusicPlayerEvent musicPlayerEvent = new MusicPlayerEvent();
                    MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
                    aVar.f9337a = 18;
                    aVar.f9338b = mVar4;
                    musicPlayerEvent.asyncPublish(Looper.getMainLooper());
                }
            } else if (i == 7) {
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "onStateChanged PLAYBACKCOMPLETED!");
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "_onCompletion");
                if (this.f297352d == null) {
                    Log.m105920e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
                    return;
                }
                C101567h.this.mo141051H();
                C101567h hVar13 = C101567h.this;
                hVar13.f297345t = false;
                hVar13.mo141023n(hVar13.f297342q);
                C101567h hVar14 = C101567h.this;
                C101570b bVar3 = hVar14.f297346u;
                if (bVar3 != null) {
                    bVar3.f297354d = true;
                    hVar14.f297346u = null;
                }
            } else if (i == 8) {
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "onStateChanged END!");
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "_onEnd");
            } else if (i == 9) {
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "onStateChanged ERROR!");
            }
        }
    }

    /* renamed from: sa2.h$b */
    public class C101570b implements Runnable {

        /* renamed from: d */
        public boolean f297354d = true;

        public C101570b(C101568a aVar) {
        }

        public void run() {
            Log.m105924i("MicroMsg.Music.QQMusicPlayer", "start run play progress task");
            while (!this.f297354d) {
                try {
                    C101567h hVar = C101567h.this;
                    if (hVar.f297343r != null && hVar.mo32206f()) {
                        C101567h hVar2 = C101567h.this;
                        hVar2.getClass();
                        C101106m k = C99364n.m129616h().mo138832k();
                        if (k != null) {
                            if (k.mo140555a(hVar2.f297342q) && hVar2.f297343r != null && hVar2.mo32206f()) {
                                int currentPosition = (int) hVar2.f297343r.getCurrentPosition();
                                int duration = hVar2.f297343r.getDuration();
                                if (currentPosition > 0 && duration > 0) {
                                    Iterator<C94223g.C94224a> it = hVar2.f297311p.iterator();
                                    while (it.hasNext()) {
                                        it.next().mo80435a(currentPosition, duration);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.Music.QQMusicPlayer", "PlayProgressTask run exception:" + e.getMessage());
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public C101567h() {
        AudioPlayerUtils.m19994b();
    }

    /* renamed from: C */
    public static void m133364C(C101567h hVar) {
        AudioFormat.AudioType audioType = hVar.f297337B;
        if (audioType != null) {
            Log.m105925i("MicroMsg.Music.QQMusicPlayer", "idKeyReportMusicMimeType audioType:%d, isStatMineType:%b", Integer.valueOf(audioType.getValue()), Boolean.valueOf(hVar.f297338C));
            if (!hVar.f297338C) {
                Log.m105924i("MicroMsg.Music.QQMusicPlayer", "idKeyReportMusicMimeType OK");
                hVar.f297338C = true;
                C99357e eVar = hVar.f297305g;
                if (eVar != null) {
                    eVar.mo138798B(hVar.f297342q, hVar.f297337B.getValue());
                }
            }
        }
    }

    /* renamed from: B */
    public final void mo141046B(boolean z) {
        this.f297350y = 0;
        CommonPlayer commonPlayer = this.f297343r;
        boolean z2 = commonPlayer != null && commonPlayer.getPlayerState() == 3;
        boolean f = mo32206f();
        Object[] objArr = new Object[4];
        objArr[0] = Boolean.valueOf(z2);
        objArr[1] = Boolean.valueOf(f);
        CommonPlayer commonPlayer2 = this.f297343r;
        objArr[2] = Boolean.valueOf(commonPlayer2 != null && commonPlayer2.getPlayerState() == 5);
        CommonPlayer commonPlayer3 = this.f297343r;
        objArr[3] = Boolean.valueOf(commonPlayer3 != null && commonPlayer3.getPlayerState() == 2);
        Log.m105925i("MicroMsg.Music.QQMusicPlayer", "resume, isPreparing:%b, isPlayingMusic:%b, paused:%b, isPrepared:%b", objArr);
        CommonPlayer commonPlayer4 = this.f297343r;
        if (commonPlayer4 != null) {
            if (!(commonPlayer4 != null && commonPlayer4.getPlayerState() == 5)) {
                CommonPlayer commonPlayer5 = this.f297343r;
                if (!(commonPlayer5 != null && commonPlayer5.getPlayerState() == 2)) {
                    return;
                }
            }
            if (!f) {
                Log.m105925i("MicroMsg.Music.QQMusicPlayer", "requestFocus:%b", Boolean.valueOf(z));
                if (!z || mo141035z()) {
                    try {
                        this.f297343r.start();
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", e, "resume", new Object[0]);
                        mo141024o(this.f297342q, 502);
                        mo141047D(this.f297342q, 502);
                    }
                } else {
                    Log.m105920e("MicroMsg.Music.QQMusicPlayer", "request focus error");
                }
                this.f297345t = true;
            }
        }
    }

    /* renamed from: D */
    public final void mo141047D(C101106m mVar, int i) {
        C99357e eVar = this.f297305g;
        if (eVar != null) {
            eVar.mo138804g0(mVar, i);
        }
    }

    /* renamed from: E */
    public void mo141048E() {
        this.f297305g = (C99357e) C101991b.m134284b(C99357e.class);
        C99355b m = C99364n.m129618m();
        this.f297306h = m;
        if (m != null) {
            this.f297339D = m.mo138779a();
        }
    }

    /* renamed from: F */
    public void mo141049F(float f) {
        CommonPlayer commonPlayer = this.f297343r;
        if (commonPlayer != null) {
            if (f < 0.5f || f > 2.0f) {
                commonPlayer.setSpeed(1.0f);
                return;
            }
            Log.m105925i("MicroMsg.Music.QQMusicPlayer", "set speed :%f", Float.valueOf(f));
            this.f297343r.setSpeed(f);
        }
    }

    /* renamed from: G */
    public void mo141050G(float f) {
        CommonPlayer commonPlayer = this.f297343r;
        if (commonPlayer != null && f >= 0.0f) {
            commonPlayer.setVolume(f, f);
        }
    }

    /* renamed from: H */
    public final void mo141051H() {
        if (this.f297343r != null) {
            this.f297307i = (long) getPlayPosition();
            this.f297309n += SystemClock.elapsedRealtime() - this.f297308j;
            long duration = (long) getDuration();
            C99357e eVar = this.f297305g;
            if (eVar != null) {
                eVar.mo138803g(this.f297342q, this.f297307i, this.f297309n, duration);
            }
        }
    }

    /* renamed from: a */
    public boolean mo32203a(int i) {
        int duration = getDuration();
        Log.m105925i("MicroMsg.Music.QQMusicPlayer", "seekToMusic pos:%d, duration:%d", Integer.valueOf(i), Integer.valueOf(duration));
        if (duration < 0 || i > duration) {
            Log.m105921e("MicroMsg.Music.QQMusicPlayer", "position is invalid, position:%d, duration:%d", Integer.valueOf(i), Integer.valueOf(duration));
            mo32210j();
            return false;
        }
        if (this.f297343r != null) {
            mo141030u(this.f297342q);
            this.f297343r.seekTo(i);
        }
        return true;
    }

    /* renamed from: b */
    public void mo32204b() {
        Log.m105924i("MicroMsg.Music.QQMusicPlayer", "pauseAndAbandonFocus");
        pause();
        mo141021l();
    }

    /* renamed from: c */
    public boolean mo32205c() {
        return true;
    }

    /* renamed from: d */
    public C12155j mo32193d() {
        int duration = getDuration();
        int playPosition = getPlayPosition();
        boolean f = mo32206f();
        CommonPlayer commonPlayer = this.f297343r;
        int i = 0;
        int bufferedPercentage = commonPlayer != null ? commonPlayer.getBufferedPercentage() : 0;
        if (bufferedPercentage < 0 || bufferedPercentage > 100) {
            bufferedPercentage = 0;
        }
        if (bufferedPercentage >= 0) {
            i = bufferedPercentage;
        }
        C12155j jVar = this.f297344s;
        if (jVar != null) {
            jVar.f35260a = duration;
            jVar.f35261b = playPosition;
            jVar.f35262c = f ? 1 : 0;
            jVar.f35263d = i;
        } else {
            this.f297344s = new C12155j(duration, playPosition, f, i);
        }
        this.f297344s.getClass();
        C12155j jVar2 = this.f297344s;
        jVar2.f35264e = this.f297303e;
        return jVar2;
    }

    /* renamed from: e */
    public boolean mo32194e() {
        return this.f297345t && this.f297340E;
    }

    /* renamed from: f */
    public boolean mo32206f() {
        CommonPlayer commonPlayer = this.f297343r;
        return commonPlayer != null && commonPlayer.getPlayerState() == 4;
    }

    public int getDuration() {
        CommonPlayer commonPlayer = this.f297343r;
        if (commonPlayer != null) {
            return commonPlayer.getDuration();
        }
        return -1;
    }

    public int getPlayPosition() {
        CommonPlayer commonPlayer = this.f297343r;
        if (commonPlayer != null) {
            return (int) commonPlayer.getCurrentPosition();
        }
        return -1;
    }

    /* renamed from: h */
    public void mo32209h(boolean z) {
        mo141046B(z);
    }

    /* renamed from: i */
    public void mo32196i() {
        this.f297340E = true;
        Log.m105924i("MicroMsg.Music.QQMusicPlayer", "passivePause");
        if (this.f297343r != null && mo32206f()) {
            try {
                this.f297343r.pause();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", e, "passivePause", new Object[0]);
                mo141024o(this.f297342q, 503);
                mo141047D(this.f297342q, 503);
            }
        }
    }

    /* renamed from: j */
    public void mo32210j() {
        Log.m105924i("MicroMsg.Music.QQMusicPlayer", "stopPlay");
        try {
            mo141051H();
            CommonPlayer commonPlayer = this.f297343r;
            if (commonPlayer != null) {
                commonPlayer.stop();
            }
            C101570b bVar = this.f297346u;
            if (bVar != null) {
                bVar.f297354d = true;
                this.f297346u = null;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", e, "stopPlay", new Object[0]);
            mo141024o(this.f297342q, 504);
            mo141047D(this.f297342q, 504);
        }
        mo141021l();
        this.f297345t = false;
        this.f297340E = false;
    }

    /* renamed from: k */
    public boolean mo32211k() {
        if (this.f297345t) {
            CommonPlayer commonPlayer = this.f297343r;
            if (!(commonPlayer != null && commonPlayer.getPlayerState() == 3)) {
                return true;
            }
        }
        return false;
    }

    public void pause() {
        this.f297340E = false;
        Log.m105924i("MicroMsg.Music.QQMusicPlayer", "pause");
        if (this.f297343r != null && mo32206f()) {
            try {
                this.f297343r.pause();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", e, "pause", new Object[0]);
                mo141024o(this.f297342q, 503);
                mo141047D(this.f297342q, 503);
            }
        }
    }

    public void resume() {
        mo141046B(true);
    }
}
