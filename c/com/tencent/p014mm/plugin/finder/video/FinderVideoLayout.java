package com.tencent.p014mm.plugin.finder.video;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cm1.C55015f1;
import co1.C55041a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedMegaVideoAnimPlayEvent;
import com.tencent.p014mm.autogen.events.FinderSeekEvent;
import com.tencent.p014mm.autogen.events.PreloadProcessChangeEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI;
import com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.video.FinderLongVideoPlayerSeekBar;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.AssetExtension;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import com.tencent.xweb.file.XVFSFile;
import df1.C58259c;
import df1.C58262d;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58354a2;
import dp1.C58356b0;
import dp1.C58417y0;
import eb0.C31543z5;
import er1.C58764p0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gr1.C59651a2;
import gr1.C59667n2;
import gr1.C59669o1;
import gr1.C59670o2;
import gr1.C59671p2;
import gr1.C59672q1;
import gr1.C59674r2;
import gr1.C59676t1;
import gr1.C59679v2;
import gr1.C59683w1;
import gr1.C59684w2;
import gr1.C59687x1;
import gr1.C59690z1;
import gr1.C8380b2;
import gr1.C8382c2;
import gr1.C8385d2;
import gr1.C8389e2;
import gr1.C8398h1;
import gr1.C8401i1;
import gr1.C8404j1;
import gr1.C8409k1;
import gr1.C8411l1;
import gr1.C8413m1;
import gr1.C8419p0;
import gr1.C8424r1;
import gr1.C8426s1;
import gr1.C8433y1;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import he1.C59869v;
import ht1.C60157c5;
import ht1.C60171g1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import kotlin.Metadata;
import l31.C61212e;
import mr1.C61575s;
import mt1.C61580b;
import o40.C61926c;
import os1.C62168u;
import p1081gi.C98121d;
import p1081gi.C98127h;
import p282z2.C16095a;
import pl1.C62367r0;
import pl1.C62369u0;
import qt1.C12931a;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import sx3.C90364q0;
import te3.C49712hj1;
import te3.C64477jr2;
import te3.C64689rq2;
import ts1.C14083g;
import up1.C37521f;
import wp1.C66167g;
import xn2.C102693c;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004±\u0001²\u0001B!\b\u0016\u0012\b\u0010ª\u0001\u001a\u00030©\u0001\u0012\n\u0010¬\u0001\u001a\u0005\u0018\u00010«\u0001¢\u0006\u0006\b­\u0001\u0010®\u0001B*\b\u0016\u0012\b\u0010ª\u0001\u001a\u00030©\u0001\u0012\n\u0010¬\u0001\u001a\u0005\u0018\u00010«\u0001\u0012\u0007\u0010¯\u0001\u001a\u00020\b¢\u0006\u0006\b­\u0001\u0010°\u0001J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u0010\u001a\u00020\u000fR\"\u0010\u0014\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001b\u0010$\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010#R\u001b\u0010*\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010#R\u001b\u0010-\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010#R\u001b\u00100\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010#R\u001b\u00103\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b1\u0010\u001a\u001a\u0004\b2\u0010\u0015R!\u00109\u001a\b\u0012\u0004\u0012\u000205048BX\u0002¢\u0006\f\n\u0004\b6\u0010\u001a\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0002¢\u0006\f\n\u0004\b;\u0010\u001a\u001a\u0004\b<\u0010=R\u001b\u0010A\u001a\u00020:8BX\u0002¢\u0006\f\n\u0004\b?\u0010\u001a\u001a\u0004\b@\u0010=R$\u0010I\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010S\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bR\u0010\u0013\u001a\u0004\bS\u0010\u0015\"\u0004\bT\u0010\u0017R\"\u0010V\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bU\u0010\u0013\u001a\u0004\bV\u0010\u0015\"\u0004\bW\u0010\u0017R\"\u0010[\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bX\u0010\u0013\u001a\u0004\bY\u0010\u0015\"\u0004\bZ\u0010\u0017R\u001b\u0010^\u001a\u00020\u00188FX\u0002¢\u0006\f\n\u0004\b\\\u0010\u001a\u001a\u0004\b]\u0010\u001cR\u001b\u0010a\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b_\u0010\u001a\u001a\u0004\b`\u0010\u001cR*\u0010d\u001a\u00020\u00112\u0006\u0010b\u001a\u00020\u00118\u0006@FX\u000e¢\u0006\u0012\n\u0004\bc\u0010\u0013\u001a\u0004\bd\u0010\u0015\"\u0004\be\u0010\u0017R\"\u0010g\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bf\u0010\u0013\u001a\u0004\bg\u0010\u0015\"\u0004\bh\u0010\u0017R$\u0010p\u001a\u0004\u0018\u00010i8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0017\u0010v\u001a\u00020q8\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR$\u0010~\u001a\u0004\u0018\u00010w8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R+\u0010\u0001\u001a\u0004\u0018\u000108\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R,\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001RA\u0010\u0001\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010w\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001RA\u0010\u0001\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010w\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R'\u0010 \u0001\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0016\n\u0005\b\u0001\u0010r\u001a\u0005\b\u0001\u0010#\"\u0006\b\u0001\u0010\u0001R&\u0010¢\u0001\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b¡\u0001\u0010\u0013\u001a\u0005\b¢\u0001\u0010\u0015\"\u0005\b£\u0001\u0010\u0017R \u0010¨\u0001\u001a\u00030¤\u00018BX\u0002¢\u0006\u000f\n\u0005\b¥\u0001\u0010\u001a\u001a\u0006\b¦\u0001\u0010§\u0001¨\u0006³\u0001"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderVideoLayout;", "Landroid/widget/FrameLayout;", "Lgr1/v2;", "Lht1/c5;", "Lgr1/r2;", "Lgr1/n2$b;", "Ldf1/c$b;", "getVideoPlayBehavior", "", "getVideoDurationSec", "getCurrentPosSec", "", "getCurrentPosMs", "Landroid/graphics/Bitmap;", "getBitmap", "", "getFTPPTag", "", "e", "Z", "isEnableShowLoading", "()Z", "setEnableShowLoading", "(Z)V", "Landroid/view/View;", "g", "Lrx3/g;", "getLoading", "()Landroid/view/View;", "loading", "i", "isSelectedToPlay", "setSelectedToPlay", "j", "getAutoSeekHeadThreshold", "()I", "autoSeekHeadThreshold", "n", "getAutoSeekTailThreshold", "autoSeekTailThreshold", "o", "getAutoSeekRollbackTime", "autoSeekRollbackTime", "p", "getAutoSeekIntervalThreshold", "autoSeekIntervalThreshold", "q", "getAutoSeekLocalInterval", "autoSeekLocalInterval", "r", "getAutoSeekIsOpen", "autoSeekIsOpen", "Ljava/util/LinkedList;", "Lgr1/p2;", "s", "getVideoCallBackList", "()Ljava/util/LinkedList;", "videoCallBackList", "Landroid/widget/ImageView;", "u", "getMuteBtn", "()Landroid/widget/ImageView;", "muteBtn", "v", "getThumbView", "thumbView", "Lgr1/o2;", "w", "Lgr1/o2;", "getVideoView", "()Lgr1/o2;", "setVideoView", "(Lgr1/o2;)V", "videoView", "Lcom/tencent/mm/plugin/finder/video/FinderVideoCore;", "x", "Lcom/tencent/mm/plugin/finder/video/FinderVideoCore;", "getVideoCore", "()Lcom/tencent/mm/plugin/finder/video/FinderVideoCore;", "setVideoCore", "(Lcom/tencent/mm/plugin/finder/video/FinderVideoCore;)V", "videoCore", "y", "isLongVideo", "setLongVideo", "z", "isLoop", "setLoop", "A", "getReuseSamePlayer", "setReuseSamePlayer", "reuseSamePlayer", "C", "getRetryBtn", "retryBtn", "D", "getVideoTypeIv", "videoTypeIv", "value", "E", "isMute", "setMute", "F", "isPreRenderFirstFrame", "setPreRenderFirstFrame", "Lhe1/v;", "H", "Lhe1/v;", "getBulletLifecycle", "()Lhe1/v;", "setBulletLifecycle", "(Lhe1/v;)V", "bulletLifecycle", "Lgr1/w2;", "I", "Lgr1/w2;", "getLifecycle", "()Lgr1/w2;", "lifecycle", "Lcom/tencent/mm/plugin/finder/video/FinderVideoLayout$b;", "J", "Lcom/tencent/mm/plugin/finder/video/FinderVideoLayout$b;", "getPlayInfo", "()Lcom/tencent/mm/plugin/finder/video/FinderVideoLayout$b;", "setPlayInfo", "(Lcom/tencent/mm/plugin/finder/video/FinderVideoLayout$b;)V", "playInfo", "Lgr1/n2;", "K", "Lgr1/n2;", "getSeekBarLayout", "()Lgr1/n2;", "setSeekBarLayout", "(Lgr1/n2;)V", "seekBarLayout", "Lcom/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar;", "L", "Lcom/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar;", "getLongVideoSeekBar", "()Lcom/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar;", "setLongVideoSeekBar", "(Lcom/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar;)V", "longVideoSeekBar", "Lkotlin/Function2;", "Lrx3/b0;", "M", "Lfy3/p;", "getVideoPauseCallback", "()Lfy3/p;", "setVideoPauseCallback", "(Lfy3/p;)V", "videoPauseCallback", "N", "getThumbShowCallback", "setThumbShowCallback", "thumbShowCallback", "P", "getPlayAdapterPosition", "setPlayAdapterPosition", "(I)V", "playAdapterPosition", "Q", "isEnablePlay", "setEnablePlay", "Lts1/g;", "R", "getTeenModeTempAuthUIC", "()Lts1/g;", "teenModeTempAuthUIC", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoLayout */
public final class FinderVideoLayout extends FrameLayout implements C59679v2, C60157c5, C59674r2, C59667n2.C8416b {

    /* renamed from: x0 */
    public static final /* synthetic */ int f161844x0 = 0;

    /* renamed from: A */
    public boolean f161845A;

    /* renamed from: B */
    public LinkedList<C64689rq2> f161846B;

    /* renamed from: C */
    public final C13601g f161847C;

    /* renamed from: D */
    public final C13601g f161848D;

    /* renamed from: E */
    public boolean f161849E;

    /* renamed from: F */
    public boolean f161850F;

    /* renamed from: G */
    public int f161851G;

    /* renamed from: H */
    public C59869v f161852H;

    /* renamed from: I */
    public final C59684w2 f161853I;

    /* renamed from: J */
    public C56521b f161854J;

    /* renamed from: K */
    public C59667n2 f161855K;

    /* renamed from: L */
    public FinderLongVideoPlayerSeekBar f161856L;

    /* renamed from: M */
    public C32227p<? super Boolean, ? super C56521b, C13598b0> f161857M;

    /* renamed from: N */
    public C32227p<? super Boolean, ? super C56521b, C13598b0> f161858N;

    /* renamed from: P */
    public int f161859P;

    /* renamed from: Q */
    public boolean f161860Q;

    /* renamed from: R */
    public final C13601g f161861R;

    /* renamed from: S */
    public boolean f161862S;

    /* renamed from: T */
    public float f161863T;

    /* renamed from: U */
    public int f161864U;

    /* renamed from: V */
    public long f161865V;

    /* renamed from: W */
    public int f161866W;

    /* renamed from: d */
    public String f161867d = "Finder.VideoLayout";

    /* renamed from: e */
    public boolean f161868e = true;

    /* renamed from: f */
    public final C62168u f161869f;

    /* renamed from: g */
    public final C13601g f161870g;

    /* renamed from: h */
    public boolean f161871h;

    /* renamed from: i */
    public boolean f161872i;

    /* renamed from: j */
    public final C13601g f161873j;

    /* renamed from: n */
    public final C13601g f161874n;

    /* renamed from: o */
    public final C13601g f161875o;

    /* renamed from: p */
    public final C13601g f161876p;

    /* renamed from: p0 */
    public float f161877p0;

    /* renamed from: q */
    public final C13601g f161878q;

    /* renamed from: r */
    public final C13601g f161879r;

    /* renamed from: s */
    public final C13601g f161880s;

    /* renamed from: t */
    public C61580b f161881t;

    /* renamed from: u */
    public final C13601g f161882u;

    /* renamed from: v */
    public final C13601g f161883v;

    /* renamed from: w */
    public C59670o2 f161884w;

    /* renamed from: x */
    public FinderVideoCore f161885x;

    /* renamed from: y */
    public boolean f161886y;

    /* renamed from: z */
    public boolean f161887z;

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoLayout$c */
    public static final class C3914c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoLayout f17582d;

        public C3914c(FinderVideoLayout finderVideoLayout) {
            this.f17582d = finderVideoLayout;
        }

        public final void run() {
            C32226l<Boolean, C13598b0> onCustomLoadingStatusChange;
            FinderLongVideoPlayerSeekBar longVideoSeekBar = this.f17582d.getLongVideoSeekBar();
            if (longVideoSeekBar == null || (onCustomLoadingStatusChange = longVideoSeekBar.getOnCustomLoadingStatusChange()) == null) {
                this.f17582d.getLoading().animate().cancel();
                if (this.f17582d.getLoading().getVisibility() != 8) {
                    View d = this.f17582d.getLoading();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view = d;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$dismissLoading$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    d.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$dismissLoading$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                return;
            }
            onCustomLoadingStatusChange.invoke(Boolean.FALSE);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoLayout$e */
    public static final class C3915e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLongVideoPlayerSeekBar f17583d;

        /* renamed from: e */
        public final /* synthetic */ FinderVideoLayout f17584e;

        public C3915e(FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar, FinderVideoLayout finderVideoLayout) {
            this.f17583d = finderLongVideoPlayerSeekBar;
            this.f17584e = finderVideoLayout;
        }

        public final void onClick(View view) {
            C56521b playInfo;
            C58259c.C58261b videoPlayBehavior;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/video/FinderVideoLayout$initLongVideoSeekBar$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean z = this.f17583d.f283824z;
            this.f17584e.mo79547N(!z);
            this.f17583d.setIsPlay(!z);
            if (!(!z || (playInfo = this.f17584e.getPlayInfo()) == null || (videoPlayBehavior = this.f17584e.getVideoPlayBehavior()) == null)) {
                long expectId = playInfo.f161892a.getExpectId();
                C62367r0 r0Var = playInfo.f161894c;
                videoPlayBehavior.mo83035t(expectId, r0Var.f177253e, r0Var);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$initLongVideoSeekBar$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoLayout$f */
    public static final class C3916f implements C102693c {

        /* renamed from: d */
        public final /* synthetic */ FinderLongVideoPlayerSeekBar f17585d;

        /* renamed from: e */
        public final /* synthetic */ FinderVideoLayout f17586e;

        public C3916f(FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar, FinderVideoLayout finderVideoLayout) {
            this.f17585d = finderLongVideoPlayerSeekBar;
            this.f17586e = finderVideoLayout;
        }

        /* renamed from: a */
        public void mo4335a(int i) {
            FinderLongVideoPlayerSeekBar.C3908a aVar = this.f17585d.f17551H;
            if (aVar != null) {
                aVar.mo2425a(i);
            }
            C59670o2 videoView = this.f17586e.getVideoView();
            if (videoView != null) {
                videoView.mo51223a((double) i, true);
            }
            String str = null;
            FinderVideoLayout.m65078D(this.f17586e, 0, (C12931a) null, 3, (Object) null);
            this.f17585d.setIsPlay(true);
            C32224a<C13598b0> onSeekEnd = this.f17585d.getOnSeekEnd();
            if (onSeekEnd != null) {
                onSeekEnd.invoke();
            }
            C59869v bulletLifecycle = this.f17586e.getBulletLifecycle();
            if (bulletLifecycle != null) {
                bulletLifecycle.mo84824a(i);
            }
            C56521b playInfo = this.f17586e.getPlayInfo();
            if (playInfo != null) {
                if (!playInfo.f161898g) {
                    playInfo = null;
                }
                if (playInfo != null) {
                    FinderVideoLayout finderVideoLayout = this.f17586e;
                    C58259c.C58261b videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
                    if (videoPlayBehavior != null) {
                        long expectId = playInfo.f161892a.getExpectId();
                        C64689rq2 rq22 = playInfo.f161894c.f177253e;
                        C59670o2 videoView2 = finderVideoLayout.getVideoView();
                        videoPlayBehavior.mo83027l(expectId, rq22, videoView2 != null ? videoView2.getCurrentPlaySecond() : 0, i, playInfo.f161894c);
                    }
                    long expectId2 = playInfo.f161892a.getExpectId();
                    C59670o2 videoView3 = finderVideoLayout.getVideoView();
                    if (videoView3 != null) {
                        str = videoView3.getVideoMediaId();
                    }
                    String str2 = str;
                    C59670o2 videoView4 = finderVideoLayout.getVideoView();
                    finderVideoLayout.mo79543G(expectId2, str2, videoView4 != null ? videoView4.getCurrentPlaySecond() : 0, i);
                }
            }
        }

        /* renamed from: c */
        public void mo4336c(int i) {
        }

        public void onSeekPre() {
            this.f17586e.mo79547N(false);
            this.f17585d.setIsPlay(false);
            C32224a<C13598b0> onSeekStart = this.f17585d.getOnSeekStart();
            if (onSeekStart != null) {
                onSeekStart.invoke();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoLayout$a */
    public enum C56520a {
        SEEK_NORMAL,
        SEEK_SILENTLY,
        NO_SEEK
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoLayout$b */
    public static final class C56521b {

        /* renamed from: a */
        public final FeedData f161892a;

        /* renamed from: b */
        public final String f161893b;

        /* renamed from: c */
        public final C62367r0 f161894c;

        /* renamed from: d */
        public final int f161895d;

        /* renamed from: e */
        public final LinkedList<C64689rq2> f161896e;

        /* renamed from: f */
        public final boolean f161897f;

        /* renamed from: g */
        public boolean f161898g;

        /* renamed from: h */
        public boolean f161899h;

        /* renamed from: i */
        public boolean f161900i;

        /* renamed from: j */
        public C64477jr2 f161901j;

        /* renamed from: k */
        public boolean f161902k;

        public C56521b(FeedData feedData, String str, C62367r0 r0Var, int i, LinkedList linkedList, boolean z, boolean z2, boolean z3, boolean z4, C64477jr2 jr22, boolean z5, int i2, C8480h hVar) {
            z3 = (i2 & 128) != 0 ? false : z3;
            z4 = (i2 & 256) != 0 ? false : z4;
            jr22 = (i2 & 512) != 0 ? null : jr22;
            z5 = (i2 & 1024) != 0 ? false : z5;
            C87412m.m108594g(feedData, "feed");
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(r0Var, "media");
            C87412m.m108594g(linkedList, "mediaList");
            this.f161892a = feedData;
            this.f161893b = str;
            this.f161894c = r0Var;
            this.f161895d = i;
            this.f161896e = linkedList;
            this.f161897f = z;
            this.f161898g = z2;
            this.f161899h = z3;
            this.f161900i = z4;
            this.f161901j = jr22;
            this.f161902k = z5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C56521b)) {
                return false;
            }
            C56521b bVar = (C56521b) obj;
            return C87412m.m108589b(this.f161892a, bVar.f161892a) && C87412m.m108589b(this.f161893b, bVar.f161893b) && C87412m.m108589b(this.f161894c, bVar.f161894c) && this.f161895d == bVar.f161895d && C87412m.m108589b(this.f161896e, bVar.f161896e) && this.f161897f == bVar.f161897f && this.f161898g == bVar.f161898g && this.f161899h == bVar.f161899h && this.f161900i == bVar.f161900i && C87412m.m108589b(this.f161901j, bVar.f161901j) && this.f161902k == bVar.f161902k;
        }

        public int hashCode() {
            int hashCode = ((((((((this.f161892a.hashCode() * 31) + this.f161893b.hashCode()) * 31) + this.f161894c.hashCode()) * 31) + this.f161895d) * 31) + this.f161896e.hashCode()) * 31;
            boolean z = this.f161897f;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f161898g;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f161899h;
            if (z4) {
                z4 = true;
            }
            int i3 = (i2 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.f161900i;
            if (z5) {
                z5 = true;
            }
            int i4 = (i3 + (z5 ? 1 : 0)) * 31;
            C64477jr2 jr22 = this.f161901j;
            int hashCode2 = (i4 + (jr22 == null ? 0 : jr22.hashCode())) * 31;
            boolean z6 = this.f161902k;
            if (!z6) {
                z2 = z6;
            }
            return hashCode2 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "PlayInfo(feed=" + this.f161892a + ", mediaId=" + this.f161893b + ", media=" + this.f161894c + ", position=" + this.f161895d + ", mediaList=" + this.f161896e + ", isLocal=" + this.f161897f + ", isFocusPlaying=" + this.f161898g + ", isSeekMode=" + this.f161899h + ", isHasPlayed=" + this.f161900i + ", cropInfo=" + this.f161901j + ", pauseWhenSeek=" + this.f161902k + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoLayout$d */
    public static final class C56522d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoLayout f161903d;

        /* renamed from: e */
        public final /* synthetic */ String f161904e;

        public C56522d(FinderVideoLayout finderVideoLayout, String str) {
            this.f161903d = finderVideoLayout;
            this.f161904e = str;
        }

        public final void run() {
            C59670o2 videoView = this.f161903d.getVideoView();
            if (C87412m.m108588a(videoView != null ? Float.valueOf(videoView.getAlpha()) : null, 1.0f)) {
                Log.m105928w(this.f161903d.getFTPPTag(), "dismissThumb return for alpha == 1.");
                return;
            }
            FinderVideoLayout finderVideoLayout = this.f161903d;
            if (finderVideoLayout.f161862S) {
                String fTPPTag = finderVideoLayout.getFTPPTag();
                Log.m105928w(fTPPTag, "dismissThumb return for isShowThumbAnimating:" + this.f161903d.f161862S);
                return;
            }
            C32227p<Boolean, C56521b, C13598b0> thumbShowCallback = finderVideoLayout.getThumbShowCallback();
            if (thumbShowCallback != null) {
                thumbShowCallback.invoke(Boolean.FALSE, this.f161903d.getPlayInfo());
            }
            C59670o2 videoView2 = this.f161903d.getVideoView();
            if (videoView2 != null) {
                videoView2.setAlpha(1.0f);
            }
            String fTPPTag2 = this.f161903d.getFTPPTag();
            Log.m105924i(fTPPTag2, "[dismissThumb] " + this.f161904e + ' ' + this.f161903d.mo79549P());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoLayout$g */
    public static final class C56523g extends C87413o implements C32226l<C59670o2, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoLayout f161905d;

        /* renamed from: e */
        public final /* synthetic */ C12931a f161906e;

        /* renamed from: f */
        public final /* synthetic */ C56521b f161907f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56523g(FinderVideoLayout finderVideoLayout, C12931a aVar, C56521b bVar) {
            super(1);
            this.f161905d = finderVideoLayout;
            this.f161906e = aVar;
            this.f161907f = bVar;
        }

        public Object invoke(Object obj) {
            C59670o2 o2Var = (C59670o2) obj;
            this.f161905d.setVideoView(o2Var);
            this.f161905d.getVideoCore().mo79538z1().mo80073c1(o2Var);
            if (o2Var != null) {
                C12931a aVar = this.f161906e;
                C56521b bVar = this.f161907f;
                FinderVideoLayout finderVideoLayout = this.f161905d;
                o2Var.setFinderVideoPlayTrace(aVar);
                bVar.f161898g = true;
                C62367r0 r0Var = bVar.f161894c;
                bVar.f161892a.getExpectId();
                boolean z = bVar.f161897f;
                LinkedList<C64689rq2> linkedList = bVar.f161896e;
                finderVideoLayout.getVideoCore().getClass();
                if (o2Var.getIsNeverStart() || o2Var.mo78670y()) {
                    C59667n2 seekBarLayout = finderVideoLayout.getSeekBarLayout();
                    if (seekBarLayout != null) {
                        seekBarLayout.setVisibility(0);
                    }
                    o2Var.setAlpha(0.0f);
                    finderVideoLayout.mo79542E(o2Var, r0Var, z, bVar.f161892a);
                } else if ((o2Var instanceof FinderThumbPlayerProxy) && ((FinderThumbPlayerProxy) o2Var).getCurrentPlayState() == 6) {
                    finderVideoLayout.mo79577s(AssetExtension.SCENE_PLAY);
                }
                finderVideoLayout.mo79571o(o2Var, r0Var, linkedList);
            } else {
                FinderVideoLayout finderVideoLayout2 = this.f161905d;
                finderVideoLayout2.getClass();
                finderVideoLayout2.mo79545I(new C8433y1(finderVideoLayout2));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoLayout$h */
    public static final class C56524h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoLayout f161908d;

        /* renamed from: e */
        public final /* synthetic */ boolean f161909e;

        public C56524h(FinderVideoLayout finderVideoLayout, boolean z) {
            this.f161908d = finderVideoLayout;
            this.f161909e = z;
        }

        public final void run() {
            C32227p<Boolean, C56521b, C13598b0> videoPauseCallback = this.f161908d.getVideoPauseCallback();
            if (videoPauseCallback != null) {
                videoPauseCallback.invoke(Boolean.valueOf(this.f161909e), this.f161908d.getPlayInfo());
            }
            this.f161908d.getClass();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoLayout$i */
    public static final class C56525i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C59667n2 f161910d;

        /* renamed from: e */
        public final /* synthetic */ long f161911e;

        /* renamed from: f */
        public final /* synthetic */ FinderVideoLayout f161912f;

        /* renamed from: g */
        public final /* synthetic */ long f161913g;

        /* renamed from: h */
        public final /* synthetic */ int f161914h;

        /* renamed from: i */
        public final /* synthetic */ int f161915i;

        public C56525i(C59667n2 n2Var, long j, FinderVideoLayout finderVideoLayout, long j2, int i, int i2) {
            this.f161910d = n2Var;
            this.f161911e = j;
            this.f161912f = finderVideoLayout;
            this.f161913g = j2;
            this.f161914h = i;
            this.f161915i = i2;
        }

        public final void run() {
            if (!this.f161910d.mo4260j()) {
                long j = this.f161911e;
                if (j > 0) {
                    if (this.f161912f.f161863T == -1.0f) {
                        C59667n2 n2Var = this.f161910d;
                        long j2 = this.f161913g;
                        n2Var.mo4243g((((float) j2) * 1.0f) / ((float) j), j2, j);
                        int i = this.f161912f.f161864U;
                        int i2 = this.f161914h;
                        if (i != i2) {
                            C59667n2 n2Var2 = this.f161910d;
                            int i3 = this.f161915i;
                            n2Var2.mo4263m((((float) i2) * 1.0f) / ((float) i3), i2, i3);
                            this.f161912f.f161864U = this.f161914h;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoLayout$j */
    public static final class C56526j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLongVideoPlayerSeekBar f161916d;

        /* renamed from: e */
        public final /* synthetic */ int f161917e;

        /* renamed from: f */
        public final /* synthetic */ int f161918f;

        /* renamed from: g */
        public final /* synthetic */ FinderVideoLayout f161919g;

        public C56526j(FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar, int i, int i2, FinderVideoLayout finderVideoLayout) {
            this.f161916d = finderLongVideoPlayerSeekBar;
            this.f161917e = i;
            this.f161918f = i2;
            this.f161919g = finderVideoLayout;
        }

        public final void run() {
            this.f161916d.setVideoTotalTime(this.f161917e);
            this.f161916d.seek(this.f161918f);
            FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar = this.f161916d;
            C59670o2 videoView = this.f161919g.getVideoView();
            long currentPlayMs = videoView != null ? videoView.getCurrentPlayMs() : 0;
            FinderLongVideoPlayerSeekBar.C3908a aVar = finderLongVideoPlayerSeekBar.f17551H;
            if (aVar != null) {
                aVar.mo2427c(currentPlayMs);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderVideoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setTag("Finder.VideoLayout");
        setId(C0966R.C0970id.d7a);
        setImportantForAccessibility(2);
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62168u.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…StateCacheVM::class.java)");
        this.f161869f = (C62168u) a;
        this.f161870g = C36568h.m40985a(new C8424r1(this));
        this.f161873j = C36568h.m40985a(C8398h1.f27390d);
        this.f161874n = C36568h.m40985a(C8413m1.f27410d);
        this.f161875o = C36568h.m40985a(C8411l1.f27408d);
        this.f161876p = C36568h.m40985a(C8401i1.f27393d);
        this.f161878q = C36568h.m40985a(C8409k1.f27406d);
        this.f161879r = C36568h.m40985a(C8404j1.f27396d);
        this.f161880s = C36568h.m40985a(C8385d2.f27376d);
        this.f161881t = new C59676t1(this);
        this.f161882u = C36568h.m40985a(new C8426s1(this));
        this.f161883v = C36568h.m40985a(new C8382c2(this));
        this.f161887z = true;
        this.f161846B = new LinkedList<>();
        this.f161847C = C36568h.m40985a(new C59683w1(this));
        this.f161848D = C36568h.m40985a(new C8389e2(this));
        this.f161853I = new C59672q1(this);
        this.f161860Q = true;
        this.f161861R = C36568h.m40985a(new C8380b2(this));
        this.f161863T = -1.0f;
        this.f161864U = -1;
        this.f161866W = 1;
        this.f161877p0 = 1.0f;
    }

    /* renamed from: D */
    public static /* synthetic */ void m65078D(FinderVideoLayout finderVideoLayout, int i, C12931a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            aVar = null;
        }
        finderVideoLayout.mo79541C(i, aVar);
    }

    /* renamed from: J */
    public static void m65079J(FinderVideoLayout finderVideoLayout, long j, int i, float f, boolean z, ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener, int i2, Object obj) {
        int i3 = (i2 & 2) != 0 ? 1 : i;
        float f2 = (i2 & 4) != 0 ? 1.0f : f;
        boolean z2 = (i2 & 8) != 0 ? true : z;
        ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener2 = (i2 & 16) != 0 ? null : iOnSeekCompleteListener;
        finderVideoLayout.getClass();
        C61926c.m72668M(new C59687x1(finderVideoLayout, j, z2, i3, f2, iOnSeekCompleteListener2));
    }

    private final int getAutoSeekHeadThreshold() {
        return ((Number) this.f161873j.getValue()).intValue();
    }

    private final int getAutoSeekIntervalThreshold() {
        return ((Number) this.f161876p.getValue()).intValue();
    }

    private final boolean getAutoSeekIsOpen() {
        return ((Boolean) this.f161879r.getValue()).booleanValue();
    }

    private final int getAutoSeekLocalInterval() {
        return ((Number) this.f161878q.getValue()).intValue();
    }

    private final int getAutoSeekRollbackTime() {
        return ((Number) this.f161875o.getValue()).intValue();
    }

    private final int getAutoSeekTailThreshold() {
        return ((Number) this.f161874n.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public final View getLoading() {
        Object value = this.f161870g.getValue();
        C87412m.m108593f(value, "<get-loading>(...)");
        return (View) value;
    }

    private final ImageView getMuteBtn() {
        Object value = this.f161882u.getValue();
        C87412m.m108593f(value, "<get-muteBtn>(...)");
        return (ImageView) value;
    }

    private final C14083g getTeenModeTempAuthUIC() {
        return (C14083g) this.f161861R.getValue();
    }

    /* access modifiers changed from: private */
    public final ImageView getThumbView() {
        Object value = this.f161883v.getValue();
        C87412m.m108593f(value, "<get-thumbView>(...)");
        return (ImageView) value;
    }

    /* access modifiers changed from: private */
    public final LinkedList<C59671p2> getVideoCallBackList() {
        return (LinkedList) this.f161880s.getValue();
    }

    private final View getVideoTypeIv() {
        Object value = this.f161848D.getValue();
        C87412m.m108593f(value, "<get-videoTypeIv>(...)");
        return (View) value;
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [pl1.b0, x60.c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r39v5, types: [pl1.b0] */
    /* JADX WARNING: type inference failed for: r39v6, types: [pl1.x] */
    /* JADX WARNING: type inference failed for: r39v7, types: [pl1.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x027f  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m65083p(com.tencent.p014mm.plugin.finder.video.FinderVideoLayout r36, int r37, com.tencent.p014mm.plugin.finder.storage.FeedData r38, gr1.C59667n2 r39, int r40, boolean r41, fy3.C32227p r42, fy3.C32227p r43, boolean r44, boolean r45, int r46, java.lang.Object r47) {
        /*
            r0 = r36
            r5 = r37
            r1 = r46
            r2 = r1 & 4
            if (r2 == 0) goto L_0x000c
            r14 = 0
            goto L_0x000e
        L_0x000c:
            r14 = r39
        L_0x000e:
            r2 = r1 & 8
            if (r2 == 0) goto L_0x0014
            r12 = 0
            goto L_0x0016
        L_0x0014:
            r12 = r40
        L_0x0016:
            r2 = r1 & 16
            if (r2 == 0) goto L_0x001c
            r2 = 0
            goto L_0x001e
        L_0x001c:
            r2 = r41
        L_0x001e:
            r3 = r1 & 32
            if (r3 == 0) goto L_0x0024
            r3 = 0
            goto L_0x0026
        L_0x0024:
            r3 = r42
        L_0x0026:
            r4 = r1 & 64
            if (r4 == 0) goto L_0x002c
            r4 = 0
            goto L_0x002e
        L_0x002c:
            r4 = r43
        L_0x002e:
            r6 = r1 & 128(0x80, float:1.794E-43)
            r11 = 1
            if (r6 == 0) goto L_0x0036
            r16 = 1
            goto L_0x0038
        L_0x0036:
            r16 = r44
        L_0x0038:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003f
            r17 = 1
            goto L_0x0041
        L_0x003f:
            r17 = r45
        L_0x0041:
            r36.getClass()
            up1.y r18 = up1.C27696y.THUMB_IMAGE
            java.lang.Class<pl1.s0> r10 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r9 = ht1.C60200t1.class
            java.lang.String r1 = "feed"
            r8 = r38
            gy3.C87412m.m108594g(r8, r1)
            java.lang.String r1 = r36.getFTPPTag()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "convert position="
            r6.append(r7)
            r6.append(r5)
            java.lang.String r7 = " feedTime="
            r6.append(r7)
            r39 = r14
            long r13 = r38.getTimestamps()
            r6.append(r13)
            java.lang.String r7 = " urlValidDuration="
            r6.append(r7)
            int r7 = r38.getUrlValidDuration()
            r6.append(r7)
            java.lang.String r7 = "s "
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            int r1 = r38.getVrLive()
            if (r1 != r11) goto L_0x0090
            r1 = 1
            goto L_0x0091
        L_0x0090:
            r1 = 0
        L_0x0091:
            r0.f161851G = r12
            r0.f161871h = r2
            r0.f161857M = r3
            r0.f161858N = r4
            te3.c21 r2 = r38.getLiveInfo()
            if (r2 == 0) goto L_0x00ad
            te3.by0 r2 = r2.f182402p0
            if (r2 == 0) goto L_0x00ad
            int r3 = r2.f131380d
            if (r3 != r11) goto L_0x00ad
            int r2 = r2.f131383g
            if (r2 == r11) goto L_0x00ad
            r2 = 1
            goto L_0x00ae
        L_0x00ad:
            r2 = 0
        L_0x00ae:
            if (r1 != 0) goto L_0x00bf
            if (r2 == 0) goto L_0x00b3
            goto L_0x00bf
        L_0x00b3:
            gr1.p1 r1 = new gr1.p1
            r1.<init>(r0)
            r0.mo79545I(r1)
            r14 = r39
            r13 = 0
            goto L_0x0117
        L_0x00bf:
            android.view.View r1 = r36.getLoading()
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r3)
            java.lang.Object[] r20 = r2.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/video/FinderVideoLayout"
            java.lang.String r22 = "convert"
            java.lang.String r23 = "(ILcom/tencent/mm/plugin/finder/storage/FeedData;Lcom/tencent/mm/plugin/finder/video/IFinderVideoSeekBar;IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZ)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r1
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r13 = 0
            java.lang.Object r2 = r2.mo10231a(r13)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/video/FinderVideoLayout"
            java.lang.String r3 = "convert"
            java.lang.String r4 = "(ILcom/tencent/mm/plugin/finder/storage/FeedData;Lcom/tencent/mm/plugin/finder/video/IFinderVideoSeekBar;IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZ)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r40 = r1
            r41 = r2
            r42 = r3
            r43 = r4
            r44 = r6
            r45 = r7
            r46 = r14
            j20.C117292a.m165359e(r40, r41, r42, r43, r44, r45, r46)
            r14 = r39
        L_0x0117:
            r0.f161855K = r14
            if (r14 == 0) goto L_0x011e
            r14.setSeekBarCallback(r0)
        L_0x011e:
            java.util.LinkedList r1 = r38.getMediaList()
            r0.f161846B = r1
            int r1 = r1.size()
            if (r5 < r1) goto L_0x012c
            goto L_0x0365
        L_0x012c:
            java.util.LinkedList<te3.rq2> r1 = r0.f161846B
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r2 = "mediaList[position]"
            gy3.C87412m.m108593f(r1, r2)
            r7 = r1
            te3.rq2 r7 = (te3.C64689rq2) r7
            long r1 = r38.getId()
            java.lang.String r3 = r7.f185275p
            java.lang.String r19 = ""
            if (r3 != 0) goto L_0x0146
            r3 = r19
        L_0x0146:
            pl1.r0 r6 = r0.mo79595t(r1, r3, r7)
            long r1 = r38.getId()
            r20 = 0
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 != 0) goto L_0x0161
            java.lang.String r1 = r6.getUrl()
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 == 0) goto L_0x0161
            r22 = 1
            goto L_0x0163
        L_0x0161:
            r22 = 0
        L_0x0163:
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r4 = new com.tencent.mm.plugin.finder.video.FinderVideoLayout$b
            java.lang.String r3 = r6.mo11841b()
            java.util.LinkedList<te3.rq2> r2 = r0.f161846B
            r23 = 0
            r24 = 0
            r25 = 0
            te3.rq2 r1 = r6.f177253e
            boolean r11 = r1.f185280t
            if (r11 == 0) goto L_0x017b
            te3.jr2 r1 = r1.f185281u
            r11 = r1
            goto L_0x017c
        L_0x017b:
            r11 = 0
        L_0x017c:
            r26 = 0
            r27 = 1408(0x580, float:1.973E-42)
            r28 = 0
            r1 = r4
            r29 = r2
            r2 = r38
            r15 = r4
            r4 = r6
            r5 = r37
            r30 = r6
            r6 = r29
            r31 = r7
            r7 = r22
            r8 = r23
            r32 = r9
            r9 = r24
            r33 = r10
            r10 = r25
            r34 = r12
            r12 = r26
            r13 = r27
            r35 = r14
            r14 = r28
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.f161854J = r15
            dp1.a2 r1 = dp1.C58354a2.f167095a
            r1 = r30
            te3.rq2 r2 = r1.f177253e
            java.lang.String r2 = r2.f185275p
            if (r2 != 0) goto L_0x01b8
            r2 = r19
        L_0x01b8:
            java.lang.String r3 = r1.mo87422g()
            java.lang.String r4 = r1.getUrl()
            java.lang.String r1 = r1.getUrlToken()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, dp1.a2$a> r5 = dp1.C58354a2.f167096b
            java.lang.Object r2 = r5.get(r2)
            dp1.a2$a r2 = (dp1.C58354a2.C58355a) r2
            if (r2 == 0) goto L_0x01e9
            long r5 = r2.f167101e
            int r7 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r7 != 0) goto L_0x01d6
            r13 = 1
            goto L_0x01d7
        L_0x01d6:
            r13 = 0
        L_0x01d7:
            if (r13 == 0) goto L_0x01da
            goto L_0x01db
        L_0x01da:
            r2 = 0
        L_0x01db:
            if (r2 == 0) goto L_0x01e9
            long r5 = eb0.C31543z5.m39453c()
            r2.f167101e = r5
            r2.f167100d = r3
            r2.f167098b = r4
            r2.f167099c = r1
        L_0x01e9:
            gr1.a2 r1 = new gr1.a2
            r1.<init>(r0)
            r0.mo79545I(r1)
            r1 = 1
            r0.f161868e = r1
            if (r17 == 0) goto L_0x02f2
            r2 = r31
            te3.iq0 r3 = r2.f185248P
            if (r3 != 0) goto L_0x022a
            java.lang.String r3 = r2.f185239F
            if (r3 == 0) goto L_0x0209
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0207
            goto L_0x0209
        L_0x0207:
            r13 = 0
            goto L_0x020a
        L_0x0209:
            r13 = 1
        L_0x020a:
            if (r13 != 0) goto L_0x0211
            boolean r3 = r0.f161871h
            if (r3 == 0) goto L_0x0211
            goto L_0x022a
        L_0x0211:
            pl1.b0 r3 = new pl1.b0
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            r39 = r3
            r40 = r2
            r41 = r18
            r42 = r4
            r43 = r5
            r44 = r6
            r45 = r7
            r39.<init>(r40, r41, r42, r43, r44, r45)
            goto L_0x025b
        L_0x022a:
            boolean r3 = r0.f161871h
            if (r3 == 0) goto L_0x0243
            pl1.x r3 = new pl1.x
            r4 = 0
            r5 = 4
            r6 = 0
            r39 = r3
            r40 = r2
            r41 = r18
            r42 = r4
            r43 = r5
            r44 = r6
            r39.<init>(r40, r41, r42, r43, r44)
            goto L_0x025b
        L_0x0243:
            pl1.b0 r3 = new pl1.b0
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            r39 = r3
            r40 = r2
            r41 = r18
            r42 = r4
            r43 = r5
            r44 = r6
            r45 = r7
            r39.<init>(r40, r41, r42, r43, r44, r45)
        L_0x025b:
            android.widget.ImageView r4 = r36.getThumbView()
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP
            r4.setScaleType(r5)
            int r2 = r2.f185268f
            r4 = 9
            if (r2 != r4) goto L_0x027f
            bl3.r r2 = bl3.C39818r.f106831a
            r4 = r32
            bl3.r$a r2 = r2.mo62446e(r4)
            r5 = r33
            bl3.c r2 = r2.mo62447c(r5)
            pl1.s0 r2 = (pl1.C11990s0) r2
            k60.d r2 = r2.mo11873j2()
            goto L_0x0293
        L_0x027f:
            r4 = r32
            r5 = r33
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r2 = r2.mo62446e(r4)
            bl3.c r2 = r2.mo62447c(r5)
            pl1.s0 r2 = (pl1.C11990s0) r2
            k60.d r2 = r2.mo11871f2()
        L_0x0293:
            java.lang.String r6 = r3.f177198g
            if (r6 == 0) goto L_0x02a0
            int r6 = r6.length()
            if (r6 != 0) goto L_0x029e
            goto L_0x02a0
        L_0x029e:
            r13 = 0
            goto L_0x02a1
        L_0x02a0:
            r13 = 1
        L_0x02a1:
            if (r13 != 0) goto L_0x02b2
            n60.e<T, android.graphics.Bitmap> r1 = r2.f173682a
            com.tencent.mm.loader.cache.memory.b r1 = r1.mo139388n()
            x60.a r6 = new x60.a
            r6.<init>((x60.C15627c) r3)
            r7 = 0
            r1.mo126886d(r6, r7)
        L_0x02b2:
            l60.b r1 = r2.mo85955a(r3)
            boolean r2 = r0.f161871h
            if (r2 == 0) goto L_0x02cd
            pl1.e0$a r2 = pl1.C11978e0.C11979a.DARK_TIMELINE
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r3 = r3.mo62446e(r4)
            bl3.c r3 = r3.mo62447c(r5)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r2 = r3.mo11867O2(r2)
            goto L_0x02df
        L_0x02cd:
            pl1.e0$a r2 = pl1.C11978e0.C11979a.TIMELINE
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r3 = r3.mo62446e(r4)
            bl3.c r3 = r3.mo62447c(r5)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r2 = r3.mo11867O2(r2)
        L_0x02df:
            r1.mo138758f(r2)
            gr1.n1 r2 = new gr1.n1
            r2.<init>(r0)
            r1.f291320d = r2
            android.widget.ImageView r2 = r36.getThumbView()
            l60.a r1 = (l60.C99342a) r1
            r1.mo85954d(r2)
        L_0x02f2:
            if (r16 == 0) goto L_0x035e
            os1.u r1 = r0.f161869f
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r2 = r0.f161854J
            if (r2 == 0) goto L_0x0302
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r2.f161892a
            if (r2 == 0) goto L_0x0302
            long r20 = r2.getId()
        L_0x0302:
            r2 = r20
            os1.u$b r1 = r1.mo87221e3(r2)
            if (r1 == 0) goto L_0x0319
            boolean r2 = r1.f34420d
            if (r2 == 0) goto L_0x035e
            boolean r1 = r1.f34418b
            if (r1 == 0) goto L_0x035e
            r15 = r35
            r1 = 0
            m65084q(r15, r0, r1)
            goto L_0x035e
        L_0x0319:
            r15 = r35
            r1 = 0
            os1.u r2 = r0.f161869f
            long r3 = r38.getFeedId()
            r13 = r34
            os1.u$a r2 = r2.mo87223g3(r3, r13)
            if (r2 == 0) goto L_0x0330
            int r1 = r2.f176752c
            m65084q(r15, r0, r1)
            goto L_0x035e
        L_0x0330:
            if (r15 == 0) goto L_0x0335
            r15.setProgress(r1)
        L_0x0335:
            r0.mo79546K(r1)
            if (r15 == 0) goto L_0x0352
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r36.getFTPPTag()
            r2.append(r3)
            java.lang.String r3 = "convert"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r15.mo4259i(r2)
        L_0x0352:
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r2 = r0.f161854J
            if (r2 != 0) goto L_0x0357
            goto L_0x0359
        L_0x0357:
            r2.f161899h = r1
        L_0x0359:
            if (r15 == 0) goto L_0x035e
            r15.mo4265o()
        L_0x035e:
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r1 = r0.f161856L
            if (r1 == 0) goto L_0x0365
            r0.mo79597w(r1)
        L_0x0365:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderVideoLayout.m65083p(com.tencent.mm.plugin.finder.video.FinderVideoLayout, int, com.tencent.mm.plugin.finder.storage.FeedData, gr1.n2, int, boolean, fy3.p, fy3.p, boolean, boolean, int, java.lang.Object):void");
    }

    /* renamed from: q */
    public static final void m65084q(C59667n2 n2Var, FinderVideoLayout finderVideoLayout, int i) {
        if (n2Var != null) {
            n2Var.mo4262l(true);
        }
        if (n2Var != null) {
            n2Var.setProgress(i);
        }
        finderVideoLayout.mo79546K(true);
        if (n2Var != null) {
            C59667n2.C8415a.m8377a(n2Var, (String) null, false, 3, (Object) null);
        }
        C56521b bVar = finderVideoLayout.f161854J;
        if (bVar != null) {
            bVar.f161899h = true;
        }
        if (n2Var != null) {
            n2Var.setVisibility(0);
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [gr1.o2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79539A() {
        /*
            r13 = this;
            java.lang.String r0 = r13.getFTPPTag()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[onViewRecycled] "
            r1.append(r2)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r2 = r13.f161854J
            r3 = 0
            if (r2 == 0) goto L_0x0016
            java.lang.String r2 = r2.f161893b
            goto L_0x0017
        L_0x0016:
            r2 = r3
        L_0x0017:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r0 = r13.f161854J
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002d
            boolean r4 = r0.f161899h
            if (r4 != r2) goto L_0x002d
            r4 = 1
            goto L_0x002e
        L_0x002d:
            r4 = 0
        L_0x002e:
            if (r4 == 0) goto L_0x0077
            if (r0 == 0) goto L_0x0038
            boolean r4 = r0.f161898g
            if (r4 != r2) goto L_0x0038
            r4 = 1
            goto L_0x0039
        L_0x0038:
            r4 = 0
        L_0x0039:
            if (r4 == 0) goto L_0x0077
            os1.u r5 = r13.f161869f
            gy3.C87412m.m108591d(r0)
            com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f161892a
            long r6 = r0.getFeedId()
            int r8 = r13.f161851G
            gr1.n2 r0 = r13.f161855K
            if (r0 == 0) goto L_0x0052
            int r1 = r0.getCurrentProgress()
            r9 = r1
            goto L_0x0053
        L_0x0052:
            r9 = 0
        L_0x0053:
            gr1.o2 r0 = r13.f161884w
            if (r0 == 0) goto L_0x005c
            long r0 = r0.getCurrentPlayMs()
            goto L_0x005e
        L_0x005c:
            r0 = 0
        L_0x005e:
            r10 = r0
            gr1.o2 r0 = r13.f161884w
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r1 == 0) goto L_0x0068
            r3 = r0
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r3
        L_0x0068:
            if (r3 == 0) goto L_0x0070
            float r0 = r3.getPlaySpeedRatio()
            r12 = r0
            goto L_0x0074
        L_0x0070:
            r0 = 1065353216(0x3f800000, float:1.0)
            r12 = 1065353216(0x3f800000, float:1.0)
        L_0x0074:
            r5.mo87224i3(r6, r8, r9, r10, r12)
        L_0x0077:
            r13.mo79540B(r2)
            r13.f161860Q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderVideoLayout.mo79539A():void");
    }

    /* renamed from: B */
    public final void mo79540B(boolean z) {
        C58259c.C58261b videoPlayBehavior;
        FeedData feedData;
        C56521b bVar = this.f161854J;
        boolean z2 = false;
        if (!(bVar != null && !bVar.f161898g) || z) {
            String fTPPTag = getFTPPTag();
            StringBuilder sb = new StringBuilder();
            sb.append("[FinderVideoLayout#pause] ");
            sb.append(mo79549P());
            sb.append(" isForceRemoveVideoView=");
            sb.append(z);
            sb.append(" isSeekMode=");
            C56521b bVar2 = this.f161854J;
            String str = null;
            sb.append(bVar2 != null ? Boolean.valueOf(bVar2.f161899h) : null);
            sb.append(" media=");
            C56521b bVar3 = this.f161854J;
            if (bVar3 != null) {
                str = bVar3.f161893b;
            }
            sb.append(str);
            Log.m105924i(fTPPTag, sb.toString());
            C56521b bVar4 = this.f161854J;
            getVideoCore().mo79538z1().mo80083k0(this, z && !this.f161845A, bVar4 != null ? bVar4.f161899h : false);
            mo79576r();
            C56521b bVar5 = this.f161854J;
            if (bVar5 != null) {
                bVar5.f161898g = false;
            }
            this.f161864U = -1;
            if (!(bVar5 == null || (feedData = bVar5.f161892a) == null)) {
                FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent = new FeedMegaVideoAnimPlayEvent();
                feedMegaVideoAnimPlayEvent.f9160d.f9161a = feedData.getLocalId() != 0 ? feedData.getLocalId() : feedData.getFeedId();
                FeedMegaVideoAnimPlayEvent.C1038a aVar = feedMegaVideoAnimPlayEvent.f9160d;
                if (feedData.getLocalId() != 0) {
                    z2 = true;
                }
                aVar.f9162b = z2;
                FeedMegaVideoAnimPlayEvent.C1038a aVar2 = feedMegaVideoAnimPlayEvent.f9160d;
                aVar2.f9163c = true;
                aVar2.f9165e = this.f161851G;
                feedMegaVideoAnimPlayEvent.publish();
            }
            C56521b bVar6 = this.f161854J;
            if (bVar6 != null && bVar6.f161894c.f177253e.f185268f == 9 && (videoPlayBehavior = getVideoPlayBehavior()) != null) {
                long expectId = bVar6.f161892a.getExpectId();
                C62367r0 r0Var = bVar6.f161894c;
                videoPlayBehavior.mo83029n(expectId, r0Var.f177253e, bVar6.f161896e, r0Var, (C61575s) null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v5, types: [com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy] */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0101, code lost:
        if ((z04.C112551y.m153808h(r9, r1, false, 2, (java.lang.Object) null)) != false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        r3 = r3.f161892a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0109  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79541C(int r22, qt1.C12931a r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r0.f161859P = r1
            java.lang.Class<ht1.j5> r3 = ht1.C8777j5.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ht1.j5 r3 = (ht1.C8777j5) r3
            ak1.f0 r3 = r3.getConfig()
            r3.f151482z = r1
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r3 = r0.f161854J
            if (r3 != 0) goto L_0x0038
            java.lang.String r2 = r21.getFTPPTag()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "play playAdapterPosition:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " return for playInfo"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r1)
            return
        L_0x0038:
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x004a
            com.tencent.mm.plugin.finder.storage.FeedData r3 = r3.f161892a
            if (r3 == 0) goto L_0x004a
            int r3 = r3.getMediaType()
            r6 = 9
            if (r3 != r6) goto L_0x004a
            r3 = 1
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            if (r3 == 0) goto L_0x0068
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r3 = r0.f161854J
            if (r3 == 0) goto L_0x005d
            com.tencent.mm.plugin.finder.storage.FeedData r3 = r3.f161892a
            if (r3 == 0) goto L_0x005d
            int r3 = r3.getVrLive()
            if (r3 != r4) goto L_0x005d
            r3 = 1
            goto L_0x005e
        L_0x005d:
            r3 = 0
        L_0x005e:
            if (r3 == 0) goto L_0x0068
            java.lang.String r1 = "Finder.VideoAutoPlayManager"
            java.lang.String r2 = "playSelectedFeed return for vrLiveType"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
            return
        L_0x0068:
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r3 = r0.f161854J
            gy3.C87412m.m108591d(r3)
            com.tencent.mm.plugin.finder.storage.FeedData r6 = r3.f161892a
            r6.setPosition(r1)
            pl1.r0 r6 = r3.f161894c
            com.tencent.mm.plugin.finder.storage.FeedData r7 = r3.f161892a
            java.lang.String r8 = "play"
            r0.mo79596v(r6, r7, r8)
            rs1.s8$a r6 = rs1.C13442s8.f38060Q0
            android.content.Context r7 = r21.getContext()
            java.lang.String r9 = "this@FinderVideoLayout.context"
            gy3.C87412m.m108593f(r7, r9)
            rs1.s8 r6 = r6.mo12873f(r7)
            if (r6 == 0) goto L_0x009b
            r7 = -1
            dp1.t r6 = r6.mo12855k3(r7)
            if (r6 == 0) goto L_0x009b
            te3.hj1 r6 = r6.f167327h
            if (r6 == 0) goto L_0x009b
            int r6 = r6.f134675i
            goto L_0x009c
        L_0x009b:
            r6 = 0
        L_0x009c:
            er1.o0 r7 = er1.C7847o0.f26422a
            java.lang.String r9 = r3.f161893b
            com.tencent.mm.plugin.finder.storage.FeedData r10 = r3.f161892a
            java.lang.String r10 = r10.getNickname()
            java.lang.String r11 = "mediaId"
            gy3.C87412m.m108594g(r9, r11)
            java.lang.String r11 = "nickname"
            gy3.C87412m.m108594g(r10, r11)
            r11 = 0
            if (r6 > 0) goto L_0x00b5
            goto L_0x0124
        L_0x00b5:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.List<cm1.i2>> r12 = er1.C7847o0.f26423b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            java.lang.Object r12 = r12.get(r13)
            if (r12 != 0) goto L_0x00c3
            sx3.f0 r12 = sx3.C64186f0.f181907d
        L_0x00c3:
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r1 = sx3.C110818d0.m150917O(r12, r1)
            cm1.i2 r1 = (cm1.C0740i2) r1
            if (r1 == 0) goto L_0x0106
            boolean r12 = r1 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r12 == 0) goto L_0x0104
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r1
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r1.mo3513o()
            java.lang.String r12 = r12.getNickName()
            boolean r10 = gy3.C87412m.m108589b(r10, r12)
            if (r10 == 0) goto L_0x0104
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            java.util.LinkedList r1 = r1.getMediaList()
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            te3.rq2 r1 = (te3.C64689rq2) r1
            if (r1 == 0) goto L_0x00f5
            java.lang.String r1 = r1.f185275p
            if (r1 != 0) goto L_0x00f7
        L_0x00f5:
            java.lang.String r1 = "."
        L_0x00f7:
            r10 = 2
            boolean r1 = z04.C112551y.m153808h(r9, r1, r5, r10, r11)
            if (r1 != r4) goto L_0x0100
            r1 = 1
            goto L_0x0101
        L_0x0100:
            r1 = 0
        L_0x0101:
            if (r1 == 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r1 = 0
            goto L_0x0107
        L_0x0106:
            r1 = 1
        L_0x0107:
            if (r1 != 0) goto L_0x0124
            r7.mo8956a(r0)
            ft1.a r12 = ft1.C59319a.f169618b
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            er1.m0 r1 = new er1.m0
            r1.<init>(r6)
            r19 = 28
            r20 = 0
            java.lang.String r13 = "FinderFeedMatcher.check.1"
            r18 = r1
            o40.C11348f.C11349a.m11178b(r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0124:
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r3.f161892a
            te3.c21 r1 = r1.getLiveInfo()
            if (r1 == 0) goto L_0x013c
            te3.by0 r1 = r1.f182402p0
            if (r1 == 0) goto L_0x013c
            int r7 = r1.f131380d
            int r9 = ks3.C10411s.f31639a
            if (r7 != r4) goto L_0x013c
            int r1 = r1.f131383g
            if (r1 == r4) goto L_0x013c
            r1 = 1
            goto L_0x013d
        L_0x013c:
            r1 = 0
        L_0x013d:
            boolean r7 = r0.f161860Q
            if (r7 == 0) goto L_0x031b
            if (r1 == 0) goto L_0x0145
            goto L_0x031b
        L_0x0145:
            ts1.g r1 = r21.getTeenModeTempAuthUIC()
            com.tencent.mm.plugin.finder.storage.FeedData r7 = r3.f161892a
            long r9 = r7.getFeedId()
            boolean r1 = r1.mo13498c3(r6, r9)
            if (r1 != 0) goto L_0x016e
            java.lang.String r1 = r21.getFTPPTag()
            java.lang.String r2 = "is not allow for teenager. just return."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
            ts1.g r1 = r21.getTeenModeTempAuthUIC()
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r3.f161892a
            long r2 = r2.getFeedId()
            java.lang.String r4 = ""
            r1.mo13499d3(r2, r4)
            return
        L_0x016e:
            ph1.i r1 = ph1.C62293i.f177081a
            com.tencent.mm.plugin.finder.storage.FeedData r6 = r3.f161892a
            long r6 = r6.getFeedId()
            ph1.m r1 = r1.mo87360e(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "play director: "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = " feedId: "
            r6.append(r7)
            com.tencent.mm.plugin.finder.storage.FeedData r7 = r3.f161892a
            long r9 = r7.getFeedId()
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "Finder.VideoLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            gr1.o2 r6 = r0.f161884w
            if (r6 == 0) goto L_0x0230
            if (r1 == 0) goto L_0x0230
            boolean r6 = r1 instanceof ph1.C62291f
            if (r6 == 0) goto L_0x0230
            r6 = r1
            ph1.f r6 = (ph1.C62291f) r6
            r6.mo84321f()
            gr1.o2 r9 = r0.f161884w
            gy3.C87412m.m108591d(r9)
            boolean r9 = r9.mo78668v()
            if (r9 != 0) goto L_0x01bb
            goto L_0x0230
        L_0x01bb:
            gr1.o2 r9 = r0.f161884w
            if (r9 == 0) goto L_0x01cd
            java.lang.String r9 = r9.getVideoMediaId()
            java.lang.String r10 = r3.f161893b
            boolean r9 = gy3.C87412m.m108589b(r9, r10)
            if (r9 == 0) goto L_0x01cd
            r9 = 1
            goto L_0x01ce
        L_0x01cd:
            r9 = 0
        L_0x01ce:
            gr1.o2 r10 = r0.f161884w
            gy3.C87412m.m108591d(r10)
            java.lang.Object r10 = r10.getPlayer()
            if (r10 == 0) goto L_0x01f1
            ph1.g r10 = r6.mo84321f()
            f50.d r10 = r10.f177095g
            gr1.o2 r12 = r0.f161884w
            gy3.C87412m.m108591d(r12)
            java.lang.Object r12 = r12.getPlayer()
            boolean r10 = gy3.C87412m.m108589b(r10, r12)
            if (r10 == 0) goto L_0x01ef
            goto L_0x01f1
        L_0x01ef:
            r10 = 0
            goto L_0x01f2
        L_0x01f1:
            r10 = 1
        L_0x01f2:
            ph1.g r6 = r6.mo84321f()
            boolean r6 = r6.f177079l
            boolean r12 = ph1.C62293i.f177083c
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "isFluentFinderLive isSameFeed: "
            r13.append(r14)
            r13.append(r9)
            java.lang.String r14 = " isFluentFinderLive "
            r13.append(r14)
            r13.append(r10)
            java.lang.String r14 = " isFloatWindowExit "
            r13.append(r14)
            r13.append(r6)
            java.lang.String r14 = " isLiveRoomTriggerFinish: "
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r13)
            if (r9 == 0) goto L_0x0230
            if (r10 == 0) goto L_0x0230
            if (r6 != 0) goto L_0x0230
            if (r12 == 0) goto L_0x0230
            r6 = 1
            goto L_0x0231
        L_0x0230:
            r6 = 0
        L_0x0231:
            if (r6 == 0) goto L_0x027c
            gr1.o2 r12 = r0.f161884w
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "fluent live exit initLiveVideoView media = "
            r2.append(r4)
            com.tencent.mm.plugin.finder.storage.FeedData r4 = r3.f161892a
            long r4 = r4.getFeedId()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            boolean r2 = r1 instanceof ph1.C62291f
            if (r2 == 0) goto L_0x026e
            ph1.f r1 = (ph1.C62291f) r1
            ph1.g r1 = r1.mo84321f()
            f50.d r13 = r1.f177095g
            if (r13 == 0) goto L_0x026c
            if (r12 == 0) goto L_0x026c
            int r14 = r1.f177092d
            int r15 = r1.f177093e
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r3.f161892a
            long r16 = r2.getFeedId()
            r12.mo78597A(r13, r14, r15, r16)
        L_0x026c:
            r1.f177095g = r11
        L_0x026e:
            gr1.o2 r1 = r0.f161884w
            gy3.C87412m.m108591d(r1)
            pl1.r0 r2 = r3.f161894c
            java.util.LinkedList<te3.rq2> r3 = r3.f161896e
            r0.mo79571o(r1, r2, r3)
            goto L_0x031a
        L_0x027c:
            boolean r1 = r0.f161845A
            if (r1 == 0) goto L_0x0308
            gr1.o2 r1 = r0.f161884w
            if (r1 == 0) goto L_0x0308
            pl1.r0 r1 = r3.f161894c
            java.lang.String r1 = r1.mo11841b()
            gr1.o2 r6 = r0.f161884w
            if (r6 == 0) goto L_0x0293
            java.lang.String r6 = r6.getVideoMediaId()
            goto L_0x0294
        L_0x0293:
            r6 = r11
        L_0x0294:
            boolean r1 = gy3.C87412m.m108589b(r1, r6)
            if (r1 != 0) goto L_0x02a3
            gr1.o2 r1 = r0.f161884w
            if (r1 == 0) goto L_0x02a1
            r1.stop()
        L_0x02a1:
            r1 = 1
            goto L_0x02a4
        L_0x02a3:
            r1 = 0
        L_0x02a4:
            com.tencent.mm.plugin.finder.video.FinderVideoCore r6 = r21.getVideoCore()
            rs1.lb r6 = r6.mo79538z1()
            gr1.o2 r7 = r0.f161884w
            r6.mo80073c1(r7)
            gr1.o2 r6 = r0.f161884w
            if (r6 == 0) goto L_0x02b8
            r6.setFinderVideoPlayTrace(r2)
        L_0x02b8:
            r3.f161898g = r4
            pl1.r0 r2 = r3.f161894c
            com.tencent.mm.plugin.finder.storage.FeedData r6 = r3.f161892a
            r6.getExpectId()
            boolean r6 = r3.f161897f
            java.util.LinkedList<te3.rq2> r7 = r3.f161896e
            com.tencent.mm.plugin.finder.video.FinderVideoCore r9 = r21.getVideoCore()
            r9.getClass()
            if (r1 == 0) goto L_0x02e7
            gr1.n2 r1 = r0.f161855K
            if (r1 == 0) goto L_0x02d5
            r1.setVisibility(r5)
        L_0x02d5:
            gr1.o2 r1 = r0.f161884w
            if (r1 == 0) goto L_0x02dd
            r4 = 0
            r1.setAlpha(r4)
        L_0x02dd:
            gr1.o2 r1 = r0.f161884w
            if (r1 == 0) goto L_0x0300
            com.tencent.mm.plugin.finder.storage.FeedData r3 = r3.f161892a
            r0.mo79542E(r1, r2, r6, r3)
            goto L_0x0300
        L_0x02e7:
            gr1.o2 r1 = r0.f161884w
            boolean r3 = r1 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r3 == 0) goto L_0x02f0
            r11 = r1
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r11 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r11
        L_0x02f0:
            if (r11 == 0) goto L_0x02fa
            int r1 = r11.getCurrentPlayState()
            r3 = 6
            if (r1 != r3) goto L_0x02fa
            goto L_0x02fb
        L_0x02fa:
            r4 = 0
        L_0x02fb:
            if (r4 == 0) goto L_0x0300
            r0.mo79577s(r8)
        L_0x0300:
            gr1.o2 r1 = r0.f161884w
            if (r1 == 0) goto L_0x031a
            r0.mo79571o(r1, r2, r7)
            goto L_0x031a
        L_0x0308:
            com.tencent.mm.plugin.finder.video.FinderVideoCore r1 = r21.getVideoCore()
            rs1.lb r1 = r1.mo79538z1()
            pl1.r0 r4 = r3.f161894c
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$g r5 = new com.tencent.mm.plugin.finder.video.FinderVideoLayout$g
            r5.<init>(r0, r2, r3)
            r1.mo80069R(r0, r4, r5)
        L_0x031a:
            return
        L_0x031b:
            java.lang.String r2 = r21.getFTPPTag()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "isEnablePlay false "
            r3.append(r4)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r4 = r0.f161854J
            if (r4 == 0) goto L_0x032f
            java.lang.String r11 = r4.f161893b
        L_0x032f:
            r3.append(r11)
            java.lang.String r4 = " isOlympic: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderVideoLayout.mo79541C(int, qt1.a):void");
    }

    /* JADX WARNING: type inference failed for: r10v10, types: [k03.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79542E(gr1.C59670o2 r7, pl1.C62367r0 r8, boolean r9, com.tencent.p014mm.plugin.finder.storage.FeedData r10) {
        /*
            r6 = this;
            com.tencent.mm.pluginsdk.ui.a$e r0 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.COVER
            java.lang.String r1 = "prepare"
            r6.mo79596v(r8, r10, r1)
            boolean r1 = r6.f161871h
            r7.setFullScreenEnjoy(r1)
            boolean r1 = r7 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r1 == 0) goto L_0x004b
            r2 = r7
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r2 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r2
            com.tencent.mm.plugin.finder.video.FinderVideoCore r3 = r6.getVideoCore()
            com.tencent.mm.plugin.finder.preload.MediaPreloadCore r3 = r3.f161830p
            r2.setMediaPreloadCore$plugin_finder_release(r3)
            r2.setDownloadCallback(r6)
            boolean r3 = r6.f161886y
            r6.f161886y = r3
            rs1.s8$a r3 = rs1.C13442s8.f38060Q0
            android.content.Context r4 = r6.getContext()
            java.lang.String r5 = "this@FinderVideoLayout.context"
            gy3.C87412m.m108593f(r4, r5)
            rs1.s8 r3 = r3.mo12873f(r4)
            if (r3 == 0) goto L_0x004b
            r4 = -1
            dp1.t r3 = r3.mo12855k3(r4)
            if (r3 == 0) goto L_0x004b
            boolean r4 = r3 instanceof dp1.C58368h1
            if (r4 != 0) goto L_0x0044
            boolean r4 = r3 instanceof dp1.C58353a0
            if (r4 == 0) goto L_0x004b
        L_0x0044:
            te3.hj1 r3 = r3.f167327h
            int r3 = r3.f134675i
            r2.setCommentScene(r3)
        L_0x004b:
            boolean r2 = r6.f161871h
            if (r2 == 0) goto L_0x0064
            boolean r2 = r7 instanceof com.tencent.p014mm.plugin.finder.video.FinderCropVideoView
            if (r2 == 0) goto L_0x0064
            r2 = r7
            com.tencent.mm.plugin.finder.video.FinderCropVideoView r2 = (com.tencent.p014mm.plugin.finder.video.FinderCropVideoView) r2
            int r3 = r6.getWidth()
            r2.setVideoRootWidth(r3)
            int r3 = r6.getHeight()
            r2.setVideoRootHeight(r3)
        L_0x0064:
            boolean r2 = r7.mo78670y()
            r3 = 0
            if (r2 != 0) goto L_0x006f
            r7.mo78639o(r8, r9, r10)
            goto L_0x008a
        L_0x006f:
            r9 = 0
            if (r1 == 0) goto L_0x0076
            r10 = r7
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r10 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r10
            goto L_0x0077
        L_0x0076:
            r10 = r9
        L_0x0077:
            if (r10 == 0) goto L_0x008a
            k03.a r10 = r10.getRenderView()
            boolean r2 = r10 instanceof com.tencent.p014mm.plugin.thumbplayer.render.MMTextureViewRender
            if (r2 == 0) goto L_0x0084
            r9 = r10
            com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender r9 = (com.tencent.p014mm.plugin.thumbplayer.render.MMTextureViewRender) r9
        L_0x0084:
            if (r9 != 0) goto L_0x0087
            goto L_0x008a
        L_0x0087:
            r9.setPreloadMode(r3)
        L_0x008a:
            r7.setIMMVideoViewCallback(r6)
            boolean r9 = r7 instanceof gr1.C59660k2
            if (r9 == 0) goto L_0x0099
            r9 = r7
            gr1.k2 r9 = (gr1.C59660k2) r9
            boolean r10 = r6.f161871h
            r9.setFullscreen(r10)
        L_0x0099:
            boolean r9 = r7 instanceof ht1.C60155c3
            r10 = 1
            if (r9 == 0) goto L_0x00a4
            r2 = r7
            ht1.c3 r2 = (ht1.C60155c3) r2
            r2.mo79422j(r10)
        L_0x00a4:
            boolean r2 = r6.f161871h
            if (r2 == 0) goto L_0x00b6
            if (r9 == 0) goto L_0x00b6
            com.tencent.mm.pluginsdk.ui.a$e r9 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.CONTAIN
            r7.setScaleType(r9)
            r9 = r7
            ht1.c3 r9 = (ht1.C60155c3) r9
            r9.mo79421i(r10)
            goto L_0x00c9
        L_0x00b6:
            if (r9 == 0) goto L_0x00bc
            r7.setScaleType(r0)
            goto L_0x00c9
        L_0x00bc:
            if (r2 != 0) goto L_0x00c6
            if (r1 == 0) goto L_0x00c6
            com.tencent.mm.pluginsdk.ui.a$e r9 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.CROP
            r7.setScaleType(r9)
            goto L_0x00c9
        L_0x00c6:
            r7.setScaleType(r0)
        L_0x00c9:
            com.tencent.mm.plugin.finder.video.FinderVideoCore r9 = r6.getVideoCore()
            pl1.v0 r9 = r9.f161827j
            com.tencent.mm.modelvideo.a r9 = r9.mo87415a(r8, r6)
            r7.setIOnlineVideoProxy(r9)
            boolean r9 = r6.f161871h
            if (r9 != 0) goto L_0x0135
            te3.rq2 r9 = r8.f177253e
            boolean r10 = r9.f185280t
            if (r10 == 0) goto L_0x0135
            te3.jr2 r9 = r9.f185281u
            if (r9 == 0) goto L_0x0135
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            android.content.res.Resources r10 = r6.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            int r10 = r10.widthPixels
            r9.width = r10
            boolean r0 = r6.f161886y
            if (r0 == 0) goto L_0x0105
            te3.rq2 r8 = r8.f177253e
            te3.jr2 r8 = r8.f185281u
            if (r8 == 0) goto L_0x0101
            int r8 = r8.f183835i
            goto L_0x0102
        L_0x0101:
            r8 = 0
        L_0x0102:
            r9.height = r8
            goto L_0x0132
        L_0x0105:
            te3.rq2 r8 = r8.f177253e
            te3.jr2 r8 = r8.f185281u
            if (r8 == 0) goto L_0x0113
            int r0 = r8.f183835i
            float r0 = (float) r0
            int r8 = r8.f183834h
            float r8 = (float) r8
            float r0 = r0 / r8
            goto L_0x0116
        L_0x0113:
            r0 = 1066751317(0x3f955555, float:1.1666666)
        L_0x0116:
            double r1 = (double) r0
            r4 = 4607933018737912491(0x3ff2aaaaaaaaaaab, double:1.1666666666666667)
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x012c
            float r8 = (float) r10
            r10 = 1080033280(0x40600000, float:3.5)
            float r8 = r8 * r10
            r10 = 1077936128(0x40400000, float:3.0)
            float r8 = r8 / r10
            int r8 = (int) r8
            r9.height = r8
            goto L_0x0132
        L_0x012c:
            float r8 = (float) r10
            float r8 = r8 * r0
            int r8 = (int) r8
            r9.height = r8
        L_0x0132:
            r6.setLayoutParams(r9)
        L_0x0135:
            r7.mo78669w()
            r7.setIsShowBasicControls(r3)
            boolean r8 = r6.f161887z
            r7.setLoop(r8)
            gr1.w2 r8 = r6.f161853I
            r7.setVideoPlayLifecycle(r8)
            r7.setVideoMuteListener(r6)
            r7.setPreloadedView(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderVideoLayout.mo79542E(gr1.o2, pl1.r0, boolean, com.tencent.mm.plugin.finder.storage.FeedData):void");
    }

    /* renamed from: F */
    public void mo22955F(String str, String str2) {
        C58259c.C58261b videoPlayBehavior;
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("[onVideoWaitingEnd] videoView=");
        C59670o2 o2Var = this.f161884w;
        C56521b bVar = null;
        sb.append(o2Var != null ? Integer.valueOf(o2Var.hashCode()) : null);
        sb.append(" mediaId=");
        sb.append(str2);
        Log.m105924i(fTPPTag, sb.toString());
        mo79576r();
        C56521b bVar2 = this.f161854J;
        if (bVar2 != null) {
            if (bVar2.f161898g) {
                bVar = bVar2;
            }
            if (bVar != null && (videoPlayBehavior = getVideoPlayBehavior()) != null) {
                long expectId = bVar.f161892a.getExpectId();
                C62367r0 r0Var = bVar.f161894c;
                videoPlayBehavior.mo83022g(expectId, r0Var.f177253e, r0Var);
            }
        }
    }

    /* renamed from: G */
    public final void mo79543G(long j, String str, int i, int i2) {
        FinderSeekEvent finderSeekEvent = new FinderSeekEvent();
        FinderSeekEvent.C55134a aVar = finderSeekEvent.f154807d;
        aVar.f154808a = j;
        aVar.f154809b = str;
        aVar.f154810c = i;
        aVar.f154811d = i2;
        finderSeekEvent.publish();
    }

    /* renamed from: H */
    public final void mo79544H(C59671p2 p2Var) {
        C87412m.m108594g(p2Var, "callBack");
        getVideoCallBackList().remove(p2Var);
    }

    /* renamed from: I */
    public final void mo79545I(Runnable runnable) {
        if (C87412m.m108589b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* renamed from: I1 */
    public void mo22956I1(String str, String str2) {
        FeedData feedData;
        FeedData feedData2;
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("[onVideoFirstFrameDraw] videoView=");
        C59670o2 o2Var = this.f161884w;
        C58356b0.C58357a aVar = null;
        sb.append(o2Var != null ? Integer.valueOf(o2Var.hashCode()) : null);
        sb.append(" mediaId=");
        sb.append(str2);
        Log.m105924i(fTPPTag, sb.toString());
        mo79577s("onVideoFirstFrameDraw");
        C20480e0 e0Var = C20480e0.f57583a;
        int i = this.f161851G;
        String fTPPTag2 = getFTPPTag();
        C56521b bVar = this.f161854J;
        long id = (bVar == null || (feedData2 = bVar.f161892a) == null) ? 0 : feedData2.getId();
        C59670o2 o2Var2 = this.f161884w;
        FinderThumbPlayerProxy finderThumbPlayerProxy = o2Var2 instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) o2Var2 : null;
        C12931a videoPlayTrace = finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getVideoPlayTrace() : null;
        C87412m.m108594g(fTPPTag2, "tag");
        ConcurrentHashMap<Integer, C20480e0.C20481a> concurrentHashMap = C20480e0.f57589g;
        C20480e0.C20481a aVar2 = concurrentHashMap.get(Integer.valueOf(i));
        boolean z = true;
        if (aVar2 != null) {
            long j = aVar2.f57636j0;
            if (!(j == 0 || j == id || aVar2.f57644q == 0)) {
                aVar2 = null;
            }
            if (aVar2 != null) {
                Log.m105924i("Finder.FinderLoadingTimeReporter", "notifyVideoFirstFrame: " + fTPPTag2 + ", feedId=" + C61926c.m72691p(id));
                aVar2.f57644q = C31543z5.m39453c();
                if (videoPlayTrace != null) {
                    String jSONObject = videoPlayTrace.mo12483d().toString();
                    C87412m.m108593f(jSONObject, "trace.traceToJson().toString()");
                    aVar2.f57651x = C112551y.m153814n(jSONObject, ",", ";", false);
                    aVar2.f57650w = videoPlayTrace.f36957d;
                }
                e0Var.mo32044s(aVar2, i);
                concurrentHashMap.remove(Integer.valueOf(i));
            }
        }
        C58356b0 b0Var = C58356b0.f167106a;
        C56521b bVar2 = this.f161854J;
        Long valueOf = (bVar2 == null || (feedData = bVar2.f161892a) == null) ? null : Long.valueOf(feedData.getId());
        b0Var.getClass();
        if (valueOf != null) {
            valueOf.longValue();
            C58356b0.C58357a a = b0Var.mo83108a(valueOf.longValue());
            if ((a.f167111c <= 0 && a.f167109a <= 0) || a.f167113e != 0) {
                z = false;
            }
            if (z) {
                aVar = a;
            }
            if (aVar != null) {
                aVar.f167113e = C31543z5.m39453c();
                C58356b0.f167108c.add(aVar);
                C58356b0.f167107b.clear();
            }
        }
        C39818r rVar = C39818r.f106831a;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        FinderHomeUIC finderHomeUIC = (FinderHomeUIC) rVar.mo62443b(context).mo62449e(FinderHomeUIC.class);
        if (finderHomeUIC != null) {
            finderHomeUIC.mo5134j3();
        }
    }

    /* renamed from: I3 */
    public void mo22957I3(String str, String str2, Boolean bool) {
        C58259c.C58261b videoPlayBehavior;
        boolean booleanValue = bool.booleanValue();
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("[onVideoWaiting] videoView=");
        C59670o2 o2Var = this.f161884w;
        C56521b bVar = null;
        sb.append(o2Var != null ? Integer.valueOf(o2Var.hashCode()) : null);
        sb.append(" mediaId=");
        sb.append(str2);
        sb.append(" thumbVisible=");
        sb.append(getThumbView().getVisibility());
        Log.m105924i(fTPPTag, sb.toString());
        C59670o2 o2Var2 = this.f161884w;
        boolean z = true;
        if (o2Var2 == null || !o2Var2.getVideoViewFocused()) {
            z = false;
        }
        if (z || str == null) {
            mo79545I(new C8433y1(this));
            C56521b bVar2 = this.f161854J;
            if (bVar2 != null) {
                if (bVar2.f161898g) {
                    bVar = bVar2;
                }
                if (bVar != null && (videoPlayBehavior = getVideoPlayBehavior()) != null) {
                    long expectId = bVar.f161892a.getExpectId();
                    C62367r0 r0Var = bVar.f161894c;
                    videoPlayBehavior.mo83016a(expectId, r0Var.f177253e, r0Var, booleanValue);
                }
            }
        }
    }

    /* renamed from: K */
    public final void mo79546K(boolean z) {
        mo79545I(new C56524h(this, z));
    }

    /* renamed from: L */
    public void mo22958L(String str, String str2) {
        FeedData feedData;
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("[onVideoEnded] videoView=");
        C59670o2 o2Var = this.f161884w;
        sb.append(o2Var != null ? Integer.valueOf(o2Var.hashCode()) : null);
        sb.append(" mediaId=");
        sb.append(str2);
        Log.m105924i(fTPPTag, sb.toString());
        C59667n2 n2Var = this.f161855K;
        if (n2Var != null) {
            n2Var.onVideoEnded();
        }
        FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar = this.f161856L;
        if (finderLongVideoPlayerSeekBar != null) {
            finderLongVideoPlayerSeekBar.onVideoEnded();
        }
        C56521b bVar = this.f161854J;
        if (bVar != null && (feedData = bVar.f161892a) != null) {
            C62168u uVar = this.f161869f;
            long expectId = feedData.getExpectId();
            uVar.f176748g.put(Long.valueOf(expectId), Integer.valueOf(uVar.mo87220d3(expectId) + 1));
        }
    }

    /* renamed from: M5 */
    public void mo22959M5(int i, int i2) {
    }

    /* renamed from: N */
    public final void mo79547N(boolean z) {
        if (z) {
            mo79600z(false, true);
        } else {
            mo79600z(true, true);
        }
    }

    /* renamed from: O */
    public final void mo79548O(long j, long j2) {
        long j3;
        long j4;
        long j5;
        FeedData feedData;
        long j6 = 0;
        if (j == -1) {
            C59670o2 o2Var = this.f161884w;
            j3 = o2Var != null ? o2Var.getCurrentPlayMs() : 0;
        } else {
            j3 = j;
        }
        if (j2 == -1) {
            C59670o2 o2Var2 = this.f161884w;
            j4 = o2Var2 != null ? o2Var2.getVideoDurationMs() : 0;
        } else {
            j4 = j2;
        }
        long j7 = (long) 1000;
        int i = (int) (j3 / j7);
        int i2 = (int) (j4 / j7);
        if (j4 - j3 <= 100) {
            FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent = new FeedMegaVideoAnimPlayEvent();
            FeedMegaVideoAnimPlayEvent.C1038a aVar = feedMegaVideoAnimPlayEvent.f9160d;
            C56521b bVar = this.f161854J;
            if (!(bVar == null || (feedData = bVar.f161892a) == null)) {
                j6 = feedData.getExpectId();
            }
            aVar.f9161a = j6;
            FeedMegaVideoAnimPlayEvent.C1038a aVar2 = feedMegaVideoAnimPlayEvent.f9160d;
            aVar2.f9166f = true;
            aVar2.f9165e = this.f161851G;
            feedMegaVideoAnimPlayEvent.publish();
        }
        C59667n2 n2Var = this.f161855K;
        if (n2Var != null) {
            j5 = j3;
            C56525i iVar = r0;
            C56525i iVar2 = new C56525i(n2Var, j4, this, j3, i, i2);
            post(iVar);
        } else {
            j5 = j3;
        }
        FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar = this.f161856L;
        if (finderLongVideoPlayerSeekBar != null) {
            finderLongVideoPlayerSeekBar.post(new C56526j(finderLongVideoPlayerSeekBar, i2, i, this));
        }
        for (C59671p2 K2 : getVideoCallBackList()) {
            K2.mo5164K2(j5, j4);
        }
    }

    /* renamed from: P */
    public final String mo79549P() {
        StringBuilder sb = new StringBuilder();
        sb.append("mediaId:");
        C59670o2 o2Var = this.f161884w;
        Float f = null;
        sb.append(o2Var != null ? o2Var.getVideoMediaId() : null);
        sb.append(' ');
        sb.append(hashCode());
        sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
        C59670o2 o2Var2 = this.f161884w;
        sb.append(o2Var2 != null ? o2Var2.hashCode() : 0);
        sb.append(" alpha=");
        C59670o2 o2Var3 = this.f161884w;
        if (o2Var3 != null) {
            f = Float.valueOf(o2Var3.getAlpha());
        }
        sb.append(f);
        return sb.toString();
    }

    /* renamed from: T */
    public void mo22960T(String str, String str2, String str3, int i, int i2) {
        C58259c.C58261b videoPlayBehavior;
        int i3 = i;
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("[onError] videoView=");
        C59670o2 o2Var = this.f161884w;
        sb.append(o2Var != null ? Integer.valueOf(o2Var.hashCode()) : null);
        sb.append(" mediaId=");
        sb.append(str2);
        sb.append(" errorMsg=");
        sb.append(str3);
        sb.append(" what=");
        sb.append(i3);
        sb.append(" extra=");
        sb.append(i2);
        Log.m105924i(fTPPTag, sb.toString());
        C59667n2 n2Var = this.f161855K;
        if (n2Var != null) {
            n2Var.setVisibility(8);
        }
        mo79545I(new C59690z1(this));
        ((C58417y0) C86312j.m106911c(C58417y0.class)).getClass();
        if (i3 == -21020) {
            C117407d.INSTANCE.idkeyStat((long) 1298, (long) 10, 1, false);
        } else if (i3 == -21009) {
            C117407d.INSTANCE.idkeyStat((long) 1298, (long) 9, 1, false);
        } else if (i3 == -10012) {
            C117407d.INSTANCE.idkeyStat((long) 1298, (long) 7, 1, false);
        } else if (i3 == -10004) {
            C117407d.INSTANCE.idkeyStat((long) 1298, (long) 8, 1, false);
        } else if (i3 == -1010) {
            C117407d.INSTANCE.idkeyStat((long) 1298, (long) 4, 1, false);
        } else if (i3 == -1007) {
            C117407d.INSTANCE.idkeyStat((long) 1298, (long) 5, 1, false);
        } else if (i3 == -1004) {
            C117407d.INSTANCE.idkeyStat((long) 1298, (long) 6, 1, false);
        } else if (i3 == 416) {
            C117407d.INSTANCE.idkeyStat((long) 1298, (long) 15, 1, false);
        } else if (i3 == 502) {
            C117407d.INSTANCE.idkeyStat((long) 1298, (long) 14, 1, false);
        } else if (i3 != 503) {
            switch (i3) {
                case 403:
                    C117407d.INSTANCE.idkeyStat((long) 1298, (long) 12, 1, false);
                    break;
                case 404:
                    C117407d.INSTANCE.idkeyStat((long) 1298, (long) 11, 1, false);
                    break;
                case 405:
                    C117407d.INSTANCE.idkeyStat((long) 1298, (long) 16, 1, false);
                    break;
                default:
                    C117407d.INSTANCE.idkeyStat((long) 1298, (long) 255, 1, false);
                    break;
            }
        } else {
            C117407d.INSTANCE.idkeyStat((long) 1298, (long) 13, 1, false);
        }
        C56521b bVar = this.f161854J;
        if (bVar != null && (videoPlayBehavior = getVideoPlayBehavior()) != null) {
            videoPlayBehavior.mo83017b(bVar.f161892a.getExpectId(), bVar.f161894c.f177253e, i3);
        }
    }

    /* renamed from: V5 */
    public void mo22961V5(String str, String str2, int i, int i2, int i3) {
        C58259c.C58261b videoPlayBehavior;
        C56521b bVar = this.f161854J;
        if (bVar != null) {
            if (!bVar.f161898g) {
                bVar = null;
            }
            if (bVar != null && (videoPlayBehavior = getVideoPlayBehavior()) != null) {
                long expectId = bVar.f161892a.getExpectId();
                C62367r0 r0Var = bVar.f161894c;
                videoPlayBehavior.mo83021f(expectId, r0Var.f177253e, r0Var, i, i2, i3);
            }
        }
    }

    /* renamed from: Z */
    public void mo22962Z(String str, String str2) {
        C59670o2 o2Var = this.f161884w;
        Integer num = null;
        Integer valueOf = o2Var != null ? Integer.valueOf(o2Var.getVideoDuration()) : null;
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("[onPrepared] videoView=");
        C59670o2 o2Var2 = this.f161884w;
        if (o2Var2 != null) {
            num = Integer.valueOf(o2Var2.hashCode());
        }
        sb.append(num);
        sb.append(" mediaId=");
        sb.append(str2);
        sb.append(" thumbVisible=");
        sb.append(getThumbView().getVisibility());
        sb.append(" duration=");
        sb.append(valueOf);
        Log.m105924i(fTPPTag, sb.toString());
    }

    /* renamed from: a */
    public void mo9353a() {
        C56521b bVar = this.f161854J;
        boolean z = false;
        if (bVar != null) {
            C59670o2 o2Var = this.f161884w;
            bVar.f161902k = !(o2Var != null ? o2Var.isPlaying() : false);
        }
        C59670o2 o2Var2 = this.f161884w;
        if (o2Var2 != null) {
            o2Var2.pause();
        }
        C56521b bVar2 = this.f161854J;
        if (bVar2 != null && !bVar2.f161899h) {
            z = true;
        }
        if (z) {
            mo79546K(true);
        }
    }

    /* renamed from: a0 */
    public void mo22963a0(String str, String str2) {
        FeedData feedData;
        Window window;
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("[onVideoPause] videoView=");
        C59670o2 o2Var = this.f161884w;
        C58356b0.C58357a aVar = null;
        sb.append(o2Var != null ? Integer.valueOf(o2Var.hashCode()) : null);
        sb.append(" mediaId=");
        sb.append(str2);
        Log.m105924i(fTPPTag, sb.toString());
        mo79576r();
        C37521f.f99374d.getClass();
        boolean z = false;
        if (C37521f.f99200I8.mo60266n().intValue() == 1) {
            Context context = getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (!(activity == null || (window = activity.getWindow()) == null)) {
                Log.m105924i(getFTPPTag(), "releaseScreenOn");
                window.clearFlags(128);
            }
        } else {
            setKeepScreenOn(false);
        }
        C58356b0 b0Var = C58356b0.f167106a;
        C56521b bVar = this.f161854J;
        Long valueOf = (bVar == null || (feedData = bVar.f161892a) == null) ? null : Long.valueOf(feedData.getId());
        b0Var.getClass();
        if (valueOf != null) {
            valueOf.longValue();
            C58356b0.C58357a a = b0Var.mo83108a(valueOf.longValue());
            if (a.f167109a > 0 && a.f167113e == 0 && a.f167110b == 0) {
                z = true;
            }
            if (z) {
                aVar = a;
            }
            if (aVar != null) {
                aVar.f167110b = C31543z5.m39453c();
                C58356b0.f167108c.add(aVar);
                C58356b0.f167107b.remove(valueOf);
            }
        }
    }

    /* renamed from: b */
    public void mo79550b(boolean z) {
    }

    /* renamed from: c */
    public void mo9354c(float f) {
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("[seekTo] percent=");
        sb.append(f);
        sb.append(" isSeekMode=");
        sb.append(mo79598x());
        sb.append(" videoView=");
        C59670o2 o2Var = this.f161884w;
        Integer num = null;
        sb.append(o2Var != null ? Integer.valueOf(o2Var.hashCode()) : null);
        sb.append(" videoDurationSec=");
        C59670o2 o2Var2 = this.f161884w;
        sb.append(o2Var2 != null ? Integer.valueOf(o2Var2.getVideoDuration()) : null);
        Log.m105924i(fTPPTag, sb.toString());
        C59670o2 o2Var3 = this.f161884w;
        boolean z = true;
        if (o2Var3 != null) {
            int currentPlaySecond = o2Var3.getCurrentPlaySecond();
            C59670o2 o2Var4 = this.f161884w;
            float videoDuration = (float) (o2Var4 != null ? o2Var4.getVideoDuration() : 1);
            float a = C16095a.m14979a(f * videoDuration, 0.0f, videoDuration - 1.0f);
            if (Math.abs(((float) currentPlaySecond) - a) > 1.0f && o2Var3.mo51233x((double) a, !mo79598x(), 2)) {
                this.f161863T = a;
                String fTPPTag2 = getFTPPTag();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("[seekTo] successfully seek to ");
                sb4.append(a);
                sb4.append(" videoDurationSec=");
                C59670o2 o2Var5 = this.f161884w;
                sb4.append(o2Var5 != null ? Integer.valueOf(o2Var5.getVideoDuration()) : null);
                Log.m105924i(fTPPTag2, sb4.toString());
            }
            C59869v vVar = this.f161852H;
            if (vVar != null) {
                vVar.mo84824a((int) a);
            }
            C56521b bVar = this.f161854J;
            if (bVar != null) {
                if (!bVar.f161898g) {
                    bVar = null;
                }
                if (bVar != null) {
                    C58259c.C58261b videoPlayBehavior = getVideoPlayBehavior();
                    if (videoPlayBehavior != null) {
                        long expectId = bVar.f161892a.getExpectId();
                        C62367r0 r0Var = bVar.f161894c;
                        videoPlayBehavior.mo83027l(expectId, r0Var.f177253e, currentPlaySecond, (int) a, r0Var);
                    }
                    int i = (int) a;
                    mo79543G(bVar.f161892a.getExpectId(), o2Var3.getVideoMediaId(), currentPlaySecond, i);
                    C13442s8.C13443a aVar = C13442s8.f38060Q0;
                    Context context = getContext();
                    C87412m.m108593f(context, "context");
                    C13442s8 f2 = aVar.mo12873f(context);
                    C49712hj1 q3 = f2 != null ? f2.mo12861q3() : null;
                    C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
                    C13604l[] lVarArr = new C13604l[12];
                    lVarArr[0] = new C13604l("view_id", "finder_feed_progress_bar");
                    lVarArr[1] = new C13604l("behaviour_session_id", q3 != null ? q3.f134670d : null);
                    lVarArr[2] = new C13604l("finder_context_id", q3 != null ? q3.f134671e : null);
                    lVarArr[3] = new C13604l("finder_tab_context_id", q3 != null ? q3.f134672f : null);
                    if (q3 != null) {
                        num = Integer.valueOf(q3.f134675i);
                    }
                    lVarArr[4] = new C13604l("comment_scene", num);
                    lVarArr[5] = new C13604l("feed_id", C61926c.m72691p(bVar.f161892a.getExpectId()));
                    lVarArr[6] = new C13604l("is_pcr90", Integer.valueOf(this.f161869f.mo87220d3(bVar.f161892a.getExpectId()) > 0 ? 1 : 0));
                    lVarArr[7] = new C13604l("is_pause", Integer.valueOf(bVar.f161902k ? 1 : 0));
                    lVarArr[8] = new C13604l("time_point_before_dpb", Integer.valueOf(currentPlaySecond));
                    lVarArr[9] = new C13604l("time_point_after_dpb", Integer.valueOf(i));
                    C59670o2 o2Var6 = this.f161884w;
                    lVarArr[10] = new C13604l("video_duration_time", Long.valueOf(o2Var6 != null ? o2Var6.getVideoDurationMs() : 0));
                    lVarArr[11] = new C13604l("screen_type", 2);
                    eVar.mo86168ix("drag_feed_progress_bar", C90364q0.m113147f(lVarArr), 25496);
                }
            }
        }
        C56521b bVar2 = this.f161854J;
        if (bVar2 == null || bVar2.f161899h) {
            z = false;
        }
        if (z) {
            mo79546K(false);
        }
    }

    /* renamed from: e */
    public void mo78310e(int i, int i2, C62369u0 u0Var) {
        C58259c.C58261b videoPlayBehavior;
        C87412m.m108594g(u0Var, "video");
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("[onProgressDownload] videoView=");
        C59670o2 o2Var = this.f161884w;
        C56521b bVar = null;
        sb.append(o2Var != null ? Integer.valueOf(o2Var.hashCode()) : null);
        sb.append(" offset=");
        sb.append(i);
        sb.append(" total=");
        sb.append(i2);
        sb.append(" video=");
        sb.append(((C62367r0) u0Var).mo11841b());
        Log.m105924i(fTPPTag, sb.toString());
        C56521b bVar2 = this.f161854J;
        if (bVar2 != null) {
            if (bVar2.f161898g) {
                bVar = bVar2;
            }
            if (!(bVar == null || (videoPlayBehavior = getVideoPlayBehavior()) == null)) {
                long expectId = bVar.f161892a.getExpectId();
                C62367r0 r0Var = bVar.f161894c;
                videoPlayBehavior.mo83038w(expectId, r0Var.f177253e, i, i2, r0Var);
            }
        }
        boolean z = MediaPreloadCore.f160304p;
        if (MediaPreloadCore.f160304p) {
            PreloadProcessChangeEvent preloadProcessChangeEvent = new PreloadProcessChangeEvent();
            preloadProcessChangeEvent.f154859d.f154860a = u0Var.mo87421f().f185275p;
            preloadProcessChangeEvent.f154859d.f154861b = (int) ((((float) i) * 100.0f) / ((float) i2));
            C66167g gVar = C66167g.f190173a;
            String str = u0Var.mo87421f().f185275p;
            if (str == null) {
                str = "";
            }
            C55015f1 c = gVar.mo90234c(str, true);
            PreloadProcessChangeEvent.C55157a aVar = preloadProcessChangeEvent.f154859d;
            aVar.f154865f = c.field_fileFormat;
            aVar.f154864e = c.field_hasPlayed;
            preloadProcessChangeEvent.publish();
        }
    }

    /* renamed from: g */
    public void mo78311g(C62369u0 u0Var) {
        FeedData feedData;
        FeedData feedData2;
        C58259c.C58261b videoPlayBehavior;
        C87412m.m108594g(u0Var, "video");
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("[onStartDownload] videoView=");
        C59670o2 o2Var = this.f161884w;
        Long l = null;
        sb.append(o2Var != null ? Integer.valueOf(o2Var.hashCode()) : null);
        sb.append(" FinderVideo=");
        sb.append(u0Var);
        sb.append(" thumbVisible=");
        sb.append(getThumbView().getVisibility());
        Log.m105924i(fTPPTag, sb.toString());
        mo79545I(new C59669o1(this));
        C56521b bVar = this.f161854J;
        if (bVar != null) {
            if (!bVar.f161898g) {
                bVar = null;
            }
            if (!(bVar == null || (videoPlayBehavior = getVideoPlayBehavior()) == null)) {
                long expectId = bVar.f161892a.getExpectId();
                C62367r0 r0Var = bVar.f161894c;
                videoPlayBehavior.mo83023h(expectId, r0Var.f177253e, r0Var);
            }
        }
        C20480e0 e0Var = C20480e0.f57583a;
        int i = this.f161851G;
        String fTPPTag2 = getFTPPTag();
        C56521b bVar2 = this.f161854J;
        long id = (bVar2 == null || (feedData2 = bVar2.f161892a) == null) ? 0 : feedData2.getId();
        C87412m.m108594g(fTPPTag2, "tag");
        C20480e0.C20481a aVar = C20480e0.f57589g.get(Integer.valueOf(i));
        if (aVar != null) {
            long j = aVar.f57636j0;
            if (!(j == 0 || j == id || aVar.f57641n == 0)) {
                aVar = null;
            }
            if (aVar != null) {
                Log.m105924i("Finder.FinderLoadingTimeReporter", "notifyVideoDownload: " + fTPPTag2 + ", feedId=" + C61926c.m72691p(id));
                aVar.f57641n = C31543z5.m39453c();
            }
        }
        C58356b0 b0Var = C58356b0.f167106a;
        C56521b bVar3 = this.f161854J;
        if (!(bVar3 == null || (feedData = bVar3.f161892a) == null)) {
            l = Long.valueOf(feedData.getId());
        }
        b0Var.mo83109b(l);
    }

    public final Bitmap getBitmap() {
        Bitmap bitmap;
        C59670o2 o2Var = this.f161884w;
        if (o2Var != null && (bitmap = o2Var.getBitmap()) != null) {
            return bitmap;
        }
        Drawable drawable = getThumbView().getDrawable();
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getBitmap();
        }
        return null;
    }

    public final C59869v getBulletLifecycle() {
        return this.f161852H;
    }

    public long getCurrentPosMs() {
        C59670o2 o2Var = this.f161884w;
        if (o2Var != null) {
            return o2Var.getCurrentPlayMs();
        }
        return 0;
    }

    public int getCurrentPosSec() {
        C59670o2 o2Var = this.f161884w;
        if (o2Var != null) {
            return o2Var.getCurrentPlaySecond();
        }
        return 0;
    }

    public final String getFTPPTag() {
        return String.valueOf(this.f161867d);
    }

    public final C59684w2 getLifecycle() {
        return this.f161853I;
    }

    public final FinderLongVideoPlayerSeekBar getLongVideoSeekBar() {
        return this.f161856L;
    }

    public final int getPlayAdapterPosition() {
        return this.f161859P;
    }

    public final C56521b getPlayInfo() {
        return this.f161854J;
    }

    public final View getRetryBtn() {
        Object value = this.f161847C.getValue();
        C87412m.m108593f(value, "<get-retryBtn>(...)");
        return (View) value;
    }

    public final boolean getReuseSamePlayer() {
        return this.f161845A;
    }

    public final C59667n2 getSeekBarLayout() {
        return this.f161855K;
    }

    public final C32227p<Boolean, C56521b, C13598b0> getThumbShowCallback() {
        return this.f161858N;
    }

    public final FinderVideoCore getVideoCore() {
        FinderVideoCore finderVideoCore = this.f161885x;
        if (finderVideoCore != null) {
            return finderVideoCore;
        }
        C87412m.m108603p("videoCore");
        throw null;
    }

    public int getVideoDurationSec() {
        C59670o2 o2Var = this.f161884w;
        if (o2Var != null) {
            return o2Var.getVideoDuration();
        }
        return 0;
    }

    public final C32227p<Boolean, C56521b, C13598b0> getVideoPauseCallback() {
        return this.f161857M;
    }

    public final C58259c.C58261b getVideoPlayBehavior() {
        C58259c cVar = getVideoCore().f161829o;
        if (cVar != null) {
            return new C58262d(cVar);
        }
        return null;
    }

    public final C59670o2 getVideoView() {
        return this.f161884w;
    }

    /* renamed from: h */
    public void mo78325h(C62369u0 u0Var, C98127h hVar, C98121d dVar) {
        C58259c.C58261b videoPlayBehavior;
        C87412m.m108594g(u0Var, "video");
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("[onStopDownload] videoView=");
        C59670o2 o2Var = this.f161884w;
        sb.append(o2Var != null ? Integer.valueOf(o2Var.hashCode()) : null);
        sb.append(" FinderVideo=");
        sb.append(u0Var);
        sb.append(" thumbVisible=");
        sb.append(getThumbView().getVisibility());
        Log.m105924i(fTPPTag, sb.toString());
        C56521b bVar = this.f161854J;
        if (bVar != null && (videoPlayBehavior = getVideoPlayBehavior()) != null) {
            long expectId = bVar.f161892a.getExpectId();
            C62367r0 r0Var = bVar.f161894c;
            videoPlayBehavior.mo83020e(expectId, r0Var.f177253e, hVar, dVar, r0Var);
        }
    }

    /* renamed from: i */
    public void mo78326i(String str, int i, int i2) {
        C58259c.C58261b videoPlayBehavior;
        C87412m.m108594g(str, "mediaId");
        C56521b bVar = this.f161854J;
        if (bVar != null) {
            if (!bVar.f161898g) {
                bVar = null;
            }
            if (bVar != null && (videoPlayBehavior = getVideoPlayBehavior()) != null) {
                long expectId = bVar.f161892a.getExpectId();
                C62367r0 r0Var = bVar.f161894c;
                videoPlayBehavior.mo83032q(expectId, r0Var.f177253e, i, i2, r0Var);
            }
        }
    }

    /* renamed from: j */
    public void mo78327j(int i, int i2, C62369u0 u0Var, boolean z) {
        FeedData feedData;
        FeedData feedData2;
        C62369u0 u0Var2 = u0Var;
        boolean z2 = z;
        C87412m.m108594g(u0Var2, "video");
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("[onMoovReadyDownload] videoView=");
        C59670o2 o2Var = this.f161884w;
        C58356b0.C58357a aVar = null;
        sb.append(o2Var != null ? Integer.valueOf(o2Var.hashCode()) : null);
        sb.append("  offset=");
        sb.append(i);
        sb.append(" total=");
        sb.append(i2);
        sb.append(" video=");
        sb.append(u0Var2);
        sb.append(" moovFirstDownloaded=");
        sb.append(z2);
        Log.m105924i(fTPPTag, sb.toString());
        C56521b bVar = this.f161854J;
        boolean z3 = true;
        if (bVar != null) {
            if (!bVar.f161898g) {
                bVar = null;
            }
            if (bVar != null) {
                C58354a2 a2Var = C58354a2.f167095a;
                String str = bVar.f161894c.f177253e.f185275p;
                if (str == null) {
                    str = "";
                }
                C58354a2.C58355a aVar2 = C58354a2.f167096b.get(str);
                if (aVar2 != null) {
                    aVar2.f167105i = !z2;
                    aVar2.f167104h = C31543z5.m39453c();
                }
                C58259c.C58261b videoPlayBehavior = getVideoPlayBehavior();
                if (videoPlayBehavior != null) {
                    long expectId = bVar.f161892a.getExpectId();
                    C62367r0 r0Var = bVar.f161894c;
                    videoPlayBehavior.mo83033r(expectId, r0Var.f177253e, i, i2, r0Var);
                }
            }
        }
        C20480e0 e0Var = C20480e0.f57583a;
        int i3 = this.f161851G;
        String fTPPTag2 = getFTPPTag();
        C56521b bVar2 = this.f161854J;
        e0Var.mo32035h(i3, fTPPTag2, (bVar2 == null || (feedData2 = bVar2.f161892a) == null) ? 0 : feedData2.getId(), false);
        C58356b0 b0Var = C58356b0.f167106a;
        C56521b bVar3 = this.f161854J;
        Long valueOf = (bVar3 == null || (feedData = bVar3.f161892a) == null) ? null : Long.valueOf(feedData.getId());
        b0Var.getClass();
        if (valueOf != null) {
            valueOf.longValue();
            C58356b0.C58357a a = b0Var.mo83108a(valueOf.longValue());
            if (a.f167111c <= 0 || a.f167112d != 0) {
                z3 = false;
            }
            if (z3) {
                aVar = a;
            }
            if (aVar != null) {
                aVar.f167112d = C31543z5.m39453c();
            }
        }
    }

    /* renamed from: l */
    public void mo78328l(int i, C62369u0 u0Var, C98121d dVar) {
        C58259c.C58261b videoPlayBehavior;
        C87412m.m108594g(u0Var, "video");
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("[onFinishDownload] ret=");
        sb.append(i);
        sb.append(" videoView=");
        C59670o2 o2Var = this.f161884w;
        C56521b bVar = null;
        sb.append(o2Var != null ? Integer.valueOf(o2Var.hashCode()) : null);
        sb.append(" FinderVideo=");
        sb.append(u0Var);
        Log.m105924i(fTPPTag, sb.toString());
        mo79576r();
        C56521b bVar2 = this.f161854J;
        if (bVar2 != null) {
            if (bVar2.f161898g) {
                bVar = bVar2;
            }
            if (!(bVar == null || (videoPlayBehavior = getVideoPlayBehavior()) == null)) {
                long expectId = bVar.f161892a.getExpectId();
                C62367r0 r0Var = bVar.f161894c;
                videoPlayBehavior.mo83026k(expectId, r0Var.f177253e, i, dVar, r0Var);
            }
        }
        if (i < 0) {
            mo79545I(new C59690z1(this));
        }
    }

    /* renamed from: l0 */
    public void mo22964l0(String str, String str2, int i, int i2) {
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("[onGetVideoSize] videoView=");
        C59670o2 o2Var = this.f161884w;
        sb.append(o2Var != null ? Integer.valueOf(o2Var.hashCode()) : null);
        sb.append(" mediaId=");
        sb.append(str2);
        sb.append(" width=");
        sb.append(i);
        sb.append(" height=");
        sb.append(i2);
        Log.m105924i(fTPPTag, sb.toString());
    }

    /* renamed from: m */
    public final void mo79569m(C59671p2 p2Var) {
        C87412m.m108594g(p2Var, "callBack");
        getVideoCallBackList().add(p2Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0149, code lost:
        if (r0 == null) goto L_0x014b;
     */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22965m0(java.lang.String r24, java.lang.String r25) {
        /*
            r23 = this;
            r6 = r23
            gr1.o2 r0 = r6.f161884w
            r7 = 0
            if (r0 == 0) goto L_0x000c
            int r0 = r0.getVideoDuration()
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            java.lang.String r1 = r23.getFTPPTag()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[onVideoPlay] videoView="
            r2.append(r3)
            gr1.o2 r3 = r6.f161884w
            r8 = 0
            if (r3 == 0) goto L_0x0029
            int r3 = r3.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x002a
        L_0x0029:
            r3 = r8
        L_0x002a:
            r2.append(r3)
            java.lang.String r3 = " mediaId="
            r2.append(r3)
            r3 = r25
            r2.append(r3)
            java.lang.String r3 = " duration="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = " isHasPlayed="
            r2.append(r3)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r3 = r6.f161854J
            if (r3 == 0) goto L_0x004f
            boolean r3 = r3.f161900i
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x0050
        L_0x004f:
            r3 = r8
        L_0x0050:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r1 = r6.f161854J
            r9 = 1
            if (r1 == 0) goto L_0x0065
            boolean r2 = r1.f161900i
            if (r2 != 0) goto L_0x0065
            r2 = 1
            goto L_0x0066
        L_0x0065:
            r2 = 0
        L_0x0066:
            if (r2 == 0) goto L_0x015d
            if (r1 == 0) goto L_0x016d
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r1.f161892a
            if (r1 == 0) goto L_0x016d
            long r10 = r1.getFeedId()
            os1.u r1 = r6.f161869f
            os1.u$a r12 = r1.mo87222f3(r10, r9)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L_0x014b
            gr1.o2 r14 = r6.f161884w
            if (r14 == 0) goto L_0x0134
            int r1 = r12.f176752c
            float r1 = (float) r1
            float r1 = r1 * r13
            gr1.n2 r2 = r6.f161855K
            if (r2 == 0) goto L_0x008f
            int r2 = r2.getMaxProgress()
            float r2 = (float) r2
            goto L_0x0091
        L_0x008f:
            r2 = 1140457472(0x43fa0000, float:500.0)
        L_0x0091:
            float r2 = java.lang.Math.max(r2, r13)
            float r1 = r1 / r2
            float r0 = (float) r0
            float r1 = r1 * r0
            r2 = 0
            float r0 = r0 - r13
            float r15 = p282z2.C16095a.m14979a(r1, r2, r0)
            long r1 = (long) r15
            long r3 = r12.f176755f
            java.lang.String r5 = "onVideoPlay"
            r0 = r23
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$a r0 = r0.mo79570n(r1, r3, r5)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$a r1 = com.tencent.p014mm.plugin.finder.video.FinderVideoLayout.C56520a.SEEK_SILENTLY
            if (r0 != r1) goto L_0x0134
            int r0 = r12.f176751b
            int r1 = r6.f161851G
            if (r0 != r1) goto L_0x0134
            int r4 = r14.getCurrentPlaySecond()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onVideoPlay: auto seek silently, feedId = "
            r0.append(r1)
            java.lang.String r1 = o40.C61926c.m72691p(r10)
            r0.append(r1)
            java.lang.String r1 = ", seekTime = "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r1 = ", currentPlay="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.VideoLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            gr1.n2 r0 = r6.f161855K
            if (r0 == 0) goto L_0x00eb
            int r1 = r12.f176752c
            r0.setProgress(r1)
        L_0x00eb:
            double r0 = (double) r15
            boolean r2 = r23.mo79598x()
            r2 = r2 ^ r9
            r14.mo51223a(r0, r2)
            he1.v r0 = r6.f161852H
            if (r0 == 0) goto L_0x00fc
            int r1 = (int) r15
            r0.mo84824a(r1)
        L_0x00fc:
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r0 = r6.f161854J
            if (r0 == 0) goto L_0x0134
            boolean r1 = r0.f161898g
            if (r1 == 0) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r0 = r8
        L_0x0106:
            if (r0 == 0) goto L_0x0134
            df1.c$b r16 = r23.getVideoPlayBehavior()
            if (r16 == 0) goto L_0x0124
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r0.f161892a
            long r17 = r1.getExpectId()
            pl1.r0 r1 = r0.f161894c
            te3.rq2 r2 = r1.f177253e
            int r3 = (int) r15
            r19 = r2
            r20 = r4
            r21 = r3
            r22 = r1
            r16.mo83027l(r17, r19, r20, r21, r22)
        L_0x0124:
            com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f161892a
            long r1 = r0.getExpectId()
            java.lang.String r3 = r14.getVideoMediaId()
            int r5 = (int) r15
            r0 = r23
            r0.mo79543G(r1, r3, r4, r5)
        L_0x0134:
            gr1.o2 r0 = r6.f161884w
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r1 == 0) goto L_0x013d
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r0 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r0
            goto L_0x013e
        L_0x013d:
            r0 = r8
        L_0x013e:
            if (r0 == 0) goto L_0x0148
            float r1 = r12.f176754e
            r0.setPlaySpeed(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0149
        L_0x0148:
            r0 = r8
        L_0x0149:
            if (r0 != 0) goto L_0x016d
        L_0x014b:
            gr1.o2 r0 = r6.f161884w
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r1 == 0) goto L_0x0154
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r0 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r0
            goto L_0x0155
        L_0x0154:
            r0 = r8
        L_0x0155:
            if (r0 == 0) goto L_0x016d
            r0.setPlaySpeed(r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x016d
        L_0x015d:
            if (r1 == 0) goto L_0x0165
            boolean r0 = r1.f161900i
            if (r0 != r9) goto L_0x0165
            r0 = 1
            goto L_0x0166
        L_0x0165:
            r0 = 0
        L_0x0166:
            if (r0 == 0) goto L_0x016d
            java.lang.String r0 = "VideoPlayLifecycle.onPlay"
            r6.mo79577s(r0)
        L_0x016d:
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r0 = r6.f161854J
            if (r0 != 0) goto L_0x0172
            goto L_0x0174
        L_0x0172:
            r0.f161900i = r9
        L_0x0174:
            r23.mo79576r()
            gr1.o1 r0 = new gr1.o1
            r0.<init>(r6)
            r6.mo79545I(r0)
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99200I8
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r9) goto L_0x01b5
            android.content.Context r0 = r23.getContext()
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x019d
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x019e
        L_0x019d:
            r0 = r8
        L_0x019e:
            if (r0 == 0) goto L_0x01b8
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x01b8
            java.lang.String r1 = r23.getFTPPTag()
            java.lang.String r2 = "keepScreenOn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r1 = 128(0x80, float:1.794E-43)
            r0.addFlags(r1)
            goto L_0x01b8
        L_0x01b5:
            r6.setKeepScreenOn(r9)
        L_0x01b8:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.f161863T = r0
            r0 = -1
            r6.mo79548O(r0, r0)
            dp1.b0 r0 = dp1.C58356b0.f167106a
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r1 = r6.f161854J
            if (r1 == 0) goto L_0x01d4
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r1.f161892a
            if (r1 == 0) goto L_0x01d4
            long r1 = r1.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L_0x01d5
        L_0x01d4:
            r1 = r8
        L_0x01d5:
            r0.mo83110c(r1)
            dp1.e0 r0 = dp1.C20480e0.f57583a
            int r0 = r6.f161851G
            java.lang.String r1 = r23.getFTPPTag()
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r2 = r6.f161854J
            r3 = 0
            if (r2 == 0) goto L_0x01ef
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r2.f161892a
            if (r2 == 0) goto L_0x01ef
            long r10 = r2.getId()
            goto L_0x01f0
        L_0x01ef:
            r10 = r3
        L_0x01f0:
            java.lang.String r2 = "tag"
            gy3.C87412m.m108594g(r1, r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, dp1.e0$a> r2 = dp1.C20480e0.f57589g
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r2.get(r0)
            dp1.e0$a r0 = (dp1.C20480e0.C20481a) r0
            if (r0 == 0) goto L_0x0242
            long r12 = r0.f57636j0
            int r2 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0214
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x0214
            long r12 = r0.f57643p
            int r2 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0215
        L_0x0214:
            r7 = 1
        L_0x0215:
            if (r7 == 0) goto L_0x0218
            r8 = r0
        L_0x0218:
            if (r8 == 0) goto L_0x0242
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "notifyVideoPlay: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", feedId="
            r0.append(r1)
            java.lang.String r1 = o40.C61926c.m72691p(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderLoadingTimeReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            long r0 = eb0.C31543z5.m39453c()
            r8.f57643p = r0
        L_0x0242:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderVideoLayout.mo22965m0(java.lang.String, java.lang.String):void");
    }

    /* renamed from: n */
    public final C56520a mo79570n(long j, long j2, String str) {
        int i;
        int i2;
        FeedData feedData;
        C62367r0 r0Var;
        C64689rq2 rq22;
        FeedData feedData2;
        long j3 = j;
        long j4 = j2;
        String str2 = str;
        C56520a aVar = C56520a.NO_SEEK;
        C56520a aVar2 = C56520a.SEEK_SILENTLY;
        C87412m.m108594g(str2, FirebaseAnalytics.C113379b.SOURCE);
        if (!getAutoSeekIsOpen()) {
            Log.m105924i("Finder.VideoLayout", "checkAutoSeek: is close");
            return aVar2;
        }
        C59667n2 n2Var = this.f161855K;
        if (n2Var != null) {
            int i3 = 0;
            if (!(n2Var != null && !n2Var.mo4261k())) {
                C56521b bVar = this.f161854J;
                if (((bVar == null || (feedData2 = bVar.f161892a) == null) ? 0 : feedData2.getFeedId()) != 0) {
                    if (j4 <= 0 || System.currentTimeMillis() - j4 <= ((long) (getAutoSeekLocalInterval() * 1000))) {
                        int videoDurationSec = getVideoDurationSec();
                        if (videoDurationSec == 0) {
                            C56521b bVar2 = this.f161854J;
                            if (!(bVar2 == null || (r0Var = bVar2.f161894c) == null || (rq22 = r0Var.f177253e) == null)) {
                                i3 = rq22.f185269g;
                            }
                            i = i3;
                        } else {
                            i = videoDurationSec;
                        }
                        int currentPosSec = getCurrentPosSec();
                        StringBuilder sb = new StringBuilder();
                        sb.append("checkAutoSeek: source = ");
                        sb.append(str2);
                        sb.append(", feedId = ");
                        C56521b bVar3 = this.f161854J;
                        sb.append(C61926c.m72691p((bVar3 == null || (feedData = bVar3.f161892a) == null) ? 0 : feedData.getFeedId()));
                        sb.append(", seekTime=");
                        sb.append(j3);
                        sb.append(", currDuration=");
                        sb.append(currentPosSec);
                        sb.append(", totalDuration=");
                        sb.append(i);
                        sb.append(", autoSeekHeadThreshold=");
                        sb.append(getAutoSeekHeadThreshold());
                        sb.append(", autoSeekTailThreshold=");
                        sb.append(getAutoSeekTailThreshold());
                        sb.append(", autoSeekRollbackTime=");
                        sb.append(getAutoSeekRollbackTime());
                        sb.append(", autoSeekIntervalThreshold=");
                        sb.append(getAutoSeekIntervalThreshold());
                        Log.m105924i("Finder.VideoLayout", sb.toString());
                        long autoSeekRollbackTime = j3 - ((long) getAutoSeekRollbackTime());
                        long j5 = autoSeekRollbackTime < 0 ? 0 : autoSeekRollbackTime;
                        if (j5 <= 0 || j3 <= ((long) getAutoSeekHeadThreshold()) || ((long) i) - j3 <= ((long) getAutoSeekTailThreshold()) || (C87412m.m108589b("getCommentDetail", str2) && Math.abs(((long) currentPosSec) - j3) < ((long) getAutoSeekIntervalThreshold()))) {
                            return aVar;
                        }
                        long j6 = j5;
                        m65079J(this, j5 * 1000, 3, 0.0f, true ^ mo79598x(), (ITPPlayerListener.IOnSeekCompleteListener) null, 20, (Object) null);
                        C59667n2 n2Var2 = this.f161855K;
                        if (n2Var2 != null) {
                            n2Var2.mo4258h((int) j6, i);
                        }
                        C56521b bVar4 = this.f161854J;
                        if (bVar4 != null) {
                            if (!bVar4.f161898g) {
                                bVar4 = null;
                            }
                            if (bVar4 != null) {
                                C58259c.C58261b videoPlayBehavior = getVideoPlayBehavior();
                                if (videoPlayBehavior != null) {
                                    long expectId = bVar4.f161892a.getExpectId();
                                    C62367r0 r0Var2 = bVar4.f161894c;
                                    i2 = currentPosSec;
                                    videoPlayBehavior.mo83027l(expectId, r0Var2.f177253e, i2, (int) j3, r0Var2);
                                } else {
                                    i2 = currentPosSec;
                                }
                                long expectId2 = bVar4.f161892a.getExpectId();
                                C59670o2 o2Var = this.f161884w;
                                mo79543G(expectId2, o2Var != null ? o2Var.getVideoMediaId() : null, i2, (int) j3);
                            }
                        }
                        return C56520a.SEEK_NORMAL;
                    }
                    Log.m105924i("Finder.VideoLayout", "checkAutoSeek: record to old, diff = " + (System.currentTimeMillis() - j4) + " autoSeekLocalInterval = " + getAutoSeekLocalInterval() + ", recordTimestamp = " + j4);
                    return aVar;
                }
            }
        }
        return aVar2;
    }

    /* renamed from: o */
    public final void mo79571o(C59670o2 o2Var, C62367r0 r0Var, LinkedList<C64689rq2> linkedList) {
        FeedData feedData;
        FeedData feedData2;
        C59670o2 o2Var2 = o2Var;
        C62367r0 r0Var2 = r0Var;
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "checkVideoLivePlay isSeekMode:" + mo79598x());
        boolean z = o2Var2 instanceof FinderThumbPlayerProxy;
        FinderThumbPlayerProxy finderThumbPlayerProxy = z ? (FinderThumbPlayerProxy) o2Var2 : null;
        if (finderThumbPlayerProxy != null) {
            finderThumbPlayerProxy.setEnterSeekMode(mo79598x());
        }
        long j = 0;
        boolean z2 = false;
        boolean z3 = true;
        if (!mo79598x()) {
            o2Var2.setVideoViewFocused(true);
            C20480e0 e0Var = C20480e0.f57583a;
            int i = this.f161851G;
            String fTPPTag2 = getFTPPTag();
            C56521b bVar = this.f161854J;
            if (!(bVar == null || (feedData2 = bVar.f161892a) == null)) {
                j = feedData2.getId();
            }
            e0Var.mo32035h(i, fTPPTag2, j, true);
            if (C60171g1.C8767a.m8577a(o2Var2, (Integer) null, 1, (Object) null)) {
                String fTPPTag3 = getFTPPTag();
                Log.m105924i(fTPPTag3, "[FinderVideoLayout#start] layout=[" + getWidth() + XVFSFile.PATH_SEPARATOR_CHAR + getHeight() + "] videoView=[" + getWidth() + XVFSFile.PATH_SEPARATOR_CHAR + getHeight() + "] video=[" + r0Var2.f177253e.f185270h + XVFSFile.PATH_SEPARATOR_CHAR + r0Var2.f177253e.f185271i + "] " + mo79549P() + " media=" + r0Var2 + " mediaList=" + linkedList.size() + ' ');
                mo79576r();
            }
            if (this.f161849E || getVideoCore().f161836v) {
                z2 = true;
            }
            if (!z2) {
                z3 = getVideoCore().mo79534B1();
            }
            o2Var2.setMute(z3);
            return;
        }
        C62168u uVar = this.f161869f;
        C56521b bVar2 = this.f161854J;
        if (!(bVar2 == null || (feedData = bVar2.f161892a) == null)) {
            j = feedData.getId();
        }
        C62168u.C11757b e3 = uVar.mo87221e3(j);
        String fTPPTag4 = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("checkVideoLivePlay firstPlay:");
        sb.append(e3 != null ? Boolean.valueOf(e3.f34420d) : null);
        sb.append(" isPauseOnStart:");
        sb.append(e3 != null ? Boolean.valueOf(e3.f34418b) : null);
        Log.m105924i(fTPPTag4, sb.toString());
        if ((e3 != null && e3.f34420d) && z && e3.f34418b) {
            o2Var2.setVideoViewFocused(true);
            C60171g1.C8767a.m8577a(o2Var2, (Integer) null, 1, (Object) null);
            e3.f34420d = false;
            o2Var2.setIsShouldPlayResume(false);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("onAttachedToWindow ");
        C56521b bVar = this.f161854J;
        sb.append(bVar != null ? bVar.f161893b : null);
        Log.m105924i(fTPPTag, sb.toString());
        getVideoCore().mo79538z1().mo80067F2(this.f161881t);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [gr1.o2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDetachedFromWindow() {
        /*
            r12 = this;
            super.onDetachedFromWindow()
            java.lang.String r0 = r12.getFTPPTag()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[onDetachedFromWindow] "
            r1.append(r2)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r2 = r12.f161854J
            r3 = 0
            if (r2 == 0) goto L_0x0019
            java.lang.String r2 = r2.f161893b
            goto L_0x001a
        L_0x0019:
            r2 = r3
        L_0x001a:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            gr1.o2 r0 = r12.f161884w
            r1 = 0
            if (r0 == 0) goto L_0x005f
            os1.u r4 = r12.f161869f
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r2 = r12.f161854J
            gy3.C87412m.m108591d(r2)
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r2.f161892a
            long r5 = r2.getFeedId()
            int r7 = r12.f161851G
            gr1.n2 r2 = r12.f161855K
            if (r2 == 0) goto L_0x0042
            int r2 = r2.getCurrentProgress()
            r8 = r2
            goto L_0x0043
        L_0x0042:
            r8 = 0
        L_0x0043:
            long r9 = r0.getCurrentPlayMs()
            gr1.o2 r0 = r12.f161884w
            boolean r2 = r0 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r2 == 0) goto L_0x0050
            r3 = r0
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r3
        L_0x0050:
            if (r3 == 0) goto L_0x0058
            float r0 = r3.getPlaySpeedRatio()
            r11 = r0
            goto L_0x005c
        L_0x0058:
            r0 = 1065353216(0x3f800000, float:1.0)
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x005c:
            r4.mo87225j3(r5, r7, r8, r9, r11)
        L_0x005f:
            boolean r0 = r12.f161871h
            r0 = r0 ^ 1
            r12.mo79540B(r0)
            com.tencent.mm.plugin.finder.video.FinderVideoCore r0 = r12.getVideoCore()
            rs1.lb r0 = r0.mo79538z1()
            mt1.b r2 = r12.f161881t
            r0.mo80081j1(r2)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r0 = r12.f161854J
            if (r0 != 0) goto L_0x0078
            goto L_0x0082
        L_0x0078:
            gr1.n2 r2 = r12.f161855K
            if (r2 == 0) goto L_0x0080
            boolean r1 = r2.mo4264n()
        L_0x0080:
            r0.f161899h = r1
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderVideoLayout.onDetachedFromWindow():void");
    }

    public void onSeekComplete(ITPPlayer iTPPlayer) {
    }

    public void onViewAdded(View view) {
        C87412m.m108594g(view, "child");
        super.onViewAdded(view);
        if (view instanceof C59670o2) {
            String fTPPTag = getFTPPTag();
            StringBuilder sb = new StringBuilder();
            sb.append("[onViewAdded] isPreviewing=");
            C59670o2 o2Var = (C59670o2) view;
            sb.append(o2Var.mo78610g());
            sb.append(' ');
            sb.append(mo79549P());
            Log.m105924i(fTPPTag, sb.toString());
            if (o2Var.mo78610g()) {
                setVisibility(0);
            }
        }
    }

    public void onViewRemoved(View view) {
        View view2 = view;
        C87412m.m108594g(view2, "child");
        super.onViewRemoved(view);
        if (C87412m.m108589b(view2, this.f161884w) && (view2 instanceof C59670o2)) {
            String fTPPTag = getFTPPTag();
            StringBuilder sb = new StringBuilder();
            sb.append("[onViewRemoved] isPreviewing=");
            C59670o2 o2Var = (C59670o2) view2;
            sb.append(o2Var.mo78610g());
            sb.append(' ');
            sb.append(mo79549P());
            Log.m105924i(fTPPTag, sb.toString());
            C59667n2 n2Var = this.f161855K;
            if (n2Var != null) {
                n2Var.mo4265o();
            }
            C56521b bVar = this.f161854J;
            boolean z = true;
            if (bVar == null || !bVar.f161899h) {
                z = false;
            }
            long j = 0;
            if (z) {
                C62168u uVar = this.f161869f;
                C87412m.m108591d(bVar);
                long feedId = bVar.f161892a.getFeedId();
                int i = this.f161851G;
                C59667n2 n2Var2 = this.f161855K;
                int currentProgress = n2Var2 != null ? n2Var2.getCurrentProgress() : 0;
                C59670o2 o2Var2 = this.f161884w;
                long currentPlayMs = o2Var2 != null ? o2Var2.getCurrentPlayMs() : 0;
                C59670o2 o2Var3 = this.f161884w;
                FinderThumbPlayerProxy finderThumbPlayerProxy = o2Var3 instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) o2Var3 : null;
                uVar.mo87224i3(feedId, i, currentProgress, currentPlayMs, finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getPlaySpeedRatio() : 1.0f);
            }
            C62168u uVar2 = this.f161869f;
            C56521b bVar2 = this.f161854J;
            C87412m.m108591d(bVar2);
            long feedId2 = bVar2.f161892a.getFeedId();
            int i2 = this.f161851G;
            C59667n2 n2Var3 = this.f161855K;
            int currentProgress2 = n2Var3 != null ? n2Var3.getCurrentProgress() : 0;
            C59670o2 o2Var4 = this.f161884w;
            if (o2Var4 != null) {
                j = o2Var4.getCurrentPlayMs();
            }
            long j2 = j;
            C59670o2 o2Var5 = this.f161884w;
            FinderThumbPlayerProxy finderThumbPlayerProxy2 = o2Var5 instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) o2Var5 : null;
            uVar2.mo87225j3(feedId2, i2, currentProgress2, j2, finderThumbPlayerProxy2 != null ? finderThumbPlayerProxy2.getPlaySpeedRatio() : 1.0f);
            if (o2Var.mo78610g()) {
                setVisibility(4);
                return;
            }
            String fTPPTag2 = getFTPPTag();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[videoView = null] mediaId=");
            C56521b bVar3 = this.f161854J;
            sb4.append(bVar3 != null ? bVar3.f161893b : null);
            Log.m105924i(fTPPTag2, sb4.toString());
            mo79545I(new C59651a2(this));
            mo79576r();
            this.f161884w = null;
        }
    }

    /* renamed from: r */
    public final void mo79576r() {
        mo79545I(new C3914c(this));
    }

    /* renamed from: s */
    public final void mo79577s(String str) {
        mo79545I(new C56522d(this, str));
    }

    public final void setBulletLifecycle(C59869v vVar) {
        this.f161852H = vVar;
    }

    public final void setEnablePlay(boolean z) {
        this.f161860Q = z;
    }

    public final void setEnableShowLoading(boolean z) {
        this.f161868e = z;
    }

    public final void setLongVideo(boolean z) {
        this.f161886y = z;
    }

    public final void setLongVideoSeekBar(FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar) {
        this.f161856L = finderLongVideoPlayerSeekBar;
    }

    public final void setLoop(boolean z) {
        this.f161887z = z;
    }

    public final void setMute(boolean z) {
        this.f161849E = z;
    }

    public final void setPlayAdapterPosition(int i) {
        this.f161859P = i;
    }

    public final void setPlayInfo(C56521b bVar) {
        this.f161854J = bVar;
    }

    public final void setPreRenderFirstFrame(boolean z) {
        this.f161850F = z;
    }

    public final void setReuseSamePlayer(boolean z) {
        this.f161845A = z;
    }

    public final void setSeekBarLayout(C59667n2 n2Var) {
        this.f161855K = n2Var;
    }

    public final void setSelectedToPlay(boolean z) {
        this.f161872i = z;
    }

    public final void setThumbShowCallback(C32227p<? super Boolean, ? super C56521b, C13598b0> pVar) {
        this.f161858N = pVar;
    }

    public final void setVideoCore(FinderVideoCore finderVideoCore) {
        C87412m.m108594g(finderVideoCore, "<set-?>");
        this.f161885x = finderVideoCore;
    }

    public final void setVideoPauseCallback(C32227p<? super Boolean, ? super C56521b, C13598b0> pVar) {
        this.f161857M = pVar;
    }

    public final void setVideoView(C59670o2 o2Var) {
        this.f161884w = o2Var;
    }

    /* renamed from: t */
    public final C62367r0 mo79595t(long j, String str, C64689rq2 rq22) {
        C62367r0 a = C55041a.f154526a.mo76098a(j, rq22, false);
        String fTPPTag = getFTPPTag();
        Log.m105924i(fTPPTag, "[findBestVideo] feedId=" + C61926c.m72691p(j) + " mediaId=" + str + " videoFlag=" + a.mo87422g());
        return a;
    }

    /* renamed from: v */
    public final void mo79596v(C62367r0 r0Var, FeedData feedData, String str) {
        String str2;
        String valueOf = String.valueOf(hashCode());
        int position = feedData.getPosition();
        C64689rq2 rq22 = r0Var.f177253e;
        if (rq22 == null || (str2 = rq22.f185275p) == null) {
            str2 = "";
        }
        String p = C61926c.m72691p(feedData.getFeedId());
        String description = feedData.getDescription();
        String nickName = feedData.getNickName();
        StringBuilder sb = new StringBuilder();
        sb.append("FVLT.");
        sb.append(position);
        sb.append('.');
        C58764p0 p0Var = C58764p0.f168246a;
        sb.append(p0Var.mo83800a(description));
        sb.append('.');
        C87412m.m108594g(valueOf, "hashCode");
        sb.append(p0Var.mo83801b(valueOf, 0, 4));
        String sb4 = sb.toString();
        this.f161867d = sb4;
        Log.m105924i(sb4, "initFTPPTag from " + str + " pos:" + position + " mediaId:" + str2 + " feedId:" + p + " nickName:" + nickName + " description:" + description + " finderVideoLayoutHashCode:" + valueOf);
    }

    /* renamed from: w */
    public final void mo79597w(FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar) {
        C87412m.m108594g(finderLongVideoPlayerSeekBar, "seekBar");
        int i = 0;
        finderLongVideoPlayerSeekBar.setVisibility(0);
        finderLongVideoPlayerSeekBar.setPlayBtnOnClickListener(new C3915e(finderLongVideoPlayerSeekBar, this));
        C59670o2 o2Var = this.f161884w;
        if (o2Var != null) {
            i = o2Var.getVideoDuration();
        }
        finderLongVideoPlayerSeekBar.setVideoTotalTime(i);
        finderLongVideoPlayerSeekBar.setIsPlay(true);
        finderLongVideoPlayerSeekBar.setIplaySeekCallback(new C3916f(finderLongVideoPlayerSeekBar, this));
        setOnTouchListener(new C8419p0(this, finderLongVideoPlayerSeekBar));
    }

    /* renamed from: x */
    public final boolean mo79598x() {
        C56521b bVar = this.f161854J;
        return bVar != null && bVar.f161899h;
    }

    /* renamed from: y */
    public final boolean mo79599y() {
        C59670o2 o2Var = this.f161884w;
        if (o2Var != null) {
            return o2Var.isPlaying();
        }
        return false;
    }

    /* renamed from: z */
    public void mo79600z(boolean z, boolean z2) {
        FeedData feedData;
        FeedData feedData2;
        FeedData feedData3;
        FeedData feedData4;
        C58259c.C58261b videoPlayBehavior;
        String fTPPTag = getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("onEnterSeekMode isEnter=");
        sb.append(z);
        sb.append(" mediaId=");
        C56521b bVar = this.f161854J;
        Float f = null;
        sb.append(bVar != null ? bVar.f161893b : null);
        sb.append(" isPaused:");
        Context context = getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        sb.append(((MMActivity) context).isPaused());
        sb.append(" isSelectedToPlay:");
        sb.append(this.f161872i);
        Log.m105924i(fTPPTag, sb.toString());
        C56521b bVar2 = this.f161854J;
        if (bVar2 != null) {
            bVar2.f161899h = z;
        }
        long j = 0;
        boolean z3 = true;
        if (z) {
            if (!(bVar2 == null || (videoPlayBehavior = getVideoPlayBehavior()) == null)) {
                long expectId = bVar2.f161892a.getExpectId();
                C62367r0 r0Var = bVar2.f161894c;
                videoPlayBehavior.mo83035t(expectId, r0Var.f177253e, r0Var);
            }
            mo79546K(z2);
            C59670o2 o2Var = this.f161884w;
            FinderThumbPlayerProxy finderThumbPlayerProxy = o2Var instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) o2Var : null;
            if (finderThumbPlayerProxy != null) {
                finderThumbPlayerProxy.setEnterSeekMode(true);
            }
            C59670o2 o2Var2 = this.f161884w;
            if (o2Var2 != null) {
                o2Var2.pause();
            }
            C62168u uVar = this.f161869f;
            C56521b bVar3 = this.f161854J;
            if (!(bVar3 == null || (feedData4 = bVar3.f161892a) == null)) {
                j = feedData4.getId();
            }
            C62168u.C11757b e3 = uVar.mo87221e3(j);
            if (e3 != null) {
                e3.f34423g = true;
            }
        } else {
            C59670o2 o2Var3 = this.f161884w;
            FinderThumbPlayerProxy finderThumbPlayerProxy2 = o2Var3 instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) o2Var3 : null;
            boolean z4 = false;
            if (finderThumbPlayerProxy2 != null) {
                finderThumbPlayerProxy2.setEnterSeekMode(false);
            }
            mo79546K(false);
            C59670o2 o2Var4 = this.f161884w;
            if (o2Var4 != null) {
                Context context2 = getContext();
                C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                boolean z5 = !((MMActivity) context2).isPaused() && this.f161872i;
                if (getContext() instanceof FinderHomeUI) {
                    if (z5) {
                        C39818r rVar = C39818r.f106831a;
                        Context context3 = getContext();
                        C87412m.m108593f(context3, "context");
                        if (((FinderHomeUIC) rVar.mo62443b(context3).mo75002a(FinderHomeUIC.class)).getActiveFragment().f17334o == this.f161851G) {
                            z5 = true;
                        }
                    }
                    z5 = false;
                }
                o2Var4.setVideoViewFocused(z5);
                C56521b bVar4 = this.f161854J;
                if (this.f161869f.mo87223g3((bVar4 == null || (feedData3 = bVar4.f161892a) == null) ? 0 : feedData3.getFeedId(), this.f161851G) != null) {
                    m65078D(this, 0, (C12931a) null, 3, (Object) null);
                    C62168u uVar2 = this.f161869f;
                    C56521b bVar5 = this.f161854J;
                    if (!(bVar5 == null || (feedData2 = bVar5.f161892a) == null)) {
                        j = feedData2.getId();
                    }
                    C62168u.C11757b e35 = uVar2.mo87221e3(j);
                    if (e35 != null) {
                        e35.f34423g = false;
                    }
                    if (this.f161849E || getVideoCore().f161836v) {
                        z4 = true;
                    }
                    if (!z4) {
                        z3 = getVideoCore().mo79534B1();
                    }
                    o2Var4.setMute(z3);
                } else {
                    o2Var4.play();
                    C62168u uVar3 = this.f161869f;
                    C56521b bVar6 = this.f161854J;
                    if (!(bVar6 == null || (feedData = bVar6.f161892a) == null)) {
                        j = feedData.getId();
                    }
                    C62168u.C11757b e36 = uVar3.mo87221e3(j);
                    if (e36 != null) {
                        e36.f34423g = false;
                    }
                }
            }
        }
        if (!z) {
            C62168u uVar4 = this.f161869f;
            uVar4.getClass();
            Log.m105924i("Finder.VideoStateCacheVM", "[clearSeekState]");
            uVar4.f176746e = null;
        }
        String fTPPTag2 = getFTPPTag();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("[onEnterSeekMode] isEnter=");
        sb4.append(z);
        sb4.append(" alpha=");
        C59670o2 o2Var5 = this.f161884w;
        if (o2Var5 != null) {
            f = Float.valueOf(o2Var5.getAlpha());
        }
        sb4.append(f);
        sb4.append(" mediaId=");
        C56521b bVar7 = this.f161854J;
        C87412m.m108591d(bVar7);
        sb4.append(bVar7.f161893b);
        Log.m105924i(fTPPTag2, sb4.toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderVideoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setTag("Finder.VideoLayout");
        setId(C0966R.C0970id.d7a);
        setImportantForAccessibility(2);
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62168u.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…StateCacheVM::class.java)");
        this.f161869f = (C62168u) a;
        this.f161870g = C36568h.m40985a(new C8424r1(this));
        this.f161873j = C36568h.m40985a(C8398h1.f27390d);
        this.f161874n = C36568h.m40985a(C8413m1.f27410d);
        this.f161875o = C36568h.m40985a(C8411l1.f27408d);
        this.f161876p = C36568h.m40985a(C8401i1.f27393d);
        this.f161878q = C36568h.m40985a(C8409k1.f27406d);
        this.f161879r = C36568h.m40985a(C8404j1.f27396d);
        this.f161880s = C36568h.m40985a(C8385d2.f27376d);
        this.f161881t = new C59676t1(this);
        this.f161882u = C36568h.m40985a(new C8426s1(this));
        this.f161883v = C36568h.m40985a(new C8382c2(this));
        this.f161887z = true;
        this.f161846B = new LinkedList<>();
        this.f161847C = C36568h.m40985a(new C59683w1(this));
        this.f161848D = C36568h.m40985a(new C8389e2(this));
        this.f161853I = new C59672q1(this);
        this.f161860Q = true;
        this.f161861R = C36568h.m40985a(new C8380b2(this));
        this.f161863T = -1.0f;
        this.f161864U = -1;
        this.f161866W = 1;
        this.f161877p0 = 1.0f;
    }
}
