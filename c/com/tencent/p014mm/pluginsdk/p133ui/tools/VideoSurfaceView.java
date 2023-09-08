package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import p331dj.C97481g;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView */
public class VideoSurfaceView extends SurfaceView implements C96875r0 {

    /* renamed from: d */
    public String f55300d;

    /* renamed from: e */
    public int f55301e;

    /* renamed from: f */
    public SurfaceHolder f55302f;

    /* renamed from: g */
    public MediaPlayer f55303g;

    /* renamed from: h */
    public boolean f55304h;

    /* renamed from: i */
    public int f55305i;

    /* renamed from: j */
    public int f55306j;

    /* renamed from: n */
    public boolean f55307n;

    /* renamed from: o */
    public C96875r0.C96876a f55308o;

    /* renamed from: p */
    public MediaPlayer.OnVideoSizeChangedListener f55309p;

    /* renamed from: q */
    public MediaPlayer.OnPreparedListener f55310q;

    /* renamed from: r */
    public MediaPlayer.OnCompletionListener f55311r;

    /* renamed from: s */
    public MediaPlayer.OnErrorListener f55312s;

    /* renamed from: t */
    public SurfaceHolder.Callback f55313t;

    /* renamed from: u */
    public boolean f55314u;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView$a */
    public class C19542a implements MediaPlayer.OnVideoSizeChangedListener {
        public C19542a() {
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            VideoSurfaceView.this.f55305i = mediaPlayer.getVideoWidth();
            VideoSurfaceView.this.f55306j = mediaPlayer.getVideoHeight();
            Log.m105926v("MicroMsg.VideoSurfaceView", "on size change size:( " + VideoSurfaceView.this.f55305i + " , " + VideoSurfaceView.this.f55306j + " )");
            VideoSurfaceView.m20941b(VideoSurfaceView.this);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView$b */
    public class C19543b implements MediaPlayer.OnPreparedListener {
        public C19543b() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            VideoSurfaceView videoSurfaceView = VideoSurfaceView.this;
            videoSurfaceView.f55304h = true;
            C96875r0.C96876a aVar = videoSurfaceView.f55308o;
            if (aVar != null) {
                aVar.onPrepared();
            }
            VideoSurfaceView.this.f55305i = mediaPlayer.getVideoWidth();
            VideoSurfaceView.this.f55306j = mediaPlayer.getVideoHeight();
            VideoSurfaceView.m20941b(VideoSurfaceView.this);
            VideoSurfaceView videoSurfaceView2 = VideoSurfaceView.this;
            if (videoSurfaceView2.f55305i == 0 || videoSurfaceView2.f55306j == 0) {
                if (videoSurfaceView2.f55307n) {
                    videoSurfaceView2.f55303g.start();
                    VideoSurfaceView.this.f55307n = false;
                }
            } else if (videoSurfaceView2.f55307n) {
                videoSurfaceView2.f55303g.start();
                VideoSurfaceView.this.f55307n = false;
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView$c */
    public class C19544c implements MediaPlayer.OnCompletionListener {
        public C19544c() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            VideoSurfaceView videoSurfaceView = VideoSurfaceView.this;
            C96875r0.C96876a aVar = videoSurfaceView.f55308o;
            if (aVar != null) {
                aVar.mo76207M0(videoSurfaceView.f55303g.getCurrentPosition(), VideoSurfaceView.this.f55303g.getDuration());
                VideoSurfaceView.this.f55308o.onCompletion();
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView$d */
    public class C19545d implements MediaPlayer.OnErrorListener {
        public C19545d() {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            Log.m105918d("MicroMsg.VideoSurfaceView", "Error: " + i + "," + i2);
            C96875r0.C96876a aVar = VideoSurfaceView.this.f55308o;
            if (aVar == null) {
                return true;
            }
            aVar.onError(i, i2);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView$e */
    public class C19546e implements SurfaceHolder.Callback {
        public C19546e() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            Log.m105925i("MicroMsg.VideoSurfaceView", "on surface changed %d*%d", Integer.valueOf(i2), Integer.valueOf(i3));
            VideoSurfaceView videoSurfaceView = VideoSurfaceView.this;
            MediaPlayer mediaPlayer = videoSurfaceView.f55303g;
            if (mediaPlayer != null && videoSurfaceView.f55304h && videoSurfaceView.f55305i == i2 && videoSurfaceView.f55306j == i3) {
                mediaPlayer.start();
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            Log.m105924i("MicroMsg.VideoSurfaceView", "on surface created");
            VideoSurfaceView videoSurfaceView = VideoSurfaceView.this;
            videoSurfaceView.f55302f = surfaceHolder;
            videoSurfaceView.mo25349c();
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            Log.m105924i("MicroMsg.VideoSurfaceView", "on surface destroyed");
            VideoSurfaceView videoSurfaceView = VideoSurfaceView.this;
            videoSurfaceView.f55302f = null;
            MediaPlayer mediaPlayer = videoSurfaceView.f55303g;
            if (mediaPlayer != null) {
                videoSurfaceView.f55308o.mo76207M0(mediaPlayer.getCurrentPosition(), VideoSurfaceView.this.f55303g.getDuration());
                VideoSurfaceView.this.f55303g.reset();
                VideoSurfaceView.this.f55303g.release();
                VideoSurfaceView.this.f55303g = null;
            }
        }
    }

    public VideoSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public static void m20941b(VideoSurfaceView videoSurfaceView) {
        int i;
        int i2 = videoSurfaceView.f55306j;
        if (i2 != 0 && (i = videoSurfaceView.f55305i) != 0) {
            Log.m105926v("MicroMsg.VideoSurfaceView", "video size before:" + i + "   " + i2);
            Log.m105926v("MicroMsg.VideoSurfaceView", "layout size before:" + videoSurfaceView.getWidth() + "   " + videoSurfaceView.getHeight());
            int width = videoSurfaceView.getWidth();
            int height = videoSurfaceView.getHeight();
            if (width <= 0) {
                width = i;
            }
            if (height <= 0) {
                height = i2;
            }
            float f = (float) i;
            float f2 = (((float) width) * 1.0f) / f;
            float f3 = (float) i2;
            float f4 = (((float) height) * 1.0f) / f3;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) videoSurfaceView.getLayoutParams();
            if (f2 > f4) {
                layoutParams.width = (int) (f * f4);
                layoutParams.height = height;
            } else {
                layoutParams.width = width;
                layoutParams.height = (int) (f3 * f2);
            }
            layoutParams.addRule(13);
            videoSurfaceView.setLayoutParams(layoutParams);
            Log.m105926v("MicroMsg.VideoSurfaceView", "video size after:" + videoSurfaceView.f55303g.getVideoWidth() + "   " + videoSurfaceView.f55303g.getVideoHeight());
            Log.m105926v("MicroMsg.VideoSurfaceView", "layout size after:" + layoutParams.width + "   " + layoutParams.height);
        }
    }

    /* renamed from: a */
    public void mo24787a(double d, boolean z) {
        mo24788d(d);
    }

    /* renamed from: c */
    public final void mo25349c() {
        if (this.f55300d != null && this.f55302f != null) {
            MediaPlayer mediaPlayer = this.f55303g;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                this.f55303g.release();
                this.f55303g = null;
            }
            try {
                C97481g gVar = new C97481g();
                this.f55303g = gVar;
                gVar.setOnPreparedListener(this.f55310q);
                this.f55303g.setOnVideoSizeChangedListener(this.f55309p);
                this.f55304h = false;
                Log.m105926v("MicroMsg.VideoSurfaceView", "reset duration to -1 in openVideo");
                this.f55301e = -1;
                this.f55303g.setOnCompletionListener(this.f55311r);
                this.f55303g.setOnErrorListener(this.f55312s);
                this.f55303g.setDataSource(this.f55300d);
                this.f55303g.setDisplay(this.f55302f);
                this.f55303g.setAudioStreamType(3);
                this.f55303g.setScreenOnWhilePlaying(true);
                this.f55303g.prepareAsync();
                this.f55306j = this.f55303g.getVideoHeight();
                this.f55305i = this.f55303g.getVideoWidth();
                setMute(this.f55314u);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VideoSurfaceView", e, "prepare async error %s", e.getMessage());
                C96875r0.C96876a aVar = this.f55308o;
                if (aVar != null) {
                    aVar.onError(-1, -1);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo24788d(double d) {
        if (this.f55303g != null) {
            Log.m105918d("MicroMsg.VideoSurfaceView", "seek to time: " + d);
            this.f55303g.seekTo((int) d);
            start();
        }
    }

    /* renamed from: e */
    public boolean mo24789e(Context context, boolean z) {
        start();
        return true;
    }

    public int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.f55303g;
        if (mediaPlayer == null || !this.f55304h) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition();
    }

    public int getDuration() {
        MediaPlayer mediaPlayer = this.f55303g;
        if (mediaPlayer == null || !this.f55304h) {
            this.f55301e = -1;
            return -1;
        }
        int i = this.f55301e;
        if (i > 0) {
            return i;
        }
        int duration = mediaPlayer.getDuration();
        this.f55301e = duration;
        return duration;
    }

    public double getLastProgresstime() {
        return 0.0d;
    }

    public long getLastSurfaceUpdateTime() {
        return 0;
    }

    public String getVideoPath() {
        return this.f55300d;
    }

    public boolean isPlaying() {
        MediaPlayer mediaPlayer = this.f55303g;
        if (mediaPlayer == null || !this.f55304h) {
            return false;
        }
        return mediaPlayer.isPlaying();
    }

    public void onDetach() {
    }

    public void pause() {
        MediaPlayer mediaPlayer = this.f55303g;
        if (mediaPlayer != null && this.f55304h && mediaPlayer.isPlaying()) {
            this.f55303g.pause();
        }
        this.f55307n = false;
    }

    public void setForceScaleFullScreen(boolean z) {
    }

    public void setLoop(boolean z) {
        MediaPlayer mediaPlayer = this.f55303g;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z);
        }
    }

    public void setMute(boolean z) {
        this.f55314u = z;
        MediaPlayer mediaPlayer = this.f55303g;
        if (mediaPlayer == null) {
            return;
        }
        if (z) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(0.5f, 0.5f);
        }
    }

    public void setOnInfoCallback(C96875r0.C19571b bVar) {
    }

    public void setOnSeekCompleteCallback(C96875r0.C96877c cVar) {
    }

    public void setOnSurfaceCallback(C96875r0.C96878d dVar) {
    }

    public void setOneTimeVideoTextureUpdateCallback(C96875r0.C96879e eVar) {
    }

    public void setPlayProgressCallback(boolean z) {
    }

    public void setThumb(Bitmap bitmap) {
    }

    public void setVideoCallback(C96875r0.C96876a aVar) {
        this.f55308o = aVar;
    }

    public void setVideoPath(String str) {
        this.f55300d = str;
        this.f55307n = false;
        mo25349c();
        requestLayout();
    }

    public boolean start() {
        MediaPlayer mediaPlayer = this.f55303g;
        if (mediaPlayer == null || !this.f55304h) {
            this.f55307n = true;
        } else {
            mediaPlayer.start();
            this.f55307n = false;
        }
        return true;
    }

    public void stop() {
        MediaPlayer mediaPlayer = this.f55303g;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f55303g.release();
            this.f55303g = null;
        }
    }

    public VideoSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55302f = null;
        this.f55303g = null;
        this.f55309p = new C19542a();
        this.f55310q = new C19543b();
        this.f55311r = new C19544c();
        this.f55312s = new C19545d();
        this.f55313t = new C19546e();
        this.f55314u = false;
        this.f55305i = 0;
        this.f55306j = 0;
        getHolder().addCallback(this.f55313t);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
    }
}
