package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.opengl.GLES20;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import p206nj.C11171e;
import p331dj.C97481g;
import zt3.C119157j;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoTextureView */
public class VideoTextureView extends MMTextureView implements C96875r0 {

    /* renamed from: R */
    public static final /* synthetic */ int f55320R = 0;

    /* renamed from: A */
    public boolean f55321A;

    /* renamed from: B */
    public MediaPlayer.OnVideoSizeChangedListener f55322B;

    /* renamed from: C */
    public MediaPlayer.OnPreparedListener f55323C;

    /* renamed from: D */
    public MediaPlayer.OnSeekCompleteListener f55324D;

    /* renamed from: E */
    public MediaPlayer.OnBufferingUpdateListener f55325E;

    /* renamed from: F */
    public MediaPlayer.OnInfoListener f55326F;

    /* renamed from: G */
    public MediaPlayer.OnCompletionListener f55327G;

    /* renamed from: H */
    public MediaPlayer.OnErrorListener f55328H;

    /* renamed from: I */
    public long f55329I;

    /* renamed from: J */
    public boolean f55330J;

    /* renamed from: K */
    public boolean f55331K;

    /* renamed from: L */
    public boolean f55332L;

    /* renamed from: M */
    public TextureView.SurfaceTextureListener f55333M;

    /* renamed from: N */
    public boolean f55334N;

    /* renamed from: P */
    public C106595z1 f55335P;

    /* renamed from: Q */
    public float f55336Q;

    /* renamed from: h */
    public String f55337h;

    /* renamed from: i */
    public int f55338i;

    /* renamed from: j */
    public Surface f55339j;

    /* renamed from: n */
    public MediaPlayer f55340n;

    /* renamed from: o */
    public boolean f55341o;

    /* renamed from: p */
    public int f55342p;

    /* renamed from: q */
    public int f55343q;

    /* renamed from: r */
    public boolean f55344r;

    /* renamed from: s */
    public C96875r0.C96876a f55345s;

    /* renamed from: t */
    public C96875r0.C96879e f55346t;

    /* renamed from: u */
    public C96875r0.C96877c f55347u;

    /* renamed from: v */
    public C96875r0.C19571b f55348v;

    /* renamed from: w */
    public C96875r0.C96878d f55349w;

    /* renamed from: x */
    public long f55350x;

    /* renamed from: y */
    public long f55351y;

    /* renamed from: z */
    public int f55352z;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoTextureView$a */
    public class C19547a implements MediaPlayer.OnVideoSizeChangedListener {
        public C19547a() {
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                VideoTextureView videoTextureView = VideoTextureView.this;
                MediaPlayer mediaPlayer2 = videoTextureView.f55340n;
                if (mediaPlayer != mediaPlayer2) {
                    Log.m105929w("MicroMsg.VideoTextureView", "another player on video size changed, return now.[%s, %s]", mediaPlayer, mediaPlayer2);
                    return;
                }
                videoTextureView.f55342p = mediaPlayer.getVideoWidth();
                VideoTextureView.this.f55343q = mediaPlayer.getVideoHeight();
                Log.m105924i("MicroMsg.VideoTextureView", "on size change size:( " + VideoTextureView.this.f55342p + " , " + VideoTextureView.this.f55343q + " )");
                VideoTextureView videoTextureView2 = VideoTextureView.this;
                C96875r0.C96876a aVar = videoTextureView2.f55345s;
                if (aVar != null) {
                    aVar.mo76226p3(videoTextureView2.f55342p, videoTextureView2.f55343q);
                }
                VideoTextureView videoTextureView3 = VideoTextureView.this;
                int i3 = VideoTextureView.f55320R;
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) videoTextureView3.getLayoutParams();
                layoutParams.addRule(13);
                videoTextureView3.setLayoutParams(layoutParams);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VideoTextureView", e, "on video size changed error[%d, %d]", Integer.valueOf(i), Integer.valueOf(i2));
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoTextureView$b */
    public class C19548b implements MediaPlayer.OnPreparedListener {
        public C19548b() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            VideoTextureView videoTextureView = VideoTextureView.this;
            MediaPlayer mediaPlayer2 = videoTextureView.f55340n;
            if (mediaPlayer == mediaPlayer2 || mediaPlayer == null) {
                videoTextureView.f55341o = true;
                videoTextureView.f55342p = mediaPlayer != null ? mediaPlayer.getVideoWidth() : 0;
                VideoTextureView.this.f55343q = mediaPlayer != null ? mediaPlayer.getVideoHeight() : 0;
                Log.m105925i("MicroMsg.VideoTextureView", "on prepared. size [%d, %d] mStartWhenPrepared %b ", Integer.valueOf(VideoTextureView.this.f55342p), Integer.valueOf(VideoTextureView.this.f55343q), Boolean.valueOf(VideoTextureView.this.f55344r));
                VideoTextureView videoTextureView2 = VideoTextureView.this;
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) videoTextureView2.getLayoutParams();
                layoutParams.addRule(13);
                videoTextureView2.setLayoutParams(layoutParams);
                VideoTextureView videoTextureView3 = VideoTextureView.this;
                if (videoTextureView3.f55342p == 0 || videoTextureView3.f55343q == 0) {
                    if (videoTextureView3.f55344r) {
                        videoTextureView3.f55340n.start();
                        VideoTextureView videoTextureView4 = VideoTextureView.this;
                        videoTextureView4.f55344r = false;
                        videoTextureView4.f55340n.setLooping(videoTextureView4.f55321A);
                    }
                } else if (videoTextureView3.f55344r) {
                    videoTextureView3.f55340n.start();
                    VideoTextureView videoTextureView5 = VideoTextureView.this;
                    videoTextureView5.f55340n.setLooping(videoTextureView5.f55321A);
                    VideoTextureView.this.f55344r = false;
                }
                C96875r0.C96876a aVar = VideoTextureView.this.f55345s;
                if (aVar != null) {
                    aVar.onPrepared();
                    return;
                }
                return;
            }
            Log.m105929w("MicroMsg.VideoTextureView", "another player callback, release now.[%s, %s]", mediaPlayer, mediaPlayer2);
            VideoTextureView videoTextureView6 = VideoTextureView.this;
            videoTextureView6.getClass();
            new C96894x1(videoTextureView6, mediaPlayer).start();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoTextureView$c */
    public class C19549c implements MediaPlayer.OnSeekCompleteListener {
        public C19549c() {
        }

        public void onSeekComplete(MediaPlayer mediaPlayer) {
            Log.m105925i("MicroMsg.VideoTextureView", "video seek complete curPos[%d] mStartWhenPrepared[%b] pauseWhenUpdated[%b]", Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : -1), Boolean.valueOf(VideoTextureView.this.f55344r), Boolean.valueOf(VideoTextureView.this.f55331K));
            VideoTextureView videoTextureView = VideoTextureView.this;
            if (!videoTextureView.f55344r) {
                videoTextureView.pause();
            } else if (!videoTextureView.f55331K) {
                videoTextureView.start();
            } else {
                return;
            }
            VideoTextureView videoTextureView2 = VideoTextureView.this;
            C96875r0.C96877c cVar = videoTextureView2.f55347u;
            if (cVar != null) {
                cVar.mo86881z(videoTextureView2.f55344r);
            }
            VideoTextureView.this.f55329I = 0;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoTextureView$d */
    public class C19550d implements MediaPlayer.OnBufferingUpdateListener {
        public C19550d() {
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            Log.m105919d("MicroMsg.VideoTextureView", "onBufferingUpdate percent[%d]", Integer.valueOf(i));
            VideoTextureView.this.f55352z = i;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoTextureView$e */
    public class C19551e implements MediaPlayer.OnInfoListener {
        public C19551e() {
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            Log.m105919d("MicroMsg.VideoTextureView", "onInfo [%d %d]", Integer.valueOf(i), Integer.valueOf(i2));
            C96875r0.C19571b bVar = VideoTextureView.this.f55348v;
            if (bVar != null) {
                bVar.mo25380j(i, i2);
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoTextureView$f */
    public class C19552f implements MediaPlayer.OnCompletionListener {
        public C19552f() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            Log.m105924i("MicroMsg.VideoTextureView", "video on completion");
            VideoTextureView.this.f55351y = Util.nowSecond();
            C96875r0.C96876a aVar = VideoTextureView.this.f55345s;
            if (aVar != null) {
                aVar.onCompletion();
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoTextureView$g */
    public class C19553g implements MediaPlayer.OnErrorListener {
        public C19553g() {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            Log.m105928w("MicroMsg.VideoTextureView", "Error: " + i + "," + i2);
            C96875r0.C96876a aVar = VideoTextureView.this.f55345s;
            if (aVar == null) {
                return true;
            }
            aVar.onError(i, i2);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoTextureView$h */
    public class C19554h implements TextureView.SurfaceTextureListener {
        public C19554h() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            VideoTextureView videoTextureView = VideoTextureView.this;
            int i3 = VideoTextureView.f55320R;
            videoTextureView.getClass();
            VideoTextureView.this.getClass();
            VideoTextureView.this.mo82024B();
            VideoTextureView videoTextureView2 = VideoTextureView.this;
            Surface surface = videoTextureView2.f55339j;
            ((C119157j) C119157j.f356862d).mo183875f(new C85654w1(videoTextureView2, surface));
            VideoTextureView.this.f55339j = new Surface(surfaceTexture);
            Log.m105925i("MicroMsg.VideoTextureView", "%d on texture available %d*%d mIsPrepared[%b] mSurface[%d] ", Integer.valueOf(VideoTextureView.this.hashCode()), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(VideoTextureView.this.f55341o), Integer.valueOf(VideoTextureView.this.f55339j.hashCode()));
            VideoTextureView videoTextureView3 = VideoTextureView.this;
            MediaPlayer mediaPlayer = videoTextureView3.f55340n;
            if (mediaPlayer == null || !videoTextureView3.f55341o) {
                videoTextureView3.mo25360G();
            } else {
                mediaPlayer.setSurface(videoTextureView3.f55339j);
                VideoTextureView videoTextureView4 = VideoTextureView.this;
                if (videoTextureView4.f55330J) {
                    videoTextureView4.f55340n.start();
                } else {
                    videoTextureView4.f55331K = true;
                    videoTextureView4.f55340n.setVolume(0.0f, 0.0f);
                    VideoTextureView.this.f55340n.start();
                }
                VideoTextureView.this.f55330J = false;
            }
            C96875r0.C96878d dVar = VideoTextureView.this.f55349w;
            if (dVar != null) {
                dVar.mo127239k();
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Log.m105925i("MicroMsg.VideoTextureView", "%d on texture destroyed mIsPrepared[%b]", Integer.valueOf(VideoTextureView.this.hashCode()), Boolean.valueOf(VideoTextureView.this.f55341o));
            VideoTextureView videoTextureView = VideoTextureView.this;
            Surface surface = videoTextureView.f55339j;
            ((C119157j) C119157j.f356862d).mo183875f(new C85654w1(videoTextureView, surface));
            VideoTextureView videoTextureView2 = VideoTextureView.this;
            videoTextureView2.f55339j = null;
            if (videoTextureView2.f55340n == null || !videoTextureView2.f55341o) {
                videoTextureView2.mo25361H();
                VideoTextureView.this.f55330J = false;
            } else if (videoTextureView2.isPlaying()) {
                VideoTextureView videoTextureView3 = VideoTextureView.this;
                videoTextureView3.f55330J = true;
                videoTextureView3.f55340n.pause();
            }
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            Log.m105924i("MicroMsg.VideoTextureView", "on texture size changed width : " + i + " height : " + i2);
            VideoTextureView videoTextureView = VideoTextureView.this;
            MediaPlayer mediaPlayer = videoTextureView.f55340n;
            if (mediaPlayer != null && videoTextureView.f55341o && videoTextureView.f55342p == i && videoTextureView.f55343q == i2) {
                mediaPlayer.start();
            }
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C96875r0.C96879e eVar;
            Log.m105918d("MicroMsg.VideoTextureView", "on surface texture updated");
            VideoTextureView videoTextureView = VideoTextureView.this;
            if (videoTextureView.f55331K) {
                MediaPlayer mediaPlayer = videoTextureView.f55340n;
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                    VideoTextureView videoTextureView2 = VideoTextureView.this;
                    if (videoTextureView2.f55334N) {
                        videoTextureView2.f55340n.setVolume(0.0f, 0.0f);
                    } else {
                        videoTextureView2.f55340n.setVolume(1.0f, 1.0f);
                    }
                }
                VideoTextureView.this.f55331K = false;
            }
            VideoTextureView videoTextureView3 = VideoTextureView.this;
            if (videoTextureView3.f55329I > 0 && (eVar = videoTextureView3.f55346t) != null) {
                eVar.mo79636r();
                VideoTextureView.this.f55346t = null;
            }
            VideoTextureView.this.f55329I = System.currentTimeMillis();
            VideoTextureView videoTextureView4 = VideoTextureView.this;
            if (videoTextureView4.f55332L) {
                Log.m105925i("MicroMsg.VideoTextureView", "%d flush surface pause now time[%d]", Integer.valueOf(videoTextureView4.hashCode()), Integer.valueOf(VideoTextureView.this.getCurrentPosition()));
                MediaPlayer mediaPlayer2 = VideoTextureView.this.f55340n;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.pause();
                    VideoTextureView videoTextureView5 = VideoTextureView.this;
                    videoTextureView5.setMute(videoTextureView5.f55334N);
                }
                VideoTextureView.this.f55332L = false;
            }
        }
    }

    public VideoTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: E */
    public final void mo25358E(SurfaceTexture surfaceTexture) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eglGetDisplay, (int[]) null);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        egl10.eglChooseConfig(eglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344}, eGLConfigArr, 1, new int[1]);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        EGLSurface eglCreateWindowSurface = egl10.eglCreateWindowSurface(eglGetDisplay, eGLConfig, surfaceTexture, new int[]{12344});
        egl10.eglMakeCurrent(eglGetDisplay, eglCreateWindowSurface, eglCreateWindowSurface, eglCreateContext);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        egl10.eglSwapBuffers(eglGetDisplay, eglCreateWindowSurface);
        egl10.eglDestroySurface(eglGetDisplay, eglCreateWindowSurface);
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        egl10.eglDestroyContext(eglGetDisplay, eglCreateContext);
        egl10.eglTerminate(eglGetDisplay);
    }

    /* renamed from: F */
    public void mo25359F() {
        Surface surface;
        if (this.f55340n != null && this.f55341o && (surface = this.f55339j) != null && surface.isValid()) {
            Log.m105925i("MicroMsg.VideoTextureView", "%d flush surface start time[%d] ", Integer.valueOf(hashCode()), Integer.valueOf(getCurrentPosition()));
            this.f55332L = true;
            this.f55340n.setVolume(0.0f, 0.0f);
            this.f55340n.start();
        }
    }

    /* renamed from: G */
    public final void mo25360G() {
        if (!Util.isNullOrNil(this.f55337h) && this.f55339j != null) {
            mo25361H();
            Log.m105925i("MicroMsg.VideoTextureView", "%d open video %s", Integer.valueOf(hashCode()), this.f55337h);
            try {
                C97481g gVar = new C97481g();
                this.f55340n = gVar;
                gVar.setOnPreparedListener(this.f55323C);
                this.f55340n.setOnVideoSizeChangedListener(this.f55322B);
                this.f55341o = false;
                Log.m105926v("MicroMsg.VideoTextureView", "reset duration to -1 in openVideo");
                this.f55338i = -1;
                this.f55352z = 0;
                this.f55340n.setOnCompletionListener(this.f55327G);
                this.f55340n.setOnErrorListener(this.f55328H);
                this.f55340n.setOnSeekCompleteListener(this.f55324D);
                this.f55340n.setOnBufferingUpdateListener(this.f55325E);
                this.f55340n.setOnInfoListener(this.f55326F);
                if (!Util.isNullOrNil(this.f55337h)) {
                    this.f55340n.setDataSource(this.f55337h);
                }
                this.f55340n.setSurface(this.f55339j);
                this.f55340n.setAudioStreamType(3);
                this.f55340n.setScreenOnWhilePlaying(true);
                this.f55340n.prepareAsync();
                this.f55343q = this.f55340n.getVideoHeight();
                this.f55342p = this.f55340n.getVideoWidth();
                setMute(this.f55334N);
                mo25362J(this.f55336Q);
                Log.m105925i("MicroMsg.VideoTextureView", "%d open video success player[%s] ", Integer.valueOf(hashCode()), Integer.valueOf(this.f55340n.hashCode()));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VideoTextureView", e, "prepare async error path", new Object[0]);
                C96875r0.C96876a aVar = this.f55345s;
                if (aVar != null) {
                    aVar.onError(-1, -1);
                }
            }
        }
    }

    /* renamed from: H */
    public final void mo25361H() {
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(hashCode());
        boolean z = true;
        objArr[1] = Boolean.valueOf(this.f55341o);
        if (this.f55340n != null) {
            z = false;
        }
        objArr[2] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.VideoTextureView", "%d release media player isPrepared[%b] player is null[%b] ", objArr);
        MediaPlayer mediaPlayer = this.f55340n;
        if (mediaPlayer != null) {
            mediaPlayer.setOnErrorListener((MediaPlayer.OnErrorListener) null);
            this.f55340n.setOnVideoSizeChangedListener((MediaPlayer.OnVideoSizeChangedListener) null);
            try {
                this.f55340n.stop();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VideoTextureView", e, "stop media player error", new Object[0]);
            }
            try {
                this.f55340n.reset();
                this.f55340n.release();
                this.f55340n.setOnBufferingUpdateListener((MediaPlayer.OnBufferingUpdateListener) null);
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.VideoTextureView", e2, "reset media player error", new Object[0]);
            }
        }
        this.f55340n = null;
    }

    /* renamed from: J */
    public boolean mo25362J(float f) {
        if (f <= 0.0f) {
            return false;
        }
        this.f55336Q = f;
        if (!C11171e.m11046c(23)) {
            return false;
        }
        float f2 = this.f55336Q;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (this.f55340n != null && C11171e.m11046c(23)) {
                    PlaybackParams playbackParams = this.f55340n.getPlaybackParams();
                    if (playbackParams == null) {
                        playbackParams = new PlaybackParams();
                    }
                    this.f55340n.setPlaybackParams(playbackParams.setSpeed(f2));
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VideoTextureView", e, "%s handle play rate error", Integer.valueOf(hashCode()));
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo24787a(double d, boolean z) {
        mo24788d(d);
        this.f55344r = z;
    }

    /* renamed from: d */
    public void mo24788d(double d) {
        MediaPlayer mediaPlayer = this.f55340n;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo((int) d);
            this.f55344r = true;
            Log.m105918d("MicroMsg.VideoTextureView", "seek to time: " + d + " curr pos : " + this.f55340n.getCurrentPosition());
        }
    }

    /* renamed from: e */
    public boolean mo24789e(Context context, boolean z) {
        return start();
    }

    public int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.f55340n;
        return (mediaPlayer == null || !this.f55341o) ? mediaPlayer == null ? -1 : 0 : mediaPlayer.getCurrentPosition();
    }

    public int getDownloadPercent() {
        return this.f55352z;
    }

    public int getDuration() {
        MediaPlayer mediaPlayer = this.f55340n;
        if (mediaPlayer == null || !this.f55341o) {
            this.f55338i = -1;
            return -1;
        }
        int i = this.f55338i;
        if (i > 0) {
            return i;
        }
        int duration = mediaPlayer.getDuration();
        this.f55338i = duration;
        return duration;
    }

    public double getLastProgresstime() {
        return 0.0d;
    }

    public long getLastSurfaceUpdateTime() {
        return this.f55329I;
    }

    public String getVideoPath() {
        return this.f55337h;
    }

    public boolean isPlaying() {
        boolean z;
        MediaPlayer mediaPlayer = this.f55340n;
        if (mediaPlayer != null && this.f55341o && !this.f55331K && !this.f55332L) {
            try {
                z = mediaPlayer.isPlaying();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VideoTextureView", e, "isPlaying", new Object[0]);
            }
            Log.m105919d("MicroMsg.VideoTextureView", "%d is playing result [%b] pauseWhenUpdated[%b] mIsPrepared[%b]", Integer.valueOf(hashCode()), Boolean.valueOf(z), Boolean.valueOf(this.f55331K), Boolean.valueOf(this.f55341o));
            return z;
        }
        z = false;
        Log.m105919d("MicroMsg.VideoTextureView", "%d is playing result [%b] pauseWhenUpdated[%b] mIsPrepared[%b]", Integer.valueOf(hashCode()), Boolean.valueOf(z), Boolean.valueOf(this.f55331K), Boolean.valueOf(this.f55341o));
        return z;
    }

    public void onDetach() {
    }

    public void onMeasure(int i, int i2) {
        if (this.f55342p == 0 || this.f55343q == 0) {
            setMeasuredDimension(1, 1);
            return;
        }
        this.f55335P.mo153321a(View.getDefaultSize(1, i), View.getDefaultSize(1, i2), this.f55342p, this.f55343q);
        C106595z1 z1Var = this.f55335P;
        setMeasuredDimension(z1Var.f318524g, z1Var.f318525h);
    }

    public void pause() {
        MediaPlayer mediaPlayer = this.f55340n;
        if (mediaPlayer != null && this.f55341o && mediaPlayer.isPlaying()) {
            Log.m105918d("MicroMsg.VideoTextureView", "pause video.");
            this.f55340n.pause();
        }
        this.f55344r = false;
    }

    public void setForceScaleFullScreen(boolean z) {
        this.f55335P.f318518a = z;
    }

    public void setLoop(boolean z) {
        MediaPlayer mediaPlayer = this.f55340n;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z);
        }
        this.f55321A = true;
    }

    public void setMute(boolean z) {
        Log.m105925i("MicroMsg.VideoTextureView", "%d set mute %b", Integer.valueOf(hashCode()), Boolean.valueOf(z));
        this.f55334N = z;
        MediaPlayer mediaPlayer = this.f55340n;
        if (mediaPlayer == null) {
            return;
        }
        if (z) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    public void setOnInfoCallback(C96875r0.C19571b bVar) {
        this.f55348v = bVar;
    }

    public void setOnSeekCompleteCallback(C96875r0.C96877c cVar) {
        this.f55347u = cVar;
    }

    public void setOnSurfaceCallback(C96875r0.C96878d dVar) {
        this.f55349w = dVar;
    }

    public void setOneTimeVideoTextureUpdateCallback(C96875r0.C96879e eVar) {
        this.f55346t = eVar;
    }

    public void setPlayProgressCallback(boolean z) {
    }

    public void setScaleType(C96814a.C96817e eVar) {
        this.f55335P.mo153324d(eVar);
        requestLayout();
    }

    public void setThumb(Bitmap bitmap) {
    }

    public void setVideoCallback(C96875r0.C96876a aVar) {
        this.f55345s = aVar;
    }

    public void setVideoPath(String str) {
        this.f55337h = str;
        this.f55344r = false;
        mo25360G();
        requestLayout();
    }

    public boolean start() {
        if (this.f55339j == null) {
            Log.m105929w("MicroMsg.VideoTextureView", "%d it surface not ready, do not start", Integer.valueOf(hashCode()));
            this.f55330J = true;
            this.f55344r = true;
            return false;
        }
        long j = this.f55350x;
        if (j == 0) {
            j = Util.nowSecond();
        }
        this.f55350x = j;
        Log.m105925i("MicroMsg.VideoTextureView", "start %d mIsPrepared %b pauseWhenUpdated %b", Long.valueOf(j), Boolean.valueOf(this.f55341o), Boolean.valueOf(this.f55331K));
        MediaPlayer mediaPlayer = this.f55340n;
        if (mediaPlayer != null && this.f55341o) {
            if (this.f55331K) {
                this.f55331K = false;
                setMute(this.f55334N);
            }
            this.f55340n.start();
            this.f55344r = true;
            return true;
        } else if (mediaPlayer != null || !this.f55341o) {
            this.f55344r = true;
            return false;
        } else {
            this.f55344r = true;
            mo25360G();
            requestLayout();
            return true;
        }
    }

    public void stop() {
        SurfaceTexture surfaceTexture;
        long j = this.f55351y;
        long j2 = j > 0 ? j - this.f55350x : 2147483647L;
        long nowSecond = Util.nowSecond() - this.f55350x;
        int i = ((int) (j2 > nowSecond ? nowSecond : j2)) * 1000;
        if (i > getDuration()) {
            i = getDuration();
        }
        Log.m105925i("MicroMsg.VideoTextureView", "stop : dur:%d stop:%d comp:%d", Integer.valueOf(getDuration()), Long.valueOf(nowSecond), Long.valueOf(j2));
        C96875r0.C96876a aVar = this.f55345s;
        if (aVar != null) {
            aVar.mo76207M0(i, getDuration());
        }
        mo25361H();
        this.f55335P.mo153323c();
        try {
            if (!(this.f55339j == null || !this.f55341o || (surfaceTexture = getSurfaceTexture()) == null)) {
                Log.m105925i("MicroMsg.VideoTextureView", "%d releaseSurface", Integer.valueOf(hashCode()));
                mo25358E(surfaceTexture);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VideoTextureView", e, "release surface", new Object[0]);
        }
        this.f55337h = "";
        this.f55352z = 0;
        this.f55341o = false;
        this.f55344r = false;
        this.f55329I = 0;
    }

    public VideoTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55339j = null;
        this.f55340n = null;
        this.f55350x = 0;
        this.f55351y = 0;
        this.f55352z = 0;
        this.f55321A = false;
        this.f55322B = new C19547a();
        this.f55323C = new C19548b();
        this.f55324D = new C19549c();
        this.f55325E = new C19550d();
        this.f55326F = new C19551e();
        this.f55327G = new C19552f();
        this.f55328H = new C19553g();
        this.f55329I = 0;
        this.f55330J = false;
        this.f55331K = false;
        this.f55332L = false;
        C19554h hVar = new C19554h();
        this.f55333M = hVar;
        this.f55334N = false;
        this.f55335P = new C106595z1();
        this.f55336Q = -1.0f;
        this.f55342p = 0;
        this.f55343q = 0;
        setSurfaceTextureListener(hVar);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }
}
