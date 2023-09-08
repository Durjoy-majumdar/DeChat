package com.tencent.p014mm.plugin.thumbplayer.view;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import c03.C92332a;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C106595z1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader;
import di3.C86312j;
import f03.C97782d;
import f03.C97787h;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import j03.C21147f;
import j03.C60698b;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import l03.C21387c;
import m03.C21476q;
import m03.C99783d;
import o40.C61926c;
import p206nj.C11171e;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0005VWXYZB'\b\u0007\u0012\u0006\u0010P\u001a\u00020O\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010Q\u0012\b\b\u0002\u0010S\u001a\u00020\u001e¢\u0006\u0004\bT\u0010UJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0016J\u0006\u0010\u0016\u001a\u00020\u0015J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J\u0012\u0010\u001d\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0016J\u0012\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0004H\u0016J\u0010\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0004H\u0016J\b\u0010(\u001a\u00020\u0015H\u0016J\b\u0010*\u001a\u00020)H\u0016J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0004H\u0016J\u0010\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0004H\u0016R$\u00106\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R.\u0010?\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u0001078\u0006@FX\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010G\u001a\u00020@2\u0006\u00108\u001a\u00020@8\u0016@VX\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010N\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006["}, mo182094d2 = {"Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerVideoView;", "Lcom/tencent/mm/plugin/thumbplayer/view/MMTextureView;", "Lcom/tencent/mm/pluginsdk/ui/tools/r0;", "Lm03/d;", "", "autoFixRotation", "Lrx3/b0;", "setAutoFixRotation", "Lcom/tencent/mm/pluginsdk/ui/tools/r0$e;", "callback", "setOneTimeVideoTextureUpdateCallback", "Lcom/tencent/mm/pluginsdk/ui/tools/r0$c;", "setOnSeekCompleteCallback", "Lcom/tencent/mm/pluginsdk/ui/tools/r0$b;", "setOnInfoCallback", "Lcom/tencent/mm/pluginsdk/ui/tools/r0$d;", "setOnSurfaceCallback", "", "path", "setVideoPath", "getVideoPath", "", "getPlayerBufferedDurationMs", "Lf03/h;", "downloader", "setResourceDownloader", "loop", "setLoop", "Lcom/tencent/mm/pluginsdk/ui/tools/r0$a;", "setVideoCallback", "", "getCurrentPosition", "getDuration", "Landroid/graphics/Bitmap;", "bmp", "setThumb", "forceScale", "setForceScaleFullScreen", "isTrue", "setPlayProgressCallback", "getLastSurfaceUpdateTime", "", "getLastProgresstime", "mute", "setMute", "enableDolby", "setDolbyEnable", "Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerVideoView$b;", "D", "Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerVideoView$b;", "getLoopStartCallback", "()Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerVideoView$b;", "setLoopStartCallback", "(Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerVideoView$b;)V", "loopStartCallback", "Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerVideoView$c;", "value", "F", "Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerVideoView$c;", "getProgressListener", "()Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerVideoView$c;", "setProgressListener", "(Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerVideoView$c;)V", "progressListener", "Lcom/tencent/mm/pluginsdk/ui/a$e;", "G", "Lcom/tencent/mm/pluginsdk/ui/a$e;", "getScaleType", "()Lcom/tencent/mm/pluginsdk/ui/a$e;", "setScaleType", "(Lcom/tencent/mm/pluginsdk/ui/a$e;)V", "scaleType", "I", "Z", "g", "()Z", "setOnlineVideo", "(Z)V", "isOnlineVideo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "d", "e", "plugin-thumbplayer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView */
public final class ThumbPlayerVideoView extends MMTextureView implements C96875r0, C99783d {

    /* renamed from: K */
    public static final /* synthetic */ int f54433K = 0;

    /* renamed from: A */
    public boolean f54434A;

    /* renamed from: B */
    public boolean f54435B;

    /* renamed from: C */
    public int f54436C;

    /* renamed from: D */
    public C19318b f54437D;

    /* renamed from: E */
    public C53973z1 f54438E;

    /* renamed from: F */
    public C19319c f54439F;

    /* renamed from: G */
    public C96814a.C96817e f54440G;

    /* renamed from: H */
    public final CopyOnWriteArrayList<C21387c> f54441H;

    /* renamed from: I */
    public boolean f54442I;

    /* renamed from: J */
    public C97782d f54443J;

    /* renamed from: h */
    public final String f54444h;

    /* renamed from: i */
    public C60698b f54445i;

    /* renamed from: j */
    public String f54446j;

    /* renamed from: n */
    public boolean f54447n;

    /* renamed from: o */
    public Double f54448o;

    /* renamed from: p */
    public final C19303d f54449p;

    /* renamed from: q */
    public final C19302a f54450q;

    /* renamed from: r */
    public final C19311e f54451r;

    /* renamed from: s */
    public boolean f54452s;

    /* renamed from: t */
    public long f54453t;

    /* renamed from: u */
    public int f54454u;

    /* renamed from: v */
    public C106595z1 f54455v;

    /* renamed from: w */
    public int f54456w;

    /* renamed from: x */
    public int f54457x;

    /* renamed from: y */
    public Runnable f54458y;

    /* renamed from: z */
    public boolean f54459z;

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$a */
    public static final class C19302a {

        /* renamed from: a */
        public C96875r0.C19571b f54460a;

        /* renamed from: b */
        public C96875r0.C96879e f54461b;

        /* renamed from: c */
        public C32224a<C13598b0> f54462c;

        /* renamed from: d */
        public C96875r0.C96876a f54463d;

        /* renamed from: e */
        public C96875r0.C96877c f54464e;
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$d */
    public final class C19303d implements ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnErrorListener, ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnSeekCompleteListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnVideoSizeChangedListener {

        /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$d$a */
        public static final class C19304a extends C87413o implements C32226l<C21387c, C13598b0> {

            /* renamed from: d */
            public static final C19304a f54466d = new C19304a();

            public C19304a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C21387c cVar = (C21387c) obj;
                C87412m.m108594g(cVar, "$this$report");
                cVar.mo33480a();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$d$b */
        public static final class C19305b extends C87413o implements C32226l<C21387c, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f54467d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19305b(int i) {
                super(1);
                this.f54467d = i;
            }

            public Object invoke(Object obj) {
                C21387c cVar = (C21387c) obj;
                C87412m.m108594g(cVar, "$this$report");
                cVar.mo33481d(this.f54467d);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$d$c */
        public static final class C19306c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ThumbPlayerVideoView f54468d;

            public C19306c(ThumbPlayerVideoView thumbPlayerVideoView) {
                this.f54468d = thumbPlayerVideoView;
            }

            public final void run() {
                ThumbPlayerVideoView thumbPlayerVideoView = this.f54468d;
                thumbPlayerVideoView.f54458y = null;
                C96875r0.C19571b bVar = thumbPlayerVideoView.f54450q.f54460a;
                if (bVar != null) {
                    bVar.mo25380j(701, 0);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$d$d */
        public static final class C19307d extends C87413o implements C32226l<C21387c, C13598b0> {

            /* renamed from: d */
            public static final C19307d f54469d = new C19307d();

            public C19307d() {
                super(1);
            }

            public Object invoke(Object obj) {
                C21387c cVar = (C21387c) obj;
                C87412m.m108594g(cVar, "$this$report");
                cVar.mo33486n();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$d$e */
        public static final class C19308e extends C87413o implements C32226l<C21387c, C13598b0> {

            /* renamed from: d */
            public static final C19308e f54470d = new C19308e();

            public C19308e() {
                super(1);
            }

            public Object invoke(Object obj) {
                C21387c cVar = (C21387c) obj;
                C87412m.m108594g(cVar, "$this$report");
                cVar.mo33483f();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$d$f */
        public static final class C19309f extends C87413o implements C32226l<C21387c, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f54471d;

            /* renamed from: e */
            public final /* synthetic */ long f54472e;

            /* renamed from: f */
            public final /* synthetic */ long f54473f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19309f(int i, long j, long j2) {
                super(1);
                this.f54471d = i;
                this.f54472e = j;
                this.f54473f = j2;
            }

            public Object invoke(Object obj) {
                C21387c cVar = (C21387c) obj;
                C87412m.m108594g(cVar, "$this$report");
                cVar.mo33485k(this.f54471d, this.f54472e, this.f54473f);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$d$g */
        public static final class C19310g extends C87413o implements C32226l<C21387c, C13598b0> {

            /* renamed from: d */
            public static final C19310g f54474d = new C19310g();

            public C19310g() {
                super(1);
            }

            public Object invoke(Object obj) {
                C21387c cVar = (C21387c) obj;
                C87412m.m108594g(cVar, "$this$report");
                cVar.mo33492w();
                return C13598b0.f38549a;
            }
        }

        public C19303d() {
        }

        public void onCompletion(ITPPlayer iTPPlayer) {
            C87412m.m108594g(iTPPlayer, "player");
            Log.m105924i(ThumbPlayerVideoView.this.f54444h, "onCompletion");
            ThumbPlayerVideoView.this.mo24879r();
            ThumbPlayerVideoView.this.mo24875o(C19304a.f54466d);
            C96875r0.C96876a aVar = ThumbPlayerVideoView.this.f54450q.f54463d;
            if (aVar != null) {
                aVar.onCompletion();
            }
        }

        public void onError(ITPPlayer iTPPlayer, int i, int i2, long j, long j2) {
            String str = ThumbPlayerVideoView.this.f54444h;
            Log.m105920e(str, "onError: type=" + i + ", code=" + i2 + ", " + j + ", " + j2);
            ThumbPlayerVideoView.this.mo24875o(new C19305b(i2));
            ThumbPlayerVideoView.this.mo24874n();
            C96875r0.C96876a aVar = ThumbPlayerVideoView.this.f54450q.f54463d;
            if (aVar != null) {
                aVar.onError(i2, i);
            }
        }

        public void onInfo(ITPPlayer iTPPlayer, int i, long j, long j2, Object obj) {
            if (i == 3) {
                C96875r0.C19571b bVar = ThumbPlayerVideoView.this.f54450q.f54460a;
                if (bVar != null) {
                    bVar.mo25380j(3, 0);
                }
            } else if (i == 150) {
                Log.m105924i(ThumbPlayerVideoView.this.f54444h, "loop start");
                C19318b loopStartCallback = ThumbPlayerVideoView.this.getLoopStartCallback();
                if (loopStartCallback != null) {
                    loopStartCallback.mo24888a();
                }
            } else if (i == 1006) {
                Log.m105924i(ThumbPlayerVideoView.this.f54444h, "download progress updated");
            } else if (i == 1014) {
                Log.m105924i(ThumbPlayerVideoView.this.f54444h, "player stopped");
            } else if (i != 105) {
                boolean z = true;
                if (i == 106) {
                    Log.m105924i(ThumbPlayerVideoView.this.f54444h, "first video frame rendered");
                    ThumbPlayerVideoView thumbPlayerVideoView = ThumbPlayerVideoView.this;
                    C96875r0.C96879e eVar = thumbPlayerVideoView.f54450q.f54461b;
                    if (eVar != null) {
                        Log.m105924i(thumbPlayerVideoView.f54444h, "notify onTextureUpdate");
                        eVar.mo79636r();
                        thumbPlayerVideoView.f54450q.f54461b = null;
                    }
                    if (!thumbPlayerVideoView.f54452s) {
                        thumbPlayerVideoView.f54452s = true;
                        thumbPlayerVideoView.mo24875o(C21476q.f60807d);
                    }
                    thumbPlayerVideoView.mo24878q();
                } else if (i == 200) {
                    long milliSecondsToNow = Util.milliSecondsToNow(ThumbPlayerVideoView.this.f54453t);
                    if (milliSecondsToNow > 300) {
                        z = false;
                    }
                    String str = ThumbPlayerVideoView.this.f54444h;
                    Log.m105918d(str, "buffering start: shouldDebounce=" + z);
                    if (z) {
                        ThumbPlayerVideoView thumbPlayerVideoView2 = ThumbPlayerVideoView.this;
                        C19306c cVar = new C19306c(thumbPlayerVideoView2);
                        thumbPlayerVideoView2.f54458y = cVar;
                        thumbPlayerVideoView2.postDelayed(cVar, 300 - milliSecondsToNow);
                    } else {
                        C96875r0.C19571b bVar2 = ThumbPlayerVideoView.this.f54450q.f54460a;
                        if (bVar2 != null) {
                            bVar2.mo25380j(701, 0);
                        }
                    }
                    ThumbPlayerVideoView.this.mo24875o(C19307d.f54469d);
                } else if (i != 201) {
                    String str2 = ThumbPlayerVideoView.this.f54444h;
                    Log.m105924i(str2, "unhandled event: what=" + i + ", (" + j + ", " + j2 + ')');
                } else {
                    String str3 = ThumbPlayerVideoView.this.f54444h;
                    Log.m105918d(str3, "buffering end, delayBufferingAction=" + ThumbPlayerVideoView.this.f54458y);
                    ThumbPlayerVideoView thumbPlayerVideoView3 = ThumbPlayerVideoView.this;
                    Runnable runnable = thumbPlayerVideoView3.f54458y;
                    if (runnable != null) {
                        thumbPlayerVideoView3.removeCallbacks(runnable);
                        ThumbPlayerVideoView.this.f54458y = null;
                    } else {
                        C96875r0.C19571b bVar3 = thumbPlayerVideoView3.f54450q.f54460a;
                        if (bVar3 != null) {
                            bVar3.mo25380j(702, 0);
                        }
                    }
                    ThumbPlayerVideoView.this.mo24875o(C19308e.f54470d);
                }
            } else {
                Log.m105924i(ThumbPlayerVideoView.this.f54444h, "first audio frame rendered");
            }
            ThumbPlayerVideoView thumbPlayerVideoView4 = ThumbPlayerVideoView.this;
            C19309f fVar = new C19309f(i, j, j2);
            int i2 = ThumbPlayerVideoView.f54433K;
            thumbPlayerVideoView4.mo24875o(fVar);
        }

        public void onPrepared(ITPPlayer iTPPlayer) {
            Log.m105924i(ThumbPlayerVideoView.this.f54444h, "onPrepared");
            if (iTPPlayer != null) {
                Long valueOf = Long.valueOf(iTPPlayer.getPropertyLong(205));
                ThumbPlayerVideoView.this.f54436C = (int) valueOf.longValue();
            }
            Surface surface = ThumbPlayerVideoView.this.f54451r.f54476e;
            if (!(surface == null || iTPPlayer == null)) {
                iTPPlayer.setSurface(surface, 1);
            }
            C96875r0.C96876a aVar = ThumbPlayerVideoView.this.f54450q.f54463d;
            if (aVar != null) {
                aVar.onPrepared();
            }
        }

        public void onSeekComplete(ITPPlayer iTPPlayer) {
            String str = ThumbPlayerVideoView.this.f54444h;
            Log.m105924i(str, "onSeekComplete: shouldPlay=" + ThumbPlayerVideoView.this.f54447n + ", isPlaying=" + ThumbPlayerVideoView.this.isPlaying());
            ThumbPlayerVideoView thumbPlayerVideoView = ThumbPlayerVideoView.this;
            if (thumbPlayerVideoView.f54447n) {
                thumbPlayerVideoView.start();
            }
            ThumbPlayerVideoView.this.mo24875o(C19310g.f54474d);
            ThumbPlayerVideoView thumbPlayerVideoView2 = ThumbPlayerVideoView.this;
            C96875r0.C96877c cVar = thumbPlayerVideoView2.f54450q.f54464e;
            if (cVar != null) {
                cVar.mo86881z(thumbPlayerVideoView2.f54447n);
            }
            ThumbPlayerVideoView.this.f54447n = false;
        }

        public void onStateChange(int i, int i2) {
            String str = ThumbPlayerVideoView.this.f54444h;
            Log.m105924i(str, "preState=" + i + ", curState=" + i2);
            ThumbPlayerVideoView.this.f54454u = i2;
        }

        public void onVideoSizeChanged(ITPPlayer iTPPlayer, long j, long j2) {
            String str = ThumbPlayerVideoView.this.f54444h;
            Log.m105924i(str, "onVideoSizeChanged: " + j + " x " + j2);
            ThumbPlayerVideoView thumbPlayerVideoView = ThumbPlayerVideoView.this;
            int i = (int) j;
            int i2 = (int) j2;
            String str2 = thumbPlayerVideoView.f54444h;
            Log.m105924i(str2, "setVideoSize: videoWidth=" + thumbPlayerVideoView.f54457x + ", videoHeight=" + thumbPlayerVideoView.f54456w + ", width=" + i + ", height=" + i2);
            if (!(thumbPlayerVideoView.f54457x == i && thumbPlayerVideoView.f54456w == i2)) {
                thumbPlayerVideoView.f54457x = i;
                thumbPlayerVideoView.f54456w = i2;
                thumbPlayerVideoView.mo24877p();
                thumbPlayerVideoView.requestLayout();
            }
            C96875r0.C96876a aVar = ThumbPlayerVideoView.this.f54450q.f54463d;
            if (aVar != null) {
                aVar.mo76226p3(i, i2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$e */
    public final class C19311e implements TextureView.SurfaceTextureListener {

        /* renamed from: d */
        public long f54475d = -1;

        /* renamed from: e */
        public Surface f54476e;

        public C19311e() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            String str = ThumbPlayerVideoView.this.f54444h;
            Log.m105924i(str, "onSurfaceTextureAvailable： " + surfaceTexture + '(' + i + " x " + i2 + ')');
            Surface surface = this.f54476e;
            if (surface != null) {
                Log.m105928w(ThumbPlayerVideoView.this.f54444h, "surface is already valid");
                return;
            }
            if (surface != null) {
                surface.release();
            }
            Surface surface2 = new Surface(surfaceTexture);
            this.f54476e = surface2;
            C60698b bVar = ThumbPlayerVideoView.this.f54445i;
            if (bVar != null) {
                bVar.setSurface(surface2, 1);
            }
            ThumbPlayerVideoView thumbPlayerVideoView = ThumbPlayerVideoView.this;
            thumbPlayerVideoView.f54452s = false;
            thumbPlayerVideoView.mo24877p();
            ThumbPlayerVideoView thumbPlayerVideoView2 = ThumbPlayerVideoView.this;
            Double d = thumbPlayerVideoView2.f54448o;
            if (d != null) {
                thumbPlayerVideoView2.mo24787a(d.doubleValue(), thumbPlayerVideoView2.f54447n);
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            Log.m105928w(ThumbPlayerVideoView.this.f54444h, "onSurfaceTextureDestroyed");
            Surface surface = this.f54476e;
            if (surface != null) {
                surface.release();
            }
            this.f54476e = null;
            ThumbPlayerVideoView.this.f54452s = false;
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            String str = ThumbPlayerVideoView.this.f54444h;
            Log.m105924i(str, "onSurfaceTextureSizeChanged: " + i + " x " + i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            this.f54475d = surfaceTexture.getTimestamp();
            ThumbPlayerVideoView thumbPlayerVideoView = ThumbPlayerVideoView.this;
            C32224a<C13598b0> aVar = thumbPlayerVideoView.f54450q.f54462c;
            if (aVar != null) {
                aVar.invoke();
                thumbPlayerVideoView.f54450q.f54462c = null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$f */
    public static final class C19312f extends C87413o implements C32226l<C21387c, C13598b0> {

        /* renamed from: d */
        public static final C19312f f54478d = new C19312f();

        public C19312f() {
            super(1);
        }

        public Object invoke(Object obj) {
            C21387c cVar = (C21387c) obj;
            C87412m.m108594g(cVar, "$this$report");
            cVar.onPause();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$g */
    public static final class C19313g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60698b f54479d;

        /* renamed from: e */
        public final /* synthetic */ ThumbPlayerVideoView f54480e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19313g(C60698b bVar, ThumbPlayerVideoView thumbPlayerVideoView) {
            super(0);
            this.f54479d = bVar;
            this.f54480e = thumbPlayerVideoView;
        }

        public Object invoke() {
            this.f54479d.release();
            Log.m105924i(this.f54480e.f54444h, "Player instance has been released");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$i */
    public static final class C19314i extends C87413o implements C32226l<C21387c, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ThumbPlayerVideoView f54481d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19314i(ThumbPlayerVideoView thumbPlayerVideoView) {
            super(1);
            this.f54481d = thumbPlayerVideoView;
        }

        public Object invoke(Object obj) {
            C21387c cVar = (C21387c) obj;
            C87412m.m108594g(cVar, "$this$report");
            cVar.mo33490q(true, this.f54481d.f54446j);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$j */
    public static final class C19315j extends C87413o implements C32226l<C21387c, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f54482d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19315j(String str) {
            super(1);
            this.f54482d = str;
        }

        public Object invoke(Object obj) {
            C21387c cVar = (C21387c) obj;
            C87412m.m108594g(cVar, "$this$report");
            cVar.mo33490q(false, this.f54482d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$k */
    public static final class C19316k extends C87413o implements C32226l<C21387c, C13598b0> {

        /* renamed from: d */
        public static final C19316k f54483d = new C19316k();

        public C19316k() {
            super(1);
        }

        public Object invoke(Object obj) {
            C21387c cVar = (C21387c) obj;
            C87412m.m108594g(cVar, "$this$report");
            cVar.onStart();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$m */
    public static final class C19317m extends C87413o implements C32226l<C21387c, C13598b0> {

        /* renamed from: d */
        public static final C19317m f54484d = new C19317m();

        public C19317m() {
            super(1);
        }

        public Object invoke(Object obj) {
            C21387c cVar = (C21387c) obj;
            C87412m.m108594g(cVar, "$this$report");
            cVar.onStop();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$b */
    public interface C19318b {
        /* renamed from: a */
        void mo24888a();
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$c */
    public interface C19319c {
        /* renamed from: b */
        void mo24889b(long j);
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$h */
    public static final class C19320h extends C87413o implements C32226l<C21387c, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f54485d;

        /* renamed from: e */
        public final /* synthetic */ double f54486e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19320h(int i, double d) {
            super(1);
            this.f54485d = i;
            this.f54486e = d;
        }

        public Object invoke(Object obj) {
            C21387c cVar = (C21387c) obj;
            C87412m.m108594g(cVar, "$this$report");
            cVar.mo33482e(this.f54485d, (int) this.f54486e);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$startProgress$1", mo125469f = "ThumbPlayerVideoView.kt", mo125470l = {379}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$l */
    public static final class C19321l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f54487d;

        /* renamed from: e */
        public final /* synthetic */ ThumbPlayerVideoView f54488e;

        /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$l$a */
        public static final class C19322a extends C87413o implements C32226l<C21387c, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ long f54489d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19322a(long j) {
                super(1);
                this.f54489d = j;
            }

            public Object invoke(Object obj) {
                C21387c cVar = (C21387c) obj;
                C87412m.m108594g(cVar, "$this$report");
                cVar.mo33491v((int) this.f54489d);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19321l(ThumbPlayerVideoView thumbPlayerVideoView, C15601d<? super C19321l> dVar) {
            super(2, dVar);
            this.f54488e = thumbPlayerVideoView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C19321l(this.f54488e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C19321l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r6.f54487d
                r2 = 1
                if (r1 == 0) goto L_0x0016
                if (r1 != r2) goto L_0x000e
                kotlin.ResultKt.throwOnFailure(r7)
                r7 = r6
                goto L_0x0025
            L_0x000e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0016:
                kotlin.ResultKt.throwOnFailure(r7)
                r7 = r6
            L_0x001a:
                r3 = 500(0x1f4, double:2.47E-321)
                r7.f54487d = r2
                java.lang.Object r1 = a14.C53965x0.m60607b(r3, r7)
                if (r1 != r0) goto L_0x0025
                return r0
            L_0x0025:
                com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView r1 = r7.f54488e
                j03.b r1 = r1.f54445i
                if (r1 == 0) goto L_0x0047
                j03.f r1 = (j03.C21147f) r1
                long r3 = r1.getCurrentPositionMs()
                com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView r1 = r7.f54488e
                com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$c r1 = r1.getProgressListener()
                if (r1 == 0) goto L_0x003c
                r1.mo24889b(r3)
            L_0x003c:
                com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView r1 = r7.f54488e
                com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$l$a r5 = new com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView$l$a
                r5.<init>(r3)
                r1.mo24875o(r5)
                goto L_0x001a
            L_0x0047:
                rx3.b0 r7 = rx3.C13598b0.f38549a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerVideoView.C19321l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ThumbPlayerVideoView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (C8480h) null);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ThumbPlayerVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C8480h) null);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThumbPlayerVideoView(Context context, AttributeSet attributeSet, int i, int i2, C8480h hVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private static /* synthetic */ void getState$annotations() {
    }

    /* renamed from: a */
    public void mo24787a(double d, boolean z) {
        String str = this.f54444h;
        Log.m105924i(str, "seekTo: time=" + d + ", afterSeekPlay=" + z + ", isPrepared=" + mo24843h());
        this.f54447n = z;
        if (this.f54451r.f54476e == null) {
            this.f54448o = Double.valueOf(d);
            Log.m105928w(this.f54444h, "surface is not ready, post execute seek operation");
            return;
        }
        this.f54448o = null;
        this.f54453t = Util.nowMilliSecond();
        int currentPosition = getCurrentPosition();
        C60698b bVar = this.f54445i;
        if (bVar != null) {
            bVar.seekTo((int) d, z ? 3 : 1);
        }
        mo24875o(new C19320h(currentPosition, d));
    }

    /* renamed from: c */
    public void mo24836c(C21387c cVar) {
        C87412m.m108594g(cVar, "reporter");
        this.f54441H.addIfAbsent(cVar);
    }

    /* renamed from: d */
    public void mo24788d(double d) {
        mo24787a(d, false);
    }

    /* renamed from: e */
    public boolean mo24789e(Context context, boolean z) {
        start();
        return true;
    }

    /* renamed from: g */
    public boolean mo24838g() {
        return this.f54442I;
    }

    public int getCurrentPosition() {
        C60698b bVar = this.f54445i;
        if (bVar != null) {
            return (int) bVar.getCurrentPositionMs();
        }
        return 0;
    }

    public int getDuration() {
        C60698b bVar = this.f54445i;
        if (bVar != null) {
            return (int) bVar.getDurationMs();
        }
        return 0;
    }

    public double getLastProgresstime() {
        return 0.0d;
    }

    public long getLastSurfaceUpdateTime() {
        return this.f54451r.f54475d;
    }

    public final C19318b getLoopStartCallback() {
        return this.f54437D;
    }

    public final long getPlayerBufferedDurationMs() {
        C60698b bVar = this.f54445i;
        if (bVar != null) {
            return bVar.getPlayerBufferedDurationMs();
        }
        return 0;
    }

    public final C19319c getProgressListener() {
        return this.f54439F;
    }

    public C96814a.C96817e getScaleType() {
        return this.f54440G;
    }

    public String getVideoPath() {
        return this.f54446j;
    }

    /* renamed from: h */
    public boolean mo24843h() {
        int i = this.f54454u;
        return i == 4 || i == 5 || i == 6;
    }

    public boolean isInitialized() {
        return this.f54445i != null;
    }

    public boolean isMuted() {
        return this.f54459z;
    }

    public boolean isPlaying() {
        return this.f54454u == 5;
    }

    /* renamed from: j */
    public void mo24847j() {
        this.f54441H.clear();
    }

    /* renamed from: m */
    public final C60698b mo24873m() {
        Class cls = C32735h.class;
        boolean z = false;
        if (this.f54445i == null) {
            ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_disable_tp_free_run, false);
            Context applicationContext = getContext().getApplicationContext();
            C87412m.m108593f(applicationContext, "context.applicationContext");
            C21147f fVar = new C21147f(applicationContext);
            C19303d dVar = this.f54449p;
            fVar.f59795j = dVar;
            fVar.setOnErrorListener(dVar);
            fVar.setOnPreparedListener(this.f54449p);
            fVar.setOnCompletionListener(this.f54449p);
            fVar.setOnVideoSizeChangedListener(this.f54449p);
            fVar.setOnSeekCompleteListener(this.f54449p);
            fVar.setOnInfoListener(this.f54449p);
            fVar.setOutputMute(this.f54459z);
            fVar.setLoopback(this.f54434A);
            if (C11171e.m11045b(32) && ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_video_android_t_use_sharpen, 1) == 1) {
                z = true;
            }
            if (z) {
                fVar.setPlayerOptionalParam(new TPOptionalParam().buildInt(451, 1));
                fVar.setPlayerOptionalParam(new TPOptionalParam().buildString(452, "assets/shaders"));
            }
            fVar.setPlayerOptionalParam(new TPOptionalParam().buildBoolean(147, C92332a.f264189c));
            fVar.setPlayerOptionalParam(new TPOptionalParam().buildLong(102, C92332a.f264190d));
            fVar.setPlayerOptionalParam(new TPOptionalParam().buildLong(148, C92332a.f264191e));
            String str = this.f54444h;
            Log.m105924i(str, "created a new player instance: " + fVar);
            return fVar;
        }
        throw new IllegalStateException("Previous player instance hasn't been released".toString());
    }

    /* renamed from: n */
    public final void mo24874n() {
        Log.m105924i(this.f54444h, "release");
        C60698b bVar = this.f54445i;
        if (bVar != null) {
            Runnable runnable = this.f54458y;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f54458y = null;
            }
            this.f54452s = false;
            this.f54445i = null;
            setOnlineVideo(false);
            this.f54454u = 11;
            mo24879r();
            mo24847j();
            C61926c.m72661F(this.f54444h + "_release", new C19313g(bVar, this));
        }
    }

    /* renamed from: o */
    public final void mo24875o(C32226l<? super C21387c, C13598b0> lVar) {
        Iterator<T> it = this.f54441H.iterator();
        while (it.hasNext()) {
            lVar.invoke(it.next());
        }
    }

    public void onDetach() {
        Log.m105924i(this.f54444h, "onDetach()");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0083, code lost:
        if (r6 == false) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.f54457x
            r1 = 1
            if (r0 == 0) goto L_0x00af
            int r0 = r7.f54456w
            if (r0 != 0) goto L_0x000b
            goto L_0x00af
        L_0x000b:
            int r8 = android.view.View.getDefaultSize(r1, r8)
            int r9 = android.view.View.getDefaultSize(r1, r9)
            int r0 = r7.f54457x
            int r2 = r7.f54456w
            com.tencent.mm.pluginsdk.ui.tools.z1 r3 = r7.f54455v
            r3.mo153321a(r8, r9, r0, r2)
            com.tencent.mm.pluginsdk.ui.tools.z1 r0 = r7.f54455v
            int r2 = r0.f318524g
            int r0 = r0.f318525h
            boolean r3 = r7.f54435B
            if (r3 == 0) goto L_0x00ab
            android.util.Size r3 = new android.util.Size
            r3.<init>(r2, r0)
            int r4 = r7.f54436C
            r5 = 90
            if (r4 == r5) goto L_0x0035
            r5 = 270(0x10e, float:3.78E-43)
            if (r4 != r5) goto L_0x009f
        L_0x0035:
            float r0 = (float) r0
            float r2 = (float) r2
            float r3 = r0 / r2
            if (r8 <= r9) goto L_0x0047
            android.util.Size r8 = new android.util.Size
            float r0 = r0 * r3
            int r9 = (int) r0
            float r2 = r2 * r3
            int r0 = (int) r2
            r8.<init>(r9, r0)
            goto L_0x0050
        L_0x0047:
            android.util.Size r8 = new android.util.Size
            float r0 = r0 / r3
            int r9 = (int) r0
            float r2 = r2 / r3
            int r0 = (int) r2
            r8.<init>(r9, r0)
        L_0x0050:
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            android.graphics.Matrix r0 = r7.getMatrix()
            r9.set(r0)
            int r0 = r8.getWidth()
            float r0 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            int r4 = r8.getHeight()
            float r4 = (float) r4
            float r4 = r4 / r2
            float r2 = r7.getScaleX()
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0077
            r2 = 1
            goto L_0x0078
        L_0x0077:
            r2 = 0
        L_0x0078:
            if (r2 == 0) goto L_0x0085
            float r2 = r7.getScaleY()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0083
            r6 = 1
        L_0x0083:
            if (r6 != 0) goto L_0x0090
        L_0x0085:
            float r2 = r7.getScaleX()
            float r5 = r7.getScaleY()
            r9.setScale(r2, r5, r0, r4)
        L_0x0090:
            int r2 = r7.f54436C
            float r2 = (float) r2
            r9.postRotate(r2, r0, r4)
            float r1 = (float) r1
            float r1 = r1 / r3
            r9.postScale(r3, r1, r0, r4)
            r7.setTransform(r9)
            r3 = r8
        L_0x009f:
            int r8 = r3.getWidth()
            int r9 = r3.getHeight()
            r7.setMeasuredDimension(r8, r9)
            goto L_0x00ae
        L_0x00ab:
            r7.setMeasuredDimension(r2, r0)
        L_0x00ae:
            return
        L_0x00af:
            r7.setMeasuredDimension(r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerVideoView.onMeasure(int, int):void");
    }

    /* renamed from: p */
    public final void mo24877p() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                if (Build.VERSION.SDK_INT < 23 || ((RelativeLayout.LayoutParams) layoutParams).getRule(13) != -1) {
                    ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
                } else {
                    return;
                }
            } else if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
            } else if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
            } else {
                return;
            }
            requestLayout();
        }
    }

    public void pause() {
        String str = this.f54444h;
        Log.m105924i(str, "pause(): player=" + this.f54445i);
        C60698b bVar = this.f54445i;
        if (bVar != null) {
            this.f54447n = false;
            if (bVar != null) {
                bVar.pause();
            }
            this.f54454u = 6;
            mo24875o(C19312f.f54478d);
            mo24879r();
        }
    }

    public void prepare() {
        String str = this.f54444h;
        Log.m105924i(str, "prepare(): videoPath=" + this.f54446j);
        C60698b bVar = this.f54445i;
        if (bVar != null) {
            bVar.prepareAsync();
        }
    }

    /* renamed from: q */
    public final void mo24878q() {
        C53973z1 z1Var = this.f54438E;
        boolean z = false;
        if (z1Var != null && z1Var.mo74466a()) {
            z = true;
        }
        String str = this.f54444h;
        Log.m105924i(str, "startProgress: isActive=" + z);
        if (!z) {
            C53973z1 z1Var2 = this.f54438E;
            if (z1Var2 != null) {
                C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
            }
            C0001s1 s1Var = C0001s1.f0d;
            C53896h0 h0Var = C53872d1.f151117a;
            this.f54438E = C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C19321l(this, (C15601d<? super C19321l>) null), 2, (Object) null);
        }
    }

    /* renamed from: r */
    public final void mo24879r() {
        Log.m105924i(this.f54444h, "stopProgress");
        C53973z1 z1Var = this.f54438E;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f54438E = null;
    }

    public void setAutoFixRotation(boolean z) {
        this.f54435B = z;
    }

    public void setDolbyEnable(boolean z) {
    }

    public void setForceScaleFullScreen(boolean z) {
        this.f54455v.f318518a = z;
        requestLayout();
    }

    public void setLoop(boolean z) {
        String str = this.f54444h;
        Log.m105924i(str, "setLoop(" + z + ')');
        this.f54434A = z;
        C60698b bVar = this.f54445i;
        if (bVar != null) {
            bVar.setLoopback(z);
        }
    }

    public final void setLoopStartCallback(C19318b bVar) {
        this.f54437D = bVar;
    }

    public void setMute(boolean z) {
        String str = this.f54444h;
        Log.m105924i(str, "setMute(" + z + ')');
        this.f54459z = z;
        C60698b bVar = this.f54445i;
        if (bVar != null) {
            bVar.setOutputMute(z);
        }
    }

    public void setOnInfoCallback(C96875r0.C19571b bVar) {
        this.f54450q.f54460a = bVar;
    }

    public void setOnSeekCompleteCallback(C96875r0.C96877c cVar) {
        this.f54450q.f54464e = cVar;
    }

    public void setOnSurfaceCallback(C96875r0.C96878d dVar) {
        if (dVar != null) {
            Surface surface = this.f54451r.f54476e;
            boolean z = true;
            if (surface == null || !surface.isValid()) {
                z = false;
            }
            if (z) {
                dVar.mo127239k();
            }
        }
        this.f54450q.getClass();
    }

    public void setOneTimeVideoTextureUpdateCallback(C96875r0.C96879e eVar) {
        this.f54452s = false;
        this.f54450q.f54461b = eVar;
    }

    public void setOnlineVideo(boolean z) {
        this.f54442I = z;
    }

    public void setPlayProgressCallback(boolean z) {
    }

    public final void setProgressListener(C19319c cVar) {
        this.f54439F = cVar;
        if (cVar == null) {
            mo24879r();
        }
    }

    public void setResourceDownloader(C97787h hVar) {
        C87412m.m108594g(hVar, "downloader");
        setOnlineVideo(true);
        this.f54446j = null;
        if (this.f54445i == null) {
            this.f54445i = mo24873m();
        }
        String str = this.f54444h;
        Log.m105924i(str, "setResourceDownloader: downloader=" + hVar);
        C60698b bVar = this.f54445i;
        if (bVar != null) {
            this.f54446j = hVar.mo134538j();
            bVar.setVideoInfo(new TPVideoInfo.Builder().fileId(hVar.getMediaId()).downloadParam(new TPDownloadParamData(11)).build());
            C97782d dVar = new C97782d(hVar);
            this.f54443J = dVar;
            bVar.enableTPAssetResourceLoader(dVar);
            String mediaId = hVar.getMediaId();
            C87412m.m108591d(mediaId);
            bVar.mo33105a(mediaId);
            bVar.setDataSource("http://127.0.0.1:1234/mock_url");
            this.f54454u = 3;
            mo24875o(new C19314i(this));
        }
    }

    public void setScaleType(C96814a.C96817e eVar) {
        C87412m.m108594g(eVar, "value");
        this.f54440G = eVar;
        if (this.f54455v.mo153324d(eVar)) {
            requestLayout();
        }
    }

    public void setThumb(Bitmap bitmap) {
        Log.m105928w(this.f54444h, "setThumb but not support");
    }

    public void setVideoCallback(C96875r0.C96876a aVar) {
        this.f54450q.f54463d = aVar;
    }

    public void setVideoPath(String str) {
        String str2 = this.f54444h;
        Log.m105924i(str2, "setVideoPath: " + str);
        this.f54446j = str;
        setOnlineVideo(false);
        if (str == null) {
            Log.m105928w(this.f54444h, "null video path");
            return;
        }
        if (this.f54445i == null) {
            this.f54445i = mo24873m();
        }
        C60698b bVar = this.f54445i;
        if (bVar != null) {
            bVar.setDataSource(C86013q1.m106448i(str, false));
            bVar.enableTPAssetResourceLoader((ITPAssetResourceLoader) null);
            bVar.prepareAsync();
            this.f54454u = 3;
            mo24875o(new C19315j(str));
        }
    }

    public boolean start() {
        String str = this.f54444h;
        Log.m105924i(str, "start(), videPath=" + this.f54446j);
        C60698b bVar = this.f54445i;
        if (bVar != null) {
            ((C21147f) bVar).start();
        }
        C60698b bVar2 = this.f54445i;
        if (bVar2 != null) {
            ((C21147f) bVar2).resumeDownload();
        }
        mo24875o(C19316k.f54483d);
        mo24878q();
        return true;
    }

    public void stop() {
        Log.m105924i(this.f54444h, "stop()");
        this.f54454u = 8;
        C60698b bVar = this.f54445i;
        if (bVar != null) {
            bVar.stop();
        }
        C60698b bVar2 = this.f54445i;
        if (bVar2 != null) {
            bVar2.reset();
        }
        this.f54455v.mo153323c();
        mo24875o(C19317m.f54484d);
        mo24874n();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThumbPlayerVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f54444h = "MicroMsg.ThumbPlayerVideoView@" + hashCode();
        this.f54449p = new C19303d();
        this.f54450q = new C19302a();
        C19311e eVar = new C19311e();
        this.f54451r = eVar;
        this.f54454u = 1;
        this.f54455v = new C106595z1();
        this.f54440G = C96814a.C96817e.DEFAULT;
        this.f54441H = new CopyOnWriteArrayList<>();
        setOpaque(true);
        setSurfaceTextureListener(eVar);
    }
}
