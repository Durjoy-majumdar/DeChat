package com.tencent.p014mm.plugin.sns.p104ad.widget.alphavideo;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.tencent.live2.impl.V2TXLiveDefInner;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p104ad.widget.alphavideo.C106152a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.thumbplayer.api.TPOptionalParam;
import d14.C58085t0;
import d14.C58097y0;
import gy3.C87412m;
import j03.C21147f;
import j03.C60698b;
import p329d3.C86165a;
import vr2.C37817q;
import wq2.C111830b;
import wq2.C111833e;
import wq2.C111834f;
import wq2.C111835g;
import wq2.C111836h;
import wq2.C111837i;
import wq2.a$$a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView */
public class AdAlphaPlayerView extends FrameLayout implements C106152a.C94754a {

    /* renamed from: r */
    public static final /* synthetic */ int f316168r = 0;

    /* renamed from: d */
    public C111835g f316169d;

    /* renamed from: e */
    public C60698b f316170e;

    /* renamed from: f */
    public TextureView f316171f;

    /* renamed from: g */
    public C111834f f316172g;

    /* renamed from: h */
    public String f316173h;

    /* renamed from: i */
    public boolean f316174i;

    /* renamed from: j */
    public int f316175j;

    /* renamed from: n */
    public boolean f316176n = false;

    /* renamed from: o */
    public boolean f316177o = false;

    /* renamed from: p */
    public C86165a<Void> f316178p;

    /* renamed from: q */
    public String f316179q = "";

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$a */
    public class C106141a implements Runnable {
        public C106141a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$12");
            if (AdAlphaPlayerView.m142782a(AdAlphaPlayerView.this) != null) {
                AdAlphaPlayerView.m142782a(AdAlphaPlayerView.this).mo137532d(AdAlphaPlayerView.this);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$12");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$b */
    public class C106142b implements Runnable {
        public C106142b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$13");
            synchronized (AdAlphaPlayerView.this) {
                try {
                    ((C21147f) AdAlphaPlayerView.this.f316170e).stopAsync();
                    ((C21147f) AdAlphaPlayerView.this.f316170e).release();
                } catch (Throwable th) {
                    while (true) {
                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$13");
                        throw th;
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$13");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$c */
    public class C106143c implements ITPPlayerListener.IOnStateChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C60698b f316182d;

        public C106143c(C60698b bVar) {
            this.f316182d = bVar;
        }

        public void onStateChange(int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("onStateChange", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$1");
            C111836h.m152498e("AdAlphaPlayerView", "onStateChange() called with: preState = [" + i + "], curState = [" + i2 + "]");
            if (AdAlphaPlayerView.m142782a(AdAlphaPlayerView.this) != null) {
                AdAlphaPlayerView.m142782a(AdAlphaPlayerView.this).mo137529a(i, i2);
            }
            if (i2 == 4) {
                try {
                    AdAlphaPlayerView adAlphaPlayerView = AdAlphaPlayerView.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                    boolean z = adAlphaPlayerView.f316177o;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                    if (z) {
                        this.f316182d.start();
                    }
                } catch (Throwable th) {
                    Log.m105921e("AdAlphaPlayerView", "try start error", th);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onStateChange", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$d */
    public class C106144d implements ITPPlayerListener.IOnErrorListener {

        /* renamed from: com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$d$a */
        public class C106145a implements Runnable {
            public C106145a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$2$1");
                Log.m105918d("AdAlphaPlayerView", "setAlpha(0) called");
                AdAlphaPlayerView.this.setAlpha(0.0f);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$2$1");
            }
        }

        public C106144d() {
        }

        public void onError(ITPPlayer iTPPlayer, int i, int i2, long j, long j2) {
            SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$2");
            C111836h.m152495b("AdAlphaPlayerView", "onError() called with: player = [" + iTPPlayer + "], errorType = [" + i + "], errorCode = [" + i2 + "], arg1 = [" + j + "], arg2 = [" + j2 + "]");
            C115669n.INSTANCE.mo175911u(1913, 3);
            StringBuilder sb = new StringBuilder();
            sb.append("arg1=");
            sb.append(j);
            sb.append("|arg2=");
            sb.append(j2);
            sb.append("|");
            AdAlphaPlayerView adAlphaPlayerView = AdAlphaPlayerView.this;
            int i3 = AdAlphaPlayerView.f316168r;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            String str = adAlphaPlayerView.f316179q;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            sb.append(str);
            C37817q.m41546b("break_video_error_info", "1", i, i2, sb.toString());
            ((C119157j) C119157j.f356862d).mo183895z(new C106145a());
            AdAlphaPlayerView adAlphaPlayerView2 = AdAlphaPlayerView.this;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            C111835g gVar = adAlphaPlayerView2.f316169d;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            if (gVar != null) {
                AdAlphaPlayerView adAlphaPlayerView3 = AdAlphaPlayerView.this;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                C111835g gVar2 = adAlphaPlayerView3.f316169d;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                gVar2.mo151904d();
            }
            try {
                C60698b bVar = AdAlphaPlayerView.this.f316170e;
                if (bVar != null) {
                    ((C21147f) bVar).stopAsync();
                    ((C21147f) AdAlphaPlayerView.this.f316170e).release();
                }
            } catch (Throwable th) {
                Log.m105919d("AdAlphaPlayerView", "onError ", th);
            }
            SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$e */
    public class C106146e implements ITPPlayerListener.IOnCompletionListener {
        public C106146e() {
        }

        public void onCompletion(ITPPlayer iTPPlayer) {
            SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$3");
            C111836h.m152498e("AdAlphaPlayerView", "onCompletion");
            if (AdAlphaPlayerView.m142782a(AdAlphaPlayerView.this) != null) {
                AdAlphaPlayerView.m142782a(AdAlphaPlayerView.this).mo137531c(5);
            }
            SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$f */
    public class C106147f implements ITPPlayerListener.IOnVideoSizeChangedListener {
        public C106147f(AdAlphaPlayerView adAlphaPlayerView) {
        }

        public void onVideoSizeChanged(ITPPlayer iTPPlayer, long j, long j2) {
            SnsMethodCalculate.markStartTimeMs("onVideoSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$4");
            C111836h.m152494a("AdAlphaPlayerView", "onVideoSizeChanged() called with: player = [" + iTPPlayer + "], width = [" + j + "], height = [" + j2 + "]");
            SnsMethodCalculate.markEndTimeMs("onVideoSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$g */
    public class C106148g implements ITPPlayerListener.IOnInfoListener {
        public C106148g(AdAlphaPlayerView adAlphaPlayerView) {
        }

        public void onInfo(ITPPlayer iTPPlayer, int i, long j, long j2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onInfo", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$5");
            C111836h.m152498e("AdAlphaPlayerView", "onInfo() called with: player = [" + iTPPlayer + "], what = [" + i + "], arg1 = [" + j + "], arg2 = [" + j2 + "], extraObject = [" + obj + "]");
            SnsMethodCalculate.markEndTimeMs("onInfo", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$h */
    public class C106149h implements Runnable {
        public C106149h() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$6");
            if (AdAlphaPlayerView.m142782a(AdAlphaPlayerView.this) != null) {
                AdAlphaPlayerView.m142782a(AdAlphaPlayerView.this).mo137530b(AdAlphaPlayerView.this, "init player failed");
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$i */
    public class C106150i implements TextureView.SurfaceTextureListener {

        /* renamed from: com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$i$a */
        public class C106151a implements Runnable {
            public C106151a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$7$1");
                Log.m105918d("AdAlphaPlayerView", "setAlpha 0 called");
                AdAlphaPlayerView.this.setAlpha(0.0f);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$7$1");
            }
        }

        public C106150i() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            SurfaceTexture surfaceTexture2 = surfaceTexture;
            int i3 = i;
            int i4 = i2;
            SnsMethodCalculate.markStartTimeMs("onSurfaceTextureAvailable", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$7");
            C111836h.m152498e("AdAlphaPlayerView", "onSurfaceTextureAvailable " + surfaceTexture2);
            AdAlphaPlayerView adAlphaPlayerView = AdAlphaPlayerView.this;
            int i5 = AdAlphaPlayerView.f316168r;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            TextureView textureView = adAlphaPlayerView.f316171f;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            if (textureView.getSurfaceTexture() != surfaceTexture2) {
                C111836h.m152498e("AdAlphaPlayerView", "onSurfaceTextureAvailable change surface " + surfaceTexture2);
                AdAlphaPlayerView adAlphaPlayerView2 = AdAlphaPlayerView.this;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                TextureView textureView2 = adAlphaPlayerView2.f316171f;
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                textureView2.setSurfaceTexture(surfaceTexture2);
            }
            AdAlphaPlayerView adAlphaPlayerView3 = AdAlphaPlayerView.this;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            TextureView textureView3 = adAlphaPlayerView3.f316171f;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            SnsMethodCalculate.markStartTimeMs("startRenderPlay", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            C111836h.m152494a("AdAlphaPlayerView", "startPlay: width-" + i3 + " height-" + i4);
            SnsMethodCalculate.markStartTimeMs("setupRenderer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            if (adAlphaPlayerView3.f316171f == null || i3 == 0 || i4 == 0) {
                SnsMethodCalculate.markStartTimeMs("w", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
                Log.m105928w("AlphaPlayer_AdAlphaPlayerView", String.valueOf("setupRenderer failed: surface-" + textureView3 + ", width-" + i3 + ", height-" + i4));
                SnsMethodCalculate.markEndTimeMs("w", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
                SnsMethodCalculate.markEndTimeMs("setupRenderer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            } else {
                C111835g gVar = new C111835g(adAlphaPlayerView3.getContext(), textureView3.getSurfaceTexture(), i, i2, adAlphaPlayerView3.f316175j);
                adAlphaPlayerView3.f316169d = gVar;
                SnsMethodCalculate.markStartTimeMs("setRendererStatusChangeListener", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
                gVar.f316200q = adAlphaPlayerView3;
                SnsMethodCalculate.markEndTimeMs("setRendererStatusChangeListener", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.TextureSurfaceRenderer");
                SnsMethodCalculate.markEndTimeMs("setupRenderer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            }
            SnsMethodCalculate.markEndTimeMs("startRenderPlay", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            SnsMethodCalculate.markEndTimeMs("onSurfaceTextureAvailable", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$7");
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            SnsMethodCalculate.markStartTimeMs("onSurfaceTextureDestroyed", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$7");
            C111836h.m152498e("AdAlphaPlayerView", "onSurfaceTextureDestroyed");
            ((C119157j) C119157j.f356862d).mo183895z(new C106151a());
            AdAlphaPlayerView adAlphaPlayerView = AdAlphaPlayerView.this;
            int i = AdAlphaPlayerView.f316168r;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            C111835g gVar = adAlphaPlayerView.f316169d;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            if (gVar != null) {
                gVar.mo151904d();
            }
            SnsMethodCalculate.markEndTimeMs("onSurfaceTextureDestroyed", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$7");
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("onSurfaceTextureSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$7");
            C111836h.m152494a("AdAlphaPlayerView", "onSurfaceTextureSizeChanged width:" + i + " height:" + i2);
            SnsMethodCalculate.markEndTimeMs("onSurfaceTextureSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$7");
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            SnsMethodCalculate.markStartTimeMs("onSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$7");
            SnsMethodCalculate.markEndTimeMs("onSurfaceTextureUpdated", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$7");
        }
    }

    public AdAlphaPlayerView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static /* synthetic */ C111834f m142782a(AdAlphaPlayerView adAlphaPlayerView) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        C111834f fVar = adAlphaPlayerView.f316172g;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        return fVar;
    }

    private C60698b getPlayer() {
        SnsMethodCalculate.markStartTimeMs("getPlayer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        C60698b bVar = this.f316170e;
        if (bVar == null) {
            this.f316170e = mo151881b();
        } else {
            try {
                bVar.reset();
            } catch (Throwable th) {
                Log.m105921e("AdAlphaPlayerView", "getPlayer() called " + th, th);
                this.f316170e = mo151881b();
            }
        }
        try {
            setDataSource(this.f316170e);
        } catch (Throwable th4) {
            C111836h.m152496c("AdAlphaPlayerView", "init player failed", th4);
            C111837i.m152499a().mo163553b(new C106149h());
        }
        C60698b bVar2 = this.f316170e;
        SnsMethodCalculate.markEndTimeMs("getPlayer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        return bVar2;
    }

    private void setDataSource(C60698b bVar) {
        SnsMethodCalculate.markStartTimeMs("setDataSource", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        if (bVar == null) {
            SnsMethodCalculate.markEndTimeMs("setDataSource", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        } else if (!TextUtils.isEmpty(this.f316173h)) {
            bVar.setDataSource(this.f316173h);
            SnsMethodCalculate.markEndTimeMs("setDataSource", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        } else {
            SnsMethodCalculate.markEndTimeMs("setDataSource", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        }
    }

    /* renamed from: b */
    public final C60698b mo151881b() {
        SnsMethodCalculate.markStartTimeMs("createPlayer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        Context context = getContext();
        C87412m.m108594g(context, "context");
        C21147f fVar = new C21147f(context);
        fVar.setPlayerOptionalParam(new TPOptionalParam().buildLong(203, 1));
        fVar.setPlayerOptionalParam(new TPOptionalParam().buildQueueInt(204, new int[]{102}));
        fVar.f59795j = new C106143c(fVar);
        C115669n.INSTANCE.mo175911u(1913, 2);
        fVar.setOnErrorListener(new C106144d());
        fVar.setOnCompletionListener(new C106146e());
        fVar.setOnVideoSizeChangedListener(new C106147f(this));
        fVar.setOnInfoListener(new C106148g(this));
        fVar.setOutputMute(true);
        fVar.setLoopback(this.f316174i);
        SnsMethodCalculate.markEndTimeMs("createPlayer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        return fVar;
    }

    /* renamed from: c */
    public void mo151882c() {
        SnsMethodCalculate.markStartTimeMs("onOpenGLComponentsInit", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        C111836h.m152498e("AdAlphaPlayerView", "onOpenGLComponentsInit");
        C60698b player = getPlayer();
        if (player == null) {
            SnsMethodCalculate.markEndTimeMs("onOpenGLComponentsInit", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            return;
        }
        SnsMethodCalculate.markStartTimeMs("initSurface", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        try {
            C111835g gVar = this.f316169d;
            gVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getVideoTexture", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
            SurfaceTexture surfaceTexture = gVar.f334869x;
            SnsMethodCalculate.markEndTimeMs("getVideoTexture", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
            player.setSurface(new Surface(surfaceTexture));
            player.setOnPreparedListener(new C111833e(this, player));
            player.prepareAsync();
        } catch (Throwable th) {
            C111837i.m152499a().mo163553b(new C111830b(this));
            C111836h.m152496c("AdAlphaPlayerView", "start the video failed!", th);
        }
        SnsMethodCalculate.markEndTimeMs("initSurface", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        C111834f fVar = this.f316172g;
        if (fVar != null) {
            fVar.mo137533e();
        }
        ((C119157j) C119157j.f356862d).mo183895z(new a$$a(this, player));
        SnsMethodCalculate.markEndTimeMs("onOpenGLComponentsInit", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    /* renamed from: d */
    public void mo151883d() {
        SnsMethodCalculate.markStartTimeMs("prepare", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        C111836h.m152498e("AdAlphaPlayerView", "prepare");
        C111834f fVar = this.f316172g;
        if (fVar != null) {
            fVar.mo137531c(2);
        }
        SnsMethodCalculate.markStartTimeMs("createSurface", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        TextureView textureView = new TextureView(getContext());
        textureView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        textureView.setOpaque(false);
        SnsMethodCalculate.markEndTimeMs("createSurface", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        this.f316171f = textureView;
        SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        Log.m105918d("AdAlphaPlayerView", "prepare() called " + surfaceTexture);
        this.f316171f.setSurfaceTextureListener(new C106150i());
        addView(this.f316171f, 0);
        SnsMethodCalculate.markEndTimeMs("prepare", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    /* renamed from: e */
    public void mo151884e() {
        SnsMethodCalculate.markStartTimeMs("resume", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        C111836h.m152498e("AdAlphaPlayerView", "resumeAd");
        this.f316177o = true;
        C111834f fVar = this.f316172g;
        if (fVar != null) {
            fVar.mo137531c(2);
        }
        try {
            C60698b bVar = this.f316170e;
            if (bVar != null) {
                ((C21147f) bVar).start();
            }
            C111835g gVar = this.f316169d;
            if (gVar != null) {
                gVar.mo151905e();
            }
        } catch (Throwable th) {
            C111836h.m152496c("AdAlphaPlayerView", "resume failed", th);
        }
        SnsMethodCalculate.markEndTimeMs("resume", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    /* renamed from: f */
    public final void mo151885f() {
        SnsMethodCalculate.markStartTimeMs("safeReleasePlayer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        C111837i.m152499a().mo163553b(new C106141a());
        C111835g gVar = this.f316169d;
        if (gVar != null) {
            gVar.mo151904d();
        }
        if (this.f316170e != null) {
            ((C119157j) C119157j.f356862d).mo183875f(new C106142b());
        }
        SnsMethodCalculate.markEndTimeMs("safeReleasePlayer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    /* renamed from: g */
    public void mo151886g() {
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        C111834f fVar = this.f316172g;
        if (fVar != null) {
            fVar.mo137531c(4);
        }
        try {
            mo151885f();
        } catch (Throwable th) {
            C111836h.m152497d("AdAlphaPlayerView", th);
        }
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public C58097y0<Boolean> getOnFrameRenderedFlow() {
        SnsMethodCalculate.markStartTimeMs("getOnFrameRenderedFlow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        C111835g gVar = this.f316169d;
        if (gVar != null) {
            gVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getOnFrameRenderedFlow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
            C58085t0<Boolean> t0Var = gVar.f334859C;
            SnsMethodCalculate.markEndTimeMs("getOnFrameRenderedFlow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
            SnsMethodCalculate.markEndTimeMs("getOnFrameRenderedFlow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            return t0Var;
        }
        SnsMethodCalculate.markEndTimeMs("getOnFrameRenderedFlow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        return null;
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        C111836h.m152498e("AdAlphaPlayerView", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        C111836h.m152498e("AdAlphaPlayerView", "onSizeChanged w:" + i + " h:" + i2);
        super.onSizeChanged(i, i2, i3, i4);
        C111835g gVar = this.f316169d;
        if (gVar != null) {
            gVar.getClass();
            SnsMethodCalculate.markStartTimeMs(V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurfaceSize, "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
            gVar.f316195i = i;
            gVar.f316196j = i2;
            SnsMethodCalculate.markEndTimeMs(V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurfaceSize, "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        }
        SnsMethodCalculate.markEndTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public void setOnPrepared(C86165a<Void> aVar) {
        SnsMethodCalculate.markStartTimeMs("setOnPrepared", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        this.f316178p = aVar;
        SnsMethodCalculate.markEndTimeMs("setOnPrepared", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public void setPrepared(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setPrepared", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        this.f316176n = z;
        SnsMethodCalculate.markEndTimeMs("setPrepared", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public AdAlphaPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
