package com.tencent.p014mm.plugin.finder.convert;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Html;
import android.text.SpannableString;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.FocusMeteringAction;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54219z;
import androidx.recyclerview.widget.RecyclerView;
import as1.C0201a;
import bd1.C54446b;
import bl3.C39818r;
import cm1.C0773s0;
import cm1.C55018j0;
import cm1.C55033u;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedContactChangeEvent;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.FlowTextMixView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView;
import com.tencent.p014mm.plugin.finder.feed.FinderRingtoneTimelineContract$Presenter$buildItemCoverts$1;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.plugin.finder.feed.RoundLinearLayout;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderMsgFeedDetailUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedDetailUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.playlist.FinderPlayListDrawer;
import com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract;
import com.tencent.p014mm.plugin.finder.search.data.SearchHotWordListParcelable;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.view.C4105m5;
import com.tencent.p014mm.plugin.finder.view.C4167r7;
import com.tencent.p014mm.plugin.finder.view.C56597e1;
import com.tencent.p014mm.plugin.finder.view.EllipsizedTextView;
import com.tencent.p014mm.plugin.finder.view.FadeOutLinearLayout;
import com.tencent.p014mm.plugin.finder.view.FinderAuthorAreaLayout;
import com.tencent.p014mm.plugin.finder.view.FinderBaseMediaBanner;
import com.tencent.p014mm.plugin.finder.view.FinderCommentDrawer;
import com.tencent.p014mm.plugin.finder.view.FinderHotCommentLayout;
import com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer;
import com.tencent.p014mm.plugin.finder.view.FinderMediaLayout;
import com.tencent.p014mm.plugin.finder.view.FinderPostProgressView;
import com.tencent.p014mm.plugin.finder.view.SimpleTouchableLayout;
import com.tencent.p014mm.plugin.finder.view.drawer.FinderDraggableLayout;
import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderLikeGuideUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.view.HardTouchableLayout;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import da0.C58247e;
import da0.C7256b;
import de1.C7290r;
import de3.C107029o;
import de3.C75355a0;
import de3.C75359b0;
import df1.C58259c;
import df1.C7322a;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import dp1.C7433e1;
import dp1.C7435f2;
import dp1.C7446m0;
import ds1.C7515a;
import eb0.C31543z5;
import eb0.C75592q0;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C7637b;
import ef1.C7642k;
import ef1.C7644m;
import er1.C58684b;
import er1.C58739j4;
import er1.C58784w3;
import er1.C7793e0;
import er1.C7797f0;
import er1.C7801g0;
import er1.C7865r3;
import er1.C7878t0;
import er1.C7888v2;
import er1.C7919x;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import ff1.C58987d;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32229r;
import go1.C8366a;
import go1.C8368c;
import gr1.C59670o2;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hi3.C87515a;
import hr1.C8730k;
import ht1.C60172g4;
import ht1.C60200t1;
import ht1.C60206u1;
import ht1.C8777j5;
import ht1.C8808v4;
import ht1.C8817y2;
import iq1.C60592c;
import iq1.C60593d;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jm2.C117361f;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import ke3.C88144b;
import kf1.C10008v1;
import kg3.C76577a;
import kotlin.Metadata;
import ky2.C10432i;
import l31.C61212e;
import l60.C99344b;
import mf1.C10786a1;
import mf1.C10846o0;
import mf1.C10862r0;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import o40.C61926c;
import od3.C62001a;
import org.json.JSONObject;
import os1.C62168u;
import p196ln.C76705f;
import p629ny.C76979h;
import p640ox.C77049b;
import p749xh.C66261f3;
import pe1.C35464c;
import pe3.C89349b;
import pf1.C11911l;
import pf1.C11917o0;
import pf1.C11920q;
import pf1.C11922r;
import pf1.C11931z;
import pf1.C62273n;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import pl1.C62345f;
import q31.C118148a;
import qo3.C101218e0;
import qo3.C77407n;
import r60.C101350i;
import rf1.C12982a;
import rf1.C12991c;
import rs1.C13132c0;
import rs1.C13133c1;
import rs1.C13140c8;
import rs1.C13175d0;
import rs1.C13194da;
import rs1.C13209e0;
import rs1.C13211e2;
import rs1.C13226f0;
import rs1.C13239g0;
import rs1.C13255h0;
import rs1.C13256h1;
import rs1.C13269i2;
import rs1.C13282j2;
import rs1.C13307ka;
import rs1.C13323la;
import rs1.C13325m0;
import rs1.C13334ma;
import rs1.C13335n0;
import rs1.C13345o3;
import rs1.C13442s8;
import rs1.C13452t2;
import rs1.C13470u2;
import rs1.C13480ua;
import rs1.C13490v9;
import rs1.C13549y7;
import rs1.C13554z;
import rs1.C13559z0;
import rs1.C63513a1;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C64175a0;
import sx3.C64197v;
import sx3.C90363p0;
import sx3.C90364q0;
import t60.C64207e;
import tc2.C118418g;
import te3.C48727ak1;
import te3.C48996cf1;
import te3.C49426fi1;
import te3.C49712hj1;
import te3.C49730ho;
import te3.C49839if1;
import te3.C50124kf1;
import te3.C50394mf1;
import te3.C50425mn1;
import te3.C50673of1;
import te3.C50687oi1;
import te3.C50972qk0;
import te3.C51108rh0;
import te3.C51384te1;
import te3.C51542ug1;
import te3.C64237ap1;
import te3.C64284cg;
import te3.C64291co3;
import te3.C64689rq2;
import te3.uc4;
import te3.yq4;
import tr1.C14062a;
import tr1.C14063b;
import up1.C27696y;
import up1.C37521f;
import up1.C65426w0;
import ve1.C14534h1;
import ve1.C14540i1;
import ve1.C14546j1;
import ve1.C14555k1;
import ve1.C14567m3;
import ve1.C14583o1;
import ve1.C14591p1;
import ve1.C14617r1;
import ve1.C14644u1;
import ve1.C65636q1;
import vp1.C65834e;
import vq1.C65854g;
import vq1.C65866w;
import wp1.C15585f;
import wp1.C15587j;
import x60.C102564a;
import z04.C112551y;
import zc1.C66783a;
import zc1.C66785b;
import zn1.C16336r;
import zp3.C23564m;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert */
public abstract class FinderFeedFullConvert<T extends BaseFinderFeed> extends C60896i<T> {

    /* renamed from: K */
    public static final C2325b f12553K = new C2325b((C8480h) null);

    /* renamed from: A */
    public RecyclerView f12554A;

    /* renamed from: B */
    public final int f12555B;

    /* renamed from: C */
    public boolean f12556C;

    /* renamed from: D */
    public Rect f12557D;

    /* renamed from: E */
    public ValueAnimator f12558E;

    /* renamed from: F */
    public final boolean f12559F;

    /* renamed from: G */
    public final boolean f12560G;

    /* renamed from: H */
    public final FinderFeedFullConvert$uiLifecycleObserver$1 f12561H;

    /* renamed from: I */
    public final List<Integer> f12562I;

    /* renamed from: J */
    public final C2372q f12563J;

    /* renamed from: e */
    public final C10008v1 f12564e;

    /* renamed from: f */
    public boolean f12565f;

    /* renamed from: g */
    public final int f12566g;

    /* renamed from: h */
    public final boolean f12567h;

    /* renamed from: i */
    public long f12568i = -1;

    /* renamed from: j */
    public long f12569j = -1;

    /* renamed from: n */
    public int f12570n;

    /* renamed from: o */
    public final HashSet<StateListener<T>> f12571o = new HashSet<>();

    /* renamed from: p */
    public final C13601g f12572p = C36568h.m40985a(C2346i.f12649d);

    /* renamed from: q */
    public final C13601g f12573q = C36568h.m40985a(C2375r.f12716d);

    /* renamed from: r */
    public final C13601g f12574r;

    /* renamed from: s */
    public final C13601g f12575s;

    /* renamed from: t */
    public final C13601g f12576t;

    /* renamed from: u */
    public final C13601g f12577u;

    /* renamed from: v */
    public final C13601g f12578v;

    /* renamed from: w */
    public final C13601g f12579w;

    /* renamed from: x */
    public final C13601g f12580x;

    /* renamed from: y */
    public C60905o f12581y;

    /* renamed from: z */
    public View f12582z;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$StateListener;", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "T", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedContactChangeEvent;", "Lcom/tencent/mm/plugin/finder/convert/FinderFeedFullConvert;", "parent", "Ljq3/o;", "holder", "<init>", "(Lcom/tencent/mm/plugin/finder/convert/FinderFeedFullConvert;Ljq3/o;)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener */
    public static final class StateListener<T extends BaseFinderFeed> extends IListener<FeedContactChangeEvent> {

        /* renamed from: d */
        public final FinderFeedFullConvert<T> f12583d;

        /* renamed from: e */
        public final C60905o f12584e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public StateListener(com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert<T> r3, jq3.C60905o r4) {
            /*
                r2 = this;
                java.lang.String r0 = "parent"
                gy3.C87412m.m108594g(r3, r0)
                java.lang.String r0 = "holder"
                gy3.C87412m.m108594g(r4, r0)
                android.content.Context r0 = r4.f173499A
                java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
                gy3.C87412m.m108592e(r0, r1)
                com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
                r2.<init>(r0)
                r2.f12583d = r3
                r2.f12584e = r4
                android.content.Context r4 = r4.f173499A
                boolean r0 = r4 instanceof com.tencent.p014mm.p136ui.MMActivity
                if (r0 == 0) goto L_0x002e
                gy3.C87412m.m108592e(r4, r1)
                com.tencent.mm.ui.MMActivity r4 = (com.tencent.p014mm.p136ui.MMActivity) r4
                androidx.lifecycle.j r4 = r4.getLifecycle()
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$uiLifecycleObserver$1 r3 = r3.f12561H
                r4.addObserver(r3)
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.StateListener.<init>(com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert, jq3.o):void");
        }

        public boolean callback(IEvent iEvent) {
            FeedContactChangeEvent feedContactChangeEvent = (FeedContactChangeEvent) iEvent;
            C87412m.m108594g(feedContactChangeEvent, "event");
            C61926c.m72668M(new C2418a(this, feedContactChangeEvent));
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$a */
    public static final class C2319a extends C58555d {

        /* renamed from: g */
        public final MMHandler f12585g = new MMHandler(Looper.getMainLooper());

        /* renamed from: h */
        public long f12586h;

        /* renamed from: i */
        public int f12587i = -1;

        /* renamed from: j */
        public final /* synthetic */ FinderFeedFullConvert<T> f12588j;

        /* renamed from: n */
        public final /* synthetic */ AppCompatActivity f12589n;

        /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$a$a */
        public static final class C2320a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FinderFeedFullConvert<T> f12590d;

            /* renamed from: e */
            public final /* synthetic */ C60905o f12591e;

            public C2320a(FinderFeedFullConvert<T> finderFeedFullConvert, C60905o oVar, C2319a aVar) {
                this.f12590d = finderFeedFullConvert;
                this.f12591e = oVar;
            }

            public final void run() {
                FinderHomeTabFragment finderHomeTabFragment;
                Class cls = C13140c8.class;
                this.f12590d.mo2285V(this.f12591e);
                C10008v1 v1Var = this.f12590d.f12564e;
                C13598b0 b0Var = null;
                FinderTimelinePresenter finderTimelinePresenter = v1Var instanceof FinderTimelinePresenter ? (FinderTimelinePresenter) v1Var : null;
                if (!(finderTimelinePresenter == null || (finderHomeTabFragment = finderTimelinePresenter.f13267h) == null)) {
                    C60905o oVar = this.f12591e;
                    C13140c8 c8Var = (C13140c8) C39818r.f106831a.mo62445d(finderHomeTabFragment).mo62449e(cls);
                    if (c8Var != null) {
                        C87412m.m108594g(oVar, "holder");
                        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) oVar.f173503E;
                        if (baseFinderFeed != null) {
                            c8Var.mo12638c3(baseFinderFeed);
                        }
                        b0Var = C13598b0.f38549a;
                    }
                    if (b0Var != null) {
                        return;
                    }
                }
                C60905o oVar2 = this.f12591e;
                C39818r rVar = C39818r.f106831a;
                Context context = oVar2.f173499A;
                C87412m.m108593f(context, "holder.context");
                C13140c8 c8Var2 = (C13140c8) rVar.mo62443b(context).mo62449e(cls);
                if (c8Var2 != null) {
                    BaseFinderFeed baseFinderFeed2 = (BaseFinderFeed) oVar2.f173503E;
                    if (baseFinderFeed2 != null) {
                        c8Var2.mo12638c3(baseFinderFeed2);
                    }
                    C13598b0 b0Var2 = C13598b0.f38549a;
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$a$b */
        public static final class C2321b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FinderFeedFullConvert<T> f12592d;

            /* renamed from: e */
            public final /* synthetic */ C60905o f12593e;

            public C2321b(FinderFeedFullConvert<T> finderFeedFullConvert, C60905o oVar) {
                this.f12592d = finderFeedFullConvert;
                this.f12593e = oVar;
            }

            public final void run() {
                FinderFeedFullConvert<T> finderFeedFullConvert = this.f12592d;
                C60905o oVar = this.f12593e;
                finderFeedFullConvert.mo2274N(oVar, oVar.mo17363j(), this.f12593e.f44859i, 2);
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$a$c */
        public static final class C2322c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FinderFeedFullConvert<T> f12594d;

            /* renamed from: e */
            public final /* synthetic */ C60905o f12595e;

            public C2322c(FinderFeedFullConvert<T> finderFeedFullConvert, C60905o oVar) {
                this.f12594d = finderFeedFullConvert;
                this.f12595e = oVar;
            }

            public final void run() {
                FinderFeedFullConvert<T> finderFeedFullConvert = this.f12594d;
                C60905o oVar = this.f12595e;
                Object obj = oVar.f173503E;
                C87412m.m108593f(obj, "holder.getAssociatedObject()");
                finderFeedFullConvert.mo2315r(oVar, (BaseFinderFeed) obj);
            }
        }

        public C2319a(FinderFeedFullConvert<T> finderFeedFullConvert, AppCompatActivity appCompatActivity) {
            this.f12588j = finderFeedFullConvert;
            this.f12589n = appCompatActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:131:0x0316, code lost:
            r10 = java.lang.Integer.valueOf(r2.mo17363j());
         */
        /* renamed from: B1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2331B1(ef1.C7637b r25) {
            /*
                r24 = this;
                r0 = r24
                r1 = r25
                java.lang.Class<mf1.a1> r2 = mf1.C10786a1.class
                java.lang.String r3 = "ev"
                gy3.C87412m.m108594g(r1, r3)
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r3 = r0.f12588j
                androidx.recyclerview.widget.RecyclerView r3 = r3.f12554A
                r4 = 0
                if (r3 == 0) goto L_0x0017
                androidx.recyclerview.widget.RecyclerView$e r3 = r3.getAdapter()
                goto L_0x0018
            L_0x0017:
                r3 = r4
            L_0x0018:
                boolean r5 = r3 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
                if (r5 == 0) goto L_0x001f
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r3 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r3
                goto L_0x0020
            L_0x001f:
                r3 = r4
            L_0x0020:
                if (r3 != 0) goto L_0x0023
                return
            L_0x0023:
                boolean r11 = r1 instanceof df1.C58259c.C58260a
                java.lang.String r12 = "holder.context"
                r13 = 1000(0x3e8, float:1.401E-42)
                if (r11 == 0) goto L_0x0091
                r14 = r1
                df1.c$a r14 = (df1.C58259c.C58260a) r14
                int r5 = r14.f166811b
                r6 = 24
                if (r5 == r6) goto L_0x005e
                long r6 = r14.f166817h
                r8 = 0
                r9 = 2
                r10 = 0
                r5 = r3
                androidx.recyclerview.widget.RecyclerView$z r5 = jq3.C60898l.m71330b6(r5, r6, r8, r9, r10)
                jq3.o r5 = (jq3.C60905o) r5
                if (r5 == 0) goto L_0x0091
                bl3.r r6 = bl3.C39818r.f106831a
                android.content.Context r7 = r5.f173499A
                gy3.C87412m.m108593f(r7, r12)
                bl3.r$a r6 = r6.mo62443b(r7)
                bl3.t r6 = r6.mo62449e(r2)
                mf1.a1 r6 = (mf1.C10786a1) r6
                if (r6 == 0) goto L_0x0091
                mf1.w0 r7 = new mf1.w0
                r7.<init>(r5, r14)
                r6.mo11061f3(r5, r7)
                goto L_0x0091
            L_0x005e:
                int r5 = r14.f166815f
                int r15 = r5 / 1000
                int r5 = r0.f12587i
                if (r15 == r5) goto L_0x0091
                long r6 = r14.f166817h
                r8 = 0
                r9 = 2
                r10 = 0
                r5 = r3
                androidx.recyclerview.widget.RecyclerView$z r5 = jq3.C60898l.m71330b6(r5, r6, r8, r9, r10)
                jq3.o r5 = (jq3.C60905o) r5
                if (r5 == 0) goto L_0x0091
                bl3.r r6 = bl3.C39818r.f106831a
                android.content.Context r7 = r5.f173499A
                gy3.C87412m.m108593f(r7, r12)
                bl3.r$a r6 = r6.mo62443b(r7)
                bl3.t r6 = r6.mo62449e(r2)
                mf1.a1 r6 = (mf1.C10786a1) r6
                if (r6 == 0) goto L_0x008f
                mf1.y0 r7 = new mf1.y0
                r7.<init>(r6, r15)
                r6.mo11061f3(r5, r7)
            L_0x008f:
                r0.f12587i = r15
            L_0x0091:
                r14 = 2
                r15 = 0
                if (r11 == 0) goto L_0x00bd
                r5 = r1
                df1.c$a r5 = (df1.C58259c.C58260a) r5
                int r6 = r5.f166811b
                if (r6 != r14) goto L_0x00bd
                long r6 = r5.f166817h
                r8 = 0
                r9 = 2
                r10 = 0
                r5 = r3
                androidx.recyclerview.widget.RecyclerView$z r1 = jq3.C60898l.m71330b6(r5, r6, r8, r9, r10)
                jq3.o r1 = (jq3.C60905o) r1
                if (r1 == 0) goto L_0x06d8
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r2 = r0.f12588j
                java.lang.Object r3 = r1.f173503E
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r3
                if (r3 == 0) goto L_0x06d8
                int r3 = r1.mo17363j()
                int r4 = r1.f44859i
                r2.mo2274N(r1, r3, r4, r15)
                goto L_0x06d8
            L_0x00bd:
                java.lang.String r10 = "Finder.FeedFullConvert"
                r9 = 3
                r8 = 1
                if (r11 == 0) goto L_0x01b6
                r6 = r1
                df1.c$a r6 = (df1.C58259c.C58260a) r6
                int r5 = r6.f166811b
                if (r5 != r9) goto L_0x01b6
                long r1 = r6.f166817h
                r4 = 0
                r9 = 2
                r11 = 0
                r5 = r3
                r3 = r6
                r6 = r1
                r1 = 1
                r8 = r4
                r2 = r10
                r10 = r11
                androidx.recyclerview.widget.RecyclerView$z r4 = jq3.C60898l.m71330b6(r5, r6, r8, r9, r10)
                jq3.o r4 = (jq3.C60905o) r4
                int r5 = r3.f166816g
                up1.f r6 = up1.C37521f.f99374d
                int r7 = r6.mo61151E()
                java.lang.String r8 = ", feedId="
                if (r5 <= r7) goto L_0x0175
                int r5 = r3.f166815f
                int r7 = r6.mo61151E()
                int r7 = r7 / r14
                if (r5 < r7) goto L_0x0175
                if (r4 == 0) goto L_0x0175
                java.lang.Object r5 = r4.f173503E
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
                if (r5 == 0) goto L_0x0175
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r7 = r0.f12588j
                int r9 = r3.f166815f
                int r6 = r6.mo61151E()
                java.lang.String r10 = ", offset = "
                if (r9 < r6) goto L_0x013e
                boolean r6 = r5.mo3472F()
                if (r6 != 0) goto L_0x013e
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r9 = "onEventHappen: VIDEO_PROGRESS mega video total = "
                r6.append(r9)
                int r9 = r3.f166816g
                r6.append(r9)
                r6.append(r10)
                int r9 = r3.f166815f
                r6.append(r9)
                r6.append(r8)
                long r11 = r3.f166817h
                java.lang.String r9 = o40.C61926c.m72691p(r11)
                r6.append(r9)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
                int r6 = r4.mo17363j()
                int r9 = r4.f44859i
                r7.mo2274N(r4, r6, r9, r1)
            L_0x013e:
                boolean r1 = r5.mo3475I()
                if (r1 != 0) goto L_0x0175
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r5 = "onEventHappen: VIDEO_PROGRESS half enjoy mega video total = "
                r1.append(r5)
                int r5 = r3.f166816g
                r1.append(r5)
                r1.append(r10)
                int r5 = r3.f166815f
                r1.append(r5)
                r1.append(r8)
                long r5 = r3.f166817h
                java.lang.String r5 = o40.C61926c.m72691p(r5)
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                int r1 = r4.mo17363j()
                r7.mo2278P(r4, r1)
            L_0x0175:
                int r1 = r3.f166815f
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r5 = r0.f12588j
                int r5 = r5.mo2248A()
                if (r1 < r5) goto L_0x06d8
                if (r4 == 0) goto L_0x06d8
                java.lang.Object r1 = r4.f173503E
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r1
                if (r1 == 0) goto L_0x06d8
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r5 = r0.f12588j
                boolean r1 = r1.mo3516q()
                if (r1 != 0) goto L_0x06d8
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r6 = "onEventHappen: VIDEO_PROGRESS ten sec enjoy offset = "
                r1.append(r6)
                int r6 = r3.f166815f
                r1.append(r6)
                r1.append(r8)
                long r6 = r3.f166817h
                java.lang.String r3 = o40.C61926c.m72691p(r6)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                r5.mo2285V(r4)
                goto L_0x06d8
            L_0x01b6:
                if (r11 == 0) goto L_0x01c6
                r5 = r1
                df1.c$a r5 = (df1.C58259c.C58260a) r5
                int r6 = r5.f166811b
                if (r6 != r8) goto L_0x01c6
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r1 = r0.f12588j
                r1.mo2288Y(r5)
                goto L_0x06d8
            L_0x01c6:
                if (r11 == 0) goto L_0x01d8
                r5 = r1
                df1.c$a r5 = (df1.C58259c.C58260a) r5
                int r6 = r5.f166811b
                r7 = 11
                if (r6 != r7) goto L_0x01d8
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r1 = r0.f12588j
                r1.mo2287X(r5)
                goto L_0x06d8
            L_0x01d8:
                boolean r5 = r1 instanceof ef1.C7642k
                r16 = 1000(0x3e8, double:4.94E-321)
                if (r5 == 0) goto L_0x0598
                ef1.k r1 = (ef1.C7642k) r1
                long r6 = r1.f25958i
                r11 = 0
                r20 = 2
                r21 = 0
                r5 = r3
                r13 = 1
                r8 = r11
                r11 = 3
                r9 = r20
                r23 = r10
                r10 = r21
                androidx.recyclerview.widget.RecyclerView$z r5 = jq3.C60898l.m71330b6(r5, r6, r8, r9, r10)
                jq3.o r5 = (jq3.C60905o) r5
                r6 = 6
                if (r5 == 0) goto L_0x0298
                bl3.r r7 = bl3.C39818r.f106831a
                android.content.Context r8 = r5.f173499A
                gy3.C87412m.m108593f(r8, r12)
                bl3.r$a r7 = r7.mo62443b(r8)
                bl3.t r2 = r7.mo62449e(r2)
                mf1.a1 r2 = (mf1.C10786a1) r2
                if (r2 == 0) goto L_0x0298
                int r7 = r1.f25951b
                if (r7 == 0) goto L_0x0222
                if (r7 == r13) goto L_0x0222
                if (r7 == r14) goto L_0x0222
                if (r7 == r11) goto L_0x0222
                r8 = 5
                if (r7 == r8) goto L_0x0222
                if (r7 == r6) goto L_0x0222
                r8 = 8
                if (r7 == r8) goto L_0x0222
                goto L_0x0298
            L_0x0222:
                java.lang.Object r8 = r5.f173503E
                boolean r9 = r8 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r9 == 0) goto L_0x022b
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r8
                goto L_0x022c
            L_0x022b:
                r8 = r4
            L_0x022c:
                if (r8 != 0) goto L_0x022f
                goto L_0x0298
            L_0x022f:
                long r9 = r8.getItemId()
                er1.w3 r12 = er1.C58784w3.f168295a
                com.tencent.mm.plugin.finder.storage.FinderItem r19 = r8.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r14 = r19.getFeedObject()
                boolean r12 = r12.mo83872H0(r14)
                if (r12 == 0) goto L_0x026f
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r14 = "onFeedScrollEvent type="
                r12.append(r14)
                r12.append(r7)
                java.lang.String r7 = " feedId="
                r12.append(r7)
                long r7 = r8.getItemId()
                r12.append(r7)
                java.lang.String r7 = " lastCenterFeedId="
                r12.append(r7)
                long r7 = r2.f32263x
                r12.append(r7)
                java.lang.String r7 = r12.toString()
                java.lang.String r8 = "Finder.BaseAdFeedJumperUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            L_0x026f:
                long r7 = r2.f32263x
                int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r12 == 0) goto L_0x0298
                jq3.o r7 = r2.f32264y
                if (r7 == 0) goto L_0x028c
                r2.mo11023M3(r13, r13)
                com.tencent.mm.sdk.platformtools.MMHandler r8 = r2.f32391e
                r8.removeCallbacksAndMessages(r4)
                mf1.v0 r8 = new mf1.v0
                r8.<init>(r7)
                r2.mo11061f3(r7, r8)
                r2.mo11060L3(r7)
            L_0x028c:
                r2.f32263x = r9
                r2.f32264y = r5
                mf1.u0 r7 = new mf1.u0
                r7.<init>(r5, r2)
                r2.mo11061f3(r5, r7)
            L_0x0298:
                int r2 = r1.f25951b
                if (r2 != r6) goto L_0x04e5
                long r6 = r1.f25958i
                r8 = 0
                r9 = 2
                r10 = 0
                r5 = r3
                androidx.recyclerview.widget.RecyclerView$z r2 = jq3.C60898l.m71330b6(r5, r6, r8, r9, r10)
                jq3.o r2 = (jq3.C60905o) r2
                if (r2 == 0) goto L_0x03ed
                androidx.appcompat.app.AppCompatActivity r5 = r0.f12589n
                rs1.w6$a r6 = rs1.C13502w6.f38267r
                rs1.w6 r5 = r6.mo12927a(r5)
                if (r5 == 0) goto L_0x03ed
                long r6 = r0.f12586h
                long r8 = r1.f25958i
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 == 0) goto L_0x02be
                r8 = 1
                goto L_0x02bf
            L_0x02be:
                r8 = 0
            L_0x02bf:
                java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
                r6.<init>(r2)
                r5.f38272d = r6
                bl3.r r6 = bl3.C39818r.f106831a
                android.app.Activity r7 = r5.getContext()
                bl3.r$a r6 = r6.mo62443b(r7)
                java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC> r7 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC.class
                bl3.t r6 = r6.mo62449e(r7)
                com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r6 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC) r6
                if (r6 == 0) goto L_0x02df
                int r6 = r6.mo5128d3()
                goto L_0x02e0
            L_0x02df:
                r6 = -1
            L_0x02e0:
                java.lang.String r7 = "Finder.FinderNpsSurveyUIC"
                if (r6 != r11) goto L_0x02ef
                boolean r9 = r5.f38277i
                if (r9 != 0) goto L_0x02ef
                java.lang.String r2 = "onFeedFocused returned because follow disable"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
                goto L_0x03ed
            L_0x02ef:
                if (r6 != r13) goto L_0x02fc
                boolean r9 = r5.f38278j
                if (r9 != 0) goto L_0x02fc
                java.lang.String r2 = "onFeedFocused returned because friend disable"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
                goto L_0x03ed
            L_0x02fc:
                r9 = 4
                if (r6 != r9) goto L_0x030a
                boolean r9 = r5.f38279n
                if (r9 != 0) goto L_0x030a
                java.lang.String r2 = "onFeedFocused returned because machine disable"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
                goto L_0x03ed
            L_0x030a:
                java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r9 = r5.f38280o
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r10 = r9.get(r6)
                if (r10 != 0) goto L_0x0326
                int r10 = r2.mo17363j()
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                java.lang.Object r6 = r9.putIfAbsent(r6, r10)
                if (r6 != 0) goto L_0x0325
                goto L_0x0326
            L_0x0325:
                r10 = r6
            L_0x0326:
                java.lang.Integer r10 = (java.lang.Integer) r10
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r9 = "onFeedFocused enterIndex = "
                r6.append(r9)
                r6.append(r10)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r6)
                java.lang.Object r6 = r2.f173503E
                cm1.i2 r6 = (cm1.C0740i2) r6
                if (r8 == 0) goto L_0x03ed
                long r8 = r6.getItemId()
                r5.f38276h = r8
                java.lang.System.currentTimeMillis()
                int r8 = r2.mo17363j()
                java.lang.String r9 = "enterIndex"
                gy3.C87412m.m108593f(r10, r9)
                int r9 = r10.intValue()
                int r8 = r8 - r9
                r5.f38275g = r8
                com.tencent.mm.sdk.platformtools.MMHandler r8 = r5.f38273e
                r8.removeCallbacksAndMessages(r4)
                java.lang.String r8 = "onFeedFocused removeCallbackAndMessages"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
                com.tencent.mm.sdk.platformtools.MMHandler r8 = r5.f38274f
                r8.removeCallbacksAndMessages(r4)
                r5.f38281p = r15
                r10 = 0
                r5.f38282q = r10
                boolean r8 = r5.mo12926o3(r2)
                if (r8 == 0) goto L_0x03e5
                rs1.w6$b r8 = r5.mo12914U3(r2)
                int r9 = r8.f38285c
                int r9 = r9 + r13
                r8.f38285c = r9
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, rs1.w6$b> r9 = rs1.C13502w6.f38271v
                long r21 = r6.getItemId()
                java.lang.Long r12 = java.lang.Long.valueOf(r21)
                r9.put(r12, r8)
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, te3.re1> r8 = rs1.C13502w6.f38270u
                long r21 = r6.getItemId()
                java.lang.Long r6 = java.lang.Long.valueOf(r21)
                java.lang.Object r6 = r8.get(r6)
                te3.re1 r6 = (te3.C51096re1) r6
                if (r6 == 0) goto L_0x03e5
                up1.f r8 = up1.C37521f.f99374d
                r8.getClass()
                pe1.c<java.lang.Integer> r8 = up1.C37521f.f99514s7
                java.lang.Object r8 = r8.mo60266n()
                java.lang.Number r8 = (java.lang.Number) r8
                int r8 = r8.intValue()
                if (r8 != 0) goto L_0x03ba
                float r6 = r6.f140862p
                r8 = 1000(0x3e8, float:1.401E-42)
                float r8 = (float) r8
                float r6 = r6 * r8
                long r8 = (long) r6
                goto L_0x03bd
            L_0x03ba:
                long r8 = (long) r8
                long r8 = r8 * r16
            L_0x03bd:
                int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r6 <= 0) goto L_0x03e5
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r10 = "showSurveyLayoutWithoutAnimate timerHandler.postDelayed "
                r6.append(r10)
                r6.append(r8)
                java.lang.String r10 = " ms"
                r6.append(r10)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
                com.tencent.mm.sdk.platformtools.MMHandler r6 = r5.f38274f
                rs1.c7 r7 = new rs1.c7
                r7.<init>(r5, r2)
                r6.postDelayed(r7, r8)
            L_0x03e5:
                rs1.k7 r6 = new rs1.k7
                r6.<init>(r5, r2, r13, r15)
                r5.mo12911P3(r2, r6)
            L_0x03ed:
                long r5 = r0.f12586h
                long r7 = r1.f25958i
                int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r2 == 0) goto L_0x0459
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r2 = r0.f12588j
                jq3.o r5 = r2.f12581y
                if (r5 == 0) goto L_0x0404
                int r6 = r5.mo17363j()
                int r7 = r5.f44859i
                r2.mo2286W(r5, r6, r7, r13)
            L_0x0404:
                long r6 = r1.f25958i
                r0.f12586h = r6
                r8 = 0
                r9 = 2
                r10 = 0
                r5 = r3
                androidx.recyclerview.widget.RecyclerView$z r2 = jq3.C60898l.m71330b6(r5, r6, r8, r9, r10)
                jq3.o r2 = (jq3.C60905o) r2
                if (r2 == 0) goto L_0x041c
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r5 = r0.f12588j
                r5.mo2303l(r2)
                r5.mo2276O(r2)
            L_0x041c:
                androidx.appcompat.app.AppCompatActivity r2 = r0.f12589n
                java.lang.String r5 = "context"
                gy3.C87412m.m108594g(r2, r5)
                bl3.r r5 = bl3.C39818r.f106831a
                bl3.r$a r2 = r5.mo62443b(r2)
                java.lang.Class<rs1.z2> r5 = rs1.C13562z2.class
                bl3.t r2 = r2.mo62449e(r5)
                rs1.z2 r2 = (rs1.C13562z2) r2
                if (r2 == 0) goto L_0x0459
                boolean r5 = r2.f38481j
                if (r5 == 0) goto L_0x0459
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r2.f38476f
                if (r5 == 0) goto L_0x0450
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, rs1.z2$a> r6 = r2.f38480i
                long r7 = r5.getItemId()
                java.lang.Long r5 = java.lang.Long.valueOf(r7)
                java.lang.Object r5 = r6.get(r5)
                rs1.z2$a r5 = (rs1.C13562z2.C13563a) r5
                if (r5 == 0) goto L_0x0450
                r5.mo12961b(r15)
            L_0x0450:
                nj3.s0 r5 = r2.f38478h
                if (r5 == 0) goto L_0x0457
                r5.dismiss()
            L_0x0457:
                r2.f38478h = r4
            L_0x0459:
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r0.f12585g
                r2.removeCallbacksAndMessages(r4)
                com.tencent.mm.plugin.finder.storage.FeedData r2 = r1.f25960k
                if (r2 == 0) goto L_0x046a
                int r2 = r2.getMediaType()
                r4 = 2
                if (r2 != r4) goto L_0x046a
                r15 = 1
            L_0x046a:
                if (r15 == 0) goto L_0x06d8
                long r6 = r1.f25958i
                r8 = 0
                r9 = 2
                r10 = 0
                r5 = r3
                androidx.recyclerview.widget.RecyclerView$z r1 = jq3.C60898l.m71330b6(r5, r6, r8, r9, r10)
                jq3.o r1 = (jq3.C60905o) r1
                if (r1 == 0) goto L_0x06d8
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r2 = r0.f12588j
                r3 = 10000(0x2710, double:4.9407E-320)
                int r5 = r2.mo2248A()
                if (r5 < 0) goto L_0x04ba
                int r5 = r2.mo2248A()
                long r5 = (long) r5
                long r5 = r5 * r16
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x04ba
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "onEventHappen: post follow anim, finderShowFollowAnimOffset = "
                r5.append(r6)
                int r6 = r2.mo2248A()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                r11 = r23
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r5)
                com.tencent.mm.sdk.platformtools.MMHandler r5 = r0.f12585g
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$a$a r6 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$a$a
                r6.<init>(r2, r1, r0)
                int r7 = r2.mo2248A()
                long r7 = (long) r7
                long r7 = r7 * r16
                r5.postDelayed(r6, r7)
            L_0x04ba:
                com.tencent.mm.sdk.platformtools.MMHandler r5 = r0.f12585g
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$a$b r6 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$a$b
                r6.<init>(r2, r1)
                r5.postDelayed(r6, r3)
                up1.f r3 = up1.C37521f.f99374d
                r3.getClass()
                pe1.c<java.lang.Integer> r3 = up1.C37521f.f99432j4
                java.lang.Object r3 = r3.mo60266n()
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                if (r3 != r13) goto L_0x06d8
                r3 = 30000(0x7530, double:1.4822E-319)
                com.tencent.mm.sdk.platformtools.MMHandler r5 = r0.f12585g
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$a$c r6 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$a$c
                r6.<init>(r2, r1)
                r5.postDelayed(r6, r3)
                goto L_0x06d8
            L_0x04e5:
                r11 = r23
                r4 = 10
                if (r2 != r4) goto L_0x0524
                long r6 = r1.f25958i
                r8 = 0
                r9 = 2
                r10 = 0
                r5 = r3
                androidx.recyclerview.widget.RecyclerView$z r1 = jq3.C60898l.m71330b6(r5, r6, r8, r9, r10)
                jq3.o r1 = (jq3.C60905o) r1
                if (r1 == 0) goto L_0x06d8
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r2 = r0.f12588j
                java.lang.Object r3 = r1.f173503E
                boolean r3 = r3 instanceof cm1.C0707a0
                if (r3 == 0) goto L_0x0519
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "FinderFeedLiveList info:lastCenterFeedId:"
                r1.append(r2)
                long r2 = r0.f12586h
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
                goto L_0x06d8
            L_0x0519:
                int r3 = r1.mo17363j()
                int r4 = r1.f44859i
                r2.mo2286W(r1, r3, r4, r15)
                goto L_0x06d8
            L_0x0524:
                r3 = 9
                if (r2 != r3) goto L_0x058d
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r1 = r0.f12588j
                androidx.recyclerview.widget.RecyclerView r1 = r1.f12554A
                if (r1 == 0) goto L_0x06d8
                int r2 = r1.getChildCount()
                r3 = 0
            L_0x0533:
                if (r3 >= r2) goto L_0x06d8
                android.view.View r12 = r1.getChildAt(r3)
                if (r12 == 0) goto L_0x0543
                int r4 = r12.getVisibility()
                if (r4 != 0) goto L_0x0543
                r8 = 1
                goto L_0x0544
            L_0x0543:
                r8 = 0
            L_0x0544:
                if (r8 != 0) goto L_0x058a
                if (r12 != 0) goto L_0x0549
                goto L_0x058a
            L_0x0549:
                k20.a r14 = new k20.a
                r14.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
                r14.mo10233c(r4)
                java.lang.Object[] r5 = r14.mo10232b()
                java.lang.String r6 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$1$1"
                java.lang.String r7 = "onEventHappen"
                java.lang.String r8 = "(Lcom/tencent/mm/plugin/finder/event/base/Event;)V"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setVisibility"
                java.lang.String r11 = "(I)V"
                r4 = r12
                j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.Object r4 = r14.mo10231a(r15)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r12.setVisibility(r4)
                java.lang.String r5 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$1$1"
                java.lang.String r6 = "onEventHappen"
                java.lang.String r7 = "(Lcom/tencent/mm/plugin/finder/event/base/Event;)V"
                java.lang.String r8 = "android/view/View_EXEC_"
                java.lang.String r9 = "setVisibility"
                java.lang.String r10 = "(I)V"
                r4 = r12
                j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            L_0x058a:
                int r3 = r3 + 1
                goto L_0x0533
            L_0x058d:
                if (r2 != 0) goto L_0x06d8
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r2 = r0.f12588j
                long r3 = r1.f25958i
                r2.mo2284U(r3)
                goto L_0x06d8
            L_0x0598:
                r10 = 0
                r13 = 1
                boolean r2 = r1 instanceof ef1.C7644m
                if (r2 == 0) goto L_0x06d8
                ef1.m r1 = (ef1.C7644m) r1
                int r2 = r1.f25961b
                if (r2 != r13) goto L_0x06d8
                long r6 = r1.f25963d
                r8 = 0
                r9 = 2
                r1 = 0
                r5 = r3
                r2 = r10
                r10 = r1
                androidx.recyclerview.widget.RecyclerView$z r1 = jq3.C60898l.m71330b6(r5, r6, r8, r9, r10)
                jq3.o r1 = (jq3.C60905o) r1
                if (r1 == 0) goto L_0x06d8
                bl3.r r5 = bl3.C39818r.f106831a
                android.content.Context r6 = r1.f173499A
                gy3.C87412m.m108593f(r6, r12)
                bl3.r$a r5 = r5.mo62443b(r6)
                java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC> r6 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class
                bl3.t r5 = r5.mo62449e(r6)
                r12 = r5
                com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r12 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) r12
                if (r12 == 0) goto L_0x06b0
                java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
                r5.<init>(r1)
                r12.f18629p = r5
                java.lang.Object r5 = r1.f173503E
                boolean r6 = r5 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r6 == 0) goto L_0x05dc
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
                r14 = r5
                goto L_0x05dd
            L_0x05dc:
                r14 = r4
            L_0x05dd:
                if (r14 != 0) goto L_0x05e1
                goto L_0x06b0
            L_0x05e1:
                long r5 = r12.f18635v
                long r7 = r14.getItemId()
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 == 0) goto L_0x05ee
                r18 = 1
                goto L_0x05f0
            L_0x05ee:
                r18 = 0
            L_0x05f0:
                long r10 = r12.f18635v
                if (r18 == 0) goto L_0x0678
                long r5 = r14.getItemId()
                r12.f18635v = r5
                java.util.Map<java.lang.Long, java.lang.Integer> r5 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.f18610J
                long r6 = r14.getItemId()
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
                java.lang.Object r5 = r5.get(r6)
                if (r5 != 0) goto L_0x0610
                java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            L_0x0610:
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r5.intValue()
                r12.f18637x = r5
                r12.f18624h = r15
                r6 = -1
                r12.f18627n = r6
                r12.f18626j = r6
                r12.f18625i = r15
                if (r5 == 0) goto L_0x0626
                r8 = 1
                goto L_0x0627
            L_0x0626:
                r8 = 0
            L_0x0627:
                r12.f18623g = r8
                com.tencent.mm.sdk.platformtools.MMHandler r5 = r12.f18628o
                r5.removeCallbacksAndMessages(r4)
                r12.f18622f = r15
                boolean r4 = r12.f18623g
                if (r4 != 0) goto L_0x0678
                rx3.g r4 = r12.f18619I
                rx3.n r4 = (rx3.C36570n) r4
                java.lang.Object r4 = r4.getValue()
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r4.intValue()
                long r4 = (long) r4
                long r4 = r4 * r16
                com.tencent.mm.plugin.finder.storage.FinderItem r6 = r14.mo3513o()
                java.util.LinkedList r6 = r6.getMediaList()
                java.lang.Object r6 = sx3.C110818d0.m150916N(r6)
                te3.rq2 r6 = (te3.C64689rq2) r6
                if (r6 != 0) goto L_0x0656
                goto L_0x06b0
            L_0x0656:
                long r6 = r6.f185238E
                int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r8 == 0) goto L_0x0664
                int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r2 <= 0) goto L_0x0661
                goto L_0x0664
            L_0x0661:
                r12.f18624h = r13
                goto L_0x0678
            L_0x0664:
                r12.f18622f = r13
                long r2 = android.os.SystemClock.uptimeMillis()
                long r2 = r2 + r4
                com.tencent.mm.sdk.platformtools.MMHandler r4 = r12.f18628o
                android.os.Message r4 = r4.obtainMessage(r13, r1)
                com.tencent.mm.sdk.platformtools.MMHandler r5 = r12.f18628o
                r5.sendMessageAtTime(r4, r2)
                r12.f18627n = r2
            L_0x0678:
                java.util.List<java.lang.Integer> r2 = r12.f18638y
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                java.util.Iterator r2 = r2.iterator()
            L_0x0680:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x06b0
                java.lang.Object r3 = r2.next()
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                java.util.Map<java.lang.Integer, rs1.kb> r4 = r12.f18639z
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
                java.lang.Object r3 = r4.get(r3)
                r5 = r3
                rs1.kb r5 = (rs1.C13308kb) r5
                if (r5 == 0) goto L_0x0680
                long r3 = r14.getItemId()
                r6 = r1
                r7 = r18
                r8 = r10
                r15 = r10
                r10 = r3
                r5.mo12678g3(r6, r7, r8, r10)
                r10 = r15
                goto L_0x0680
            L_0x06b0:
                dp1.t$b r2 = dp1.C58403t.f167322q
                int r3 = r1.mo17363j()
                r2.getClass()
                dp1.C58403t.f167325t = r3
                bl3.r r2 = bl3.C39818r.f106831a
                android.content.Context r3 = r1.f173499A
                java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
                gy3.C87412m.m108592e(r3, r4)
                com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
                bl3.r$a r2 = r2.mo62444c(r3)
                java.lang.Class<rs1.t2> r3 = rs1.C13452t2.class
                androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
                rs1.t2 r2 = (rs1.C13452t2) r2
                int r1 = r1.mo17363j()
                r2.f37345h = r1
            L_0x06d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.C2319a.mo2331B1(ef1.b):void");
        }

        /* renamed from: C1 */
        public void mo2332C1() {
            this.f12585g.removeCallbacksAndMessages((Object) null);
        }

        /* renamed from: z1 */
        public boolean mo2333z1(C58553c cVar, C7637b bVar) {
            C87412m.m108594g(cVar, "dispatcher");
            C87412m.m108594g(bVar, "event");
            return (bVar instanceof C58259c.C58260a) || (bVar instanceof C7642k) || (bVar instanceof C7644m);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$a0 */
    public static final class C2323a0 extends C87413o implements C32229r<MotionEvent, MotionEvent, Float, Float, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12596d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2323a0(C60905o oVar) {
            super(4);
            this.f12596d = oVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            MotionEvent motionEvent = (MotionEvent) obj;
            MotionEvent motionEvent2 = (MotionEvent) obj2;
            float floatValue = ((Number) obj3).floatValue();
            float floatValue2 = ((Number) obj4).floatValue();
            C87412m.m108594g(motionEvent, "e1");
            C87412m.m108594g(motionEvent2, "e2");
            C39818r rVar = C39818r.f106831a;
            Context context = this.f12596d.f173499A;
            C87412m.m108593f(context, "holder.context");
            FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = (FinderHorizontalVideoDrawerUIC) rVar.mo62443b(context).mo62449e(FinderHorizontalVideoDrawerUIC.class);
            return Boolean.valueOf(finderHorizontalVideoDrawerUIC != null ? finderHorizontalVideoDrawerUIC.mo5141e3().onFling(motionEvent, motionEvent2, floatValue, floatValue2) : false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$a1 */
    public static final class C2324a1 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12597d;

        /* renamed from: e */
        public final /* synthetic */ FinderFeedFullConvert<T> f12598e;

        /* renamed from: f */
        public final /* synthetic */ T f12599f;

        public C2324a1(C60905o oVar, FinderFeedFullConvert<T> finderFeedFullConvert, T t) {
            this.f12597d = oVar;
            this.f12598e = finderFeedFullConvert;
            this.f12599f = t;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshDescContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C39818r rVar = C39818r.f106831a;
            Context context = this.f12597d.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13256h1 h1Var = (C13256h1) rVar.mo62443b(context).mo62449e(C13256h1.class);
            if (h1Var != null) {
                h1Var.mo12723c3(this.f12597d);
            }
            if (this.f12598e.mo2313q(this.f12599f)) {
                FinderFeedFullConvert<T> finderFeedFullConvert = this.f12598e;
                FinderFeedFullConvert.m2150a0(finderFeedFullConvert, this.f12597d, this.f12599f, false, 0, (C65426w0) null, 0, 4, finderFeedFullConvert.mo2260G(), 0, this.f12598e.mo2330z(this.f12597d), 1, 312, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshDescContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$b */
    public static final class C2325b {
        public C2325b(C8480h hVar) {
        }

        /* renamed from: a */
        public final Map<String, Object> mo2338a(FinderItem finderItem) {
            if (finderItem == null) {
                return null;
            }
            C13604l[] lVarArr = new C13604l[7];
            int i = 0;
            lVarArr[0] = new C13604l("feed_id", C61926c.m72691p(finderItem.getFeedObject().f164794id));
            lVarArr[1] = new C13604l("session_buffer", finderItem.getFeedObject().sessionBuffer);
            lVarArr[2] = new C13604l("finder_username", finderItem.getFeedObject().username);
            lVarArr[3] = new C13604l("media_type", Integer.valueOf(finderItem.getMediaType()));
            C64689rq2 rq22 = (C64689rq2) C110818d0.m150916N(finderItem.getMediaList());
            if (rq22 != null) {
                i = rq22.f185269g;
            }
            lVarArr[4] = new C13604l("video_duration_time", String.valueOf(i));
            long j = finderItem.field_id;
            if (j == 0) {
                j = finderItem.getLocalId();
            }
            lVarArr[5] = new C13604l("long_video_id", C61926c.m72691p(j));
            lVarArr[6] = new C13604l("feed_display_type", "1");
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$b0 */
    public static final class C2326b0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12600d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2326b0(C60905o oVar) {
            super(0);
            this.f12600d = oVar;
        }

        public Object invoke() {
            C39818r rVar = C39818r.f106831a;
            Context context = this.f12600d.f173499A;
            C87412m.m108593f(context, "holder.context");
            FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = (FinderHorizontalVideoDrawerUIC) rVar.mo62443b(context).mo62449e(FinderHorizontalVideoDrawerUIC.class);
            if (finderHorizontalVideoDrawerUIC != null && finderHorizontalVideoDrawerUIC.f18677g) {
                FinderDraggableLayout.m4280l(finderHorizontalVideoDrawerUIC.mo5141e3(), 0, false, 3, (Object) null);
                finderHorizontalVideoDrawerUIC.f18677g = false;
            }
            Context context2 = this.f12600d.f173499A;
            C87412m.m108593f(context2, "holder.context");
            ((C13194da) rVar.mo62443b(context2).mo75002a(C13194da.class)).mo12686d3();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$b1 */
    public static final class C2327b1 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12601d;

        /* renamed from: e */
        public final /* synthetic */ T f12602e;

        public C2327b1(C60905o oVar, T t) {
            this.f12601d = oVar;
            this.f12602e = t;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshFinderLivingStatusView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Context context = this.f12601d.f173499A;
            C87412m.m108593f(context, "holder.context");
            C58969q l = this.f12602e.mo3507l();
            new C4167r7(context, l != null ? l.getUsername() : null, this.f12601d.mo17363j(), this.f12602e.mo3513o().isLiveFeed(), this.f12602e.mo3513o().getId()).mo5050a(true, false, this.f12602e.mo3513o().getFeedObject());
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshFinderLivingStatusView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$c */
    public static final class C2328c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12603d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12604e;

        /* renamed from: f */
        public final /* synthetic */ View f12605f;

        /* renamed from: g */
        public final /* synthetic */ View f12606g;

        /* renamed from: h */
        public final /* synthetic */ View f12607h;

        public C2328c(FinderFeedFullConvert<T> finderFeedFullConvert, C60905o oVar, View view, View view2, View view3) {
            this.f12603d = finderFeedFullConvert;
            this.f12604e = oVar;
            this.f12605f = view;
            this.f12606g = view2;
            this.f12607h = view3;
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x014c  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0178  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x01a5  */
        /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r20 = this;
                r0 = r20
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r1 = r0.f12603d
                jq3.o r2 = r0.f12604e
                android.view.View r3 = r0.f12605f
                android.view.View r12 = r0.f12606g
                android.view.View r13 = r0.f12607h
                r1.getClass()
                r4 = 2131305120(0x7f0922a0, float:1.8228402E38)
                android.view.View r14 = r2.mo85812D(r4)
                if (r14 != 0) goto L_0x001a
                goto L_0x01a8
            L_0x001a:
                r4 = 2131302830(0x7f0919ae, float:1.8223757E38)
                android.view.View r4 = r2.mo85812D(r4)
                r15 = r4
                android.view.ViewGroup r15 = (android.view.ViewGroup) r15
                if (r15 != 0) goto L_0x0028
                goto L_0x01a8
            L_0x0028:
                r4 = 2131302903(0x7f0919f7, float:1.8223905E38)
                android.view.View r11 = r2.mo85812D(r4)
                if (r11 != 0) goto L_0x0033
                goto L_0x01a8
            L_0x0033:
                k20.a r10 = new k20.a
                r10.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                r9 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
                r10.mo10233c(r4)
                java.lang.Object[] r5 = r10.mo10232b()
                java.lang.String r6 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
                java.lang.String r7 = "realAdjustSeekLayout"
                java.lang.String r8 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V"
                java.lang.String r16 = "android/view/View_EXEC_"
                java.lang.String r17 = "setVisibility"
                java.lang.String r18 = "(I)V"
                r4 = r12
                r0 = 0
                r9 = r16
                r16 = r14
                r14 = r10
                r10 = r17
                r19 = r11
                r11 = r18
                j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.Object r4 = r14.mo10231a(r0)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r12.setVisibility(r4)
                java.lang.String r5 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
                java.lang.String r6 = "realAdjustSeekLayout"
                java.lang.String r7 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V"
                java.lang.String r8 = "android/view/View_EXEC_"
                java.lang.String r9 = "setVisibility"
                java.lang.String r10 = "(I)V"
                r4 = r12
                j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
                r4 = 2
                int[] r5 = new int[r4]
                int[] r6 = new int[r4]
                int[] r7 = new int[r4]
                int[] r4 = new int[r4]
                android.view.View r8 = r2.f44854d
                r8.getLocationInWindow(r5)
                r3.getLocationInWindow(r6)
                r8 = r6[r0]
                r9 = r5[r0]
                int r8 = r8 - r9
                r6[r0] = r8
                r9 = 1
                r8 = r6[r9]
                r10 = r5[r9]
                int r8 = r8 - r10
                r6[r9] = r8
                int r8 = r15.getChildCount()
                r10 = 0
            L_0x00a6:
                r11 = 0
                if (r10 >= r8) goto L_0x00d7
                android.view.View r14 = r15.getChildAt(r10)
                int r17 = r14.getVisibility()
                if (r17 != 0) goto L_0x00d3
                float r17 = r14.getAlpha()
                int r17 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
                if (r17 != 0) goto L_0x00be
                r17 = 1
                goto L_0x00c0
            L_0x00be:
                r17 = 0
            L_0x00c0:
                if (r17 != 0) goto L_0x00d3
                java.util.List<java.lang.Integer> r11 = r1.f12562I
                int r18 = r14.getId()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r18)
                boolean r9 = r11.contains(r9)
                if (r9 != 0) goto L_0x00d3
                goto L_0x00d9
            L_0x00d3:
                int r10 = r10 + 1
                r9 = 1
                goto L_0x00a6
            L_0x00d7:
                r14 = r16
            L_0x00d9:
                r14.getLocationInWindow(r7)
                r1 = r7[r0]
                r8 = r5[r0]
                int r1 = r1 - r8
                r7[r0] = r1
                r1 = 1
                r8 = r7[r1]
                r9 = r5[r1]
                int r8 = r8 - r9
                r7[r1] = r8
                r8 = r19
                r8.getLocationInWindow(r4)
                r9 = r4[r0]
                r10 = r5[r0]
                int r9 = r9 - r10
                r4[r0] = r9
                r9 = r4[r1]
                r5 = r5[r1]
                int r9 = r9 - r5
                r4[r1] = r9
                int r5 = r8.getVisibility()
                if (r5 != 0) goto L_0x011b
                float r5 = r8.getAlpha()
                r8 = 0
                int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r5 != 0) goto L_0x010f
                r9 = 1
                goto L_0x0110
            L_0x010f:
                r9 = 0
            L_0x0110:
                if (r9 != 0) goto L_0x011b
                r0 = r7[r1]
                r4 = r4[r1]
                int r0 = java.lang.Math.min(r0, r4)
                goto L_0x011d
            L_0x011b:
                r0 = r7[r1]
            L_0x011d:
                android.view.ViewGroup$LayoutParams r1 = r12.getLayoutParams()
                java.lang.String r4 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
                gy3.C87412m.m108592e(r1, r4)
                android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
                int r4 = r1.topMargin
                int r5 = r13.getHeight()
                int r7 = r12.getHeight()
                int r7 = r7 - r5
                android.content.Context r8 = r2.f173499A
                android.content.res.Resources r8 = r8.getResources()
                r9 = 2131165355(0x7f0700ab, float:1.7944925E38)
                float r8 = r8.getDimension(r9)
                int r8 = (int) r8
                r9 = 1
                r10 = r6[r9]
                int r9 = r3.getHeight()
                int r10 = r10 + r9
                int r10 = r10 + r5
                if (r10 <= r0) goto L_0x0178
                android.content.Context r2 = r2.f173499A
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131165371(0x7f0700bb, float:1.7944957E38)
                float r2 = r2.getDimension(r3)
                int r2 = (int) r2
                int r3 = r12.getHeight()
                int r0 = r0 - r3
                int r0 = r0 - r2
                r1.topMargin = r0
                int r0 = r12.getHeight()
                int r0 = r0 + r2
                int r8 = r8 + r0
                int r0 = r15.getPaddingLeft()
                int r2 = r15.getPaddingRight()
                int r3 = r15.getPaddingBottom()
                r15.setPadding(r0, r8, r2, r3)
                goto L_0x01a1
            L_0x0178:
                android.content.Context r0 = r2.f173499A
                android.content.res.Resources r0 = r0.getResources()
                r2 = 2131165307(0x7f07007b, float:1.7944827E38)
                float r0 = r0.getDimension(r2)
                int r0 = (int) r0
                r2 = 1
                r2 = r6[r2]
                int r3 = r3.getHeight()
                int r2 = r2 + r3
                int r2 = r2 - r7
                int r2 = r2 + r0
                r1.topMargin = r2
                int r0 = r15.getPaddingLeft()
                int r2 = r15.getPaddingRight()
                int r3 = r15.getPaddingBottom()
                r15.setPadding(r0, r8, r2, r3)
            L_0x01a1:
                int r0 = r1.topMargin
                if (r0 == r4) goto L_0x01a8
                r12.requestLayout()
            L_0x01a8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.C2328c.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$c0 */
    public static final class C2329c0 implements HardTouchableLayout.C7077f {

        /* renamed from: a */
        public final /* synthetic */ C60905o f12608a;

        /* renamed from: b */
        public final /* synthetic */ FinderFeedFullConvert<T> f12609b;

        public C2329c0(C60905o oVar, FinderFeedFullConvert<T> finderFeedFullConvert) {
            this.f12608a = oVar;
            this.f12609b = finderFeedFullConvert;
        }

        /* renamed from: a */
        public void mo2341a(View view, MotionEvent motionEvent) {
            C87412m.m108594g(view, "view");
            Log.m105924i("Finder.FeedFullConvert", "onSingleClickListener onMediaClick  " + this.f12608a.f173503E);
            FinderFeedFullConvert<T> finderFeedFullConvert = this.f12609b;
            C60905o oVar = this.f12608a;
            finderFeedFullConvert.mo2280Q(oVar, view, ((BaseFinderFeed) oVar.f173503E).mo3513o().getFeedObject());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$c1 */
    public static final class C2330c1 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12610d;

        /* renamed from: e */
        public final /* synthetic */ FlowTextMixView f12611e;

        /* renamed from: f */
        public final /* synthetic */ TextView f12612f;

        /* renamed from: g */
        public final /* synthetic */ FinderFeedFullConvert<T> f12613g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2330c1(C60905o oVar, FlowTextMixView flowTextMixView, TextView textView, FinderFeedFullConvert<T> finderFeedFullConvert) {
            super(0);
            this.f12610d = oVar;
            this.f12611e = flowTextMixView;
            this.f12612f = textView;
            this.f12613g = finderFeedFullConvert;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r18 = this;
                r0 = r18
                jq3.o r1 = r0.f12610d
                java.lang.Object r1 = r1.f173503E
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r1
                com.tencent.mm.ui.widget.FlowTextMixView r2 = r0.f12611e
                int r2 = r2.mo153879b()
                r3 = 8
                r4 = 1
                if (r2 <= r4) goto L_0x001a
                android.widget.TextView r1 = r0.f12612f
                r1.setVisibility(r3)
                goto L_0x00e3
            L_0x001a:
                te3.rl1 r2 = r1.mo3470D()
                r5 = 0
                if (r2 != 0) goto L_0x00bc
                android.widget.TextView r2 = r0.f12612f
                if (r2 == 0) goto L_0x00d4
                jq3.o r6 = r0.f12610d
                fe1.q r7 = r1.mo3507l()
                if (r7 == 0) goto L_0x0030
                int r7 = r7.field_friendFollowCount
                goto L_0x0031
            L_0x0030:
                r7 = 0
            L_0x0031:
                com.tencent.mm.plugin.finder.storage.FinderItem r8 = r1.mo3513o()
                te3.cg r8 = r8.getBizInfo()
                r9 = 0
                if (r8 == 0) goto L_0x008a
                r10 = 2131305072(0x7f092270, float:1.8228305E38)
                android.view.View r10 = r6.mo85812D(r10)
                int r10 = r10.getVisibility()
                if (r10 != 0) goto L_0x006e
                fe1.d$b r11 = fe1.C58961d.f168673a
                com.tencent.mm.plugin.finder.storage.FinderItem r10 = r1.mo3513o()
                java.lang.String r12 = r10.field_username
                com.tencent.mm.plugin.finder.storage.FinderItem r10 = r1.mo3513o()
                te3.cg r10 = r10.getBizInfo()
                if (r10 == 0) goto L_0x005f
                java.lang.String r10 = r10.f182468d
                r13 = r10
                goto L_0x0060
            L_0x005f:
                r13 = r9
            L_0x0060:
                r14 = 0
                r15 = 0
                r16 = 12
                r17 = 0
                boolean r10 = fe1.C58961d.C58963b.m68836h(r11, r12, r13, r14, r15, r16, r17)
                if (r10 != 0) goto L_0x006e
                r10 = 1
                goto L_0x006f
            L_0x006e:
                r10 = 0
            L_0x006f:
                if (r10 == 0) goto L_0x0072
                goto L_0x0073
            L_0x0072:
                r8 = r9
            L_0x0073:
                if (r8 == 0) goto L_0x008a
                android.content.Context r8 = r6.f173499A
                android.content.res.Resources r8 = r8.getResources()
                r9 = 2131826207(0x7f11161f, float:1.9285292E38)
                java.lang.String r8 = r8.getString(r9)
                r2.setText(r8)
                r2.setVisibility(r5)
                rx3.b0 r9 = rx3.C13598b0.f38549a
            L_0x008a:
                if (r9 != 0) goto L_0x00d4
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                int r1 = r1.recommendType
                if (r7 <= 0) goto L_0x00b8
                r8 = 28
                if (r1 == r8) goto L_0x00b8
                android.content.Context r1 = r6.f173499A
                android.content.res.Resources r1 = r1.getResources()
                r3 = 2131826694(0x7f111806, float:1.928628E38)
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
                r4[r5] = r6
                java.lang.String r1 = r1.getString(r3, r4)
                r2.setText(r1)
                r2.setVisibility(r5)
                goto L_0x00d4
            L_0x00b8:
                r2.setVisibility(r3)
                goto L_0x00d4
            L_0x00bc:
                int r1 = r2.f141000f
                r4 = 9
                if (r1 != r4) goto L_0x00cf
                android.widget.TextView r1 = r0.f12612f
                r1.setVisibility(r5)
                android.widget.TextView r1 = r0.f12612f
                java.lang.String r2 = r2.f140999e
                r1.setText(r2)
                goto L_0x00d4
            L_0x00cf:
                android.widget.TextView r1 = r0.f12612f
                r1.setVisibility(r3)
            L_0x00d4:
                android.widget.TextView r1 = r0.f12612f
                int r1 = r1.getVisibility()
                if (r1 != 0) goto L_0x00e3
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r1 = r0.f12613g
                jq3.o r2 = r0.f12610d
                r1.mo2306m0(r2)
            L_0x00e3:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.C2330c1.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$d */
    public static final class C2331d implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ boolean[] f12614d;

        public C2331d(boolean[] zArr) {
            this.f12614d = zArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
            if (r11 != 6) goto L_0x0043;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
            /*
                r10 = this;
                tc2.g r0 = tc2.C118418g.INSTANCE
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r1.add(r11)
                r1.add(r12)
                java.lang.Object[] r7 = r1.toArray()
                r1.clear()
                java.lang.String r2 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$bindAwesomeLayout$1"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r6 = r10
                j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
                int r11 = r12.getAction()
                r1 = 0
                r2 = 1
                java.lang.String r3 = "ce_feed_like"
                if (r11 == 0) goto L_0x003a
                if (r11 == r2) goto L_0x0033
                r4 = 5
                if (r11 == r4) goto L_0x003a
                r2 = 6
                if (r11 == r2) goto L_0x0033
                goto L_0x0043
            L_0x0033:
                r0.mo175827n9(r3, r12)
                r0.ec0(r3)
                goto L_0x0043
            L_0x003a:
                boolean[] r11 = r10.f12614d
                r11[r1] = r2
                java.lang.String r11 = "<FeedLike>"
                r0.w40(r3, r11)
            L_0x0043:
                r4 = 0
                java.lang.String r6 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$bindAwesomeLayout$1"
                java.lang.String r7 = "android/view/View$OnTouchListener"
                java.lang.String r8 = "onTouch"
                java.lang.String r9 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r5 = r10
                j20.C117292a.m165362h(r4, r5, r6, r7, r8, r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.C2331d.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$d0 */
    public static final class C2332d0 implements HardTouchableLayout.C7074a {

        /* renamed from: a */
        public final /* synthetic */ C60905o f12615a;

        /* renamed from: b */
        public final /* synthetic */ FinderFeedFullConvert<T> f12616b;

        /* renamed from: c */
        public final /* synthetic */ int f12617c;

        public C2332d0(C60905o oVar, FinderFeedFullConvert<T> finderFeedFullConvert, int i) {
            this.f12615a = oVar;
            this.f12616b = finderFeedFullConvert;
            this.f12617c = i;
        }

        /* renamed from: a */
        public void mo2343a(View view, MotionEvent motionEvent) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(motionEvent, "e");
            Log.m105924i("Finder.FeedFullConvert", "onDoubleClick " + this.f12615a.f173503E);
            this.f12616b.mo2281R(this.f12615a, view, motionEvent, this.f12617c);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$d1 */
    public static final class C2333d1 extends C87413o implements C32226l<FinderJumpInfo, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C11911l f12618d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2333d1(C11911l lVar) {
            super(1);
            this.f12618d = lVar;
        }

        public Object invoke(Object obj) {
            FinderJumpInfo finderJumpInfo = (FinderJumpInfo) obj;
            C87412m.m108594g(finderJumpInfo, LocaleUtil.ITALIAN);
            return Boolean.valueOf(this.f12618d.f34809g.contains(Integer.valueOf(finderJumpInfo.hashCode())));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$e */
    public static final class C2334e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean[] f12619d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12620e;

        /* renamed from: f */
        public final /* synthetic */ FinderFeedFullConvert<T> f12621f;

        /* renamed from: g */
        public final /* synthetic */ int f12622g;

        public C2334e(boolean[] zArr, C60905o oVar, FinderFeedFullConvert<T> finderFeedFullConvert, int i) {
            this.f12619d = zArr;
            this.f12620e = oVar;
            this.f12621f = finderFeedFullConvert;
            this.f12622g = i;
        }

        public final void onClick(View view) {
            int i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$bindAwesomeLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean[] zArr = this.f12619d;
            boolean z = false;
            if (zArr[0]) {
                zArr[0] = false;
            } else {
                C118418g gVar = C118418g.INSTANCE;
                gVar.w40("ce_feed_like", "<FeedLike>");
                gVar.mo175827n9("ce_feed_like", MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 65535));
                gVar.ec0("ce_feed_like");
            }
            Log.m105924i("Finder.FeedFullConvert", "onClickLike:" + this.f12620e.mo17363j());
            C58784w3 w3Var = C58784w3.f168295a;
            FinderObject feedObject = ((BaseFinderFeed) this.f12620e.f173503E).mo3513o().getFeedObject();
            w3Var.getClass();
            C87412m.m108594g(feedObject, C66261f3.COL_FINDEROBJECT);
            if ((feedObject.permissionFlag & 32) == 0) {
                if (!this.f12621f.f12564e.mo2497u0()) {
                    FinderFeedFullConvert<T> finderFeedFullConvert = this.f12621f;
                    finderFeedFullConvert.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - finderFeedFullConvert.f12568i;
                    if (!(41 <= j && j < 300) || (i = finderFeedFullConvert.f12570n) >= 5) {
                        finderFeedFullConvert.f12570n = 0;
                        finderFeedFullConvert.f12568i = elapsedRealtime;
                        z = true;
                    } else {
                        finderFeedFullConvert.f12570n = i + 1;
                        finderFeedFullConvert.f12568i = elapsedRealtime;
                    }
                    if (z) {
                        this.f12621f.mo2266J(this.f12620e, 1, false, (MotionEvent) null, this.f12622g);
                    }
                } else {
                    C60905o oVar = this.f12620e;
                    BaseFinderFeed baseFinderFeed = (BaseFinderFeed) oVar.f173503E;
                    Context context = oVar.f173499A;
                    Activity activity = context instanceof Activity ? (Activity) context : null;
                    FinderLikeDrawer finderLikeDrawer = activity != null ? (FinderLikeDrawer) activity.findViewById(C0966R.C0970id.f358072d93) : null;
                    C87412m.m108591d(finderLikeDrawer);
                    C60905o oVar2 = this.f12620e;
                    FinderItem o = baseFinderFeed.mo3513o();
                    FinderLikeDrawer.Companion companion = FinderLikeDrawer.f17829D;
                    finderLikeDrawer.mo4616m(oVar2, o, (C89349b) null, 0);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$bindAwesomeLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$e0 */
    public static final class C2335e0 implements HardTouchableLayout.C7076c {

        /* renamed from: a */
        public final /* synthetic */ FinderFeedFullConvert<T> f12623a;

        /* renamed from: b */
        public final /* synthetic */ C60905o f12624b;

        public C2335e0(FinderFeedFullConvert<T> finderFeedFullConvert, C60905o oVar) {
            this.f12623a = finderFeedFullConvert;
            this.f12624b = oVar;
        }

        /* renamed from: a */
        public void mo2345a(View view, MotionEvent motionEvent) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(motionEvent, "e");
            FinderFeedFullConvert<T> finderFeedFullConvert = this.f12623a;
            C60905o oVar = this.f12624b;
            Object obj = oVar.f173503E;
            C87412m.m108593f(obj, "holder.getAssociatedObject<T>()");
            finderFeedFullConvert.mo2282S(oVar, view, (BaseFinderFeed) obj, motionEvent);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$e1 */
    public static final class C2336e1 extends C87413o implements C32226l<FinderJumpInfo, CharSequence> {

        /* renamed from: d */
        public static final C2336e1 f12625d = new C2336e1();

        public C2336e1() {
            super(1);
        }

        public Object invoke(Object obj) {
            FinderJumpInfo finderJumpInfo = (FinderJumpInfo) obj;
            C58784w3 w3Var = C58784w3.f168295a;
            C87412m.m108593f(finderJumpInfo, LocaleUtil.ITALIAN);
            return w3Var.mo83918b1(finderJumpInfo);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$f */
    public static final class C2337f implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12626d;

        /* renamed from: e */
        public final /* synthetic */ FinderFeedFullConvert<T> f12627e;

        /* renamed from: f */
        public final /* synthetic */ int f12628f;

        public C2337f(C60905o oVar, FinderFeedFullConvert<T> finderFeedFullConvert, int i) {
            this.f12626d = oVar;
            this.f12627e = finderFeedFullConvert;
            this.f12628f = i;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$bindAwesomeLayout$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) this.f12626d.f173503E;
            C37521f.f99374d.getClass();
            boolean z = false;
            if (C37521f.f99226L7.mo60266n().intValue() == 1) {
                if (C58784w3.f168295a.mo83942k(baseFinderFeed.mo3513o().getFeedObject())) {
                    C39818r rVar = C39818r.f106831a;
                    Context context = this.f12626d.f173499A;
                    C87412m.m108593f(context, "holder.context");
                    C13549y7 y7Var = (C13549y7) rVar.mo62443b(context).mo75002a(C13549y7.class);
                    C60905o oVar = this.f12626d;
                    y7Var.getClass();
                    C87412m.m108594g(oVar, "holder");
                    C85801v1 i = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_PRIVATE_LIKE_GUIDE_DIALOG_SHOW_COUNT_LONG_CLICK_INT_SYNC;
                    int j = i.mo119689j(aVar, 0);
                    if (j < 3) {
                        y7Var.mo12954c3();
                        oVar.f44854d.performHapticFeedback(0, 3);
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(j + 1));
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_PRIVATE_LIKE_GUIDE_LAST_SHOW_TIME_LONG_SYNC, Long.valueOf(C31543z5.m39453c()));
                    }
                }
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$bindAwesomeLayout$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            } else if (C58784w3.f168295a.mo83942k(baseFinderFeed.mo3513o().getFeedObject()) || C37521f.f99559x6.mo60266n().intValue() == 0) {
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$bindAwesomeLayout$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            } else {
                FinderObject feedObject = baseFinderFeed.mo3513o().getFeedObject();
                C87412m.m108594g(feedObject, C66261f3.COL_FINDEROBJECT);
                if ((feedObject.permissionFlag & 32) == 0) {
                    z = true;
                }
                if (z && !this.f12627e.f12564e.mo2497u0() && C37521f.f99430j2.mo60266n().intValue() == 1 && !C58739j4.f168176a.mo83688Q(baseFinderFeed.mo3507l())) {
                    C49839if1 c = C15587j.f42215a.mo14351c(baseFinderFeed.mo3513o().getFeedObject().objectType);
                    if (Util.isNullOrNil(c != null ? c.f135273s : null)) {
                        this.f12627e.mo2279P0(this.f12626d, baseFinderFeed, this.f12628f, (Drawable) null);
                    } else {
                        this.f12627e.mo2279P0(this.f12626d, baseFinderFeed, this.f12628f, (Drawable) null);
                    }
                }
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$bindAwesomeLayout$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$f0 */
    public static final class C2338f0 extends C87413o implements C32229r<MotionEvent, MotionEvent, Float, Float, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12629d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2338f0(C60905o oVar) {
            super(4);
            this.f12629d = oVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            MotionEvent motionEvent = (MotionEvent) obj;
            MotionEvent motionEvent2 = (MotionEvent) obj2;
            float floatValue = ((Number) obj3).floatValue();
            float floatValue2 = ((Number) obj4).floatValue();
            C87412m.m108594g(motionEvent, "e1");
            C87412m.m108594g(motionEvent2, "e2");
            C39818r rVar = C39818r.f106831a;
            Context context = this.f12629d.f173499A;
            C87412m.m108593f(context, "holder.context");
            FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = (FinderHorizontalVideoDrawerUIC) rVar.mo62443b(context).mo62449e(FinderHorizontalVideoDrawerUIC.class);
            return Boolean.valueOf(finderHorizontalVideoDrawerUIC != null ? finderHorizontalVideoDrawerUIC.mo5144i3(motionEvent, motionEvent2, floatValue, floatValue2) : false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$f1 */
    public static final class C2339f1 extends C87413o implements C32226l<FinderCommentInfo, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12630d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12631e;

        /* renamed from: f */
        public final /* synthetic */ T f12632f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2339f1(FinderFeedFullConvert<T> finderFeedFullConvert, C60905o oVar, T t) {
            super(1);
            this.f12630d = finderFeedFullConvert;
            this.f12631e = oVar;
            this.f12632f = t;
        }

        public Object invoke(Object obj) {
            FinderCommentInfo finderCommentInfo = (FinderCommentInfo) obj;
            C87412m.m108594g(finderCommentInfo, LocaleUtil.ITALIAN);
            FinderFeedFullConvert.m2150a0(this.f12630d, this.f12631e, this.f12632f, false, finderCommentInfo.commentId, (C65426w0) null, 0, 5, false, 1500, 0, 0, 1716, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$g */
    public static final class C2340g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12633d;

        /* renamed from: e */
        public final /* synthetic */ T f12634e;

        /* renamed from: f */
        public final /* synthetic */ FinderFeedFullConvert<T> f12635f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2340g(C60905o oVar, T t, FinderFeedFullConvert<T> finderFeedFullConvert) {
            super(0);
            this.f12633d = oVar;
            this.f12634e = t;
            this.f12635f = finderFeedFullConvert;
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00bd  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00cd  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00d3  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00f6  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x010a  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x011d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r22 = this;
                r0 = r22
                java.lang.Class<dp1.y0> r1 = dp1.C58417y0.class
                di3.d r2 = di3.C86312j.m106911c(r1)
                dp1.y0 r2 = (dp1.C58417y0) r2
                jq3.o r3 = r0.f12633d
                T r4 = r0.f12634e
                long r4 = r4.getItemId()
                T r6 = r0.f12634e
                com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
                r2.wx0(r3, r4, r6)
                di3.d r1 = di3.C86312j.m106911c(r1)
                dp1.y0 r1 = (dp1.C58417y0) r1
                jq3.o r2 = r0.f12633d
                android.content.Context r2 = r2.f173499A
                java.lang.String r3 = "holder.context"
                gy3.C87412m.m108593f(r2, r3)
                T r4 = r0.f12634e
                long r4 = r4.getItemId()
                r1.getClass()
                rs1.s8$a r6 = rs1.C13442s8.f38060Q0
                rs1.s8 r2 = r6.mo12873f(r2)
                r6 = 0
                if (r2 == 0) goto L_0x0043
                te3.hj1 r2 = r2.mo12861q3()
                int r2 = r2.f134675i
                goto L_0x0044
            L_0x0043:
                r2 = 0
            L_0x0044:
                dp1.i2 r1 = r1.mo83349vP(r4, r2)
                r2 = 0
                if (r1 == 0) goto L_0x0052
                te3.we1 r1 = r1.f122975a
                if (r1 == 0) goto L_0x0052
                java.lang.String r1 = r1.f143989i
                goto L_0x0053
            L_0x0052:
                r1 = r2
            L_0x0053:
                r4 = 1
                if (r1 == 0) goto L_0x005f
                int r5 = r1.length()
                if (r5 != 0) goto L_0x005d
                goto L_0x005f
            L_0x005d:
                r5 = 0
                goto L_0x0060
            L_0x005f:
                r5 = 1
            L_0x0060:
                if (r5 == 0) goto L_0x0068
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                goto L_0x0074
            L_0x0068:
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006f }
                r5.<init>(r1)     // Catch:{ JSONException -> 0x006f }
                r13 = r5
                goto L_0x0075
            L_0x006f:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
            L_0x0074:
                r13 = r1
            L_0x0075:
                T r1 = r0.f12634e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                te3.cg r1 = r1.getBizInfo()
                java.lang.String r5 = ""
                if (r1 == 0) goto L_0x0087
                java.lang.String r1 = r1.f182468d
                if (r1 != 0) goto L_0x0088
            L_0x0087:
                r1 = r5
            L_0x0088:
                java.lang.String r7 = "biz_username"
                r13.put(r7, r1)
                java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                tf0.p1 r1 = (tf0.C64916p1) r1
                T r7 = r0.f12634e
                long r7 = r7.getItemId()
                rs1.s8$a r9 = rs1.C13442s8.f38060Q0
                jq3.o r10 = r0.f12633d
                android.content.Context r10 = r10.f173499A
                gy3.C87412m.m108593f(r10, r3)
                rs1.s8 r10 = r9.mo12873f(r10)
                if (r10 == 0) goto L_0x00ac
                int r6 = r10.f38096i
            L_0x00ac:
                dp1.i2 r1 = r1.mo9101vP(r7, r6)
                if (r1 == 0) goto L_0x00bd
                te3.we1 r1 = r1.f122975a
                if (r1 == 0) goto L_0x00bd
                java.lang.String r1 = r1.f143985e
                if (r1 != 0) goto L_0x00bb
                goto L_0x00bd
            L_0x00bb:
                r14 = r1
                goto L_0x00be
            L_0x00bd:
                r14 = r5
            L_0x00be:
                dp1.f2 r7 = dp1.C7435f2.f25626a
                jq3.o r1 = r0.f12633d
                android.content.Context r1 = r1.f173499A
                gy3.C87412m.m108593f(r1, r3)
                rs1.s8 r1 = r9.mo12873f(r1)
                if (r1 == 0) goto L_0x00d3
                te3.hj1 r1 = r1.mo12861q3()
                r8 = r1
                goto L_0x00d4
            L_0x00d3:
                r8 = r2
            L_0x00d4:
                r10 = 0
                T r1 = r0.f12634e
                long r11 = r1.getItemId()
                java.lang.String r9 = "follow"
                r7.mo8579c(r8, r9, r10, r11, r13, r14)
                fe1.d$b r15 = fe1.C58961d.f168673a
                T r1 = r0.f12634e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                java.lang.String r1 = r1.field_username
                T r5 = r0.f12634e
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
                te3.cg r5 = r5.getBizInfo()
                if (r5 == 0) goto L_0x00f8
                java.lang.String r2 = r5.f182468d
            L_0x00f8:
                r17 = r2
                r18 = 0
                r19 = 0
                r20 = 12
                r21 = 0
                r16 = r1
                boolean r1 = fe1.C58961d.C58963b.m68836h(r15, r16, r17, r18, r19, r20, r21)
                if (r1 != 0) goto L_0x0115
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r1 = r0.f12635f
                kf1.v1 r1 = r1.f12564e
                T r2 = r0.f12634e
                r5 = 21
                r1.mo2572J0(r2, r4, r5)
            L_0x0115:
                jq3.o r1 = r0.f12633d
                int r1 = r1.mo17363j()
                if (r1 != 0) goto L_0x013e
                bl3.r r1 = bl3.C39818r.f106831a
                jq3.o r2 = r0.f12633d
                android.content.Context r2 = r2.f173499A
                gy3.C87412m.m108593f(r2, r3)
                bl3.r$a r1 = r1.mo62443b(r2)
                java.lang.Class<iq1.d> r2 = iq1.C60593d.class
                androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
                iq1.d r1 = (iq1.C60593d) r1
                iq1.c r1 = r1.f172693f
                if (r1 == 0) goto L_0x013e
                r1.mo85549a()
                java.lang.String r2 = "follow"
                r1.mo85550b(r2)
            L_0x013e:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.C2340g.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$g0 */
    public static final class C2341g0 extends C87413o implements C32229r<MotionEvent, MotionEvent, Float, Float, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12636d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2341g0(C60905o oVar) {
            super(4);
            this.f12636d = oVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            MotionEvent motionEvent = (MotionEvent) obj;
            MotionEvent motionEvent2 = (MotionEvent) obj2;
            float floatValue = ((Number) obj3).floatValue();
            float floatValue2 = ((Number) obj4).floatValue();
            C87412m.m108594g(motionEvent, "e1");
            C87412m.m108594g(motionEvent2, "e2");
            C39818r rVar = C39818r.f106831a;
            Context context = this.f12636d.f173499A;
            C87412m.m108593f(context, "holder.context");
            FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = (FinderHorizontalVideoDrawerUIC) rVar.mo62443b(context).mo62449e(FinderHorizontalVideoDrawerUIC.class);
            return Boolean.valueOf(finderHorizontalVideoDrawerUIC != null ? finderHorizontalVideoDrawerUIC.mo5141e3().onFling(motionEvent, motionEvent2, floatValue, floatValue2) : false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$g1 */
    public static final class C2342g1 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12637d;

        /* renamed from: e */
        public final /* synthetic */ String f12638e;

        /* renamed from: f */
        public final /* synthetic */ T f12639f;

        /* renamed from: g */
        public final /* synthetic */ C89349b f12640g;

        /* renamed from: h */
        public final /* synthetic */ FinderFeedFullConvert<T> f12641h;

        /* renamed from: i */
        public final /* synthetic */ C50673of1 f12642i;

        /* renamed from: j */
        public final /* synthetic */ C89349b f12643j;

        public C2342g1(C60905o oVar, String str, T t, C89349b bVar, FinderFeedFullConvert<T> finderFeedFullConvert, C50673of1 of12, C89349b bVar2) {
            this.f12637d = oVar;
            this.f12638e = str;
            this.f12639f = t;
            this.f12640g = bVar;
            this.f12641h = finderFeedFullConvert;
            this.f12642i = of12;
            this.f12643j = bVar2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshHotSearch$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            String str = this.f12638e;
            T t = this.f12639f;
            C89349b bVar = this.f12640g;
            FinderFeedFullConvert<T> finderFeedFullConvert = this.f12641h;
            C50673of1 of12 = this.f12642i;
            C89349b bVar2 = this.f12643j;
            intent.putExtra("key_search_query", str);
            boolean z = true;
            intent.putExtra("key_search_is_from_feed_list", true);
            intent.putExtra("key_search_feed_id", t.mo3513o().getId());
            if (bVar != null) {
                intent.putExtra("key_search_session_buffer", bVar.mo123703f());
            }
            finderFeedFullConvert.getClass();
            LinkedList<C48727ak1> linkedList = of12.f139137e;
            if (linkedList == null || linkedList.size() != 0) {
                z = false;
            }
            SearchHotWordListParcelable a = !z ? SearchHotWordListParcelable.CREATOR.mo3935a(of12.f139136d, 0, of12.f139137e) : null;
            if (a != null) {
                intent.putExtra("key_search_hot_word_info", a);
            }
            if (bVar2 != null) {
                intent.putExtra("key_search_hot_word_buffer", bVar2.mo123703f());
            }
            intent.putExtra("key_entrance_type", 8);
            Context context = this.f12637d.f173499A;
            C87412m.m108593f(context, "holder.context");
            ((C58684b) C86312j.m106911c(C58684b.class)).Hx0(context, (C50972qk0) null, intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshHotSearch$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$h */
    public static final class C2343h extends C7290r {

        /* renamed from: d */
        public final /* synthetic */ View f12644d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12645e;

        /* renamed from: f */
        public final /* synthetic */ T f12646f;

        public C2343h(View view, C60905o oVar, T t) {
            this.f12644d = view;
            this.f12645e = oVar;
            this.f12646f = t;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f12644d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$checkShowFollowLikeLayout$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$checkShowFollowLikeLayout$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
            Context context = this.f12645e.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13442s8 f = aVar2.mo12873f(context);
            C7435f2.m7551e(f2Var, f != null ? f.mo12861q3() : null, "follow_like", true, this.f12646f.getItemId(), (JSONObject) null, (String) null, 48, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$h0 */
    public static final class C2344h0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12647d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2344h0(C60905o oVar) {
            super(0);
            this.f12647d = oVar;
        }

        public Object invoke() {
            C39818r rVar = C39818r.f106831a;
            Context context = this.f12647d.f173499A;
            C87412m.m108593f(context, "holder.context");
            FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = (FinderHorizontalVideoDrawerUIC) rVar.mo62443b(context).mo62449e(FinderHorizontalVideoDrawerUIC.class);
            if (finderHorizontalVideoDrawerUIC != null && finderHorizontalVideoDrawerUIC.f18677g) {
                FinderDraggableLayout.m4280l(finderHorizontalVideoDrawerUIC.mo5141e3(), 0, false, 3, (Object) null);
                finderHorizontalVideoDrawerUIC.f18677g = false;
            }
            Context context2 = this.f12647d.f173499A;
            C87412m.m108593f(context2, "holder.context");
            ((C13194da) rVar.mo62443b(context2).mo75002a(C13194da.class)).mo12686d3();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$h1 */
    public static final class C2345h1 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12648d;

        public C2345h1(C60905o oVar) {
            this.f12648d = oVar;
        }

        /* JADX WARNING: type inference failed for: r8v7, types: [android.view.View] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshManagerFav$1$1"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                jq3.o r8 = r7.f12648d
                java.lang.Object r0 = r8.f173503E
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
                android.content.Context r8 = r8.f173499A
                boolean r1 = r8 instanceof android.app.Activity
                r2 = 0
                if (r1 == 0) goto L_0x002b
                android.app.Activity r8 = (android.app.Activity) r8
                goto L_0x002c
            L_0x002b:
                r8 = r2
            L_0x002c:
                if (r8 == 0) goto L_0x0038
                r1 = 2131302826(0x7f0919aa, float:1.822375E38)
                android.view.View r8 = r8.findViewById(r1)
                r2 = r8
                com.tencent.mm.plugin.finder.view.FinderFavDrawer r2 = (com.tencent.p014mm.plugin.finder.view.FinderFavDrawer) r2
            L_0x0038:
                if (r2 == 0) goto L_0x0050
                com.tencent.mm.plugin.finder.storage.FinderItem r8 = r0.mo3513o()
                java.lang.String r0 = "feedObj"
                gy3.C87412m.m108594g(r8, r0)
                boolean r0 = r2.mo82541i()
                if (r0 != 0) goto L_0x0050
                r2.f162099B = r8
                r8 = 0
                r0 = 1
                r2.mo82542j(r0, r0, r8)
            L_0x0050:
                java.lang.String r8 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshManagerFav$1$1"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.C2345h1.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$i */
    public static final class C2346i extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C2346i f12649d = new C2346i();

        public C2346i() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C85875k4.m106184h(MMApplicationContext.getContext()).y);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$i0 */
    public static final class C2347i0 extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ T f12650d;

        /* renamed from: e */
        public final /* synthetic */ FinderFeedFullConvert<T> f12651e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f12652f;

        /* renamed from: g */
        public final /* synthetic */ int f12653g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2347i0(T t, FinderFeedFullConvert<T> finderFeedFullConvert, C60905o oVar, int i) {
            super(0);
            this.f12650d = t;
            this.f12651e = finderFeedFullConvert;
            this.f12652f = oVar;
            this.f12653g = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x0290  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0292  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r24 = this;
                r0 = r24
                com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_PRIVATE_LIKE_GUIDE_LAST_SHOW_TIME_LONG_SYNC
                java.lang.Class<rs1.y7> r2 = rs1.C13549y7.class
                up1.f r3 = up1.C37521f.f99374d
                r3.getClass()
                pe1.c<java.lang.Integer> r3 = up1.C37521f.f99208J7
                java.lang.Object r3 = r3.mo60266n()
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                java.lang.String r4 = "Finder.FeedFullConvert"
                r5 = 0
                r6 = 1
                if (r3 != r6) goto L_0x0294
                vq1.g r3 = vq1.C65854g.f189373e
                T r7 = r0.f12650d
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
                boolean r3 = r3.mo89893c(r7)
                java.lang.String r7 = "[onPrivateLikeClickListener] private Like clicked, fav feed"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r4 = r0.f12651e
                jq3.o r7 = r0.f12652f
                r8 = 4
                r4.mo2328y(r7, r8)
                pe1.c<java.lang.Integer> r4 = up1.C37521f.f99235M7
                java.lang.Object r4 = r4.mo60266n()
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r4.intValue()
                r7 = 2131297500(0x7f0904dc, float:1.8212947E38)
                java.lang.String r9 = "holder"
                java.lang.String r10 = "holder.context"
                if (r4 != r6) goto L_0x0203
                bl3.r r4 = bl3.C39818r.f106831a
                jq3.o r11 = r0.f12652f
                android.content.Context r11 = r11.f173499A
                gy3.C87412m.m108593f(r11, r10)
                bl3.r$a r4 = r4.mo62443b(r11)
                androidx.lifecycle.i0 r2 = r4.mo75002a(r2)
                r18 = r2
                rs1.y7 r18 = (rs1.C13549y7) r18
                jq3.o r2 = r0.f12652f
                r18.getClass()
                gy3.C87412m.m108594g(r2, r9)
                android.view.View r4 = r2.mo85812D(r7)
                if (r4 != 0) goto L_0x0074
                goto L_0x011b
            L_0x0074:
                r7 = 2131313036(0x7f09418c, float:1.8244457E38)
                android.view.View r7 = r4.findViewById(r7)
                com.tencent.mm.ui.widget.imageview.WeImageView r7 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r7
                if (r7 != 0) goto L_0x0081
                goto L_0x011b
            L_0x0081:
                r9 = 2131313039(0x7f09418f, float:1.8244464E38)
                android.view.View r9 = r4.findViewById(r9)
                android.widget.TextView r9 = (android.widget.TextView) r9
                if (r9 != 0) goto L_0x008e
                goto L_0x011b
            L_0x008e:
                r10 = 2131306201(0x7f0926d9, float:1.8230594E38)
                android.view.View r10 = r2.mo85812D(r10)
                if (r10 != 0) goto L_0x0099
                goto L_0x011b
            L_0x0099:
                f40.o r11 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r11 = r11.mo121142i()
                com.tencent.mm.storage.y1$a r15 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_PRIVATE_LIKE_GUIDE_DIALOG_SHOW_COUNT_ANIMATE_INT_SYNC
                int r14 = r11.mo119689j(r15, r5)
                if (r14 < r6) goto L_0x00aa
                goto L_0x011b
            L_0x00aa:
                android.graphics.Rect r13 = new android.graphics.Rect
                r13.<init>()
                r4.getGlobalVisibleRect(r13)
                android.graphics.Rect r11 = new android.graphics.Rect
                r11.<init>()
                r10.getGlobalVisibleRect(r11)
                int r12 = r13.left
                int r6 = r11.left
                int r5 = r12 - r6
                int r8 = r11.top
                r17 = r14
                int r14 = r13.top
                int r8 = r8 - r14
                float r12 = (float) r12
                float r5 = (float) r5
                r19 = 1061997773(0x3f4ccccd, float:0.8)
                float r5 = r5 * r19
                float r12 = r12 - r5
                int r5 = (int) r12
                float r12 = (float) r14
                float r8 = (float) r8
                r14 = 1036831949(0x3dcccccd, float:0.1)
                float r8 = r8 * r14
                float r12 = r12 + r8
                int r8 = (int) r12
                int r12 = r10.getWidth()
                int r14 = r4.getWidth()
                int r12 = r12 - r14
                int r12 = r12 / 2
                int r6 = r6 + r12
                int r11 = r11.top
                int r10 = r10.getHeight()
                int r12 = r4.getWidth()
                int r10 = r10 - r12
                int r10 = r10 / 2
                int r19 = r10 + r11
                android.app.Activity r10 = r18.getContext()
                android.view.LayoutInflater r10 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r10)
                r11 = 2131495513(0x7f0c0a59, float:1.8614565E38)
                r12 = 0
                android.view.View r14 = r10.inflate(r11, r12)
                r10 = 2131313037(0x7f09418d, float:1.824446E38)
                android.view.View r10 = r14.findViewById(r10)
                com.tencent.mm.ui.widget.imageview.WeImageView r10 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r10
                if (r10 != 0) goto L_0x0110
                goto L_0x011b
            L_0x0110:
                r11 = 2131313040(0x7f094190, float:1.8244466E38)
                android.view.View r11 = r14.findViewById(r11)
                android.widget.TextView r11 = (android.widget.TextView) r11
                if (r11 != 0) goto L_0x0122
            L_0x011b:
                r22 = r3
                r2 = 1
                r6 = 0
                r3 = r0
                goto L_0x028e
            L_0x0122:
                int r12 = r4.getPaddingLeft()
                r21 = r15
                int r15 = r4.getPaddingTop()
                r22 = r3
                int r3 = r4.getPaddingRight()
                int r0 = r4.getPaddingBottom()
                r14.setPadding(r12, r15, r3, r0)
                int r0 = r4.getMinimumWidth()
                r14.setMinimumWidth(r0)
                android.graphics.drawable.Drawable r0 = r7.getDrawable()
                r10.setImageDrawable(r0)
                int r0 = r7.getIconColor()
                r10.setIconColor(r0)
                java.lang.CharSequence r0 = r9.getText()
                r11.setText(r0)
                android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
                r3 = -2
                r0.<init>(r3, r3)
                int r3 = r13.left
                r0.leftMargin = r3
                int r3 = r13.top
                r0.topMargin = r3
                r14.setLayoutParams(r0)
                android.view.View r0 = r2.f44854d
                boolean r3 = r0 instanceof android.view.ViewGroup
                if (r3 == 0) goto L_0x0170
                r12 = r0
                android.view.ViewGroup r12 = (android.view.ViewGroup) r12
                goto L_0x0171
            L_0x0170:
                r12 = 0
            L_0x0171:
                if (r12 == 0) goto L_0x0176
                r12.addView(r14)
            L_0x0176:
                k20.a r0 = new k20.a
                r0.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                r3 = 4
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.mo10233c(r3)
                java.lang.Object[] r11 = r0.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderPrivateLikeMigrateUIC"
                java.lang.String r3 = "showPrivateLikeGuideAnimate"
                java.lang.String r7 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r9 = "(I)V"
                r10 = r4
                r20 = r13
                r13 = r3
                r23 = r14
                r3 = r17
                r14 = r7
                r7 = r21
                r17 = r9
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                r9 = 0
                java.lang.Object r0 = r0.mo10231a(r9)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r4.setVisibility(r0)
                java.lang.String r11 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderPrivateLikeMigrateUIC"
                java.lang.String r12 = "showPrivateLikeGuideAnimate"
                java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                rs1.a8 r0 = new rs1.a8
                r10 = r0
                r11 = r20
                r12 = r5
                r13 = r8
                r14 = r6
                r15 = r19
                r16 = r23
                r17 = r2
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
                r2 = r23
                r2.post(r0)
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                r2 = 1
                int r14 = r3 + 1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
                r0.mo119677K(r7, r2)
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                long r2 = eb0.C31543z5.m39453c()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r0.mo119677K(r1, r2)
                goto L_0x028a
            L_0x0203:
                r22 = r3
                pe1.c<java.lang.Integer> r0 = up1.C37521f.f99217K7
                java.lang.Object r0 = r0.mo60266n()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r3 = 1
                if (r0 != r3) goto L_0x028a
                bl3.r r0 = bl3.C39818r.f106831a
                r3 = r24
                jq3.o r4 = r3.f12652f
                android.content.Context r4 = r4.f173499A
                gy3.C87412m.m108593f(r4, r10)
                bl3.r$a r0 = r0.mo62443b(r4)
                androidx.lifecycle.i0 r0 = r0.mo75002a(r2)
                rs1.y7 r0 = (rs1.C13549y7) r0
                jq3.o r2 = r3.f12652f
                r0.getClass()
                gy3.C87412m.m108594g(r2, r9)
                android.view.View r2 = r2.mo85812D(r7)
                if (r2 != 0) goto L_0x0238
                goto L_0x028c
            L_0x0238:
                f40.o r4 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r4 = r4.mo121142i()
                com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_PRIVATE_LIKE_GUIDE_DIALOG_SHOW_COUNT_INT_SYNC
                r6 = 0
                int r4 = r4.mo119689j(r5, r6)
                r7 = 1
                if (r4 < r7) goto L_0x024c
                r2 = 1
                goto L_0x028e
            L_0x024c:
                android.view.ViewPropertyAnimator r4 = r2.animate()
                r7 = 0
                android.view.ViewPropertyAnimator r4 = r4.alpha(r7)
                r7 = 300(0x12c, double:1.48E-321)
                android.view.ViewPropertyAnimator r4 = r4.setDuration(r7)
                rs1.b8 r7 = new rs1.b8
                r7.<init>(r2)
                r4.setListener(r7)
                r0.mo12954c3()
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                r2 = 1
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                r0.mo119677K(r5, r4)
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                long r4 = eb0.C31543z5.m39453c()
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r0.mo119677K(r1, r4)
                goto L_0x028e
            L_0x028a:
                r3 = r24
            L_0x028c:
                r2 = 1
                r6 = 0
            L_0x028e:
                if (r22 != 0) goto L_0x0292
                r5 = 1
                goto L_0x02d9
            L_0x0292:
                r5 = 0
                goto L_0x02d9
            L_0x0294:
                r3 = r0
                vq1.w r0 = vq1.C65866w.f189407h
                T r1 = r3.f12650d
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                rx3.l r0 = r0.mo89908g(r1)
                A r1 = r0.f38555d
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                B r0 = r0.f38556e
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r1 == 0) goto L_0x02ca
                if (r0 != 0) goto L_0x02ca
                java.lang.String r0 = "[onPrivateLikeClickListener] cancel normal like before private liek action happens."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r5 = r3.f12651e
                jq3.o r6 = r3.f12652f
                r7 = 1
                r8 = 0
                r9 = 0
                int r10 = r3.f12653g
                r5.mo2266J(r6, r7, r8, r9, r10)
            L_0x02ca:
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r11 = r3.f12651e
                jq3.o r12 = r3.f12652f
                r13 = 1
                r14 = 1
                r15 = 0
                int r0 = r3.f12653g
                r16 = r0
                boolean r5 = r11.mo2266J(r12, r13, r14, r15, r16)
            L_0x02d9:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.C2347i0.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$i1 */
    public static final class C2348i1<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ WeImageView f12654a;

        /* renamed from: b */
        public final /* synthetic */ C60905o f12655b;

        public C2348i1(WeImageView weImageView, C60905o oVar) {
            this.f12654a = weImageView;
            this.f12655b = oVar;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            C61926c.m72668M(new C2419b((Bitmap) obj, this.f12654a, this.f12655b));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$j */
    public static final class C2349j extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12656d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2349j(FinderFeedFullConvert<T> finderFeedFullConvert) {
            super(0);
            this.f12656d = finderFeedFullConvert;
        }

        public Object invoke() {
            AppCompatActivity context;
            Intent intent;
            MMActivity activity = this.f12656d.f12564e.getActivity();
            int i = 0;
            if (!(activity == null || (context = activity.getContext()) == null || (intent = context.getIntent()) == null)) {
                i = intent.getIntExtra("key_feed_report_enter", 0);
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$j0 */
    public static final class C2350j0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12657d;

        /* renamed from: e */
        public final /* synthetic */ FinderFullSeekBarLayout f12658e;

        /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$j0$a */
        public static final class C2351a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderFullSeekBarLayout f12659d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2351a(FinderFullSeekBarLayout finderFullSeekBarLayout) {
                super(0);
                this.f12659d = finderFullSeekBarLayout;
            }

            public Object invoke() {
                this.f12659d.mo4259i("SelectPlaySpeed");
                return C13598b0.f38549a;
            }
        }

        public C2350j0(C60905o oVar, FinderFullSeekBarLayout finderFullSeekBarLayout) {
            this.f12657d = oVar;
            this.f12658e = finderFullSeekBarLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$7$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ArrayList arrayList2 = new ArrayList();
            View D = this.f12657d.mo85812D(C0966R.C0970id.d97);
            if (D != null) {
                arrayList2.add(D);
            }
            arrayList2.add(this.f12658e.getSeekLayout());
            FinderVideoLayout finderVideoLayout = (FinderVideoLayout) this.f12657d.mo85812D(C0966R.C0970id.d7a);
            C59670o2 videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
            FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) videoView : null;
            if (finderThumbPlayerProxy != null) {
                C60905o oVar = this.f12657d;
                FinderFullSeekBarLayout finderFullSeekBarLayout = this.f12658e;
                C39818r rVar = C39818r.f106831a;
                Context context = oVar.f173499A;
                C87412m.m108592e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                C39622i0 a = rVar.mo62444c((AppCompatActivity) context).mo75002a(C13194da.class);
                C87412m.m108593f(a, "UICProvider.of(holder.co…edControlUIC::class.java)");
                C13194da.m12605k3((C13194da) a, arrayList2, finderThumbPlayerProxy, 0, false, new C2351a(finderFullSeekBarLayout), 12, (Object) null);
            }
            this.f12658e.mo4295t();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$7$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$j1 */
    public static final class C2352j1 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12660d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12661e;

        public C2352j1(FinderFeedFullConvert<T> finderFeedFullConvert, C60905o oVar) {
            this.f12660d = finderFeedFullConvert;
            this.f12661e = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshMoreBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderFeedFullConvert<T> finderFeedFullConvert = this.f12660d;
            C60905o oVar = this.f12661e;
            Object obj = oVar.f173503E;
            C87412m.m108593f(obj, "holder.getAssociatedObject()");
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            finderFeedFullConvert.mo2272M(oVar, (BaseFinderFeed) obj, view, 2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshMoreBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$k */
    public static final class C2353k extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12662d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2353k(FinderFeedFullConvert<T> finderFeedFullConvert) {
            super(0);
            this.f12662d = finderFeedFullConvert;
        }

        public Object invoke() {
            AppCompatActivity context;
            Intent intent;
            MMActivity activity = this.f12662d.f12564e.getActivity();
            int i = 0;
            if (!(activity == null || (context = activity.getContext()) == null || (intent = context.getIntent()) == null)) {
                i = intent.getIntExtra("key_feed_report_enter_type", 0);
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$k0 */
    public static final class C2354k0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12663d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12664e;

        public C2354k0(FinderFeedFullConvert<T> finderFeedFullConvert, C60905o oVar) {
            this.f12663d = finderFeedFullConvert;
            this.f12664e = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderFeedFullConvert<T> finderFeedFullConvert = this.f12663d;
            C60905o oVar = this.f12664e;
            Object obj = oVar.f173503E;
            C87412m.m108593f(obj, "holder.getAssociatedObject()");
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            finderFeedFullConvert.mo2272M(oVar, (BaseFinderFeed) obj, view, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$k1 */
    public static final class C2355k1 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C50394mf1 f12665d;

        /* renamed from: e */
        public final /* synthetic */ FinderItem f12666e;

        /* renamed from: f */
        public final /* synthetic */ FinderFeedFullConvert<T> f12667f;

        /* renamed from: g */
        public final /* synthetic */ String f12668g;

        /* renamed from: h */
        public final /* synthetic */ C60905o f12669h;

        /* renamed from: i */
        public final /* synthetic */ View f12670i;

        public C2355k1(C50394mf1 mf12, FinderItem finderItem, FinderFeedFullConvert<T> finderFeedFullConvert, String str, C60905o oVar, View view) {
            this.f12665d = mf12;
            this.f12666e = finderItem;
            this.f12667f = finderFeedFullConvert;
            this.f12668g = str;
            this.f12669h = oVar;
            this.f12670i = view;
        }

        public final void onClick(View view) {
            long j;
            FinderObject feedObject;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshNewsLayout$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            long j2 = 0;
            if (this.f12665d.f138000g > 0) {
                Intent intent = new Intent();
                intent.putExtra("key_topic_type", this.f12665d.f137999f);
                intent.putExtra("key_topic_title", this.f12665d.f137998e);
                intent.putExtra("KEY_TOPIC_ID", this.f12665d.f137997d);
                C89349b bVar = this.f12665d.f138001h;
                if (bVar != null) {
                    intent.putExtra("KEY_HOT_TOPIC_BUFFER", bVar.f257327a);
                }
                intent.putExtra("key_hot_topic_type", this.f12665d.f137999f);
                FinderItem finderItem = this.f12666e;
                Long l = null;
                intent.putExtra("KEY_CLICK_FEED_ID", finderItem != null ? Long.valueOf(finderItem.getId()) : null);
                FinderItem finderItem2 = this.f12666e;
                if (finderItem2 != null) {
                    l = Long.valueOf(finderItem2.getId());
                }
                intent.putExtra("key_ref_object_id", l);
                intent.putExtra("KEY_TAB_TYPE", this.f12667f.f12566g);
                String str = this.f12668g;
                if (str == null) {
                    str = "";
                }
                intent.putExtra("key_from_user", str);
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = this.f12669h.f173499A;
                C87412m.m108593f(context, "holder.context");
                C13442s8.C13443a.m12791e(aVar, context, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
                Context context2 = this.f12669h.f173499A;
                C87412m.m108593f(context2, "holder.context");
                ((C58684b) C86312j.m106911c(C58684b.class)).ty0(context2, intent);
                j = 1;
            } else {
                FinderFeedFullConvert<T> finderFeedFullConvert = this.f12667f;
                Object obj = this.f12669h.f173503E;
                C87412m.m108593f(obj, "holder.getAssociatedObject()");
                boolean I = finderFeedFullConvert.mo2264I((BaseFinderFeed) obj);
                Log.m105924i("Finder.FeedFullConvert", "[refreshNewsLayout] hot news not support jump! isShowRealNameRecommendLayout=" + I);
                if (I) {
                    View view2 = this.f12670i;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshNewsLayout$2$3$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshNewsLayout$2$3$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                j = 0;
            }
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
            FinderItem finderItem3 = this.f12666e;
            if (!(finderItem3 == null || (feedObject = finderItem3.getFeedObject()) == null)) {
                j2 = feedObject.f164794id;
            }
            long j3 = j2;
            C50394mf1 mf12 = this.f12665d;
            long j4 = mf12.f137997d;
            String str2 = mf12.f137998e;
            String str3 = str2 == null ? "" : str2;
            C13442s8.C13443a aVar3 = C13442s8.f38060Q0;
            Context context3 = this.f12669h.f173499A;
            C87412m.m108593f(context3, "holder.context");
            C13442s8 f = aVar3.mo12873f(context3);
            y0Var.Ky0(j3, 2, j4, str3, j, f != null ? f.f38096i : 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshNewsLayout$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$l */
    public static final class C2356l extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C2356l f12671d = new C2356l();

        public C2356l() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            return C37521f.f99228M.mo60266n();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$l0 */
    public static final class C2357l0 implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12672d;

        /* renamed from: e */
        public final /* synthetic */ T f12673e;

        public C2357l0(C60905o oVar, T t) {
            this.f12672d = oVar;
            this.f12673e = t;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0028, code lost:
            r8 = r8.getPlayInfo();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onLongClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$9"
                java.lang.String r2 = "android/view/View$OnLongClickListener"
                java.lang.String r3 = "onLongClick"
                java.lang.String r4 = "(Landroid/view/View;)Z"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                jq3.o r8 = r7.f12672d
                r0 = 2131302685(0x7f09191d, float:1.8223463E38)
                android.view.View r8 = r8.mo85812D(r0)
                com.tencent.mm.plugin.finder.video.FinderVideoLayout r8 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r8
                if (r8 == 0) goto L_0x0031
                com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r8 = r8.getPlayInfo()
                if (r8 == 0) goto L_0x0031
                pl1.r0 r8 = r8.f161894c
                goto L_0x0032
            L_0x0031:
                r8 = 0
            L_0x0032:
                bl3.r r0 = bl3.C39818r.f106831a
                jq3.o r1 = r7.f12672d
                android.content.Context r1 = r1.f173499A
                java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
                gy3.C87412m.m108592e(r1, r2)
                com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
                bl3.r$a r0 = r0.mo62444c(r1)
                java.lang.Class<rs1.d1> r1 = rs1.C13176d1.class
                androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
                rs1.d1 r0 = (rs1.C13176d1) r0
                jq3.o r1 = r7.f12672d
                android.content.Context r1 = r1.f173499A
                java.lang.String r2 = "holder.context"
                gy3.C87412m.m108593f(r1, r2)
                T r2 = r7.f12673e
                jq3.o r3 = r7.f12672d
                r0.mo12676d3(r1, r2, r8, r3)
                jq3.o r8 = r7.f12672d
                androidx.recyclerview.widget.RecyclerView r8 = r8.mo85811C()
                r8.requestLayout()
                r8 = 1
                r0 = 1
                java.lang.String r2 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$9"
                java.lang.String r3 = "android/view/View$OnLongClickListener"
                java.lang.String r4 = "onLongClick"
                java.lang.String r5 = "(Landroid/view/View;)Z"
                r1 = r7
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.C2357l0.onLongClick(android.view.View):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$l1 */
    public static final class C2358l1 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12674d;

        /* renamed from: e */
        public final /* synthetic */ T f12675e;

        /* renamed from: f */
        public final /* synthetic */ FinderFeedFullConvert<T> f12676f;

        public C2358l1(C60905o oVar, T t, FinderFeedFullConvert<T> finderFeedFullConvert) {
            this.f12674d = oVar;
            this.f12675e = t;
            this.f12676f = finderFeedFullConvert;
        }

        public final void onClick(View view) {
            Class cls = C58417y0.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshNickname$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f12674d.mo17363j() == 0) {
                C39818r rVar = C39818r.f106831a;
                Context context = this.f12674d.f173499A;
                C87412m.m108593f(context, "holder.context");
                C60592c cVar = ((C60593d) rVar.mo62443b(context).mo75002a(C60593d.class)).f172693f;
                if (cVar != null) {
                    cVar.mo85549a();
                    cVar.mo85550b("nickname");
                }
            }
            C49712hj1 hj12 = null;
            if (C58784w3.f168295a.mo83932g1(this.f12674d, this.f12675e.mo3513o().getFeedObject(), (Integer) null)) {
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context2 = this.f12674d.f173499A;
                C87412m.m108593f(context2, "holder.context");
                C13442s8 f = aVar.mo12873f(context2);
                ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9610ca(this.f12675e, (long) this.f12674d.mo17363j(), String.valueOf(f != null ? f.f38096i : 0));
                if (this.f12674d.f173499A instanceof MMActivity) {
                    ((C58417y0) C86312j.m106911c(cls)).wx0(this.f12674d, this.f12675e.getItemId(), this.f12675e.mo3513o());
                    C39818r rVar2 = C39818r.f106831a;
                    Context context3 = this.f12674d.f173499A;
                    C87412m.m108592e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    C39622i0 a = rVar2.mo62444c((MMActivity) context3).mo75002a(C13442s8.class);
                    C87412m.m108593f(a, "UICProvider.of(holder.co…rReporterUIC::class.java)");
                    C7322a b = C60172g4.C60173a.m70190b((C60172g4) a, 0, 1, (Object) null);
                    if (b != null) {
                        b.mo8766a(new C7322a.C7323a(9, this.f12675e.getItemId()));
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("finderusername", this.f12675e.mo3513o().getUserName());
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "kvJson.toString()");
                String n = C112551y.m153814n(jSONObject2, ",", ";", false);
                Context context4 = this.f12674d.f173499A;
                C87412m.m108593f(context4, "holder.context");
                C13442s8 f2 = aVar.mo12873f(context4);
                if (f2 != null) {
                    hj12 = f2.mo12861q3();
                }
                y0Var.Cx0(1, "link_avatar_profile", n, hj12);
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshNickname$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            this.f12676f.mo2311p(this.f12674d, -1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshNickname$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$m */
    public static final class C2359m extends C87413o implements C32226l<FinderJumpInfo, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderJumpInfo f12677d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2359m(FinderJumpInfo finderJumpInfo) {
            super(1);
            this.f12677d = finderJumpInfo;
        }

        public Object invoke(Object obj) {
            FinderJumpInfo finderJumpInfo = (FinderJumpInfo) obj;
            C87412m.m108594g(finderJumpInfo, LocaleUtil.ITALIAN);
            return Boolean.valueOf(C87412m.m108589b(finderJumpInfo.jump_id, this.f12677d.jump_id));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$m0 */
    public static final class C2360m0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12678d;

        /* renamed from: e */
        public final /* synthetic */ T f12679e;

        /* renamed from: f */
        public final /* synthetic */ FinderFeedFullConvert<T> f12680f;

        public C2360m0(C60905o oVar, T t, FinderFeedFullConvert<T> finderFeedFullConvert) {
            this.f12678d = oVar;
            this.f12679e = t;
            this.f12680f = finderFeedFullConvert;
        }

        public final void onClick(View view) {
            Class cls = C58417y0.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$onAvatarClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f12678d.mo17363j() == 0) {
                C39818r rVar = C39818r.f106831a;
                Context context = this.f12678d.f173499A;
                C87412m.m108593f(context, "holder.context");
                C60592c cVar = ((C60593d) rVar.mo62443b(context).mo75002a(C60593d.class)).f172693f;
                if (cVar != null) {
                    cVar.mo85549a();
                    cVar.mo85550b("headimage");
                }
            }
            C49712hj1 hj12 = null;
            if (C58784w3.f168295a.mo83932g1(this.f12678d, this.f12679e.mo3513o().getFeedObject(), (Integer) null)) {
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context2 = this.f12678d.f173499A;
                C87412m.m108593f(context2, "holder.context");
                C13442s8 f = aVar.mo12873f(context2);
                ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9610ca(this.f12679e, (long) this.f12678d.mo17363j(), String.valueOf(f != null ? f.f38096i : 0));
                if (this.f12678d.f173499A instanceof MMActivity) {
                    ((C58417y0) C86312j.m106911c(cls)).wx0(this.f12678d, this.f12679e.getItemId(), this.f12679e.mo3513o());
                    C39818r rVar2 = C39818r.f106831a;
                    Context context3 = this.f12678d.f173499A;
                    C87412m.m108592e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    C39622i0 a = rVar2.mo62444c((MMActivity) context3).mo75002a(C13442s8.class);
                    C87412m.m108593f(a, "UICProvider.of(holder.co…rReporterUIC::class.java)");
                    C7322a b = C60172g4.C60173a.m70190b((C60172g4) a, 0, 1, (Object) null);
                    if (b != null) {
                        b.mo8766a(new C7322a.C7323a(9, this.f12679e.getItemId()));
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("finderusername", this.f12679e.mo3513o().getUserName());
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "kvJson.toString()");
                String n = C112551y.m153814n(jSONObject2, ",", ";", false);
                Context context4 = this.f12678d.f173499A;
                C87412m.m108593f(context4, "holder.context");
                C13442s8 f2 = aVar.mo12873f(context4);
                if (f2 != null) {
                    hj12 = f2.mo12861q3();
                }
                y0Var.Cx0(1, "link_avatar_profile", n, hj12);
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$onAvatarClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            this.f12680f.mo2311p(this.f12678d, 5);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$onAvatarClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$m1 */
    public static final class C2361m1 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12681d;

        public C2361m1(FinderFeedFullConvert<T> finderFeedFullConvert) {
            this.f12681d = finderFeedFullConvert;
        }

        public final void run() {
            ValueAnimator valueAnimator = this.f12681d.f12558E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$n */
    public static final class C2362n extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12682d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2362n(FinderFeedFullConvert<T> finderFeedFullConvert) {
            super(0);
            this.f12682d = finderFeedFullConvert;
        }

        public Object invoke() {
            Intent intent;
            MMActivity activity = this.f12682d.f12564e.getActivity();
            boolean z = true;
            if (activity == null || (intent = activity.getIntent()) == null || !intent.getBooleanExtra("is_from_ad", false)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$n0 */
    public static final class C2363n0 implements C77407n.C47880p {

        /* renamed from: a */
        public final /* synthetic */ View f12683a;

        /* renamed from: b */
        public final /* synthetic */ C60905o f12684b;

        /* renamed from: c */
        public final /* synthetic */ FinderFeedFullConvert<T> f12685c;

        /* renamed from: d */
        public final /* synthetic */ T f12686d;

        /* renamed from: e */
        public final /* synthetic */ int f12687e;

        public C2363n0(View view, C60905o oVar, FinderFeedFullConvert<T> finderFeedFullConvert, T t, int i) {
            this.f12683a = view;
            this.f12684b = oVar;
            this.f12685c = finderFeedFullConvert;
            this.f12686d = t;
            this.f12687e = i;
        }

        public final void onDismiss() {
            this.f12683a.setTag(Boolean.FALSE);
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = this.f12684b.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13442s8 f = aVar.mo12873f(context);
            C49712hj1 hj12 = null;
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0.ky0((C58417y0) c, ((BaseFinderFeed) this.f12684b.f173503E).mo3513o().getId(), 2, 3, "", q3, 0, (FinderItem) null, 96, (Object) null);
            Context context2 = this.f12684b.f173499A;
            C87412m.m108593f(context2, "holder.context");
            C64291co3 co32 = (C64291co3) ((C77049b) C86312j.m106911c(C77049b.class)).mo72351Ok(context2, 14, C64291co3.class);
            if (co32 != null) {
                co32.f182539d = 1;
                co32.f182547o = (int) (SystemClock.elapsedRealtime() - co32.f182550r);
                co32.f182544i = 1;
            }
            C62001a aVar2 = C62001a.f176265a;
            Context context3 = this.f12684b.f173499A;
            C87412m.m108593f(context3, "holder.context");
            aVar2.mo86878a(context3);
            C7888v2.f26513a.getClass();
            C7888v2.C7889a.f26516c = 0;
            C7433e1 e1Var = C7433e1.f25622a;
            C7433e1.f25623b = 0;
            C39818r rVar = C39818r.f106831a;
            Context context4 = this.f12684b.f173499A;
            C87412m.m108593f(context4, "holder.context");
            FinderDescPanelUIC finderDescPanelUIC = (FinderDescPanelUIC) rVar.mo62443b(context4).mo62449e(FinderDescPanelUIC.class);
            if (finderDescPanelUIC != null) {
                finderDescPanelUIC.mo5122j3(this.f12684b);
            }
            MMActivity activity = this.f12685c.f12564e.getActivity();
            long itemId = this.f12686d.getItemId();
            int i = this.f12687e;
            C87412m.m108594g(activity, "context");
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8 f2 = aVar.mo12873f(activity);
            if (f2 != null) {
                hj12 = f2.mo12861q3();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_action", i == 1 ? 1 : 2);
            jSONObject.put("feedid", C61926c.m72691p(itemId));
            C13598b0 b0Var = C13598b0.f38549a;
            f2Var.mo8577a(hj12, "menu_outside", 1, jSONObject);
            e1Var.mo8574c(this.f12685c.f12564e.getActivity(), this.f12686d.getItemId(), this.f12687e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$n1 */
    public static final class C2364n1 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12688d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12689e;

        /* renamed from: f */
        public final /* synthetic */ List<ImageView> f12690f;

        /* renamed from: g */
        public final /* synthetic */ List<View> f12691g;

        /* renamed from: h */
        public final /* synthetic */ float f12692h;

        /* renamed from: i */
        public final /* synthetic */ int f12693i;

        public C2364n1(FinderFeedFullConvert<T> finderFeedFullConvert, C60905o oVar, List<ImageView> list, List<View> list2, float f, int i) {
            this.f12688d = finderFeedFullConvert;
            this.f12689e = oVar;
            this.f12690f = list;
            this.f12691g = list2;
            this.f12692h = f;
            this.f12693i = i;
        }

        public final void run() {
            ImageView imageView;
            FinderFeedFullConvert<T> finderFeedFullConvert = this.f12688d;
            C60905o oVar = this.f12689e;
            List<ImageView> list = this.f12690f;
            List<View> list2 = this.f12691g;
            float f = this.f12692h;
            boolean z = finderFeedFullConvert.f12560G;
            int i = this.f12693i;
            finderFeedFullConvert.getClass();
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) oVar.f173503E;
            LinkedList<FinderCommentInfo> e = C65866w.f189407h.mo89906e(baseFinderFeed.mo3513o().getFeedObject());
            RoundLinearLayout roundLinearLayout = (RoundLinearLayout) oVar.mo85812D(C0966R.C0970id.jdn);
            if (roundLinearLayout != null && (imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.f358541j70)) != null) {
                roundLinearLayout.setRadius(0.1f);
                roundLinearLayout.getChildAt(0).setBackground((Drawable) null);
                ((C76705f) C86312j.m106911c(C76705f.class)).D20(imageView, C75592q0.m90789s(), 0.0f);
                roundLinearLayout.setVisibility(0);
                View D = oVar.mo85812D(C0966R.C0970id.iei);
                if (D != null) {
                    View D2 = oVar.mo85812D(C0966R.C0970id.f1x);
                    Rect rect = new Rect();
                    D.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    D2.getGlobalVisibleRect(rect2);
                    int i2 = rect2.top - rect.top;
                    int i3 = rect2.left - rect.left;
                    boolean z2 = z;
                    int size = e.size() <= 3 ? (e.size() - 1) * i : e.size() > 3 ? i * 2 : 0;
                    int i4 = (int) (((float) rect2.left) - (((float) i3) * 0.5f));
                    int i5 = (int) (((float) rect2.top) - (((float) i2) * 2.0f));
                    int i6 = rect.left + size;
                    int b = rect.top + (e.size() != 1 ? C76577a.m92151b(oVar.f173499A, 2) : 0);
                    Path path = new Path();
                    path.moveTo((float) rect2.left, (float) rect2.top);
                    path.quadTo((float) i4, (float) i5, (float) i6, (float) b);
                    PathMeasure pathMeasure = new PathMeasure(path, false);
                    roundLinearLayout.setVisibility(0);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, pathMeasure.getLength()});
                    ofFloat.setDuration(500);
                    ofFloat.setInterpolator(new C14062a(0.6f));
                    C14546j1 j1Var = new C14546j1(baseFinderFeed, list2, finderFeedFullConvert, list, f, oVar, z2);
                    oVar.f44854d.postDelayed(new C2389v1(j1Var), 250);
                    ofFloat.addUpdateListener(new C14534h1(pathMeasure, new float[2], roundLinearLayout));
                    ofFloat.addListener(new C14540i1(finderFeedFullConvert, roundLinearLayout, list2, oVar, j1Var));
                    ofFloat.start();
                    finderFeedFullConvert.f12558E = ofFloat;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$o */
    public static final class C2365o extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12694d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2365o(FinderFeedFullConvert<T> finderFeedFullConvert) {
            super(0);
            this.f12694d = finderFeedFullConvert;
        }

        public Object invoke() {
            Intent intent;
            MMActivity activity = this.f12694d.f12564e.getActivity();
            boolean z = true;
            if (activity == null || (intent = activity.getIntent()) == null || !intent.getBooleanExtra("KEY_FINDER_SELF_FLAG", false)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$o0 */
    public static final class C2366o0 implements C77407n.C77419q {

        /* renamed from: a */
        public static final C2366o0 f12695a = new C2366o0();

        public final void onShow() {
            C7433e1.f25623b = C31543z5.m39453c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$o1 */
    public static final class C2367o1 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12696d;

        /* renamed from: e */
        public final /* synthetic */ T f12697e;

        /* renamed from: f */
        public final /* synthetic */ View f12698f;

        /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$o1$a */
        public static final class C2368a extends C7290r {

            /* renamed from: d */
            public final /* synthetic */ View f12699d;

            public C2368a(View view) {
                this.f12699d = view;
            }

            public void onAnimationEnd(Animator animator) {
                View view = this.f12699d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshRealNameRecommendLayout$2$6$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshRealNameRecommendLayout$2$6$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = this.f12699d;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(Float.valueOf(1.0f));
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshRealNameRecommendLayout$2$6$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshRealNameRecommendLayout$2$6$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }

        public C2367o1(C60905o oVar, T t, View view) {
            this.f12696d = oVar;
            this.f12697e = t;
            this.f12698f = view;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshRealNameRecommendLayout$2$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = this.f12696d.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13442s8 f = aVar.mo12873f(context);
            C7435f2.m7551e(f2Var, f != null ? f.mo12861q3() : null, "follow_like", false, this.f12697e.getItemId(), (JSONObject) null, (String) null, 48, (Object) null);
            this.f12696d.mo85812D(C0966R.C0970id.a2s).callOnClick();
            this.f12698f.animate().alpha(0.0f).setDuration(200).setListener(new C2368a(this.f12698f)).start();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshRealNameRecommendLayout$2$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$p */
    public static final class C2369p extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12700d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2369p(FinderFeedFullConvert<T> finderFeedFullConvert) {
            super(0);
            this.f12700d = finderFeedFullConvert;
        }

        public Object invoke() {
            Intent intent;
            MMActivity activity = this.f12700d.f12564e.getActivity();
            boolean z = true;
            if (activity == null || (intent = activity.getIntent()) == null || !intent.getBooleanExtra("force_show_ad_tip", false)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$p0 */
    public static final class C2370p0 implements C77407n.C12924o {

        /* renamed from: a */
        public final /* synthetic */ FinderFeedFullConvert<T> f12701a;

        /* renamed from: b */
        public final /* synthetic */ T f12702b;

        /* renamed from: c */
        public final /* synthetic */ int f12703c;

        public C2370p0(FinderFeedFullConvert<T> finderFeedFullConvert, T t, int i) {
            this.f12701a = finderFeedFullConvert;
            this.f12702b = t;
            this.f12703c = i;
        }

        /* renamed from: a */
        public final void mo2362a() {
            MMActivity activity = this.f12701a.f12564e.getActivity();
            long itemId = this.f12702b.getItemId();
            int i = this.f12703c;
            C87412m.m108594g(activity, "context");
            C7435f2 f2Var = C7435f2.f25626a;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(activity);
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from_action", i == 1 ? 1 : 2);
            jSONObject.put("feedid", C61926c.m72691p(itemId));
            C13598b0 b0Var = C13598b0.f38549a;
            f2Var.mo8577a(q3, "button_cancel", 1, jSONObject);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$p1 */
    public static final class C2371p1 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12704d;

        /* renamed from: e */
        public final /* synthetic */ FinderFeedFullConvert<T> f12705e;

        /* renamed from: f */
        public final /* synthetic */ T f12706f;

        public C2371p1(C60905o oVar, FinderFeedFullConvert<T> finderFeedFullConvert, T t) {
            this.f12704d = oVar;
            this.f12705e = finderFeedFullConvert;
            this.f12706f = t;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshRealNameRecommendLayout$2$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Context context = this.f12704d.f173499A;
            FinderHomeTabFragment finderHomeTabFragment = null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            FinderLikeDrawer finderLikeDrawer = activity != null ? (FinderLikeDrawer) activity.findViewById(C0966R.C0970id.d96) : null;
            C39818r rVar = C39818r.f106831a;
            Context context2 = this.f12704d.f173499A;
            C87412m.m108593f(context2, "holder.context");
            C13554z zVar = (C13554z) rVar.mo62443b(context2).mo75002a(C13554z.class);
            C10008v1 v1Var = this.f12705e.f12564e;
            FinderTimelinePresenter finderTimelinePresenter = v1Var instanceof FinderTimelinePresenter ? (FinderTimelinePresenter) v1Var : null;
            if (finderTimelinePresenter != null) {
                finderHomeTabFragment = finderTimelinePresenter.f13267h;
            }
            T t = this.f12706f;
            C60905o oVar = this.f12704d;
            zVar.getClass();
            C87412m.m108594g(t, "feedObj");
            C87412m.m108594g(oVar, "holder");
            zVar.mo12956c3(finderHomeTabFragment, t, oVar, new C13239g0(finderLikeDrawer), new C13255h0(finderLikeDrawer));
            if (finderLikeDrawer != null) {
                C60905o oVar2 = this.f12704d;
                FinderItem o = this.f12706f.mo3513o();
                FinderFeedFullConvert<T> finderFeedFullConvert = this.f12705e;
                T t2 = this.f12706f;
                finderFeedFullConvert.getClass();
                C87412m.m108594g(t2, "item");
                finderLikeDrawer.mo4616m(oVar2, o, t2.mo3518s(), this.f12705e.mo2330z(this.f12704d));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshRealNameRecommendLayout$2$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$q */
    public static final class C2372q extends C11931z<T> {

        /* renamed from: c */
        public final /* synthetic */ FinderFeedFullConvert<T> f12707c;

        public C2372q(FinderFeedFullConvert<T> finderFeedFullConvert) {
            this.f12707c = finderFeedFullConvert;
        }

        /* renamed from: a */
        public void mo2364a(int i, List<? extends FinderJumpInfo> list) {
            T t;
            C87412m.m108594g(list, "list");
            C60905o oVar = this.f34863a;
            if (oVar != null) {
                FinderFeedFullConvert<T> finderFeedFullConvert = this.f12707c;
                if (list.isEmpty()) {
                    finderFeedFullConvert.f12556C = true;
                } else {
                    finderFeedFullConvert.mo2303l(oVar);
                    if (i == 5 && (!list.isEmpty())) {
                        finderFeedFullConvert.f12556C = true;
                    }
                }
                if (finderFeedFullConvert.f12556C && (t = this.f34864b) != null) {
                    finderFeedFullConvert.mo2299i0(oVar, t);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$q0 */
    public static final class C2373q0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ View f12708d;

        /* renamed from: e */
        public final /* synthetic */ FinderFeedFullConvert<T> f12709e;

        /* renamed from: f */
        public final /* synthetic */ T f12710f;

        /* renamed from: g */
        public final /* synthetic */ int f12711g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2373q0(View view, FinderFeedFullConvert<T> finderFeedFullConvert, T t, int i) {
            super(0);
            this.f12708d = view;
            this.f12709e = finderFeedFullConvert;
            this.f12710f = t;
            this.f12711g = i;
        }

        public Object invoke() {
            this.f12708d.setTag(Boolean.FALSE);
            C7433e1.f25622a.mo8574c(this.f12709e.f12564e.getActivity(), this.f12710f.getItemId(), this.f12711g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$q1 */
    public static final class C2374q1 extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ boolean f12712d;

        /* renamed from: e */
        public final /* synthetic */ boolean f12713e;

        /* renamed from: f */
        public final /* synthetic */ boolean f12714f;

        /* renamed from: g */
        public final /* synthetic */ LinkedList<FinderCommentInfo> f12715g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2374q1(boolean z, boolean z2, boolean z3, LinkedList<FinderCommentInfo> linkedList) {
            super(0);
            this.f12712d = z;
            this.f12713e = z2;
            this.f12714f = z3;
            this.f12715g = linkedList;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f12712d && this.f12713e && !this.f12714f && this.f12715g.size() > 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$r */
    public static final class C2375r extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C2375r f12716d = new C2375r();

        public C2375r() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C75044y4.m89991c(MMApplicationContext.getContext()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$r0 */
    public static final class C2376r0 implements View.OnClickListener {

        /* renamed from: d */
        public static final C2376r0 f12717d = new C2376r0();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onCreateViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onCreateViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$r1 */
    public static final class C2377r1 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12718d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12719e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2377r1(FinderFeedFullConvert<T> finderFeedFullConvert, C60905o oVar) {
            super(0);
            this.f12718d = finderFeedFullConvert;
            this.f12719e = oVar;
        }

        public Object invoke() {
            this.f12718d.mo2303l(this.f12719e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$s */
    public static final class C2378s implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12720d;

        /* renamed from: e */
        public final /* synthetic */ FinderFeedFullConvert<T> f12721e;

        public C2378s(C60905o oVar, FinderFeedFullConvert<T> finderFeedFullConvert) {
            this.f12720d = oVar;
            this.f12721e = finderFeedFullConvert;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C39818r rVar = C39818r.f106831a;
            Context context = this.f12720d.f173499A;
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            C39622i0 a = rVar.mo62444c((MMActivity) context).mo75002a(C13442s8.class);
            C87412m.m108593f(a, "UICProvider.of(holder.co…rReporterUIC::class.java)");
            boolean z = false;
            C7322a b = C60172g4.C60173a.m70190b((C60172g4) a, 0, 1, (Object) null);
            if (b != null) {
                b.mo8766a(new C7322a.C7323a(21, this.f12720d.f44858h));
            }
            if (this.f12721e.f12566g == 4) {
                z = true;
            }
            C117292a.m165362h(z, this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$s0 */
    public static final class C2379s0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12722d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12723e;

        public C2379s0(FinderFeedFullConvert<T> finderFeedFullConvert, C60905o oVar) {
            this.f12722d = finderFeedFullConvert;
            this.f12723e = oVar;
        }

        public final void run() {
            StateListener stateListener = new StateListener(this.f12722d, this.f12723e);
            stateListener.alive();
            this.f12722d.f12571o.add(stateListener);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$s1 */
    public static final class C2380s1 implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ boolean[] f12724d;

        public C2380s1(boolean[] zArr) {
            this.f12724d = zArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
            if (r11 != 6) goto L_0x0043;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
            /*
                r10 = this;
                tc2.g r0 = tc2.C118418g.INSTANCE
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r1.add(r11)
                r1.add(r12)
                java.lang.Object[] r7 = r1.toArray()
                r1.clear()
                java.lang.String r2 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshStar$1"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r6 = r10
                j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
                int r11 = r12.getAction()
                r1 = 0
                r2 = 1
                java.lang.String r3 = "ce_feed_fav"
                if (r11 == 0) goto L_0x003a
                if (r11 == r2) goto L_0x0033
                r4 = 5
                if (r11 == r4) goto L_0x003a
                r2 = 6
                if (r11 == r2) goto L_0x0033
                goto L_0x0043
            L_0x0033:
                r0.mo175827n9(r3, r12)
                r0.ec0(r3)
                goto L_0x0043
            L_0x003a:
                boolean[] r11 = r10.f12724d
                r11[r1] = r2
                java.lang.String r11 = "<FeedFav>"
                r0.w40(r3, r11)
            L_0x0043:
                r4 = 0
                java.lang.String r6 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshStar$1"
                java.lang.String r7 = "android/view/View$OnTouchListener"
                java.lang.String r8 = "onTouch"
                java.lang.String r9 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r5 = r10
                j20.C117292a.m165362h(r4, r5, r6, r7, r8, r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.C2380s1.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$t */
    public static final class C2381t implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12725d;

        public C2381t(C60905o oVar) {
            this.f12725d = oVar;
        }

        public final void run() {
            C39818r rVar = C39818r.f106831a;
            Context context = this.f12725d.f173499A;
            C87412m.m108593f(context, "holder.context");
            FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = (FinderHorizontalVideoDrawerUIC) rVar.mo62443b(context).mo62449e(FinderHorizontalVideoDrawerUIC.class);
            if (finderHorizontalVideoDrawerUIC != null) {
                finderHorizontalVideoDrawerUIC.mo5145j3(this.f12725d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$t0 */
    public static final class C2382t0 implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ T f12726a;

        public C2382t0(T t) {
            this.f12726a = t;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            return C90363p0.m113143b(new C13604l("feed_id", C61926c.m72691p(this.f12726a.getItemId())));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$t1 */
    public static final class C2383t1 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean[] f12727d;

        /* renamed from: e */
        public final /* synthetic */ FinderFeedFullConvert<T> f12728e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f12729f;

        /* renamed from: g */
        public final /* synthetic */ T f12730g;

        public C2383t1(boolean[] zArr, FinderFeedFullConvert<T> finderFeedFullConvert, C60905o oVar, T t) {
            this.f12727d = zArr;
            this.f12728e = finderFeedFullConvert;
            this.f12729f = oVar;
            this.f12730g = t;
        }

        public final void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshStar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean[] zArr = this.f12727d;
            if (zArr[0]) {
                zArr[0] = false;
            } else {
                C118418g gVar = C118418g.INSTANCE;
                gVar.w40("ce_feed_fav", "<FeedFav>");
                gVar.mo175827n9("ce_feed_fav", MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 65535));
                gVar.ec0("ce_feed_fav");
            }
            if (!this.f12728e.f12564e.mo2497u0()) {
                Log.m105924i("Finder.FeedFullConvert", "onClickStar: " + this.f12729f.mo17363j());
                C65854g gVar2 = C65854g.f189373e;
                if (!C65854g.f189373e.mo89893c(this.f12730g.mo3513o().getFeedObject())) {
                    C39818r rVar = C39818r.f106831a;
                    Context context = this.f12729f.f173499A;
                    C87412m.m108593f(context, "holder.context");
                    C13334ma maVar = (C13334ma) rVar.mo62443b(context).mo75002a(C13334ma.class);
                    C60905o oVar = this.f12729f;
                    maVar.getClass();
                    Class cls = C11990s0.class;
                    Class<C60200t1> cls2 = C60200t1.class;
                    C87412m.m108594g(oVar, "holder");
                    C50687oi1 oi12 = C66785b.f191882e.mo90673n0().mo62397b().f140461E;
                    if (!(oi12 != null && oi12.f139196d == 1)) {
                        C85801v1 i = C86709a0.m107535s().mo121142i();
                        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_STAR_GUIDE_DIALOG_SHOW_COUNT_INT_SYNC;
                        int j = i.mo119689j(aVar, 0);
                        long c = C31543z5.m39453c() - C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_FINDER_PRIVATE_LIKE_GUIDE_LAST_SHOW_TIME_LONG_SYNC, 0);
                        C37521f.f99374d.getClass();
                        long j2 = C37521f.f99541v7.mo60266n().intValue() == 0 ? 86400000 : 300000;
                        if (C37521f.f99550w7.mo60266n().intValue() != 0 && j <= 0 && c >= j2) {
                            C101218e0 e0Var = new C101218e0(maVar.getContext(), 0, 0);
                            e0Var.mo140674t(-2);
                            e0Var.f296384g.setBackgroundResource(C0966R.C0969drawable.b_v);
                            View inflate = LayoutInflater.from(maVar.getContext()).inflate(C0966R.C0971layout.cvk, (ViewGroup) null);
                            inflate.setMinimumHeight((int) (((float) C7865r3.f26468a.mo8968a()) * 0.5f));
                            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
                            int dimension = (int) maVar.getResources().getDimension(C0966R.dimen.f3743cv);
                            C48996cf1 a = C15587j.f42215a.mo14349a("FinderObjectDynamicImageKey_FinderFavOffBoldIcon");
                            if (a == null || (str = a.f131694e) == null) {
                                str = "";
                            }
                            if (!Util.isNullOrNil(str)) {
                                if (textView != null) {
                                    textView.setText(maVar.getContext().getString(C0966R.string.mei));
                                }
                                C99344b<C100810g0, Bitmap> b = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str, C27696y.RAW_IMAGE), ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.FAV_ICON));
                                C13307ka kaVar = new C13307ka(textView, maVar, dimension);
                                b.getClass();
                                b.f291320d = kaVar;
                                b.mo85953c();
                            } else if (textView != null) {
                                C58784w3 w3Var = C58784w3.f168295a;
                                Activity context2 = maVar.getContext();
                                String string = maVar.getContext().getString(C0966R.string.meh);
                                C87412m.m108593f(string, "context.getString(R.stri…_star_guide_dialog_title)");
                                textView.setText(w3Var.mo83957q1(context2, string, '#', C0966R.raw.icons_outlined_star_new_bold, C0966R.color.FG_0, dimension, dimension));
                            }
                            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.n1c);
                            Resources resources = maVar.getContext().getResources();
                            boolean b2 = C87412m.m108589b(LocaleUtil.getCurrentLanguage(maVar.getContext()), "zh_CN");
                            boolean z = C85875k4.m106211z();
                            int i2 = C0966R.C0969drawable.ci4;
                            if (b2 && z) {
                                i2 = C0966R.C0969drawable.f357163ci3;
                            } else if (!b2 || z) {
                                if (!b2 && z) {
                                    i2 = C0966R.C0969drawable.ci5;
                                } else if (!b2 && !z) {
                                    i2 = C0966R.C0969drawable.ci6;
                                }
                            }
                            imageView.setImageDrawable(resources.getDrawable(i2));
                            inflate.findViewById(C0966R.C0970id.f357588am1).setOnClickListener(new C13323la(e0Var));
                            e0Var.mo140664k(inflate, 0, 0);
                            e0Var.mo140655A();
                            C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                        }
                    }
                }
                this.f12728e.mo2328y(this.f12729f, 0);
            } else {
                C39818r rVar2 = C39818r.f106831a;
                Context context3 = this.f12729f.f173499A;
                C87412m.m108593f(context3, "holder.context");
                FinderDescPanelUIC finderDescPanelUIC = (FinderDescPanelUIC) rVar2.mo62443b(context3).mo62449e(FinderDescPanelUIC.class);
                if (finderDescPanelUIC != null) {
                    C60905o oVar2 = this.f12729f;
                    C87412m.m108594g(oVar2, "holder");
                    if (((ArrayList) finderDescPanelUIC.f18638y).contains(1)) {
                        int i3 = finderDescPanelUIC.f18637x;
                        if (i3 == 1) {
                            finderDescPanelUIC.mo5125m3(oVar2, 0, true);
                        } else if (i3 == 0) {
                            finderDescPanelUIC.mo5125m3(oVar2, 1, true);
                        }
                    }
                }
            }
            this.f12728e.mo2317s(this.f12729f, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshStar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$u */
    public static final class C2384u implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12731d;

        public C2384u(C60905o oVar) {
            this.f12731d = oVar;
        }

        public final void run() {
            C39818r rVar = C39818r.f106831a;
            Context context = this.f12731d.f173499A;
            C87412m.m108593f(context, "holder.context");
            FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = (FinderHorizontalVideoDrawerUIC) rVar.mo62443b(context).mo62449e(FinderHorizontalVideoDrawerUIC.class);
            if (finderHorizontalVideoDrawerUIC != null) {
                finderHorizontalVideoDrawerUIC.mo5146k3(this.f12731d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$u0 */
    public static final class C2385u0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12732d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12733e;

        /* renamed from: f */
        public final /* synthetic */ T f12734f;

        public C2385u0(FinderFeedFullConvert<T> finderFeedFullConvert, C60905o oVar, T t) {
            this.f12732d = finderFeedFullConvert;
            this.f12733e = oVar;
            this.f12734f = t;
        }

        public final void run() {
            C16336r rVar = (C16336r) C39818r.f106831a.mo62444c(this.f12732d.f12564e.getActivity()).mo62449e(C16336r.class);
            if (rVar != null) {
                C10008v1 v1Var = this.f12732d.f12564e;
                C60905o oVar = this.f12733e;
                T t = this.f12734f;
                C87412m.m108593f(t, "item");
                rVar.mo14820c3(v1Var, oVar, t);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$u1 */
    public static final class C2386u1<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C60905o f12735a;

        /* renamed from: b */
        public final /* synthetic */ TextView f12736b;

        public C2386u1(C60905o oVar, TextView textView) {
            this.f12735a = oVar;
            this.f12736b = textView;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            ((C119157j) C119157j.f356862d).mo183895z(new C2420c((Bitmap) obj, this.f12735a, this.f12736b));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$v */
    public static final class C2387v implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C60905o f12737a;

        public C2387v(C60905o oVar) {
            this.f12737a = oVar;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            C39818r rVar = C39818r.f106831a;
            Context context = this.f12737a.f173499A;
            C87412m.m108593f(context, "holder.context");
            return C7446m0.f25635a.mo8592a(((C13442s8) rVar.mo62443b(context).mo75002a(C13442s8.class)).mo12861q3());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$v0 */
    public static final class C2388v0 implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C58259c.C58260a f12738a;

        public C2388v0(C58259c.C58260a aVar) {
            this.f12738a = aVar;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            return C90363p0.m113143b(new C13604l("feed_id", C61926c.m72691p(this.f12738a.f166817h)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$v1 */
    public static final class C2389v1 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f12739d;

        public C2389v1(C32224a aVar) {
            this.f12739d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f12739d.invoke();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$w */
    public static final class C2390w implements SimpleTouchableLayout.C4004a {

        /* renamed from: a */
        public final /* synthetic */ C60905o f12740a;

        /* renamed from: b */
        public final /* synthetic */ FinderFeedFullConvert<T> f12741b;

        /* renamed from: c */
        public final /* synthetic */ int f12742c;

        public C2390w(C60905o oVar, FinderFeedFullConvert<T> finderFeedFullConvert, int i) {
            this.f12740a = oVar;
            this.f12741b = finderFeedFullConvert;
            this.f12742c = i;
        }

        /* renamed from: a */
        public boolean mo2374a(View view, MotionEvent motionEvent) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(motionEvent, "e");
            Log.m105924i("Finder.FeedFullConvert", "onDoubleClick " + this.f12740a.f173503E);
            this.f12741b.mo2281R(this.f12740a, view, motionEvent, this.f12742c);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$w0 */
    public static final class C2391w0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f12743d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12744e;

        /* renamed from: f */
        public final /* synthetic */ int f12745f;

        /* renamed from: g */
        public final /* synthetic */ int f12746g;

        /* renamed from: h */
        public final /* synthetic */ FinderFeedFullConvert<T> f12747h;

        public C2391w0(View view, C60905o oVar, int i, int i2, FinderFeedFullConvert<T> finderFeedFullConvert) {
            this.f12743d = view;
            this.f12744e = oVar;
            this.f12745f = i;
            this.f12746g = i2;
            this.f12747h = finderFeedFullConvert;
        }

        public final void run() {
            int height = this.f12743d.getHeight();
            int keyBordHeightPx = (KeyBoardUtil.getKeyBordHeightPx(this.f12744e.f173499A) - this.f12745f) + height;
            Log.m105924i("Finder.FeedFullConvert", "[openCommentDrawer] offset=" + keyBordHeightPx + " itemBottom=" + this.f12746g + " recyclerViewBottom=" + this.f12747h.f12557D.bottom + " editLayoutHeight=" + height);
            if (keyBordHeightPx > 0) {
                C8730k kVar = this.f12747h.f12564e.mo2578p1().f161828n;
                if (kVar != null) {
                    C8730k.C8731a.m8556a(kVar, "openCommentDrawer", true, false, 4, (Object) null);
                }
                this.f12744e.mo85811C().smoothScrollBy(0, keyBordHeightPx);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$w1 */
    public static final class C2392w1 implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12748d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12749e;

        /* renamed from: f */
        public final /* synthetic */ T f12750f;

        /* renamed from: g */
        public final /* synthetic */ Drawable f12751g;

        public C2392w1(FinderFeedFullConvert<T> finderFeedFullConvert, C60905o oVar, T t, Drawable drawable) {
            this.f12748d = finderFeedFullConvert;
            this.f12749e = oVar;
            this.f12750f = t;
            this.f12751g = drawable;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            int i;
            CharSequence charSequence;
            if (e0Var.mo107176v()) {
                FinderFeedFullConvert<T> finderFeedFullConvert = this.f12748d;
                C60905o oVar = this.f12749e;
                T t = this.f12750f;
                Drawable drawable = this.f12751g;
                String string = oVar.f173499A.getString(C0966R.string.fym);
                C87412m.m108593f(string, "holder.context.getString…_ground_title_new_format)");
                finderFeedFullConvert.getClass();
                int i2 = t.mo3513o().getFeedObject().objectType;
                boolean z = true;
                if (i2 != 1) {
                    z = false;
                }
                if (z) {
                    i = C0966R.raw.icons_outlined_fire_group;
                } else {
                    Integer c0 = C58784w3.m68436c0(C58784w3.f168295a, 3, false, 2, (Object) null);
                    i = c0 != null ? c0.intValue() : C0966R.raw.icons_outlined_like_group;
                }
                if (drawable == null) {
                    int dimension = (int) oVar.f173499A.getResources().getDimension(C0966R.dimen.f3738cr);
                    C58784w3 w3Var = C58784w3.f168295a;
                    Context context = oVar.f173499A;
                    C87412m.m108593f(context, "holder.context");
                    charSequence = w3Var.mo83957q1(context, string, '#', i, C0966R.color.f3133gi, dimension, dimension);
                } else {
                    int dimension2 = (int) oVar.f173499A.getResources().getDimension(C0966R.dimen.f3738cr);
                    C58784w3 w3Var2 = C58784w3.f168295a;
                    Context context2 = oVar.f173499A;
                    C87412m.m108593f(context2, "holder.context");
                    charSequence = w3Var2.mo83957q1(context2, string, '#', i, C0966R.color.f3133gi, dimension2, dimension2);
                }
                e0Var.mo107142f(10003, charSequence);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$x */
    public static final class C2393x implements SimpleTouchableLayout.C4008e {

        /* renamed from: a */
        public final /* synthetic */ FinderFeedFullConvert<T> f12752a;

        /* renamed from: b */
        public final /* synthetic */ C60905o f12753b;

        public C2393x(FinderFeedFullConvert<T> finderFeedFullConvert, C60905o oVar) {
            this.f12752a = finderFeedFullConvert;
            this.f12753b = oVar;
        }

        /* renamed from: a */
        public boolean mo2376a(View view, MotionEvent motionEvent) {
            C87412m.m108594g(view, "view");
            if (motionEvent == null) {
                return false;
            }
            FinderFeedFullConvert<T> finderFeedFullConvert = this.f12752a;
            C60905o oVar = this.f12753b;
            finderFeedFullConvert.mo2280Q(oVar, view, ((BaseFinderFeed) oVar.f173503E).mo3513o().getFeedObject());
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$x0 */
    public static final class C2394x0 implements CommentDrawerContract.CloseDrawerCallback {

        /* renamed from: a */
        public final /* synthetic */ FinderFeedFullConvert<T> f12754a;

        /* renamed from: b */
        public final /* synthetic */ T f12755b;

        /* renamed from: c */
        public final /* synthetic */ C60905o f12756c;

        /* renamed from: d */
        public final /* synthetic */ C8478d0 f12757d;

        public C2394x0(FinderFeedFullConvert<T> finderFeedFullConvert, T t, C60905o oVar, C8478d0 d0Var) {
            this.f12754a = finderFeedFullConvert;
            this.f12755b = t;
            this.f12756c = oVar;
            this.f12757d = d0Var;
        }

        /* renamed from: a */
        public void mo2377a(int i, List<? extends C55033u> list, boolean z) {
            int i2;
            C87412m.m108594g(list, "data");
            this.f12754a.mo2297g0(this.f12755b, this.f12756c);
            C8730k kVar = this.f12754a.f12564e.mo2578p1().f161828n;
            if (kVar != null) {
                C8730k.C8731a.m8556a(kVar, "openCommentDrawer", false, false, 4, (Object) null);
            }
            if (this.f12754a.f12564e.mo2497u0()) {
                C37521f.f99374d.getClass();
                if (C37521f.f99511s4.mo60266n().intValue() == 1) {
                    FinderItem e = C65834e.f189316a.mo89871e(this.f12755b.getItemId());
                    if (e == null) {
                        e = this.f12755b.mo3513o();
                    }
                    i2 = e.getCommentCount();
                } else {
                    i2 = this.f12755b.mo3513o().getCommentCount();
                }
                ((TextView) this.f12756c.mo85812D(C0966R.C0970id.bje)).setText(C7878t0.m8034c(1, i2));
            }
            C37521f.f99374d.getClass();
            if (C37521f.f99334Y1.mo60266n().intValue() == 1) {
                this.f12756c.mo85811C().smoothScrollBy(0, -this.f12757d.f27483d);
            }
            C39818r rVar = C39818r.f106831a;
            Context context = this.f12756c.f173499A;
            C87412m.m108593f(context, "holder.context");
            FinderDescPanelUIC finderDescPanelUIC = (FinderDescPanelUIC) rVar.mo62443b(context).mo62449e(FinderDescPanelUIC.class);
            if (finderDescPanelUIC != null) {
                finderDescPanelUIC.mo5122j3(this.f12756c);
            }
            Context context2 = this.f12756c.f173499A;
            C87412m.m108593f(context2, "holder.context");
            C13282j2 j2Var = (C13282j2) rVar.mo62443b(context2).mo62449e(C13282j2.class);
            if (j2Var != null) {
                C87412m.m108594g(this.f12756c, "holder");
                if (j2Var.f37703j) {
                    j2Var.mo12734k3();
                    j2Var.f37703j = false;
                }
            }
            if (z) {
                this.f12754a.mo2317s(this.f12756c, true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$x1 */
    public static final class C2395x1 implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12758d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f12759e;

        /* renamed from: f */
        public final /* synthetic */ int f12760f;

        public C2395x1(FinderFeedFullConvert<T> finderFeedFullConvert, C60905o oVar, int i) {
            this.f12758d = finderFeedFullConvert;
            this.f12759e = oVar;
            this.f12760f = i;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 10003) {
                this.f12758d.mo2266J(this.f12759e, 1, true, (MotionEvent) null, this.f12760f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$y */
    public static final class C2396y implements SimpleTouchableLayout.C4006c {

        /* renamed from: a */
        public final /* synthetic */ FinderFeedFullConvert<T> f12761a;

        /* renamed from: b */
        public final /* synthetic */ C60905o f12762b;

        public C2396y(FinderFeedFullConvert<T> finderFeedFullConvert, C60905o oVar) {
            this.f12761a = finderFeedFullConvert;
            this.f12762b = oVar;
        }

        /* renamed from: a */
        public void mo2378a(View view, MotionEvent motionEvent) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(motionEvent, "e");
            FinderFeedFullConvert<T> finderFeedFullConvert = this.f12761a;
            C60905o oVar = this.f12762b;
            Object obj = oVar.f173503E;
            C87412m.m108593f(obj, "holder.getAssociatedObject<T>()");
            finderFeedFullConvert.mo2282S(oVar, view, (BaseFinderFeed) obj, motionEvent);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$y0 */
    public static final class C2397y0 extends C87413o implements C32226l<C60905o, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12763d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2397y0(FinderFeedFullConvert<T> finderFeedFullConvert) {
            super(1);
            this.f12763d = finderFeedFullConvert;
        }

        public Object invoke(Object obj) {
            C60905o oVar = (C60905o) obj;
            C87412m.m108594g(oVar, "holder");
            this.f12763d.mo2303l(oVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$y1 */
    public static final class C2398y1 extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12764d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2398y1(FinderFeedFullConvert<T> finderFeedFullConvert) {
            super(0);
            this.f12764d = finderFeedFullConvert;
        }

        public Object invoke() {
            return Integer.valueOf(((Number) ((C36570n) this.f12764d.f12573q).getValue()).intValue() + C75044y4.m89989a(MMApplicationContext.getContext()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$z */
    public static final class C2399z extends C87413o implements C32229r<MotionEvent, MotionEvent, Float, Float, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12765d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2399z(C60905o oVar) {
            super(4);
            this.f12765d = oVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            MotionEvent motionEvent = (MotionEvent) obj;
            MotionEvent motionEvent2 = (MotionEvent) obj2;
            float floatValue = ((Number) obj3).floatValue();
            float floatValue2 = ((Number) obj4).floatValue();
            C87412m.m108594g(motionEvent, "e1");
            C87412m.m108594g(motionEvent2, "e2");
            C39818r rVar = C39818r.f106831a;
            Context context = this.f12765d.f173499A;
            C87412m.m108593f(context, "holder.context");
            FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = (FinderHorizontalVideoDrawerUIC) rVar.mo62443b(context).mo62449e(FinderHorizontalVideoDrawerUIC.class);
            return Boolean.valueOf(finderHorizontalVideoDrawerUIC != null ? finderHorizontalVideoDrawerUIC.mo5144i3(motionEvent, motionEvent2, floatValue, floatValue2) : false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$z0 */
    public static final class C2400z0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f12766d;

        /* renamed from: e */
        public final /* synthetic */ FinderFeedFullConvert<T> f12767e;

        /* renamed from: f */
        public final /* synthetic */ T f12768f;

        public C2400z0(C60905o oVar, FinderFeedFullConvert<T> finderFeedFullConvert, T t) {
            this.f12766d = oVar;
            this.f12767e = finderFeedFullConvert;
            this.f12768f = t;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshCommentLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C39818r rVar = C39818r.f106831a;
            Context context = this.f12766d.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13256h1 h1Var = (C13256h1) rVar.mo62443b(context).mo62449e(C13256h1.class);
            if (h1Var != null) {
                h1Var.mo12723c3(this.f12766d);
            }
            FinderFeedFullConvert<T> finderFeedFullConvert = this.f12767e;
            FinderFeedFullConvert.m2150a0(finderFeedFullConvert, this.f12766d, this.f12768f, false, 0, (C65426w0) null, 0, 0, finderFeedFullConvert.mo2260G(), 0, this.f12767e.mo2330z(this.f12766d), 2, 376, (Object) null);
            if (this.f12766d.mo17363j() == 0) {
                Context context2 = this.f12766d.f173499A;
                C87412m.m108593f(context2, "holder.context");
                C60592c cVar = ((C60593d) rVar.mo62443b(context2).mo75002a(C60593d.class)).f172693f;
                if (cVar != null) {
                    cVar.mo85549a();
                    cVar.mo85550b(FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshCommentLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$z1 */
    public static final class C2401z1 extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedFullConvert<T> f12769d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2401z1(FinderFeedFullConvert<T> finderFeedFullConvert) {
            super(0);
            this.f12769d = finderFeedFullConvert;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            r0 = (r0 = r0.getContext()).getIntent();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r3 = this;
                com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert<T> r0 = r3.f12769d
                kf1.v1 r0 = r0.f12564e
                com.tencent.mm.ui.MMActivity r0 = r0.getActivity()
                if (r0 == 0) goto L_0x001e
                androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
                if (r0 == 0) goto L_0x001e
                android.content.Intent r0 = r0.getIntent()
                if (r0 == 0) goto L_0x001e
                r1 = 1
                java.lang.String r2 = "key_topic_type"
                int r0 = r0.getIntExtra(r2, r1)
                goto L_0x001f
            L_0x001e:
                r0 = 0
            L_0x001f:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.C2401z1.invoke():java.lang.Object");
        }
    }

    public FinderFeedFullConvert(C10008v1 v1Var, boolean z, int i, boolean z2) {
        AppCompatActivity context;
        C13442s8 f;
        C58553c y3;
        C87412m.m108594g(v1Var, "contract");
        this.f12564e = v1Var;
        this.f12565f = z;
        this.f12566g = i;
        this.f12567h = z2;
        C36568h.m40985a(new C2398y1(this));
        this.f12574r = C36568h.m40985a(new C2362n(this));
        this.f12575s = C36568h.m40985a(new C2369p(this));
        this.f12576t = C36568h.m40985a(new C2365o(this));
        this.f12577u = C36568h.m40985a(new C2349j(this));
        this.f12578v = C36568h.m40985a(new C2353k(this));
        this.f12579w = C36568h.m40985a(new C2401z1(this));
        this.f12580x = C36568h.m40985a(C2356l.f12671d);
        MMActivity activity = v1Var.getActivity();
        if (!(activity == null || (context = activity.getContext()) == null || (f = C13442s8.f38060Q0.mo12873f(context)) == null || (y3 = f.mo12867y3(i)) == null)) {
            y3.mo83450a(new C2319a(this, context));
        }
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        this.f12555B = C37521f.f99524t8.mo60266n().intValue();
        MMApplicationContext.getColor(C0966R.color.f3585yj);
        C76577a.m92150a(MMApplicationContext.getContext(), 2.0f);
        this.f12557D = new Rect();
        fVar.getClass();
        boolean z3 = false;
        this.f12559F = C37521f.f99270R0.mo60266n().intValue() == 1;
        fVar.getClass();
        this.f12560G = C37521f.f99279S0.mo60266n().intValue() == 1 ? true : z3;
        this.f12561H = new FinderFeedFullConvert$uiLifecycleObserver$1(this);
        this.f12562I = C26236u.m33719b(Integer.valueOf(C0966R.C0970id.gqw));
        this.f12563J = new C2372q(this);
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m2150a0(FinderFeedFullConvert finderFeedFullConvert, C60905o oVar, BaseFinderFeed baseFinderFeed, boolean z, long j, C65426w0 w0Var, int i, int i2, boolean z2, long j2, int i3, int i4, int i5, Object obj) {
        int i6 = i5;
        if (obj == null) {
            finderFeedFullConvert.mo2289Z(oVar, baseFinderFeed, (i6 & 4) != 0 ? false : z, (i6 & 8) != 0 ? 0 : j, (i6 & 16) != 0 ? null : w0Var, (i6 & 32) != 0 ? -1 : i, (i6 & 64) != 0 ? 0 : i2, (i6 & 128) != 0 ? false : z2, (i6 & 256) != 0 ? 1000 : j2, (i6 & 512) != 0 ? 0 : i3, (i6 & 1024) != 0 ? 0 : i4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openCommentDrawer");
    }

    /* renamed from: u */
    public static /* synthetic */ void m2151u(FinderFeedFullConvert finderFeedFullConvert, C60905o oVar, BaseFinderFeed baseFinderFeed, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = true;
            }
            finderFeedFullConvert.mo2319t(oVar, baseFinderFeed, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkShowFollowLayout");
    }

    /* renamed from: z0 */
    public static void m2152z0(FinderFeedFullConvert finderFeedFullConvert, BaseFinderFeed baseFinderFeed, C60905o oVar, boolean z, int i, Object obj) {
        View view;
        FinderFeedFullConvert finderFeedFullConvert2 = finderFeedFullConvert;
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        C60905o oVar2 = oVar;
        if (obj == null) {
            finderFeedFullConvert.getClass();
            C87412m.m108594g(baseFinderFeed2, "item");
            C87412m.m108594g(oVar2, "holder");
            FinderPostProgressView finderPostProgressView = (FinderPostProgressView) oVar2.mo85812D(C0966R.C0970id.i0k);
            if (finderPostProgressView != null) {
                if (!C58784w3.f168295a.mo83897Q0(baseFinderFeed2)) {
                    View D = oVar2.mo85812D(C0966R.C0970id.e47);
                    if (D != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = D;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View D2 = oVar2.mo85812D(C0966R.C0970id.edb);
                    if (D2 != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        View view3 = D2;
                        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else if (!baseFinderFeed.mo3513o().isPostFinish() && baseFinderFeed.mo3513o().getPostInfo().f185649h < 100) {
                    if (finderFeedFullConvert2.f12567h) {
                        FinderPostProgressView finderPostProgressView2 = (FinderPostProgressView) oVar2.mo85812D(C0966R.C0970id.i0k);
                        if (finderPostProgressView2 != null) {
                            finderPostProgressView2.setForeColor(MMApplicationContext.getColor(C0966R.color.f2947a4));
                        }
                        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.gpx);
                        if (textView != null) {
                            textView.setTextColor(MMApplicationContext.getColor(C0966R.color.BW_0_Alpha_0_8));
                        }
                        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.crs);
                        if (textView2 != null) {
                            textView2.setTextColor(MMApplicationContext.getColor(C0966R.color.BW_0_Alpha_0_8));
                        }
                        WeImageView weImageView = (WeImageView) oVar2.mo85812D(C0966R.C0970id.bod);
                        if (weImageView != null) {
                            weImageView.setIconColor(MMApplicationContext.getColor(C0966R.color.BW_0_Alpha_0_8));
                        }
                        TextView textView3 = (TextView) oVar2.mo85812D(C0966R.C0970id.boe);
                        if (textView3 != null) {
                            textView3.setTextColor(MMApplicationContext.getColor(C0966R.color.BW_0_Alpha_0_8));
                        }
                        WeImageView weImageView2 = (WeImageView) oVar2.mo85812D(C0966R.C0970id.duy);
                        if (weImageView2 != null) {
                            weImageView2.setIconColor(MMApplicationContext.getColor(C0966R.color.BW_0_Alpha_0_8));
                        }
                        TextView textView4 = (TextView) oVar2.mo85812D(C0966R.C0970id.f359617f51);
                        if (textView4 != null) {
                            textView4.setTextColor(MMApplicationContext.getColor(C0966R.color.BW_0_Alpha_0_8));
                        }
                    }
                    View D3 = oVar2.mo85812D(C0966R.C0970id.e47);
                    if (D3 != null) {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar3.mo10233c(0);
                        View view4 = D3;
                        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        D3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View D4 = oVar2.mo85812D(C0966R.C0970id.edb);
                    if (D4 != null) {
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                        aVar4.mo10233c(8);
                        View view5 = D4;
                        C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        D4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    finderPostProgressView.setBackColor(oVar2.f173499A.getResources().getColor(C0966R.color.f3579yb));
                    View D5 = oVar2.mo85812D(C0966R.C0970id.i0l);
                    View D6 = oVar2.mo85812D(C0966R.C0970id.i05);
                    TextView textView5 = (TextView) oVar2.mo85812D(C0966R.C0970id.crs);
                    View D7 = oVar2.mo85812D(C0966R.C0970id.i0g);
                    View D8 = oVar2.mo85812D(C0966R.C0970id.f358939i01);
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                    aVar5.mo10233c(0);
                    View view6 = D8;
                    C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (baseFinderFeed.mo3513o().isPostFailed()) {
                        C9556a aVar6 = new C9556a();
                        aVar6.mo10233c(0);
                        View view7 = D6;
                        C117292a.m165358d(view7, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        D6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C9556a aVar7 = new C9556a();
                        aVar7.mo10233c(8);
                        View view8 = D5;
                        C117292a.m165358d(view8, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        D5.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (!baseFinderFeed.mo3513o().isPostFailedCanRetry()) {
                            C9556a aVar8 = new C9556a();
                            aVar8.mo10233c(8);
                            view = D8;
                            View view9 = D7;
                            C117292a.m165358d(view9, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            D7.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                            C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            view = D8;
                            C9556a aVar9 = new C9556a();
                            aVar9.mo10233c(0);
                            View view10 = D7;
                            C117292a.m165358d(view10, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            D7.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                            C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        if (baseFinderFeed.mo3513o().isPostNoAuth()) {
                            textView5.setText(Html.fromHtml(oVar2.f173499A.getResources().getString(C0966R.string.eio)));
                            textView5.setOnClickListener(new C14583o1(finderFeedFullConvert2));
                            C9556a aVar10 = new C9556a();
                            aVar10.mo10233c(0);
                            View view11 = D7;
                            C117292a.m165358d(view11, aVar10.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            D7.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                            C117292a.m165359e(view11, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else if (baseFinderFeed.mo3513o().isEventClosed()) {
                            textView5.setText(oVar2.f173499A.getResources().getString(C0966R.string.eim));
                        } else if (baseFinderFeed.mo3513o().isEventExpired()) {
                            textView5.setText(oVar2.f173499A.getResources().getString(C0966R.string.ein));
                        } else {
                            textView5.setText(oVar2.f173499A.getResources().getString(C0966R.string.dcy));
                        }
                    } else {
                        view = D8;
                        C9556a aVar11 = new C9556a();
                        aVar11.mo10233c(8);
                        View view12 = D6;
                        C117292a.m165358d(view12, aVar11.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        D6.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                        C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C9556a aVar12 = new C9556a();
                        aVar12.mo10233c(0);
                        View view13 = D5;
                        C117292a.m165358d(view13, aVar12.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        D5.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
                        C117292a.m165359e(view13, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C9556a aVar13 = new C9556a();
                        aVar13.mo10233c(8);
                        View view14 = D7;
                        C117292a.m165358d(view14, aVar13.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        D7.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
                        C117292a.m165359e(view14, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostProgress", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{finderPostProgressView.getProgress(), baseFinderFeed.mo3513o().getPostInfo().f185649h});
                        ofInt.addUpdateListener(new C14591p1(finderPostProgressView));
                        ValueAnimator duration = ofInt.setDuration(400);
                        if (duration != null) {
                            duration.start();
                        }
                        oVar2.f173502D = ofInt;
                    }
                    view.setOnClickListener(new C65636q1(finderFeedFullConvert2, baseFinderFeed2));
                    D7.setOnClickListener(new C14617r1(baseFinderFeed2));
                } else if (baseFinderFeed.mo3474H()) {
                    finderFeedFullConvert.mo2283T(baseFinderFeed, oVar);
                    baseFinderFeed2.mo3489W(false);
                }
            }
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshPostProgress");
        }
    }

    /* renamed from: A */
    public final int mo2248A() {
        return ((Number) this.f12580x.getValue()).intValue();
    }

    /* renamed from: A0 */
    public final void mo2249A0(T t, C60905o oVar) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        View D = oVar.mo85812D(C0966R.C0970id.d99);
        if (D != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C49426fi1 fi12 = t.mo3513o().getFeedObject().publisher_info;
            if (fi12 != null) {
                RoundLinearLayout roundLinearLayout = (RoundLinearLayout) D.findViewById(C0966R.C0970id.hzx);
                if (roundLinearLayout != null) {
                    roundLinearLayout.setRadius(0.1f);
                }
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                C117292a.m165358d(D, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPostRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = (TextView) D.findViewById(C0966R.C0970id.hzv);
                if (textView != null) {
                    textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(D.getContext(), D.getContext().getResources().getString(C0966R.string.f360800eu3, new Object[]{fi12.f133514d})));
                    textView.setTextSize(0, oVar.f173499A.getResources().getDimension(C0966R.dimen.f3684bd));
                }
                ImageView imageView = (ImageView) D.findViewById(C0966R.C0970id.hzw);
                if (imageView != null) {
                    ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11868R0().mo85957c(new C62345f(fi12.f133515e, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.RECT_AVATAR));
                }
            }
        }
    }

    /* renamed from: B */
    public final int mo2250B(boolean z, boolean z2, BaseFinderFeed baseFinderFeed) {
        if (this.f12564e.mo2497u0()) {
            Integer c0 = C58784w3.m68436c0(C58784w3.f168295a, 7, false, 2, (Object) null);
            return c0 != null ? c0.intValue() : C0966R.raw.finder_outlined_like_private;
        } else if (C58739j4.f168176a.mo83688Q(baseFinderFeed.mo3507l())) {
            if (z) {
                Integer c05 = C58784w3.m68436c0(C58784w3.f168295a, 6, false, 2, (Object) null);
                return c05 != null ? c05.intValue() : C0966R.raw.finder_filled_like_lock;
            }
            Integer c06 = C58784w3.m68436c0(C58784w3.f168295a, 5, false, 2, (Object) null);
            return c06 != null ? c06.intValue() : C0966R.raw.finder_outlined_like_lock;
        } else if (!z) {
            Integer c07 = C58784w3.m68436c0(C58784w3.f168295a, 1, false, 2, (Object) null);
            return c07 != null ? c07.intValue() : C0966R.raw.finder_full_like_outlined;
        } else if (z2) {
            Integer c08 = C58784w3.m68436c0(C58784w3.f168295a, 6, false, 2, (Object) null);
            return c08 != null ? c08.intValue() : C0966R.raw.finder_filled_like_lock;
        } else {
            Integer c09 = C58784w3.m68436c0(C58784w3.f168295a, 2, false, 2, (Object) null);
            return c09 != null ? c09.intValue() : C0966R.raw.finder_full_like;
        }
    }

    /* renamed from: B0 */
    public final void mo2251B0(C60905o oVar, T t) {
        C60905o oVar2 = oVar;
        if (!t.mo3513o().isPrivate() || !C58784w3.f168295a.mo83897Q0(t)) {
            View D = oVar2.mo85812D(C0966R.C0970id.f358004cz2);
            if (D != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPrivateIcon", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPrivateIcon", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D2 = oVar2.mo85812D(C0966R.C0970id.f358003cz1);
            if (D2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view = D2;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPrivateIcon", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPrivateIcon", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        View D3 = oVar2.mo85812D(C0966R.C0970id.f358004cz2);
        if (D3 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view2 = D3;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPrivateIcon", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPrivateIcon", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View D4 = oVar2.mo85812D(C0966R.C0970id.f358003cz1);
        if (D4 != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view3 = D4;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPrivateIcon", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshPrivateIcon", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: C */
    public final View mo2252C(C60905o oVar) {
        View D = oVar.mo85812D(C0966R.C0970id.e6y);
        if (D == null) {
            D = ((ViewStub) oVar.mo85812D(C0966R.C0970id.e6z)).inflate();
            if (((TextView) D.findViewById(C0966R.C0970id.e6w)) != null) {
                oVar.f173499A.getString(C0966R.string.fny);
            }
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = D;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "getTipsView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "getTipsView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Float.valueOf(0.0f));
        View view2 = D;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "getTipsView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        D.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "getTipsView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        return D;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x00bd, code lost:
        r0 = vp1.C65834e.f189316a.mo89871e(r13.getItemId());
     */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2253C0(jq3.C60905o r12, T r13) {
        /*
            r11 = this;
            r0 = 2131311777(0x7f093ca1, float:1.8241904E38)
            android.view.View r0 = r12.mo85812D(r0)
            r1 = 2131306195(0x7f0926d3, float:1.8230582E38)
            android.view.View r1 = r12.mo85812D(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            kf1.v1 r2 = r11.f12564e
            boolean r2 = r2.mo2497u0()
            r9 = 0
            if (r2 != 0) goto L_0x005c
            r12 = 8
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13.mo10233c(r12)
            java.lang.Object[] r2 = r13.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r4 = "refreshRead"
            java.lang.String r5 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r12 = r13.mo10231a(r9)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r0.setVisibility(r12)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r3 = "refreshRead"
            java.lang.String r4 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x005c:
            r2 = 2131756299(0x7f10050b, float:1.9143502E38)
            r3 = 2131100930(0x7f060502, float:1.7814255E38)
            r1.mo104518r(r2, r3)
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r10.mo10233c(r1)
            java.lang.Object[] r2 = r10.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r4 = "refreshRead"
            java.lang.String r5 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r10.mo10231a(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r3 = "refreshRead"
            java.lang.String r4 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r0
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99511s4
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L_0x00bb
            r9 = 1
        L_0x00bb:
            if (r9 == 0) goto L_0x00ce
            vp1.e r0 = vp1.C65834e.f189316a
            long r1 = r13.getItemId()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo89871e(r1)
            if (r0 == 0) goto L_0x00ce
            int r13 = r0.getReadCount()
            goto L_0x00d6
        L_0x00ce:
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r13.mo3513o()
            int r13 = r13.getReadCount()
        L_0x00d6:
            long r0 = (long) r13
            java.lang.String r13 = er1.C7878t0.m8036e(r0)
            r0 = 2131311776(0x7f093ca0, float:1.8241902E38)
            android.view.View r12 = r12.mo85812D(r0)
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 == 0) goto L_0x00f3
            android.text.TextPaint r0 = r12.getPaint()
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r0, r1)
            r12.setText(r13)
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2253C0(jq3.o, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    /* renamed from: D */
    public final void mo2254D(int i, long j, FinderJumpInfo finderJumpInfo, Set<C11911l> set) {
        boolean z;
        FinderJumpInfo finderJumpInfo2 = finderJumpInfo;
        Set<C11911l> set2 = set;
        LinkedList<uc4> linkedList = finderJumpInfo2.style;
        C87412m.m108593f(linkedList, "jumpInfo.style");
        for (uc4 uc4 : linkedList) {
            T t = null;
            if (uc4.f142762h == 7) {
                C49730ho hoVar = uc4.f142771t.f145120d;
                finderJumpInfo2.wording = hoVar != null ? hoVar.f134754e : null;
            }
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((C11911l) next).f34805c == uc4.f142760f) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            C11911l lVar = (C11911l) t;
            if (lVar == null) {
                lVar = new C11911l(i, j, uc4.f142760f, new LinkedList(), false, (String) null, 48, (C8480h) null);
            }
            C64175a0.m75512t(lVar.f34806d, new C2359m(finderJumpInfo2));
            lVar.f34806d.add(finderJumpInfo2);
            lVar.f34809g.add(Integer.valueOf(finderJumpInfo.hashCode()));
            set2.remove(lVar);
            set2.add(lVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v90, resolved type: java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo>} */
    /* JADX WARNING: type inference failed for: r14v4, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r14v28 */
    /* JADX WARNING: type inference failed for: r14v36 */
    /* JADX WARNING: type inference failed for: r14v37 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0471  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x04f3  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0577  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x057a  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x059e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x05ff  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x06c8  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x06d9  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x07a2  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x07a5  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x07a8  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x07ae  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x07f8  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x07fa  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0809  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0811  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x081a  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x090c  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0958  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x09bf  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x04e3 A[EDGE_INSN: B:245:0x04e3->B:122:0x04e3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x043a  */
    /* renamed from: D0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2255D0(T r39, jq3.C60905o r40, boolean r41, int r42) {
        /*
            r38 = this;
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = r42
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r9, r0)
            vq1.w r0 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r39.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            java.util.LinkedList r11 = r0.mo89906e(r1)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r39.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            int r15 = r0.mo89905d(r1)
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L_0x0037
            java.lang.Thread r0 = r0.getThread()
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 == 0) goto L_0x0050
            android.animation.ValueAnimator r0 = r7.f12558E
            if (r0 == 0) goto L_0x005a
            r0.cancel()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x005a
        L_0x0050:
            android.view.View r0 = r9.f44854d
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$m1 r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$m1
            r1.<init>(r7)
            r0.post(r1)
        L_0x005a:
            boolean r0 = r38.mo2264I(r39)
            r25 = 8
            r1 = 2131311818(0x7f093cca, float:1.8241987E38)
            r14 = 2131305081(0x7f092279, float:1.8228323E38)
            r13 = 2131305078(0x7f092276, float:1.8228317E38)
            r6 = 1
            r5 = 0
            if (r0 != 0) goto L_0x0118
            android.view.View r0 = r9.mo85812D(r1)
            if (r0 != 0) goto L_0x0074
            goto L_0x00b5
        L_0x0074:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)
            r1.mo10233c(r2)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r19 = "refreshRealNameRecommendLayout"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZI)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r1 = r1.mo10231a(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r18 = "refreshRealNameRecommendLayout"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZI)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x00b5:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99529u4
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r6) goto L_0x00cd
            android.view.View r0 = r9.mo85812D(r13)
            goto L_0x00d1
        L_0x00cd:
            android.view.View r0 = r9.mo85812D(r14)
        L_0x00d1:
            if (r0 != 0) goto L_0x00d4
            goto L_0x0114
        L_0x00d4:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)
            r1.mo10233c(r2)
            java.lang.Object[] r11 = r1.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r13 = "refreshRealNameRecommendLayout"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZI)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r0
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r1 = r1.mo10231a(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r12 = "refreshRealNameRecommendLayout"
            java.lang.String r13 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZI)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x0114:
            r7.mo2303l(r9)
            return
        L_0x0118:
            boolean r0 = r7.f12560G
            if (r0 == 0) goto L_0x0123
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r4 = 1036831949(0x3dcccccd, float:0.1)
            goto L_0x0127
        L_0x0123:
            r0 = 1056964608(0x3f000000, float:0.5)
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x0127:
            android.view.View r0 = r9.mo85812D(r1)
            if (r0 == 0) goto L_0x09da
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.mo10233c(r3)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r19 = "refreshRealNameRecommendLayout"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZI)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r18 = "refreshRealNameRecommendLayout"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZI)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0 = 2131305189(0x7f0922e5, float:1.8228542E38)
            android.view.View r0 = r9.mo85812D(r0)
            r3.add(r0)
            r0 = 2131305191(0x7f0922e7, float:1.8228546E38)
            android.view.View r0 = r9.mo85812D(r0)
            r3.add(r0)
            r0 = 2131305193(0x7f0922e9, float:1.822855E38)
            android.view.View r0 = r9.mo85812D(r0)
            r3.add(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0 = 2131305190(0x7f0922e6, float:1.8228544E38)
            android.view.View r0 = r9.mo85812D(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r13 = 2131305192(0x7f0922e8, float:1.8228548E38)
            android.view.View r13 = r9.mo85812D(r13)
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            r14 = 2131305194(0x7f0922ea, float:1.8228552E38)
            android.view.View r14 = r9.mo85812D(r14)
            android.widget.FrameLayout r14 = (android.widget.FrameLayout) r14
            r1 = 2131305200(0x7f0922f0, float:1.8228564E38)
            android.view.View r1 = r9.mo85812D(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            up1.f r19 = up1.C37521f.f99374d
            r19.getClass()
            pe1.c<java.lang.Integer> r19 = up1.C37521f.f99529u4
            java.lang.Object r19 = r19.mo60266n()
            java.lang.Number r19 = (java.lang.Number) r19
            int r12 = r19.intValue()
            if (r12 != r6) goto L_0x01f7
            android.content.Context r12 = r9.f173499A
            android.content.res.Resources r12 = r12.getResources()
            r6 = 2131165348(0x7f0700a4, float:1.794491E38)
            float r6 = r12.getDimension(r6)
            int r6 = (int) r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            android.content.Context r12 = r9.f173499A
            android.content.res.Resources r12 = r12.getResources()
            r5 = 2131165346(0x7f0700a2, float:1.7944907E38)
            float r5 = r12.getDimension(r5)
            int r5 = (int) r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            rx3.l r12 = new rx3.l
            r12.<init>(r6, r5)
            goto L_0x0220
        L_0x01f7:
            android.content.Context r5 = r9.f173499A
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131165337(0x7f070099, float:1.7944888E38)
            float r5 = r5.getDimension(r6)
            int r5 = (int) r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            android.content.Context r6 = r9.f173499A
            android.content.res.Resources r6 = r6.getResources()
            r12 = 2131165329(0x7f070091, float:1.7944872E38)
            float r6 = r6.getDimension(r12)
            int r6 = (int) r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            rx3.l r12 = new rx3.l
            r12.<init>(r5, r6)
        L_0x0220:
            A r5 = r12.f38555d
            java.lang.Number r5 = (java.lang.Number) r5
            int r6 = r5.intValue()
            B r5 = r12.f38556e
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            boolean r12 = r7.f12560G
            if (r12 == 0) goto L_0x02c7
            android.view.ViewGroup$LayoutParams r12 = r0.getLayoutParams()
            java.lang.String r10 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            gy3.C87412m.m108592e(r12, r10)
            android.widget.FrameLayout$LayoutParams r12 = (android.widget.FrameLayout.LayoutParams) r12
            r12.width = r6
            r12.height = r6
            r0.setLayoutParams(r12)
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            gy3.C87412m.m108592e(r12, r10)
            android.widget.FrameLayout$LayoutParams r12 = (android.widget.FrameLayout.LayoutParams) r12
            r12.leftMargin = r6
            r12.width = r6
            r12.height = r6
            r13.setLayoutParams(r12)
            android.view.ViewGroup$LayoutParams r12 = r14.getLayoutParams()
            gy3.C87412m.m108592e(r12, r10)
            android.widget.FrameLayout$LayoutParams r12 = (android.widget.FrameLayout.LayoutParams) r12
            r22 = r15
            int r15 = r6 * 2
            r12.leftMargin = r15
            r12.width = r6
            r12.height = r6
            r14.setLayoutParams(r12)
            android.view.ViewGroup$LayoutParams r12 = r1.getLayoutParams()
            gy3.C87412m.m108592e(r12, r10)
            android.widget.FrameLayout$LayoutParams r12 = (android.widget.FrameLayout.LayoutParams) r12
            r12.width = r6
            r12.height = r6
            r1.setLayoutParams(r12)
            java.util.Iterator r1 = r3.iterator()
        L_0x0282:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x02a7
            java.lang.Object r10 = r1.next()
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            if (r10 == 0) goto L_0x0295
            android.view.ViewGroup$LayoutParams r12 = r10.getLayoutParams()
            goto L_0x0296
        L_0x0295:
            r12 = 0
        L_0x0296:
            if (r12 != 0) goto L_0x0299
            goto L_0x029b
        L_0x0299:
            r12.width = r5
        L_0x029b:
            if (r12 != 0) goto L_0x029e
            goto L_0x02a0
        L_0x029e:
            r12.height = r5
        L_0x02a0:
            if (r10 != 0) goto L_0x02a3
            goto L_0x0282
        L_0x02a3:
            r10.setLayoutParams(r12)
            goto L_0x0282
        L_0x02a7:
            r1 = 2131305196(0x7f0922ec, float:1.8228556E38)
            android.view.View r1 = r9.mo85812D(r1)
            if (r1 == 0) goto L_0x02b5
            android.view.ViewGroup$LayoutParams r10 = r1.getLayoutParams()
            goto L_0x02b6
        L_0x02b5:
            r10 = 0
        L_0x02b6:
            if (r10 != 0) goto L_0x02b9
            goto L_0x02bb
        L_0x02b9:
            r10.width = r5
        L_0x02bb:
            if (r10 != 0) goto L_0x02be
            goto L_0x02c0
        L_0x02be:
            r10.height = r5
        L_0x02c0:
            if (r1 != 0) goto L_0x02c3
            goto L_0x02c9
        L_0x02c3:
            r1.setLayoutParams(r10)
            goto L_0x02c9
        L_0x02c7:
            r22 = r15
        L_0x02c9:
            r2.add(r0)
            r2.add(r13)
            r2.add(r14)
            r0 = 2131297727(0x7f0905bf, float:1.8213407E38)
            android.view.View r0 = r9.mo85812D(r0)
            com.tencent.mm.plugin.finder.feed.RoundLinearLayout r0 = (com.tencent.p014mm.plugin.finder.feed.RoundLinearLayout) r0
            if (r0 == 0) goto L_0x02ec
            r0.setRadius(r4)
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            r5 = 0
            r0.setBackground(r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x02ee
        L_0x02ec:
            r1 = 0
            r5 = 0
        L_0x02ee:
            r0 = 2131297728(0x7f0905c0, float:1.821341E38)
            android.view.View r0 = r9.mo85812D(r0)
            com.tencent.mm.plugin.finder.feed.RoundLinearLayout r0 = (com.tencent.p014mm.plugin.finder.feed.RoundLinearLayout) r0
            if (r0 == 0) goto L_0x0305
            r0.setRadius(r4)
            android.view.View r0 = r0.getChildAt(r1)
            r0.setBackground(r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0305:
            r0 = 2131297729(0x7f0905c1, float:1.8213411E38)
            android.view.View r0 = r9.mo85812D(r0)
            com.tencent.mm.plugin.finder.feed.RoundLinearLayout r0 = (com.tencent.p014mm.plugin.finder.feed.RoundLinearLayout) r0
            if (r0 == 0) goto L_0x031c
            r0.setRadius(r4)
            android.view.View r0 = r0.getChildAt(r1)
            r0.setBackground(r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x031c:
            r0 = 2131305197(0x7f0922ed, float:1.8228558E38)
            android.view.View r0 = r9.mo85812D(r0)
            com.tencent.mm.plugin.finder.feed.RoundLinearLayout r0 = (com.tencent.p014mm.plugin.finder.feed.RoundLinearLayout) r0
            if (r0 == 0) goto L_0x032c
            r0.setRadius(r4)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x032c:
            vq1.w r0 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r39.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            rx3.l r0 = r0.mo89908g(r1)
            A r1 = r0.f38555d
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            B r0 = r0.f38556e
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$q1 r5 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$q1
            r10 = r41
            r5.<init>(r10, r1, r0, r11)
            java.lang.Object r0 = r5.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0366
            boolean r0 = r7 instanceof com.tencent.p014mm.plugin.finder.convert.C2422e
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0367
            r19 = 1
            goto L_0x0369
        L_0x0366:
            r1 = 1
        L_0x0367:
            r19 = 0
        L_0x0369:
            r10 = 2131311819(0x7f093ccb, float:1.824199E38)
            if (r19 == 0) goto L_0x045c
            int r0 = r11.size()
            if (r0 != r1) goto L_0x0408
            android.view.View r0 = r9.mo85812D(r10)
            r1 = 0
            if (r0 != 0) goto L_0x037c
            goto L_0x03bc
        L_0x037c:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Float r12 = java.lang.Float.valueOf(r1)
            r5.mo10233c(r12)
            java.lang.Object[] r27 = r5.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r29 = "refreshRealNameRecommendLayout"
            java.lang.String r30 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZI)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setAlpha"
            java.lang.String r33 = "(F)V"
            r26 = r0
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            r12 = 0
            java.lang.Object r5 = r5.mo10231a(r12)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r0.setAlpha(r5)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r28 = "refreshRealNameRecommendLayout"
            java.lang.String r29 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZI)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setAlpha"
            java.lang.String r32 = "(F)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
        L_0x03bc:
            r0 = 0
            java.lang.Object r5 = r2.get(r0)
            r0 = r5
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L_0x03c7
            goto L_0x0408
        L_0x03c7:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r5.mo10233c(r1)
            java.lang.Object[] r27 = r5.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r29 = "refreshRealNameRecommendLayout"
            java.lang.String r30 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZI)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setAlpha"
            java.lang.String r33 = "(F)V"
            r26 = r0
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            r12 = 0
            java.lang.Object r1 = r5.mo10231a(r12)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r0.setAlpha(r1)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r28 = "refreshRealNameRecommendLayout"
            java.lang.String r29 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZI)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setAlpha"
            java.lang.String r32 = "(F)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
            goto L_0x0409
        L_0x0408:
            r12 = 0
        L_0x0409:
            int r0 = r11.size()
            r1 = 1
            if (r0 <= r1) goto L_0x043a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r11.iterator()
        L_0x0419:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0438
            java.lang.Object r5 = r1.next()
            r13 = r5
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r13 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r13
            java.lang.String r13 = r13.username
            java.lang.String r14 = eb0.C75592q0.m90789s()
            boolean r13 = gy3.C87412m.m108589b(r13, r14)
            r14 = 1
            r13 = r13 ^ r14
            if (r13 == 0) goto L_0x0419
            r0.add(r5)
            goto L_0x0419
        L_0x0438:
            r14 = 1
            goto L_0x043c
        L_0x043a:
            r14 = 1
            r0 = r11
        L_0x043c:
            r7.mo2290b0(r0, r3, r2, r4)
            r0 = 2131311818(0x7f093cca, float:1.8241987E38)
            android.view.View r13 = r9.mo85812D(r0)
            if (r13 == 0) goto L_0x0463
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$n1 r15 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$n1
            r0 = r15
            r1 = r38
            r5 = r2
            r2 = r40
            r41 = r4
            r4 = r5
            r5 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r13.post(r15)
            goto L_0x0463
        L_0x045c:
            r5 = r2
            r0 = r4
            r12 = 0
            r14 = 1
            r7.mo2290b0(r11, r3, r5, r0)
        L_0x0463:
            er1.w3 r26 = er1.C58784w3.f168295a
            java.lang.Object r0 = r11.get(r12)
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r0
            java.lang.String r0 = r0.username
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0474
            r27 = r1
            goto L_0x0476
        L_0x0474:
            r27 = r0
        L_0x0476:
            java.lang.Object r0 = r11.get(r12)
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = (com.tencent.p014mm.protocal.protobuf.FinderCommentInfo) r0
            java.lang.String r0 = r0.nickname
            if (r0 != 0) goto L_0x0483
            r28 = r1
            goto L_0x0485
        L_0x0483:
            r28 = r0
        L_0x0485:
            r29 = 0
            r30 = 4
            r31 = 0
            java.lang.String r0 = er1.C58784w3.m68433S(r26, r27, r28, r29, r30, r31)
            java.lang.String r2 = "[一-龥]"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r3 = "compile(pattern)"
            gy3.C87412m.m108593f(r2, r3)
            int r3 = r0.length()
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x04a1:
            if (r5 >= r3) goto L_0x04e3
            int r11 = r5 + 1
            java.lang.String r13 = r0.substring(r5, r11)
            java.lang.String r15 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r13, r15)
            java.util.regex.Matcher r13 = r2.matcher(r13)
            boolean r13 = r13.matches()
            if (r13 == 0) goto L_0x04bc
            int r6 = r6 + 1
            goto L_0x04be
        L_0x04bc:
            int r4 = r4 + 1
        L_0x04be:
            int r13 = r6 * 2
            int r13 = r13 + r4
            r10 = 14
            if (r13 <= r10) goto L_0x04de
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r0.substring(r12, r5)
            gy3.C87412m.m108593f(r0, r15)
            r2.append(r0)
            java.lang.String r0 = "..."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x04e3
        L_0x04de:
            r5 = r11
            r10 = 2131311819(0x7f093ccb, float:1.824199E38)
            goto L_0x04a1
        L_0x04e3:
            r2 = 2131311820(0x7f093ccc, float:1.8241991E38)
            android.view.View r2 = r9.mo85812D(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 1097859072(0x41700000, float:15.0)
            r4 = 1061997773(0x3f4ccccd, float:0.8)
            if (r2 == 0) goto L_0x051a
            android.content.Context r10 = r9.f173499A
            android.content.res.Resources r10 = r10.getResources()
            boolean r11 = r7.f12567h
            if (r11 == 0) goto L_0x0501
            r11 = 2131099682(0x7f060022, float:1.7811724E38)
            goto L_0x0504
        L_0x0501:
            r11 = 2131100935(0x7f060507, float:1.7814265E38)
        L_0x0504:
            int r10 = r10.getColor(r11)
            r2.setTextColor(r10)
            android.text.TextPaint r10 = r2.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r10, r4)
            r2.setTextSize(r14, r3)
            r2.setText(r1)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x051a:
            r2 = 2131311817(0x7f093cc9, float:1.8241985E38)
            android.view.View r2 = r9.mo85812D(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r10 = 2
            r2.setMaxLines(r10)
            android.content.Context r11 = r9.f173499A
            android.content.res.Resources r11 = r11.getResources()
            boolean r13 = r7.f12567h
            if (r13 == 0) goto L_0x0535
            r13 = 2131099682(0x7f060022, float:1.7811724E38)
            goto L_0x0538
        L_0x0535:
            r13 = 2131100935(0x7f060507, float:1.7814265E38)
        L_0x0538:
            int r11 = r11.getColor(r13)
            r2.setTextColor(r11)
            android.text.TextPaint r11 = r2.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r11, r4)
            r2.setTextSize(r14, r3)
            er1.w3 r3 = er1.C58784w3.f168295a
            boolean r4 = r3.mo83886M0(r8)
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r39.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r11.getFeedObject()
            int r11 = r11.incFriendLikeCount
            int r15 = r22 - r11
            wp1.j r13 = wp1.C15587j.f42215a
            com.tencent.mm.plugin.finder.storage.FinderItem r18 = r39.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r18.getFeedObject()
            int r5 = r5.objectType
            te3.if1 r5 = r13.mo14351c(r5)
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r39.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r13.getFeedObject()
            int r13 = r13.objectType
            if (r13 != r14) goto L_0x057a
            r18 = 1
            goto L_0x057c
        L_0x057a:
            r18 = 0
        L_0x057c:
            up1.f r13 = up1.C37521f.f99374d
            r13.getClass()
            pe1.c<java.lang.Integer> r13 = up1.C37521f.f99223L4
            java.lang.Object r13 = r13.mo60266n()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            if (r13 != r10) goto L_0x0591
            r13 = 1
            goto L_0x0592
        L_0x0591:
            r13 = 0
        L_0x0592:
            java.lang.String r6 = "holder.context"
            r34 = 2131755982(0x7f1003ce, float:1.9142859E38)
            r12 = 2131165324(0x7f07008c, float:1.7944862E38)
            r10 = r22
            if (r10 > r14) goto L_0x05ff
            if (r5 != 0) goto L_0x05ea
            if (r18 != 0) goto L_0x05ea
            android.content.Context r13 = r9.f173499A
            android.content.res.Resources r13 = r13.getResources()
            float r13 = r13.getDimension(r12)
            int r13 = (int) r13
            java.lang.Integer r22 = r3.mo83917b0(r14, r14)
            if (r22 == 0) goto L_0x05ba
            int r22 = r22.intValue()
            r30 = r22
            goto L_0x05bd
        L_0x05ba:
            r30 = 2131755982(0x7f1003ce, float:1.9142859E38)
        L_0x05bd:
            android.content.Context r12 = r9.f173499A
            gy3.C87412m.m108593f(r12, r6)
            android.content.Context r14 = r9.f173499A
            r8 = 2131829708(0x7f1123cc, float:1.9292393E38)
            java.lang.String r8 = r14.getString(r8)
            java.lang.String r14 = "holder.context.getString…name_recommend_desc2_new)"
            gy3.C87412m.m108593f(r8, r14)
            r29 = 35
            boolean r14 = r7.f12567h
            if (r14 == 0) goto L_0x05da
            r31 = 2131099682(0x7f060022, float:1.7811724E38)
            goto L_0x05dd
        L_0x05da:
            r31 = 2131100935(0x7f060507, float:1.7814265E38)
        L_0x05dd:
            r26 = r3
            r27 = r12
            r28 = r8
            r32 = r13
            r33 = r13
            r26.mo83957q1(r27, r28, r29, r30, r31, r32, r33)
        L_0x05ea:
            android.content.Context r8 = r9.f173499A
            r12 = 2131826013(0x7f11155d, float:1.9284898E38)
            java.lang.String r8 = r8.getString(r12)
            java.lang.String r12 = "holder.context.getString…eal_name_recommend_desc2)"
            gy3.C87412m.m108593f(r8, r12)
            r36 = r1
            r35 = r5
            r12 = 1
            goto L_0x06c6
        L_0x05ff:
            java.lang.String r8 = "holder.context.getString…t + incCount).toString())"
            if (r5 == 0) goto L_0x0632
            java.lang.String r12 = r5.f135263f
            if (r12 == 0) goto L_0x0610
            int r12 = r12.length()
            if (r12 != 0) goto L_0x060e
            goto L_0x0610
        L_0x060e:
            r12 = 0
            goto L_0x0611
        L_0x0610:
            r12 = 1
        L_0x0611:
            if (r12 == 0) goto L_0x0614
            goto L_0x0632
        L_0x0614:
            if (r18 == 0) goto L_0x0619
            if (r13 == 0) goto L_0x0619
            goto L_0x062c
        L_0x0619:
            java.lang.String r12 = r5.f135263f
            if (r12 == 0) goto L_0x062c
            int r13 = r15 + r11
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r14 = "$$"
            r35 = r5
            r5 = 1
            z04.C112551y.m153814n(r12, r14, r13, r5)
            goto L_0x062f
        L_0x062c:
            r35 = r5
            r5 = 1
        L_0x062f:
            r36 = r1
            goto L_0x068e
        L_0x0632:
            r35 = r5
            r5 = 1
            if (r18 != 0) goto L_0x0692
            android.content.Context r12 = r9.f173499A
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131165324(0x7f07008c, float:1.7944862E38)
            float r12 = r12.getDimension(r13)
            int r12 = (int) r12
            java.lang.Integer r14 = r3.mo83917b0(r5, r5)
            if (r14 == 0) goto L_0x0652
            int r14 = r14.intValue()
            r30 = r14
            goto L_0x0655
        L_0x0652:
            r30 = 2131755982(0x7f1003ce, float:1.9142859E38)
        L_0x0655:
            android.content.Context r14 = r9.f173499A
            gy3.C87412m.m108593f(r14, r6)
            android.content.Context r13 = r9.f173499A
            r36 = r1
            java.lang.Object[] r1 = new java.lang.Object[r5]
            int r5 = r15 + r11
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r23 = 0
            r1[r23] = r5
            r5 = 2131829705(0x7f1123c9, float:1.9292387E38)
            java.lang.String r1 = r13.getString(r5, r1)
            gy3.C87412m.m108593f(r1, r8)
            r29 = 35
            boolean r5 = r7.f12567h
            if (r5 == 0) goto L_0x067e
            r31 = 2131099682(0x7f060022, float:1.7811724E38)
            goto L_0x0681
        L_0x067e:
            r31 = 2131100935(0x7f060507, float:1.7814265E38)
        L_0x0681:
            r26 = r3
            r27 = r14
            r28 = r1
            r32 = r12
            r33 = r12
            r26.mo83957q1(r27, r28, r29, r30, r31, r32, r33)
        L_0x068e:
            r12 = 1
            r23 = 0
            goto L_0x06b0
        L_0x0692:
            r36 = r1
            android.content.Context r1 = r9.f173499A
            r5 = 2131829710(0x7f1123ce, float:1.9292397E38)
            r12 = 1
            java.lang.Object[] r13 = new java.lang.Object[r12]
            int r14 = r15 + r11
            java.lang.String r14 = java.lang.String.valueOf(r14)
            r23 = 0
            r13[r23] = r14
            java.lang.String r1 = r1.getString(r5, r13)
            java.lang.String r5 = "{\n                      …())\n                    }"
            gy3.C87412m.m108593f(r1, r5)
        L_0x06b0:
            android.content.Context r1 = r9.f173499A
            java.lang.Object[] r5 = new java.lang.Object[r12]
            int r13 = r15 + r11
            java.lang.String r13 = java.lang.String.valueOf(r13)
            r5[r23] = r13
            r13 = 2131826011(0x7f11155b, float:1.9284894E38)
            java.lang.String r1 = r1.getString(r13, r5)
            gy3.C87412m.m108593f(r1, r8)
        L_0x06c6:
            if (r10 > r12) goto L_0x06d9
            android.content.Context r1 = r9.f173499A
            r5 = 2131826013(0x7f11155d, float:1.9284898E38)
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r5 = "{\n                holder…mend_desc2)\n            }"
            gy3.C87412m.m108593f(r1, r5)
            r5 = 1
            goto L_0x0711
        L_0x06d9:
            java.lang.String r1 = "{\n                type =…toString())\n            }"
            if (r11 <= 0) goto L_0x06f8
            android.content.Context r5 = r9.f173499A
            r8 = 2131826012(0x7f11155c, float:1.9284896E38)
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.String r14 = java.lang.String.valueOf(r11)
            r23 = 0
            r13[r23] = r14
            java.lang.String r5 = r5.getString(r8, r13)
            gy3.C87412m.m108593f(r5, r1)
            r1 = 5
            r1 = r5
            r5 = 5
            goto L_0x0711
        L_0x06f8:
            r23 = 0
            android.content.Context r5 = r9.f173499A
            java.lang.Object[] r8 = new java.lang.Object[r12]
            int r15 = r15 + r11
            java.lang.String r12 = java.lang.String.valueOf(r15)
            r8[r23] = r12
            r12 = 2131826011(0x7f11155b, float:1.9284894E38)
            java.lang.String r5 = r5.getString(r12, r8)
            gy3.C87412m.m108593f(r5, r1)
            r1 = r5
            r5 = 2
        L_0x0711:
            cm1.t2 r8 = new cm1.t2
            r8.<init>()
            android.content.Context r15 = r9.f173499A
            gy3.C87412m.m108593f(r15, r6)
            if (r11 <= 0) goto L_0x0722
            if (r4 == 0) goto L_0x0722
            r19 = r11
            goto L_0x0724
        L_0x0722:
            r19 = 0
        L_0x0724:
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r39.mo3513o()
            long r12 = r12.getId()
            boolean r14 = r7.f12567h
            r21 = r10
            java.lang.String r10 = "prefixText"
            gy3.C87412m.m108594g(r0, r10)
            boolean r10 = r8.f1820d
            r8.f1820d = r10
            r10 = 0
            r8.f1821e = r10
            r10 = -1
            r8.f1822f = r10
            r8.f1824h = r15
            r10 = r42
            r8.f1823g = r10
            r24 = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r37 = r1
            java.lang.String r1 = "position:"
            r14.append(r1)
            r14.append(r10)
            java.lang.String r1 = " hashCode:"
            r14.append(r1)
            int r1 = r8.hashCode()
            r14.append(r1)
            java.lang.String r1 = " setDesc textView:"
            r14.append(r1)
            java.lang.CharSequence r1 = r2.getText()
            r14.append(r1)
            java.lang.String r1 = " textView hash:"
            r14.append(r1)
            int r1 = r2.hashCode()
            r14.append(r1)
            java.lang.String r1 = " prefix:"
            r14.append(r1)
            r14.append(r0)
            java.lang.String r1 = "  feedId:"
            r14.append(r1)
            java.lang.String r1 = o40.C61926c.m72691p(r12)
            r14.append(r1)
            java.lang.String r1 = r14.toString()
            java.lang.String r10 = "Finder.SyncGetImageModel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            r1 = 2131302951(0x7f091a27, float:1.8224003E38)
            java.lang.Object r10 = r2.getTag(r1)
            boolean r12 = r10 instanceof a14.C53973z1
            if (r12 == 0) goto L_0x07a5
            a14.z1 r10 = (a14.C53973z1) r10
            goto L_0x07a6
        L_0x07a5:
            r10 = 0
        L_0x07a6:
            if (r10 == 0) goto L_0x07ae
            r12 = 0
            r14 = 1
            a14.C53973z1.C53974a.m60623a(r10, r12, r14, r12)
            goto L_0x07af
        L_0x07ae:
            r14 = 1
        L_0x07af:
            r10 = r36
            r2.setText(r10)
            r27 = 0
            r28 = 0
            cm1.a3 r29 = new cm1.a3
            r26 = 0
            r42 = 0
            r13 = 2131165324(0x7f07008c, float:1.7944862E38)
            r12 = r29
            r13 = r8
            r23 = r24
            r14 = r2
            r20 = r21
            r16 = r0
            r17 = r18
            r18 = r20
            r20 = r4
            r21 = r35
            r22 = r5
            r24 = r26
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r30 = 3
            r31 = 0
            r26 = r8
            a14.z1 r5 = cm1.C0777t2.m721i3(r26, r27, r28, r29, r30, r31)
            r8.f1825i = r5
            r2.setTag(r1, r5)
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99396f4
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = 1
            if (r1 != r2) goto L_0x07fa
            r1 = 1
            goto L_0x07fb
        L_0x07fa:
            r1 = 0
        L_0x07fb:
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99529u4
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != r2) goto L_0x0811
            r5 = 2131305078(0x7f092276, float:1.8228317E38)
            android.view.View r5 = r9.mo85812D(r5)
            goto L_0x0818
        L_0x0811:
            r5 = 2131305081(0x7f092279, float:1.8228323E38)
            android.view.View r5 = r9.mo85812D(r5)
        L_0x0818:
            if (r1 == 0) goto L_0x090c
            vq1.w r1 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r39.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.getFeedObject()
            rx3.l r1 = r1.mo89908g(r8)
            A r8 = r1.f38555d
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            B r1 = r1.f38556e
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
            boolean r1 = r39.mo3472F()
            if (r1 == 0) goto L_0x08c2
            if (r8 == 0) goto L_0x0841
            goto L_0x08c2
        L_0x0841:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r42)
            r1.mo10233c(r8)
            java.lang.Object[] r13 = r1.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r15 = "refreshRealNameRecommendLayout"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZI)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r5
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            r8 = 0
            java.lang.Object r1 = r1.mo10231a(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.setVisibility(r1)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r14 = "refreshRealNameRecommendLayout"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZI)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            r1 = 1065353216(0x3f800000, float:1.0)
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r15.mo10233c(r1)
            java.lang.Object[] r13 = r15.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r1 = "refreshRealNameRecommendLayout"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZI)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setAlpha"
            java.lang.String r19 = "(F)V"
            r2 = r15
            r15 = r1
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r1 = r2.mo10231a(r8)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r5.setAlpha(r1)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r14 = "refreshRealNameRecommendLayout"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZI)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setAlpha"
            java.lang.String r18 = "(F)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0901
        L_0x08c2:
            r8 = 0
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)
            r1.mo10233c(r2)
            java.lang.Object[] r13 = r1.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r15 = "refreshRealNameRecommendLayout"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZI)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r5
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r1 = r1.mo10231a(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.setVisibility(r1)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r14 = "refreshRealNameRecommendLayout"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZI)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
        L_0x0901:
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$o1 r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$o1
            r2 = r39
            r1.<init>(r9, r2, r5)
            r5.setOnClickListener(r1)
            goto L_0x094d
        L_0x090c:
            r2 = r39
            r8 = 0
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r25)
            r1.mo10233c(r12)
            java.lang.Object[] r13 = r1.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r15 = "refreshRealNameRecommendLayout"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZI)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r5
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r1 = r1.mo10231a(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.setVisibility(r1)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r14 = "refreshRealNameRecommendLayout"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZI)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
        L_0x094d:
            r1 = 2131311819(0x7f093ccb, float:1.824199E38)
            android.view.View r1 = r9.mo85812D(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x0962
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$p1 r5 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$p1
            r5.<init>(r9, r7, r2)
            r1.setOnClickListener(r5)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0962:
            if (r11 <= 0) goto L_0x09bc
            if (r4 == 0) goto L_0x09bc
            android.content.Context r2 = r9.f173499A
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2131165324(0x7f07008c, float:1.7944862E38)
            float r2 = r2.getDimension(r4)
            int r2 = (int) r2
            r4 = 1
            java.lang.Integer r5 = r3.mo83917b0(r4, r4)
            if (r5 == 0) goto L_0x0982
            int r5 = r5.intValue()
            r30 = r5
            goto L_0x0985
        L_0x0982:
            r30 = 2131755982(0x7f1003ce, float:1.9142859E38)
        L_0x0985:
            android.content.Context r5 = r9.f173499A
            gy3.C87412m.m108593f(r5, r6)
            android.content.Context r6 = r9.f173499A
            r10 = 2131829283(0x7f112223, float:1.929153E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r4[r8] = r11
            java.lang.String r4 = r6.getString(r10, r4)
            java.lang.String r6 = "holder.context.getString…riend_like_new, incCount)"
            gy3.C87412m.m108593f(r4, r6)
            r29 = 35
            boolean r6 = r7.f12567h
            if (r6 == 0) goto L_0x09aa
            r31 = 2131099682(0x7f060022, float:1.7811724E38)
            goto L_0x09ad
        L_0x09aa:
            r31 = 2131100935(0x7f060507, float:1.7814265E38)
        L_0x09ad:
            r26 = r3
            r27 = r5
            r28 = r4
            r32 = r2
            r33 = r2
            java.lang.CharSequence r2 = r26.mo83957q1(r27, r28, r29, r30, r31, r32, r33)
            goto L_0x09bd
        L_0x09bc:
            r2 = r10
        L_0x09bd:
            if (r1 == 0) goto L_0x09d5
            r3 = 2131302575(0x7f0918af, float:1.822324E38)
            r1.setTag(r3, r0)
            r0 = 2131302517(0x7f091875, float:1.8223122E38)
            r5 = r37
            r1.setTag(r0, r5)
            r0 = 2131302518(0x7f091876, float:1.8223124E38)
            r1.setTag(r0, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x09d5:
            r7.mo2303l(r9)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x09da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2255D0(com.tencent.mm.plugin.finder.model.BaseFinderFeed, jq3.o, boolean, int):void");
    }

    /* renamed from: E */
    public final void mo2256E(C60905o oVar, T t) {
        C60905o oVar2 = oVar;
        if (t.mo3479M()) {
            int d = C76577a.m92153d(oVar2.f173499A, this.f12567h ? C0966R.color.BW_0_Alpha_0_4 : C0966R.color.f3395rc);
            oVar2.mo85812D(C0966R.C0970id.a27).setEnabled(false);
            oVar2.mo85812D(C0966R.C0970id.bh6).setEnabled(false);
            ViewGroup viewGroup = (ViewGroup) oVar2.mo85812D(C0966R.C0970id.e6u);
            View D = oVar2.mo85812D(C0966R.C0970id.edb);
            if (D != null) {
                ((TextView) D.findViewById(C0966R.C0970id.jhv)).setTextColor(d);
                ((WeImageView) D.findViewById(C0966R.C0970id.f358430f22)).setIconColor(d);
                D.findViewById(C0966R.C0970id.ji4).setEnabled(false);
                ((TextView) D.findViewById(C0966R.C0970id.fnp)).setTextColor(d);
                View view = null;
                Integer c0 = C58784w3.m68436c0(C58784w3.f168295a, 2, false, 2, (Object) null);
                C87515a.m108835e(oVar2.f173499A.getResources(), c0 != null ? c0.intValue() : C0966R.raw.finder_full_like, 0.0f);
                ((WeImageView) D.findViewById(C0966R.C0970id.f1x)).setIconColor(d);
                D.findViewById(C0966R.C0970id.a2s).setEnabled(false);
                ((TextView) D.findViewById(C0966R.C0970id.bje)).setTextColor(d);
                ((WeImageView) D.findViewById(C0966R.C0970id.f1t)).setIconColor(d);
                D.findViewById(C0966R.C0970id.bjq).setEnabled(false);
                ((TextView) D.findViewById(C0966R.C0970id.f359286k04)).setTextColor(d);
                ((WeImageView) D.findViewById(C0966R.C0970id.f26)).setIconColor(d);
                D.findViewById(C0966R.C0970id.k07).setEnabled(false);
                if (viewGroup != null) {
                    view = viewGroup.findViewById(C0966R.C0970id.a2r);
                }
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(4);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "handlePreviewStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "handlePreviewStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                oVar2.mo85812D(C0966R.C0970id.ki5).setEnabled(false);
                return;
            }
            return;
        }
    }

    /* renamed from: E0 */
    public final void mo2257E0(T t, C60905o oVar, boolean z, String str) {
        C4105m5<BaseFinderFeed> m5Var;
        C4105m5<BaseFinderFeed> m5Var2;
        LinearLayout linearLayout;
        C60905o oVar2 = oVar;
        String str2 = str;
        Class cls = C61212e.class;
        View D = oVar2.mo85812D(C0966R.C0970id.ec5);
        if (z && D.getVisibility() == 0) {
            C58961d.C58963b bVar = C58961d.f168673a;
            String str3 = t.mo3513o().field_username;
            C64284cg bizInfo = t.mo3513o().getBizInfo();
            if (!C58961d.C58963b.m68836h(bVar, str3, bizInfo != null ? bizInfo.f182468d : null, false, false, 12, (Object) null)) {
                C39818r rVar = C39818r.f106831a;
                Context context = oVar2.f173499A;
                C87412m.m108593f(context, "holder.context");
                FinderLikeGuideUIC finderLikeGuideUIC = (FinderLikeGuideUIC) rVar.mo62443b(context).mo62449e(FinderLikeGuideUIC.class);
                if (!(finderLikeGuideUIC == null || (linearLayout = finderLikeGuideUIC.f18758d) == null)) {
                    linearLayout.setVisibility(8);
                }
                Context context2 = oVar2.f173499A;
                C87412m.m108593f(context2, "holder.context");
                C13480ua uaVar = (C13480ua) rVar.mo62443b(context2).mo62449e(C13480ua.class);
                if (!(uaVar == null || (m5Var2 = uaVar.f38200d) == null)) {
                    m5Var2.mo4985a();
                }
                View C = mo2252C(oVar2);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = C;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRecommendFollowTips", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshRecommendFollowTips", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                Context context3 = oVar2.f173499A;
                C87412m.m108593f(context3, "holder.context");
                C13334ma maVar = (C13334ma) rVar.mo62443b(context3).mo62449e(C13334ma.class);
                if (!(maVar == null || (m5Var = maVar.f37825d) == null)) {
                    m5Var.mo4985a();
                }
                Context context4 = oVar2.f173499A;
                C87412m.m108593f(context4, "holder.context");
                C4105m5 m5Var3 = new C4105m5(context4, (C4105m5.C4106a) null, 2, (C8480h) null);
                m5Var3.f18267q = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
                C87412m.m108594g(str2, "tips");
                m5Var3.f18261h.setText(str2);
                m5Var3.f18260g = true;
                int dimensionPixelOffset = oVar2.f173499A.getResources().getDimensionPixelOffset(C0966R.dimen.f3723cd);
                View view2 = m5Var3.f18263j;
                view2.setPadding(dimensionPixelOffset, view2.getPaddingTop(), dimensionPixelOffset, m5Var3.f18263j.getPaddingBottom());
                m5Var3.f18265o = oVar2.f173499A.getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp);
                m5Var3.f18261h.setTextSize(0, oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3879hn));
                m5Var3.mo4987c(D);
                C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
                Context context5 = oVar2.f173499A;
                C87412m.m108593f(context5, "holder.context");
                C13442s8 f = aVar2.mo12873f(context5);
                if (f != null) {
                    C49712hj1 q3 = f.mo12861q3();
                    ((C61212e) C86312j.m106911c(cls)).o30(m5Var3.getContentView(), "follow_prompt_bubble");
                    ((C61212e) C86312j.m106911c(cls)).mo86175pO(m5Var3.getContentView(), 40, 25496);
                    ((C61212e) C86312j.m106911c(cls)).mo86149PM(m5Var3.getContentView(), C90364q0.m113147f(new C13604l("comment_scene", Integer.valueOf(q3.f134675i)), new C13604l("feed_id", C61926c.m72691p(t.getItemId()))));
                }
                m5Var3.mo4986b();
                return;
            }
        }
    }

    /* renamed from: F */
    public void mo2258F(C60905o oVar, boolean z) {
        C87412m.m108594g(oVar, "holder");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c1  */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2259F0(T r18, jq3.C60905o r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "item"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "holder"
            gy3.C87412m.m108594g(r2, r3)
            android.content.Context r3 = r2.f173499A
            java.lang.String r4 = "holder.context"
            gy3.C87412m.m108593f(r3, r4)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r18.mo3513o()
            boolean r5 = r5.isProfileShowFromSns()
            r6 = 8
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0044
            bl3.r r5 = bl3.C39818r.f106831a
            bl3.r$a r3 = r5.mo62443b(r3)
            java.lang.Class<rs1.s8> r5 = rs1.C13442s8.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r5)
            rs1.s8 r3 = (rs1.C13442s8) r3
            te3.hj1 r3 = r3.mo12861q3()
            int r3 = r3.f134675i
            if (r3 == r7) goto L_0x003f
            if (r3 == r6) goto L_0x003f
            r3 = 0
            goto L_0x0040
        L_0x003f:
            r3 = 1
        L_0x0040:
            if (r3 == 0) goto L_0x0044
            r3 = 1
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            if (r3 == 0) goto L_0x009d
            android.content.Context r5 = r2.f173499A
            gy3.C87412m.m108593f(r5, r4)
            android.content.res.Resources r4 = r5.getResources()
            r9 = 2131829734(0x7f1123e6, float:1.9292445E38)
            java.lang.String r4 = r4.getString(r9)
            java.lang.String r9 = "context.resources.getStr…d_reason_from_author_sns)"
            gy3.C87412m.m108593f(r4, r9)
            fe1.q r9 = r18.mo3507l()
            if (r9 == 0) goto L_0x00a7
            te3.ii0 r9 = r9.field_extInfo
            if (r9 == 0) goto L_0x006c
            int r10 = r9.f135356g
            if (r10 != r7) goto L_0x006c
            r10 = 1
            goto L_0x006d
        L_0x006c:
            r10 = 0
        L_0x006d:
            if (r10 == 0) goto L_0x0080
            android.content.res.Resources r4 = r5.getResources()
            r5 = 2131829736(0x7f1123e8, float:1.929245E38)
            java.lang.String r4 = r4.getString(r5)
            java.lang.String r5 = "context.resources.getStr…mend_reason_from_his_sns)"
            gy3.C87412m.m108593f(r4, r5)
            goto L_0x00a7
        L_0x0080:
            if (r9 == 0) goto L_0x0089
            int r9 = r9.f135356g
            r10 = 2
            if (r9 != r10) goto L_0x0089
            r9 = 1
            goto L_0x008a
        L_0x0089:
            r9 = 0
        L_0x008a:
            if (r9 == 0) goto L_0x00a7
            android.content.res.Resources r4 = r5.getResources()
            r5 = 2131829735(0x7f1123e7, float:1.9292448E38)
            java.lang.String r4 = r4.getString(r5)
            java.lang.String r5 = "context.resources.getStr…mend_reason_from_her_sns)"
            gy3.C87412m.m108593f(r4, r5)
            goto L_0x00a7
        L_0x009d:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r18.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            java.lang.String r4 = r4.recommendReason
        L_0x00a7:
            r5 = 2131311950(0x7f093d4e, float:1.8242255E38)
            android.view.View r5 = r2.mo85812D(r5)
            if (r3 == 0) goto L_0x00bc
            if (r5 == 0) goto L_0x00bc
            er1.m2 r9 = new er1.m2
            r9.<init>(r5)
            r10 = 300(0x12c, double:1.48E-321)
            r5.postDelayed(r9, r10)
        L_0x00bc:
            boolean r9 = r0.f12559F
            if (r9 == 0) goto L_0x011f
            vq1.w$a r9 = vq1.C65866w.f189406g
            vq1.w r9 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r18.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.getFeedObject()
            java.util.LinkedList r9 = r9.mo89906e(r10)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r9)
            if (r9 != 0) goto L_0x011f
            if (r3 != 0) goto L_0x011f
            if (r5 != 0) goto L_0x00db
            goto L_0x011b
        L_0x00db:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r1.mo10233c(r3)
            java.lang.Object[] r10 = r1.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r12 = "refreshRecommendLayout"
            java.lang.String r13 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r5
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = r1.mo10231a(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.setVisibility(r1)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r11 = "refreshRecommendLayout"
            java.lang.String r12 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x011b:
            r0.mo2303l(r2)
            return
        L_0x011f:
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r18.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            int r3 = r3.recommendType
            if (r4 == 0) goto L_0x0133
            int r3 = r4.length()
            if (r3 != 0) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r7 = 0
        L_0x0133:
            if (r7 != 0) goto L_0x01c1
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.Boolean> r3 = up1.C37521f.f99452l8
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x015c
            if (r5 != 0) goto L_0x014b
            goto L_0x0163
        L_0x014b:
            android.content.Context r3 = r2.f173499A
            android.content.res.Resources r3 = r3.getResources()
            r6 = 2131232255(0x7f0805ff, float:1.8080614E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r6)
            r5.setBackground(r3)
            goto L_0x0163
        L_0x015c:
            if (r5 != 0) goto L_0x015f
            goto L_0x0163
        L_0x015f:
            r3 = 0
            r5.setBackground(r3)
        L_0x0163:
            if (r5 != 0) goto L_0x0166
            goto L_0x01a6
        L_0x0166:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r3.mo10233c(r6)
            java.lang.Object[] r10 = r3.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r12 = "refreshRecommendLayout"
            java.lang.String r13 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r5
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r3 = r3.mo10231a(r8)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r5.setVisibility(r3)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r11 = "refreshRecommendLayout"
            java.lang.String r12 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x01a6:
            r0.mo2303l(r2)
            r3 = 2131311952(0x7f093d50, float:1.8242259E38)
            android.view.View r5 = r2.mo85812D(r3)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 != 0) goto L_0x01b5
            goto L_0x01bd
        L_0x01b5:
            ve1.s1 r6 = new ve1.s1
            r6.<init>(r1, r2)
            zp3.C23564m.m28138h(r5, r6)
        L_0x01bd:
            r0.mo2261G0(r2, r3, r4)
            goto L_0x0207
        L_0x01c1:
            if (r5 != 0) goto L_0x01c4
            goto L_0x0204
        L_0x01c4:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r1.mo10233c(r3)
            java.lang.Object[] r10 = r1.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r12 = "refreshRecommendLayout"
            java.lang.String r13 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r5
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = r1.mo10231a(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.setVisibility(r1)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r11 = "refreshRecommendLayout"
            java.lang.String r12 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0204:
            r0.mo2303l(r2)
        L_0x0207:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2259F0(com.tencent.mm.plugin.finder.model.BaseFinderFeed, jq3.o):void");
    }

    /* renamed from: G */
    public boolean mo2260G() {
        return this instanceof FinderRingtoneTimelineContract$Presenter$buildItemCoverts$1.C2555a;
    }

    /* renamed from: G0 */
    public final void mo2261G0(C60905o oVar, int i, String str) {
        TextView textView = (TextView) oVar.mo85812D(i);
        if (textView != null) {
            Resources resources = oVar.f173499A.getResources();
            int i2 = C0966R.color.f3585yj;
            textView.setTextColor(resources.getColor(C0966R.color.f3585yj));
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            textView.setTextSize(1, 15.0f);
            SpannableString Jh = ((C76979h) C86312j.m106911c(C76979h.class)).mo107049Jh(oVar.f173499A, str, (int) textView.getTextSize(), 1);
            int color = oVar.f173499A.getResources().getColor(C0966R.color.f3580yc);
            Resources resources2 = oVar.f173499A.getResources();
            if (!((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
                i2 = C0966R.color.f3595yw;
            }
            int color2 = resources2.getColor(i2);
            C75359b0[] b0VarArr = (C75359b0[]) Jh.getSpans(0, Jh.length(), C75359b0.class);
            if (b0VarArr != null) {
                for (C75359b0 color3 : b0VarArr) {
                    color3.setColor(color2, color);
                }
            }
            textView.setText(Jh);
            textView.setOnTouchListener(new C75355a0());
        }
    }

    /* renamed from: H */
    public final boolean mo2262H(T t) {
        C37521f.f99374d.getClass();
        boolean z = true;
        if (C37521f.f99477o7.mo60266n().intValue() != 1 || !this.f12564e.mo2497u0() || !C58784w3.f168295a.mo83897Q0(t) || (this instanceof FinderFeedFullLiveConvert)) {
            z = false;
        }
        Log.m105924i("Finder.FeedFullConvert", "isShowFingerLike: " + z);
        return z;
    }

    /* renamed from: H0 */
    public final void mo2263H0(C60905o oVar) {
        C39818r rVar = C39818r.f106831a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13470u2 u2Var = (C13470u2) rVar.mo62443b(context).mo62449e(C13470u2.class);
        String str = null;
        boolean z = false;
        if (u2Var != null) {
            u2Var.mo12626o3(oVar, 0, 0, (String) null);
        }
        ViewGroup viewGroup = (ViewGroup) oVar.mo85812D(C0966R.C0970id.mc9);
        if (viewGroup != null) {
            Context context2 = oVar.f173499A;
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            C39622i0 a = rVar.mo62444c((MMActivity) context2).mo75002a(C13452t2.class);
            C87412m.m108593f(a, "UICProvider.of(holder.co…oneBubbleUIC::class.java)");
            C13452t2 t2Var = (C13452t2) a;
            Intent intent = this.f12564e.getActivity().getIntent();
            if (intent != null) {
                z = intent.getBooleanExtra("key_enable_ringtone_bubble", false);
            }
            if (z) {
                viewGroup.setVisibility(8);
                Intent intent2 = this.f12564e.getActivity().getIntent();
                if (intent2 != null) {
                    str = intent2.getStringExtra("KEY_RINGTONE_REPORT_JSON");
                }
                t2Var.mo12626o3(oVar, ((Number) ((C36570n) this.f12578v).getValue()).intValue(), ((Number) ((C36570n) this.f12577u).getValue()).intValue(), str);
            }
        }
    }

    /* renamed from: I */
    public final boolean mo2264I(T t) {
        C65866w.C14968a aVar = C65866w.f189406g;
        C65866w wVar = C65866w.f189407h;
        return this.f12559F && !Util.isNullOrNil((List) wVar.mo89906e(t.mo3513o().getFeedObject())) && wVar.mo89905d(t.mo3513o().getFeedObject()) > 0 && !this.f12564e.mo2497u0() && !C58739j4.f168176a.mo83688Q(t.mo3507l());
    }

    /* renamed from: I0 */
    public final void mo2265I0(C60905o oVar, T t) {
        C60905o oVar2 = oVar;
        if (!this.f12564e.mo2497u0() || !t.mo3513o().isPostFinish()) {
            View D = oVar2.mo85812D(C0966R.C0970id.cza);
            if (D != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        FlowTextMixView flowTextMixView = (FlowTextMixView) oVar2.mo85812D(C0966R.C0970id.cza);
        if (flowTextMixView != null) {
            flowTextMixView.setMaxWidth(C60641c.m70921b(((float) oVar2.f173499A.getResources().getDisplayMetrics().widthPixels) / 1.6f));
        }
        View D2 = oVar2.mo85812D(C0966R.C0970id.cza);
        if (D2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view = D2;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View D3 = oVar2.mo85812D(C0966R.C0970id.egm);
        if (D3 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view2 = D3;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View D4 = oVar2.mo85812D(C0966R.C0970id.cy9);
        if (D4 != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view3 = D4;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z = true;
        if (t.mo3513o().getPrivate_flag() != 1) {
            z = false;
        }
        if (z) {
            View D5 = oVar2.mo85812D(C0966R.C0970id.hm7);
            if (D5 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(0);
                View view4 = D5;
                C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        View D6 = oVar2.mo85812D(C0966R.C0970id.hm7);
        if (D6 != null) {
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
            aVar6.mo10233c(8);
            View view5 = D6;
            C117292a.m165358d(view5, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshSelfScene", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x031c  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2266J(jq3.C60905o r32, int r33, boolean r34, android.view.MotionEvent r35, int r36) {
        /*
            r31 = this;
            r7 = r31
            r8 = r32
            r9 = r33
            java.lang.Class<iq1.d> r10 = iq1.C60593d.class
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            java.lang.Object r2 = r8.f173503E
            r11 = r2
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r11
            vq1.w r6 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r11.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            rx3.l r2 = r6.mo89908g(r2)
            A r3 = r2.f38555d
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            B r2 = r2.f38556e
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r12 = r2.booleanValue()
            r13 = 1
            r14 = r3 ^ 1
            java.lang.String r15 = "holder.context"
            if (r14 == 0) goto L_0x0325
            r4 = 2131313436(0x7f09431c, float:1.8245269E38)
            android.view.View r4 = r8.mo85812D(r4)
            if (r4 == 0) goto L_0x015c
            bl3.r r2 = bl3.C39818r.f106831a
            android.content.Context r13 = r8.f173499A
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r13, r5)
            com.tencent.mm.ui.MMActivity r13 = (com.tencent.p014mm.p136ui.MMActivity) r13
            bl3.r$a r13 = r2.mo62444c(r13)
            java.lang.Class<rs1.v9> r3 = rs1.C13490v9.class
            androidx.lifecycle.i0 r3 = r13.mo75002a(r3)
            rs1.v9 r3 = (rs1.C13490v9) r3
            r16 = r12
            long r12 = r11.getItemId()
            r17 = r10
            r10 = 2
            boolean r3 = r3.mo12898c3(r4, r12, r10)
            if (r3 != 0) goto L_0x0159
            er1.w3 r3 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r11.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r12 = r12.getFeedObject()
            boolean r3 = r3.mo83939j(r12)
            if (r3 == 0) goto L_0x0159
            int r3 = r11.mo75c()
            r12 = 4
            if (r3 == r12) goto L_0x0082
            int r3 = r11.mo75c()
            if (r3 != r10) goto L_0x0159
        L_0x0082:
            android.content.Context r3 = r8.f173499A
            gy3.C87412m.m108592e(r3, r5)
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            bl3.r$a r3 = r2.mo62444c(r3)
            java.lang.Class<rs1.ua> r5 = rs1.C13480ua.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r5)
            rs1.ua r3 = (rs1.C13480ua) r3
            r3.getClass()
            android.content.Context r5 = r4.getContext()
            java.lang.String r10 = "anchor.context"
            gy3.C87412m.m108593f(r5, r10)
            bl3.r$a r2 = r2.mo62443b(r5)
            java.lang.Class<rs1.z> r5 = rs1.C13554z.class
            bl3.t r2 = r2.mo62449e(r5)
            rs1.z r2 = (rs1.C13554z) r2
            if (r2 == 0) goto L_0x00b6
            boolean r2 = r2.f38450t
            r5 = 1
            if (r2 != r5) goto L_0x00b6
            r2 = 1
            goto L_0x00b7
        L_0x00b6:
            r2 = 0
        L_0x00b7:
            if (r2 == 0) goto L_0x00bb
            goto L_0x0159
        L_0x00bb:
            androidx.appcompat.app.AppCompatActivity r2 = r3.getActivity()
            boolean r5 = r2 instanceof com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI
            if (r5 == 0) goto L_0x00c6
            com.tencent.mm.plugin.finder.ui.MMFinderUI r2 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r2
            goto L_0x00c7
        L_0x00c6:
            r2 = 0
        L_0x00c7:
            if (r2 == 0) goto L_0x00d3
            int r2 = r2.mo2194I7()
            r5 = 162(0xa2, float:2.27E-43)
            if (r2 != r5) goto L_0x00d3
            r2 = 1
            goto L_0x00d4
        L_0x00d3:
            r2 = 0
        L_0x00d4:
            if (r2 == 0) goto L_0x00f9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "checkShowTips: do not show tips, activity="
            r2.append(r4)
            androidx.appcompat.app.AppCompatActivity r3 = r3.getActivity()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FinderTextStatusTipsBubbleUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            goto L_0x0159
        L_0x00f9:
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_SET_TEXT_STATUS_TIPS_INT
            r10 = 0
            int r2 = r2.mo119689j(r5, r10)
            r10 = 3
            if (r2 >= r10) goto L_0x0159
            com.tencent.mm.plugin.finder.view.m5 r10 = new com.tencent.mm.plugin.finder.view.m5
            android.app.Activity r13 = r3.getContext()
            r18 = r6
            r6 = 2
            r12 = 0
            r10.<init>(r13, r12, r6, r12)
            r12 = 5000(0x1388, double:2.4703E-320)
            r10.f18267q = r12
            r6 = 2131830010(0x7f1124fa, float:1.9293005E38)
            android.widget.TextView r12 = r10.f18261h
            android.content.Context r13 = r10.f18259f
            java.lang.String r6 = r13.getString(r6)
            r12.setText(r6)
            android.app.Activity r6 = r3.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r12 = 2131165533(0x7f07015d, float:1.7945286E38)
            float r6 = r6.getDimension(r12)
            android.widget.TextView r12 = r10.f18261h
            r13 = 0
            r12.setTextSize(r13, r6)
            r10.mo4987c(r4)
            r3.f38200d = r10
            r10.mo4986b()
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            r4 = 1
            int r2 = r2 + r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.mo119677K(r5, r2)
            goto L_0x0162
        L_0x0159:
            r18 = r6
            goto L_0x0162
        L_0x015c:
            r18 = r6
            r17 = r10
            r16 = r12
        L_0x0162:
            r2 = 2131306192(0x7f0926d0, float:1.8230576E38)
            android.view.View r2 = r8.mo85812D(r2)
            org.libpag.PAGView r2 = (org.libpag.PAGView) r2
            r3 = 2131306191(0x7f0926cf, float:1.8230574E38)
            if (r2 == 0) goto L_0x01a5
            r4 = 0
            r2.setVisibility(r4)
            r4 = 0
            r2.setProgress(r4)
            r4 = 1
            r2.setRepeatCount(r4)
            android.content.Context r4 = r8.f173499A
            android.content.res.AssetManager r4 = r4.getAssets()
            java.lang.String r5 = "finder_like_animate.pag"
            org.libpag.PAGFile r4 = org.libpag.PAGFile.Load(r4, r5)
            r2.setComposition(r4)
            r2.play()
            tr1.b r19 = tr1.C14063b.f39453a
            android.view.View r2 = r8.mo85812D(r3)
            java.lang.String r4 = "holder.getView(R.id.icon_feed_like)"
            gy3.C87412m.m108593f(r2, r4)
            r21 = 0
            r23 = 2
            r24 = 0
            r20 = r2
            tr1.C14063b.m13415c(r19, r20, r21, r23, r24)
        L_0x01a5:
            android.view.View r2 = r8.mo85812D(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = r31.mo2326x(r32)
            r4 = 0
            r3.setLayerPaint(r4)
            wp1.j r4 = wp1.C15587j.f42215a
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r11.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
            int r5 = r5.objectType
            te3.if1 r4 = r4.mo14351c(r5)
            if (r4 != 0) goto L_0x01c6
            java.lang.String r5 = ""
            goto L_0x01c8
        L_0x01c6:
            java.lang.String r5 = r4.f135268n
        L_0x01c8:
            if (r34 == 0) goto L_0x01cf
            r6 = 1
            r7.mo2277O0(r3, r4, r6)
            goto L_0x023e
        L_0x01cf:
            er1.j4 r4 = er1.C58739j4.f168176a
            fe1.q r6 = r11.mo3507l()
            boolean r4 = r4.mo83688Q(r6)
            r6 = 2131099905(0x7f060101, float:1.7812176E38)
            if (r4 == 0) goto L_0x0206
            android.content.Context r0 = r8.f173499A
            er1.w3 r1 = er1.C58784w3.f168295a
            r4 = 6
            r5 = 0
            r10 = 2
            r12 = 0
            java.lang.Integer r1 = er1.C58784w3.m68436c0(r1, r4, r12, r10, r5)
            if (r1 == 0) goto L_0x01f1
            int r1 = r1.intValue()
            goto L_0x01f4
        L_0x01f1:
            r1 = 2131755629(0x7f10026d, float:1.9142143E38)
        L_0x01f4:
            android.content.Context r4 = r8.f173499A
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getColor(r6)
            android.graphics.drawable.Drawable r0 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r0, r1, r4)
            r3.setImageDrawable(r0)
            goto L_0x023e
        L_0x0206:
            if (r5 == 0) goto L_0x0211
            int r4 = r5.length()
            if (r4 != 0) goto L_0x020f
            goto L_0x0211
        L_0x020f:
            r4 = 0
            goto L_0x0212
        L_0x0211:
            r4 = 1
        L_0x0212:
            if (r4 != 0) goto L_0x0240
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r6 = r4.mo62446e(r1)
            bl3.c r6 = r6.mo62447c(r0)
            pl1.s0 r6 = (pl1.C11990s0) r6
            k60.d r6 = r6.mo11871f2()
            pl1.n0 r10 = new pl1.n0
            up1.y r12 = up1.C27696y.RAW_IMAGE
            r10.<init>(r5, r12)
            pl1.e0$a r5 = pl1.C11978e0.C11979a.LIKE_HOT_DEFAULT
            bl3.r$a r1 = r4.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r5)
            r6.mo85957c(r10, r3, r0)
        L_0x023e:
            r4 = 0
            goto L_0x0266
        L_0x0240:
            android.content.Context r0 = r8.f173499A
            er1.w3 r1 = er1.C58784w3.f168295a
            r4 = 0
            r5 = 2
            r10 = 0
            java.lang.Integer r1 = er1.C58784w3.m68436c0(r1, r5, r10, r5, r4)
            if (r1 == 0) goto L_0x0252
            int r1 = r1.intValue()
            goto L_0x0255
        L_0x0252:
            r1 = 2131755635(0x7f100273, float:1.9142155E38)
        L_0x0255:
            android.content.Context r5 = r8.f173499A
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getColor(r6)
            android.graphics.drawable.Drawable r0 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r0, r1, r5)
            r3.setImageDrawable(r0)
        L_0x0266:
            tr1.b r0 = tr1.C14063b.f39453a
            r21 = 1068708659(0x3fb33333, float:1.4)
            r23 = 1
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 112(0x70, float:1.57E-43)
            r29 = 0
            r19 = r0
            r20 = r3
            r22 = r35
            tr1.C14063b.m13416d(r19, r20, r21, r22, r23, r24, r25, r27, r28, r29)
            java.lang.String r1 = "likeIcon"
            gy3.C87412m.m108593f(r2, r1)
            r27 = 0
            r29 = 2
            r30 = 0
            r25 = r0
            r26 = r2
            tr1.C14063b.m13415c(r25, r26, r27, r29, r30)
            r0 = 1
            r3 = 2
            if (r9 == r0) goto L_0x029a
            if (r9 == r3) goto L_0x029a
            if (r34 == 0) goto L_0x02a1
        L_0x029a:
            android.view.View r0 = r8.f44854d
            r1 = 3
            r2 = 0
            r0.performHapticFeedback(r2, r1)
        L_0x02a1:
            r0 = 2131304754(0x7f092132, float:1.822766E38)
            android.view.View r0 = r8.mo85812D(r0)
            if (r0 != 0) goto L_0x02ad
            r0 = 1
            r2 = 0
            goto L_0x02f2
        L_0x02ad:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r2 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r5)
            java.lang.Object[] r20 = r1.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r22 = "likeFeed"
            java.lang.String r23 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IZLandroid/view/MotionEvent;I)Z"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r0
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r21 = "likeFeed"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IZLandroid/view/MotionEvent;I)Z"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            r0 = 1
        L_0x02f2:
            r11.mo3486T(r0)
            r5 = 0
            r6 = 4
            r10 = 0
            r0 = r31
            r1 = r32
            r12 = 0
            r2 = r11
            r13 = 2
            r3 = r5
            r5 = r4
            r4 = r6
            r6 = 4
            r5 = r10
            m2151u(r0, r1, r2, r3, r4, r5)
            r31.mo2310o0(r32)
            pf1.r$a r0 = pf1.C11922r.C11923a.Like
            r7.mo2268K(r8, r0)
            rs1.w6$a r0 = rs1.C13502w6.f38267r
            android.content.Context r1 = r8.f173499A
            gy3.C87412m.m108593f(r1, r15)
            rs1.w6 r0 = r0.mo12927a(r1)
            if (r0 == 0) goto L_0x0345
            rs1.k7 r1 = new rs1.k7
            r1.<init>(r0, r8, r13, r12)
            r0.mo12911P3(r8, r1)
            goto L_0x0345
        L_0x0325:
            r18 = r6
            r17 = r10
            r16 = r12
            r6 = 4
            r12 = 0
            r13 = 2
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99239N2
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L_0x0345
            r11.mo3505j0(r12)
        L_0x0345:
            if (r14 == 0) goto L_0x0349
            r5 = 0
            goto L_0x034b
        L_0x0349:
            r5 = r16
        L_0x034b:
            java.lang.Class<dp1.y0> r0 = dp1.C58417y0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            dp1.y0 r0 = (dp1.C58417y0) r0
            long r1 = r11.getItemId()
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r11.mo3513o()
            r0.wx0(r8, r1, r3)
            kf1.v1 r0 = r7.f12564e
            r1 = r11
            r2 = r14
            r3 = r34
            r4 = r33
            r0.mo2581v3(r1, r2, r3, r4, r5)
            rs1.s8$a r10 = rs1.C13442s8.f38060Q0
            android.content.Context r0 = r8.f173499A
            gy3.C87412m.m108593f(r0, r15)
            rs1.s8 r0 = r10.mo12873f(r0)
            if (r0 == 0) goto L_0x0379
            r0.mo12861q3()
        L_0x0379:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r11.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            r1 = r18
            int r4 = r1.mo89909h(r0)
            r0 = r31
            r1 = r11
            r2 = r14
            r3 = r34
            r5 = r32
            r13 = 4
            r6 = r36
            r0.mo2294e0(r1, r2, r3, r4, r5, r6)
            er1.w3 r0 = er1.C58784w3.f168295a
            boolean r0 = r0.mo83886M0(r11)
            if (r0 == 0) goto L_0x03c0
            if (r34 != 0) goto L_0x03c0
            if (r14 == 0) goto L_0x03b0
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r11.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            int r1 = r0.incFriendLikeCount
            r2 = 1
            int r1 = r1 + r2
            r0.incFriendLikeCount = r1
            goto L_0x03c0
        L_0x03b0:
            r2 = 1
            if (r16 != 0) goto L_0x03c0
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r11.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            int r1 = r0.incFriendLikeCount
            int r1 = r1 - r2
            r0.incFriendLikeCount = r1
        L_0x03c0:
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = new com.tencent.mm.autogen.events.FeedUpdateEvent
            r0.<init>()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r1 = r0.f9173d
            long r2 = r11.getItemId()
            r1.f9174a = r2
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r1 = r0.f9173d
            r1.f9175b = r13
            if (r14 == 0) goto L_0x03d7
            if (r34 == 0) goto L_0x03d7
            r3 = 2
            goto L_0x03dc
        L_0x03d7:
            if (r14 == 0) goto L_0x03db
            r3 = 1
            goto L_0x03dc
        L_0x03db:
            r3 = 0
        L_0x03dc:
            r1.f9178e = r3
            r0.publish()
            android.content.Context r0 = r8.f173499A
            gy3.C87412m.m108593f(r0, r15)
            rs1.s8 r0 = r10.mo12873f(r0)
            if (r0 == 0) goto L_0x0412
            r1 = 0
            r2 = 1
            df1.a r0 = ht1.C60172g4.C60173a.m70190b(r0, r12, r2, r1)
            if (r0 == 0) goto L_0x0412
            if (r14 == 0) goto L_0x0404
            long r1 = r11.getItemId()
            df1.a$a r3 = new df1.a$a
            r4 = 7
            r3.<init>(r4, r1)
            r0.mo8766a(r3)
            goto L_0x0412
        L_0x0404:
            long r1 = r11.getItemId()
            df1.a$a r3 = new df1.a$a
            r4 = 8
            r3.<init>(r4, r1)
            r0.mo8766a(r3)
        L_0x0412:
            if (r14 == 0) goto L_0x045c
            int r0 = r32.mo17363j()
            if (r0 != 0) goto L_0x045c
            r0 = 2
            if (r9 != r0) goto L_0x043d
            bl3.r r0 = bl3.C39818r.f106831a
            android.content.Context r1 = r8.f173499A
            gy3.C87412m.m108593f(r1, r15)
            bl3.r$a r0 = r0.mo62443b(r1)
            r1 = r17
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            iq1.d r0 = (iq1.C60593d) r0
            iq1.c r0 = r0.f172693f
            if (r0 == 0) goto L_0x043f
            r0.mo85549a()
            java.lang.String r2 = "double_like"
            r0.mo85550b(r2)
            goto L_0x043f
        L_0x043d:
            r1 = r17
        L_0x043f:
            bl3.r r0 = bl3.C39818r.f106831a
            android.content.Context r2 = r8.f173499A
            gy3.C87412m.m108593f(r2, r15)
            bl3.r$a r0 = r0.mo62443b(r2)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            iq1.d r0 = (iq1.C60593d) r0
            iq1.c r0 = r0.f172693f
            if (r0 == 0) goto L_0x045c
            r0.mo85549a()
            java.lang.String r1 = "like"
            r0.mo85550b(r1)
        L_0x045c:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2266J(jq3.o, int, boolean, android.view.MotionEvent, int):boolean");
    }

    /* renamed from: J0 */
    public final void mo2267J0(C60905o oVar, int i, T t, int i2) {
        if (!((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e() && !mo2260G()) {
            C39818r rVar = C39818r.f106831a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            ((C14567m3) rVar.mo62443b(context).mo75002a(C14567m3.class)).mo13814e3(oVar, i, t, i2, this.f12564e, new C2377r1(this, oVar));
        }
    }

    /* renamed from: K */
    public final void mo2268K(C60905o oVar, C11922r.C11923a aVar) {
        if (!((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e() && !mo2260G()) {
            C39818r rVar = C39818r.f106831a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            C10786a1 a1Var = (C10786a1) rVar.mo62443b(context).mo75002a(C10786a1.class);
            C11922r rVar2 = new C11922r(aVar);
            a1Var.getClass();
            a1Var.mo11061f3(oVar, new C10862r0(oVar, rVar2));
        }
    }

    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=?, for r4v1, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02e7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x031e  */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2269K0(jq3.C60905o r21, T r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            pl1.e0$a r3 = pl1.C11978e0.C11979a.FAV_ICON
            up1.y r4 = up1.C27696y.RAW_IMAGE
            java.lang.Class<pl1.s0> r5 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r6 = ht1.C60200t1.class
            java.lang.String r7 = "holder"
            gy3.C87412m.m108594g(r1, r7)
            java.lang.String r7 = "item"
            gy3.C87412m.m108594g(r2, r7)
            boolean r7 = r0.mo2262H(r2)
            if (r7 == 0) goto L_0x001f
            return
        L_0x001f:
            r7 = 2131302152(0x7f091708, float:1.8222382E38)
            android.view.View r7 = r1.mo85812D(r7)
            r16 = 8
            r15 = 0
            if (r7 != 0) goto L_0x0031
            r19 = r3
            r17 = r4
            r4 = 0
            goto L_0x007b
        L_0x0031:
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            r14.mo10233c(r8)
            java.lang.Object[] r9 = r14.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r11 = "refreshStar"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r8 = r7
            r19 = r3
            r3 = r14
            r14 = r17
            r17 = r4
            r4 = 0
            r15 = r18
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r7.setVisibility(r3)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r10 = "refreshStar"
            java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
        L_0x007b:
            r3 = 2131314283(0x7f09466b, float:1.8246987E38)
            android.view.View r15 = r1.mo85812D(r3)
            if (r15 != 0) goto L_0x0085
            return
        L_0x0085:
            boolean r7 = r0 instanceof com.tencent.p014mm.plugin.finder.convert.FinderFeedFullLiveConvert
            if (r7 != 0) goto L_0x00cc
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r14.mo10233c(r7)
            java.lang.Object[] r8 = r14.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r10 = "refreshStar"
            java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r7 = r15
            r3 = r14
            r14 = r18
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r15.setVisibility(r3)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r9 = "refreshStar"
            java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
        L_0x00cc:
            er1.w3 r3 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r22.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
            boolean r7 = r3.mo83942k(r7)
            if (r7 != 0) goto L_0x011d
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r1.mo10233c(r2)
            java.lang.Object[] r8 = r1.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r10 = "refreshStar"
            java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r15
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r1 = r1.mo10231a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r15.setVisibility(r1)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r9 = "refreshStar"
            java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x011d:
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r22.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
            boolean r7 = r3.mo83924e(r7)
            r11 = 2131100571(0x7f06039b, float:1.7813527E38)
            r12 = 2131314281(0x7f094669, float:1.8246983E38)
            r13 = 1
            if (r7 != 0) goto L_0x0157
            android.content.Context r7 = r1.f173499A
            boolean r14 = r0.f12567h
            if (r14 == 0) goto L_0x013c
            r14 = 2131099673(0x7f060019, float:1.7811706E38)
            goto L_0x013f
        L_0x013c:
            r14 = 2131100571(0x7f06039b, float:1.7813527E38)
        L_0x013f:
            int r7 = kg3.C76577a.m92153d(r7, r14)
            android.view.View r14 = r1.mo85812D(r12)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r14.setTextColor(r7)
            r7 = 2131314283(0x7f09466b, float:1.8246987E38)
            android.view.View r7 = r1.mo85812D(r7)
            r7.setEnabled(r4)
            goto L_0x0181
        L_0x0157:
            boolean r7 = r22.mo3479M()
            if (r7 != 0) goto L_0x0181
            android.content.Context r7 = r1.f173499A
            boolean r14 = r0.f12567h
            if (r14 == 0) goto L_0x0167
            r14 = 2131099682(0x7f060022, float:1.7811724E38)
            goto L_0x016a
        L_0x0167:
            r14 = 2131100935(0x7f060507, float:1.7814265E38)
        L_0x016a:
            int r7 = kg3.C76577a.m92153d(r7, r14)
            android.view.View r14 = r1.mo85812D(r12)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r14.setTextColor(r7)
            r7 = 2131314283(0x7f09466b, float:1.8246987E38)
            android.view.View r7 = r1.mo85812D(r7)
            r7.setEnabled(r13)
        L_0x0181:
            boolean[] r7 = new boolean[r13]
            r7[r4] = r4
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$s1 r14 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$s1
            r14.<init>(r7)
            r15.setOnTouchListener(r14)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$t1 r14 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$t1
            r14.<init>(r7, r0, r1, r2)
            r15.setOnClickListener(r14)
            vq1.g r7 = vq1.C65854g.f189373e
            vq1.g r7 = vq1.C65854g.f189373e
            com.tencent.mm.plugin.finder.storage.FinderItem r14 = r22.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r14 = r14.getFeedObject()
            int r14 = r7.mo89892b(r14)
            android.view.View r12 = r1.mo85812D(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r8 = 1061997773(0x3f4ccccd, float:0.8)
            if (r12 == 0) goto L_0x01f0
            android.text.TextPaint r9 = r12.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r9, r8)
            r9 = 2131302585(0x7f0918b9, float:1.822326E38)
            if (r14 > 0) goto L_0x01d6
            kf1.v1 r10 = r0.f12564e
            boolean r10 = r10.mo2497u0()
            if (r10 == 0) goto L_0x01c5
            goto L_0x01d6
        L_0x01c5:
            java.lang.String r3 = r3.mo83962s0()
            java.lang.String r10 = "0"
            r15.setTag(r9, r10)
            android.text.TextPaint r9 = r12.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106193l0(r9)
            goto L_0x01ed
        L_0x01d6:
            kf1.v1 r3 = r0.f12564e
            boolean r3 = r3.mo2497u0()
            if (r3 != 0) goto L_0x01e0
            r3 = 2
            goto L_0x01e1
        L_0x01e0:
            r3 = 1
        L_0x01e1:
            java.lang.String r3 = er1.C7878t0.m8034c(r3, r14)
            java.lang.String r10 = "formatNumber(\n          …arCount\n                )"
            gy3.C87412m.m108593f(r3, r10)
            r15.setTag(r9, r3)
        L_0x01ed:
            r12.setText(r3)
        L_0x01f0:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r22.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            boolean r2 = r7.mo89893c(r2)
            r3 = 2131306201(0x7f0926d9, float:1.8230594E38)
            android.view.View r3 = r1.mo85812D(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r3
            r7 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r7)
            boolean r7 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            wp1.j r9 = wp1.C15587j.f42215a
            java.lang.String r10 = "FinderObjectDynamicImageKey_FinderFavOnIcon"
            te3.cf1 r10 = r9.mo14349a(r10)
            java.lang.String r12 = ""
            if (r10 == 0) goto L_0x0229
            boolean r14 = r0.f12567h
            if (r14 == 0) goto L_0x0225
            if (r7 != 0) goto L_0x0225
            java.lang.String r10 = r10.f131695f
            if (r10 != 0) goto L_0x022a
            goto L_0x0229
        L_0x0225:
            java.lang.String r10 = r10.f131694e
            if (r10 != 0) goto L_0x022a
        L_0x0229:
            r10 = r12
        L_0x022a:
            java.lang.String r14 = "FinderObjectDynamicImageKey_FinderFavOffIcon"
            te3.cf1 r9 = r9.mo14349a(r14)
            if (r9 == 0) goto L_0x0243
            boolean r14 = r0.f12567h
            if (r14 == 0) goto L_0x023d
            if (r7 != 0) goto L_0x023d
            java.lang.String r7 = r9.f131695f
            if (r7 != 0) goto L_0x0242
            goto L_0x0243
        L_0x023d:
            java.lang.String r7 = r9.f131694e
            if (r7 != 0) goto L_0x0242
            goto L_0x0243
        L_0x0242:
            r12 = r7
        L_0x0243:
            boolean r7 = r15.isEnabled()
            if (r2 == 0) goto L_0x0282
            int r9 = r10.length()
            if (r9 <= 0) goto L_0x0251
            r15 = 1
            goto L_0x0252
        L_0x0251:
            r15 = 0
        L_0x0252:
            if (r15 == 0) goto L_0x0282
            bl3.r r8 = bl3.C39818r.f106831a
            bl3.r$a r8 = r8.mo62446e(r6)
            bl3.c r8 = r8.mo62447c(r5)
            pl1.s0 r8 = (pl1.C11990s0) r8
            k60.d r8 = r8.mo11871f2()
            pl1.n0 r9 = new pl1.n0
            r14 = r17
            r9.<init>(r10, r14)
            bl3.r r10 = bl3.C39818r.f106831a
            bl3.r$a r6 = r10.mo62446e(r6)
            bl3.c r5 = r6.mo62447c(r5)
            pl1.s0 r5 = (pl1.C11990s0) r5
            r10 = r19
            n60.f r5 = r5.mo11867O2(r10)
            r8.mo85957c(r9, r3, r5)
        L_0x0280:
            r15 = 1
            goto L_0x02c0
        L_0x0282:
            r14 = r17
            r10 = r19
            if (r2 != 0) goto L_0x02bf
            int r9 = r12.length()
            if (r9 <= 0) goto L_0x0290
            r15 = 1
            goto L_0x0291
        L_0x0290:
            r15 = 0
        L_0x0291:
            if (r15 == 0) goto L_0x02bf
            r3.setAlpha(r8)
            bl3.r r8 = bl3.C39818r.f106831a
            bl3.r$a r8 = r8.mo62446e(r6)
            bl3.c r8 = r8.mo62447c(r5)
            pl1.s0 r8 = (pl1.C11990s0) r8
            k60.d r8 = r8.mo11871f2()
            pl1.n0 r9 = new pl1.n0
            r9.<init>(r12, r14)
            bl3.r r12 = bl3.C39818r.f106831a
            bl3.r$a r6 = r12.mo62446e(r6)
            bl3.c r5 = r6.mo62447c(r5)
            pl1.s0 r5 = (pl1.C11990s0) r5
            n60.f r5 = r5.mo11867O2(r10)
            r8.mo85957c(r9, r3, r5)
            goto L_0x0280
        L_0x02bf:
            r15 = 0
        L_0x02c0:
            r5 = 0
            if (r2 != 0) goto L_0x02d1
            android.content.Context r6 = r1.f173499A
            android.content.res.Resources r6 = r6.getResources()
            r8 = 2131755663(0x7f10028f, float:1.9142212E38)
            android.graphics.drawable.Drawable r5 = hi3.C87515a.m108835e(r6, r8, r5)
            goto L_0x02de
        L_0x02d1:
            android.content.Context r6 = r1.f173499A
            android.content.res.Resources r6 = r6.getResources()
            r8 = 2131755657(0x7f100289, float:1.91422E38)
            android.graphics.drawable.Drawable r5 = hi3.C87515a.m108835e(r6, r8, r5)
        L_0x02de:
            r6 = 0
            r3.setLayerPaint(r6)
            r3.setIconColor(r4)
            if (r7 != 0) goto L_0x0302
            if (r15 != 0) goto L_0x0302
            android.content.Context r4 = r1.f173499A
            android.content.res.Resources r4 = r4.getResources()
            boolean r6 = r0.f12567h
            if (r6 == 0) goto L_0x02f7
            r10 = 2131099673(0x7f060019, float:1.7811706E38)
            goto L_0x02fa
        L_0x02f7:
            r10 = 2131100571(0x7f06039b, float:1.7813527E38)
        L_0x02fa:
            int r4 = r4.getColor(r10)
            r3.setIconColor(r4)
            goto L_0x031c
        L_0x0302:
            if (r7 != 0) goto L_0x031c
            if (r15 == 0) goto L_0x031c
            android.content.Context r4 = r1.f173499A
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131099940(0x7f060124, float:1.7812247E38)
            int r4 = r4.getColor(r6)
            r3.setIconColor(r4)
            r4 = 1050253722(0x3e99999a, float:0.3)
            r3.setAlpha(r4)
        L_0x031c:
            if (r15 != 0) goto L_0x0358
            if (r7 == 0) goto L_0x033b
            if (r2 == 0) goto L_0x033b
            kf1.v1 r2 = r0.f12564e
            boolean r2 = r2.mo2497u0()
            if (r2 != 0) goto L_0x033b
            android.content.Context r1 = r1.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131101269(0x7f060655, float:1.7814943E38)
            int r1 = r1.getColor(r2)
            r3.setIconColor(r1)
            goto L_0x0355
        L_0x033b:
            if (r7 == 0) goto L_0x0355
            android.content.Context r1 = r1.f173499A
            android.content.res.Resources r1 = r1.getResources()
            boolean r2 = r0.f12567h
            if (r2 == 0) goto L_0x034b
            r8 = 2131099682(0x7f060022, float:1.7811724E38)
            goto L_0x034e
        L_0x034b:
            r8 = 2131100935(0x7f060507, float:1.7814265E38)
        L_0x034e:
            int r1 = r1.getColor(r8)
            r3.setIconColor(r1)
        L_0x0355:
            r3.setImageDrawable(r5)
        L_0x0358:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2269K0(jq3.o, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v230, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v231, resolved type: com.tencent.mm.plugin.finder.view.SimpleTouchableLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v232, resolved type: android.view.View} */
    /* JADX WARNING: type inference failed for: r0v31, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v36, types: [com.tencent.mm.plugin.finder.view.SimpleTouchableLayout] */
    /* JADX WARNING: type inference failed for: r0v66 */
    /* JADX WARNING: type inference failed for: r0v76 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0414, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0182, code lost:
        r14 = r34;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0592  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x05d3  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x07f3  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0835  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x09a9  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x09bd  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x09d0  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0ac7  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0aca  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0acd  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0b13  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0b60  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0b89  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0bcf  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0c19  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0c4b  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0caf  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r35, T r36, int r37, int r38, boolean r39, java.util.List<java.lang.Object> r40) {
        /*
            r34 = this;
            r7 = r34
            r8 = r35
            r9 = r36
            r10 = r37
            java.lang.Class<rs1.d3> r11 = rs1.C13181d3.class
            java.lang.Class<l31.e> r12 = l31.C61212e.class
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r9, r0)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$m0 r0 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$m0
            r0.<init>(r8, r9, r7)
            r1 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r1 = r8.mo85812D(r1)
            r7.f12582z = r1
            di3.d r1 = di3.C86312j.m106911c(r12)
            l31.e r1 = (l31.C61212e) r1
            android.view.View r2 = r7.f12582z
            java.lang.String r3 = "finder_feed_avatar"
            r1.o30(r2, r3)
            di3.d r1 = di3.C86312j.m106911c(r12)
            l31.e r1 = (l31.C61212e) r1
            android.view.View r2 = r7.f12582z
            r3 = 8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            r14 = 24617(0x6029, float:3.4496E-41)
            r1.mo86175pO(r2, r3, r14)
            android.view.View r1 = r7.f12582z
            if (r1 == 0) goto L_0x004d
            r1.setOnClickListener(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x004d:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99250O6
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x006e
            android.view.View r0 = r7.f12582z
            if (r0 == 0) goto L_0x006e
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$s r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$s
            r1.<init>(r8, r7)
            r0.setOnLongClickListener(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x006e:
            android.view.View r0 = r8.f44854d
            java.lang.String r1 = "holder.itemView"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r1 = "Finder"
            boolean r2 = zo3.C16376b.f43775a
            if (r2 == 0) goto L_0x0087
            r2 = 2131314894(0x7f0948ce, float:1.8248226E38)
            r0.setTag(r2, r1)
            r1 = 2131314893(0x7f0948cd, float:1.8248224E38)
            r0.setTag(r1, r9)
        L_0x0087:
            r15 = 1
            if (r40 == 0) goto L_0x0093
            boolean r0 = r40.isEmpty()
            if (r0 == 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r0 = 0
            goto L_0x0094
        L_0x0093:
            r0 = 1
        L_0x0094:
            r5 = 4
            r4 = 3
            r2 = 2
            java.lang.String r1 = "holder.context"
            if (r0 != 0) goto L_0x0423
            java.util.Iterator r17 = r40.iterator()
            r18 = 1
        L_0x00a1:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x041b
            java.lang.Object r0 = r17.next()
            boolean r3 = r0 instanceof rx3.C13604l
            if (r3 == 0) goto L_0x040b
            rx3.l r0 = (rx3.C13604l) r0
            A r3 = r0.f38555d
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 == r15) goto L_0x0400
            if (r3 == r2) goto L_0x03e7
            if (r3 == r4) goto L_0x034c
            if (r3 == r5) goto L_0x0314
            r2 = 6
            if (r3 == r2) goto L_0x02ee
            r2 = 34
            if (r3 == r2) goto L_0x02e2
            r2 = 35
            if (r3 == r2) goto L_0x028b
            switch(r3) {
                case 8: goto L_0x027f;
                case 9: goto L_0x0278;
                case 10: goto L_0x0265;
                case 11: goto L_0x025e;
                case 12: goto L_0x020a;
                case 13: goto L_0x01ff;
                default: goto L_0x00cf;
            }
        L_0x00cf:
            r2 = 2131302903(0x7f0919f7, float:1.8223905E38)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Int"
            switch(r3) {
                case 24: goto L_0x01eb;
                case 25: goto L_0x01d7;
                case 26: goto L_0x01d4;
                case 27: goto L_0x01c0;
                case 28: goto L_0x01ac;
                case 29: goto L_0x01a2;
                case 30: goto L_0x018b;
                case 31: goto L_0x0117;
                case 32: goto L_0x00e1;
                default: goto L_0x00d7;
            }
        L_0x00d7:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            r7 = r1
            r14 = 2131305309(0x7f09235d, float:1.8228785E38)
            r18 = 0
            goto L_0x0182
        L_0x00e1:
            B r0 = r0.f38556e
            boolean r3 = r0 instanceof com.tencent.p014mm.autogen.events.FeedUpdateEvent
            if (r3 == 0) goto L_0x00ea
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = (com.tencent.p014mm.autogen.events.FeedUpdateEvent) r0
            goto L_0x00eb
        L_0x00ea:
            r0 = 0
        L_0x00eb:
            if (r0 == 0) goto L_0x0154
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            long r3 = r0.f9184k
            bl3.r r0 = bl3.C39818r.f106831a
            android.content.Context r5 = r8.f173499A
            gy3.C87412m.m108593f(r5, r1)
            bl3.r$a r0 = r0.mo62443b(r5)
            bl3.t r0 = r0.mo62449e(r11)
            rs1.d3 r0 = (rs1.C13181d3) r0
            if (r0 == 0) goto L_0x0154
            android.view.View r0 = r8.mo85812D(r2)
            com.tencent.mm.plugin.finder.view.FinderWordingLayout r0 = (com.tencent.p014mm.plugin.finder.view.FinderWordingLayout) r0
            if (r0 != 0) goto L_0x010d
            goto L_0x0114
        L_0x010d:
            long r6 = r36.getItemId()
            r0.mo4759b(r6, r3)
        L_0x0114:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0154
        L_0x0117:
            B r0 = r0.f38556e
            boolean r3 = r0 instanceof com.tencent.p014mm.autogen.events.FeedUpdateEvent
            if (r3 == 0) goto L_0x0120
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = (com.tencent.p014mm.autogen.events.FeedUpdateEvent) r0
            goto L_0x0121
        L_0x0120:
            r0 = 0
        L_0x0121:
            if (r0 == 0) goto L_0x0154
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r3 = r0.f9173d
            long r4 = r3.f9184k
            int r3 = r3.f9180g
            if (r3 != r15) goto L_0x0159
            bl3.r r2 = bl3.C39818r.f106831a
            android.content.Context r3 = r8.f173499A
            gy3.C87412m.m108593f(r3, r1)
            bl3.r$a r2 = r2.mo62443b(r3)
            bl3.t r2 = r2.mo62449e(r11)
            rs1.d3 r2 = (rs1.C13181d3) r2
            if (r2 == 0) goto L_0x0154
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            int r6 = r0.f9178e
            r0 = r2
            r7 = r1
            r1 = r36
            r3 = 2
            r2 = r35
            r14 = 2131305309(0x7f09235d, float:1.8228785E38)
            r3 = r4
            r5 = r6
            r0.mo12679j3(r1, r2, r3, r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0182
        L_0x0154:
            r7 = r1
            r14 = 2131305309(0x7f09235d, float:1.8228785E38)
            goto L_0x0182
        L_0x0159:
            r7 = r1
            r14 = 2131305309(0x7f09235d, float:1.8228785E38)
            bl3.r r0 = bl3.C39818r.f106831a
            android.content.Context r1 = r8.f173499A
            gy3.C87412m.m108593f(r1, r7)
            bl3.r$a r0 = r0.mo62443b(r1)
            bl3.t r0 = r0.mo62449e(r11)
            rs1.d3 r0 = (rs1.C13181d3) r0
            if (r0 == 0) goto L_0x0182
            android.view.View r0 = r8.mo85812D(r2)
            com.tencent.mm.plugin.finder.view.FinderWordingLayout r0 = (com.tencent.p014mm.plugin.finder.view.FinderWordingLayout) r0
            if (r0 != 0) goto L_0x0179
            goto L_0x0180
        L_0x0179:
            long r1 = r36.getItemId()
            r0.mo4763g(r1, r4)
        L_0x0180:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0182:
            r6 = 2
            r19 = 24617(0x6029, float:3.4496E-41)
            r24 = 0
            r14 = r34
            goto L_0x0414
        L_0x018b:
            r7 = r1
            r14 = 2131305309(0x7f09235d, float:1.8228785E38)
            java.lang.Object r0 = r8.f173503E
            java.lang.String r1 = "holder.getAssociatedObject()"
            gy3.C87412m.m108593f(r0, r1)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            r6 = r34
            r6.mo2307n(r8, r0, r10)
            r34.mo2303l(r35)
            goto L_0x0207
        L_0x01a2:
            r6 = r7
            r14 = 2131305309(0x7f09235d, float:1.8228785E38)
            r7 = r1
            r34.mo2306m0(r35)
            goto L_0x0207
        L_0x01ac:
            r6 = r7
            r14 = 2131305309(0x7f09235d, float:1.8228785E38)
            r7 = r1
            B r0 = r0.f38556e
            gy3.C87412m.m108592e(r0, r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.mo2267J0(r8, r10, r9, r0)
            goto L_0x0207
        L_0x01c0:
            r6 = r7
            r14 = 2131305309(0x7f09235d, float:1.8228785E38)
            r7 = r1
            B r0 = r0.f38556e
            gy3.C87412m.m108592e(r0, r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.mo2267J0(r8, r10, r9, r0)
            goto L_0x0207
        L_0x01d4:
            r6 = r7
            r7 = r1
            goto L_0x0207
        L_0x01d7:
            r6 = r7
            r14 = 2131305309(0x7f09235d, float:1.8228785E38)
            r7 = r1
            B r0 = r0.f38556e
            gy3.C87412m.m108592e(r0, r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.mo2267J0(r8, r10, r9, r0)
            goto L_0x0207
        L_0x01eb:
            r6 = r7
            r14 = 2131305309(0x7f09235d, float:1.8228785E38)
            r7 = r1
            B r0 = r0.f38556e
            gy3.C87412m.m108592e(r0, r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.mo2267J0(r8, r10, r9, r0)
            goto L_0x0207
        L_0x01ff:
            r6 = r7
            r14 = 2131305309(0x7f09235d, float:1.8228785E38)
            r7 = r1
            r34.mo2299i0(r35, r36)
        L_0x0207:
            r14 = r6
            goto L_0x0345
        L_0x020a:
            r6 = r7
            r14 = 2131305309(0x7f09235d, float:1.8228785E38)
            r7 = r1
            r6.mo2297g0(r9, r8)
            r6.mo2308n0(r9, r8)
            vq1.w$a r0 = vq1.C65866w.f189406g
            vq1.w r0 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r36.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            rx3.l r1 = r0.mo89908g(r1)
            A r2 = r1.f38555d
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            B r1 = r1.f38556e
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r3 = r1.booleanValue()
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r36.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            int r4 = r0.mo89909h(r1)
            r0 = r34
            r1 = r36
            r5 = r35
            r14 = r6
            r6 = r37
            r0.mo2294e0(r1, r2, r3, r4, r5, r6)
            r34.mo2309o(r35, r36)
            r14.mo2295f0(r8, r15)
            r14.mo2314q0(r9, r8)
            r14.mo2293d0(r9, r8)
            r14.mo2327x0(r9, r8)
            goto L_0x0345
        L_0x025e:
            r14 = r7
            r7 = r1
            r14.mo2297g0(r9, r8)
            goto L_0x0345
        L_0x0265:
            r14 = r7
            r7 = r1
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r36.mo3513o()
            int r1 = r0.getForwardCount()
            int r1 = r1 + r15
            r0.setForwardCount(r1)
            r14.mo2308n0(r9, r8)
            goto L_0x0345
        L_0x0278:
            r14 = r7
            r7 = r1
            r14.mo2308n0(r9, r8)
            goto L_0x0345
        L_0x027f:
            r14 = r7
            r7 = r1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r14.mo2302k0(r8, r9, r0)
            r34.mo2304l0(r35, r36)
            goto L_0x0345
        L_0x028b:
            r14 = r7
            r7 = r1
            B r0 = r0.f38556e
            boolean r1 = r0 instanceof com.tencent.p014mm.autogen.events.FeedUpdateEvent
            if (r1 == 0) goto L_0x0296
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = (com.tencent.p014mm.autogen.events.FeedUpdateEvent) r0
            goto L_0x0297
        L_0x0296:
            r0 = 0
        L_0x0297:
            if (r0 == 0) goto L_0x0345
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r1 = r0.f9173d
            int r2 = r1.f9185l
            java.lang.String r1 = r1.f9186m
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x02af
            android.content.Context r0 = r8.f173499A
            r1 = 2131829733(0x7f1123e5, float:1.9292443E38)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x02b3
        L_0x02af:
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            java.lang.String r0 = r0.f9186m
        L_0x02b3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "refreshRecommendFollowTips recommendFollowFlag="
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = " wording="
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "Finder.FeedFullConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            if (r2 != r15) goto L_0x02d5
            r6 = 1
            goto L_0x02d6
        L_0x02d5:
            r6 = 0
        L_0x02d6:
            java.lang.String r1 = "wording"
            gy3.C87412m.m108593f(r0, r1)
            r14.mo2257E0(r9, r8, r6, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0345
        L_0x02e2:
            r14 = r7
            r7 = r1
            r14.mo2314q0(r9, r8)
            r14.mo2293d0(r9, r8)
            r14.mo2327x0(r9, r8)
            goto L_0x0345
        L_0x02ee:
            r14 = r7
            r7 = r1
            B r0 = r0.f38556e
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.autogen.events.FeedUpdateEvent"
            gy3.C87412m.m108592e(r0, r1)
            com.tencent.mm.autogen.events.FeedUpdateEvent r0 = (com.tencent.p014mm.autogen.events.FeedUpdateEvent) r0
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r1 = r0.f9173d
            int r1 = r1.f9177d
            if (r1 != r15) goto L_0x0301
            r6 = 1
            goto L_0x0302
        L_0x0301:
            r6 = 0
        L_0x0302:
            r9.mo3505j0(r6)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r36.mo3513o()
            boolean r1 = r1.isCommentClose()
            if (r1 != 0) goto L_0x0345
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r0 = r0.f9173d
            int r0 = r0.f9176c
            goto L_0x0345
        L_0x0314:
            r14 = r7
            r7 = r1
            r34.mo2321u0(r35, r36)
            vq1.g r0 = vq1.C65854g.f189373e
            vq1.g r0 = vq1.C65854g.f189373e
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r36.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            boolean r0 = r0.mo89893c(r1)
            r34.mo2269K0(r35, r36)
            r34.mo2300j0(r35, r36)
            r1 = 2131305309(0x7f09235d, float:1.8228785E38)
            android.view.View r2 = r8.mo85812D(r1)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r2 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r2
            r2.mo4234C(r0)
            android.view.View r0 = r8.f44854d
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$u r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$u
            r1.<init>(r8)
            r0.post(r1)
        L_0x0345:
            r6 = 2
        L_0x0346:
            r19 = 24617(0x6029, float:3.4496E-41)
            r24 = 0
            goto L_0x0414
        L_0x034c:
            r14 = r7
            r7 = r1
            vq1.w$a r0 = vq1.C65866w.f189406g
            vq1.w r0 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r36.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            rx3.l r1 = r0.mo89908g(r1)
            A r2 = r1.f38555d
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r19 = r2.booleanValue()
            B r1 = r1.f38556e
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r20 = r1.booleanValue()
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r36.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            int r4 = r0.mo89909h(r1)
            r0 = r34
            r1 = r36
            r2 = r19
            r3 = r20
            r5 = r35
            r6 = r37
            r0.mo2294e0(r1, r2, r3, r4, r5, r6)
            di3.d r0 = di3.C86312j.m106911c(r12)
            l31.e r0 = (l31.C61212e) r0
            r1 = 2131297502(0x7f0904de, float:1.821295E38)
            android.view.View r1 = r8.mo85812D(r1)
            r6 = 2
            rx3.l[] r2 = new rx3.C13604l[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            rx3.l r4 = new rx3.l
            java.lang.String r5 = "is_action_like"
            r4.<init>(r5, r3)
            r5 = 0
            r2[r5] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            rx3.l r4 = new rx3.l
            java.lang.String r5 = "is_private"
            r4.<init>(r5, r3)
            r2[r15] = r4
            java.util.Map r2 = sx3.C90364q0.m113147f(r2)
            java.lang.String r3 = "feed_like_click"
            r5 = 24617(0x6029, float:3.4496E-41)
            r0.mo86153W7(r3, r1, r2, r5)
            r14.mo2255D0(r9, r8, r15, r10)
            r14.mo2259F0(r9, r8)
            r14.mo2320t0(r9, r8)
            r0 = 2131305309(0x7f09235d, float:1.8228785E38)
            android.view.View r1 = r8.mo85812D(r0)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r1 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r1
            if (r19 == 0) goto L_0x03d7
            if (r20 == 0) goto L_0x03d7
            r0 = 1
            goto L_0x03d8
        L_0x03d7:
            r0 = 0
        L_0x03d8:
            r1.mo4233B(r0)
            android.view.View r0 = r8.f44854d
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$t r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$t
            r1.<init>(r8)
            r0.post(r1)
            goto L_0x0346
        L_0x03e7:
            r14 = r7
            r5 = 24617(0x6029, float:3.4496E-41)
            r6 = 2
            r7 = r1
            r3 = 0
            r4 = 4
            r16 = 0
            r0 = r34
            r1 = r36
            r2 = r35
            r19 = 24617(0x6029, float:3.4496E-41)
            r24 = 0
            r5 = r16
            m2152z0(r0, r1, r2, r3, r4, r5)
            goto L_0x0414
        L_0x0400:
            r14 = r7
            r6 = 2
            r19 = 24617(0x6029, float:3.4496E-41)
            r24 = 0
            r7 = r1
            r14.mo2297g0(r9, r8)
            goto L_0x0414
        L_0x040b:
            r14 = r7
            r6 = 2
            r19 = 24617(0x6029, float:3.4496E-41)
            r24 = 0
            r7 = r1
            r18 = 0
        L_0x0414:
            r1 = r7
            r7 = r14
            r2 = 2
            r4 = 3
            r5 = 4
            goto L_0x00a1
        L_0x041b:
            r14 = r7
            r6 = 2
            r24 = 0
            r7 = r1
            if (r18 == 0) goto L_0x0428
            return
        L_0x0423:
            r14 = r7
            r6 = 2
            r24 = 0
            r7 = r1
        L_0x0428:
            if (r39 != 0) goto L_0x042d
            r34.mo2324w(r35, r36, r37, r38)
        L_0x042d:
            di3.d r0 = di3.C86312j.m106911c(r12)
            l31.e r0 = (l31.C61212e) r0
            android.view.View r1 = r8.f44854d
            java.lang.String r2 = "finder_feed_item_view"
            r0.o30(r1, r2)
            di3.d r0 = di3.C86312j.m106911c(r12)
            l31.e r0 = (l31.C61212e) r0
            android.view.View r1 = r8.f44854d
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$b r2 = f12553K
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r36.mo3513o()
            java.util.Map r2 = r2.mo2338a(r3)
            r0.mo86149PM(r1, r2)
            di3.d r0 = di3.C86312j.m106911c(r12)
            l31.e r0 = (l31.C61212e) r0
            android.view.View r1 = r8.f44854d
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$v r2 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$v
            r2.<init>(r8)
            r0.E60(r1, r2)
            android.view.View r0 = r8.f44854d
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r24)
            r1.mo10233c(r2)
            java.lang.Object[] r26 = r1.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r0
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r11 = 0
            java.lang.Object r1 = r1.mo10231a(r11)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            android.view.View r0 = r8.f44854d
            r1 = 2131306640(0x7f092890, float:1.8231485E38)
            android.view.View r0 = r0.findViewById(r1)
            if (r0 != 0) goto L_0x04af
            goto L_0x04ef
        L_0x04af:
            r1 = 0
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2.mo10233c(r1)
            java.lang.Object[] r25 = r2.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setAlpha"
            java.lang.String r31 = "(F)V"
            r24 = r0
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r1 = r2.mo10231a(r11)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r0.setAlpha(r1)
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r26 = "onBindViewHolder"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setAlpha"
            java.lang.String r30 = "(F)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
        L_0x04ef:
            r0 = 2131302842(0x7f0919ba, float:1.8223782E38)
            android.view.View r0 = r8.mo85812D(r0)
            if (r0 != 0) goto L_0x04f9
            goto L_0x0534
        L_0x04f9:
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r13)
            java.lang.Object[] r25 = r1.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r0
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r1 = r1.mo10231a(r11)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r26 = "onBindViewHolder"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
        L_0x0534:
            r34.mo2307n(r35, r36, r37)
            bl3.r r5 = bl3.C39818r.f106831a
            android.content.Context r0 = r8.f173499A
            gy3.C87412m.m108593f(r0, r7)
            bl3.r$a r0 = r5.mo62443b(r0)
            java.lang.Class<zn1.r> r1 = zn1.C16336r.class
            bl3.t r0 = r0.mo62449e(r1)
            r4 = r0
            zn1.r r4 = (zn1.C16336r) r4
            if (r4 == 0) goto L_0x07c4
            kf1.v1 r2 = r14.f12564e
            java.lang.String r0 = "contract"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.Class<ht1.v4> r0 = ht1.C8808v4.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.v4 r0 = (ht1.C8808v4) r0
            boolean r0 = r0.mo9635e()
            if (r0 == 0) goto L_0x0564
            goto L_0x07c4
        L_0x0564:
            r0 = 2131302893(0x7f0919ed, float:1.8223885E38)
            android.view.View r0 = r8.mo85812D(r0)
            if (r0 != 0) goto L_0x057f
            r0 = 2131302834(0x7f0919b2, float:1.8223765E38)
            android.view.View r0 = r8.mo85812D(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x057d
            android.view.View r0 = r0.inflate()
            goto L_0x057f
        L_0x057d:
            r3 = 0
            goto L_0x0580
        L_0x057f:
            r3 = r0
        L_0x0580:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r36.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            te3.kf1 r0 = r0.object_extend
            if (r0 == 0) goto L_0x058f
            te3.rh0 r0 = r0.f136745d
            goto L_0x0590
        L_0x058f:
            r0 = 0
        L_0x0590:
            if (r0 != 0) goto L_0x05d3
            if (r3 != 0) goto L_0x0596
            goto L_0x07c4
        L_0x0596:
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r13)
            java.lang.Object[] r25 = r0.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerUIC"
            java.lang.String r27 = "onBindView"
            java.lang.String r28 = "(Lcom/tencent/mm/plugin/finder/feed/FinderFeedContract;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r3
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r0 = r0.mo10231a(r11)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.setVisibility(r0)
            java.lang.String r25 = "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerUIC"
            java.lang.String r26 = "onBindView"
            java.lang.String r27 = "(Lcom/tencent/mm/plugin/finder/feed/FinderFeedContract;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            goto L_0x07c4
        L_0x05d3:
            androidx.appcompat.app.AppCompatActivity r0 = r4.getActivity()
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicTimelineUI
            if (r1 == 0) goto L_0x05de
            go1.a r0 = go1.C8366a.PLAYLIST_ON_TOPIC
            goto L_0x05e0
        L_0x05de:
            go1.a r0 = go1.C8366a.PLAYLIST
        L_0x05e0:
            if (r3 == 0) goto L_0x07c4
            go1.c r6 = go1.C8368c.f27352a
            int r15 = r35.hashCode()
            boolean r15 = r6.mo9335b(r15, r0)
            if (r15 != 0) goto L_0x062b
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r13)
            java.lang.Object[] r25 = r0.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerUIC"
            java.lang.String r27 = "onBindView"
            java.lang.String r28 = "(Lcom/tencent/mm/plugin/finder/feed/FinderFeedContract;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r3
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r0 = r0.mo10231a(r11)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.setVisibility(r0)
            java.lang.String r25 = "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerUIC"
            java.lang.String r26 = "onBindView"
            java.lang.String r27 = "(Lcom/tencent/mm/plugin/finder/feed/FinderFeedContract;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            goto L_0x07c4
        L_0x062b:
            k20.a r15 = new k20.a
            r15.<init>()
            r17 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r15.mo10233c(r0)
            java.lang.Object[] r25 = r15.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerUIC"
            java.lang.String r27 = "onBindView"
            java.lang.String r28 = "(Lcom/tencent/mm/plugin/finder/feed/FinderFeedContract;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r3
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r0 = r15.mo10231a(r11)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.setVisibility(r0)
            java.lang.String r25 = "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerUIC"
            java.lang.String r26 = "onBindView"
            java.lang.String r27 = "(Lcom/tencent/mm/plugin/finder/feed/FinderFeedContract;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r36.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            te3.kf1 r0 = r0.object_extend
            if (r0 == 0) goto L_0x0680
            te3.rh0 r0 = r0.f136745d
            if (r0 == 0) goto L_0x0680
            java.lang.String r0 = r0.f140918e
            if (r0 != 0) goto L_0x0682
        L_0x0680:
            java.lang.String r0 = ""
        L_0x0682:
            com.tencent.mm.plugin.finder.storage.FinderItem r15 = r36.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r15 = r15.getFeedObject()
            te3.kf1 r15 = r15.object_extend
            if (r15 == 0) goto L_0x0695
            te3.rh0 r15 = r15.f136745d
            if (r15 == 0) goto L_0x0695
            int r15 = r15.f140923j
            goto L_0x0696
        L_0x0695:
            r15 = 0
        L_0x0696:
            r11 = 2131302892(0x7f0919ec, float:1.8223883E38)
            android.view.View r11 = r3.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r18 = r1
            r1 = 2131302889(0x7f0919e9, float:1.8223877E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r38 = r5
            android.content.Context r5 = r8.f173499A
            android.content.res.Resources r5 = r5.getResources()
            r19 = r12
            r12 = 1
            java.lang.Object[] r10 = new java.lang.Object[r12]
            r20 = 0
            r10[r20] = r0
            r0 = 2131829409(0x7f1122a1, float:1.9291786E38)
            java.lang.String r0 = r5.getString(r0, r10)
            r11.setText(r0)
            android.content.Context r0 = r8.f173499A
            android.content.res.Resources r0 = r0.getResources()
            r5 = 2131829413(0x7f1122a5, float:1.9291794E38)
            java.lang.Object[] r10 = new java.lang.Object[r12]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            r10[r20] = r12
            java.lang.String r0 = r0.getString(r5, r10)
            r1.setText(r0)
            r0 = 2131302891(0x7f0919eb, float:1.822388E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L_0x06ee
            zn1.p r5 = new zn1.p
            r5.<init>(r0, r4, r11, r1)
            r0.post(r5)
        L_0x06ee:
            zn1.q r10 = new zn1.q
            r12 = r17
            r0 = r10
            r15 = r1
            r5 = r18
            r1 = r35
            r17 = r7
            r7 = r3
            r3 = r36
            r18 = r4
            r33 = r38
            r0.<init>(r1, r2, r3, r4, r5)
            r7.setOnClickListener(r10)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.CharSequence r1 = r11.getText()
            r0.append(r1)
            java.lang.CharSequence r1 = r15.getText()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.mo9337d(r8, r7, r12)
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            androidx.appcompat.app.AppCompatActivity r2 = r18.getActivity()
            rs1.s8 r1 = r1.mo12873f(r2)
            if (r1 == 0) goto L_0x0734
            te3.hj1 r1 = r1.mo12861q3()
            int r6 = r1.f134675i
            goto L_0x0735
        L_0x0734:
            r6 = 0
        L_0x0735:
            dp1.m0 r24 = dp1.C7446m0.f25635a
            r27 = 0
            r28 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r2 = "-14-$172-"
            r1.append(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "sourceid"
            r2.put(r3, r1)
            java.lang.String r3 = "traceid"
            r2.put(r3, r1)
            r1 = 4
            rx3.l[] r1 = new rx3.C13604l[r1]
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r36.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            te3.kf1 r3 = r3.object_extend
            if (r3 == 0) goto L_0x077a
            te3.rh0 r3 = r3.f136745d
            if (r3 == 0) goto L_0x077a
            long r3 = r3.f140917d
            goto L_0x077c
        L_0x077a:
            r3 = 0
        L_0x077c:
            java.lang.String r3 = o40.C61926c.m72691p(r3)
            rx3.l r4 = new rx3.l
            java.lang.String r5 = "collection_id"
            r4.<init>(r5, r3)
            r3 = 0
            r1[r3] = r4
            rx3.l r3 = new rx3.l
            java.lang.String r4 = "bubble_text"
            r3.<init>(r4, r0)
            r0 = 1
            r1[r0] = r3
            long r3 = r36.getItemId()
            java.lang.String r0 = o40.C61926c.m72691p(r3)
            rx3.l r3 = new rx3.l
            java.lang.String r4 = "feed_id"
            r3.<init>(r4, r0)
            r0 = 2
            r1[r0] = r3
            java.lang.String r0 = r2.toString()
            rx3.l r2 = new rx3.l
            java.lang.String r3 = "jump_id"
            r2.<init>(r3, r0)
            r0 = 3
            r1[r0] = r2
            java.util.Map r29 = sx3.C90364q0.m113147f(r1)
            r30 = 12
            r31 = 0
            java.lang.String r26 = "feed_jumpicon"
            r25 = r7
            dp1.C7446m0.m7572b(r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x07cb
        L_0x07c4:
            r33 = r5
            r17 = r7
            r19 = r12
            r0 = 3
        L_0x07cb:
            r14.mo2314q0(r9, r8)
            r34.mo2306m0(r35)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r14.mo2302k0(r8, r9, r1)
            r34.mo2304l0(r35, r36)
            er1.r1 r1 = er1.C7863r1.f26466a
            r1.getClass()
            r1 = 2131302887(0x7f0919e7, float:1.8223873E38)
            android.view.View r1 = r8.mo85812D(r1)
            go1.c r2 = go1.C8368c.f27352a
            int r3 = r35.hashCode()
            go1.a r4 = go1.C8366a.ORIGIN_AUTHOR_TEMPLATE
            boolean r3 = r2.mo9335b(r3, r4)
            if (r3 != 0) goto L_0x0835
            if (r1 != 0) goto L_0x07f7
            goto L_0x0986
        L_0x07f7:
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r13)
            java.lang.Object[] r24 = r0.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/utils/FinderOriginAuthorUtils"
            java.lang.String r26 = "refreshOriginAuthorLayout"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;I)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r1
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r2 = 0
            java.lang.Object r0 = r0.mo10231a(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/utils/FinderOriginAuthorUtils"
            java.lang.String r25 = "refreshOriginAuthorLayout"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;I)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0986
        L_0x0835:
            if (r1 == 0) goto L_0x0986
            java.lang.Class<pl1.s0> r3 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r5 = ht1.C60200t1.class
            r6 = 2131302844(0x7f0919bc, float:1.8223786E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131302843(0x7f0919bb, float:1.8223784E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            up1.f r10 = up1.C37521f.f99374d
            r10.getClass()
            pe1.c<java.lang.Integer> r10 = up1.C37521f.f99384e1
            java.lang.Object r10 = r10.mo60266n()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r11 = 1
            if (r10 != r11) goto L_0x086c
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r36.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r10 = r10.contact
            goto L_0x0876
        L_0x086c:
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r36.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r10 = r10.originalContact
        L_0x0876:
            if (r10 == 0) goto L_0x0940
            k20.a r11 = new k20.a
            r11.<init>()
            r12 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            r11.mo10233c(r15)
            java.lang.Object[] r24 = r11.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/utils/FinderOriginAuthorUtils"
            java.lang.String r26 = "refreshOriginView"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ILandroid/view/View;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r1
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r12 = 0
            java.lang.Object r11 = r11.mo10231a(r12)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r1.setVisibility(r11)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/utils/FinderOriginAuthorUtils"
            java.lang.String r25 = "refreshOriginView"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ILandroid/view/View;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            r11 = 0
            r12 = 0
            fe1.q r0 = fe1.C58960c.m68834f(r10, r11, r12, r0, r11)
            if (r6 == 0) goto L_0x08f3
            android.text.TextPaint r10 = r6.getPaint()
            r11 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r10, r11)
            android.content.Context r10 = r8.f173499A
            android.content.res.Resources r10 = r10.getResources()
            r12 = 1
            java.lang.Object[] r15 = new java.lang.Object[r12]
            java.lang.Class<ny.h> r12 = p629ny.C76979h.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            ny.h r12 = (p629ny.C76979h) r12
            android.content.Context r11 = r8.f173499A
            java.lang.String r14 = r0.getNickname()
            android.text.SpannableString r11 = r12.mo107057T1(r11, r14)
            r12 = 0
            r15[r12] = r11
            r11 = 2131826574(0x7f11178e, float:1.9286036E38)
            java.lang.String r10 = r10.getString(r11, r15)
            r6.setText(r10)
        L_0x08f3:
            r10 = r33
            if (r7 == 0) goto L_0x0924
            bl3.r$a r6 = r10.mo62446e(r5)
            bl3.c r6 = r6.mo62447c(r3)
            pl1.s0 r6 = (pl1.C11990s0) r6
            k60.d r6 = r6.mo11872i2()
            pl1.f r11 = new pl1.f
            java.lang.String r12 = r0.getAvatarUrl()
            r14 = 0
            r15 = 2
            r11.<init>(r12, r14, r15, r14)
            pl1.e0$a r12 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r5 = r10.mo62446e(r5)
            bl3.c r3 = r5.mo62447c(r3)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r3 = r3.mo11867O2(r12)
            r6.mo85957c(r11, r7, r3)
            goto L_0x0925
        L_0x0924:
            r14 = 0
        L_0x0925:
            er1.p1 r3 = new er1.p1
            r3.<init>(r0, r8, r9)
            r1.setOnClickListener(r3)
            long r5 = r36.getItemId()
            java.lang.String r0 = o40.C61926c.m72691p(r5)
            er1.q1 r3 = new er1.q1
            r3.<init>(r0, r8)
            zp3.C23564m.m28138h(r1, r3)
            rx3.b0 r11 = rx3.C13598b0.f38549a
            goto L_0x0944
        L_0x0940:
            r10 = r33
            r14 = 0
            r11 = r14
        L_0x0944:
            if (r11 != 0) goto L_0x0982
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r13)
            java.lang.Object[] r24 = r0.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/utils/FinderOriginAuthorUtils"
            java.lang.String r26 = "refreshOriginView"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ILandroid/view/View;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r1
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r3 = 0
            java.lang.Object r0 = r0.mo10231a(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/utils/FinderOriginAuthorUtils"
            java.lang.String r25 = "refreshOriginView"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ILandroid/view/View;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
        L_0x0982:
            r2.mo9337d(r8, r1, r4)
            goto L_0x0989
        L_0x0986:
            r10 = r33
            r14 = 0
        L_0x0989:
            r7 = r34
            r7.mo2291c0(r9, r8)
            r34.mo2298h0(r35, r36)
            r7.mo2293d0(r9, r8)
            android.content.Context r0 = r8.f173499A
            r11 = r17
            gy3.C87412m.m108593f(r0, r11)
            bl3.r$a r0 = r10.mo62443b(r0)
            java.lang.Class<rs1.h1> r1 = rs1.C13256h1.class
            bl3.t r0 = r0.mo62449e(r1)
            rs1.h1 r0 = (rs1.C13256h1) r0
            if (r0 == 0) goto L_0x09ae
            r0.mo12723c3(r8)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x09ae:
            r34.mo2299i0(r35, r36)
            r7.mo2297g0(r9, r8)
            r0 = 2131305313(0x7f092361, float:1.8228793E38)
            android.view.View r0 = r8.mo85812D(r0)
            if (r0 != 0) goto L_0x09ce
            r0 = 2131302835(0x7f0919b3, float:1.8223767E38)
            android.view.View r0 = r8.mo85812D(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x09cd
            android.view.View r0 = r0.inflate()
            goto L_0x09ce
        L_0x09cd:
            r0 = r14
        L_0x09ce:
            if (r0 == 0) goto L_0x0a87
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r36.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            int r1 = r1.warnFlag
            if (r1 == 0) goto L_0x0a49
            k20.a r1 = new k20.a
            r1.<init>()
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r3)
            java.lang.Object[] r22 = r1.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r24 = "onBindViewHolder"
            java.lang.String r25 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r0
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r22 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r23 = "onBindViewHolder"
            java.lang.String r24 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            r0 = 2131305315(0x7f092363, float:1.8228797E38)
            android.view.View r0 = r8.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0a87
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r36.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            java.lang.String r1 = r1.warnWording
            r0.setText(r1)
            android.content.Context r1 = r8.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165261(0x7f07004d, float:1.7944734E38)
            float r1 = r1.getDimension(r2)
            r2 = 0
            r0.setTextSize(r2, r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a87
        L_0x0a49:
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r13)
            java.lang.Object[] r22 = r1.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r24 = "onBindViewHolder"
            java.lang.String r25 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r0
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r22 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r23 = "onBindViewHolder"
            java.lang.String r24 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0a87:
            vq1.w$a r0 = vq1.C65866w.f189406g
            vq1.w r0 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r36.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            rx3.l r1 = r0.mo89908g(r1)
            A r2 = r1.f38555d
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            B r1 = r1.f38556e
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r3 = r1.booleanValue()
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r36.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            int r4 = r0.mo89909h(r1)
            r0 = r34
            r1 = r36
            r5 = r35
            r6 = r37
            r0.mo2294e0(r1, r2, r3, r4, r5, r6)
            r7.mo2305m(r8, r6)
            android.view.View r0 = r8.f44854d
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.view.SimpleTouchableLayout
            if (r1 == 0) goto L_0x0aca
            com.tencent.mm.plugin.finder.view.SimpleTouchableLayout r0 = (com.tencent.p014mm.plugin.finder.view.SimpleTouchableLayout) r0
            goto L_0x0acb
        L_0x0aca:
            r0 = r14
        L_0x0acb:
            if (r0 == 0) goto L_0x0b08
            int r1 = r7.f12555B
            r0.setLongPressTimeout(r1)
            r1 = 0
            r0.setEnableScale(r1)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$w r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$w
            r1.<init>(r8, r7, r6)
            r0.setOnDoubleClickListener(r1)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$x r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$x
            r1.<init>(r7, r8)
            r0.setOnSingleClickListener(r1)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$y r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$y
            r1.<init>(r7, r8)
            r0.setOnLongClickListener((com.tencent.p014mm.plugin.finder.view.SimpleTouchableLayout.C4006c) r1)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$z r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$z
            r1.<init>(r8)
            r0.setOnScrollListener(r1)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$a0 r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$a0
            r1.<init>(r8)
            r0.setOnFlingListener(r1)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$b0 r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$b0
            r1.<init>(r8)
            r0.setOnTouchEventUpOrCancel(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0b08:
            r0 = 2131304485(0x7f092025, float:1.8227114E38)
            android.view.View r0 = r8.mo85812D(r0)
            com.tencent.mm.plugin.finder.view.FinderMediaLayout r0 = (com.tencent.p014mm.plugin.finder.view.FinderMediaLayout) r0
            if (r0 == 0) goto L_0x0b55
            int r1 = r7.f12555B
            r0.setLongPressTimeout(r1)
            di3.d r1 = di3.C86312j.m106911c(r19)
            l31.e r1 = (l31.C61212e) r1
            java.lang.String r2 = "live_room_card"
            r1.o30(r0, r2)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$c0 r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$c0
            r1.<init>(r8, r7)
            r0.setOnSingleClickListener(r1)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$d0 r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$d0
            r1.<init>(r8, r7, r6)
            r0.setOnDoubleClickListener(r1)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$e0 r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$e0
            r1.<init>(r7, r8)
            r0.setOnLongClickListener(r1)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$f0 r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$f0
            r1.<init>(r8)
            r0.setOnScrollListener(r1)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$g0 r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$g0
            r1.<init>(r8)
            r0.setOnFlingListener(r1)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$h0 r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$h0
            r1.<init>(r8)
            r0.setOnTouchEventUpOrCancel(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0b55:
            r0 = 2131305309(0x7f09235d, float:1.8228785E38)
            android.view.View r0 = r8.mo85812D(r0)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r0 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r0
            if (r0 == 0) goto L_0x0b7f
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$i0 r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$i0
            r1.<init>(r9, r7, r8, r6)
            r0.setOnPrivateLikeClickListener(r1)
            kf1.v1 r1 = r7.f12564e
            boolean r1 = r1.mo2497u0()
            r0.mo4236E(r1, r9)
            android.view.View r1 = r0.getPlayCtrlBtn()
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$j0 r2 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$j0
            r2.<init>(r8, r0)
            r1.setOnClickListener(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0b7f:
            r0 = 2131304572(0x7f09207c, float:1.822729E38)
            android.view.View r0 = r8.mo85812D(r0)
            if (r0 != 0) goto L_0x0b89
            goto L_0x0bc5
        L_0x0b89:
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r13)
            java.lang.Object[] r22 = r1.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r24 = "onBindViewHolder"
            java.lang.String r25 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r0
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r22 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r23 = "onBindViewHolder"
            java.lang.String r24 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
        L_0x0bc5:
            r0 = 2131305120(0x7f0922a0, float:1.8228402E38)
            android.view.View r0 = r8.mo85812D(r0)
            if (r0 != 0) goto L_0x0bcf
            goto L_0x0c10
        L_0x0bcf:
            k20.a r1 = new k20.a
            r1.<init>()
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r3)
            java.lang.Object[] r22 = r1.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r24 = "onBindViewHolder"
            java.lang.String r25 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r0
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r22 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r23 = "onBindViewHolder"
            java.lang.String r24 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
        L_0x0c10:
            r0 = 2131313436(0x7f09431c, float:1.8245269E38)
            android.view.View r1 = r8.mo85812D(r0)
            if (r1 == 0) goto L_0x0c23
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$k0 r2 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$k0
            r2.<init>(r7, r8)
            r1.setOnClickListener(r2)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0c23:
            android.view.View r0 = r8.mo85812D(r0)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$l0 r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$l0
            r1.<init>(r8, r9)
            r0.setOnLongClickListener(r1)
            r0 = 2131314283(0x7f09466b, float:1.8246987E38)
            android.view.View r0 = r8.mo85812D(r0)
            di3.d r1 = di3.C86312j.m106911c(r19)
            l31.e r1 = (l31.C61212e) r1
            java.lang.String r2 = "finder_feed_fav"
            r1.o30(r0, r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r36.mo3513o()
            fe1.q r1 = r36.mo3507l()
            if (r1 == 0) goto L_0x0c4f
            java.lang.String r14 = r1.getUsername()
        L_0x0c4f:
            r7.mo2325w0(r8, r0, r14)
            r0 = 0
            r7.mo2255D0(r9, r8, r0, r6)
            r7.mo2259F0(r9, r8)
            r7.mo2271L0(r9, r8)
            r7.mo2320t0(r9, r8)
            r7.mo2308n0(r9, r8)
            r34.mo2251B0(r35, r36)
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r34
            r1 = r36
            r2 = r35
            m2152z0(r0, r1, r2, r3, r4, r5)
            r7.mo2249A0(r9, r8)
            r34.mo2310o0(r35)
            r34.mo2265I0(r35, r36)
            r34.mo2321u0(r35, r36)
            r34.mo2300j0(r35, r36)
            r34.mo2269K0(r35, r36)
            r34.mo2253C0(r35, r36)
            r7.mo2312p0(r9, r8)
            r7.mo2327x0(r9, r8)
            r34.mo2323v0(r35, r36)
            r0 = 0
            r7.mo2267J0(r8, r6, r9, r0)
            r7.mo2318s0(r9, r8, r6)
            r7.mo2273M0(r9, r8, r6)
            r7.mo2316r0(r9, r8, r6)
            android.content.Context r0 = r8.f173499A
            gy3.C87412m.m108593f(r0, r11)
            bl3.r$a r0 = r10.mo62443b(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC> r1 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class
            bl3.t r0 = r0.mo62449e(r1)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r0 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) r0
            if (r0 == 0) goto L_0x0cda
            kf1.v1 r1 = r7.f12564e
            boolean r1 = r1.mo2497u0()
            rs1.k1 r2 = new rs1.k1
            r2.<init>(r8, r0, r1)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 != 0) goto L_0x0cd7
            android.view.View r0 = r8.f44854d
            rs1.j1 r1 = new rs1.j1
            r1.<init>(r2)
            r0.post(r1)
            goto L_0x0cda
        L_0x0cd7:
            r2.invoke()
        L_0x0cda:
            r34.mo2263H0(r35)
            r34.mo2329y0(r35)
            r0 = 1
            r7.mo2258F(r8, r0)
            r34.mo2275N0(r35)
            r34.mo2256E(r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo44e(jq3.o, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, int, boolean, java.util.List):void");
    }

    /* renamed from: L0 */
    public void mo2271L0(T t, C60905o oVar) {
        TextView textView;
        String str;
        C60905o oVar2 = oVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(t, "item");
        C87412m.m108594g(oVar2, "holder");
        View D = oVar2.mo85812D(C0966R.C0970id.nz9);
        if (D != null && (textView = (TextView) oVar2.mo85812D(C0966R.C0970id.nye)) != null) {
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            if (t.mo3513o().getFeedObject().recommendReasonType == 29) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshStarRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshStarRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                C117292a.m165358d(D, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshStarRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshStarRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C48996cf1 a = C15587j.f42215a.mo14349a("FinderObjectDynamicImageKey_FinderFavOffBoldIcon");
            String str2 = "";
            if (a != null && (!this.f12567h || C85875k4.m106211z() ? (str = a.f131694e) != null : (str = a.f131695f) != null)) {
                str2 = str;
            }
            C99344b<C100810g0, Bitmap> b = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str2, C27696y.RAW_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.FAV_ICON));
            C2386u1 u1Var = new C2386u1(oVar2, textView);
            b.getClass();
            b.f291320d = u1Var;
            b.mo85953c();
        }
    }

    /* renamed from: M */
    public void mo2272M(C60905o oVar, T t, View view, int i) {
        boolean z;
        String str;
        C60905o oVar2 = oVar;
        T t2 = t;
        View view2 = view;
        int i2 = i;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(t2, "item");
        C87412m.m108594g(view2, LocaleUtil.ITALIAN);
        C117361f.INSTANCE.mo182041q(540999702);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.f12569j;
        if (41 <= j && j < 300) {
            this.f12569j = elapsedRealtime;
            z = false;
        } else {
            this.f12569j = elapsedRealtime;
            z = true;
        }
        if (z) {
            if (oVar.mo17363j() == 0) {
                C39818r rVar = C39818r.f106831a;
                Context context = oVar2.f173499A;
                C87412m.m108593f(context, "holder.context");
                C60592c cVar = ((C60593d) rVar.mo62443b(context).mo75002a(C60593d.class)).f172693f;
                if (cVar != null) {
                    cVar.mo85549a();
                    cVar.mo85550b("forward");
                }
            }
            C50425mn1 mn12 = t.mo3513o().getFeedObject().tips_info;
            if (mn12 == null || (str = mn12.f138115d) == null) {
                str = "";
            }
            boolean z2 = !Util.isNullOrNil(str) && t.mo3513o().isNotShare();
            C77407n nVar = new C77407n(oVar2.f173499A, 0, z2);
            if (z2) {
                View inflate = C85868k2.m106137b(oVar2.f173499A).inflate(C0966R.C0971layout.app, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.e7i);
                if (textView != null) {
                    C85875k4.m106189j0(textView.getPaint(), 0.8f);
                    textView.setText(str);
                }
                nVar.mo107569n(inflate, true);
            }
            C2373q0 q0Var = new C2373q0(view2, this, t2, i2);
            C7433e1.f25624c = new JSONObject();
            nVar.f225771i = this.f12564e.mo2582w1(t2, nVar, i2);
            nVar.f225773j = this.f12564e.mo2568d7(t2, nVar, oVar);
            nVar.f225782p = this.f12564e.mo2574Y4(t2, i2, oVar, q0Var);
            nVar.f225787r = this.f12564e.mo2574Y4(t2, i2, oVar, q0Var);
            nVar.f225778n = this.f12564e.mo2569A1(t2, nVar);
            nVar.f225789s = this.f12564e.mo2574Y4(t2, i2, oVar, q0Var);
            nVar.f225791t = this.f12564e.mo2575f5(nVar, t2, i2, oVar);
            nVar.f225795v = this.f12564e.mo2580u4(t2, nVar);
            view2.setTag(Boolean.TRUE);
            ((C58417y0) C86312j.m106911c(C58417y0.class)).wx0(oVar, t.getItemId(), t.mo3513o());
            nVar.f225761d = new C2363n0(view, oVar, this, t, i);
            nVar.f225763e = C2366o0.f12695a;
            nVar.f225802y = new C2370p0(this, t2, i2);
            nVar.mo107573q();
            C39818r rVar2 = C39818r.f106831a;
            Context context2 = oVar2.f173499A;
            C87412m.m108593f(context2, "holder.context");
            FinderDescPanelUIC finderDescPanelUIC = (FinderDescPanelUIC) rVar2.mo62443b(context2).mo62449e(FinderDescPanelUIC.class);
            if (finderDescPanelUIC != null) {
                finderDescPanelUIC.mo5121i3(oVar);
            }
            FinderFullSeekBarLayout finderFullSeekBarLayout = (FinderFullSeekBarLayout) oVar.mo85812D(C0966R.C0970id.eh4);
            if (finderFullSeekBarLayout != null) {
                finderFullSeekBarLayout.mo4295t();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00fa, code lost:
        r1 = new androidx.lifecycle.C54219z<>();
     */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2273M0(T r17, jq3.C60905o r18, int r19) {
        /*
            r16 = this;
            r4 = r18
            bl3.r r0 = bl3.C39818r.f106831a
            android.content.Context r1 = r4.f173499A
            java.lang.String r2 = "holder.context"
            gy3.C87412m.m108593f(r1, r2)
            bl3.r$a r1 = r0.mo62443b(r1)
            java.lang.Class<rs1.d3> r2 = rs1.C13181d3.class
            bl3.t r1 = r1.mo62449e(r2)
            r3 = r1
            rs1.d3 r3 = (rs1.C13181d3) r3
            r6 = r16
            if (r3 == 0) goto L_0x0118
            kf1.v1 r1 = r6.f12564e
            boolean r5 = r1.mo2497u0()
            r1 = 8
            java.lang.String r2 = "feed"
            r7 = r17
            gy3.C87412m.m108594g(r7, r2)
            r2 = 2131302903(0x7f0919f7, float:1.8223905E38)
            android.view.View r2 = r4.mo85812D(r2)
            com.tencent.mm.plugin.finder.view.FinderWordingLayout r2 = (com.tencent.p014mm.plugin.finder.view.FinderWordingLayout) r2
            if (r2 != 0) goto L_0x0038
            goto L_0x0118
        L_0x0038:
            android.content.Context r8 = r4.f173499A
            boolean r9 = r8 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r9 == 0) goto L_0x0041
            com.tencent.mm.ui.MMActivity r8 = (com.tencent.p014mm.p136ui.MMActivity) r8
            goto L_0x0042
        L_0x0041:
            r8 = 0
        L_0x0042:
            if (r8 != 0) goto L_0x0046
            goto L_0x0118
        L_0x0046:
            r2.setVisibility(r1)
            if (r5 == 0) goto L_0x00dd
            java.lang.Class<pl1.s0> r1 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r9 = ht1.C60200t1.class
            wp1.j r11 = wp1.C15587j.f42215a
            java.lang.String r12 = "FinderObjectDynamicImageKey_FinderFavOffIcon"
            te3.cf1 r11 = r11.mo14349a(r12)
            if (r11 == 0) goto L_0x005d
            java.lang.String r11 = r11.f131694e
            if (r11 != 0) goto L_0x005f
        L_0x005d:
            java.lang.String r11 = ""
        L_0x005f:
            android.content.Context r12 = r4.f173499A
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131755663(0x7f10028f, float:1.9142212E38)
            r14 = 0
            android.graphics.drawable.Drawable r12 = hi3.C87515a.m108835e(r12, r13, r14)
            android.content.Context r13 = r4.f173499A
            r14 = 2131100571(0x7f06039b, float:1.7813527E38)
            int r13 = kg3.C76577a.m92153d(r13, r14)
            r14 = 2131306201(0x7f0926d9, float:1.8230594E38)
            android.view.View r14 = r4.mo85812D(r14)
            com.tencent.mm.ui.widget.imageview.WeImageView r14 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r14
            r15 = 2131314281(0x7f094669, float:1.8246983E38)
            android.view.View r15 = r4.mo85812D(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r10 = 2131314283(0x7f09466b, float:1.8246987E38)
            android.view.View r10 = r4.mo85812D(r10)
            r15.setTextColor(r13)
            int r15 = r11.length()
            r4 = 0
            if (r15 != 0) goto L_0x009b
            r15 = 1
            goto L_0x009c
        L_0x009b:
            r15 = 0
        L_0x009c:
            if (r15 == 0) goto L_0x00a5
            r14.setImageDrawable(r12)
            r14.setIconColor(r13)
            goto L_0x00da
        L_0x00a5:
            r12 = 0
            r14.setLayerPaint(r12)
            r14.setIconColor(r4)
            bl3.r$a r12 = r0.mo62446e(r9)
            bl3.c r12 = r12.mo62447c(r1)
            pl1.s0 r12 = (pl1.C11990s0) r12
            k60.d r12 = r12.mo11871f2()
            pl1.n0 r13 = new pl1.n0
            up1.y r15 = up1.C27696y.RAW_IMAGE
            r13.<init>(r11, r15)
            pl1.e0$a r11 = pl1.C11978e0.C11979a.FAV_ICON
            bl3.r$a r0 = r0.mo62446e(r9)
            bl3.c r0 = r0.mo62447c(r1)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r11)
            r12.mo85957c(r13, r14, r0)
            r0 = 1050253722(0x3e99999a, float:0.3)
            r14.setAlpha(r0)
        L_0x00da:
            r10.setEnabled(r4)
        L_0x00dd:
            r0 = 0
            r3.f37491h = r0
            long r0 = r17.getItemId()
            rx3.g r4 = r3.f37489f
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            pf1.n r4 = (pf1.C62273n) r4
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, androidx.lifecycle.z<te3.dl>> r4 = r4.f177026n
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r1 = r4.get(r0)
            if (r1 != 0) goto L_0x0107
            androidx.lifecycle.z r1 = new androidx.lifecycle.z
            r1.<init>()
            java.lang.Object r0 = r4.putIfAbsent(r0, r1)
            if (r0 != 0) goto L_0x0106
            goto L_0x0107
        L_0x0106:
            r1 = r0
        L_0x0107:
            r9 = r1
            androidx.lifecycle.z r9 = (androidx.lifecycle.C54219z) r9
            rs1.l3 r10 = new rs1.l3
            r0 = r10
            r1 = r2
            r2 = r17
            r4 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            o40.C61926c.m72695t(r9, r8, r10)
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2273M0(com.tencent.mm.plugin.finder.model.BaseFinderFeed, jq3.o, int):void");
    }

    /* renamed from: N */
    public void mo2274N(C60905o oVar, int i, int i2, int i3) {
        C10786a1 a1Var;
        C60905o oVar2 = oVar;
        int i4 = i3;
        Class cls = C10786a1.class;
        C87412m.m108594g(oVar2, "holder");
        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) oVar2.f173503E;
        StringBuilder sb = new StringBuilder();
        sb.append("[onDeepEnjoyMedia] ");
        C58969q l = baseFinderFeed.mo3507l();
        sb.append(l != null ? l.getNickname() : null);
        sb.append(" position=");
        sb.append(i);
        sb.append(" type=");
        sb.append(i2);
        sb.append(" source=");
        sb.append(i4);
        sb.append(" feedId=");
        sb.append(C61926c.m72691p(baseFinderFeed.getItemId()));
        Log.m105924i("Finder.FeedFullConvert", sb.toString());
        if (i4 == 0) {
            mo2315r(oVar2, baseFinderFeed);
            C15585f.f42212b.put(Long.valueOf(baseFinderFeed.getItemId()), Boolean.TRUE);
        }
        if (!this.f12564e.mo2497u0()) {
            C39818r rVar = C39818r.f106831a;
            Context context = oVar2.f173499A;
            C87412m.m108593f(context, "holder.context");
            C10786a1 a1Var2 = (C10786a1) rVar.mo62443b(context).mo75002a(cls);
            View view = oVar2.f44854d;
            C87412m.m108593f(view, "holder.itemView");
            a1Var2.getClass();
            Iterator it = ((Map) ((C36570n) a1Var2.f32393g).getValue()).entrySet().iterator();
            while (true) {
                int i5 = 0;
                if (!it.hasNext()) {
                    break;
                }
                ViewGroup a = ((C12991c) ((Map.Entry) it.next()).getValue()).mo11030a(view);
                if (a != null) {
                    int childCount = a.getChildCount();
                    while (i5 < childCount) {
                        Object tag = a.getChildAt(i5).getTag(a1Var2.f32394h);
                        C12982a aVar = tag instanceof C12982a ? (C12982a) tag : null;
                        if (aVar != null) {
                            C60905o oVar3 = aVar.f37016e;
                            View view2 = aVar.f37012a;
                            C11920q qVar = aVar.f37015d;
                            if (!(oVar3 == null || view2 == null || qVar == null)) {
                                a1Var = a1Var2;
                                aVar.mo11091r(oVar3, view2, qVar, aVar.f37013b);
                                i5++;
                                a1Var2 = a1Var;
                            }
                        }
                        a1Var = a1Var2;
                        i5++;
                        a1Var2 = a1Var;
                    }
                }
            }
            if (!baseFinderFeed.mo3472F()) {
                baseFinderFeed.mo3486T(true);
                m2151u(this, oVar, baseFinderFeed, false, 4, (Object) null);
                mo2322v(oVar2, baseFinderFeed);
                mo2327x0(baseFinderFeed, oVar2);
                mo2310o0(oVar);
                C39818r rVar2 = C39818r.f106831a;
                Context context2 = oVar2.f173499A;
                C87412m.m108593f(context2, "holder.context");
                C10786a1 a1Var3 = (C10786a1) rVar2.mo62443b(context2).mo75002a(cls);
                View view3 = oVar2.f44854d;
                C87412m.m108593f(view3, "holder.itemView");
                a1Var3.getClass();
                for (Map.Entry value : ((Map) ((C36570n) a1Var3.f32393g).getValue()).entrySet()) {
                    ViewGroup a2 = ((C12991c) value.getValue()).mo11030a(view3);
                    if (a2 != null) {
                        int childCount2 = a2.getChildCount();
                        for (int i6 = 0; i6 < childCount2; i6++) {
                            Object tag2 = a2.getChildAt(i6).getTag(a1Var3.f32394h);
                            C12982a aVar2 = tag2 instanceof C12982a ? (C12982a) tag2 : null;
                            if (aVar2 != null) {
                                C60905o oVar4 = aVar2.f37016e;
                                View view4 = aVar2.f37012a;
                                C11920q qVar2 = aVar2.f37015d;
                                if (!(oVar4 == null || view4 == null || qVar2 == null)) {
                                    C87412m.m108594g(aVar2.f37013b, FirebaseAnalytics.C113379b.SOURCE);
                                    C11917o0 o0Var = aVar2.f37020i;
                                    if (o0Var != null) {
                                        o0Var.mo11789k(oVar4, view4, qVar2);
                                    }
                                }
                            }
                        }
                    }
                }
                C39818r rVar3 = C39818r.f106831a;
                Context context3 = oVar2.f173499A;
                C87412m.m108593f(context3, "holder.context");
                C13490v9 v9Var = (C13490v9) rVar3.mo62443b(context3).mo75002a(C13490v9.class);
                v9Var.getClass();
                if (C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_FULL_LIKE_FEED_GUIDE_INT, 0) >= 3) {
                    BaseFinderFeed baseFinderFeed2 = (BaseFinderFeed) oVar2.f173503E;
                    View D = oVar2.mo85812D(C0966R.C0970id.ji4);
                    if (D != null) {
                        v9Var.mo12898c3(D, baseFinderFeed2.getItemId(), 1);
                    }
                }
            }
        }
    }

    /* renamed from: N0 */
    public final void mo2275N0(C60905o oVar) {
        View D = oVar.mo85812D(C0966R.C0970id.d97);
        if (D != null) {
            D.setTranslationY(0.0f);
        }
        View D2 = oVar.mo85812D(C0966R.C0970id.e6u);
        if (D2 != null) {
            D2.setTranslationY(0.0f);
        }
        View D3 = oVar.mo85812D(C0966R.C0970id.crv);
        if (D3 != null) {
            D3.setTranslationY(0.0f);
        }
    }

    /* renamed from: O */
    public void mo2276O(C60905o oVar) {
        View view;
        Class cls = C61212e.class;
        C87412m.m108594g(oVar, "holder");
        Log.m105924i("Finder.FeedFullConvert", "onFocusFeedCenter: pos=" + oVar.mo17363j() + ", id=" + C61926c.m72691p(((C9493c) oVar.f173503E).getItemId()));
        oVar.f44854d.setTag(C0966R.C0970id.mza, Boolean.TRUE);
        this.f12581y = oVar;
        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) oVar.f173503E;
        Context context = oVar.f173499A;
        if (context instanceof FinderHomeUI) {
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            view = ((Activity) context).findViewById(C0966R.C0970id.m7c);
        } else {
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            view = ((Activity) context).findViewById(C0966R.C0970id.ncr);
        }
        ((C61212e) C86312j.m106911c(cls)).o30(view, "split_view_icon");
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(view, 40, 26430);
        ((C61212e) C86312j.m106911c(cls)).mo86149PM(view, C90363p0.m113143b(new C13604l("split_view_scene_info", C61926c.m72691p(baseFinderFeed.getItemId()))));
        BaseFinderFeed baseFinderFeed2 = (BaseFinderFeed) oVar.f173503E;
        if (((Number) ((C36570n) this.f12579w).getValue()).intValue() == 16) {
            ((C61212e) C86312j.m106911c(cls)).E60(this.f12564e.getActivity(), new C2382t0(baseFinderFeed2));
        }
        C119179t tVar = C119157j.f356862d;
        C2385u0 u0Var = new C2385u0(this, oVar, baseFinderFeed2);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(u0Var, 100, false);
    }

    /* renamed from: O0 */
    public final void mo2277O0(WeImageView weImageView, C49839if1 if12, boolean z) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        String str = if12 != null ? if12.f135273s : null;
        if (str == null || str.length() == 0) {
            C58784w3 w3Var = C58784w3.f168295a;
            Integer c0 = C58784w3.m68436c0(w3Var, 4, false, 2, (Object) null);
            int intValue = c0 != null ? c0.intValue() : C0966R.raw.icons_filled_like_group;
            if (!z && this.f12564e.mo2497u0()) {
                Integer c05 = C58784w3.m68436c0(w3Var, 8, false, 2, (Object) null);
                intValue = c05 != null ? c05.intValue() : C0966R.raw.finder_filled_like_private;
            }
            weImageView.setImageDrawable(C87515a.m108835e(weImageView.getContext().getResources(), intValue, 0.0f));
            weImageView.setIconColor(weImageView.getContext().getResources().getColor(C0966R.color.Red_90));
            return;
        }
        ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11984n0(str, C27696y.RAW_IMAGE), weImageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.COMMON));
    }

    /* renamed from: P */
    public void mo2278P(C60905o oVar, int i) {
        C87412m.m108594g(oVar, "holder");
        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) oVar.f173503E;
        StringBuilder sb = new StringBuilder();
        sb.append("[onHafEnjoyMedia] ");
        C58969q l = baseFinderFeed.mo3507l();
        sb.append(l != null ? l.getNickname() : null);
        sb.append(" position=");
        sb.append(i);
        sb.append(" feedId=");
        sb.append(C61926c.m72691p(baseFinderFeed.getItemId()));
        Log.m105924i("Finder.FeedFullConvert", sb.toString());
        if (!baseFinderFeed.mo3475I()) {
            baseFinderFeed.mo3491Y(true);
            ((FinderFullSeekBarLayout) oVar.mo85812D(C0966R.C0970id.eh4)).mo4232A(baseFinderFeed);
        }
    }

    /* renamed from: P0 */
    public void mo2279P0(C60905o oVar, T t, int i, Drawable drawable) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(t, "item");
        Log.m105924i("Finder.FeedFullConvert", "onLongClick Private Like:" + oVar.mo17363j());
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.f1x);
        if ((imageView.getTag() instanceof Integer) && C87412m.m108589b(imageView.getTag(), 0)) {
            C77407n nVar = new C77407n(oVar.f173499A, 1, true);
            nVar.f225771i = new C2392w1(this, oVar, t, drawable);
            nVar.f225782p = new C2395x1(this, oVar, i);
            nVar.mo107573q();
        }
    }

    /* renamed from: Q */
    public boolean mo2280Q(C60905o oVar, View view, FinderObject finderObject) {
        Class cls = FinderDescPanelUIC.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(finderObject, "finderObj");
        FinderFullSeekBarLayout finderFullSeekBarLayout = (FinderFullSeekBarLayout) oVar.mo85812D(C0966R.C0970id.eh4);
        if (finderFullSeekBarLayout != null) {
            finderFullSeekBarLayout.mo4297w();
        }
        mo2303l(oVar);
        FinderFullSeekBarLayout finderFullSeekBarLayout2 = (FinderFullSeekBarLayout) oVar.mo85812D(C0966R.C0970id.eh4);
        if (finderFullSeekBarLayout2 != null) {
            FinderFullSeekBarLayout.m4082G(finderFullSeekBarLayout2, (String) null, false, 3, (Object) null);
            if (finderFullSeekBarLayout2.f17507V) {
                C39818r rVar = C39818r.f106831a;
                Context context = oVar.f173499A;
                C87412m.m108593f(context, "holder.context");
                FinderDescPanelUIC finderDescPanelUIC = (FinderDescPanelUIC) rVar.mo62443b(context).mo62449e(cls);
                if (finderDescPanelUIC != null) {
                    finderDescPanelUIC.mo5121i3(oVar);
                }
            } else {
                C39818r rVar2 = C39818r.f106831a;
                Context context2 = oVar.f173499A;
                C87412m.m108593f(context2, "holder.context");
                FinderDescPanelUIC finderDescPanelUIC2 = (FinderDescPanelUIC) rVar2.mo62443b(context2).mo62449e(cls);
                if (finderDescPanelUIC2 != null) {
                    finderDescPanelUIC2.mo5122j3(oVar);
                }
            }
        }
        return false;
    }

    /* renamed from: R */
    public void mo2281R(C60905o oVar, View view, MotionEvent motionEvent, int i) {
        C60905o oVar2 = oVar;
        View view2 = view;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(view2, "view");
        C87412m.m108594g(motionEvent, "e");
        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) oVar2.f173503E;
        if (baseFinderFeed.mo3513o().isPostFinish() && !this.f12564e.mo2497u0() && !baseFinderFeed.mo3479M()) {
            C58784w3 w3Var = C58784w3.f168295a;
            FinderObject feedObject = baseFinderFeed.mo3513o().getFeedObject();
            w3Var.getClass();
            C87412m.m108594g(feedObject, C66261f3.COL_FINDEROBJECT);
            boolean z = true;
            if ((feedObject.permissionFlag & 32) == 0) {
                C13604l<Boolean, Boolean> g = C65866w.f189407h.mo89908g(baseFinderFeed.mo3513o().getFeedObject());
                boolean booleanValue = ((Boolean) g.f38555d).booleanValue();
                boolean booleanValue2 = ((Boolean) g.f38556e).booleanValue();
                if (!booleanValue || !booleanValue2) {
                    ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("feed_like_double_tap", view2, (Map<String, Object>) null, 24617);
                    if (booleanValue) {
                        WeImageView x = mo2326x(oVar);
                        C49839if1 c = C15587j.f42215a.mo14351c(baseFinderFeed.mo3513o().getFeedObject().objectType);
                        String str = c == null ? "" : C85875k4.m106211z() ? c.f135268n : c.f135269o;
                        if (!(str == null || str.length() == 0)) {
                            z = false;
                        }
                        if (!z) {
                            C39818r rVar = C39818r.f106831a;
                            ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11984n0(str, C27696y.RAW_IMAGE), x, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.LIKE_HOT_DEFAULT));
                        } else if (C58739j4.f168176a.mo83688Q(baseFinderFeed.mo3507l())) {
                            Context context = oVar2.f173499A;
                            Integer b0 = w3Var.mo83917b0(6, false);
                            x.setImageDrawable(C74933u4.m89768e(context, b0 != null ? b0.intValue() : C0966R.raw.finder_filled_like_lock, oVar2.f173499A.getResources().getColor(C0966R.color.Red_90)));
                        } else {
                            Context context2 = oVar2.f173499A;
                            Integer b05 = w3Var.mo83917b0(2, false);
                            x.setImageDrawable(C74933u4.m89768e(context2, b05 != null ? b05.intValue() : C0966R.raw.finder_full_like, oVar2.f173499A.getResources().getColor(C0966R.color.Red_90)));
                        }
                        C14063b.m13416d(C14063b.f39453a, x, 1.4f, motionEvent, true, 0.0f, 0, (C32224a) null, 112, (Object) null);
                        return;
                    }
                    mo2266J(oVar, 2, false, motionEvent, i);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2282S(jq3.C60905o r19, android.view.View r20, T r21, android.view.MotionEvent r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "view"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.String r4 = "item"
            gy3.C87412m.m108594g(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[onMediaLongClick] feedId="
            r4.append(r5)
            long r5 = r21.getItemId()
            java.lang.String r5 = o40.C61926c.m72691p(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "Finder.FeedFullConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            boolean r4 = r0.mo2313q(r3)
            if (r4 == 0) goto L_0x020e
            int r4 = r21.mo75c()
            r5 = 4
            r6 = 2
            if (r4 == r5) goto L_0x004a
            int r4 = r21.mo75c()
            if (r4 != r6) goto L_0x020e
        L_0x004a:
            boolean r4 = r21.mo3479M()
            if (r4 != 0) goto L_0x020e
            up1.f r4 = up1.C37521f.f99374d
            r4.getClass()
            pe1.c<java.lang.Integer> r7 = up1.C37521f.f99387e4
            java.lang.Object r7 = r7.mo60266n()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r8 = 0
            r9 = 1
            if (r7 != r9) goto L_0x01a5
            int r2 = r21.mo75c()
            if (r2 != r5) goto L_0x01a4
            bl3.r r2 = bl3.C39818r.f106831a
            android.content.Context r3 = r1.f173499A
            java.lang.String r4 = "holder.context"
            gy3.C87412m.m108593f(r3, r4)
            bl3.r$a r2 = r2.mo62443b(r3)
            java.lang.Class<rs1.da> r3 = rs1.C13194da.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            rs1.da r2 = (rs1.C13194da) r2
            r2.getClass()
            r3 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r3 = r1.mo85812D(r3)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r3 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r3
            if (r3 == 0) goto L_0x01a4
            gr1.o2 r3 = r3.getVideoView()
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            r5 = 0
            if (r4 == 0) goto L_0x009a
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r3
            goto L_0x009b
        L_0x009a:
            r3 = r5
        L_0x009b:
            if (r3 == 0) goto L_0x01a4
            r4 = 2131305309(0x7f09235d, float:1.8228785E38)
            android.view.View r4 = r1.mo85812D(r4)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r4 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r4
            if (r4 == 0) goto L_0x00b5
            boolean r7 = r4.f17507V
            if (r7 == 0) goto L_0x00b5
            boolean r7 = r4.f17492K
            if (r7 != 0) goto L_0x00b5
            java.lang.String r7 = "LongPress"
            com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout.m4082G(r4, r7, r8, r6, r5)
        L_0x00b5:
            androidx.recyclerview.widget.RecyclerView r4 = r19.mo85811C()
            if (r4 == 0) goto L_0x00c0
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r4.getLayoutManager()
            goto L_0x00c1
        L_0x00c0:
            r4 = r5
        L_0x00c1:
            boolean r6 = r4 instanceof com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager
            if (r6 == 0) goto L_0x00c8
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r4 = (com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager) r4
            goto L_0x00c9
        L_0x00c8:
            r4 = r5
        L_0x00c9:
            if (r4 == 0) goto L_0x00cd
            r4.f162357A = r8
        L_0x00cd:
            android.app.Activity r4 = r2.getContext()
            boolean r4 = r4 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI
            if (r4 == 0) goto L_0x00e8
            android.app.Activity r4 = r2.getContext()
            r6 = 2131316254(0x7f094e1e, float:1.8250984E38)
            android.view.View r4 = r4.findViewById(r6)
            com.tencent.mm.plugin.finder.view.FinderViewPager r4 = (com.tencent.p014mm.plugin.finder.view.FinderViewPager) r4
            if (r4 != 0) goto L_0x00e5
            goto L_0x00e8
        L_0x00e5:
            r4.setEnableViewPagerScroll(r8)
        L_0x00e8:
            float r4 = r3.getPlaySpeedRatio()
            r2.f37526q = r4
            r2.f37525p = r1
            long r6 = java.lang.System.currentTimeMillis()
            r2.f37528s = r6
            r4 = r22
            r2.f37529t = r4
            float r4 = r3.getPlaySpeedRatio()
            r6 = 1073741824(0x40000000, float:2.0)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x010a
            r4 = 1077936128(0x40400000, float:3.0)
            r3.setPlaySpeed(r4)
            goto L_0x010d
        L_0x010a:
            r3.setPlaySpeed(r6)
        L_0x010d:
            android.view.View r3 = r2.mo12690i3()
            android.view.ViewParent r3 = r3.getParent()
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x011c
            r5 = r3
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        L_0x011c:
            if (r5 == 0) goto L_0x0125
            android.view.View r3 = r2.mo12690i3()
            r5.removeView(r3)
        L_0x0125:
            android.view.View r1 = r1.f44854d
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r1, r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r3 = r2.mo12690i3()
            r4 = -1
            android.app.Activity r5 = r2.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131165292(0x7f07006c, float:1.7944797E38)
            int r5 = r5.getDimensionPixelOffset(r6)
            r1.addView(r3, r4, r5)
            r2.mo12691l3(r9)
            android.view.View r1 = r2.mo12687e3()
            if (r1 != 0) goto L_0x014f
            goto L_0x0193
        L_0x014f:
            r3 = 8
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.mo10233c(r3)
            java.lang.Object[] r11 = r4.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC"
            java.lang.String r13 = "triggerSpeedPlay"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/MotionEvent;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r1
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r3 = r4.mo10231a(r8)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC"
            java.lang.String r12 = "triggerSpeedPlay"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/MotionEvent;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x0193:
            rx3.g r1 = r2.f37524o
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.os.Vibrator r1 = (android.os.Vibrator) r1
            if (r1 == 0) goto L_0x01a4
            r2 = 10
            r1.vibrate(r2)
        L_0x01a4:
            return
        L_0x01a5:
            r4.getClass()
            pe1.c<java.lang.Integer> r4 = up1.C37521f.f99515s8
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 != r9) goto L_0x0207
            kf1.v1 r4 = r0.f12564e
            boolean r4 = r4.mo2497u0()
            if (r4 != 0) goto L_0x0207
            qo3.n r4 = new qo3.n
            android.content.Context r5 = r1.f173499A
            r4.<init>((android.content.Context) r5, (int) r9, (boolean) r8)
            kf1.v1 r5 = r0.f12564e
            nj3.m0 r5 = r5.mo2570B5(r3, r4)
            r4.f225771i = r5
            kf1.v1 r5 = r0.f12564e
            nj3.p0 r5 = r5.mo2573X2(r3, r1)
            r4.f225782p = r5
            java.lang.Class<dp1.y0> r5 = dp1.C58417y0.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            dp1.y0 r5 = (dp1.C58417y0) r5
            long r9 = r21.getItemId()
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r21.mo3513o()
            r5.wx0(r1, r9, r7)
            nj3.e0 r5 = new nj3.e0
            android.content.Context r1 = r1.f173499A
            r5.<init>(r1)
            kf1.v1 r1 = r0.f12564e
            nj3.m0 r1 = r1.mo2570B5(r3, r4)
            r1.onCreateMMMenu(r5)
            java.util.List<android.view.MenuItem> r1 = r5.f224704d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r1 != 0) goto L_0x020e
            r2.performHapticFeedback(r8, r6)
            r4.mo107573q()
            goto L_0x020e
        L_0x0207:
            r2.performHapticFeedback(r8, r6)
            r4 = 3
            r0.mo2272M(r1, r3, r2, r4)
        L_0x020e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2282S(jq3.o, android.view.View, com.tencent.mm.plugin.finder.model.BaseFinderFeed, android.view.MotionEvent):void");
    }

    /* renamed from: T */
    public void mo2283T(T t, C60905o oVar) {
        C87412m.m108594g(t, "item");
        C87412m.m108594g(oVar, "holder");
        Log.m105924i("Finder.FeedFullConvert", "[onPostFinished] feed=" + C61926c.m72691p(t.getItemId()));
        mo2303l(oVar);
        mo2323v0(oVar, t);
        mo2265I0(oVar, t);
        FinderFullSeekBarLayout finderFullSeekBarLayout = (FinderFullSeekBarLayout) oVar.mo85812D(C0966R.C0970id.eh4);
        View D = oVar.mo85812D(C0966R.C0970id.e47);
        if (D != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "onPostFinished", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "onPostFinished", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View D2 = oVar.mo85812D(C0966R.C0970id.edb);
        if (D2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(D2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "onPostFinished", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(D2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "onPostFinished", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        FinderFullSeekBarLayout finderFullSeekBarLayout2 = (FinderFullSeekBarLayout) oVar.mo85812D(C0966R.C0970id.eh4);
        if (finderFullSeekBarLayout2 != null) {
            finderFullSeekBarLayout2.mo4236E(this.f12564e.mo2497u0(), t);
        }
        C58784w3.f168295a.getClass();
        C66785b bVar = C66785b.f191882e;
        C54446b a = C66783a.C66784a.m78798a(bVar, bVar.mo90662O5(), false, 2, (Object) null);
        if (!(((a != null ? a.field_extFlag : 0) & 32) != 0) && !C58739j4.f168176a.mo83688Q(t.mo3507l())) {
            C37521f.f99374d.getClass();
            if (C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_SHOW_SELF_FEED_LIKE_TIPS_TIMES_INT, 0) < 3) {
                View C = mo2252C(oVar);
                TextView textView = (TextView) C.findViewById(C0966R.C0970id.e6w);
                if (textView != null) {
                    textView.setText(C0966R.string.fny);
                }
                C.animate().setDuration(300).alpha(1.0f).start();
                C.postDelayed(new C14644u1(C), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            }
        }
    }

    /* renamed from: U */
    public void mo2284U(long j) {
    }

    /* renamed from: V */
    public void mo2285V(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) oVar.f173503E;
        StringBuilder sb = new StringBuilder();
        sb.append("[onTenSecEnjoy] ");
        C58969q l = baseFinderFeed.mo3507l();
        sb.append(l != null ? l.getNickname() : null);
        sb.append(" position=");
        sb.append(oVar.mo17363j());
        sb.append(" feedId=");
        sb.append(C61926c.m72691p(baseFinderFeed.getItemId()));
        Log.m105924i("Finder.FeedFullConvert", sb.toString());
        if (!baseFinderFeed.mo3516q()) {
            baseFinderFeed.mo3494b0(true);
            m2151u(this, oVar, baseFinderFeed, false, 4, (Object) null);
            mo2327x0(baseFinderFeed, oVar);
        }
    }

    /* renamed from: W */
    public void mo2286W(C60905o oVar, int i, int i2, boolean z) {
        C87412m.m108594g(oVar, "holder");
        Object tag = oVar.f44854d.getTag(C0966R.C0970id.mza);
        if (tag != null) {
            if (!(tag instanceof Boolean)) {
                tag = null;
            }
            if (tag != null && !((Boolean) tag).booleanValue()) {
                Log.m105924i("Finder.FeedFullConvert", "[onUnFocusFeedCenter] has been un focus , return ");
                return;
            }
        }
        oVar.f44854d.setTag(C0966R.C0970id.mza, Boolean.FALSE);
        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) oVar.f173503E;
        FinderFullSeekBarLayout finderFullSeekBarLayout = (FinderFullSeekBarLayout) oVar.mo85812D(C0966R.C0970id.eh4);
        if (finderFullSeekBarLayout != null) {
            boolean z2 = finderFullSeekBarLayout.f17499R;
            Log.m105924i("Finder.FeedFullConvert", "[onUnFocusFeedCenter] tabType=" + this.f12566g + " pos=" + i + " isInSeekMode=" + finderFullSeekBarLayout.f17507V + " isPlaying=" + z2 + " id=" + C61926c.m72691p(baseFinderFeed.getItemId()));
            if (finderFullSeekBarLayout.f17507V && z2) {
                finderFullSeekBarLayout.mo4259i("onUnFocusFeedCenter");
            }
            finderFullSeekBarLayout.mo4295t();
        }
        View D = oVar.mo85812D(C0966R.C0970id.e6y);
        if (D != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = D;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "onUnFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "onUnFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z) {
            mo2306m0(oVar);
        }
    }

    /* renamed from: X */
    public void mo2287X(C58259c.C58260a aVar) {
        C87412m.m108594g(aVar, "ev");
    }

    /* JADX WARNING: Removed duplicated region for block: B:202:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x07dc  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x080a  */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2288Y(df1.C58259c.C58260a r40) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            java.lang.Class<rs1.t3> r2 = rs1.C13457t3.class
            java.lang.String r3 = "ev"
            gy3.C87412m.m108594g(r1, r3)
            androidx.recyclerview.widget.RecyclerView r3 = r0.f12554A
            if (r3 == 0) goto L_0x0014
            androidx.recyclerview.widget.RecyclerView$e r3 = r3.getAdapter()
            goto L_0x0015
        L_0x0014:
            r3 = 0
        L_0x0015:
            boolean r5 = r3 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r5 == 0) goto L_0x001d
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r3 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r3
            r5 = r3
            goto L_0x001e
        L_0x001d:
            r5 = 0
        L_0x001e:
            if (r5 != 0) goto L_0x0021
            return
        L_0x0021:
            long r6 = r1.f166817h
            r9 = 2
            r10 = 0
            r8 = 0
            androidx.recyclerview.widget.RecyclerView$z r3 = jq3.C60898l.m71330b6(r5, r6, r8, r9, r10)
            jq3.o r3 = (jq3.C60905o) r3
            r7 = 1
            if (r3 == 0) goto L_0x0811
            java.lang.Object r9 = r3.f173503E
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r9 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r9
            if (r9 == 0) goto L_0x0811
            gy3.f0 r10 = new gy3.f0
            r10.<init>()
            r11 = 2131305803(0x7f09254b, float:1.8229787E38)
            android.view.View r11 = r3.mo85812D(r11)
            r10.f27484d = r11
            up1.f r11 = up1.C37521f.f99374d
            r11.getClass()
            pe1.c<java.lang.Integer> r11 = up1.C37521f.f99494q5
            java.lang.Object r11 = r11.mo60266n()
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r12 = 10
            r13 = 0
            r14 = 8
            if (r11 != r7) goto L_0x01fb
            kf1.v1 r11 = r0.f12564e
            boolean r15 = r11 instanceof com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter
            if (r15 == 0) goto L_0x0064
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r11 = (com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter) r11
            goto L_0x0065
        L_0x0064:
            r11 = 0
        L_0x0065:
            if (r11 == 0) goto L_0x0085
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r11 = r11.f13267h
            if (r11 == 0) goto L_0x0085
            bl3.r r15 = bl3.C39818r.f106831a
            bl3.r$a r11 = r15.mo62445d(r11)
            androidx.lifecycle.i0 r11 = r11.mo75002a(r2)
            rs1.t3 r11 = (rs1.C13457t3) r11
            android.view.View r11 = r11.mo12882c3()
            if (r11 == 0) goto L_0x0085
            int r11 = r11.getVisibility()
            if (r11 != 0) goto L_0x0085
            r11 = 1
            goto L_0x0086
        L_0x0085:
            r11 = 0
        L_0x0086:
            te3.rl1 r15 = r9.mo3470D()
            if (r15 == 0) goto L_0x0092
            int r15 = r15.f141000f
            if (r15 != r12) goto L_0x0092
            r15 = 1
            goto L_0x0093
        L_0x0092:
            r15 = 0
        L_0x0093:
            if (r15 == 0) goto L_0x0183
            if (r11 != 0) goto L_0x0183
            T r11 = r10.f27484d
            if (r11 != 0) goto L_0x00ae
            r11 = 2131296282(0x7f09001a, float:1.8210476E38)
            android.view.View r11 = r3.mo85812D(r11)
            android.view.ViewStub r11 = (android.view.ViewStub) r11
            if (r11 == 0) goto L_0x00ab
            android.view.View r11 = r11.inflate()
            goto L_0x00ac
        L_0x00ab:
            r11 = 0
        L_0x00ac:
            r10.f27484d = r11
        L_0x00ae:
            te3.rl1 r11 = r9.mo3470D()
            if (r11 == 0) goto L_0x00de
            java.lang.String r11 = r11.f140999e
            if (r11 == 0) goto L_0x00de
            int r15 = r11.length()
            if (r15 <= 0) goto L_0x00c0
            r15 = 1
            goto L_0x00c1
        L_0x00c0:
            r15 = 0
        L_0x00c1:
            if (r15 == 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r11 = 0
        L_0x00c5:
            if (r11 == 0) goto L_0x00de
            T r15 = r10.f27484d
            android.view.View r15 = (android.view.View) r15
            if (r15 == 0) goto L_0x00d7
            r6 = 2131305804(0x7f09254c, float:1.822979E38)
            android.view.View r6 = r15.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            goto L_0x00d8
        L_0x00d7:
            r6 = 0
        L_0x00d8:
            if (r6 != 0) goto L_0x00db
            goto L_0x00de
        L_0x00db:
            r6.setText(r11)
        L_0x00de:
            T r6 = r10.f27484d
            android.view.View r6 = (android.view.View) r6
            if (r6 != 0) goto L_0x00e5
            goto L_0x0126
        L_0x00e5:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r15 = k20.C60958c.f173611a
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            r11.mo10233c(r15)
            java.lang.Object[] r17 = r11.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r19 = "refreshGuideHotLayout"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r6
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r11 = r11.mo10231a(r8)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r6.setVisibility(r11)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r18 = "refreshGuideHotLayout"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x0126:
            T r6 = r10.f27484d
            android.view.View r6 = (android.view.View) r6
            r6.setTranslationX(r13)
            boolean r6 = r9.mo3476J()
            if (r6 == 0) goto L_0x0135
            goto L_0x0243
        L_0x0135:
            T r6 = r10.f27484d
            android.view.View r6 = (android.view.View) r6
            if (r6 == 0) goto L_0x0140
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0141
        L_0x0140:
            r6 = 0
        L_0x0141:
            boolean r11 = r6 instanceof android.view.View
            if (r11 == 0) goto L_0x0148
            android.view.View r6 = (android.view.View) r6
            goto L_0x0149
        L_0x0148:
            r6 = 0
        L_0x0149:
            if (r6 == 0) goto L_0x0161
            T r11 = r10.f27484d
            android.view.View r11 = (android.view.View) r11
            android.content.Context r6 = r6.getContext()
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r6 = r6.widthPixels
            float r6 = (float) r6
            r11.setTranslationX(r6)
        L_0x0161:
            ve1.n1 r6 = new ve1.n1
            r6.<init>(r9, r10)
            T r11 = r10.f27484d
            android.view.View r11 = (android.view.View) r11
            int r11 = r11.getHeight()
            if (r11 > 0) goto L_0x017e
            T r10 = r10.f27484d
            android.view.View r10 = (android.view.View) r10
            ve1.m1 r11 = new ve1.m1
            r11.<init>(r6)
            r10.post(r11)
            goto L_0x0243
        L_0x017e:
            r6.invoke()
            goto L_0x0243
        L_0x0183:
            T r6 = r10.f27484d
            android.view.View r6 = (android.view.View) r6
            if (r6 == 0) goto L_0x0192
            android.view.ViewPropertyAnimator r6 = r6.animate()
            if (r6 == 0) goto L_0x0192
            r6.cancel()
        L_0x0192:
            T r6 = r10.f27484d
            android.view.View r6 = (android.view.View) r6
            if (r6 == 0) goto L_0x019d
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x019e
        L_0x019d:
            r6 = 0
        L_0x019e:
            boolean r11 = r6 instanceof android.view.View
            if (r11 == 0) goto L_0x01a5
            android.view.View r6 = (android.view.View) r6
            goto L_0x01a6
        L_0x01a5:
            r6 = 0
        L_0x01a6:
            if (r6 == 0) goto L_0x01b1
            android.view.ViewPropertyAnimator r6 = r6.animate()
            if (r6 == 0) goto L_0x01b1
            r6.cancel()
        L_0x01b1:
            T r6 = r10.f27484d
            android.view.View r6 = (android.view.View) r6
            if (r6 != 0) goto L_0x01b9
            goto L_0x0243
        L_0x01b9:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r10.mo10233c(r11)
            java.lang.Object[] r17 = r10.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r19 = "refreshGuideHotLayout"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r6
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r10 = r10.mo10231a(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r6.setVisibility(r10)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r18 = "refreshGuideHotLayout"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0243
        L_0x01fb:
            T r6 = r10.f27484d
            android.view.View r6 = (android.view.View) r6
            if (r6 != 0) goto L_0x0202
            goto L_0x0243
        L_0x0202:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r10.mo10233c(r11)
            java.lang.Object[] r17 = r10.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r19 = "refreshGuideHotLayout"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r6
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r10 = r10.mo10231a(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r6.setVisibility(r10)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r18 = "refreshGuideHotLayout"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x0243:
            kf1.v1 r6 = r0.f12564e
            boolean r10 = r6 instanceof com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter
            if (r10 == 0) goto L_0x024c
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r6 = (com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter) r6
            goto L_0x024d
        L_0x024c:
            r6 = 0
        L_0x024d:
            if (r6 == 0) goto L_0x07c8
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r6 = r6.f13267h
            if (r6 == 0) goto L_0x07c8
            int r10 = r6.f17334o
            if (r10 != r7) goto L_0x07c8
            bl3.r r10 = bl3.C39818r.f106831a
            bl3.r$a r6 = r10.mo62445d(r6)
            androidx.lifecycle.i0 r2 = r6.mo75002a(r2)
            rs1.t3 r2 = (rs1.C13457t3) r2
            r2.getClass()
            java.lang.Class<pl1.s0> r6 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r11 = ht1.C60200t1.class
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC> r15 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC.class
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r12 = "refreshSlideLeftTipsLayout， "
            r4.append(r12)
            te3.rl1 r12 = r9.mo3470D()
            if (r12 == 0) goto L_0x0283
            int r12 = r12.f141000f
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0284
        L_0x0283:
            r12 = 0
        L_0x0284:
            r4.append(r12)
            java.lang.String r12 = ", "
            r4.append(r12)
            boolean r13 = r2.f38154g
            r4.append(r13)
            r4.append(r12)
            boolean r13 = r2.f38155h
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            java.lang.String r13 = "FinderFriendsLeftSlideGuideUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r4)
            boolean r4 = r2.f38154g
            if (r4 == 0) goto L_0x02a8
            goto L_0x07c8
        L_0x02a8:
            boolean r4 = r2.f38155h
            if (r4 == 0) goto L_0x02b0
            r2.f38155h = r8
            goto L_0x07c8
        L_0x02b0:
            androidx.appcompat.app.AppCompatActivity r4 = r2.getActivity()
            bl3.r$a r4 = r10.mo62444c(r4)
            androidx.lifecycle.i0 r4 = r4.mo75002a(r15)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r4 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC) r4
            int r4 = r4.mo5128d3()
            if (r4 != r7) goto L_0x02c6
            r4 = 1
            goto L_0x02c7
        L_0x02c6:
            r4 = 0
        L_0x02c7:
            f40.o r19 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r14 = r19.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USREINFO_FINDER_SLIDE_LEFT_TIPS_COUNT_INT_SYNC
            int r5 = r14.mo119689j(r5, r8)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r8 = "shouldShowGuide，"
            r14.append(r8)
            pe1.c<java.lang.Integer> r8 = up1.C37521f.f99503r5
            java.lang.Object r22 = r8.mo60266n()
            java.lang.Number r22 = (java.lang.Number) r22
            int r7 = r22.intValue()
            r14.append(r7)
            r14.append(r12)
            r14.append(r4)
            r14.append(r12)
            r14.append(r5)
            java.lang.String r7 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r7)
            java.lang.Object r7 = r8.mo60266n()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r8 = 1
            if (r7 != r8) goto L_0x0316
            if (r4 == 0) goto L_0x0316
            r4 = 3
            if (r5 >= r4) goto L_0x0316
            r4 = 1
            goto L_0x0317
        L_0x0316:
            r4 = 0
        L_0x0317:
            if (r4 == 0) goto L_0x077a
            te3.rl1 r4 = r9.mo3470D()
            if (r4 == 0) goto L_0x0727
            te3.sl1 r5 = r4.f141002h
            if (r5 == 0) goto L_0x032a
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r5.f141585d
            if (r7 == 0) goto L_0x032a
            long r7 = r7.f164794id
            goto L_0x032c
        L_0x032a:
            r7 = 0
        L_0x032c:
            int r12 = r4.f141000f
            r14 = 11
            if (r12 != r14) goto L_0x06d7
            long r24 = rs1.C13457t3.f38150n
            int r12 = (r24 > r7 ? 1 : (r24 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x06d7
            rs1.C13457t3.f38149j = r5
            rs1.C13457t3.f38150n = r7
            android.view.View r5 = r2.mo12882c3()
            if (r5 == 0) goto L_0x034c
            r7 = 2131315856(0x7f094c90, float:1.8250177E38)
            android.view.View r5 = r5.findViewById(r7)
            android.widget.TextView r5 = (android.widget.TextView) r5
            goto L_0x034d
        L_0x034c:
            r5 = 0
        L_0x034d:
            android.view.View r7 = r2.mo12882c3()
            if (r7 == 0) goto L_0x035d
            r8 = 2131306820(0x7f092944, float:1.823185E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            goto L_0x035e
        L_0x035d:
            r7 = 0
        L_0x035e:
            java.lang.String r8 = r4.f140999e
            if (r8 == 0) goto L_0x036b
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0369
            goto L_0x036b
        L_0x0369:
            r8 = 0
            goto L_0x036c
        L_0x036b:
            r8 = 1
        L_0x036c:
            if (r8 != 0) goto L_0x0376
            if (r5 != 0) goto L_0x0371
            goto L_0x0376
        L_0x0371:
            java.lang.String r8 = r4.f140999e
            r5.setText(r8)
        L_0x0376:
            com.tencent.mm.plugin.finder.storage.FinderItem$a r5 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
            te3.sl1 r8 = r4.f141002h
            if (r8 == 0) goto L_0x037f
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.f141585d
            goto L_0x0380
        L_0x037f:
            r8 = 0
        L_0x0380:
            gy3.C87412m.m108591d(r8)
            r12 = 512(0x200, float:7.175E-43)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo79056a(r8, r12)
            java.util.LinkedList r8 = r5.getMediaList()
            int r12 = r8.size()
            if (r12 <= 0) goto L_0x03d2
            java.lang.Object r8 = sx3.C110818d0.m150916N(r8)
            r25 = r8
            te3.rq2 r25 = (te3.C64689rq2) r25
            if (r25 == 0) goto L_0x03d2
            pl1.b0 r8 = new pl1.b0
            up1.y r26 = up1.C27696y.THUMB_IMAGE
            r27 = 0
            r28 = 0
            r29 = 12
            r30 = 0
            r24 = r8
            r24.<init>(r25, r26, r27, r28, r29, r30)
            bl3.r$a r12 = r10.mo62446e(r11)
            bl3.c r12 = r12.mo62447c(r6)
            pl1.s0 r12 = (pl1.C11990s0) r12
            k60.d r12 = r12.mo11871f2()
            gy3.C87412m.m108591d(r7)
            pl1.e0$a r14 = pl1.C11978e0.C11979a.TIMELINE
            bl3.r$a r11 = r10.mo62446e(r11)
            bl3.c r6 = r11.mo62447c(r6)
            pl1.s0 r6 = (pl1.C11990s0) r6
            n60.f r6 = r6.mo11867O2(r14)
            r12.mo85957c(r8, r7, r6)
        L_0x03d2:
            android.view.View r6 = r2.mo12882c3()
            if (r6 == 0) goto L_0x0727
            rs1.u3 r7 = new rs1.u3
            r7.<init>(r2)
            r6.setOnClickListener(r7)
            int r7 = r6.getVisibility()
            r8 = 8
            if (r7 != r8) goto L_0x06d2
            r7 = 1
            r2.f38154g = r7
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r8 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r7.mo10233c(r11)
            java.lang.Object[] r25 = r7.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC"
            java.lang.String r27 = "refreshSlideLeftTipsLayout"
            java.lang.String r28 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r6
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r8 = 0
            java.lang.Object r7 = r7.mo10231a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.setVisibility(r7)
            java.lang.String r25 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC"
            java.lang.String r26 = "refreshSlideLeftTipsLayout"
            java.lang.String r27 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            k20.a r7 = new k20.a
            r7.<init>()
            r8 = 0
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r7.mo10233c(r8)
            java.lang.Object[] r25 = r7.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC"
            java.lang.String r27 = "refreshSlideLeftTipsLayout"
            java.lang.String r28 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setAlpha"
            java.lang.String r31 = "(F)V"
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r8 = 0
            java.lang.Object r7 = r7.mo10231a(r8)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r6.setAlpha(r7)
            java.lang.String r25 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC"
            java.lang.String r26 = "refreshSlideLeftTipsLayout"
            java.lang.String r27 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setAlpha"
            java.lang.String r30 = "(F)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.view.ViewPropertyAnimator r6 = r6.animate()
            r7 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r6 = r6.alpha(r7)
            android.view.animation.DecelerateInterpolator r7 = new android.view.animation.DecelerateInterpolator
            r7.<init>()
            android.view.ViewPropertyAnimator r6 = r6.setInterpolator(r7)
            r7 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r6 = r6.setDuration(r7)
            r6.start()
            te3.sl1 r4 = r4.f141002h
            if (r4 == 0) goto L_0x0490
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.f141585d
            goto L_0x0491
        L_0x0490:
            r4 = 0
        L_0x0491:
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderTimelineUIC> r6 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC.class
            androidx.appcompat.app.AppCompatActivity r7 = r2.getActivity()
            bl3.r$a r7 = r10.mo62444c(r7)
            java.lang.Class<rs1.s8> r8 = rs1.C13442s8.class
            androidx.lifecycle.i0 r7 = r7.mo75002a(r8)
            rs1.s8 r7 = (rs1.C13442s8) r7
            te3.hj1 r7 = r7.mo12861q3()
            androidx.appcompat.app.AppCompatActivity r8 = r2.getActivity()
            bl3.r$a r8 = r10.mo62444c(r8)
            androidx.lifecycle.i0 r8 = r8.mo75002a(r15)
            java.lang.String r10 = "UICProvider.of(activity)…inderHomeUIC::class.java)"
            gy3.C87412m.m108593f(r8, r10)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r8 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC) r8
            int r10 = r2.f38153f
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r8 = r8.mo5129e3(r10)
            if (r4 == 0) goto L_0x069d
            wp1.f$a r10 = wp1.C15585f.f42211a
            java.util.List r11 = sx3.C26236u.m33719b(r4)
            er1.w3 r12 = er1.C58784w3.f168295a
            int r14 = r2.f38153f
            int r12 = r12.mo83887M1(r14)
            java.util.List r7 = r10.mo14343f(r11, r12, r7)
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = sx3.C36907w.m41090l(r7, r11)
            r10.<init>(r11)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x04e5:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x04fb
            java.lang.Object r11 = r7.next()
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r11
            wp1.f$a r12 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = r12.mo14348k(r11)
            r10.add(r11)
            goto L_0x04e5
        L_0x04fb:
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>(r10)
            if (r8 == 0) goto L_0x069d
            bl3.r r10 = bl3.C39818r.f106831a
            bl3.r$a r11 = r10.mo62445d(r8)
            bl3.t r11 = r11.mo62449e(r6)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTimelineUIC r11 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC) r11
            java.lang.String r12 = "presenter"
            if (r11 == 0) goto L_0x0528
            kf1.m9 r11 = r11.f18785d
            if (r11 == 0) goto L_0x0523
            boolean r14 = r11 instanceof com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter
            if (r14 == 0) goto L_0x051d
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r11 = (com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter) r11
            goto L_0x051e
        L_0x051d:
            r11 = 0
        L_0x051e:
            if (r11 == 0) goto L_0x0528
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r11 = r11.f13285z
            goto L_0x0529
        L_0x0523:
            gy3.C87412m.m108603p(r12)
            r1 = 0
            throw r1
        L_0x0528:
            r11 = 0
        L_0x0529:
            boolean r14 = r7.isEmpty()
            r15 = 1
            r14 = r14 ^ r15
            if (r14 == 0) goto L_0x0686
            r14 = 0
            java.lang.Object r15 = r7.get(r14)
            java.lang.String r14 = "rvFeedList[0]"
            gy3.C87412m.m108593f(r15, r14)
            cm1.i2 r15 = (cm1.C0740i2) r15
            if (r11 == 0) goto L_0x0686
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r14 = r11.getDataListJustForAdapter()
            if (r14 == 0) goto L_0x0686
            r17 = r3
            r3 = 1
            r2.f38156i = r3
            boolean r18 = r14.isEmpty()
            r18 = r18 ^ 1
            if (r18 == 0) goto L_0x05bf
            r3 = 0
            java.lang.Object r18 = r14.get(r3)
            cm1.i2 r18 = (cm1.C0740i2) r18
            long r21 = r15.getItemId()
            long r24 = r18.getItemId()
            int r18 = (r21 > r24 ? 1 : (r21 == r24 ? 0 : -1))
            if (r18 == 0) goto L_0x05ca
            r14.add(r3, r15)
            tf1.g r14 = r11.dispatcher()
            r14.mo13376a()
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r11 = r11.f13847j
            if (r11 == 0) goto L_0x05ca
            java.lang.Object r11 = r11.get()
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            if (r11 == 0) goto L_0x05ca
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r15 = k20.C60958c.f173611a
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            r14.mo10233c(r15)
            java.lang.Object[] r25 = r14.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC"
            java.lang.String r27 = "insertItemToHot"
            java.lang.String r28 = "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V"
            java.lang.String r29 = "Undefined"
            java.lang.String r30 = "smoothScrollToPosition"
            java.lang.String r31 = "(I)V"
            r24 = r11
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r3 = 0
            java.lang.Object r14 = r14.mo10231a(r3)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r3 = r14.intValue()
            r11.mo17149t1(r3)
            java.lang.String r25 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC"
            java.lang.String r26 = "insertItemToHot"
            java.lang.String r27 = "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V"
            java.lang.String r28 = "Undefined"
            java.lang.String r29 = "smoothScrollToPosition"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            goto L_0x05ca
        L_0x05bf:
            r3 = 0
            r14.add(r3, r15)
            tf1.g r3 = r11.dispatcher()
            r3.mo13376a()
        L_0x05ca:
            com.tencent.mm.plugin.finder.storage.FinderItem$a r3 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
            er1.w3 r11 = er1.C58784w3.f168295a
            int r14 = r2.f38153f
            int r14 = r11.mo83887M1(r14)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo79056a(r4, r14)
            wp1.f$a r4 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r4.mo14348k(r3)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            com.tencent.mm.plugin.finder.storage.FinderItem r14 = r3.mo3513o()
            java.util.LinkedList r14 = r14.getMediaList()
            r4.addAll(r14)
            rx3.l r14 = new rx3.l
            java.util.List r4 = sx3.C110818d0.m150900B0(r4)
            r14.<init>(r3, r4)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r4.add(r14)
            java.lang.String r14 = "startPreLoadMedia"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r14)
            rx3.g r14 = r2.f38152e
            rx3.n r14 = (rx3.C36570n) r14
            java.lang.Object r14 = r14.getValue()
            eo1.b r14 = (eo1.C58638b) r14
            e03.b r15 = new e03.b
            r25 = 1
            r26 = -1
            int r1 = r2.f38153f
            int r27 = r11.mo83890O(r1)
            r28 = 5
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 112(0x70, float:1.57E-43)
            r34 = 0
            r24 = r15
            r24.<init>(r25, r26, r27, r28, r29, r31, r32, r33, r34)
            com.tencent.mm.plugin.finder.storage.FeedData$a r1 = com.tencent.p014mm.plugin.finder.storage.FeedData.Companion
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r1.mo78884b(r3)
            java.util.List r3 = sx3.C110818d0.m150900B0(r4)
            r4 = 0
            r14.mo83526h(r15, r1, r3, r4)
            bl3.r$a r1 = r10.mo62445d(r8)
            bl3.t r1 = r1.mo62449e(r6)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTimelineUIC r1 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC) r1
            if (r1 == 0) goto L_0x0688
            kf1.m9 r1 = r1.f18785d
            if (r1 == 0) goto L_0x0681
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = (com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter) r1
            com.tencent.mm.plugin.finder.video.FinderVideoCore r1 = r1.mo2578p1()
            if (r1 == 0) goto L_0x0688
            hr1.k r1 = r1.f161828n
            if (r1 == 0) goto L_0x0688
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r8.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            java.lang.String r4 = "#onAttach"
            r3.append(r4)
            java.lang.String r25 = r3.toString()
            r26 = 0
            r27 = 0
            r28 = 4
            r29 = 0
            r24 = r1
            hr1.C8730k.C8731a.m8556a(r24, r25, r26, r27, r28, r29)
            goto L_0x0688
        L_0x0681:
            gy3.C87412m.m108603p(r12)
            r1 = 0
            throw r1
        L_0x0686:
            r17 = r3
        L_0x0688:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "insertItemToHot， "
            r1.append(r3)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            goto L_0x069f
        L_0x069d:
            r17 = r3
        L_0x069f:
            long r3 = r5.getId()
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r9.mo3513o()
            long r5 = r1.getId()
            java.lang.Class<dp1.y0> r1 = dp1.C58417y0.class
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 2
            java.lang.Object[] r10 = new java.lang.Object[r8]
            di3.d r8 = di3.C86312j.m106911c(r1)
            dp1.y0 r8 = (dp1.C58417y0) r8
            java.lang.String r3 = r8.xx0(r3)
            r4 = 0
            r10[r4] = r3
            di3.d r1 = di3.C86312j.m106911c(r1)
            dp1.y0 r1 = (dp1.C58417y0) r1
            java.lang.String r1 = r1.xx0(r5)
            r3 = 1
            r10[r3] = r1
            r1 = 23179(0x5a8b, float:3.248E-41)
            r7.mo160131h(r1, r10)
            goto L_0x06d4
        L_0x06d2:
            r17 = r3
        L_0x06d4:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x072a
        L_0x06d7:
            r17 = r3
            android.view.View r1 = r2.mo12882c3()
            if (r1 != 0) goto L_0x06e0
            goto L_0x0724
        L_0x06e0:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r4 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r5)
            java.lang.Object[] r25 = r3.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC"
            java.lang.String r27 = "refreshSlideLeftTipsLayout"
            java.lang.String r28 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r1
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC"
            java.lang.String r26 = "refreshSlideLeftTipsLayout"
            java.lang.String r27 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
        L_0x0724:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x072a
        L_0x0727:
            r17 = r3
            r1 = 0
        L_0x072a:
            r4 = r1
            if (r4 != 0) goto L_0x07ca
            android.view.View r1 = r2.mo12882c3()
            if (r1 != 0) goto L_0x0735
            goto L_0x07ca
        L_0x0735:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r3)
            java.lang.Object[] r25 = r2.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC"
            java.lang.String r27 = "refreshSlideLeftTipsLayout"
            java.lang.String r28 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r1
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r25 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC"
            java.lang.String r26 = "refreshSlideLeftTipsLayout"
            java.lang.String r27 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            goto L_0x07ca
        L_0x077a:
            r17 = r3
            android.view.View r2 = r2.mo12882c3()
            if (r2 != 0) goto L_0x0783
            goto L_0x07ca
        L_0x0783:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.mo10233c(r3)
            java.lang.Object[] r32 = r1.mo10232b()
            java.lang.String r33 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC"
            java.lang.String r34 = "refreshSlideLeftTipsLayout"
            java.lang.String r35 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r36 = "android/view/View_EXEC_"
            java.lang.String r37 = "setVisibility"
            java.lang.String r38 = "(I)V"
            r31 = r2
            j20.C117292a.m165358d(r31, r32, r33, r34, r35, r36, r37, r38)
            r3 = 0
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.setVisibility(r1)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC"
            java.lang.String r4 = "refreshSlideLeftTipsLayout"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x07ca
        L_0x07c8:
            r17 = r3
        L_0x07ca:
            rx3.g r1 = r0.f12579w
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = 16
            if (r1 != r2) goto L_0x07f4
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            l31.e r1 = (l31.C61212e) r1
            kf1.v1 r2 = r0.f12564e
            com.tencent.mm.ui.MMActivity r2 = r2.getActivity()
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$v0 r3 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$v0
            r4 = r40
            r3.<init>(r4)
            r1.E60(r2, r3)
        L_0x07f4:
            bl3.r r1 = bl3.C39818r.f106831a
            kf1.v1 r2 = r0.f12564e
            com.tencent.mm.ui.MMActivity r2 = r2.getActivity()
            bl3.r$a r1 = r1.mo62444c(r2)
            java.lang.Class<zn1.r> r2 = zn1.C16336r.class
            bl3.t r1 = r1.mo62449e(r2)
            zn1.r r1 = (zn1.C16336r) r1
            if (r1 == 0) goto L_0x0811
            kf1.v1 r2 = r0.f12564e
            r3 = r17
            r1.mo14820c3(r2, r3, r9)
        L_0x0811:
            kf1.v1 r1 = r0.f12564e
            com.tencent.mm.ui.MMActivity r1 = r1.getActivity()
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x082f
            androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
            if (r1 == 0) goto L_0x082f
            android.content.Intent r1 = r1.getIntent()
            if (r1 == 0) goto L_0x082f
            java.lang.String r3 = "KEY_TASK_ID"
            java.lang.String r1 = r1.getStringExtra(r3)
            if (r1 != 0) goto L_0x0830
        L_0x082f:
            r1 = r2
        L_0x0830:
            java.lang.String r3 = ht1.C8785n.f28042a
            boolean r3 = gy3.C87412m.m108589b(r3, r1)
            if (r3 == 0) goto L_0x0876
            int r3 = r1.length()
            if (r3 <= 0) goto L_0x0840
            r8 = 1
            goto L_0x0841
        L_0x0840:
            r8 = 0
        L_0x0841:
            if (r8 == 0) goto L_0x0876
            ht1.C8785n.f28042a = r2
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 23669(0x5c75, float:3.3167E-41)
            r5 = 6
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r1
            java.lang.String r1 = "feed_play"
            r6 = 1
            r5[r6] = r1
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = ht1.C8785n.f28044c
            long r7 = r7 - r9
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r7 = 2
            r5[r7] = r1
            r1 = 3
            r5[r1] = r2
            r1 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r5[r1] = r2
            r1 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r5[r1] = r2
            r3.mo160131h(r4, r5)
        L_0x0876:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2288Y(df1.c$a):void");
    }

    /* renamed from: Z */
    public void mo2289Z(C60905o oVar, T t, boolean z, long j, C65426w0 w0Var, int i, int i2, boolean z2, long j2, int i3, int i4) {
        String str;
        int i5;
        FinderTimelinePresenter finderTimelinePresenter;
        boolean z3;
        boolean z4;
        C39818r rVar;
        String str2;
        C55776r rVar2;
        FinderHomeTabFragment finderHomeTabFragment;
        Object obj;
        C55776r rVar3;
        int i6;
        FinderCommentDrawer finderCommentDrawer;
        FrameLayout footerLayout;
        C60905o oVar2 = oVar;
        T t2 = t;
        Class cls = C13133c1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(t2, "item");
        C56597e1 r5 = this.f12564e.mo2579r5();
        C39818r rVar4 = C39818r.f106831a;
        Context context = oVar2.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13554z zVar = (C13554z) rVar4.mo62443b(context).mo75002a(C13554z.class);
        C10008v1 v1Var = this.f12564e;
        FinderTimelinePresenter finderTimelinePresenter2 = v1Var instanceof FinderTimelinePresenter ? (FinderTimelinePresenter) v1Var : null;
        FinderHomeTabFragment finderHomeTabFragment2 = finderTimelinePresenter2 != null ? finderTimelinePresenter2.f13267h : null;
        zVar.getClass();
        zVar.mo12956c3(finderHomeTabFragment2, t, oVar, new C13209e0(r5), new C13226f0(r5));
        C8478d0 d0Var = new C8478d0();
        if (z) {
            if (i >= 0) {
                i6 = i;
            } else {
                this.f12557D.setEmpty();
                oVar2.f44854d.getGlobalVisibleRect(this.f12557D);
                i6 = this.f12557D.bottom;
            }
            oVar.mo85811C().getGlobalVisibleRect(this.f12557D);
            int i7 = this.f12557D.bottom - i6;
            View findViewById = (r5 == null || (finderCommentDrawer = r5.f162255a) == null || (footerLayout = finderCommentDrawer.getFooterLayout()) == null) ? null : footerLayout.findViewById(C0966R.C0970id.bji);
            if (findViewById != null) {
                C2391w0 w0Var2 = r0;
                str = "holder.context";
                i5 = 1;
                C2391w0 w0Var3 = new C2391w0(findViewById, oVar, i7, i6, this);
                findViewById.postDelayed(w0Var2, 200);
            } else {
                str = "holder.context";
                i5 = 1;
            }
        } else {
            str = "holder.context";
            i5 = 1;
            C37521f.f99374d.getClass();
            if (C37521f.f99334Y1.mo60266n().intValue() == 1) {
                oVar.mo85811C().mo17155w1();
                oVar2.f44854d.findViewById(C0966R.C0970id.ol9).getGlobalVisibleRect(this.f12557D);
                int i8 = this.f12557D.top;
                oVar.mo85811C().getGlobalVisibleRect(this.f12557D);
                d0Var.f27483d = i8 - this.f12557D.top;
                Log.m105918d("Finder.FeedFullConvert", "[openCommentDrawer] offset=" + d0Var.f27483d + ' ' + oVar.mo85811C());
                oVar.mo85811C().smoothScrollBy(0, d0Var.f27483d);
            }
        }
        C2394x0 x0Var = new C2394x0(this, t2, oVar2, d0Var);
        Context context2 = oVar2.f173499A;
        if (context2 instanceof MMActivity) {
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            C39622i0 a = rVar4.mo62444c((MMActivity) context2).mo75002a(C13442s8.class);
            C87412m.m108593f(a, "UICProvider.of(holder.co…rReporterUIC::class.java)");
            z3 = false;
            finderTimelinePresenter = null;
            C7322a b = C60172g4.C60173a.m70190b((C60172g4) a, 0, i5, (Object) null);
            if (b != null) {
                b.mo8766a(new C7322a.C7323a(6, t.getItemId()));
            }
        } else {
            z3 = false;
            finderTimelinePresenter = null;
        }
        if (this.f12564e.mo2497u0() || C58784w3.f168295a.mo83897Q0(t2) || !C58739j4.f168176a.mo83688Q(t.mo3507l())) {
            z4 = false;
        } else {
            C37521f.f99374d.mo61176c0(2);
            z4 = true;
        }
        if (r5 != null) {
            FinderItem o = t.mo3513o();
            if (j != 0) {
                z3 = true;
            }
            str2 = str;
            rVar = rVar4;
            r5.mo79926d(o, z, j, z3, true, w0Var, z4, i2, x0Var, z2, j2, i3, i4);
        } else {
            rVar = rVar4;
            str2 = str;
        }
        Context context3 = oVar2.f173499A;
        C87412m.m108593f(context3, str2);
        FinderDescPanelUIC finderDescPanelUIC = (FinderDescPanelUIC) rVar.mo62443b(context3).mo62449e(FinderDescPanelUIC.class);
        if (finderDescPanelUIC != null) {
            finderDescPanelUIC.mo5121i3(oVar2);
        }
        FinderFullSeekBarLayout finderFullSeekBarLayout = (FinderFullSeekBarLayout) oVar2.mo85812D(C0966R.C0970id.eh4);
        if (finderFullSeekBarLayout != null) {
            finderFullSeekBarLayout.mo4295t();
        }
        C10008v1 v1Var2 = this.f12564e;
        FinderTimelinePresenter finderTimelinePresenter3 = v1Var2 instanceof FinderTimelinePresenter ? (FinderTimelinePresenter) v1Var2 : finderTimelinePresenter;
        if (!(finderTimelinePresenter3 == null || (finderHomeTabFragment = finderTimelinePresenter3.f13267h) == null)) {
            C13133c1 c1Var = (C13133c1) rVar.mo62445d(finderHomeTabFragment).mo62449e(cls);
            if (c1Var == null || (rVar3 = c1Var.f37371d) == null) {
                obj = finderTimelinePresenter;
            } else {
                FeedUpdateEvent remove = rVar3.f158813q.remove(Long.valueOf(t.getItemId()));
                if (remove != null) {
                    remove.publish();
                }
                obj = C13598b0.f38549a;
            }
            if (obj != null) {
                return;
            }
        }
        Context context4 = oVar2.f173499A;
        C87412m.m108593f(context4, str2);
        C13133c1 c1Var2 = (C13133c1) rVar.mo62443b(context4).mo62449e(cls);
        if (c1Var2 != null && (rVar2 = c1Var2.f37371d) != null) {
            FeedUpdateEvent remove2 = rVar2.f158813q.remove(Long.valueOf(t.getItemId()));
            if (remove2 != null) {
                remove2.publish();
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: b0 */
    public final void mo2290b0(List<? extends FinderCommentInfo> list, List<? extends ImageView> list2, List<? extends View> list3, float f) {
        List<? extends FinderCommentInfo> list4 = list;
        List<? extends View> list5 = list3;
        C11978e0.C11979a aVar = C11978e0.C11979a.RECT_AVATAR;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        int i = 0;
        int i2 = 0;
        for (T next : list2) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                ImageView imageView = (ImageView) next;
                if (imageView != null) {
                    ViewParent parent = imageView.getParent();
                    RoundLinearLayout roundLinearLayout = parent instanceof RoundLinearLayout ? (RoundLinearLayout) parent : null;
                    float f2 = f;
                    if (roundLinearLayout != null) {
                        roundLinearLayout.setRadius(f2);
                    }
                    if (i2 >= list.size()) {
                        View view = (View) list5.get(i2);
                        if (view != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c(8);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "realNameLayoutSetAvatar", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar2.mo10231a(i)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "realNameLayoutSetAvatar", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else {
                        View view3 = (View) list5.get(i2);
                        if (view3 != null) {
                            C9556a aVar3 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar3.mo10233c(Integer.valueOf(i));
                            View view4 = view3;
                            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "realNameLayoutSetAvatar", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((Integer) aVar3.mo10231a(i)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "realNameLayoutSetAvatar", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        int size = list.size();
                        if (size < 0) {
                            size = 0;
                        }
                        if (size > 3) {
                            size = 3;
                        }
                        int i4 = (size - i2) - 1;
                        String str = ((FinderCommentInfo) list4.get(i4)).headUrl;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = ((FinderCommentInfo) list4.get(i4)).username;
                        String s = C75592q0.m90789s();
                        Log.m105924i("Finder.FeedFullConvert", "[setLikeAvatar] " + i2 + ", " + str2 + ", " + s + ", " + str + ", " + imageView);
                        imageView.setImageDrawable((Drawable) null);
                        if (C87412m.m108589b(str2, s)) {
                            ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11868R0().mo85957c(new C62345f("", (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
                            ((C76705f) C86312j.m106911c(C76705f.class)).D20(imageView, s, 0.0f);
                        } else {
                            ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11868R0().mo85957c(new C62345f(str, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
                        }
                    }
                } else {
                    float f3 = f;
                }
                i2 = i3;
                i = 0;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    /* renamed from: c0 */
    public final void mo2291c0(T t, C60905o oVar) {
        View D = oVar.mo85812D(C0966R.C0970id.f358047fm0);
        Float valueOf = Float.valueOf(1.0f);
        if (D != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshAdJumperViews", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshAdJumperViews", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(valueOf);
            C117292a.m165358d(D, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshAdJumperViews", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            D.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshAdJumperViews", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        View D2 = oVar.mo85812D(C0966R.C0970id.bsh);
        if (D2 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            C117292a.m165358d(D2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshAdJumperViews", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(D2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshAdJumperViews", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(valueOf);
            C117292a.m165358d(D2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshAdJumperViews", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            D2.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
            C117292a.m165359e(D2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshAdJumperViews", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        C2372q qVar = this.f12563J;
        qVar.f34864b = t;
        qVar.f34863a = oVar;
        C39818r rVar = C39818r.f106831a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        C39622i0 a = rVar.mo62443b(context).mo75002a(C10786a1.class);
        C87412m.m108593f(a, "UICProvider.of(holder.co…eedJumperUIC::class.java)");
        C10786a1 a1Var = (C10786a1) a;
        a1Var.f32262w = mo2260G();
        a1Var.f32397n = new C2397y0(this);
        C10846o0.m10834o3(a1Var, t, oVar, (String) null, false, this.f12563J, 12, (Object) null);
        C10008v1 v1Var = this.f12564e;
        FinderHomeTabFragment finderHomeTabFragment = null;
        FinderTimelinePresenter finderTimelinePresenter = v1Var instanceof FinderTimelinePresenter ? (FinderTimelinePresenter) v1Var : null;
        if (finderTimelinePresenter != null) {
            finderHomeTabFragment = finderTimelinePresenter.f13267h;
        }
        a1Var.setFragment(finderHomeTabFragment);
    }

    /* renamed from: d */
    public void mo2292d(RecyclerView recyclerView, WxRecyclerAdapter<?> wxRecyclerAdapter) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(wxRecyclerAdapter, "adapter");
        super.mo2292d(recyclerView, wxRecyclerAdapter);
        this.f12554A = recyclerView;
    }

    /* renamed from: d0 */
    public final void mo2293d0(T t, C60905o oVar) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        String i = t.mo3503i();
        C60979d<C100810g0> i2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2();
        C62345f fVar = new C62345f(i, (C27696y) null, 2, (C8480h) null);
        View D = oVar.mo85812D(C0966R.C0970id.a27);
        C87412m.m108593f(D, "holder.getView(R.id.avatar_iv)");
        i2.mo85957c(fVar, (ImageView) D, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e7  */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2294e0(com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r19, boolean r20, boolean r21, int r22, jq3.C60905o r23, int r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = r22
            r4 = r23
            up1.y r5 = up1.C27696y.RAW_IMAGE
            pl1.e0$a r6 = pl1.C11978e0.C11979a.LIKE_HOT_DEFAULT
            java.lang.Class<pl1.s0> r7 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r8 = ht1.C60200t1.class
            java.lang.String r9 = "item"
            gy3.C87412m.m108594g(r1, r9)
            java.lang.String r9 = "holder"
            gy3.C87412m.m108594g(r4, r9)
            r9 = 2131307275(0x7f092b0b, float:1.8232773E38)
            android.view.View r9 = r4.mo85812D(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            boolean r10 = r0.f12567h
            r11 = 2131099682(0x7f060022, float:1.7811724E38)
            if (r10 == 0) goto L_0x0039
            android.content.Context r10 = r4.f173499A
            android.content.res.Resources r10 = r10.getResources()
            int r10 = r10.getColor(r11)
            r9.setTextColor(r10)
        L_0x0039:
            r10 = 2131297502(0x7f0904de, float:1.821295E38)
            android.view.View r10 = r4.mo85812D(r10)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            er1.j4 r12 = er1.C58739j4.f168176a
            fe1.q r13 = r19.mo3507l()
            boolean r12 = r12.mo83688Q(r13)
            wp1.j r13 = wp1.C15587j.f42215a
            com.tencent.mm.plugin.finder.storage.FinderItem r14 = r19.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r14 = r14.getFeedObject()
            int r14 = r14.objectType
            te3.if1 r13 = r13.mo14351c(r14)
            kf1.v1 r14 = r0.f12564e
            boolean r14 = r14.mo2497u0()
            r15 = 1
            if (r14 == 0) goto L_0x0092
            android.text.TextPaint r3 = r9.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106193l0(r3)
            vq1.w r3 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r14 = r19.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r14 = r14.getFeedObject()
            int r3 = r3.mo89909h(r14)
            r14 = r12
            long r11 = (long) r3
            java.lang.String r3 = er1.C7878t0.m8036e(r11)
            java.lang.String r11 = "formatPosterOpNumberNew(…m.feedObject.feedObject))"
            gy3.C87412m.m108593f(r3, r11)
            if (r10 == 0) goto L_0x008d
            r11 = 2131302530(0x7f091882, float:1.8223149E38)
            r10.setTag(r11, r3)
        L_0x008d:
            r9.setText(r3)
            goto L_0x00f9
        L_0x0092:
            r14 = r12
            if (r3 <= 0) goto L_0x00bc
            kf1.v1 r11 = r0.f12564e
            boolean r11 = r11.mo2497u0()
            if (r11 != 0) goto L_0x009f
            r11 = 2
            goto L_0x00a0
        L_0x009f:
            r11 = 1
        L_0x00a0:
            java.lang.String r3 = er1.C7878t0.m8034c(r11, r3)
            java.lang.String r11 = "formatNumber(\n          …keCount\n                )"
            gy3.C87412m.m108593f(r3, r11)
            if (r10 == 0) goto L_0x00b1
            r11 = 2131302530(0x7f091882, float:1.8223149E38)
            r10.setTag(r11, r3)
        L_0x00b1:
            android.text.TextPaint r10 = r9.getPaint()
            r11 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r10, r11)
            goto L_0x00f6
        L_0x00bc:
            if (r13 == 0) goto L_0x00d6
            java.lang.String r3 = r13.f135272r
            if (r3 == 0) goto L_0x00cb
            int r3 = r3.length()
            if (r3 != 0) goto L_0x00c9
            goto L_0x00cb
        L_0x00c9:
            r3 = 0
            goto L_0x00cc
        L_0x00cb:
            r3 = 1
        L_0x00cc:
            if (r3 == 0) goto L_0x00cf
            goto L_0x00d6
        L_0x00cf:
            java.lang.String r3 = r13.f135272r
            if (r3 != 0) goto L_0x00e5
            java.lang.String r3 = ""
            goto L_0x00e5
        L_0x00d6:
            android.content.Context r3 = r4.f173499A
            r11 = 2131826848(0x7f1118a0, float:1.9286592E38)
            java.lang.String r3 = r3.getString(r11)
            java.lang.String r11 = "{\n                    ho…eplace)\n                }"
            gy3.C87412m.m108593f(r3, r11)
        L_0x00e5:
            if (r10 == 0) goto L_0x00ef
            java.lang.String r11 = "0"
            r12 = 2131302530(0x7f091882, float:1.8223149E38)
            r10.setTag(r12, r11)
        L_0x00ef:
            android.text.TextPaint r10 = r9.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106193l0(r10)
        L_0x00f6:
            r9.setText(r3)
        L_0x00f9:
            if (r20 == 0) goto L_0x0110
            rx3.g r3 = r0.f12574r
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0110
            r3 = 3
            r9 = 0
            r0.mo2267J0(r4, r9, r1, r3)
        L_0x0110:
            r3 = 2131305309(0x7f09235d, float:1.8228785E38)
            android.view.View r3 = r4.mo85812D(r3)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r3 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r3
            if (r3 == 0) goto L_0x011d
            r3.f17495N = r1
        L_0x011d:
            boolean r3 = r19.mo3472F()
            if (r3 == 0) goto L_0x012f
            java.lang.Object r3 = r4.f173503E
            java.lang.String r9 = "holder.getAssociatedObject()"
            gy3.C87412m.m108593f(r3, r9)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r3
            r0.mo2322v(r4, r3)
        L_0x012f:
            r3 = 2131306191(0x7f0926cf, float:1.8230574E38)
            android.view.View r3 = r4.mo85812D(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r3
            r9 = 0
            if (r20 == 0) goto L_0x015d
            if (r2 == 0) goto L_0x0146
            r10 = 2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r3.setTag(r10)
            goto L_0x014d
        L_0x0146:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r3.setTag(r10)
        L_0x014d:
            android.content.Context r10 = r4.f173499A
            android.content.res.Resources r10 = r10.getResources()
            int r11 = r0.mo2250B(r15, r2, r1)
            android.graphics.drawable.Drawable r9 = hi3.C87515a.m108835e(r10, r11, r9)
            r10 = 0
            goto L_0x017a
        L_0x015d:
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r3.setTag(r11)
            android.content.Context r11 = r4.f173499A
            android.content.res.Resources r11 = r11.getResources()
            if (r2 == 0) goto L_0x0171
            if (r20 == 0) goto L_0x0171
            r12 = 1
            goto L_0x0172
        L_0x0171:
            r12 = 0
        L_0x0172:
            int r12 = r0.mo2250B(r10, r12, r1)
            android.graphics.drawable.Drawable r9 = hi3.C87515a.m108835e(r11, r12, r9)
        L_0x017a:
            boolean r11 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            r12 = 0
            if (r2 == 0) goto L_0x0190
            if (r20 == 0) goto L_0x0190
            if (r14 != 0) goto L_0x0190
            r3.setLayerPaint(r12)
            r3.setIconColor(r10)
            r0.mo2277O0(r3, r13, r10)
            goto L_0x02ce
        L_0x0190:
            r10 = 2131099905(0x7f060101, float:1.7812176E38)
            r15 = 2131232436(0x7f0806b4, float:1.8080981E38)
            r17 = 2131100935(0x7f060507, float:1.7814265E38)
            if (r13 == 0) goto L_0x0234
            if (r14 != 0) goto L_0x0234
            if (r2 != 0) goto L_0x0234
            kf1.v1 r2 = r0.f12564e
            boolean r2 = r2.mo2497u0()
            if (r2 != 0) goto L_0x0234
            if (r20 == 0) goto L_0x01b5
            boolean r2 = r0.f12567h
            if (r2 == 0) goto L_0x01b2
            if (r11 != 0) goto L_0x01b2
            java.lang.String r2 = r13.f135269o
            goto L_0x01c0
        L_0x01b2:
            java.lang.String r2 = r13.f135268n
            goto L_0x01c0
        L_0x01b5:
            boolean r2 = r0.f12567h
            if (r2 == 0) goto L_0x01be
            if (r11 != 0) goto L_0x01be
            java.lang.String r2 = r13.f135274t
            goto L_0x01c0
        L_0x01be:
            java.lang.String r2 = r13.f135275u
        L_0x01c0:
            r3.setLayerPaint(r12)
            r11 = 0
            r3.setIconColor(r11)
            if (r2 == 0) goto L_0x01d3
            int r11 = r2.length()
            if (r11 != 0) goto L_0x01d0
            goto L_0x01d3
        L_0x01d0:
            r16 = 0
            goto L_0x01d5
        L_0x01d3:
            r16 = 1
        L_0x01d5:
            if (r16 == 0) goto L_0x0204
            if (r20 != 0) goto L_0x01f2
            android.content.Context r2 = r4.f173499A
            android.content.res.Resources r2 = r2.getResources()
            boolean r5 = r0.f12567h
            if (r5 == 0) goto L_0x01e7
            r11 = 2131099682(0x7f060022, float:1.7811724E38)
            goto L_0x01ea
        L_0x01e7:
            r11 = 2131100935(0x7f060507, float:1.7814265E38)
        L_0x01ea:
            int r2 = r2.getColor(r11)
            r3.setIconColor(r2)
            goto L_0x01ff
        L_0x01f2:
            android.content.Context r2 = r4.f173499A
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r10)
            r3.setIconColor(r2)
        L_0x01ff:
            r3.setImageDrawable(r9)
            goto L_0x02ce
        L_0x0204:
            bl3.r r9 = bl3.C39818r.f106831a
            bl3.r$a r10 = r9.mo62446e(r8)
            bl3.c r10 = r10.mo62447c(r7)
            pl1.s0 r10 = (pl1.C11990s0) r10
            n60.f r6 = r10.mo11867O2(r6)
            r6.f293170h = r15
            bl3.r$a r8 = r9.mo62446e(r8)
            bl3.c r7 = r8.mo62447c(r7)
            pl1.s0 r7 = (pl1.C11990s0) r7
            k60.d r7 = r7.mo11871f2()
            pl1.n0 r8 = new pl1.n0
            r8.<init>(r2, r5)
            l60.b r2 = r7.mo85956b(r8, r6)
            l60.a r2 = (l60.C99342a) r2
            r2.mo85954d(r3)
            goto L_0x02ce
        L_0x0234:
            r3.setLayerPaint(r12)
            r2 = 0
            r3.setIconColor(r2)
            if (r13 == 0) goto L_0x0240
            java.lang.String r2 = r13.f135275u
            goto L_0x0241
        L_0x0240:
            r2 = r12
        L_0x0241:
            if (r2 == 0) goto L_0x024d
            int r2 = r2.length()
            if (r2 != 0) goto L_0x024a
            goto L_0x024d
        L_0x024a:
            r16 = 0
            goto L_0x024f
        L_0x024d:
            r16 = 1
        L_0x024f:
            if (r16 != 0) goto L_0x029a
            kf1.v1 r2 = r0.f12564e
            boolean r2 = r2.mo2497u0()
            if (r2 != 0) goto L_0x029a
            if (r14 == 0) goto L_0x025c
            goto L_0x029a
        L_0x025c:
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r9 = r2.mo62446e(r8)
            bl3.c r9 = r9.mo62447c(r7)
            pl1.s0 r9 = (pl1.C11990s0) r9
            n60.f r6 = r9.mo11867O2(r6)
            r6.f293170h = r15
            bl3.r$a r2 = r2.mo62446e(r8)
            bl3.c r2 = r2.mo62447c(r7)
            pl1.s0 r2 = (pl1.C11990s0) r2
            k60.d r2 = r2.mo11871f2()
            pl1.n0 r7 = new pl1.n0
            boolean r8 = r0.f12567h
            if (r8 == 0) goto L_0x0289
            if (r11 != 0) goto L_0x0289
            if (r13 == 0) goto L_0x028d
            java.lang.String r12 = r13.f135274t
            goto L_0x028d
        L_0x0289:
            if (r13 == 0) goto L_0x028d
            java.lang.String r12 = r13.f135275u
        L_0x028d:
            r7.<init>(r12, r5)
            l60.b r2 = r2.mo85956b(r7, r6)
            l60.a r2 = (l60.C99342a) r2
            r2.mo85954d(r3)
            goto L_0x02ce
        L_0x029a:
            if (r20 == 0) goto L_0x02b3
            kf1.v1 r2 = r0.f12564e
            boolean r2 = r2.mo2497u0()
            if (r2 == 0) goto L_0x02a5
            goto L_0x02b3
        L_0x02a5:
            android.content.Context r2 = r4.f173499A
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r10)
            r3.setIconColor(r2)
            goto L_0x02cb
        L_0x02b3:
            android.content.Context r2 = r4.f173499A
            android.content.res.Resources r2 = r2.getResources()
            boolean r5 = r0.f12567h
            if (r5 == 0) goto L_0x02c1
            r11 = 2131099682(0x7f060022, float:1.7811724E38)
            goto L_0x02c4
        L_0x02c1:
            r11 = 2131100935(0x7f060507, float:1.7814265E38)
        L_0x02c4:
            int r2 = r2.getColor(r11)
            r3.setIconColor(r2)
        L_0x02cb:
            r3.setImageDrawable(r9)
        L_0x02ce:
            boolean r1 = r19.mo3479M()
            if (r1 == 0) goto L_0x02e8
            android.content.Context r1 = r4.f173499A
            boolean r2 = r0.f12567h
            if (r2 == 0) goto L_0x02de
            r2 = 2131099673(0x7f060019, float:1.7811706E38)
            goto L_0x02e1
        L_0x02de:
            r2 = 2131100571(0x7f06039b, float:1.7813527E38)
        L_0x02e1:
            int r1 = kg3.C76577a.m92153d(r1, r2)
            r3.setIconColor(r1)
        L_0x02e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2294e0(com.tencent.mm.plugin.finder.model.BaseFinderFeed, boolean, boolean, int, jq3.o, int):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        oVar.f44854d.getLayoutParams().width = -1;
        oVar.f44854d.getLayoutParams().height = -1;
        recyclerView.getLayoutParams().height = -1;
        recyclerView.getLayoutParams().width = -1;
        ViewParent parent = recyclerView.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).getLayoutParams().width = -1;
        ViewParent parent2 = recyclerView.getParent();
        C87412m.m108592e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent2).getLayoutParams().height = -1;
        C85875k4.m106189j0(((TextView) oVar.f44854d.findViewById(C0966R.C0970id.bh6)).getPaint(), 0.8f);
        Context context = oVar.f173499A;
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        ((FlowTextMixView) oVar.f44854d.findViewById(C0966R.C0970id.eam)).setMaxWidth((int) (((float) ((Activity) context).getBaseContext().getResources().getDisplayMetrics().widthPixels) * 0.36f));
        NeatTextView neatTextView = (NeatTextView) oVar.mo85812D(C0966R.C0970id.ki5);
        neatTextView.setOnTouchListener(new C107029o(neatTextView, new C75355a0(oVar.f173499A)));
        C2379s0 s0Var = new C2379s0(this, oVar);
        if (!C87412m.m108589b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            oVar.f44854d.post(s0Var);
        } else {
            s0Var.run();
        }
        View D = oVar.mo85812D(C0966R.C0970id.edb);
        if (D != null) {
            D.setOnClickListener(C2376r0.f12717d);
            TextView textView = (TextView) D.findViewById(C0966R.C0970id.idd);
            if (textView != null) {
                textView.setTextSize(1, 12.0f);
            }
            TextView textView2 = (TextView) D.findViewById(C0966R.C0970id.cut);
            if (textView2 != null) {
                textView2.setTextSize(1, 12.0f);
                textView2.setText(C58784w3.f168295a.mo83962s0());
            }
            TextView textView3 = (TextView) D.findViewById(C0966R.C0970id.jhv);
            if (textView3 != null) {
                textView3.setTextSize(1, 12.0f);
            }
            TextView textView4 = (TextView) D.findViewById(C0966R.C0970id.fnp);
            if (textView4 != null) {
                textView4.setTextSize(1, 12.0f);
            }
            TextView textView5 = (TextView) D.findViewById(C0966R.C0970id.f359286k04);
            if (textView5 != null) {
                textView5.setTextSize(1, 12.0f);
            }
            TextView textView6 = (TextView) D.findViewById(C0966R.C0970id.bje);
            if (textView6 != null) {
                textView6.setTextSize(1, 12.0f);
            }
        }
        TextView textView7 = (TextView) oVar.mo85812D(C0966R.C0970id.fpi);
        if (textView7 != null) {
            textView7.setTextSize(1, 10.0f);
        }
        View D2 = oVar.mo85812D(C0966R.C0970id.k07);
        if (D2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = D2;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "onCreateViewHolder", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "onCreateViewHolder", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo2301k(oVar);
    }

    /* renamed from: f0 */
    public void mo2295f0(C60905o oVar, boolean z) {
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: g */
    public void mo2296g(RecyclerView recyclerView) {
        Object tag;
        C87412m.m108594g(recyclerView, "recyclerView");
        this.f173479d = false;
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (true) {
            Boolean bool = null;
            if (i < childCount) {
                RecyclerView.C16631z F0 = recyclerView.mo17021F0(recyclerView.getChildAt(i));
                if (F0 != null) {
                    C60905o oVar = F0 instanceof C60905o ? (C60905o) F0 : null;
                    if (!(oVar == null || (tag = oVar.f44854d.getTag(C0966R.C0970id.mza)) == null)) {
                        if (tag instanceof Boolean) {
                            bool = tag;
                        }
                        if (bool != null && bool.booleanValue()) {
                            mo2286W(oVar, oVar.mo17363j(), oVar.f44859i, false);
                        }
                    }
                }
                i++;
            } else {
                this.f12554A = null;
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2297g0(T r9, jq3.C60905o r10) {
        /*
            r8 = this;
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r10, r0)
            r0 = 2131299988(0x7f090e94, float:1.8217993E38)
            android.view.View r0 = r10.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            boolean r1 = r8.f12567h
            r2 = 2131099682(0x7f060022, float:1.7811724E38)
            if (r1 == 0) goto L_0x0027
            android.content.Context r1 = r10.f173499A
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
        L_0x0027:
            r1 = 2131300002(0x7f090ea2, float:1.8218021E38)
            android.view.View r1 = r10.mo85812D(r1)
            r3 = 2131306184(0x7f0926c8, float:1.823056E38)
            android.view.View r3 = r10.mo85812D(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r3
            boolean r4 = r9.mo3479M()
            if (r4 == 0) goto L_0x0041
            r2 = 2131100571(0x7f06039b, float:1.7813527E38)
            goto L_0x0049
        L_0x0041:
            boolean r4 = r8.f12567h
            if (r4 == 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            r2 = 2131100935(0x7f060507, float:1.7814265E38)
        L_0x0049:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r9.mo3513o()
            boolean r4 = r4.isCommentClose()
            java.lang.String r5 = "holder.context"
            if (r4 == 0) goto L_0x0063
            er1.w3 r4 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r9.mo3513o()
            java.lang.String r6 = r6.field_username
            boolean r4 = r4.mo83899R0(r6)
            if (r4 != 0) goto L_0x0076
        L_0x0063:
            er1.w3 r4 = er1.C58784w3.f168295a
            android.content.Context r6 = r10.f173499A
            gy3.C87412m.m108593f(r6, r5)
            boolean r6 = r4.mo83900S0(r6)
            if (r6 == 0) goto L_0x007d
            boolean r4 = r4.mo83889N0()
            if (r4 != 0) goto L_0x007d
        L_0x0076:
            r4 = 2131755903(0x7f10037f, float:1.9142698E38)
            r3.mo104518r(r4, r2)
            goto L_0x0083
        L_0x007d:
            r4 = 2131755633(0x7f100271, float:1.914215E38)
            r3.mo104518r(r4, r2)
        L_0x0083:
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$z0 r2 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$z0
            r2.<init>(r10, r8, r9)
            r1.setOnClickListener(r2)
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99511s4
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4 = 1
            if (r3 != r4) goto L_0x00a1
            r3 = 1
            goto L_0x00a2
        L_0x00a1:
            r3 = 0
        L_0x00a2:
            if (r3 == 0) goto L_0x00b1
            vp1.e r3 = vp1.C65834e.f189316a
            long r6 = r9.getItemId()
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo89871e(r6)
            if (r3 == 0) goto L_0x00b1
            goto L_0x00b5
        L_0x00b1:
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r9.mo3513o()
        L_0x00b5:
            int r3 = r3.getCommentCount()
            r6 = 2131302515(0x7f091873, float:1.8223118E38)
            if (r3 > 0) goto L_0x00e4
            kf1.v1 r7 = r8.f12564e
            boolean r7 = r7.mo2497u0()
            if (r7 == 0) goto L_0x00c7
            goto L_0x00e4
        L_0x00c7:
            android.content.Context r3 = r0.getContext()
            r7 = 2131826304(0x7f111680, float:1.9285489E38)
            java.lang.String r3 = r3.getString(r7)
            java.lang.String r7 = "seeAllCommentsTv.context…inder_comment_count_text)"
            gy3.C87412m.m108593f(r3, r7)
            r0.setText(r3)
            java.lang.String r3 = "0"
            r1.setTag(r6, r3)
            er1.C7919x.m8092b(r0)
            goto L_0x0100
        L_0x00e4:
            kf1.v1 r7 = r8.f12564e
            boolean r7 = r7.mo2497u0()
            if (r7 != 0) goto L_0x00ee
            r7 = 2
            goto L_0x00ef
        L_0x00ee:
            r7 = 1
        L_0x00ef:
            java.lang.String r3 = er1.C7878t0.m8034c(r7, r3)
            r0.setText(r3)
            er1.C7919x.m8091a(r0)
            java.lang.CharSequence r0 = r0.getText()
            r1.setTag(r6, r0)
        L_0x0100:
            r2.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99168F3
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r4) goto L_0x0138
            android.content.Context r0 = r10.f173499A
            gy3.C87412m.m108593f(r0, r5)
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r0 = r1.mo62443b(r0)
            java.lang.Class<rs1.z2> r1 = rs1.C13562z2.class
            bl3.t r0 = r0.mo62449e(r1)
            rs1.z2 r0 = (rs1.C13562z2) r0
            if (r0 == 0) goto L_0x0138
            long r1 = r9.getItemId()
            ve1.g1 r3 = new ve1.g1
            r3.<init>(r8, r10, r9)
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, rs1.z2$a> r10 = r0.f38480i
            r10.put(r9, r3)
        L_0x0138:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2297g0(com.tencent.mm.plugin.finder.model.BaseFinderFeed, jq3.o):void");
    }

    /* renamed from: h0 */
    public final void mo2298h0(C60905o oVar, T t) {
        String str;
        C64237ap1 ap12;
        yq4 yq4;
        C64237ap1 ap13;
        yq4 yq42;
        C60905o oVar2 = oVar;
        T t2 = t;
        C7801g0 g0Var = C7801g0.f26318a;
        MMActivity activity = this.f12564e.getActivity();
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(t2, "item");
        View D = oVar2.mo85812D(C0966R.C0970id.lw4);
        FinderObjectDesc finderObjectDesc = t.mo3513o().getFeedObject().objectDesc;
        C64237ap1 ap14 = finderObjectDesc != null ? finderObjectDesc.video_tmpl_info : null;
        if (ap14 == null || (str = ap14.f182115d) == null) {
            str = "";
        }
        if (ap14 != null) {
            if (!(str.length() == 0)) {
                C8368c cVar = C8368c.f27352a;
                int hashCode = oVar.hashCode();
                C8366a aVar = C8366a.CREATION_BY_SAME_TEMPLATE;
                if (!cVar.mo9335b(hashCode, aVar)) {
                    g0Var.mo8907b(D, 8, "no priority, hide");
                    return;
                }
                C58247e eVar = (C58247e) C86312j.m106911c(C58247e.class);
                C7256b yf02 = eVar.yf0();
                FinderObjectDesc finderObjectDesc2 = t.mo3513o().getFeedObject().objectDesc;
                int i = (finderObjectDesc2 == null || (ap13 = finderObjectDesc2.video_tmpl_info) == null || (yq42 = ap13.f182120i) == null) ? 0 : yq42.f145473f;
                FinderObjectDesc finderObjectDesc3 = t.mo3513o().getFeedObject().objectDesc;
                if (yf02.mo8426a(i, (finderObjectDesc3 == null || (ap12 = finderObjectDesc3.video_tmpl_info) == null || (yq4 = ap12.f182120i) == null) ? 0 : yq4.f145474g, ap14.f182116e)) {
                    eVar.mo82988cy(str, true);
                    if (D != null) {
                        TextView textView = (TextView) D.findViewById(C0966R.C0970id.mmf);
                        if (textView != null) {
                            textView.setTextSize(0, oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3684bd));
                            if (ap14.f182116e == 2) {
                                textView.setText(oVar2.f173499A.getString(C0966R.string.n37));
                            } else {
                                textView.setText(oVar2.f173499A.getString(C0966R.string.f360780lr3));
                            }
                        }
                        g0Var.mo8907b(D, 0, "all is ok, show");
                        C23564m.m28138h(D, new C7793e0(str, oVar2, t2, ap14));
                        D.setOnClickListener(new C7797f0(oVar, t, ap14, eVar, activity));
                        cVar.mo9337d(oVar2, D, aVar);
                        return;
                    }
                    return;
                }
                g0Var.mo8907b(D, 8, "no entry, hide");
                return;
            }
        }
        g0Var.mo8907b(D, 8, "no data, hide");
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        FinderVideoLayout finderVideoLayout;
        C87412m.m108594g(oVar, "holder");
        if (!(((FinderMediaLayout) oVar.mo85812D(C0966R.C0970id.ol_)) == null || (finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a)) == null)) {
            finderVideoLayout.mo79539A();
        }
        C8368c cVar = C8368c.f27352a;
        int hashCode = oVar.hashCode();
        C8368c.f27353b.remove(Integer.valueOf(hashCode));
        C8368c.f27354c.remove(Integer.valueOf(hashCode));
        if (!((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e() && !mo2260G()) {
            C39818r rVar = C39818r.f106831a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            C10786a1 a1Var = (C10786a1) rVar.mo62443b(context).mo75002a(C10786a1.class);
            a1Var.getClass();
            a1Var.mo11057G3(oVar);
        }
        this.f12556C = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: android.text.SpannableString} */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: type inference failed for: r13v16 */
    /* JADX WARNING: type inference failed for: r13v28 */
    /* JADX WARNING: type inference failed for: r13v29 */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03dc, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:?, code lost:
        r0 = r2.subSequence(0, r0 + 1);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x025d A[Catch:{ all -> 0x0404 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x026c A[Catch:{ all -> 0x0404 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0283 A[Catch:{ all -> 0x0404 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0288 A[Catch:{ all -> 0x0404 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0291 A[Catch:{ all -> 0x0404 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0295 A[Catch:{ all -> 0x0404 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0299 A[Catch:{ all -> 0x0404 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x029d A[Catch:{ all -> 0x0404 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02a9 A[Catch:{ all -> 0x0404 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02bc A[Catch:{ all -> 0x0404 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02c1 A[Catch:{ all -> 0x0404 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02cf A[Catch:{ all -> 0x0404 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03ce A[Catch:{ all -> 0x03b3, all -> 0x0401 }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x03e5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0106 A[Catch:{ all -> 0x0415 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0109 A[Catch:{ all -> 0x0415 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0122 A[SYNTHETIC, Splitter:B:45:0x0122] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0163 A[Catch:{ all -> 0x040a }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01f0 A[Catch:{ all -> 0x0404 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01fc A[Catch:{ all -> 0x0404 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0215 A[ADDED_TO_REGION, Catch:{ all -> 0x0404 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0246 A[Catch:{ all -> 0x0404 }] */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2299i0(jq3.C60905o r37, T r38) {
        /*
            r36 = this;
            r1 = r36
            r2 = r37
            r10 = r38
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r10, r0)
            r0 = 2131315111(0x7f0949a7, float:1.8248666E38)
            android.view.View r0 = r2.mo85812D(r0)
            r11 = r0
            com.tencent.neattextview.textview.view.NeatTextView r11 = (com.tencent.neattextview.textview.view.NeatTextView) r11
            boolean r0 = r1.f12567h
            if (r0 == 0) goto L_0x0030
            if (r11 == 0) goto L_0x0030
            android.content.Context r0 = r2.f173499A
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131099682(0x7f060022, float:1.7811724E38)
            int r0 = r0.getColor(r3)
            r11.setTextColor(r0)
        L_0x0030:
            er1.m3 r0 = er1.C7832m3.f26372a
            android.content.Context r12 = r2.f173499A
            java.lang.String r13 = "holder.context"
            gy3.C87412m.m108593f(r12, r13)
            kf1.v1 r3 = r1.f12564e
            boolean r14 = r3.mo2497u0()
            boolean r9 = r1.f12556C
            r0.getClass()
            java.lang.String r15 = ""
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r38.mo3513o()
            android.text.SpannableString r3 = r3.getFlowCardDescSpan()
            if (r3 == 0) goto L_0x0059
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r3 = 0
            goto L_0x005a
        L_0x0059:
            r3 = 1
        L_0x005a:
            r6 = 10
            if (r3 != 0) goto L_0x00e2
            er1.w3 r3 = er1.C58784w3.f168295a
            rs1.s8$a r4 = rs1.C13442s8.f38060Q0
            rs1.s8 r4 = r4.mo12873f(r12)
            if (r4 == 0) goto L_0x006b
            int r4 = r4.f38096i
            goto L_0x006c
        L_0x006b:
            r4 = 0
        L_0x006c:
            r3.getClass()
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.String> r3 = up1.C37521f.f99209J8
            java.lang.Object r3 = r3.mo60266n()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r8 = er1.C58784w3.f168312r
            boolean r8 = gy3.C87412m.m108589b(r8, r3)
            if (r8 != 0) goto L_0x00cb
            er1.C58784w3.f168312r = r3
            java.util.HashSet<java.lang.Integer> r8 = er1.C58784w3.f168311q
            java.lang.String r16 = "/"
            java.lang.String[] r17 = new java.lang.String[]{r16}
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            r16 = r3
            java.util.List r3 = z04.C112550d0.m153785U(r16, r17, r18, r19, r20, r21)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r5 = sx3.C36907w.m41090l(r3, r6)
            r7.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x00a9:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00c4
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            r6 = -1
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7.add(r5)
            r6 = 10
            goto L_0x00a9
        L_0x00c4:
            java.util.HashSet r3 = sx3.C110818d0.m150951w0(r7)
            r8.addAll(r3)
        L_0x00cb:
            java.util.HashSet<java.lang.Integer> r3 = er1.C58784w3.f168311q
            if (r3 == 0) goto L_0x00dc
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            r4 = 1
            if (r3 != r4) goto L_0x00dc
            r4 = 1
            goto L_0x00dd
        L_0x00dc:
            r4 = 0
        L_0x00dd:
            if (r4 == 0) goto L_0x00e2
            r19 = 1
            goto L_0x00e4
        L_0x00e2:
            r19 = 0
        L_0x00e4:
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r38.mo3513o()
            if (r19 == 0) goto L_0x00ef
            android.text.SpannableString r3 = r3.getFlowCardDescSpan()
            goto L_0x00f3
        L_0x00ef:
            android.text.SpannableString r3 = r3.getDescriptionSpan()
        L_0x00f3:
            r8 = r3
            kotlin.Result$Companion r3 = kotlin.Result.Companion     // Catch:{ all -> 0x0415 }
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder     // Catch:{ all -> 0x0415 }
            r3.<init>(r8)     // Catch:{ all -> 0x0415 }
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder     // Catch:{ all -> 0x0415 }
            r5.<init>()     // Catch:{ all -> 0x0415 }
            boolean r4 = r0.mo8948p()     // Catch:{ all -> 0x0415 }
            if (r4 != 0) goto L_0x0109
            int r4 = er1.C7832m3.f26381j     // Catch:{ all -> 0x0415 }
            goto L_0x010b
        L_0x0109:
            int r4 = er1.C7832m3.f26382k     // Catch:{ all -> 0x0415 }
        L_0x010b:
            r20 = r4
            int r4 = er1.C7832m3.f26386o     // Catch:{ all -> 0x0415 }
            int r21 = er1.C7832m3.f26375d     // Catch:{ all -> 0x0415 }
            int r4 = r4 - r21
            int r21 = er1.C7832m3.f26379h     // Catch:{ all -> 0x0415 }
            int r4 = r4 - r21
            float r4 = (float) r4     // Catch:{ all -> 0x0415 }
            com.tencent.mm.plugin.finder.view.n8 r1 = r0.mo8944l(r12, r10)     // Catch:{ all -> 0x0415 }
            r21 = r13
            java.lang.String r13 = " "
            if (r1 == 0) goto L_0x0163
            int r23 = z04.C112550d0.m153765A(r3)     // Catch:{ all -> 0x040a }
            r6 = r23
        L_0x0128:
            r7 = -1
            if (r7 >= r6) goto L_0x0145
            char r7 = r3.charAt(r6)     // Catch:{ all -> 0x040a }
            r2 = 10
            if (r7 != r2) goto L_0x0135
            r7 = 1
            goto L_0x0136
        L_0x0135:
            r7 = 0
        L_0x0136:
            if (r7 != 0) goto L_0x0140
            r7 = 1
            int r6 = r6 + r7
            r2 = 0
            java.lang.CharSequence r3 = r3.subSequence(r2, r6)     // Catch:{ all -> 0x040a }
            goto L_0x0148
        L_0x0140:
            r2 = 0
            r7 = 1
            int r6 = r6 + -1
            goto L_0x0128
        L_0x0145:
            r2 = 0
            r7 = 1
            r3 = r15
        L_0x0148:
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder     // Catch:{ all -> 0x040a }
            r6.<init>(r3)     // Catch:{ all -> 0x040a }
            r6.append(r13)     // Catch:{ all -> 0x040a }
            int r3 = r6.length()     // Catch:{ all -> 0x040a }
            r16 = -1
            int r3 = r3 + -1
            int r2 = r6.length()     // Catch:{ all -> 0x040a }
            r7 = 33
            r6.setSpan(r1, r3, r2, r7)     // Catch:{ all -> 0x040a }
            r2 = r6
            goto L_0x0166
        L_0x0163:
            r16 = -1
            r2 = r3
        L_0x0166:
            com.tencent.mm.ui.widget.MMNeat7extView r7 = er1.C7832m3.f26387p     // Catch:{ all -> 0x040a }
            int r6 = er1.C7832m3.f26386o     // Catch:{ all -> 0x040a }
            int r3 = er1.C7832m3.f26379h     // Catch:{ all -> 0x040a }
            int r3 = r6 - r3
            float r3 = (float) r3
            r24 = r3
            r3 = r0
            r25 = r4
            r4 = r12
            r26 = r11
            r16 = r15
            r15 = -1
            r11 = r5
            r5 = r38
            r28 = r6
            r15 = 2
            r6 = r7
            r18 = r7
            r15 = 1
            r7 = r20
            r15 = r8
            r22 = r13
            r13 = 0
            r8 = r24
            rx3.l r3 = r3.mo8938f(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0404 }
            A r4 = r3.f38555d     // Catch:{ all -> 0x0404 }
            java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ all -> 0x0404 }
            int r9 = r4.intValue()     // Catch:{ all -> 0x0404 }
            B r3 = r3.f38556e     // Catch:{ all -> 0x0404 }
            r8 = r3
            android.text.SpannableString r8 = (android.text.SpannableString) r8     // Catch:{ all -> 0x0404 }
            r3 = r0
            r4 = r12
            r5 = r38
            r6 = r18
            r7 = r20
            r13 = r8
            r8 = r25
            rx3.l r3 = r3.mo8943k(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0404 }
            A r4 = r3.f38555d     // Catch:{ all -> 0x0404 }
            java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ all -> 0x0404 }
            int r8 = r4.intValue()     // Catch:{ all -> 0x0404 }
            B r3 = r3.f38556e     // Catch:{ all -> 0x0404 }
            r7 = r3
            android.text.SpannableString r7 = (android.text.SpannableString) r7     // Catch:{ all -> 0x0404 }
            r3 = r0
            r4 = r12
            r5 = r38
            r6 = r18
            r24 = r2
            r2 = r7
            r7 = r20
            r20 = r2
            r2 = r8
            r8 = r25
            rx3.l r3 = r3.mo8942j(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0404 }
            A r4 = r3.f38555d     // Catch:{ all -> 0x0404 }
            java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ all -> 0x0404 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0404 }
            B r3 = r3.f38556e     // Catch:{ all -> 0x0404 }
            android.text.SpannableString r3 = (android.text.SpannableString) r3     // Catch:{ all -> 0x0404 }
            rx3.l r5 = r0.mo8945m(r12, r10, r14)     // Catch:{ all -> 0x0404 }
            A r6 = r5.f38555d     // Catch:{ all -> 0x0404 }
            java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ all -> 0x0404 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0404 }
            B r5 = r5.f38556e     // Catch:{ all -> 0x0404 }
            android.text.SpannableString r5 = (android.text.SpannableString) r5     // Catch:{ all -> 0x0404 }
            gy3.a0 r7 = new gy3.a0     // Catch:{ all -> 0x0404 }
            r7.<init>()     // Catch:{ all -> 0x0404 }
            if (r15 == 0) goto L_0x01f9
            int r8 = r15.length()     // Catch:{ all -> 0x0404 }
            if (r8 != 0) goto L_0x01f7
            goto L_0x01f9
        L_0x01f7:
            r8 = 0
            goto L_0x01fa
        L_0x01f9:
            r8 = 1
        L_0x01fa:
            if (r8 == 0) goto L_0x0201
            if (r1 == 0) goto L_0x01ff
            goto L_0x0201
        L_0x01ff:
            r8 = 0
            goto L_0x0202
        L_0x0201:
            r8 = 1
        L_0x0202:
            r7.f27482d = r8     // Catch:{ all -> 0x0404 }
            java.lang.String r14 = "\n"
            if (r9 < 0) goto L_0x0213
            if (r8 == 0) goto L_0x020d
            r11.append(r14)     // Catch:{ all -> 0x0404 }
        L_0x020d:
            r11.append(r13)     // Catch:{ all -> 0x0404 }
            r8 = 1
            r7.f27482d = r8     // Catch:{ all -> 0x0404 }
        L_0x0213:
            if (r4 <= r2) goto L_0x0242
            if (r4 <= 0) goto L_0x0242
            if (r2 != 0) goto L_0x0242
            if (r4 < 0) goto L_0x0228
            boolean r8 = r7.f27482d     // Catch:{ all -> 0x0404 }
            if (r8 == 0) goto L_0x0222
            r11.append(r14)     // Catch:{ all -> 0x0404 }
        L_0x0222:
            r11.append(r3)     // Catch:{ all -> 0x0404 }
            r3 = 1
            r7.f27482d = r3     // Catch:{ all -> 0x0404 }
        L_0x0228:
            if (r2 < 0) goto L_0x026a
            er1.j4 r3 = er1.C58739j4.f168176a     // Catch:{ all -> 0x0404 }
            boolean r3 = r3.mo83686O(r10)     // Catch:{ all -> 0x0404 }
            if (r3 != 0) goto L_0x026a
            boolean r3 = r7.f27482d     // Catch:{ all -> 0x0404 }
            if (r3 == 0) goto L_0x0239
            r11.append(r14)     // Catch:{ all -> 0x0404 }
        L_0x0239:
            r8 = r20
            r11.append(r8)     // Catch:{ all -> 0x0404 }
            r3 = 1
            r7.f27482d = r3     // Catch:{ all -> 0x0404 }
            goto L_0x026a
        L_0x0242:
            r8 = r20
            if (r2 < 0) goto L_0x025b
            er1.j4 r13 = er1.C58739j4.f168176a     // Catch:{ all -> 0x0404 }
            boolean r13 = r13.mo83686O(r10)     // Catch:{ all -> 0x0404 }
            if (r13 != 0) goto L_0x025b
            boolean r13 = r7.f27482d     // Catch:{ all -> 0x0404 }
            if (r13 == 0) goto L_0x0255
            r11.append(r14)     // Catch:{ all -> 0x0404 }
        L_0x0255:
            r11.append(r8)     // Catch:{ all -> 0x0404 }
            r8 = 1
            r7.f27482d = r8     // Catch:{ all -> 0x0404 }
        L_0x025b:
            if (r4 < 0) goto L_0x026a
            boolean r8 = r7.f27482d     // Catch:{ all -> 0x0404 }
            if (r8 == 0) goto L_0x0264
            r11.append(r14)     // Catch:{ all -> 0x0404 }
        L_0x0264:
            r11.append(r3)     // Catch:{ all -> 0x0404 }
            r3 = 1
            r7.f27482d = r3     // Catch:{ all -> 0x0404 }
        L_0x026a:
            if (r6 < 0) goto L_0x0279
            boolean r3 = r7.f27482d     // Catch:{ all -> 0x0404 }
            if (r3 == 0) goto L_0x0273
            r11.append(r14)     // Catch:{ all -> 0x0404 }
        L_0x0273:
            r11.append(r5)     // Catch:{ all -> 0x0404 }
            r3 = 1
            r7.f27482d = r3     // Catch:{ all -> 0x0404 }
        L_0x0279:
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r38.mo3513o()     // Catch:{ all -> 0x0404 }
            yr3.a r3 = r3.getDescLayout()     // Catch:{ all -> 0x0404 }
            if (r3 == 0) goto L_0x0288
            int r3 = r3.mo109128l0()     // Catch:{ all -> 0x0404 }
            goto L_0x0289
        L_0x0288:
            r3 = 2
        L_0x0289:
            r5 = 2
            int r3 = java.lang.Math.min(r3, r5)     // Catch:{ all -> 0x0404 }
            r5 = 1
            if (r9 < r5) goto L_0x0293
            int r3 = r3 + 1
        L_0x0293:
            if (r2 < r5) goto L_0x0297
            int r3 = r3 + 1
        L_0x0297:
            if (r4 < r5) goto L_0x029b
            int r3 = r3 + 1
        L_0x029b:
            if (r6 < r5) goto L_0x029f
            int r3 = r3 + 1
        L_0x029f:
            r2 = 2
            int r9 = java.lang.Math.max(r3, r2)     // Catch:{ all -> 0x0404 }
            java.lang.System.nanoTime()     // Catch:{ all -> 0x0404 }
            if (r1 == 0) goto L_0x02bc
            android.graphics.drawable.Drawable r2 = r1.getDrawable()     // Catch:{ all -> 0x0404 }
            if (r2 == 0) goto L_0x02b4
            int r8 = r2.getIntrinsicWidth()     // Catch:{ all -> 0x0404 }
            goto L_0x02b5
        L_0x02b4:
            r8 = 0
        L_0x02b5:
            r2 = 4
            int r2 = kg3.C76577a.m92151b(r12, r2)     // Catch:{ all -> 0x0404 }
            int r8 = r8 + r2
            goto L_0x02bd
        L_0x02bc:
            r8 = 0
        L_0x02bd:
            boolean r2 = r7.f27482d     // Catch:{ all -> 0x0404 }
            if (r2 == 0) goto L_0x03b8
            if (r15 == 0) goto L_0x02cc
            int r2 = r15.length()     // Catch:{ all -> 0x0404 }
            if (r2 != 0) goto L_0x02ca
            goto L_0x02cc
        L_0x02ca:
            r2 = 0
            goto L_0x02cd
        L_0x02cc:
            r2 = 1
        L_0x02cd:
            if (r2 != 0) goto L_0x03b8
            if (r19 == 0) goto L_0x02da
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r38.mo3513o()     // Catch:{ all -> 0x0404 }
            yr3.a r2 = r2.getCardDescLayout()     // Catch:{ all -> 0x0404 }
            goto L_0x02e2
        L_0x02da:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r38.mo3513o()     // Catch:{ all -> 0x03b3 }
            yr3.a r2 = r2.getDescLayout()     // Catch:{ all -> 0x03b3 }
        L_0x02e2:
            if (r2 != 0) goto L_0x0314
            r3 = r18
            r2 = 2
            r3.setMaxLines(r2)     // Catch:{ all -> 0x0404 }
            android.text.TextPaint r2 = r3.getPaint()     // Catch:{ all -> 0x0404 }
            android.content.res.Resources r4 = r12.getResources()     // Catch:{ all -> 0x0404 }
            r5 = 2131826451(0x7f111713, float:1.9285787E38)
            java.lang.String r4 = r4.getString(r5)     // Catch:{ all -> 0x0404 }
            float r2 = r2.measureText(r4)     // Catch:{ all -> 0x0404 }
            r4 = 1066192077(0x3f8ccccd, float:1.1)
            float r2 = r2 * r4
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END     // Catch:{ all -> 0x0404 }
            r3.mo154992j(r4, r2)     // Catch:{ all -> 0x0404 }
            r3.mo104279b(r15)     // Catch:{ all -> 0x0404 }
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4 = r28
            yr3.a r2 = r3.mo154990i(r4, r2)     // Catch:{ all -> 0x0404 }
            goto L_0x0316
        L_0x0314:
            r3 = r18
        L_0x0316:
            r4 = r2
            r2 = 1
            float r5 = r4.mo109134r0(r2)     // Catch:{ all -> 0x03b3 }
            rx3.g r2 = er1.C7832m3.f26374c     // Catch:{ all -> 0x03b3 }
            rx3.n r2 = (rx3.C36570n) r2     // Catch:{ all -> 0x03b3 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x03b3 }
            java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ all -> 0x03b3 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x03b3 }
            int r6 = er1.C7832m3.f26377f     // Catch:{ all -> 0x03b3 }
            r7 = 2
            int r6 = r6 * 2
            int r2 = r2 - r6
            float r2 = (float) r2     // Catch:{ all -> 0x03b3 }
            float r5 = r2 - r5
            r6 = 1
            int r7 = r4.mo109129m0(r6)     // Catch:{ all -> 0x03b3 }
            if (r7 <= 0) goto L_0x033c
            r12 = 1
            goto L_0x033d
        L_0x033c:
            r12 = 0
        L_0x033d:
            if (r12 != 0) goto L_0x0344
            float r6 = (float) r8     // Catch:{ all -> 0x03b3 }
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x03b8
        L_0x0344:
            android.text.TextPaint r3 = r3.getPaint()     // Catch:{ all -> 0x03b3 }
            java.lang.String r5 = "…"
            float r3 = r3.measureText(r5)     // Catch:{ all -> 0x03b3 }
            r13 = 1067030938(0x3f99999a, float:1.2)
            float r3 = r3 * r13
            float r2 = r2 - r3
            float r3 = (float) r8
            float r2 = r2 - r3
            r3 = 1
            int r7 = r4.mo109131o0(r3, r2)     // Catch:{ all -> 0x03ff }
            r24.clear()     // Catch:{ all -> 0x0401 }
            r24.clearSpans()     // Catch:{ all -> 0x0401 }
            r5 = 2
            r3 = r0
            r6 = r15
            r8 = r12
            android.text.SpannableString r0 = r3.mo8941i(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0401 }
            r3 = r24
            r3.append(r0)     // Catch:{ all -> 0x0401 }
            if (r1 == 0) goto L_0x03ae
            int r0 = z04.C112550d0.m153765A(r3)     // Catch:{ all -> 0x0401 }
        L_0x0375:
            r2 = -1
            if (r2 >= r0) goto L_0x0390
            char r2 = r3.charAt(r0)     // Catch:{ all -> 0x0401 }
            r4 = 10
            if (r2 != r4) goto L_0x0382
            r8 = 1
            goto L_0x0383
        L_0x0382:
            r8 = 0
        L_0x0383:
            if (r8 != 0) goto L_0x038d
            r2 = 1
            int r0 = r0 + r2
            r2 = 0
            java.lang.CharSequence r0 = r3.subSequence(r2, r0)     // Catch:{ all -> 0x0401 }
            goto L_0x0394
        L_0x038d:
            int r0 = r0 + -1
            goto L_0x0375
        L_0x0390:
            r4 = 10
            r0 = r16
        L_0x0394:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder     // Catch:{ all -> 0x0401 }
            r2.<init>(r0)     // Catch:{ all -> 0x0401 }
            r0 = r22
            r2.append(r0)     // Catch:{ all -> 0x0401 }
            int r0 = r2.length()     // Catch:{ all -> 0x0401 }
            r3 = 1
            int r0 = r0 - r3
            int r3 = r2.length()     // Catch:{ all -> 0x0401 }
            r5 = 33
            r2.setSpan(r1, r0, r3, r5)     // Catch:{ all -> 0x0401 }
            goto L_0x03b1
        L_0x03ae:
            r4 = 10
            r2 = r3
        L_0x03b1:
            r8 = 1
            goto L_0x03c1
        L_0x03b3:
            r0 = move-exception
            r13 = 1067030938(0x3f99999a, float:1.2)
            goto L_0x0402
        L_0x03b8:
            r3 = r24
            r4 = 10
            r13 = 1067030938(0x3f99999a, float:1.2)
            r2 = r3
            r8 = 0
        L_0x03c1:
            java.lang.System.nanoTime()     // Catch:{ all -> 0x0401 }
            r2.append(r11)     // Catch:{ all -> 0x0401 }
            int r0 = z04.C112550d0.m153765A(r2)     // Catch:{ all -> 0x0401 }
            r1 = -1
        L_0x03cc:
            if (r1 >= r0) goto L_0x03e5
            char r3 = r2.charAt(r0)     // Catch:{ all -> 0x0401 }
            if (r3 != r4) goto L_0x03d6
            r3 = 1
            goto L_0x03d7
        L_0x03d6:
            r3 = 0
        L_0x03d7:
            if (r3 != 0) goto L_0x03e1
            r3 = 1
            int r0 = r0 + r3
            r1 = 0
            java.lang.CharSequence r0 = r2.subSequence(r1, r0)     // Catch:{ all -> 0x03ff }
            goto L_0x03e8
        L_0x03e1:
            r3 = 1
            int r0 = r0 + -1
            goto L_0x03cc
        L_0x03e5:
            r3 = 1
            r0 = r16
        L_0x03e8:
            android.text.SpannableString r1 = new android.text.SpannableString     // Catch:{ all -> 0x03ff }
            r1.<init>(r0)     // Catch:{ all -> 0x03ff }
            rx3.o r0 = new rx3.o     // Catch:{ all -> 0x03ff }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x03ff }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x03ff }
            r0.<init>(r2, r4, r1)     // Catch:{ all -> 0x03ff }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x03ff }
            goto L_0x0425
        L_0x03ff:
            r0 = move-exception
            goto L_0x041b
        L_0x0401:
            r0 = move-exception
        L_0x0402:
            r3 = 1
            goto L_0x041b
        L_0x0404:
            r0 = move-exception
            r3 = 1
            r13 = 1067030938(0x3f99999a, float:1.2)
            goto L_0x041b
        L_0x040a:
            r0 = move-exception
            r26 = r11
        L_0x040d:
            r16 = r15
            r3 = 1
            r13 = 1067030938(0x3f99999a, float:1.2)
            r15 = r8
            goto L_0x041b
        L_0x0415:
            r0 = move-exception
            r26 = r11
            r21 = r13
            goto L_0x040d
        L_0x041b:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
        L_0x0425:
            java.lang.Throwable r1 = kotlin.Result.m168117exceptionOrNullimpl(r0)
            if (r1 == 0) goto L_0x0452
            ft1.a r27 = ft1.C59319a.f169618b
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            er1.n3 r2 = new er1.n3
            r2.<init>(r1)
            r34 = 28
            r35 = 0
            java.lang.String r28 = "mergeContent_crash"
            r33 = r2
            o40.C11348f.C11349a.m11178b(r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r2 = "Finder.TextUtils"
            r5 = r16
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r5, r4)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0454
        L_0x0452:
            r5 = r16
        L_0x0454:
            boolean r1 = kotlin.Result.m168120isFailureimpl(r0)
            r2 = 0
            if (r1 == 0) goto L_0x045c
            r0 = r2
        L_0x045c:
            rx3.o r0 = (rx3.C13605o) r0
            if (r0 != 0) goto L_0x0475
            rx3.o r0 = new rx3.o
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            if (r15 != 0) goto L_0x0471
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r5)
            goto L_0x0472
        L_0x0471:
            r8 = r15
        L_0x0472:
            r0.<init>(r1, r4, r8)
        L_0x0475:
            C r1 = r0.f38559f
            android.text.SpannableString r1 = (android.text.SpannableString) r1
            int r4 = r1.length()
            if (r4 != 0) goto L_0x0481
            r8 = 1
            goto L_0x0482
        L_0x0481:
            r8 = 0
        L_0x0482:
            if (r8 == 0) goto L_0x0492
            if (r26 != 0) goto L_0x0487
            goto L_0x048e
        L_0x0487:
            r0 = 8
            r4 = r26
            r4.setVisibility(r0)
        L_0x048e:
            r7 = r36
            goto L_0x053d
        L_0x0492:
            r4 = r26
            rs1.s8$a r5 = rs1.C13442s8.f38060Q0
            r6 = r37
            android.content.Context r7 = r6.f173499A
            r8 = r21
            gy3.C87412m.m108593f(r7, r8)
            r5.mo12873f(r7)
            r5 = 0
            r4.mo154993k(r5, r13)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$a1 r5 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$a1
            r7 = r36
            r5.<init>(r6, r7, r10)
            r4.setOnClickListener(r5)
            r4.setEllipsize(r2)
            A r2 = r0.f38557d
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r10.mo3487U(r2)
            B r2 = r0.f38558e
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r4.setMaxLines(r2)
            r2 = 0
            r4.setVisibility(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r38.mo3513o()
            er1.n r5 = r5.getTopicClickExtra()
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
            android.content.Context r6 = r6.f173499A
            r8.<init>(r6)
            r5.f26404c = r8
            r4.mo104279b(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "content:"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = " nickname:"
            r5.append(r1)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r38.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            java.lang.String r1 = r1.nickname
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r5 = "Finder.FeedFullConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            C r1 = r0.f38559f
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0515
            r8 = 1
            goto L_0x0516
        L_0x0515:
            r8 = 0
        L_0x0516:
            if (r8 == 0) goto L_0x053d
            C r1 = r0.f38559f
            android.text.SpannableString r1 = (android.text.SpannableString) r1
            long r2 = r38.getItemId()
            java.lang.String r5 = "spannableString"
            gy3.C87412m.m108594g(r1, r5)
            yp1.a r6 = new yp1.a
            r6.<init>(r1, r4, r2)
            zp3.C23564m.m28138h(r4, r6)
            C r0 = r0.f38559f
            android.text.SpannableString r0 = (android.text.SpannableString) r0
            gy3.C87412m.m108594g(r0, r5)
            dp1.o1 r1 = new dp1.o1
            r1.<init>(r0, r10, r4)
            zp3.C23564m.m28138h(r4, r1)
        L_0x053d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2299i0(jq3.o, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    /* renamed from: j0 */
    public final void mo2300j0(C60905o oVar, T t) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(t, "item");
        View D = oVar.mo85812D(C0966R.C0970id.cva);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFav", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFav", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: k */
    public final void mo2301k(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        int i = 0;
        for (Number intValue : C64197v.m75537f(Integer.valueOf(C0966R.C0970id.f28), Integer.valueOf(C0966R.C0970id.f358431f24), Integer.valueOf(C0966R.C0970id.f1y), Integer.valueOf(C0966R.C0970id.f1u))) {
            FrameLayout frameLayout = (FrameLayout) oVar.mo85812D(intValue.intValue());
            if (frameLayout != null) {
                int b = C76577a.m92151b(oVar.f173499A, 10);
                frameLayout.setPadding(b, 0, b, 0);
            }
        }
        FrameLayout frameLayout2 = (FrameLayout) oVar.mo85812D(C0966R.C0970id.f1u);
        int b2 = C76577a.m92151b(oVar.f173499A, 16);
        if (frameLayout2 != null) {
            i = frameLayout2.getPaddingEnd();
        }
        int i2 = b2 - i;
        View D = oVar.mo85812D(C0966R.C0970id.itt);
        if (D != null) {
            ViewGroup.LayoutParams layoutParams = D.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(i2);
            D.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00af, code lost:
        if ((r12 != null ? r12.getMediaType() : 0) != 9) goto L_0x00b3;
     */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2302k0(jq3.C60905o r18, T r19, java.lang.Boolean r20) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            java.lang.Class<ht1.y2> r2 = ht1.C8817y2.class
            java.lang.String r3 = "holder"
            gy3.C87412m.m108594g(r0, r3)
            java.lang.String r3 = "item"
            gy3.C87412m.m108594g(r1, r3)
            er1.w3 r3 = er1.C58784w3.f168295a
            boolean r4 = r3.mo83880K0(r0, r1)
            java.lang.String r5 = "Finder.FeedFullConvert"
            r6 = 2131302879(0x7f0919df, float:1.8223857E38)
            r7 = 8
            if (r4 == 0) goto L_0x0031
            java.lang.String r1 = "refreshFinderLiveNoticeView is liveNoticeAd, skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            android.view.View r0 = r0.mo85812D(r6)
            com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView r0 = (com.tencent.p014mm.plugin.finder.view.FinderFeedLiveNoticeView) r0
            if (r0 != 0) goto L_0x002d
            goto L_0x0030
        L_0x002d:
            r0.setVisibility(r7)
        L_0x0030:
            return
        L_0x0031:
            android.view.View r4 = r0.mo85812D(r6)
            com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView r4 = (com.tencent.p014mm.plugin.finder.view.FinderFeedLiveNoticeView) r4
            go1.c r6 = go1.C8368c.f27352a
            int r8 = r18.hashCode()
            go1.a r14 = go1.C8366a.LIVE_NOTICE
            boolean r8 = r6.mo9335b(r8, r14)
            if (r8 != 0) goto L_0x004c
            if (r4 != 0) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            r4.setVisibility(r7)
        L_0x004b:
            return
        L_0x004c:
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r19.mo3513o()
            java.lang.String r11 = r8.getUserName()
            if (r4 == 0) goto L_0x016a
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r9 = r20
            boolean r8 = gy3.C87412m.m108589b(r9, r8)
            if (r8 == 0) goto L_0x0063
            r4.setVisibility(r7)
        L_0x0063:
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r19.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r8.contact
            if (r8 == 0) goto L_0x0072
            int r8 = r8.liveStatus
            goto L_0x0073
        L_0x0072:
            r8 = 2
        L_0x0073:
            r9 = 1
            if (r8 == r9) goto L_0x015f
            android.content.Context r8 = r0.f173499A
            java.lang.String r10 = "holder.context"
            gy3.C87412m.m108593f(r8, r10)
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r19.mo3513o()
            r3.getClass()
            java.lang.Class<tf0.p1> r3 = tf0.C64916p1.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            tf0.p1 r3 = (tf0.C64916p1) r3
            ht1.g4 r3 = r3.gr0(r8)
            r8 = 0
            if (r3 == 0) goto L_0x0098
            int r3 = r3.mo12864t3()
            goto L_0x0099
        L_0x0098:
            r3 = 0
        L_0x0099:
            if (r3 == r9) goto L_0x00b2
            if (r3 == r7) goto L_0x00b2
            r13 = 120(0x78, float:1.68E-43)
            if (r3 == r13) goto L_0x00b2
            r13 = 119(0x77, float:1.67E-43)
            if (r3 == r13) goto L_0x00b2
            if (r12 == 0) goto L_0x00ac
            int r3 = r12.getMediaType()
            goto L_0x00ad
        L_0x00ac:
            r3 = 0
        L_0x00ad:
            r12 = 9
            if (r3 == r12) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r9 = 0
        L_0x00b3:
            if (r9 == 0) goto L_0x015f
            java.lang.Class<ht1.v4> r3 = ht1.C8808v4.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ht1.v4 r3 = (ht1.C8808v4) r3
            boolean r3 = r3.mo9635e()
            if (r3 != 0) goto L_0x015f
            boolean r3 = r17.mo2260G()
            if (r3 != 0) goto L_0x015f
            android.content.Context r3 = r0.f173499A
            boolean r8 = r3 instanceof com.tencent.p014mm.p136ui.MMActivity
            java.lang.String r15 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            r16 = 0
            if (r8 == 0) goto L_0x00ed
            bl3.r r8 = bl3.C39818r.f106831a
            gy3.C87412m.m108592e(r3, r15)
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            bl3.r$a r3 = r8.mo62444c(r3)
            bl3.c r3 = r3.mo62447c(r2)
            ht1.y2 r3 = (ht1.C8817y2) r3
            ht1.z2 r3 = r3.mo9643v2()
            te3.d51 r3 = r3.mo9652q(r11)
            goto L_0x00ef
        L_0x00ed:
            r3 = r16
        L_0x00ef:
            if (r3 == 0) goto L_0x010d
            android.content.Context r9 = r0.f173499A
            gy3.C87412m.m108593f(r9, r10)
            r12 = 1
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r19.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.getFeedObject()
            long r7 = r8.f164794id
            java.lang.Long r13 = java.lang.Long.valueOf(r7)
            r8 = r4
            r10 = r3
            r8.mo4524b(r9, r10, r11, r12, r13)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x010f
        L_0x010d:
            r3 = r16
        L_0x010f:
            if (r3 != 0) goto L_0x0164
            int r3 = r4.getVisibility()
            if (r3 != 0) goto L_0x0159
            java.lang.String r3 = "notice info no cache ,request again"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            bl3.r r3 = bl3.C39818r.f106831a
            android.content.Context r5 = r0.f173499A
            gy3.C87412m.m108592e(r5, r15)
            com.tencent.mm.ui.MMActivity r5 = (com.tencent.p014mm.p136ui.MMActivity) r5
            bl3.r$a r3 = r3.mo62444c(r5)
            bl3.c r2 = r3.mo62447c(r2)
            ht1.y2 r2 = (ht1.C8817y2) r2
            ht1.z2 r2 = r2.mo9643v2()
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r19.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            if (r3 == 0) goto L_0x0144
            long r7 = r3.f164794id
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            goto L_0x0146
        L_0x0144:
            r3 = r16
        L_0x0146:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r19.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            if (r1 == 0) goto L_0x0153
            java.lang.String r1 = r1.objectNonceId
            goto L_0x0155
        L_0x0153:
            r1 = r16
        L_0x0155:
            r2.mo9649j0(r3, r1)
            goto L_0x0164
        L_0x0159:
            r1 = 8
            r4.setVisibility(r1)
            goto L_0x0164
        L_0x015f:
            r1 = 8
            r4.setVisibility(r1)
        L_0x0164:
            r17.mo2303l(r18)
            r6.mo9337d(r0, r4, r14)
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2302k0(jq3.o, com.tencent.mm.plugin.finder.model.BaseFinderFeed, java.lang.Boolean):void");
    }

    /* renamed from: l */
    public void mo2303l(C60905o oVar) {
        View D;
        View findViewById;
        C87412m.m108594g(oVar, "holder");
        View D2 = oVar.mo85812D(C0966R.C0970id.ol9);
        if (D2 != null && (D = oVar.mo85812D(C0966R.C0970id.e6u)) != null && (findViewById = D.findViewById(C0966R.C0970id.f358957i24)) != null) {
            findViewById.post(new C2328c(this, oVar, D2, D, findViewById));
        }
    }

    /* JADX WARNING: type inference failed for: r18v3, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2304l0(jq3.C60905o r32, T r33) {
        /*
            r31 = this;
            r0 = r32
            r1 = r33
            java.lang.String r2 = "holder"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "item"
            gy3.C87412m.m108594g(r1, r2)
            er1.w3 r2 = er1.C58784w3.f168295a
            boolean r2 = r2.mo83880K0(r0, r1)
            r3 = 2131302881(0x7f0919e1, float:1.822386E38)
            r4 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 0
            if (r2 == 0) goto L_0x006b
            java.lang.String r1 = "Finder.FeedFullConvert"
            java.lang.String r2 = "refreshFinderLivingStatusView is liveNoticeAd, skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            android.view.View r0 = r0.mo85812D(r3)
            if (r0 != 0) goto L_0x002e
            goto L_0x006a
        L_0x002e:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r1.mo10233c(r5)
            java.lang.Object[] r8 = r1.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r10 = "refreshFinderLivingStatusView"
            java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r0
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r1 = r1.mo10231a(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r9 = "refreshFinderLivingStatusView"
            java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
        L_0x006a:
            return
        L_0x006b:
            fe1.q r2 = r33.mo3507l()
            if (r2 == 0) goto L_0x0074
            int r2 = r2.field_liveStatus
            goto L_0x0075
        L_0x0074:
            r2 = 2
        L_0x0075:
            android.view.View r3 = r0.mo85812D(r3)
            if (r3 == 0) goto L_0x0316
            go1.c r15 = go1.C8368c.f27352a
            int r8 = r32.hashCode()
            go1.a r14 = go1.C8366a.LIVE_OPEN
            boolean r8 = r15.mo9335b(r8, r14)
            if (r8 != 0) goto L_0x00c6
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r0.mo10233c(r5)
            java.lang.Object[] r9 = r0.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r11 = "refreshFinderLivingStatusView"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r3
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r0 = r0.mo10231a(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.setVisibility(r0)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r10 = "refreshFinderLivingStatusView"
            java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x00c6:
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r33.mo3513o()
            java.lang.String r8 = r8.getUserName()
            java.lang.String r16 = ""
            if (r8 != 0) goto L_0x00d4
            r8 = r16
        L_0x00d4:
            r9 = 2131307876(0x7f092d64, float:1.8233992E38)
            android.view.View r9 = r0.mo85812D(r9)
            r13 = r9
            android.widget.TextView r13 = (android.widget.TextView) r13
            r9 = 2131307874(0x7f092d62, float:1.8233988E38)
            android.view.View r9 = r0.mo85812D(r9)
            r12 = r9
            android.widget.TextView r12 = (android.widget.TextView) r12
            android.content.Context r9 = r0.f173499A
            android.content.res.Resources r9 = r9.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            int r9 = r9.widthPixels
            double r9 = (double) r9
            r17 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r9 = r9 * r17
            int r9 = (int) r9
            r13.setMaxWidth(r9)
            android.content.Context r9 = r0.f173499A
            android.content.res.Resources r9 = r9.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            int r9 = r9.widthPixels
            double r9 = (double) r9
            double r9 = r9 * r17
            int r9 = (int) r9
            r12.setMaxWidth(r9)
            android.content.Context r9 = r0.f173499A
            android.content.res.Resources r9 = r9.getResources()
            r11 = 2131165261(0x7f07004d, float:1.7944734E38)
            float r9 = r9.getDimension(r11)
            r12.setTextSize(r6, r9)
            bl3.r r9 = bl3.C39818r.f106831a
            android.content.Context r10 = r0.f173499A
            java.lang.String r11 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r10, r11)
            com.tencent.mm.ui.MMActivity r10 = (com.tencent.p014mm.p136ui.MMActivity) r10
            bl3.r$a r9 = r9.mo62444c(r10)
            java.lang.Class<ht1.y2> r10 = ht1.C8817y2.class
            bl3.c r9 = r9.mo62447c(r10)
            ht1.y2 r9 = (ht1.C8817y2) r9
            ht1.z2 r9 = r9.mo9643v2()
            cj1.f6 r11 = r9.mo9647a1(r8)
            r18 = 0
            if (r11 == 0) goto L_0x0242
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r11.f1307a
            if (r9 == 0) goto L_0x0242
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r19 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r8.mo10233c(r10)
            java.lang.Object[] r10 = r8.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r21 = "refreshFinderLivingStatusView"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r4 = r8
            r8 = r3
            r26 = r9
            r9 = r10
            r10 = r20
            r7 = r11
            r11 = r21
            r27 = r12
            r12 = r22
            r28 = r13
            r13 = r23
            r29 = r14
            r14 = r24
            r30 = r15
            r15 = r25
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r10 = "refreshFinderLivingStatusView"
            java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            boolean r4 = r7.f1309c
            if (r4 == 0) goto L_0x01bf
            fe1.q r2 = r33.mo3507l()
            r4 = 2
            if (r2 != 0) goto L_0x01ac
            goto L_0x01ae
        L_0x01ac:
            r2.field_liveStatus = r4
        L_0x01ae:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r33.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.contact
            if (r2 != 0) goto L_0x01bb
            goto L_0x01bd
        L_0x01bb:
            r2.liveStatus = r4
        L_0x01bd:
            r7 = 2
            goto L_0x01c0
        L_0x01bf:
            r7 = r2
        L_0x01c0:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r33.mo3513o()
            te3.c21 r2 = r2.getLiveInfo()
            if (r2 != 0) goto L_0x01d6
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r33.mo3513o()
            r4 = r26
            te3.c21 r8 = r4.liveInfo
            r2.setLiveInfo(r8)
            goto L_0x01d8
        L_0x01d6:
            r4 = r26
        L_0x01d8:
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r4.objectDesc
            if (r2 == 0) goto L_0x01e0
            java.lang.String r2 = r2.description
            r18 = r2
        L_0x01e0:
            if (r18 == 0) goto L_0x01eb
            int r2 = r18.length()
            if (r2 != 0) goto L_0x01e9
            goto L_0x01eb
        L_0x01e9:
            r10 = 0
            goto L_0x01ec
        L_0x01eb:
            r10 = 1
        L_0x01ec:
            if (r10 != 0) goto L_0x0207
            er1.j4 r2 = er1.C58739j4.f168176a
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r8 = r4.objectDesc
            if (r8 == 0) goto L_0x01f8
            java.lang.String r8 = r8.description
            if (r8 != 0) goto L_0x01fa
        L_0x01f8:
            r8 = r16
        L_0x01fa:
            java.lang.String r2 = r2.mo83677E(r8)
            r15 = r27
            r15.setText(r2)
            r15.setVisibility(r6)
            goto L_0x020e
        L_0x0207:
            r15 = r27
            r2 = 8
            r15.setVisibility(r2)
        L_0x020e:
            java.lang.String r2 = r4.recommendReason
            if (r2 == 0) goto L_0x021b
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0219
            goto L_0x021b
        L_0x0219:
            r10 = 0
            goto L_0x021c
        L_0x021b:
            r10 = 1
        L_0x021c:
            if (r10 != 0) goto L_0x0230
            er1.j4 r2 = er1.C58739j4.f168176a
            java.lang.String r4 = r4.recommendReason
            if (r4 != 0) goto L_0x0226
            r4 = r16
        L_0x0226:
            java.lang.String r2 = r2.mo83677E(r4)
            r4 = r28
            r4.setText(r2)
            goto L_0x023e
        L_0x0230:
            r4 = r28
            android.content.Context r2 = r0.f173499A
            r8 = 2131826597(0x7f1117a5, float:1.9286083E38)
            java.lang.String r2 = r2.getString(r8)
            r4.setText(r2)
        L_0x023e:
            rx3.b0 r18 = rx3.C13598b0.f38549a
            r2 = r7
            goto L_0x0248
        L_0x0242:
            r4 = r13
            r29 = r14
            r30 = r15
            r15 = r12
        L_0x0248:
            if (r18 != 0) goto L_0x028a
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r7.mo10233c(r5)
            java.lang.Object[] r9 = r7.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r11 = "refreshFinderLivingStatusView"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r5 = "(I)V"
            r8 = r3
            r16 = r15
            r15 = r5
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r5 = r7.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r10 = "refreshFinderLivingStatusView"
            java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x028c
        L_0x028a:
            r16 = r15
        L_0x028c:
            int r5 = r16.getVisibility()
            if (r5 != 0) goto L_0x02b6
            android.content.Context r5 = r0.f173499A
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131165444(0x7f070104, float:1.7945105E38)
            float r5 = r5.getDimension(r7)
            r4.setTextSize(r6, r5)
            android.content.Context r5 = r0.f173499A
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131100932(0x7f060504, float:1.781426E38)
            int r5 = r5.getColor(r6)
            r4.setTextColor(r5)
            er1.C7919x.m8092b(r4)
            goto L_0x02d9
        L_0x02b6:
            android.content.Context r5 = r0.f173499A
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131165261(0x7f07004d, float:1.7944734E38)
            float r5 = r5.getDimension(r7)
            r4.setTextSize(r6, r5)
            android.content.Context r5 = r0.f173499A
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131100935(0x7f060507, float:1.7814265E38)
            int r5 = r5.getColor(r6)
            r4.setTextColor(r5)
            er1.C7919x.m8091a(r4)
        L_0x02d9:
            r4 = 1
            if (r2 != r4) goto L_0x0304
            java.lang.Class<l31.e> r2 = l31.C61212e.class
            di3.d r4 = di3.C86312j.m106911c(r2)
            l31.e r4 = (l31.C61212e) r4
            java.lang.String r5 = "living_label"
            r4.o30(r3, r5)
            di3.d r4 = di3.C86312j.m106911c(r2)
            l31.e r4 = (l31.C61212e) r4
            r5 = 40
            r6 = 26236(0x667c, float:3.6764E-41)
            r4.mo86175pO(r3, r5, r6)
            di3.d r2 = di3.C86312j.m106911c(r2)
            l31.e r2 = (l31.C61212e) r2
            ve1.t1 r4 = new ve1.t1
            r4.<init>(r1)
            r2.E60(r3, r4)
        L_0x0304:
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$b1 r2 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$b1
            r2.<init>(r0, r1)
            r3.setOnClickListener(r2)
            r31.mo2303l(r32)
            r2 = r29
            r1 = r30
            r1.mo9337d(r0, r3, r2)
        L_0x0316:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2304l0(jq3.o, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    /* renamed from: m */
    public final void mo2305m(C60905o oVar, int i) {
        C87412m.m108594g(oVar, "holder");
        View D = oVar.mo85812D(C0966R.C0970id.a2s);
        boolean[] zArr = {false};
        D.setOnTouchListener(new C2331d(zArr));
        ((C61212e) C86312j.m106911c(C61212e.class)).o30(D, "finder_feed_like");
        D.setOnClickListener(new C2334e(zArr, oVar, this, i));
        D.setOnLongClickListener(new C2337f(oVar, this, i));
        D.setHapticFeedbackEnabled(false);
    }

    /* renamed from: m0 */
    public void mo2306m0(C60905o oVar) {
        String str;
        int i;
        int i2;
        C60905o oVar2 = oVar;
        C87412m.m108594g(oVar2, "holder");
        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) oVar2.f173503E;
        FrameLayout frameLayout = (FrameLayout) oVar2.mo85812D(C0966R.C0970id.cy9);
        if (frameLayout != null) {
            C13601g<Integer> gVar = C13345o3.f37843d;
            long itemId = baseFinderFeed.getItemId();
            View findViewById = frameLayout.findViewById(C0966R.C0970id.ec7);
            if (findViewById.getVisibility() != 0) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$Companion", "resetHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/widget/FrameLayout;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$Companion", "resetHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/widget/FrameLayout;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i2 = C0966R.C0970id.ec8;
                TextView textView = (TextView) frameLayout.findViewById(C0966R.C0970id.ec8);
                C87412m.m108593f(textView, LocaleUtil.ITALIAN);
                C7919x.m8091a(textView);
                textView.setText(C0966R.string.k36);
                textView.setTextColor(oVar2.f173499A.getResources().getColor(C0966R.color.f2975b6));
                i = C0966R.C0970id.ec5;
                View findViewById2 = frameLayout.findViewById(C0966R.C0970id.ec5);
                findViewById2.setBackground(frameLayout.getContext().getDrawable(C0966R.C0969drawable.a44));
                findViewById2.setPadding(findViewById2.getResources().getDimensionPixelOffset(C0966R.dimen.auz), findViewById2.getPaddingTop(), findViewById2.getResources().getDimensionPixelOffset(C0966R.dimen.auz), findViewById2.getPaddingBottom());
            } else {
                i2 = C0966R.C0970id.ec8;
                i = C0966R.C0970id.ec5;
            }
            View findViewById3 = frameLayout.findViewById(i);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(4);
            View view2 = findViewById3;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$Companion", "resetHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/widget/FrameLayout;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC$Companion", "resetHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/widget/FrameLayout;J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            str = null;
            findViewById3.setOnClickListener((View.OnClickListener) null);
            ((EllipsizedTextView) frameLayout.findViewById(C0966R.C0970id.bh6)).setTextSize(0, frameLayout.getContext().getResources().getDimension(C0966R.dimen.f3879hn));
            boolean z = frameLayout instanceof FinderAuthorAreaLayout;
            FinderAuthorAreaLayout finderAuthorAreaLayout = z ? (FinderAuthorAreaLayout) frameLayout : null;
            if (finderAuthorAreaLayout != null) {
                finderAuthorAreaLayout.setShrinkText(false);
            }
            FinderAuthorAreaLayout finderAuthorAreaLayout2 = z ? (FinderAuthorAreaLayout) frameLayout : null;
            if (finderAuthorAreaLayout2 != null) {
                finderAuthorAreaLayout2.setFeed((BaseFinderFeed) oVar2.f173503E);
            }
            ((TextView) frameLayout.findViewById(i2)).setTextSize(0, frameLayout.getContext().getResources().getDimension(C0966R.dimen.f3817fa));
            FadeOutLinearLayout fadeOutLinearLayout = (FadeOutLinearLayout) frameLayout.findViewById(C0966R.C0970id.brz);
            if (fadeOutLinearLayout != null) {
                fadeOutLinearLayout.mo4368b(0, itemId);
            }
        } else {
            str = null;
        }
        C13442s8.C13443a aVar3 = C13442s8.f38060Q0;
        Context context = oVar2.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13442s8 f = aVar3.mo12873f(context);
        int i3 = f != null ? f.f38096i : 0;
        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.fpi);
        if (textView2 != null) {
            textView2.setTextSize(0, (float) C76577a.m92155f(textView2.getContext(), C0966R.dimen.f3645a3));
            C58961d.C58963b bVar = C58961d.f168673a;
            String str2 = baseFinderFeed.mo3513o().field_username;
            C64284cg bizInfo = baseFinderFeed.mo3513o().getBizInfo();
            boolean h = C58961d.C58963b.m68836h(bVar, str2, bizInfo != null ? bizInfo.f182468d : str, false, false, 12, (Object) null);
            if (this.f12565f) {
                oVar2.mo85817I(C0966R.C0970id.fpi, 8);
            } else if (this.f12566g != 3 && h && i3 != 1 && i3 != 156 && !C58784w3.f168295a.mo83897Q0(baseFinderFeed)) {
                textView2.setVisibility(0);
                textView2.setAlpha(1.0f);
                textView2.setText(textView2.getContext().getResources().getString(C0966R.string.fje));
                textView2.setTextColor(oVar2.f173499A.getResources().getColor(this.f12567h ? C0966R.color.BW_0_Alpha_0_3 : C0966R.color.f3583yg));
                textView2.setBackgroundResource(this.f12567h ? C0966R.C0969drawable.cil : C0966R.C0969drawable.f5117xb);
            } else if (!h) {
                textView2.setVisibility(8);
                if (baseFinderFeed.mo3472F()) {
                    mo2319t(oVar2, baseFinderFeed, false);
                }
            } else {
                textView2.setVisibility(8);
            }
            mo2268K(oVar2, h ? C11922r.C11923a.Follow : C11922r.C11923a.UnFollow);
            if (!baseFinderFeed.mo3472F() && !h) {
                textView2.setVisibility(8);
            }
        }
    }

    /* renamed from: n */
    public void mo2307n(C60905o oVar, T t, int i) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(t, "item");
        FinderMediaLayout finderMediaLayout = (FinderMediaLayout) oVar.mo85812D(C0966R.C0970id.ol_);
        LinkedList<C64689rq2> mediaList = t.mo3513o().getMediaList();
        C58784w3 w3Var = C58784w3.f168295a;
        View findViewById = finderMediaLayout.findViewById(C0966R.C0970id.ol9);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_media_banner)");
        FinderBaseMediaBanner finderBaseMediaBanner = (FinderBaseMediaBanner) findViewById;
        float e0 = w3Var.mo83925e0(mediaList);
        ViewParent parent = oVar.mo85811C().getParent().getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        int bottom = ((View) parent).getBottom();
        C58969q l = t.mo3507l();
        String str = null;
        String nickname = l != null ? l.getNickname() : null;
        long itemId = t.getItemId();
        C50124kf1 kf12 = t.mo3513o().getFeedObject().object_extend;
        w3Var.mo83919c(finderMediaLayout, finderBaseMediaBanner, e0, bottom, nickname, itemId, kf12 != null ? kf12.f136758t : 0);
        StringBuilder sb = new StringBuilder();
        sb.append("isLiveFeed:");
        sb.append(C58739j4.f168176a.mo83686O(t));
        sb.append(" desc: ");
        FinderObjectDesc finderObjectDesc = t.mo3513o().getFeedObject().objectDesc;
        if (finderObjectDesc != null) {
            str = finderObjectDesc.description;
        }
        sb.append(str);
        Log.m105924i("Finder.FeedFullConvert", sb.toString());
    }

    /* renamed from: n0 */
    public final void mo2308n0(T t, C60905o oVar) {
        TextView textView;
        String str;
        FinderItem e;
        C87412m.m108594g(t, "item");
        C87412m.m108594g(oVar, "holder");
        LinearLayout linearLayout = (LinearLayout) oVar.mo85812D(C0966R.C0970id.ji4);
        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) oVar.f173503E;
        WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.f358430f22);
        if (weImageView != null) {
            weImageView.mo104518r(C0966R.raw.finder_full_share_outlined, baseFinderFeed.mo3479M() ? C0966R.color.f3395rc : this.f12567h ? C0966R.color.BW_0_Alpha_0_9 : C0966R.color.f3585yj);
        }
        View D = oVar.mo85812D(C0966R.C0970id.edb);
        if (D != null && (textView = (TextView) D.findViewById(C0966R.C0970id.jhv)) != null) {
            if (this.f12567h) {
                textView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
            }
            C37521f.f99374d.getClass();
            int i = 1;
            int forwardCount = (!(C37521f.f99511s4.mo60266n().intValue() == 1) || (e = C65834e.f189316a.mo89871e(t.getItemId())) == null) ? t.mo3513o().getForwardCount() : e.getForwardCount();
            if (forwardCount > 0 || this.f12564e.mo2497u0()) {
                if (!this.f12564e.mo2497u0()) {
                    i = 2;
                }
                str = C7878t0.m8034c(i, forwardCount);
                C87412m.m108593f(str, "formatNumber(\n          …rdCount\n                )");
                if (linearLayout != null) {
                    linearLayout.setTag(C0966R.C0970id.d3u, str);
                }
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
            } else {
                str = oVar.f173499A.getString(C0966R.string.f360777ep1);
                C87412m.m108593f(str, "holder.context.getString…g.finder_share_icon_text)");
                if (linearLayout != null) {
                    linearLayout.setTag(C0966R.C0970id.d3u, "0");
                }
                C85875k4.m106193l0(textView.getPaint());
            }
            textView.setText(str);
        }
    }

    /* renamed from: o */
    public final void mo2309o(C60905o oVar, T t) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(t, "item");
        if (t instanceof C55018j0) {
            if (((C62168u) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62168u.class)).mo87221e3(t.getItemId()) != null) {
                Log.m105928w("Finder.FeedFullConvert", "checkAutoSeek return for mp jump.");
                return;
            }
            C51542ug1 ug12 = t.mo3513o().getFeedObject().playhistory_info;
            int i = (ug12 != null ? ug12.f142847d : 0) / 1000;
            FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a);
            if (finderVideoLayout != null) {
                int i2 = FinderVideoLayout.f161844x0;
                finderVideoLayout.mo79570n((long) i, -1, "getCommentDetail");
            }
            ((C55018j0) t).f154481f = true;
        }
    }

    /* renamed from: o0 */
    public void mo2310o0(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.egm);
        if (this.f12567h) {
            textView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.BW_0_Alpha_0_5));
        }
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        Object systemService = context.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        float f = (12.0f * displayMetrics.density) / context.getResources().getDisplayMetrics().density;
        if (textView != null) {
            textView.setTextSize(1, f);
        }
        FlowTextMixView flowTextMixView = (FlowTextMixView) oVar.f44854d.findViewById(C0966R.C0970id.eam);
        if (textView != null) {
            textView.setVisibility(8);
        }
        C87412m.m108593f(flowTextMixView, "flowTextMixView");
        C61926c.m72676a(flowTextMixView, new C2330c1(oVar, flowTextMixView, textView, this));
    }

    /* renamed from: p */
    public final void mo2311p(C60905o oVar, int i) {
        String str;
        String str2;
        int i2;
        String str3;
        C13442s8.C13443a aVar;
        String str4;
        String str5;
        BaseFinderFeed baseFinderFeed;
        C49712hj1 hj12;
        BaseFinderFeed baseFinderFeed2;
        boolean z;
        boolean z2;
        C51108rh0 rh02;
        Class cls;
        String str6;
        String str7;
        C49712hj1 hj13;
        String str8;
        int i3;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        C60905o oVar2 = oVar;
        Class<C13554z> cls2 = C13554z.class;
        Class<C13442s8> cls3 = C13442s8.class;
        Class<C10432i> cls4 = C10432i.class;
        Class cls5 = C58417y0.class;
        C87412m.m108594g(oVar2, "holder");
        BaseFinderFeed baseFinderFeed3 = (BaseFinderFeed) oVar2.f173503E;
        C64284cg bizInfo = baseFinderFeed3.mo3513o().getBizInfo();
        boolean z3 = bizInfo != null;
        if (z3) {
            C87412m.m108591d(bizInfo);
            str = bizInfo.f182468d;
            if (str == null) {
                str = "";
            }
        } else {
            str = baseFinderFeed3.mo3513o().getUserName();
        }
        C87412m.m108593f(str, "if (isBiz) { bizInfo!!.b…tem.feedObject.userName }");
        String str14 = "link_avatar_profile";
        String str15 = "kvJson.toString()";
        String str16 = "";
        String str17 = "finderusername";
        String str18 = "UICProvider.of(holder.co…rReporterUIC::class.java)";
        Class<C13442s8> cls6 = cls3;
        if (z3) {
            if (str.length() == 0) {
                Log.m105920e("Finder.FeedFullConvert", "jumpBizProfile: biz username is null");
                return;
            }
            BaseFinderFeed baseFinderFeed4 = (BaseFinderFeed) oVar2.f173503E;
            Intent intent = new Intent();
            C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
            Class<C13554z> cls7 = cls2;
            Context context = oVar2.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13442s8.C13443a.m12791e(aVar2, context, intent, baseFinderFeed4.getItemId(), (String) null, 0, 1, false, 0, 192, (Object) null);
            intent.putExtra("Contact_User", str);
            intent.putExtra("Contact_Scene", 213);
            intent.putExtra("biz_profile_enter_from_finder", true);
            intent.putExtra("force_get_contact", true);
            intent.putExtra("key_use_new_contact_profile", true);
            String str19 = "finder_from_feed_type";
            Class<C10432i> cls8 = cls4;
            intent.putExtra("finder_feed_id", baseFinderFeed4.getItemId());
            intent.putExtra("biz_profile_tab_type", 1);
            String str20 = baseFinderFeed4.mo3513o().getFeedObject().sessionBuffer;
            if (str20 == null || str20.length() == 0) {
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls5);
                long itemId = baseFinderFeed4.getItemId();
                cls = cls5;
                Context context2 = oVar2.f173499A;
                C87412m.m108593f(context2, "holder.context");
                C13442s8 f = aVar2.mo12873f(context2);
                str6 = y0Var.mo83281Cu(itemId, f != null ? f.f38096i : 0);
            } else {
                cls = cls5;
                str6 = baseFinderFeed4.mo3513o().getFeedObject().sessionBuffer;
            }
            intent.putExtra("Contact_Scene_Note", str6);
            intent.putExtra("finder_from_feed_id", baseFinderFeed4.mo3513o().getId());
            Context context3 = oVar2.f173499A;
            C87412m.m108593f(context3, "holder.context");
            C13442s8 f2 = aVar2.mo12873f(context3);
            intent.putExtra("finder_from_feed_comment_scene", f2 != null ? f2.f38096i : 0);
            intent.putExtra(str19, baseFinderFeed4.mo3513o().isLiveFeed() ? 1 : 2);
            Context context4 = oVar2.f173499A;
            C87412m.m108593f(context4, "holder.context");
            C13442s8 f3 = aVar2.mo12873f(context4);
            C49712hj1 q3 = f3 != null ? f3.mo12861q3() : null;
            if (((Boolean) ((C36570n) this.f12574r).getValue()).booleanValue()) {
                C39818r rVar = C39818r.f106831a;
                Context context5 = oVar2.f173499A;
                C87412m.m108592e(context5, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((C8817y2) rVar.mo62444c((MMActivity) context5).mo62447c(C8817y2.class)).mo9643v2();
                Context context6 = oVar2.f173499A;
                C87412m.m108593f(context6, "holder.context");
                C13442s8 f4 = aVar2.mo12873f(context6);
                if (!(f4 == null || (str11 = f4.f38107v) == null)) {
                    try {
                        String optString = new JSONObject(str11).optString("sns_ad");
                        if (!Util.isNullOrNil(optString)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("adReportInfo", optString);
                            jSONObject.put("commentscene", q3 != null ? q3.f134675i : 0);
                            if (q3 == null || (str12 = q3.f134672f) == null) {
                                str12 = str16;
                            }
                            jSONObject.put("clicktabcontextid", str12);
                            if (q3 == null || (str13 = q3.f134671e) == null) {
                                str13 = str16;
                            }
                            jSONObject.put("findercontextid", str13);
                            jSONObject.put("feedid", C61926c.m72691p(baseFinderFeed4.getItemId()));
                            String jSONObject2 = jSONObject.toString();
                            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
                            intent.putExtra("Contact_Finder_Buffer", C112551y.m153814n(jSONObject2, ",", ";", false));
                        }
                    } catch (Exception unused) {
                        Log.m105920e("Finder.FeedFullConvert", "jumpBizProfile parse ad info");
                    }
                }
            } else {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("commentscene", q3 != null ? q3.f134675i : 0);
                if (q3 == null || (str9 = q3.f134672f) == null) {
                    str9 = str16;
                }
                jSONObject3.put("clicktabcontextid", str9);
                if (q3 == null || (str10 = q3.f134671e) == null) {
                    str10 = str16;
                }
                jSONObject3.put("findercontextid", str10);
                jSONObject3.put("feedid", C61926c.m72691p(baseFinderFeed4.getItemId()));
                String jSONObject4 = jSONObject3.toString();
                C87412m.m108593f(jSONObject4, "JSONObject().apply {\n   …\n            }.toString()");
                intent.putExtra("Contact_Finder_Buffer", C112551y.m153814n(jSONObject4, ",", ";", false));
            }
            C37521f.f99374d.getClass();
            if (C37521f.f99399f7.mo60266n().intValue() == 1) {
                C10432i iVar = (C10432i) C86312j.m106911c(cls8);
                boolean e = iVar != null ? iVar.mo10750e() : false;
                Context context7 = oVar2.f173499A;
                boolean z4 = !(context7 instanceof FinderShareFeedRelUI) && !(context7 instanceof FinderShareFeedDetailUI) && !(context7 instanceof FinderMsgFeedDetailUI);
                if (e && !z4) {
                    ((C10432i) C86312j.m106911c(cls8)).mo10755m4(oVar2.f173499A);
                } else if (context7 instanceof MMActivity) {
                    C39818r rVar2 = C39818r.f106831a;
                    C87412m.m108593f(context7, "holder.context");
                    C13554z zVar = (C13554z) rVar2.mo62443b(context7).mo75002a(cls7);
                    C10008v1 v1Var = this.f12564e;
                    FinderTimelinePresenter finderTimelinePresenter = v1Var instanceof FinderTimelinePresenter ? (FinderTimelinePresenter) v1Var : null;
                    FinderHomeTabFragment finderHomeTabFragment = finderTimelinePresenter != null ? finderTimelinePresenter.f13267h : null;
                    zVar.getClass();
                    str7 = str15;
                    Intent intent2 = intent;
                    RecyclerViewDrawerSquares.C45117c c3 = zVar.mo12956c3(finderHomeTabFragment, baseFinderFeed4, oVar, C13132c0.f37370d, C13175d0.f37477d);
                    C13559z0 z0Var = (C13559z0) rVar2.mo62444c((AppCompatActivity) context7).mo62449e(C13559z0.class);
                    if (z0Var != null) {
                        z0Var.mo12957c3((MMActivity) context7, intent2, c3, mo2330z(oVar));
                    }
                }
                str7 = str15;
            } else {
                str7 = str15;
                C88144b.m109791i(oVar2.f173499A, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            }
            Context context8 = oVar2.f173499A;
            if (context8 instanceof MMActivity) {
                C39818r rVar3 = C39818r.f106831a;
                C87412m.m108592e(context8, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                C39622i0 a = rVar3.mo62444c((MMActivity) context8).mo75002a(cls6);
                C87412m.m108593f(a, str18);
                C7322a b = C60172g4.C60173a.m70190b((C60172g4) a, 0, 1, (Object) null);
                if (b != null) {
                    b.mo8766a(new C7322a.C7323a(9, baseFinderFeed4.getItemId()));
                }
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(str17, baseFinderFeed4.mo3513o().getUserName());
            C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls);
            String jSONObject6 = jSONObject5.toString();
            C87412m.m108593f(jSONObject6, str7);
            String n = C112551y.m153814n(jSONObject6, ",", ";", false);
            C13442s8.C13443a aVar3 = C13442s8.f38060Q0;
            Context context9 = oVar2.f173499A;
            C87412m.m108593f(context9, "holder.context");
            C13442s8 f5 = aVar3.mo12873f(context9);
            if (f5 != null) {
                hj13 = f5.mo12861q3();
                str8 = str14;
                i3 = 1;
            } else {
                str8 = str14;
                i3 = 1;
                hj13 = null;
            }
            y0Var2.Cx0(i3, str8, n, hj13);
            return;
        }
        Class<C10432i> cls9 = cls4;
        Class cls10 = cls5;
        String str21 = str15;
        String str22 = str17;
        String str23 = str18;
        Class<C13442s8> cls11 = cls6;
        Class<C13554z> cls12 = cls2;
        String str24 = "finder_from_feed_type";
        String str25 = str14;
        BaseFinderFeed baseFinderFeed5 = (BaseFinderFeed) oVar2.f173503E;
        String str26 = ";";
        C13442s8.C13443a aVar4 = C13442s8.f38060Q0;
        String str27 = str25;
        Context context10 = oVar2.f173499A;
        C87412m.m108593f(context10, "holder.context");
        C13442s8 f6 = aVar4.mo12873f(context10);
        if (f6 != null) {
            i2 = f6.f38096i;
            str2 = ",";
        } else {
            str2 = ",";
            i2 = 0;
        }
        Intent intent3 = new Intent();
        String str28 = str22;
        Context context11 = oVar2.f173499A;
        String str29 = str21;
        MMActivity mMActivity = context11 instanceof MMActivity ? (MMActivity) context11 : null;
        if (mMActivity != null) {
            str3 = str23;
            intent3.putExtra("key_to_user_name", mMActivity.getIntent().getStringExtra("key_to_user_name"));
            intent3.putExtra("from_user", mMActivity.getIntent().getStringExtra("from_user"));
            intent3.putExtra("key_from_user_name", mMActivity.getIntent().getStringExtra("key_from_user_name"));
            intent3.putExtra("report_scene", mMActivity.getIntent().getIntExtra("report_scene", 0));
        } else {
            str3 = str23;
        }
        intent3.putExtra("finder_username", baseFinderFeed5.mo3513o().getUserName());
        Class<C13442s8> cls13 = cls11;
        intent3.putExtra("finder_read_feed_id", baseFinderFeed5.mo3513o().getId());
        intent3.putExtra("finder_from_feed_id", baseFinderFeed5.mo3513o().getId());
        intent3.putExtra("finder_from_feed_comment_scene", i2);
        intent3.putExtra(str24, baseFinderFeed5.mo3513o().isLiveFeed() ? 1 : 2);
        C50124kf1 kf12 = baseFinderFeed5.mo3513o().getFeedObject().object_extend;
        intent3.putExtra("key_finder_collection_id", (kf12 == null || (rh02 = kf12.f136745d) == null) ? null : Long.valueOf(rh02.f140917d));
        Context context12 = oVar2.f173499A;
        if (!(context12 instanceof FinderShareFeedRelUI) && !(context12 instanceof FinderShareFeedDetailUI) && !(context12 instanceof FinderMsgFeedDetailUI)) {
            intent3.putExtra("KEY_FROM_TIMELINE", true);
        }
        intent3.putExtra("key_entrance_type", i);
        Context context13 = oVar2.f173499A;
        C87412m.m108593f(context13, "holder.context");
        C13442s8.C13443a.m12791e(aVar4, context13, intent3, baseFinderFeed5.getItemId(), (String) null, 0, 1, false, 0, 192, (Object) null);
        String str30 = "Finder.FeedFullConvert";
        String str31 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity";
        ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9610ca(baseFinderFeed5, (long) oVar.mo17363j(), String.valueOf(i2));
        C37521f.f99374d.getClass();
        if (C37521f.f99399f7.mo60266n().intValue() == 1) {
            Class cls14 = FinderProfileDrawerUIC.class;
            BaseFinderFeed baseFinderFeed6 = (BaseFinderFeed) oVar2.f173503E;
            Context context14 = oVar2.f173499A;
            C87412m.m108593f(context14, "holder.context");
            C13442s8 f7 = aVar4.mo12873f(context14);
            int i4 = f7 != null ? f7.f38096i : 0;
            boolean z5 = (i4 == 1 && baseFinderFeed6.mo3513o().getBizInfo() == null) || i4 == 8 || i4 == 120;
            C10432i iVar2 = (C10432i) C86312j.m106911c(cls9);
            if (iVar2 != null) {
                z = iVar2.mo10750e();
                baseFinderFeed2 = baseFinderFeed5;
                z2 = false;
            } else {
                baseFinderFeed2 = baseFinderFeed5;
                z2 = false;
                z = false;
            }
            boolean booleanExtra = intent3.getBooleanExtra("KEY_FROM_TIMELINE", z2);
            if (!z || booleanExtra) {
                String userName = baseFinderFeed6.mo3513o().getUserName();
                C39818r rVar4 = C39818r.f106831a;
                Context context15 = oVar2.f173499A;
                C87412m.m108593f(context15, "holder.context");
                if (rVar4.mo62443b(context15).mo62449e(cls14) != null) {
                    aVar = aVar4;
                    ((C119157j) C119157j.f356862d).mo183875f(new C14555k1(userName, baseFinderFeed6));
                    long uptimeMillis = SystemClock.uptimeMillis();
                    intent3.putExtra("finder_read_feed_id", z5 ? 0 : baseFinderFeed6.mo3513o().getId());
                    intent3.putExtra("finder_from_feed_id", baseFinderFeed6.mo3513o().getId());
                    intent3.putExtra("finder_from_feed_comment_scene", i4);
                    intent3.putExtra(str24, baseFinderFeed6.mo3513o().isLiveFeed() ? 1 : 2);
                    Context context16 = oVar2.f173499A;
                    C87412m.m108593f(context16, "holder.context");
                    FinderProfileDrawerUIC finderProfileDrawerUIC = (FinderProfileDrawerUIC) rVar4.mo62443b(context16).mo62449e(cls14);
                    Context context17 = oVar2.f173499A;
                    C87412m.m108593f(context17, "holder.context");
                    C13554z zVar2 = (C13554z) rVar4.mo62443b(context17).mo75002a(cls12);
                    C10008v1 v1Var2 = this.f12564e;
                    FinderTimelinePresenter finderTimelinePresenter2 = v1Var2 instanceof FinderTimelinePresenter ? (FinderTimelinePresenter) v1Var2 : null;
                    FinderHomeTabFragment finderHomeTabFragment2 = finderTimelinePresenter2 != null ? finderTimelinePresenter2.f13267h : null;
                    zVar2.getClass();
                    C13325m0 m0Var = new C13325m0(finderProfileDrawerUIC);
                    C13335n0 n0Var = new C13335n0(finderProfileDrawerUIC);
                    baseFinderFeed = baseFinderFeed2;
                    str5 = str27;
                    str4 = str28;
                    zVar2.mo12956c3(finderHomeTabFragment2, baseFinderFeed6, oVar, m0Var, n0Var);
                    Context context18 = oVar2.f173499A;
                    C87412m.m108593f(context18, "holder.context");
                    FinderProfileDrawerUIC finderProfileDrawerUIC2 = (FinderProfileDrawerUIC) rVar4.mo62443b(context18).mo62449e(cls14);
                    if (finderProfileDrawerUIC2 != null) {
                        finderProfileDrawerUIC2.mo5169e3(intent3, mo2330z(oVar));
                    }
                    Log.m105924i(str30, "profile updateData COST: " + (SystemClock.uptimeMillis() - uptimeMillis) + LocaleUtil.MALAY);
                }
            } else {
                ((C10432i) C86312j.m106911c(cls9)).mo10755m4(oVar2.f173499A);
            }
            aVar = aVar4;
            str5 = str27;
            str4 = str28;
            baseFinderFeed = baseFinderFeed2;
        } else {
            baseFinderFeed = baseFinderFeed5;
            aVar = aVar4;
            str5 = str27;
            str4 = str28;
            Context context19 = oVar2.f173499A;
            C87412m.m108593f(context19, "holder.context");
            ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context19, intent3);
        }
        if (oVar2.f173499A instanceof MMActivity) {
            ((C58417y0) C86312j.m106911c(cls10)).wx0(oVar2, baseFinderFeed.getItemId(), baseFinderFeed.mo3513o());
            C39818r rVar5 = C39818r.f106831a;
            Context context20 = oVar2.f173499A;
            C87412m.m108592e(context20, str31);
            C39622i0 a2 = rVar5.mo62444c((MMActivity) context20).mo75002a(cls13);
            C87412m.m108593f(a2, str3);
            hj12 = null;
            C7322a b2 = C60172g4.C60173a.m70190b((C60172g4) a2, 0, 1, (Object) null);
            if (b2 != null) {
                b2.mo8766a(new C7322a.C7323a(9, baseFinderFeed.getItemId()));
            }
        } else {
            hj12 = null;
        }
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put(str4, baseFinderFeed.mo3513o().getUserName());
        C58417y0 y0Var3 = (C58417y0) C86312j.m106911c(cls10);
        String jSONObject8 = jSONObject7.toString();
        C87412m.m108593f(jSONObject8, str29);
        String n2 = C112551y.m153814n(jSONObject8, str2, str26, false);
        Context context21 = oVar2.f173499A;
        C87412m.m108593f(context21, "holder.context");
        C13442s8 f8 = aVar.mo12873f(context21);
        y0Var3.Cx0(1, str5, n2, f8 != null ? f8.mo12861q3() : hj12);
    }

    /* renamed from: p0 */
    public final void mo2312p0(T t, C60905o oVar) {
        C60905o oVar2 = oVar;
        if (t.mo3480N() == 1) {
            View D = oVar2.mo85812D(C0966R.C0970id.esl);
            if (D == null) {
                D = ((ViewStub) oVar2.mo85812D(C0966R.C0970id.f5256a5)).inflate();
            }
            if (D != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = D;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFullGuideTips", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFullGuideTips", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        View D2 = oVar2.mo85812D(C0966R.C0970id.esl);
        if (D2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = D2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFullGuideTips", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshFullGuideTips", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: q */
    public final boolean mo2313q(T t) {
        C87412m.m108594g(t, "item");
        if (!C58784w3.f168295a.mo83897Q0(t) || t.mo3513o().isPostFinish()) {
            return true;
        }
        if (t.mo3513o().isPostFailed()) {
            return false;
        }
        return t.mo3513o().isPostFinish() || t.mo3513o().getPostInfo().f185649h >= 100;
    }

    /* renamed from: q0 */
    public final void mo2314q0(T t, C60905o oVar) {
        C51384te1 te12;
        C51384te1 te13;
        C60905o oVar2 = oVar;
        C39818r rVar = C39818r.f106831a;
        Context context = oVar2.f173499A;
        C87412m.m108593f(context, "holder.context");
        int i = ((C13442s8) rVar.mo62443b(context).mo75002a(C13442s8.class)).mo12861q3().f134675i;
        if ((oVar2.f173499A instanceof FinderHomeUI) || t.mo3513o().getCommentScene() == 0 || t.mo3513o().getCommentScene() == i) {
            Context context2 = oVar2.f173499A;
            String str = null;
            if ((context2 instanceof MMActivity ? (MMActivity) context2 : null) != null) {
                long itemId = t.getItemId();
                C54219z<Set<C11911l>> g3 = ((C62273n) rVar.mo62446e(C60200t1.class).mo75002a(C62273n.class)).mo87341g3(itemId, i);
                Collection value = g3.getValue();
                if (value == null) {
                    value = new HashSet();
                }
                HashSet<C11911l> hashSet = new HashSet<>(value);
                for (C11911l lVar : hashSet) {
                    C64175a0.m75512t(lVar.f34806d, new C2333d1(lVar));
                    lVar.f34809g.clear();
                }
                C50124kf1 kf12 = t.mo3513o().getFeedObject().object_extend;
                FinderJumpInfo finderJumpInfo = (kf12 == null || (te13 = kf12.f136749h) == null) ? null : te13.f142156d;
                C50124kf1 kf13 = t.mo3513o().getFeedObject().object_extend;
                LinkedList<FinderJumpInfo> linkedList = (kf13 == null || (te12 = kf13.f136749h) == null) ? null : te12.f142163n;
                C58784w3 w3Var = C58784w3.f168295a;
                if (w3Var.mo83872H0(t.mo3513o().getFeedObject())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("refreshHardAdJumper feedId=");
                    sb.append(C61926c.m72691p(t.getItemId()));
                    sb.append(" jumpInfo=");
                    sb.append(finderJumpInfo != null ? w3Var.mo83918b1(finderJumpInfo) : "null");
                    sb.append(", jumpInfoList=[");
                    if (linkedList != null) {
                        str = C110818d0.m150921S(linkedList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C2336e1.f12625d, 31, (Object) null);
                    }
                    sb.append(str);
                    sb.append(']');
                    Log.m105924i("Finder.FeedFullConvert", sb.toString());
                }
                if (finderJumpInfo != null) {
                    mo2254D(i, itemId, finderJumpInfo, hashSet);
                    C0773s0.f1815b.mo714a().mo712a(t.mo3513o().getFeedObject(), finderJumpInfo);
                }
                if (linkedList != null) {
                    for (FinderJumpInfo finderJumpInfo2 : linkedList) {
                        C87412m.m108593f(finderJumpInfo2, LocaleUtil.ITALIAN);
                        mo2254D(i, itemId, finderJumpInfo2, hashSet);
                        C0773s0.f1815b.mo714a().mo712a(t.mo3513o().getFeedObject(), finderJumpInfo2);
                    }
                }
                g3.postValue(hashSet);
                return;
            }
            return;
        }
        Log.m105924i("Finder.FeedFullConvert", "refreshHardAdJumper not same scene object.scene=" + t.mo3513o().getCommentScene() + ", commentScene = " + i);
    }

    /* renamed from: r */
    public final void mo2315r(C60905o oVar, T t) {
        int i;
        C58987d scrollEventAdapter;
        FinderPlayListDrawer finderPlayListDrawer;
        DialogFragment dialogFragment;
        C0201a aVar;
        FinderLikeDrawer finderLikeDrawer;
        C60905o oVar2 = oVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(t, "item");
        C37521f.f99374d.getClass();
        if (!(C37521f.f99432j4.mo60266n().intValue() == 1)) {
            Log.m105924i("Finder.FeedFullConvert", "checkScrollToNextFeed: is disable");
            return;
        }
        C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
        Context context = oVar2.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13442s8 f = aVar2.mo12873f(context);
        int i2 = f != null ? f.f38096i : 0;
        RecyclerView.C16613e adapter = oVar.mo85811C().getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        C56597e1 r5 = this.f12564e.mo2579r5();
        boolean z = r5 != null && r5.mo79924b();
        Context context2 = oVar2.f173499A;
        Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
        boolean z2 = (activity == null || (finderLikeDrawer = (FinderLikeDrawer) activity.findViewById(C0966R.C0970id.d96)) == null || !finderLikeDrawer.mo82541i()) ? false : true;
        View D = oVar2.mo85812D(C0966R.C0970id.ji4);
        boolean b = D != null ? C87412m.m108589b(D.getTag(), Boolean.TRUE) : false;
        C39818r rVar = C39818r.f106831a;
        Context context3 = oVar2.f173499A;
        C87412m.m108593f(context3, "holder.context");
        FinderLikeDrawer finderLikeDrawer2 = (FinderLikeDrawer) ((C36570n) ((C13211e2) rVar.mo62443b(context3).mo75002a(C13211e2.class)).f37548e).getValue();
        boolean i3 = finderLikeDrawer2 != null ? finderLikeDrawer2.mo82541i() : false;
        Context context4 = oVar2.f173499A;
        C87412m.m108593f(context4, "holder.context");
        FinderProfileDrawerUIC finderProfileDrawerUIC = (FinderProfileDrawerUIC) rVar.mo62443b(context4).mo62449e(FinderProfileDrawerUIC.class);
        boolean z3 = (finderProfileDrawerUIC == null || (aVar = finderProfileDrawerUIC.f18766f) == null) ? false : aVar.f18137q;
        Context context5 = oVar2.f173499A;
        C87412m.m108593f(context5, "holder.context");
        C13559z0 z0Var = (C13559z0) rVar.mo62443b(context5).mo62449e(C13559z0.class);
        boolean isVisible = (z0Var == null || (dialogFragment = z0Var.f38464d) == null) ? false : dialogFragment.isVisible();
        Context context6 = oVar2.f173499A;
        C87412m.m108593f(context6, "holder.context");
        boolean m3 = ((C63513a1) rVar.mo62443b(context6).mo75002a(C63513a1.class)).mo88377m3();
        boolean Cw0 = ((C60206u1) C86312j.m106911c(C60206u1.class)).Cw0();
        Context context7 = oVar2.f173499A;
        C87412m.m108593f(context7, "holder.context");
        String str = "Finder.FeedFullConvert";
        boolean z4 = ((C13554z) rVar.mo62443b(context7).mo75002a(C13554z.class)).f38450t;
        Context context8 = oVar2.f173499A;
        C87412m.m108593f(context8, "holder.context");
        int i4 = i2;
        boolean k3 = ((C56711j) rVar.mo62443b(context8).mo75002a(C56711j.class)).mo80097k3();
        int i5 = itemCount;
        boolean z5 = oVar2.f173499A.getResources().getConfiguration().orientation == 1;
        boolean z6 = ((Number) ((C36570n) this.f12579w).getValue()).intValue() == 16;
        Context context9 = oVar2.f173499A;
        C87412m.m108593f(context9, "holder.context");
        C16336r rVar2 = (C16336r) rVar.mo62443b(context9).mo62449e(C16336r.class);
        boolean i6 = (rVar2 == null || (finderPlayListDrawer = rVar2.f43686d) == null) ? false : finderPlayListDrawer.mo82541i();
        StringBuilder sb = new StringBuilder();
        sb.append("[checkScrollToNextFeed] isAnimDrawerOpen=");
        sb.append(z4);
        sb.append(" isDrawerOpen=");
        sb.append(z);
        sb.append(" isLikeDrawerOpen=");
        sb.append(z2);
        sb.append(" isShowBottomSheet=");
        sb.append(b);
        sb.append(" isAllLikeDrawerOpen=");
        sb.append(i3);
        sb.append(" isProfileDrawerOpen=");
        sb.append(z3);
        sb.append(" isBizProfileDrawerOpen=");
        sb.append(isVisible);
        sb.append(" isShowBulletInputUI=");
        sb.append(m3);
        sb.append(" isProjectionPanelShown=");
        sb.append(k3);
        sb.append(", isOpenSwitch=");
        sb.append(Cw0);
        sb.append(" isPortrait=");
        sb.append(z5);
        sb.append(", position=");
        sb.append(oVar.mo17363j());
        sb.append(" itemCount=");
        int i7 = i5;
        sb.append(i7);
        sb.append(" commentScene=");
        sb.append(i4);
        sb.append(" isCollection=");
        sb.append(z6);
        sb.append("isCollectionDrawerOpen=");
        sb.append(i6);
        Log.m105924i(str, sb.toString());
        if ((Cw0 || z6) && z5 && !z4 && !b && !z && !z2 && !i3 && !z3 && !isVisible && !m3 && !i6 && !k3 && oVar.mo17363j() + 1 < i7 && oVar.mo17363j() >= 0) {
            if (t instanceof C55018j0) {
                RecyclerView.C16613e adapter2 = oVar.mo85811C().getAdapter();
                WxRecyclerAdapter wxRecyclerAdapter = adapter2 instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter2 : null;
                Integer valueOf = wxRecyclerAdapter != null ? Integer.valueOf(wxRecyclerAdapter.getItemViewType(oVar.mo17363j() + 1)) : null;
                if ((valueOf != null && valueOf.intValue() == 9) || ((valueOf != null && valueOf.intValue() == 4) || (valueOf != null && valueOf.intValue() == 2))) {
                    RecyclerView C = oVar.mo85811C();
                    FinderRecyclerView finderRecyclerView = C instanceof FinderRecyclerView ? (FinderRecyclerView) C : null;
                    if (!(finderRecyclerView == null || (scrollEventAdapter = finderRecyclerView.getScrollEventAdapter()) == null)) {
                        scrollEventAdapter.f168773g = 4;
                        i = 1;
                        scrollEventAdapter.f168779p = true;
                        scrollEventAdapter.mo84221c(true);
                        RecyclerView C2 = oVar.mo85811C();
                        int j = oVar.mo17363j() + i;
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar3.mo10233c(Integer.valueOf(j));
                        C117292a.m165358d(C2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "checkScrollToNextFeed", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                        C2.mo17149t1(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(C2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "checkScrollToNextFeed", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    }
                }
            }
            i = 1;
            RecyclerView C22 = oVar.mo85811C();
            int j2 = oVar.mo17363j() + i;
            C9556a aVar32 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar32.mo10233c(Integer.valueOf(j2));
            C117292a.m165358d(C22, aVar32.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "checkScrollToNextFeed", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            C22.mo17149t1(((Integer) aVar32.mo10231a(0)).intValue());
            C117292a.m165359e(C22, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "checkScrollToNextFeed", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }

    /* renamed from: r0 */
    public final void mo2316r0(T t, C60905o oVar, int i) {
        C39818r rVar = C39818r.f106831a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13282j2 j2Var = (C13282j2) rVar.mo62443b(context).mo75002a(C13282j2.class);
        this.f12564e.mo2497u0();
        C2339f1 f1Var = new C2339f1(this, oVar, t);
        j2Var.getClass();
        C87412m.m108594g(t, "feed");
        Log.m105924i("Finder.FeedHotCommentUIC", "onBindView feedId=" + t.getItemId());
        FinderHotCommentLayout finderHotCommentLayout = (FinderHotCommentLayout) oVar.mo85812D(C0966R.C0970id.mcb);
        if (finderHotCommentLayout != null) {
            Context context2 = oVar.f173499A;
            MMActivity mMActivity = context2 instanceof MMActivity ? (MMActivity) context2 : null;
            if (mMActivity != null) {
                finderHotCommentLayout.setVisibility(8);
                C61926c.m72695t(j2Var.mo12733j3(t.getItemId()), mMActivity, new C13269i2(oVar, t, t, finderHotCommentLayout, j2Var, f1Var));
            }
        }
    }

    /* renamed from: s */
    public final void mo2317s(C60905o oVar, boolean z) {
        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) oVar.f173503E;
        View D = oVar.mo85812D(C0966R.C0970id.ji4);
        if (D != null) {
            C39818r rVar = C39818r.f106831a;
            Context context = oVar.f173499A;
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((C13490v9) rVar.mo62444c((MMActivity) context).mo75002a(C13490v9.class)).mo12898c3(D, baseFinderFeed.getItemId(), z ? 4 : 3);
        }
    }

    /* renamed from: s0 */
    public final void mo2318s0(T t, C60905o oVar, int i) {
        String str;
        int i2;
        C60905o oVar2 = oVar;
        C37521f.f99374d.getClass();
        int intValue = C37521f.f99326X2.mo60266n().intValue();
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = oVar2.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13442s8 f = aVar.mo12873f(context);
        int i3 = f != null ? f.f38096i : 0;
        View D = oVar2.mo85812D(C0966R.C0970id.d9d);
        if (intValue != 1 || i3 == 23 || i3 == 6 || ((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e() || mo2260G() || !C8368c.f27352a.mo9335b(oVar.hashCode(), C8366a.HOT_SEARCH)) {
            View view = D;
            Log.m105924i("Finder.FeedFullConvert", "hot search not enable");
            if (view != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshHotSearch", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshHotSearch", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        C50673of1 of12 = t.mo3513o().getFinderObject().hotWordInfo;
        C89349b bVar = null;
        if ((of12 != null ? of12.f139136d : null) != null) {
            C48727ak1 ak12 = of12.f139136d;
            if (!Util.isNullOrNil(ak12 != null ? ak12.f130586d : null)) {
                StringBuilder sb = new StringBuilder();
                sb.append("hotWordInfo: ");
                C48727ak1 ak13 = of12.f139136d;
                sb.append(ak13 != null ? ak13.f130586d : null);
                Log.m105924i("Finder.FeedFullConvert", sb.toString());
                if (D != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view3 = D;
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshHotSearch", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshHotSearch", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C48727ak1 ak14 = of12.f139136d;
                if (ak14 == null || (str = ak14.f130586d) == null) {
                    str = "";
                }
                String str2 = str;
                if (ak14 != null) {
                    bVar = ak14.f130590h;
                }
                C89349b bVar2 = bVar;
                C89349b bVar3 = of12.f139138f;
                TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.cyp);
                if (D != null) {
                    i2 = 1;
                    D.setOnClickListener(new C2342g1(oVar, str2, t, bVar2, this, of12, bVar3));
                } else {
                    i2 = 1;
                }
                if (textView != null) {
                    C85875k4.m106189j0(textView.getPaint(), 0.8f);
                    textView.setTextSize(0, oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3684bd));
                    Resources resources = oVar2.f173499A.getResources();
                    Object[] objArr = new Object[i2];
                    objArr[0] = str2;
                    textView.setText(resources.getString(C0966R.string.dcr, objArr));
                    return;
                }
                return;
            }
        }
        View view4 = D;
        if (view4 != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshHotSearch", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshHotSearch", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0137, code lost:
        if (r3.f13957f == 8) goto L_0x0139;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2319t(jq3.C60905o r28, T r29, boolean r30) {
        /*
            r27 = this;
            r0 = r27
            r10 = r28
            r1 = r29
            java.lang.String r2 = "holder"
            gy3.C87412m.m108594g(r10, r2)
            java.lang.String r2 = "item"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.t1 r2 = (ht1.C60200t1) r2
            boolean r2 = r2.mo76873sF()
            java.lang.String r3 = "Finder.FeedFullConvert"
            if (r2 == 0) goto L_0x0305
            boolean r2 = r29.mo3479M()
            if (r2 == 0) goto L_0x0028
            goto L_0x0305
        L_0x0028:
            er1.w3 r2 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r29.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            boolean r2 = r2.mo83891O0(r4)
            if (r2 == 0) goto L_0x003e
            java.lang.String r1 = "checkShowFollowLayout: no finder account feed, skip show followBtn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            return
        L_0x003e:
            fe1.q r2 = r29.mo3507l()
            r4 = 2
            if (r2 == 0) goto L_0x0048
            int r2 = r2.field_liveStatus
            goto L_0x0049
        L_0x0048:
            r2 = 2
        L_0x0049:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[checkShowLittleFollowLayout] tabType="
            r5.append(r6)
            int r6 = r0.f12566g
            r5.append(r6)
            java.lang.String r6 = " liveStatus="
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = " id="
            r5.append(r2)
            long r6 = r29.getItemId()
            java.lang.String r2 = o40.C61926c.m72691p(r6)
            r5.append(r2)
            java.lang.String r2 = " nickname="
            r5.append(r2)
            fe1.q r2 = r29.mo3507l()
            if (r2 == 0) goto L_0x0080
            java.lang.String r2 = r2.getNickname()
            goto L_0x0081
        L_0x0080:
            r2 = 0
        L_0x0081:
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            fe1.d$b r12 = fe1.C58961d.f168673a
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r29.mo3513o()
            java.lang.String r13 = r2.field_username
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r29.mo3513o()
            te3.cg r2 = r2.getBizInfo()
            if (r2 == 0) goto L_0x00a1
            java.lang.String r2 = r2.f182468d
            r14 = r2
            goto L_0x00a2
        L_0x00a1:
            r14 = 0
        L_0x00a2:
            r15 = 0
            r16 = 0
            r17 = 12
            r18 = 0
            boolean r2 = fe1.C58961d.C58963b.m68836h(r12, r13, r14, r15, r16, r17, r18)
            if (r2 != 0) goto L_0x0304
            bl3.r r2 = bl3.C39818r.f106831a
            android.content.Context r3 = r10.f173499A
            java.lang.String r12 = "holder.context"
            gy3.C87412m.m108593f(r3, r12)
            bl3.r$a r3 = r2.mo62443b(r3)
            java.lang.Class<ve1.m3> r5 = ve1.C14567m3.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r5)
            ve1.m3 r3 = (ve1.C14567m3) r3
            kf1.v1 r5 = r0.f12564e
            r3.getClass()
            java.lang.String r6 = "contract"
            gy3.C87412m.m108594g(r5, r6)
            boolean r3 = r3.mo13813d3()
            r6 = 8
            r7 = 1
            r13 = 0
            if (r3 != 0) goto L_0x00d9
            goto L_0x013b
        L_0x00d9:
            boolean r3 = r5 instanceof com.tencent.p014mm.plugin.finder.p056ui.ShareRelPresenter
            if (r3 == 0) goto L_0x00e0
            com.tencent.mm.plugin.finder.ui.ShareRelPresenter r5 = (com.tencent.p014mm.plugin.finder.p056ui.ShareRelPresenter) r5
            goto L_0x00e1
        L_0x00e0:
            r5 = 0
        L_0x00e1:
            if (r5 == 0) goto L_0x00e9
            boolean r3 = r5.f17215U
            if (r3 != r7) goto L_0x00e9
            r3 = 1
            goto L_0x00ea
        L_0x00e9:
            r3 = 0
        L_0x00ea:
            if (r3 == 0) goto L_0x00f4
            java.lang.String r3 = "FinderFeedSnsAdUIC"
            java.lang.String r4 = "isExistAdFollow: is all feed show ad follow btn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            goto L_0x0139
        L_0x00f4:
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r29.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            int r3 = r3.adFlag
            r3 = r3 & r4
            if (r3 != r4) goto L_0x0103
            r3 = 1
            goto L_0x0104
        L_0x0103:
            r3 = 0
        L_0x0104:
            if (r3 == 0) goto L_0x013b
            android.content.Context r3 = r10.f173499A
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r3, r5)
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            bl3.r$a r3 = r2.mo62444c(r3)
            java.lang.Class<ht1.y2> r5 = ht1.C8817y2.class
            bl3.c r3 = r3.mo62447c(r5)
            ht1.y2 r3 = (ht1.C8817y2) r3
            ht1.z2 r3 = r3.mo9643v2()
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r29.mo3513o()
            long r8 = r5.getId()
            com.tencent.mm.plugin.finder.feed.model.u0 r3 = r3.mo9654t1(r8, r4)
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.finder.feed.model.C2778b
            if (r4 == 0) goto L_0x0132
            com.tencent.mm.plugin.finder.feed.model.b r3 = (com.tencent.p014mm.plugin.finder.feed.model.C2778b) r3
            goto L_0x0133
        L_0x0132:
            r3 = 0
        L_0x0133:
            if (r3 == 0) goto L_0x013b
            int r3 = r3.f13957f
            if (r3 != r6) goto L_0x013b
        L_0x0139:
            r3 = 1
            goto L_0x013c
        L_0x013b:
            r3 = 0
        L_0x013c:
            if (r3 != 0) goto L_0x0304
            android.content.Context r3 = r10.f173499A
            gy3.C87412m.m108593f(r3, r12)
            bl3.r$a r2 = r2.mo62443b(r3)
            java.lang.Class<rs1.o3> r3 = rs1.C13345o3.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            r14 = r2
            rs1.o3 r14 = (rs1.C13345o3) r14
            long r8 = r29.getItemId()
            boolean r15 = r0.f12567h
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$g r3 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$g
            r3.<init>(r10, r1, r0)
            r14.getClass()
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            r2 = 2131302295(0x7f091797, float:1.8222672E38)
            android.view.View r2 = r10.mo85812D(r2)
            r5 = r2
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r2 = 2131305072(0x7f092270, float:1.8228305E38)
            android.view.View r4 = r5.findViewById(r2)
            int r2 = r4.getVisibility()
            if (r2 != 0) goto L_0x0179
            goto L_0x0304
        L_0x0179:
            di3.d r2 = di3.C86312j.m106911c(r1)
            l31.e r2 = (l31.C61212e) r2
            java.lang.String r11 = "finder_feed_follow"
            r2.o30(r4, r11)
            di3.d r1 = di3.C86312j.m106911c(r1)
            l31.e r1 = (l31.C61212e) r1
            r2 = 24617(0x6029, float:3.4496E-41)
            r1.mo86175pO(r4, r6, r2)
            r1 = 2131305074(0x7f092272, float:1.8228309E38)
            android.view.View r11 = r5.findViewById(r1)
            r1 = 2131305075(0x7f092273, float:1.822831E38)
            android.view.View r1 = r5.findViewById(r1)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r1 = "followTv"
            gy3.C87412m.m108593f(r6, r1)
            er1.C7919x.m8091a(r6)
            boolean[] r2 = new boolean[r7]
            r2[r13] = r13
            rs1.p3 r1 = new rs1.p3
            r1.<init>(r2)
            r4.setOnTouchListener(r1)
            rs1.q3 r7 = new rs1.q3
            r1 = r7
            r29 = r4
            r4 = r6
            r24 = r5
            r5 = r14
            r6 = r15
            r15 = r7
            r7 = r11
            r25 = r8
            r8 = r29
            r9 = r28
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r29
            r1.setOnClickListener(r15)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r2.mo10233c(r3)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC"
            java.lang.String r19 = "showFollowAnim"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JZZLkotlin/jvm/functions/Function0;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r2 = r2.mo10231a(r13)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC"
            java.lang.String r18 = "showFollowAnim"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JZZLkotlin/jvm/functions/Function0;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r30 == 0) goto L_0x0272
            r3 = 0
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r4.mo10233c(r3)
            java.lang.Object[] r17 = r4.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC"
            java.lang.String r19 = "showFollowAnim"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JZZLkotlin/jvm/functions/Function0;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setAlpha"
            java.lang.String r23 = "(F)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r3 = r4.mo10231a(r13)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r1.setAlpha(r3)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC"
            java.lang.String r18 = "showFollowAnim"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JZZLkotlin/jvm/functions/Function0;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setAlpha"
            java.lang.String r22 = "(F)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.ViewPropertyAnimator r3 = r1.animate()
            android.view.ViewPropertyAnimator r2 = r3.alpha(r2)
            r3 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r3)
            rs1.r3 r3 = new rs1.r3
            r3.<init>(r1)
            android.view.ViewPropertyAnimator r1 = r2.setListener(r3)
            r1.start()
            goto L_0x02b3
        L_0x0272:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3.mo10233c(r2)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC"
            java.lang.String r19 = "showFollowAnim"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JZZLkotlin/jvm/functions/Function0;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setAlpha"
            java.lang.String r23 = "(F)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r2 = r3.mo10231a(r13)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.setAlpha(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFollowAnimUIC"
            java.lang.String r18 = "showFollowAnim"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JZZLkotlin/jvm/functions/Function0;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setAlpha"
            java.lang.String r22 = "(F)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x02b3:
            r24.requestLayout()
            r24.invalidate()
            java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            tf0.p1 r1 = (tf0.C64916p1) r1
            rs1.s8$a r2 = rs1.C13442s8.f38060Q0
            android.app.Activity r3 = r14.getContext()
            rs1.s8 r3 = r2.mo12873f(r3)
            if (r3 == 0) goto L_0x02cf
            int r13 = r3.f38096i
        L_0x02cf:
            r3 = r25
            dp1.i2 r1 = r1.mo9101vP(r3, r13)
            if (r1 == 0) goto L_0x02df
            te3.we1 r1 = r1.f122975a
            if (r1 == 0) goto L_0x02df
            java.lang.String r1 = r1.f143985e
            if (r1 != 0) goto L_0x02e1
        L_0x02df:
            java.lang.String r1 = ""
        L_0x02e1:
            r22 = r1
            dp1.f2 r15 = dp1.C7435f2.f25626a
            android.content.Context r1 = r10.f173499A
            gy3.C87412m.m108593f(r1, r12)
            rs1.s8 r1 = r2.mo12873f(r1)
            if (r1 == 0) goto L_0x02f7
            te3.hj1 r11 = r1.mo12861q3()
            r16 = r11
            goto L_0x02f9
        L_0x02f7:
            r16 = 0
        L_0x02f9:
            r18 = 1
            r21 = 0
            java.lang.String r17 = "follow"
            r19 = r3
            r15.mo8579c(r16, r17, r18, r19, r21, r22)
        L_0x0304:
            return
        L_0x0305:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "checkShowFollowLayout: check finderEntry failed, or isPreview = "
            r2.append(r4)
            boolean r1 = r29.mo3479M()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2319t(jq3.o, com.tencent.mm.plugin.finder.model.BaseFinderFeed, boolean):void");
    }

    /* renamed from: t0 */
    public void mo2320t0(T t, C60905o oVar) {
        C87412m.m108594g(t, "item");
        C87412m.m108594g(oVar, "holder");
        C37521f.f99374d.getClass();
        if (C37521f.f99452l8.mo60266n().booleanValue()) {
            View D = oVar.mo85812D(C0966R.C0970id.me8);
            if (D != null) {
                D.setBackground(oVar.f173499A.getResources().getDrawable(C0966R.C0969drawable.b9z));
            }
        } else {
            View D2 = oVar.mo85812D(C0966R.C0970id.me8);
            if (D2 != null) {
                D2.setBackground((Drawable) null);
            }
        }
        String str = t.mo3513o().getFeedObject().inner_recommend_reason;
        if (!(str == null || str.length() == 0)) {
            oVar.mo85817I(C0966R.C0970id.me8, 0);
            mo2303l(oVar);
            mo2261G0(oVar, C0966R.C0970id.me9, t.mo3513o().getFeedObject().inner_recommend_reason);
            return;
        }
        oVar.mo85817I(C0966R.C0970id.me8, 8);
        mo2303l(oVar);
    }

    /* renamed from: u0 */
    public final void mo2321u0(C60905o oVar, T t) {
        String str;
        String str2;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        if (mo2262H(t)) {
            View D = oVar.mo85812D(C0966R.C0970id.k07);
            if (D != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshManagerFav", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshManagerFav", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View D2 = oVar.mo85812D(C0966R.C0970id.n7g);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(D2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshManagerFav", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(D2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshManagerFav", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setOnClickListener(new C2345h1(oVar));
            C65854g gVar = C65854g.f189373e;
            int b = C65854g.f189373e.mo89892b(t.mo3513o().getFeedObject());
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.n7f);
            boolean z = true;
            String str3 = "";
            if (textView != null) {
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
                if (b > 0 || this.f12564e.mo2497u0()) {
                    str2 = C7878t0.m8034c(!this.f12564e.mo2497u0() ? 2 : 1, b);
                    C87412m.m108593f(str2, "formatNumber(\n          …unt\n                    )");
                    D2.setTag(C0966R.C0970id.d5g, str2);
                } else {
                    str2 = str3;
                }
                textView.setText(str2);
            }
            WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.n_b);
            C48996cf1 a = C15587j.f42215a.mo14349a("FinderObjectDynamicImageKey_FinderFavManageIcon");
            if (!(a == null || (str = a.f131694e) == null)) {
                str3 = str;
            }
            Log.m105924i("Finder.FeedFullConvert", "favManageIconUrl :" + str3 + '}');
            if (str3.length() <= 0) {
                z = false;
            }
            if (z) {
                C99344b<C100810g0, Bitmap> b2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str3, C27696y.RAW_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.FAV_ICON));
                C2348i1 i1Var = new C2348i1(weImageView, oVar);
                b2.getClass();
                b2.f291320d = i1Var;
                b2.mo85951a();
                return;
            }
            Drawable e = C87515a.m108835e(oVar.f173499A.getResources(), C0966R.raw.icons_outlined_channels_good_cell, 0.0f);
            weImageView.setLayerPaint((Paint) null);
            weImageView.setIconColor(0);
            weImageView.setIconColor(oVar.f173499A.getResources().getColor(C0966R.color.f3585yj));
            weImageView.setImageDrawable(e);
        }
    }

    /* renamed from: v */
    public final void mo2322v(C60905o oVar, T t) {
        C60905o oVar2 = oVar;
        T t2 = t;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(t2, "item");
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        boolean z = C37521f.f99396f4.mo60266n().intValue() == 1;
        C65866w.C14968a aVar = C65866w.f189406g;
        C13604l<Boolean, Boolean> g = C65866w.f189407h.mo89908g(t.mo3513o().getFeedObject());
        boolean booleanValue = ((Boolean) g.f38555d).booleanValue();
        ((Boolean) g.f38556e).booleanValue();
        StringBuilder sb = new StringBuilder();
        sb.append("[checkShowFollowLikeLayout] isLike=");
        sb.append(booleanValue);
        sb.append(" tabType=");
        sb.append(this.f12566g);
        sb.append(" id=");
        sb.append(C61926c.m72691p(t.getItemId()));
        sb.append(" nickname=");
        C58969q l = t.mo3507l();
        sb.append(l != null ? l.getNickname() : null);
        Log.m105924i("Finder.FeedFullConvert", sb.toString());
        if (z) {
            fVar.getClass();
            C35464c<Integer> cVar = C37521f.f99529u4;
            View D = cVar.mo60266n().intValue() == 1 ? oVar2.mo85812D(C0966R.C0970id.ec_) : oVar2.mo85812D(C0966R.C0970id.ecb);
            fVar.getClass();
            (cVar.mo60266n().intValue() == 1 ? (TextView) oVar2.mo85812D(C0966R.C0970id.izv) : (TextView) oVar2.mo85812D(C0966R.C0970id.izw)).setText(oVar2.f173499A.getString(C0966R.string.f360506fo0));
            if (D.getVisibility() != 0 && !booleanValue && mo2264I(t2)) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view = D;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "checkShowFollowLikeLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "checkShowFollowLikeLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(Float.valueOf(0.0f));
                View view2 = D;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "checkShowFollowLikeLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                D.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "checkShowFollowLikeLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                D.animate().alpha(1.0f).setDuration(300).setListener(new C2343h(D, oVar2, t2)).start();
            }
        }
    }

    /* renamed from: v0 */
    public final void mo2323v0(C60905o oVar, T t) {
        View D = oVar.mo85812D(C0966R.C0970id.f358429f21);
        if (D != null) {
            boolean z = t.mo3513o().isPostFinish() || t.mo3513o().getPostInfo().f185649h >= 100;
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13442s8 f = aVar.mo12873f(context);
            int i = f != null ? f.f38096i : 0;
            if (((!this.f12564e.mo2497u0() || !C58784w3.f168295a.mo83897Q0(t)) && !((Boolean) ((C36570n) this.f12575s).getValue()).booleanValue() && i != 21 && i != 2) || t.mo3513o().isLiveFeed() || !z) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view = D;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMoreBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMoreBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            D.setOnClickListener(new C2352j1(this, oVar));
            int f2 = C75044y4.m89994f(oVar.f173499A);
            ViewGroup.LayoutParams layoutParams = D.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams).topMargin = f2;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view2 = D;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMoreBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert", "refreshMoreBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setContentDescription(oVar.f173499A.getString(C0966R.string.eki));
        }
    }

    /* renamed from: w */
    public abstract void mo2324w(C60905o oVar, T t, int i, int i2);

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r1 = (r1 = r27.getFeedObject()).hotTopics;
     */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2325w0(jq3.C60905o r26, com.tencent.p014mm.plugin.finder.storage.FinderItem r27, java.lang.String r28) {
        /*
            r25 = this;
            r7 = r26
            r0 = 0
            if (r27 == 0) goto L_0x0012
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r27.getFeedObject()
            if (r1 == 0) goto L_0x0012
            te3.nf1 r1 = r1.hotTopics
            if (r1 == 0) goto L_0x0012
            java.util.LinkedList<te3.mf1> r1 = r1.f138582d
            goto L_0x0013
        L_0x0012:
            r1 = r0
        L_0x0013:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "showNewsIndicator objectType: "
            r2.append(r3)
            if (r27 == 0) goto L_0x002d
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r27.getFeedObject()
            if (r3 == 0) goto L_0x002d
            int r3 = r3.objectType
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x002e
        L_0x002d:
            r3 = r0
        L_0x002e:
            r2.append(r3)
            java.lang.String r3 = " size:"
            r2.append(r3)
            if (r1 == 0) goto L_0x0041
            int r3 = r1.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0042
        L_0x0041:
            r3 = r0
        L_0x0042:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Finder.FeedFullConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            if (r1 == 0) goto L_0x0068
            java.util.Iterator r1 = r1.iterator()
        L_0x0054:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r1.next()
            te3.mf1 r2 = (te3.C50394mf1) r2
            if (r2 == 0) goto L_0x0054
            int r4 = r2.f137999f
            r5 = 5
            if (r4 != r5) goto L_0x0054
            r0 = r2
        L_0x0068:
            r8 = r0
            r0 = 2131302840(0x7f0919b8, float:1.8223777E38)
            r1 = 2131302839(0x7f0919b7, float:1.8223775E38)
            r9 = 8
            r2 = 0
            if (r8 == 0) goto L_0x023c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[refreshNewsLayout] topic "
            r4.append(r5)
            long r5 = r8.f137997d
            r4.append(r5)
            r5 = 32
            r4.append(r5)
            java.lang.String r6 = r8.f137998e
            r4.append(r6)
            r4.append(r5)
            int r5 = r8.f138000g
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            android.content.Context r4 = r7.f173499A
            boolean r4 = r4 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI
            if (r4 == 0) goto L_0x013a
            java.lang.String r4 = "[refreshNewsLayout] topic ui is FinderShareFeedRelUI block"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            android.view.View r1 = r7.mo85812D(r1)
            if (r1 != 0) goto L_0x00ae
            goto L_0x00ee
        L_0x00ae:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r3.mo10233c(r4)
            java.lang.Object[] r11 = r3.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r13 = "refreshNewsLayout"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r1
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r3 = r3.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r12 = "refreshNewsLayout"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x00ee:
            android.view.View r0 = r7.mo85812D(r0)
            if (r0 != 0) goto L_0x00f5
            goto L_0x0136
        L_0x00f5:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r1.mo10233c(r3)
            java.lang.Object[] r18 = r1.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r20 = "refreshNewsLayout"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r0
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r19 = "refreshNewsLayout"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x0136:
            r25.mo2303l(r26)
            return
        L_0x013a:
            r10 = 2131302314(0x7f0917aa, float:1.822271E38)
            android.view.View r0 = r7.mo85812D(r10)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x017c
            int r3 = r8.f138000g
            if (r3 <= 0) goto L_0x0158
            android.content.res.Resources r3 = r0.getResources()
            r4 = 2131100949(0x7f060515, float:1.7814294E38)
            int r3 = r3.getColor(r4)
            r0.setTextColor(r3)
            goto L_0x0166
        L_0x0158:
            android.content.res.Resources r3 = r0.getResources()
            r4 = 2131100932(0x7f060504, float:1.781426E38)
            int r3 = r3.getColor(r4)
            r0.setTextColor(r3)
        L_0x0166:
            r3 = 2131232401(0x7f080691, float:1.808091E38)
            r0.setBackgroundResource(r3)
            android.content.Context r3 = r7.f173499A
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131165261(0x7f07004d, float:1.7944734E38)
            float r3 = r3.getDimension(r4)
            r0.setTextSize(r2, r3)
        L_0x017c:
            r0 = 2131304613(0x7f0920a5, float:1.8227374E38)
            android.view.View r0 = r7.mo85812D(r0)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r0
            if (r0 == 0) goto L_0x0195
            android.content.res.Resources r3 = r0.getResources()
            r4 = 2131100930(0x7f060502, float:1.7814255E38)
            int r3 = r3.getColor(r4)
            r0.setIconColor(r3)
        L_0x0195:
            android.view.View r6 = r7.mo85812D(r1)
            if (r6 == 0) goto L_0x01f1
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.mo10233c(r1)
            java.lang.Object[] r12 = r0.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r14 = "refreshNewsLayout"
            java.lang.String r15 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r6
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r0.mo10231a(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.setVisibility(r0)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r13 = "refreshNewsLayout"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            r25.mo2303l(r26)
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$k1 r11 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$k1
            r0 = r11
            r1 = r8
            r2 = r27
            r3 = r25
            r4 = r28
            r5 = r26
            r12 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.setOnClickListener(r11)
        L_0x01f1:
            android.view.View r0 = r7.mo85812D(r10)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x022c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r2 = r0.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131829290(0x7f11222a, float:1.9291545E38)
            java.lang.String r2 = r2.getString(r3)
            r1.append(r2)
            java.lang.String r2 = r8.f137998e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.text.SpannableString r1 = r2.mo107057T1(r3, r1)
            r0.setText(r1)
        L_0x022c:
            r0 = 2131302313(0x7f0917a9, float:1.8222709E38)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x02d3
            r0.setVisibility(r9)
            goto L_0x02d3
        L_0x023c:
            java.lang.String r4 = "[refreshNewsLayout] topic null let"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            android.view.View r1 = r7.mo85812D(r1)
            if (r1 != 0) goto L_0x0248
            goto L_0x0288
        L_0x0248:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r3.mo10233c(r4)
            java.lang.Object[] r11 = r3.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r13 = "refreshNewsLayout"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r1
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r3 = r3.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r12 = "refreshNewsLayout"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x0288:
            android.view.View r0 = r7.mo85812D(r0)
            if (r0 != 0) goto L_0x028f
            goto L_0x02d0
        L_0x028f:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r1.mo10233c(r3)
            java.lang.Object[] r18 = r1.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r20 = "refreshNewsLayout"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r0
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r19 = "refreshNewsLayout"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/storage/FinderItem;Ljava/lang/String;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x02d0:
            r25.mo2303l(r26)
        L_0x02d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2325w0(jq3.o, com.tencent.mm.plugin.finder.storage.FinderItem, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.p136ui.widget.imageview.WeImageView mo2326x(jq3.C60905o r6) {
        /*
            r5 = this;
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = new com.tencent.mm.ui.widget.imageview.WeImageView
            android.content.Context r1 = r6.f173499A
            r0.<init>(r1)
            r1 = 4
            r0.setVisibility(r1)
            android.content.Context r1 = r6.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165357(0x7f0700ad, float:1.7944929E38)
            float r1 = r1.getDimension(r2)
            int r1 = (int) r1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r1, r1)
            r1 = 17
            r2.gravity = r1
            r0.setLayoutParams(r2)
            er1.w3 r1 = er1.C58784w3.f168295a
            r2 = 0
            r3 = 2
            r4 = 0
            java.lang.Integer r1 = er1.C58784w3.m68436c0(r1, r3, r2, r3, r4)
            if (r1 == 0) goto L_0x0035
            int r1 = r1.intValue()
            goto L_0x0038
        L_0x0035:
            r1 = 2131755635(0x7f100273, float:1.9142155E38)
        L_0x0038:
            r0.setImageResource(r1)
            android.content.Context r1 = r6.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099905(0x7f060101, float:1.7812176E38)
            int r1 = r1.getColor(r2)
            r0.setIconColor(r1)
            android.view.View r6 = r6.f44854d
            boolean r1 = r6 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0054
            r4 = r6
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
        L_0x0054:
            if (r4 == 0) goto L_0x0059
            r4.addView(r0)
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2326x(jq3.o):com.tencent.mm.ui.widget.imageview.WeImageView");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2327x0(T r11, jq3.C60905o r12) {
        /*
            r10 = this;
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r12, r0)
            android.view.View r0 = r12.f44854d
            r1 = 2131297423(0x7f09048f, float:1.821279E38)
            android.view.View r0 = r0.findViewById(r1)
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r0 = (com.tencent.p014mm.plugin.finder.view.EllipsizedTextView) r0
            boolean r1 = r10.f12567h
            if (r1 == 0) goto L_0x0029
            android.content.Context r1 = r12.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099682(0x7f060022, float:1.7811724E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
        L_0x0029:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r11.mo3513o()
            android.text.SpannableString r1 = r1.getNickNameSpan()
            r0.setText(r1)
            r1 = 2131307368(0x7f092b68, float:1.8232961E38)
            android.view.View r1 = r12.mo85812D(r1)
            r2 = 2131304464(0x7f092010, float:1.8227071E38)
            android.view.View r2 = r12.mo85812D(r2)
            android.content.Context r3 = r12.f173499A
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131165337(0x7f070099, float:1.7944888E38)
            float r3 = r3.getDimension(r4)
            int r3 = (int) r3
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0063
            android.content.Context r1 = r12.f173499A
            android.content.res.Resources r1 = r1.getResources()
            float r1 = r1.getDimension(r4)
        L_0x0060:
            int r1 = (int) r1
            int r3 = r3 + r1
            goto L_0x0077
        L_0x0063:
            int r1 = r2.getVisibility()
            if (r1 != 0) goto L_0x0077
            android.content.Context r1 = r12.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165351(0x7f0700a7, float:1.7944917E38)
            float r1 = r1.getDimension(r2)
            goto L_0x0060
        L_0x0077:
            r0.setExtraEllipsizeWidth(r3)
            fe1.q r1 = r11.mo3507l()
            r2 = 0
            if (r1 == 0) goto L_0x009d
            er1.w3 r3 = er1.C58784w3.f168295a
            r4 = 2131297406(0x7f09047e, float:1.8212756E38)
            android.view.View r4 = r12.mo85812D(r4)
            java.lang.String r5 = "holder.getView(R.id.auth_icon)"
            gy3.C87412m.m108593f(r4, r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r5 = r1.field_authInfo
            r6 = 0
            te3.cg r7 = fe1.C58960c.m68830b(r1, r2)
            r8 = 4
            r9 = 0
            er1.C58784w3.m68429F1(r3, r4, r5, r6, r7, r8, r9)
        L_0x009d:
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$l1 r1 = new com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$l1
            r1.<init>(r12, r11, r10)
            r0.setOnClickListener(r1)
            fe1.q r0 = r11.mo3507l()
            if (r0 == 0) goto L_0x00ae
            int r0 = r0.field_friendFollowCount
            goto L_0x00af
        L_0x00ae:
            r0 = 0
        L_0x00af:
            android.view.View r12 = r12.f44854d
            r1 = 2131302309(0x7f0917a5, float:1.82227E38)
            android.view.View r12 = r12.findViewById(r1)
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            if (r12 == 0) goto L_0x00ea
            r1 = 2131302575(0x7f0918af, float:1.822324E38)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r11.mo3513o()
            android.text.SpannableString r3 = r3.getNickNameSpan()
            r12.setTag(r1, r3)
            r1 = 2131302511(0x7f09186f, float:1.822311E38)
            fe1.q r11 = r11.mo3507l()
            if (r11 == 0) goto L_0x00d9
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r11 = r11.field_authInfo
            if (r11 == 0) goto L_0x00d9
            int r2 = r11.authIconType
        L_0x00d9:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r12.setTag(r1, r11)
            r11 = 2131302522(0x7f09187a, float:1.8223133E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.setTag(r11, r0)
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2327x0(com.tencent.mm.plugin.finder.model.BaseFinderFeed, jq3.o):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x03a7  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2328y(jq3.C60905o r35, int r36) {
        /*
            r34 = this;
            r6 = r34
            r7 = r35
            java.lang.Object r0 = r7.f173503E
            r2 = r0
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r2
            er1.w3 r8 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            boolean r0 = r8.mo83924e(r0)
            java.lang.String r9 = "holder.context"
            if (r0 != 0) goto L_0x003c
            android.content.Context r0 = r7.f173499A
            gy3.C87412m.m108593f(r0, r9)
            wp1.j r1 = wp1.C15587j.f42215a
            java.lang.String r2 = "FinderObjectDynamicItemKey_FinderPrivateBanFav"
            java.lang.String r1 = r1.mo14350b(r2)
            if (r1 != 0) goto L_0x0038
            android.content.Context r1 = r7.f173499A
            r2 = 2131829570(0x7f112342, float:1.9292113E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "holder.context.getString….finder_private_ban_fav2)"
            gy3.C87412m.m108593f(r1, r2)
        L_0x0038:
            r8.mo83879J1(r0, r1)
            return
        L_0x003c:
            vq1.g r0 = vq1.C65854g.f189373e
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            boolean r0 = r0.mo89893c(r1)
            r10 = 1
            r11 = r0 ^ 1
            java.lang.Class<dp1.y0> r0 = dp1.C58417y0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            dp1.y0 r0 = (dp1.C58417y0) r0
            long r3 = r2.getItemId()
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r2.mo3513o()
            r0.wx0(r7, r3, r1)
            kf1.v1 r0 = r6.f12564e
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r2.mo3513o()
            r3 = r36
            r0.mo2577n6(r1, r11, r7, r3)
            r12 = 0
            if (r11 == 0) goto L_0x0480
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            r3 = 2131304856(0x7f092198, float:1.8227866E38)
            android.view.View r3 = r7.mo85812D(r3)
            r4 = 3
            if (r3 != 0) goto L_0x0083
            r23 = r2
            r22 = r8
            r6 = r11
            goto L_0x0450
        L_0x0083:
            java.lang.Object r5 = r7.f173503E
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
            int r5 = r5.friend_fav_count
            r13 = 2131306201(0x7f0926d9, float:1.8230594E38)
            android.view.View r13 = r7.mo85812D(r13)
            r15 = r13
            com.tencent.mm.ui.widget.imageview.WeImageView r15 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r15
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            com.tencent.mm.storage.y1$a r14 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_STAR_RECOMMEND_TIPS_SHOW_COUNT_INT_SYNC
            int r13 = r13.mo119689j(r14, r12)
            up1.f r16 = up1.C37521f.f99374d
            r16.getClass()
            pe1.c<java.lang.Integer> r16 = up1.C37521f.f99542v8
            java.lang.Object r16 = r16.mo60266n()
            java.lang.Number r16 = (java.lang.Number) r16
            int r12 = r16.intValue()
            if (r12 != r10) goto L_0x00d8
            pe1.c<java.lang.Integer> r12 = up1.C37521f.f99533u8
            java.lang.Object r12 = r12.mo60266n()
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            if (r12 != r10) goto L_0x00d8
            if (r13 >= r4) goto L_0x00d8
            android.content.Context r12 = r7.f173499A
            boolean r4 = r12 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderHomeAffinityUI
            if (r4 != 0) goto L_0x00d6
            boolean r4 = r12 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI
            if (r4 == 0) goto L_0x00d8
        L_0x00d6:
            r4 = 1
            goto L_0x00d9
        L_0x00d8:
            r4 = 0
        L_0x00d9:
            pe1.c<java.lang.Integer> r12 = up1.C37521f.f99560x7
            java.lang.Object r12 = r12.mo60266n()
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            if (r12 != r10) goto L_0x00eb
            if (r5 <= 0) goto L_0x00eb
            r12 = 1
            goto L_0x00ec
        L_0x00eb:
            r12 = 0
        L_0x00ec:
            if (r12 != 0) goto L_0x00f3
            if (r4 == 0) goto L_0x00f1
            goto L_0x00f3
        L_0x00f1:
            r4 = 0
            goto L_0x00f4
        L_0x00f3:
            r4 = 1
        L_0x00f4:
            org.libpag.PAGView r10 = new org.libpag.PAGView
            r16 = r15
            android.content.Context r15 = r7.f173499A
            r10.<init>(r15)
            android.content.Context r15 = r7.f173499A
            android.content.res.Resources r15 = r15.getResources()
            r22 = r8
            r8 = 2131165294(0x7f07006e, float:1.7944801E38)
            float r8 = r15.getDimension(r8)
            int r8 = (int) r8
            r15 = 4
            r10.setVisibility(r15)
            r15 = 1
            r10.setRepeatCount(r15)
            r23 = r2
            r24 = r3
            r2 = 0
            r10.setProgress(r2)
            android.content.Context r2 = r7.f173499A
            android.content.res.AssetManager r2 = r2.getAssets()
            java.lang.String r3 = "finder_star_animator_new.pag"
            org.libpag.PAGFile r2 = org.libpag.PAGFile.Load(r2, r3)
            r10.setComposition(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r8, r8)
            r3 = 17
            r2.gravity = r3
            r10.setLayoutParams(r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            android.content.Context r8 = r7.f173499A
            r2.<init>(r8)
            r8 = 1
            r2.setOrientation(r8)
            r2.setGravity(r3)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r15 = -1
            r8.<init>(r15, r15)
            r8.gravity = r3
            r2.setLayoutParams(r8)
            r2.addView(r10)
            r3 = 2131309065(0x7f093209, float:1.8236403E38)
            android.view.View r3 = r7.mo85812D(r3)
            boolean r8 = r3 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x0163
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L_0x0164
        L_0x0163:
            r3 = 0
        L_0x0164:
            if (r3 == 0) goto L_0x0169
            r3.addView(r2)
        L_0x0169:
            r3 = 0
            r10.setVisibility(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r17 = r14
            r14 = 400(0x190, double:1.976E-321)
            if (r4 == 0) goto L_0x0188
            r10.setAlpha(r8)
            android.view.ViewPropertyAnimator r8 = r10.animate()
            android.view.ViewPropertyAnimator r8 = r8.alpha(r3)
            android.view.ViewPropertyAnimator r8 = r8.setDuration(r14)
            r8.start()
        L_0x0188:
            r10.play()
            if (r4 == 0) goto L_0x03a2
            android.widget.TextView r8 = new android.widget.TextView
            android.content.Context r14 = r7.f173499A
            r8.<init>(r14)
            android.view.ViewGroup$MarginLayoutParams r14 = new android.view.ViewGroup$MarginLayoutParams
            r15 = -2
            r14.<init>(r15, r15)
            android.content.Context r15 = r7.f173499A
            android.content.res.Resources r15 = r15.getResources()
            r3 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r3 = r15.getDimensionPixelOffset(r3)
            r14.topMargin = r3
            r8.setLayoutParams(r14)
            android.content.Context r3 = r7.f173499A
            android.content.res.Resources r3 = r3.getResources()
            r14 = 2131099919(0x7f06010f, float:1.7812205E38)
            int r3 = r3.getColor(r14)
            r14 = 1101004800(0x41a00000, float:20.0)
            r15 = 1090519040(0x41000000, float:8.0)
            r6 = 0
            r8.setShadowLayer(r14, r6, r15, r3)
            if (r12 == 0) goto L_0x01d8
            android.content.Context r3 = r7.f173499A
            r6 = 2131826650(0x7f1117da, float:1.928619E38)
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.Integer r20 = java.lang.Integer.valueOf(r5)
            r21 = 0
            r15[r21] = r20
            java.lang.String r3 = r3.getString(r6, r15)
            goto L_0x01e2
        L_0x01d8:
            r14 = 1
            android.content.Context r3 = r7.f173499A
            r6 = 2131829934(0x7f1124ae, float:1.9292851E38)
            java.lang.String r3 = r3.getString(r6)
        L_0x01e2:
            r8.setText(r3)
            r3 = 1099431936(0x41880000, float:17.0)
            r8.setTextSize(r14, r3)
            android.content.Context r3 = r7.f173499A
            android.content.res.Resources r3 = r3.getResources()
            r6 = 2131099940(0x7f060124, float:1.7812247E38)
            int r3 = r3.getColor(r6)
            r8.setTextColor(r3)
            if (r12 == 0) goto L_0x0245
            wp1.j r3 = wp1.C15587j.f42215a
            java.lang.String r6 = "FinderObjectDynamicImageKey_FinderFavOffBoldIcon"
            te3.cf1 r3 = r3.mo14349a(r6)
            if (r3 == 0) goto L_0x020a
            java.lang.String r3 = r3.f131694e
            if (r3 != 0) goto L_0x020c
        L_0x020a:
            java.lang.String r3 = ""
        L_0x020c:
            bl3.r r6 = bl3.C39818r.f106831a
            bl3.r$a r12 = r6.mo62446e(r1)
            bl3.c r12 = r12.mo62447c(r0)
            pl1.s0 r12 = (pl1.C11990s0) r12
            k60.d r12 = r12.mo11871f2()
            pl1.n0 r13 = new pl1.n0
            up1.y r14 = up1.C27696y.RAW_IMAGE
            r13.<init>(r3, r14)
            pl1.e0$a r3 = pl1.C11978e0.C11979a.FAV_ICON
            bl3.r$a r1 = r6.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r3)
            l60.b r0 = r12.mo85956b(r13, r0)
            ve1.w1 r1 = new ve1.w1
            r1.<init>(r7, r8, r5)
            r0.getClass()
            r0.f291320d = r1
            r0.mo85953c()
            goto L_0x0258
        L_0x0245:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r1 = 1
            int r13 = r13 + r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r3 = r17
            r0.mo119677K(r3, r1)
        L_0x0258:
            r2.addView(r8)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r1 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r0.mo10233c(r3)
            java.lang.Object[] r14 = r0.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r1 = "starAnimator"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r3 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r24
            r6 = r11
            r11 = 400(0x190, double:1.976E-321)
            r33 = r16
            r16 = r1
            r18 = r3
            r19 = r5
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = r24
            r1.setVisibility(r0)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r15 = "starAnimator"
            java.lang.String r16 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r13 = r1
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            k20.a r0 = new k20.a
            r0.<init>()
            r3 = 0
            java.lang.Float r5 = java.lang.Float.valueOf(r3)
            r0.mo10233c(r5)
            java.lang.Object[] r14 = r0.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r16 = "starAnimator"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setAlpha"
            java.lang.String r20 = "(F)V"
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            r3 = 0
            java.lang.Object r0 = r0.mo10231a(r3)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r1.setAlpha(r0)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert"
            java.lang.String r15 = "starAnimator"
            java.lang.String r16 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setAlpha"
            java.lang.String r19 = "(F)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            r0 = 1
            float[] r3 = new float[r0]
            r5 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            r3[r13] = r5
            java.lang.String r5 = "alpha"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r1, r5, r3)
            android.animation.ObjectAnimator r3 = r3.setDuration(r11)
            java.lang.String r14 = "ofFloat(videoMask, \"alpha\", 1f).setDuration(400L)"
            gy3.C87412m.m108593f(r3, r14)
            r14 = 300(0x12c, double:1.48E-321)
            r3.setStartDelay(r14)
            float[] r14 = new float[r0]
            r0 = 0
            r14[r13] = r0
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r1, r5, r14)
            android.animation.ObjectAnimator r0 = r0.setDuration(r11)
            java.lang.String r13 = "ofFloat(videoMask, \"alpha\", 0f).setDuration(400L)"
            gy3.C87412m.m108593f(r0, r13)
            r13 = 1300(0x514, double:6.423E-321)
            r0.setStartDelay(r13)
            ve1.x1 r15 = new ve1.x1
            r15.<init>(r1)
            r0.addListener(r15)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.animation.AnimatorSet$Builder r0 = r1.play(r0)
            r0.after(r3)
            r1.start()
            r0 = 0
            r8.setVisibility(r0)
            r1 = 0
            r8.setAlpha(r1)
            r3 = 1
            float[] r15 = new float[r3]
            r18 = 1065353216(0x3f800000, float:1.0)
            r15[r0] = r18
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r8, r5, r15)
            android.animation.ObjectAnimator r15 = r15.setDuration(r11)
            java.lang.String r13 = "ofFloat(starIconTv, \"alpha\", 1f).setDuration(400L)"
            gy3.C87412m.m108593f(r15, r13)
            r13 = 300(0x12c, double:1.48E-321)
            r15.setStartDelay(r13)
            float[] r13 = new float[r3]
            r13[r0] = r1
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r8, r5, r13)
            android.animation.ObjectAnimator r8 = r8.setDuration(r11)
            java.lang.String r13 = "ofFloat(starIconTv, \"alpha\", 0f).setDuration(400L)"
            gy3.C87412m.m108593f(r8, r13)
            r13 = 1300(0x514, double:6.423E-321)
            r8.setStartDelay(r13)
            float[] r13 = new float[r3]
            r13[r0] = r1
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r10, r5, r13)
            android.animation.ObjectAnimator r0 = r0.setDuration(r11)
            java.lang.String r1 = "ofFloat(starAnimateView,…a\", 0f).setDuration(400L)"
            gy3.C87412m.m108593f(r0, r1)
            r10 = 1300(0x514, double:6.423E-321)
            r0.setStartDelay(r10)
            ve1.y1 r1 = new ve1.y1
            r1.<init>(r7, r2)
            r0.addListener(r1)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.animation.AnimatorSet$Builder r3 = r1.play(r8)
            android.animation.AnimatorSet$Builder r0 = r3.with(r0)
            r0.after(r15)
            r1.start()
            goto L_0x03a5
        L_0x03a2:
            r6 = r11
            r33 = r16
        L_0x03a5:
            if (r4 != 0) goto L_0x043c
            ve1.z1 r0 = new ve1.z1
            r0.<init>(r7, r2)
            r3 = 500(0x1f4, double:2.47E-321)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r5 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r1.mo10233c(r8)
            java.lang.Object[] r26 = r1.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper"
            java.lang.String r28 = "startOnlyAlpha"
            java.lang.String r29 = "(Landroid/view/View;JLkotlin/jvm/functions/Function0;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r2
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r5 = 0
            java.lang.Object r1 = r1.mo10231a(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.setVisibility(r1)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper"
            java.lang.String r27 = "startOnlyAlpha"
            java.lang.String r28 = "(Landroid/view/View;JLkotlin/jvm/functions/Function0;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            k20.a r1 = new k20.a
            r1.<init>()
            r5 = 0
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r1.mo10233c(r5)
            java.lang.Object[] r26 = r1.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper"
            java.lang.String r28 = "startOnlyAlpha"
            java.lang.String r29 = "(Landroid/view/View;JLkotlin/jvm/functions/Function0;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setAlpha"
            java.lang.String r32 = "(F)V"
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r5 = 0
            java.lang.Object r1 = r1.mo10231a(r5)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r2.setAlpha(r1)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/view/animation/LikeIconAnimationHelper"
            java.lang.String r27 = "startOnlyAlpha"
            java.lang.String r28 = "(Landroid/view/View;JLkotlin/jvm/functions/Function0;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setAlpha"
            java.lang.String r31 = "(F)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            tr1.f r1 = new tr1.f
            r1.<init>(r2, r3, r0)
            r2.post(r1)
        L_0x043c:
            tr1.b r14 = tr1.C14063b.f39453a
            java.lang.String r0 = "starIcon"
            r13 = r33
            gy3.C87412m.m108593f(r13, r0)
            r16 = 0
            r18 = 2
            r19 = 0
            r15 = r13
            tr1.C14063b.m13415c(r14, r15, r16, r18, r19)
        L_0x0450:
            android.view.View r0 = r7.f44854d
            r1 = 3
            r2 = 0
            r0.performHapticFeedback(r2, r1)
            r2 = r23
            r0 = 1
            r2.mo3486T(r0)
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r34
            r1 = r35
            m2151u(r0, r1, r2, r3, r4, r5)
            rs1.w6$a r0 = rs1.C13502w6.f38267r
            android.content.Context r1 = r7.f173499A
            gy3.C87412m.m108593f(r1, r9)
            rs1.w6 r0 = r0.mo12927a(r1)
            if (r0 == 0) goto L_0x0483
            r1 = 8
            rs1.k7 r2 = new rs1.k7
            r3 = 0
            r2.<init>(r0, r7, r1, r3)
            r0.mo12911P3(r7, r2)
            goto L_0x0483
        L_0x0480:
            r22 = r8
            r6 = r11
        L_0x0483:
            if (r6 == 0) goto L_0x049e
            bl3.r r0 = bl3.C39818r.f106831a
            android.content.Context r1 = r7.f173499A
            gy3.C87412m.m108593f(r1, r9)
            bl3.r$a r0 = r0.mo62443b(r1)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC> r1 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class
            bl3.t r0 = r0.mo62449e(r1)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r0 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) r0
            if (r0 == 0) goto L_0x049e
            r1 = 1
            r0.mo5125m3(r7, r1, r1)
        L_0x049e:
            r0 = r34
            boolean r1 = r0.f12565f
            if (r1 == 0) goto L_0x04d1
            if (r6 == 0) goto L_0x04d1
            wp1.j r1 = wp1.C15587j.f42215a
            java.lang.String r2 = "FinderObjectDynamicItemKey_FinderNoFinderUserFavToast"
            java.lang.String r1 = r1.mo14350b(r2)
            android.content.Context r2 = r7.f173499A
            if (r1 != 0) goto L_0x04c9
            r1 = 2131829301(0x7f112235, float:1.9291567E38)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r22.mo83962s0()
            r5 = 0
            r3[r5] = r4
            java.lang.String r1 = r2.getString(r1, r3)
            java.lang.String r3 = "holder.context.getString…derUtil.getStarWording())"
            gy3.C87412m.m108593f(r1, r3)
            goto L_0x04ca
        L_0x04c9:
            r5 = 0
        L_0x04ca:
            android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r2, (java.lang.CharSequence) r1, (int) r5)
            r1.show()
        L_0x04d1:
            r1 = 2131314283(0x7f09466b, float:1.8246987E38)
            android.view.View r1 = r7.mo85812D(r1)
            java.lang.Class<l31.e> r2 = l31.C61212e.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            l31.e r2 = (l31.C61212e) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            rx3.l r4 = new rx3.l
            java.lang.String r5 = "is_action_fav"
            r4.<init>(r5, r3)
            java.util.Map r3 = sx3.C90363p0.m113143b(r4)
            r4 = 24617(0x6029, float:3.4496E-41)
            java.lang.String r5 = "feed_fav_click"
            r2.mo86153W7(r5, r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2328y(jq3.o, int):void");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01df, code lost:
        r6 = new androidx.lifecycle.C54219z<>();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2329y0(jq3.C60905o r17) {
        /*
            r16 = this;
            r0 = r17
            bl3.r r1 = bl3.C39818r.f106831a
            android.content.Context r2 = r0.f173499A
            java.lang.String r3 = "holder.context"
            gy3.C87412m.m108593f(r2, r3)
            bl3.r$a r2 = r1.mo62443b(r2)
            java.lang.Class<rs1.w6> r3 = rs1.C13502w6.class
            bl3.t r2 = r2.mo62449e(r3)
            rs1.w6 r2 = (rs1.C13502w6) r2
            if (r2 == 0) goto L_0x01f6
            boolean r3 = r2.mo12926o3(r0)
            r4 = 0
            if (r3 == 0) goto L_0x01ac
            r3 = 2
            te3.pe1 r5 = rs1.C13502w6.m12821Q3(r2, r0, r4, r3, r4)
            rs1.w6$b r6 = r2.mo12914U3(r0)
            if (r5 == 0) goto L_0x01af
            te3.qe1 r5 = r6.f38290h
            if (r5 != 0) goto L_0x0031
            goto L_0x01af
        L_0x0031:
            int r6 = r5.f140260g
            r7 = 0
            r8 = 1
            if (r6 == r8) goto L_0x0039
            r6 = 1
            goto L_0x003a
        L_0x0039:
            r6 = 0
        L_0x003a:
            if (r6 != 0) goto L_0x009c
            rs1.w6$c r3 = rs1.C13502w6.C13505c.SHOWING_HEADER
            r2.mo12913T3(r0, r3)
            android.view.View r3 = r2.mo12920i3(r0)
            if (r3 == 0) goto L_0x01af
            r2.mo12909N3(r0, r5, r3)
            android.view.ViewParent r5 = r3.getParent()
            boolean r6 = r5 instanceof android.view.View
            if (r6 == 0) goto L_0x0055
            android.view.View r5 = (android.view.View) r5
            goto L_0x0056
        L_0x0055:
            r5 = r4
        L_0x0056:
            if (r5 == 0) goto L_0x01af
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r5.mo10233c(r6)
            java.lang.Object[] r9 = r5.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC"
            java.lang.String r11 = "showSurveyHeaderWithoutAnimate"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r3
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r5 = r5.mo10231a(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC"
            java.lang.String r10 = "showSurveyHeaderWithoutAnimate"
            java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x01af
        L_0x009c:
            int r6 = r5.f140261h
            if (r6 == r8) goto L_0x0104
            if (r6 == r3) goto L_0x00a4
            goto L_0x01af
        L_0x00a4:
            rs1.w6$c r3 = rs1.C13502w6.C13505c.SHOWING_SCORE
            r2.mo12913T3(r0, r3)
            android.view.View r3 = r2.mo12912R3(r0)
            if (r3 == 0) goto L_0x01af
            r2.mo12910O3(r0, r5, r3)
            android.view.ViewParent r5 = r3.getParent()
            boolean r6 = r5 instanceof android.view.View
            if (r6 == 0) goto L_0x00bd
            android.view.View r5 = (android.view.View) r5
            goto L_0x00be
        L_0x00bd:
            r5 = r4
        L_0x00be:
            if (r5 == 0) goto L_0x01af
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r5.mo10233c(r6)
            java.lang.Object[] r9 = r5.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC"
            java.lang.String r11 = "showScoreLayoutWithoutAnimate"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r3
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r5 = r5.mo10231a(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC"
            java.lang.String r10 = "showScoreLayoutWithoutAnimate"
            java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x01af
        L_0x0104:
            rs1.w6$c r3 = rs1.C13502w6.C13505c.SHOWING_CONTENT
            r2.mo12913T3(r0, r3)
            android.view.View r3 = r2.mo12920i3(r0)
            android.view.View r6 = r2.mo12917e3(r0)
            if (r3 == 0) goto L_0x01af
            if (r6 == 0) goto L_0x01af
            r2.mo12909N3(r0, r5, r3)
            r2.mo12908M3(r6, r5)
            android.view.ViewParent r5 = r6.getParent()
            boolean r8 = r5 instanceof android.view.View
            if (r8 == 0) goto L_0x0126
            android.view.View r5 = (android.view.View) r5
            goto L_0x0127
        L_0x0126:
            r5 = r4
        L_0x0127:
            if (r5 == 0) goto L_0x01af
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r5.mo10233c(r8)
            java.lang.Object[] r9 = r5.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC"
            java.lang.String r11 = "showSurveyLayoutWithoutAnimate"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r3
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r5 = r5.mo10231a(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC"
            java.lang.String r10 = "showSurveyLayoutWithoutAnimate"
            java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r3.mo10233c(r5)
            java.lang.Object[] r9 = r3.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC"
            java.lang.String r11 = "showSurveyLayoutWithoutAnimate"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r6
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r3 = r3.mo10231a(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r6.setVisibility(r3)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC"
            java.lang.String r10 = "showSurveyLayoutWithoutAnimate"
            java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x01af
        L_0x01ac:
            r2.mo12925n3(r0)
        L_0x01af:
            java.lang.Object r3 = r0.f173503E
            cm1.i2 r3 = (cm1.C0740i2) r3
            android.app.Activity r5 = r2.getContext()
            boolean r6 = r5 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r6 == 0) goto L_0x01be
            r4 = r5
            com.tencent.mm.ui.MMActivity r4 = (com.tencent.p014mm.p136ui.MMActivity) r4
        L_0x01be:
            if (r4 != 0) goto L_0x01c1
            goto L_0x01f6
        L_0x01c1:
            java.lang.Class<ht1.t1> r5 = ht1.C60200t1.class
            bl3.r$a r1 = r1.mo62446e(r5)
            java.lang.Class<pf1.n> r5 = pf1.C62273n.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r5)
            pf1.n r1 = (pf1.C62273n) r1
            long r5 = r3.getItemId()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, androidx.lifecycle.z<te3.re1>> r1 = r1.f177028p
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r6 = r1.get(r5)
            if (r6 != 0) goto L_0x01ec
            androidx.lifecycle.z r6 = new androidx.lifecycle.z
            r6.<init>()
            java.lang.Object r1 = r1.putIfAbsent(r5, r6)
            if (r1 != 0) goto L_0x01eb
            goto L_0x01ec
        L_0x01eb:
            r6 = r1
        L_0x01ec:
            androidx.lifecycle.z r6 = (androidx.lifecycle.C54219z) r6
            rs1.b7 r1 = new rs1.b7
            r1.<init>(r3, r2, r0)
            o40.C61926c.m72695t(r6, r4, r1)
        L_0x01f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.mo2329y0(jq3.o):void");
    }

    /* renamed from: z */
    public int mo2330z(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        return (int) (((float) C7865r3.f26468a.mo8969b(oVar.f173499A)) * C7515a.f25777a.mo8637a(oVar.f173499A));
    }
}
