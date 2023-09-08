package sa2;

import android.media.MediaPlayer;
import com.tencent.p014mm.plugin.music.player.base.C94218b;
import com.tencent.p014mm.plugin.music.player.base.C94219c;
import com.tencent.p014mm.plugin.music.player.base.C94220d;
import com.tencent.p014mm.plugin.music.player.base.C94221e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.tav.core.AssetExtension;
import com.tencent.xweb.IXWebBroadcastListener;
import la2.C99356c;
import ua2.C101991b;

/* renamed from: sa2.b */
public class C101557b extends C94221e {

    /* renamed from: d */
    public C101562e f297313d;

    /* renamed from: e */
    public MediaPlayer f297314e;

    /* renamed from: f */
    public boolean f297315f = true;

    /* renamed from: g */
    public boolean f297316g = false;

    /* renamed from: sa2.b$a */
    public class C101558a implements MediaPlayer.OnCompletionListener {
        public C101558a() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            Log.m105920e("MicroMsg.Music.MMMediaPlayer", "onCompletion, stop music");
            C101557b bVar = C101557b.this;
            if (bVar.f297316g) {
                bVar.mo129530f(false);
            } else {
                bVar.mo129530f(true);
            }
        }
    }

    /* renamed from: sa2.b$b */
    public class C101559b implements MediaPlayer.OnSeekCompleteListener {
        public C101559b() {
        }

        public void onSeekComplete(MediaPlayer mediaPlayer) {
            MediaPlayer mediaPlayer2 = C101557b.this.f297314e;
            if (mediaPlayer2 != null && mediaPlayer2.isPlaying()) {
                Log.m105924i("MicroMsg.Music.MMMediaPlayer", "onSeekComplete");
                try {
                    C101557b.this.f297314e.start();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e, IXWebBroadcastListener.STAGE_START, new Object[0]);
                }
            }
        }
    }

    /* renamed from: sa2.b$c */
    public class C101560c implements MediaPlayer.OnPreparedListener {
        public C101560c() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            if (C101557b.this.f297314e != null) {
                Log.m105924i("MicroMsg.Music.MMMediaPlayer", "onPrepared");
                try {
                    C101557b.this.f297314e.start();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e, IXWebBroadcastListener.STAGE_START, new Object[0]);
                }
                C101557b bVar = C101557b.this;
                bVar.f297315f = false;
                if (bVar.f272184a != null) {
                    MMHandlerThread.postToMainThread(new C94219c(bVar));
                }
                C101557b bVar2 = C101557b.this;
                C101562e eVar = bVar2.f297313d;
                if (eVar != null) {
                    eVar.f297321d = true;
                }
                C101562e eVar2 = new C101562e((C101558a) null);
                bVar2.f297313d = eVar2;
                eVar2.f297321d = false;
                ThreadPool.post(eVar2, "music_play_progress_runnable");
            }
        }
    }

    /* renamed from: sa2.b$d */
    public class C101561d implements MediaPlayer.OnErrorListener {
        public C101561d() {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            Log.m105921e("MicroMsg.Music.MMMediaPlayer", "onError, what:%d, extra:%d", Integer.valueOf(i), Integer.valueOf(i2));
            C101557b bVar = C101557b.this;
            bVar.f297316g = true;
            if (bVar.f272184a != null) {
                MMHandlerThread.postToMainThread(new C94218b(bVar, false));
            }
            return false;
        }
    }

    /* renamed from: sa2.b$e */
    public class C101562e implements Runnable {

        /* renamed from: d */
        public boolean f297321d = true;

        public C101562e(C101558a aVar) {
        }

        public void run() {
            Log.m105924i("MicroMsg.Music.MMMediaPlayer", "start run play progress task");
            while (!this.f297321d) {
                try {
                    MediaPlayer mediaPlayer = C101557b.this.f297314e;
                    if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                        int currentPosition = C101557b.this.f297314e.getCurrentPosition();
                        int duration = C101557b.this.f297314e.getDuration();
                        if (currentPosition > 0 && duration > 0) {
                            int i = (currentPosition * 100) / duration;
                            C101557b bVar = C101557b.this;
                            if (bVar.f272184a != null) {
                                MMHandlerThread.postToMainThread(new C94220d(bVar, i));
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e, "onPlayUpdate", new Object[0]);
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e2) {
                    Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e2, "sleep", new Object[0]);
                }
            }
        }
    }

    public C101557b() {
        C99356c cVar = (C99356c) C101991b.m134284b(C99356c.class);
        if (cVar != null) {
            this.f297314e = cVar.mo138796s0();
        } else {
            Log.m105920e("MicroMsg.Music.MMMediaPlayer", "mediaResService is null");
        }
        if (this.f297314e == null) {
            this.f297314e = new MediaPlayer();
        }
        this.f297314e.setAudioStreamType(3);
        this.f297314e.setOnCompletionListener(new C101558a());
        this.f297314e.setOnSeekCompleteListener(new C101559b());
        this.f297314e.setOnPreparedListener(new C101560c());
        this.f297314e.setOnErrorListener(new C101561d());
    }

    /* renamed from: a */
    public int mo129525a() {
        try {
            return this.f297314e.getCurrentPosition();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e, "getCurrentPos", new Object[0]);
            return 0;
        }
    }

    /* renamed from: b */
    public int mo129526b() {
        try {
            return this.f297314e.getDuration();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e, "getDuration", new Object[0]);
            return 0;
        }
    }

    /* renamed from: c */
    public String mo129527c() {
        return null;
    }

    /* renamed from: d */
    public boolean mo129528d() {
        return !this.f297315f;
    }

    /* renamed from: e */
    public boolean mo129529e() {
        try {
            return this.f297314e.isPlaying();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e, "setSourcePath", new Object[0]);
            return false;
        }
    }

    /* renamed from: g */
    public void mo129531g() {
        Log.m105924i("MicroMsg.Music.MMMediaPlayer", "pause");
        if (!this.f297315f) {
            this.f297314e.pause();
        }
    }

    /* renamed from: h */
    public void mo129532h() {
        Log.m105924i("MicroMsg.Music.MMMediaPlayer", AssetExtension.SCENE_PLAY);
        if (!this.f297315f) {
            try {
                if (!this.f297314e.isPlaying()) {
                    this.f297314e.start();
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e, IXWebBroadcastListener.STAGE_START, new Object[0]);
            }
        } else {
            try {
                this.f297314e.prepareAsync();
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e2, "prepareAsync", new Object[0]);
            }
        }
    }

    /* renamed from: i */
    public void mo129533i(long j) {
        Log.m105925i("MicroMsg.Music.MMMediaPlayer", "seek %d", Long.valueOf(j));
        this.f297314e.seekTo((int) j);
    }

    /* renamed from: j */
    public void mo129534j(String str) {
        Log.m105925i("MicroMsg.Music.MMMediaPlayer", "setSourcePath, sourcePath:%s", str);
        try {
            this.f297314e.setDataSource(str);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e, "setSourcePath", new Object[0]);
        }
    }

    /* renamed from: k */
    public void mo129535k() {
        Log.m105924i("MicroMsg.Music.MMMediaPlayer", "stop");
        this.f297315f = true;
        try {
            MediaPlayer mediaPlayer = this.f297314e;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                this.f297314e.release();
            }
            C101562e eVar = this.f297313d;
            if (eVar != null) {
                eVar.f297321d = true;
                this.f297313d = null;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e, "stop", new Object[0]);
        }
        mo129530f(false);
    }
}
