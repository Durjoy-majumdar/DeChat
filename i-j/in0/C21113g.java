package in0;

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Collections;
import p331dj.C97481g;

/* renamed from: in0.g */
public class C21113g extends C21108a {

    /* renamed from: o */
    public MediaPlayer f59701o;

    /* renamed from: p */
    public MediaPlayer.OnPreparedListener f59702p = new C21114a();

    /* renamed from: q */
    public MediaPlayer.OnVideoSizeChangedListener f59703q = new C21115b();

    /* renamed from: r */
    public MediaPlayer.OnCompletionListener f59704r = new C21116c();

    /* renamed from: s */
    public MediaPlayer.OnInfoListener f59705s = new C21117d();

    /* renamed from: t */
    public MediaPlayer.OnSeekCompleteListener f59706t = new C21118e();

    /* renamed from: u */
    public MediaPlayer.OnErrorListener f59707u = new C21119f();

    /* renamed from: v */
    public MediaPlayer.OnBufferingUpdateListener f59708v = new C21120g();

    /* renamed from: in0.g$a */
    public class C21114a implements MediaPlayer.OnPreparedListener {
        public C21114a() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            C21113g gVar = C21113g.this;
            gVar.f59681a = 2;
            gVar.mo32884C();
        }
    }

    /* renamed from: in0.g$b */
    public class C21115b implements MediaPlayer.OnVideoSizeChangedListener {
        public C21115b() {
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            C21113g.this.mo32885E(i, i2);
        }
    }

    /* renamed from: in0.g$c */
    public class C21116c implements MediaPlayer.OnCompletionListener {
        public C21116c() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            C21113g gVar = C21113g.this;
            gVar.f59681a = 6;
            gVar.mo32889x();
        }
    }

    /* renamed from: in0.g$d */
    public class C21117d implements MediaPlayer.OnInfoListener {
        public C21117d() {
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            return C21113g.this.mo32883B(i, i2);
        }
    }

    /* renamed from: in0.g$e */
    public class C21118e implements MediaPlayer.OnSeekCompleteListener {
        public C21118e() {
        }

        public void onSeekComplete(MediaPlayer mediaPlayer) {
            C21113g.this.mo22527D();
        }
    }

    /* renamed from: in0.g$f */
    public class C21119f implements MediaPlayer.OnErrorListener {
        public C21119f() {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            return C21113g.this.mo32891z(i, i2);
        }
    }

    /* renamed from: in0.g$g */
    public class C21120g implements MediaPlayer.OnBufferingUpdateListener {
        public C21120g() {
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            C21113g.this.mo22556w(i);
        }
    }

    public C21113g() {
        C97481g gVar = new C97481g();
        this.f59701o = gVar;
        gVar.setScreenOnWhilePlaying(true);
        this.f59701o.setAudioStreamType(3);
        this.f59701o.setOnInfoListener(this.f59705s);
        this.f59701o.setOnErrorListener(this.f59707u);
        this.f59701o.setOnPreparedListener(this.f59702p);
        this.f59701o.setOnCompletionListener(this.f59704r);
        this.f59701o.setOnSeekCompleteListener(this.f59706t);
        this.f59701o.setOnVideoSizeChangedListener(this.f59703q);
        this.f59701o.setOnBufferingUpdateListener(this.f59708v);
    }

    /* renamed from: F */
    public final boolean mo32893F() {
        return this.f59701o != null;
    }

    /* renamed from: G */
    public final void mo32894G(int i) {
        MediaPlayer.OnErrorListener onErrorListener = this.f59707u;
        if (onErrorListener != null) {
            ((C21119f) onErrorListener).onError(this.f59701o, -1024, i);
        }
    }

    /* renamed from: a */
    public void mo22532a(float f, float f2) {
        try {
            if (mo32893F()) {
                this.f59701o.setVolume(f, f2);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e, "%s setVolume fail", Integer.valueOf(hashCode()));
            mo32894G(-13);
        }
    }

    /* renamed from: b */
    public void mo22533b(boolean z) {
        try {
            if (mo32893F()) {
                this.f59701o.setLooping(z);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e, "%s setLooping fail", Integer.valueOf(hashCode()));
            mo32894G(-10);
        }
    }

    /* renamed from: d */
    public void mo22534d(String str, String str2) {
        try {
            if (mo32893F()) {
                if (str2 == null) {
                    this.f59701o.setDataSource(str);
                } else {
                    Log.m105924i("MicroMsg.SameLayer.SystemMediaPlayer", "setDataSource, referrer: " + str2);
                    this.f59701o.setDataSource(MMApplicationContext.getContext(), Uri.parse(str), Collections.singletonMap("Referer", str2));
                }
                this.f59681a = 1;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e, "%s setDataSource fail", Integer.valueOf(hashCode()));
            mo32894G(-11);
        }
    }

    public int getCurrentPosition() {
        int i;
        try {
            if (mo32893F() && ((i = this.f59681a) == 2 || i == 3 || i == 4 || i == 6)) {
                return this.f59701o.getCurrentPosition();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e, "%s getCurrentPosition fail", Integer.valueOf(hashCode()));
            mo32894G(-15);
        }
        return 0;
    }

    public int getDuration() {
        int i;
        try {
            if (!(!mo32893F() || (i = this.f59681a) == -1 || i == 1 || i == 0)) {
                return this.f59701o.getDuration();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e, "%s getDuration fail", Integer.valueOf(hashCode()));
            mo32894G(-16);
        }
        return 0;
    }

    public int getPlayerType() {
        return 1;
    }

    public int getVideoHeight() {
        try {
            if (mo32893F()) {
                return this.f59701o.getVideoHeight();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e, "%s getVideoHeight fail", Integer.valueOf(hashCode()));
            mo32894G(-18);
        }
        return 0;
    }

    public int getVideoWidth() {
        try {
            if (mo32893F()) {
                return this.f59701o.getVideoWidth();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e, "%s getVideoWidth fail", Integer.valueOf(hashCode()));
            mo32894G(-17);
        }
        return 0;
    }

    /* renamed from: h */
    public void mo22541h(String str, int i) {
        mo22534d(str, (String) null);
    }

    public boolean isPlaying() {
        int i;
        try {
            if (!(!mo32893F() || (i = this.f59681a) == -1 || i == -2 || i == 0 || i == 1)) {
                return this.f59701o.isPlaying();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e, "%s isPlaying fail", Integer.valueOf(hashCode()));
            mo32894G(-9);
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo22543l(float f) {
        if (f <= 0.0f) {
            return false;
        }
        try {
            if (!mo32893F() || Build.VERSION.SDK_INT < 23) {
                Log.m105929w("MicroMsg.SameLayer.SystemMediaPlayer", "%s setSpeed, current system(%d) not support play speed setting", Integer.valueOf(hashCode()), Integer.valueOf(Build.VERSION.SDK_INT));
                return false;
            }
            PlaybackParams playbackParams = this.f59701o.getPlaybackParams();
            playbackParams.setSpeed(f);
            if (!this.f59701o.isPlaying()) {
                this.f59701o.setPlaybackParams(playbackParams);
                this.f59701o.pause();
            } else {
                this.f59701o.setPlaybackParams(playbackParams);
            }
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e, "%s setSpeed fail", Integer.valueOf(hashCode()));
            mo32894G(-14);
        }
    }

    /* renamed from: o */
    public <PlayerImpl extends C87760d> PlayerImpl mo22544o(Class<PlayerImpl> cls) {
        if (C21113g.class.isAssignableFrom(cls)) {
            return this;
        }
        return null;
    }

    public void pause() {
        try {
            if (mo32893F()) {
                int i = this.f59681a;
                if (i == 2 || i == 3 || i == 6) {
                    this.f59701o.pause();
                    this.f59681a = 4;
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e, "%s pause fail", Integer.valueOf(hashCode()));
            mo32894G(-2);
        }
    }

    public void prepareAsync() {
        try {
            if (mo32893F()) {
                this.f59701o.prepareAsync();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e, "%s prepareAsync fail", Integer.valueOf(hashCode()));
            mo32894G(-6);
        }
    }

    public void release() {
        try {
            if (mo32893F()) {
                MediaPlayer mediaPlayer = this.f59701o;
                if (mediaPlayer != null) {
                    mediaPlayer.setOnInfoListener((MediaPlayer.OnInfoListener) null);
                    this.f59701o.setOnErrorListener((MediaPlayer.OnErrorListener) null);
                    this.f59701o.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
                    this.f59701o.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
                    this.f59701o.setOnSeekCompleteListener((MediaPlayer.OnSeekCompleteListener) null);
                    this.f59701o.setOnBufferingUpdateListener((MediaPlayer.OnBufferingUpdateListener) null);
                    this.f59701o.setOnVideoSizeChangedListener((MediaPlayer.OnVideoSizeChangedListener) null);
                }
                this.f59701o.release();
                this.f59681a = -2;
                this.f59682b = true;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e, "%s release fail", Integer.valueOf(hashCode()));
            mo32894G(-8);
        }
    }

    public void reset() {
        try {
            if (mo32893F()) {
                this.f59701o.reset();
                this.f59681a = 0;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e, "%s reset fail", Integer.valueOf(hashCode()));
            mo32894G(-7);
        }
    }

    public void seekTo(long j) {
        try {
            if (mo32893F()) {
                int i = this.f59681a;
                if (i == 2 || i == 3 || i == 4 || i == 6) {
                    this.f59701o.seekTo((int) j);
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e, "%s seekTo fail", Integer.valueOf(hashCode()));
            mo32894G(-3);
        }
    }

    public void setDataSource(String str) {
        mo22534d(str, (String) null);
    }

    public void setMute(boolean z) {
        if (!mo32893F()) {
            return;
        }
        if (z) {
            mo22532a(0.0f, 0.0f);
        } else {
            mo22532a(1.0f, 1.0f);
        }
    }

    public void setSurface(Surface surface) {
        try {
            if (mo32893F()) {
                this.f59701o.setSurface(surface);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e, "%s setSurface fail", Integer.valueOf(hashCode()));
            mo32894G(-12);
        }
    }

    public void start() {
        try {
            if (mo32893F()) {
                int i = this.f59681a;
                if (i == 2 || i == 4 || i == 6) {
                    this.f59701o.start();
                    this.f59681a = 3;
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e, "%s start fail", Integer.valueOf(hashCode()));
            mo32894G(-1);
        }
    }

    public void stop() {
        try {
            if (mo32893F()) {
                int i = this.f59681a;
                if (i == 2 || i == 3 || i == 4 || i == 6) {
                    this.f59701o.stop();
                    this.f59681a = 5;
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e, "%s stop fail", Integer.valueOf(hashCode()));
            mo32894G(-4);
        }
    }
}
