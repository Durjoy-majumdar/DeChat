package com.tencent.p014mm.plugin.finder.replay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import bf1.C54452a;
import com.tencent.p014mm.modelvideo.C55394a;
import com.tencent.p014mm.plugin.finder.detector.FinderMMPlayerDetector;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPPlayerMsg;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import er1.C58739j4;
import er1.C58764p0;
import f50.C58924d;
import fs3.C59314b;
import fs3.C59316c;
import fs3.C59318d;
import fy3.C32224a;
import fy3.C32227p;
import gr1.C59662l2;
import gr1.C59670o2;
import gr1.C59673q2;
import gr1.C59674r2;
import gr1.C59684w2;
import gr1.C59688y0;
import gs3.C59698c;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60157c5;
import iy3.C60641c;
import j03.C60698b;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import m03.C61425b;
import mr1.C61575s;
import mr1.C61576t;
import o40.C61926c;
import p501dz.C58464f;
import p501dz.C58467i;
import ph1.C62294j;
import pl1.C62369u0;
import qt1.C12931a;
import rx3.C13598b0;
import rx3.C13605o;
import rx3.C36570n;
import te3.C64450iq0;
import te3.C64689rq2;
import up1.C37521f;
import vp1.C65840n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0001\u0001B!\b\u0016\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001B*\b\u0016\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001\u0012\u0007\u0010\u0001\u001a\u00020\u0006¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u0006H\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\b\u0010\"\u001a\u00020\u000eH\u0016J\b\u0010$\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020\u000eH\u0016J\b\u0010&\u001a\u00020\u000eH\u0016J\n\u0010(\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u000eH\u0016J\u0010\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u000eH\u0016J\u0010\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u000eH\u0016J\n\u0010/\u001a\u0004\u0018\u00010#H\u0016J\u0010\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020\u000eH\u0016J\u0010\u00103\u001a\u00020\b2\u0006\u00102\u001a\u00020\u000eH\u0016J\u0010\u00106\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0016J\u0010\u00109\u001a\u00020\b2\u0006\u00108\u001a\u000207H\u0016J\u0006\u0010:\u001a\u00020\u0006J\u0010\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020;H\u0016J\u0010\u0010?\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u000eH\u0016J\u0010\u0010A\u001a\u00020\b2\u0006\u0010@\u001a\u00020\u000eH\u0016J\u0012\u0010D\u001a\u00020\b2\b\u0010C\u001a\u0004\u0018\u00010BH\u0016J\u0010\u0010G\u001a\u00020\b2\u0006\u0010F\u001a\u00020EH\u0016J\u0012\u0010J\u001a\u00020\b2\b\u0010I\u001a\u0004\u0018\u00010HH\u0016J\n\u0010L\u001a\u0004\u0018\u00010KH\u0016J\u0006\u0010M\u001a\u00020\u0004J\u000e\u0010P\u001a\u00020\b2\u0006\u0010O\u001a\u00020NR\"\u0010W\u001a\u00020\u000e8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010^\u001a\u00020N8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010`\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b_\u0010R\u001a\u0004\b`\u0010T\"\u0004\ba\u0010VR\"\u0010c\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bb\u0010R\u001a\u0004\bc\u0010T\"\u0004\bd\u0010VR$\u0010l\u001a\u0004\u0018\u00010e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR6\u0010u\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\b\u0018\u00010m8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010C\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R'\u0010\u0001\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\"\u0006\b\u0001\u0010\u0001R,\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R&\u0010\u0001\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010R\u001a\u0005\b\u0001\u0010T\"\u0005\b\u0001\u0010V¨\u0006\u0001"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/replay/FinderLiveThumbPlayerProxy;", "Lgr1/o2;", "Landroid/widget/FrameLayout;", "Lbf1/a;", "", "getProxyState", "", "status", "Lrx3/b0;", "setBgPrepareStatus", "key", "setDecryptionKey", "Lgr1/q2;", "getVideoMediaInfo", "", "isFull", "setFullScreenEnjoy", "Lfs3/d;", "getEventDetector", "Lfs3/b;", "getEventDetectorAdapter", "Landroid/graphics/Bitmap;", "getBitmap", "getVideoMediaId", "tag", "setContextTag", "Lgr1/l2;", "getVideoAdapter", "getContextTag", "getCurrentPlaySecond", "", "getCurrentPlayMs", "getVideoDuration", "getVideoDurationMs", "getVideoViewFocused", "Landroid/view/View;", "getVideoView", "getIsShouldPlayResume", "getIsNeverStart", "Landroid/view/ViewParent;", "getParentView", "shouldPlayResume", "setIsShouldPlayResume", "focused", "setVideoViewFocused", "isPreview", "setPreview", "getPlayerView", "isInterceptDetach", "setInterceptDetach", "isMute", "setMute", "Lht1/c5;", "_callback", "setIMMVideoViewCallback", "Lcom/tencent/mm/pluginsdk/ui/a$e;", "scaleType", "setScaleType", "getScaleType", "Lcom/tencent/mm/modelvideo/a;", "_proxy", "setIOnlineVideoProxy", "isShow", "setIsShowBasicControls", "loop", "setLoop", "Lgr1/w2;", "lifecycle", "setVideoPlayLifecycle", "Lgr1/r2;", "muteListener", "setVideoMuteListener", "Lqt1/a;", "videoPlayTrace", "setFinderVideoPlayTrace", "", "getPlayer", "getFTPPTag", "", "ratio", "setPlaySpeed", "D", "Z", "y", "()Z", "setPreloadedView", "(Z)V", "isPreloadedView", "H", "F", "getPlaySpeedRatio", "()F", "setPlaySpeedRatio", "(F)V", "playSpeedRatio", "J", "isViewFocused", "setViewFocused", "K", "isShouldPlayResume", "setShouldPlayResume", "Lcom/tencent/mm/pluginsdk/ui/a$b;", "L", "Lcom/tencent/mm/pluginsdk/ui/a$b;", "getVideoViewCallback", "()Lcom/tencent/mm/pluginsdk/ui/a$b;", "setVideoViewCallback", "(Lcom/tencent/mm/pluginsdk/ui/a$b;)V", "videoViewCallback", "Lkotlin/Function2;", "Lcom/tencent/thumbplayer/api/TPPlayerMsg$TPVideoSeiInfo;", "M", "Lfy3/p;", "getSeiInfoCallback", "()Lfy3/p;", "setSeiInfoCallback", "(Lfy3/p;)V", "seiInfoCallback", "N", "Lgr1/w2;", "getLifecycle", "()Lgr1/w2;", "setLifecycle", "(Lgr1/w2;)V", "P", "Lgr1/r2;", "getOnMuteListener", "()Lgr1/r2;", "setOnMuteListener", "(Lgr1/r2;)V", "onMuteListener", "Lcom/tencent/mm/plugin/finder/replay/FinderLiveThumbPlayerProxy$a;", "onPlayerStopListener", "Lcom/tencent/mm/plugin/finder/replay/FinderLiveThumbPlayerProxy$a;", "getOnPlayerStopListener", "()Lcom/tencent/mm/plugin/finder/replay/FinderLiveThumbPlayerProxy$a;", "setOnPlayerStopListener", "(Lcom/tencent/mm/plugin/finder/replay/FinderLiveThumbPlayerProxy$a;)V", "isStartCdn", "setStartCdn", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy */
public final class FinderLiveThumbPlayerProxy extends FrameLayout implements C59670o2, C54452a {

    /* renamed from: Q */
    public static final HashSet<Integer> f160745Q = new HashSet<>();

    /* renamed from: A */
    public final C59316c<C54452a> f160746A;

    /* renamed from: B */
    public final C59314b f160747B;

    /* renamed from: C */
    public C12931a f160748C;

    /* renamed from: D */
    public boolean f160749D;

    /* renamed from: E */
    public boolean f160750E;

    /* renamed from: F */
    public boolean f160751F;

    /* renamed from: G */
    public C61575s f160752G;

    /* renamed from: H */
    public float f160753H;

    /* renamed from: I */
    public boolean f160754I;

    /* renamed from: J */
    public boolean f160755J;

    /* renamed from: K */
    public boolean f160756K;

    /* renamed from: L */
    public C96814a.C57541b f160757L;

    /* renamed from: M */
    public C32227p<? super Integer, ? super TPPlayerMsg.TPVideoSeiInfo, C13598b0> f160758M;

    /* renamed from: N */
    public C59684w2 f160759N;

    /* renamed from: P */
    public C59674r2 f160760P;

    /* renamed from: d */
    public String f160761d = "FTPP.FinderLiveThumbPlayerProxy";

    /* renamed from: e */
    public boolean f160762e;

    /* renamed from: f */
    public C60698b f160763f;

    /* renamed from: g */
    public C56255b f160764g;

    /* renamed from: h */
    public C61425b f160765h;

    /* renamed from: i */
    public Surface f160766i;

    /* renamed from: j */
    public SurfaceTexture f160767j;

    /* renamed from: n */
    public volatile int f160768n;

    /* renamed from: o */
    public volatile boolean f160769o;

    /* renamed from: p */
    public C59673q2 f160770p;

    /* renamed from: q */
    public String f160771q;

    /* renamed from: r */
    public boolean f160772r;

    /* renamed from: s */
    public boolean f160773s;

    /* renamed from: t */
    public boolean f160774t;

    /* renamed from: u */
    public int f160775u;

    /* renamed from: v */
    public C61576t f160776v;

    /* renamed from: w */
    public MTimerHandler f160777w;

    /* renamed from: x */
    public MMHandler f160778x;

    /* renamed from: y */
    public Runnable f160779y;

    /* renamed from: z */
    public int f160780z;

    /* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy$a */
    public interface C56254a {
        /* renamed from: a */
        void mo78672a();
    }

    /* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy$b */
    public final class C56255b implements TextureView.SurfaceTextureListener, ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnVideoSizeChangedListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnErrorListener, ITPPlayerListener.IOnSeekCompleteListener {
        public C56255b() {
        }

        public void onCompletion(ITPPlayer iTPPlayer) {
            FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = FinderLiveThumbPlayerProxy.this;
            HashSet<Integer> hashSet = FinderLiveThumbPlayerProxy.f160745Q;
            finderLiveThumbPlayerProxy.mo78637j(7);
            String fTPPTag = FinderLiveThumbPlayerProxy.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onCompletion() " + FinderLiveThumbPlayerProxy.m64407e(FinderLiveThumbPlayerProxy.this));
            C96814a.C57541b videoViewCallback = FinderLiveThumbPlayerProxy.this.getVideoViewCallback();
            if (videoViewCallback != null) {
                C59673q2 q2Var = FinderLiveThumbPlayerProxy.this.f160770p;
                videoViewCallback.mo22958L("", q2Var != null ? q2Var.f170493c : null);
            }
        }

        public void onError(ITPPlayer iTPPlayer, int i, int i2, long j, long j2) {
            C96814a.C57541b videoViewCallback;
            C87412m.m108594g(iTPPlayer, "player");
            String fTPPTag = FinderLiveThumbPlayerProxy.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onError() " + i + ' ' + i2 + " bgPrepareStatus:" + FinderLiveThumbPlayerProxy.this.f160775u + ' ' + FinderLiveThumbPlayerProxy.m64407e(FinderLiveThumbPlayerProxy.this));
            FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = FinderLiveThumbPlayerProxy.this;
            if (finderLiveThumbPlayerProxy.f160775u != 0) {
                iTPPlayer.reset();
                FinderLiveThumbPlayerProxy.this.mo51228s();
                return;
            }
            C59673q2 q2Var = finderLiveThumbPlayerProxy.f160770p;
            if (q2Var != null && (videoViewCallback = finderLiveThumbPlayerProxy.getVideoViewCallback()) != null) {
                videoViewCallback.mo22960T("", q2Var.f170493c, "", i2, i);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: te3.rq2} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: te3.rq2} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: com.tencent.mm.protocal.protobuf.FinderMediaReportObject} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: te3.rq2} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: com.tencent.thumbplayer.api.TPPlayerMsg$TPVideoSeiInfo} */
        /* JADX WARNING: type inference failed for: r8v3 */
        /* JADX WARNING: type inference failed for: r8v17 */
        /* JADX WARNING: type inference failed for: r8v18 */
        /* JADX WARNING: type inference failed for: r8v19 */
        /* JADX WARNING: type inference failed for: r8v20 */
        /* JADX WARNING: type inference failed for: r8v21 */
        /* JADX WARNING: type inference failed for: r8v22 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onInfo(com.tencent.thumbplayer.api.ITPPlayer r3, int r4, long r5, long r7, java.lang.Object r9) {
            /*
                r2 = this;
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "FTPP.onInfo() what:"
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = " arg1:"
                r0.append(r1)
                r0.append(r5)
                java.lang.String r1 = " arg2:"
                r0.append(r1)
                r0.append(r7)
                java.lang.String r7 = " extraObject:"
                r0.append(r7)
                r0.append(r9)
                r7 = 32
                r0.append(r7)
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r8 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.String r8 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.m64407e(r8)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
                r3 = 105(0x69, float:1.47E-43)
                if (r4 == r3) goto L_0x0325
                r3 = 106(0x6a, float:1.49E-43)
                r8 = 0
                if (r4 == r3) goto L_0x02cb
                r3 = 150(0x96, float:2.1E-43)
                if (r4 == r3) goto L_0x0296
                r3 = 204(0xcc, float:2.86E-43)
                if (r4 == r3) goto L_0x0237
                r3 = 1006(0x3ee, float:1.41E-42)
                if (r4 == r3) goto L_0x01f9
                r3 = 200(0xc8, float:2.8E-43)
                if (r4 == r3) goto L_0x01a1
                r3 = 201(0xc9, float:2.82E-43)
                if (r4 == r3) goto L_0x0150
                r3 = 502(0x1f6, float:7.03E-43)
                if (r4 == r3) goto L_0x0083
                r3 = 503(0x1f7, float:7.05E-43)
                if (r4 == r3) goto L_0x0067
                goto L_0x0345
            L_0x0067:
                boolean r3 = r9 instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoSeiInfo
                if (r3 == 0) goto L_0x006e
                r8 = r9
                com.tencent.thumbplayer.api.TPPlayerMsg$TPVideoSeiInfo r8 = (com.tencent.thumbplayer.api.TPPlayerMsg.TPVideoSeiInfo) r8
            L_0x006e:
                if (r8 == 0) goto L_0x0345
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                fy3.p r3 = r3.getSeiInfoCallback()
                if (r3 == 0) goto L_0x0345
                int r4 = r8.videoSeiType
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3.invoke(r4, r9)
                goto L_0x0345
            L_0x0083:
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "FTPP.onInfo#mediaCodecInfo:"
                r4.append(r0)
                r4.append(r5)
                r4.append(r7)
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r5 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                gr1.q2 r5 = r5.f160770p
                if (r5 == 0) goto L_0x00a2
                java.lang.String r5 = r5.f170493c
                goto L_0x00a3
            L_0x00a2:
                r5 = r8
            L_0x00a3:
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                boolean r3 = r9 instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo
                if (r3 != 0) goto L_0x00bd
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.String r4 = "FTPP.onInfo#mediaCodecInfo return for not codecInfo"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r4)
                return
            L_0x00bd:
                r3 = r9
                com.tencent.thumbplayer.api.TPPlayerMsg$TPMediaCodecInfo r3 = (com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo) r3
                int r4 = r3.mediaType
                int r5 = com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo.TP_DEC_MEDIA_TYPE_VIDEO
                if (r4 == r5) goto L_0x00d2
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.String r4 = "FTPP.onInfo#mediaCodecInfo return for not video type"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r4)
                return
            L_0x00d2:
                int r3 = r3.infoType
                int r4 = com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo.TP_INFO_MEDIA_CODEC_READY
                if (r3 != r4) goto L_0x011d
                c30.g r3 = new c30.g     // Catch:{ all -> 0x011b }
                com.tencent.thumbplayer.api.TPPlayerMsg$TPMediaCodecInfo r9 = (com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo) r9     // Catch:{ all -> 0x011b }
                java.lang.String r4 = r9.msg     // Catch:{ all -> 0x011b }
                r3.<init>((java.lang.String) r4)     // Catch:{ all -> 0x011b }
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r4 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this     // Catch:{ all -> 0x011b }
                mr1.t r4 = r4.f160776v     // Catch:{ all -> 0x011b }
                r5 = 1
                r6 = -1
                if (r4 != 0) goto L_0x00ea
                goto L_0x00f7
            L_0x00ea:
                java.lang.String r7 = "reuseEnable"
                boolean r7 = r3.optBoolean(r7)     // Catch:{ all -> 0x011b }
                if (r7 == 0) goto L_0x00f4
                r7 = 1
                goto L_0x00f5
            L_0x00f4:
                r7 = -1
            L_0x00f5:
                r4.f175139c = r7     // Catch:{ all -> 0x011b }
            L_0x00f7:
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r4 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this     // Catch:{ all -> 0x011b }
                mr1.t r4 = r4.f160776v     // Catch:{ all -> 0x011b }
                if (r4 != 0) goto L_0x00fe
                goto L_0x010a
            L_0x00fe:
                java.lang.String r7 = "isReuse"
                boolean r7 = r3.optBoolean(r7)     // Catch:{ all -> 0x011b }
                if (r7 == 0) goto L_0x0107
                goto L_0x0108
            L_0x0107:
                r5 = -1
            L_0x0108:
                r4.f175140d = r5     // Catch:{ all -> 0x011b }
            L_0x010a:
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r4 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this     // Catch:{ all -> 0x011b }
                mr1.t r4 = r4.f160776v     // Catch:{ all -> 0x011b }
                if (r4 != 0) goto L_0x0111
                goto L_0x0139
            L_0x0111:
                java.lang.String r5 = "totalCodec"
                int r3 = r3.optInt(r5)     // Catch:{ all -> 0x011b }
                r4.f175141e = r3     // Catch:{ all -> 0x011b }
                goto L_0x0139
            L_0x011b:
                goto L_0x0139
            L_0x011d:
                int r4 = com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo.TP_INFO_MEDIA_CODEC_EXCEPTION
                if (r3 != r4) goto L_0x0139
                c30.g r3 = new c30.g     // Catch:{ all -> 0x011b }
                com.tencent.thumbplayer.api.TPPlayerMsg$TPMediaCodecInfo r9 = (com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo) r9     // Catch:{ all -> 0x011b }
                java.lang.String r4 = r9.msg     // Catch:{ all -> 0x011b }
                r3.<init>((java.lang.String) r4)     // Catch:{ all -> 0x011b }
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r4 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this     // Catch:{ all -> 0x011b }
                mr1.t r4 = r4.f160776v     // Catch:{ all -> 0x011b }
                if (r4 != 0) goto L_0x0131
                goto L_0x0139
            L_0x0131:
                java.lang.String r5 = "errorCodec"
                java.lang.String r3 = r3.optString(r5)     // Catch:{ all -> 0x011b }
                r4.f175142f = r3     // Catch:{ all -> 0x011b }
            L_0x0139:
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                gr1.w2 r3 = r3.getLifecycle()
                if (r3 == 0) goto L_0x0345
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r4 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                gr1.q2 r5 = r4.f160770p
                if (r5 == 0) goto L_0x0149
                te3.rq2 r8 = r5.f170494d
            L_0x0149:
                mr1.t r4 = r4.f160776v
                r3.mo78300i(r8, r4)
                goto L_0x0345
            L_0x0150:
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "FTPP.onInfo#onBufferingEnd() pos:"
                r4.append(r5)
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r5 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                long r5 = r5.getCurrentPlayMs()
                r4.append(r5)
                r4.append(r7)
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r5 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.String r5 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.m64407e(r5)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.Runnable r4 = r3.f160779y
                if (r4 == 0) goto L_0x0189
                com.tencent.mm.sdk.platformtools.MMHandler r5 = r3.f160778x
                r5.removeCallbacks(r4)
                r3.f160779y = r8
            L_0x0189:
                boolean r4 = r3.f160773s
                if (r4 == 0) goto L_0x0345
                r4 = 0
                r3.f160773s = r4
                com.tencent.mm.pluginsdk.ui.a$b r4 = r3.f160757L
                if (r4 == 0) goto L_0x0345
                gr1.q2 r3 = r3.f160770p
                if (r3 == 0) goto L_0x019a
                java.lang.String r8 = r3.f170493c
            L_0x019a:
                java.lang.String r3 = ""
                r4.mo22955F(r3, r8)
                goto L_0x0345
            L_0x01a1:
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "FTPP.onInfo#onBufferingStart() pos:"
                r4.append(r5)
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r5 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                long r5 = r5.getCurrentPlayMs()
                r4.append(r5)
                r4.append(r7)
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r5 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.String r5 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.m64407e(r5)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                gr1.q2 r4 = r3.f160770p
                if (r4 == 0) goto L_0x01d6
                java.lang.String r4 = r4.f170493c
                goto L_0x01d7
            L_0x01d6:
                r4 = r8
            L_0x01d7:
                java.lang.Runnable r5 = r3.f160779y
                if (r5 == 0) goto L_0x01e2
                com.tencent.mm.sdk.platformtools.MMHandler r6 = r3.f160778x
                r6.removeCallbacks(r5)
                r3.f160779y = r8
            L_0x01e2:
                vo1.m0 r5 = new vo1.m0
                r5.<init>(r3, r4)
                r3.f160779y = r5
                com.tencent.mm.sdk.platformtools.MMHandler r4 = r3.f160778x
                boolean r3 = r3.f160769o
                if (r3 == 0) goto L_0x01f2
                r6 = 500(0x1f4, double:2.47E-321)
                goto L_0x01f4
            L_0x01f2:
                r6 = 1000(0x3e8, double:4.94E-321)
            L_0x01f4:
                r4.postDelayed(r5, r6)
                goto L_0x0345
            L_0x01f9:
                boolean r3 = r9 instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo
                if (r3 == 0) goto L_0x0345
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "FTPP.onInfo#downloadProgressUpdate: "
                r4.append(r5)
                com.tencent.thumbplayer.api.TPPlayerMsg$TPDownLoadProgressInfo r9 = (com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo) r9
                long r5 = r9.playableDurationMS
                r4.append(r5)
                r5 = 44
                r4.append(r5)
                int r6 = r9.downloadSpeedKBps
                r4.append(r6)
                r4.append(r5)
                long r6 = r9.currentDownloadSize
                r4.append(r6)
                r4.append(r5)
                long r5 = r9.totalFileSize
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                goto L_0x0345
            L_0x0237:
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r9 = "FTPP.onInfo#videoDecodeType:"
                r4.append(r9)
                r4.append(r5)
                r4.append(r7)
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r7 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                gr1.q2 r7 = r7.f160770p
                if (r7 == 0) goto L_0x0256
                java.lang.String r7 = r7.f170493c
                goto L_0x0257
            L_0x0256:
                r7 = r8
            L_0x0257:
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                gr1.q2 r3 = r3.f160770p
                if (r3 == 0) goto L_0x026e
                te3.rq2 r4 = r3.f170494d
                if (r4 == 0) goto L_0x026e
                com.tencent.mm.protocal.protobuf.FinderMediaReportObject r4 = r4.f185262W0
                goto L_0x026f
            L_0x026e:
                r4 = r8
            L_0x026f:
                if (r4 != 0) goto L_0x0281
                if (r3 == 0) goto L_0x0276
                te3.rq2 r3 = r3.f170494d
                goto L_0x0277
            L_0x0276:
                r3 = r8
            L_0x0277:
                if (r3 != 0) goto L_0x027a
                goto L_0x0281
            L_0x027a:
                com.tencent.mm.protocal.protobuf.FinderMediaReportObject r4 = new com.tencent.mm.protocal.protobuf.FinderMediaReportObject
                r4.<init>()
                r3.f185262W0 = r4
            L_0x0281:
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                gr1.q2 r3 = r3.f160770p
                if (r3 == 0) goto L_0x028d
                te3.rq2 r3 = r3.f170494d
                if (r3 == 0) goto L_0x028d
                com.tencent.mm.protocal.protobuf.FinderMediaReportObject r8 = r3.f185262W0
            L_0x028d:
                if (r8 != 0) goto L_0x0291
                goto L_0x0345
            L_0x0291:
                int r3 = (int) r5
                r8.playDecoderType = r3
                goto L_0x0345
            L_0x0296:
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "FTPP.onInfo#onReplay() "
                r4.append(r5)
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r5 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.String r5 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.m64407e(r5)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                gr1.w2 r3 = r3.getLifecycle()
                if (r3 == 0) goto L_0x0345
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r4 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                gr1.q2 r4 = r4.f160770p
                if (r4 == 0) goto L_0x02c6
                te3.rq2 r8 = r4.f170494d
            L_0x02c6:
                r3.mo78299h(r8)
                goto L_0x0345
            L_0x02cb:
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "FTPP.onInfo#firstVideoFrameRendered "
                r4.append(r5)
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r5 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.String r5 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.m64407e(r5)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.String r4 = "onFirstFrameRendered"
                r3.mo78671z(r4)
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                qt1.a r3 = r3.f160748C
                if (r3 == 0) goto L_0x02fd
                java.lang.String r4 = "onRendered"
                r3.mo11310b(r4)
            L_0x02fd:
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                mr1.s r4 = r3.f160752G
                qt1.a r3 = r3.f160748C
                if (r3 == 0) goto L_0x030a
                org.json.JSONObject r3 = r3.mo12483d()
                goto L_0x030b
            L_0x030a:
                r3 = r8
            L_0x030b:
                r4.f175114A = r3
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                gr1.w2 r3 = r3.getLifecycle()
                if (r3 == 0) goto L_0x0345
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r4 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                gr1.q2 r5 = r4.f160770p
                if (r5 == 0) goto L_0x031d
                te3.rq2 r8 = r5.f170494d
            L_0x031d:
                r5 = 0
                qt1.a r4 = r4.f160748C
                r3.mo78297f(r8, r5, r4)
                goto L_0x0345
            L_0x0325:
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "FTPP.onInfo#firstAudioFrameRendered "
                r4.append(r5)
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r5 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.this
                java.lang.String r5 = com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.m64407e(r5)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            L_0x0345:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.C56255b.onInfo(com.tencent.thumbplayer.api.ITPPlayer, int, long, long, java.lang.Object):void");
        }

        public void onPrepared(ITPPlayer iTPPlayer) {
            C87412m.m108594g(iTPPlayer, "player");
            String fTPPTag = FinderLiveThumbPlayerProxy.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.OnPrepared() " + FinderLiveThumbPlayerProxy.m64407e(FinderLiveThumbPlayerProxy.this));
            C12931a aVar = FinderLiveThumbPlayerProxy.this.f160748C;
            if (aVar != null) {
                aVar.mo12482c("onPrepared");
            }
            FinderLiveThumbPlayerProxy.this.mo78637j(4);
            C96814a.C57541b videoViewCallback = FinderLiveThumbPlayerProxy.this.getVideoViewCallback();
            if (videoViewCallback != null) {
                C59673q2 q2Var = FinderLiveThumbPlayerProxy.this.f160770p;
                videoViewCallback.mo22962Z("", q2Var != null ? q2Var.f170493c : null);
            }
            FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = FinderLiveThumbPlayerProxy.this;
            if (!finderLiveThumbPlayerProxy.f160755J || finderLiveThumbPlayerProxy.f160751F) {
                finderLiveThumbPlayerProxy.setBgPrepareStatus(1);
                iTPPlayer.pauseDownload();
            } else {
                finderLiveThumbPlayerProxy.mo78601F(2);
            }
            FinderLiveThumbPlayerProxy.this.f160751F = false;
        }

        public void onSeekComplete(ITPPlayer iTPPlayer) {
            C96814a.C57541b videoViewCallback = FinderLiveThumbPlayerProxy.this.getVideoViewCallback();
            if (videoViewCallback != null) {
                videoViewCallback.onSeekComplete(iTPPlayer);
            }
        }

        public void onStateChange(int i, int i2) {
            String fTPPTag = FinderLiveThumbPlayerProxy.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onStateChange() preState:" + i + " curState:" + i2 + ' ' + FinderLiveThumbPlayerProxy.m64407e(FinderLiveThumbPlayerProxy.this));
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Boolean bool;
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            String fTPPTag = FinderLiveThumbPlayerProxy.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onSurfaceTextureAvailable() width:" + i + " height:" + i2 + " surfaceTexture:" + surfaceTexture.hashCode() + ' ' + FinderLiveThumbPlayerProxy.m64407e(FinderLiveThumbPlayerProxy.this));
            C12931a aVar = FinderLiveThumbPlayerProxy.this.f160748C;
            if (aVar != null) {
                aVar.mo12482c("onSurfaceAva");
            }
            FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = FinderLiveThumbPlayerProxy.this;
            if (finderLiveThumbPlayerProxy.f160766i != null) {
                if (Build.VERSION.SDK_INT < 26) {
                    bool = Boolean.FALSE;
                } else {
                    SurfaceTexture surfaceTexture2 = finderLiveThumbPlayerProxy.f160767j;
                    bool = surfaceTexture2 != null ? Boolean.valueOf(surfaceTexture2.isReleased()) : null;
                }
                String fTPPTag2 = FinderLiveThumbPlayerProxy.this.getFTPPTag();
                StringBuilder sb = new StringBuilder();
                sb.append("FTPP.onSurfaceTextureAvailable() return for surface:");
                Surface surface = FinderLiveThumbPlayerProxy.this.f160766i;
                sb.append(surface != null ? Integer.valueOf(surface.hashCode()) : null);
                sb.append(" valid:");
                Surface surface2 = FinderLiveThumbPlayerProxy.this.f160766i;
                sb.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null);
                sb.append(" released:");
                sb.append(bool);
                sb.append(" isReusing:");
                sb.append(FinderLiveThumbPlayerProxy.this.f160750E);
                Log.m105924i(fTPPTag2, sb.toString());
                FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy2 = FinderLiveThumbPlayerProxy.this;
                C61425b bVar = finderLiveThumbPlayerProxy2.f160765h;
                if (bVar != null) {
                    SurfaceTexture surfaceTexture3 = finderLiveThumbPlayerProxy2.f160767j;
                    C87412m.m108591d(surfaceTexture3);
                    bVar.setSurfaceTexture(surfaceTexture3);
                    return;
                }
                C87412m.m108603p("textureView");
                throw null;
            }
            finderLiveThumbPlayerProxy.f160767j = surfaceTexture;
            finderLiveThumbPlayerProxy.f160766i = new Surface(surfaceTexture);
            FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy3 = FinderLiveThumbPlayerProxy.this;
            C60698b bVar2 = finderLiveThumbPlayerProxy3.f160763f;
            if (bVar2 != null) {
                bVar2.setSurface(finderLiveThumbPlayerProxy3.f160766i);
                FinderLiveThumbPlayerProxy.this.mo78601F(1);
                return;
            }
            C87412m.m108603p("player");
            throw null;
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            String fTPPTag = FinderLiveThumbPlayerProxy.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onSurfaceTextureDestroyed() surfaceTexture:" + surfaceTexture.hashCode() + ' ' + FinderLiveThumbPlayerProxy.m64407e(FinderLiveThumbPlayerProxy.this));
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            String fTPPTag = FinderLiveThumbPlayerProxy.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onSurfaceTextureSizeChanged  surfaceTexture:" + surfaceTexture.hashCode() + ' ' + i + ' ' + i2 + ' ' + FinderLiveThumbPlayerProxy.m64407e(FinderLiveThumbPlayerProxy.this));
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = FinderLiveThumbPlayerProxy.this;
            finderLiveThumbPlayerProxy.getClass();
            finderLiveThumbPlayerProxy.f160752G.f175118e++;
        }

        public void onVideoSizeChanged(ITPPlayer iTPPlayer, long j, long j2) {
            String str;
            C59673q2 q2Var;
            C62369u0 u0Var;
            C64689rq2 f;
            String fTPPTag = FinderLiveThumbPlayerProxy.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.OnVideoSizeChanged() width:" + j + " height:" + j2 + ' ' + FinderLiveThumbPlayerProxy.m64407e(FinderLiveThumbPlayerProxy.this));
            if (!(j <= 0 || j2 <= 0 || (q2Var = FinderLiveThumbPlayerProxy.this.f160770p) == null || (u0Var = q2Var.f170495e) == null || (f = u0Var.mo87421f()) == null)) {
                f.f185270h = (float) j;
                f.f185271i = (float) j2;
            }
            C96814a.C57541b videoViewCallback = FinderLiveThumbPlayerProxy.this.getVideoViewCallback();
            if (videoViewCallback != null) {
                C59673q2 q2Var2 = FinderLiveThumbPlayerProxy.this.f160770p;
                if (q2Var2 == null || (str = q2Var2.f170493c) == null) {
                    str = "";
                }
                videoViewCallback.mo22964l0("", str, (int) j, (int) j2);
            }
            C61425b bVar = FinderLiveThumbPlayerProxy.this.f160765h;
            if (bVar != null) {
                bVar.mo81140b((int) j, (int) j2);
            } else {
                C87412m.m108603p("textureView");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy$c */
    public static final class C56256c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveThumbPlayerProxy f160782d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56256c(FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy) {
            super(0);
            this.f160782d = finderLiveThumbPlayerProxy;
        }

        public Object invoke() {
            C60698b bVar = this.f160782d.f160763f;
            if (bVar != null) {
                bVar.release();
                this.f160782d.mo78641r();
                this.f160782d.mo78637j(11);
                String fTPPTag = this.f160782d.getFTPPTag();
                Log.m105924i(fTPPTag, "releaseInternal FinderThumbPlayerProxy " + this.f160782d.hashCode() + ' ' + FinderLiveThumbPlayerProxy.m64407e(this.f160782d));
                return C13598b0.f38549a;
            }
            C87412m.m108603p("player");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy$d */
    public static final class C56257d implements MTimerHandler.CallBack {

        /* renamed from: d */
        public long f160783d = -1;

        /* renamed from: e */
        public long f160784e = -1;

        /* renamed from: f */
        public final /* synthetic */ FinderLiveThumbPlayerProxy f160785f;

        /* renamed from: g */
        public final /* synthetic */ C59673q2 f160786g;

        public C56257d(FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy, C59673q2 q2Var) {
            this.f160785f = finderLiveThumbPlayerProxy;
            this.f160786g = q2Var;
        }

        public boolean onTimerExpired() {
            long currentPlayMs = this.f160785f.getCurrentPlayMs();
            long videoDurationMs = this.f160785f.getVideoDurationMs();
            if (this.f160784e != currentPlayMs) {
                C59684w2 lifecycle = this.f160785f.getLifecycle();
                if (lifecycle != null) {
                    lifecycle.mo78296d(this.f160786g.f170494d, currentPlayMs, videoDurationMs);
                }
                long j = this.f160783d;
                if (j == -1 || currentPlayMs - j > 1000 || currentPlayMs < j) {
                    C59684w2 lifecycle2 = this.f160785f.getLifecycle();
                    if (lifecycle2 != null) {
                        lifecycle2.mo78294c(this.f160786g.f170494d, ((int) currentPlayMs) / 1000, ((int) videoDurationMs) / 1000);
                    }
                    String fTPPTag = this.f160785f.getFTPPTag();
                    StringBuilder sb = new StringBuilder();
                    sb.append(currentPlayMs);
                    sb.append(XVFSFile.SEPARATOR_CHAR);
                    sb.append(videoDurationMs);
                    Log.m105924i(fTPPTag, sb.toString());
                    this.f160783d = currentPlayMs;
                }
                this.f160784e = currentPlayMs;
            }
            C61575s sVar = this.f160785f.f160752G;
            if (sVar == null) {
                return true;
            }
            sVar.mo86516e(currentPlayMs, videoDurationMs);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy$e */
    public static final class C56258e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveThumbPlayerProxy f160787d;

        /* renamed from: e */
        public final /* synthetic */ C59673q2 f160788e;

        /* renamed from: f */
        public final /* synthetic */ long f160789f;

        /* renamed from: g */
        public final /* synthetic */ long f160790g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56258e(FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy, C59673q2 q2Var, long j, long j2) {
            super(0);
            this.f160787d = finderLiveThumbPlayerProxy;
            this.f160788e = q2Var;
            this.f160789f = j;
            this.f160790g = j2;
        }

        public Object invoke() {
            C59684w2 lifecycle = this.f160787d.getLifecycle();
            if (lifecycle != null) {
                lifecycle.mo78294c(this.f160788e.f170494d, ((int) this.f160789f) / 1000, ((int) this.f160790g) / 1000);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveThumbPlayerProxy(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        C37521f.f99374d.getClass();
        this.f160762e = C37521f.f99213K3.mo60266n().intValue() == 1 && ((Boolean) ((C36570n) C37521f.f99183H).getValue()).booleanValue();
        this.f160772r = true;
        this.f160778x = new MMHandler(Looper.getMainLooper());
        this.f160780z = -1;
        C59316c<C54452a> cVar = new C59316c<>(this);
        this.f160746A = cVar;
        this.f160747B = new C59314b(cVar.mo84417a());
        new AtomicBoolean(true);
        this.f160752G = new C61575s();
        this.f160753H = 1.0f;
        mo78598C();
    }

    /* renamed from: e */
    public static final String m64407e(FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy) {
        return finderLiveThumbPlayerProxy.getProxyState();
    }

    private final String getProxyState() {
        boolean z = this.f160755J;
        float alpha = getAlpha();
        Surface surface = this.f160766i;
        Boolean valueOf = surface != null ? Boolean.valueOf(surface.isValid()) : null;
        int i = this.f160768n;
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append('-');
        sb.append(alpha);
        sb.append('-');
        sb.append(valueOf);
        sb.append('-');
        sb.append(i);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public final void setBgPrepareStatus(int i) {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "setBgPrepareStatus " + i + ' ' + getProxyState());
        this.f160775u = i;
    }

    /* renamed from: A */
    public void mo78597A(C58924d dVar, int i, int i2, long j) {
        C87412m.m108594g(dVar, "txPlayer");
    }

    /* renamed from: B */
    public boolean mo51221B(Integer num) {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "replay_step3-1:startOrPlay() " + getProxyState());
        this.f160752G.mo86515d();
        if (!this.f160755J) {
            String fTPPTag2 = getFTPPTag();
            Log.m105924i(fTPPTag2, "replay_step3-1-1:startOrPlay() return for isViewFocused:" + this.f160755J);
            return false;
        }
        C12931a aVar = this.f160748C;
        if (aVar != null) {
            aVar.mo12482c("startOrPlay");
        }
        if (this.f160772r) {
            Log.m105924i(getFTPPTag(), "replay_step3-1-1:startOrPlay() first time to play");
            C59684w2 w2Var = this.f160759N;
            C64689rq2 rq22 = null;
            if (w2Var != null) {
                C59673q2 q2Var = this.f160770p;
                w2Var.mo78300i(q2Var != null ? q2Var.f170494d : null, this.f160776v);
            }
            C59684w2 w2Var2 = this.f160759N;
            if (w2Var2 != null) {
                C59673q2 q2Var2 = this.f160770p;
                if (q2Var2 != null) {
                    rq22 = q2Var2.f170494d;
                }
                w2Var2.mo78305n(rq22, q2Var2, this.f160775u);
            }
            this.f160772r = false;
            C115669n.INSTANCE.mo175913w(1505, 252, 1);
        }
        if (mo78600E()) {
            String fTPPTag3 = getFTPPTag();
            Log.m105924i(fTPPTag3, "replay_step3-1-1:startOrPlay() return for currentPlayState:" + this.f160768n);
            mo78601F(3);
            return false;
        }
        C59673q2 q2Var3 = this.f160770p;
        if (q2Var3 == null) {
            return false;
        }
        mo78602G(q2Var3.f170493c, q2Var3.f170492b, num, 101);
        return true;
    }

    /* renamed from: C */
    public final void mo78598C() {
        HashSet<Integer> hashSet = f160745Q;
        hashSet.add(Integer.valueOf(hashCode()));
        Log.m105924i("FTPP.FinderLiveThumbPlayerProxy", "create FinderThumbPlayerProxy " + hashCode() + ' ' + hashSet);
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        this.f160763f = ((C58464f) C86312j.m106911c(C58464f.class)).mo82800a(context);
        this.f160764g = new C56255b();
        this.f160776v = new C61576t(this.f160762e ? 1 : 0);
        this.f160752G.mo86517f();
        Context context2 = MMApplicationContext.getContext();
        C87412m.m108593f(context2, "getContext()");
        C61425b L30 = ((C58467i) C86312j.m106911c(C58467i.class)).L30(context2);
        this.f160765h = L30;
        if (L30 != null) {
            L30.setOpaqueInfo(true);
            C61425b bVar = this.f160765h;
            if (bVar != null) {
                C56255b bVar2 = this.f160764g;
                if (bVar2 != null) {
                    bVar.setTextureListenerCallback(bVar2);
                    C60698b bVar3 = this.f160763f;
                    if (bVar3 != null) {
                        C56255b bVar4 = this.f160764g;
                        if (bVar4 != null) {
                            bVar3.setOnErrorListener(bVar4);
                            C60698b bVar5 = this.f160763f;
                            if (bVar5 != null) {
                                C56255b bVar6 = this.f160764g;
                                if (bVar6 != null) {
                                    bVar5.setOnPreparedListener(bVar6);
                                    C60698b bVar7 = this.f160763f;
                                    if (bVar7 != null) {
                                        C56255b bVar8 = this.f160764g;
                                        if (bVar8 != null) {
                                            bVar7.setOnVideoSizeChangedListener(bVar8);
                                            C60698b bVar9 = this.f160763f;
                                            if (bVar9 != null) {
                                                C56255b bVar10 = this.f160764g;
                                                if (bVar10 != null) {
                                                    bVar9.setOnPlayerStateChangeListener(bVar10);
                                                    C60698b bVar11 = this.f160763f;
                                                    if (bVar11 != null) {
                                                        C56255b bVar12 = this.f160764g;
                                                        if (bVar12 != null) {
                                                            bVar11.setOnInfoListener(bVar12);
                                                            C60698b bVar13 = this.f160763f;
                                                            if (bVar13 != null) {
                                                                C56255b bVar14 = this.f160764g;
                                                                if (bVar14 != null) {
                                                                    bVar13.setOnCompletionListener(bVar14);
                                                                    C60698b bVar15 = this.f160763f;
                                                                    if (bVar15 != null) {
                                                                        C56255b bVar16 = this.f160764g;
                                                                        if (bVar16 != null) {
                                                                            bVar15.setOnSeekCompleteListener(bVar16);
                                                                            mo78637j(1);
                                                                            return;
                                                                        }
                                                                        C87412m.m108603p("playerListener");
                                                                        throw null;
                                                                    }
                                                                    C87412m.m108603p("player");
                                                                    throw null;
                                                                }
                                                                C87412m.m108603p("playerListener");
                                                                throw null;
                                                            }
                                                            C87412m.m108603p("player");
                                                            throw null;
                                                        }
                                                        C87412m.m108603p("playerListener");
                                                        throw null;
                                                    }
                                                    C87412m.m108603p("player");
                                                    throw null;
                                                }
                                                C87412m.m108603p("playerListener");
                                                throw null;
                                            }
                                            C87412m.m108603p("player");
                                            throw null;
                                        }
                                        C87412m.m108603p("playerListener");
                                        throw null;
                                    }
                                    C87412m.m108603p("player");
                                    throw null;
                                }
                                C87412m.m108603p("playerListener");
                                throw null;
                            }
                            C87412m.m108603p("player");
                            throw null;
                        }
                        C87412m.m108603p("playerListener");
                        throw null;
                    }
                    C87412m.m108603p("player");
                    throw null;
                }
                C87412m.m108603p("playerListener");
                throw null;
            }
            C87412m.m108603p("textureView");
            throw null;
        }
        C87412m.m108603p("textureView");
        throw null;
    }

    /* renamed from: D */
    public final boolean mo78599D() {
        int i = this.f160768n;
        return i == 4 || i == 5 || i == 6 || i == 7;
    }

    /* renamed from: E */
    public final boolean mo78600E() {
        switch (this.f160768n) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: F */
    public final boolean mo78601F(int i) {
        boolean z;
        Log.m105924i(getFTPPTag(), "playWithSource() source=" + i + ' ' + getProxyState() + ' ');
        if (!this.f160755J) {
            Log.m105924i(getFTPPTag(), "playWithSource() return for isViewFocused:" + this.f160755J);
            return false;
        }
        switch (this.f160768n) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            Log.m105924i(getFTPPTag(), "playWithSource() return for currentState:" + this.f160768n);
            return false;
        }
        boolean isPlaying = isPlaying();
        if (!isPlaying || i == -1) {
            if (mo78599D()) {
                Surface surface = this.f160766i;
                if (surface != null) {
                    if (!surface.isValid()) {
                        surface = null;
                    }
                    if (surface != null) {
                        Log.m105924i(getFTPPTag(), "startInternal() " + getProxyState());
                        mo78671z("startInternal");
                        setBgPrepareStatus(0);
                        C12931a aVar = this.f160748C;
                        if (aVar != null) {
                            aVar.mo12482c(IXWebBroadcastListener.STAGE_START);
                        }
                        C60698b bVar = this.f160763f;
                        if (bVar != null) {
                            bVar.start();
                            ((FinderMMPlayerDetector) C59698c.f170541a.mo84678b(FinderMMPlayerDetector.class)).mo82660d(this.f160746A);
                            mo78637j(5);
                            C59673q2 q2Var = this.f160770p;
                            if (q2Var != null) {
                                mo78606K(q2Var);
                            }
                        } else {
                            C87412m.m108603p("player");
                            throw null;
                        }
                    }
                }
            } else {
                if (!(this.f160768n == 3)) {
                    mo78604I(0);
                }
            }
            C60698b bVar2 = this.f160763f;
            if (bVar2 != null) {
                bVar2.resumeDownload();
                return true;
            }
            C87412m.m108603p("player");
            throw null;
        }
        Log.m105924i(getFTPPTag(), "playWithSource() return for isPlaying:" + isPlaying);
        return false;
    }

    /* renamed from: G */
    public final void mo78602G(String str, String str2, Integer num, int i) {
        if (TextUtils.isEmpty(str2)) {
            String fTPPTag = getFTPPTag();
            Log.m105928w(fTPPTag, "replay_step3-1-1:prepareHls(), return for online url:" + str2);
            return;
        }
        String fTPPTag2 = getFTPPTag();
        Log.m105924i(fTPPTag2, "replay_step3-2:prepareHls(),offsetSec:" + num + ", " + getProxyState() + ",url:" + str2 + ",decryptionKey:" + this.f160771q);
        TPVideoInfo.Builder builder = new TPVideoInfo.Builder();
        builder.fileId(str);
        builder.downloadParam(new TPDownloadParamData(0));
        C60698b bVar = this.f160763f;
        if (bVar != null) {
            bVar.mo33105a(str);
            C60698b bVar2 = this.f160763f;
            if (bVar2 != null) {
                bVar2.setVideoInfo(builder.build());
                if (num != null) {
                    int intValue = num.intValue();
                    C60698b bVar3 = this.f160763f;
                    if (bVar3 != null) {
                        bVar3.setPlayerOptionalParam(new TPOptionalParam().buildLong(100, (long) (intValue * 1000)));
                    } else {
                        C87412m.m108603p("player");
                        throw null;
                    }
                }
                String str3 = this.f160771q;
                if (str3 != null) {
                    C60698b bVar4 = this.f160763f;
                    if (bVar4 != null) {
                        bVar4.setPlayerOptionalParam(new TPOptionalParam().buildQueueString(453, new String[]{str3}));
                    } else {
                        C87412m.m108603p("player");
                        throw null;
                    }
                }
                C60698b bVar5 = this.f160763f;
                if (bVar5 != null) {
                    bVar5.setDataSource(str2);
                    mo78637j(2);
                    mo78604I(i);
                    return;
                }
                C87412m.m108603p("player");
                throw null;
            }
            C87412m.m108603p("player");
            throw null;
        }
        C87412m.m108603p("player");
        throw null;
    }

    /* renamed from: H */
    public final boolean mo78603H() {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "prepareToPlay()  " + getProxyState());
        this.f160751F = true;
        return mo51228s();
    }

    /* renamed from: I */
    public final boolean mo78604I(int i) {
        Log.m105924i(getFTPPTag(), "replay_step3-3:prepareVideo(),source:" + i);
        C60698b bVar = this.f160763f;
        if (bVar != null) {
            bVar.setPlayerOptionalParam(C59688y0.f170516a.mo84671a());
            Surface surface = this.f160766i;
            if (surface != null) {
                if (!surface.isValid()) {
                    surface = null;
                }
                if (surface != null) {
                    C60698b bVar2 = this.f160763f;
                    if (bVar2 != null) {
                        bVar2.setSurface(surface);
                    } else {
                        C87412m.m108603p("player");
                        throw null;
                    }
                }
            }
            C12931a aVar = this.f160748C;
            if (aVar != null) {
                aVar.mo12482c("prepareAsync");
            }
            C60698b bVar3 = this.f160763f;
            if (bVar3 != null) {
                bVar3.prepareAsync();
                mo78637j(3);
                return true;
            }
            C87412m.m108603p("player");
            throw null;
        }
        C87412m.m108603p("player");
        throw null;
    }

    /* renamed from: J */
    public final void mo78605J(int i, int i2) {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "resizeTextureView width:" + i + ",height:" + i2);
        C61425b bVar = this.f160765h;
        if (bVar != null) {
            ViewGroup.LayoutParams layoutParams = ((View) bVar).getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i;
                layoutParams.height = i2;
                C61425b bVar2 = this.f160765h;
                if (bVar2 != null) {
                    ((View) bVar2).requestLayout();
                } else {
                    C87412m.m108603p("textureView");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("textureView");
            throw null;
        }
    }

    /* renamed from: K */
    public final void mo78606K(C59673q2 q2Var) {
        MTimerHandler mTimerHandler;
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "startProgressTimer " + getProxyState());
        boolean z = false;
        if (this.f160777w == null) {
            MTimerHandler mTimerHandler2 = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C56257d(this, q2Var), true);
            this.f160777w = mTimerHandler2;
            mTimerHandler2.setLogging(false);
        }
        MTimerHandler mTimerHandler3 = this.f160777w;
        if (mTimerHandler3 != null && mTimerHandler3.stopped()) {
            z = true;
        }
        if (z && (mTimerHandler = this.f160777w) != null) {
            mTimerHandler.startTimer(0, 20);
        }
    }

    /* renamed from: L */
    public final void mo78607L() {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "stopProgressTimer :" + this.f160777w + ' ' + getProxyState());
        C59673q2 q2Var = this.f160770p;
        if (q2Var != null) {
            C61926c.m72668M(new C56258e(this, q2Var, getCurrentPlayMs(), getVideoDurationMs()));
        }
        MTimerHandler mTimerHandler = this.f160777w;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
    }

    /* renamed from: a */
    public boolean mo51223a(double d, boolean z) {
        return mo51233x(d, z, 3);
    }

    /* renamed from: b */
    public boolean mo75295b() {
        C60698b bVar = this.f160763f;
        if (bVar != null) {
            return bVar.mo33106b();
        }
        C87412m.m108603p("player");
        throw null;
    }

    /* renamed from: c */
    public void mo78608c() {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "onUIDestroy " + getProxyState() + " isReUser:" + this.f160750E);
        stop();
        this.f160757L = null;
        this.f160758M = null;
        this.f160751F = false;
    }

    /* renamed from: d */
    public void mo78609d() {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "release FinderThumbPlayerProxy " + hashCode() + ' ' + getProxyState());
        this.f160776v = null;
        String fTPPTag2 = getFTPPTag();
        Log.m105924i(fTPPTag2, "releaseSurface " + getProxyState() + ", isReusing = " + this.f160750E + ", detach = " + true);
        boolean z = this.f160750E;
        if (this.f160766i != null) {
            C60698b bVar = this.f160763f;
            if (bVar != null) {
                bVar.setSurface((Surface) null);
                Surface surface = this.f160766i;
                if (surface != null) {
                    surface.release();
                }
                C61425b bVar2 = this.f160765h;
                if (bVar2 != null) {
                    bVar2.mo81134i();
                    this.f160766i = null;
                    this.f160767j = null;
                } else {
                    C87412m.m108603p("textureView");
                    throw null;
                }
            } else {
                C87412m.m108603p("player");
                throw null;
            }
        }
        C61926c.m72661F("FTPP.FinderLiveThumbPlayerProxy", new C56256c(this));
        f160745Q.remove(Integer.valueOf(hashCode()));
        this.f160760P = null;
    }

    /* renamed from: g */
    public boolean mo78610g() {
        return this.f160774t;
    }

    public Bitmap getBitmap() {
        C61425b bVar = this.f160765h;
        if (bVar != null) {
            return bVar.getBitmap();
        }
        C87412m.m108603p("textureView");
        throw null;
    }

    public int getContextTag() {
        return this.f160780z;
    }

    public long getCurrentPlayMs() {
        C60698b bVar = this.f160763f;
        if (bVar != null) {
            return bVar.getCurrentPositionMs();
        }
        C87412m.m108603p("player");
        throw null;
    }

    public int getCurrentPlaySecond() {
        C60698b bVar = this.f160763f;
        if (bVar != null) {
            return (int) (bVar.getCurrentPositionMs() / ((long) 1000));
        }
        C87412m.m108603p("player");
        throw null;
    }

    public C59318d getEventDetector() {
        return this;
    }

    public C59314b getEventDetectorAdapter() {
        return this.f160747B;
    }

    public final String getFTPPTag() {
        return this.f160761d + '.' + this.f160755J;
    }

    public boolean getIsNeverStart() {
        return !mo78600E();
    }

    public boolean getIsShouldPlayResume() {
        return this.f160756K;
    }

    public final C59684w2 getLifecycle() {
        return this.f160759N;
    }

    public final C59674r2 getOnMuteListener() {
        return this.f160760P;
    }

    public final C56254a getOnPlayerStopListener() {
        return null;
    }

    public ViewParent getParentView() {
        return getParent();
    }

    public final float getPlaySpeedRatio() {
        return this.f160753H;
    }

    public Object getPlayer() {
        C60698b bVar = this.f160763f;
        if (bVar != null) {
            return bVar;
        }
        C87412m.m108603p("player");
        throw null;
    }

    public View getPlayerView() {
        return this;
    }

    public final int getScaleType() {
        C61425b bVar = this.f160765h;
        if (bVar != null) {
            return bVar.getScaleType();
        }
        C87412m.m108603p("textureView");
        throw null;
    }

    public final C32227p<Integer, TPPlayerMsg.TPVideoSeiInfo, C13598b0> getSeiInfoCallback() {
        return this.f160758M;
    }

    public C59662l2 getVideoAdapter() {
        return null;
    }

    public int getVideoDuration() {
        C60698b bVar = this.f160763f;
        if (bVar != null) {
            return (int) (bVar.getDurationMs() / ((long) 1000));
        }
        C87412m.m108603p("player");
        throw null;
    }

    public long getVideoDurationMs() {
        C60698b bVar = this.f160763f;
        if (bVar != null) {
            return bVar.getDurationMs();
        }
        C87412m.m108603p("player");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f170493c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getVideoMediaId() {
        /*
            r1 = this;
            gr1.q2 r0 = r1.f160770p
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.f170493c
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = ""
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy.getVideoMediaId():java.lang.String");
    }

    public C59673q2 getVideoMediaInfo() {
        return this.f160770p;
    }

    public View getVideoView() {
        return this;
    }

    public final C96814a.C57541b getVideoViewCallback() {
        return this.f160757L;
    }

    public boolean getVideoViewFocused() {
        return this.f160755J;
    }

    public boolean isPlaying() {
        return this.f160768n == 5;
    }

    /* renamed from: j */
    public final void mo78637j(int i) {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "changePlayerState from:" + this.f160768n + " to:" + i);
        if (i != 4 || this.f160768n == 3) {
            this.f160768n = i;
            int i2 = this.f160768n;
            this.f160752G.f175120g = i2;
            C59673q2 q2Var = this.f160770p;
            if (q2Var == null) {
                Log.m105924i(getFTPPTag(), "FTPP.handlePlayerStateChange() return for null");
                return;
            }
            C64689rq2 rq22 = null;
            if (i2 == 5) {
                C96814a.C57541b bVar = this.f160757L;
                if (bVar != null) {
                    bVar.mo22965m0("", q2Var.f170493c);
                }
                C59684w2 w2Var = this.f160759N;
                if (w2Var != null) {
                    C59673q2 q2Var2 = this.f160770p;
                    if (q2Var2 != null) {
                        rq22 = q2Var2.f170494d;
                    }
                    w2Var.mo77475e(rq22);
                }
                C59673q2 q2Var3 = this.f160770p;
                if (q2Var3 != null) {
                    mo78606K(q2Var3);
                }
            } else if (i2 == 6) {
                C96814a.C57541b bVar2 = this.f160757L;
                if (bVar2 != null) {
                    bVar2.mo22963a0("", q2Var.f170493c);
                }
                C59684w2 w2Var2 = this.f160759N;
                if (w2Var2 != null) {
                    C59673q2 q2Var4 = this.f160770p;
                    if (q2Var4 != null) {
                        rq22 = q2Var4.f170494d;
                    }
                    w2Var2.mo78301j(rq22, this.f160752G.mo86511a());
                }
                mo78607L();
            }
            if (i2 == 1 || i2 == 9) {
                String fTPPTag2 = getFTPPTag();
                Log.m105924i(fTPPTag2, "FTPP.handlePlayerStateChange() player stop or idle " + getProxyState());
                return;
            }
            return;
        }
        String fTPPTag3 = getFTPPTag();
        Log.m105928w(fTPPTag3, "changePlayerState from:" + this.f160768n + " to:" + i + " return for error state.");
    }

    /* renamed from: n */
    public void mo78638n() {
    }

    /* renamed from: o */
    public void mo78639o(C62369u0 u0Var, boolean z, FeedData feedData) {
        C64450iq0 iq02;
        C87412m.m108594g(u0Var, "video");
        C87412m.m108594g(feedData, "feedData");
        C12931a aVar = this.f160748C;
        if (aVar != null) {
            aVar.mo12482c("setMediaInfo");
        }
        C64689rq2 f = u0Var.mo87421f();
        String str = f.f185266d;
        String str2 = "";
        String str3 = str == null ? str2 : str;
        String str4 = u0Var.mo87421f().f185275p;
        this.f160770p = new C59673q2("", str3, str4 == null ? str2 : str4, f, u0Var, feedData);
        String str5 = f.f185275p;
        if (str5 != null) {
            str2 = str5;
        }
        String valueOf = String.valueOf(hashCode());
        C60698b bVar = this.f160763f;
        if (bVar != null) {
            int hashCode = bVar.hashCode();
            boolean z2 = this.f160755J;
            float alpha = getAlpha();
            Surface surface = this.f160766i;
            Boolean valueOf2 = surface != null ? Boolean.valueOf(surface.isValid()) : null;
            int i = this.f160768n;
            int position = feedData.getPosition();
            String p = C61926c.m72691p(feedData.getFeedId());
            String description = feedData.getDescription();
            String nickName = feedData.getNickName();
            StringBuilder sb = new StringBuilder();
            sb.append("FTPP.");
            sb.append(position);
            sb.append('.');
            C58764p0 p0Var = C58764p0.f168246a;
            sb.append(p0Var.mo83800a(description));
            sb.append('.');
            C87412m.m108594g(valueOf, "hashCode");
            sb.append(p0Var.mo83801b(valueOf, 0, 4));
            String sb4 = sb.toString();
            this.f160761d = sb4;
            Log.m105924i(sb4, "initFTPPTag pos:" + position + " mediaId:" + str2 + " feedId:" + p + " nickName:" + nickName + " description:" + description + " viewFocus:" + z2 + "finderThumbPlayerProxyHashCode:" + valueOf + " playerHashCode:" + hashCode + " viewFocus:" + this.f160755J + " viewAlpha:" + alpha + " surfaceIsValid:" + valueOf2 + " playerState:" + i);
            C59673q2 q2Var = this.f160770p;
            C87412m.m108591d(q2Var);
            C61425b bVar2 = this.f160765h;
            if (bVar2 != null) {
                if (((View) bVar2).getParent() != null) {
                    C61425b bVar3 = this.f160765h;
                    if (bVar3 != null) {
                        removeView((View) bVar3);
                    } else {
                        C87412m.m108603p("textureView");
                        throw null;
                    }
                }
                Size b = C65840n.m77566b(q2Var.f170495e.mo87421f(), this.f160754I);
                C58739j4 j4Var = C58739j4.f168176a;
                Context context = getContext();
                C87412m.m108593f(context, "context");
                C13605o<Integer, Integer, Integer> g = j4Var.mo83709g(context, b.getWidth(), b.getHeight());
                int intValue = ((Number) g.f38558e).intValue();
                int intValue2 = ((Number) g.f38559f).intValue();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                C61425b bVar4 = this.f160765h;
                if (bVar4 != null) {
                    addView((View) bVar4, layoutParams);
                    C61425b bVar5 = this.f160765h;
                    if (bVar5 != null) {
                        bVar5.mo81140b(intValue, intValue2);
                        C64689rq2 rq22 = q2Var.f170494d;
                        if (!(rq22 == null || (iq02 = rq22.f185248P) == null)) {
                            C61425b bVar6 = this.f160765h;
                            if (bVar6 != null) {
                                bVar6.setCropRect(new Rect((int) iq02.f183717d, (int) iq02.f183718e, (int) iq02.f183719f, (int) iq02.f183720g));
                                C61425b bVar7 = this.f160765h;
                                if (bVar7 != null) {
                                    C64689rq2 rq23 = q2Var.f170494d;
                                    float f2 = 0.0f;
                                    float f3 = rq23 != null ? rq23.f185270h : 0.0f;
                                    if (rq23 != null) {
                                        f2 = rq23.f185271i;
                                    }
                                    bVar7.mo81141f(f3, f2);
                                } else {
                                    C87412m.m108603p("textureView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("textureView");
                                throw null;
                            }
                        }
                        String fTPPTag = getFTPPTag();
                        Log.m105924i(fTPPTag, "initTextureView(), containerWidth:" + intValue + " containerHeight:" + intValue2 + ' ' + getProxyState());
                        this.f160752G.mo86517f();
                        C61575s sVar = this.f160752G;
                        C59673q2 q2Var2 = this.f160770p;
                        C87412m.m108591d(q2Var2);
                        String str6 = q2Var2.f170493c;
                        sVar.getClass();
                        C87412m.m108594g(str6, "mediaId");
                        sVar.f175117d = str6;
                        this.f160752G.mo86515d();
                        return;
                    }
                    C87412m.m108603p("textureView");
                    throw null;
                }
                C87412m.m108603p("textureView");
                throw null;
            }
            C87412m.m108603p("textureView");
            throw null;
        }
        C87412m.m108603p("player");
        throw null;
    }

    /* renamed from: p */
    public C62294j mo78640p(long j) {
        return null;
    }

    public boolean pause() {
        C59684w2 w2Var;
        boolean z = false;
        if (!mo78600E()) {
            String fTPPTag = getFTPPTag();
            Log.m105924i(fTPPTag, "pause() return for state:" + this.f160768n);
            return false;
        }
        String fTPPTag2 = getFTPPTag();
        Log.m105924i(fTPPTag2, "pause()  " + getProxyState());
        if (isPlaying()) {
            C60698b bVar = this.f160763f;
            if (bVar != null) {
                bVar.pause();
                C60698b bVar2 = this.f160763f;
                if (bVar2 != null) {
                    bVar2.pauseDownload();
                    mo78637j(6);
                    mo78641r();
                } else {
                    C87412m.m108603p("player");
                    throw null;
                }
            } else {
                C87412m.m108603p("player");
                throw null;
            }
        } else {
            if (this.f160768n == 3) {
                z = true;
            }
            if (z && !this.f160755J) {
                long currentTimeMillis = System.currentTimeMillis();
                stop();
                String fTPPTag3 = getFTPPTag();
                Log.m105924i(fTPPTag3, "pause() preparing stop cost=" + (System.currentTimeMillis() - currentTimeMillis) + LocaleUtil.MALAY);
            }
        }
        mo78607L();
        C59673q2 q2Var = this.f160770p;
        if (!(q2Var == null || (w2Var = this.f160759N) == null)) {
            w2Var.mo78301j(q2Var.f170494d, this.f160752G.mo86511a());
        }
        return true;
    }

    public boolean play() {
        Log.m105924i(getFTPPTag(), "play()");
        return mo78601F(0);
    }

    /* renamed from: q */
    public int mo51226q() {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "pauseWithCancel " + getProxyState());
        this.f160752G.mo86513c();
        pause();
        return 0;
    }

    /* renamed from: r */
    public final void mo78641r() {
        ((FinderMMPlayerDetector) C59698c.f170541a.mo84678b(FinderMMPlayerDetector.class)).mo82659c(this.f160746A);
        this.f160747B.mo84416b(8);
    }

    /* renamed from: s */
    public boolean mo51228s() {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "prepareToPlay()  " + getProxyState());
        if (!mo78600E()) {
            C59673q2 q2Var = this.f160770p;
            if (q2Var == null) {
                return false;
            }
            mo78602G(q2Var.f170493c, q2Var.f170492b, (Integer) null, 102);
            return true;
        } else if (this.f160768n != 2) {
            return false;
        } else {
            mo78604I(1);
            return true;
        }
    }

    public void setContextTag(int i) {
        this.f160780z = i;
    }

    public final void setDecryptionKey(String str) {
        C87412m.m108594g(str, "key");
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "setDecryptionKey " + str);
        this.f160771q = str;
    }

    public void setFinderVideoPlayTrace(C12931a aVar) {
        this.f160748C = aVar;
    }

    public void setFullScreenEnjoy(boolean z) {
        this.f160754I = z;
    }

    public void setIMMVideoViewCallback(C60157c5 c5Var) {
        C87412m.m108594g(c5Var, "_callback");
        this.f160757L = c5Var;
    }

    public void setIOnlineVideoProxy(C55394a aVar) {
        C87412m.m108594g(aVar, "_proxy");
    }

    public void setInterceptDetach(boolean z) {
        C61425b bVar = this.f160765h;
        if (bVar != null) {
            bVar.setInterceptDetach(z);
        } else {
            C87412m.m108603p("textureView");
            throw null;
        }
    }

    public void setIsShouldPlayResume(boolean z) {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "setIsShouldPlayResume() " + z + ' ' + getProxyState());
        this.f160756K = z;
    }

    public void setIsShowBasicControls(boolean z) {
    }

    public final void setLifecycle(C59684w2 w2Var) {
        this.f160759N = w2Var;
    }

    public void setLoop(boolean z) {
        C60698b bVar = this.f160763f;
        if (bVar != null) {
            bVar.setLoopback(z);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public void setMute(boolean z) {
        C60698b bVar = this.f160763f;
        if (bVar != null) {
            bVar.setOutputMute(z);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public final void setOnMuteListener(C59674r2 r2Var) {
        this.f160760P = r2Var;
    }

    public final void setOnPlayerStopListener(C56254a aVar) {
    }

    public final void setPlaySpeed(float f) {
        FeedData feedData;
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("setPlaySpeed: ratio = ");
        sb.append(f);
        sb.append(", mediaId = ");
        C59673q2 q2Var = this.f160770p;
        sb.append(q2Var != null ? q2Var.f170493c : null);
        sb.append(", feedId = ");
        C59673q2 q2Var2 = this.f160770p;
        sb.append(C61926c.m72691p((q2Var2 == null || (feedData = q2Var2.f170496f) == null) ? 0 : feedData.getFeedId()));
        Log.m105924i(fTPPTag, sb.toString());
        C60698b bVar = this.f160763f;
        if (bVar != null) {
            bVar.setPlaySpeedRatio(f);
            this.f160753H = f;
            C59684w2 w2Var = this.f160759N;
            if (w2Var != null) {
                w2Var.mo78295b(f);
                return;
            }
            return;
        }
        C87412m.m108603p("player");
        throw null;
    }

    public final void setPlaySpeedRatio(float f) {
        this.f160753H = f;
    }

    public void setPreloadedView(boolean z) {
        this.f160749D = z;
    }

    public void setPreview(boolean z) {
        this.f160774t = z;
    }

    public void setScaleType(C96814a.C96817e eVar) {
        C87412m.m108594g(eVar, "scaleType");
        int ordinal = eVar.ordinal();
        if (ordinal == 2) {
            C61425b bVar = this.f160765h;
            if (bVar != null) {
                bVar.setScaleType(1);
            } else {
                C87412m.m108603p("textureView");
                throw null;
            }
        } else if (ordinal == 3) {
            C61425b bVar2 = this.f160765h;
            if (bVar2 != null) {
                bVar2.setScaleType(0);
            } else {
                C87412m.m108603p("textureView");
                throw null;
            }
        } else if (ordinal == 4) {
            C61425b bVar3 = this.f160765h;
            if (bVar3 != null) {
                bVar3.setScaleType(3);
            } else {
                C87412m.m108603p("textureView");
                throw null;
            }
        }
    }

    public final void setSeiInfoCallback(C32227p<? super Integer, ? super TPPlayerMsg.TPVideoSeiInfo, C13598b0> pVar) {
        this.f160758M = pVar;
    }

    public final void setShouldPlayResume(boolean z) {
        this.f160756K = z;
    }

    public final void setStartCdn(boolean z) {
    }

    public void setVideoMuteListener(C59674r2 r2Var) {
        C87412m.m108594g(r2Var, "muteListener");
        this.f160760P = r2Var;
    }

    public void setVideoPlayLifecycle(C59684w2 w2Var) {
        this.f160759N = w2Var;
    }

    public final void setVideoViewCallback(C96814a.C57541b bVar) {
        this.f160757L = bVar;
    }

    public void setVideoViewFocused(boolean z) {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "setVideoViewFocused " + z + ' ' + getProxyState());
        this.f160755J = z;
    }

    public final void setViewFocused(boolean z) {
        this.f160755J = z;
    }

    public void stop() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "stop " + getProxyState());
        if (!mo78600E()) {
            String fTPPTag2 = getFTPPTag();
            Log.m105924i(fTPPTag2, "stop return for isStartPlay onPlayerStopListener:" + null + ". " + getProxyState());
        }
        C59684w2 w2Var = this.f160759N;
        if (w2Var != null) {
            w2Var.mo78306o(this.f160770p, this.f160752G.mo86511a());
        }
        mo78637j(8);
        C60698b bVar = this.f160763f;
        if (bVar != null) {
            bVar.stop();
            mo78641r();
            mo78637j(9);
            C60698b bVar2 = this.f160763f;
            if (bVar2 != null) {
                bVar2.reset();
                mo78637j(1);
                C61425b bVar3 = this.f160765h;
                if (bVar3 != null) {
                    bVar3.reset();
                    this.f160752G.mo86517f();
                    mo78607L();
                    this.f160772r = true;
                    this.f160769o = false;
                    setBgPrepareStatus(0);
                    String fTPPTag3 = getFTPPTag();
                    Log.m105924i(fTPPTag3, "stop end time:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                    return;
                }
                C87412m.m108603p("textureView");
                throw null;
            }
            C87412m.m108603p("player");
            throw null;
        }
        C87412m.m108603p("player");
        throw null;
    }

    /* renamed from: t */
    public void mo51232t() {
    }

    public String toString() {
        return getFTPPTag();
    }

    /* renamed from: v */
    public boolean mo78668v() {
        return false;
    }

    /* renamed from: w */
    public void mo78669w() {
    }

    /* renamed from: x */
    public boolean mo51233x(double d, boolean z, int i) {
        if (!mo78600E() || !mo78599D()) {
            return false;
        }
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "seekTo " + d + ' ' + z);
        C60698b bVar = this.f160763f;
        if (bVar != null) {
            bVar.seekTo(C60641c.m70920a(d * ((double) 1000)), i);
            if (!z) {
                return true;
            }
            play();
            return true;
        }
        C87412m.m108603p("player");
        throw null;
    }

    /* renamed from: y */
    public boolean mo78670y() {
        return this.f160749D;
    }

    /* renamed from: z */
    public final void mo78671z(String str) {
        if (!this.f160769o) {
            C64689rq2 rq22 = null;
            if (C87412m.m108589b(str, "startInternal")) {
                if (this.f160775u == 2) {
                    String fTPPTag = getFTPPTag();
                    Log.m105924i(fTPPTag, "FTPP.handleOnFirstFrameRendered rendered for " + this.f160775u);
                    C59684w2 w2Var = this.f160759N;
                    if (w2Var != null) {
                        C59673q2 q2Var = this.f160770p;
                        C64689rq2 rq23 = q2Var != null ? q2Var.f170494d : null;
                        C60698b bVar = this.f160763f;
                        if (bVar != null) {
                            w2Var.mo78304m(rq23, bVar.mo33107c());
                        } else {
                            C87412m.m108603p("player");
                            throw null;
                        }
                    }
                    this.f160769o = true;
                    return;
                }
                String fTPPTag2 = getFTPPTag();
                Log.m105928w(fTPPTag2, "FTPP.handleOnFirstFrameRendered " + str + " return for " + this.f160775u);
            } else if (C87412m.m108589b(str, "onFirstFrameRendered")) {
                int i = this.f160775u;
                if (i == 0) {
                    String fTPPTag3 = getFTPPTag();
                    Log.m105924i(fTPPTag3, "FTPP.handleOnFirstFrameRendered onFirstFrameRendered " + getProxyState());
                    C59684w2 w2Var2 = this.f160759N;
                    if (w2Var2 != null) {
                        C59673q2 q2Var2 = this.f160770p;
                        C64689rq2 rq24 = q2Var2 != null ? q2Var2.f170494d : null;
                        C60698b bVar2 = this.f160763f;
                        if (bVar2 != null) {
                            w2Var2.mo78304m(rq24, bVar2.mo33107c());
                        } else {
                            C87412m.m108603p("player");
                            throw null;
                        }
                    }
                    this.f160769o = true;
                } else if (i != 1) {
                    String fTPPTag4 = getFTPPTag();
                    Log.m105928w(fTPPTag4, "FTPP.handleOnFirstFrameRendered " + str + " return for " + this.f160775u);
                } else {
                    String fTPPTag5 = getFTPPTag();
                    Log.m105924i(fTPPTag5, "FTPP.handleOnFirstFrameRendered background prepared first frame " + getProxyState());
                    setBgPrepareStatus(2);
                    C59684w2 w2Var3 = this.f160759N;
                    if (w2Var3 != null) {
                        C59673q2 q2Var3 = this.f160770p;
                        if (q2Var3 != null) {
                            rq22 = q2Var3.f170494d;
                        }
                        w2Var3.mo78302k(rq22);
                    }
                }
            } else {
                String fTPPTag6 = getFTPPTag();
                Log.m105928w(fTPPTag6, "FTPP.handleOnFirstFrameRendered " + str + " return for " + this.f160775u);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveThumbPlayerProxy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C37521f.f99374d.getClass();
        this.f160762e = C37521f.f99213K3.mo60266n().intValue() == 1 && ((Boolean) ((C36570n) C37521f.f99183H).getValue()).booleanValue();
        this.f160772r = true;
        this.f160778x = new MMHandler(Looper.getMainLooper());
        this.f160780z = -1;
        C59316c<C54452a> cVar = new C59316c<>(this);
        this.f160746A = cVar;
        this.f160747B = new C59314b(cVar.mo84417a());
        new AtomicBoolean(true);
        this.f160752G = new C61575s();
        this.f160753H = 1.0f;
        mo78598C();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveThumbPlayerProxy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C37521f.f99374d.getClass();
        this.f160762e = C37521f.f99213K3.mo60266n().intValue() == 1 && ((Boolean) ((C36570n) C37521f.f99183H).getValue()).booleanValue();
        this.f160772r = true;
        this.f160778x = new MMHandler(Looper.getMainLooper());
        this.f160780z = -1;
        C59316c<C54452a> cVar = new C59316c<>(this);
        this.f160746A = cVar;
        this.f160747B = new C59314b(cVar.mo84417a());
        new AtomicBoolean(true);
        this.f160752G = new C61575s();
        this.f160753H = 1.0f;
        mo78598C();
    }
}
