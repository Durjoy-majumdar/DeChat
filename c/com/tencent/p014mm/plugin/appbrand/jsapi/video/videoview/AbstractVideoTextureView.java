package com.tencent.p014mm.plugin.appbrand.jsapi.video.videoview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17978c;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.videoview.C18015a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import in0.C87760d;
import in0.d$$c;
import in0.d$$d;
import in0.d$$e;
import in0.d$$g;
import in0.d$$i;
import in0.d$$j;
import in0.d$$k;
import in0.d$$l;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import pn0.C22003g;
import pn0.C89390a;
import pn0.C89391b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView */
public abstract class AbstractVideoTextureView extends TextureView implements C18015a {

    /* renamed from: M */
    public static final /* synthetic */ int f49647M = 0;

    /* renamed from: A */
    public d$$c f49648A;

    /* renamed from: B */
    public d$$i f49649B;

    /* renamed from: C */
    public d$$d f49650C;

    /* renamed from: D */
    public d$$g f49651D;

    /* renamed from: E */
    public long f49652E;

    /* renamed from: F */
    public boolean f49653F;

    /* renamed from: G */
    public boolean f49654G;

    /* renamed from: H */
    public boolean f49655H;

    /* renamed from: I */
    public TextureView.SurfaceTextureListener f49656I;

    /* renamed from: J */
    public boolean f49657J;

    /* renamed from: K */
    public C22003g f49658K;

    /* renamed from: L */
    public float f49659L;

    /* renamed from: d */
    public String f49660d;

    /* renamed from: e */
    public int f49661e;

    /* renamed from: f */
    public Surface f49662f;

    /* renamed from: g */
    public C87760d f49663g;

    /* renamed from: h */
    public boolean f49664h;

    /* renamed from: i */
    public int f49665i;

    /* renamed from: j */
    public int f49666j;

    /* renamed from: n */
    public boolean f49667n;

    /* renamed from: o */
    public C18015a.C18016a f49668o;

    /* renamed from: p */
    public C18015a.C18020e f49669p;

    /* renamed from: q */
    public C18015a.C18018c f49670q;

    /* renamed from: r */
    public C18015a.C18017b f49671r;

    /* renamed from: s */
    public C18015a.C18019d f49672s;

    /* renamed from: t */
    public long f49673t;

    /* renamed from: u */
    public long f49674u;

    /* renamed from: v */
    public int f49675v;

    /* renamed from: w */
    public boolean f49676w;

    /* renamed from: x */
    public d$$l f49677x;

    /* renamed from: y */
    public d$$j f49678y;

    /* renamed from: z */
    public d$$k f49679z;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView$a */
    public class C17997a implements d$$d {
        public C17997a() {
        }

        /* renamed from: a */
        public void mo17987a(C87760d dVar) {
            Log.m105924i("MicroMsg.Video.AbstractVideoTextureView", "video on completion");
            AbstractVideoTextureView.this.f49674u = Util.nowSecond();
            C18015a.C18016a aVar = AbstractVideoTextureView.this.f49668o;
            if (aVar != null) {
                aVar.onCompletion();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView$b */
    public class C17998b implements d$$g {
        public C17998b() {
        }

        /* renamed from: a */
        public boolean mo17985a(C87760d dVar, int i, int i2) {
            Log.m105928w("MicroMsg.Video.AbstractVideoTextureView", "Error: " + i + "," + i2);
            C18015a.C18016a aVar = AbstractVideoTextureView.this.f49668o;
            if (aVar == null) {
                return true;
            }
            ((AbstractVideoView) aVar).mo22454l(i, i2);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView$c */
    public class C17999c implements TextureView.SurfaceTextureListener {
        public C17999c() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            AbstractVideoTextureView abstractVideoTextureView = AbstractVideoTextureView.this;
            Surface surface = abstractVideoTextureView.f49662f;
            ((C119157j) C119157j.f356862d).mo183875f(new C89390a(abstractVideoTextureView, surface));
            AbstractVideoTextureView.this.f49662f = new Surface(surfaceTexture);
            Log.m105925i("MicroMsg.Video.AbstractVideoTextureView", "%d on texture available %d*%d mIsPrepared[%b] mSurface[%d] ", Integer.valueOf(AbstractVideoTextureView.this.hashCode()), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(AbstractVideoTextureView.this.f49664h), Integer.valueOf(AbstractVideoTextureView.this.f49662f.hashCode()));
            AbstractVideoTextureView abstractVideoTextureView2 = AbstractVideoTextureView.this;
            C87760d dVar = abstractVideoTextureView2.f49663g;
            if (dVar == null || !abstractVideoTextureView2.f49664h) {
                abstractVideoTextureView2.mo22416e();
            } else {
                dVar.setSurface(abstractVideoTextureView2.f49662f);
                AbstractVideoTextureView abstractVideoTextureView3 = AbstractVideoTextureView.this;
                if (abstractVideoTextureView3.f49653F) {
                    abstractVideoTextureView3.f49663g.start();
                } else {
                    abstractVideoTextureView3.f49654G = true;
                    abstractVideoTextureView3.f49663g.mo22532a(0.0f, 0.0f);
                    AbstractVideoTextureView.this.f49663g.start();
                }
                AbstractVideoTextureView.this.f49653F = false;
            }
            C18015a.C18019d dVar2 = AbstractVideoTextureView.this.f49672s;
            if (dVar2 != null) {
                AbstractVideoView abstractVideoView = (AbstractVideoView) dVar2;
                Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s on surface available", abstractVideoView.mo22453k());
                abstractVideoView.mo22456n(false);
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Log.m105925i("MicroMsg.Video.AbstractVideoTextureView", "%d on texture destroyed mIsPrepared[%b]", Integer.valueOf(AbstractVideoTextureView.this.hashCode()), Boolean.valueOf(AbstractVideoTextureView.this.f49664h));
            AbstractVideoTextureView abstractVideoTextureView = AbstractVideoTextureView.this;
            Surface surface = abstractVideoTextureView.f49662f;
            ((C119157j) C119157j.f356862d).mo183875f(new C89390a(abstractVideoTextureView, surface));
            AbstractVideoTextureView abstractVideoTextureView2 = AbstractVideoTextureView.this;
            abstractVideoTextureView2.f49662f = null;
            if (abstractVideoTextureView2.f49663g == null || !abstractVideoTextureView2.f49664h) {
                abstractVideoTextureView2.mo22417f();
                AbstractVideoTextureView.this.f49653F = false;
            } else if (abstractVideoTextureView2.isPlaying()) {
                AbstractVideoTextureView abstractVideoTextureView3 = AbstractVideoTextureView.this;
                abstractVideoTextureView3.f49653F = true;
                abstractVideoTextureView3.f49663g.pause();
            }
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            Log.m105924i("MicroMsg.Video.AbstractVideoTextureView", "on texture size changed width : " + i + " height : " + i2);
            AbstractVideoTextureView abstractVideoTextureView = AbstractVideoTextureView.this;
            C87760d dVar = abstractVideoTextureView.f49663g;
            if (dVar != null && abstractVideoTextureView.f49664h && abstractVideoTextureView.f49665i == i && abstractVideoTextureView.f49666j == i2) {
                dVar.start();
            }
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C18015a.C18020e eVar;
            Log.m105918d("MicroMsg.Video.AbstractVideoTextureView", "on surface texture updated");
            AbstractVideoTextureView abstractVideoTextureView = AbstractVideoTextureView.this;
            if (abstractVideoTextureView.f49654G) {
                C87760d dVar = abstractVideoTextureView.f49663g;
                if (dVar != null) {
                    dVar.pause();
                    AbstractVideoTextureView abstractVideoTextureView2 = AbstractVideoTextureView.this;
                    if (abstractVideoTextureView2.f49657J) {
                        abstractVideoTextureView2.f49663g.mo22532a(0.0f, 0.0f);
                    } else {
                        abstractVideoTextureView2.f49663g.mo22532a(1.0f, 1.0f);
                    }
                }
                AbstractVideoTextureView.this.f49654G = false;
            }
            AbstractVideoTextureView abstractVideoTextureView3 = AbstractVideoTextureView.this;
            if (abstractVideoTextureView3.f49652E > 0 && (eVar = abstractVideoTextureView3.f49669p) != null) {
                AbstractVideoView abstractVideoView = (AbstractVideoView) eVar;
                Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s onTextureUpdate ", abstractVideoView.mo22453k());
                abstractVideoView.mo22449g();
                AbstractVideoTextureView.this.f49669p = null;
            }
            AbstractVideoTextureView.this.f49652E = System.currentTimeMillis();
            AbstractVideoTextureView abstractVideoTextureView4 = AbstractVideoTextureView.this;
            if (abstractVideoTextureView4.f49655H) {
                Log.m105925i("MicroMsg.Video.AbstractVideoTextureView", "%d flush surface pause now time[%d]", Integer.valueOf(abstractVideoTextureView4.hashCode()), Integer.valueOf(AbstractVideoTextureView.this.getCurrentPosition()));
                C87760d dVar2 = AbstractVideoTextureView.this.f49663g;
                if (dVar2 != null) {
                    dVar2.pause();
                    AbstractVideoTextureView abstractVideoTextureView5 = AbstractVideoTextureView.this;
                    abstractVideoTextureView5.setMute(abstractVideoTextureView5.f49657J);
                }
                AbstractVideoTextureView.this.f49655H = false;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView$e */
    public class C18000e implements Runnable {
        public C18000e() {
        }

        public void run() {
            try {
                AbstractVideoTextureView abstractVideoTextureView = AbstractVideoTextureView.this;
                abstractVideoTextureView.f49663g.setSurface(abstractVideoTextureView.f49662f);
                AbstractVideoTextureView.this.f49663g.prepareAsync();
                AbstractVideoTextureView abstractVideoTextureView2 = AbstractVideoTextureView.this;
                abstractVideoTextureView2.f49666j = abstractVideoTextureView2.f49663g.getVideoHeight();
                AbstractVideoTextureView abstractVideoTextureView3 = AbstractVideoTextureView.this;
                abstractVideoTextureView3.f49665i = abstractVideoTextureView3.f49663g.getVideoWidth();
                AbstractVideoTextureView abstractVideoTextureView4 = AbstractVideoTextureView.this;
                abstractVideoTextureView4.setMute(abstractVideoTextureView4.f49657J);
                AbstractVideoTextureView abstractVideoTextureView5 = AbstractVideoTextureView.this;
                float f = abstractVideoTextureView5.f49659L;
                if (f > 0.0f) {
                    abstractVideoTextureView5.f49659L = f;
                    C87760d dVar = abstractVideoTextureView5.f49663g;
                    if (dVar != null) {
                        dVar.mo22543l(f);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Video.AbstractVideoTextureView", e, "prepare async error path", new Object[0]);
                C18015a.C18016a aVar = AbstractVideoTextureView.this.f49668o;
                if (aVar != null) {
                    ((AbstractVideoView) aVar).mo22454l(-1, -1);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView$g */
    public class C18001g implements d$$l {
        public C18001g() {
        }

        /* renamed from: a */
        public void mo17989a(C87760d dVar, int i, int i2) {
            try {
                AbstractVideoTextureView abstractVideoTextureView = AbstractVideoTextureView.this;
                C87760d dVar2 = abstractVideoTextureView.f49663g;
                if (dVar != dVar2) {
                    Log.m105929w("MicroMsg.Video.AbstractVideoTextureView", "another player on video size changed, return now.[%s, %s]", dVar, dVar2);
                    return;
                }
                abstractVideoTextureView.f49665i = dVar.getVideoWidth();
                AbstractVideoTextureView.this.f49666j = dVar.getVideoHeight();
                Log.m105924i("MicroMsg.Video.AbstractVideoTextureView", "on size change size:( " + AbstractVideoTextureView.this.f49665i + " , " + AbstractVideoTextureView.this.f49666j + " )");
                AbstractVideoTextureView abstractVideoTextureView2 = AbstractVideoTextureView.this;
                C18015a.C18016a aVar = abstractVideoTextureView2.f49668o;
                if (aVar != null) {
                    int i3 = abstractVideoTextureView2.f49665i;
                    int i4 = abstractVideoTextureView2.f49666j;
                    AbstractVideoView abstractVideoView = (AbstractVideoView) aVar;
                    Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s on get video size [%d, %d]", abstractVideoView.mo22453k(), Integer.valueOf(i3), Integer.valueOf(i4));
                    C17978c.C17981c cVar = abstractVideoView.f49706q;
                    if (cVar != null) {
                        cVar.mo22311l0(abstractVideoView.getSessionId(), abstractVideoView.getMediaId(), i3, i4);
                    }
                }
                AbstractVideoTextureView abstractVideoTextureView3 = AbstractVideoTextureView.this;
                int i5 = AbstractVideoTextureView.f49647M;
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) abstractVideoTextureView3.getLayoutParams();
                layoutParams.addRule(13);
                abstractVideoTextureView3.setLayoutParams(layoutParams);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Video.AbstractVideoTextureView", e, "on video size changed error[%d, %d]", Integer.valueOf(i), Integer.valueOf(i2));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView$h */
    public class C18002h implements d$$j {
        public C18002h() {
        }

        /* renamed from: a */
        public void mo17986a(C87760d dVar) {
            AbstractVideoTextureView abstractVideoTextureView = AbstractVideoTextureView.this;
            C87760d dVar2 = abstractVideoTextureView.f49663g;
            if (dVar == dVar2 || dVar == null) {
                abstractVideoTextureView.f49664h = true;
                abstractVideoTextureView.f49665i = dVar != null ? dVar.getVideoWidth() : 0;
                AbstractVideoTextureView.this.f49666j = dVar != null ? dVar.getVideoHeight() : 0;
                Log.m105925i("MicroMsg.Video.AbstractVideoTextureView", "on prepared. size [%d, %d] mStartWhenPrepared %b ", Integer.valueOf(AbstractVideoTextureView.this.f49665i), Integer.valueOf(AbstractVideoTextureView.this.f49666j), Boolean.valueOf(AbstractVideoTextureView.this.f49667n));
                AbstractVideoTextureView abstractVideoTextureView2 = AbstractVideoTextureView.this;
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) abstractVideoTextureView2.getLayoutParams();
                layoutParams.addRule(13);
                abstractVideoTextureView2.setLayoutParams(layoutParams);
                AbstractVideoTextureView abstractVideoTextureView3 = AbstractVideoTextureView.this;
                if (abstractVideoTextureView3.f49665i == 0 || abstractVideoTextureView3.f49666j == 0) {
                    if (abstractVideoTextureView3.f49667n) {
                        abstractVideoTextureView3.f49663g.start();
                        AbstractVideoTextureView abstractVideoTextureView4 = AbstractVideoTextureView.this;
                        abstractVideoTextureView4.f49667n = false;
                        abstractVideoTextureView4.f49663g.mo22533b(abstractVideoTextureView4.f49676w);
                    }
                } else if (abstractVideoTextureView3.f49667n) {
                    abstractVideoTextureView3.f49663g.start();
                    AbstractVideoTextureView abstractVideoTextureView5 = AbstractVideoTextureView.this;
                    abstractVideoTextureView5.f49663g.mo22533b(abstractVideoTextureView5.f49676w);
                    AbstractVideoTextureView.this.f49667n = false;
                }
                C18015a.C18016a aVar = AbstractVideoTextureView.this.f49668o;
                if (aVar != null) {
                    AbstractVideoView abstractVideoView = (AbstractVideoView) aVar;
                    Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s onPrepared startWhenPrepared[%b] seekTimeWhenPrepared[%d] isPrepared[%b]", abstractVideoView.mo22453k(), Boolean.valueOf(abstractVideoView.f49709t), Integer.valueOf(abstractVideoView.f49710u), Boolean.valueOf(abstractVideoView.f49712w));
                    abstractVideoView.f49712w = true;
                    C18015a aVar2 = abstractVideoView.f49704o;
                    if (aVar2 != null) {
                        aVar2.setOneTimeVideoTextureUpdateCallback(abstractVideoView);
                    }
                    abstractVideoView.setVideoTotalTime(abstractVideoView.getVideoDurationSec());
                    if (!abstractVideoView.f49709t) {
                        int i = abstractVideoView.f49710u;
                        if (i >= 0) {
                            abstractVideoView.mo22294a((double) i, false);
                        }
                    } else if (abstractVideoView.f49710u <= -1) {
                        if (abstractVideoView.play()) {
                            abstractVideoView.f49714y.startTimer(1000);
                        }
                    } else if (!((BaseVideoView) abstractVideoView).mo22308i()) {
                        abstractVideoView.mo22294a((double) abstractVideoView.f49710u, abstractVideoView.f49709t);
                    } else {
                        abstractVideoView.play();
                    }
                    abstractVideoView.f49710u = -1;
                    abstractVideoView.f49709t = true;
                    C17978c.C17981c cVar = abstractVideoView.f49706q;
                    if (cVar != null) {
                        cVar.mo22293Z(abstractVideoView.getSessionId(), abstractVideoView.getMediaId());
                    }
                    if (abstractVideoView.f49711v > 0) {
                        Log.m105919d("MicroMsg.Video.AbstractVideoView", "%s start error check timer", abstractVideoView.mo22453k());
                        abstractVideoView.f49715z.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                        return;
                    }
                    return;
                }
                return;
            }
            Log.m105929w("MicroMsg.Video.AbstractVideoTextureView", "another player callback, release now.[%s, %s]", dVar, dVar2);
            AbstractVideoTextureView abstractVideoTextureView6 = AbstractVideoTextureView.this;
            abstractVideoTextureView6.getClass();
            new C89391b(abstractVideoTextureView6, dVar).start();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView$i */
    public class C18003i implements d$$k {
        public C18003i() {
        }

        /* renamed from: a */
        public void mo17988a(C87760d dVar) {
            Log.m105925i("MicroMsg.Video.AbstractVideoTextureView", "video seek complete curPos[%d] mStartWhenPrepared[%b] pauseWhenUpdated[%b]", Integer.valueOf(dVar != null ? dVar.getCurrentPosition() : -1), Boolean.valueOf(AbstractVideoTextureView.this.f49667n), Boolean.valueOf(AbstractVideoTextureView.this.f49654G));
            AbstractVideoTextureView abstractVideoTextureView = AbstractVideoTextureView.this;
            if (!abstractVideoTextureView.f49667n) {
                abstractVideoTextureView.pause();
            } else if (!abstractVideoTextureView.f49654G) {
                abstractVideoTextureView.start();
            } else {
                return;
            }
            AbstractVideoTextureView abstractVideoTextureView2 = AbstractVideoTextureView.this;
            C18015a.C18018c cVar = abstractVideoTextureView2.f49670q;
            if (cVar != null) {
                boolean z = abstractVideoTextureView2.f49667n;
                AbstractVideoView abstractVideoView = (AbstractVideoView) cVar;
                Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s on seek complete startPlay[%b]", abstractVideoView.mo22453k(), Boolean.valueOf(z));
                C18015a aVar = abstractVideoView.f49704o;
                if (aVar != null) {
                    aVar.setOneTimeVideoTextureUpdateCallback(abstractVideoView);
                }
                abstractVideoView.mo22449g();
                abstractVideoView.mo22460q(z);
                abstractVideoView.mo22459p(abstractVideoView.getCurrPosSec());
                if (z) {
                    abstractVideoView.mo22456n(false);
                    abstractVideoView.f49705p = false;
                    C17978c.C17981c cVar2 = abstractVideoView.f49706q;
                    if (cVar2 != null) {
                        cVar2.mo22312m0(abstractVideoView.getSessionId(), abstractVideoView.getMediaId());
                    }
                }
            }
            AbstractVideoTextureView.this.f49652E = 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView$j */
    public class C18004j implements d$$c {
        public C18004j() {
        }

        /* renamed from: a */
        public void mo17990a(C87760d dVar, int i) {
            Log.m105919d("MicroMsg.Video.AbstractVideoTextureView", "onBufferingUpdate percent[%d]", Integer.valueOf(i));
            AbstractVideoTextureView.this.f49675v = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView$k */
    public class C18005k implements d$$i {
        public C18005k() {
        }

        /* renamed from: a */
        public boolean mo17984a(C87760d dVar, int i, int i2) {
            Log.m105919d("MicroMsg.Video.AbstractVideoTextureView", "onInfo [%d %d]", Integer.valueOf(i), Integer.valueOf(i2));
            C18015a.C18017b bVar = AbstractVideoTextureView.this.f49671r;
            if (bVar != null) {
                ((BaseVideoView) bVar).mo22467s(i, i2);
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView$d */
    public class C18006d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C87760d f49689d;

        public C18006d(AbstractVideoTextureView abstractVideoTextureView, C87760d dVar) {
            this.f49689d = dVar;
        }

        public void run() {
            try {
                this.f49689d.reset();
                this.f49689d.release();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Video.AbstractVideoTextureView", e, "reset media player error", new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoTextureView$f */
    public class C18007f implements d$$e {

        /* renamed from: a */
        public final /* synthetic */ Runnable f49690a;

        public C18007f(Runnable runnable) {
            this.f49690a = runnable;
        }

        /* renamed from: a */
        public void mo22447a() {
            Log.m105924i("MicroMsg.Video.AbstractVideoTextureView", "onDataSourceSet#openVideo");
            if (Looper.getMainLooper() == Looper.myLooper()) {
                this.f49690a.run();
            } else {
                AbstractVideoTextureView.this.post(this.f49690a);
            }
        }
    }

    public AbstractVideoTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo22412a(double d, boolean z) {
        mo22415d(d);
        this.f49667n = z;
    }

    /* renamed from: b */
    public final void mo22413b(SurfaceTexture surfaceTexture) {
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

    /* renamed from: c */
    public abstract C87760d mo22414c();

    /* renamed from: d */
    public void mo22415d(double d) {
        C87760d dVar = this.f49663g;
        if (dVar != null) {
            dVar.seekTo((long) ((int) d));
            this.f49667n = true;
            Log.m105918d("MicroMsg.Video.AbstractVideoTextureView", "seek to time: " + d + " curr pos : " + this.f49663g.getCurrentPosition());
        }
    }

    /* renamed from: e */
    public final void mo22416e() {
        if (Util.isNullOrNil(this.f49660d) || this.f49662f == null) {
            Log.m105925i("MicroMsg.Video.AbstractVideoTextureView", "openVideo, try later, url:%s, surface:%s", this.f49660d, this.f49662f);
            return;
        }
        mo22417f();
        Log.m105925i("MicroMsg.Video.AbstractVideoTextureView", "%d open video %s", Integer.valueOf(hashCode()), this.f49660d);
        try {
            C87760d c = mo22414c();
            this.f49663g = c;
            c.mo22586u(this.f49678y);
            this.f49663g.mo22585t(this.f49677x);
            this.f49664h = false;
            this.f49661e = -1;
            this.f49675v = 0;
            this.f49663g.mo22576c(this.f49650C);
            this.f49663g.mo22583q(this.f49651D);
            this.f49663g.mo22587v(this.f49679z);
            this.f49663g.mo22584s(this.f49648A);
            this.f49663g.mo22579i(this.f49649B);
            C18000e eVar = new C18000e();
            if (!Util.isNullOrNil(this.f49660d)) {
                this.f49663g.mo22580m(this.f49660d, (String) null, new C18007f(eVar));
            } else {
                eVar.run();
            }
            Log.m105925i("MicroMsg.Video.AbstractVideoTextureView", "%d open video success player[%s]", Integer.valueOf(hashCode()), Integer.valueOf(this.f49663g.hashCode()));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Video.AbstractVideoTextureView", e, "prepare async error path", new Object[0]);
            C18015a.C18016a aVar = this.f49668o;
            if (aVar != null) {
                ((AbstractVideoView) aVar).mo22454l(-1, -1);
            }
        }
    }

    /* renamed from: f */
    public final void mo22417f() {
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(hashCode());
        boolean z = true;
        objArr[1] = Boolean.valueOf(this.f49664h);
        if (this.f49663g != null) {
            z = false;
        }
        objArr[2] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.Video.AbstractVideoTextureView", "%d release media player isPrepared[%b] player is null[%b] ", objArr);
        C87760d dVar = this.f49663g;
        if (dVar != null) {
            dVar.mo22583q((d$$g) null);
            this.f49663g.mo22585t((d$$l) null);
            try {
                this.f49663g.stop();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Video.AbstractVideoTextureView", e, "stop media player error", new Object[0]);
            }
            C87760d dVar2 = this.f49663g;
            ((C119157j) C119157j.f356862d).mo183875f(new C18006d(this, dVar2));
            this.f49663g = null;
        }
    }

    public int getCurrentPosition() {
        C87760d dVar = this.f49663g;
        return (dVar == null || !this.f49664h) ? dVar == null ? -1 : 0 : dVar.getCurrentPosition();
    }

    public int getDownloadPercent() {
        return this.f49675v;
    }

    public int getDuration() {
        C87760d dVar = this.f49663g;
        if (dVar == null || !this.f49664h) {
            this.f49661e = -1;
            return -1;
        }
        int i = this.f49661e;
        if (i > 0) {
            return i;
        }
        int duration = dVar.getDuration();
        this.f49661e = duration;
        return duration;
    }

    public double getLastProgresstime() {
        return 0.0d;
    }

    public long getLastSurfaceUpdateTime() {
        return this.f49652E;
    }

    public String getVideoPath() {
        return this.f49660d;
    }

    public boolean isPlaying() {
        C87760d dVar = this.f49663g;
        boolean isPlaying = (dVar == null || !this.f49664h || this.f49654G || this.f49655H) ? false : dVar.isPlaying();
        Log.m105919d("MicroMsg.Video.AbstractVideoTextureView", "%d is playing result [%b] pauseWhenUpdated[%b] mIsPrepared[%b]", Integer.valueOf(hashCode()), Boolean.valueOf(isPlaying), Boolean.valueOf(this.f49654G), Boolean.valueOf(this.f49664h));
        return isPlaying;
    }

    public void onMeasure(int i, int i2) {
        if (this.f49665i == 0 || this.f49666j == 0) {
            setMeasuredDimension(1, 1);
            return;
        }
        int defaultSize = View.getDefaultSize(1, i);
        int defaultSize2 = View.getDefaultSize(1, i2);
        int i3 = this.f49665i;
        int i4 = this.f49666j;
        C22003g gVar = this.f49658K;
        if (!(gVar.f62261c == defaultSize && gVar.f62262d == defaultSize2 && gVar.f62263e == i3 && gVar.f62264f == i4)) {
            gVar.f62261c = defaultSize;
            gVar.f62262d = defaultSize2;
            gVar.f62263e = i3;
            gVar.f62264f = i4;
            float f = (((float) i3) * 1.0f) / ((float) i4);
            float f2 = (float) defaultSize;
            float f3 = (float) defaultSize2;
            float f4 = (1.0f * f2) / f3;
            C17978c.C17986h hVar = gVar.f62260b;
            if (hVar == C17978c.C17986h.DEFAULT) {
                gVar.mo35096a(f, f4);
            } else if (hVar == C17978c.C17986h.CONTAIN) {
                if (defaultSize < defaultSize2) {
                    int i5 = (int) (f2 / f);
                    gVar.f62266h = i5;
                    gVar.f62265g = defaultSize;
                    if (i5 > defaultSize2) {
                        gVar.f62265g = (int) (f3 * f);
                        gVar.f62266h = defaultSize2;
                    }
                } else {
                    int i6 = (int) (f3 * f);
                    gVar.f62265g = i6;
                    gVar.f62266h = defaultSize2;
                    if (i6 > defaultSize) {
                        gVar.f62266h = (int) (f2 / f);
                        gVar.f62265g = defaultSize;
                    }
                }
            } else if (hVar == C17978c.C17986h.FILL) {
                gVar.f62266h = defaultSize2;
                gVar.f62265g = defaultSize;
            } else if (hVar != C17978c.C17986h.COVER) {
                gVar.mo35096a(f, f4);
            } else if (defaultSize > defaultSize2) {
                int i7 = (int) (f2 / f);
                gVar.f62266h = i7;
                gVar.f62265g = defaultSize;
                if (i7 < defaultSize2) {
                    gVar.f62265g = (int) (f3 * f);
                    gVar.f62266h = defaultSize2;
                }
            } else {
                int i8 = (int) (f3 * f);
                gVar.f62265g = i8;
                gVar.f62266h = defaultSize2;
                if (i8 < defaultSize) {
                    gVar.f62266h = (int) (f2 / f);
                    gVar.f62265g = defaultSize;
                }
            }
            Log.m105919d("MicroMsg.ViewSizeCache", "screen[%d, %d], video[%d, %d], measure[%d, %d] scale[%f, %f]", Integer.valueOf(gVar.f62261c), Integer.valueOf(gVar.f62262d), Integer.valueOf(gVar.f62263e), Integer.valueOf(gVar.f62264f), Integer.valueOf(gVar.f62265g), Integer.valueOf(gVar.f62266h), Float.valueOf(f4), Float.valueOf(f));
        }
        C22003g gVar2 = this.f49658K;
        setMeasuredDimension(gVar2.f62265g, gVar2.f62266h);
    }

    public void pause() {
        C87760d dVar = this.f49663g;
        if (dVar != null && this.f49664h && dVar.isPlaying()) {
            Log.m105918d("MicroMsg.Video.AbstractVideoTextureView", "pause video.");
            this.f49663g.pause();
        }
        this.f49667n = false;
    }

    public void setForceScaleFullScreen(boolean z) {
        this.f49658K.f62259a = z;
    }

    public void setLoop(boolean z) {
        C87760d dVar = this.f49663g;
        if (dVar != null) {
            dVar.mo22533b(z);
        }
        this.f49676w = true;
    }

    public void setMute(boolean z) {
        Log.m105925i("MicroMsg.Video.AbstractVideoTextureView", "%d set mute %b", Integer.valueOf(hashCode()), Boolean.valueOf(z));
        this.f49657J = z;
        C87760d dVar = this.f49663g;
        if (dVar == null) {
            return;
        }
        if (z) {
            dVar.mo22532a(0.0f, 0.0f);
        } else {
            dVar.mo22532a(1.0f, 1.0f);
        }
    }

    public void setOnInfoCallback(C18015a.C18017b bVar) {
        this.f49671r = bVar;
    }

    public void setOnSeekCompleteCallback(C18015a.C18018c cVar) {
        this.f49670q = cVar;
    }

    public void setOnSurfaceCallback(C18015a.C18019d dVar) {
        this.f49672s = dVar;
    }

    public void setOneTimeVideoTextureUpdateCallback(C18015a.C18020e eVar) {
        this.f49669p = eVar;
    }

    public void setPlayProgressCallback(boolean z) {
    }

    public void setScaleType(C17978c.C17986h hVar) {
        C22003g gVar = this.f49658K;
        Log.m105925i("MicroMsg.ViewSizeCache", "set scale type old[%s] new[%s]", gVar.f62260b, hVar);
        gVar.f62260b = hVar;
        gVar.f62262d = 0;
        gVar.f62261c = 0;
        gVar.f62264f = 0;
        gVar.f62263e = 0;
        gVar.f62266h = 0;
        gVar.f62265g = 0;
        requestLayout();
    }

    public void setThumb(Bitmap bitmap) {
    }

    public void setVideoCallback(C18015a.C18016a aVar) {
        this.f49668o = aVar;
    }

    public void setVideoPath(String str) {
        this.f49660d = str;
        this.f49667n = false;
        mo22416e();
        requestLayout();
    }

    public boolean start() {
        if (this.f49662f == null) {
            Log.m105929w("MicroMsg.Video.AbstractVideoTextureView", "%d it surface not ready, do not start", Integer.valueOf(hashCode()));
            this.f49653F = true;
            this.f49667n = true;
            return false;
        }
        long j = this.f49673t;
        if (j == 0) {
            j = Util.nowSecond();
        }
        this.f49673t = j;
        Log.m105925i("MicroMsg.Video.AbstractVideoTextureView", "start %d mIsPrepared %b pauseWhenUpdated %b mediaPlayer %s", Long.valueOf(j), Boolean.valueOf(this.f49664h), Boolean.valueOf(this.f49654G), this.f49663g);
        C87760d dVar = this.f49663g;
        if (dVar != null && this.f49664h) {
            if (this.f49654G) {
                this.f49654G = false;
                setMute(this.f49657J);
            }
            this.f49663g.start();
            this.f49667n = true;
            return true;
        } else if (dVar != null || !this.f49664h) {
            this.f49667n = true;
            return false;
        } else {
            this.f49667n = true;
            mo22416e();
            requestLayout();
            return true;
        }
    }

    public void stop() {
        SurfaceTexture surfaceTexture;
        long j = this.f49674u;
        long j2 = j > 0 ? j - this.f49673t : 2147483647L;
        long nowSecond = Util.nowSecond() - this.f49673t;
        if (((int) (j2 > nowSecond ? nowSecond : j2)) * 1000 > getDuration()) {
            getDuration();
        }
        Log.m105925i("MicroMsg.Video.AbstractVideoTextureView", "stop : dur:%d stop:%d comp:%d", Integer.valueOf(getDuration()), Long.valueOf(nowSecond), Long.valueOf(j2));
        if (this.f49668o != null) {
            getDuration();
        }
        mo22417f();
        C22003g gVar = this.f49658K;
        gVar.f62262d = 0;
        gVar.f62261c = 0;
        gVar.f62264f = 0;
        gVar.f62263e = 0;
        gVar.f62266h = 0;
        gVar.f62265g = 0;
        try {
            if (!(this.f49662f == null || !this.f49664h || (surfaceTexture = getSurfaceTexture()) == null)) {
                Log.m105925i("MicroMsg.Video.AbstractVideoTextureView", "%d releaseSurface", Integer.valueOf(hashCode()));
                mo22413b(surfaceTexture);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Video.AbstractVideoTextureView", e, "release surface", new Object[0]);
        }
        this.f49660d = "";
        this.f49675v = 0;
        this.f49664h = false;
        this.f49667n = false;
        this.f49652E = 0;
    }

    public AbstractVideoTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49662f = null;
        this.f49663g = null;
        this.f49673t = 0;
        this.f49674u = 0;
        this.f49675v = 0;
        this.f49676w = false;
        this.f49677x = new C18001g();
        this.f49678y = new C18002h();
        this.f49679z = new C18003i();
        this.f49648A = new C18004j();
        this.f49649B = new C18005k();
        this.f49650C = new C17997a();
        this.f49651D = new C17998b();
        this.f49652E = 0;
        this.f49653F = false;
        this.f49654G = false;
        this.f49655H = false;
        C17999c cVar = new C17999c();
        this.f49656I = cVar;
        this.f49657J = false;
        this.f49658K = new C22003g();
        this.f49659L = -1.0f;
        this.f49665i = 0;
        this.f49666j = 0;
        setSurfaceTextureListener(cVar);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }
}
