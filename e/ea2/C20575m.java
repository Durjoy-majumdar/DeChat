package ea2;

import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.AudioPlayerEvent;
import com.tencent.p014mm.plugin.music.player.base.AudioPlayerUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.BaseMediaPlayer;
import com.tencent.qqmusic.mediaplayer.BufferInfo;
import com.tencent.qqmusic.mediaplayer.CommonPlayer;
import com.tencent.qqmusic.mediaplayer.FloatBufferInfo;
import com.tencent.qqmusic.mediaplayer.PlayerListenerCallback;
import com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import com.tencent.tav.core.AssetExtension;
import ea2.C20561h;
import ea2.C86468a;
import fa2.C20705c;
import ha2.C32752h;
import ha2.C98327c;
import ha2.C98329e;
import ha2.C98330i;
import java.net.URL;
import nb0.C88912b;
import nb0.C88914d;
import p910lj.C76701a;
import ua2.C101991b;
import wa2.C90903c;
import xa2.C102584b;
import za2.C102984b;
import za2.C102987e;

/* renamed from: ea2.m */
public class C20575m extends C20573k {

    /* renamed from: A */
    public long f57908A;

    /* renamed from: B */
    public long f57909B;

    /* renamed from: C */
    public C20705c f57910C;

    /* renamed from: D */
    public C86468a f57911D;

    /* renamed from: E */
    public String f57912E;

    /* renamed from: F */
    public PlayerListenerCallback f57913F;

    /* renamed from: G */
    public IAudioListener f57914G;

    /* renamed from: f */
    public String f57915f;

    /* renamed from: g */
    public C88912b f57916g;

    /* renamed from: h */
    public CommonPlayer f57917h;

    /* renamed from: i */
    public C88914d f57918i;

    /* renamed from: j */
    public boolean f57919j;

    /* renamed from: n */
    public boolean f57920n;

    /* renamed from: o */
    public boolean f57921o;

    /* renamed from: p */
    public C20581c f57922p;

    /* renamed from: q */
    public C102584b f57923q;

    /* renamed from: r */
    public String f57924r;

    /* renamed from: s */
    public int f57925s;

    /* renamed from: t */
    public int f57926t;

    /* renamed from: u */
    public int f57927u;

    /* renamed from: v */
    public boolean f57928v;

    /* renamed from: w */
    public long f57929w;

    /* renamed from: x */
    public AudioFormat.AudioType f57930x;

    /* renamed from: y */
    public boolean f57931y;

    /* renamed from: z */
    public MMHandler f57932z;

    /* renamed from: ea2.m$a */
    public class C20576a implements PlayerListenerCallback {

        /* renamed from: d */
        public C88912b f57933d = null;

        /* renamed from: ea2.m$a$a */
        public class C20577a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f57935d;

            public C20577a(int i) {
                this.f57935d = i;
            }

            public void run() {
                Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "onSeekComplete, seekPosition:%d", Integer.valueOf(this.f57935d));
                C20576a aVar = C20576a.this;
                int i = C20575m.this.f57927u;
                if (i != 0) {
                    Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "seek complete to startTime :%d", Integer.valueOf(i));
                    C20575m.this.f57927u = 0;
                    return;
                }
                aVar.getClass();
                Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "_onSeekComplete");
                C20575m.this.mo32200o();
                if (C20575m.this.mo32206f()) {
                    Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "seek end, send play event!");
                    C20575m mVar = C20575m.this;
                    mVar.getClass();
                    Log.m105924i("MicroMsg.Audio.BaseAudioPlayer", "onResumeEvent");
                    AudioPlayerEvent audioPlayerEvent = new AudioPlayerEvent();
                    AudioPlayerEvent.C17674a aVar2 = audioPlayerEvent.f48073d;
                    aVar2.f48074a = 1;
                    aVar2.f48077d = AssetExtension.SCENE_PLAY;
                    aVar2.f48076c = mVar.f57915f;
                    aVar2.f48078e = mVar.mo32195g();
                    audioPlayerEvent.asyncPublish(Looper.getMainLooper());
                    C20560e eVar = mVar.f57907e;
                    if (eVar != null) {
                        ((C20561h.C20563b) eVar).mo32186a(mVar.f57915f);
                    }
                }
            }
        }

        /* renamed from: ea2.m$a$c */
        public class C20578c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f57937d;

            public C20578c(int i) {
                this.f57937d = i;
            }

            public void run() {
                String str;
                String str2;
                boolean z;
                CommonPlayer commonPlayer;
                Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged state %d, %s", Integer.valueOf(this.f57937d), C20575m.this.f57915f);
                int i = this.f57937d;
                if (i == 3) {
                    Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged PREPARING!");
                    C20576a aVar = C20576a.this;
                    aVar.getClass();
                    Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "_onPreparing");
                    C20575m mVar = C20575m.this;
                    C88912b bVar = mVar.f57916g;
                    aVar.f57933d = bVar;
                    if (bVar == null) {
                        Log.m105920e("MicroMsg.Audio.QQAudioPlayer", "cbMusic is null");
                    } else if (mVar.f57921o || mVar.f57920n) {
                        Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "isPausedOnBackground or isForcePause is true, do stop player and not send event");
                    } else {
                        Log.m105924i("MicroMsg.Audio.BaseAudioPlayer", "onPreparintEvent");
                        AudioPlayerEvent audioPlayerEvent = new AudioPlayerEvent();
                        AudioPlayerEvent.C17674a aVar2 = audioPlayerEvent.f48073d;
                        aVar2.f48074a = 9;
                        aVar2.f48077d = "waiting";
                        aVar2.f48076c = mVar.f57915f;
                        aVar2.f48078e = mVar.mo32195g();
                        audioPlayerEvent.asyncPublish(Looper.getMainLooper());
                    }
                    C20575m.this.f57908A = System.currentTimeMillis();
                } else if (i == 2) {
                    Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged PREPARED!");
                    Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "preparing cost time :%d!", Long.valueOf(System.currentTimeMillis() - C20575m.this.f57908A));
                    C20576a aVar3 = C20576a.this;
                    aVar3.getClass();
                    Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "_onPrepared");
                    C20575m mVar2 = C20575m.this;
                    aVar3.f57933d = mVar2.f57916g;
                    if (mVar2.f57921o || mVar2.f57920n) {
                        Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "isPausedOnBackground or isForcePause is true, do stop player and not send event");
                        C20575m mVar3 = C20575m.this;
                        if (mVar3.f57921o && (commonPlayer = mVar3.f57917h) != null) {
                            commonPlayer.stop();
                        }
                        C20575m mVar4 = C20575m.this;
                        if (mVar4.f57920n) {
                            mVar4.mo32198m();
                            return;
                        }
                        return;
                    }
                    int i2 = mVar2.f57927u;
                    if (i2 != 0) {
                        Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "seek to startTime:%d", Integer.valueOf(i2));
                        C20575m mVar5 = C20575m.this;
                        mVar5.mo32203a(mVar5.f57927u);
                    }
                    CommonPlayer commonPlayer2 = C20575m.this.f57917h;
                    if (!(commonPlayer2 == null || commonPlayer2.getCurrentAudioInformation() == null || C20575m.this.f57917h.getCurrentAudioInformation().getAudioType() == null)) {
                        C20575m mVar6 = C20575m.this;
                        mVar6.f57930x = mVar6.f57917h.getCurrentAudioInformation().getAudioType();
                        AudioFormat.AudioType audioType = C20575m.this.f57930x;
                        if (audioType != null) {
                            Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "getAudioType:%d", Integer.valueOf(audioType.getValue()));
                        }
                        C20575m mVar7 = C20575m.this;
                        AudioFormat.AudioType audioType2 = mVar7.f57930x;
                        if (audioType2 != null) {
                            Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "idKeyReportAudioMimeType audioType:%d, isStatMineType:%b", Integer.valueOf(audioType2.getValue()), Boolean.valueOf(mVar7.f57931y));
                            if (!mVar7.f57931y) {
                                Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "idKeyReportAudioMimeType OK");
                                mVar7.f57931y = true;
                                C20705c cVar = mVar7.f57910C;
                                if (cVar != null) {
                                    cVar.mo32417l(mVar7.f57930x.getValue());
                                }
                            }
                        }
                    }
                    C20575m.this.mo32199n();
                    if (!C20575m.this.f57928v) {
                        Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "autoplay is false, don't start auto play!");
                        return;
                    }
                    Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "start to play");
                    try {
                        C20575m mVar8 = C20575m.this;
                        CommonPlayer commonPlayer3 = mVar8.f57917h;
                        if (commonPlayer3 != null) {
                            float f = (float) mVar8.f57916g.f256427l;
                            commonPlayer3.setVolume(f, f);
                            C20575m.this.mo32214r();
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", e, "_onPrepared", new Object[0]);
                        C20575m.this.mo32197l(502);
                        C20575m.this.mo32217t(502);
                    }
                    C20575m.this.f57919j = true;
                } else if (i == 4) {
                    Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "onStateChanged STARTED!");
                    Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "start cost time :%d!", Long.valueOf(System.currentTimeMillis() - C20575m.this.f57908A));
                    C20576a aVar4 = C20576a.this;
                    aVar4.getClass();
                    Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "_onStart");
                    C20575m mVar9 = C20575m.this;
                    C20705c cVar2 = mVar9.f57910C;
                    if (cVar2 != null) {
                        C88912b bVar2 = mVar9.f57916g;
                        String str3 = bVar2.f256416a;
                        String str4 = bVar2.f256417b;
                        long currentTimeMillis = System.currentTimeMillis();
                        C88912b bVar3 = C20575m.this.f57916g;
                        str = "MicroMsg.Audio.QQAudioPlayer";
                        cVar2.mo32415c(str3, str4, currentTimeMillis - bVar3.f256430o, bVar3.f256431p, bVar3.f256432q, true);
                    } else {
                        str = "MicroMsg.Audio.QQAudioPlayer";
                    }
                    C20575m mVar10 = C20575m.this;
                    aVar4.f57933d = mVar10.f57916g;
                    if (mVar10.f57921o) {
                        z = false;
                        str2 = str;
                    } else if (mVar10.f57920n) {
                        str2 = str;
                        z = false;
                    } else {
                        Log.m105925i("MicroMsg.Audio.BaseAudioPlayer", "onStartEvent %b", Boolean.valueOf(mVar10.mo32206f()));
                        AudioPlayerEvent audioPlayerEvent2 = new AudioPlayerEvent();
                        AudioPlayerEvent.C17674a aVar5 = audioPlayerEvent2.f48073d;
                        aVar5.f48074a = 0;
                        aVar5.f48077d = AssetExtension.SCENE_PLAY;
                        aVar5.f48076c = mVar10.f57915f;
                        aVar5.f48078e = mVar10.mo32195g();
                        audioPlayerEvent2.asyncPublish(Looper.getMainLooper());
                        C20560e eVar = mVar10.f57907e;
                        if (eVar != null) {
                            ((C20561h.C20563b) eVar).mo32186a(mVar10.f57915f);
                        }
                        C20575m mVar11 = C20575m.this;
                        C20581c cVar3 = mVar11.f57922p;
                        if (cVar3 != null) {
                            cVar3.f57944d = true;
                        }
                        C20581c cVar4 = new C20581c((C20576a) null);
                        mVar11.f57922p = cVar4;
                        cVar4.f57944d = false;
                        return;
                    }
                    Log.m105924i(str2, "isPausedOnBackground or isForcePause is true, do stop player and not send event");
                    C20575m mVar12 = C20575m.this;
                    CommonPlayer commonPlayer4 = mVar12.f57917h;
                    if (commonPlayer4 != null && mVar12.f57919j) {
                        mVar12.f57919j = z;
                        commonPlayer4.stop();
                    }
                } else {
                    String str5 = "MicroMsg.Audio.QQAudioPlayer";
                    if (i == 5) {
                        Log.m105924i(str5, "onStateChanged PAUSED!");
                        C20576a aVar6 = C20576a.this;
                        aVar6.getClass();
                        Log.m105924i(str5, "_onPause");
                        C20575m.this.mo32198m();
                    } else if (i == 6) {
                        Log.m105924i(str5, "onStateChanged STOPPED!");
                        C20576a aVar7 = C20576a.this;
                        aVar7.getClass();
                        Log.m105924i(str5, "_onStop");
                        if (aVar7.f57933d == null) {
                            Log.m105920e(str5, "currentMusic is null");
                            return;
                        }
                        C20575m mVar13 = C20575m.this;
                        mVar13.f57919j = false;
                        mVar13.f57909B = System.currentTimeMillis();
                        if (C20575m.this.f57915f.equalsIgnoreCase(aVar7.f57933d.f256416a)) {
                            C20575m mVar14 = C20575m.this;
                            if (mVar14.f57921o) {
                                Log.m105924i(str5, "stop play, but send pause state event");
                                C20575m.this.mo32198m();
                                return;
                            }
                            mVar14.mo32202p();
                        }
                    } else if (i == 7) {
                        Log.m105924i(str5, "onStateChanged PLAYBACKCOMPLETED!");
                        C20576a aVar8 = C20576a.this;
                        aVar8.getClass();
                        Log.m105924i(str5, "_onCompletion");
                        C20575m mVar15 = C20575m.this;
                        if (!mVar15.f57916g.f256423h) {
                            Log.m105924i("MicroMsg.Audio.BaseAudioPlayer", "onCompleteEvent");
                            AudioPlayerEvent audioPlayerEvent3 = new AudioPlayerEvent();
                            AudioPlayerEvent.C17674a aVar9 = audioPlayerEvent3.f48073d;
                            aVar9.f48074a = 5;
                            aVar9.f48077d = "ended";
                            aVar9.f48076c = mVar15.f57915f;
                            aVar9.f48078e = mVar15.mo32195g();
                            audioPlayerEvent3.asyncPublish(Looper.getMainLooper());
                            C20560e eVar2 = mVar15.f57907e;
                            if (eVar2 != null) {
                                String str6 = mVar15.f57915f;
                                C20561h.C20563b bVar4 = (C20561h.C20563b) eVar2;
                                C20575m o = C20561h.this.mo32174o(str6);
                                if (o == null) {
                                    Log.m105920e("MicroMsg.Audio.AudioPlayerMgr", "onComplete player is null");
                                } else {
                                    C20561h.this.mo32155N(str6, o);
                                    C20561h.this.mo32181w(str6, o);
                                    C20561h.m22331c(C20561h.this);
                                    C20561h.this.mo32147F(Camera2CameraImpl.StateCallback.CameraReopenMonitor.ACTIVE_REOPEN_LIMIT_MS);
                                    C20561h.this.mo32160S(str6);
                                    C20561h.this.mo32142A(str6);
                                }
                            }
                        }
                        C20575m mVar16 = C20575m.this;
                        C20581c cVar5 = mVar16.f57922p;
                        if (cVar5 != null) {
                            cVar5.f57944d = true;
                            mVar16.f57922p = null;
                        }
                        mVar16.f57909B = System.currentTimeMillis();
                        Log.m105925i(str5, "play end, isPausedOnBackground:%b, playParam.loop:%b, isStartPlaying:%b, ", Boolean.valueOf(C20575m.this.f57921o), Boolean.valueOf(C20575m.this.f57916g.f256423h), Boolean.valueOf(C20575m.this.f57919j));
                        C20575m mVar17 = C20575m.this;
                        if (mVar17.f57921o) {
                            mVar17.f57919j = false;
                            mVar17.f57927u = 0;
                            mVar17.f57928v = true;
                            Log.m105924i(str5, "isPausedOnBackground is true, do stop player and don't play again");
                        } else if (mVar17.f57920n) {
                            mVar17.f57919j = false;
                            mVar17.f57927u = 0;
                            mVar17.f57928v = true;
                            Log.m105924i(str5, "isForcePause is true, do stop player and don't play again");
                        } else if (!mVar17.f57916g.f256423h || !mVar17.f57919j) {
                            Log.m105924i(str5, "play end, but not loop play");
                            C20575m mVar18 = C20575m.this;
                            mVar18.f57919j = false;
                            mVar18.f57927u = 0;
                            mVar18.f57928v = true;
                        } else {
                            Log.m105924i(str5, "play end normally and loop play again");
                            C20575m mVar19 = C20575m.this;
                            mVar19.f57919j = false;
                            mVar19.f57927u = 0;
                            mVar19.f57928v = true;
                            mVar19.mo32218u();
                        }
                    } else if (i == 8) {
                        Log.m105924i(str5, "onStateChanged END!");
                        C20576a.this.getClass();
                        Log.m105924i(str5, "_onEnd");
                    } else if (i == 9) {
                        Log.m105924i(str5, "onStateChanged ERROR!");
                    }
                }
            }
        }

        /* renamed from: ea2.m$a$b */
        public class C20579b implements Runnable {
            public C20579b() {
            }

            public void run() {
                boolean z;
                C20575m.this.getClass();
                if (C98329e.m127108d()) {
                    z = ((C98327c) C101991b.m134284b(C98327c.class)).mo137649k();
                } else {
                    Log.m105920e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
                    z = false;
                }
                if (z) {
                    C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.h29), 0).show();
                }
            }
        }

        public C20576a() {
        }

        public void onBufferingUpdate(BaseMediaPlayer baseMediaPlayer, int i) {
        }

        public void onCompletion(BaseMediaPlayer baseMediaPlayer) {
            Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "onCompletion");
        }

        public void onError(BaseMediaPlayer baseMediaPlayer, int i, int i2, int i3) {
            Log.m105921e("MicroMsg.Audio.QQAudioPlayer", "onError what:%d, extra:%d, errCode:%d, audioId:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), C20575m.this.f57915f);
            if (this.f57933d == null) {
                Log.m105920e("MicroMsg.Audio.QQAudioPlayer", "onError, currentParam is null");
                return;
            }
            boolean isNetworkConnected = NetStatusUtil.isNetworkConnected(MMApplicationContext.getContext());
            if (i2 == 80 && isNetworkConnected) {
                Log.m105920e("MicroMsg.Audio.QQAudioPlayer", "connect success, but download is fail!");
            }
            C20575m mVar = C20575m.this;
            int i4 = mVar.f57925s;
            if (i4 >= 1) {
                Log.m105921e("MicroMsg.Audio.QQAudioPlayer", "errorCount %d", Integer.valueOf(i4));
                return;
            }
            mVar.f57919j = false;
            mVar.f57925s = i4 + 1;
            mVar.f57926t = i2;
            mVar.f57909B = System.currentTimeMillis();
            C20575m.this.mo32217t(i2);
            if (C20575m.this.f57915f.equalsIgnoreCase(this.f57933d.f256416a)) {
                C20575m.this.mo32210j();
                MMHandlerThread.postToMainThread(new C20579b());
            }
            C20575m.this.mo32197l(i2);
            C20575m mVar2 = C20575m.this;
            C20581c cVar = mVar2.f57922p;
            if (cVar != null) {
                cVar.f57944d = true;
                mVar2.f57922p = null;
            }
            if (i == 91 && i2 == 55) {
                Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "unknow format ,delete file");
                String str = C20575m.this.f57924r;
                LruCache<String, String> lruCache = C32752h.f89139a;
                Logger.m21791i("MicroMsg.Music.PieceFileCache", "deleteFileByUrl");
                C98330i.m127111a(C102984b.m136168e(str));
            }
        }

        public void onPrepared(BaseMediaPlayer baseMediaPlayer) {
            Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "onPrepared");
        }

        public void onSeekComplete(BaseMediaPlayer baseMediaPlayer, int i) {
            C20575m.this.f57932z.post(new C20577a(i));
        }

        public void onStarted(BaseMediaPlayer baseMediaPlayer) {
            Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "onStarted");
        }

        public void onStateChanged(BaseMediaPlayer baseMediaPlayer, int i) {
            C20575m.this.f57932z.post(new C20578c(i));
        }
    }

    /* renamed from: ea2.m$c */
    public class C20581c implements Runnable {

        /* renamed from: d */
        public boolean f57944d = true;

        public C20581c(C20576a aVar) {
        }

        public void run() {
            Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "start run play progress task");
            while (!this.f57944d) {
                try {
                    C20575m mVar = C20575m.this;
                    if (mVar.f57917h != null && mVar.mo32206f()) {
                        C20575m mVar2 = C20575m.this;
                        if (mVar2.f57915f.equalsIgnoreCase(mVar2.f57916g.f256416a) && mVar2.f57917h != null && mVar2.mo32206f()) {
                            mVar2.f57917h.getCurrentPosition();
                            mVar2.f57917h.getDuration();
                        }
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.Audio.QQAudioPlayer", "PlayProgressTask run exception:" + e.getMessage());
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public C20575m() {
        String str;
        this.f57915f = "";
        this.f57920n = false;
        this.f57921o = false;
        this.f57924r = "";
        this.f57925s = 0;
        this.f57926t = 0;
        this.f57927u = 0;
        this.f57928v = false;
        this.f57929w = 0;
        this.f57930x = AudioFormat.AudioType.UNSUPPORT;
        this.f57931y = false;
        this.f57908A = 0;
        this.f57909B = 0;
        this.f57911D = null;
        this.f57912E = "";
        this.f57913F = new C20576a();
        this.f57914G = new C20580b();
        this.f57915f = C31443g.m39405a();
        AudioPlayerUtils.m19994b();
        C20561h s = C20561h.m22332s();
        synchronized (s.f57891x) {
            if (!s.f57891x.contains(this)) {
                s.f57891x.add(this);
            }
        }
        Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "create QQAudioPlayer instance");
        this.f57932z = new MMHandler(Looper.myLooper());
        if (C98329e.m127108d()) {
            str = ((C98327c) C101991b.m134284b(C98327c.class)).mo137645a();
        } else {
            Log.m105920e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
            str = "";
        }
        this.f57912E = str;
        Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "playCacheTempDir:%s", str);
    }

    /* renamed from: a */
    public boolean mo32203a(int i) {
        int duration = getDuration();
        Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "seekToMusic pos:%d, duration:%d", Integer.valueOf(i), Integer.valueOf(duration));
        if (duration < 0) {
            Log.m105921e("MicroMsg.Audio.QQAudioPlayer", "position is invalid, position:%d, duration:%d", Integer.valueOf(i), Integer.valueOf(duration));
            mo32210j();
            return false;
        } else if (i > duration) {
            Log.m105921e("MicroMsg.Audio.QQAudioPlayer", "position is invalid, position:%d, duration:%d", Integer.valueOf(i), Integer.valueOf(duration));
            return false;
        } else {
            if (this.f57917h != null) {
                Log.m105924i("MicroMsg.Audio.BaseAudioPlayer", "onSeekingEvent");
                AudioPlayerEvent audioPlayerEvent = new AudioPlayerEvent();
                AudioPlayerEvent.C17674a aVar = audioPlayerEvent.f48073d;
                aVar.f48074a = 10;
                aVar.f48077d = "seeking";
                aVar.f48076c = this.f57915f;
                aVar.f48078e = mo32195g();
                audioPlayerEvent.asyncPublish(Looper.getMainLooper());
                this.f57917h.seekTo(i);
            }
            return true;
        }
    }

    /* renamed from: b */
    public void mo32204b() {
        Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "pauseAndAbandonFocus");
        pause();
    }

    /* renamed from: c */
    public boolean mo32205c() {
        return true;
    }

    /* renamed from: f */
    public boolean mo32206f() {
        CommonPlayer commonPlayer = this.f57917h;
        return commonPlayer != null && commonPlayer.getPlayerState() == 4;
    }

    /* renamed from: g */
    public String mo32195g() {
        C88912b bVar = this.f57916g;
        return bVar != null ? bVar.f256429n : "";
    }

    public int getDuration() {
        CommonPlayer commonPlayer = this.f57917h;
        if (commonPlayer != null) {
            return commonPlayer.getDuration();
        }
        return -1;
    }

    public int getPlayPosition() {
        CommonPlayer commonPlayer = this.f57917h;
        if (commonPlayer != null) {
            return (int) commonPlayer.getCurrentPosition();
        }
        return -1;
    }

    /* renamed from: h */
    public void mo32209h(boolean z) {
        resume();
    }

    /* renamed from: j */
    public void mo32210j() {
        Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "stopPlay");
        this.f57921o = false;
        mo32213q();
    }

    /* renamed from: k */
    public boolean mo32211k() {
        return this.f57919j && !mo32221x();
    }

    public void pause() {
        boolean z = true;
        Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "pause, audioId:%s", this.f57915f);
        this.f57920n = true;
        if (this.f57917h == null || !mo32206f()) {
            CommonPlayer commonPlayer = this.f57917h;
            if (commonPlayer != null) {
                if (commonPlayer == null || commonPlayer.getPlayerState() != 7) {
                    z = false;
                }
                if (z) {
                    Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "pause fail, play complete, set isStartPlaying false");
                    this.f57919j = false;
                    return;
                }
                return;
            }
            return;
        }
        try {
            Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "pause success");
            this.f57917h.pause();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", e, "pause", new Object[0]);
            mo32197l(503);
            mo32217t(503);
        }
    }

    /* renamed from: q */
    public final void mo32213q() {
        try {
            CommonPlayer commonPlayer = this.f57917h;
            if (commonPlayer != null) {
                commonPlayer.setVolume(0.0f, 0.0f);
                if (!mo32220w() && !mo32219v()) {
                    if (!mo32206f()) {
                        if (this.f57921o) {
                            Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "stop play, but send pause state event");
                            this.f57917h.reset();
                            mo32198m();
                        } else {
                            Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "reset and send stop event");
                            this.f57917h.reset();
                            mo32202p();
                        }
                    }
                }
                Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "stop");
                this.f57917h.stop();
            }
            C20581c cVar = this.f57922p;
            if (cVar != null) {
                cVar.f57944d = true;
                this.f57922p = null;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", e, "stopPlay", new Object[0]);
            mo32197l(504);
            mo32217t(504);
        }
        this.f57919j = false;
        this.f57920n = true;
        this.f57909B = System.currentTimeMillis();
    }

    /* renamed from: r */
    public final void mo32214r() {
        if (mo32220w() || mo32219v()) {
            CommonPlayer commonPlayer = this.f57917h;
            C20561h s = C20561h.m22332s();
            int i = 3;
            if (!s.f57850B && !s.f57888u.f256411a && !s.f57851C) {
                i = 0;
            }
            commonPlayer.setAudioStreamType(i);
        }
        this.f57917h.start();
        CommonPlayer commonPlayer2 = this.f57917h;
        double d = this.f57916g.f256427l;
        commonPlayer2.setVolume((float) d, (float) d);
    }

    public void resume() {
        this.f57925s = 0;
        boolean x = mo32221x();
        boolean f = mo32206f();
        this.f57920n = false;
        this.f57921o = false;
        Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "resume, isPreparing:%b, isPlayingMusic:%b, isStartPlaying:%b, audioId:%s", Boolean.valueOf(x), Boolean.valueOf(f), Boolean.valueOf(this.f57919j), this.f57915f);
        if (this.f57917h != null && !mo32220w() && !x && !f && !this.f57919j) {
            Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "audio play is complete, need initPlayer again");
            this.f57927u = 0;
            this.f57928v = true;
            mo32218u();
            C20705c cVar = this.f57910C;
            if (cVar != null) {
                cVar.mo32418n(this.f57916g.f256424i);
            }
        } else if (this.f57917h == null) {
        } else {
            if ((mo32219v() || mo32220w()) && !f) {
                Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "audio play is paused, need start to play");
                try {
                    CommonPlayer commonPlayer = this.f57917h;
                    double d = this.f57916g.f256427l;
                    commonPlayer.setVolume((float) d, (float) d);
                    mo32214r();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", e, "resume", new Object[0]);
                    mo32197l(502);
                    mo32217t(502);
                }
                this.f57919j = true;
            }
        }
    }

    /* renamed from: s */
    public C88914d mo32216s() {
        if (this.f57918i == null) {
            this.f57918i = new C88914d();
        }
        int duration = getDuration();
        int playPosition = getPlayPosition();
        boolean f = mo32206f();
        CommonPlayer commonPlayer = this.f57917h;
        int i = 0;
        int bufferedPercentage = commonPlayer != null ? commonPlayer.getBufferedPercentage() : 0;
        if (bufferedPercentage < 0 || bufferedPercentage > 100) {
            bufferedPercentage = 0;
        }
        if (bufferedPercentage >= 0) {
            i = bufferedPercentage;
        }
        C88914d dVar = this.f57918i;
        dVar.f256443b = playPosition;
        dVar.f256442a = duration;
        dVar.f256444c = !f;
        dVar.f256445d = this.f57921o;
        dVar.f256446e = (i * duration) / 100;
        C88912b bVar = this.f57916g;
        if (bVar == null) {
            return null;
        }
        dVar.f256448g = bVar.f256420e;
        dVar.f256447f = bVar.f256417b;
        dVar.f256449h = bVar.f256437v;
        return dVar;
    }

    /* renamed from: t */
    public final void mo32217t(int i) {
        C20705c cVar = this.f57910C;
        if (cVar != null) {
            cVar.mo32412G(this.f57916g.f256424i, i);
        }
    }

    /* renamed from: u */
    public final void mo32218u() {
        boolean z;
        Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "initPlayer");
        C88912b bVar = this.f57916g;
        if ((bVar == null || !bVar.f256417b.startsWith("wxblob://") || bVar.f256415B == null) ? false : true) {
            Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "play with pByteBuff");
            if (this.f57917h == null) {
                this.f57917h = new CommonPlayer(this.f57913F);
            }
            this.f57917h.reset();
            try {
                this.f57917h.setDataSource((IDataSourceFactory) new C90903c(this.f57916g.f256415B));
                this.f57917h.addAudioListener(this.f57914G);
                this.f57917h.prepare();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.Audio.QQAudioPlayer", "initPlayer exception:" + e.getMessage());
                Log.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", e, "initPlayer", new Object[0]);
                mo32197l(501);
                mo32217t(501);
            }
        } else {
            if (!TextUtils.isEmpty(this.f57916g.f256418c)) {
                C88912b bVar2 = this.f57916g;
                if (bVar2.f256440y == null) {
                    Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "play with local file, filePath:%s", bVar2.f256418c);
                    if (this.f57917h == null) {
                        this.f57917h = new CommonPlayer(this.f57913F);
                    }
                    this.f57917h.reset();
                    try {
                        this.f57917h.setDataSource(this.f57916g.f256418c);
                        this.f57917h.addAudioListener(this.f57914G);
                        this.f57917h.prepare();
                    } catch (Exception e2) {
                        Log.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", e2, "initPlayer exception", new Object[0]);
                        mo32197l(501);
                        mo32217t(501);
                    }
                }
            }
            if (!TextUtils.isEmpty(this.f57916g.f256418c)) {
                C88912b bVar3 = this.f57916g;
                if (bVar3.f256440y != null) {
                    Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "play with inputStream, filePath:%s", bVar3.f256418c);
                    if (this.f57917h == null) {
                        this.f57917h = new CommonPlayer(this.f57913F);
                    }
                    this.f57917h.reset();
                    try {
                        this.f57917h.setDataSource((IDataSourceFactory) new C90903c(this.f57916g.f256440y));
                        this.f57917h.addAudioListener(this.f57914G);
                        this.f57917h.prepare();
                    } catch (Exception e3) {
                        Log.m105920e("MicroMsg.Audio.QQAudioPlayer", "initPlayer exception:" + e3.getMessage());
                        Log.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", e3, "initPlayer", new Object[0]);
                        mo32197l(501);
                        mo32217t(501);
                    }
                }
            }
            Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "play with src url :%s", this.f57916g.f256417b);
            URL url = null;
            String str = this.f57916g.f256417b;
            this.f57924r = str;
            if (C102987e.m136182j(str)) {
                Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "can match shake music wifi url");
                z = true;
            } else {
                z = false;
            }
            Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "mSrc:%s", this.f57924r);
            C32752h.m39807f(this.f57924r);
            String str2 = this.f57924r;
            if (!TextUtils.isEmpty(str2)) {
                C32752h.f89140b.put(str2, Boolean.valueOf(z));
            }
            try {
                url = new URL(this.f57924r);
            } catch (Exception e4) {
                Log.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", e4, "initPlayer", new Object[0]);
            }
            if (url == null) {
                Log.m105920e("MicroMsg.Audio.QQAudioPlayer", "initPlayer url is null");
                mo32197l(500);
                mo32217t(500);
                return;
            }
            if (this.f57917h == null) {
                this.f57917h = new CommonPlayer(this.f57913F);
            }
            this.f57917h.reset();
            if (this.f57923q == null) {
                this.f57923q = new C102584b();
            }
            this.f57923q.mo142210a(this.f57924r, this.f57916g.f256438w);
            try {
                if (!TextUtils.isEmpty(this.f57912E)) {
                    this.f57917h.setOnlinePlayCacheDir(this.f57912E);
                }
                this.f57917h.setDataSource((IMediaHTTPService) this.f57923q, Uri.parse(url.toString()));
                this.f57917h.addAudioListener(this.f57914G);
                this.f57917h.prepare();
            } catch (Exception e5) {
                Log.m105920e("MicroMsg.Audio.QQAudioPlayer", "initPlayer exception:" + e5.getMessage());
                Log.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", e5, "initPlayer", new Object[0]);
                mo32197l(501);
                mo32217t(501);
            }
        }
        float f = 0.0f;
        C88912b bVar4 = this.f57916g;
        if (bVar4 != null) {
            f = (float) bVar4.f256428m;
        }
        CommonPlayer commonPlayer = this.f57917h;
        if (commonPlayer != null) {
            if (f < 0.5f || f > 2.0f) {
                commonPlayer.setSpeed(1.0f);
            } else {
                Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "set speed :%f", Float.valueOf(f));
                this.f57917h.setSpeed(f);
            }
            CommonPlayer commonPlayer2 = this.f57917h;
            float f2 = (float) this.f57916g.f256427l;
            commonPlayer2.setVolume(f2, f2);
        }
    }

    /* renamed from: v */
    public boolean mo32219v() {
        CommonPlayer commonPlayer = this.f57917h;
        return commonPlayer != null && commonPlayer.getPlayerState() == 5;
    }

    /* renamed from: w */
    public boolean mo32220w() {
        CommonPlayer commonPlayer = this.f57917h;
        return commonPlayer != null && commonPlayer.getPlayerState() == 2;
    }

    /* renamed from: x */
    public boolean mo32221x() {
        CommonPlayer commonPlayer = this.f57917h;
        return commonPlayer != null && commonPlayer.getPlayerState() == 3;
    }

    /* renamed from: y */
    public void mo32222y(C88912b bVar) {
        this.f57916g = bVar;
        this.f57927u = bVar.f256419d;
        this.f57928v = bVar.f256422g;
        if (this.f57917h != null && mo32206f()) {
            Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "audioId:%s, param.src:%s setVoume %f", this.f57915f, this.f57924r, Double.valueOf(this.f57916g.f256427l));
            CommonPlayer commonPlayer = this.f57917h;
            double d = this.f57916g.f256427l;
            commonPlayer.setVolume((float) d, (float) d);
            double d2 = this.f57916g.f256428m;
            if (d2 > 0.0d) {
                Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "set speed :%f", Double.valueOf(d2));
                this.f57917h.setSpeed((float) this.f57916g.f256428m);
                return;
            }
            this.f57917h.setSpeed(1.0f);
        }
    }

    /* renamed from: z */
    public void mo32223z(C88912b bVar) {
        if (bVar == null) {
            Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "startPlay fail, play param is null");
            Log.m105924i("MicroMsg.Audio.BaseAudioPlayer", "onErrorEvent");
            mo32197l(-1);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.f57929w;
        C88912b bVar2 = this.f57916g;
        if (bVar2 == null || !bVar2.mo123301a(bVar) || j > 20) {
            C20705c cVar = (C20705c) C101991b.m134284b(C20705c.class);
            this.f57910C = cVar;
            if (cVar != null) {
                cVar.mo32418n(bVar.f256424i);
            }
            this.f57929w = currentTimeMillis;
            this.f57916g = bVar;
            Log.m105925i("MicroMsg.Audio.QQAudioPlayer", "startPlay, fromScene:%d, audioId:%s", Integer.valueOf(bVar.f256424i), this.f57915f);
            if (this.f57917h != null && mo32206f()) {
                this.f57917h.stop();
            }
            this.f57925s = 0;
            this.f57927u = bVar.f256419d;
            this.f57928v = bVar.f256422g;
            this.f57930x = null;
            this.f57931y = false;
            this.f57921o = false;
            this.f57920n = false;
            mo32218u();
            return;
        }
        this.f57916g = bVar;
        this.f57927u = bVar.f256419d;
        this.f57928v = bVar.f256422g;
        Log.m105921e("MicroMsg.Audio.QQAudioPlayer", "startPlay, is playing for audio src:%s, don't play again in 3 second, interval:%d", this.f57924r, Long.valueOf(j));
    }

    /* renamed from: ea2.m$b */
    public class C20580b implements IAudioListener {

        /* renamed from: a */
        public int f57940a = 0;

        /* renamed from: b */
        public int f57941b = 0;

        /* renamed from: c */
        public C86468a.C86469a f57942c;

        public C20580b() {
            this.f57942c = new C86468a.C86469a(2, C20575m.this.f57915f);
        }

        public long getActualTime(long j) {
            return 0;
        }

        public boolean isEnabled() {
            return C20575m.this.f57911D != null;
        }

        public boolean isTerminal() {
            return false;
        }

        public boolean onPcm(BufferInfo bufferInfo, BufferInfo bufferInfo2, long j) {
            C86468a aVar = C20575m.this.f57911D;
            if (aVar == null) {
                return false;
            }
            aVar.mo120890a(this.f57942c, 1, this.f57940a, this.f57941b, bufferInfo.byteBuffer);
            return false;
        }

        public long onPlayerReady(int i, AudioInformation audioInformation, long j) {
            this.f57940a = audioInformation.getChannels();
            this.f57941b = (int) audioInformation.getSampleRate();
            C86468a aVar = C20575m.this.f57911D;
            if (aVar == null) {
                return 0;
            }
            aVar.mo120892c(this.f57942c);
            return 0;
        }

        public void onPlayerSeekComplete(long j) {
        }

        public void onPlayerStopped() {
            C86468a aVar = C20575m.this.f57911D;
            if (aVar != null) {
                aVar.mo120893d(this.f57942c);
            }
            CommonPlayer commonPlayer = C20575m.this.f57917h;
            if (commonPlayer != null) {
                commonPlayer.removeAudioListener(this);
            }
        }

        public boolean onPcm(FloatBufferInfo floatBufferInfo, FloatBufferInfo floatBufferInfo2, long j) {
            C86468a aVar = C20575m.this.f57911D;
            if (aVar == null) {
                return false;
            }
            aVar.mo120891b(this.f57942c, 3, this.f57940a, this.f57941b, floatBufferInfo.floatBuffer);
            return false;
        }
    }
}
