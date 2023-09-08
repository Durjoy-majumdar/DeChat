package com.tencent.p014mm.plugin.finder.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bf1.C54452a;
import bl3.C39818r;
import cm1.C55015f1;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.VideoFeedProgressChangeEvent;
import com.tencent.p014mm.modelvideo.C55394a;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.detector.FinderMMPlayerDetector;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeAffinityUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI;
import com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.thumbplayer.render.MMSurfaceViewRender;
import com.tencent.p014mm.plugin.thumbplayer.render.MMTextureViewRender;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.core.ExportErrorStatus;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import e03.C20502f;
import e03.C20505i;
import e03.C58469b;
import e03.C58470j;
import e03.C58471k;
import er1.C58739j4;
import er1.C58764p0;
import er1.C58784w3;
import f50.C58924d;
import fs3.C59314b;
import fs3.C59316c;
import fs3.C59318d;
import fy3.C32224a;
import fy3.C32226l;
import gr1.C59652b1;
import gr1.C59655c1;
import gr1.C59662l2;
import gr1.C59670o2;
import gr1.C59673q2;
import gr1.C59674r2;
import gr1.C59675s2;
import gr1.C59679v2;
import gr1.C59684w2;
import gs3.C59698c;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60157c5;
import ht1.C60171g1;
import ir1.C60615a;
import iy3.C60641c;
import j03.C60698b;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k03.C60931a;
import k03.C60934c;
import k34.C117388a;
import kotlin.Metadata;
import mr1.C25026b;
import mr1.C25034c;
import mr1.C25037f;
import mr1.C25041j;
import mr1.C25044m;
import mr1.C25045n;
import mr1.C25046o;
import mr1.C25047p;
import mr1.C61571a;
import mr1.C61575s;
import mr1.C61576t;
import nr1.C61891a;
import nr1.C61892b;
import o40.C61926c;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p1081gi.C98127h;
import p501dz.C58466h;
import p682rz.C36594q;
import ph1.C62294j;
import pl1.C62367r0;
import qt1.C12931a;
import rs1.C63544ab;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import te3.C64689rq2;
import wp1.C66167g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0006Ë\u0001Ì\u0001Í\u0001B!\b\u0016\u0012\b\u0010Ä\u0001\u001a\u00030Ã\u0001\u0012\n\u0010Æ\u0001\u001a\u0005\u0018\u00010Å\u0001¢\u0006\u0006\bÇ\u0001\u0010È\u0001B*\b\u0016\u0012\b\u0010Ä\u0001\u001a\u00030Ã\u0001\u0012\n\u0010Æ\u0001\u001a\u0005\u0018\u00010Å\u0001\u0012\u0007\u0010É\u0001\u001a\u00020\b¢\u0006\u0006\bÇ\u0001\u0010Ê\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\bH\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\u000eH\u0016J\b\u0010#\u001a\u00020\"H\u0016J\b\u0010$\u001a\u00020\u000eH\u0016J\b\u0010%\u001a\u00020\u000eH\u0016J\n\u0010'\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u000eH\u0016J\u0010\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u000eH\u0016J\u0010\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u000eH\u0016J\u0010\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u000eH\u0016J\b\u00100\u001a\u00020\u001dH\u0016J\u0010\u00102\u001a\u00020\n2\u0006\u00101\u001a\u00020\u000eH\u0016J\u0010\u00105\u001a\u00020\n2\u0006\u00104\u001a\u000203H\u0016J\u0010\u00108\u001a\u00020\n2\u0006\u00107\u001a\u000206H\u0016J\u0010\u0010;\u001a\u00020\n2\u0006\u0010:\u001a\u000209H\u0016J\u0010\u0010=\u001a\u00020\n2\u0006\u0010<\u001a\u00020\u000eH\u0016J\u0010\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u00020\u000eH\u0016J\u0012\u0010B\u001a\u00020\n2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010E\u001a\u00020\n2\u0006\u0010D\u001a\u00020CH\u0016J\u0012\u0010H\u001a\u00020\n2\b\u0010G\u001a\u0004\u0018\u00010FH\u0016J\b\u0010I\u001a\u0004\u0018\u00010FJ\n\u0010K\u001a\u0004\u0018\u00010JH\u0016J\u0006\u0010L\u001a\u00020\u0004J\u000e\u0010O\u001a\u00020\n2\u0006\u0010N\u001a\u00020MJ\n\u0010P\u001a\u0004\u0018\u00010\"H\u0016R\"\u0010X\u001a\u00020Q8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010_\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010g\u001a\u0004\u0018\u00010`8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001b\u0010m\u001a\u00020h8BX\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001b\u0010r\u001a\u00020n8BX\u0002¢\u0006\f\n\u0004\bo\u0010j\u001a\u0004\bp\u0010qR\"\u0010y\u001a\u00020\u000e8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR%\u0010\u0001\u001a\u0004\u0018\u00010z8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bZ\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010R&\u0010\u0001\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010t\u001a\u0005\b\u0001\u0010v\"\u0005\b\u0001\u0010xR)\u0010\u0001\u001a\u00020M8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R&\u0010\u0001\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010t\u001a\u0005\b\u0001\u0010v\"\u0005\b\u0001\u0010xR&\u0010\u0001\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010Z\u001a\u0005\b\u0001\u0010\\\"\u0005\b\u0001\u0010^R&\u0010\u0001\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010t\u001a\u0005\b\u0001\u0010v\"\u0005\b\u0001\u0010xR&\u0010\u0001\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010t\u001a\u0005\b\u0001\u0010v\"\u0005\b\u0001\u0010xR,\u0010 \u0001\u001a\u0005\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R+\u0010§\u0001\u001a\u0004\u0018\u0001038\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R*\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010­\u0001R+\u0010´\u0001\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R,\u0010¼\u0001\u001a\u0005\u0018\u00010µ\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R&\u0010¾\u0001\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b½\u0001\u0010t\u001a\u0005\b¾\u0001\u0010v\"\u0005\b¿\u0001\u0010xR&\u0010Á\u0001\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\bÀ\u0001\u0010t\u001a\u0005\bÁ\u0001\u0010v\"\u0005\bÂ\u0001\u0010x¨\u0006Î\u0001"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderThumbPlayerProxy;", "Lgr1/o2;", "Landroid/widget/FrameLayout;", "Lbf1/a;", "", "getProxyState", "Landroid/graphics/Bitmap;", "getCoverBitmap", "", "status", "Lrx3/b0;", "setBgPrepareStatus", "Lgr1/q2;", "getVideoMediaInfo", "", "isFull", "setFullScreenEnjoy", "Lgr1/l2;", "getVideoAdapter", "Lfs3/d;", "getEventDetector", "Lfs3/b;", "getEventDetectorAdapter", "getBitmap", "getVideoMediaId", "tag", "setContextTag", "getContextTag", "getCurrentPlaySecond", "", "getCurrentPlayMs", "getVideoDuration", "getVideoDurationMs", "getVideoViewFocused", "Landroid/view/View;", "getVideoView", "getIsShouldPlayResume", "getIsNeverStart", "Landroid/view/ViewParent;", "getParentView", "shouldPlayResume", "setIsShouldPlayResume", "focused", "setVideoViewFocused", "isPreview", "setPreview", "isInterceptDetach", "setInterceptDetach", "getStartPlayMs", "isMute", "setMute", "Lht1/c5;", "_callback", "setIMMVideoViewCallback", "Lcom/tencent/mm/pluginsdk/ui/a$e;", "scaleType", "setScaleType", "Lcom/tencent/mm/modelvideo/a;", "_proxy", "setIOnlineVideoProxy", "isShow", "setIsShowBasicControls", "loop", "setLoop", "Lgr1/w2;", "lifecycle", "setVideoPlayLifecycle", "Lgr1/r2;", "muteListener", "setVideoMuteListener", "Lqt1/a;", "videoPlayTrace", "setFinderVideoPlayTrace", "getVideoPlayTrace", "", "getPlayer", "getFTPPTag", "", "ratio", "setPlaySpeed", "getPlayerView", "Lk03/a;", "j", "Lk03/a;", "getRenderView", "()Lk03/a;", "setRenderView", "(Lk03/a;)V", "renderView", "p", "I", "getCurrentPlayState", "()I", "setCurrentPlayState", "(I)V", "currentPlayState", "Lcom/tencent/mm/plugin/finder/preload/MediaPreloadCore;", "r", "Lcom/tencent/mm/plugin/finder/preload/MediaPreloadCore;", "getMediaPreloadCore$plugin_finder_release", "()Lcom/tencent/mm/plugin/finder/preload/MediaPreloadCore;", "setMediaPreloadCore$plugin_finder_release", "(Lcom/tencent/mm/plugin/finder/preload/MediaPreloadCore;)V", "mediaPreloadCore", "Lmr1/a;", "z", "Lrx3/g;", "getFTPPKVReporter", "()Lmr1/a;", "fTPPKVReporter", "Lir1/a;", "A", "getFTPPLog", "()Lir1/a;", "fTPPLog", "H", "Z", "y", "()Z", "setPreloadedView", "(Z)V", "isPreloadedView", "Lgr1/s2;", "Lgr1/s2;", "getOnPlayerStopListener", "()Lgr1/s2;", "setOnPlayerStopListener", "(Lgr1/s2;)V", "onPlayerStopListener", "P", "isOnlyAudio", "setOnlyAudio", "R", "F", "getPlaySpeedRatio", "()F", "setPlaySpeedRatio", "(F)V", "playSpeedRatio", "S", "getEnterSeekMode", "setEnterSeekMode", "enterSeekMode", "T", "getCommentScene", "setCommentScene", "commentScene", "W", "isViewFocused", "setViewFocused", "p0", "isShouldPlayResume", "setShouldPlayResume", "Lcom/tencent/thumbplayer/api/ITPPlayerListener$IOnSeekCompleteListener;", "Q0", "Lcom/tencent/thumbplayer/api/ITPPlayerListener$IOnSeekCompleteListener;", "getOnSeekCompleteListener", "()Lcom/tencent/thumbplayer/api/ITPPlayerListener$IOnSeekCompleteListener;", "setOnSeekCompleteListener", "(Lcom/tencent/thumbplayer/api/ITPPlayerListener$IOnSeekCompleteListener;)V", "onSeekCompleteListener", "R0", "Lht1/c5;", "getVideoViewCallback", "()Lht1/c5;", "setVideoViewCallback", "(Lht1/c5;)V", "videoViewCallback", "S0", "Lgr1/w2;", "getLifecycle", "()Lgr1/w2;", "setLifecycle", "(Lgr1/w2;)V", "T0", "Lgr1/r2;", "getOnMuteListener", "()Lgr1/r2;", "setOnMuteListener", "(Lgr1/r2;)V", "onMuteListener", "Lgr1/v2;", "U0", "Lgr1/v2;", "getDownloadCallback", "()Lgr1/v2;", "setDownloadCallback", "(Lgr1/v2;)V", "downloadCallback", "V0", "isStartCdn", "setStartCdn", "W0", "isStartCdnPreload", "setStartCdnPreload", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy */
public class FinderThumbPlayerProxy extends FrameLayout implements C59670o2, C54452a {

    /* renamed from: c1 */
    public static final HashSet<Integer> f161699c1 = new HashSet<>();

    /* renamed from: d1 */
    public static final HashSet<String> f161700d1 = new HashSet<>();

    /* renamed from: e1 */
    public static final HashSet<String> f161701e1 = new HashSet<>();

    /* renamed from: A */
    public final C13601g f161702A = C36568h.m40985a(C56507e.f161774d);

    /* renamed from: B */
    public boolean f161703B;

    /* renamed from: C */
    public MTimerHandler f161704C;

    /* renamed from: D */
    public MTimerHandler f161705D;

    /* renamed from: E */
    public MMHandler f161706E = new MMHandler(Looper.getMainLooper());

    /* renamed from: F */
    public Runnable f161707F;

    /* renamed from: G */
    public int f161708G = -1;

    /* renamed from: H */
    public boolean f161709H;

    /* renamed from: I */
    public C59675s2 f161710I;

    /* renamed from: J */
    public C12931a f161711J;

    /* renamed from: K */
    public final C3913a f161712K = new C3913a("", 0, "", "", 0, 0, "", "", 0);

    /* renamed from: L */
    public AtomicBoolean f161713L = new AtomicBoolean(true);

    /* renamed from: M */
    public boolean f161714M;

    /* renamed from: N */
    public boolean f161715N;

    /* renamed from: P */
    public boolean f161716P;

    /* renamed from: Q */
    public C61575s f161717Q = new C61575s();

    /* renamed from: Q0 */
    public ITPPlayerListener.IOnSeekCompleteListener f161718Q0;

    /* renamed from: R */
    public float f161719R = 1.0f;

    /* renamed from: R0 */
    public C60157c5 f161720R0;

    /* renamed from: S */
    public boolean f161721S;

    /* renamed from: S0 */
    public C59684w2 f161722S0;

    /* renamed from: T */
    public int f161723T = ExportErrorStatus.APPEND_VIDEO_SAMPLE_MAKE_CURRENT;

    /* renamed from: T0 */
    public C59674r2 f161724T0;

    /* renamed from: U */
    public final C60934c f161725U = new C60934c(this);

    /* renamed from: U0 */
    public C59679v2 f161726U0;

    /* renamed from: V */
    public boolean f161727V;

    /* renamed from: V0 */
    public boolean f161728V0;

    /* renamed from: W */
    public boolean f161729W;

    /* renamed from: W0 */
    public boolean f161730W0;

    /* renamed from: X0 */
    public Bitmap f161731X0;

    /* renamed from: Y0 */
    public long f161732Y0;

    /* renamed from: Z0 */
    public long f161733Z0;

    /* renamed from: a1 */
    public long f161734a1;

    /* renamed from: b1 */
    public long f161735b1;

    /* renamed from: d */
    public final C59316c<C54452a> f161736d;

    /* renamed from: e */
    public final C59314b f161737e;

    /* renamed from: f */
    public String f161738f = "FTPP.FinderThumbPlayerProxy";

    /* renamed from: g */
    public int f161739g;

    /* renamed from: h */
    public C60698b f161740h;

    /* renamed from: i */
    public C56504c f161741i;

    /* renamed from: j */
    public C60931a f161742j;

    /* renamed from: n */
    public Surface f161743n;

    /* renamed from: o */
    public SurfaceTexture f161744o;

    /* renamed from: p */
    public volatile int f161745p;

    /* renamed from: p0 */
    public boolean f161746p0;

    /* renamed from: q */
    public volatile boolean f161747q;

    /* renamed from: r */
    public MediaPreloadCore f161748r;

    /* renamed from: s */
    public C59673q2 f161749s;

    /* renamed from: t */
    public C56502b f161750t;

    /* renamed from: u */
    public boolean f161751u = true;

    /* renamed from: v */
    public boolean f161752v;

    /* renamed from: w */
    public boolean f161753w;

    /* renamed from: x */
    public int f161754x;

    /* renamed from: x0 */
    public final MMHandler f161755x0 = new MMHandler("tp");

    /* renamed from: y */
    public C61576t f161756y;

    /* renamed from: y0 */
    public int f161757y0;

    /* renamed from: z */
    public final C13601g f161758z = C36568h.m40985a(C56506d.f161773d);

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$a */
    public static final class C3913a {

        /* renamed from: a */
        public String f17565a;

        /* renamed from: b */
        public int f17566b;

        /* renamed from: c */
        public String f17567c;

        /* renamed from: d */
        public String f17568d;

        /* renamed from: e */
        public long f17569e;

        /* renamed from: f */
        public int f17570f;

        /* renamed from: g */
        public String f17571g;

        /* renamed from: h */
        public String f17572h;

        /* renamed from: i */
        public long f17573i;

        public C3913a(String str, int i, String str2, String str3, long j, int i2, String str4, String str5, long j2) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(str2, "decodeType");
            C87412m.m108594g(str3, "preloadType");
            C87412m.m108594g(str4, "viewType");
            C87412m.m108594g(str5, "specType");
            this.f17565a = str;
            this.f17566b = i;
            this.f17567c = str2;
            this.f17568d = str3;
            this.f17569e = j;
            this.f17570f = i2;
            this.f17571g = str4;
            this.f17572h = str5;
            this.f17573i = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3913a)) {
                return false;
            }
            C3913a aVar = (C3913a) obj;
            return C87412m.m108589b(this.f17565a, aVar.f17565a) && this.f17566b == aVar.f17566b && C87412m.m108589b(this.f17567c, aVar.f17567c) && C87412m.m108589b(this.f17568d, aVar.f17568d) && this.f17569e == aVar.f17569e && this.f17570f == aVar.f17570f && C87412m.m108589b(this.f17571g, aVar.f17571g) && C87412m.m108589b(this.f17572h, aVar.f17572h) && this.f17573i == aVar.f17573i;
        }

        public int hashCode() {
            long j = this.f17569e;
            long j2 = this.f17573i;
            return (((((((((((((((this.f17565a.hashCode() * 31) + this.f17566b) * 31) + this.f17567c.hashCode()) * 31) + this.f17568d.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f17570f) * 31) + this.f17571g.hashCode()) * 31) + this.f17572h.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            return "DebugInfoData(mediaId=" + this.f17565a + ", position=" + this.f17566b + ", decodeType=" + this.f17567c + ", preloadType=" + this.f17568d + ", firstFrameTime=" + this.f17569e + ", bufferingCount=" + this.f17570f + ", viewType=" + this.f17571g + ", specType=" + this.f17572h + ", videoBitRate=" + this.f17573i + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b */
    public final class C56502b extends C117388a implements C98127h.C98128a, C98124g.C98125a, C98124g.C98126b {

        /* renamed from: d */
        public final String f161759d;

        /* renamed from: e */
        public final C59673q2 f161760e;

        /* renamed from: f */
        public final long f161761f = 1048576;

        /* renamed from: g */
        public int f161762g;

        /* renamed from: h */
        public C55015f1 f161763h;

        /* renamed from: i */
        public AtomicBoolean f161764i = new AtomicBoolean(false);

        /* renamed from: j */
        public long f161765j;

        /* renamed from: n */
        public final /* synthetic */ FinderThumbPlayerProxy f161766n;

        /* renamed from: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b$a */
        public static final class C56503a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderThumbPlayerProxy f161767d;

            /* renamed from: e */
            public final /* synthetic */ int f161768e;

            /* renamed from: f */
            public final /* synthetic */ C56502b f161769f;

            /* renamed from: g */
            public final /* synthetic */ C98121d f161770g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56503a(FinderThumbPlayerProxy finderThumbPlayerProxy, int i, C56502b bVar, C98121d dVar) {
                super(0);
                this.f161767d = finderThumbPlayerProxy;
                this.f161768e = i;
                this.f161769f = bVar;
                this.f161770g = dVar;
            }

            public Object invoke() {
                FinderThumbPlayerProxy finderThumbPlayerProxy = this.f161767d;
                HashSet<Integer> hashSet = FinderThumbPlayerProxy.f161699c1;
                finderThumbPlayerProxy.mo79454a0((C25026b.C25032b) null);
                C59679v2 downloadCallback = this.f161767d.getDownloadCallback();
                if (downloadCallback != null) {
                    downloadCallback.mo78328l(this.f161768e, this.f161769f.f161760e.f170495e, this.f161770g);
                }
                return C13598b0.f38549a;
            }
        }

        public C56502b(FinderThumbPlayerProxy finderThumbPlayerProxy, String str, C59673q2 q2Var) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(q2Var, "mediaInfo");
            this.f161766n = finderThumbPlayerProxy;
            this.f161759d = str;
            this.f161760e = q2Var;
            C55015f1 c = C66167g.f190173a.mo90234c(str, true);
            this.f161763h = c;
            boolean k = C86013q1.m106450k(c.mo76071l2());
            boolean k2 = C86013q1.m106450k(q2Var.f170492b);
            Log.m105924i(finderThumbPlayerProxy.getFTPPTag(), "create ResourceLoaderProxy, cache:" + this.f161763h + " mediaCache path:" + this.f161763h.mo76071l2() + ", exists:" + k + " mediaInfo path:" + q2Var.f170492b + ", exists:" + k2);
            C55015f1 f1Var = this.f161763h;
            int i = f1Var.field_state;
            if (i == -2 || i == -1 || i == 0) {
                C3913a aVar = finderThumbPlayerProxy.f161712K;
                aVar.getClass();
                aVar.f17568d = "未命中预加载";
                mo79493a();
            } else if (i != 3) {
                int m2 = f1Var.mo76072m2();
                if (m2 > 0) {
                    C3913a aVar2 = finderThumbPlayerProxy.f161712K;
                    String str2 = "预加载" + m2 + '%';
                    aVar2.getClass();
                    C87412m.m108594g(str2, "<set-?>");
                    aVar2.f17568d = str2;
                    return;
                }
                C3913a aVar3 = finderThumbPlayerProxy.f161712K;
                aVar3.getClass();
                aVar3.f17568d = "未命中预加载";
            } else if (!k2) {
                mo79493a();
                C3913a aVar4 = finderThumbPlayerProxy.f161712K;
                aVar4.getClass();
                aVar4.f17568d = "未命中预加载";
            }
        }

        /* renamed from: a */
        public final void mo79493a() {
            Log.m105924i(this.f161766n.getFTPPTag(), "resetMediaCache");
            C66167g gVar = C66167g.f190173a;
            String str = this.f161759d;
            String str2 = this.f161760e.f170495e.mo87421f().f185275p;
            String str3 = str2 == null ? "" : str2;
            C59673q2 q2Var = this.f161760e;
            String str4 = q2Var.f170491a;
            if (str4 == null) {
                str4 = "";
            }
            C66167g.m78056h(gVar, str, str3, str4, q2Var.f170495e.mo87419d(), this.f161760e.f170495e.mo87422g(), this.f161760e.f170495e.mo87420e(), 0, 0, 1, this.f161760e.f170495e.mo87421f().f185269g, "", "", false, 4096, (Object) null);
            mo79494c();
        }

        /* renamed from: b */
        public void mo31987b(String str, C98121d dVar) {
            C87412m.m108594g(str, "mediaId");
            String fTPPTag = this.f161766n.getFTPPTag();
            StringBuilder sb = new StringBuilder();
            sb.append("[onPreloadCompleted] mediaId=");
            sb.append(str);
            sb.append(" Ret=");
            Long l = null;
            sb.append(dVar != null ? Integer.valueOf(dVar.field_retCode) : null);
            sb.append(" finishedLength=");
            if (dVar != null) {
                l = Long.valueOf(dVar.field_recvedBytes);
            }
            sb.append(l);
            sb.append(' ');
            sb.append(this);
            Log.m105924i(fTPPTag, sb.toString());
            ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Fx0().mo52132i(str, dVar, "proxy#complete");
            this.f161766n.mo79455b0();
        }

        /* renamed from: c */
        public final void mo79494c() {
            this.f161763h = C66167g.m78055d(C66167g.f190173a, this.f161759d, false, 2, (Object) null);
        }

        /* renamed from: d */
        public final void mo79495d(boolean z) {
            String fTPPTag = this.f161766n.getFTPPTag();
            Log.m105924i(fTPPTag, "updateRequestingData " + z + ' ' + this);
            this.f161764i.set(z);
        }

        /* renamed from: e */
        public void mo17917e(String str, long j, long j2) {
            C87412m.m108594g(str, "mediaId");
            String fTPPTag = this.f161766n.getFTPPTag();
            Log.m105924i(fTPPTag, "onProgress() offset=" + j + " total=" + j2 + ' ' + this);
            C66167g.f190173a.mo90241l(str, j, j2, 1);
            mo79494c();
            FinderThumbPlayerProxy finderThumbPlayerProxy = this.f161766n;
            if (finderThumbPlayerProxy.f161729W) {
                C55015f1 f1Var = this.f161763h;
                int i = f1Var.field_videoBitrate + f1Var.field_audioBitrate;
                if (i > 0) {
                    int currentPlaySecond = finderThumbPlayerProxy.getCurrentPlaySecond();
                    VideoFeedProgressChangeEvent videoFeedProgressChangeEvent = new VideoFeedProgressChangeEvent();
                    VideoFeedProgressChangeEvent.C55175a aVar = videoFeedProgressChangeEvent.f154897d;
                    aVar.f154898a = str;
                    aVar.f154899b = j;
                    aVar.f154900c = j2;
                    aVar.f154901d = (long) i;
                    aVar.f154902e = currentPlaySecond;
                    videoFeedProgressChangeEvent.publish();
                }
            }
            C59679v2 downloadCallback = this.f161766n.getDownloadCallback();
            if (downloadCallback != null) {
                downloadCallback.mo78310e((int) j, (int) j2, this.f161760e.f170495e);
            }
        }

        /* renamed from: g */
        public void mo17918g(String str, int i, C98121d dVar) {
            String str2 = str;
            int i2 = i;
            C98121d dVar2 = dVar;
            C87412m.m108594g(str2, "mediaId");
            C87412m.m108594g(dVar2, "sceneResult");
            String fTPPTag = this.f161766n.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onFinish mediaId=" + str2 + " ret=" + i2 + " recvedBytes=" + dVar2.field_recvedBytes + " fileLength=" + dVar2.field_fileLength + "  finderformat:" + Integer.valueOf(dVar2.field_videoFormat));
            C66167g gVar = C66167g.f190173a;
            String str3 = dVar2.f287621m;
            C87412m.m108593f(str3, "sceneResult.profile");
            gVar.mo90240k(str2, str3);
            C61926c.m72668M(new C56503a(this.f161766n, i2, this, dVar2));
            if (i2 != 0) {
                String str4 = this.f161760e.f170495e.mo87421f().f185275p;
                String str5 = str4 == null ? "" : str4;
                C59673q2 q2Var = this.f161760e;
                String str6 = q2Var.f170491a;
                if (str6 == null) {
                    str6 = "";
                }
                C66167g.m78056h(gVar, str, str5, str6, q2Var.f170495e.mo87419d(), this.f161760e.f170495e.mo87422g(), this.f161760e.f170495e.mo87420e(), 0, 0, -1, this.f161760e.f170495e.mo87421f().f185269g, "", "", false, 4096, (Object) null);
            } else {
                long j = dVar2.field_fileLength;
                gVar.mo90241l(str, j, j, 3);
            }
            mo79494c();
            mo79495d(false);
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            C87412m.m108594g(str, "mediaId");
            String fTPPTag = this.f161766n.getFTPPTag();
            StringBuilder sb = new StringBuilder();
            sb.append("callback() mediaId=");
            sb.append(str);
            sb.append(" startRet=");
            sb.append(i);
            sb.append(" finishedLength=");
            sb.append(cVar != null ? Long.valueOf(cVar.field_finishedLength) : null);
            sb.append(" fileFormat=");
            sb.append(dVar != null ? dVar.field_videoFlag : null);
            sb.append(' ');
            sb.append(this);
            Log.m105924i(fTPPTag, sb.toString());
            if (cVar != null) {
                if (!(i == 0 && cVar.field_finishedLength > 0)) {
                    cVar = null;
                }
                if (cVar != null) {
                    long j = cVar.field_finishedLength;
                    long j2 = cVar.field_toltalLength;
                    this.f161763h = C66167g.f190173a.mo90241l(str, j, j2, j >= j2 ? 3 : 1);
                    mo79494c();
                }
            }
            if (dVar != null) {
                C66167g gVar = C66167g.f190173a;
                String str2 = dVar.f287621m;
                C87412m.m108593f(str2, "sceneResult.profile");
                gVar.mo90240k(str, str2);
            }
            return 0;
        }

        public String getContentType(int i, String str) {
            String fTPPTag = this.f161766n.getFTPPTag();
            Log.m105924i(fTPPTag, "getContentType() fileId:" + i + ", fileKey:" + str + " contentType:" + MimeTypes.VIDEO_MP4);
            return MimeTypes.VIDEO_MP4;
        }

        public String getDataFilePath(int i, String str) {
            String i2 = C86013q1.m106448i(this.f161760e.f170492b, false);
            String fTPPTag = this.f161766n.getFTPPTag();
            Log.m105924i(fTPPTag, "getDataFilePath(), fileId:" + i + " fileKey:" + str + " dataFilePath:" + i2 + " isExists:" + C86013q1.m106450k(i2) + " mediaInfoPath:" + this.f161760e.f170492b);
            return i2;
        }

        public long getDataTotalSize(int i, String str) {
            String fTPPTag = this.f161766n.getFTPPTag();
            Log.m105924i(fTPPTag, "getDataTotalSize() fileId:" + i + ", fileKey:" + str + " dataTotalSize:" + this.f161763h.field_totalSize + ' ');
            FinderThumbPlayerProxy finderThumbPlayerProxy = this.f161766n;
            long j = this.f161763h.field_totalSize;
            finderThumbPlayerProxy.f161735b1 = j;
            return j;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            C87412m.m108594g(str, "mediaId");
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return null;
        }

        public void onDataAvailable(String str, long j, long j2) {
            C87412m.m108594g(str, "mediaId");
            mo79495d(false);
            String fTPPTag = this.f161766n.getFTPPTag();
            Log.m105924i(fTPPTag, "onDataAvailable() offset=" + j + " length=" + j2 + ' ' + this + '}');
        }

        public void onM3U8Ready(String str, String str2) {
            C87412m.m108594g(str, "mediaId");
        }

        public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(videoInfo, "info");
            Log.m105924i(this.f161766n.getFTPPTag(), "onMoovReady() offset=" + j + " length=" + j2 + " info=" + videoInfo.videoFormat + ' ' + videoInfo.oriVideoFormat + ' ' + videoInfo.svrFlag + ' ' + this);
            C12931a aVar = this.f161766n.f161711J;
            if (aVar != null) {
                aVar.mo12482c("onMoovReady");
            }
            C61575s sVar = this.f161766n.f161717Q;
            C87412m.m108593f(videoInfo.svrFlag, "info.svrFlag");
            sVar.getClass();
            boolean z = !this.f161763h.field_moovReady;
            C66167g gVar = C66167g.f190173a;
            String str2 = videoInfo.svrFlag;
            if (str2 == null) {
                str2 = "";
            }
            gVar.mo90239j(str, str2);
            mo79494c();
            C59679v2 downloadCallback = this.f161766n.getDownloadCallback();
            if (downloadCallback != null) {
                downloadCallback.mo78327j((int) j, (int) j2, this.f161760e.f170495e, z);
            }
        }

        public int onReadData(int i, String str, long j, long j2) {
            long j3;
            Class cls;
            String str2;
            String str3;
            long j4;
            long j5;
            int i2 = i;
            long j6 = j;
            long j7 = j2;
            FinderThumbPlayerProxy finderThumbPlayerProxy = this.f161766n;
            finderThumbPlayerProxy.f161734a1 = j6 + j7;
            Class cls2 = C58466h.class;
            if (!finderThumbPlayerProxy.f161713L.get()) {
                Log.m105928w(this.f161766n.getFTPPTag(), "notifyDataReady fileId:" + i2 + ", return for downloader never start. requestOffset:" + j6 + " requestLength:" + j7 + ' ' + this);
                C61571a e = this.f161766n.getFTPPKVReporter();
                if (!e.f174995a) {
                    C115669n.INSTANCE.mo175913w(1505, 249, 1);
                    e.f174995a = true;
                }
            } else {
                if (!(this.f161766n.f161745p == 6) || j6 <= this.f161763h.field_cacheSize) {
                    if (this.f161763h.mo76073n2()) {
                        cls = cls2;
                        str2 = " requestLength:";
                        str3 = " length:";
                        j4 = j7;
                    } else {
                        long[] jArr = new long[2];
                        int queryContinuousSize = CdnLogic.queryContinuousSize(this.f161759d, j6, jArr);
                        if (queryContinuousSize == 0) {
                            long j8 = jArr[0];
                            if (j8 != -1) {
                                if (j8 > j7) {
                                    j8 = j7;
                                }
                                cls = cls2;
                                str2 = " requestLength:";
                                str3 = " length:";
                                j4 = j8;
                            }
                        }
                        C60615a i3 = this.f161766n.getFTPPLog();
                        String fTPPTag = this.f161766n.getFTPPTag();
                        StringBuilder sb = new StringBuilder();
                        sb.append("notifyDataReady fileId:");
                        sb.append(i2);
                        sb.append(" queryContinuousSize error, ret:");
                        sb.append(queryContinuousSize);
                        sb.append(" requestOffset:");
                        sb.append(j6);
                        sb.append(" continuousSize:");
                        str3 = " length:";
                        sb.append(jArr[0]);
                        sb.append(" totalSize:");
                        sb.append(jArr[1]);
                        sb.append(' ');
                        sb.append(this);
                        String sb4 = sb.toString();
                        i3.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        str2 = " requestLength:";
                        cls = cls2;
                        if (currentTimeMillis - i3.f172710a > ((long) 1000)) {
                            Log.m105928w(fTPPTag, sb4);
                            i3.f172710a = currentTimeMillis;
                        }
                        j4 = 0;
                    }
                    if (j4 != 0) {
                        j5 = j4;
                        String str4 = str3;
                        Log.m105924i(this.f161766n.getFTPPTag(), "notifyDataReady fileId:" + i2 + " returnLength:" + j5 + " fixRequest[offset:" + j6 + str4 + j7 + "], originRequest[offset:" + j6 + str4 + j7 + "] " + this);
                    } else if (!this.f161763h.field_moovReady || this.f161764i.get()) {
                        long j9 = j4;
                        C60615a i4 = this.f161766n.getFTPPLog();
                        String fTPPTag2 = this.f161766n.getFTPPTag();
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("notifyDataReady fileId:");
                        sb5.append(i2);
                        sb5.append(" returnLength:");
                        j5 = j9;
                        sb5.append(j5);
                        sb5.append(" fixRequest[offset:");
                        sb5.append(j6);
                        String str5 = str3;
                        sb5.append(str5);
                        sb5.append(j7);
                        sb5.append("],  originRequest[offset:");
                        sb5.append(j6);
                        sb5.append(str5);
                        sb5.append(j7);
                        sb5.append("] ");
                        sb5.append(this);
                        String sb6 = sb5.toString();
                        i4.getClass();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (currentTimeMillis2 - i4.f172712c > ((long) 200)) {
                            Log.m105928w(fTPPTag2, sb6);
                            i4.f172712c = currentTimeMillis2;
                        }
                    } else {
                        long j15 = this.f161761f;
                        if (j7 < j15) {
                            j15 = j7;
                        }
                        long j16 = this.f161763h.field_totalSize;
                        if (j6 + j15 > j16) {
                            j15 = j16 - j6;
                            Log.m105928w(this.f161766n.getFTPPTag(), "notifyDataReady fileId:" + i2 + " requestLength is valid, requestOffset:" + j6 + ", requestLength:" + j15 + ", totalSize:" + this.f161763h.field_totalSize + ' ' + this);
                        }
                        if (!((C58466h) C86312j.m106911c(cls)).Qi0().mo32057e(this.f161759d)) {
                            Log.m105924i(this.f161766n.getFTPPTag(), "notifyDataReady fileId:" + i2 + " isMediaInRunningStreamTaskMap mediaId:" + this.f161759d);
                            j5 = j4;
                            j3 = j5;
                            return (int) j3;
                        }
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        long j17 = j4;
                        int c = ((C58466h) C86312j.m106911c(cls)).Qi0().mo32055c(this.f161759d, (int) j6, (int) j15, 3000, new C56539g(this.f161766n, i2, this, countDownLatch));
                        if (c == 0) {
                            Log.m105924i(this.f161766n.getFTPPTag(), "notifyDataReady fileId:" + i2 + " requestVideoData not in running id mediaId:" + this.f161759d);
                            mo79495d(false);
                            countDownLatch.countDown();
                        }
                        try {
                            countDownLatch.await(5, TimeUnit.SECONDS);
                        } catch (Throwable unused) {
                            Log.m105928w(this.f161766n.getFTPPTag(), "notifyDataReady fileId:" + i2 + " countdown timeout exception.");
                        }
                        Log.m105924i(this.f161766n.getFTPPTag(), "notifyDataReady fileId:" + i2 + " requestVideoData requestOffset:" + j6 + " requestLengthFix:" + j15 + str2 + j7 + " requestDataRet:" + c + "  cacheSize:" + this.f161763h.field_cacheSize + ' ' + this);
                        j5 = j17;
                    }
                    this.f161765j = j6 + j5;
                    j3 = j5;
                    return (int) j3;
                }
                C60615a i5 = this.f161766n.getFTPPLog();
                String fTPPTag3 = this.f161766n.getFTPPTag();
                String str6 = "notifyDataReady fileId:" + i2 + " return for pause state. request[offset:" + j6 + " length:" + j7 + "] cacheSize:" + this.f161763h.field_cacheSize + ' ' + this;
                i5.getClass();
                long currentTimeMillis3 = System.currentTimeMillis();
                if (currentTimeMillis3 - i5.f172711b > ((long) 5000)) {
                    Log.m105928w(fTPPTag3, str6);
                    i5.f172711b = currentTimeMillis3;
                }
            }
            j3 = 0;
            return (int) j3;
        }

        public int onStartReadData(int i, String str, long j, long j2) {
            String fTPPTag = this.f161766n.getFTPPTag();
            Log.m105924i(fTPPTag, "onStartReadData() fileId:" + i + ", fileKey:" + str + ", requestStart:" + j + ", requestEnd:" + j2);
            C12931a aVar = this.f161766n.f161711J;
            if (aVar != null) {
                aVar.mo12482c("onStartRead");
            }
            int i2 = this.f161762g;
            this.f161762g = i2 + 1;
            return i2;
        }

        public int onStopReadData(int i, String str, int i2) {
            String fTPPTag = this.f161766n.getFTPPTag();
            Log.m105924i(fTPPTag, "onStopReadData() fileId:" + i + ", fileKey:" + str + ", requestId:" + i2);
            return this.f161762g;
        }

        public String toString() {
            return FinderThumbPlayerProxy.m64984z(this.f161766n) + " isMoovReady:" + this.f161763h.field_moovReady + " isRequestingData:" + this.f161764i.get() + " isFinish:" + this.f161763h.mo76073n2() + " total:" + this.f161763h.field_totalSize + " mediacache:" + this.f161763h.hashCode();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$c */
    public final class C56504c implements TextureView.SurfaceTextureListener, C60931a.C60932a, ITPPlayerListener.IOnPreparedListener, ITPPlayerListener.IOnVideoSizeChangedListener, ITPPlayerListener.IOnInfoListener, ITPPlayerListener.IOnStateChangeListener, ITPPlayerListener.IOnCompletionListener, ITPPlayerListener.IOnErrorListener, ITPPlayerListener.IOnSeekCompleteListener {

        /* renamed from: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$c$a */
        public static final class C56505a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderThumbPlayerProxy f161772d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56505a(FinderThumbPlayerProxy finderThumbPlayerProxy) {
                super(0);
                this.f161772d = finderThumbPlayerProxy;
            }

            public Object invoke() {
                this.f161772d.stop();
                return C13598b0.f38549a;
            }
        }

        public C56504c() {
        }

        /* renamed from: a */
        public void mo24864a(Object obj, int i, int i2) {
            C87412m.m108594g(obj, "surface");
            String fTPPTag = FinderThumbPlayerProxy.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onSurfaceChange  surface:" + obj.hashCode() + ' ' + i + ' ' + i2 + ' ' + FinderThumbPlayerProxy.m64984z(FinderThumbPlayerProxy.this));
        }

        /* renamed from: b */
        public void mo24865b(Object obj) {
            C87412m.m108594g(obj, "surface");
            if (obj instanceof SurfaceTexture) {
                FinderThumbPlayerProxy.m64982j(FinderThumbPlayerProxy.this, (SurfaceTexture) obj);
            } else if (obj instanceof SurfaceHolder) {
                FinderThumbPlayerProxy.m64983r(FinderThumbPlayerProxy.this, (SurfaceHolder) obj);
            } else {
                String fTPPTag = FinderThumbPlayerProxy.this.getFTPPTag();
                Log.m105928w(fTPPTag, "FTPP.onSurfaceAvailable() width:" + FinderThumbPlayerProxy.this.getWidth() + " height:" + FinderThumbPlayerProxy.this.getHeight() + " surface:" + obj + ' ' + FinderThumbPlayerProxy.m64984z(FinderThumbPlayerProxy.this));
            }
        }

        /* renamed from: c */
        public void mo24866c(Object obj) {
            C87412m.m108594g(obj, "surface");
        }

        /* renamed from: d */
        public boolean mo24867d(Object obj) {
            C87412m.m108594g(obj, "surface");
            if (obj instanceof SurfaceTexture) {
                return false;
            }
            if (obj instanceof SurfaceHolder) {
                C60698b bVar = FinderThumbPlayerProxy.this.f161740h;
                if (bVar != null) {
                    bVar.setSurface((Surface) null);
                    if (!(FinderThumbPlayerProxy.this.getRenderView() instanceof MMSurfaceViewRender)) {
                        return false;
                    }
                    FinderThumbPlayerProxy finderThumbPlayerProxy = FinderThumbPlayerProxy.this;
                    C60934c cVar = finderThumbPlayerProxy.f161725U;
                    C60931a renderView = finderThumbPlayerProxy.getRenderView();
                    C87412m.m108592e(renderView, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender");
                    cVar.mo85889e((MMSurfaceViewRender) renderView);
                    return false;
                }
                C87412m.m108603p("player");
                throw null;
            }
            String fTPPTag = FinderThumbPlayerProxy.this.getFTPPTag();
            Log.m105928w(fTPPTag, "FTPP.onSurfaceDestroy() surface:" + obj + ' ' + FinderThumbPlayerProxy.m64984z(FinderThumbPlayerProxy.this));
            return false;
        }

        public void onCompletion(ITPPlayer iTPPlayer) {
            FinderThumbPlayerProxy.this.mo51222E(7);
            String fTPPTag = FinderThumbPlayerProxy.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onCompletion() " + FinderThumbPlayerProxy.m64984z(FinderThumbPlayerProxy.this));
            C60157c5 videoViewCallback = FinderThumbPlayerProxy.this.getVideoViewCallback();
            if (videoViewCallback != null) {
                C59673q2 q2Var = FinderThumbPlayerProxy.this.f161749s;
                videoViewCallback.mo22958L("", q2Var != null ? q2Var.f170493c : null);
            }
            C61926c.m72668M(new C56505a(FinderThumbPlayerProxy.this));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x004c, code lost:
            r1 = r0.f161771d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onError(com.tencent.thumbplayer.api.ITPPlayer r26, int r27, int r28, long r29, long r31) {
            /*
                r25 = this;
                r0 = r25
                r5 = r28
                java.lang.String r1 = "player"
                r2 = r26
                gy3.C87412m.m108594g(r2, r1)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r1 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r1 = r1.getFTPPTag()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "FTPP.onError() "
                r3.append(r4)
                r6 = r27
                r3.append(r6)
                r4 = 32
                r3.append(r4)
                r3.append(r5)
                java.lang.String r7 = " bgPrepareStatus:"
                r3.append(r7)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r7 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                int r7 = r7.f161754x
                r3.append(r7)
                r3.append(r4)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r4 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r4 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.m64984z(r4)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
                r1 = 11030406(0xa84f86, float:1.5456891E-38)
                if (r5 != r1) goto L_0x009f
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r1 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                gr1.q2 r3 = r1.f161749s
                if (r3 == 0) goto L_0x009f
                wp1.g r7 = wp1.C66167g.f190173a
                java.lang.String r8 = r3.f170493c
                pl1.u0 r4 = r3.f170495e
                te3.rq2 r4 = r4.mo87421f()
                java.lang.String r4 = r4.f185275p
                java.lang.String r9 = ""
                if (r4 != 0) goto L_0x0063
                r4 = r9
            L_0x0063:
                java.lang.String r10 = r3.f170491a
                if (r10 != 0) goto L_0x0068
                r10 = r9
            L_0x0068:
                pl1.u0 r9 = r3.f170495e
                int r11 = r9.mo87419d()
                pl1.u0 r9 = r3.f170495e
                java.lang.String r12 = r9.mo87422g()
                pl1.u0 r9 = r3.f170495e
                int r13 = r9.mo87420e()
                r14 = 0
                r16 = 0
                r18 = 1
                pl1.u0 r3 = r3.f170495e
                te3.rq2 r3 = r3.mo87421f()
                int r3 = r3.f185269g
                r19 = r3
                r22 = 0
                r23 = 4096(0x1000, float:5.74E-42)
                r24 = 0
                java.lang.String r20 = ""
                java.lang.String r21 = ""
                r9 = r4
                wp1.C66167g.m78056h(r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r24)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b r1 = r1.f161750t
                if (r1 == 0) goto L_0x009f
                r1.mo79494c()
            L_0x009f:
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r1 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                int r3 = r1.f161754x
                if (r3 == 0) goto L_0x00ae
                r26.reset()
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r1 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                r1.mo51228s()
                goto L_0x00c5
            L_0x00ae:
                gr1.q2 r2 = r1.f161749s
                if (r2 == 0) goto L_0x00c5
                ht1.c5 r1 = r1.getVideoViewCallback()
                if (r1 == 0) goto L_0x00c5
                java.lang.String r3 = r2.f170493c
                java.lang.String r2 = ""
                java.lang.String r4 = ""
                r5 = r28
                r6 = r27
                r1.mo22960T(r2, r3, r4, r5, r6)
            L_0x00c5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.C56504c.onError(com.tencent.thumbplayer.api.ITPPlayer, int, int, long, long):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: te3.rq2} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: te3.rq2} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: com.tencent.mm.protocal.protobuf.FinderMediaReportObject} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: te3.rq2} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r8v3 */
        /* JADX WARNING: type inference failed for: r8v6, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r8v23 */
        /* JADX WARNING: type inference failed for: r8v24 */
        /* JADX WARNING: type inference failed for: r8v25 */
        /* JADX WARNING: type inference failed for: r8v26 */
        /* JADX WARNING: type inference failed for: r8v27 */
        /* JADX WARNING: type inference failed for: r8v28 */
        /* JADX WARNING: type inference failed for: r8v29 */
        /* JADX WARNING: type inference failed for: r8v30 */
        /* JADX WARNING: type inference failed for: r8v31 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onInfo(com.tencent.thumbplayer.api.ITPPlayer r3, int r4, long r5, long r7, java.lang.Object r9) {
            /*
                r2 = this;
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
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
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r8 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r8 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.m64984z(r8)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
                r3 = 105(0x69, float:1.47E-43)
                if (r4 == r3) goto L_0x041b
                r3 = 106(0x6a, float:1.49E-43)
                r8 = 0
                if (r4 == r3) goto L_0x03c1
                r3 = 108(0x6c, float:1.51E-43)
                if (r4 == r3) goto L_0x0388
                r3 = 150(0x96, float:2.1E-43)
                if (r4 == r3) goto L_0x0342
                r3 = 204(0xcc, float:2.86E-43)
                if (r4 == r3) goto L_0x02c8
                r3 = 502(0x1f6, float:7.03E-43)
                r0 = 1
                if (r4 == r3) goto L_0x01fc
                r3 = 1006(0x3ee, float:1.41E-42)
                if (r4 == r3) goto L_0x01d8
                r3 = 200(0xc8, float:2.8E-43)
                r9 = 0
                if (r4 == r3) goto L_0x0138
                r3 = 201(0xc9, float:2.82E-43)
                if (r4 == r3) goto L_0x00d3
                r3 = 260(0x104, float:3.64E-43)
                if (r4 == r3) goto L_0x00a2
                r3 = 261(0x105, float:3.66E-43)
                if (r4 == r3) goto L_0x0071
                goto L_0x043b
            L_0x0071:
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r9 = "FTPP.onInfo#mediaCodecCloseStuck:"
                r4.append(r9)
                r4.append(r5)
                r4.append(r7)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r7 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                gr1.q2 r7 = r7.f161749s
                if (r7 == 0) goto L_0x008f
                java.lang.String r8 = r7.f170493c
            L_0x008f:
                r4.append(r8)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r4)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                mr1.s r3 = r3.f161717Q
                int r4 = (int) r5
                r3.f175133w = r4
                goto L_0x043b
            L_0x00a2:
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r9 = "FTPP.onInfo#mediaCodecOpenStuck:"
                r4.append(r9)
                r4.append(r5)
                r4.append(r7)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r7 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                gr1.q2 r7 = r7.f161749s
                if (r7 == 0) goto L_0x00c0
                java.lang.String r8 = r7.f170493c
            L_0x00c0:
                r4.append(r8)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r4)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                mr1.s r3 = r3.f161717Q
                int r4 = (int) r5
                r3.f175132v = r4
                goto L_0x043b
            L_0x00d3:
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "FTPP.onInfo#onBufferingEnd() pos:"
                r4.append(r5)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r5 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                long r5 = r5.getCurrentPlayMs()
                r4.append(r5)
                r4.append(r7)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r5 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r5 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.m64984z(r5)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.Runnable r4 = r3.f161707F
                if (r4 == 0) goto L_0x010c
                com.tencent.mm.sdk.platformtools.MMHandler r5 = r3.f161706E
                r5.removeCallbacks(r4)
                r3.f161707F = r8
            L_0x010c:
                boolean r4 = r3.f161752v
                if (r4 == 0) goto L_0x0123
                r3.f161752v = r9
                ht1.c5 r4 = r3.f161720R0
                if (r4 == 0) goto L_0x0123
                gr1.q2 r3 = r3.f161749s
                if (r3 == 0) goto L_0x011d
                java.lang.String r3 = r3.f170493c
                goto L_0x011e
            L_0x011d:
                r3 = r8
            L_0x011e:
                java.lang.String r5 = ""
                r4.mo22955F(r5, r3)
            L_0x0123:
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                gr1.q2 r3 = r3.f161749s
                if (r3 == 0) goto L_0x012c
                java.lang.String r4 = r3.f170493c
                goto L_0x012d
            L_0x012c:
                r4 = r8
            L_0x012d:
                if (r4 == 0) goto L_0x043b
                if (r3 == 0) goto L_0x0133
                java.lang.String r8 = r3.f170493c
            L_0x0133:
                com.tencent.mars.cdn.CdnLogic.markVideoBufferingStatus(r8, r0)
                goto L_0x043b
            L_0x0138:
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "FTPP.onInfo#onBufferingStart() pos:"
                r4.append(r5)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r5 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                long r5 = r5.getCurrentPlayMs()
                r4.append(r5)
                r4.append(r7)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r5 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r5 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.m64984z(r5)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                gr1.q2 r4 = r3.f161749s
                if (r4 == 0) goto L_0x016d
                java.lang.String r4 = r4.f170493c
                goto L_0x016e
            L_0x016d:
                r4 = r8
            L_0x016e:
                java.lang.Runnable r5 = r3.f161707F
                if (r5 == 0) goto L_0x0179
                com.tencent.mm.sdk.platformtools.MMHandler r6 = r3.f161706E
                r6.removeCallbacks(r5)
                r3.f161707F = r8
            L_0x0179:
                gr1.z0 r5 = new gr1.z0
                r5.<init>(r3, r4)
                r3.f161707F = r5
                gr1.q2 r4 = r3.getVideoMediaInfo()
                if (r4 == 0) goto L_0x01b3
                java.lang.String r4 = r4.f170493c
                if (r4 == 0) goto L_0x01b3
                java.lang.Class<dz.h> r5 = p501dz.C58466h.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                dz.h r5 = (p501dz.C58466h) r5
                dz.e r5 = r5.Qi0()
                boolean r4 = r5.mo32057e(r4)
                if (r4 != 0) goto L_0x01b3
                boolean r4 = r3.f161728V0
                if (r4 == 0) goto L_0x01b3
                java.lang.String r4 = r3.getFTPPTag()
                java.lang.String r5 = "checkIfDownloaderCanceled"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                r3.mo79454a0(r8)
                r3.mo79451X(r8)
                mr1.s r4 = r3.f161717Q
                r4.f175116C = r0
            L_0x01b3:
                com.tencent.mm.sdk.platformtools.MMHandler r4 = r3.f161706E
                java.lang.Runnable r5 = r3.f161707F
                boolean r3 = r3.f161747q
                if (r3 == 0) goto L_0x01be
                r6 = 500(0x1f4, double:2.47E-321)
                goto L_0x01c0
            L_0x01be:
                r6 = 1000(0x3e8, double:4.94E-321)
            L_0x01c0:
                r4.postDelayed(r5, r6)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                gr1.q2 r3 = r3.f161749s
                if (r3 == 0) goto L_0x01cc
                java.lang.String r4 = r3.f170493c
                goto L_0x01cd
            L_0x01cc:
                r4 = r8
            L_0x01cd:
                if (r4 == 0) goto L_0x043b
                if (r3 == 0) goto L_0x01d3
                java.lang.String r8 = r3.f170493c
            L_0x01d3:
                com.tencent.mars.cdn.CdnLogic.markVideoBufferingStatus(r8, r9)
                goto L_0x043b
            L_0x01d8:
                boolean r3 = r9 instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo
                if (r3 == 0) goto L_0x043b
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "FTPP.onInfo#downloadProgressUpdate: "
                r4.append(r5)
                com.tencent.thumbplayer.api.TPPlayerMsg$TPDownLoadProgressInfo r9 = (com.tencent.thumbplayer.api.TPPlayerMsg.TPDownLoadProgressInfo) r9
                long r5 = r9.playableDurationMS
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                goto L_0x043b
            L_0x01fc:
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r1 = "FTPP.onInfo#mediaCodecInfo:"
                r4.append(r1)
                r4.append(r5)
                r4.append(r7)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r5 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                gr1.q2 r5 = r5.f161749s
                if (r5 == 0) goto L_0x021b
                java.lang.String r5 = r5.f170493c
                goto L_0x021c
            L_0x021b:
                r5 = r8
            L_0x021c:
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                boolean r3 = r9 instanceof com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo
                if (r3 != 0) goto L_0x0236
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.String r4 = "FTPP.onInfo#mediaCodecInfo return for not codecInfo"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r4)
                return
            L_0x0236:
                r3 = r9
                com.tencent.thumbplayer.api.TPPlayerMsg$TPMediaCodecInfo r3 = (com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo) r3
                int r4 = r3.mediaType
                int r5 = com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo.TP_DEC_MEDIA_TYPE_VIDEO
                if (r4 == r5) goto L_0x024b
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.String r4 = "FTPP.onInfo#mediaCodecInfo return for not video type"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r4)
                return
            L_0x024b:
                int r3 = r3.infoType
                int r4 = com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo.TP_INFO_MEDIA_CODEC_READY
                if (r3 != r4) goto L_0x0295
                c30.g r3 = new c30.g     // Catch:{ all -> 0x0293 }
                com.tencent.thumbplayer.api.TPPlayerMsg$TPMediaCodecInfo r9 = (com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo) r9     // Catch:{ all -> 0x0293 }
                java.lang.String r4 = r9.msg     // Catch:{ all -> 0x0293 }
                r3.<init>((java.lang.String) r4)     // Catch:{ all -> 0x0293 }
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r4 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this     // Catch:{ all -> 0x0293 }
                mr1.t r4 = r4.f161756y     // Catch:{ all -> 0x0293 }
                r5 = -1
                if (r4 != 0) goto L_0x0262
                goto L_0x026f
            L_0x0262:
                java.lang.String r6 = "reuseEnable"
                boolean r6 = r3.optBoolean(r6)     // Catch:{ all -> 0x0293 }
                if (r6 == 0) goto L_0x026c
                r6 = 1
                goto L_0x026d
            L_0x026c:
                r6 = -1
            L_0x026d:
                r4.f175139c = r6     // Catch:{ all -> 0x0293 }
            L_0x026f:
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r4 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this     // Catch:{ all -> 0x0293 }
                mr1.t r4 = r4.f161756y     // Catch:{ all -> 0x0293 }
                if (r4 != 0) goto L_0x0276
                goto L_0x0282
            L_0x0276:
                java.lang.String r6 = "isReuse"
                boolean r6 = r3.optBoolean(r6)     // Catch:{ all -> 0x0293 }
                if (r6 == 0) goto L_0x027f
                goto L_0x0280
            L_0x027f:
                r0 = -1
            L_0x0280:
                r4.f175140d = r0     // Catch:{ all -> 0x0293 }
            L_0x0282:
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r4 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this     // Catch:{ all -> 0x0293 }
                mr1.t r4 = r4.f161756y     // Catch:{ all -> 0x0293 }
                if (r4 != 0) goto L_0x0289
                goto L_0x02b1
            L_0x0289:
                java.lang.String r5 = "totalCodec"
                int r3 = r3.optInt(r5)     // Catch:{ all -> 0x0293 }
                r4.f175141e = r3     // Catch:{ all -> 0x0293 }
                goto L_0x02b1
            L_0x0293:
                goto L_0x02b1
            L_0x0295:
                int r4 = com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo.TP_INFO_MEDIA_CODEC_EXCEPTION
                if (r3 != r4) goto L_0x02b1
                c30.g r3 = new c30.g     // Catch:{ all -> 0x0293 }
                com.tencent.thumbplayer.api.TPPlayerMsg$TPMediaCodecInfo r9 = (com.tencent.thumbplayer.api.TPPlayerMsg.TPMediaCodecInfo) r9     // Catch:{ all -> 0x0293 }
                java.lang.String r4 = r9.msg     // Catch:{ all -> 0x0293 }
                r3.<init>((java.lang.String) r4)     // Catch:{ all -> 0x0293 }
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r4 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this     // Catch:{ all -> 0x0293 }
                mr1.t r4 = r4.f161756y     // Catch:{ all -> 0x0293 }
                if (r4 != 0) goto L_0x02a9
                goto L_0x02b1
            L_0x02a9:
                java.lang.String r5 = "errorCodec"
                java.lang.String r3 = r3.optString(r5)     // Catch:{ all -> 0x0293 }
                r4.f175142f = r3     // Catch:{ all -> 0x0293 }
            L_0x02b1:
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                gr1.w2 r3 = r3.getLifecycle()
                if (r3 == 0) goto L_0x043b
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r4 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                gr1.q2 r5 = r4.f161749s
                if (r5 == 0) goto L_0x02c1
                te3.rq2 r8 = r5.f170494d
            L_0x02c1:
                mr1.t r4 = r4.f161756y
                r3.mo78300i(r8, r4)
                goto L_0x043b
            L_0x02c8:
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r9 = "FTPP.onInfo#videoDecodeType:"
                r4.append(r9)
                r4.append(r5)
                r4.append(r7)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r7 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                gr1.q2 r7 = r7.f161749s
                if (r7 == 0) goto L_0x02e7
                java.lang.String r7 = r7.f170493c
                goto L_0x02e8
            L_0x02e7:
                r7 = r8
            L_0x02e8:
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                gr1.q2 r3 = r3.f161749s
                if (r3 == 0) goto L_0x02ff
                te3.rq2 r4 = r3.f170494d
                if (r4 == 0) goto L_0x02ff
                com.tencent.mm.protocal.protobuf.FinderMediaReportObject r4 = r4.f185262W0
                goto L_0x0300
            L_0x02ff:
                r4 = r8
            L_0x0300:
                if (r4 != 0) goto L_0x0312
                if (r3 == 0) goto L_0x0307
                te3.rq2 r3 = r3.f170494d
                goto L_0x0308
            L_0x0307:
                r3 = r8
            L_0x0308:
                if (r3 != 0) goto L_0x030b
                goto L_0x0312
            L_0x030b:
                com.tencent.mm.protocal.protobuf.FinderMediaReportObject r4 = new com.tencent.mm.protocal.protobuf.FinderMediaReportObject
                r4.<init>()
                r3.f185262W0 = r4
            L_0x0312:
                int r3 = (int) r5
                r4 = 102(0x66, float:1.43E-43)
                if (r3 != r4) goto L_0x0323
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r4 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$a r4 = r4.f161712K
                r4.getClass()
                java.lang.String r5 = "MediaCodec"
                r4.f17567c = r5
                goto L_0x032e
            L_0x0323:
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r4 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$a r4 = r4.f161712K
                r4.getClass()
                java.lang.String r5 = "FFmpeg"
                r4.f17567c = r5
            L_0x032e:
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r4 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                gr1.q2 r4 = r4.f161749s
                if (r4 == 0) goto L_0x033a
                te3.rq2 r4 = r4.f170494d
                if (r4 == 0) goto L_0x033a
                com.tencent.mm.protocal.protobuf.FinderMediaReportObject r8 = r4.f185262W0
            L_0x033a:
                if (r8 != 0) goto L_0x033e
                goto L_0x043b
            L_0x033e:
                r8.playDecoderType = r3
                goto L_0x043b
            L_0x0342:
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "FTPP.onInfo#onReplay() "
                r4.append(r5)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r5 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r5 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.m64984z(r5)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                gr1.w2 r3 = r3.getLifecycle()
                if (r3 == 0) goto L_0x0375
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r4 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                gr1.q2 r4 = r4.f161749s
                if (r4 == 0) goto L_0x0372
                te3.rq2 r8 = r4.f170494d
            L_0x0372:
                r3.mo78299h(r8)
            L_0x0375:
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r3 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                com.tencent.mm.plugin.FinderCommonFeatureService r3 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r3
                co1.e r3 = r3.Hx0()
                bo1.z r3 = r3.f154546a
                r3.mo62457j1()
                goto L_0x043b
            L_0x0388:
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "FTPP.onInfo#firstVideoFrameRenderedAfterSurfaceChange "
                r4.append(r5)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r5 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r5 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.m64984z(r5)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                k03.a r4 = r3.getRenderView()
                boolean r5 = r4 instanceof com.tencent.p014mm.plugin.thumbplayer.render.MMSurfaceViewRender
                if (r5 == 0) goto L_0x03b5
                r8 = r4
                com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender r8 = (com.tencent.p014mm.plugin.thumbplayer.render.MMSurfaceViewRender) r8
            L_0x03b5:
                if (r8 == 0) goto L_0x043b
                gr1.a1 r4 = new gr1.a1
                r4.<init>(r3)
                r8.post(r4)
                goto L_0x043b
            L_0x03c1:
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "FTPP.onInfo#firstVideoFrameRendered "
                r4.append(r5)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r5 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r5 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.m64984z(r5)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                qt1.a r3 = r3.f161711J
                if (r3 == 0) goto L_0x03ec
                java.lang.String r4 = "onRendered"
                r3.mo11310b(r4)
            L_0x03ec:
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r4 = "onFirstFrameRendered"
                r3.mo79439H(r4)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                mr1.s r4 = r3.f161717Q
                qt1.a r3 = r3.f161711J
                if (r3 == 0) goto L_0x0400
                org.json.JSONObject r3 = r3.mo12483d()
                goto L_0x0401
            L_0x0400:
                r3 = r8
            L_0x0401:
                r4.f175114A = r3
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                gr1.w2 r3 = r3.getLifecycle()
                if (r3 == 0) goto L_0x043b
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r4 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                gr1.q2 r5 = r4.f161749s
                if (r5 == 0) goto L_0x0413
                te3.rq2 r8 = r5.f170494d
            L_0x0413:
                r5 = 0
                qt1.a r4 = r4.f161711J
                r3.mo78297f(r8, r5, r4)
                goto L_0x043b
            L_0x041b:
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r3 = r3.getFTPPTag()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "FTPP.onInfo#firstAudioFrameRendered "
                r4.append(r5)
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r5 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.this
                java.lang.String r5 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.m64984z(r5)
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            L_0x043b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.C56504c.onInfo(com.tencent.thumbplayer.api.ITPPlayer, int, long, long, java.lang.Object):void");
        }

        public void onPrepared(ITPPlayer iTPPlayer) {
            C55015f1 f1Var;
            C87412m.m108594g(iTPPlayer, "player");
            String fTPPTag = FinderThumbPlayerProxy.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.OnPrepared() " + FinderThumbPlayerProxy.m64984z(FinderThumbPlayerProxy.this));
            C12931a aVar = FinderThumbPlayerProxy.this.f161711J;
            if (aVar != null) {
                aVar.mo12482c("onPrepared");
            }
            FinderThumbPlayerProxy.this.mo51222E(4);
            String fTPPTag2 = FinderThumbPlayerProxy.this.getFTPPTag();
            StringBuilder sb = new StringBuilder();
            sb.append("dFile:");
            sb.append(FinderThumbPlayerProxy.this.f161734a1);
            sb.append(XVFSFile.SEPARATOR_CHAR);
            sb.append(FinderThumbPlayerProxy.this.f161735b1);
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            FinderThumbPlayerProxy finderThumbPlayerProxy = FinderThumbPlayerProxy.this;
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf((((float) finderThumbPlayerProxy.f161734a1) * 100.0f) / ((float) finderThumbPlayerProxy.f161735b1))}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            sb.append(format);
            sb.append("% ");
            Log.m105924i(fTPPTag2, sb.toString());
            C60157c5 videoViewCallback = FinderThumbPlayerProxy.this.getVideoViewCallback();
            if (videoViewCallback != null) {
                C59673q2 q2Var = FinderThumbPlayerProxy.this.f161749s;
                videoViewCallback.mo22962Z("", q2Var != null ? q2Var.f170493c : null);
            }
            FinderThumbPlayerProxy finderThumbPlayerProxy2 = FinderThumbPlayerProxy.this;
            if (finderThumbPlayerProxy2.f161729W) {
                finderThumbPlayerProxy2.mo79445O(2);
            } else if (finderThumbPlayerProxy2.mo79443L()) {
                FinderThumbPlayerProxy.this.setBgPrepareStatus(1);
                iTPPlayer.pauseDownload();
            }
            FinderThumbPlayerProxy finderThumbPlayerProxy3 = FinderThumbPlayerProxy.this;
            C56502b bVar = finderThumbPlayerProxy3.f161750t;
            if (bVar != null && (f1Var = bVar.f161763h) != null) {
                f1Var.field_audioBitrate = (int) iTPPlayer.getPropertyLong(101);
                f1Var.field_videoBitrate = (int) iTPPlayer.getPropertyLong(202);
                f1Var.field_frameRate = (int) iTPPlayer.getPropertyLong(206);
                f1Var.field_videoCodecId = (int) iTPPlayer.getPropertyLong(201);
                finderThumbPlayerProxy3.f161712K.f17573i = (long) (f1Var.field_audioBitrate + f1Var.field_videoBitrate);
                finderThumbPlayerProxy3.f161717Q.f175131u = f1Var.field_frameRate;
            }
        }

        public void onSeekComplete(ITPPlayer iTPPlayer) {
            ITPPlayerListener.IOnSeekCompleteListener onSeekCompleteListener = FinderThumbPlayerProxy.this.getOnSeekCompleteListener();
            if (onSeekCompleteListener != null) {
                onSeekCompleteListener.onSeekComplete(iTPPlayer);
            }
            FinderThumbPlayerProxy.this.setOnSeekCompleteListener((ITPPlayerListener.IOnSeekCompleteListener) null);
            FinderThumbPlayerProxy.this.f161703B = false;
        }

        public void onStateChange(int i, int i2) {
            String fTPPTag = FinderThumbPlayerProxy.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onStateChange() preState:" + i + " curState:" + i2 + ' ' + FinderThumbPlayerProxy.m64984z(FinderThumbPlayerProxy.this));
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            FinderThumbPlayerProxy.m64982j(FinderThumbPlayerProxy.this, surfaceTexture);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            String fTPPTag = FinderThumbPlayerProxy.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onSurfaceTextureDestroyed() surfaceTexture:" + surfaceTexture.hashCode() + ' ' + FinderThumbPlayerProxy.m64984z(FinderThumbPlayerProxy.this));
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            String fTPPTag = FinderThumbPlayerProxy.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.onSurfaceTextureSizeChanged  surfaceTexture:" + surfaceTexture.hashCode() + ' ' + i + ' ' + i2 + ' ' + FinderThumbPlayerProxy.m64984z(FinderThumbPlayerProxy.this));
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            FinderThumbPlayerProxy finderThumbPlayerProxy = FinderThumbPlayerProxy.this;
            finderThumbPlayerProxy.getClass();
            finderThumbPlayerProxy.f161717Q.f175118e++;
        }

        public void onVideoSizeChanged(ITPPlayer iTPPlayer, long j, long j2) {
            String fTPPTag = FinderThumbPlayerProxy.this.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.OnVideoSizeChanged() width:" + j + " height:" + j2 + ' ' + FinderThumbPlayerProxy.m64984z(FinderThumbPlayerProxy.this));
            FinderThumbPlayerProxy.this.getRenderView().mo81067b((int) j, (int) j2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$d */
    public static final class C56506d extends C87413o implements C32224a<C61571a> {

        /* renamed from: d */
        public static final C56506d f161773d = new C56506d();

        public C56506d() {
            super(0);
        }

        public Object invoke() {
            return new C61571a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$e */
    public static final class C56507e extends C87413o implements C32224a<C60615a> {

        /* renamed from: d */
        public static final C56507e f161774d = new C56507e();

        public C56507e() {
            super(0);
        }

        public Object invoke() {
            return new C60615a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$f */
    public static final class C56508f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f161775d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56508f(C32224a<C13598b0> aVar) {
            super(0);
            this.f161775d = aVar;
        }

        public Object invoke() {
            this.f161775d.invoke();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$g */
    public static final class C56509g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderThumbPlayerProxy f161776d;

        /* renamed from: e */
        public final /* synthetic */ String f161777e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56509g(FinderThumbPlayerProxy finderThumbPlayerProxy, String str) {
            super(0);
            this.f161776d = finderThumbPlayerProxy;
            this.f161777e = str;
        }

        public Object invoke() {
            FinderThumbPlayerProxy finderThumbPlayerProxy = this.f161776d;
            HashSet<Integer> hashSet = FinderThumbPlayerProxy.f161699c1;
            finderThumbPlayerProxy.mo79437F();
            C60698b bVar = this.f161776d.f161740h;
            if (bVar != null) {
                bVar.release();
                FinderVideoRecycler finderVideoRecycler = (FinderVideoRecycler) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderVideoRecycler.class);
                String valueOf = String.valueOf(this.f161776d.hashCode());
                finderVideoRecycler.getClass();
                C87412m.m108594g(valueOf, "finderVideoProxyHashcode");
                finderVideoRecycler.f162540w.remove(valueOf);
                Log.m105924i("Finder.VideoRecycler", "tryQuitHandlerThread proxy:" + valueOf + " count：" + finderVideoRecycler.f162540w.size());
                if (finderVideoRecycler.f162540w.size() == 0) {
                    HandlerThread handlerThread = finderVideoRecycler.f162539v;
                    if (handlerThread != null) {
                        handlerThread.quit();
                    }
                    finderVideoRecycler.f162539v = null;
                }
                this.f161776d.mo51222E(11);
                String fTPPTag = this.f161776d.getFTPPTag();
                Log.m105924i(fTPPTag, this.f161777e + " onReleaseInternal releaseInternal  FinderThumbPlayerProxy " + this.f161776d.hashCode() + ' ' + FinderThumbPlayerProxy.m64984z(this.f161776d));
                return C13598b0.f38549a;
            }
            C87412m.m108603p("player");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$h */
    public static final class C56510h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderThumbPlayerProxy f161778d;

        public C56510h(FinderThumbPlayerProxy finderThumbPlayerProxy) {
            this.f161778d = finderThumbPlayerProxy;
        }

        public final void run() {
            C12931a aVar = this.f161778d.f161711J;
            if (aVar != null) {
                aVar.mo12482c("prepareAsync");
            }
            C60698b bVar = this.f161778d.f161740h;
            if (bVar != null) {
                bVar.prepareAsync();
                this.f161778d.mo51222E(3);
                return;
            }
            C87412m.m108603p("player");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$i */
    public static final class C56511i implements C20502f {

        /* renamed from: a */
        public final /* synthetic */ C56502b f161779a;

        /* renamed from: b */
        public final /* synthetic */ int f161780b;

        public C56511i(C56502b bVar, int i) {
            this.f161779a = bVar;
            this.f161780b = i;
        }

        /* renamed from: a */
        public C98127h mo32064a(String str) {
            C87412m.m108594g(str, "id");
            C56502b bVar = this.f161779a;
            int i = this.f161780b;
            bVar.getClass();
            C58784w3 w3Var = C58784w3.f168295a;
            String str2 = bVar.f161759d;
            C59673q2 q2Var = bVar.f161760e;
            String str3 = q2Var.f170491a;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = q2Var.f170492b;
            C36594q qVar = (C36594q) C86312j.m106911c(C36594q.class);
            C59673q2 q2Var2 = bVar.f161760e;
            int EJ = qVar.mo60729EJ(1, q2Var2 != null ? q2Var2.f170492b : null);
            String str5 = bVar.f161763h.field_fileFormat;
            if (str5 == null) {
                str5 = "";
            }
            String urlToken = ((C62367r0) bVar.f161760e.f170495e).getUrlToken();
            String str6 = bVar.f161760e.f170495e.mo87421f().f185284x;
            if (str6 == null) {
                str6 = "";
            }
            return w3Var.mo83973w(str2, str3, str4, EJ, str5, urlToken, str6, bVar.f161760e.f170495e.mo87421f().f185257U == 1, bVar, i, bVar.f161766n.getFTPPTag());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$j */
    public static final class C56512j implements C20505i {

        /* renamed from: a */
        public final /* synthetic */ FinderThumbPlayerProxy f161781a;

        /* renamed from: b */
        public final /* synthetic */ C25026b.C25032b f161782b;

        /* renamed from: c */
        public final /* synthetic */ C55015f1 f161783c;

        /* renamed from: d */
        public final /* synthetic */ C56502b f161784d;

        public C56512j(FinderThumbPlayerProxy finderThumbPlayerProxy, C25026b.C25032b bVar, C55015f1 f1Var, C56502b bVar2) {
            this.f161781a = finderThumbPlayerProxy;
            this.f161782b = bVar;
            this.f161783c = f1Var;
            this.f161784d = bVar2;
        }

        /* renamed from: a */
        public void mo32067a(int i, C98127h hVar) {
            C25026b.C25032b bVar;
            String fTPPTag = this.f161781a.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.startCdnDownload#onStart " + FinderThumbPlayerProxy.m64984z(this.f161781a) + ' ' + i + " observer:" + this.f161782b);
            if (i == 0 && (bVar = this.f161782b) != null) {
                C25026b.C25033c cVar = new C25026b.C25033c(true, this.f161783c, (C55015f1) null, (C98121d) null);
                bVar.f71429a = cVar;
                C32226l<? super C25026b.C25033c, C13598b0> lVar = bVar.f71430b;
                if (lVar != null) {
                    lVar.invoke(cVar);
                }
            }
            C55015f1 d = C66167g.m78055d(C66167g.f190173a, this.f161784d.f161759d, false, 2, (Object) null);
            FinderThumbPlayerProxy finderThumbPlayerProxy = this.f161781a;
            finderThumbPlayerProxy.f161717Q.f175115B = (int) d.field_cacheSize;
            String fTPPTag2 = finderThumbPlayerProxy.getFTPPTag();
            Log.m105924i(fTPPTag2, "FTPP.startCdnDownload#onStart hitPreloadSize:" + d.field_cacheSize);
            this.f161781a.mo79457e0(true);
        }

        /* renamed from: b */
        public void mo32068b(int i, C98127h hVar, C98121d dVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$k */
    public static final class C56513k implements MTimerHandler.CallBack {

        /* renamed from: d */
        public long f161785d = -1;

        /* renamed from: e */
        public long f161786e = -1;

        /* renamed from: f */
        public final /* synthetic */ FinderThumbPlayerProxy f161787f;

        /* renamed from: g */
        public final /* synthetic */ C59673q2 f161788g;

        /* renamed from: h */
        public final /* synthetic */ C25026b f161789h;

        public C56513k(FinderThumbPlayerProxy finderThumbPlayerProxy, C59673q2 q2Var, C25026b bVar) {
            this.f161787f = finderThumbPlayerProxy;
            this.f161788g = q2Var;
            this.f161789h = bVar;
        }

        public boolean onTimerExpired() {
            long j;
            long currentPlayMs = this.f161787f.getCurrentPlayMs();
            long videoDurationMs = this.f161787f.getVideoDurationMs();
            if (this.f161786e != currentPlayMs) {
                C59684w2 lifecycle = this.f161787f.getLifecycle();
                if (lifecycle != null) {
                    lifecycle.mo78296d(this.f161788g.f170494d, currentPlayMs, videoDurationMs);
                }
                long j2 = this.f161785d;
                if (j2 == -1 || currentPlayMs - j2 > 1000 || currentPlayMs < j2) {
                    C59684w2 lifecycle2 = this.f161787f.getLifecycle();
                    if (lifecycle2 != null) {
                        lifecycle2.mo78294c(this.f161788g.f170494d, ((int) currentPlayMs) / 1000, ((int) videoDurationMs) / 1000);
                    }
                    C60157c5 videoViewCallback = this.f161787f.getVideoViewCallback();
                    if (videoViewCallback != null) {
                        videoViewCallback.mo22959M5(((int) currentPlayMs) / 1000, ((int) videoDurationMs) / 1000);
                    }
                    String fTPPTag = this.f161787f.getFTPPTag();
                    StringBuilder sb = new StringBuilder();
                    sb.append(currentPlayMs);
                    sb.append(XVFSFile.SEPARATOR_CHAR);
                    sb.append(videoDurationMs);
                    sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                    float f = (float) videoDurationMs;
                    String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf((((float) currentPlayMs) * 100.0f) / f)}, 1));
                    C87412m.m108593f(format, "format(format, *args)");
                    sb.append(format);
                    sb.append("% dTime:");
                    FinderThumbPlayerProxy finderThumbPlayerProxy = this.f161787f;
                    long j3 = currentPlayMs;
                    sb.append((int) (((((float) finderThumbPlayerProxy.f161734a1) * 1.0f) / ((float) finderThumbPlayerProxy.f161735b1)) * f));
                    sb.append(XVFSFile.SEPARATOR_CHAR);
                    sb.append(videoDurationMs);
                    sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                    FinderThumbPlayerProxy finderThumbPlayerProxy2 = this.f161787f;
                    String format2 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf((((float) finderThumbPlayerProxy2.f161734a1) * 100.0f) / ((float) finderThumbPlayerProxy2.f161735b1))}, 1));
                    C87412m.m108593f(format2, "format(format, *args)");
                    sb.append(format2);
                    sb.append("% dFile:");
                    sb.append(this.f161787f.f161734a1);
                    sb.append(XVFSFile.SEPARATOR_CHAR);
                    sb.append(this.f161787f.f161735b1);
                    sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                    FinderThumbPlayerProxy finderThumbPlayerProxy3 = this.f161787f;
                    String format3 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf((((float) finderThumbPlayerProxy3.f161734a1) * 100.0f) / ((float) finderThumbPlayerProxy3.f161735b1))}, 1));
                    C87412m.m108593f(format3, "format(format, *args)");
                    sb.append(format3);
                    sb.append("% ");
                    Log.m105924i(fTPPTag, sb.toString());
                    j = j3;
                    this.f161785d = j;
                    CdnLogic.updateVideoPlaybackTimetick(this.f161788g.f170493c, ((double) j) / 1000.0d);
                } else {
                    j = currentPlayMs;
                }
                this.f161786e = j;
            } else {
                j = currentPlayMs;
            }
            C61575s sVar = this.f161787f.f161717Q;
            if (sVar != null) {
                sVar.mo86516e(j, videoDurationMs);
            }
            C25026b bVar = this.f161789h;
            String str = this.f161788g.f170493c;
            bVar.getClass();
            C87412m.m108594g(str, "mediaId");
            C61926c.m72660E("FinderNetworkFlowReport_Thread", false, new C25041j(bVar, str, j));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$l */
    public static final class C56514l implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ FinderThumbPlayerProxy f161790d;

        public C56514l(FinderThumbPlayerProxy finderThumbPlayerProxy) {
            this.f161790d = finderThumbPlayerProxy;
        }

        public final boolean onTimerExpired() {
            C60157c5 c5Var;
            FinderThumbPlayerProxy finderThumbPlayerProxy = this.f161790d;
            long j = finderThumbPlayerProxy.f161732Y0;
            long j2 = finderThumbPlayerProxy.f161733Z0;
            C60698b bVar = finderThumbPlayerProxy.f161740h;
            String str = null;
            if (bVar != null) {
                int propertyLong = (int) bVar.getPropertyLong(206);
                C60698b bVar2 = finderThumbPlayerProxy.f161740h;
                if (bVar2 != null) {
                    finderThumbPlayerProxy.f161732Y0 = bVar2.getPropertyLong(208);
                    C60698b bVar3 = finderThumbPlayerProxy.f161740h;
                    if (bVar3 != null) {
                        long propertyLong2 = bVar3.getPropertyLong(209);
                        finderThumbPlayerProxy.f161733Z0 = propertyLong2;
                        if (j <= 0 || j2 <= 0) {
                            return true;
                        }
                        long j3 = finderThumbPlayerProxy.f161732Y0;
                        if (j3 > 999999 || j3 < 0 || propertyLong2 < 0 || propertyLong2 > 999999) {
                            return true;
                        }
                        long j4 = j3 - j;
                        if (j4 - ((long) propertyLong) > 10 || j4 < 0) {
                            return true;
                        }
                        long j5 = propertyLong2 - j2;
                        if (j5 < 0 || (c5Var = finderThumbPlayerProxy.f161720R0) == null) {
                            return true;
                        }
                        C59673q2 q2Var = finderThumbPlayerProxy.f161749s;
                        if (q2Var != null) {
                            str = q2Var.f170493c;
                        }
                        int i = (int) j4;
                        c5Var.mo22961V5("", str, propertyLong, i, (int) j5);
                        return true;
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
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$m */
    public static final class C56515m implements C58471k {

        /* renamed from: a */
        public final /* synthetic */ FinderThumbPlayerProxy f161791a;

        /* renamed from: b */
        public final /* synthetic */ C25026b.C25032b f161792b;

        /* renamed from: c */
        public final /* synthetic */ C56502b f161793c;

        public C56515m(FinderThumbPlayerProxy finderThumbPlayerProxy, C25026b.C25032b bVar, C56502b bVar2) {
            this.f161791a = finderThumbPlayerProxy;
            this.f161792b = bVar;
            this.f161793c = bVar2;
        }

        /* renamed from: b */
        public void mo79502b(int i, C98127h hVar, C98121d dVar) {
            C59679v2 downloadCallback;
            FinderThumbPlayerProxy finderThumbPlayerProxy = this.f161791a;
            C59673q2 q2Var = finderThumbPlayerProxy.f161749s;
            if (!(q2Var == null || (downloadCallback = finderThumbPlayerProxy.getDownloadCallback()) == null)) {
                downloadCallback.mo78325h(q2Var.f170495e, hVar, dVar);
            }
            if (i == 0) {
                C25026b.C25032b bVar = this.f161792b;
                if (bVar != null) {
                    C25026b.C25033c cVar = new C25026b.C25033c(false, (C55015f1) null, this.f161793c.f161763h, dVar);
                    bVar.f71429a = cVar;
                    C32226l<? super C25026b.C25033c, C13598b0> lVar = bVar.f71430b;
                    if (lVar != null) {
                        lVar.invoke(cVar);
                    }
                }
                C25026b Fx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Fx0();
                String str = this.f161793c.f161759d;
                Fx0.getClass();
                C87412m.m108594g(str, "mediaId");
                if (dVar == null) {
                    Log.m105928w("FinderNetworkFlowReport", "downloaderComeStopState mediaId:" + str + " return for result is null  size:" + Fx0.f71362c.size() + " list:");
                } else {
                    C61926c.m72661F("FinderNetworkFlowReport_Thread", new C25034c(Fx0, str, dVar));
                }
            }
            String fTPPTag = this.f161791a.getFTPPTag();
            Log.m105924i(fTPPTag, "FTPP.stopCdnDownload#onStop(), real cancel download task " + FinderThumbPlayerProxy.m64984z(this.f161791a) + ' ' + i + " observer:" + this.f161792b);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$n */
    public static final class C56516n implements C58470j {

        /* renamed from: a */
        public final /* synthetic */ FinderThumbPlayerProxy f161794a;

        /* renamed from: b */
        public final /* synthetic */ C56502b f161795b;

        public C56516n(FinderThumbPlayerProxy finderThumbPlayerProxy, C56502b bVar) {
            this.f161794a = finderThumbPlayerProxy;
            this.f161795b = bVar;
        }

        /* renamed from: a */
        public void mo79503a(int i, C98121d dVar) {
            String fTPPTag = this.f161794a.getFTPPTag();
            Log.m105924i(fTPPTag, "stopCdnPreload()#onStop " + FinderThumbPlayerProxy.m64984z(this.f161794a) + ' ' + i);
            ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Fx0().mo52132i(this.f161795b.f161759d, dVar, "proxy#stop");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$o */
    public static final class C56517o extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderThumbPlayerProxy f161796d;

        /* renamed from: e */
        public final /* synthetic */ C59673q2 f161797e;

        /* renamed from: f */
        public final /* synthetic */ long f161798f;

        /* renamed from: g */
        public final /* synthetic */ long f161799g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56517o(FinderThumbPlayerProxy finderThumbPlayerProxy, C59673q2 q2Var, long j, long j2) {
            super(0);
            this.f161796d = finderThumbPlayerProxy;
            this.f161797e = q2Var;
            this.f161798f = j;
            this.f161799g = j2;
        }

        public Object invoke() {
            C59684w2 lifecycle = this.f161796d.getLifecycle();
            if (lifecycle != null) {
                lifecycle.mo78294c(this.f161797e.f170494d, ((int) this.f161798f) / 1000, ((int) this.f161799g) / 1000);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderThumbPlayerProxy(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        C59316c<C54452a> cVar = new C59316c<>(this);
        this.f161736d = cVar;
        this.f161737e = new C59314b(cVar.mo84417a());
        mo79440I();
    }

    /* renamed from: D */
    public static void m64977D(FinderThumbPlayerProxy finderThumbPlayerProxy, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            if (z) {
                if (!z) {
                    finderThumbPlayerProxy.getClass();
                    return;
                } else if (!(finderThumbPlayerProxy.getRenderView() instanceof MMSurfaceViewRender)) {
                    return;
                }
            }
            finderThumbPlayerProxy.f161725U.mo85885a(finderThumbPlayerProxy.getRenderView(), finderThumbPlayerProxy.f161743n, finderThumbPlayerProxy.getCoverBitmap());
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: captureFrame");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [gr1.q2] */
    /* JADX WARNING: type inference failed for: r13v1, types: [nr1.b] */
    /* JADX WARNING: type inference failed for: r6v2, types: [nr1.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m64978Q(com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy r20, gr1.C59673q2 r21, boolean r22, boolean r23, int r24, java.lang.Object r25) {
        /*
            r0 = r20
            if (r25 != 0) goto L_0x0110
            r1 = r24 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000b
            r1 = r2
            goto L_0x000d
        L_0x000b:
            r1 = r21
        L_0x000d:
            r3 = r24 & 2
            r4 = 0
            if (r3 == 0) goto L_0x0014
            r3 = 0
            goto L_0x0016
        L_0x0014:
            r3 = r22
        L_0x0016:
            r5 = r24 & 4
            if (r5 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r4 = r23
        L_0x001d:
            r5 = 1
            r0.f161714M = r5
            r0.f161710I = r2
            r0.f161726U0 = r2
            r0.f161722S0 = r2
            r0.f161724T0 = r2
            r0.f161748r = r2
            r0.f161720R0 = r2
            android.view.ViewPropertyAnimator r5 = r20.animate()
            r5.cancel()
            android.view.ViewPropertyAnimator r5 = r20.animate()
            r5.setListener(r2)
            if (r1 == 0) goto L_0x00fb
            if (r4 == 0) goto L_0x0051
            nr1.a r4 = new nr1.a
            java.lang.String r8 = r1.f170492b
            java.lang.String r9 = r1.f170493c
            te3.rq2 r10 = r1.f170494d
            pl1.u0 r11 = r1.f170495e
            com.tencent.mm.plugin.finder.storage.FeedData r12 = r1.f170496f
            java.lang.String r7 = ""
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x006b
        L_0x0051:
            nr1.b r4 = new nr1.b
            java.lang.String r14 = r1.f170491a
            java.lang.String r15 = r1.f170492b
            java.lang.String r5 = r1.f170493c
            te3.rq2 r6 = r1.f170494d
            pl1.u0 r7 = r1.f170495e
            com.tencent.mm.plugin.finder.storage.FeedData r8 = r1.f170496f
            r13 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19)
        L_0x006b:
            r0.f161749s = r4
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b r5 = r0.f161750t
            if (r5 == 0) goto L_0x0073
            java.lang.String r2 = r5.f161759d
        L_0x0073:
            java.lang.String r4 = r4.f170493c
            boolean r2 = gy3.C87412m.m108589b(r2, r4)
            if (r2 != 0) goto L_0x00aa
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b r2 = new com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b
            gr1.q2 r4 = r0.f161749s
            gy3.C87412m.m108591d(r4)
            java.lang.String r4 = r4.f170493c
            gr1.q2 r5 = r0.f161749s
            gy3.C87412m.m108591d(r5)
            r2.<init>(r0, r4, r5)
            r0.f161750t = r2
            java.lang.String r2 = r20.getFTPPTag()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "setVideoMediaInfo(), init proxy "
            r4.append(r5)
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b r5 = r0.f161750t
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            goto L_0x00c5
        L_0x00aa:
            java.lang.String r2 = r20.getFTPPTag()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "setVideoMediaInfo(), duplicated mediaId "
            r4.append(r5)
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b r5 = r0.f161750t
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r4)
        L_0x00c5:
            pl1.u0 r2 = r1.f170495e
            pl1.r0 r2 = (pl1.C62367r0) r2
            java.lang.String r2 = r2.mo11841b()
            if (r2 != 0) goto L_0x00d1
            java.lang.String r2 = ""
        L_0x00d1:
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r1.f170496f
            r0.mo79441J(r2, r1)
            gr1.q2 r1 = r0.f161749s
            gy3.C87412m.m108591d(r1)
            r0.mo79442K(r1, r3)
            mr1.s r1 = r0.f161717Q
            r1.mo86517f()
            mr1.s r1 = r0.f161717Q
            gr1.q2 r2 = r0.f161749s
            gy3.C87412m.m108591d(r2)
            java.lang.String r2 = r2.f170493c
            r1.getClass()
            java.lang.String r3 = "mediaId"
            gy3.C87412m.m108594g(r2, r3)
            r1.f175117d = r2
            mr1.s r1 = r0.f161717Q
            r1.mo86515d()
        L_0x00fb:
            java.lang.String r1 = r20.getFTPPTag()
            java.lang.String r2 = "prepareForReuseTPView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b r0 = r0.f161750t
            if (r0 == 0) goto L_0x010f
            java.util.HashSet<java.lang.String> r1 = f161700d1
            java.lang.String r0 = r0.f161759d
            r1.add(r0)
        L_0x010f:
            return
        L_0x0110:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: prepareForReuseTPView"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.m64978Q(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, gr1.q2, boolean, boolean, int, java.lang.Object):void");
    }

    /* renamed from: S */
    public static final void m64979S(FinderThumbPlayerProxy finderThumbPlayerProxy, C59673q2 q2Var, C56502b bVar, C55015f1 f1Var, int i) {
        C59673q2 q2Var2 = q2Var;
        C25026b Fx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Fx0();
        String fTPPTag = finderThumbPlayerProxy.getFTPPTag();
        long feedId = q2Var2.f170496f.getFeedId();
        String str = bVar.f161759d;
        int i2 = finderThumbPlayerProxy.f161723T;
        C64689rq2 rq22 = q2Var2.f170494d;
        C58469b bVar2 = new C58469b(i, 2, i2, 1, rq22 != null ? rq22.f185238E : 0, finderThumbPlayerProxy.getFTPPTag(), 0, 64, (C8480h) null);
        new C98127h();
        Fx0.getClass();
        C87412m.m108594g(fTPPTag, "ftpp");
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(f1Var, "mediaCache");
        C61926c.m72661F("FinderNetworkFlowReport_Thread", new C25046o(feedId, str, bVar2, fTPPTag, f1Var, Fx0));
    }

    private final Bitmap getCoverBitmap() {
        if (this.f161731X0 != null) {
            Log.m105924i("FTPP.FinderThumbPlayerProxy", "getCoverBitmap return cache coverBitmap:" + this.f161731X0);
        } else {
            try {
                ViewParent parent = getParent();
                C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ImageView imageView = (ImageView) ((ViewGroup) parent).findViewById(C0966R.C0970id.kk8);
                Bitmap bitmap = null;
                Drawable drawable = imageView != null ? imageView.getDrawable() : null;
                BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                if (bitmapDrawable != null) {
                    bitmap = bitmapDrawable.getBitmap();
                }
                if (bitmap != null) {
                    if (!bitmap.isRecycled()) {
                        this.f161731X0 = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), true);
                        Log.m105924i("FTPP.FinderThumbPlayerProxy", "getCoverBitmap return new coverBitmap:" + this.f161731X0);
                    } else {
                        Log.m105924i("FTPP.FinderThumbPlayerProxy", "getCoverBitmap return isRecycled" + bitmap.isRecycled());
                    }
                }
            } catch (Throwable th) {
                Log.m105928w("FTPP.FinderThumbPlayerProxy", "getCoverBitmap return e:" + th);
            }
        }
        return this.f161731X0;
    }

    /* access modifiers changed from: private */
    public final C61571a getFTPPKVReporter() {
        return (C61571a) this.f161758z.getValue();
    }

    /* access modifiers changed from: private */
    public final C60615a getFTPPLog() {
        return (C60615a) this.f161702A.getValue();
    }

    private final String getProxyState() {
        boolean z = this.f161729W;
        float alpha = getAlpha();
        Surface surface = this.f161743n;
        Boolean valueOf = surface != null ? Boolean.valueOf(surface.isValid()) : null;
        int i = this.f161745p;
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

    /* renamed from: j */
    public static final void m64982j(FinderThumbPlayerProxy finderThumbPlayerProxy, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (surfaceTexture == null) {
            String fTPPTag = finderThumbPlayerProxy.getFTPPTag();
            Log.m105924i(fTPPTag, "handleOnSurfaceAvailable return for surfaceTexture:" + surfaceTexture);
        } else if (!(finderThumbPlayerProxy.getRenderView() instanceof MMTextureViewRender)) {
            String fTPPTag2 = finderThumbPlayerProxy.getFTPPTag();
            Log.m105924i(fTPPTag2, "handleOnSurfaceAvailable return for textureView:" + finderThumbPlayerProxy.getRenderView());
        } else {
            String fTPPTag3 = finderThumbPlayerProxy.getFTPPTag();
            Log.m105924i(fTPPTag3, "FTPP.handleOnSurfaceAvailable() width:" + finderThumbPlayerProxy.getWidth() + " height:" + finderThumbPlayerProxy.getHeight() + " surfaceTexture:" + surfaceTexture.hashCode() + ' ' + finderThumbPlayerProxy.getProxyState() + " surface:" + finderThumbPlayerProxy.f161743n + " currSurfaceTexture:" + finderThumbPlayerProxy.f161744o);
            C12931a aVar = finderThumbPlayerProxy.f161711J;
            if (aVar != null) {
                aVar.mo12482c("onSurfaceAva");
            }
            Boolean bool = null;
            if (finderThumbPlayerProxy.f161743n == null || (surfaceTexture2 = finderThumbPlayerProxy.f161744o) == null) {
                finderThumbPlayerProxy.f161744o = surfaceTexture;
                Surface surface = new Surface(surfaceTexture);
                finderThumbPlayerProxy.f161743n = surface;
                C60698b bVar = finderThumbPlayerProxy.f161740h;
                if (bVar != null) {
                    bVar.setSurface(surface);
                    finderThumbPlayerProxy.mo79445O(1);
                    return;
                }
                C87412m.m108603p("player");
                throw null;
            }
            Boolean valueOf = Build.VERSION.SDK_INT < 26 ? Boolean.FALSE : Boolean.valueOf(surfaceTexture2.isReleased());
            String fTPPTag4 = finderThumbPlayerProxy.getFTPPTag();
            StringBuilder sb = new StringBuilder();
            sb.append("FTPP.handleOnSurfaceAvailable() return for surface:");
            Surface surface2 = finderThumbPlayerProxy.f161743n;
            sb.append(surface2 != null ? Integer.valueOf(surface2.hashCode()) : null);
            sb.append(" valid:");
            Surface surface3 = finderThumbPlayerProxy.f161743n;
            if (surface3 != null) {
                bool = Boolean.valueOf(surface3.isValid());
            }
            sb.append(bool);
            sb.append(" released:");
            sb.append(valueOf);
            sb.append(" isReusing:");
            sb.append(finderThumbPlayerProxy.f161714M);
            Log.m105924i(fTPPTag4, sb.toString());
            C60931a renderView = finderThumbPlayerProxy.getRenderView();
            C87412m.m108592e(renderView, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender");
            SurfaceTexture surfaceTexture3 = finderThumbPlayerProxy.f161744o;
            C87412m.m108591d(surfaceTexture3);
            ((MMTextureViewRender) renderView).setSurfaceTexture(surfaceTexture3);
        }
    }

    /* renamed from: r */
    public static final void m64983r(FinderThumbPlayerProxy finderThumbPlayerProxy, SurfaceHolder surfaceHolder) {
        String fTPPTag = finderThumbPlayerProxy.getFTPPTag();
        Log.m105924i(fTPPTag, "FTPP.handleOnSurfaceHolderAvailable() width:" + finderThumbPlayerProxy.getWidth() + " height:" + finderThumbPlayerProxy.getHeight() + " surfaceHolder:" + surfaceHolder.hashCode() + ' ' + finderThumbPlayerProxy.getProxyState());
        finderThumbPlayerProxy.f161743n = surfaceHolder.getSurface();
        C60698b bVar = finderThumbPlayerProxy.f161740h;
        if (bVar != null) {
            bVar.setSurface(surfaceHolder.getSurface());
            finderThumbPlayerProxy.mo79445O(1);
            return;
        }
        C87412m.m108603p("player");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void setBgPrepareStatus(int i) {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "setBgPrepareStatus " + i + ' ' + getProxyState());
        this.f161754x = i;
    }

    /* renamed from: z */
    public static final String m64984z(FinderThumbPlayerProxy finderThumbPlayerProxy) {
        return finderThumbPlayerProxy.getProxyState();
    }

    /* renamed from: A */
    public void mo78597A(C58924d dVar, int i, int i2, long j) {
        C87412m.m108594g(dVar, "txPlayer");
    }

    /* renamed from: B */
    public boolean mo51221B(Integer num) {
        String str;
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "startOrPlay() " + getProxyState());
        this.f161717Q.mo86515d();
        if (!this.f161729W) {
            String fTPPTag2 = getFTPPTag();
            Log.m105924i(fTPPTag2, "startOrPlay() return for isViewFocused:" + this.f161729W);
            return false;
        }
        C12931a aVar = this.f161711J;
        if (aVar != null) {
            aVar.mo12482c("startOrPlay");
        }
        C55015f1 f1Var = null;
        if (this.f161751u) {
            Log.m105924i(getFTPPTag(), "startOrPlay() first time to play");
            C59684w2 w2Var = this.f161722S0;
            if (w2Var != null) {
                C59673q2 q2Var = this.f161749s;
                w2Var.mo78300i(q2Var != null ? q2Var.f170494d : null, this.f161756y);
            }
            C59684w2 w2Var2 = this.f161722S0;
            if (w2Var2 != null) {
                C59673q2 q2Var2 = this.f161749s;
                w2Var2.mo78305n(q2Var2 != null ? q2Var2.f170494d : null, q2Var2, this.f161754x);
            }
            C59673q2 q2Var3 = this.f161749s;
            if (!(q2Var3 == null || (str = q2Var3.f170493c) == null)) {
                C55015f1 c = C66167g.f190173a.mo90234c(str, false);
                this.f161717Q.f175115B = (int) c.field_cacheSize;
                String fTPPTag3 = getFTPPTag();
                Log.m105924i(fTPPTag3, "FTPP.startOrPlay hitPreloadSize:" + c.field_cacheSize);
            }
            this.f161717Q.f175115B = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0().f154540F;
            this.f161751u = false;
            this.f161712K.f17569e = SystemClock.elapsedRealtime();
            C115669n.INSTANCE.mo175913w(1505, 252, 1);
        }
        if (mo79443L()) {
            String fTPPTag4 = getFTPPTag();
            Log.m105924i(fTPPTag4, "startOrPlay() return for currentPlayState:" + this.f161745p);
            mo79445O(3);
            return false;
        }
        C56502b bVar = this.f161750t;
        if (bVar != null) {
            bVar.mo79494c();
        }
        C58784w3 w3Var = C58784w3.f168295a;
        C59673q2 q2Var4 = this.f161749s;
        C56502b bVar2 = this.f161750t;
        if (bVar2 != null) {
            f1Var = bVar2.f161763h;
        }
        C58739j4 j4Var = C58739j4.f168176a;
        if (q2Var4 == null || bVar2 == null || f1Var == null) {
            return false;
        }
        boolean n2 = f1Var.mo76073n2();
        boolean k = C86013q1.m106450k(q2Var4.f170492b);
        String fTPPTag5 = getFTPPTag();
        Log.m105924i(fTPPTag5, "startOrPlay() isAllCompleted:" + n2 + " isExist:" + k + ' ' + getProxyState());
        C25026b.C25032b bVar3 = new C25026b.C25032b();
        if (q2Var4 instanceof C61891a) {
            mo79446P(q2Var4.f170493c, q2Var4.f170492b, 41, bVar3);
            return true;
        } else if (!(q2Var4 instanceof C61892b) || !n2 || !k) {
            mo79447R(q2Var4.f170493c, q2Var4.f170491a, 5, bVar3);
            mo79451X(bVar3);
            return true;
        } else {
            mo79446P(q2Var4.f170493c, q2Var4.f170492b, 42, bVar3);
            return true;
        }
    }

    /* renamed from: E */
    public void mo51222E(int i) {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "changePlayerState from:" + this.f161745p + " to:" + i);
        if (i != 4 || this.f161745p == 3) {
            this.f161745p = i;
            int i2 = this.f161745p;
            this.f161717Q.f175120g = i2;
            C59673q2 q2Var = this.f161749s;
            if (q2Var == null) {
                Log.m105924i(getFTPPTag(), "FTPP.handlePlayerStateChange() return for null");
                return;
            }
            C64689rq2 rq22 = null;
            if (i2 == 5) {
                C60157c5 c5Var = this.f161720R0;
                if (c5Var != null) {
                    c5Var.mo22965m0("", q2Var.f170493c);
                }
                C59684w2 w2Var = this.f161722S0;
                if (w2Var != null) {
                    C59673q2 q2Var2 = this.f161749s;
                    if (q2Var2 != null) {
                        rq22 = q2Var2.f170494d;
                    }
                    w2Var.mo77475e(rq22);
                }
                C59673q2 q2Var3 = this.f161749s;
                if (q2Var3 != null) {
                    mo79453Z(q2Var3);
                }
            } else if (i2 == 6) {
                C60157c5 c5Var2 = this.f161720R0;
                if (c5Var2 != null) {
                    c5Var2.mo22963a0("", q2Var.f170493c);
                }
                C59684w2 w2Var2 = this.f161722S0;
                if (w2Var2 != null) {
                    C59673q2 q2Var4 = this.f161749s;
                    if (q2Var4 != null) {
                        rq22 = q2Var4.f170494d;
                    }
                    w2Var2.mo78301j(rq22, this.f161717Q.mo86511a());
                }
                mo79456c0();
            }
            if (i2 == 1 || i2 == 9) {
                String fTPPTag2 = getFTPPTag();
                Log.m105924i(fTPPTag2, "FTPP.handlePlayerStateChange() player stop or idle " + getProxyState());
                C59675s2 s2Var = this.f161710I;
                if (s2Var != null) {
                    s2Var.mo80115a();
                    return;
                }
                return;
            }
            return;
        }
        String fTPPTag3 = getFTPPTag();
        Log.m105928w(fTPPTag3, "changePlayerState from:" + this.f161745p + " to:" + i + " return for error state.");
    }

    /* renamed from: F */
    public final void mo79437F() {
        ((FinderMMPlayerDetector) C59698c.f170541a.mo84678b(FinderMMPlayerDetector.class)).mo82659c(this.f161736d);
        this.f161737e.mo84416b(7);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final k03.C60931a mo79438G(boolean r4, java.lang.String r5) {
        /*
            r3 = this;
            r3.mo79449U()
            java.lang.String r0 = "getContext()"
            if (r4 != 0) goto L_0x001f
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r4 < r1) goto L_0x001f
            com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender r4 = new com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r1, r0)
            r4.<init>(r1)
            k03.c r0 = r3.f161725U
            r4.setSurfaceViewSwitchHelper(r0)
            goto L_0x002b
        L_0x001f:
            com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender r4 = new com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r1, r0)
            r4.<init>(r1)
        L_0x002b:
            java.lang.String r0 = "FTPP.FinderThumbPlayerProxy"
            r4.setTagPrefix(r0)
            r1 = 1
            r4.setOpaqueInfo(r1)
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$c r1 = r3.f161741i
            if (r1 == 0) goto L_0x0062
            r4.setSurfaceListener(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getRenderView "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " renderView:"
            r1.append(r5)
            r1.append(r4)
            java.lang.String r5 = " version:"
            r1.append(r5)
            int r5 = android.os.Build.VERSION.SDK_INT
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            return r4
        L_0x0062:
            java.lang.String r4 = "playerListener"
            gy3.C87412m.m108603p(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.mo79438G(boolean, java.lang.String):k03.a");
    }

    /* renamed from: H */
    public final void mo79439H(String str) {
        if (!this.f161747q) {
            C64689rq2 rq22 = null;
            if (C87412m.m108589b(str, "startInternal")) {
                if (this.f161754x == 2) {
                    C3913a aVar = this.f161712K;
                    aVar.getClass();
                    aVar.f17568d = "预渲染";
                    String fTPPTag = getFTPPTag();
                    Log.m105924i(fTPPTag, "FTPP.handleOnFirstFrameRendered rendered for " + this.f161754x);
                    this.f161712K.f17569e = SystemClock.elapsedRealtime() - this.f161712K.f17569e;
                    C12931a aVar2 = this.f161711J;
                    if (aVar2 != null) {
                        aVar2.mo11310b("onRendered");
                    }
                    C59684w2 w2Var = this.f161722S0;
                    if (w2Var != null) {
                        C59673q2 q2Var = this.f161749s;
                        C64689rq2 rq23 = q2Var != null ? q2Var.f170494d : null;
                        C60698b bVar = this.f161740h;
                        if (bVar != null) {
                            w2Var.mo78304m(rq23, bVar.mo33107c());
                        } else {
                            C87412m.m108603p("player");
                            throw null;
                        }
                    }
                    this.f161747q = true;
                    return;
                }
                String fTPPTag2 = getFTPPTag();
                Log.m105928w(fTPPTag2, "FTPP.handleOnFirstFrameRendered " + str + " return for " + this.f161754x);
            } else if (C87412m.m108589b(str, "onFirstFrameRendered")) {
                int i = this.f161754x;
                if (i == 0) {
                    String fTPPTag3 = getFTPPTag();
                    Log.m105924i(fTPPTag3, "FTPP.handleOnFirstFrameRendered onFirstFrameRendered " + getProxyState());
                    this.f161712K.f17569e = SystemClock.elapsedRealtime() - this.f161712K.f17569e;
                    C59684w2 w2Var2 = this.f161722S0;
                    if (w2Var2 != null) {
                        C59673q2 q2Var2 = this.f161749s;
                        C64689rq2 rq24 = q2Var2 != null ? q2Var2.f170494d : null;
                        C60698b bVar2 = this.f161740h;
                        if (bVar2 != null) {
                            w2Var2.mo78304m(rq24, bVar2.mo33107c());
                        } else {
                            C87412m.m108603p("player");
                            throw null;
                        }
                    }
                    this.f161747q = true;
                } else if (i != 1) {
                    String fTPPTag4 = getFTPPTag();
                    Log.m105928w(fTPPTag4, "FTPP.handleOnFirstFrameRendered " + str + " return for " + this.f161754x);
                } else {
                    String fTPPTag5 = getFTPPTag();
                    Log.m105924i(fTPPTag5, "FTPP.handleOnFirstFrameRendered background prepared first frame " + getProxyState());
                    setBgPrepareStatus(2);
                    C59684w2 w2Var3 = this.f161722S0;
                    if (w2Var3 != null) {
                        C59673q2 q2Var3 = this.f161749s;
                        w2Var3.mo78302k(q2Var3 != null ? q2Var3.f170494d : null);
                    }
                    C59684w2 w2Var4 = this.f161722S0;
                    if (w2Var4 != null) {
                        C59673q2 q2Var4 = this.f161749s;
                        if (q2Var4 != null) {
                            rq22 = q2Var4.f170494d;
                        }
                        w2Var4.mo78298g(rq22, q2Var4, 0);
                    }
                }
            } else {
                String fTPPTag6 = getFTPPTag();
                Log.m105928w(fTPPTag6, "FTPP.handleOnFirstFrameRendered " + str + " return for " + this.f161754x);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0093, code lost:
        if (r1 == null) goto L_0x0095;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79440I() {
        /*
            r8 = this;
            java.lang.Class<dz.f> r0 = p501dz.C58464f.class
            java.util.HashSet<java.lang.Integer> r1 = f161699c1
            int r2 = r8.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "create FinderThumbPlayerProxy "
            r2.append(r3)
            int r3 = r8.hashCode()
            r2.append(r3)
            java.lang.String r3 = " enableMediaCodecReuse:"
            r2.append(r3)
            r3 = 0
            r2.append(r3)
            r4 = 32
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "FTPP.FinderThumbPlayerProxy"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            bl3.r r1 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r4 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r1 = r1.mo62446e(r4)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler> r4 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r4)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler r1 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler) r1
            int r4 = r8.hashCode()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.getClass()
            java.lang.String r5 = "finderVideoProxyHashcode"
            gy3.C87412m.m108594g(r4, r5)
            java.util.concurrent.ConcurrentSkipListSet<java.lang.String> r5 = r1.f162540w
            r5.add(r4)
            android.os.HandlerThread r1 = r1.f162539v
            r4 = 0
            if (r1 == 0) goto L_0x0069
            android.os.Looper r1 = r1.getLooper()
            goto L_0x006a
        L_0x0069:
            r1 = r4
        L_0x006a:
            java.lang.String r5 = "getContext()"
            if (r1 == 0) goto L_0x0095
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "init player use same looper:"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            di3.d r6 = di3.C86312j.m106911c(r0)
            dz.f r6 = (p501dz.C58464f) r6
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r7, r5)
            j03.b r1 = r6.mo82802mj(r7, r1)
            if (r1 != 0) goto L_0x00a6
        L_0x0095:
            di3.d r0 = di3.C86312j.m106911c(r0)
            dz.f r0 = (p501dz.C58464f) r0
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r1, r5)
            j03.b r1 = r0.mo82800a(r1)
        L_0x00a6:
            r8.f161740h = r1
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$c r0 = new com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$c
            r0.<init>()
            r8.f161741i = r0
            mr1.t r0 = new mr1.t
            r0.<init>(r3)
            r8.f161756y = r0
            mr1.s r0 = r8.f161717Q
            r0.mo86517f()
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99276R6
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L_0x00d6
            java.lang.String r0 = "init#SurfaceView"
            k03.a r0 = r8.mo79438G(r3, r0)
            goto L_0x00dc
        L_0x00d6:
            java.lang.String r0 = "init#TextureView"
            k03.a r0 = r8.mo79438G(r1, r0)
        L_0x00dc:
            r8.setRenderView(r0)
            k03.a r0 = r8.getRenderView()
            r0.setTagPrefix(r2)
            k03.a r0 = r8.getRenderView()
            r0.setOpaqueInfo(r1)
            k03.a r0 = r8.getRenderView()
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$c r2 = r8.f161741i
            java.lang.String r3 = "playerListener"
            if (r2 == 0) goto L_0x0185
            r0.setSurfaceListener(r2)
            j03.b r0 = r8.f161740h
            java.lang.String r2 = "player"
            if (r0 == 0) goto L_0x0181
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$c r5 = r8.f161741i
            if (r5 == 0) goto L_0x017d
            r0.setOnErrorListener(r5)
            j03.b r0 = r8.f161740h
            if (r0 == 0) goto L_0x0179
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$c r5 = r8.f161741i
            if (r5 == 0) goto L_0x0175
            r0.setOnPreparedListener(r5)
            j03.b r0 = r8.f161740h
            if (r0 == 0) goto L_0x0171
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$c r5 = r8.f161741i
            if (r5 == 0) goto L_0x016d
            r0.setOnVideoSizeChangedListener(r5)
            j03.b r0 = r8.f161740h
            if (r0 == 0) goto L_0x0169
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$c r5 = r8.f161741i
            if (r5 == 0) goto L_0x0165
            r0.setOnPlayerStateChangeListener(r5)
            j03.b r0 = r8.f161740h
            if (r0 == 0) goto L_0x0161
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$c r5 = r8.f161741i
            if (r5 == 0) goto L_0x015d
            r0.setOnInfoListener(r5)
            j03.b r0 = r8.f161740h
            if (r0 == 0) goto L_0x0159
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$c r5 = r8.f161741i
            if (r5 == 0) goto L_0x0155
            r0.setOnCompletionListener(r5)
            j03.b r0 = r8.f161740h
            if (r0 == 0) goto L_0x0151
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$c r2 = r8.f161741i
            if (r2 == 0) goto L_0x014d
            r0.setOnSeekCompleteListener(r2)
            r8.mo51222E(r1)
            return
        L_0x014d:
            gy3.C87412m.m108603p(r3)
            throw r4
        L_0x0151:
            gy3.C87412m.m108603p(r2)
            throw r4
        L_0x0155:
            gy3.C87412m.m108603p(r3)
            throw r4
        L_0x0159:
            gy3.C87412m.m108603p(r2)
            throw r4
        L_0x015d:
            gy3.C87412m.m108603p(r3)
            throw r4
        L_0x0161:
            gy3.C87412m.m108603p(r2)
            throw r4
        L_0x0165:
            gy3.C87412m.m108603p(r3)
            throw r4
        L_0x0169:
            gy3.C87412m.m108603p(r2)
            throw r4
        L_0x016d:
            gy3.C87412m.m108603p(r3)
            throw r4
        L_0x0171:
            gy3.C87412m.m108603p(r2)
            throw r4
        L_0x0175:
            gy3.C87412m.m108603p(r3)
            throw r4
        L_0x0179:
            gy3.C87412m.m108603p(r2)
            throw r4
        L_0x017d:
            gy3.C87412m.m108603p(r3)
            throw r4
        L_0x0181:
            gy3.C87412m.m108603p(r2)
            throw r4
        L_0x0185:
            gy3.C87412m.m108603p(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.mo79440I():void");
    }

    /* renamed from: J */
    public final void mo79441J(String str, FeedData feedData) {
        String str2 = str;
        C56502b bVar = this.f161750t;
        Boolean bool = null;
        Integer valueOf = bVar != null ? Integer.valueOf(bVar.hashCode()) : null;
        String valueOf2 = String.valueOf(hashCode());
        C60698b bVar2 = this.f161740h;
        if (bVar2 != null) {
            int hashCode = bVar2.hashCode();
            boolean z = this.f161729W;
            float alpha = getAlpha();
            Surface surface = this.f161743n;
            if (surface != null) {
                bool = Boolean.valueOf(surface.isValid());
            }
            int i = this.f161745p;
            int position = feedData.getPosition();
            String p = C61926c.m72691p(feedData.getFeedId());
            String description = feedData.getDescription();
            String nickName = feedData.getNickName();
            C60934c cVar = this.f161725U;
            String str3 = this.f161738f;
            cVar.getClass();
            C87412m.m108594g(str3, "logTag");
            cVar.f173561f = true;
            cVar.f173557b = str3 + ".MMSurfaceViewSwitchHelper";
            StringBuilder sb = new StringBuilder();
            sb.append("FTPP.");
            sb.append(position);
            sb.append('.');
            C58764p0 p0Var = C58764p0.f168246a;
            int i2 = i;
            sb.append(p0Var.mo83800a(description));
            sb.append('.');
            C87412m.m108594g(valueOf2, "hashCode");
            sb.append(p0Var.mo83801b(valueOf2, 0, 4));
            this.f161738f = sb.toString();
            getRenderView().setTagPrefix(this.f161738f);
            C3913a aVar = this.f161712K;
            aVar.getClass();
            C87412m.m108594g(str2, "<set-?>");
            aVar.f17565a = str2;
            this.f161712K.f17566b = position;
            String str4 = this.f161738f;
            Log.m105924i(str4, "initFTPPTag pos:" + position + " mediaId:" + str2 + " feedId:" + p + " nickName:" + nickName + " description:" + description + " viewFocus:" + z + "loaderProxyHashCode:" + valueOf + " finderThumbPlayerProxyHashCode:" + valueOf2 + " playerHashCode:" + hashCode + " viewFocus:" + this.f161729W + " viewAlpha:" + alpha + " surfaceIsValid:" + bool + " playerState:" + i2);
            return;
        }
        C87412m.m108603p("player");
        throw null;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [k03.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79442K(gr1.C59673q2 r8, boolean r9) {
        /*
            r7 = this;
            k03.a r0 = r7.getRenderView()
            boolean r0 = r0 instanceof android.view.View
            java.lang.String r1 = "null cannot be cast to non-null type android.view.View"
            if (r0 == 0) goto L_0x0025
            k03.a r0 = r7.getRenderView()
            gy3.C87412m.m108592e(r0, r1)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0025
            k03.a r0 = r7.getRenderView()
            gy3.C87412m.m108592e(r0, r1)
            android.view.View r0 = (android.view.View) r0
            r7.removeView(r0)
        L_0x0025:
            r0 = 0
            java.lang.String r2 = "initRenderView#TextureView"
            r3 = 1
            r4 = 0
            if (r9 != 0) goto L_0x007f
            boolean r9 = r7.f161709H
            if (r9 == 0) goto L_0x0031
            goto L_0x007f
        L_0x0031:
            up1.f r9 = up1.C37521f.f99374d
            r9.getClass()
            pe1.c<java.lang.Integer> r9 = up1.C37521f.f99276R6
            java.lang.Object r9 = r9.mo60266n()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r5 = 2
            if (r9 != r5) goto L_0x00a7
            pl1.u0 r9 = r8.f170495e
            int r9 = r9.mo87420e()
            r6 = 3
            if (r9 == r6) goto L_0x0053
            if (r9 != r5) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r9 = 0
            goto L_0x0054
        L_0x0053:
            r9 = 1
        L_0x0054:
            if (r9 == 0) goto L_0x006a
            k03.a r9 = r7.getRenderView()
            boolean r9 = r9 instanceof com.tencent.p014mm.plugin.thumbplayer.render.MMTextureViewRender
            if (r9 == 0) goto L_0x0065
            java.lang.String r9 = "initRenderView#SurfaceView"
            k03.a r9 = r7.mo79438G(r4, r9)
            goto L_0x007b
        L_0x0065:
            k03.a r9 = r7.getRenderView()
            goto L_0x007b
        L_0x006a:
            k03.a r9 = r7.getRenderView()
            boolean r9 = r9 instanceof com.tencent.p014mm.plugin.thumbplayer.render.MMTextureViewRender
            if (r9 == 0) goto L_0x0077
            k03.a r9 = r7.getRenderView()
            goto L_0x007b
        L_0x0077:
            k03.a r9 = r7.mo79438G(r3, r2)
        L_0x007b:
            r7.setRenderView(r9)
            goto L_0x00a7
        L_0x007f:
            k03.a r9 = r7.getRenderView()
            boolean r9 = r9 instanceof com.tencent.p014mm.plugin.thumbplayer.render.MMTextureViewRender
            if (r9 == 0) goto L_0x008c
            k03.a r9 = r7.getRenderView()
            goto L_0x0090
        L_0x008c:
            k03.a r9 = r7.mo79438G(r3, r2)
        L_0x0090:
            r7.setRenderView(r9)
            k03.a r9 = r7.getRenderView()
            boolean r2 = r9 instanceof com.tencent.p014mm.plugin.thumbplayer.render.MMTextureViewRender
            if (r2 == 0) goto L_0x009e
            com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender r9 = (com.tencent.p014mm.plugin.thumbplayer.render.MMTextureViewRender) r9
            goto L_0x009f
        L_0x009e:
            r9 = r0
        L_0x009f:
            if (r9 != 0) goto L_0x00a2
            goto L_0x00a7
        L_0x00a2:
            boolean r2 = r7.f161709H
            r9.setPreloadMode(r2)
        L_0x00a7:
            k03.a r9 = r7.getRenderView()
            boolean r9 = r9 instanceof com.tencent.p014mm.plugin.thumbplayer.render.MMSurfaceViewRender
            if (r9 == 0) goto L_0x00b9
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$a r9 = r7.f161712K
            r9.getClass()
            java.lang.String r2 = "SurfaceView"
            r9.f17571g = r2
            goto L_0x00c2
        L_0x00b9:
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$a r9 = r7.f161712K
            r9.getClass()
            java.lang.String r2 = "TextureView"
            r9.f17571g = r2
        L_0x00c2:
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$a r9 = r7.f161712K
            pl1.u0 r2 = r8.f170495e
            java.lang.String r2 = r2.mo87422g()
            r9.getClass()
            java.lang.String r5 = "<set-?>"
            gy3.C87412m.m108594g(r2, r5)
            r9.f17572h = r2
            pl1.u0 r8 = r8.f170495e
            te3.rq2 r8 = r8.mo87421f()
            boolean r9 = r7.f161727V
            android.util.Size r8 = vp1.C65840n.m77566b(r8, r9)
            er1.j4 r9 = er1.C58739j4.f168176a
            android.content.Context r2 = r7.getContext()
            java.lang.String r5 = "context"
            gy3.C87412m.m108593f(r2, r5)
            int r5 = r8.getWidth()
            int r8 = r8.getHeight()
            rx3.o r8 = r9.mo83709g(r2, r5, r8)
            B r9 = r8.f38558e
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            C r8 = r8.f38559f
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r5 = -2
            r2.<init>(r5, r5)
            r5 = 17
            r2.gravity = r5
            k03.a r5 = r7.getRenderView()
            gy3.C87412m.m108592e(r5, r1)
            android.view.View r5 = (android.view.View) r5
            r7.addView(r5, r2)
            k03.a r1 = r7.getRenderView()
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.thumbplayer.render.MMSurfaceViewRender
            if (r2 == 0) goto L_0x0128
            r0 = r1
            com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender r0 = (com.tencent.p014mm.plugin.thumbplayer.render.MMSurfaceViewRender) r0
        L_0x0128:
            if (r0 == 0) goto L_0x0138
            k03.a r0 = r7.getRenderView()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender"
            gy3.C87412m.m108592e(r0, r1)
            com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender r0 = (com.tencent.p014mm.plugin.thumbplayer.render.MMSurfaceViewRender) r0
            r0.setZOrderMediaOverlay(r3)
        L_0x0138:
            k03.a r0 = r7.getRenderView()
            r0.mo81067b(r9, r8)
            java.lang.String r0 = r7.getFTPPTag()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "initRenderView renderView:"
            r1.append(r2)
            k03.a r2 = r7.getRenderView()
            r1.append(r2)
            java.lang.String r2 = " isLongVideo:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " containerWidth:"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = " containerHeight:"
            r1.append(r9)
            r1.append(r8)
            r8 = 32
            r1.append(r8)
            java.lang.String r8 = r7.getProxyState()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.mo79442K(gr1.q2, boolean):void");
    }

    /* renamed from: L */
    public final boolean mo79443L() {
        switch (this.f161745p) {
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

    /* renamed from: N */
    public final void mo79444N(String str, boolean z) {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, str + " onReleaseInternal FinderThumbPlayerProxy " + hashCode() + ' ' + getProxyState());
        this.f161756y = null;
        mo79449U();
        this.f161726U0 = null;
        C56509g gVar = new C56509g(this, str);
        if (z) {
            gVar.invoke();
        } else {
            C61926c.m72661F("FTPP.FinderThumbPlayerProxy", new C56508f(gVar));
        }
        f161699c1.remove(Integer.valueOf(hashCode()));
        if (this.f161714M) {
            f161700d1.clear();
            f161701e1.clear();
        }
        this.f161750t = null;
        this.f161724T0 = null;
    }

    /* renamed from: O */
    public final boolean mo79445O(int i) {
        boolean z;
        Log.m105924i(getFTPPTag(), "playWithSource() source=" + i + ' ' + getProxyState() + ' ');
        if (!this.f161729W) {
            Log.m105924i(getFTPPTag(), "playWithSource() return for isViewFocused:" + this.f161729W);
            return false;
        }
        switch (this.f161745p) {
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
            Log.m105924i(getFTPPTag(), "playWithSource() return for currentState:" + this.f161745p);
            return false;
        }
        boolean isPlaying = isPlaying();
        if (!isPlaying || i == -1) {
            C25026b.C25032b bVar = new C25026b.C25032b();
            int i2 = this.f161745p;
            if (!(i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7)) {
                if (!(this.f161745p == 3)) {
                    mo79448T(0, bVar);
                }
            } else if (this.f161716P) {
                mo79452Y(bVar);
            } else {
                Surface surface = this.f161743n;
                if (surface != null) {
                    if (!surface.isValid()) {
                        surface = null;
                    }
                    if (surface != null) {
                        mo79452Y(bVar);
                    }
                }
            }
            mo79451X(bVar);
            C60698b bVar2 = this.f161740h;
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

    /* renamed from: P */
    public final void mo79446P(String str, String str2, int i, C25026b.C25032b bVar) {
        if (TextUtils.isEmpty(str2)) {
            String fTPPTag = getFTPPTag();
            Log.m105928w(fTPPTag, "prepareCacheFile(), return for online url:" + str2);
            return;
        }
        C3913a aVar = this.f161712K;
        aVar.getClass();
        aVar.f17568d = "预加载完成";
        String i2 = C86013q1.m106448i(str2, false);
        String fTPPTag2 = getFTPPTag();
        Log.m105924i(fTPPTag2, "prepareCacheFile(), cache file:" + i2 + ", isExists:" + C86013q1.m106450k(i2) + ' ' + getProxyState());
        C60698b bVar2 = this.f161740h;
        if (bVar2 != null) {
            bVar2.mo33105a(str);
            C60698b bVar3 = this.f161740h;
            if (bVar3 != null) {
                bVar3.setDataSource(i2);
                mo51222E(2);
                mo79448T(i, bVar);
                return;
            }
            C87412m.m108603p("player");
            throw null;
        }
        C87412m.m108603p("player");
        throw null;
    }

    /* renamed from: R */
    public final boolean mo79447R(String str, String str2, int i, C25026b.C25032b bVar) {
        if (TextUtils.isEmpty(str2)) {
            String fTPPTag = getFTPPTag();
            Log.m105928w(fTPPTag, "prepareOnlineUrl(), return for online url:" + str2 + "  " + getProxyState());
            return false;
        }
        String fTPPTag2 = getFTPPTag();
        Log.m105924i(fTPPTag2, "prepareOnlineUrl(), online url:" + str2 + "  " + getProxyState());
        TPVideoInfo.Builder builder = new TPVideoInfo.Builder();
        builder.fileId(str);
        builder.downloadParam(new TPDownloadParamData(11));
        C60698b bVar2 = this.f161740h;
        if (bVar2 != null) {
            bVar2.mo33105a(str);
            C60698b bVar3 = this.f161740h;
            if (bVar3 != null) {
                bVar3.setVideoInfo(builder.build());
                C60698b bVar4 = this.f161740h;
                if (bVar4 != null) {
                    bVar4.setDataSource(str2);
                    mo51222E(2);
                    return mo79448T(i, bVar);
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

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0021, code lost:
        r6 = r6.f161763h;
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo79448T(int r26, mr1.C25026b.C25032b r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.String r3 = r25.getFTPPTag()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "prepareVideo() source:"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r6 = " isMoovReady:"
            r4.append(r6)
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b r6 = r0.f161750t
            r7 = 0
            if (r6 == 0) goto L_0x002c
            cm1.f1 r6 = r6.f161763h
            if (r6 == 0) goto L_0x002c
            boolean r6 = r6.field_moovReady
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x002d
        L_0x002c:
            r6 = r7
        L_0x002d:
            r4.append(r6)
            java.lang.String r6 = " isAllCompleted:"
            r4.append(r6)
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b r6 = r0.f161750t
            if (r6 == 0) goto L_0x0046
            cm1.f1 r6 = r6.f161763h
            if (r6 == 0) goto L_0x0046
            boolean r6 = r6.mo76073n2()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x0047
        L_0x0046:
            r6 = r7
        L_0x0047:
            r4.append(r6)
            java.lang.String r6 = " downloadUrl:"
            r4.append(r6)
            gr1.q2 r6 = r0.f161749s
            if (r6 == 0) goto L_0x0056
            java.lang.String r6 = r6.f170491a
            goto L_0x0057
        L_0x0056:
            r6 = r7
        L_0x0057:
            r4.append(r6)
            r6 = 32
            r4.append(r6)
            java.lang.String r6 = r25.getProxyState()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b r3 = r0.f161750t
            if (r3 == 0) goto L_0x0074
            r3.mo79494c()
        L_0x0074:
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b r3 = r0.f161750t
            r4 = 0
            if (r3 == 0) goto L_0x030e
            cm1.f1 r3 = r3.f161763h
            if (r3 == 0) goto L_0x030e
            mr1.s r6 = r0.f161717Q
            java.lang.String r8 = r3.field_fileFormat
            if (r8 != 0) goto L_0x0085
            java.lang.String r8 = ""
        L_0x0085:
            r6.getClass()
            r6.f175136z = r8
            mr1.s r6 = r0.f161717Q
            r6.getClass()
            up1.f r6 = up1.C37521f.f99374d
            r6.getClass()
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99282S3
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r8 = 1
            if (r6 != r8) goto L_0x00d2
            java.lang.String r6 = r3.field_fileFormat
            java.lang.String r9 = "xV2"
            boolean r6 = gy3.C87412m.m108589b(r6, r9)
            if (r6 != 0) goto L_0x00d2
            java.lang.String r6 = r3.field_fileFormat
            java.lang.String r9 = "xV4"
            boolean r6 = gy3.C87412m.m108589b(r6, r9)
            if (r6 != 0) goto L_0x00d2
            java.lang.String r6 = r3.field_fileFormat
            java.lang.String r9 = "xV6"
            boolean r6 = gy3.C87412m.m108589b(r6, r9)
            if (r6 != 0) goto L_0x00d2
            java.lang.String r3 = r3.field_fileFormat
            java.lang.String r6 = "xV8"
            boolean r3 = gy3.C87412m.m108589b(r3, r6)
            if (r3 == 0) goto L_0x00d0
            goto L_0x00d2
        L_0x00d0:
            r3 = 0
            goto L_0x00d3
        L_0x00d2:
            r3 = 1
        L_0x00d3:
            gr1.q2 r6 = r0.f161749s
            if (r6 == 0) goto L_0x00e5
            te3.rq2 r9 = r6.f170494d
            if (r9 == 0) goto L_0x00e5
            te3.vf1 r9 = r9.f185276p0
            if (r9 == 0) goto L_0x00e5
            boolean r9 = r9.f185883f
            if (r9 != r8) goto L_0x00e5
            r9 = 1
            goto L_0x00e6
        L_0x00e5:
            r9 = 0
        L_0x00e6:
            gy3.C87412m.m108591d(r6)
            pl1.u0 r6 = r6.f170495e
            int r6 = r6.mo87420e()
            r10 = 2
            r11 = 3
            if (r6 == r11) goto L_0x00f8
            if (r6 != r10) goto L_0x00f6
            goto L_0x00f8
        L_0x00f6:
            r6 = 0
            goto L_0x00f9
        L_0x00f8:
            r6 = 1
        L_0x00f9:
            boolean r12 = gr1.C59656d1.f170480a
            if (r12 == 0) goto L_0x0121
            if (r3 == 0) goto L_0x0121
            if (r9 != 0) goto L_0x0121
            if (r6 != 0) goto L_0x0121
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99222L3
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            pe1.c<java.lang.Float> r6 = up1.C37521f.f99231M3
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r3 = r3 * r6
            int r3 = (int) r3
            r0.f161739g = r3
            goto L_0x0123
        L_0x0121:
            r0.f161739g = r4
        L_0x0123:
            mr1.t r3 = r0.f161756y
            if (r3 == 0) goto L_0x012b
            int r6 = r0.f161739g
            r3.f175138b = r6
        L_0x012b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "player enableRendererSharpen: "
            r3.append(r6)
            int r6 = r0.f161739g
            r3.append(r6)
            java.lang.String r6 = " ratio: %f is_disable_follow: "
            r3.append(r6)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r6 = new java.lang.Object[r8]
            pe1.c<java.lang.Float> r9 = up1.C37521f.f99231M3
            java.lang.Object r9 = r9.mo60266n()
            r6[r4] = r9
            java.lang.String r4 = "FTPP.FinderThumbPlayerProxy"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r6)
            int r3 = r0.f161739g
            java.lang.String r6 = "player"
            if (r3 <= 0) goto L_0x018c
            j03.b r3 = r0.f161740h
            if (r3 == 0) goto L_0x0188
            com.tencent.thumbplayer.api.TPOptionalParam r9 = new com.tencent.thumbplayer.api.TPOptionalParam
            r9.<init>()
            r12 = 451(0x1c3, float:6.32E-43)
            int r13 = r0.f161739g
            com.tencent.thumbplayer.api.TPOptionalParam r9 = r9.buildInt(r12, r13)
            r3.setPlayerOptionalParam(r9)
            j03.b r3 = r0.f161740h
            if (r3 == 0) goto L_0x0184
            com.tencent.thumbplayer.api.TPOptionalParam r9 = new com.tencent.thumbplayer.api.TPOptionalParam
            r9.<init>()
            r12 = 452(0x1c4, float:6.33E-43)
            java.lang.String r13 = "assets/shaders"
            com.tencent.thumbplayer.api.TPOptionalParam r9 = r9.buildString(r12, r13)
            r3.setPlayerOptionalParam(r9)
            goto L_0x018c
        L_0x0184:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x0188:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x018c:
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99372c7
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x01a1
            java.lang.String r1 = "prepareVideo disable set buffer size."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r1)
            goto L_0x021c
        L_0x01a1:
            di3.d r3 = di3.C86312j.m106911c(r2)
            com.tencent.mm.plugin.FinderCommonFeatureService r3 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r3
            co1.e r3 = r3.Hx0()
            int r4 = r0.f161757y0
            if (r4 <= 0) goto L_0x01b0
            goto L_0x01b4
        L_0x01b0:
            int r4 = r3.f154567v
            int r4 = r4 * 1000
        L_0x01b4:
            int r9 = r3.f154568w
            int r9 = r9 * 1000
            int r3 = r3.f154539E
            java.lang.String r12 = r25.getFTPPTag()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r5)
            r13.append(r1)
            java.lang.String r1 = " minBufferDuration:"
            r13.append(r1)
            r13.append(r4)
            java.lang.String r1 = " maxBufferDuration:"
            r13.append(r1)
            r13.append(r9)
            java.lang.String r1 = " ffmpegTcpRecvBufferSize:"
            r13.append(r1)
            r13.append(r3)
            java.lang.String r1 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            if (r4 <= 0) goto L_0x0202
            j03.b r1 = r0.f161740h
            if (r1 == 0) goto L_0x01fe
            com.tencent.thumbplayer.api.TPOptionalParam r5 = new com.tencent.thumbplayer.api.TPOptionalParam
            r5.<init>()
            r9 = 102(0x66, float:1.43E-43)
            long r12 = (long) r4
            com.tencent.thumbplayer.api.TPOptionalParam r4 = r5.buildLong(r9, r12)
            r1.setPlayerOptionalParam(r4)
            goto L_0x0202
        L_0x01fe:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x0202:
            if (r3 <= 0) goto L_0x021c
            j03.b r1 = r0.f161740h
            if (r1 == 0) goto L_0x0218
            com.tencent.thumbplayer.api.TPOptionalParam r4 = new com.tencent.thumbplayer.api.TPOptionalParam
            r4.<init>()
            r5 = 304(0x130, float:4.26E-43)
            long r12 = (long) r3
            com.tencent.thumbplayer.api.TPOptionalParam r3 = r4.buildLong(r5, r12)
            r1.setPlayerOptionalParam(r3)
            goto L_0x021c
        L_0x0218:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x021c:
            er1.w3 r1 = er1.C58784w3.f168295a
            gr1.q2 r1 = r0.f161749s
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b r3 = r0.f161750t
            if (r3 == 0) goto L_0x0227
            cm1.f1 r4 = r3.f161763h
            goto L_0x0228
        L_0x0227:
            r4 = r7
        L_0x0228:
            er1.j4 r5 = er1.C58739j4.f168176a
            r12 = 0
            if (r1 == 0) goto L_0x02a0
            if (r3 == 0) goto L_0x02a0
            if (r4 == 0) goto L_0x02a0
            boolean r3 = r4.mo76073n2()
            java.lang.String r4 = r1.f170492b
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            boolean r5 = r1 instanceof nr1.C61891a
            if (r5 == 0) goto L_0x0241
            goto L_0x0249
        L_0x0241:
            boolean r5 = r1 instanceof nr1.C61892b
            if (r5 == 0) goto L_0x024b
            if (r3 == 0) goto L_0x024b
            if (r4 == 0) goto L_0x024b
        L_0x0249:
            r15 = 2
            goto L_0x0251
        L_0x024b:
            if (r5 == 0) goto L_0x024f
            r15 = 3
            goto L_0x0251
        L_0x024f:
            r10 = -1
            r15 = -1
        L_0x0251:
            e03.b r3 = new e03.b
            r16 = 1
            int r4 = r0.f161723T
            r18 = 1
            te3.rq2 r5 = r1.f170494d
            if (r5 == 0) goto L_0x0262
            long r9 = r5.f185238E
            r19 = r9
            goto L_0x0264
        L_0x0262:
            r19 = r12
        L_0x0264:
            java.lang.String r21 = r25.getFTPPTag()
            r22 = 0
            r23 = 64
            r24 = 0
            r14 = r3
            r17 = r4
            r14.<init>(r15, r16, r17, r18, r19, r21, r22, r23, r24)
            di3.d r2 = di3.C86312j.m106911c(r2)
            com.tencent.mm.plugin.FinderCommonFeatureService r2 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r2
            mr1.b r18 = r2.Fx0()
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r1.f170496f
            long r20 = r2.getFeedId()
            java.lang.String r1 = r1.f170493c
            r18.getClass()
            java.lang.String r2 = "mediaId"
            gy3.C87412m.m108594g(r1, r2)
            mr1.i r2 = new mr1.i
            r16 = r2
            r17 = r3
            r19 = r1
            r22 = r27
            r16.<init>(r17, r18, r19, r20, r22)
            java.lang.String r1 = "FinderNetworkFlowReport_Thread"
            o40.C61926c.m72661F(r1, r2)
        L_0x02a0:
            j03.b r1 = r0.f161740h
            if (r1 == 0) goto L_0x030a
            gr1.y0 r2 = gr1.C59688y0.f170516a
            com.tencent.thumbplayer.api.TPOptionalParam r2 = r2.mo84671a()
            r1.setPlayerOptionalParam(r2)
            long r1 = r25.getStartPlayMs()
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x02d0
            j03.b r1 = r0.f161740h
            if (r1 == 0) goto L_0x02cc
            com.tencent.thumbplayer.api.TPOptionalParam r2 = new com.tencent.thumbplayer.api.TPOptionalParam
            r2.<init>()
            r3 = 100
            long r4 = r25.getStartPlayMs()
            com.tencent.thumbplayer.api.TPOptionalParam r2 = r2.buildLong(r3, r4)
            r1.setPlayerOptionalParam(r2)
            goto L_0x02d0
        L_0x02cc:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x02d0:
            j03.b r1 = r0.f161740h
            if (r1 == 0) goto L_0x0306
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b r2 = r0.f161750t
            r1.enableTPAssetResourceLoader(r2)
            k03.a r1 = r25.getRenderView()
            android.view.Surface r1 = r1.getSurface()
            r0.f161743n = r1
            if (r1 == 0) goto L_0x02fb
            boolean r2 = r1.isValid()
            if (r2 == 0) goto L_0x02ec
            goto L_0x02ed
        L_0x02ec:
            r1 = r7
        L_0x02ed:
            if (r1 == 0) goto L_0x02fb
            j03.b r2 = r0.f161740h
            if (r2 == 0) goto L_0x02f7
            r2.setSurface(r1)
            goto L_0x02fb
        L_0x02f7:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x02fb:
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r0.f161755x0
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$h r2 = new com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$h
            r2.<init>(r0)
            r1.post(r2)
            return r8
        L_0x0306:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x030a:
            gy3.C87412m.m108603p(r6)
            throw r7
        L_0x030e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.mo79448T(int, mr1.b$b):boolean");
    }

    /* renamed from: U */
    public final void mo79449U() {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "releaseSurface " + getProxyState() + ", isReusing = " + this.f161714M);
        if (this.f161743n != null) {
            C60698b bVar = this.f161740h;
            if (bVar != null) {
                bVar.setSurface((Surface) null);
                Surface surface = this.f161743n;
                if (surface != null) {
                    surface.release();
                }
                this.f161743n = null;
                this.f161744o = null;
                return;
            }
            C87412m.m108603p("player");
            throw null;
        }
    }

    /* renamed from: W */
    public final boolean mo79450W(long j, boolean z, int i) {
        if (!mo79443L()) {
            return false;
        }
        int i2 = this.f161745p;
        if (!(i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7)) {
            return false;
        }
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "seekToMs " + j + ' ' + z);
        this.f161703B = true;
        C60698b bVar = this.f161740h;
        if (bVar != null) {
            bVar.seekTo((int) j, i);
            if (z) {
                play();
            }
            return true;
        }
        C87412m.m108603p("player");
        throw null;
    }

    /* renamed from: X */
    public final void mo79451X(C25026b.C25032b bVar) {
        C59679v2 v2Var;
        Class cls = C58466h.class;
        Log.m105924i(getFTPPTag(), "startCdnDownload()");
        if (this.f161728V0) {
            String fTPPTag = getFTPPTag();
            Log.m105924i(fTPPTag, "startCdnDownload() already start cdn " + getProxyState());
            return;
        }
        mo79455b0();
        C58784w3 w3Var = C58784w3.f168295a;
        C56502b bVar2 = this.f161750t;
        C55015f1 f1Var = bVar2 != null ? bVar2.f161763h : null;
        C58739j4 j4Var = C58739j4.f168176a;
        if (bVar2 != null && f1Var != null) {
            String fTPPTag2 = getFTPPTag();
            Log.m105924i(fTPPTag2, "startCdnDownload() " + getProxyState());
            MediaPreloadCore mediaPreloadCore = this.f161748r;
            if (mediaPreloadCore != null) {
                mediaPreloadCore.mo78444e3(bVar2.f161759d, true);
            }
            if (!f1Var.mo76073n2()) {
                int i = 0;
                mo79457e0(false);
                boolean contains = f161700d1.contains(bVar2.f161759d);
                HashSet<String> hashSet = f161701e1;
                boolean contains2 = hashSet.contains(bVar2.f161759d);
                String fTPPTag3 = getFTPPTag();
                Log.m105924i(fTPPTag3, "startCdnDownload: isLongTermId = " + contains + " isLongTermView = " + this.f161714M + " hasStartDownloadLongTermId = " + contains2);
                if (!contains2 || this.f161714M) {
                    if (this.f161714M) {
                        Log.m105924i(getFTPPTag(), "startCdnDownload: stopStreamDownloadTask, force stop duplicate download task");
                        ((C58466h) C86312j.m106911c(cls)).Qi0().mo32053a(bVar2.f161759d, (C58471k) null);
                    }
                    if (contains) {
                        if (!this.f161714M) {
                            this.f161715N = true;
                        }
                        hashSet.add(bVar2.f161759d);
                    }
                    MediaPreloadCore mediaPreloadCore2 = this.f161748r;
                    if (mediaPreloadCore2 != null) {
                        i = mediaPreloadCore2.f160310i;
                    }
                    ((C58466h) C86312j.m106911c(cls)).Qi0().mo32061i(bVar2.f161759d, new C56511i(bVar2, i), new C56512j(this, bVar, f1Var, bVar2));
                } else {
                    mo79457e0(true);
                }
                this.f161728V0 = true;
                C59673q2 q2Var = this.f161749s;
                if (q2Var != null && (v2Var = this.f161726U0) != null) {
                    v2Var.mo78311g(q2Var.f170495e);
                    return;
                }
                return;
            }
            String fTPPTag4 = getFTPPTag();
            Log.m105924i(fTPPTag4, "startCdnDownload() downloadFinish " + getProxyState());
        }
    }

    /* renamed from: Y */
    public final void mo79452Y(C25026b.C25032b bVar) {
        boolean z;
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "startInternal() " + getProxyState());
        mo79439H("startInternal");
        C58784w3 w3Var = C58784w3.f168295a;
        C59673q2 q2Var = this.f161749s;
        C56502b bVar2 = this.f161750t;
        C55015f1 f1Var = bVar2 != null ? bVar2.f161763h : null;
        C58739j4 j4Var = C58739j4.f168176a;
        if (!(q2Var == null || bVar2 == null || f1Var == null)) {
            int i = (!(q2Var instanceof C61891a) && (!((z = q2Var instanceof C61892b)) || !f1Var.mo76073n2() || !C86013q1.m106450k(q2Var.f170492b))) ? z ? 3 : -1 : 2;
            boolean z2 = this.f161729W && this.f161745p == 6;
            int i2 = this.f161723T;
            C64689rq2 rq22 = q2Var.f170494d;
            C58469b bVar3 = new C58469b(i, 1, i2, 1, rq22 != null ? rq22.f185238E : 0, getFTPPTag(), 0, 64, (C8480h) null);
            C25026b Fx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Fx0();
            long feedId = q2Var.f170496f.getFeedId();
            String str = q2Var.f170493c;
            C60698b bVar4 = this.f161740h;
            if (bVar4 != null) {
                long currentPositionMs = bVar4.getCurrentPositionMs();
                C60698b bVar5 = this.f161740h;
                if (bVar5 != null) {
                    long durationMs = bVar5.getDurationMs();
                    Fx0.getClass();
                    C87412m.m108594g(str, "mediaId");
                    C61926c.m72661F("FinderNetworkFlowReport_Thread", new C25044m(Fx0, str, durationMs, f1Var, z2, bVar3, feedId, bVar, currentPositionMs));
                } else {
                    C87412m.m108603p("player");
                    throw null;
                }
            } else {
                C87412m.m108603p("player");
                throw null;
            }
        }
        setBgPrepareStatus(0);
        C12931a aVar = this.f161711J;
        if (aVar != null) {
            aVar.mo12482c(IXWebBroadcastListener.STAGE_START);
        }
        C60698b bVar6 = this.f161740h;
        if (bVar6 != null) {
            bVar6.start();
            ((FinderMMPlayerDetector) C59698c.f170541a.mo84678b(FinderMMPlayerDetector.class)).mo82660d(this.f161736d);
            mo51222E(5);
            C59673q2 q2Var2 = this.f161749s;
            if (q2Var2 != null) {
                mo79453Z(q2Var2);
                return;
            }
            return;
        }
        C87412m.m108603p("player");
        throw null;
    }

    /* renamed from: Z */
    public final void mo79453Z(C59673q2 q2Var) {
        MTimerHandler mTimerHandler;
        MTimerHandler mTimerHandler2;
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "startProgressTimer " + getProxyState());
        boolean z = false;
        if (this.f161704C == null) {
            MTimerHandler mTimerHandler3 = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C56513k(this, q2Var, ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Fx0()), true);
            this.f161704C = mTimerHandler3;
            mTimerHandler3.setLogging(false);
        }
        MTimerHandler mTimerHandler4 = this.f161704C;
        if ((mTimerHandler4 != null && mTimerHandler4.stopped()) && (mTimerHandler2 = this.f161704C) != null) {
            mTimerHandler2.startTimer(0, 20);
        }
        if (this.f161705D == null) {
            this.f161705D = new MTimerHandler("TP.MonitorTimer", (MTimerHandler.CallBack) new C56514l(this), true);
        }
        MTimerHandler mTimerHandler5 = this.f161705D;
        if (mTimerHandler5 != null && mTimerHandler5.stopped()) {
            z = true;
        }
        if (z && (mTimerHandler = this.f161705D) != null) {
            mTimerHandler.startTimer(0, 1000);
        }
    }

    /* renamed from: a */
    public boolean mo51223a(double d, boolean z) {
        return mo51233x(d, z, 1);
    }

    /* renamed from: a0 */
    public final void mo79454a0(C25026b.C25032b bVar) {
        Log.m105924i(getFTPPTag(), "stopCdnDownload()");
        if (!this.f161728V0) {
            String fTPPTag = getFTPPTag();
            Log.m105924i(fTPPTag, "stopCdnDownload() not start cdn " + getProxyState());
            return;
        }
        C56502b bVar2 = this.f161750t;
        if (bVar2 != null) {
            String fTPPTag2 = getFTPPTag();
            Log.m105924i(fTPPTag2, "stopCdnDownload() " + getProxyState());
            MediaPreloadCore mediaPreloadCore = this.f161748r;
            if (mediaPreloadCore != null) {
                mediaPreloadCore.mo78444e3(bVar2.f161759d, false);
            }
            bVar2.mo79495d(false);
            boolean contains = f161700d1.contains(bVar2.f161759d);
            String fTPPTag3 = getFTPPTag();
            Log.m105924i(fTPPTag3, "stopCdnDownload: isLongTermId = " + contains + " isLongTermView = " + this.f161714M + " hasStartDownloadInNormalView = " + this.f161715N);
            if (!contains || this.f161714M || this.f161715N) {
                if (contains) {
                    this.f161715N = false;
                    f161701e1.remove(bVar2.f161759d);
                }
                ((C58466h) C86312j.m106911c(C58466h.class)).Qi0().mo32053a(bVar2.f161759d, new C56515m(this, bVar, bVar2));
                this.f161728V0 = false;
            }
        }
    }

    /* renamed from: b */
    public boolean mo75295b() {
        C60698b bVar = this.f161740h;
        if (bVar != null) {
            return bVar.mo33106b();
        }
        C87412m.m108603p("player");
        throw null;
    }

    /* renamed from: b0 */
    public final void mo79455b0() {
        Log.m105924i(getFTPPTag(), "stopCdnPreload()");
        if (!this.f161730W0) {
            String fTPPTag = getFTPPTag();
            Log.m105924i(fTPPTag, "stopCdnPreload(), not start preload cdn " + getProxyState());
            return;
        }
        C56502b bVar = this.f161750t;
        if (bVar != null) {
            ((C58466h) C86312j.m106911c(C58466h.class)).Qi0().mo32056d(bVar.f161759d, new C56516n(this, bVar));
            this.f161730W0 = false;
        }
    }

    /* renamed from: c */
    public void mo78608c() {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "onUIDestroy " + getProxyState());
        stop();
        this.f161720R0 = null;
    }

    /* renamed from: c0 */
    public final void mo79456c0() {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "stopProgressTimer :" + this.f161704C + ' ' + getProxyState());
        C59673q2 q2Var = this.f161749s;
        if (q2Var != null) {
            C61926c.m72668M(new C56517o(this, q2Var, getCurrentPlayMs(), getVideoDurationMs()));
        }
        MTimerHandler mTimerHandler = this.f161704C;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        MTimerHandler mTimerHandler2 = this.f161705D;
        if (mTimerHandler2 != null) {
            mTimerHandler2.stopTimer();
        }
    }

    /* renamed from: d */
    public void mo78609d() {
        mo79444N("onRelease", false);
    }

    /* renamed from: e0 */
    public final void mo79457e0(boolean z) {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "updateIsReaStartDownloader() isReaStartDownloader:" + z);
        this.f161713L.set(z);
    }

    /* renamed from: g */
    public boolean mo78610g() {
        return this.f161753w;
    }

    public Bitmap getBitmap() {
        return getRenderView().getBitmap();
    }

    public final int getCommentScene() {
        return this.f161723T;
    }

    public int getContextTag() {
        return this.f161708G;
    }

    public long getCurrentPlayMs() {
        C60698b bVar = this.f161740h;
        if (bVar != null) {
            return bVar.getCurrentPositionMs();
        }
        C87412m.m108603p("player");
        throw null;
    }

    public int getCurrentPlaySecond() {
        C60698b bVar = this.f161740h;
        if (bVar != null) {
            return (int) (bVar.getCurrentPositionMs() / ((long) 1000));
        }
        C87412m.m108603p("player");
        throw null;
    }

    public final int getCurrentPlayState() {
        return this.f161745p;
    }

    public final C59679v2 getDownloadCallback() {
        return this.f161726U0;
    }

    public final boolean getEnterSeekMode() {
        return this.f161721S;
    }

    public C59318d getEventDetector() {
        return this;
    }

    public C59314b getEventDetectorAdapter() {
        return this.f161737e;
    }

    public final String getFTPPTag() {
        return this.f161738f + '.' + this.f161729W;
    }

    public boolean getIsNeverStart() {
        return !mo79443L();
    }

    public boolean getIsShouldPlayResume() {
        return this.f161746p0;
    }

    public final C59684w2 getLifecycle() {
        return this.f161722S0;
    }

    public final MediaPreloadCore getMediaPreloadCore$plugin_finder_release() {
        return this.f161748r;
    }

    public final C59674r2 getOnMuteListener() {
        return this.f161724T0;
    }

    public final C59675s2 getOnPlayerStopListener() {
        return this.f161710I;
    }

    public final ITPPlayerListener.IOnSeekCompleteListener getOnSeekCompleteListener() {
        return this.f161718Q0;
    }

    public ViewParent getParentView() {
        return getParent();
    }

    public final float getPlaySpeedRatio() {
        return this.f161719R;
    }

    public Object getPlayer() {
        C60698b bVar = this.f161740h;
        if (bVar != null) {
            return bVar;
        }
        C87412m.m108603p("player");
        throw null;
    }

    public View getPlayerView() {
        return this;
    }

    public final C60931a getRenderView() {
        C60931a aVar = this.f161742j;
        if (aVar != null) {
            return aVar;
        }
        C87412m.m108603p("renderView");
        throw null;
    }

    public long getStartPlayMs() {
        return 0;
    }

    public C59662l2 getVideoAdapter() {
        return null;
    }

    public int getVideoDuration() {
        C60698b bVar = this.f161740h;
        if (bVar != null) {
            return (int) (bVar.getDurationMs() / ((long) 1000));
        }
        C87412m.m108603p("player");
        throw null;
    }

    public long getVideoDurationMs() {
        C60698b bVar = this.f161740h;
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
            gr1.q2 r0 = r1.f161749s
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.f170493c
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = ""
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.getVideoMediaId():java.lang.String");
    }

    public C59673q2 getVideoMediaInfo() {
        return this.f161749s;
    }

    public final C12931a getVideoPlayTrace() {
        return this.f161711J;
    }

    public View getVideoView() {
        return this;
    }

    public final C60157c5 getVideoViewCallback() {
        return this.f161720R0;
    }

    public boolean getVideoViewFocused() {
        return this.f161729W;
    }

    public boolean isPlaying() {
        return this.f161745p == 5;
    }

    /* renamed from: n */
    public void mo78638n() {
        this.f161725U.mo85885a(getRenderView(), this.f161743n, getCoverBitmap());
        C60934c cVar = this.f161725U;
        C60931a renderView = getRenderView();
        C87412m.m108592e(renderView, "null cannot be cast to non-null type android.view.View");
        cVar.mo85889e((View) renderView);
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [gr1.q2] */
    /* JADX WARNING: type inference failed for: r2v3, types: [nr1.b] */
    /* JADX WARNING: type inference failed for: r2v4, types: [nr1.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo78639o(pl1.C62369u0 r10, boolean r11, com.tencent.p014mm.plugin.finder.storage.FeedData r12) {
        /*
            r9 = this;
            java.lang.String r0 = "video"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "feedData"
            gy3.C87412m.m108594g(r12, r0)
            qt1.a r0 = r9.f161711J
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = "setMediaInfo"
            r0.mo12482c(r1)
        L_0x0015:
            te3.rq2 r6 = r10.mo87421f()
            r0 = r10
            pl1.r0 r0 = (pl1.C62367r0) r0
            java.lang.String r1 = r0.mo11841b()
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0025
            r1 = r2
        L_0x0025:
            r9.mo79441J(r1, r12)
            if (r11 == 0) goto L_0x0040
            nr1.a r11 = new nr1.a
            java.lang.String r1 = r6.f185266d
            if (r1 != 0) goto L_0x0032
            r4 = r2
            goto L_0x0033
        L_0x0032:
            r4 = r1
        L_0x0033:
            java.lang.String r5 = r0.mo11841b()
            java.lang.String r3 = ""
            r2 = r11
            r7 = r10
            r8 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x0054
        L_0x0040:
            nr1.b r11 = new nr1.b
            java.lang.String r3 = r0.getUrl()
            java.lang.String r4 = r0.getPath()
            java.lang.String r5 = r0.mo11841b()
            r2 = r11
            r7 = r10
            r8 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
        L_0x0054:
            r9.f161749s = r11
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b r10 = r9.f161750t
            if (r10 == 0) goto L_0x005d
            java.lang.String r10 = r10.f161759d
            goto L_0x005e
        L_0x005d:
            r10 = 0
        L_0x005e:
            java.lang.String r11 = r11.f170493c
            boolean r10 = gy3.C87412m.m108589b(r10, r11)
            if (r10 != 0) goto L_0x0095
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b r10 = new com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b
            gr1.q2 r11 = r9.f161749s
            gy3.C87412m.m108591d(r11)
            java.lang.String r11 = r11.f170493c
            gr1.q2 r12 = r9.f161749s
            gy3.C87412m.m108591d(r12)
            r10.<init>(r9, r11, r12)
            r9.f161750t = r10
            java.lang.String r10 = r9.getFTPPTag()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "setVideoMediaInfo(), init proxy "
            r11.append(r12)
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b r12 = r9.f161750t
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            goto L_0x00b0
        L_0x0095:
            java.lang.String r10 = r9.getFTPPTag()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "setVideoMediaInfo(), duplicated mediaId "
            r11.append(r12)
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy$b r12 = r9.f161750t
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r11)
        L_0x00b0:
            gr1.q2 r10 = r9.f161749s
            gy3.C87412m.m108591d(r10)
            r11 = 0
            r9.mo79442K(r10, r11)
            mr1.s r10 = r9.f161717Q
            r10.mo86517f()
            mr1.s r10 = r9.f161717Q
            gr1.q2 r11 = r9.f161749s
            gy3.C87412m.m108591d(r11)
            java.lang.String r11 = r11.f170493c
            r10.getClass()
            java.lang.String r12 = "mediaId"
            gy3.C87412m.m108594g(r11, r12)
            r10.f175117d = r11
            mr1.s r10 = r9.f161717Q
            r10.mo86515d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.mo78639o(pl1.u0, boolean, com.tencent.mm.plugin.finder.storage.FeedData):void");
    }

    /* renamed from: p */
    public C62294j mo78640p(long j) {
        return null;
    }

    public boolean pause() {
        C59684w2 w2Var;
        int i = 0;
        if (!mo79443L()) {
            String fTPPTag = getFTPPTag();
            Log.m105924i(fTPPTag, "pause() return for state:" + this.f161745p);
            return false;
        }
        String fTPPTag2 = getFTPPTag();
        Log.m105924i(fTPPTag2, "pause()  " + getProxyState());
        C25026b.C25032b bVar = new C25026b.C25032b();
        if (isPlaying()) {
            m64977D(this, false, 1, (Object) null);
            C60698b bVar2 = this.f161740h;
            if (bVar2 != null) {
                bVar2.pause();
                C60698b bVar3 = this.f161740h;
                if (bVar3 != null) {
                    bVar3.pauseDownload();
                    mo51222E(6);
                    mo79437F();
                } else {
                    C87412m.m108603p("player");
                    throw null;
                }
            } else {
                C87412m.m108603p("player");
                throw null;
            }
        } else {
            if ((this.f161745p == 3) && !this.f161729W) {
                long currentTimeMillis = System.currentTimeMillis();
                stop();
                String fTPPTag3 = getFTPPTag();
                Log.m105924i(fTPPTag3, "pause() preparing stop cost=" + (System.currentTimeMillis() - currentTimeMillis) + LocaleUtil.MALAY);
            }
        }
        boolean z = this.f161729W && this.f161745p == 6;
        C59673q2 q2Var = this.f161749s;
        if (q2Var != null) {
            C25026b Fx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Fx0();
            String str = q2Var.f170493c;
            C56502b bVar4 = this.f161750t;
            C55015f1 f1Var = bVar4 != null ? bVar4.f161763h : null;
            C60698b bVar5 = this.f161740h;
            if (bVar5 != null) {
                long currentPositionMs = bVar5.getCurrentPositionMs();
                C60698b bVar6 = this.f161740h;
                if (bVar6 != null) {
                    long durationMs = bVar6.getDurationMs();
                    Fx0.getClass();
                    C87412m.m108594g(str, "mediaId");
                    C61926c.m72661F("FinderNetworkFlowReport_Thread", new C25037f(Fx0, str, z, f1Var, currentPositionMs, durationMs, bVar));
                } else {
                    C87412m.m108603p("player");
                    throw null;
                }
            } else {
                C87412m.m108603p("player");
                throw null;
            }
        }
        mo79454a0(bVar);
        if (this.f161746p0) {
            String fTPPTag4 = getFTPPTag();
            Log.m105924i(fTPPTag4, "startCdnPreload() " + getProxyState());
            if (this.f161730W0) {
                String fTPPTag5 = getFTPPTag();
                Log.m105924i(fTPPTag5, "startCdnPreload(), already start preload cdn " + getProxyState());
            } else {
                C56502b bVar7 = this.f161750t;
                if (bVar7 != null) {
                    C55015f1 f1Var2 = bVar7.f161763h;
                    if (f1Var2.field_cacheSize < bVar7.f161765j && f1Var2.field_totalSize > 0) {
                        MediaPreloadCore mediaPreloadCore = this.f161748r;
                        if (mediaPreloadCore != null) {
                            i = mediaPreloadCore.f160310i;
                        }
                        ((C58466h) C86312j.m106911c(C58466h.class)).Qi0().mo32058f(bVar7.f161759d, new C59652b1(bVar7, i), new C59655c1(this, bVar7));
                        this.f161730W0 = true;
                    }
                }
            }
        }
        mo79456c0();
        C59673q2 q2Var2 = this.f161749s;
        if (!(q2Var2 == null || (w2Var = this.f161722S0) == null)) {
            w2Var.mo78301j(q2Var2.f170494d, this.f161717Q.mo86511a());
        }
        return true;
    }

    public boolean play() {
        boolean L = mo79443L();
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "play() isStartPlay:" + L);
        return !L ? C60171g1.C8767a.m8577a(this, (Integer) null, 1, (Object) null) : mo79445O(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0035, code lost:
        r1 = r1.f170496f;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo51226q() {
        /*
            r3 = this;
            java.lang.String r0 = r3.getFTPPTag()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "pauseWithCancel "
            r1.append(r2)
            java.lang.String r2 = r3.getProxyState()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            mr1.s r0 = r3.f161717Q
            r0.mo86513c()
            bl3.r r0 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r1 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r0 = r0.mo62446e(r1)
            java.lang.Class<os1.u> r1 = os1.C62168u.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            os1.u r0 = (os1.C62168u) r0
            gr1.q2 r1 = r3.f161749s
            if (r1 == 0) goto L_0x003e
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r1.f170496f
            if (r1 == 0) goto L_0x003e
            long r1 = r1.getId()
            goto L_0x0040
        L_0x003e:
            r1 = 0
        L_0x0040:
            os1.u$b r0 = r0.mo87221e3(r1)
            if (r0 == 0) goto L_0x0050
            long r1 = r3.getCurrentPlayMs()
            r0.f34421e = r1
            float r1 = r3.f161719R
            r0.f34422f = r1
        L_0x0050:
            r3.pause()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.mo51226q():int");
    }

    /* renamed from: s */
    public boolean mo51228s() {
        if (this.f161729W) {
            String fTPPTag = getFTPPTag();
            Log.m105924i(fTPPTag, "prepareToPlay() return for isViewFocused:" + this.f161729W);
            return false;
        } else if (getRenderView() instanceof MMSurfaceViewRender) {
            String fTPPTag2 = getFTPPTag();
            Log.m105924i(fTPPTag2, "prepareToPlay() return for renderview:" + getRenderView());
            return false;
        } else {
            String fTPPTag3 = getFTPPTag();
            Log.m105924i(fTPPTag3, "prepareToPlay()  " + getProxyState());
            if (!mo79443L()) {
                C56502b bVar = this.f161750t;
                if (bVar != null) {
                    bVar.mo79494c();
                }
                C58784w3 w3Var = C58784w3.f168295a;
                C59673q2 q2Var = this.f161749s;
                C56502b bVar2 = this.f161750t;
                C55015f1 f1Var = bVar2 != null ? bVar2.f161763h : null;
                C58739j4 j4Var = C58739j4.f168176a;
                if (q2Var == null || bVar2 == null || f1Var == null) {
                    return false;
                }
                boolean n2 = f1Var.mo76073n2();
                boolean k = C86013q1.m106450k(q2Var.f170492b);
                String fTPPTag4 = getFTPPTag();
                Log.m105924i(fTPPTag4, "prepareToPlay() isAllCompleted:" + n2 + " isExist:" + k + ' ' + getProxyState());
                if (q2Var instanceof C61891a) {
                    m64979S(this, q2Var, bVar2, f1Var, 4);
                    mo79446P(q2Var.f170493c, q2Var.f170492b, 21, (C25026b.C25032b) null);
                } else if (!(q2Var instanceof C61892b) || !n2 || !k) {
                    m64979S(this, q2Var, bVar2, f1Var, 5);
                    mo79447R(q2Var.f170493c, q2Var.f170491a, 5, (C25026b.C25032b) null);
                    mo79451X((C25026b.C25032b) null);
                    C60698b bVar3 = this.f161740h;
                    if (bVar3 != null) {
                        bVar3.resumeDownload();
                    } else {
                        C87412m.m108603p("player");
                        throw null;
                    }
                } else {
                    m64979S(this, q2Var, bVar2, f1Var, 4);
                    mo79446P(q2Var.f170493c, q2Var.f170492b, 22, (C25026b.C25032b) null);
                }
                C59684w2 w2Var = this.f161722S0;
                if (w2Var != null) {
                    w2Var.mo78303l(q2Var.f170494d, q2Var, 0);
                }
                return true;
            }
            String fTPPTag5 = getFTPPTag();
            Log.m105924i(fTPPTag5, "prepareToPlay return " + getProxyState());
            return false;
        }
    }

    public final void setCommentScene(int i) {
        this.f161723T = i;
    }

    public void setContextTag(int i) {
        this.f161708G = i;
    }

    public final void setCurrentPlayState(int i) {
        this.f161745p = i;
    }

    public final void setDownloadCallback(C59679v2 v2Var) {
        this.f161726U0 = v2Var;
    }

    public final void setEnterSeekMode(boolean z) {
        this.f161721S = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if ((r0.f36956c == 3) == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFinderVideoPlayTrace(qt1.C12931a r5) {
        /*
            r4 = this;
            qt1.a r0 = r4.f161711J
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0011
            int r0 = r0.f36956c
            r3 = 3
            if (r0 != r3) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 != 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            if (r1 == 0) goto L_0x0015
            return
        L_0x0015:
            r4.f161711J = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.setFinderVideoPlayTrace(qt1.a):void");
    }

    public void setFullScreenEnjoy(boolean z) {
        this.f161727V = z;
    }

    public void setIMMVideoViewCallback(C60157c5 c5Var) {
        C87412m.m108594g(c5Var, "_callback");
        this.f161720R0 = c5Var;
    }

    public void setIOnlineVideoProxy(C55394a aVar) {
        C87412m.m108594g(aVar, "_proxy");
    }

    public void setInterceptDetach(boolean z) {
    }

    public void setIsShouldPlayResume(boolean z) {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "setIsShouldPlayResume() " + z + ' ' + getProxyState());
        this.f161746p0 = z;
    }

    public void setIsShowBasicControls(boolean z) {
    }

    public final void setLifecycle(C59684w2 w2Var) {
        this.f161722S0 = w2Var;
    }

    public void setLoop(boolean z) {
        C60698b bVar = this.f161740h;
        if (bVar != null) {
            bVar.setLoopback(z);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public final void setMediaPreloadCore$plugin_finder_release(MediaPreloadCore mediaPreloadCore) {
        this.f161748r = mediaPreloadCore;
    }

    public void setMute(boolean z) {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "setMute: isMute=" + z);
        C60698b bVar = this.f161740h;
        if (bVar != null) {
            bVar.setOutputMute(z);
        } else {
            C87412m.m108603p("player");
            throw null;
        }
    }

    public final void setOnMuteListener(C59674r2 r2Var) {
        this.f161724T0 = r2Var;
    }

    public final void setOnPlayerStopListener(C59675s2 s2Var) {
        this.f161710I = s2Var;
    }

    public final void setOnSeekCompleteListener(ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        this.f161718Q0 = iOnSeekCompleteListener;
    }

    public final void setOnlyAudio(boolean z) {
        this.f161716P = z;
    }

    public final void setPlaySpeed(float f) {
        FeedData feedData;
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("setPlaySpeed: ratio = ");
        sb.append(f);
        sb.append(", mediaId = ");
        C59673q2 q2Var = this.f161749s;
        sb.append(q2Var != null ? q2Var.f170493c : null);
        sb.append(", feedId = ");
        C59673q2 q2Var2 = this.f161749s;
        sb.append(C61926c.m72691p((q2Var2 == null || (feedData = q2Var2.f170496f) == null) ? 0 : feedData.getFeedId()));
        Log.m105924i(fTPPTag, sb.toString());
        C60698b bVar = this.f161740h;
        if (bVar != null) {
            bVar.setPlaySpeedRatio(f);
            this.f161719R = f;
            C59684w2 w2Var = this.f161722S0;
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
        this.f161719R = f;
    }

    public void setPreloadedView(boolean z) {
        this.f161709H = z;
    }

    public void setPreview(boolean z) {
        this.f161753w = z;
    }

    public final void setRenderView(C60931a aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f161742j = aVar;
    }

    public void setScaleType(C96814a.C96817e eVar) {
        C87412m.m108594g(eVar, "scaleType");
        if ((eVar == C96814a.C96817e.COVER || eVar == C96814a.C96817e.CROP) && ((getContext() instanceof FinderHomeAffinityUI) || (getContext() instanceof FinderHomeUI))) {
            FinderVideoRecycler finderVideoRecycler = (FinderVideoRecycler) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderVideoRecycler.class);
            finderVideoRecycler.getClass();
            C8478d0 d0Var = new C8478d0();
            finderVideoRecycler.mo80074d3(new C63544ab(FinderThumbPlayerProxy.class, MMSurfaceViewRender.class, d0Var));
            int i = d0Var.f27483d;
            if (i > 0) {
                String fTPPTag = getFTPPTag();
                Log.m105928w(fTPPTag, "setScaleType fix to SCALE_TYPE_CENTER_INSIDE context:" + getContext() + " count:" + i);
                getRenderView().setScaleType(1);
                return;
            }
        }
        int ordinal = eVar.ordinal();
        if (ordinal == 2) {
            getRenderView().setScaleType(1);
        } else if (ordinal == 3) {
            getRenderView().setScaleType(0);
        } else if (ordinal == 4) {
            getRenderView().setScaleType(3);
        }
    }

    public final void setShouldPlayResume(boolean z) {
        this.f161746p0 = z;
    }

    public final void setStartCdn(boolean z) {
        this.f161728V0 = z;
    }

    public final void setStartCdnPreload(boolean z) {
        this.f161730W0 = z;
    }

    public void setVideoMuteListener(C59674r2 r2Var) {
        C87412m.m108594g(r2Var, "muteListener");
        this.f161724T0 = r2Var;
    }

    public void setVideoPlayLifecycle(C59684w2 w2Var) {
        this.f161722S0 = w2Var;
    }

    public final void setVideoViewCallback(C60157c5 c5Var) {
        this.f161720R0 = c5Var;
    }

    public void setVideoViewFocused(boolean z) {
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "setVideoViewFocused " + z + ' ' + getProxyState());
        this.f161729W = z;
    }

    public final void setViewFocused(boolean z) {
        this.f161729W = z;
    }

    public void stop() {
        Class cls = FinderCommonFeatureService.class;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "stop " + getProxyState());
        if (!mo79443L()) {
            String fTPPTag2 = getFTPPTag();
            Log.m105924i(fTPPTag2, "stop return for isStartPlay onPlayerStopListener:" + this.f161710I + ". " + getProxyState());
            C59675s2 s2Var = this.f161710I;
            if (s2Var != null) {
                s2Var.mo80115a();
            }
        }
        C59684w2 w2Var = this.f161722S0;
        if (w2Var != null) {
            w2Var.mo78306o(this.f161749s, this.f161717Q.mo86511a());
        }
        mo51222E(8);
        C25026b.C25032b bVar = new C25026b.C25032b();
        C58784w3 w3Var = C58784w3.f168295a;
        C59673q2 q2Var = this.f161749s;
        C56502b bVar2 = this.f161750t;
        C55015f1 f1Var = bVar2 != null ? bVar2.f161763h : null;
        C58739j4 j4Var = C58739j4.f168176a;
        if (!(q2Var == null || bVar2 == null || f1Var == null)) {
            C25026b Fx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Fx0();
            String str = q2Var.f170493c;
            C60698b bVar3 = this.f161740h;
            if (bVar3 != null) {
                bVar3.getDurationMs();
                Fx0.getClass();
                C87412m.m108594g(str, "mediaId");
                C61926c.m72661F("FinderNetworkFlowReport_Thread", new C25047p(Fx0, str));
                C25026b Fx02 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Fx0();
                String str2 = q2Var.f170493c;
                C56502b bVar4 = this.f161750t;
                C55015f1 f1Var2 = bVar4 != null ? bVar4.f161763h : null;
                C60698b bVar5 = this.f161740h;
                if (bVar5 != null) {
                    long currentPositionMs = bVar5.getCurrentPositionMs();
                    C60698b bVar6 = this.f161740h;
                    if (bVar6 != null) {
                        long durationMs = bVar6.getDurationMs();
                        Fx02.getClass();
                        C87412m.m108594g(str2, "mediaId");
                        C25045n nVar = r5;
                        C25045n nVar2 = new C25045n(Fx02, str2, f1Var2, currentPositionMs, durationMs, bVar);
                        C61926c.m72661F("FinderNetworkFlowReport_Thread", nVar);
                    } else {
                        C87412m.m108603p("player");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("player");
                    throw null;
                }
            } else {
                C87412m.m108603p("player");
                throw null;
            }
        }
        try {
            C60698b bVar7 = this.f161740h;
            if (bVar7 != null) {
                bVar7.stop();
                this.f161703B = false;
                mo79437F();
                mo51222E(9);
                C60698b bVar8 = this.f161740h;
                if (bVar8 != null) {
                    bVar8.reset();
                    mo51222E(1);
                    C60615a fTPPLog = getFTPPLog();
                    fTPPLog.f172710a = 0;
                    fTPPLog.f172711b = 0;
                    fTPPLog.f172712c = 0;
                    getRenderView().reset();
                    this.f161717Q.mo86517f();
                    this.f161731X0 = null;
                    this.f161725U.mo85886b();
                    this.f161748r = null;
                    mo79456c0();
                    mo79454a0(bVar);
                    mo79455b0();
                    this.f161751u = true;
                    this.f161747q = false;
                    setBgPrepareStatus(0);
                    String fTPPTag3 = getFTPPTag();
                    Log.m105924i(fTPPTag3, "stop end time:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                    return;
                }
                C87412m.m108603p("player");
                throw null;
            }
            C87412m.m108603p("player");
            throw null;
        } catch (Throwable th) {
            Log.m105928w("FTPP.FinderThumbPlayerProxy", "stop e:" + th);
        }
    }

    /* renamed from: t */
    public void mo51232t() {
        m64978Q(this, (C59673q2) null, false, false, 7, (Object) null);
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
        return mo79450W(C60641c.m70922c(d * ((double) 1000)), z, i);
    }

    /* renamed from: y */
    public boolean mo78670y() {
        return this.f161709H;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderThumbPlayerProxy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C59316c<C54452a> cVar = new C59316c<>(this);
        this.f161736d = cVar;
        this.f161737e = new C59314b(cVar.mo84417a());
        mo79440I();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderThumbPlayerProxy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C59316c<C54452a> cVar = new C59316c<>(this);
        this.f161736d = cVar;
        this.f161737e = new C59314b(cVar.mo84417a());
        mo79440I();
    }
}
