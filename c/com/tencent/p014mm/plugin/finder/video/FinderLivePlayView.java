package com.tencent.p014mm.plugin.finder.video;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import ak1.C54101n0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bl3.C39818r;
import cj1.C54781k2;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.modelvideo.C55394a;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.ratio.RatioLayout;
import di3.C86312j;
import er1.C58739j4;
import f50.C58915a;
import f50.C58924d;
import fs3.C59314b;
import fs3.C59318d;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import g50.C59364c;
import gr1.C59661l0;
import gr1.C59662l2;
import gr1.C59665n0;
import gr1.C59668o0;
import gr1.C59673q2;
import gr1.C59674r2;
import gr1.C59684w2;
import gr1.C8405j2;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60155c3;
import ht1.C60157c5;
import ht1.C60200t1;
import ht1.C60211v2;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import l60.C99344b;
import lt1.C61401a;
import mr1.C61575s;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import p50.C47428d;
import p565ir.C60606n;
import pe3.C89349b;
import ph1.C62292g;
import ph1.C62294j;
import pl1.C100810g0;
import pl1.C11990s0;
import pl1.C11991t;
import pl1.C62367r0;
import pl1.C62369u0;
import qt1.C12931a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sg1.C63880b;
import sg1.C63888h;
import sk1.C63947a;
import te3.C64265bq2;
import te3.C64273c21;
import te3.C64293cq2;
import te3.C64321dp2;
import te3.C64689rq2;
import te3.C64890zp2;
import tf0.C13887q1;
import up1.C37521f;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0001B!\b\u0016\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001B*\b\u0016\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001\u0012\u0007\u0010\u0001\u001a\u00020\u0015¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\bH\u0016J\b\u0010\"\u001a\u00020\u0000H\u0016J\b\u0010#\u001a\u00020\bH\u0016J\b\u0010$\u001a\u00020\bH\u0016J\n\u0010&\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\bH\u0016J\u0010\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\bH\u0016J\u0010\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020\bH\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\bH\u0016J\u0010\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020\bH\u0016J\n\u00101\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u00103\u001a\u0004\u0018\u000102H\u0016J\u0010\u00106\u001a\u00020\n2\u0006\u00105\u001a\u000204H\u0016J\u0010\u00109\u001a\u00020\n2\u0006\u00108\u001a\u000207H\u0016J\u0010\u0010<\u001a\u00020\n2\u0006\u0010;\u001a\u00020:H\u0016J\u0010\u0010>\u001a\u00020\n2\u0006\u0010=\u001a\u00020\bH\u0016J\u0010\u0010@\u001a\u00020\n2\u0006\u0010?\u001a\u00020\bH\u0016J\u0012\u0010C\u001a\u00020\n2\b\u0010B\u001a\u0004\u0018\u00010AH\u0016J\u0010\u0010F\u001a\u00020\n2\u0006\u0010E\u001a\u00020DH\u0016J\u0012\u0010I\u001a\u00020\n2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016J\n\u0010K\u001a\u0004\u0018\u00010JH\u0016J\n\u0010M\u001a\u0004\u0018\u00010LH\u0016R$\u0010U\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010e\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010n\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010u\u001a\u00020\b8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\br\u0010m\u001a\u0004\bs\u0010o\"\u0004\bt\u0010qR\"\u0010v\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bs\u0010m\u001a\u0004\bv\u0010o\"\u0004\bw\u0010qR\u001b\u0010}\u001a\u00020x8BX\u0002¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u001b\u0010\u0001\u001a\u00020~8\u0006¢\u0006\u000f\n\u0005\b\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R&\u0010\u0001\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010m\u001a\u0005\b\u0001\u0010o\"\u0005\b\u0001\u0010qR&\u0010\u0001\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010m\u001a\u0005\b\u0001\u0010o\"\u0005\b\u0001\u0010qR&\u0010\u0001\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010m\u001a\u0005\b\u0001\u0010o\"\u0005\b\u0001\u0010qR&\u0010\u0001\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010m\u001a\u0005\b\u0001\u0010o\"\u0005\b\u0001\u0010q¨\u0006\u0001"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderLivePlayView;", "Lgr1/j2;", "Landroid/widget/FrameLayout;", "Lht1/c3;", "Lgr1/l2;", "Lfs3/d;", "", "getCoverUrl", "", "isLowDelayMode", "Lrx3/b0;", "setPlayerAudioJitterBufferConfig", "getEventDetector", "Lfs3/b;", "getEventDetectorAdapter", "isFull", "setFullScreenEnjoy", "Landroid/view/View;", "getRenderView", "", "getVideoRatio", "", "tag", "setContextTag", "getVideoAdapter", "name", "setContextSimpleName", "getContextTag", "getCurrentPlaySecond", "", "getCurrentPlayMs", "getVideoDuration", "getVideoDurationMs", "getVideoViewFocused", "getVideoView", "getIsShouldPlayResume", "getIsNeverStart", "Landroid/view/ViewParent;", "getParentView", "shouldPlayResume", "setIsShouldPlayResume", "focused", "setVideoViewFocused", "isPreview", "setPreview", "isInterceptDetach", "setInterceptDetach", "isMute", "setMute", "getVideoMediaId", "Lgr1/q2;", "getVideoMediaInfo", "Lht1/c5;", "_callback", "setIMMVideoViewCallback", "Lcom/tencent/mm/pluginsdk/ui/a$e;", "scaleType", "setScaleType", "Lcom/tencent/mm/modelvideo/a;", "_proxy", "setIOnlineVideoProxy", "isShow", "setIsShowBasicControls", "loop", "setLoop", "Lgr1/w2;", "lifecycle", "setVideoPlayLifecycle", "Lgr1/r2;", "muteListener", "setVideoMuteListener", "Lqt1/a;", "videoPlayTrace", "setFinderVideoPlayTrace", "", "getPlayer", "Landroid/graphics/Bitmap;", "getBitmap", "Lf50/d;", "d", "Lf50/d;", "getTxLivePlayer", "()Lf50/d;", "setTxLivePlayer", "(Lf50/d;)V", "txLivePlayer", "Lgr1/o0;", "e", "Lgr1/o0;", "getTextureView", "()Lgr1/o0;", "setTextureView", "(Lgr1/o0;)V", "textureView", "Lcom/tencent/mm/pluginsdk/ui/a$b;", "g", "Lcom/tencent/mm/pluginsdk/ui/a$b;", "getVideoViewCallback", "()Lcom/tencent/mm/pluginsdk/ui/a$b;", "setVideoViewCallback", "(Lcom/tencent/mm/pluginsdk/ui/a$b;)V", "videoViewCallback", "h", "Lgr1/w2;", "getLifecycle", "()Lgr1/w2;", "setLifecycle", "(Lgr1/w2;)V", "i", "Z", "isAutoJustRenderMode", "()Z", "setAutoJustRenderMode", "(Z)V", "w", "y", "setPreloadedView", "isPreloadedView", "isLiveFreeTimerInit", "setLiveFreeTimerInit", "Lsg1/h;", "z", "Lrx3/g;", "getLiveFreeTimeManager", "()Lsg1/h;", "liveFreeTimeManager", "Lf50/a;", "B", "Lf50/a;", "getPlayListener", "()Lf50/a;", "playListener", "C", "isViewFocused", "setViewFocused", "D", "isShouldPlayResume", "setShouldPlayResume", "E", "isNeverStart", "setNeverStart", "H", "isSupportPauseResume", "setSupportPauseResume", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderLivePlayView */
public final class FinderLivePlayView extends FrameLayout implements C8405j2, C60155c3, C59662l2, C59318d {

    /* renamed from: I */
    public static final /* synthetic */ int f161661I = 0;

    /* renamed from: A */
    public C47428d f161662A;

    /* renamed from: B */
    public final C58915a f161663B = new C56501e(this);

    /* renamed from: C */
    public boolean f161664C;

    /* renamed from: D */
    public boolean f161665D;

    /* renamed from: E */
    public volatile boolean f161666E = true;

    /* renamed from: F */
    public boolean f161667F;

    /* renamed from: G */
    public boolean f161668G;

    /* renamed from: H */
    public boolean f161669H;

    /* renamed from: d */
    public C58924d f161670d;

    /* renamed from: e */
    public C59668o0 f161671e;

    /* renamed from: f */
    public int f161672f;

    /* renamed from: g */
    public C96814a.C57541b f161673g;

    /* renamed from: h */
    public C59684w2 f161674h;

    /* renamed from: i */
    public boolean f161675i;

    /* renamed from: j */
    public C59673q2 f161676j;

    /* renamed from: n */
    public ImageView f161677n;

    /* renamed from: o */
    public RatioLayout f161678o;

    /* renamed from: p */
    public C60211v2 f161679p;

    /* renamed from: q */
    public int f161680q = -1;

    /* renamed from: r */
    public int f161681r = -1;

    /* renamed from: s */
    public int f161682s = -1;

    /* renamed from: t */
    public int f161683t;

    /* renamed from: u */
    public int f161684u;

    /* renamed from: v */
    public long f161685v;

    /* renamed from: w */
    public boolean f161686w;

    /* renamed from: x */
    public C0000n0 f161687x = C53930o0.m60555b();

    /* renamed from: y */
    public boolean f161688y;

    /* renamed from: z */
    public final C13601g f161689z = C36568h.m40985a(new C56500d(this));

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderLivePlayView$a */
    public final class C56497a implements C63880b {

        /* renamed from: a */
        public final WeakReference<FinderLivePlayView> f161690a;

        public C56497a(FinderLivePlayView finderLivePlayView, WeakReference<FinderLivePlayView> weakReference) {
            C87412m.m108594g(weakReference, "rFinderLivePlayView");
            this.f161690a = weakReference;
        }

        /* renamed from: a */
        public void mo79436a(C64321dp2 dp22) {
            C87412m.m108594g(dp22, "info");
            if (dp22.f182792e <= 0) {
                FinderLivePlayView finderLivePlayView = this.f161690a.get();
                if (finderLivePlayView != null) {
                    int i = FinderLivePlayView.f161661I;
                    finderLivePlayView.mo79403E(true);
                    return;
                }
                Log.m105924i("Finder.FinderLivePlayView", "timer finish bug reference is null!");
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.video.FinderLivePlayView$checkChargeLiveInvalid$1", mo125469f = "FinderLivePlayView.kt", mo125470l = {544}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.video.FinderLivePlayView$b */
    public static final class C56498b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f161691d;

        /* renamed from: e */
        public final /* synthetic */ C64273c21 f161692e;

        /* renamed from: f */
        public final /* synthetic */ FinderLivePlayView f161693f;

        /* renamed from: g */
        public final /* synthetic */ Long f161694g;

        /* renamed from: h */
        public final /* synthetic */ String f161695h;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.video.FinderLivePlayView$checkChargeLiveInvalid$1$invalid$1", mo125469f = "FinderLivePlayView.kt", mo125470l = {545}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.finder.video.FinderLivePlayView$b$a */
        public static final class C3907a extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

            /* renamed from: d */
            public int f17547d;

            /* renamed from: e */
            public final /* synthetic */ Long f17548e;

            /* renamed from: f */
            public final /* synthetic */ String f17549f;

            /* renamed from: g */
            public final /* synthetic */ C64273c21 f17550g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3907a(Long l, String str, C64273c21 c212, C15601d<? super C3907a> dVar) {
                super(2, dVar);
                this.f17548e = l;
                this.f17549f = str;
                this.f17550g = c212;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C3907a(this.f17548e, this.f17549f, this.f17550g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C3907a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f17547d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long longValue = this.f17548e.longValue();
                    String str = this.f17549f;
                    long j = this.f17550g.f182392d;
                    this.f17547d = 1;
                    obj = ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13359tY(longValue, str, j, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56498b(C64273c21 c212, FinderLivePlayView finderLivePlayView, Long l, String str, C15601d<? super C56498b> dVar) {
            super(2, dVar);
            this.f161692e = c212;
            this.f161693f = finderLivePlayView;
            this.f161694g = l;
            this.f161695h = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C56498b(this.f161692e, this.f161693f, this.f161694g, this.f161695h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C56498b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
            r8 = r8.f170496f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r7.f161691d
                r2 = 1
                if (r1 == 0) goto L_0x0015
                if (r1 != r2) goto L_0x000d
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x002f
            L_0x000d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0015:
                kotlin.ResultKt.throwOnFailure(r8)
                a14.h0 r8 = a14.C53872d1.f151119c
                com.tencent.mm.plugin.finder.video.FinderLivePlayView$b$a r1 = new com.tencent.mm.plugin.finder.video.FinderLivePlayView$b$a
                java.lang.Long r3 = r7.f161694g
                java.lang.String r4 = r7.f161695h
                te3.c21 r5 = r7.f161692e
                r6 = 0
                r1.<init>(r3, r4, r5, r6)
                r7.f161691d = r2
                java.lang.Object r8 = a14.C53895h.m60469g(r8, r1, r7)
                if (r8 != r0) goto L_0x002f
                return r0
            L_0x002f:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L_0x0098
                java.lang.Class<hr.t> r8 = p165hr.C60106t.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                hr.t r8 = (p165hr.C60106t) r8
                hg1.b r8 = r8.yx0()
                te3.c21 r0 = r7.f161692e
                long r0 = r0.f182392d
                r8.mo9438Ow(r0)
                java.lang.String r8 = "Finder.FinderLivePlayView"
                java.lang.String r0 = "charge live invalid!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r8 = r7.f161693f
                f50.d r8 = r8.getTxLivePlayer()
                r0 = 0
                if (r8 == 0) goto L_0x005d
                r8.stopPlay(r0)
            L_0x005d:
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r8 = r7.f161693f
                r8.mo79409K()
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r8 = r7.f161693f
                boolean r1 = r8.f161688y
                if (r1 == 0) goto L_0x0098
                sg1.h r8 = r8.getLiveFreeTimeManager()
                com.tencent.mm.sdk.platformtools.MTimerHandler r8 = r8.f181093g
                if (r8 == 0) goto L_0x0077
                boolean r8 = r8.stopped()
                if (r8 != 0) goto L_0x0077
                goto L_0x0078
            L_0x0077:
                r2 = 0
            L_0x0078:
                if (r2 == 0) goto L_0x0098
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r8 = r7.f161693f
                sg1.h r0 = r8.getLiveFreeTimeManager()
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r8 = r7.f161693f
                gr1.q2 r8 = r8.f161676j
                if (r8 == 0) goto L_0x008f
                com.tencent.mm.plugin.finder.storage.FeedData r8 = r8.f170496f
                if (r8 == 0) goto L_0x008f
                long r1 = r8.getLiveId()
                goto L_0x0091
            L_0x008f:
                r1 = 0
            L_0x0091:
                r3 = 1
                r4 = 0
                r5 = 4
                r6 = 0
                sg1.C63881c.C63882a.m75104a(r0, r1, r3, r4, r5, r6)
            L_0x0098:
                rx3.b0 r8 = rx3.C13598b0.f38549a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderLivePlayView.C56498b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderLivePlayView$c */
    public static final class C56499c extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePlayView f161696d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56499c(FinderLivePlayView finderLivePlayView) {
            super(1);
            this.f161696d = finderLivePlayView;
        }

        public Object invoke(Object obj) {
            C61926c.m72668M(new C56538e(((Boolean) obj).booleanValue(), this.f161696d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderLivePlayView$d */
    public static final class C56500d extends C87413o implements C32224a<C63888h> {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePlayView f161697d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56500d(FinderLivePlayView finderLivePlayView) {
            super(0);
            this.f161697d = finderLivePlayView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.f170496f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r10 = this;
                sg1.h r8 = new sg1.h
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r10.f161697d
                gr1.q2 r0 = r0.f161676j
                if (r0 == 0) goto L_0x0011
                com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f170496f
                if (r0 == 0) goto L_0x0011
                long r0 = r0.getLiveId()
                goto L_0x0013
            L_0x0011:
                r0 = 0
            L_0x0013:
                r2 = r0
                r4 = 0
                r5 = 0
                r6 = 12
                r7 = 0
                r9 = 1
                r1 = 1
                r0 = r8
                r0.<init>(r1, r2, r4, r5, r6, r7)
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r10.f161697d
                r0.setLiveFreeTimerInit(r9)
                com.tencent.mm.plugin.finder.video.FinderLivePlayView$a r1 = new com.tencent.mm.plugin.finder.video.FinderLivePlayView$a
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r0)
                r1.<init>(r0, r2)
                r8.f181092f = r1
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderLivePlayView.C56500d.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderLivePlayView$e */
    public static final class C56501e extends C58915a {

        /* renamed from: d */
        public final /* synthetic */ FinderLivePlayView f161698d;

        public C56501e(FinderLivePlayView finderLivePlayView) {
            this.f161698d = finderLivePlayView;
        }

        public void onNetStatus(Bundle bundle) {
            C59673q2 q2Var;
            FeedData feedData;
            C64273c21 liveInfo;
            int netType = NetStatusUtil.getNetType(this.f161698d.getContext());
            StringBuilder sb = new StringBuilder();
            sb.append("onNetStatus curPlayStatus:");
            sb.append(this.f161698d.f161672f);
            sb.append(", netQuality:");
            sb.append(netType);
            sb.append(", isPlaying:");
            C58924d txLivePlayer = this.f161698d.getTxLivePlayer();
            boolean z = true;
            sb.append(txLivePlayer != null && txLivePlayer.isPlaying());
            Log.m105924i("AbsTXLivePlayListener", sb.toString());
            C58924d txLivePlayer2 = this.f161698d.getTxLivePlayer();
            if ((txLivePlayer2 != null && txLivePlayer2.isPlaying()) && netType != -1) {
                FinderLivePlayView finderLivePlayView = this.f161698d;
                if (finderLivePlayView.f161672f == -2301 && (q2Var = finderLivePlayView.f161676j) != null && !Util.isNullOrNil(q2Var.f170491a) && q2Var.f170491a != null) {
                    C58924d txLivePlayer3 = finderLivePlayView.getTxLivePlayer();
                    if (txLivePlayer3 != null) {
                        txLivePlayer3.stopPlay(false);
                    }
                    C62042e.f176370a.getClass();
                    if (C62042e.f176372c) {
                        C59673q2 q2Var2 = finderLivePlayView.f161676j;
                        if (q2Var2 == null || (feedData = q2Var2.f170496f) == null || (liveInfo = feedData.getLiveInfo()) == null || liveInfo.f182394f != 2) {
                            z = false;
                        }
                        if (z) {
                            Log.m105924i("AbsTXLivePlayListener", "onNetStatus try to start play but live status is end!");
                            return;
                        }
                    }
                    String str = q2Var.f170491a;
                    if (str == null) {
                        str = "";
                    }
                    finderLivePlayView.mo79411N(str);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: rx3.l<java.lang.Boolean, java.lang.String>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: rx3.l<java.lang.Boolean, java.lang.String>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: rx3.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: rx3.l<java.lang.Boolean, java.lang.String>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: te3.rq2} */
        /* JADX WARNING: type inference failed for: r5v1 */
        /* JADX WARNING: type inference failed for: r5v17 */
        /* JADX WARNING: type inference failed for: r5v18 */
        /* JADX WARNING: type inference failed for: r5v19 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x024b  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x025a  */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x025c  */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x025f  */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x0267  */
        /* JADX WARNING: Removed duplicated region for block: B:165:0x0293  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPlayEvent(int r13, android.os.Bundle r14) {
            /*
                r12 = this;
                super.onPlayEvent(r13, r14)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onPlayEvent:"
                r0.append(r1)
                r0.append(r13)
                java.lang.String r1 = ", isPlaying:"
                r0.append(r1)
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r1 = r12.f161698d
                f50.d r1 = r1.getTxLivePlayer()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0027
                boolean r1 = r1.isPlaying()
                if (r1 != r2) goto L_0x0027
                r1 = 1
                goto L_0x0028
            L_0x0027:
                r1 = 0
            L_0x0028:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "Finder.FinderLivePlayView"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                r0.f161672f = r13
                f50.d r0 = r0.getTxLivePlayer()
                if (r0 == 0) goto L_0x0046
                boolean r0 = r0.isPlaying()
                if (r0 != r2) goto L_0x0046
                r0 = 1
                goto L_0x0047
            L_0x0046:
                r0 = 0
            L_0x0047:
                r1 = -2301(0xfffffffffffff703, float:NaN)
                java.lang.String r4 = ""
                if (r0 == 0) goto L_0x0324
                if (r13 == r1) goto L_0x031e
                r0 = 2001(0x7d1, float:2.804E-42)
                if (r13 == r0) goto L_0x0312
                r0 = 2006(0x7d6, float:2.811E-42)
                r1 = -1
                r5 = 0
                if (r13 == r0) goto L_0x02d8
                r0 = 2012(0x7dc, float:2.82E-42)
                if (r13 == r0) goto L_0x02be
                r0 = 3
                r6 = 2103(0x837, float:2.947E-42)
                if (r13 == r6) goto L_0x0174
                r1 = 2003(0x7d3, float:2.807E-42)
                if (r13 == r1) goto L_0x0134
                r0 = 2004(0x7d4, float:2.808E-42)
                if (r13 == r0) goto L_0x00d2
                r0 = 2008(0x7d8, float:2.814E-42)
                if (r13 == r0) goto L_0x00c4
                r0 = 2009(0x7d9, float:2.815E-42)
                if (r13 == r0) goto L_0x0074
                goto L_0x032b
            L_0x0074:
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                if (r14 == 0) goto L_0x007f
                java.lang.String r1 = "EVT_PARAM1"
                int r1 = r14.getInt(r1)
                goto L_0x0080
            L_0x007f:
                r1 = 0
            L_0x0080:
                r0.f161681r = r1
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                if (r14 == 0) goto L_0x008c
                java.lang.String r1 = "EVT_PARAM2"
                int r3 = r14.getInt(r1)
            L_0x008c:
                r0.f161682s = r3
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onPlayEvent PLAY_EVT_CHANGE_RESOLUTION, w:h="
                r1.append(r2)
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r2 = r12.f161698d
                int r2 = r2.f161681r
                r1.append(r2)
                r2 = 58
                r1.append(r2)
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r2 = r12.f161698d
                int r2 = r2.f161682s
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.mo79410L(r1)
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                boolean r0 = r0.mo79401C()
                if (r0 == 0) goto L_0x00bd
                return
            L_0x00bd:
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                r0.mo79405G()
                goto L_0x032b
            L_0x00c4:
                dp1.d0$a r0 = dp1.C58358d0.f167118d
                if (r0 != 0) goto L_0x00ca
                goto L_0x032b
            L_0x00ca:
                long r1 = android.os.SystemClock.elapsedRealtime()
                r0.f167127e = r1
                goto L_0x032b
            L_0x00d2:
                dp1.d0$a r1 = dp1.C58358d0.f167118d
                if (r1 != 0) goto L_0x00d7
                goto L_0x00dd
            L_0x00d7:
                long r6 = android.os.SystemClock.elapsedRealtime()
                r1.f167128f = r6
            L_0x00dd:
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r1 = r12.f161698d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r6 = "onPlayEvent "
                r3.append(r6)
                if (r13 != r0) goto L_0x00ee
                java.lang.String r0 = "PLAY_EVT_PLAY_BEGIN"
                goto L_0x00f0
            L_0x00ee:
                java.lang.String r0 = "PLAY_EVT_CONNECT_SUCC"
            L_0x00f0:
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.mo79410L(r0)
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                gr1.w2 r0 = r0.getLifecycle()
                if (r0 == 0) goto L_0x010f
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r1 = r12.f161698d
                gr1.q2 r1 = r1.f161676j
                if (r1 == 0) goto L_0x010b
                te3.rq2 r1 = r1.f170494d
                goto L_0x010c
            L_0x010b:
                r1 = r5
            L_0x010c:
                r0.mo77475e(r1)
            L_0x010f:
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                gr1.w2 r0 = r0.getLifecycle()
                if (r0 == 0) goto L_0x0124
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r1 = r12.f161698d
                gr1.q2 r1 = r1.f161676j
                if (r1 == 0) goto L_0x011f
                te3.rq2 r5 = r1.f170494d
            L_0x011f:
                r6 = 0
                r0.mo78304m(r5, r6)
            L_0x0124:
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                ht1.v2 r0 = r0.f161679p
                if (r0 == 0) goto L_0x012d
                r0.mo85204b()
            L_0x012d:
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                r0.setKeepScreenOn(r2)
                goto L_0x032b
            L_0x0134:
                dp1.d0 r1 = dp1.C58358d0.f167115a
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r2 = r12.f161698d
                gr1.q2 r2 = r2.f161676j
                if (r2 == 0) goto L_0x013f
                com.tencent.mm.plugin.finder.storage.FeedData r2 = r2.f170496f
                goto L_0x0140
            L_0x013f:
                r2 = r5
            L_0x0140:
                r1.mo83114d(r5, r2)
                java.lang.String r1 = "AbsTXLivePlayListener"
                java.lang.String r2 = "TXLivePlayer:receive first frame"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r1 = r12.f161698d
                gr1.q2 r1 = r1.f161676j
                if (r1 == 0) goto L_0x032b
                com.tencent.mm.plugin.finder.storage.FeedData r1 = r1.f170496f
                if (r1 == 0) goto L_0x032b
                te3.c21 r1 = r1.getLiveInfo()
                if (r1 == 0) goto L_0x032b
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r2 = r12.f161698d
                ak1.n0 r3 = ak1.C54101n0.f151856a
                long r5 = r1.f182392d
                gr1.q2 r1 = r2.f161676j
                if (r1 == 0) goto L_0x016e
                com.tencent.mm.plugin.finder.storage.FeedData r1 = r1.f170496f
                if (r1 == 0) goto L_0x016e
                java.lang.String r1 = r1.getNickName()
                if (r1 != 0) goto L_0x016f
            L_0x016e:
                r1 = r4
            L_0x016f:
                r3.mo74795b(r5, r1, r0)
                goto L_0x032b
            L_0x0174:
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r7 = r12.f161698d
                android.content.Context r7 = r7.getContext()
                int r7 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetType((android.content.Context) r7)
                if (r7 != r1) goto L_0x0182
                r1 = 1
                goto L_0x0183
            L_0x0182:
                r1 = 0
            L_0x0183:
                w50.b r7 = w50.C65928b.f189533a
                boolean r7 = r7.mo89968f(r13, r14)
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r8 = r12.f161698d
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "onPlayEvent PLAY_WARNING_RECONNECT, non_network:"
                r9.append(r10)
                r9.append(r1)
                java.lang.String r10 = ",liveFinish:"
                r9.append(r10)
                r9.append(r7)
                java.lang.String r9 = r9.toString()
                r8.mo79410L(r9)
                if (r7 == 0) goto L_0x01c0
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                f50.d r0 = r0.getTxLivePlayer()
                if (r0 == 0) goto L_0x01b4
                r0.stopPlay(r3)
            L_0x01b4:
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                r0.mo79403E(r3)
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                r0.mo79409K()
                goto L_0x032b
            L_0x01c0:
                if (r1 != 0) goto L_0x032b
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r1 = r12.f161698d
                gr1.q2 r7 = r1.f161676j
                if (r7 == 0) goto L_0x01d5
                com.tencent.mm.plugin.finder.storage.FeedData r7 = r7.f170496f
                if (r7 == 0) goto L_0x01d5
                long r7 = r7.getFeedId()
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                goto L_0x01d6
            L_0x01d5:
                r7 = r5
            L_0x01d6:
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r8 = r12.f161698d
                gr1.q2 r8 = r8.f161676j
                if (r8 == 0) goto L_0x01e5
                com.tencent.mm.plugin.finder.storage.FeedData r8 = r8.f170496f
                if (r8 == 0) goto L_0x01e5
                java.lang.String r8 = r8.getNonceId()
                goto L_0x01e6
            L_0x01e5:
                r8 = r5
            L_0x01e6:
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r9 = r12.f161698d
                gr1.q2 r9 = r9.f161676j
                if (r9 == 0) goto L_0x01f5
                com.tencent.mm.plugin.finder.storage.FeedData r9 = r9.f170496f
                if (r9 == 0) goto L_0x01f5
                te3.c21 r9 = r9.getLiveInfo()
                goto L_0x01f6
            L_0x01f5:
                r9 = r5
            L_0x01f6:
                r1.mo79402D(r7, r8, r9)
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r1 = r12.f161698d
                r1.getClass()
                p50.d$b r7 = p50.C47428d.f127226d
                boolean r6 = r7.mo72454a(r6, r14)
                if (r6 == 0) goto L_0x029b
                w50.a r6 = w50.C53075a.f148139a
                r6.mo73766f()
                p50.d r6 = r1.f161662A
                if (r6 != 0) goto L_0x0214
                p50.d r6 = new p50.d
                r6.<init>()
            L_0x0214:
                r1.f161662A = r6
                gr1.q2 r7 = r1.f161676j
                if (r7 == 0) goto L_0x021e
                java.lang.String r8 = r7.f170491a
                if (r8 != 0) goto L_0x021f
            L_0x021e:
                r8 = r4
            L_0x021f:
                if (r7 == 0) goto L_0x0248
                com.tencent.mm.plugin.finder.storage.FeedData r7 = r7.f170496f
                if (r7 == 0) goto L_0x0248
                te3.c21 r7 = r7.getLiveInfo()
                if (r7 == 0) goto L_0x0248
                te3.bq2 r7 = r7.f182358D
                if (r7 == 0) goto L_0x0242
                pe3.b r7 = r7.f182318j
                if (r7 == 0) goto L_0x0242
                te3.cq2 r9 = new te3.cq2
                r9.<init>()
                byte[] r7 = r7.mo123703f()
                r9.parseFrom(r7)
                te3.zp2 r7 = r9.f182556f
                goto L_0x0243
            L_0x0242:
                r7 = r5
            L_0x0243:
                if (r7 == 0) goto L_0x0248
                java.lang.String r7 = r7.f186803X
                goto L_0x0249
            L_0x0248:
                r7 = r5
            L_0x0249:
                if (r7 != 0) goto L_0x024c
                r7 = r4
            L_0x024c:
                rx3.l r6 = r6.mo72451a(r8, r7)
                A r7 = r6.f38555d
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != r2) goto L_0x025c
                r7 = 1
                goto L_0x025d
            L_0x025c:
                r7 = 0
            L_0x025d:
                if (r7 == 0) goto L_0x0267
                B r5 = r6.f38556e
                java.lang.String r5 = (java.lang.String) r5
                com.tencent.p014mm.plugin.finder.video.FinderLivePlayView.m64940P(r1, r2, r5)
                goto L_0x0291
            L_0x0267:
                p50.d r6 = r1.f161662A
                if (r6 == 0) goto L_0x0278
                gr1.q2 r5 = r1.f161676j
                if (r5 == 0) goto L_0x0273
                java.lang.String r5 = r5.f170491a
                if (r5 != 0) goto L_0x0274
            L_0x0273:
                r5 = r4
            L_0x0274:
                rx3.l r5 = r6.mo72452b(r5)
            L_0x0278:
                if (r5 == 0) goto L_0x0286
                A r6 = r5.f38555d
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != r2) goto L_0x0286
                r6 = 1
                goto L_0x0287
            L_0x0286:
                r6 = 0
            L_0x0287:
                if (r6 == 0) goto L_0x0290
                B r6 = r5.f38556e
                java.lang.String r6 = (java.lang.String) r6
                com.tencent.p014mm.plugin.finder.video.FinderLivePlayView.m64940P(r1, r2, r6)
            L_0x0290:
                r6 = r5
            L_0x0291:
                if (r6 == 0) goto L_0x029b
                A r1 = r6.f38555d
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r3 = r1.booleanValue()
            L_0x029b:
                if (r3 == 0) goto L_0x032b
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r1 = r12.f161698d
                java.lang.String r2 = "tryFixUnknowHostErr!"
                r1.mo79410L(r2)
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r1 = r12.f161698d
                gr1.q2 r1 = r1.f161676j
                if (r1 == 0) goto L_0x032b
                com.tencent.mm.plugin.finder.storage.FeedData r1 = r1.f170496f
                if (r1 == 0) goto L_0x032b
                te3.c21 r1 = r1.getLiveInfo()
                if (r1 == 0) goto L_0x032b
                ak1.o0 r2 = ak1.C54109o0.f151877a
                long r5 = r1.f182392d
                r2.mo74840a(r5, r0)
                goto L_0x032b
            L_0x02be:
                if (r14 == 0) goto L_0x02c6
                java.lang.String r0 = "EVT_GET_MSG"
                byte[] r5 = r14.getByteArray(r0)
            L_0x02c6:
                if (r14 == 0) goto L_0x02ce
                java.lang.String r0 = "EVT_GET_MSG_TYPE"
                int r3 = r14.getInt(r0)
            L_0x02ce:
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                ht1.v2 r0 = r0.f161679p
                if (r0 == 0) goto L_0x032b
                r0.mo85203a(r5, r3)
                goto L_0x032b
            L_0x02d8:
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                android.content.Context r0 = r0.getContext()
                int r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetType((android.content.Context) r0)
                if (r0 != r1) goto L_0x02e5
                goto L_0x02e6
            L_0x02e5:
                r2 = 0
            L_0x02e6:
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r5 = "onPlayEvent PLAY_EVT_PLAY_END, non_network:"
                r1.append(r5)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.mo79410L(r1)
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                f50.d r0 = r0.getTxLivePlayer()
                if (r0 == 0) goto L_0x0307
                r0.stopPlay(r3)
            L_0x0307:
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                r0.mo79403E(r3)
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                r0.mo79409K()
                goto L_0x032b
            L_0x0312:
                dp1.d0$a r0 = dp1.C58358d0.f167118d
                if (r0 != 0) goto L_0x0317
                goto L_0x032b
            L_0x0317:
                long r1 = android.os.SystemClock.elapsedRealtime()
                r0.f167126d = r1
                goto L_0x032b
            L_0x031e:
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                com.tencent.p014mm.plugin.finder.video.FinderLivePlayView.m64941r(r0)
                goto L_0x032b
            L_0x0324:
                if (r13 != r1) goto L_0x032b
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                com.tencent.p014mm.plugin.finder.video.FinderLivePlayView.m64941r(r0)
            L_0x032b:
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = r12.f161698d
                gr1.q2 r0 = r0.f161676j
                if (r0 == 0) goto L_0x0359
                com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f170496f
                if (r0 == 0) goto L_0x0359
                te3.c21 r0 = r0.getLiveInfo()
                if (r0 == 0) goto L_0x0359
                com.tencent.mm.plugin.finder.video.FinderLivePlayView r1 = r12.f161698d
                ak1.n0 r5 = ak1.C54101n0.f151856a
                long r8 = r0.f182392d
                gr1.q2 r0 = r1.f161676j
                if (r0 == 0) goto L_0x0352
                com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f170496f
                if (r0 == 0) goto L_0x0352
                java.lang.String r0 = r0.getNickName()
                if (r0 != 0) goto L_0x0350
                goto L_0x0352
            L_0x0350:
                r10 = r0
                goto L_0x0353
            L_0x0352:
                r10 = r4
            L_0x0353:
                r11 = 3
                r6 = r13
                r7 = r14
                r5.mo74800g(r6, r7, r8, r10, r11)
            L_0x0359:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderLivePlayView.C56501e.onPlayEvent(int, android.os.Bundle):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLivePlayView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        mo79407I();
    }

    /* renamed from: P */
    public static final void m64940P(FinderLivePlayView finderLivePlayView, int i, String str) {
        FeedData feedData;
        C64273c21 liveInfo;
        C64265bq2 bq22;
        C89349b bVar;
        C58924d dVar = finderLivePlayView.f161670d;
        if (dVar != null) {
            dVar.stopPlay(false);
        }
        C59673q2 q2Var = finderLivePlayView.f161676j;
        C64890zp2 zp22 = null;
        if (!(q2Var == null || (feedData = q2Var.f170496f) == null || (liveInfo = feedData.getLiveInfo()) == null || (bq22 = liveInfo.f182358D) == null || (bVar = bq22.f182318j) == null)) {
            C64293cq2 cq22 = new C64293cq2();
            cq22.parseFrom(bVar.mo123703f());
            zp22 = cq22.f182556f;
        }
        finderLivePlayView.mo79412O(str, i, zp22, "restart");
    }

    private final String getCoverUrl() {
        C64689rq2 rq22;
        C59673q2 q2Var = this.f161676j;
        if (q2Var == null || (rq22 = q2Var.f170494d) == null) {
            return "";
        }
        String str = Util.nullAsNil(rq22.f185283w) + Util.nullAsNil(rq22.f185234A);
        if (!Util.isNullOrNil(str)) {
            return str;
        }
        return Util.nullAsNil(rq22.f185267e) + Util.nullAsNil(rq22.f185288z);
    }

    /* access modifiers changed from: private */
    public final C63888h getLiveFreeTimeManager() {
        return (C63888h) this.f161689z.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r1 == 1) goto L_0x0048;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m64941r(com.tencent.p014mm.plugin.finder.video.FinderLivePlayView r5) {
        /*
            android.content.Context r0 = r5.getContext()
            int r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetType((android.content.Context) r0)
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "onPlayEvent PLAY_ERR_NET_DISCONNECT, non_network:"
            r1.append(r4)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r5.mo79410L(r1)
            f50.d r1 = r5.f161670d
            if (r1 == 0) goto L_0x002b
            r1.stopPlay(r3)
        L_0x002b:
            r5.mo79403E(r3)
            gr1.q2 r1 = r5.f161676j
            if (r1 == 0) goto L_0x0047
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r1.f170496f
            if (r1 == 0) goto L_0x0047
            te3.c21 r1 = r1.getLiveInfo()
            if (r1 == 0) goto L_0x0047
            te3.by0 r1 = r1.f182402p0
            if (r1 == 0) goto L_0x0047
            int r1 = r1.f131380d
            int r4 = ks3.C10411s.f31639a
            if (r1 != r2) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            if (r2 == 0) goto L_0x0050
            java.lang.String r1 = "onPlayEvent PLAY_ERR_NET_DISCONNECT but is olympics live, ignore"
            r5.mo79410L(r1)
            goto L_0x0054
        L_0x0050:
            r1 = 6
            r5.mo79413Q(r1)
        L_0x0054:
            if (r0 != 0) goto L_0x00ac
            gr1.q2 r0 = r5.f161676j
            r1 = 0
            if (r0 == 0) goto L_0x0068
            com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f170496f
            if (r0 == 0) goto L_0x0068
            long r2 = r0.getFeedId()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L_0x0069
        L_0x0068:
            r0 = r1
        L_0x0069:
            gr1.q2 r2 = r5.f161676j
            if (r2 == 0) goto L_0x0076
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r2.f170496f
            if (r2 == 0) goto L_0x0076
            java.lang.String r2 = r2.getNonceId()
            goto L_0x0077
        L_0x0076:
            r2 = r1
        L_0x0077:
            gr1.q2 r3 = r5.f161676j
            if (r3 == 0) goto L_0x0083
            com.tencent.mm.plugin.finder.storage.FeedData r3 = r3.f170496f
            if (r3 == 0) goto L_0x0083
            te3.c21 r1 = r3.getLiveInfo()
        L_0x0083:
            r5.mo79402D(r0, r2, r1)
            gr1.q2 r0 = r5.f161676j
            if (r0 == 0) goto L_0x00ac
            com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f170496f
            if (r0 == 0) goto L_0x00ac
            te3.c21 r0 = r0.getLiveInfo()
            if (r0 == 0) goto L_0x00ac
            ak1.n0 r1 = ak1.C54101n0.f151856a
            long r2 = r0.f182392d
            gr1.q2 r5 = r5.f161676j
            if (r5 == 0) goto L_0x00a6
            com.tencent.mm.plugin.finder.storage.FeedData r5 = r5.f170496f
            if (r5 == 0) goto L_0x00a6
            java.lang.String r5 = r5.getNickName()
            if (r5 != 0) goto L_0x00a8
        L_0x00a6:
            java.lang.String r5 = ""
        L_0x00a8:
            r0 = 3
            r1.mo74794a(r2, r5, r0)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderLivePlayView.m64941r(com.tencent.mm.plugin.finder.video.FinderLivePlayView):void");
    }

    private final void setPlayerAudioJitterBufferConfig(boolean z) {
        if (z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ProviderConstants.API_PATH, "setAudioJitterBufferFactory");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("controllerFactory", 0);
            C13598b0 b0Var = C13598b0.f38549a;
            jSONObject.put("params", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            C87412m.m108593f(jSONObject3, "JSONObject().apply{\n    …\n            }.toString()");
            C58924d dVar = this.f161670d;
            if (dVar != null) {
                dVar.callExperimentalAPI(jSONObject3);
            }
        }
    }

    /* renamed from: A */
    public void mo78597A(C58924d dVar, int i, int i2, long j) {
        C87412m.m108594g(dVar, "txPlayer");
        this.f161685v = j;
        this.f161681r = i;
        this.f161682s = i2;
        Log.m105924i("Finder.FinderLivePlayView", "setLivePlayer videoWidth: " + i + " videoHeight: " + i2 + " txPlayer: " + dVar);
        mo79408J(dVar, true);
        mo79401C();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r0 = r0.f170496f;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo51221B(java.lang.Integer r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "startOrPlay, "
            r6.append(r0)
            gr1.q2 r0 = r5.f161676j
            r1 = 0
            if (r0 == 0) goto L_0x001d
            com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f170496f
            if (r0 == 0) goto L_0x001d
            long r2 = r0.getLiveId()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L_0x001e
        L_0x001d:
            r0 = r1
        L_0x001e:
            r6.append(r0)
            java.lang.String r0 = ",liveStatus:"
            r6.append(r0)
            gr1.q2 r0 = r5.f161676j
            if (r0 == 0) goto L_0x003b
            com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f170496f
            if (r0 == 0) goto L_0x003b
            te3.c21 r0 = r0.getLiveInfo()
            if (r0 == 0) goto L_0x003b
            int r0 = r0.f182394f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x003c
        L_0x003b:
            r0 = r1
        L_0x003c:
            r6.append(r0)
            java.lang.String r0 = ", "
            r6.append(r0)
            gr1.q2 r0 = r5.f161676j
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r0.f170491a
            goto L_0x004c
        L_0x004b:
            r0 = r1
        L_0x004c:
            r6.append(r0)
            java.lang.String r0 = " ,playFlag:"
            r6.append(r0)
            ok1.e r0 = ok1.C62042e.f176370a
            r0.getClass()
            boolean r2 = ok1.C62042e.f176372c
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.mo79410L(r6)
            r0.getClass()
            r6 = 1
            java.lang.String r0 = "Finder.FinderLivePlayView"
            r3 = 0
            if (r2 == 0) goto L_0x008c
            gr1.q2 r2 = r5.f161676j
            if (r2 == 0) goto L_0x0083
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r2.f170496f
            if (r2 == 0) goto L_0x0083
            te3.c21 r2 = r2.getLiveInfo()
            if (r2 == 0) goto L_0x0083
            int r2 = r2.f182394f
            r4 = 2
            if (r2 != r4) goto L_0x0083
            r2 = 1
            goto L_0x0084
        L_0x0083:
            r2 = 0
        L_0x0084:
            if (r2 == 0) goto L_0x008c
            java.lang.String r6 = "live finish!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            return r3
        L_0x008c:
            boolean r2 = r5.f161664C
            if (r2 != 0) goto L_0x00a8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "startOrPlay, return, isViewFocused:"
            r6.append(r1)
            boolean r1 = r5.f161664C
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            return r3
        L_0x00a8:
            boolean r2 = r5.isPlaying()
            if (r2 == 0) goto L_0x00c4
            java.lang.String r6 = "startOrPlay, return, isPlaying!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            gr1.q2 r6 = r5.f161676j
            if (r6 == 0) goto L_0x00c0
            com.tencent.mm.plugin.finder.storage.FeedData r6 = r6.f170496f
            if (r6 == 0) goto L_0x00c0
            te3.c21 r1 = r6.getLiveInfo()
        L_0x00c0:
            r5.mo79404F(r1)
            return r3
        L_0x00c4:
            gr1.q2 r0 = r5.f161676j
            if (r0 == 0) goto L_0x00de
            java.lang.String r1 = r0.f170491a
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x00de
            java.lang.String r0 = r0.f170491a
            if (r0 == 0) goto L_0x00de
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = ""
        L_0x00d8:
            r5.mo79411N(r0)
            r5.f161666E = r3
            return r6
        L_0x00de:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderLivePlayView.mo51221B(java.lang.Integer):boolean");
    }

    /* renamed from: C */
    public final boolean mo79401C() {
        C60211v2 v2Var = this.f161679p;
        if (v2Var != null) {
            v2Var.mo85207e(this.f161681r, this.f161682s);
        }
        if (!this.f161675i) {
            return true;
        }
        if (this.f161682s > this.f161681r) {
            C58924d dVar = this.f161670d;
            if (dVar != null) {
                dVar.setRenderMode(0);
            }
        } else {
            C58924d dVar2 = this.f161670d;
            if (dVar2 != null) {
                dVar2.setRenderMode(1);
            }
        }
        int i = this.f161681r;
        int i2 = this.f161682s;
        Log.m105924i("Finder.FinderLivePlayView", "adjustDecorateRoot videoW:" + i + ", videoH:" + i2 + " isAutoJustRenderMode:" + this.f161675i);
        if (this.f161675i) {
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (i2 > i) {
                RatioLayout ratioLayout = this.f161678o;
                ViewGroup.LayoutParams layoutParams = ratioLayout != null ? ratioLayout.getLayoutParams() : null;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.topMargin = 0;
                }
                RatioLayout ratioLayout2 = this.f161678o;
                ViewGroup.LayoutParams layoutParams2 = ratioLayout2 != null ? ratioLayout2.getLayoutParams() : null;
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = 0;
                }
                RatioLayout ratioLayout3 = this.f161678o;
                if (ratioLayout3 != null) {
                    ratioLayout3.requestLayout();
                }
            } else {
                int measuredHeight = (getMeasuredHeight() - ((int) (((float) i2) * (((float) C75044y4.m89990b(getContext()).x) / ((float) i))))) / 2;
                RatioLayout ratioLayout4 = this.f161678o;
                ViewGroup.LayoutParams layoutParams3 = ratioLayout4 != null ? ratioLayout4.getLayoutParams() : null;
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (marginLayoutParams3 != null) {
                    marginLayoutParams3.topMargin = measuredHeight;
                }
                RatioLayout ratioLayout5 = this.f161678o;
                ViewGroup.LayoutParams layoutParams4 = ratioLayout5 != null ? ratioLayout5.getLayoutParams() : null;
                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = measuredHeight;
                }
                RatioLayout ratioLayout6 = this.f161678o;
                if (ratioLayout6 != null) {
                    ratioLayout6.requestLayout();
                }
            }
            this.f161683t = i2;
            this.f161684u = i;
        }
        return false;
    }

    /* renamed from: D */
    public final void mo79402D(Long l, String str, C64273c21 c212) {
        if (!(l == null || l.longValue() == 0)) {
            if (!(str == null || str.length() == 0) && c212 != null) {
                if (!((C60606n) C86312j.m106911c(C60606n.class)).mo85075nB(c212)) {
                    Log.m105924i("Finder.FinderLivePlayView", "checkChargeLiveInvalid fail,isn't purchase live!");
                    return;
                }
                Log.m105924i("Finder.FinderLivePlayView", "checkChargeLiveInvalid " + c212.f182392d + " coroutineScope isActive:" + C53930o0.m60560g(this.f161687x));
                C53895h.m60466d(this.f161687x, (C66212f) null, (C53934p0) null, new C56498b(c212, this, l, str, (C15601d<? super C56498b>) null), 3, (Object) null);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("checkChargeLiveInvalid error,objectId:");
        sb.append(l);
        sb.append(",nonceId:");
        sb.append(str);
        sb.append(",liveId:");
        sb.append(c212 != null ? Long.valueOf(c212.f182392d) : null);
        Log.m105920e("Finder.FinderLivePlayView", sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        r9 = r9.f170496f;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79403E(boolean r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "checkChargeLivePlayPuase isLiveFreeTimerInit:"
            r0.append(r1)
            boolean r1 = r8.f161688y
            r0.append(r1)
            java.lang.String r1 = ", freeTimeOver:"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderLivePlayView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 0
            if (r9 == 0) goto L_0x002e
            f50.d r9 = r8.f161670d
            if (r9 == 0) goto L_0x002a
            r9.stopPlay(r0)
        L_0x002a:
            r8.mo79409K()
            goto L_0x005d
        L_0x002e:
            boolean r9 = r8.f161688y
            if (r9 == 0) goto L_0x005d
            sg1.h r9 = r8.getLiveFreeTimeManager()
            com.tencent.mm.sdk.platformtools.MTimerHandler r9 = r9.f181093g
            if (r9 == 0) goto L_0x0041
            boolean r9 = r9.stopped()
            if (r9 != 0) goto L_0x0041
            r0 = 1
        L_0x0041:
            if (r0 == 0) goto L_0x005d
            sg1.h r1 = r8.getLiveFreeTimeManager()
            gr1.q2 r9 = r8.f161676j
            if (r9 == 0) goto L_0x0054
            com.tencent.mm.plugin.finder.storage.FeedData r9 = r9.f170496f
            if (r9 == 0) goto L_0x0054
            long r2 = r9.getLiveId()
            goto L_0x0056
        L_0x0054:
            r2 = 0
        L_0x0056:
            r4 = 1
            r5 = 0
            r6 = 4
            r7 = 0
            sg1.C63881c.C63882a.m75104a(r1, r2, r4, r5, r6, r7)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderLivePlayView.mo79403E(boolean):void");
    }

    /* renamed from: F */
    public final boolean mo79404F(C64273c21 c212) {
        boolean z = false;
        if (((C60606n) C86312j.m106911c(C60606n.class)).mo85075nB(c212)) {
            if (c212 != null ? C63947a.f181274a.mo88716a(c212, "Finder.FinderLivePlayView_checkChargeLivePlayStart") : false) {
                MTimerHandler mTimerHandler = getLiveFreeTimeManager().f181093g;
                if (mTimerHandler != null && !mTimerHandler.stopped()) {
                    z = true;
                }
                if (z) {
                    Log.m105924i("Finder.FinderLivePlayView", "charge live timer is running!");
                }
                getLiveFreeTimeManager().mo88652c(c212 != null ? c212.f182362H : null);
                return true;
            }
            C58924d dVar = this.f161670d;
            if (dVar != null) {
                dVar.stopPlay(false);
            }
            mo79409K();
            return false;
        }
        Log.m105924i("Finder.FinderLivePlayView", "checkChargeLivePlayStart live is normal live!");
        return true;
    }

    /* renamed from: G */
    public final void mo79405G() {
        View findViewWithTag;
        if (mo78668v() && (findViewWithTag = findViewWithTag("nearby-live-fluent-preview-view-tag")) != null) {
            removeView(findViewWithTag);
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.p136ui.MMActivity mo79406H(android.view.View r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0027
            android.content.Context r1 = r3.getContext()
            boolean r1 = r1 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r1 == 0) goto L_0x0017
            android.content.Context r3 = r3.getContext()
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r3, r0)
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            return r3
        L_0x0017:
            android.view.ViewParent r3 = r3.getParent()
            boolean r1 = r3 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0022
            r0 = r3
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x0022:
            com.tencent.mm.ui.MMActivity r3 = r2.mo79406H(r0)
            return r3
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderLivePlayView.mo79406H(android.view.View):com.tencent.mm.ui.MMActivity");
    }

    /* renamed from: I */
    public final void mo79407I() {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        setTextureView(new C59668o0(context));
        addView(getTextureView(), new FrameLayout.LayoutParams(-1, -1));
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        this.f161678o = new RatioLayout(context2);
        addView(this.f161678o, new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f161677n = imageView;
        addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        int e = C59364c.m69282e(false);
        mo79408J(new C59364c(getContext(), true, (e == 5 || e == 6) ? 2 : 0), false);
    }

    /* renamed from: J */
    public final void mo79408J(C58924d dVar, boolean z) {
        Log.m105924i("Finder.FinderLivePlayView", "initLivePlayer " + dVar + " currentFeedId: " + this.f161685v);
        this.f161670d = dVar;
        if (dVar != null) {
            dVar.setPlayListener(this.f161663B);
        }
        C58924d dVar2 = this.f161670d;
        if (dVar2 != null) {
            dVar2.setConfig(C58739j4.m68256z(C58739j4.f168176a, true, 0, 2, (Object) null));
        }
        C58924d dVar3 = this.f161670d;
        if (dVar3 != null) {
            dVar3.setPlayerView(getTextureView());
        }
        if (z) {
            getTextureView().post(new C59661l0(this));
        }
        int i = this.f161682s;
        int i2 = this.f161681r;
        if (i > i2 || i2 == 0) {
            C58924d dVar4 = this.f161670d;
            if (dVar4 != null) {
                dVar4.setRenderMode(0);
            }
        } else {
            C58924d dVar5 = this.f161670d;
            if (dVar5 != null) {
                dVar5.setRenderMode(1);
            }
        }
        C60211v2 v2Var = this.f161679p;
        if (v2Var == null) {
            v2Var = ((C13887q1) C86312j.m106911c(C13887q1.class)).Iv0(0, this.f161678o, new C56499c(this));
        }
        this.f161679p = v2Var;
        if (isPlaying()) {
            this.f161666E = false;
        }
    }

    /* renamed from: K */
    public final void mo79409K() {
        FeedData feedData;
        mo79410L("notifyLiveFinish");
        C59673q2 q2Var = this.f161676j;
        if (q2Var != null && (feedData = q2Var.f170496f) != null) {
            FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
            feedUpdateEvent.f9173d.f9174a = feedData.getLiveId();
            feedUpdateEvent.f9173d.f9181h = feedData.getUserName();
            FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
            aVar.f9182i = 2;
            aVar.f9177d = feedData.getPosition();
            feedUpdateEvent.f9173d.f9175b = 19;
            feedUpdateEvent.publish();
        }
    }

    /* renamed from: L */
    public final void mo79410L(String str) {
        Log.m105924i("Finder.FinderLivePlayView", hashCode() + " === " + str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f170496f;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79411N(java.lang.String r9) {
        /*
            r8 = this;
            gr1.q2 r0 = r8.f161676j
            r1 = 0
            if (r0 == 0) goto L_0x000e
            com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f170496f
            if (r0 == 0) goto L_0x000e
            te3.c21 r0 = r0.getLiveInfo()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            boolean r0 = r8.mo79404F(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "start,canPlay:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r9)
            r2.append(r3)
            boolean r3 = r8.isPlaying()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r8.mo79410L(r2)
            if (r0 != 0) goto L_0x003d
            return
        L_0x003d:
            f50.d r0 = r8.f161670d
            if (r0 == 0) goto L_0x0046
            f50.a r2 = r8.f161663B
            r0.setPlayListener(r2)
        L_0x0046:
            gr1.q2 r0 = r8.f161676j
            if (r0 == 0) goto L_0x0058
            com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f170496f
            if (r0 == 0) goto L_0x0058
            te3.c21 r0 = r0.getLiveInfo()
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = r0.f182357C
            if (r0 != 0) goto L_0x005a
        L_0x0058:
            java.lang.String r0 = ""
        L_0x005a:
            int r2 = r0.length()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0064
            r2 = 1
            goto L_0x0065
        L_0x0064:
            r2 = 0
        L_0x0065:
            r2 = r2 ^ r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "FinderLivePlayView set isLowDelayMode["
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = "],gameAppId["
            r5.append(r6)
            r5.append(r0)
            r0 = 93
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "WaveJBM"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            boolean r0 = r8.f161668G
            if (r0 == 0) goto L_0x00c0
            boolean r0 = r8.f161669H
            if (r0 == 0) goto L_0x00c0
            gr1.q2 r0 = r8.f161676j
            if (r0 == 0) goto L_0x00b6
            com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f170496f
            if (r0 == 0) goto L_0x00b6
            te3.c21 r0 = r0.getLiveInfo()
            if (r0 == 0) goto L_0x00b6
            te3.bq2 r0 = r0.f182358D
            if (r0 == 0) goto L_0x00b6
            pe3.b r0 = r0.f182318j
            if (r0 == 0) goto L_0x00b6
            te3.cq2 r3 = new te3.cq2
            r3.<init>()
            byte[] r0 = r0.mo123703f()
            r3.parseFrom(r0)
            te3.zp2 r0 = r3.f182556f
            goto L_0x00b7
        L_0x00b6:
            r0 = r1
        L_0x00b7:
            java.lang.String r3 = "resume"
            r8.mo79412O(r9, r4, r0, r3)
            r8.setPlayerAudioJitterBufferConfig(r2)
            goto L_0x0102
        L_0x00c0:
            if (r9 == 0) goto L_0x00cb
            int r0 = r9.length()
            if (r0 != 0) goto L_0x00c9
            goto L_0x00cb
        L_0x00c9:
            r0 = 0
            goto L_0x00cc
        L_0x00cb:
            r0 = 1
        L_0x00cc:
            if (r0 != 0) goto L_0x0102
            dp1.d0 r0 = dp1.C58358d0.f167115a
            dp1.C58358d0.m67594f(r0, r3, r4, r1)
            gr1.q2 r0 = r8.f161676j
            if (r0 == 0) goto L_0x00f8
            com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f170496f
            if (r0 == 0) goto L_0x00f8
            te3.c21 r0 = r0.getLiveInfo()
            if (r0 == 0) goto L_0x00f8
            te3.bq2 r0 = r0.f182358D
            if (r0 == 0) goto L_0x00f8
            pe3.b r0 = r0.f182318j
            if (r0 == 0) goto L_0x00f8
            te3.cq2 r3 = new te3.cq2
            r3.<init>()
            byte[] r0 = r0.mo123703f()
            r3.parseFrom(r0)
            te3.zp2 r0 = r3.f182556f
            goto L_0x00f9
        L_0x00f8:
            r0 = r1
        L_0x00f9:
            java.lang.String r3 = "start"
            r8.mo79412O(r9, r4, r0, r3)
            r8.setPlayerAudioJitterBufferConfig(r2)
        L_0x0102:
            java.lang.Class<ak1.o> r9 = ak1.C54108o.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ak1.o r9 = (ak1.C54108o) r9
            ak1.f0$q r3 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD
            gr1.q2 r0 = r8.f161676j
            if (r0 == 0) goto L_0x0112
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r0.f170496f
        L_0x0112:
            r6 = r1
            r9.getClass()
            if (r6 != 0) goto L_0x0119
            goto L_0x0129
        L_0x0119:
            ak1.a r2 = ak1.C54108o.f151870i
            ak1.f0 r9 = ak1.C54108o.f151869h
            int r4 = r9.f151482z
            int r9 = r9.f151419A
            java.lang.String r5 = java.lang.String.valueOf(r9)
            r7 = 0
            r2.mo74737f(r3, r4, r5, r6, r7)
        L_0x0129:
            r9 = 6
            r8.mo79413Q(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderLivePlayView.mo79411N(java.lang.String):void");
    }

    /* renamed from: O */
    public final void mo79412O(String str, int i, C64890zp2 zp22, String str2) {
        FeedData feedData;
        C64273c21 liveInfo;
        String str3;
        FeedData feedData2;
        C58924d dVar = this.f161670d;
        if (dVar != null) {
            dVar.mo84115f(str, i, zp22);
        }
        String str4 = str2 + ";url:" + str;
        C59673q2 q2Var = this.f161676j;
        if (q2Var != null && (feedData = q2Var.f170496f) != null && (liveInfo = feedData.getLiveInfo()) != null) {
            C54101n0 n0Var = C54101n0.f151856a;
            long j = liveInfo.f182392d;
            C59673q2 q2Var2 = this.f161676j;
            if (q2Var2 == null || (feedData2 = q2Var2.f170496f) == null || (str3 = feedData2.getNickName()) == null) {
                str3 = "";
            }
            n0Var.mo74801h(str4, j, str3, 3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r1 = r1.f170496f;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79413Q(int r12) {
        /*
            r11 = this;
            ok1.e r0 = ok1.C62042e.f176370a
            r0.getClass()
            boolean r1 = ok1.C62042e.f176372c
            if (r1 == 0) goto L_0x0053
            com.tencent.mm.ui.MMActivity r8 = r11.mo79406H(r11)
            gr1.q2 r1 = r11.f161676j
            if (r1 == 0) goto L_0x001a
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r1.f170496f
            if (r1 == 0) goto L_0x001a
            long r1 = r1.getLiveId()
            goto L_0x001c
        L_0x001a:
            r1 = 0
        L_0x001c:
            r3 = r1
            gr1.q2 r1 = r11.f161676j
            if (r1 == 0) goto L_0x002b
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r1.f170496f
            if (r1 == 0) goto L_0x002b
            java.lang.String r1 = r1.getUserName()
            if (r1 != 0) goto L_0x002d
        L_0x002b:
            java.lang.String r1 = ""
        L_0x002d:
            gr1.q2 r2 = r11.f161676j
            if (r2 == 0) goto L_0x003a
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r2.f170496f
            if (r2 == 0) goto L_0x003a
            int r2 = r2.getPosition()
            goto L_0x003b
        L_0x003a:
            r2 = 0
        L_0x003b:
            r0.getClass()
            java.lang.Class<ir.n> r0 = p565ir.C60606n.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ir.n r0 = (p565ir.C60606n) r0
            ok1.s r9 = new ok1.s
            r9.<init>(r3, r1, r2)
            r5 = 2
            r6 = 20000(0x4e20, double:9.8813E-320)
            r2 = r0
            r10 = r12
            r2.ck0(r3, r5, r6, r8, r9, r10)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderLivePlayView.mo79413Q(int):void");
    }

    /* renamed from: a */
    public boolean mo51223a(double d, boolean z) {
        return false;
    }

    /* renamed from: c */
    public void mo78608c() {
        mo79410L("onUIDestroy");
        stop();
    }

    /* renamed from: d */
    public void mo78609d() {
        mo79410L("onRelease");
        C60211v2 v2Var = this.f161679p;
        if (v2Var != null) {
            v2Var.mo85205c();
        }
        this.f161668G = false;
        C53930o0.m60558e(this.f161687x, (CancellationException) null, 1, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        if ((r0 == 1.0f) != false) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b8  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] mo79414e(int r16, int r17) {
        /*
            r15 = this;
            r1 = r15
            r2 = r16
            r3 = r17
            r0 = 2
            int[] r4 = new int[r0]
            int r0 = r1.f161681r
            float r5 = (float) r0
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r6
            int r7 = r1.f161682s
            float r8 = (float) r7
            float r5 = r5 / r8
            r9 = 1
            if (r0 <= 0) goto L_0x001a
            if (r7 <= 0) goto L_0x001a
            r10 = 1
            goto L_0x001b
        L_0x001a:
            r10 = 0
        L_0x001b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "isLandscapeVideo validVideoSize:"
            r11.append(r12)
            r11.append(r10)
            java.lang.String r12 = " videoRes["
            r11.append(r12)
            r11.append(r0)
            java.lang.String r12 = ", "
            r11.append(r12)
            r11.append(r7)
            r12 = 93
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "Finder.FinderLivePlayView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            if (r10 == 0) goto L_0x004c
            if (r0 < r7) goto L_0x004c
            r0 = 1
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            if (r0 != 0) goto L_0x00ce
            int r0 = r1.f161681r
            int r10 = r1.f161682s
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "isLinkMicVideo videoWidth:"
            r11.append(r13)
            r11.append(r0)
            java.lang.String r13 = ",videoHeight:"
            r11.append(r13)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            if (r0 <= 0) goto L_0x00b4
            if (r10 <= 0) goto L_0x00b4
            java.math.BigDecimal r11 = new java.math.BigDecimal     // Catch:{ Exception -> 0x009b }
            double r13 = (double) r0     // Catch:{ Exception -> 0x009b }
            double r7 = (double) r10     // Catch:{ Exception -> 0x009b }
            double r13 = r13 / r7
            r11.<init>(r13)     // Catch:{ Exception -> 0x009b }
            r0 = 4
            java.math.BigDecimal r0 = r11.setScale(r9, r0)     // Catch:{ Exception -> 0x009b }
            float r0 = r0.floatValue()     // Catch:{ Exception -> 0x009b }
            r7 = 1066192077(0x3f8ccccd, float:1.1)
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x008d
            r7 = 1
            goto L_0x008e
        L_0x008d:
            r7 = 0
        L_0x008e:
            if (r7 != 0) goto L_0x0099
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0096
            r0 = 1
            goto L_0x0097
        L_0x0096:
            r0 = 0
        L_0x0097:
            if (r0 == 0) goto L_0x00b4
        L_0x0099:
            r0 = 1
            goto L_0x00b5
        L_0x009b:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "ex:"
            r6.append(r7)
            java.lang.String r0 = r0.getMessage()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            if (r0 == 0) goto L_0x00b8
            goto L_0x00ce
        L_0x00b8:
            r6 = 0
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00bf
            r0 = 1
            goto L_0x00c0
        L_0x00bf:
            r0 = 0
        L_0x00c0:
            if (r0 != 0) goto L_0x00c7
            float r0 = (float) r3
            float r0 = r0 * r5
            int r0 = (int) r0
            goto L_0x00c8
        L_0x00c7:
            r0 = r2
        L_0x00c8:
            r2 = 0
            r4[r2] = r0
            r4[r9] = r3
            goto L_0x00e9
        L_0x00ce:
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00d5
            r0 = 1
            goto L_0x00d6
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            if (r0 != 0) goto L_0x00dc
            float r0 = (float) r2
            float r0 = r0 / r5
            int r0 = (int) r0
            goto L_0x00e4
        L_0x00dc:
            gr1.o0 r0 = r15.getTextureView()
            int r0 = r0.getHeight()
        L_0x00e4:
            r3 = 0
            r4[r3] = r2
            r4[r9] = r0
        L_0x00e9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderLivePlayView.mo79414e(int, int):int[]");
    }

    /* renamed from: g */
    public boolean mo78610g() {
        return this.f161667F;
    }

    public Bitmap getBitmap() {
        int i = this.f161684u;
        if (i <= 0) {
            View videoView = getTextureView().getVideoView();
            if (videoView == null) {
                videoView = getTextureView();
            }
            i = videoView.getWidth();
        }
        int i2 = this.f161683t;
        if (i2 <= 0) {
            View videoView2 = getTextureView().getVideoView();
            if (videoView2 == null) {
                videoView2 = getTextureView();
            }
            i2 = videoView2.getHeight();
        }
        TextureView videoView3 = getTextureView().getVideoView();
        if (videoView3 != null) {
            return videoView3.getBitmap(i, i2);
        }
        return null;
    }

    public int getContextTag() {
        return this.f161680q;
    }

    public long getCurrentPlayMs() {
        return 0;
    }

    public int getCurrentPlaySecond() {
        return 0;
    }

    public C59318d getEventDetector() {
        return this;
    }

    public C59314b getEventDetectorAdapter() {
        C58924d dVar = this.f161670d;
        if (dVar != null) {
            return dVar.getEventDetectorAdapter();
        }
        return null;
    }

    public boolean getIsNeverStart() {
        return this.f161666E;
    }

    public boolean getIsShouldPlayResume() {
        return this.f161665D;
    }

    public final C59684w2 getLifecycle() {
        return this.f161674h;
    }

    public ViewParent getParentView() {
        return getParent();
    }

    public final C58915a getPlayListener() {
        return this.f161663B;
    }

    public Object getPlayer() {
        return this.f161670d;
    }

    public View getRenderView() {
        return getTextureView().getVideoView();
    }

    public final C59668o0 getTextureView() {
        C59668o0 o0Var = this.f161671e;
        if (o0Var != null) {
            return o0Var;
        }
        C87412m.m108603p("textureView");
        throw null;
    }

    public final C58924d getTxLivePlayer() {
        return this.f161670d;
    }

    public C59662l2 getVideoAdapter() {
        return this;
    }

    public int getVideoDuration() {
        return 0;
    }

    public long getVideoDurationMs() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f170493c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getVideoMediaId() {
        /*
            r1 = this;
            gr1.q2 r0 = r1.f161676j
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.f170493c
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = ""
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderLivePlayView.getVideoMediaId():java.lang.String");
    }

    public C59673q2 getVideoMediaInfo() {
        return this.f161676j;
    }

    public float getVideoRatio() {
        int i;
        int i2 = this.f161682s;
        if (i2 == 0 || (i = this.f161681r) == 0) {
            return 0.0f;
        }
        return (((float) i) * 1.0f) / ((float) i2);
    }

    public FinderLivePlayView getVideoView() {
        return this;
    }

    public final C96814a.C57541b getVideoViewCallback() {
        return this.f161673g;
    }

    public boolean getVideoViewFocused() {
        return this.f161664C;
    }

    /* renamed from: i */
    public void mo79421i(boolean z) {
        this.f161675i = z;
    }

    public boolean isPlaying() {
        C58924d dVar = this.f161670d;
        return dVar != null && dVar.isPlaying();
    }

    /* renamed from: j */
    public void mo79422j(boolean z) {
        this.f161669H = z;
    }

    /* renamed from: n */
    public void mo78638n() {
        Bitmap bitmap = getBitmap();
        if (bitmap != null) {
            int[] e = mo79414e(getTextureView().getWidth(), getTextureView().getHeight());
            int i = e[0];
            int i2 = e[1];
            ImageView imageView = new ImageView(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
            layoutParams.gravity = 17;
            imageView.setImageBitmap(bitmap);
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setBackgroundColor(-16777216);
            addView(imageView2, new FrameLayout.LayoutParams(getTextureView().getWidth(), getTextureView().getHeight()));
            addView(imageView, layoutParams);
        }
    }

    /* renamed from: o */
    public void mo78639o(C62369u0 u0Var, boolean z, FeedData feedData) {
        C87412m.m108594g(u0Var, "video");
        C87412m.m108594g(feedData, "feedData");
        StringBuilder sb = new StringBuilder();
        sb.append("setVideoMediaInfo ");
        C62367r0 r0Var = (C62367r0) u0Var;
        sb.append(r0Var.getUrl());
        mo79410L(sb.toString());
        this.f161676j = new C59673q2(r0Var.getUrl(), r0Var.getPath(), r0Var.mo11841b(), u0Var.mo87421f(), u0Var, feedData);
        String coverUrl = getCoverUrl();
        if (!(coverUrl == null || coverUrl.length() == 0)) {
            ImageView imageView = this.f161677n;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85955a(new C11991t(coverUrl));
            C59665n0 n0Var = new C59665n0(this);
            a.getClass();
            a.f291320d = n0Var;
            a.mo85951a();
        }
        C60211v2 v2Var = this.f161679p;
        if (v2Var != null) {
            v2Var.mo85206d(feedData, (FinderItem) null);
        }
    }

    /* renamed from: p */
    public C62294j mo78640p(long j) {
        TextureView videoView = getTextureView().getVideoView();
        if ((videoView != null ? videoView.getSurfaceTexture() : null) == null || !C54781k2.f153552a.mo75682c()) {
            return null;
        }
        int i = this.f161681r;
        int i2 = this.f161682s;
        float f = (((float) i) * 1.0f) / ((float) i2);
        C61401a aVar = C61401a.FINDER;
        C58924d dVar = this.f161670d;
        this.f161670d = null;
        mo79403E(false);
        C60211v2 v2Var = this.f161679p;
        if (v2Var != null) {
            v2Var.mo85205c();
        }
        TextureView videoView2 = getTextureView().getVideoView();
        C87412m.m108593f(videoView2, "textureView.videoView");
        C62292g gVar = new C62292g(aVar, j, this, i, i2, f, dVar, (SurfaceTexture) null, videoView2, false, false);
        gVar.f177080m = this;
        mo79405G();
        return gVar;
    }

    public boolean pause() {
        mo79410L("pause");
        C58924d dVar = this.f161670d;
        if (dVar != null) {
            dVar.stopPlay(false);
        }
        this.f161668G = true;
        C59684w2 w2Var = this.f161674h;
        if (w2Var != null) {
            C59673q2 q2Var = this.f161676j;
            C59684w2.C59685a.m69601a(w2Var, q2Var != null ? q2Var.f170494d : null, (C61575s) null, 2, (Object) null);
        }
        mo79405G();
        return true;
    }

    public boolean play() {
        return true;
    }

    /* renamed from: q */
    public int mo51226q() {
        mo79410L("pauseWithCancel");
        C58924d dVar = this.f161670d;
        if (dVar != null) {
            dVar.stopPlay(false);
        }
        this.f161668G = true;
        return 0;
    }

    /* renamed from: s */
    public boolean mo51228s() {
        mo79410L("prepareToPlay");
        return true;
    }

    public final void setAutoJustRenderMode(boolean z) {
        this.f161675i = z;
    }

    public void setContextSimpleName(String str) {
        C87412m.m108594g(str, "name");
    }

    public void setContextTag(int i) {
        this.f161680q = i;
    }

    public void setFinderVideoPlayTrace(C12931a aVar) {
    }

    public void setFullScreenEnjoy(boolean z) {
    }

    public void setIMMVideoViewCallback(C60157c5 c5Var) {
        C87412m.m108594g(c5Var, "_callback");
        mo79410L("setIMMVideoViewCallback _callback:" + c5Var.hashCode());
        this.f161673g = c5Var;
    }

    public void setIOnlineVideoProxy(C55394a aVar) {
        C87412m.m108594g(aVar, "_proxy");
    }

    public void setInterceptDetach(boolean z) {
    }

    public void setIsShouldPlayResume(boolean z) {
        mo79410L("setIsShouldPlayResume: " + z);
        this.f161665D = z;
    }

    public void setIsShowBasicControls(boolean z) {
    }

    public final void setLifecycle(C59684w2 w2Var) {
        this.f161674h = w2Var;
    }

    public final void setLiveFreeTimerInit(boolean z) {
        this.f161688y = z;
    }

    public void setLoop(boolean z) {
    }

    public void setMute(boolean z) {
        mo79410L("setMute " + z);
        C58924d dVar = this.f161670d;
        if (dVar != null) {
            dVar.setMute(z);
        }
    }

    public final void setNeverStart(boolean z) {
        this.f161666E = z;
    }

    public void setPreloadedView(boolean z) {
        this.f161686w = z;
    }

    public void setPreview(boolean z) {
        mo79410L("setPreview: " + z);
        this.f161667F = z;
    }

    public void setScaleType(C96814a.C96817e eVar) {
        C87412m.m108594g(eVar, "scaleType");
        C58924d dVar = this.f161670d;
        if (dVar != null) {
            dVar.setRenderMode(eVar == C96814a.C96817e.CONTAIN ? 1 : 0);
        }
    }

    public final void setShouldPlayResume(boolean z) {
        this.f161665D = z;
    }

    public final void setSupportPauseResume(boolean z) {
        this.f161669H = z;
    }

    public final void setTextureView(C59668o0 o0Var) {
        C87412m.m108594g(o0Var, "<set-?>");
        this.f161671e = o0Var;
    }

    public final void setTxLivePlayer(C58924d dVar) {
        this.f161670d = dVar;
    }

    public void setVideoMuteListener(C59674r2 r2Var) {
        C87412m.m108594g(r2Var, "muteListener");
    }

    public void setVideoPlayLifecycle(C59684w2 w2Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("setVideoPlayLifecycle _callback:");
        sb.append(w2Var != null ? w2Var.hashCode() : 0);
        mo79410L(sb.toString());
        this.f161674h = w2Var;
    }

    public final void setVideoViewCallback(C96814a.C57541b bVar) {
        this.f161673g = bVar;
    }

    public void setVideoViewFocused(boolean z) {
        Log.m105924i("Finder.FinderLivePlayView", "setVideoViewFocused " + z);
        this.f161664C = z;
    }

    public final void setViewFocused(boolean z) {
        this.f161664C = z;
    }

    public void stop() {
        mo79410L("stop");
        mo79403E(false);
        C58924d dVar = this.f161670d;
        if (dVar != null) {
            dVar.stopPlay(true);
        }
        this.f161668G = false;
        this.f161666E = true;
        C59684w2 w2Var = this.f161674h;
        if (w2Var != null) {
            C59684w2.C59685a.m69602b(w2Var, this.f161676j, (C61575s) null, 2, (Object) null);
        }
        C47428d dVar2 = this.f161662A;
        if (dVar2 != null) {
            dVar2.mo72453c();
        }
    }

    /* renamed from: t */
    public void mo51232t() {
        this.f161673g = null;
        this.f161674h = null;
    }

    /* renamed from: v */
    public boolean mo78668v() {
        C37521f.f99374d.getClass();
        if (C37521f.f99135B6.mo60266n().intValue() != 1) {
            return false;
        }
        C37521f.f99374d.getClass();
        return C37521f.f99578z6.mo60266n().intValue() == 1 && !C85875k4.m106157N() && !C85875k4.m106167X();
    }

    /* renamed from: w */
    public void mo78669w() {
    }

    /* renamed from: x */
    public boolean mo51233x(double d, boolean z, int i) {
        return false;
    }

    /* renamed from: y */
    public boolean mo78670y() {
        return this.f161686w;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLivePlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo79407I();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLivePlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo79407I();
    }
}
