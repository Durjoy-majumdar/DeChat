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
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.thumbplayer.render.MMSurfaceViewRender;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C106595z1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
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
import k03.C60931a;
import k03.C60934c;
import kotlin.Metadata;
import l03.C21387c;
import m03.C21475p;
import m03.C99783d;
import o40.C61926c;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0005UVWXYB'\b\u0007\u0012\u0006\u0010O\u001a\u00020N\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010P\u0012\b\b\u0002\u0010R\u001a\u00020\u0004¢\u0006\u0004\bS\u0010TJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0011\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0013\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\bH\u0016J\u0012\u0010 \u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\u0012\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\bH\u0016J\u0010\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\bH\u0016J\b\u0010+\u001a\u00020*H\u0016J\b\u0010-\u001a\u00020,H\u0016J\u0010\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\bH\u0016R*\u00108\u001a\u0002002\u0006\u00101\u001a\u0002008\u0016@VX\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010?\u001a\u00020\b8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR.\u0010H\u001a\u0004\u0018\u00010G2\b\u00101\u001a\u0004\u0018\u00010G8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006Z"}, mo182094d2 = {"Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerSurfaceView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/pluginsdk/ui/tools/r0;", "Lm03/d;", "", "visibility", "Lrx3/b0;", "setVisibility", "", "autoFixRotation", "setAutoFixRotation", "Lcom/tencent/mm/pluginsdk/ui/tools/r0$e;", "callback", "setOneTimeVideoTextureUpdateCallback", "Lcom/tencent/mm/pluginsdk/ui/tools/r0$c;", "setOnSeekCompleteCallback", "Lcom/tencent/mm/pluginsdk/ui/tools/r0$b;", "setOnInfoCallback", "Lcom/tencent/mm/pluginsdk/ui/tools/r0$d;", "setOnSurfaceCallback", "", "path", "setVideoPath", "getVideoPath", "Lf03/h;", "downloader", "setResourceDownloader", "enableDolby", "setDolbyEnable", "loop", "setLoop", "Lcom/tencent/mm/pluginsdk/ui/tools/r0$a;", "setVideoCallback", "getCurrentPosition", "getDuration", "Landroid/graphics/Bitmap;", "bmp", "setThumb", "forceScale", "setForceScaleFullScreen", "isTrue", "setPlayProgressCallback", "", "getLastSurfaceUpdateTime", "", "getLastProgresstime", "mute", "setMute", "Lcom/tencent/mm/pluginsdk/ui/a$e;", "value", "B", "Lcom/tencent/mm/pluginsdk/ui/a$e;", "getScaleType", "()Lcom/tencent/mm/pluginsdk/ui/a$e;", "setScaleType", "(Lcom/tencent/mm/pluginsdk/ui/a$e;)V", "scaleType", "D", "Z", "g", "()Z", "setOnlineVideo", "(Z)V", "isOnlineVideo", "Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerSurfaceView$b;", "loopStartCallback", "Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerSurfaceView$b;", "getLoopStartCallback", "()Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerSurfaceView$b;", "setLoopStartCallback", "(Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerSurfaceView$b;)V", "Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerSurfaceView$c;", "progressListener", "Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerSurfaceView$c;", "getProgressListener", "()Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerSurfaceView$c;", "setProgressListener", "(Lcom/tencent/mm/plugin/thumbplayer/view/ThumbPlayerSurfaceView$c;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "d", "e", "plugin-thumbplayer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView */
public final class ThumbPlayerSurfaceView extends FrameLayout implements C96875r0, C99783d {

    /* renamed from: E */
    public static final /* synthetic */ int f54377E = 0;

    /* renamed from: A */
    public C53973z1 f54378A;

    /* renamed from: B */
    public C96814a.C96817e f54379B;

    /* renamed from: C */
    public final CopyOnWriteArrayList<C21387c> f54380C;

    /* renamed from: D */
    public boolean f54381D;

    /* renamed from: d */
    public final String f54382d;

    /* renamed from: e */
    public C60698b f54383e;

    /* renamed from: f */
    public String f54384f;

    /* renamed from: g */
    public boolean f54385g;

    /* renamed from: h */
    public Double f54386h;

    /* renamed from: i */
    public final C19281d f54387i;

    /* renamed from: j */
    public final C19279a f54388j;

    /* renamed from: n */
    public final C19290e f54389n;

    /* renamed from: o */
    public boolean f54390o;

    /* renamed from: p */
    public long f54391p;

    /* renamed from: q */
    public final C60934c f54392q;

    /* renamed from: r */
    public final MMSurfaceViewRender f54393r;

    /* renamed from: s */
    public int f54394s;

    /* renamed from: t */
    public C106595z1 f54395t;

    /* renamed from: u */
    public int f54396u;

    /* renamed from: v */
    public int f54397v;

    /* renamed from: w */
    public Runnable f54398w;

    /* renamed from: x */
    public boolean f54399x;

    /* renamed from: y */
    public boolean f54400y;

    /* renamed from: z */
    public Bitmap f54401z;

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$a */
    public static final class C19279a {

        /* renamed from: a */
        public C96875r0.C19571b f54402a;

        /* renamed from: b */
        public C96875r0.C96879e f54403b;

        /* renamed from: c */
        public C96875r0.C96876a f54404c;

        /* renamed from: d */
        public C96875r0.C96877c f54405d;
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$b */
    public interface C19280b {
        /* renamed from: a */
        void mo24861a();
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$d */
    public final class C19281d implements ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnErrorListener, ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnSeekCompleteListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnVideoSizeChangedListener {

        /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$d$a */
        public static final class C19282a extends C87413o implements C32226l<C21387c, C13598b0> {

            /* renamed from: d */
            public static final C19282a f54407d = new C19282a();

            public C19282a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C21387c cVar = (C21387c) obj;
                C87412m.m108594g(cVar, "$this$report");
                cVar.mo33480a();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$d$b */
        public static final class C19283b extends C87413o implements C32226l<C21387c, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f54408d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19283b(int i) {
                super(1);
                this.f54408d = i;
            }

            public Object invoke(Object obj) {
                C21387c cVar = (C21387c) obj;
                C87412m.m108594g(cVar, "$this$report");
                cVar.mo33481d(this.f54408d);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$d$c */
        public static final class C19284c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ThumbPlayerSurfaceView f54409d;

            public C19284c(ThumbPlayerSurfaceView thumbPlayerSurfaceView) {
                this.f54409d = thumbPlayerSurfaceView;
            }

            public final void run() {
                ThumbPlayerSurfaceView thumbPlayerSurfaceView = this.f54409d;
                thumbPlayerSurfaceView.f54398w = null;
                C96875r0.C19571b bVar = thumbPlayerSurfaceView.f54388j.f54402a;
                if (bVar != null) {
                    bVar.mo25380j(701, 0);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$d$d */
        public static final class C19285d extends C87413o implements C32226l<C21387c, C13598b0> {

            /* renamed from: d */
            public static final C19285d f54410d = new C19285d();

            public C19285d() {
                super(1);
            }

            public Object invoke(Object obj) {
                C21387c cVar = (C21387c) obj;
                C87412m.m108594g(cVar, "$this$report");
                cVar.mo33486n();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$d$e */
        public static final class C19286e extends C87413o implements C32226l<C21387c, C13598b0> {

            /* renamed from: d */
            public static final C19286e f54411d = new C19286e();

            public C19286e() {
                super(1);
            }

            public Object invoke(Object obj) {
                C21387c cVar = (C21387c) obj;
                C87412m.m108594g(cVar, "$this$report");
                cVar.mo33483f();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$d$f */
        public static final class C19287f implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ThumbPlayerSurfaceView f54412d;

            public C19287f(ThumbPlayerSurfaceView thumbPlayerSurfaceView) {
                this.f54412d = thumbPlayerSurfaceView;
            }

            public final void run() {
                Log.m105924i(this.f54412d.f54382d, "first video frame rendered new");
                this.f54412d.f54392q.mo85887c();
            }
        }

        /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$d$g */
        public static final class C19288g extends C87413o implements C32226l<C21387c, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f54413d;

            /* renamed from: e */
            public final /* synthetic */ long f54414e;

            /* renamed from: f */
            public final /* synthetic */ long f54415f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19288g(int i, long j, long j2) {
                super(1);
                this.f54413d = i;
                this.f54414e = j;
                this.f54415f = j2;
            }

            public Object invoke(Object obj) {
                C21387c cVar = (C21387c) obj;
                C87412m.m108594g(cVar, "$this$report");
                cVar.mo33485k(this.f54413d, this.f54414e, this.f54415f);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$d$h */
        public static final class C19289h extends C87413o implements C32226l<C21387c, C13598b0> {

            /* renamed from: d */
            public static final C19289h f54416d = new C19289h();

            public C19289h() {
                super(1);
            }

            public Object invoke(Object obj) {
                C21387c cVar = (C21387c) obj;
                C87412m.m108594g(cVar, "$this$report");
                cVar.mo33492w();
                return C13598b0.f38549a;
            }
        }

        public C19281d() {
        }

        public void onCompletion(ITPPlayer iTPPlayer) {
            C87412m.m108594g(iTPPlayer, "player");
            Log.m105924i(ThumbPlayerSurfaceView.this.f54382d, "onCompletion");
            ThumbPlayerSurfaceView.this.mo24850m();
            ThumbPlayerSurfaceView.this.mo24844i(C19282a.f54407d);
            C96875r0.C96876a aVar = ThumbPlayerSurfaceView.this.f54388j.f54404c;
            if (aVar != null) {
                aVar.onCompletion();
            }
        }

        public void onError(ITPPlayer iTPPlayer, int i, int i2, long j, long j2) {
            String str = ThumbPlayerSurfaceView.this.f54382d;
            Log.m105920e(str, "onError: type=" + i + ", code=" + i2 + ", " + j + ", " + j2);
            ThumbPlayerSurfaceView.this.mo24844i(new C19283b(i2));
            ThumbPlayerSurfaceView.this.mo24837f();
            C96875r0.C96876a aVar = ThumbPlayerSurfaceView.this.f54388j.f54404c;
            if (aVar != null) {
                aVar.onError(i2, i);
            }
        }

        public void onInfo(ITPPlayer iTPPlayer, int i, long j, long j2, Object obj) {
            if (i == 3) {
                C96875r0.C19571b bVar = ThumbPlayerSurfaceView.this.f54388j.f54402a;
                if (bVar != null) {
                    bVar.mo25380j(3, 0);
                }
            } else if (i == 108) {
                ThumbPlayerSurfaceView thumbPlayerSurfaceView = ThumbPlayerSurfaceView.this;
                thumbPlayerSurfaceView.post(new C19287f(thumbPlayerSurfaceView));
            } else if (i == 150) {
                Log.m105924i(ThumbPlayerSurfaceView.this.f54382d, "loop start");
                C19280b loopStartCallback = ThumbPlayerSurfaceView.this.getLoopStartCallback();
                if (loopStartCallback != null) {
                    loopStartCallback.mo24861a();
                }
            } else if (i == 1006) {
                Log.m105924i(ThumbPlayerSurfaceView.this.f54382d, "download progress updated");
            } else if (i == 1014) {
                Log.m105924i(ThumbPlayerSurfaceView.this.f54382d, "player stopped");
            } else if (i != 105) {
                boolean z = true;
                if (i == 106) {
                    Log.m105924i(ThumbPlayerSurfaceView.this.f54382d, "first video frame rendered");
                    ThumbPlayerSurfaceView thumbPlayerSurfaceView2 = ThumbPlayerSurfaceView.this;
                    C96875r0.C96879e eVar = thumbPlayerSurfaceView2.f54388j.f54403b;
                    if (eVar != null) {
                        Log.m105924i(thumbPlayerSurfaceView2.f54382d, "notify onTextureUpdate");
                        eVar.mo79636r();
                        thumbPlayerSurfaceView2.f54388j.f54403b = null;
                    }
                    if (!thumbPlayerSurfaceView2.f54390o) {
                        thumbPlayerSurfaceView2.f54390o = true;
                        thumbPlayerSurfaceView2.mo24844i(C21475p.f60806d);
                    }
                    thumbPlayerSurfaceView2.mo24849l();
                } else if (i == 200) {
                    long milliSecondsToNow = Util.milliSecondsToNow(ThumbPlayerSurfaceView.this.f54391p);
                    if (milliSecondsToNow > 300) {
                        z = false;
                    }
                    String str = ThumbPlayerSurfaceView.this.f54382d;
                    Log.m105918d(str, "buffering start: shouldDebounce=" + z);
                    if (z) {
                        ThumbPlayerSurfaceView thumbPlayerSurfaceView3 = ThumbPlayerSurfaceView.this;
                        C19284c cVar = new C19284c(thumbPlayerSurfaceView3);
                        thumbPlayerSurfaceView3.f54398w = cVar;
                        thumbPlayerSurfaceView3.postDelayed(cVar, 300 - milliSecondsToNow);
                    } else {
                        C96875r0.C19571b bVar2 = ThumbPlayerSurfaceView.this.f54388j.f54402a;
                        if (bVar2 != null) {
                            bVar2.mo25380j(701, 0);
                        }
                    }
                    ThumbPlayerSurfaceView.this.mo24844i(C19285d.f54410d);
                } else if (i != 201) {
                    String str2 = ThumbPlayerSurfaceView.this.f54382d;
                    Log.m105924i(str2, "unhandled event: what=" + i + ", (" + j + ", " + j2 + ')');
                } else {
                    String str3 = ThumbPlayerSurfaceView.this.f54382d;
                    Log.m105918d(str3, "buffering end, delayBufferingAction=" + ThumbPlayerSurfaceView.this.f54398w);
                    ThumbPlayerSurfaceView thumbPlayerSurfaceView4 = ThumbPlayerSurfaceView.this;
                    Runnable runnable = thumbPlayerSurfaceView4.f54398w;
                    if (runnable != null) {
                        thumbPlayerSurfaceView4.removeCallbacks(runnable);
                        ThumbPlayerSurfaceView.this.f54398w = null;
                    } else {
                        C96875r0.C19571b bVar3 = thumbPlayerSurfaceView4.f54388j.f54402a;
                        if (bVar3 != null) {
                            bVar3.mo25380j(702, 0);
                        }
                    }
                    ThumbPlayerSurfaceView.this.mo24844i(C19286e.f54411d);
                }
            } else {
                Log.m105924i(ThumbPlayerSurfaceView.this.f54382d, "first audio frame rendered");
            }
            ThumbPlayerSurfaceView thumbPlayerSurfaceView5 = ThumbPlayerSurfaceView.this;
            C19288g gVar = new C19288g(i, j, j2);
            int i2 = ThumbPlayerSurfaceView.f54377E;
            thumbPlayerSurfaceView5.mo24844i(gVar);
        }

        public void onPrepared(ITPPlayer iTPPlayer) {
            Log.m105924i(ThumbPlayerSurfaceView.this.f54382d, "onPrepared");
            ThumbPlayerSurfaceView thumbPlayerSurfaceView = ThumbPlayerSurfaceView.this;
            C60934c cVar = thumbPlayerSurfaceView.f54392q;
            String str = thumbPlayerSurfaceView.f54382d;
            cVar.getClass();
            C87412m.m108594g(str, "logTag");
            cVar.f173561f = true;
            cVar.f173557b = str + ".MMSurfaceViewSwitchHelper";
            if (iTPPlayer != null) {
                Long valueOf = Long.valueOf(iTPPlayer.getPropertyLong(205));
                ThumbPlayerSurfaceView thumbPlayerSurfaceView2 = ThumbPlayerSurfaceView.this;
                valueOf.longValue();
                thumbPlayerSurfaceView2.getClass();
            }
            Surface surface = ThumbPlayerSurfaceView.this.f54389n.f54418e;
            if (!(surface == null || iTPPlayer == null)) {
                iTPPlayer.setSurface(surface, 2);
            }
            ThumbPlayerSurfaceView thumbPlayerSurfaceView3 = ThumbPlayerSurfaceView.this;
            thumbPlayerSurfaceView3.f54392q.mo85889e(thumbPlayerSurfaceView3.f54393r);
            C96875r0.C96876a aVar = ThumbPlayerSurfaceView.this.f54388j.f54404c;
            if (aVar != null) {
                aVar.onPrepared();
            }
        }

        public void onSeekComplete(ITPPlayer iTPPlayer) {
            String str = ThumbPlayerSurfaceView.this.f54382d;
            Log.m105924i(str, "onSeekComplete: shouldPlay=" + ThumbPlayerSurfaceView.this.f54385g + ", isPlaying=" + ThumbPlayerSurfaceView.this.isPlaying());
            ThumbPlayerSurfaceView thumbPlayerSurfaceView = ThumbPlayerSurfaceView.this;
            if (thumbPlayerSurfaceView.f54385g) {
                thumbPlayerSurfaceView.start();
            }
            ThumbPlayerSurfaceView.this.mo24844i(C19289h.f54416d);
            ThumbPlayerSurfaceView thumbPlayerSurfaceView2 = ThumbPlayerSurfaceView.this;
            C96875r0.C96877c cVar = thumbPlayerSurfaceView2.f54388j.f54405d;
            if (cVar != null) {
                cVar.mo86881z(thumbPlayerSurfaceView2.f54385g);
            }
            ThumbPlayerSurfaceView.this.f54385g = false;
        }

        public void onStateChange(int i, int i2) {
            String str = ThumbPlayerSurfaceView.this.f54382d;
            Log.m105924i(str, "preState=" + i + ", curState=" + i2);
            ThumbPlayerSurfaceView.this.f54394s = i2;
        }

        public void onVideoSizeChanged(ITPPlayer iTPPlayer, long j, long j2) {
            String str = ThumbPlayerSurfaceView.this.f54382d;
            Log.m105924i(str, "onVideoSizeChanged: " + j + " x " + j2);
            ThumbPlayerSurfaceView thumbPlayerSurfaceView = ThumbPlayerSurfaceView.this;
            int i = (int) j;
            int i2 = (int) j2;
            String str2 = thumbPlayerSurfaceView.f54382d;
            Log.m105924i(str2, "setVideoSize: videoWidth=" + thumbPlayerSurfaceView.f54397v + ", videoHeight=" + thumbPlayerSurfaceView.f54396u + ", width=" + i + ", height=" + i2);
            if (!(thumbPlayerSurfaceView.f54397v == i && thumbPlayerSurfaceView.f54396u == i2)) {
                thumbPlayerSurfaceView.f54397v = i;
                thumbPlayerSurfaceView.f54396u = i2;
                thumbPlayerSurfaceView.mo24848k();
                thumbPlayerSurfaceView.f54393r.mo81067b(thumbPlayerSurfaceView.f54397v, thumbPlayerSurfaceView.f54396u);
            }
            C96875r0.C96876a aVar = ThumbPlayerSurfaceView.this.f54388j.f54404c;
            if (aVar != null) {
                aVar.mo76226p3(i, i2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$e */
    public final class C19290e implements C60931a.C60932a {

        /* renamed from: d */
        public long f54417d = -1;

        /* renamed from: e */
        public Surface f54418e;

        public C19290e() {
        }

        /* renamed from: a */
        public void mo24864a(Object obj, int i, int i2) {
            C87412m.m108594g(obj, "surface");
            String str = ThumbPlayerSurfaceView.this.f54382d;
            Log.m105924i(str, "onSurfaceTextureSizeChanged: " + i + " x " + i2);
        }

        /* renamed from: b */
        public void mo24865b(Object obj) {
            C87412m.m108594g(obj, "surface");
            String str = ThumbPlayerSurfaceView.this.f54382d;
            Log.m105924i(str, "onSurfaceTextureAvailable： " + obj + '(' + ThumbPlayerSurfaceView.this.getWidth() + " x " + ThumbPlayerSurfaceView.this.getHeight() + ')');
            Surface surface = this.f54418e;
            if (surface != null || !(obj instanceof SurfaceHolder)) {
                Log.m105928w(ThumbPlayerSurfaceView.this.f54382d, "surface is already valid");
                return;
            }
            if (surface != null) {
                surface.release();
            }
            Surface surface2 = ((SurfaceHolder) obj).getSurface();
            this.f54418e = surface2;
            C60698b bVar = ThumbPlayerSurfaceView.this.f54383e;
            if (bVar != null) {
                bVar.setSurface(surface2, 2);
            }
            ThumbPlayerSurfaceView thumbPlayerSurfaceView = ThumbPlayerSurfaceView.this;
            thumbPlayerSurfaceView.f54390o = false;
            thumbPlayerSurfaceView.mo24848k();
            ThumbPlayerSurfaceView thumbPlayerSurfaceView2 = ThumbPlayerSurfaceView.this;
            Double d = thumbPlayerSurfaceView2.f54386h;
            if (d != null) {
                thumbPlayerSurfaceView2.mo24787a(d.doubleValue(), thumbPlayerSurfaceView2.f54385g);
            }
        }

        /* renamed from: c */
        public void mo24866c(Object obj) {
            C87412m.m108594g(obj, "surface");
            if (obj instanceof SurfaceHolder) {
                this.f54417d = System.currentTimeMillis();
            }
        }

        /* renamed from: d */
        public boolean mo24867d(Object obj) {
            C87412m.m108594g(obj, "surface");
            Log.m105928w(ThumbPlayerSurfaceView.this.f54382d, "onSurfaceTextureDestroyed");
            ThumbPlayerSurfaceView thumbPlayerSurfaceView = ThumbPlayerSurfaceView.this;
            int i = thumbPlayerSurfaceView.f54394s;
            if (!(i == 11 || i == 8 || i == 9)) {
                thumbPlayerSurfaceView.f54392q.mo85889e(thumbPlayerSurfaceView.f54393r);
            }
            C60698b bVar = ThumbPlayerSurfaceView.this.f54383e;
            if (bVar != null) {
                bVar.setSurface((Surface) null);
            }
            Surface surface = this.f54418e;
            if (surface != null) {
                surface.release();
            }
            this.f54418e = null;
            ThumbPlayerSurfaceView.this.f54390o = false;
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$f */
    public static final class C19291f extends C87413o implements C32226l<C21387c, C13598b0> {

        /* renamed from: d */
        public static final C19291f f54420d = new C19291f();

        public C19291f() {
            super(1);
        }

        public Object invoke(Object obj) {
            C21387c cVar = (C21387c) obj;
            C87412m.m108594g(cVar, "$this$report");
            cVar.onPause();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$g */
    public static final class C19292g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60698b f54421d;

        /* renamed from: e */
        public final /* synthetic */ ThumbPlayerSurfaceView f54422e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19292g(C60698b bVar, ThumbPlayerSurfaceView thumbPlayerSurfaceView) {
            super(0);
            this.f54421d = bVar;
            this.f54422e = thumbPlayerSurfaceView;
        }

        public Object invoke() {
            this.f54421d.release();
            Log.m105924i(this.f54422e.f54382d, "Player instance has been released");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$h */
    public static final class C19293h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ThumbPlayerSurfaceView f54423d;

        public C19293h(ThumbPlayerSurfaceView thumbPlayerSurfaceView) {
            this.f54423d = thumbPlayerSurfaceView;
        }

        public final void run() {
            this.f54423d.f54393r.setVisibility(8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$j */
    public static final class C19294j extends C87413o implements C32226l<C21387c, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ThumbPlayerSurfaceView f54424d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19294j(ThumbPlayerSurfaceView thumbPlayerSurfaceView) {
            super(1);
            this.f54424d = thumbPlayerSurfaceView;
        }

        public Object invoke(Object obj) {
            C21387c cVar = (C21387c) obj;
            C87412m.m108594g(cVar, "$this$report");
            cVar.mo33490q(true, this.f54424d.f54384f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$k */
    public static final class C19295k extends C87413o implements C32226l<C21387c, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f54425d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19295k(String str) {
            super(1);
            this.f54425d = str;
        }

        public Object invoke(Object obj) {
            C21387c cVar = (C21387c) obj;
            C87412m.m108594g(cVar, "$this$report");
            cVar.mo33490q(false, this.f54425d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$l */
    public static final class C19296l extends C87413o implements C32226l<C21387c, C13598b0> {

        /* renamed from: d */
        public static final C19296l f54426d = new C19296l();

        public C19296l() {
            super(1);
        }

        public Object invoke(Object obj) {
            C21387c cVar = (C21387c) obj;
            C87412m.m108594g(cVar, "$this$report");
            cVar.onStart();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$n */
    public static final class C19297n extends C87413o implements C32226l<C21387c, C13598b0> {

        /* renamed from: d */
        public static final C19297n f54427d = new C19297n();

        public C19297n() {
            super(1);
        }

        public Object invoke(Object obj) {
            C21387c cVar = (C21387c) obj;
            C87412m.m108594g(cVar, "$this$report");
            cVar.onStop();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$c */
    public interface C19298c {
        /* renamed from: b */
        void mo24869b(long j);
    }

    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$i */
    public static final class C19299i extends C87413o implements C32226l<C21387c, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f54428d;

        /* renamed from: e */
        public final /* synthetic */ double f54429e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19299i(int i, double d) {
            super(1);
            this.f54428d = i;
            this.f54429e = d;
        }

        public Object invoke(Object obj) {
            C21387c cVar = (C21387c) obj;
            C87412m.m108594g(cVar, "$this$report");
            cVar.mo33482e(this.f54428d, (int) this.f54429e);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$startProgress$1", mo125469f = "ThumbPlayerSurfaceView.kt", mo125470l = {308}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$m */
    public static final class C19300m extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f54430d;

        /* renamed from: e */
        public final /* synthetic */ ThumbPlayerSurfaceView f54431e;

        /* renamed from: com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$m$a */
        public static final class C19301a extends C87413o implements C32226l<C21387c, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ long f54432d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19301a(long j) {
                super(1);
                this.f54432d = j;
            }

            public Object invoke(Object obj) {
                C21387c cVar = (C21387c) obj;
                C87412m.m108594g(cVar, "$this$report");
                cVar.mo33491v((int) this.f54432d);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19300m(ThumbPlayerSurfaceView thumbPlayerSurfaceView, C15601d<? super C19300m> dVar) {
            super(2, dVar);
            this.f54431e = thumbPlayerSurfaceView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C19300m(this.f54431e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C19300m) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r6.f54430d
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
                r7.f54430d = r2
                java.lang.Object r1 = a14.C53965x0.m60607b(r3, r7)
                if (r1 != r0) goto L_0x0025
                return r0
            L_0x0025:
                com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView r1 = r7.f54431e
                j03.b r1 = r1.f54383e
                if (r1 == 0) goto L_0x0047
                j03.f r1 = (j03.C21147f) r1
                long r3 = r1.getCurrentPositionMs()
                com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView r1 = r7.f54431e
                com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$c r1 = r1.getProgressListener()
                if (r1 == 0) goto L_0x003c
                r1.mo24869b(r3)
            L_0x003c:
                com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView r1 = r7.f54431e
                com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$m$a r5 = new com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView$m$a
                r5.<init>(r3)
                r1.mo24844i(r5)
                goto L_0x001a
            L_0x0047:
                rx3.b0 r7 = rx3.C13598b0.f38549a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView.C19300m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ThumbPlayerSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C8480h) null);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThumbPlayerSurfaceView(Context context, AttributeSet attributeSet, int i, int i2, C8480h hVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private static /* synthetic */ void getState$annotations() {
    }

    /* renamed from: a */
    public void mo24787a(double d, boolean z) {
        String str = this.f54382d;
        Log.m105924i(str, "seekTo: time=" + d + ", afterSeekPlay=" + z + ", isPrepared=" + mo24843h());
        this.f54385g = z;
        if (this.f54389n.f54418e == null) {
            this.f54386h = Double.valueOf(d);
            Log.m105928w(this.f54382d, "surface is not ready, post execute seek operation");
            return;
        }
        this.f54386h = null;
        this.f54391p = Util.nowMilliSecond();
        int currentPosition = getCurrentPosition();
        C60698b bVar = this.f54383e;
        if (bVar != null) {
            bVar.seekTo((int) d, z ? 3 : 1);
        }
        mo24844i(new C19299i(currentPosition, d));
    }

    /* renamed from: b */
    public final C60698b mo24835b() {
        if (this.f54383e == null) {
            ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_disable_tp_free_run, false);
            Context applicationContext = getContext().getApplicationContext();
            C87412m.m108593f(applicationContext, "context.applicationContext");
            C21147f fVar = new C21147f(applicationContext);
            C19281d dVar = this.f54387i;
            fVar.f59795j = dVar;
            fVar.setOnErrorListener(dVar);
            fVar.setOnPreparedListener(this.f54387i);
            fVar.setOnCompletionListener(this.f54387i);
            fVar.setOnVideoSizeChangedListener(this.f54387i);
            fVar.setOnSeekCompleteListener(this.f54387i);
            fVar.setOnInfoListener(this.f54387i);
            fVar.setOutputMute(this.f54399x);
            fVar.setLoopback(this.f54400y);
            String str = this.f54382d;
            Log.m105924i(str, "created a new player instance: " + fVar);
            return fVar;
        }
        throw new IllegalStateException("Previous player instance hasn't been released".toString());
    }

    /* renamed from: c */
    public void mo24836c(C21387c cVar) {
        C87412m.m108594g(cVar, "reporter");
        this.f54380C.addIfAbsent(cVar);
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

    /* renamed from: f */
    public final void mo24837f() {
        Log.m105924i(this.f54382d, "release");
        C60698b bVar = this.f54383e;
        if (bVar != null) {
            Runnable runnable = this.f54398w;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f54398w = null;
            }
            this.f54390o = false;
            this.f54383e = null;
            this.f54384f = null;
            setOnlineVideo(false);
            this.f54394s = 11;
            mo24850m();
            this.f54392q.mo85886b();
            mo24847j();
            C61926c.m72661F(this.f54382d + "_release", new C19292g(bVar, this));
            post(new C19293h(this));
        }
    }

    /* renamed from: g */
    public boolean mo24838g() {
        return this.f54381D;
    }

    public int getCurrentPosition() {
        C60698b bVar = this.f54383e;
        if (bVar != null) {
            return (int) bVar.getCurrentPositionMs();
        }
        return 0;
    }

    public int getDuration() {
        C60698b bVar = this.f54383e;
        if (bVar != null) {
            return (int) bVar.getDurationMs();
        }
        return 0;
    }

    public double getLastProgresstime() {
        return 0.0d;
    }

    public long getLastSurfaceUpdateTime() {
        return this.f54389n.f54417d;
    }

    public final C19280b getLoopStartCallback() {
        return null;
    }

    public final C19298c getProgressListener() {
        return null;
    }

    public C96814a.C96817e getScaleType() {
        return this.f54379B;
    }

    public String getVideoPath() {
        return this.f54384f;
    }

    /* renamed from: h */
    public boolean mo24843h() {
        int i = this.f54394s;
        return i == 4 || i == 5 || i == 6;
    }

    /* renamed from: i */
    public final void mo24844i(C32226l<? super C21387c, C13598b0> lVar) {
        Iterator<T> it = this.f54380C.iterator();
        while (it.hasNext()) {
            lVar.invoke(it.next());
        }
    }

    public boolean isInitialized() {
        return this.f54383e != null;
    }

    public boolean isMuted() {
        return this.f54399x;
    }

    public boolean isPlaying() {
        return this.f54394s == 5;
    }

    /* renamed from: j */
    public void mo24847j() {
        this.f54380C.clear();
    }

    /* renamed from: k */
    public final void mo24848k() {
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

    /* renamed from: l */
    public final void mo24849l() {
        C53973z1 z1Var = this.f54378A;
        boolean z = false;
        if (z1Var != null && z1Var.mo74466a()) {
            z = true;
        }
        String str = this.f54382d;
        Log.m105924i(str, "startProgress: isActive=" + z);
        if (!z) {
            C53973z1 z1Var2 = this.f54378A;
            if (z1Var2 != null) {
                C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
            }
            C0001s1 s1Var = C0001s1.f0d;
            C53896h0 h0Var = C53872d1.f151117a;
            this.f54378A = C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C19300m(this, (C15601d<? super C19300m>) null), 2, (Object) null);
        }
    }

    /* renamed from: m */
    public final void mo24850m() {
        Log.m105924i(this.f54382d, "stopProgress");
        C53973z1 z1Var = this.f54378A;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f54378A = null;
    }

    public void onDetach() {
        Log.m105924i(this.f54382d, "onDetach()");
    }

    public void pause() {
        String str = this.f54382d;
        Log.m105924i(str, "pause(): player=" + this.f54383e);
        if (this.f54383e != null) {
            this.f54385g = false;
            this.f54392q.mo85885a(this.f54393r, this.f54389n.f54418e, this.f54401z);
            C60698b bVar = this.f54383e;
            if (bVar != null) {
                bVar.pause();
            }
            this.f54394s = 6;
            mo24844i(C19291f.f54420d);
            mo24850m();
        }
    }

    public void prepare() {
        String str = this.f54382d;
        Log.m105924i(str, "prepare(): videoPath=" + this.f54384f);
        C60698b bVar = this.f54383e;
        if (bVar != null) {
            bVar.prepareAsync();
        }
    }

    public void setAutoFixRotation(boolean z) {
    }

    public void setDolbyEnable(boolean z) {
    }

    public void setForceScaleFullScreen(boolean z) {
        this.f54395t.f318518a = z;
        requestLayout();
    }

    public void setLoop(boolean z) {
        String str = this.f54382d;
        Log.m105924i(str, "setLoop(" + z + ')');
        this.f54400y = z;
        C60698b bVar = this.f54383e;
        if (bVar != null) {
            bVar.setLoopback(z);
        }
    }

    public final void setLoopStartCallback(C19280b bVar) {
    }

    public void setMute(boolean z) {
        String str = this.f54382d;
        Log.m105924i(str, "setMute(" + z + ')');
        this.f54399x = z;
        C60698b bVar = this.f54383e;
        if (bVar != null) {
            bVar.setOutputMute(z);
        }
    }

    public void setOnInfoCallback(C96875r0.C19571b bVar) {
        this.f54388j.f54402a = bVar;
    }

    public void setOnSeekCompleteCallback(C96875r0.C96877c cVar) {
        this.f54388j.f54405d = cVar;
    }

    public void setOnSurfaceCallback(C96875r0.C96878d dVar) {
        if (dVar != null) {
            Surface surface = this.f54389n.f54418e;
            boolean z = true;
            if (surface == null || !surface.isValid()) {
                z = false;
            }
            if (z) {
                dVar.mo127239k();
            }
        }
        this.f54388j.getClass();
    }

    public void setOneTimeVideoTextureUpdateCallback(C96875r0.C96879e eVar) {
        this.f54390o = false;
        this.f54388j.f54403b = eVar;
    }

    public void setOnlineVideo(boolean z) {
        this.f54381D = z;
    }

    public void setPlayProgressCallback(boolean z) {
    }

    public final void setProgressListener(C19298c cVar) {
        if (cVar == null) {
            mo24850m();
        }
    }

    public void setResourceDownloader(C97787h hVar) {
        C87412m.m108594g(hVar, "downloader");
        setOnlineVideo(true);
        this.f54384f = null;
        if (this.f54383e == null) {
            this.f54383e = mo24835b();
        }
        String str = this.f54382d;
        Log.m105924i(str, "setResourceDownloader: downloader=" + hVar);
        C60698b bVar = this.f54383e;
        if (bVar != null) {
            this.f54384f = hVar.mo134538j();
            bVar.setVideoInfo(new TPVideoInfo.Builder().fileId(hVar.getMediaId()).downloadParam(new TPDownloadParamData(11)).build());
            bVar.enableTPAssetResourceLoader(new C97782d(hVar));
            String mediaId = hVar.getMediaId();
            C87412m.m108591d(mediaId);
            bVar.mo33105a(mediaId);
            bVar.setDataSource("http://127.0.0.1:1234/mock_url");
            this.f54394s = 3;
            mo24844i(new C19294j(this));
        }
    }

    public void setScaleType(C96814a.C96817e eVar) {
        C87412m.m108594g(eVar, "value");
        this.f54379B = eVar;
        if (this.f54395t.mo153324d(eVar)) {
            requestLayout();
        }
    }

    public void setThumb(Bitmap bitmap) {
        this.f54401z = bitmap;
        this.f54392q.mo85885a(this.f54393r, this.f54389n.f54418e, bitmap);
    }

    public void setVideoCallback(C96875r0.C96876a aVar) {
        this.f54388j.f54404c = aVar;
    }

    public void setVideoPath(String str) {
        String str2 = this.f54382d;
        Log.m105924i(str2, "setVideoPath: " + str);
        this.f54384f = str;
        setOnlineVideo(false);
        if (str == null) {
            Log.m105928w(this.f54382d, "null video path");
            return;
        }
        if (this.f54383e == null) {
            this.f54383e = mo24835b();
        }
        C60698b bVar = this.f54383e;
        if (bVar != null) {
            bVar.setDataSource(C86013q1.m106448i(str, false));
            bVar.enableTPAssetResourceLoader((ITPAssetResourceLoader) null);
            bVar.prepareAsync();
            this.f54394s = 3;
            mo24844i(new C19295k(str));
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f54393r.setVisibility(i);
    }

    public boolean start() {
        String str = this.f54382d;
        Log.m105924i(str, "start(), videPath=" + this.f54384f);
        this.f54393r.setVisibility(0);
        C60698b bVar = this.f54383e;
        if (bVar != null) {
            ((C21147f) bVar).start();
        }
        C60698b bVar2 = this.f54383e;
        if (bVar2 != null) {
            ((C21147f) bVar2).resumeDownload();
        }
        mo24844i(C19296l.f54426d);
        mo24849l();
        return true;
    }

    public void stop() {
        Log.m105924i(this.f54382d, "stop()");
        this.f54394s = 8;
        C60698b bVar = this.f54383e;
        if (bVar != null) {
            bVar.stop();
        }
        C60698b bVar2 = this.f54383e;
        if (bVar2 != null) {
            bVar2.reset();
        }
        this.f54395t.mo153323c();
        mo24844i(C19297n.f54427d);
        mo24837f();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThumbPlayerSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f54382d = "MicroMsg.ThumbPlayerSurfaceView@" + hashCode();
        this.f54387i = new C19281d();
        this.f54388j = new C19279a();
        C19290e eVar = new C19290e();
        this.f54389n = eVar;
        new Rect();
        C60934c cVar = new C60934c(this);
        this.f54392q = cVar;
        MMSurfaceViewRender mMSurfaceViewRender = new MMSurfaceViewRender(context);
        this.f54393r = mMSurfaceViewRender;
        this.f54394s = 1;
        this.f54395t = new C106595z1();
        this.f54379B = C96814a.C96817e.DEFAULT;
        this.f54380C = new CopyOnWriteArrayList<>();
        mMSurfaceViewRender.setSurfaceListener(eVar);
        mMSurfaceViewRender.setSurfaceViewSwitchHelper(cVar);
        mMSurfaceViewRender.setScaleType(1);
        addView(mMSurfaceViewRender, new FrameLayout.LayoutParams(-2, -2, 17));
    }
}
