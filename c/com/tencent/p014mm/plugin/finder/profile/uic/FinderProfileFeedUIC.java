package com.tencent.p014mm.plugin.finder.profile.uic;

import ak1.C0075i;
import ak1.C54067f0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import as1.C0201a;
import bl3.C39818r;
import cm1.C0740i2;
import co1.C0898b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedStickyEvent;
import com.tencent.p014mm.autogen.events.FinderProfileChangeFeedEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.FinderProfileFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileTimeLineUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicTimelineUI;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.profile.FinderProfileLayoutConfig;
import com.tencent.p014mm.plugin.finder.profile.FinderProfileLayoutConfig$getItemConvertFactory$1;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderRefreshLayout;
import com.tencent.p014mm.plugin.finder.view.drawer.FinderDraggableLayout;
import com.tencent.p014mm.plugin.finder.view.refresh.FinderProfileLoaderMoreFooter;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import de1.C7267b;
import de1.C7287o;
import di3.C7335d;
import di3.C86312j;
import dp1.C58408t0;
import dp1.C58417y0;
import dp1.C7450q;
import ef1.C58556f;
import ej3.C45662a;
import er1.C58684b;
import er1.C58739j4;
import er1.C58784w3;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60214y3;
import ht1.C8770h2;
import ht1.C8777j5;
import ht1.C8808v4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import jq3.C60896i;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import ko1.C10374g;
import kotlin.Metadata;
import ks3.C10412u;
import l31.C61212e;
import ls3.C10649f;
import mf1.C10814e1;
import mo1.C11025q;
import mo1.C11062x;
import mq3.C21524b;
import mq3.C61566c;
import ns3.C11266d;
import o40.C61926c;
import oq3.C21804c;
import oq3.C21805g;
import org.json.JSONObject;
import p192l4.C10462b;
import qq3.C63318b;
import rq3.C63508a;
import rq3.C63509c;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48924by0;
import te3.C49712hj1;
import te3.C52025xv;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64347eq2;
import te3.C64686ro2;
import tf1.C13908i;
import tf1.C13913l;
import up1.C37521f;
import vp1.C14940p;
import ye1.C15985z;
import zp3.C79406f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001ZB\u000f\u0012\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bX\u0010YJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\u0006\u0010\r\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J \u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J \u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J \u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J \u0010 \u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u0002H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0002R\u001b\u0010'\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010+\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0002¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010/R\u001b\u00103\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u0010*R\u001b\u00108\u001a\u0002048BX\u0002¢\u0006\f\n\u0004\b5\u0010$\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0002¢\u0006\f\n\u0004\b:\u0010$\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0002¢\u0006\f\n\u0004\b?\u0010$\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0002¢\u0006\f\n\u0004\bD\u0010$\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0002¢\u0006\f\n\u0004\bI\u0010$\u001a\u0004\bJ\u0010KR\u001f\u0010Q\u001a\u00060MR\u00020\u00008BX\u0002¢\u0006\f\n\u0004\bN\u0010$\u001a\u0004\bO\u0010PR\u0011\u0010U\u001a\u00020R8F¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006["}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC;", "Lmo1/x;", "Lrx3/b0;", "setCoveredStyle", "setNormalStyle", "", "getLayoutId", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "onResume", "onPause", "showMoveMvTabTips", "Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "Lcm1/i2;", "adapter", "initFilterView", "", "invokeSource", "commentScene", "Lcom/tencent/mm/protocal/protobuf/FinderObject;", "feed", "startPreloadVideo", "pos", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "Landroid/view/View;", "view", "jumpProfileTimeline", "jumpToLive", "", "launchWithAnim", "enterFinderLiveVisitorUI", "jumpToSnsAlbumPicker", "get21053ChnlExtra", "o", "Lrx3/g;", "getDrawerMode", "()Z", "drawerMode", "p", "getFromFeedType", "()I", "fromFeedType", "", "q", "getFromFeedId", "()J", "fromFeedId", "r", "getFromCommentScene", "fromCommentScene", "Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader;", "s", "getFeedLoader", "()Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader;", "feedLoader", "Lcom/tencent/mm/plugin/finder/profile/FinderProfileLayoutConfig;", "t", "getLayoutConfig", "()Lcom/tencent/mm/plugin/finder/profile/FinderProfileLayoutConfig;", "layoutConfig", "Lcom/tencent/mm/plugin/finder/view/FinderRefreshLayout;", "u", "getRlLayout", "()Lcom/tencent/mm/plugin/finder/view/FinderRefreshLayout;", "rlLayout", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "v", "getRecyclerView", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "recyclerView", "Lye1/z;", "w", "getUiBinding", "()Lye1/z;", "uiBinding", "Lcom/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$a;", "z", "getActionCallback", "()Lcom/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$a;", "actionCallback", "Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;", "getState", "()Lcom/tencent/mm/plugin/finder/feed/model/FinderProfileFeedLoader$State;", "state", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroidx/fragment/app/Fragment;)V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC */
public final class FinderProfileFeedUIC extends C11062x {

    /* renamed from: A */
    public C10374g f16141A;

    /* renamed from: B */
    public int f16142B = -1;

    /* renamed from: C */
    public C60214y3 f16143C = ((C8770h2) C86312j.m106911c(C8770h2.class)).mo9593Yf();

    /* renamed from: D */
    public final FinderProfileFeedUIC$feedProgressListener$1 f16144D = new FinderProfileFeedUIC$feedProgressListener$1(this, C40008f.f107254d);

    /* renamed from: E */
    public final C3444k f16145E;

    /* renamed from: o */
    public final C13601g f16146o = C36568h.m40985a(new C3436c(this));

    /* renamed from: p */
    public final C13601g f16147p = C36568h.m40985a(new C3440g(this));

    /* renamed from: q */
    public final C13601g f16148q = C36568h.m40985a(new C3439f(this));

    /* renamed from: r */
    public final C13601g f16149r = C36568h.m40985a(new C3438e(this));

    /* renamed from: s */
    public final C13601g f16150s = C36568h.m40985a(new C3437d(this));

    /* renamed from: t */
    public final C13601g f16151t = C36568h.m40985a(new C3443j(this));

    /* renamed from: u */
    public final C13601g f16152u = C36568h.m40985a(new C3457y(this));

    /* renamed from: v */
    public final C13601g f16153v = C36568h.m40985a(new C3456x(this));

    /* renamed from: w */
    public final C13601g f16154w = C36568h.m40985a(new C3434a0(this));

    /* renamed from: x */
    public FrameLayout f16155x;

    /* renamed from: y */
    public FrameLayout f16156y;

    /* renamed from: z */
    public final C13601g f16157z = C36568h.m40985a(new C3435b(this));

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$a */
    public final class C3431a extends FinderRefreshLayout.C3972b {

        /* renamed from: e */
        public final /* synthetic */ FinderProfileFeedUIC f16158e;

        /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$a$a */
        public static final class C3432a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderProfileFeedUIC f16159d;

            /* renamed from: e */
            public final /* synthetic */ C3431a f16160e;

            /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$a$a$a */
            public /* synthetic */ class C3433a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f16161a;

                static {
                    int[] iArr = new int[FinderProfileFeedLoader.State.values().length];
                    iArr[FinderProfileFeedLoader.State.LOADING.ordinal()] = 1;
                    iArr[FinderProfileFeedLoader.State.LOADED.ordinal()] = 2;
                    iArr[FinderProfileFeedLoader.State.FAILURE.ordinal()] = 3;
                    iArr[FinderProfileFeedLoader.State.PRIVATE_LOCK.ordinal()] = 4;
                    iArr[FinderProfileFeedLoader.State.BLOCKED.ordinal()] = 5;
                    f16161a = iArr;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3432a(FinderProfileFeedUIC finderProfileFeedUIC, C3431a aVar) {
                super(0);
                this.f16159d = finderProfileFeedUIC;
                this.f16160e = aVar;
            }

            public Object invoke() {
                View view;
                View view2;
                FrameLayout access$getStateLayout$p;
                FrameLayout access$getStateLayout$p2;
                Class cls = FinderProfileUiStyleUIC.class;
                Class cls2 = C58417y0.class;
                Log.m105924i("Finder.ProfileFeedUIC", "[updateState] state=" + this.f16159d.getFeedLoader().getState() + " cachedState=" + this.f16159d.getFeedLoader().getCachedState());
                FrameLayout access$getStateLayout$p3 = this.f16159d.f16155x;
                FrameLayout.LayoutParams layoutParams = null;
                if (access$getStateLayout$p3 != null) {
                    access$getStateLayout$p3.setOnClickListener((View.OnClickListener) null);
                    access$getStateLayout$p3.setVisibility(8);
                }
                C39818r rVar = C39818r.f106831a;
                if (((FinderProfileUiStyleUIC) rVar.mo62444c(this.f16159d.getActivity()).mo75002a(cls)).mo3861i0()) {
                    FrameLayout access$getMainFlowLayout$p = this.f16159d.f16156y;
                    if (access$getMainFlowLayout$p != null) {
                        access$getMainFlowLayout$p.setBackgroundResource(C0966R.color.ahf);
                    }
                } else {
                    FrameLayout access$getMainFlowLayout$p2 = this.f16159d.f16156y;
                    if (access$getMainFlowLayout$p2 != null) {
                        access$getMainFlowLayout$p2.setBackgroundResource(C0966R.color.f2932f);
                    }
                }
                boolean z = true;
                int i = 0;
                if (this.f16159d.getFeedLoader().getCachedState() == FinderProfileFeedLoader.CacheState.NO_CACHE) {
                    int i2 = C3433a.f16161a[this.f16159d.getFeedLoader().getState().ordinal()];
                    if (i2 == 1) {
                        FrameLayout access$getStateLayout$p4 = this.f16159d.f16155x;
                        if (access$getStateLayout$p4 != null) {
                            FinderProfileFeedUIC finderProfileFeedUIC = this.f16159d;
                            access$getStateLayout$p4.setVisibility(0);
                            finderProfileFeedUIC.getUiBinding().f43030h.setVisibility(8);
                            finderProfileFeedUIC.getUiBinding().f43023a.setVisibility(8);
                            finderProfileFeedUIC.getUiBinding().f43032j.setVisibility(8);
                            finderProfileFeedUIC.getUiBinding().f43029g.setVisibility(0);
                            finderProfileFeedUIC.getUiBinding().f43031i.setVisibility(8);
                        }
                    } else if (i2 == 2) {
                        FrameLayout access$getStateLayout$p5 = this.f16159d.f16155x;
                        if (access$getStateLayout$p5 != null) {
                            FinderProfileFeedUIC finderProfileFeedUIC2 = this.f16159d;
                            access$getStateLayout$p5.setVisibility(0);
                            finderProfileFeedUIC2.getUiBinding().f43030h.setVisibility(0);
                            finderProfileFeedUIC2.getUiBinding().f43023a.setVisibility(8);
                            finderProfileFeedUIC2.getUiBinding().f43032j.setVisibility(8);
                            finderProfileFeedUIC2.getUiBinding().f43029g.setVisibility(8);
                            if (finderProfileFeedUIC2.isSelfFlag()) {
                                RelativeLayout relativeLayout = finderProfileFeedUIC2.getUiBinding().f43031i;
                                relativeLayout.setVisibility(0);
                                if (!((C58417y0) C86312j.m106911c(cls2)).f167358o && finderProfileFeedUIC2.getFeedLoader().getSize() == 0) {
                                    ((C58417y0) C86312j.m106911c(cls2)).f167359p = false;
                                    ((C58417y0) C86312j.m106911c(cls2)).f167358o = true;
                                    Context context = relativeLayout.getContext();
                                    C87412m.m108593f(context, "context");
                                    ((C58417y0) C86312j.m106911c(cls2)).Ly0(context, false, false);
                                }
                                relativeLayout.setOnClickListener(new C3528c(relativeLayout, finderProfileFeedUIC2));
                                finderProfileFeedUIC2.getUiBinding().f43030h.setVisibility(8);
                            } else {
                                finderProfileFeedUIC2.getUiBinding().f43031i.setVisibility(8);
                                finderProfileFeedUIC2.getUiBinding().f43030h.setVisibility(0);
                            }
                        }
                    } else if (i2 == 3 && (access$getStateLayout$p2 = this.f16159d.f16155x) != null) {
                        FinderProfileFeedUIC finderProfileFeedUIC3 = this.f16159d;
                        C3431a aVar = this.f16160e;
                        access$getStateLayout$p2.setVisibility(0);
                        finderProfileFeedUIC3.getUiBinding().f43030h.setVisibility(8);
                        finderProfileFeedUIC3.getUiBinding().f43023a.setVisibility(8);
                        finderProfileFeedUIC3.getUiBinding().f43032j.setVisibility(0);
                        finderProfileFeedUIC3.getUiBinding().f43029g.setVisibility(8);
                        finderProfileFeedUIC3.getUiBinding().f43031i.setVisibility(8);
                        access$getStateLayout$p2.setOnClickListener(new C3529d(finderProfileFeedUIC3, aVar));
                    }
                    if (((FinderProfileUiStyleUIC) rVar.mo62444c(this.f16159d.getActivity()).mo75002a(cls)).mo3861i0()) {
                        FrameLayout access$getMainFlowLayout$p3 = this.f16159d.f16156y;
                        if (access$getMainFlowLayout$p3 != null) {
                            access$getMainFlowLayout$p3.setBackgroundResource(C0966R.color.ahf);
                        }
                    } else {
                        FrameLayout access$getMainFlowLayout$p4 = this.f16159d.f16156y;
                        if (access$getMainFlowLayout$p4 != null) {
                            access$getMainFlowLayout$p4.setBackgroundResource(C0966R.color.f2932f);
                        }
                    }
                }
                int i3 = C3433a.f16161a[this.f16159d.getFeedLoader().getState().ordinal()];
                if (i3 == 4) {
                    FrameLayout access$getStateLayout$p6 = this.f16159d.f16155x;
                    if (access$getStateLayout$p6 != null) {
                        FinderProfileFeedUIC finderProfileFeedUIC4 = this.f16159d;
                        access$getStateLayout$p6.setVisibility(0);
                        finderProfileFeedUIC4.getUiBinding().f43030h.setVisibility(8);
                        finderProfileFeedUIC4.getUiBinding().f43023a.setVisibility(0);
                        finderProfileFeedUIC4.getUiBinding().f43032j.setVisibility(8);
                        finderProfileFeedUIC4.getUiBinding().f43029g.setVisibility(8);
                        finderProfileFeedUIC4.getUiBinding().f43031i.setVisibility(8);
                    }
                    if (((FinderProfileUiStyleUIC) rVar.mo62444c(this.f16159d.getActivity()).mo75002a(cls)).mo3861i0()) {
                        FrameLayout access$getMainFlowLayout$p5 = this.f16159d.f16156y;
                        if (access$getMainFlowLayout$p5 != null) {
                            access$getMainFlowLayout$p5.setBackgroundResource(C0966R.color.ahf);
                        }
                    } else {
                        FrameLayout access$getMainFlowLayout$p6 = this.f16159d.f16156y;
                        if (access$getMainFlowLayout$p6 != null) {
                            access$getMainFlowLayout$p6.setBackgroundResource(C0966R.color.f2932f);
                        }
                    }
                } else if (i3 == 5 && (access$getStateLayout$p = this.f16159d.f16155x) != null) {
                    FinderProfileFeedUIC finderProfileFeedUIC5 = this.f16159d;
                    access$getStateLayout$p.setVisibility(0);
                    finderProfileFeedUIC5.getUiBinding().f43030h.setVisibility(8);
                    finderProfileFeedUIC5.getUiBinding().f43023a.setVisibility(0);
                    finderProfileFeedUIC5.getUiBinding().f43024b.setText(finderProfileFeedUIC5.getActivity().getString(C0966R.string.ejq));
                    finderProfileFeedUIC5.getUiBinding().f43032j.setVisibility(8);
                    finderProfileFeedUIC5.getUiBinding().f43029g.setVisibility(8);
                    finderProfileFeedUIC5.getUiBinding().f43031i.setVisibility(8);
                }
                FrameLayout access$getStateLayout$p7 = this.f16159d.f16155x;
                if (access$getStateLayout$p7 != null && access$getStateLayout$p7.getVisibility() == 0) {
                    C10374g access$getFilterContract$p = this.f16159d.f16141A;
                    if (access$getFilterContract$p == null || (view2 = access$getFilterContract$p.getView()) == null || view2.getVisibility() != 0) {
                        z = false;
                    }
                    if (z) {
                        FrameLayout access$getStateLayout$p8 = this.f16159d.f16155x;
                        ViewGroup.LayoutParams layoutParams2 = access$getStateLayout$p8 != null ? access$getStateLayout$p8.getLayoutParams() : null;
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                        }
                        if (layoutParams != null) {
                            FinderProfileFeedUIC finderProfileFeedUIC6 = this.f16159d;
                            C10374g access$getFilterContract$p2 = finderProfileFeedUIC6.f16141A;
                            if (!(access$getFilterContract$p2 == null || (view = access$getFilterContract$p2.getView()) == null)) {
                                i = view.getHeight();
                            }
                            layoutParams.topMargin = i;
                            FrameLayout access$getStateLayout$p9 = finderProfileFeedUIC6.f16155x;
                            if (access$getStateLayout$p9 != null) {
                                access$getStateLayout$p9.setLayoutParams(layoutParams);
                            }
                        }
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3431a(FinderProfileFeedUIC finderProfileFeedUIC, FinderRefreshLayout finderRefreshLayout) {
            super(finderRefreshLayout);
            C87412m.m108594g(finderRefreshLayout, "rlLayout");
            this.f16158e = finderProfileFeedUIC;
        }

        /* renamed from: a */
        public int mo3801a() {
            RecyclerView.C16613e adapter = this.f16158e.getRecyclerView().getAdapter();
            WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
            if (wxRecyclerAdapter != null) {
                return wxRecyclerAdapter.mo85796c6();
            }
            return 0;
        }

        /* renamed from: b */
        public void mo3802b() {
            C61926c.m72666K(0, new C3432a(this.f16158e, this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$a0 */
    public static final class C3434a0 extends C87413o implements C32224a<C15985z> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16162d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3434a0(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(0);
            this.f16162d = finderProfileFeedUIC;
        }

        public Object invoke() {
            View findViewById = this.f16162d.findViewById(C0966R.C0970id.gks);
            int i = C0966R.C0970id.nmw;
            LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.nmw);
            if (linearLayout != null) {
                i = C0966R.C0970id.nmx;
                WeImageView weImageView = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.nmx);
                if (weImageView != null) {
                    i = C0966R.C0970id.nmy;
                    TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.nmy);
                    if (textView != null) {
                        i = C0966R.C0970id.edq;
                        LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.edq);
                        if (linearLayout2 != null) {
                            i = C0966R.C0970id.edr;
                            WeImageView weImageView2 = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.edr);
                            if (weImageView2 != null) {
                                i = C0966R.C0970id.eds;
                                TextView textView2 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.eds);
                                if (textView2 != null) {
                                    FrameLayout frameLayout = (FrameLayout) findViewById;
                                    i = C0966R.C0970id.i5g;
                                    FrameLayout frameLayout2 = (FrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.i5g);
                                    if (frameLayout2 != null) {
                                        i = C0966R.C0970id.i6k;
                                        WxRecyclerView wxRecyclerView = (WxRecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.i6k);
                                        if (wxRecyclerView != null) {
                                            i = C0966R.C0970id.ivc;
                                            FinderRefreshLayout finderRefreshLayout = (FinderRefreshLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ivc);
                                            if (finderRefreshLayout != null) {
                                                i = C0966R.C0970id.f359384kn0;
                                                LinearLayout linearLayout3 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f359384kn0);
                                                if (linearLayout3 != null) {
                                                    i = C0966R.C0970id.f359385kn1;
                                                    TextView textView3 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.f359385kn1);
                                                    if (textView3 != null) {
                                                        i = C0966R.C0970id.kne;
                                                        ProgressBar progressBar = (ProgressBar) C10462b.m10395a(findViewById, C0966R.C0970id.kne);
                                                        if (progressBar != null) {
                                                            i = C0966R.C0970id.knh;
                                                            TextView textView4 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.knh);
                                                            if (textView4 != null) {
                                                                i = C0966R.C0970id.kni;
                                                                RelativeLayout relativeLayout = (RelativeLayout) C10462b.m10395a(findViewById, C0966R.C0970id.kni);
                                                                if (relativeLayout != null) {
                                                                    i = C0966R.C0970id.knk;
                                                                    TextView textView5 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.knk);
                                                                    if (textView5 != null) {
                                                                        i = C0966R.C0970id.knl;
                                                                        TextView textView6 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.knl);
                                                                        if (textView6 != null) {
                                                                            return new C15985z(frameLayout, linearLayout, weImageView, textView, linearLayout2, weImageView2, textView2, frameLayout, frameLayout2, wxRecyclerView, finderRefreshLayout, linearLayout3, textView3, progressBar, textView4, relativeLayout, textView5, textView6);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$b */
    public static final class C3435b extends C87413o implements C32224a<C3431a> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16163d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3435b(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(0);
            this.f16163d = finderProfileFeedUIC;
        }

        public Object invoke() {
            FinderProfileFeedUIC finderProfileFeedUIC = this.f16163d;
            FinderRefreshLayout access$getRlLayout = finderProfileFeedUIC.getRlLayout();
            C87412m.m108593f(access$getRlLayout, "rlLayout");
            return new C3431a(finderProfileFeedUIC, access$getRlLayout);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$c */
    public static final class C3436c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16164d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3436c(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(0);
            this.f16164d = finderProfileFeedUIC;
        }

        public Object invoke() {
            Intent intent = this.f16164d.getIntent();
            boolean z = false;
            if (intent != null) {
                z = intent.getBooleanExtra(VASActivity.KEY_IS_FRAGMENT_MODE, false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$d */
    public static final class C3437d extends C87413o implements C32224a<FinderProfileFeedLoader> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16165d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3437d(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(0);
            this.f16165d = finderProfileFeedUIC;
        }

        public Object invoke() {
            C13908i iVar = C13908i.FEED_PROFILE;
            String username = this.f16165d.getUsername();
            C87412m.m108591d(username);
            return new FinderProfileFeedLoader(iVar, username, this.f16165d.getContextObj(), false, false, 24, (C8480h) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$e */
    public static final class C3438e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16166d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3438e(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(0);
            this.f16166d = finderProfileFeedUIC;
        }

        public Object invoke() {
            return Integer.valueOf(this.f16166d.getIntent().getIntExtra("finder_from_feed_comment_scene", -1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$f */
    public static final class C3439f extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16167d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3439f(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(0);
            this.f16167d = finderProfileFeedUIC;
        }

        public Object invoke() {
            return Long.valueOf(this.f16167d.getIntent().getLongExtra("finder_read_feed_id", -1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$g */
    public static final class C3440g extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16168d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3440g(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(0);
            this.f16168d = finderProfileFeedUIC;
        }

        public Object invoke() {
            return Integer.valueOf(this.f16168d.getIntent().getIntExtra("finder_from_feed_type", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$h */
    public static final class C3441h extends C87413o implements C32226l<Intent, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16169d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3441h(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(1);
            this.f16169d = finderProfileFeedUIC;
        }

        public Object invoke(Object obj) {
            Intent intent = (Intent) obj;
            C87412m.m108594g(intent, "data");
            C58784w3 w3Var = C58784w3.f168295a;
            WxRecyclerView access$getRecyclerView = this.f16169d.getRecyclerView();
            C87412m.m108593f(access$getRecyclerView, "recyclerView");
            C58784w3.m68440p1(w3Var, intent, access$getRecyclerView, this.f16169d.getFeedLoader(), false, (C32226l) null, 24, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$i */
    public static final class C3442i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16170d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f16171e;

        /* renamed from: f */
        public final /* synthetic */ int f16172f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3442i(FinderProfileFeedUIC finderProfileFeedUIC, BaseFinderFeed baseFinderFeed, int i) {
            super(0);
            this.f16170d = finderProfileFeedUIC;
            this.f16171e = baseFinderFeed;
            this.f16172f = i;
        }

        public Object invoke() {
            this.f16170d.enterFinderLiveVisitorUI(this.f16171e, this.f16172f, true);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$j */
    public static final class C3443j extends C87413o implements C32224a<FinderProfileLayoutConfig> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16173d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3443j(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(0);
            this.f16173d = finderProfileFeedUIC;
        }

        public Object invoke() {
            return new FinderProfileLayoutConfig(this.f16173d.getActivity(), this.f16173d.isSelfFlag(), 0, this.f16173d.getDrawerMode());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$k */
    public static final class C3444k extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16174d;

        public C3444k(FinderProfileFeedUIC finderProfileFeedUIC) {
            this.f16174d = finderProfileFeedUIC;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$mHellOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$mHellOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$mHellOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recycleView");
            super.onScrolled(recyclerView, i, i2);
            FinderProfileFeedUIC finderProfileFeedUIC = this.f16174d;
            C58784w3 w3Var = C58784w3.f168295a;
            WxRecyclerView access$getRecyclerView = finderProfileFeedUIC.getRecyclerView();
            C87412m.m108593f(access$getRecyclerView, "recyclerView");
            finderProfileFeedUIC.f16142B = ((Number) w3Var.mo83974w0(access$getRecyclerView, false).f38556e).intValue();
            C11025q qVar = (C11025q) C39818r.f106831a.mo62443b(this.f16174d.getContext()).mo75002a(C11025q.class);
            qVar.f32767u = this.f16174d.f16142B;
            qVar.mo11177e3();
            ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9611fM(this.f16174d.getRecyclerView(), C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "temp_5", C0075i.EVENT_ON_SCROLL, this.f16174d.getFromFeedType(), this.f16174d.getFromFeedId(), this.f16174d.getFromCommentScene());
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$mHellOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$l */
    public static final class C3445l extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16175d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3445l(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(1);
            this.f16175d = finderProfileFeedUIC;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C11025q qVar = (C11025q) C39818r.f106831a.mo62443b(this.f16175d.getContext()).mo75002a(C11025q.class);
            qVar.f32768v = intValue;
            qVar.mo11177e3();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$m */
    public static final class C3446m extends C87413o implements C32226l<C32224a<? extends C13598b0>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16176d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3446m(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(1);
            this.f16176d = finderProfileFeedUIC;
        }

        public Object invoke(Object obj) {
            C32224a<C13598b0> aVar = (C32224a) obj;
            C87412m.m108594g(aVar, "callback");
            C11025q qVar = (C11025q) C39818r.f106831a.mo62443b(this.f16176d.getContext()).mo75002a(C11025q.class);
            qVar.f32770x = true;
            qVar.f32752C = aVar;
            qVar.mo11177e3();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$n */
    public static final class C3447n extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16177d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3447n(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(1);
            this.f16177d = finderProfileFeedUIC;
        }

        public Object invoke(Object obj) {
            ((Number) obj).intValue();
            this.f16177d.getRlLayout().mo26580f(true);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$o */
    public static final class C3448o extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16178d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3448o(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(0);
            this.f16178d = finderProfileFeedUIC;
        }

        public Object invoke() {
            C63318b bVar = this.f16178d.getRlLayout().f56672p;
            if (bVar != null) {
                bVar.onLoadMore();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$p */
    public static final class C3449p implements C63318b {

        /* renamed from: a */
        public final /* synthetic */ FinderProfileFeedUIC f16179a;

        public C3449p(FinderProfileFeedUIC finderProfileFeedUIC) {
            this.f16179a = finderProfileFeedUIC;
        }

        /* renamed from: a */
        public void mo3374a(boolean z) {
        }

        public void onLoadMore() {
            BaseFeedLoader.requestLoadMore$default(this.f16179a.getFeedLoader(), false, 1, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$q */
    public static final class C3450q extends WxRecyclerAdapter<C0740i2> {

        /* renamed from: G */
        public final /* synthetic */ FinderProfileFeedUIC f16180G;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3450q(FinderProfileFeedUIC finderProfileFeedUIC, C9500j jVar, DataBuffer<C0740i2> dataBuffer) {
            super(jVar, dataBuffer, false);
            this.f16180G = finderProfileFeedUIC;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
            C60905o oVar = (C60905o) zVar;
            Class cls = C61212e.class;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(list, "payloads");
            super.onBindViewHolder(oVar, i, list);
            C0740i2 i2Var = (C0740i2) oVar.f173503E;
            if (i2Var instanceof BaseFinderFeed) {
                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                if (C58739j4.f168176a.mo83686O(baseFinderFeed)) {
                    ((C61212e) C86312j.m106911c(cls)).o30(oVar.f44854d, "profile_live_room_card");
                    ((C61212e) C86312j.m106911c(cls)).mo86175pO(oVar.f44854d, 40, 26236);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
                    if (liveInfo != null) {
                        linkedHashMap.put("live_id", C61926c.m72691p(liveInfo.f182392d));
                    }
                    linkedHashMap.put("feed_id", C61926c.m72691p(baseFinderFeed.mo3513o().getFeedObject().f164794id));
                    String str = baseFinderFeed.mo3513o().getFeedObject().username;
                    if (str == null) {
                        str = "";
                    }
                    linkedHashMap.put("finder_username", str);
                    linkedHashMap.put("comment_scene", "temp_5");
                    linkedHashMap.put("session_buffer", "");
                    ((C61212e) C86312j.m106911c(cls)).mo86149PM(oVar.f44854d, linkedHashMap);
                    ((C61212e) C86312j.m106911c(cls)).E60(oVar.f44854d, new C3530e(this.f16180G, i2Var));
                }
            }
        }

        /* renamed from: z6 */
        public void onViewAttachedToWindow(C60905o oVar) {
            C87412m.m108594g(oVar, "holder");
            super.onViewAttachedToWindow(oVar);
            ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = oVar.f44859i == FinderProfileFeedUIC.access$getFILTER_VIEW_TYPE$cp();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$r */
    public static final class C3451r implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16181d;

        /* renamed from: e */
        public final /* synthetic */ C3450q f16182e;

        public C3451r(FinderProfileFeedUIC finderProfileFeedUIC, C3450q qVar) {
            this.f16181d = finderProfileFeedUIC;
            this.f16182e = qVar;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            Activity parentActivity;
            C0201a aVar;
            C60905o oVar = (C60905o) zVar;
            Class cls = FinderProfileDrawerUIC.class;
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(oVar, "holder");
            Object obj = oVar.f173503E;
            C0740i2 i2Var = obj instanceof C0740i2 ? (C0740i2) obj : null;
            if (i2Var != null) {
                C37521f.f99374d.getClass();
                if (C37521f.f99399f7.mo60266n().intValue() == 1) {
                    Activity context = this.f16181d.getContext();
                    VASActivity vASActivity = context instanceof VASActivity ? (VASActivity) context : null;
                    if (!(vASActivity == null || (parentActivity = vASActivity.getParentActivity()) == null)) {
                        FinderProfileFeedUIC finderProfileFeedUIC = this.f16181d;
                        boolean z = false;
                        if (finderProfileFeedUIC.getDrawerMode() && (parentActivity instanceof FinderProfileTimeLineUI)) {
                            C39818r rVar = C39818r.f106831a;
                            AppCompatActivity appCompatActivity = (AppCompatActivity) parentActivity;
                            FinderProfileDrawerUIC finderProfileDrawerUIC = (FinderProfileDrawerUIC) rVar.mo62444c(appCompatActivity).mo62449e(cls);
                            if (!(finderProfileDrawerUIC == null || (aVar = finderProfileDrawerUIC.f18766f) == null)) {
                                FinderDraggableLayout.m4279a(aVar, false, 1, (Object) null);
                            }
                            FinderProfileDrawerUIC finderProfileDrawerUIC2 = (FinderProfileDrawerUIC) rVar.mo62444c(appCompatActivity).mo62449e(cls);
                            if (finderProfileDrawerUIC2 != null) {
                                finderProfileDrawerUIC2.mo5170f3(i2Var.getItemId(), 30, i2Var);
                                return;
                            }
                            return;
                        } else if (finderProfileFeedUIC.getDrawerMode() && (parentActivity instanceof FinderTopicTimelineUI)) {
                            FinderProfileChangeFeedEvent finderProfileChangeFeedEvent = new FinderProfileChangeFeedEvent();
                            finderProfileChangeFeedEvent.f9239d.f9240a = i2Var.getItemId();
                            finderProfileChangeFeedEvent.f9239d.f9241b = finderProfileFeedUIC.getUsername();
                            FinderTopicTimelineUI finderTopicTimelineUI = (FinderTopicTimelineUI) parentActivity;
                            if (finderTopicTimelineUI.f14908G) {
                                finderTopicTimelineUI.f14906E = finderProfileChangeFeedEvent;
                                if (!finderTopicTimelineUI.isFinishing()) {
                                    finderTopicTimelineUI.finish();
                                    finderTopicTimelineUI.f14909H = true;
                                    z = true;
                                }
                            }
                            if (z) {
                                return;
                            }
                        }
                    }
                }
                this.f16181d.getFeedLoader().clearMarkRead();
                C39818r rVar2 = C39818r.f106831a;
                C11025q qVar = (C11025q) rVar2.mo62443b(this.f16181d.getContext()).mo75002a(C11025q.class);
                qVar.mo11176d3();
                qVar.f32769w = true;
                if (i2Var instanceof BaseFinderFeed) {
                    int c6 = i - this.f16182e.mo85796c6();
                    Log.m105924i("Finder.ProfileFeedUIC", "onItemClick position:" + c6);
                    BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                    if (C58739j4.f168176a.mo83686O(baseFinderFeed)) {
                        this.f16181d.jumpToLive(baseFinderFeed, c6, view);
                    } else {
                        this.f16181d.jumpProfileTimeline(c6, baseFinderFeed, view);
                    }
                    C7450q.f25643a.mo8594b(((C13442s8) rVar2.mo62443b(this.f16181d.getContext()).mo75002a(C13442s8.class)).mo12861q3(), i2Var, 18);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$s */
    public static final class C3452s extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16183d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3452s(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(0);
            this.f16183d = finderProfileFeedUIC;
        }

        /* JADX WARNING: type inference failed for: r0v15, types: [androidx.recyclerview.widget.RecyclerView$e] */
        /* JADX WARNING: type inference failed for: r3v7, types: [ko1.a] */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
            r3 = r3.f141509d;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r14 = this;
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC r0 = r14.f16183d
                ko1.g r0 = r0.f16141A
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x006e
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC r0 = r14.f16183d
                com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader r3 = r0.getFeedLoader()
                te3.sh0 r3 = r3.getCollectionInfoList()
                if (r3 == 0) goto L_0x0023
                java.util.LinkedList<te3.rh0> r3 = r3.f141509d
                if (r3 == 0) goto L_0x0023
                boolean r3 = r3.isEmpty()
                r3 = r3 ^ r2
                if (r3 != r2) goto L_0x0023
                r3 = 1
                goto L_0x0024
            L_0x0023:
                r3 = 0
            L_0x0024:
                if (r3 == 0) goto L_0x0048
                ko1.a r3 = new ko1.a
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC r4 = r14.f16183d
                androidx.appcompat.app.AppCompatActivity r4 = r4.getActivity()
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC r5 = r14.f16183d
                com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader r5 = r5.getFeedLoader()
                te3.sh0 r5 = r5.getCollectionInfoList()
                gy3.C87412m.m108591d(r5)
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC r6 = r14.f16183d
                java.lang.String r6 = r6.getUsername()
                gy3.C87412m.m108591d(r6)
                r3.<init>(r4, r5, r6)
                goto L_0x006b
            L_0x0048:
                ko1.c r3 = new ko1.c
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC r4 = r14.f16183d
                androidx.appcompat.app.AppCompatActivity r8 = r4.getActivity()
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC r4 = r14.f16183d
                com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader r4 = r4.getFeedLoader()
                java.util.ArrayList r9 = r4.getTopicFilterList()
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC r4 = r14.f16183d
                java.lang.String r10 = r4.getUsername()
                gy3.C87412m.m108591d(r10)
                r11 = 0
                r12 = 8
                r13 = 0
                r7 = r3
                r7.<init>(r8, r9, r10, r11, r12, r13)
            L_0x006b:
                r0.f16141A = r3
            L_0x006e:
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC r0 = r14.f16183d
                ko1.g r0 = r0.f16141A
                boolean r3 = r0 instanceof ko1.C10370c
                r4 = 0
                if (r3 == 0) goto L_0x007c
                ko1.c r0 = (ko1.C10370c) r0
                goto L_0x007d
            L_0x007c:
                r0 = r4
            L_0x007d:
                if (r0 != 0) goto L_0x0080
                goto L_0x0089
            L_0x0080:
                com.tencent.mm.plugin.finder.profile.uic.f r3 = new com.tencent.mm.plugin.finder.profile.uic.f
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC r5 = r14.f16183d
                r3.<init>(r5)
                r0.f31576f = r3
            L_0x0089:
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC r0 = r14.f16183d
                ko1.g r0 = r0.f16141A
                if (r0 == 0) goto L_0x0096
                android.view.View r0 = r0.getView()
                goto L_0x0097
            L_0x0096:
                r0 = r4
            L_0x0097:
                if (r0 != 0) goto L_0x00c2
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC r0 = r14.f16183d
                ko1.g r0 = r0.f16141A
                if (r0 == 0) goto L_0x00a8
                boolean r0 = r0.hasData()
                if (r0 != r2) goto L_0x00a8
                r1 = 1
            L_0x00a8:
                if (r1 == 0) goto L_0x00c2
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC r0 = r14.f16183d
                com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r0.getRecyclerView()
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
                boolean r1 = r0 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
                if (r1 == 0) goto L_0x00bb
                r4 = r0
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r4 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r4
            L_0x00bb:
                if (r4 == 0) goto L_0x00c2
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC r0 = r14.f16183d
                r0.initFilterView(r4)
            L_0x00c2:
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC r0 = r14.f16183d
                ko1.g r0 = r0.f16141A
                if (r0 == 0) goto L_0x00cd
                r0.mo10672a()
            L_0x00cd:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileFeedUIC.C3452s.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$t */
    public static final class C3453t implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderProfileFeedUIC f16184a;

        public C3453t(FinderProfileFeedUIC finderProfileFeedUIC) {
            this.f16184a = finderProfileFeedUIC;
        }

        public void call(int i) {
            this.f16184a.getActionCallback().mo3802b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$u */
    public static final class C3454u extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16185d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3454u(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(0);
            this.f16185d = finderProfileFeedUIC;
        }

        public Object invoke() {
            ((C11025q) C39818r.f106831a.mo62443b(this.f16185d.getContext()).mo75002a(C11025q.class)).f32769w = true;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$w */
    public static final class C3455w extends C87413o implements C32226l<FeedStickyEvent, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16186d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3455w(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(1);
            this.f16186d = finderProfileFeedUIC;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((FeedStickyEvent) obj, LocaleUtil.ITALIAN);
            this.f16186d.getRlLayout().mo26642z(false);
            this.f16186d.getFeedLoader().clearStoreCache();
            this.f16186d.getFeedLoader().requestRefresh();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$x */
    public static final class C3456x extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16187d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3456x(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(0);
            this.f16187d = finderProfileFeedUIC;
        }

        public Object invoke() {
            return this.f16187d.getUiBinding().f43027e;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$y */
    public static final class C3457y extends C87413o implements C32224a<FinderRefreshLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16188d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3457y(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(0);
            this.f16188d = finderProfileFeedUIC;
        }

        public Object invoke() {
            return this.f16188d.getUiBinding().f43028f;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$z */
    public static final class C3458z implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f16189d;

        public C3458z(View view) {
            this.f16189d = view;
        }

        public final void run() {
            C45662a.m50856b(this.f16189d, 8, 0, (C32224a) null, 6, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$v */
    public static final class C3459v extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedUIC f16190d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3459v(FinderProfileFeedUIC finderProfileFeedUIC) {
            super(1);
            this.f16190d = finderProfileFeedUIC;
        }

        public Object invoke(Object obj) {
            View view;
            Class cls = C58417y0.class;
            C87412m.m108594g((IResponse) obj, "<anonymous parameter 0>");
            Log.m105924i("Finder.ProfileFeedUIC", "[fetchEndCallback] totalSize=" + this.f16190d.getFeedLoader().getSize());
            this.f16190d.getRlLayout().mo26642z(true);
            C21804c loadMoreFooter = this.f16190d.getRlLayout().getLoadMoreFooter();
            if (!(loadMoreFooter == null || (view = loadMoreFooter.getView()) == null)) {
                FinderProfileFeedUIC finderProfileFeedUIC = this.f16190d;
                if (finderProfileFeedUIC.isSelfFlag() && finderProfileFeedUIC.getFeedLoader().getSize() > 0) {
                    FinderRefreshLayout access$getRlLayout = finderProfileFeedUIC.getRlLayout();
                    int a = C79406f.m96347a(view.getContext(), 120.0f);
                    if (a != access$getRlLayout.getFooterConfig().f174983a) {
                        C63508a aVar = access$getRlLayout.getFooterConfig().f174984b;
                        C63508a aVar2 = C63508a.f180129h;
                        if (aVar.mo88357a(aVar2)) {
                            access$getRlLayout.getFooterConfig().f174983a = a;
                            if (access$getRlLayout.f56665f != null) {
                                C21524b bVar = access$getRlLayout.f56671o;
                                if (bVar == null) {
                                    C87412m.m108603p("cValues");
                                    throw null;
                                } else if (bVar.f60978u && access$getRlLayout.getFooterConfig().f174984b.f180132b) {
                                    C21805g gVar = access$getRlLayout.f56665f;
                                    if (gVar != null) {
                                        C63509c spinnerStyle = gVar.getSpinnerStyle();
                                        if (spinnerStyle != C63509c.f180136e) {
                                            spinnerStyle.getClass();
                                            View view2 = gVar.getView();
                                            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : access$getRlLayout.f56680x;
                                            view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((access$getRlLayout.getFooterConfig().f174983a - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                                            int i = marginLayoutParams.leftMargin;
                                            int measuredHeight = (marginLayoutParams.topMargin + access$getRlLayout.getMeasuredHeight()) - (spinnerStyle != C63509c.f180133b ? access$getRlLayout.getFooterConfig().f174983a : 0);
                                            view2.layout(i, measuredHeight, view2.getMeasuredWidth() + i, view2.getMeasuredHeight() + measuredHeight);
                                        }
                                        float f = access$getRlLayout.getFooterConfig().f174985c < 10.0f ? ((float) access$getRlLayout.getFooterConfig().f174983a) * access$getRlLayout.getFooterConfig().f174985c : access$getRlLayout.getFooterConfig().f174985c;
                                        C61566c footerConfig = access$getRlLayout.getFooterConfig();
                                        footerConfig.getClass();
                                        footerConfig.f174984b = aVar2;
                                        gVar.mo34225c(access$getRlLayout.f56666g, access$getRlLayout.getFooterConfig().f174983a, (int) f);
                                    }
                                }
                            }
                            C61566c footerConfig2 = access$getRlLayout.getFooterConfig();
                            C63508a aVar3 = C63508a.f180128g;
                            footerConfig2.getClass();
                            footerConfig2.f174984b = aVar3;
                        }
                    }
                    View findViewById = view.findViewById(C0966R.C0970id.fez);
                    if (findViewById != null) {
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar4.mo10233c(0);
                        View view3 = findViewById;
                        C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$8", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$8", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View findViewById2 = findViewById.findViewById(C0966R.C0970id.knj);
                        if (findViewById2 != null) {
                            C9556a aVar5 = new C9556a();
                            aVar5.mo10233c(0);
                            View view4 = findViewById2;
                            C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$8", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$8", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            if (!((C58417y0) C86312j.m106911c(cls)).f167358o && finderProfileFeedUIC.getFeedLoader().getSize() > 0) {
                                ((C58417y0) C86312j.m106911c(cls)).f167359p = true;
                                ((C58417y0) C86312j.m106911c(cls)).f167358o = true;
                                Context context = findViewById2.getContext();
                                C87412m.m108593f(context, "context");
                                ((C58417y0) C86312j.m106911c(cls)).Ly0(context, false, true);
                            }
                            findViewById2.setOnClickListener(new C3532g(findViewById2, finderProfileFeedUIC));
                        }
                    }
                } else if (finderProfileFeedUIC.getFeedLoader().getSize() <= 0) {
                    C9556a aVar6 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar6.mo10233c(8);
                    View view5 = view;
                    C117292a.m165358d(view5, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$8", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$8", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileFeedUIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        new Rect();
        this.f16145E = new C3444k(this);
    }

    public static final /* synthetic */ int access$getFILTER_VIEW_TYPE$cp() {
        return 10000001;
    }

    /* access modifiers changed from: private */
    public final void enterFinderLiveVisitorUI(BaseFinderFeed baseFinderFeed, int i, boolean z) {
        C48924by0 by02;
        ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9603Kf(baseFinderFeed, (long) i, C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM, "temp_5", get21053ChnlExtra());
        Intent intent = new Intent();
        long longExtra = getContext().getIntent().getLongExtra("finder_from_feed_id", 0);
        int i2 = (longExtra > 0 ? 1 : (longExtra == 0 ? 0 : -1));
        if (i2 != 0) {
            intent.putExtra("KEY_ENTER_LIVE_PARAM_FROM_OBJECT_ID", longExtra);
            Log.m105924i("Finder.ProfileFeedUIC", "jumpToLive refObjectId/fromObjectId:" + C61926c.m72691p(longExtra));
        }
        intent.putExtra("KEY_FINDER_FROM_FEED_TYPE", getFromFeedType());
        intent.putExtra("CURRENT_FEED_ID", baseFinderFeed.mo3513o().getFeedObject().f164794id);
        intent.putExtra("LAUNCH_WITH_ANIM", z);
        C64273c21 c212 = baseFinderFeed.mo3513o().getFeedObject().liveInfo;
        intent.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", c212 != null ? c212.f182384X : 0);
        int i3 = C10412u.f31640a;
        int i4 = 2;
        intent.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 2);
        C64273c21 c213 = baseFinderFeed.mo3513o().getFeedObject().liveInfo;
        if (!(c213 == null || (by02 = c213.f182402p0) == null)) {
            intent.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO", by02.toByteArray());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseFinderFeed.mo3513o().getFeedObject());
        C64279c90 c902 = new C64279c90();
        c902.f182444d = "";
        c902.f182445e = "";
        c902.f182446f = false;
        c902.f182447g = -1;
        c902.f182448h = -1;
        c902.f182449i = 1;
        C64686ro2 ro22 = new C64686ro2();
        ro22.f185214e = ((C13442s8) C39818r.f106831a.mo62443b(getContext()).mo75002a(C13442s8.class)).f38096i;
        ro22.f185218i = baseFinderFeed.mo3513o().getFeedObject();
        c902.f182450j = ro22;
        if (i2 != 0) {
            C64347eq2 eq22 = new C64347eq2();
            C52025xv xvVar = new C52025xv();
            eq22.f183029t = xvVar;
            xvVar.f144988d = longExtra;
            if (getFromFeedType() == 1) {
                i4 = 1;
            }
            xvVar.f144989e = i4;
            c902.f182451n = eq22;
        }
        ((C10649f) C86312j.m106911c(C10649f.class)).mo10913cP(getActivity(), intent, arrayList, 0, c902, (C10649f.C10650a) null);
    }

    private final String get21053ChnlExtra() {
        Long valueOf = Long.valueOf(getContext().getIntent().getLongExtra("finder_from_feed_id", 0));
        boolean z = true;
        String str = null;
        if (!(valueOf.longValue() != 0)) {
            valueOf = null;
        }
        String str2 = "";
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            if (!(str2.length() > 0)) {
                str2 = null;
            }
            JSONObject jSONObject = str2 != null ? new JSONObject(str2) : new JSONObject("{}");
            jSONObject.put("from_feed_id", C61926c.m72691p(longValue));
            str2 = jSONObject.toString();
            C87412m.m108593f(str2, "json.toString()");
        }
        Integer valueOf2 = Integer.valueOf(getContext().getIntent().getIntExtra("finder_from_feed_type", 0));
        if (!(valueOf2.intValue() != 0)) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            int intValue = valueOf2.intValue();
            if (!(str2.length() > 0)) {
                str2 = null;
            }
            JSONObject jSONObject2 = str2 != null ? new JSONObject(str2) : new JSONObject("{}");
            jSONObject2.put("head_enter_type", String.valueOf(intValue));
            str2 = jSONObject2.toString();
            C87412m.m108593f(str2, "json.toString()");
        }
        Integer valueOf3 = Integer.valueOf(getContext().getIntent().getIntExtra("key_from_comment_scene", 0));
        if (!(valueOf3.intValue() != 0)) {
            valueOf3 = null;
        }
        if (valueOf3 == null) {
            return str2;
        }
        int intValue2 = valueOf3.intValue();
        if (str2.length() <= 0) {
            z = false;
        }
        if (z) {
            str = str2;
        }
        JSONObject jSONObject3 = str != null ? new JSONObject(str) : new JSONObject("{}");
        jSONObject3.put("from_comment_scene", String.valueOf(intValue2));
        String jSONObject4 = jSONObject3.toString();
        C87412m.m108593f(jSONObject4, "json.toString()");
        return jSONObject4;
    }

    /* access modifiers changed from: private */
    public final C3431a getActionCallback() {
        return (C3431a) ((C36570n) this.f16157z).getValue();
    }

    /* access modifiers changed from: private */
    public final boolean getDrawerMode() {
        return ((Boolean) ((C36570n) this.f16146o).getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public final FinderProfileFeedLoader getFeedLoader() {
        return (FinderProfileFeedLoader) ((C36570n) this.f16150s).getValue();
    }

    /* access modifiers changed from: private */
    public final int getFromCommentScene() {
        return ((Number) ((C36570n) this.f16149r).getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public final long getFromFeedId() {
        return ((Number) ((C36570n) this.f16148q).getValue()).longValue();
    }

    /* access modifiers changed from: private */
    public final int getFromFeedType() {
        return ((Number) ((C36570n) this.f16147p).getValue()).intValue();
    }

    private final FinderProfileLayoutConfig getLayoutConfig() {
        return (FinderProfileLayoutConfig) ((C36570n) this.f16151t).getValue();
    }

    /* access modifiers changed from: private */
    public final WxRecyclerView getRecyclerView() {
        return (WxRecyclerView) ((C36570n) this.f16153v).getValue();
    }

    /* access modifiers changed from: private */
    public final FinderRefreshLayout getRlLayout() {
        return (FinderRefreshLayout) ((C36570n) this.f16152u).getValue();
    }

    /* access modifiers changed from: private */
    public final C15985z getUiBinding() {
        return (C15985z) ((C36570n) this.f16154w).getValue();
    }

    /* access modifiers changed from: private */
    public final void initFilterView(WxRecyclerAdapter<C0740i2> wxRecyclerAdapter) {
        C10374g gVar;
        View b;
        ViewGroup viewGroup;
        View childAt;
        if (!((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e() && (gVar = this.f16141A) != null && (b = gVar.mo10673b(1)) != null && (viewGroup = (ViewGroup) getActivity().findViewById(C0966R.C0970id.f6070wg)) != null && (childAt = viewGroup.getChildAt(0)) != null) {
            ((ViewGroup) childAt).addView(b, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* access modifiers changed from: private */
    public final void jumpProfileTimeline(int i, BaseFinderFeed baseFinderFeed, View view) {
        FragmentActivity activity;
        FinderItem o;
        FinderObject feedObject;
        int i2 = i;
        Class cls = C58417y0.class;
        if (!C58739j4.f168176a.mo83683L()) {
            String str = null;
            if (i2 >= 0 && i2 < getFeedLoader().getDataList().size()) {
                Object obj = getFeedLoader().getDataList().get(i2);
                BaseFinderFeed baseFinderFeed2 = obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null;
                String p = C61926c.m72691p((baseFinderFeed2 == null || (o = baseFinderFeed2.mo3513o()) == null || (feedObject = o.getFeedObject()) == null) ? 0 : feedObject.f164794id);
                Log.m105924i("Finder.ProfileFeedUIC", "jumpProfileTimeline pos:" + i2 + " feed:" + p);
                int i3 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0().f154540F;
                if ((i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new C0898b.C0899a(false, false, 1) : new C0898b.C0899a(true, true, 0) : new C0898b.C0899a(true, true, 1) : new C0898b.C0899a(false, true, 0) : new C0898b.C0899a(false, true, 1) : new C0898b.C0899a(true, true, 1)).mo786a()) {
                    startPreloadVideo("jumpProfileTimeline", 1, baseFinderFeed.mo3513o().getFeedObject());
                }
            }
            Intent intent = new Intent();
            BaseFeedLoader.saveCache$default(getFeedLoader(), intent, i, (C2780c) null, 4, (Object) null);
            intent.putExtra("KEY_FROM_TOPIC_ID", getFeedLoader().getCurTopicId());
            intent.putExtra("finder_username", getUsername());
            intent.putExtra("KEY_FINDER_SELF_FLAG", isSelfFlag());
            Fragment fragment = getFragment();
            if (!(fragment == null || (activity = fragment.getActivity()) == null)) {
                str = ((C13442s8) C39818r.f106831a.mo62443b(activity).mo75002a(C13442s8.class)).f38100p;
            }
            if (TextUtils.isEmpty(str)) {
                intent.putExtra("key_click_tab_context_id", ((C11266d) C86312j.m106911c(C11266d.class)).mo9187Uy().mo10844b());
            }
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            Intent intent2 = intent;
            C13442s8.C13443a.m12791e(aVar, getActivity(), intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
            intent2.putExtra("KEY_FINDER_FEEDID", baseFinderFeed.mo3513o().getId());
            intent2.putExtra("KEY_SEARCH_WRORD", getActivity().getIntent().getStringExtra("KEY_SEARCH_WRORD"));
            C7267b bVar = C7267b.f25328d;
            WxRecyclerView recyclerView = getRecyclerView();
            C87412m.m108593f(recyclerView, "recyclerView");
            C7287o.m7447c(intent2, view, 0, false, false, bVar.zx0(recyclerView, baseFinderFeed.mo3513o().getId(), getFeedLoader().getDataListJustForAdapter(), new C3441h(this)), 14, (Object) null);
            ((C58684b) C86312j.m106911c(C58684b.class)).Xx0(getActivity(), intent2);
            ((C58417y0) C86312j.m106911c(cls)).Bx0(baseFinderFeed.getItemId(), 1);
            C13442s8 f = aVar.mo12873f(getContext());
            if (f != null) {
                C49712hj1 q3 = f.mo12861q3();
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                long itemId = baseFinderFeed.getItemId();
                WxRecyclerView recyclerView2 = getRecyclerView();
                C87412m.m108593f(recyclerView2, "recyclerView");
                C58417y0.Qx0((C58417y0) c, q3, itemId, recyclerView2, 0, (String) null, 24, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void jumpToLive(com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r24, int r25, android.view.View r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.lang.Class<ht1.p2> r3 = ht1.C60192p2.class
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r24.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            java.lang.String r4 = r4.username
            zc1.b r5 = zc1.C66785b.f191882e
            java.lang.String r5 = r5.mo90662O5()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r4, (java.lang.String) r5)
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x0076
            java.lang.Class<er1.b> r2 = er1.C58684b.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            java.lang.String r3 = "getService(ActivityRouter::class.java)"
            gy3.C87412m.m108593f(r2, r3)
            r6 = r2
            tf0.o1 r6 = (tf0.C13883o1) r6
            androidx.appcompat.app.AppCompatActivity r7 = r23.getActivity()
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r24.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            long r8 = r2.f164794id
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r24.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            java.lang.String r2 = r2.objectNonceId
            if (r2 != 0) goto L_0x004a
            r10 = r5
            goto L_0x004b
        L_0x004a:
            r10 = r2
        L_0x004b:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r24.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            te3.c21 r2 = r2.liveInfo
            if (r2 != 0) goto L_0x005c
            te3.c21 r2 = new te3.c21
            r2.<init>()
        L_0x005c:
            r11 = r2
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            java.lang.String r18 = r24.mo3526z()
            r19 = 0
            r20 = 0
            r21 = 7152(0x1bf0, float:1.0022E-41)
            r22 = 0
            tf0.C13883o1.C13884a.m13249a(r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0195
        L_0x0076:
            r4 = 2131304667(0x7f0920db, float:1.8227483E38)
            r6 = r26
            android.view.View r4 = r6.findViewById(r4)
            r12 = r4
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            di3.d r4 = di3.C86312j.m106911c(r3)
            ht1.p2 r4 = (ht1.C60192p2) r4
            boolean r4 = r4.Xl0()
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r24.mo3513o()
            te3.c21 r7 = r7.getLiveInfo()
            r8 = 1
            r15 = 0
            if (r7 == 0) goto L_0x009e
            int r7 = r7.f182384X
            if (r7 != r8) goto L_0x009e
            r7 = 1
            goto L_0x009f
        L_0x009e:
            r7 = 0
        L_0x009f:
            r16 = 0
            if (r7 == 0) goto L_0x00a5
        L_0x00a3:
            r7 = r5
            goto L_0x00c9
        L_0x00a5:
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r24.mo3513o()
            te3.c21 r7 = r7.getLiveInfo()
            if (r7 == 0) goto L_0x00b5
            int r7 = r7.f182394f
            if (r7 != r8) goto L_0x00b5
            r7 = 1
            goto L_0x00b6
        L_0x00b5:
            r7 = 0
        L_0x00b6:
            if (r7 == 0) goto L_0x00a3
            if (r4 == 0) goto L_0x00a3
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r24.mo3513o()
            te3.c21 r7 = r7.getLiveInfo()
            if (r7 == 0) goto L_0x00c7
            java.lang.String r7 = r7.f182395g
            goto L_0x00c9
        L_0x00c7:
            r7 = r16
        L_0x00c9:
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r24.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.getFeedObject()
            long r9 = r9.f164794id
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "jumpToLive fluentSwitch: "
            r11.append(r13)
            r11.append(r4)
            java.lang.String r13 = " livestate: "
            r11.append(r13)
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r24.mo3513o()
            te3.c21 r13 = r13.getLiveInfo()
            if (r13 == 0) goto L_0x00f6
            int r13 = r13.f182394f
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            goto L_0x00f8
        L_0x00f6:
            r13 = r16
        L_0x00f8:
            r11.append(r13)
            java.lang.String r13 = " streamUrl: "
            r11.append(r13)
            r11.append(r7)
            java.lang.String r13 = " feedId: "
            r11.append(r13)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            java.lang.String r13 = "Finder.ProfileFeedUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r11)
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r24.mo3513o()
            te3.c21 r11 = r11.getLiveInfo()
            if (r11 == 0) goto L_0x0124
            int r11 = r11.f182394f
            if (r11 != r8) goto L_0x0124
            r11 = 1
            goto L_0x0125
        L_0x0124:
            r11 = 0
        L_0x0125:
            if (r11 == 0) goto L_0x0191
            if (r12 == 0) goto L_0x0191
            if (r4 == 0) goto L_0x0191
            di3.d r4 = di3.C86312j.m106911c(r3)
            ht1.p2 r4 = (ht1.C60192p2) r4
            lt1.a r11 = lt1.C61401a.FINDER_PROFILE
            android.view.ViewParent r13 = r12.getParent()
            java.lang.String r14 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r13, r14)
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            if (r7 != 0) goto L_0x0141
            goto L_0x0142
        L_0x0141:
            r5 = r7
        L_0x0142:
            java.lang.Class<ir.n> r7 = p565ir.C60606n.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ir.n r7 = (p565ir.C60606n) r7
            com.tencent.mm.plugin.finder.storage.FinderItem r14 = r24.mo3513o()
            te3.c21 r14 = r14.getLiveInfo()
            boolean r7 = r7.mo85008I1(r14)
            r14 = r7 ^ 1
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r24.mo3513o()
            te3.c21 r17 = r7.getLiveInfo()
            r7 = r4
            r8 = r11
            r11 = r13
            r13 = r5
            r4 = 0
            r15 = r17
            lt1.c r5 = r7.mo85193Pz(r8, r9, r11, r12, r13, r14, r15)
            di3.d r3 = di3.C86312j.m106911c(r3)
            ht1.p2 r3 = (ht1.C60192p2) r3
            android.content.Context r6 = r26.getContext()
            java.lang.String r7 = "view.context"
            gy3.C87412m.m108593f(r6, r7)
            lt1.b r3 = r3.mo85194Ui(r6, r5)
            if (r3 == 0) goto L_0x018b
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$i r5 = new com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC$i
            r5.<init>(r0, r1, r2)
            r3.mo84323h(r5)
            rx3.b0 r16 = rx3.C13598b0.f38549a
        L_0x018b:
            if (r16 != 0) goto L_0x0195
            r0.enterFinderLiveVisitorUI(r1, r2, r4)
            goto L_0x0195
        L_0x0191:
            r4 = 0
            r0.enterFinderLiveVisitorUI(r1, r2, r4)
        L_0x0195:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileFeedUIC.jumpToLive(com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public final void jumpToSnsAlbumPicker() {
        String str;
        String str2 = C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond();
        C87412m.m108594g(str2, "postId");
        FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.postId = str2;
        }
        Intent intent = new Intent();
        intent.putExtra("key_finder_post_id", str2);
        C13442s8 f = C13442s8.f38060Q0.mo12873f(getActivity());
        if (f == null || (str = f.mo12861q3().f134671e) == null) {
            str = "";
        }
        intent.putExtra("key_finder_context_id", str);
        ((C58684b) C86312j.m106911c(C58684b.class)).sy0(getContext(), intent);
    }

    private final void startPreloadVideo(String str, int i, FinderObject finderObject) {
        Log.m105924i("Finder.ProfileFeedUIC", "startPreloadVideo " + str + " feedId:" + C61926c.m72691p(finderObject.f164794id));
        ArrayList arrayList = new ArrayList();
        arrayList.add(finderObject);
        C60214y3 y3Var = this.f16143C;
        int i2 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0().f154540F;
        y3Var.mo78736c(i, arrayList, (i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? new C0898b.C0899a(false, false, 1) : new C0898b.C0899a(true, true, 0) : new C0898b.C0899a(true, true, 1) : new C0898b.C0899a(false, true, 0) : new C0898b.C0899a(false, true, 1) : new C0898b.C0899a(true, true, 1)).f2118c);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.anx;
    }

    public final FinderProfileFeedLoader.State getState() {
        return getFeedLoader().getState();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16144D.alive();
        FinderProfileFeedLoader feedLoader = getFeedLoader();
        String stringExtra = getIntent().getStringExtra("KEY_FINDER_PROFILE_UI_REQUEST_LIST_POSITION");
        if (stringExtra == null) {
            stringExtra = "";
        }
        feedLoader.setLiveNoticeId(stringExtra);
        feedLoader.setJustWathcedCallback(new C3445l(this));
        feedLoader.setReadFeedId(Long.valueOf(getIntent().getLongExtra("finder_read_feed_id", -1)));
        feedLoader.setCollectionId(Long.valueOf(getIntent().getLongExtra("key_finder_collection_id", 0)));
        feedLoader.register(getActionCallback());
        C14940p.C14941a a = C14940p.f40978a.mo13992a(feedLoader.getUsername());
        if (a != null) {
            feedLoader.getTopicFilterList().addAll(a.f40981b.mo10110p1());
        }
        this.f16155x = getUiBinding().f43026d;
        this.f16156y = getUiBinding().f43025c;
        getRlLayout().setOnSimpleAction(new C3449p(this));
        if (isSelfFlag()) {
            FinderProfileLoaderMoreFooter finderProfileLoaderMoreFooter = new FinderProfileLoaderMoreFooter(getActivity(), (AttributeSet) null);
            finderProfileLoaderMoreFooter.removeAllViews();
            View.inflate(finderProfileLoaderMoreFooter.getContext(), C0966R.C0971layout.b2y, finderProfileLoaderMoreFooter);
            getRlLayout().mo26641y(finderProfileLoaderMoreFooter);
        } else {
            FinderProfileLoaderMoreFooter finderProfileLoaderMoreFooter2 = new FinderProfileLoaderMoreFooter(getActivity(), (AttributeSet) null);
            finderProfileLoaderMoreFooter2.removeAllViews();
            View.inflate(finderProfileLoaderMoreFooter2.getContext(), C0966R.C0971layout.ctn, finderProfileLoaderMoreFooter2);
            getRlLayout().mo26641y(finderProfileLoaderMoreFooter2);
        }
        getRecyclerView().setLayoutManager(getLayoutConfig().mo3666d(getActivity()));
        getRecyclerView().mo17085h0(getLayoutConfig().mo3665c());
        WxRecyclerView recyclerView = getRecyclerView();
        FinderProfileLayoutConfig layoutConfig = getLayoutConfig();
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        recyclerView.setRecycledViewPool(layoutConfig.mo3667e((MMActivity) activity));
        WxRecyclerView recyclerView2 = getRecyclerView();
        FinderProfileLayoutConfig layoutConfig2 = getLayoutConfig();
        layoutConfig2.getClass();
        C3450q qVar = new C3450q(this, new FinderProfileLayoutConfig$getItemConvertFactory$1(layoutConfig2, (C32226l<? super Integer, ? extends C60896i<?>>) null), getFeedLoader().getDataList());
        qVar.f173488o = new C3451r(this, qVar);
        recyclerView2.setAdapter(qVar);
        getFeedLoader().setOnFilterDataChanged(new C3452s(this));
        getFeedLoader().setInitDone(new C3453t(this));
        getFeedLoader().setCantShowBtn(new C3454u(this));
        getFeedLoader().setFetchEndCallback(new C3459v(this));
        getFeedLoader().setHandleStickyEvent(new C3455w(this));
        getFeedLoader().setClickToLoadJustWatch(new C3446m(this));
        getFeedLoader().setJustWatchingCallback(new C3447n(this));
        BaseFeedLoader.requestInit$default(getFeedLoader(), false, 1, (Object) null);
        getFeedLoader().requestRefresh();
        FinderRefreshLayout rlLayout = getRlLayout();
        C87412m.m108593f(rlLayout, "rlLayout");
        rlLayout.mo26640x(false);
        getRecyclerView().mo17043c(this.f16145E);
        C37521f.f99374d.getClass();
        if (C37521f.f99274R4.mo60266n().intValue() == 1) {
            getRecyclerView().mo17043c(new C10814e1("Finder.ProfileFeedUIC", new C3448o(this)));
        }
        C39818r rVar = C39818r.f106831a;
        C11025q qVar2 = (C11025q) rVar.mo62443b(getContext()).mo75002a(C11025q.class);
        WxRecyclerView recyclerView3 = getRecyclerView();
        C87412m.m108593f(recyclerView3, "recyclerView");
        qVar2.getClass();
        qVar2.f32765s = recyclerView3;
        qVar2.f32766t = true;
        View i3 = qVar2.mo11180i3();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        View view = i3;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        qVar2.mo11177e3();
        C39622i0 a2 = rVar.mo62443b(getContext()).mo75002a(C13442s8.class);
        C87412m.m108593f(a2, "UICProvider.of(context).…rReporterUIC::class.java)");
        C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
        C58556f j3 = ((C13442s8) a2).mo12854j3(-1);
        if (j3 != null) {
            WxRecyclerView recyclerView4 = getRecyclerView();
            C87412m.m108593f(recyclerView4, "recyclerView");
            j3.mo83455c(recyclerView4);
        }
    }

    public void onDestroy() {
        Class cls = C58417y0.class;
        super.onDestroy();
        getFeedLoader().unregister(getActionCallback());
        this.f16144D.dead();
        getRecyclerView().mo17098m1(this.f16145E);
        ((C58417y0) C86312j.m106911c(cls)).f167359p = false;
        ((C58417y0) C86312j.m106911c(cls)).f167358o = false;
    }

    public void onPause() {
        super.onPause();
        ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9611fM(getRecyclerView(), C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "temp_5", C0075i.EVENT_ON_PAUSE, getFromFeedType(), getFromFeedId(), getFromCommentScene());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003e, code lost:
        r1 = r1.getView();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r11 = this;
            java.lang.Class<dp1.y0> r0 = dp1.C58417y0.class
            super.onResume()
            java.lang.Class<ht1.j5> r1 = ht1.C8777j5.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r2 = r1
            ht1.j5 r2 = (ht1.C8777j5) r2
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r11.getRecyclerView()
            ak1.f0$q r4 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD
            ak1.i r6 = ak1.C0075i.EVENT_ON_RESUME
            int r7 = r11.getFromFeedType()
            long r8 = r11.getFromFeedId()
            int r10 = r11.getFromCommentScene()
            java.lang.String r5 = "temp_5"
            r2.mo9611fM(r3, r4, r5, r6, r7, r8, r10)
            com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader r1 = r11.getFeedLoader()
            int r1 = r1.getSize()
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L_0x0090
            com.tencent.mm.plugin.finder.view.FinderRefreshLayout r1 = r11.getRlLayout()
            oq3.c r1 = r1.getLoadMoreFooter()
            if (r1 == 0) goto L_0x004c
            android.view.View r1 = r1.getView()
            if (r1 == 0) goto L_0x004c
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            if (r1 == 0) goto L_0x0090
            com.tencent.mm.plugin.finder.view.FinderRefreshLayout r1 = r11.getRlLayout()
            oq3.c r1 = r1.getLoadMoreFooter()
            if (r1 == 0) goto L_0x0070
            android.view.View r1 = r1.getView()
            if (r1 == 0) goto L_0x0070
            r4 = 2131306868(0x7f092974, float:1.8231947E38)
            android.view.View r1 = r1.findViewById(r4)
            if (r1 == 0) goto L_0x0070
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0070
            r1 = 1
            goto L_0x0071
        L_0x0070:
            r1 = 0
        L_0x0071:
            if (r1 == 0) goto L_0x0090
            di3.d r1 = di3.C86312j.m106911c(r0)
            dp1.y0 r1 = (dp1.C58417y0) r1
            r1.f167358o = r2
            di3.d r1 = di3.C86312j.m106911c(r0)
            dp1.y0 r1 = (dp1.C58417y0) r1
            r1.f167359p = r2
            di3.d r1 = di3.C86312j.m106911c(r0)
            dp1.y0 r1 = (dp1.C58417y0) r1
            android.app.Activity r4 = r11.getContext()
            r1.Ly0(r4, r3, r2)
        L_0x0090:
            com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader r1 = r11.getFeedLoader()
            int r1 = r1.getSize()
            if (r1 != 0) goto L_0x00cf
            com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader r1 = r11.getFeedLoader()
            com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$State r1 = r1.getState()
            com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$State r4 = com.tencent.p014mm.plugin.finder.feed.model.FinderProfileFeedLoader.State.LOADED
            if (r1 != r4) goto L_0x00cf
            ye1.z r1 = r11.getUiBinding()
            android.widget.RelativeLayout r1 = r1.f43031i
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x00cf
            di3.d r1 = di3.C86312j.m106911c(r0)
            dp1.y0 r1 = (dp1.C58417y0) r1
            r1.f167359p = r3
            di3.d r1 = di3.C86312j.m106911c(r0)
            dp1.y0 r1 = (dp1.C58417y0) r1
            r1.f167358o = r2
            di3.d r0 = di3.C86312j.m106911c(r0)
            dp1.y0 r0 = (dp1.C58417y0) r0
            android.app.Activity r1 = r11.getContext()
            r0.Ly0(r1, r3, r3)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileFeedUIC.onResume():void");
    }

    public final void setCoveredStyle() {
        C10374g gVar = this.f16141A;
        if (gVar != null) {
            gVar.mo10674e(true);
        }
        FrameLayout frameLayout = this.f16156y;
        if (frameLayout != null) {
            frameLayout.setBackgroundResource(C0966R.color.ahf);
        }
    }

    public final void setNormalStyle() {
        C10374g gVar = this.f16141A;
        if (gVar != null) {
            gVar.mo10674e(false);
        }
        FrameLayout frameLayout = this.f16156y;
        if (frameLayout != null) {
            frameLayout.setBackgroundResource(C0966R.color.f2932f);
        }
    }

    public final void showMoveMvTabTips() {
        View findViewById = findViewById(C0966R.C0970id.nmw);
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC", "showMoveMvTabTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            View view = findViewById;
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC", "showMoveMvTabTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C45662a.m50855a(view, 0.0f, 0, (C32224a) null, 7, (Object) null);
            findViewById.postDelayed(new C3458z(findViewById), 2000);
        }
    }
}
