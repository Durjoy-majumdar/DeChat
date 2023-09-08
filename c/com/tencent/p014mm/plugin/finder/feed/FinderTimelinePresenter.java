package com.tencent.p014mm.plugin.finder.feed;

import ak1.C0075i;
import ak1.C54067f0;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import bo1.C54505r;
import cm1.C0709a2;
import cm1.C0726e;
import cm1.C0731g;
import cm1.C0735h;
import cm1.C0737h2;
import cm1.C0738i;
import cm1.C0740i2;
import cm1.C0744k;
import cm1.C0751m0;
import cm1.C0755n0;
import cm1.C0768q0;
import cm1.C55014f;
import cm1.C55031t;
import co1.C0898b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ModNewContactEvent;
import com.tencent.p014mm.autogen.events.TestPreloadPreviewNotifyEvent;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.view.C4119n;
import com.tencent.p014mm.plugin.finder.view.C56597e1;
import com.tencent.p014mm.plugin.finder.view.ContactUninterestEventListener;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.plugin.finder.view.whatnews.FinderWhatsNewView;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import df1.C7322a;
import di3.C7335d;
import di3.C86312j;
import do1.C58341h;
import dp1.C20480e0;
import dp1.C58417y0;
import dp1.C7433e1;
import dp1.C7453v;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C58556f;
import ef1.C7637b;
import ef1.C7642k;
import er1.C58736i1;
import er1.C58739j4;
import er1.C58784w3;
import er1.C7868s3;
import er1.C7879t1;
import er1.C7888v2;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hr1.C8730k;
import ht1.C8777j5;
import ht1.C8794p5;
import ht1.C8808v4;
import ht1.C8815x4;
import ht1.C8819z2;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import je1.C46530q2;
import jp3.C9486a;
import jp3.C9487b;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import ke1.C9603s;
import kf1.C9731fb;
import kf1.C9860m9;
import kf1.C9863mb;
import kf1.C9878n9;
import l31.C61212e;
import md3.C47001b;
import ms3.C11091a;
import nj3.C11182m0;
import nj3.C11183n0;
import nj3.C11184p0;
import nj3.C47269o0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76879j;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import org.json.JSONObject;
import os1.C11739f;
import os1.C11744g;
import os1.C11749q;
import pe3.C89349b;
import qo3.C77407n;
import rs1.C13442s8;
import rs1.C63545b1;
import rs1.C63586o;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C13605o;
import rx3.C36568h;
import rx3.C36570n;
import sf1.C13672b;
import sx3.C110818d0;
import sx3.C64186f0;
import sx3.C64197v;
import te3.C49712hj1;
import te3.C50542nh0;
import te3.C50687oi1;
import te3.C51954xc1;
import te3.C64273c21;
import tf0.C64916p1;
import tf1.C13908i;
import tf1.C13913l;
import tf1.C13921q;
import up1.C37521f;
import ve1.C14576n2;
import vp1.C65834e;
import wc3.C15133e0;
import z04.C112551y;
import z04.C119027c;
import zc1.C66785b;
import zp3.C16389w;

/* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter */
public final class FinderTimelinePresenter extends C58555d implements C9860m9, C9487b<C9486a> {

    /* renamed from: Q0 */
    public static ConcurrentHashMap<String, RefreshLoadMoreLayout.C7080c<Object>> f13239Q0 = new ConcurrentHashMap<>();

    /* renamed from: R0 */
    public static final CopyOnWriteArrayList<C4119n> f13240R0 = new CopyOnWriteArrayList<>();

    /* renamed from: A */
    public RecyclerView.C16623q f13241A;

    /* renamed from: B */
    public final FinderVideoCore f13242B;

    /* renamed from: C */
    public C16389w f13243C;

    /* renamed from: D */
    public ContactUninterestEventListener f13244D;

    /* renamed from: E */
    public final C13601g f13245E;

    /* renamed from: F */
    public final C13601g f13246F;

    /* renamed from: G */
    public final FinderTimelinePresenter$commentChangeEventListener$1 f13247G;

    /* renamed from: H */
    public final FinderTimelinePresenter$autoRefreshEventListener$1 f13248H;

    /* renamed from: I */
    public final String f13249I;

    /* renamed from: J */
    public final C13601g f13250J;

    /* renamed from: K */
    public boolean f13251K;

    /* renamed from: L */
    public boolean f13252L;

    /* renamed from: M */
    public boolean f13253M;

    /* renamed from: N */
    public final FinderTimelinePresenter$feedExposeInfoChangeListener$1 f13254N;

    /* renamed from: P */
    public final C0735h f13255P;

    /* renamed from: Q */
    public final C0738i f13256Q;

    /* renamed from: R */
    public C60898l.C60899a f13257R;

    /* renamed from: S */
    public C60898l.C60899a f13258S;

    /* renamed from: T */
    public final ConcurrentLinkedQueue<C55014f> f13259T;

    /* renamed from: U */
    public final C0755n0 f13260U;

    /* renamed from: V */
    public boolean f13261V;

    /* renamed from: W */
    public Dialog f13262W;

    /* renamed from: X */
    public boolean f13263X;

    /* renamed from: Y */
    public long f13264Y;

    /* renamed from: Z */
    public int f13265Z;

    /* renamed from: g */
    public final MMActivity f13266g;

    /* renamed from: h */
    public final FinderHomeTabFragment f13267h;

    /* renamed from: i */
    public final CopyOnWriteArraySet<C9486a> f13268i = new CopyOnWriteArraySet<>();

    /* renamed from: j */
    public C9878n9 f13269j;

    /* renamed from: n */
    public final C11739f f13270n;

    /* renamed from: o */
    public C11739f.C11740a f13271o;

    /* renamed from: p */
    public final int f13272p;

    /* renamed from: p0 */
    public int f13273p0;

    /* renamed from: q */
    public boolean f13274q;

    /* renamed from: r */
    public final C15133e0 f13275r;

    /* renamed from: s */
    public boolean f13276s;

    /* renamed from: t */
    public C47001b.C47002a f13277t;

    /* renamed from: u */
    public IListener<ModNewContactEvent> f13278u;

    /* renamed from: v */
    public final C13601g f13279v;

    /* renamed from: w */
    public final C13601g f13280w;

    /* renamed from: x */
    public final C13601g f13281x;

    /* renamed from: x0 */
    public int f13282x0;

    /* renamed from: y */
    public final C13601g f13283y;

    /* renamed from: y0 */
    public final FinderTimelinePresenter$feedProgressListener$1 f13284y0;

    /* renamed from: z */
    public final FinderTimelineFeedLoader f13285z;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$a0 */
    public static final class C2561a0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13288d;

        /* renamed from: e */
        public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f13289e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2561a0(FinderTimelinePresenter finderTimelinePresenter, RefreshLoadMoreLayout.C7080c<Object> cVar) {
            super(0);
            this.f13288d = finderTimelinePresenter;
            this.f13289e = cVar;
        }

        public Object invoke() {
            RefreshLoadMoreLayout c;
            C9878n9 n9Var = this.f13288d.f13269j;
            if (!(n9Var == null || (c = n9Var.mo10416c()) == null)) {
                C2634b0 b0Var = new C2634b0(this.f13288d, this.f13289e);
                C37521f.f99374d.getClass();
                c.postDelayed(b0Var, C37521f.f99287T);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$b */
    public static final class C2562b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13290d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2562b(FinderTimelinePresenter finderTimelinePresenter) {
            super(0);
            this.f13290d = finderTimelinePresenter;
        }

        public Object invoke() {
            return this.f13290d.f13266g.getIntent().getStringExtra("KEY_BY_PASS_INFO");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$b0 */
    public static final class C2563b0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C2563b0 f13291d = new C2563b0();

        public C2563b0() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$c */
    public static final class C2564c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13292d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2564c(FinderTimelinePresenter finderTimelinePresenter) {
            super(0);
            this.f13292d = finderTimelinePresenter;
        }

        public Object invoke() {
            return Integer.valueOf(this.f13292d.f13266g.getIntent().getIntExtra("KEY_BY_PASS_INFO_TYPE", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$c0 */
    public static final class C2565c0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13293d;

        public C2565c0(FinderTimelinePresenter finderTimelinePresenter) {
            this.f13293d = finderTimelinePresenter;
        }

        public final void run() {
            this.f13293d.f13275r.hw0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$d */
    public static final class C2566d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LinearLayoutManager f13294d;

        public C2566d(LinearLayoutManager linearLayoutManager) {
            this.f13294d = linearLayoutManager;
        }

        public final void run() {
            LinearLayoutManager linearLayoutManager = this.f13294d;
            if (linearLayoutManager != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(0);
                C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$checkAutoFlingToRefresh$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$checkAutoFlingToRefresh$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$d0 */
    public static final class C2567d0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13295d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2567d0(FinderTimelinePresenter finderTimelinePresenter) {
            super(0);
            this.f13295d = finderTimelinePresenter;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0094, code lost:
            if (r4.f1756g == r7) goto L_0x0097;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r12 = this;
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC
                r2 = 0
                int r6 = r0.mo119689j(r1, r2)
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC
                int r0 = r0.mo119689j(r1, r2)
                f40.o r1 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r1 = r1.mo121142i()
                com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC
                int r1 = r1.mo119689j(r3, r2)
                f40.o r3 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r3 = r3.mo121142i()
                com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC
                int r3 = r3.mo119689j(r4, r2)
                f40.o r4 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r4 = r4.mo121142i()
                com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_FOLLOW_ACCEPT_INT_SYNC
                r4.mo119689j(r5, r2)
                f40.o r4 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r4 = r4.mo121142i()
                com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_FRIEND_RECOMMEND_INT_SYNC
                int r7 = r4.mo119689j(r5, r2)
                int r4 = r6 + r0
                int r4 = r4 + r1
                int r4 = r4 + r3
                int r5 = r4 + r7
                int r4 = r0 + r1
                int r8 = r4 + r3
                f40.o r4 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r4 = r4.mo121142i()
                com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_AVATAR_STRING_SYNC
                java.lang.String r10 = ""
                java.lang.Object r4 = r4.mo119685f(r9, r10)
                java.lang.String r9 = "null cannot be cast to non-null type kotlin.String"
                gy3.C87412m.m108592e(r4, r9)
                r9 = r4
                java.lang.String r9 = (java.lang.String) r9
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r4 = r12.f13295d
                cm1.h r4 = r4.f13255P
                int r10 = r4.f1753d
                if (r10 != r5) goto L_0x0096
                java.lang.String r4 = r4.f1757h
                boolean r4 = gy3.C87412m.m108589b(r4, r9)
                if (r4 == 0) goto L_0x0096
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r4 = r12.f13295d
                cm1.h r4 = r4.f13255P
                int r10 = r4.f1754e
                if (r10 != r8) goto L_0x0096
                int r10 = r4.f1755f
                if (r10 != r6) goto L_0x0096
                int r4 = r4.f1756g
                if (r4 == r7) goto L_0x0097
            L_0x0096:
                r2 = 1
            L_0x0097:
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r4 = r12.f13295d
                java.lang.String r4 = r4.f13249I
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "isNeedRefresh="
                r10.append(r11)
                r10.append(r2)
                java.lang.String r11 = " refreshMsgNotify commentCnt "
                r10.append(r11)
                r10.append(r6)
                java.lang.String r11 = ", likeCnt "
                r10.append(r11)
                r10.append(r0)
                java.lang.String r0 = " objectLikeLikeCnt "
                r10.append(r0)
                r10.append(r1)
                java.lang.String r0 = " objectRecommendLikeCnt "
                r10.append(r0)
                r10.append(r3)
                java.lang.String r0 = " friendRecommendCnt:"
                r10.append(r0)
                r10.append(r7)
                java.lang.String r0 = " tabType "
                r10.append(r0)
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r0 = r12.f13295d
                int r0 = r0.f13272p
                r10.append(r0)
                java.lang.String r0 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                if (r2 == 0) goto L_0x00f0
                com.tencent.mm.plugin.finder.feed.d0 r0 = new com.tencent.mm.plugin.finder.feed.d0
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r4 = r12.f13295d
                r3 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9)
                o40.C61926c.m72668M(r0)
            L_0x00f0:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter.C2567d0.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$e */
    public static final class C2568e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WxRecyclerAdapter<?> f13296d;

        /* renamed from: e */
        public final /* synthetic */ FinderTimelinePresenter f13297e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2568e(WxRecyclerAdapter<?> wxRecyclerAdapter, FinderTimelinePresenter finderTimelinePresenter) {
            super(0);
            this.f13296d = wxRecyclerAdapter;
            this.f13297e = finderTimelinePresenter;
        }

        public Object invoke() {
            WxRecyclerAdapter<?> wxRecyclerAdapter = this.f13296d;
            if (wxRecyclerAdapter != null) {
                FinderTimelinePresenter finderTimelinePresenter = this.f13297e;
                C60898l.C60899a aVar = finderTimelinePresenter.f13258S;
                C87412m.m108594g(aVar, "info");
                RefreshLoadMoreLayout refreshLoadMoreLayout = null;
                if (!wxRecyclerAdapter.f173486j.contains(aVar)) {
                    C60898l.m71326Q5(wxRecyclerAdapter, finderTimelinePresenter.f13258S, false, 2, (Object) null);
                }
                String str = finderTimelinePresenter.f13249I;
                C37521f.f99374d.getClass();
                Log.m105924i(str, "[checkNoMoreFooter] EMPTY_FOOTER_IGNORE_CHECK=false");
                C9878n9 n9Var = finderTimelinePresenter.f13269j;
                if (n9Var != null) {
                    refreshLoadMoreLayout = n9Var.mo10416c();
                }
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.setCanLoadMore(false);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$e0 */
    public static final class C2569e0 extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13298d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2569e0(FinderTimelinePresenter finderTimelinePresenter) {
            super(0);
            this.f13298d = finderTimelinePresenter;
        }

        public Object invoke() {
            return Integer.valueOf(this.f13298d.f13266g.getIntent().getIntExtra("report_scene", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$f */
    public static final class C2570f extends C87413o implements C32224a<C55776r> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13299d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2570f(FinderTimelinePresenter finderTimelinePresenter) {
            super(0);
            this.f13299d = finderTimelinePresenter;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r1 = ((rs1.C13133c1) bl3.C39818r.f106831a.mo62445d(r1).mo75002a(r0)).f37371d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r3 = this;
                java.lang.Class<rs1.c1> r0 = rs1.C13133c1.class
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r3.f13299d
                com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r1 = r1.f13267h
                if (r1 == 0) goto L_0x0018
                bl3.r r2 = bl3.C39818r.f106831a
                bl3.r$a r1 = r2.mo62445d(r1)
                androidx.lifecycle.i0 r1 = r1.mo75002a(r0)
                rs1.c1 r1 = (rs1.C13133c1) r1
                com.tencent.mm.plugin.finder.feed.model.r r1 = r1.f37371d
                if (r1 != 0) goto L_0x002a
            L_0x0018:
                bl3.r r1 = bl3.C39818r.f106831a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r3.f13299d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                bl3.r$a r1 = r1.mo62444c(r2)
                androidx.lifecycle.i0 r0 = r1.mo75002a(r0)
                rs1.c1 r0 = (rs1.C13133c1) r0
                com.tencent.mm.plugin.finder.feed.model.r r1 = r0.f37371d
            L_0x002a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter.C2570f.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$f0 */
    public static final class C2571f0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13300d;

        /* renamed from: e */
        public final /* synthetic */ List<BaseFinderFeed> f13301e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2571f0(FinderTimelinePresenter finderTimelinePresenter, List<BaseFinderFeed> list) {
            super(0);
            this.f13300d = finderTimelinePresenter;
            this.f13301e = list;
        }

        public Object invoke() {
            Class cls = C58417y0.class;
            ((C58417y0) C86312j.m106911c(cls)).N40(this.f13300d.mo2595E(), "StartCgi");
            CopyOnWriteArrayList<C4119n> copyOnWriteArrayList = FinderTimelinePresenter.f13240R0;
            FinderTimelinePresenter finderTimelinePresenter = this.f13300d;
            Iterator<C4119n> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().mo5002b(finderTimelinePresenter.f13272p);
            }
            ((C58417y0) C86312j.m106911c(cls)).N40(this.f13300d.mo2595E(), "StartCgi");
            FinderTimelinePresenter finderTimelinePresenter2 = this.f13300d;
            int i = finderTimelinePresenter2.f13272p;
            MMActivity mMActivity = finderTimelinePresenter2.f13266g;
            C87412m.m108594g(mMActivity, "context");
            C13442s8 f = C13442s8.f38060Q0.mo12873f(mMActivity);
            if (f != null) {
                C49712hj1 q3 = f.mo12861q3();
                int i2 = f.f38091d;
                if (i == 1) {
                    C2483o0.f12984a.mo2457g(2, q3, i2, false);
                } else if (i == 3) {
                    C2483o0.f12984a.mo2456f(2, q3, i2, false);
                } else if (i == 4) {
                    C2483o0.f12984a.mo2459i(2, q3, i2, false);
                }
            }
            this.f13300d.f13285z.mo2803e(this.f13301e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$g */
    public static final class C2572g extends C87413o implements C32227p<String, BaseFinderFeed, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13302d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2572g(FinderTimelinePresenter finderTimelinePresenter) {
            super(2);
            this.f13302d = finderTimelinePresenter;
        }

        public Object invoke(Object obj, Object obj2) {
            String str;
            String str2;
            String str3 = (String) obj;
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) obj2;
            C87412m.m108594g(str3, "invokeSource");
            C87412m.m108594g(baseFinderFeed, "feed");
            String str4 = this.f13302d.f13249I;
            StringBuilder sb = new StringBuilder();
            sb.append("onGetFirstFeed ");
            sb.append(str3);
            sb.append(' ');
            C58739j4 j4Var = C58739j4.f168176a;
            FinderObject feedObject = baseFinderFeed.mo3513o().getFeedObject();
            j4Var.getClass();
            if (feedObject != null) {
                FinderObjectDesc finderObjectDesc = feedObject.objectDesc;
                String str5 = "";
                if (finderObjectDesc == null || (str2 = finderObjectDesc.description) == null) {
                    str2 = str5;
                }
                String p = C61926c.m72691p(feedObject.f164794id);
                if (!TextUtils.isEmpty(str2)) {
                    str5 = str2.substring(0, Math.min(4, str2.length()));
                    C87412m.m108593f(str5, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str = p + '.' + str5;
            } else {
                str = "INVALID-FEED";
            }
            sb.append(str);
            Log.m105924i(str4, sb.toString());
            C0898b bVar = C0898b.f2115a;
            if (bVar.mo785a().mo786a()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(baseFinderFeed.mo3513o().getFeedObject());
                FinderTimelinePresenter finderTimelinePresenter = this.f13302d;
                MediaPreloadCore mediaPreloadCore = finderTimelinePresenter.f13242B.f161830p;
                if (mediaPreloadCore != null) {
                    mediaPreloadCore.mo78448j3(str3, C58784w3.f168295a.mo83890O(finderTimelinePresenter.f13272p), arrayList, bVar.mo785a().f2118c);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$g0 */
    public static final class C2573g0 extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13303d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2573g0(FinderTimelinePresenter finderTimelinePresenter) {
            super(0);
            this.f13303d = finderTimelinePresenter;
        }

        public Object invoke() {
            return Integer.valueOf(this.f13303d.f13266g.getIntent().getIntExtra("key_reuqest_scene", -1));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$h */
    public static final class C2574h implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderTimelinePresenter f13304a;

        /* renamed from: b */
        public final /* synthetic */ FinderTimelineFeedLoader f13305b;

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$h$a */
        public static final class C2575a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderTimelinePresenter f13306d;

            /* renamed from: e */
            public final /* synthetic */ FinderTimelineFeedLoader f13307e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2575a(FinderTimelinePresenter finderTimelinePresenter, FinderTimelineFeedLoader finderTimelineFeedLoader) {
                super(0);
                this.f13306d = finderTimelinePresenter;
                this.f13307e = finderTimelineFeedLoader;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
                r1 = r1.getRecyclerView();
             */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x008a  */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x00a6  */
            /* JADX WARNING: Removed duplicated region for block: B:63:0x01b3  */
            /* JADX WARNING: Removed duplicated region for block: B:72:0x01ce  */
            /* JADX WARNING: Removed duplicated region for block: B:73:0x01d3  */
            /* JADX WARNING: Removed duplicated region for block: B:79:0x01de  */
            /* JADX WARNING: Removed duplicated region for block: B:82:0x01ec  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r18 = this;
                    r0 = r18
                    com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13306d
                    kf1.n9 r1 = r1.f13269j
                    r2 = 0
                    if (r1 == 0) goto L_0x0014
                    androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
                    if (r1 == 0) goto L_0x0014
                    androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r1.getLayoutManager()
                    goto L_0x0015
                L_0x0014:
                    r1 = r2
                L_0x0015:
                    java.lang.String r3 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
                    gy3.C87412m.m108592e(r1, r3)
                    androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
                    com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r3 = r0.f13307e
                    ke1.s r4 = r3.f13843f
                    r12 = 1
                    r13 = 0
                    if (r4 == 0) goto L_0x002a
                    boolean r4 = r4.f29879l
                    if (r4 != r12) goto L_0x002a
                    r4 = 1
                    goto L_0x002b
                L_0x002a:
                    r4 = 0
                L_0x002b:
                    if (r4 == 0) goto L_0x003a
                    com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r3 = r3.getDataList()
                    boolean r3 = r3.isEmpty()
                    r3 = r3 ^ r12
                    if (r3 == 0) goto L_0x003a
                    r3 = 1
                    goto L_0x003b
                L_0x003a:
                    r3 = 0
                L_0x003b:
                    if (r3 != 0) goto L_0x0045
                    com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r3 = r0.f13306d
                    boolean r3 = r3.mo2604N1()
                    if (r3 == 0) goto L_0x0052
                L_0x0045:
                    com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r3 = r0.f13307e
                    boolean r3 = r3.f13848n
                    if (r3 != 0) goto L_0x0052
                    com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r3 = r0.f13306d
                    int r3 = r3.f13272p
                    r4 = 4
                    if (r3 == r4) goto L_0x0065
                L_0x0052:
                    up1.f r3 = up1.C37521f.f99374d
                    r3.getClass()
                    pe1.c<java.lang.Integer> r3 = up1.C37521f.f99338Y5
                    java.lang.Object r3 = r3.mo60266n()
                    java.lang.Number r3 = (java.lang.Number) r3
                    int r3 = r3.intValue()
                    if (r3 != r12) goto L_0x0067
                L_0x0065:
                    r3 = 1
                    goto L_0x0068
                L_0x0067:
                    r3 = 0
                L_0x0068:
                    com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r4 = r0.f13306d
                    boolean r5 = r4.f13274q
                    if (r5 == 0) goto L_0x009e
                    if (r3 != 0) goto L_0x009e
                    com.tencent.mm.plugin.finder.video.FinderVideoCore r4 = r4.f13242B
                    hr1.k r5 = r4.f161828n
                    if (r5 == 0) goto L_0x009e
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r6 = r0.f13306d
                    com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r6 = r6.f13267h
                    if (r6 == 0) goto L_0x008a
                    java.lang.Class r6 = r6.getClass()
                    java.lang.String r6 = r6.getSimpleName()
                    goto L_0x008b
                L_0x008a:
                    r6 = r2
                L_0x008b:
                    r4.append(r6)
                    java.lang.String r6 = "#onAttach"
                    r4.append(r6)
                    java.lang.String r6 = r4.toString()
                    r7 = 1
                    r8 = 0
                    r9 = 4
                    r10 = 0
                    hr1.C8730k.C8731a.m8556a(r5, r6, r7, r8, r9, r10)
                L_0x009e:
                    com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r14 = r0.f13306d
                    os1.f$a r4 = r14.f13271o
                    r10 = 0
                    if (r4 == 0) goto L_0x01b3
                    com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r5 = r0.f13307e
                    kf1.n9 r6 = r14.f13269j
                    if (r6 == 0) goto L_0x00b6
                    androidx.recyclerview.widget.RecyclerView r6 = r6.getRecyclerView()
                    if (r6 == 0) goto L_0x00b6
                    androidx.recyclerview.widget.RecyclerView$e r2 = r6.getAdapter()
                L_0x00b6:
                    java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>"
                    gy3.C87412m.m108592e(r2, r6)
                    jq3.l r2 = (jq3.C60898l) r2
                    int r6 = r4.f34371d
                    int r2 = r2.mo85796c6()
                    int r2 = r2 + r6
                    int r15 = r4.f34372e
                    java.lang.String r4 = r5.getTAG()
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r7 = "TimelineInit initdone: canTimelineRefresh="
                    r6.append(r7)
                    boolean r7 = r14.f13274q
                    r6.append(r7)
                    java.lang.String r7 = ", isUnLock="
                    r6.append(r7)
                    r6.append(r3)
                    java.lang.String r3 = "enableExitFeedReplaceFirst="
                    r6.append(r3)
                    rx3.g r3 = r5.f13850p
                    rx3.n r3 = (rx3.C36570n) r3
                    java.lang.Object r3 = r3.getValue()
                    java.lang.Boolean r3 = (java.lang.Boolean) r3
                    boolean r3 = r3.booleanValue()
                    r6.append(r3)
                    java.lang.String r3 = ", tabType="
                    r6.append(r3)
                    int r3 = r14.f13272p
                    r6.append(r3)
                    java.lang.String r3 = "  lastPos="
                    r6.append(r3)
                    r6.append(r2)
                    java.lang.String r3 = " fromTopPixel="
                    r6.append(r3)
                    r6.append(r15)
                    java.lang.String r3 = r6.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                    if (r2 <= 0) goto L_0x0199
                    rx3.g r3 = r5.f13850p
                    rx3.n r3 = (rx3.C36570n) r3
                    java.lang.Object r3 = r3.getValue()
                    java.lang.Boolean r3 = (java.lang.Boolean) r3
                    boolean r3 = r3.booleanValue()
                    if (r3 == 0) goto L_0x012e
                    boolean r3 = r14.f13274q
                    if (r3 != 0) goto L_0x0199
                L_0x012e:
                    k20.a r3 = new k20.a
                    r3.<init>()
                    java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
                    r3.mo10233c(r4)
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                    r3.mo10233c(r4)
                    java.lang.Object[] r5 = r3.mo10232b()
                    java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$feedLoader$3$1$call$1"
                    java.lang.String r7 = "invoke"
                    java.lang.String r8 = "()V"
                    java.lang.String r9 = "Undefined"
                    java.lang.String r16 = "scrollToPositionWithOffset"
                    java.lang.String r17 = "(II)V"
                    r4 = r1
                    r10 = r16
                    r11 = r17
                    j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
                    java.lang.Object r4 = r3.mo10231a(r13)
                    java.lang.Integer r4 = (java.lang.Integer) r4
                    int r4 = r4.intValue()
                    java.lang.Object r3 = r3.mo10231a(r12)
                    java.lang.Integer r3 = (java.lang.Integer) r3
                    int r3 = r3.intValue()
                    r1.mo16973V(r4, r3)
                    java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$feedLoader$3$1$call$1"
                    java.lang.String r6 = "invoke"
                    java.lang.String r7 = "()V"
                    java.lang.String r8 = "Undefined"
                    java.lang.String r9 = "scrollToPositionWithOffset"
                    java.lang.String r10 = "(II)V"
                    r4 = r1
                    j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
                    kf1.n9 r3 = r14.f13269j
                    if (r3 == 0) goto L_0x0196
                    androidx.recyclerview.widget.RecyclerView r3 = r3.getRecyclerView()
                    if (r3 == 0) goto L_0x0196
                    com.tencent.mm.plugin.finder.feed.x r4 = new com.tencent.mm.plugin.finder.feed.x
                    r4.<init>(r1, r2, r15)
                    r3.post(r4)
                L_0x0196:
                    r1 = 0
                    goto L_0x019d
                L_0x0199:
                    r1 = r10
                    r14.mo2603M1(r1, r13)
                L_0x019d:
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.view.RefreshLoadMoreLayout$c<java.lang.Object>> r3 = com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter.f13239Q0
                    java.lang.String r4 = r14.mo2598H1()
                    java.lang.Object r3 = r3.get(r4)
                    com.tencent.mm.view.RefreshLoadMoreLayout$c r3 = (com.tencent.p014mm.view.RefreshLoadMoreLayout.C7080c) r3
                    if (r3 == 0) goto L_0x01b4
                    boolean r4 = r3.f24951f
                    if (r4 != 0) goto L_0x01b4
                    r14.mo2596F1(r3, r13)
                    goto L_0x01b4
                L_0x01b3:
                    r1 = r10
                L_0x01b4:
                    com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r3 = r0.f13306d
                    int r4 = r3.f13272p
                    int r5 = ve1.C14486c8.f40164d
                    if (r4 != r5) goto L_0x01e6
                    kf1.n9 r3 = r3.f13269j
                    if (r3 == 0) goto L_0x01e6
                    androidx.recyclerview.widget.RecyclerView r3 = r3.getRecyclerView()
                    if (r3 == 0) goto L_0x01e6
                    com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r4 = r0.f13306d
                    androidx.recyclerview.widget.RecyclerView$e r5 = r3.getAdapter()
                    if (r5 == 0) goto L_0x01d3
                    int r5 = r5.getItemCount()
                    goto L_0x01d4
                L_0x01d3:
                    r5 = 0
                L_0x01d4:
                    int r6 = ve1.C14486c8.f40165e
                    if (r6 < 0) goto L_0x01db
                    if (r6 >= r5) goto L_0x01db
                    goto L_0x01dc
                L_0x01db:
                    r12 = 0
                L_0x01dc:
                    if (r12 == 0) goto L_0x01e6
                    com.tencent.mm.plugin.finder.feed.y r5 = new com.tencent.mm.plugin.finder.feed.y
                    r5.<init>(r3, r6, r4)
                    r3.post(r5)
                L_0x01e6:
                    com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r3 = r0.f13306d
                    com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r4 = r3.f13267h
                    if (r4 == 0) goto L_0x01f4
                    com.tencent.mm.plugin.finder.feed.z r5 = new com.tencent.mm.plugin.finder.feed.z
                    r5.<init>(r4, r3)
                    o40.C61926c.m72666K(r1, r5)
                L_0x01f4:
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter.C2574h.C2575a.invoke():java.lang.Object");
            }
        }

        public C2574h(FinderTimelinePresenter finderTimelinePresenter, FinderTimelineFeedLoader finderTimelineFeedLoader) {
            this.f13304a = finderTimelinePresenter;
            this.f13305b = finderTimelineFeedLoader;
        }

        public void call(int i) {
            Bundle bundle;
            FinderHomeTabFragment finderHomeTabFragment = this.f13304a.f13267h;
            boolean z = true;
            if (finderHomeTabFragment == null || (bundle = finderHomeTabFragment.f17335p) == null || bundle.getInt("RequestScene", -1) != 1) {
                z = false;
            }
            if (z) {
                Log.m105924i(this.f13305b.getTAG(), "IInitDone come from hot card.");
                C8730k kVar = this.f13304a.f13242B.f161828n;
                if (kVar != null) {
                    StringBuilder sb = new StringBuilder();
                    FinderHomeTabFragment finderHomeTabFragment2 = this.f13304a.f13267h;
                    sb.append(finderHomeTabFragment2 != null ? finderHomeTabFragment2.getClass().getSimpleName() : null);
                    sb.append("#onAttach");
                    C8730k.C8731a.m8556a(kVar, sb.toString(), false, false, 4, (Object) null);
                    return;
                }
                return;
            }
            C61926c.m72668M(new C2575a(this.f13304a, this.f13305b));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$h0 */
    public static final class C2576h0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RecyclerView f13308d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f13309e;

        public C2576h0(RecyclerView recyclerView, C8478d0 d0Var) {
            this.f13308d = recyclerView;
            this.f13309e = d0Var;
        }

        public final void run() {
            RecyclerView recyclerView = this.f13308d;
            int i = this.f13309e.f27483d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$smoothScrollToNextPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$smoothScrollToNextPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$i */
    public static final class C2577i extends C87413o implements C32224a<C8819z2> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13310d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2577i(FinderTimelinePresenter finderTimelinePresenter) {
            super(0);
            this.f13310d = finderTimelinePresenter;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r1 = ((ht1.C8817y2) bl3.C39818r.f106831a.mo62445d(r1).mo62447c(r0)).mo9643v2();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r3 = this;
                java.lang.Class<ht1.y2> r0 = ht1.C8817y2.class
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r3.f13310d
                com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r1 = r1.f13267h
                if (r1 == 0) goto L_0x001a
                bl3.r r2 = bl3.C39818r.f106831a
                bl3.r$a r1 = r2.mo62445d(r1)
                bl3.c r1 = r1.mo62447c(r0)
                ht1.y2 r1 = (ht1.C8817y2) r1
                ht1.z2 r1 = r1.mo9643v2()
                if (r1 != 0) goto L_0x002e
            L_0x001a:
                bl3.r r1 = bl3.C39818r.f106831a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r3.f13310d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                bl3.r$a r1 = r1.mo62444c(r2)
                bl3.c r0 = r1.mo62447c(r0)
                ht1.y2 r0 = (ht1.C8817y2) r0
                ht1.z2 r1 = r0.mo9643v2()
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter.C2577i.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$i0 */
    public static final class C2578i0 extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13311d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2578i0(FinderTimelinePresenter finderTimelinePresenter) {
            super(0);
            this.f13311d = finderTimelinePresenter;
        }

        public Object invoke() {
            return Integer.valueOf(this.f13311d.f13266g.getIntent().getIntExtra("KEY_SOURCE_TYPE", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$j */
    public static final class C2579j implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13312d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f13313e;

        /* renamed from: f */
        public final /* synthetic */ C77407n f13314f;

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$j$a */
        public static final class C2580a extends C87413o implements C32226l<C13605o<? extends String, ? extends String, ? extends String>, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C76874e0 f13315d;

            /* renamed from: e */
            public final /* synthetic */ BaseFinderFeed f13316e;

            /* renamed from: f */
            public final /* synthetic */ FinderTimelinePresenter f13317f;

            /* renamed from: g */
            public final /* synthetic */ C77407n f13318g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2580a(C76874e0 e0Var, BaseFinderFeed baseFinderFeed, FinderTimelinePresenter finderTimelinePresenter, C77407n nVar) {
                super(1);
                this.f13315d = e0Var;
                this.f13316e = baseFinderFeed;
                this.f13317f = finderTimelinePresenter;
                this.f13318g = nVar;
            }

            public Object invoke(Object obj) {
                C13605o oVar = (C13605o) obj;
                C87412m.m108594g(oVar, LocaleUtil.ITALIAN);
                ((ArrayList) this.f13315d.f224704d).clear();
                boolean isNotShareSns = this.f13316e.mo3513o().isNotShareSns();
                if (!isNotShareSns) {
                    this.f13315d.mo107150j(103, this.f13317f.f13266g.getString(C0966R.string.epb), C0966R.raw.bottomsheet_icon_moment, 0, isNotShareSns);
                } else {
                    this.f13315d.mo107150j(103, (CharSequence) oVar.f38558e, C0966R.raw.bottomsheet_icon_moment, 0, isNotShareSns);
                }
                if (this.f13316e.mo3513o().isNotShareConversation()) {
                    C15133e0 e0Var = this.f13317f.f13275r;
                    C77407n nVar = this.f13318g;
                    C76874e0 e0Var2 = nVar.f225732J;
                    C87412m.m108593f(e0Var2, "sheet.zeroLineMenu");
                    e0Var.mo14086LS(nVar, e0Var2);
                }
                C58784w3.f168295a.mo83895P1(this.f13317f.f13266g, this.f13318g);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$j$b */
        public static final class C2581b extends C87413o implements C32226l<C58784w3.C7912a, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C76874e0 f13319d;

            /* renamed from: e */
            public final /* synthetic */ FinderTimelinePresenter f13320e;

            /* renamed from: f */
            public final /* synthetic */ C77407n f13321f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2581b(C76874e0 e0Var, FinderTimelinePresenter finderTimelinePresenter, C77407n nVar) {
                super(1);
                this.f13319d = e0Var;
                this.f13320e = finderTimelinePresenter;
                this.f13321f = nVar;
            }

            public Object invoke(Object obj) {
                C58784w3.C7912a aVar = (C58784w3.C7912a) obj;
                C87412m.m108594g(aVar, "actionMenuInfo");
                if (!aVar.f26590l && this.f13319d.findItem(208) == null) {
                    this.f13319d.mo107150j(208, aVar.f26586h, C0966R.raw.bottomsheet_icon_wework, 0, aVar.f26582d);
                    C58784w3.f168295a.mo83895P1(this.f13320e.f13266g, this.f13321f);
                }
                return C13598b0.f38549a;
            }
        }

        public C2579j(FinderTimelinePresenter finderTimelinePresenter, BaseFinderFeed baseFinderFeed, C77407n nVar) {
            this.f13312d = finderTimelinePresenter;
            this.f13313e = baseFinderFeed;
            this.f13314f = nVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d7, code lost:
            r1 = r1.video_tmpl_info;
         */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x0285  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x02ce  */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x02d8  */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x035d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onCreateMMMenu(nj3.C76874e0 r25) {
            /*
                r24 = this;
                r0 = r24
                r7 = r25
                java.lang.Class<dp1.y0> r8 = dp1.C58417y0.class
                er1.w3 r6 = er1.C58784w3.f168295a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13312d
                com.tencent.mm.ui.MMActivity r10 = r1.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = r0.f13313e
                r12 = 0
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$j$a r13 = new com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$j$a
                qo3.n r2 = r0.f13314f
                r13.<init>(r7, r11, r1, r2)
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$j$b r14 = new com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$j$b
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13312d
                qo3.n r2 = r0.f13314f
                r14.<init>(r7, r1, r2)
                r15 = 4
                r16 = 0
                r9 = r6
                er1.w3$a r9 = er1.C58784w3.m68431K(r9, r10, r11, r12, r13, r14, r15, r16)
                boolean r10 = r9.f26579a
                boolean r11 = r9.f26580b
                java.lang.String r3 = r9.f26583e
                java.lang.String r12 = r9.f26584f
                boolean r1 = r9.f26587i
                r13 = 2131099756(0x7f06006c, float:1.7811874E38)
                if (r1 != 0) goto L_0x004f
                r2 = 102(0x66, float:1.43E-43)
                r4 = 2131755655(0x7f100287, float:1.9142195E38)
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13312d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                android.content.res.Resources r1 = r1.getResources()
                int r5 = r1.getColor(r13)
                r1 = r25
                r14 = r6
                r6 = r10
                r1.mo107150j(r2, r3, r4, r5, r6)
                goto L_0x0050
            L_0x004f:
                r14 = r6
            L_0x0050:
                boolean r1 = r9.f26588j
                if (r1 != 0) goto L_0x0061
                r2 = 103(0x67, float:1.44E-43)
                r4 = 2131755285(0x7f100115, float:1.9141445E38)
                r5 = 0
                r1 = r25
                r3 = r12
                r6 = r11
                r1.mo107150j(r2, r3, r4, r5, r6)
            L_0x0061:
                boolean r1 = r9.f26590l
                if (r1 != 0) goto L_0x0074
                r2 = 208(0xd0, float:2.91E-43)
                java.lang.String r3 = r9.f26586h
                r4 = 2131755296(0x7f100120, float:1.9141467E38)
                r5 = 0
                boolean r6 = r9.f26582d
                r1 = r25
                r1.mo107150j(r2, r3, r4, r5, r6)
            L_0x0074:
                up1.f r10 = up1.C37521f.f99374d
                r10.getClass()
                pe1.c<java.lang.Integer> r1 = up1.C37521f.f99190H7
                java.lang.Object r1 = r1.mo60266n()
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r11 = 1
                if (r1 != r11) goto L_0x00c9
                boolean r1 = r9.f26589k
                if (r1 != 0) goto L_0x00c9
                r2 = 104(0x68, float:1.46E-43)
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13312d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                r3 = 2131825615(0x7f1113cf, float:1.9284091E38)
                java.lang.String r3 = r1.getString(r3)
                r4 = 2131755278(0x7f10010e, float:1.914143E38)
                r5 = 0
                boolean r6 = r9.f26591m
                r1 = r25
                r1.mo107150j(r2, r3, r4, r5, r6)
                di3.d r1 = di3.C86312j.m106911c(r8)
                java.lang.String r2 = "getService(FinderReportLogic::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                r15 = r1
                dp1.y0 r15 = (dp1.C58417y0) r15
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13312d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                r17 = 0
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13313e
                long r18 = r2.getItemId()
                boolean r2 = r9.f26591m
                r21 = 2
                r22 = 0
                r16 = r1
                r20 = r2
                dp1.C58417y0.Qy0(r15, r16, r17, r18, r20, r21, r22)
            L_0x00c9:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13313e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x00de
                te3.ap1 r1 = r1.video_tmpl_info
                if (r1 == 0) goto L_0x00de
                java.lang.String r1 = r1.f182115d
                goto L_0x00df
            L_0x00de:
                r1 = 0
            L_0x00df:
                r12 = 0
                if (r1 == 0) goto L_0x00eb
                int r1 = r1.length()
                if (r1 != 0) goto L_0x00e9
                goto L_0x00eb
            L_0x00e9:
                r1 = 0
                goto L_0x00ec
            L_0x00eb:
                r1 = 1
            L_0x00ec:
                r15 = 2131826812(0x7f11187c, float:1.9286519E38)
                r6 = 9999(0x270f, float:1.4012E-41)
                r5 = 99999(0x1869f, float:1.40128E-40)
                if (r1 != 0) goto L_0x024c
                java.lang.Class<da0.e> r1 = da0.C58247e.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                da0.e r1 = (da0.C58247e) r1
                da0.b r1 = r1.yf0()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13313e
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
                if (r2 == 0) goto L_0x011b
                te3.ap1 r2 = r2.video_tmpl_info
                if (r2 == 0) goto L_0x011b
                te3.yq4 r2 = r2.f182120i
                if (r2 == 0) goto L_0x011b
                int r2 = r2.f145473f
                goto L_0x011c
            L_0x011b:
                r2 = 0
            L_0x011c:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13313e
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
                if (r3 == 0) goto L_0x0135
                te3.ap1 r3 = r3.video_tmpl_info
                if (r3 == 0) goto L_0x0135
                te3.yq4 r3 = r3.f182120i
                if (r3 == 0) goto L_0x0135
                int r3 = r3.f145474g
                goto L_0x0136
            L_0x0135:
                r3 = 0
            L_0x0136:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13313e
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
                if (r4 == 0) goto L_0x014b
                te3.ap1 r4 = r4.video_tmpl_info
                if (r4 == 0) goto L_0x014b
                int r4 = r4.f182116e
                goto L_0x014c
            L_0x014b:
                r4 = -1
            L_0x014c:
                boolean r1 = r1.mo8428c(r2, r3, r4)
                if (r1 == 0) goto L_0x024c
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13313e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x0167
                te3.ap1 r1 = r1.video_tmpl_info
                if (r1 == 0) goto L_0x0167
                int r1 = r1.f182118g
                goto L_0x0168
            L_0x0167:
                r1 = 0
            L_0x0168:
                r2 = 2
                if (r1 <= 0) goto L_0x01b4
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r3 = r0.f13312d
                com.tencent.mm.ui.MMActivity r3 = r3.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13313e
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
                if (r4 == 0) goto L_0x0187
                te3.ap1 r4 = r4.video_tmpl_info
                if (r4 == 0) goto L_0x0187
                int r4 = r4.f182116e
                if (r4 != r2) goto L_0x0187
                r2 = 1
                goto L_0x0188
            L_0x0187:
                r2 = 0
            L_0x0188:
                if (r2 == 0) goto L_0x018e
                r2 = 2131829893(0x7f112485, float:1.9292768E38)
                goto L_0x0191
            L_0x018e:
                r2 = 2131829901(0x7f11248d, float:1.9292784E38)
            L_0x0191:
                java.lang.Object[] r4 = new java.lang.Object[r11]
                if (r1 <= r5) goto L_0x01a2
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13312d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                java.lang.String r1 = r1.getString(r15)
                java.lang.String r1 = java.lang.String.valueOf(r1)
                goto L_0x01ad
            L_0x01a2:
                if (r1 <= r6) goto L_0x01a9
                java.lang.String r1 = er1.C58784w3.m68432N1(r1)
                goto L_0x01ad
            L_0x01a9:
                java.lang.String r1 = java.lang.String.valueOf(r1)
            L_0x01ad:
                r4[r12] = r1
                java.lang.String r1 = r3.getString(r2, r4)
                goto L_0x01de
            L_0x01b4:
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13312d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13313e
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
                if (r3 == 0) goto L_0x01d0
                te3.ap1 r3 = r3.video_tmpl_info
                if (r3 == 0) goto L_0x01d0
                int r3 = r3.f182116e
                if (r3 != r2) goto L_0x01d0
                r2 = 1
                goto L_0x01d1
            L_0x01d0:
                r2 = 0
            L_0x01d1:
                if (r2 == 0) goto L_0x01d7
                r2 = 2131829892(0x7f112484, float:1.9292766E38)
                goto L_0x01da
            L_0x01d7:
                r2 = 2131829900(0x7f11248c, float:1.9292782E38)
            L_0x01da:
                java.lang.String r1 = r1.getString(r2)
            L_0x01de:
                r3 = r1
                java.lang.String r1 = "if (count > 0) context.g…share_use_same_template))"
                gy3.C87412m.m108593f(r3, r1)
                r2 = 118(0x76, float:1.65E-43)
                r4 = 2131233401(0x7f080a79, float:1.8082938E38)
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13312d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                android.content.res.Resources r1 = r1.getResources()
                int r13 = r1.getColor(r13)
                r16 = 0
                r1 = r25
                r9 = 99999(0x1869f, float:1.40128E-40)
                r5 = r13
                r13 = 9999(0x270f, float:1.4012E-41)
                r6 = r16
                r1.mo107150j(r2, r3, r4, r5, r6)
                bl3.r r1 = bl3.C39818r.f106831a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13312d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                bl3.r$a r1 = r1.mo62444c(r2)
                java.lang.Class<rs1.s8> r2 = rs1.C13442s8.class
                androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
                rs1.s8 r1 = (rs1.C13442s8) r1
                te3.hj1 r1 = r1.mo12861q3()
                dp1.f2 r2 = dp1.C7435f2.f25626a
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13313e
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
                if (r4 == 0) goto L_0x0236
                te3.ap1 r4 = r4.video_tmpl_info
                if (r4 == 0) goto L_0x0236
                java.lang.String r4 = r4.f182115d
                goto L_0x0237
            L_0x0236:
                r4 = 0
            L_0x0237:
                if (r4 != 0) goto L_0x023d
                java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            L_0x023d:
                java.lang.String r5 = "templateId"
                r3.put(r5, r4)
                rx3.b0 r4 = rx3.C13598b0.f38549a
                java.lang.String r4 = "shoot_same_video"
                r2.mo8580d(r1, r4, r12, r3)
                goto L_0x0251
            L_0x024c:
                r9 = 99999(0x1869f, float:1.40128E-40)
                r13 = 9999(0x270f, float:1.4012E-41)
            L_0x0251:
                er1.i1 r6 = er1.C58736i1.f168173a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13312d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                java.lang.String r2 = "menu"
                gy3.C87412m.m108593f(r7, r2)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13313e
                r6.mo83664j(r1, r7, r2)
                r10.getClass()
                pe1.c<java.lang.Integer> r1 = up1.C37521f.f99337Y4
                up1.f$h1 r1 = (up1.C37521f.C37530h1) r1
                r1.getClass()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
                int r1 = r1.intValue()
                if (r1 != r11) goto L_0x02ce
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13313e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                boolean r1 = r14.mo83939j(r1)
                if (r1 == 0) goto L_0x02ce
                di3.d r1 = di3.C86312j.m106911c(r8)
                dp1.y0 r1 = (dp1.C58417y0) r1
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13312d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13313e
                long r3 = r3.getItemId()
                r1.Vy0(r2, r3)
                r2 = 113(0x71, float:1.58E-43)
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13312d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                r3 = 2131829896(0x7f112488, float:1.9292774E38)
                java.lang.String r3 = r1.getString(r3)
                r4 = 2131757017(0x7f1007d9, float:1.9144958E38)
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13312d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                android.content.res.Resources r1 = r1.getResources()
                r5 = 2131099737(0x7f060059, float:1.7811836E38)
                int r5 = r1.getColor(r5)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13313e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                boolean r10 = r14.mo83854A(r1)
                r1 = r25
                r23 = r6
                r6 = r10
                r1.mo107150j(r2, r3, r4, r5, r6)
                goto L_0x02d0
            L_0x02ce:
                r23 = r6
            L_0x02d0:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13313e
                boolean r1 = r14.mo83933h(r1)
                if (r1 == 0) goto L_0x0346
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13313e
                if (r1 == 0) goto L_0x02e9
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                if (r1 == 0) goto L_0x02e9
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.field_finderObject
                if (r1 == 0) goto L_0x02e9
                int r1 = r1.ringtone_count
                goto L_0x02ea
            L_0x02e9:
                r1 = 0
            L_0x02ea:
                if (r1 == 0) goto L_0x031c
                int r2 = r14.mo83977x0()
                if (r1 < r2) goto L_0x031c
                if (r1 <= r9) goto L_0x0301
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13312d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                java.lang.String r1 = r1.getString(r15)
                java.lang.String r1 = java.lang.String.valueOf(r1)
                goto L_0x030c
            L_0x0301:
                if (r1 <= r13) goto L_0x0308
                java.lang.String r1 = er1.C58784w3.m68432N1(r1)
                goto L_0x030c
            L_0x0308:
                java.lang.String r1 = java.lang.String.valueOf(r1)
            L_0x030c:
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13312d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                r3 = 2131826564(0x7f111784, float:1.9286016E38)
                java.lang.Object[] r4 = new java.lang.Object[r11]
                r4[r12] = r1
                java.lang.String r1 = r2.getString(r3, r4)
                goto L_0x0327
            L_0x031c:
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13312d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                r2 = 2131829889(0x7f112481, float:1.929276E38)
                java.lang.String r1 = r1.getString(r2)
            L_0x0327:
                r3 = r1
                java.lang.String r1 = "if(count != 0 && count >…tone_title)\n            }"
                gy3.C87412m.m108593f(r3, r1)
                r2 = 114(0x72, float:1.6E-43)
                r4 = 2131756151(0x7f100477, float:1.9143201E38)
                r5 = 0
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13313e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                boolean r6 = r14.mo83982z(r1)
                r1 = r25
                r1.mo107150j(r2, r3, r4, r5, r6)
            L_0x0346:
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13312d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13313e
                r3 = r23
                r3.mo83662h(r1, r2, r7)
                rs1.s8$a r1 = rs1.C13442s8.f38060Q0
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13312d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                rs1.s8 r2 = r1.mo12873f(r2)
                if (r2 == 0) goto L_0x036e
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13313e
                di3.d r4 = di3.C86312j.m106911c(r8)
                dp1.y0 r4 = (dp1.C58417y0) r4
                long r5 = r3.getItemId()
                int r2 = r2.f38096i
                r4.mo83275AJ(r5, r2)
            L_0x036e:
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13312d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                rs1.s8 r1 = r1.mo12873f(r2)
                if (r1 == 0) goto L_0x038f
                r2 = 0
                df1.a r1 = ht1.C60172g4.C60173a.m70190b(r1, r12, r11, r2)
                if (r1 == 0) goto L_0x038f
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13313e
                long r2 = r2.getItemId()
                df1.a$a r4 = new df1.a$a
                r5 = 16
                r4.<init>(r5, r2)
                r1.mo8766a(r4)
            L_0x038f:
                dp1.e1 r1 = dp1.C7433e1.f25622a
                r1.mo8572a(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter.C2579j.onCreateMMMenu(nj3.e0):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$j0 */
    public static final class C2582j0 extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13322d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2582j0(FinderTimelinePresenter finderTimelinePresenter) {
            super(0);
            this.f13322d = finderTimelinePresenter;
        }

        public Object invoke() {
            return Integer.valueOf(this.f13322d.f13266g.getIntent().getIntExtra("KEY_TARGET_TAB_TYPE", 4));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$k */
    public static final class C2583k implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f13323d;

        /* renamed from: e */
        public final /* synthetic */ FinderTimelinePresenter f13324e;

        /* renamed from: f */
        public final /* synthetic */ C77407n f13325f;

        public C2583k(BaseFinderFeed baseFinderFeed, FinderTimelinePresenter finderTimelinePresenter, C77407n nVar) {
            this.f13323d = baseFinderFeed;
            this.f13324e = finderTimelinePresenter;
            this.f13325f = nVar;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            if (!this.f13323d.mo3513o().isNotShareConversation() && !C58784w3.f168295a.mo83855A0(this.f13323d.mo3513o().getFeedObject())) {
                C7888v2.C7889a aVar = C7888v2.f26513a;
                FinderTimelinePresenter finderTimelinePresenter = this.f13324e;
                MMActivity mMActivity = finderTimelinePresenter.f13266g;
                C15133e0 e0Var2 = finderTimelinePresenter.f13275r;
                BaseFinderFeed baseFinderFeed = this.f13323d;
                C87412m.m108593f(e0Var, "menu");
                aVar.mo9004b(mMActivity, e0Var2, baseFinderFeed, e0Var, this.f13325f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$k0 */
    public static final class C2584k0 extends C87413o implements C32224a<C11749q> {

        /* renamed from: d */
        public static final C2584k0 f13326d = new C2584k0();

        public C2584k0() {
            super(0);
        }

        public Object invoke() {
            return (C11749q) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11749q.class);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$l */
    public static final class C2585l implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13327d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f13328e;

        /* renamed from: f */
        public final /* synthetic */ C77407n f13329f;

        /* renamed from: g */
        public final /* synthetic */ C60905o f13330g;

        public C2585l(FinderTimelinePresenter finderTimelinePresenter, BaseFinderFeed baseFinderFeed, C77407n nVar, C60905o oVar) {
            this.f13327d = finderTimelinePresenter;
            this.f13328e = baseFinderFeed;
            this.f13329f = nVar;
            this.f13330g = oVar;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            FinderTimelinePresenter finderTimelinePresenter = this.f13327d;
            BaseFinderFeed baseFinderFeed = this.f13328e;
            finderTimelinePresenter.getClass();
            C58969q l = baseFinderFeed.mo3507l();
            if (!C112551y.m153810j(l != null ? l.field_username : null, C66785b.f191882e.mo90662O5(), false, 2, (Object) null)) {
                FinderTimelinePresenter finderTimelinePresenter2 = this.f13327d;
                BaseFinderFeed baseFinderFeed2 = this.f13328e;
                C87412m.m108593f(e0Var, "menu");
                FinderTimelinePresenter.m2529E1(finderTimelinePresenter2, baseFinderFeed2, e0Var, this.f13329f, this.f13330g);
                C58736i1 i1Var = C58736i1.f168173a;
                i1Var.mo83665k(this.f13327d.f13266g, this.f13328e, e0Var);
                e0Var.mo107144g(99, this.f13327d.f13266g.getString(C0966R.string.gvx), C58739j4.f168176a.mo83686O(this.f13328e) ? C0966R.raw.finder_live_dislike : C0966R.raw.finder_feed_dislike_new);
                i1Var.mo83655a(this.f13327d.f13266g, e0Var, this.f13328e);
                i1Var.mo83663i(this.f13327d.f13266g, this.f13328e, e0Var);
                e0Var.mo107144g(101, this.f13327d.f13266g.getString(C0966R.string.gvt), C0966R.raw.icons_outlined_report_problem);
            } else if (!C58739j4.f168176a.mo83686O(this.f13328e)) {
                C58736i1 i1Var2 = C58736i1.f168173a;
                MMActivity mMActivity = this.f13327d.f13266g;
                BaseFinderFeed baseFinderFeed3 = this.f13328e;
                C87412m.m108593f(e0Var, "menu");
                i1Var2.mo83665k(mMActivity, baseFinderFeed3, e0Var);
                i1Var2.mo83661g(this.f13327d.f13266g, e0Var, this.f13328e);
                e0Var.mo107135b(108, C0966R.string.f7944x1, C0966R.raw.icons_outlined_delete);
                i1Var2.mo83656b(this.f13327d.f13266g, this.f13328e, e0Var);
                i1Var2.mo83655a(this.f13327d.f13266g, e0Var, this.f13328e);
                i1Var2.mo83663i(this.f13327d.f13266g, this.f13328e, e0Var);
                FinderTimelinePresenter.m2529E1(this.f13327d, this.f13328e, e0Var, this.f13329f, this.f13330g);
            }
            C58736i1 i1Var3 = C58736i1.f168173a;
            MMActivity mMActivity2 = this.f13327d.f13266g;
            BaseFinderFeed baseFinderFeed4 = this.f13328e;
            C87412m.m108593f(e0Var, "menu");
            i1Var3.mo83659e(mMActivity2, baseFinderFeed4, e0Var);
            i1Var3.mo83658d(this.f13327d.f13266g, this.f13328e, e0Var);
            i1Var3.mo83657c(this.f13327d.f13266g, this.f13328e, e0Var);
            int indexOf = this.f13327d.f13285z.getDataListJustForAdapter().indexOf(this.f13328e);
            if (indexOf < 0) {
                String str = this.f13327d.f13249I;
                Log.m105924i(str, "pos is error " + indexOf + ' ' + this.f13328e);
                if (BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                    Context context = MMApplicationContext.getContext();
                    C76912y0.makeText(context, (CharSequence) "pos is error " + indexOf + ' ' + this.f13328e + ' ', 1).show();
                }
            }
            C7433e1.f25622a.mo8573b(e0Var);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$l0 */
    public static final class C2586l0 extends C87413o implements C32224a<FinderWhatsNewView> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13331d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2586l0(FinderTimelinePresenter finderTimelinePresenter) {
            super(0);
            this.f13331d = finderTimelinePresenter;
        }

        public Object invoke() {
            return (FinderWhatsNewView) this.f13331d.f13266g.findViewById(C0966R.C0970id.e8u);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$m */
    public static final class C2587m implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13332d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f13333e;

        public C2587m(FinderTimelinePresenter finderTimelinePresenter, BaseFinderFeed baseFinderFeed) {
            this.f13332d = finderTimelinePresenter;
            this.f13333e = baseFinderFeed;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            FinderTimelinePresenter finderTimelinePresenter = this.f13332d;
            BaseFinderFeed baseFinderFeed = this.f13333e;
            finderTimelinePresenter.getClass();
            C58969q l = baseFinderFeed.mo3507l();
            if (!C112551y.m153810j(l != null ? l.field_username : null, C66785b.f191882e.mo90662O5(), false, 2, (Object) null)) {
                e0Var.mo107150j(99, this.f13332d.f13266g.getString(C0966R.string.gvx), C0966R.raw.finder_feed_dislike_new, this.f13332d.f13266g.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_8), false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$n */
    public static final class C2588n implements C47269o0 {

        /* renamed from: a */
        public final /* synthetic */ FinderTimelinePresenter f13334a;

        /* renamed from: b */
        public final /* synthetic */ BaseFinderFeed f13335b;

        /* renamed from: c */
        public final /* synthetic */ C77407n f13336c;

        /* renamed from: d */
        public final /* synthetic */ C60905o f13337d;

        /* renamed from: e */
        public final /* synthetic */ int f13338e;

        public C2588n(FinderTimelinePresenter finderTimelinePresenter, BaseFinderFeed baseFinderFeed, C77407n nVar, C60905o oVar, int i) {
            this.f13334a = finderTimelinePresenter;
            this.f13335b = baseFinderFeed;
            this.f13336c = nVar;
            this.f13337d = oVar;
            this.f13338e = i;
        }

        /* renamed from: a */
        public final void mo2584a(MenuItem menuItem, int i) {
            C7888v2.C7889a aVar = C7888v2.f26513a;
            C15133e0 e0Var = this.f13334a.f13275r;
            BaseFinderFeed baseFinderFeed = this.f13335b;
            C87412m.m108592e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
            C77407n nVar = this.f13336c;
            Context context = this.f13337d.f173499A;
            C87412m.m108593f(context, "holder.context");
            boolean j = aVar.mo9012j(e0Var, baseFinderFeed, (C76875f0) menuItem, nVar, context);
            String str = this.f13334a.f13249I;
            Log.m105924i(str, "getMoreMenuItemLongSelectedListener :" + j + ' ' + this.f13338e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o */
    public static final class C2589o implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13339d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f13340e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f13341f;

        /* renamed from: g */
        public final /* synthetic */ C60905o f13342g;

        /* renamed from: h */
        public final /* synthetic */ int f13343h;

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$a */
        public static final class C2590a extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderFullSeekBarLayout f13344d;

            /* renamed from: e */
            public final /* synthetic */ FinderTimelinePresenter f13345e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2590a(FinderFullSeekBarLayout finderFullSeekBarLayout, FinderTimelinePresenter finderTimelinePresenter) {
                super(1);
                this.f13344d = finderFullSeekBarLayout;
                this.f13345e = finderTimelinePresenter;
            }

            public Object invoke(Object obj) {
                ((Boolean) obj).booleanValue();
                this.f13344d.mo4259i(this.f13345e.f13249I);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$b */
        public static final class C2591b extends C87413o implements C32226l<String, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ BaseFinderFeed f13346d;

            /* renamed from: e */
            public final /* synthetic */ FinderTimelinePresenter f13347e;

            /* renamed from: f */
            public final /* synthetic */ MenuItem f13348f;

            /* renamed from: g */
            public final /* synthetic */ int f13349g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2591b(BaseFinderFeed baseFinderFeed, FinderTimelinePresenter finderTimelinePresenter, MenuItem menuItem, int i) {
                super(1);
                this.f13346d = baseFinderFeed;
                this.f13347e = finderTimelinePresenter;
                this.f13348f = menuItem;
                this.f13349g = i;
            }

            public Object invoke(Object obj) {
                String str = (String) obj;
                Class cls = C64916p1.class;
                C87412m.m108594g(str, "userName");
                if (this.f13346d.mo3513o().isLiveFeed()) {
                    MMActivity mMActivity = this.f13347e.f13266g;
                    MenuItem menuItem = this.f13348f;
                    C87412m.m108593f(menuItem, "menuItem");
                    String str2 = str;
                    ((C64916p1) C86312j.m106911c(cls)).mo76724vV(mMActivity, str2, (C76875f0) menuItem, this.f13346d.mo3513o(), new C2632a0(this.f13346d));
                } else {
                    MMActivity mMActivity2 = this.f13347e.f13266g;
                    MenuItem menuItem2 = this.f13348f;
                    C87412m.m108593f(menuItem2, "menuItem");
                    String str3 = str;
                    ((C64916p1) C86312j.m106911c(cls)).mo76652BO(mMActivity2, str3, (C76875f0) menuItem2, this.f13346d.mo3513o(), (C32226l<? super List<String>, C13598b0>) null);
                }
                C7433e1.f25622a.mo8575d(this.f13347e.f13266g, str, this.f13346d.getItemId(), this.f13349g);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$c */
        public static final class C2592c extends C87413o implements C32226l<Integer, List<? extends Long>> {

            /* renamed from: d */
            public final /* synthetic */ FinderTimelinePresenter f13350d;

            /* renamed from: e */
            public final /* synthetic */ BaseFinderFeed f13351e;

            /* renamed from: f */
            public final /* synthetic */ List<BaseFinderFeed> f13352f;

            /* renamed from: g */
            public final /* synthetic */ int f13353g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2592c(FinderTimelinePresenter finderTimelinePresenter, BaseFinderFeed baseFinderFeed, List<BaseFinderFeed> list, int i) {
                super(1);
                this.f13350d = finderTimelinePresenter;
                this.f13351e = baseFinderFeed;
                this.f13352f = list;
                this.f13353g = i;
            }

            public Object invoke(Object obj) {
                int intValue = ((Number) obj).intValue();
                LinkedList linkedList = new LinkedList();
                LinkedList<C13604l> linkedList2 = new LinkedList<>();
                List<BaseFinderFeed> list = this.f13352f;
                BaseFinderFeed baseFinderFeed = this.f13351e;
                synchronized (list) {
                    int i = 0;
                    for (T next : list) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            BaseFinderFeed baseFinderFeed2 = (BaseFinderFeed) next;
                            if ((baseFinderFeed2 instanceof BaseFinderFeed) && baseFinderFeed2.mo3513o().getId() == baseFinderFeed.mo3513o().getId()) {
                                linkedList2.add(0, new C13604l(Integer.valueOf(i), baseFinderFeed2));
                            }
                            i = i2;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                }
                FinderTimelinePresenter finderTimelinePresenter = this.f13350d;
                int i3 = this.f13353g;
                for (C13604l lVar : linkedList2) {
                    String str = finderTimelinePresenter.f13249I;
                    Log.m105924i(str, "[not interested] removeAt " + i3 + " subType=" + intValue + ' ' + ((BaseFinderFeed) lVar.f38556e).mo3513o());
                    finderTimelinePresenter.f13285z.getDataListJustForAdapter().remove(lVar.f38556e);
                    linkedList.add(Long.valueOf(((BaseFinderFeed) lVar.f38556e).mo3513o().getCreateTime()));
                    ((C2559a) finderTimelinePresenter.f13243C).onItemRangeRemoved(((Number) lVar.f38555d).intValue(), 1);
                }
                String str2 = this.f13350d.f13249I;
                Log.m105924i(str2, "[not interested] feed " + this.f13351e);
                FinderTimelinePresenter finderTimelinePresenter2 = this.f13350d;
                finderTimelinePresenter2.getClass();
                C61926c.m72668M(new C9731fb((RefreshLoadMoreLayout.C7080c<Object>) null, finderTimelinePresenter2));
                return linkedList;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$d */
        public static final class C2593d implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ BaseFinderFeed f13354d;

            /* renamed from: e */
            public final /* synthetic */ FinderTimelinePresenter f13355e;

            /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$d$a */
            public static final class C2594a implements DialogInterface.OnCancelListener {

                /* renamed from: d */
                public static final C2594a f13356d = new C2594a();

                public final void onCancel(DialogInterface dialogInterface) {
                }
            }

            /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$d$b */
            public static final class C2595b implements C11385n {

                /* renamed from: d */
                public final /* synthetic */ C46530q2 f13357d;

                /* renamed from: e */
                public final /* synthetic */ FinderTimelinePresenter f13358e;

                public C2595b(C46530q2 q2Var, FinderTimelinePresenter finderTimelinePresenter) {
                    this.f13357d = q2Var;
                    this.f13358e = finderTimelinePresenter;
                }

                public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                    if ((yVar instanceof C46530q2) && ((C46530q2) yVar).f125356i == this.f13357d.f125356i) {
                        C89137b0 d = C86709a0.m107524d();
                        this.f13357d.getClass();
                        d.mo123470p(3627, this);
                    }
                    Dialog dialog = this.f13358e.f13262W;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    if (i != 0 || i2 != 0) {
                        C76912y0.makeText((Context) this.f13358e.f13266g, (int) C0966R.string.ejw, 0).show();
                    }
                }
            }

            public C2593d(BaseFinderFeed baseFinderFeed, FinderTimelinePresenter finderTimelinePresenter) {
                this.f13354d = baseFinderFeed;
                this.f13355e = finderTimelinePresenter;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C13598b0 b0Var;
                C46530q2 q2Var = new C46530q2(C66785b.f191882e.mo90662O5(), this.f13354d.mo3513o().getFeedObject());
                Dialog dialog = this.f13355e.f13262W;
                if (dialog != null) {
                    dialog.show();
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    FinderTimelinePresenter finderTimelinePresenter = this.f13355e;
                    MMActivity mMActivity = finderTimelinePresenter.f13266g;
                    finderTimelinePresenter.f13262W = C76879j.m92723Q(mMActivity, mMActivity.getString(C0966R.string.a3h), finderTimelinePresenter.f13266g.getString(C0966R.string.a4d), true, false, C2594a.f13356d);
                }
                C86709a0.m107524d().mo123455a(3627, new C2595b(q2Var, this.f13355e));
                C86709a0.m107524d().mo123460f(q2Var);
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$e */
        public static final class C2596e extends C87413o implements C32226l<List<? extends String>, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ BaseFinderFeed f13359d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2596e(BaseFinderFeed baseFinderFeed) {
                super(1);
                this.f13359d = baseFinderFeed;
            }

            public Object invoke(Object obj) {
                List<String> list = (List) obj;
                if (this.f13359d.mo3513o().isLiveFeed()) {
                    String str = "";
                    JSONObject jSONObject = new JSONObject();
                    if (list != null) {
                        for (String str2 : list) {
                            str = str + str2 + ';';
                        }
                    }
                    Long l = null;
                    if (C112551y.m153808h(str, ";", false, 2, (Object) null)) {
                        str = str.substring(0, str.length() - 1);
                        C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    jSONObject.put("share_username", str);
                    C11091a aVar = C11091a.f32868a;
                    C64273c21 liveInfo = this.f13359d.mo3513o().getLiveInfo();
                    if (liveInfo != null) {
                        l = Long.valueOf(liveInfo.f182392d);
                    }
                    aVar.mo11230a(String.valueOf(l), String.valueOf(this.f13359d.mo3513o().getFeedObject().f164794id), this.f13359d.mo3513o().getFeedObject().username, "1", "1", "0", jSONObject, this.f13359d.mo3526z());
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$f */
        public static final class C2597f implements C8794p5<C51954xc1> {

            /* renamed from: d */
            public final /* synthetic */ FinderTimelinePresenter f13360d;

            public C2597f(FinderTimelinePresenter finderTimelinePresenter) {
                this.f13360d = finderTimelinePresenter;
            }

            /* renamed from: c5 */
            public void mo705c5(Object obj, C50542nh0 nh02) {
                C87412m.m108594g((C51954xc1) obj, "req");
                C87412m.m108594g(nh02, "ret");
                if (nh02.f138603e == 0) {
                    C76912y0.makeText((Context) this.f13360d.f13266g, (int) C0966R.string.d9x, 0).show();
                    return;
                }
                C76912y0.makeText((Context) this.f13360d.f13266g, (int) C0966R.string.d9w, 0).show();
                String str = this.f13360d.f13249I;
                Log.m105924i(str, "finder_feed_open_comment_no_ok " + nh02.f138603e);
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$g */
        public static final class C2598g implements C8794p5<C51954xc1> {

            /* renamed from: d */
            public final /* synthetic */ FinderTimelinePresenter f13361d;

            public C2598g(FinderTimelinePresenter finderTimelinePresenter) {
                this.f13361d = finderTimelinePresenter;
            }

            /* renamed from: c5 */
            public void mo705c5(Object obj, C50542nh0 nh02) {
                C87412m.m108594g((C51954xc1) obj, "req");
                C87412m.m108594g(nh02, "ret");
                if (nh02.f138603e == 0) {
                    C76912y0.makeText((Context) this.f13361d.f13266g, (int) C0966R.string.d8t, 0).show();
                    return;
                }
                C76912y0.makeText((Context) this.f13361d.f13266g, (int) C0966R.string.d8s, 0).show();
                String str = this.f13361d.f13249I;
                Log.m105924i(str, "finder_feed_close_comment_ok " + nh02.f138603e);
            }
        }

        public C2589o(FinderTimelinePresenter finderTimelinePresenter, BaseFinderFeed baseFinderFeed, C32224a<C13598b0> aVar, C60905o oVar, int i) {
            this.f13339d = finderTimelinePresenter;
            this.f13340e = baseFinderFeed;
            this.f13341f = aVar;
            this.f13342g = oVar;
            this.f13343h = i;
        }

        /* JADX WARNING: type inference failed for: r13v14, types: [java.lang.Long] */
        /* JADX WARNING: type inference failed for: r13v19, types: [java.lang.Integer] */
        /* JADX WARNING: type inference failed for: r13v20, types: [java.lang.String] */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMMMenuItemSelected(android.view.MenuItem r29, int r30) {
            /*
                r28 = this;
                r0 = r28
                r1 = r29
                r2 = r30
                java.lang.Class<rs1.v3> r3 = rs1.C13484v3.class
                java.lang.Class<dp1.y0> r4 = dp1.C58417y0.class
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r5 = r0.f13339d
                java.lang.String r5 = r5.f13249I
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "[getMoreMenuItemSelectedListener] feed "
                r6.append(r7)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = r0.f13340e
                r6.append(r7)
                r7 = 32
                r6.append(r7)
                r6.append(r2)
                java.lang.String r7 = " menuItem:"
                r6.append(r7)
                int r7 = r29.getItemId()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
                fy3.a<rx3.b0> r5 = r0.f13341f
                if (r5 == 0) goto L_0x0041
                r5.invoke()
                rx3.b0 r5 = rx3.C13598b0.f38549a
            L_0x0041:
                int r5 = r29.getItemId()
                r6 = 99
                r7 = 3
                java.lang.String r8 = "feedid"
                java.lang.String r9 = "from_action"
                r10 = 0
                java.lang.String r11 = "context"
                r12 = 2
                r13 = 0
                r14 = 1
                if (r5 == r6) goto L_0x0771
                r2 = 116(0x74, float:1.63E-43)
                if (r5 == r2) goto L_0x06d9
                r2 = 301(0x12d, float:4.22E-43)
                if (r5 == r2) goto L_0x06b2
                r2 = 302(0x12e, float:4.23E-43)
                if (r5 == r2) goto L_0x06b2
                switch(r5) {
                    case 101: goto L_0x0625;
                    case 102: goto L_0x05d0;
                    case 103: goto L_0x0524;
                    case 104: goto L_0x04f7;
                    default: goto L_0x0063;
                }
            L_0x0063:
                switch(r5) {
                    case 106: goto L_0x04e3;
                    case 107: goto L_0x04cf;
                    case 108: goto L_0x04ae;
                    case 109: goto L_0x0413;
                    default: goto L_0x0066;
                }
            L_0x0066:
                switch(r5) {
                    case 112: goto L_0x03ca;
                    case 113: goto L_0x0328;
                    case 114: goto L_0x02b3;
                    default: goto L_0x0069;
                }
            L_0x0069:
                java.lang.String r2 = "feed"
                switch(r5) {
                    case 118: goto L_0x0220;
                    case 119: goto L_0x0211;
                    case 120: goto L_0x01e8;
                    default: goto L_0x006e;
                }
            L_0x006e:
                switch(r5) {
                    case 200: goto L_0x01cb;
                    case 201: goto L_0x01bc;
                    case 202: goto L_0x01ab;
                    default: goto L_0x0071;
                }
            L_0x0071:
                switch(r5) {
                    case 207: goto L_0x019a;
                    case 208: goto L_0x0187;
                    case 209: goto L_0x0154;
                    case 210: goto L_0x0143;
                    default: goto L_0x0074;
                }
            L_0x0074:
                switch(r5) {
                    case 305: goto L_0x012b;
                    case 306: goto L_0x0113;
                    case 307: goto L_0x008e;
                    default: goto L_0x0077;
                }
            L_0x0077:
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13339d
                wc3.e0 r3 = r2.f13275r
                r4 = r1
                nj3.f0 r4 = (nj3.C76875f0) r4
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$b r5 = new com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$b
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = r0.f13340e
                int r7 = r0.f13343h
                r5.<init>(r6, r2, r1, r7)
                r3.xc0(r4, r5)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x008e:
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r1 = r1.f13267h
                if (r1 == 0) goto L_0x00a8
                bl3.r r2 = bl3.C39818r.f106831a
                bl3.r$a r1 = r2.mo62445d(r1)
                bl3.t r1 = r1.mo62449e(r3)
                rs1.v3 r1 = (rs1.C13484v3) r1
                if (r1 != 0) goto L_0x00a3
                goto L_0x00a5
            L_0x00a3:
                r1.f38211i = r14
            L_0x00a5:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x00a9
            L_0x00a8:
                r1 = r13
            L_0x00a9:
                if (r1 != 0) goto L_0x00c2
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                bl3.r r2 = bl3.C39818r.f106831a
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                bl3.r$a r1 = r2.mo62444c(r1)
                bl3.t r1 = r1.mo62449e(r3)
                rs1.v3 r1 = (rs1.C13484v3) r1
                if (r1 != 0) goto L_0x00be
                goto L_0x00c0
            L_0x00be:
                r1.f38211i = r14
            L_0x00c0:
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x00c2:
                bl3.r r1 = bl3.C39818r.f106831a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13339d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                bl3.r$a r1 = r1.mo62444c(r2)
                java.lang.Class<rs1.v> r2 = rs1.C63648v.class
                androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
                rs1.v r1 = (rs1.C63648v) r1
                jq3.o r2 = r0.f13342g
                r1.mo88474e3(r2, r10)
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13340e
                long r2 = r2.getItemId()
                int r4 = r0.f13343h
                gy3.C87412m.m108594g(r1, r11)
                dp1.f2 r5 = dp1.C7435f2.f25626a
                rs1.s8$a r6 = rs1.C13442s8.f38060Q0
                rs1.s8 r1 = r6.mo12873f(r1)
                if (r1 == 0) goto L_0x00f6
                te3.hj1 r13 = r1.mo12861q3()
            L_0x00f6:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                if (r4 != r14) goto L_0x00fe
                r12 = 1
            L_0x00fe:
                r1.put(r9, r12)
                java.lang.String r2 = o40.C61926c.m72691p(r2)
                r1.put(r8, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "button_minimize"
                r5.mo8577a(r13, r2, r14, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x0113:
                er1.i1 r2 = er1.C58736i1.f168173a
                jq3.o r3 = r0.f13342g
                r4 = 0
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r0.f13340e
                int r6 = r0.f13343h
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r1 = r1.f13285z
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r7 = r1.getDataListJustForAdapter()
                r2.mo83666l(r3, r4, r5, r6, r7)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x012b:
                er1.i1 r2 = er1.C58736i1.f168173a
                jq3.o r3 = r0.f13342g
                r4 = 1
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r0.f13340e
                int r6 = r0.f13343h
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r1 = r1.f13285z
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r7 = r1.getDataListJustForAdapter()
                r2.mo83666l(r3, r4, r5, r6, r7)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x0143:
                er1.i1 r1 = er1.C58736i1.f168173a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13339d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13340e
                jq3.o r4 = r0.f13342g
                r1.mo83672r(r2, r3, r4)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x0154:
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.ui.MMActivity r4 = r1.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13340e
                gy3.C87412m.m108594g(r4, r11)
                gy3.C87412m.m108594g(r1, r2)
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                te3.kf1 r1 = r1.object_extend
                if (r1 == 0) goto L_0x0183
                te3.ui0 r1 = r1.f136756r
                if (r1 == 0) goto L_0x0183
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r1.f142864d
                if (r1 == 0) goto L_0x0183
                pf1.q r5 = new pf1.q
                r5.<init>(r1)
                pf1.d0 r3 = pf1.C62262d0.f176978a
                r6 = 0
                r7 = 0
                r8 = 12
                r9 = 0
                pf1.C62262d0.m73168c(r3, r4, r5, r6, r7, r8, r9)
            L_0x0183:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x0187:
                er1.v2$a r1 = er1.C7888v2.f26513a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13339d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                r1.mo9024z(r2, r3)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x019a:
                er1.i1 r1 = er1.C58736i1.f168173a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13339d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13340e
                int r4 = r0.f13343h
                r1.mo83670p(r2, r3, r4)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x01ab:
                pf1.d0 r1 = pf1.C62262d0.f176978a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13339d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13340e
                int r4 = r0.f13343h
                r1.mo87324p(r2, r3, r4)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x01bc:
                er1.i1 r1 = er1.C58736i1.f168173a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13339d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13340e
                r1.mo83671q(r2, r3)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x01cb:
                er1.p2 r1 = er1.C7853p2.f26439a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13340e
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r3 = r0.f13339d
                com.tencent.mm.ui.MMActivity r3 = r3.f13266g
                wp1.j r4 = wp1.C15587j.f42215a
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
                java.lang.String r5 = r5.getFromAppId()
                te3.wf3 r4 = r4.mo14352d(r5)
                r1.mo8961d(r2, r3, r4)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x01e8:
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13340e
                java.lang.String r4 = "activity"
                gy3.C87412m.m108594g(r1, r4)
                gy3.C87412m.m108594g(r3, r2)
                java.lang.Class<hy.o0> r2 = p166hy.C98567o0.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                hy.o0 r2 = (p166hy.C98567o0) r2
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                byte[] r3 = r3.toByteArray()
                r2.Wk0(r1, r12, r3, r10)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x0211:
                er1.i1 r1 = er1.C58736i1.f168173a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13339d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13340e
                r1.mo83668n(r2, r3)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x0220:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x0231
                te3.ap1 r1 = r1.video_tmpl_info
                goto L_0x0232
            L_0x0231:
                r1 = r13
            L_0x0232:
                if (r1 != 0) goto L_0x0243
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                r2 = 2131826793(0x7f111869, float:1.928648E38)
                java.lang.String r2 = r1.getString(r2)
                nj3.C76912y0.m92767f(r1, r2)
                goto L_0x026c
            L_0x0243:
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                int r3 = r1.f182116e
                if (r3 == r14) goto L_0x0253
                if (r3 == r12) goto L_0x0250
                r3 = -1
                goto L_0x0255
            L_0x0250:
                r3 = 16
                goto L_0x0255
            L_0x0253:
                r3 = 13
            L_0x0255:
                java.lang.Class<da0.e> r4 = da0.C58247e.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                da0.e r4 = (da0.C58247e) r4
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r5 = r0.f13339d
                com.tencent.mm.ui.MMActivity r5 = r5.f13266g
                r6 = 5
                java.lang.String r7 = "key_maas_entrance"
                r2.putExtra(r7, r6)
                rx3.b0 r6 = rx3.C13598b0.f38549a
                r4.qi0(r5, r1, r2, r3)
            L_0x026c:
                bl3.r r1 = bl3.C39818r.f106831a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13339d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                bl3.r$a r1 = r1.mo62444c(r2)
                java.lang.Class<rs1.s8> r2 = rs1.C13442s8.class
                androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
                rs1.s8 r1 = (rs1.C13442s8) r1
                te3.hj1 r1 = r1.mo12861q3()
                dp1.f2 r2 = dp1.C7435f2.f25626a
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
                if (r4 == 0) goto L_0x029d
                te3.ap1 r4 = r4.video_tmpl_info
                if (r4 == 0) goto L_0x029d
                java.lang.String r13 = r4.f182115d
            L_0x029d:
                if (r13 != 0) goto L_0x02a3
                java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            L_0x02a3:
                java.lang.String r4 = "templateId"
                r3.put(r4, r13)
                rx3.b0 r4 = rx3.C13598b0.f38549a
                java.lang.String r4 = "shoot_same_video"
                r2.mo8580d(r1, r4, r14, r3)
                goto L_0x0909
            L_0x02b3:
                jq3.o r1 = r0.f13342g
                r2 = 2131305309(0x7f09235d, float:1.8228785E38)
                android.view.View r1 = r1.mo85812D(r2)
                com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r1 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r1
                java.lang.String r2 = "fullVideoSeekBar"
                gy3.C87412m.m108593f(r1, r2)
                gr1.C59667n2.C8415a.m8377a(r1, r13, r10, r7, r13)
                er1.n2 r15 = er1.C7842n2.f26407a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13339d
                com.tencent.mm.ui.MMActivity r3 = r2.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13340e
                r18 = 2
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                jq3.o r5 = r0.f13342g
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$a r6 = new com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$a
                r6.<init>(r1, r2)
                r26 = 120(0x78, float:1.68E-43)
                r27 = 0
                r16 = r3
                r17 = r4
                r24 = r5
                r25 = r6
                er1.C7842n2.m7986b(r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27)
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13340e
                long r2 = r2.getItemId()
                int r4 = r0.f13343h
                gy3.C87412m.m108594g(r1, r11)
                dp1.f2 r5 = dp1.C7435f2.f25626a
                rs1.s8$a r6 = rs1.C13442s8.f38060Q0
                rs1.s8 r1 = r6.mo12873f(r1)
                if (r1 == 0) goto L_0x030b
                te3.hj1 r13 = r1.mo12861q3()
            L_0x030b:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                if (r4 != r14) goto L_0x0313
                r12 = 1
            L_0x0313:
                r1.put(r9, r12)
                java.lang.String r2 = o40.C61926c.m72691p(r2)
                r1.put(r8, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "button_set_bell"
                r5.mo8577a(r13, r2, r14, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x0328:
                er1.v2$a r15 = er1.C7888v2.f26513a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13340e
                r18 = 0
                r19 = 0
                r20 = 12
                r21 = 0
                r16 = r1
                r17 = r2
                er1.C7888v2.C7889a.m8058y(r15, r16, r17, r18, r19, r20, r21)
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13340e
                long r2 = r2.getItemId()
                int r4 = r0.f13343h
                gy3.C87412m.m108594g(r1, r11)
                dp1.f2 r5 = dp1.C7435f2.f25626a
                rs1.s8$a r6 = rs1.C13442s8.f38060Q0
                rs1.s8 r1 = r6.mo12873f(r1)
                if (r1 == 0) goto L_0x035d
                te3.hj1 r1 = r1.mo12861q3()
                goto L_0x035e
            L_0x035d:
                r1 = r13
            L_0x035e:
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>()
                if (r4 != r14) goto L_0x0366
                r12 = 1
            L_0x0366:
                r6.put(r9, r12)
                java.lang.String r2 = o40.C61926c.m72691p(r2)
                r6.put(r8, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "textstatus_in_menu"
                r5.mo8577a(r1, r2, r14, r6)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                boolean r1 = r1.isLiveFeed()
                if (r1 == 0) goto L_0x03c6
                ms3.a r2 = ms3.C11091a.f32868a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                te3.c21 r1 = r1.getLiveInfo()
                if (r1 == 0) goto L_0x0398
                long r3 = r1.f182392d
                java.lang.Long r13 = java.lang.Long.valueOf(r3)
            L_0x0398:
                java.lang.String r3 = java.lang.String.valueOf(r13)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                long r4 = r1.f164794id
                java.lang.String r4 = java.lang.String.valueOf(r4)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                java.lang.String r5 = r1.username
                r9 = 0
                r10 = 0
                r11 = 192(0xc0, float:2.69E-43)
                r12 = 0
                java.lang.String r6 = "1"
                java.lang.String r7 = "3"
                java.lang.String r8 = "0"
                ms3.C11091a.m10992b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            L_0x03c6:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x03ca:
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                java.lang.String r2 = "KEY_FROM_SCENE"
                r1.putExtra(r2, r14)
                zc1.b r2 = zc1.C66785b.f191882e
                java.lang.String r2 = r2.mo90662O5()
                java.lang.String r3 = "KEY_USERNAME"
                r1.putExtra(r3, r2)
                java.lang.String r2 = "KEY_FINDER_SELF_FLAG"
                r1.putExtra(r2, r14)
                java.lang.String r2 = "KEY_IS_FULLSCREEN"
                r1.putExtra(r2, r14)
                java.lang.String r2 = "KEY_ENABLE_SWITCH_PREVIEW_MODE"
                r1.putExtra(r2, r10)
                er1.w3 r2 = er1.C58784w3.f168295a
                r3 = 0
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13340e
                java.util.List r4 = sx3.C26236u.m33719b(r4)
                r5 = 0
                r7 = 0
                r8 = 16
                r9 = 0
                r6 = r1
                er1.C58784w3.m68427B1(r2, r3, r4, r5, r6, r7, r8, r9)
                java.lang.Class<er1.b> r2 = er1.C58684b.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                er1.b r2 = (er1.C58684b) r2
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r3 = r0.f13339d
                com.tencent.mm.ui.MMActivity r3 = r3.f13266g
                r2.py0(r3, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x0413:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                boolean r1 = r1.isPostFinish()
                if (r1 == 0) goto L_0x0474
                vp1.e r1 = vp1.C65834e.f189316a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
                vp1.e$b r3 = vp1.C65834e.C65836b.f189322b
                vp1.e$b r3 = vp1.C65834e.C65836b.f189323c
                r1.mo89878l(r2, r3)
                er1.q3 r1 = er1.C58771q3.f168268a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13339d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
                if (r3 == 0) goto L_0x0445
                te3.ve1 r3 = r3.feedBgmInfo
                goto L_0x0446
            L_0x0445:
                r3 = r13
            L_0x0446:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
                long r5 = r5.field_id
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r6 = r0.f13339d
                int r6 = r6.f13272p
                r1.mo83812c(r2, r3, r5, r6)
                di3.d r1 = di3.C86312j.m106911c(r4)
                dp1.y0 r1 = (dp1.C58417y0) r1
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13339d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.field_finderObject
                int r3 = r3.follow_feed_count
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1.wy0(r2, r14, r14, r3)
            L_0x0474:
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13340e
                long r2 = r2.getItemId()
                int r4 = r0.f13343h
                gy3.C87412m.m108594g(r1, r11)
                dp1.f2 r5 = dp1.C7435f2.f25626a
                rs1.s8$a r6 = rs1.C13442s8.f38060Q0
                rs1.s8 r1 = r6.mo12873f(r1)
                if (r1 == 0) goto L_0x0491
                te3.hj1 r13 = r1.mo12861q3()
            L_0x0491:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                if (r4 != r14) goto L_0x0499
                r12 = 1
            L_0x0499:
                r1.put(r9, r12)
                java.lang.String r2 = o40.C61926c.m72691p(r2)
                r1.put(r8, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "button_original_sound"
                r5.mo8577a(r13, r2, r14, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x04ae:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                boolean r1 = r1.isPostFinish()
                if (r1 == 0) goto L_0x04cb
                r1 = 2131829600(0x7f112360, float:1.9292174E38)
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13339d
                com.tencent.mm.ui.MMActivity r3 = r2.f13266g
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$d r4 = new com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r0.f13340e
                r4.<init>(r5, r2)
                nj3.C76879j.m92743n(r3, r1, r10, r4, r13)
            L_0x04cb:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x04cf:
                wp1.a r1 = wp1.C66164a.f190162a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13339d
                com.tencent.mm.ui.MMActivity r3 = r2.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13340e
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$f r5 = new com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$f
                r5.<init>(r2)
                r1.mo90220a(r3, r4, r14, r5)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x04e3:
                wp1.a r1 = wp1.C66164a.f190162a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13339d
                com.tencent.mm.ui.MMActivity r3 = r2.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13340e
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$g r5 = new com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$g
                r5.<init>(r2)
                r1.mo90220a(r3, r4, r10, r5)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x04f7:
                er1.l0 r1 = er1.C58745l0.f168212a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13340e
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r3 = r0.f13339d
                com.tencent.mm.ui.MMActivity r3 = r3.f13266g
                r1.mo83743a(r2, r3)
                di3.d r1 = di3.C86312j.m106911c(r4)
                java.lang.String r2 = "getService(FinderReportLogic::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                r3 = r1
                dp1.y0 r3 = (dp1.C58417y0) r3
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.ui.MMActivity r4 = r1.f13266g
                r5 = 1
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13340e
                long r6 = r1.getItemId()
                r8 = 0
                r9 = 8
                r10 = 0
                dp1.C58417y0.Qy0(r3, r4, r5, r6, r8, r9, r10)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x0524:
                er1.v2$a r15 = er1.C7888v2.f26513a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13340e
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 28
                r22 = 0
                r16 = r1
                r17 = r2
                er1.C7888v2.C7889a.m8057w(r15, r16, r17, r18, r19, r20, r21, r22)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                boolean r1 = r1.isLiveFeed()
                if (r1 == 0) goto L_0x0596
                ms3.a r15 = ms3.C11091a.f32868a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                te3.c21 r1 = r1.getLiveInfo()
                if (r1 == 0) goto L_0x055e
                long r1 = r1.f182392d
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                goto L_0x055f
            L_0x055e:
                r1 = r13
            L_0x055f:
                java.lang.String r16 = java.lang.String.valueOf(r1)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                long r1 = r1.f164794id
                java.lang.String r17 = java.lang.String.valueOf(r1)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                java.lang.String r1 = r1.username
                r22 = 0
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13340e
                java.lang.String r23 = r2.mo3526z()
                r24 = 64
                r25 = 0
                java.lang.String r19 = "1"
                java.lang.String r20 = "2"
                java.lang.String r21 = "0"
                r18 = r1
                ms3.C11091a.m10992b(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            L_0x0596:
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13340e
                long r2 = r2.getItemId()
                int r4 = r0.f13343h
                gy3.C87412m.m108594g(r1, r11)
                dp1.f2 r5 = dp1.C7435f2.f25626a
                rs1.s8$a r6 = rs1.C13442s8.f38060Q0
                rs1.s8 r1 = r6.mo12873f(r1)
                if (r1 == 0) goto L_0x05b3
                te3.hj1 r13 = r1.mo12861q3()
            L_0x05b3:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                if (r4 != r14) goto L_0x05bb
                r12 = 1
            L_0x05bb:
                r1.put(r9, r12)
                java.lang.String r2 = o40.C61926c.m72691p(r2)
                r1.put(r8, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "button_forward_friendcircle"
                r5.mo8577a(r13, r2, r14, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x05d0:
                android.os.Bundle r5 = new android.os.Bundle
                r5.<init>()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13340e
                r1.getClass()
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r10 = r0.f13340e
                int r15 = r0.f13343h
                er1.v2$a r2 = er1.C7888v2.f26513a
                com.tencent.mm.ui.MMActivity r3 = r1.f13266g
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r10.mo3513o()
                r6 = 3
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$e r7 = new com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$e
                r7.<init>(r10)
                r2.mo9020s(r3, r4, r5, r6, r7)
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                long r2 = r10.getItemId()
                gy3.C87412m.m108594g(r1, r11)
                dp1.f2 r4 = dp1.C7435f2.f25626a
                rs1.s8$a r5 = rs1.C13442s8.f38060Q0
                rs1.s8 r1 = r5.mo12873f(r1)
                if (r1 == 0) goto L_0x0608
                te3.hj1 r13 = r1.mo12861q3()
            L_0x0608:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                if (r15 != r14) goto L_0x0610
                r12 = 1
            L_0x0610:
                r1.put(r9, r12)
                java.lang.String r2 = o40.C61926c.m72691p(r2)
                r1.put(r8, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "button_forward_friend"
                r4.mo8577a(r13, r2, r14, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x0625:
                er1.j4 r1 = er1.C58739j4.f168176a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13340e
                boolean r1 = r1.mo83686O(r2)
                if (r1 == 0) goto L_0x0661
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                te3.c21 r1 = r1.getLiveInfo()
                if (r1 == 0) goto L_0x0678
                long r1 = r1.f182392d
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r3 = r0.f13339d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13340e
                sf1.a r15 = sf1.C13671a.f38718a
                com.tencent.mm.ui.MMActivity r3 = r3.f13266g
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r4.mo3513o()
                java.lang.String r19 = r5.getUserName()
                r20 = 0
                r21 = 0
                r23 = 24
                r24 = 0
                r16 = r3
                r17 = r1
                r22 = r4
                sf1.C13671a.m12976c(r15, r16, r17, r19, r20, r21, r22, r23, r24)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0678
            L_0x0661:
                sf1.a r15 = sf1.C13671a.f38718a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13340e
                r18 = 0
                r20 = 0
                r21 = 12
                r22 = 0
                r16 = r1
                r17 = r2
                sf1.C13671a.m12975b(r15, r16, r17, r18, r20, r21, r22)
            L_0x0678:
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13340e
                long r2 = r2.getItemId()
                int r4 = r0.f13343h
                gy3.C87412m.m108594g(r1, r11)
                dp1.f2 r5 = dp1.C7435f2.f25626a
                rs1.s8$a r6 = rs1.C13442s8.f38060Q0
                rs1.s8 r1 = r6.mo12873f(r1)
                if (r1 == 0) goto L_0x0695
                te3.hj1 r13 = r1.mo12861q3()
            L_0x0695:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                if (r4 != r14) goto L_0x069d
                r12 = 1
            L_0x069d:
                r1.put(r9, r12)
                java.lang.String r2 = o40.C61926c.m72691p(r2)
                r1.put(r8, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "button_complaint"
                r5.mo8577a(r13, r2, r14, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x06b2:
                bl3.r r1 = bl3.C39818r.f106831a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13339d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                bl3.r$a r1 = r1.mo62444c(r2)
                java.lang.Class<rs1.a1> r2 = rs1.C63513a1.class
                androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
                java.lang.String r2 = "UICProvider.of(getActivi…derBulletUIC::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                r3 = r1
                rs1.a1 r3 = (rs1.C63513a1) r3
                jq3.o r4 = r0.f13342g
                r5 = 0
                r6 = 1
                r7 = 0
                r8 = 8
                r9 = 0
                rs1.C63513a1.m74853e3(r3, r4, r5, r6, r7, r8, r9)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x06d9:
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                kf1.n9 r2 = r1.f13269j
                if (r2 == 0) goto L_0x0737
                jq3.o r2 = r0.f13342g
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r4 = 2131302830(0x7f0919ae, float:1.8223757E38)
                android.view.View r4 = r2.mo85812D(r4)
                if (r4 == 0) goto L_0x06f2
                r3.add(r4)
            L_0x06f2:
                r4 = 2131302685(0x7f09191d, float:1.8223463E38)
                android.view.View r2 = r2.mo85812D(r4)
                com.tencent.mm.plugin.finder.video.FinderVideoLayout r2 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r2
                if (r2 == 0) goto L_0x0702
                gr1.o2 r2 = r2.getVideoView()
                goto L_0x0703
            L_0x0702:
                r2 = r13
            L_0x0703:
                boolean r4 = r2 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
                if (r4 == 0) goto L_0x070c
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r2 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r2
                r17 = r2
                goto L_0x070e
            L_0x070c:
                r17 = r13
            L_0x070e:
                if (r17 == 0) goto L_0x0737
                bl3.r r2 = bl3.C39818r.f106831a
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                bl3.r$a r1 = r2.mo62444c(r1)
                java.lang.Class<rs1.da> r2 = rs1.C13194da.class
                androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
                java.lang.String r2 = "UICProvider.of(getActivi…edControlUIC::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                r15 = r1
                rs1.da r15 = (rs1.C13194da) r15
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 28
                r22 = 0
                r16 = r3
                rs1.C13194da.m12605k3(r15, r16, r17, r18, r19, r20, r21, r22)
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x0737:
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13340e
                long r2 = r2.getItemId()
                int r4 = r0.f13343h
                gy3.C87412m.m108594g(r1, r11)
                dp1.f2 r5 = dp1.C7435f2.f25626a
                rs1.s8$a r6 = rs1.C13442s8.f38060Q0
                rs1.s8 r1 = r6.mo12873f(r1)
                if (r1 == 0) goto L_0x0754
                te3.hj1 r13 = r1.mo12861q3()
            L_0x0754:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                if (r4 != r14) goto L_0x075c
                r12 = 1
            L_0x075c:
                r1.put(r9, r12)
                java.lang.String r2 = o40.C61926c.m72691p(r2)
                r1.put(r8, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "button_speedplay"
                r5.mo8577a(r13, r2, r14, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x0909
            L_0x0771:
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r1 = r1.f13285z
                java.lang.Class<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r3 = com.tencent.p014mm.plugin.finder.model.BaseFinderFeed.class
                java.util.List r1 = r1.getListOfType(r3)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13340e
                int r3 = r1.indexOf(r3)
                if (r3 < 0) goto L_0x08dd
                sf1.b r15 = sf1.C13672b.f38719a
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r3 = r0.f13339d
                com.tencent.mm.ui.MMActivity r3 = r3.f13266g
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
                long r17 = r4.getId()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
                java.lang.String r19 = r4.getObjectNonceId()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13340e
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
                boolean r4 = r4.isLiveFeed()
                java.lang.Boolean r20 = java.lang.Boolean.valueOf(r4)
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$c r4 = new com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$o$c
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r5 = r0.f13339d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = r0.f13340e
                r4.<init>(r5, r6, r1, r2)
                r16 = r3
                r21 = r4
                r15.mo13059a(r16, r17, r19, r20, r21)
                zc1.b r1 = zc1.C66785b.f191882e
                bd1.e r1 = r1.mo90673n0()
                te3.qq2 r1 = r1.mo62397b()
                te3.oi1 r1 = r1.f140461E
                if (r1 == 0) goto L_0x07cf
                int r1 = r1.f139196d
                if (r1 != r14) goto L_0x07cf
                r1 = 1
                goto L_0x07d0
            L_0x07cf:
                r1 = 0
            L_0x07d0:
                if (r1 == 0) goto L_0x07e2
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131829748(0x7f1123f4, float:1.9292474E38)
                java.lang.String r1 = r1.getString(r2)
                goto L_0x07f1
            L_0x07e2:
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131829747(0x7f1123f3, float:1.9292472E38)
                java.lang.String r1 = r1.getString(r2)
            L_0x07f1:
                java.lang.String r2 = "if (FinderAccountAccess.…                        }"
                gy3.C87412m.m108593f(r1, r2)
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13339d
                com.tencent.mm.ui.MMActivity r2 = r2.f13266g
                r3 = 2131756010(0x7f1003ea, float:1.9142915E38)
                nj3.C76912y0.m92769h(r2, r1, r3)
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13340e
                r1.getClass()
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r2.mo3513o()
                boolean r3 = r3.isLiveFeed()
                if (r3 != 0) goto L_0x0813
                goto L_0x0893
            L_0x0813:
                rs1.s8$a r3 = rs1.C13442s8.f38060Q0
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                rs1.s8 r1 = r3.mo12873f(r1)
                if (r1 == 0) goto L_0x0822
                te3.hj1 r1 = r1.mo12861q3()
                goto L_0x0823
            L_0x0822:
                r1 = r13
            L_0x0823:
                java.lang.Class<ht1.j5> r3 = ht1.C8777j5.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                r15 = r3
                ht1.j5 r15 = (ht1.C8777j5) r15
                ak1.f0$m r16 = ak1.C54067f0.C0064m.PANEL_UNLIKE_BUTTON
                rx3.l[] r3 = new rx3.C13604l[r7]
                rx3.l r4 = new rx3.l
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
                te3.c21 r5 = r5.getLiveInfo()
                if (r5 == 0) goto L_0x0843
                long r5 = r5.f182392d
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                goto L_0x0844
            L_0x0843:
                r5 = r13
            L_0x0844:
                java.lang.String r5 = java.lang.String.valueOf(r5)
                java.lang.String r6 = "liveId"
                r4.<init>(r6, r5)
                r3[r10] = r4
                rx3.l r4 = new rx3.l
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
                long r5 = r5.f164794id
                java.lang.String r5 = java.lang.String.valueOf(r5)
                java.lang.String r6 = "feedId"
                r4.<init>(r6, r5)
                r3[r14] = r4
                rx3.l r4 = new rx3.l
                java.lang.String r5 = "panel_sence"
                java.lang.String r6 = "1"
                r4.<init>(r5, r6)
                r3[r12] = r4
                java.util.Map r17 = sx3.C90364q0.m113148g(r3)
                if (r1 == 0) goto L_0x087c
                java.lang.String r3 = r1.f134671e
                r18 = r3
                goto L_0x087e
            L_0x087c:
                r18 = r13
            L_0x087e:
                if (r1 == 0) goto L_0x0887
                int r1 = r1.f134675i
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L_0x0888
            L_0x0887:
                r1 = r13
            L_0x0888:
                java.lang.String r19 = java.lang.String.valueOf(r1)
                java.lang.String r20 = r2.mo3526z()
                r15.mo9601JK(r16, r17, r18, r19, r20)
            L_0x0893:
                java.lang.Class<l31.e> r1 = l31.C61212e.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                l31.e r1 = (l31.C61212e) r1
                jq3.o r2 = r0.f13342g
                android.view.View r2 = r2.f44854d
                r3 = 24617(0x6029, float:3.4496E-41)
                java.lang.String r4 = "feed_uninterest_clk"
                r1.mo86153W7(r4, r2, r13, r3)
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = r0.f13339d
                com.tencent.mm.ui.MMActivity r1 = r1.f13266g
                java.lang.String r2 = "button_uninterested"
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13340e
                long r3 = r3.getItemId()
                int r5 = r0.f13343h
                gy3.C87412m.m108594g(r1, r11)
                dp1.f2 r6 = dp1.C7435f2.f25626a
                rs1.s8$a r7 = rs1.C13442s8.f38060Q0
                rs1.s8 r1 = r7.mo12873f(r1)
                if (r1 == 0) goto L_0x08c5
                te3.hj1 r13 = r1.mo12861q3()
            L_0x08c5:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                if (r5 != r14) goto L_0x08cd
                r12 = 1
            L_0x08cd:
                r1.put(r9, r12)
                java.lang.String r3 = o40.C61926c.m72691p(r3)
                r1.put(r8, r3)
                rx3.b0 r3 = rx3.C13598b0.f38549a
                r6.mo8577a(r13, r2, r14, r1)
                goto L_0x0907
            L_0x08dd:
                com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r0.f13339d
                java.lang.String r2 = r2.f13249I
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "[not interested] pos error="
                r4.append(r5)
                r4.append(r3)
                java.lang.String r3 = ", feed="
                r4.append(r3)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13340e
                r4.append(r3)
                java.lang.String r3 = ", dataList="
                r4.append(r3)
                r4.append(r1)
                java.lang.String r1 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            L_0x0907:
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x0909:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter.C2589o.onMMMenuItemSelected(android.view.MenuItem, int):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$p */
    public static final class C2599p implements C11183n0 {

        /* renamed from: a */
        public final /* synthetic */ FinderTimelinePresenter f13362a;

        /* renamed from: b */
        public final /* synthetic */ BaseFinderFeed f13363b;

        public C2599p(FinderTimelinePresenter finderTimelinePresenter, BaseFinderFeed baseFinderFeed) {
            this.f13362a = finderTimelinePresenter;
            this.f13363b = baseFinderFeed;
        }

        /* renamed from: a */
        public final void mo2585a(View view, int i, MenuItem menuItem) {
            C58736i1 i1Var = C58736i1.f168173a;
            MMActivity mMActivity = this.f13362a.f13266g;
            C87412m.m108593f(view, "menuView");
            C87412m.m108593f(menuItem, "menuItem");
            i1Var.mo83667m(mMActivity, view, i, menuItem, this.f13363b);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$q */
    public static final class C2600q implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13364d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f13365e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f13366f;

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$q$a */
        public static final class C2601a extends C87413o implements C32226l<Integer, List<? extends Long>> {

            /* renamed from: d */
            public final /* synthetic */ FinderTimelinePresenter f13367d;

            /* renamed from: e */
            public final /* synthetic */ BaseFinderFeed f13368e;

            /* renamed from: f */
            public final /* synthetic */ List<BaseFinderFeed> f13369f;

            /* renamed from: g */
            public final /* synthetic */ int f13370g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2601a(FinderTimelinePresenter finderTimelinePresenter, BaseFinderFeed baseFinderFeed, List<BaseFinderFeed> list, int i) {
                super(1);
                this.f13367d = finderTimelinePresenter;
                this.f13368e = baseFinderFeed;
                this.f13369f = list;
                this.f13370g = i;
            }

            public Object invoke(Object obj) {
                int intValue = ((Number) obj).intValue();
                LinkedList linkedList = new LinkedList();
                LinkedList<C13604l> linkedList2 = new LinkedList<>();
                List<BaseFinderFeed> list = this.f13369f;
                BaseFinderFeed baseFinderFeed = this.f13368e;
                synchronized (list) {
                    int i = 0;
                    for (T next : list) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            BaseFinderFeed baseFinderFeed2 = (BaseFinderFeed) next;
                            if ((baseFinderFeed2 instanceof BaseFinderFeed) && baseFinderFeed2.mo3513o().getId() == baseFinderFeed.mo3513o().getId()) {
                                linkedList2.add(0, new C13604l(Integer.valueOf(i), baseFinderFeed2));
                            }
                            i = i2;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                }
                FinderTimelinePresenter finderTimelinePresenter = this.f13367d;
                int i3 = this.f13370g;
                for (C13604l lVar : linkedList2) {
                    String str = finderTimelinePresenter.f13249I;
                    Log.m105924i(str, "[not interested] removeAt " + i3 + " subType=" + intValue + ' ' + ((BaseFinderFeed) lVar.f38556e).mo3513o());
                    finderTimelinePresenter.f13285z.getDataListJustForAdapter().remove(lVar.f38556e);
                    linkedList.add(Long.valueOf(((BaseFinderFeed) lVar.f38556e).mo3513o().getCreateTime()));
                    ((C2559a) finderTimelinePresenter.f13243C).onItemRangeRemoved(((Number) lVar.f38555d).intValue(), 1);
                }
                String str2 = this.f13367d.f13249I;
                Log.m105924i(str2, "[not interested] feed " + this.f13368e);
                FinderTimelinePresenter finderTimelinePresenter2 = this.f13367d;
                finderTimelinePresenter2.getClass();
                C61926c.m72668M(new C9731fb((RefreshLoadMoreLayout.C7080c<Object>) null, finderTimelinePresenter2));
                return linkedList;
            }
        }

        public C2600q(FinderTimelinePresenter finderTimelinePresenter, BaseFinderFeed baseFinderFeed, C60905o oVar) {
            this.f13364d = finderTimelinePresenter;
            this.f13365e = baseFinderFeed;
            this.f13366f = oVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 99) {
                List<E> listOfType = this.f13364d.f13285z.getListOfType(BaseFinderFeed.class);
                int indexOf = listOfType.indexOf(this.f13365e);
                if (indexOf >= 0) {
                    C13672b.f38719a.mo13059a(this.f13364d.f13266g, this.f13365e.mo3513o().getId(), this.f13365e.mo3513o().getObjectNonceId(), Boolean.valueOf(this.f13365e.mo3513o().isLiveFeed()), new C2601a(this.f13364d, this.f13365e, listOfType, i));
                    C50687oi1 oi12 = C66785b.f191882e.mo90673n0().mo62397b().f140461E;
                    boolean z = true;
                    if (oi12 == null || oi12.f139196d != 1) {
                        z = false;
                    }
                    String string = z ? this.f13364d.f13266g.getResources().getString(C0966R.string.f8158pz) : this.f13364d.f13266g.getResources().getString(C0966R.string.emj);
                    C87412m.m108593f(string, "if(FinderAccountAccess.a…on)\n                    }");
                    C76912y0.m92769h(this.f13364d.f13266g, string, C0966R.raw.icons_filled_done);
                    ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("feed_uninterest_clk", this.f13366f.f44854d, (Map<String, Object>) null, 24617);
                    return;
                }
                String str = this.f13364d.f13249I;
                Log.m105924i(str, "[not interested] pos error=" + indexOf + ", feed=" + this.f13365e + ", dataList=" + listOfType);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$r */
    public static final class C2602r extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13371d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2602r(FinderTimelinePresenter finderTimelinePresenter) {
            super(0);
            this.f13371d = finderTimelinePresenter;
        }

        public Object invoke() {
            long longExtra = this.f13371d.f13266g.getIntent().getLongExtra("KEY_GUIDE_BAR_OBJ_ID", -1);
            if (longExtra != -1) {
                return Long.valueOf(longExtra);
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$s */
    public static final class C2603s implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13372d;

        /* renamed from: e */
        public final /* synthetic */ boolean f13373e;

        /* renamed from: f */
        public final /* synthetic */ LinearLayoutManager f13374f;

        /* renamed from: g */
        public final /* synthetic */ long f13375g;

        public C2603s(FinderTimelinePresenter finderTimelinePresenter, boolean z, LinearLayoutManager linearLayoutManager, long j) {
            this.f13372d = finderTimelinePresenter;
            this.f13373e = z;
            this.f13374f = linearLayoutManager;
            this.f13375g = j;
        }

        public final void run() {
            C60905o oVar;
            RecyclerView recyclerView;
            C60898l<C60905o> I1 = this.f13372d.mo2599I1();
            if (I1 != null && (oVar = (C60905o) C60898l.m71330b6(I1, (long) this.f13372d.f13256Q.hashCode(), false, 2, (Object) null)) != null) {
                boolean z = this.f13373e;
                FinderTimelinePresenter finderTimelinePresenter = this.f13372d;
                LinearLayoutManager linearLayoutManager = this.f13374f;
                long j = this.f13375g;
                Rect rect = new Rect();
                if (oVar.f44854d.getGlobalVisibleRect(rect) && rect.height() > 0) {
                    if (z) {
                        C9878n9 n9Var = finderTimelinePresenter.f13269j;
                        if (!(n9Var == null || (recyclerView = n9Var.getRecyclerView()) == null)) {
                            recyclerView.smoothScrollBy(0, rect.height());
                        }
                    } else if (linearLayoutManager != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        aVar.mo10233c(1);
                        C9556a aVar2 = aVar;
                        C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$hideSearchBar$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        linearLayoutManager.mo16973V(((Integer) aVar2.mo10231a(0)).intValue(), ((Integer) aVar2.mo10231a(1)).intValue());
                        C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$hideSearchBar$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    }
                    String str = finderTimelinePresenter.f13249I;
                    Log.m105924i(str, "[hideSearchBar] to hide search bar. delay=" + j + " isSmooth=" + z + " height=" + rect.height());
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$t */
    public static final class C2604t extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13376d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2604t(FinderTimelinePresenter finderTimelinePresenter) {
            super(0);
            this.f13376d = finderTimelinePresenter;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f13376d.f13266g.getIntent().getIntExtra("FROM_SCENE_KEY", 2) == 6);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$u */
    public static final class C2605u extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13377d;

        /* renamed from: e */
        public final /* synthetic */ boolean f13378e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2605u(FinderTimelinePresenter finderTimelinePresenter, boolean z) {
            super(0);
            this.f13377d = finderTimelinePresenter;
            this.f13378e = z;
        }

        public Object invoke() {
            this.f13377d.f13285z.requestLoadMore(this.f13378e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$v */
    public static final class C2606v extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13379d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2606v(FinderTimelinePresenter finderTimelinePresenter) {
            super(0);
            this.f13379d = finderTimelinePresenter;
        }

        public Object invoke() {
            String stringExtra = this.f13379d.f13266g.getIntent().getStringExtra("KEY_OBJECT_NONCE_ID");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$w */
    public static final class C2607w extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13380d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2607w(FinderTimelinePresenter finderTimelinePresenter) {
            super(0);
            this.f13380d = finderTimelinePresenter;
        }

        public Object invoke() {
            return Long.valueOf(this.f13380d.f13266g.getIntent().getLongExtra("KEY_OBJECT_ID", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$x */
    public static final class C2608x implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13381d;

        public C2608x(FinderTimelinePresenter finderTimelinePresenter) {
            this.f13381d = finderTimelinePresenter;
        }

        public final void run() {
            C58556f j3;
            RecyclerView.C16615g gVar;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f13381d.f13266g);
            if (f != null && (j3 = f.mo12854j3(this.f13381d.f13272p)) != null && (gVar = j3.f167622p) != null) {
                gVar.mo2556b();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$y */
    public static final class C2609y implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13382d;

        public C2609y(FinderTimelinePresenter finderTimelinePresenter) {
            this.f13382d = finderTimelinePresenter;
        }

        public final void run() {
            C58556f j3;
            RecyclerView.C16615g gVar;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f13382d.f13266g);
            if (f != null && (j3 = f.mo12854j3(this.f13382d.f13272p)) != null && (gVar = j3.f167622p) != null) {
                gVar.mo2556b();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$z */
    public static final class C2610z implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RecyclerView f13383d;

        /* renamed from: e */
        public final /* synthetic */ int f13384e;

        public C2610z(RecyclerView recyclerView, int i) {
            this.f13383d = recyclerView;
            this.f13384e = i;
        }

        public final void run() {
            RecyclerView recyclerView = this.f13383d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(this.f13384e + 1));
            C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$onRefreshEnd$7$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter$onRefreshEnd$7$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }

    public FinderTimelinePresenter(MMActivity mMActivity, FinderHomeTabFragment finderHomeTabFragment, C89349b bVar) {
        boolean z;
        boolean z2;
        Bundle bundle;
        Bundle bundle2;
        MMActivity mMActivity2 = mMActivity;
        FinderHomeTabFragment finderHomeTabFragment2 = finderHomeTabFragment;
        C87412m.m108594g(mMActivity2, "context");
        this.f13266g = mMActivity2;
        this.f13267h = finderHomeTabFragment2;
        C39818r rVar = C39818r.f106831a;
        C39622i0 a = rVar.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
        C11739f fVar = (C11739f) a;
        this.f13270n = fVar;
        int i = finderHomeTabFragment2 != null ? finderHomeTabFragment2.f17334o : 0;
        this.f13272p = i;
        this.f13274q = fVar.mo11603f3(i) && !mMActivity.getIntent().getBooleanExtra("KEY_FORCE_NOT_REFRESH_FIRST_TIME", false);
        this.f13275r = ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0();
        C13601g a2 = C36568h.m40985a(new C2602r(this));
        C13601g a3 = C36568h.m40985a(new C2562b(this));
        C13601g a4 = C36568h.m40985a(new C2582j0(this));
        C13601g a5 = C36568h.m40985a(new C2564c(this));
        C13601g a6 = C36568h.m40985a(new C2578i0(this));
        this.f13279v = C36568h.m40985a(new C2607w(this));
        C13601g a7 = C36568h.m40985a(new C2606v(this));
        this.f13280w = a7;
        this.f13281x = C36568h.m40985a(new C2604t(this));
        this.f13283y = C36568h.m40985a(C2584k0.f13326d);
        C13601g a8 = C36568h.m40985a(new C2573g0(this));
        C13601g a9 = C36568h.m40985a(new C2569e0(this));
        C13908i a15 = C13908i.f39090e.mo13382a(i);
        boolean z3 = !this.f13274q;
        C49712hj1 i3 = ((C13442s8) rVar.mo62444c(mMActivity2).mo75002a(C13442s8.class)).mo12853i3(i);
        C9603s sVar = new C9603s();
        Integer num = (Integer) ((C36570n) a4).getValue();
        if (num != null && num.intValue() == i) {
            sVar.f29869b = bVar;
            sVar.f29868a = (Long) ((C36570n) a2).getValue();
            String str = (String) ((C36570n) a3).getValue();
            if (str != null) {
                str = !((str.length() == 0) ^ true) ? null : str;
                if (str != null) {
                    byte[] bytes = str.getBytes(C119027c.f356488a);
                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                    sVar.f29870c = new C89349b(bytes, 0, bytes.length);
                }
            }
            sVar.f29871d = (Integer) ((C36570n) a5).getValue();
            sVar.f29874g = ((Number) ((C36570n) a6).getValue()).intValue();
            sVar.f29872e = mo2602L1();
            String str2 = (String) ((C36570n) a7).getValue();
            C87412m.m108594g(str2, "<set-?>");
            sVar.f29873f = str2;
            if (mo2604N1() && i == 4) {
                sVar.f29876i = 1;
            }
            sVar.f29877j = ((Number) ((C36570n) a9).getValue()).intValue() == 15 ? 6 : ((Number) ((C36570n) a8).getValue()).intValue() < 0 ? 3 : ((Number) ((C36570n) a8).getValue()).intValue();
            String stringExtra = mMActivity.getIntent().getStringExtra("FLOAT_BALL_KEY");
            sVar.f29878k = !(stringExtra == null || stringExtra.length() == 0);
        }
        if (finderHomeTabFragment2 == null || (bundle2 = finderHomeTabFragment2.f17335p) == null) {
            z = false;
            z2 = false;
        } else {
            z = false;
            z2 = bundle2.getBoolean("IsFirstEnterTab", false);
        }
        sVar.f29875h = z2;
        if (!(finderHomeTabFragment2 == null || (bundle = finderHomeTabFragment2.f17335p) == null)) {
            z = bundle.getBoolean("showUnreadCacheFeed", z);
        }
        sVar.f29879l = z;
        C13598b0 b0Var = C13598b0.f38549a;
        FinderTimelineFeedLoader finderTimelineFeedLoader = new FinderTimelineFeedLoader(a15, z3 ? 1 : 0, i3, sVar, new C2572g(this));
        finderTimelineFeedLoader.setInitDone(new C2574h(this, finderTimelineFeedLoader));
        this.f13285z = finderTimelineFeedLoader;
        this.f13241A = ((C11744g) rVar.mo62444c(mMActivity2).mo75002a(C11744g.class)).f34390e;
        this.f13242B = new FinderVideoCore(i);
        this.f13245E = C36568h.m40985a(new C2570f(this));
        this.f13246F = C36568h.m40985a(new C2577i(this));
        C40008f fVar2 = C40008f.f107254d;
        this.f13247G = new FinderTimelinePresenter$commentChangeEventListener$1(this, fVar2);
        this.f13248H = new FinderTimelinePresenter$autoRefreshEventListener$1(this, fVar2);
        this.f13249I = "Finder.TimelinePresenter#" + i;
        this.f13243C = new C2559a(this);
        this.f13250J = C36568h.m40985a(new C2586l0(this));
        this.f13251K = true;
        this.f13252L = true;
        this.f13254N = new FinderTimelinePresenter$feedExposeInfoChangeListener$1(this);
        C0735h hVar = new C0735h();
        this.f13255P = hVar;
        C0709a2 a2Var = new C0709a2();
        this.f13256Q = new C0738i();
        new C0744k();
        this.f13257R = new C0731g((CharSequence) null, 0, 0, 7, (C8480h) null);
        this.f13258S = new C0726e();
        ConcurrentLinkedQueue<C55014f> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.f13259T = concurrentLinkedQueue;
        this.f13260U = new C0755n0(hVar, a2Var, concurrentLinkedQueue, (C0737h2) null, 8, (C8480h) null);
        this.f13284y0 = new FinderTimelinePresenter$feedProgressListener$1(this, fVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = r0.getFeedObject();
     */
    /* renamed from: E1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2529E1(com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter r10, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r11, nj3.C76874e0 r12, qo3.C77407n r13, jq3.C60905o r14) {
        /*
            er1.i1 r0 = er1.C58736i1.f168173a
            com.tencent.mm.ui.MMActivity r1 = r10.f13266g
            r0.mo83660f(r1, r12, r11)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r11.mo3513o()
            r1 = 0
            if (r0 == 0) goto L_0x001b
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            if (r0 == 0) goto L_0x001b
            er1.w3 r2 = er1.C58784w3.f168295a
            boolean r0 = r2.mo83857B(r0)
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r11.mo3513o()
            boolean r2 = r2.isLongVideo()
            if (r2 == 0) goto L_0x0064
            if (r0 != 0) goto L_0x0064
            r0 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r14 = r14.mo85812D(r0)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r14 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r14
            if (r14 == 0) goto L_0x0038
            gr1.o2 r14 = r14.getVideoView()
            goto L_0x0039
        L_0x0038:
            r14 = 0
        L_0x0039:
            boolean r14 = r14 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r14 == 0) goto L_0x0064
            kf1.n9 r14 = r10.f13269j
            if (r14 == 0) goto L_0x004e
            androidx.recyclerview.widget.RecyclerView r14 = r14.getRecyclerView()
            if (r14 == 0) goto L_0x004e
            rs1.da$a r0 = rs1.C13194da.f37515v
            java.lang.String r14 = r0.mo12692a(r14)
            goto L_0x005c
        L_0x004e:
            com.tencent.mm.ui.MMActivity r14 = r10.f13266g
            r0 = 2131832860(0x7f11301c, float:1.9298786E38)
            java.lang.String r14 = r14.getString(r0)
            java.lang.String r0 = "context.getString(R.stri…ga_video_play_speed_text)"
            gy3.C87412m.m108593f(r14, r0)
        L_0x005c:
            r0 = 116(0x74, float:1.63E-43)
            r2 = 2131756416(0x7f100580, float:1.9143739E38)
            r12.mo107144g(r0, r14, r2)
        L_0x0064:
            er1.w3 r14 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r11.mo3513o()
            boolean r0 = r14.mo83980y0(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.String r2 = r14.mo83909X(r11)
            r3 = 2131756232(0x7f1004c8, float:1.9143366E38)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r11.mo3513o()
            boolean r4 = r4.isPostFinish()
            if (r4 == 0) goto L_0x009b
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r11.mo3513o()
            boolean r4 = r4.isPostFailed()
            if (r4 != 0) goto L_0x009b
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r11.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            boolean r14 = r14.mo83979y(r4)
            if (r14 == 0) goto L_0x009c
        L_0x009b:
            r1 = 1
        L_0x009c:
            r12.mo107151k(r0, r2, r3, r1)
        L_0x009f:
            er1.p2 r4 = er1.C7853p2.f26439a
            com.tencent.mm.ui.MMActivity r5 = r10.f13266g
            r9 = 200(0xc8, float:2.8E-43)
            r6 = r11
            r7 = r12
            r8 = r13
            r4.mo8958a(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter.m2529E1(com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter, com.tencent.mm.plugin.finder.model.BaseFinderFeed, nj3.e0, qo3.n, jq3.o):void");
    }

    /* renamed from: A1 */
    public C11182m0 mo2569A1(BaseFinderFeed baseFinderFeed, C77407n nVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C2583k(baseFinderFeed, this, nVar);
    }

    /* renamed from: A7 */
    public void mo2594A7(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C9878n9 n9Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        C61926c.m72668M(new C9731fb(cVar, this));
        C9878n9 n9Var2 = this.f13269j;
        if (!(n9Var2 == null || (recyclerView2 = n9Var2.getRecyclerView()) == null)) {
            recyclerView2.post(new C2608x(this));
        }
        Iterator<C4119n> it = f13240R0.iterator();
        while (it.hasNext()) {
            it.next().mo5001a(this.f13272p, cVar.f24953h);
        }
        C20480e0.m22094n(C20480e0.f57583a, this.f13272p, false, (C49712hj1) null, false, 0, false, 60, (Object) null);
        String str = this.f13249I;
        Log.m105924i(str, "[onLoadMoreEnd] reason=" + cVar + " isAutoLoadingMore=" + this.f13263X);
        if (cVar.f24954i && cVar.f24951f && (n9Var = this.f13269j) != null && (recyclerView = n9Var.getRecyclerView()) != null) {
            mo2609S1(recyclerView);
        }
        C7453v vVar = C7453v.f25647a;
        MMActivity mMActivity = this.f13266g;
        int i = this.f13272p;
        int J1 = mo2600J1();
        boolean z = this.f13263X;
        int K1 = mo2601K1();
        C87412m.m108594g(mMActivity, "context");
        if (!vVar.mo8600a()) {
            Log.m105924i("Finder.HomeActionReporter", "[onLoadMoreEnd] tabType:" + i + " itemCount:" + J1 + " isAuto:" + z + " curPosition:" + K1);
            C7453v.f25651e = i;
            C7453v.C7455b c = vVar.mo8602c(i);
            c.f25657a = J1;
            c.f25659c = false;
            c.f25658b = K1;
            vVar.mo8607h(i, 8, z);
            vVar.mo8606g(mMActivity, i, new C13604l(8, 7), true);
        }
        mo2596F1(cVar, false);
        this.f13263X = false;
        TestPreloadPreviewNotifyEvent testPreloadPreviewNotifyEvent = new TestPreloadPreviewNotifyEvent();
        TestPreloadPreviewNotifyEvent.C1152a aVar = testPreloadPreviewNotifyEvent.f9563d;
        aVar.f9564a = this.f13272p;
        aVar.f9565b = 2;
        aVar.f9566c = cVar.f24953h;
        aVar.f9567d = System.currentTimeMillis() - this.f13264Y;
        testPreloadPreviewNotifyEvent.publish();
        int i2 = -1;
        this.f13265Z = (!cVar.f24951f || cVar.f24953h <= 0) ? -1 : 1;
        if (this.f13261V) {
            this.f13261V = false;
            Iterator it4 = this.f13285z.getDataListJustForAdapter().iterator();
            int i3 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                if (((C0740i2) it4.next()).mo75c() == 15) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            if (i2 >= 0) {
                this.f13285z.getDataListJustForAdapter().remove(i2);
                ((C2559a) this.f13243C).onItemRangeRemoved(i2, 1);
                C76912y0.makeText((Context) this.f13266g, (int) C0966R.string.f360730nb3, 0).show();
            }
            String str2 = this.f13249I;
            Log.m105924i(str2, "delete placeholder item index=" + i2);
        }
    }

    /* renamed from: B1 */
    public void mo2331B1(C7637b bVar) {
        C60898l<C60905o> I1;
        C60905o oVar;
        C60898l<C60905o> I12;
        C7642k kVar;
        int i;
        C87412m.m108594g(bVar, "ev");
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_TIMELINE_PRELOAD_NUM_INT_SYNC, 3);
        this.f13273p0 = j;
        if (j > 0 && (bVar instanceof C7642k) && ((i = kVar.f25951b) == 0 || i == 5)) {
            C60898l<C60905o> I13 = mo2599I1();
            int itemCount = I13 != null ? I13.getItemCount() - I13.mo85796c6() : 0;
            this.f13282x0 = (itemCount - 1) - this.f13273p0;
            C11739f.C11740a c3 = ((C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class)).mo11600c3(this.f13272p);
            if (this.f13265Z == 1 && !this.f13263X && (kVar = (C7642k) bVar).f25955f >= this.f13282x0 && !c3.f34377j) {
                mo2606P1(kVar.f25958i);
                String str = this.f13249I;
                Log.m105924i(str, "[onAutoToLoadMore] tabType=" + this.f13272p + " configPosition=" + this.f13273p0 + ", lastPosition=" + kVar.f25955f + ", preLoadBeginPosition=" + this.f13282x0 + ", count=" + itemCount);
            }
        } else if (bVar instanceof C7322a.C7323a) {
            C7322a.C7323a aVar = (C7322a.C7323a) bVar;
            int i2 = aVar.f25435b;
            if ((i2 == 1 || i2 == 2) && (I1 = mo2599I1()) != null && (oVar = (C60905o) C60898l.m71330b6(I1, aVar.f25436c, false, 2, (Object) null)) != null && (I12 = mo2599I1()) != null) {
                I12.notifyItemChanged(oVar.mo17363j(), new C13604l(9, Long.valueOf(aVar.f25436c)));
            }
        }
    }

    /* renamed from: B5 */
    public C11182m0 mo2570B5(BaseFinderFeed baseFinderFeed, C77407n nVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C2587m(this, baseFinderFeed);
    }

    /* renamed from: D1 */
    public RecyclerView.C16623q mo2571D1() {
        return this.f13241A;
    }

    /* renamed from: E */
    public String mo2595E() {
        String str = ((C13442s8) C39818r.f106831a.mo62444c(this.f13266g).mo75002a(C13442s8.class)).f38098n;
        return str == null ? "" : str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.getRecyclerView();
     */
    /* renamed from: F1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2596F1(com.tencent.p014mm.view.RefreshLoadMoreLayout.C7080c<java.lang.Object> r10, boolean r11) {
        /*
            r9 = this;
            kf1.n9 r0 = r9.f13269j
            r1 = 0
            if (r0 == 0) goto L_0x0010
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            if (r0 == 0) goto L_0x0010
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            boolean r2 = r0 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r2 == 0) goto L_0x0019
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r0
            r2 = r0
            goto L_0x001a
        L_0x0019:
            r2 = r1
        L_0x001a:
            r0 = 0
            if (r2 == 0) goto L_0x0022
            int r3 = r2.mo82597F4()
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            r8 = 1
            if (r3 > 0) goto L_0x0027
            r0 = 1
        L_0x0027:
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            if (r0 == 0) goto L_0x002f
            return
        L_0x002f:
            int r3 = r9.f13272p
            r4 = 3
            if (r3 == r4) goto L_0x0036
            if (r3 != r8) goto L_0x0090
        L_0x0036:
            if (r10 == 0) goto L_0x0090
            if (r0 != 0) goto L_0x0050
            boolean r0 = r10.f24951f
            if (r0 != 0) goto L_0x0050
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$e r11 = new com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$e
            r11.<init>(r2, r9)
            o40.C61926c.m72668M(r11)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.view.RefreshLoadMoreLayout$c<java.lang.Object>> r11 = f13239Q0
            java.lang.String r0 = r9.mo2598H1()
            r11.put(r0, r10)
            goto L_0x0090
        L_0x0050:
            if (r11 == 0) goto L_0x0090
            if (r2 == 0) goto L_0x0090
            jq3.l$a r10 = r9.f13258S
            java.lang.String r11 = "info"
            gy3.C87412m.m108594g(r10, r11)
            java.util.ArrayList<jq3.l$a> r11 = r2.f173486j
            boolean r10 = r11.contains(r10)
            if (r10 == 0) goto L_0x0072
            jq3.l$a r10 = r9.f13258S
            cm1.e r10 = (cm1.C0726e) r10
            int r10 = r10.hashCode()
            long r3 = (long) r10
            r5 = 0
            r6 = 2
            r7 = 0
            jq3.C60898l.m71331i6(r2, r3, r5, r6, r7)
        L_0x0072:
            kf1.n9 r10 = r9.f13269j
            if (r10 == 0) goto L_0x007b
            com.tencent.mm.view.RefreshLoadMoreLayout r10 = r10.mo10416c()
            goto L_0x007c
        L_0x007b:
            r10 = r1
        L_0x007c:
            if (r10 != 0) goto L_0x007f
            goto L_0x0082
        L_0x007f:
            r10.setCanLoadMore(r8)
        L_0x0082:
            kf1.n9 r10 = r9.f13269j
            if (r10 == 0) goto L_0x008a
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r10.mo10416c()
        L_0x008a:
            if (r1 != 0) goto L_0x008d
            goto L_0x0090
        L_0x008d:
            r1.setHasBottomMore(r8)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter.mo2596F1(com.tencent.mm.view.RefreshLoadMoreLayout$c, boolean):void");
    }

    /* renamed from: G1 */
    public final void mo2597G1(C54505r rVar, boolean z, String str) {
        long L1 = mo2602L1();
        rVar.getClass();
        C65834e.f189316a.mo89875i(L1);
        C9878n9 n9Var = this.f13269j;
        if (n9Var != null) {
            n9Var.mo10414C0(true);
        }
        C9863mb mbVar = new C9863mb(this);
        String str2 = this.f13249I;
        Log.m105924i(str2, "load share feed no hit cache objectId=" + mo2602L1() + " isMegaVideo=" + z + " username=" + str);
        long L12 = mo2602L1();
        String str3 = (String) ((C36570n) this.f13280w).getValue();
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f13266g);
        int i = f != null ? f.f38096i : 0;
        C13442s8 f2 = aVar.mo12873f(this.f13266g);
        rVar.mo75345f3(L12, str3, i, f2 != null ? f2.mo12861q3() : null, z, str, mbVar, 6);
    }

    /* renamed from: H1 */
    public final String mo2598H1() {
        List<E> listOfType = this.f13285z.getListOfType(BaseFinderFeed.class);
        boolean z = listOfType.size() == 0;
        long j = 0;
        long id = z ? 0 : ((BaseFinderFeed) listOfType.get(0)).mo3513o().getId();
        if (!z) {
            j = ((BaseFinderFeed) listOfType.get(listOfType.size() - 1)).mo3513o().getId();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13272p);
        sb.append('_');
        sb.append(id);
        sb.append('_');
        sb.append(j);
        sb.append('_');
        sb.append(listOfType.size());
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.getRecyclerView();
     */
    /* renamed from: I1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final jq3.C60898l<jq3.C60905o> mo2599I1() {
        /*
            r3 = this;
            kf1.n9 r0 = r3.f13269j
            r1 = 0
            if (r0 == 0) goto L_0x0010
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            if (r0 == 0) goto L_0x0010
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            boolean r2 = r0 instanceof jq3.C60898l
            if (r2 == 0) goto L_0x0018
            r1 = r0
            jq3.l r1 = (jq3.C60898l) r1
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter.mo2599I1():jq3.l");
    }

    /* renamed from: J0 */
    public void mo2572J0(BaseFinderFeed baseFinderFeed, boolean z, int i) {
        int i2;
        C87412m.m108594g(baseFinderFeed, "feed");
        C0751m0.m691b(C0751m0.f1769a, this.f13266g, ((C13442s8) C39818r.f106831a.mo62444c(this.f13266g).mo75002a(C13442s8.class)).mo12861q3(), baseFinderFeed, z ? 1 : 2, false, i, 16, (Object) null);
        C58961d.C58963b bVar = C58961d.f168673a;
        C58969q l = baseFinderFeed.mo3507l();
        String username = l != null ? l.getUsername() : "";
        if (z) {
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C58969q.f168705a2;
            i2 = C58969q.f168707c2;
        } else {
            IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = C58969q.f168705a2;
            i2 = 0;
        }
        bVar.mo84161i(username, i2);
    }

    /* renamed from: J1 */
    public final int mo2600J1() {
        C60898l<C60905o> I1 = mo2599I1();
        if (I1 != null) {
            return I1.getItemCount() - I1.mo85796c6();
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.getRecyclerView();
     */
    /* renamed from: K1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo2601K1() {
        /*
            r4 = this;
            kf1.n9 r0 = r4.f13269j
            r1 = 0
            if (r0 == 0) goto L_0x0010
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            if (r0 == 0) goto L_0x0010
            int r0 = r0.getChildCount()
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 > 0) goto L_0x0014
            return r1
        L_0x0014:
            kf1.n9 r0 = r4.f13269j
            r2 = 0
            if (r0 == 0) goto L_0x0024
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            if (r0 == 0) goto L_0x0024
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            goto L_0x0025
        L_0x0024:
            r0 = r2
        L_0x0025:
            boolean r3 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r3 == 0) goto L_0x002c
            r2 = r0
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
        L_0x002c:
            if (r2 == 0) goto L_0x0032
            int r1 = r2.mo16959E()
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter.mo2601K1():int");
    }

    /* renamed from: L1 */
    public final long mo2602L1() {
        return ((Number) this.f13279v.getValue()).longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.getRecyclerView();
     */
    /* renamed from: M1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2603M1(long r13, boolean r15) {
        /*
            r12 = this;
            kf1.n9 r0 = r12.f13269j
            r1 = 0
            if (r0 == 0) goto L_0x0010
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            if (r0 == 0) goto L_0x0010
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            boolean r2 = r0 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r2 == 0) goto L_0x0018
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r0
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0027
            cm1.i r4 = r12.f13256Q
            boolean r0 = r0.mo85795Y5(r4)
            if (r0 != 0) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x002b
            return
        L_0x002b:
            kf1.n9 r0 = r12.f13269j
            if (r0 == 0) goto L_0x003a
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            if (r0 == 0) goto L_0x003a
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            goto L_0x003b
        L_0x003a:
            r0 = r1
        L_0x003b:
            boolean r4 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x0042
            r1 = r0
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
        L_0x0042:
            jq3.l r0 = r12.mo2599I1()
            if (r0 == 0) goto L_0x0052
            cm1.i r4 = r12.f13256Q
            boolean r0 = r0.mo85795Y5(r4)
            if (r0 != 0) goto L_0x0052
            r0 = 1
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r0 == 0) goto L_0x0056
            return
        L_0x0056:
            if (r15 != 0) goto L_0x00ab
            if (r1 == 0) goto L_0x00ab
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r0.mo10233c(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r0.mo10233c(r4)
            java.lang.Object[] r5 = r0.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter"
            java.lang.String r7 = "hideSearchBar"
            java.lang.String r8 = "(JZ)V"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "scrollToPositionWithOffset"
            java.lang.String r11 = "(II)V"
            r4 = r1
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r3 = r0.mo10231a(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r0 = r0.mo10231a(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.mo16973V(r3, r0)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter"
            java.lang.String r6 = "hideSearchBar"
            java.lang.String r7 = "(JZ)V"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "scrollToPositionWithOffset"
            java.lang.String r10 = "(II)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x00ab:
            kf1.n9 r0 = r12.f13269j
            if (r0 == 0) goto L_0x00c2
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            if (r0 == 0) goto L_0x00c2
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$s r2 = new com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$s
            r4 = r2
            r5 = r12
            r6 = r15
            r7 = r1
            r8 = r13
            r4.<init>(r5, r6, r7, r8)
            r0.postDelayed(r2, r13)
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter.mo2603M1(long, boolean):void");
    }

    /* renamed from: N1 */
    public final boolean mo2604N1() {
        return ((Boolean) this.f13281x.getValue()).booleanValue();
    }

    /* renamed from: O1 */
    public FinderTimelineFeedLoader mo2605O1() {
        return this.f13285z;
    }

    /* renamed from: P1 */
    public void mo2606P1(long j) {
        RefreshLoadMoreLayout c;
        if (!this.f13263X) {
            for (C4119n b : f13240R0) {
                b.mo5002b(this.f13272p);
            }
            C9878n9 n9Var = this.f13269j;
            if (!(n9Var == null || (c = n9Var.mo10416c()) == null)) {
                c.mo82438D(true);
            }
            this.f13264Y = System.currentTimeMillis();
            TestPreloadPreviewNotifyEvent testPreloadPreviewNotifyEvent = new TestPreloadPreviewNotifyEvent();
            TestPreloadPreviewNotifyEvent.C1152a aVar = testPreloadPreviewNotifyEvent.f9563d;
            aVar.f9564a = this.f13272p;
            aVar.f9565b = 1;
            aVar.f9568e = j;
            testPreloadPreviewNotifyEvent.publish();
            this.f13263X = true;
        }
    }

    /* renamed from: Q1 */
    public void mo2607Q1() {
        RecyclerView recyclerView;
        mo2618t3();
        C7879t1.f26497a.mo8993a();
        if (this.f13272p == 3) {
            long longExtra = this.f13266g.getIntent().getLongExtra("key_finder_post_local_id", -1);
            boolean z = false;
            boolean z2 = this.f13266g.getIntent().getBooleanExtra("key_form_sns", false) || this.f13266g.getIntent().getBooleanExtra("KEY_POST_DIRECTLY_FROM_SNS", false);
            boolean booleanExtra = this.f13266g.getIntent().getBooleanExtra("KEY_FROM_SDK_SHARE", false);
            boolean booleanExtra2 = this.f13266g.getIntent().getBooleanExtra("KEY_FROM_SNS_SYNC_POST", false);
            if (longExtra != -1 && (z2 || booleanExtra || booleanExtra2)) {
                BaseFinderFeed onPostStart = this.f13285z.onPostStart(longExtra, z2);
                if (z2 && onPostStart != null) {
                    C7868s3.f26472a.mo8975b(this.f13266g, onPostStart);
                }
            }
            this.f13266g.getIntent().removeExtra("key_finder_post_local_id");
            Boolean valueOf = Boolean.valueOf(this.f13266g.getIntent().getBooleanExtra("KEY_FINDER_POST_FINISH_JUMP_FOLLOW_TAB", false));
            if (valueOf.booleanValue() && this.f13253M) {
                z = true;
            }
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.booleanValue();
                C61926c.m72668M(new C9731fb((RefreshLoadMoreLayout.C7080c<Object>) null, this));
            }
        }
        C9878n9 n9Var = this.f13269j;
        if (n9Var != null && (recyclerView = n9Var.getRecyclerView()) != null) {
            recyclerView.post(new C2565c0(this));
        }
    }

    /* renamed from: R1 */
    public void mo2608R1() {
        FinderHomeTabFragment finderHomeTabFragment;
        int i = this.f13272p;
        if (i == 1) {
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5 j5Var = (C8777j5) c;
            C9878n9 n9Var = this.f13269j;
            C8777j5.C8778a.m8602c(j5Var, n9Var != null ? n9Var.getRecyclerView() : null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, "temp_9", C0075i.EVENT_ON_PAUSE, 0, 0, 0, 112, (Object) null);
        } else if (i == 4 && (finderHomeTabFragment = this.f13267h) != null) {
            this.f13260U.f1779g.f1759a = -1;
            ((C63586o) C39818r.f106831a.mo62445d(finderHomeTabFragment).mo75002a(C63586o.class)).mo88437f3();
        }
    }

    /* renamed from: S1 */
    public final void mo2609S1(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
        C8478d0 d0Var = new C8478d0();
        int C = ((FinderLinearLayoutManager) layoutManager).mo16957C() + 1;
        d0Var.f27483d = C;
        if (this.f13261V) {
            d0Var.f27483d = C - 1;
        }
        String str = this.f13249I;
        Log.m105924i(str, "[smoothScrollToNextPosition] nextPosition=" + d0Var.f27483d + ", hasOpenRecommendLoadMore=" + this.f13261V);
        recyclerView.post(new C2576h0(recyclerView, d0Var));
    }

    /* renamed from: S4 */
    public boolean mo2610S4(boolean z, boolean z2, long j) {
        FinderHomeTabFragment finderHomeTabFragment;
        int i;
        C9878n9 n9Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        C58341h.C58342a aVar;
        C58341h.C7408e eVar;
        boolean z3 = z;
        boolean z4 = z2;
        C58341h.C58344f fVar = C58341h.C58344f.RefreshContinue;
        Class cls = FinderCommonFeatureService.class;
        C39818r rVar = C39818r.f106831a;
        C58341h f3 = ((FinderStreamTabPreloadCore) rVar.mo62446e(cls).mo75002a(FinderStreamTabPreloadCore.class)).mo78457f3(this.f13272p);
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = this.f13270n.mo11603f3(this.f13272p) && this.f13285z.f13842e == 0;
        boolean z8 = (f3 != null && (eVar = f3.f167042r) != null && eVar.f25557a) && f3.f167042r.f25558b == fVar;
        boolean z9 = ((f3 == null || (aVar = f3.f167040p) == null) ? null : aVar.f167045c) == fVar;
        if (z7 && z8) {
            if (f3 != null) {
                f3.mo83098u(false, fVar);
            }
            String str = this.f13249I;
            Log.m105928w(str, "[checkAutoFlingToRefresh] reset loadingState tabType=" + this.f13272p);
        } else if (z7 && z9) {
            if (f3 != null) {
                f3.mo83089e(true, "HasRefreshContinueCache");
            }
            String str2 = this.f13249I;
            Log.m105928w(str2, "[checkAutoFlingToRefresh] clear last refresh response. tabType=" + this.f13272p);
        }
        boolean z15 = !z7 && (z8 || z9);
        C37521f.f99374d.getClass();
        long j2 = C37521f.f99483p3.mo60266n().intValue() == 1 ? 0 : j;
        if (z15 || z7 || z3) {
            C9878n9 n9Var2 = this.f13269j;
            RecyclerView.LayoutManager layoutManager = (n9Var2 == null || (recyclerView3 = n9Var2.getRecyclerView()) == null) ? null : recyclerView3.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            int C = linearLayoutManager != null ? linearLayoutManager.mo16957C() : 0;
            String str3 = this.f13249I;
            Log.m105924i(str3, "[checkAutoFlingToRefresh] isHard=" + z3 + " isWithRefresh=" + z4 + " isContinueRefresh=" + z15 + " offset=" + C + " delayMs=" + j2 + " tabType=" + this.f13272p + " isFromShareToTimeline=" + mo2604N1());
            C9878n9 n9Var3 = this.f13269j;
            RecyclerView.LayoutManager layoutManager2 = (n9Var3 == null || (recyclerView2 = n9Var3.getRecyclerView()) == null) ? null : recyclerView2.getLayoutManager();
            LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
            if (linearLayoutManager2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                aVar2.mo10233c(0);
                LinearLayoutManager linearLayoutManager3 = linearLayoutManager2;
                C117292a.m165358d(linearLayoutManager3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter", "checkAutoFlingToRefresh", "(ZZJ)Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager2.mo16973V(((Integer) aVar2.mo10231a(0)).intValue(), ((Integer) aVar2.mo10231a(1)).intValue());
                C117292a.m165359e(linearLayoutManager3, "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter", "checkAutoFlingToRefresh", "(ZZJ)Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            if (!(C > -1 || (n9Var = this.f13269j) == null || (recyclerView = n9Var.getRecyclerView()) == null)) {
                recyclerView.post(new C2566d(linearLayoutManager2));
            }
            if (z4) {
                C20480e0.f57583a.mo32029b(this.f13272p);
                C9603s sVar = this.f13285z.f13843f;
                if ((sVar != null && sVar.f29879l) || mo2604N1()) {
                    FinderTimelineFeedLoader finderTimelineFeedLoader = this.f13285z;
                    if (!finderTimelineFeedLoader.f13848n && this.f13272p == 4 && (!finderTimelineFeedLoader.getDataList().isEmpty())) {
                        C9878n9 n9Var4 = this.f13269j;
                        if (n9Var4 != null) {
                            n9Var4.mo10417g0(0, true, true);
                        }
                        this.f13276s = true;
                    }
                }
                C9878n9 n9Var5 = this.f13269j;
                if (n9Var5 != null) {
                    C9878n9.C9879a.m9643a(n9Var5, j2, false, false, 4, (Object) null);
                }
                this.f13276s = true;
            } else {
                z6 = false;
            }
            this.f13274q = false;
            z5 = z6;
        } else {
            ((C8815x4) rVar.mo62444c(this.f13266g).mo62447c(C8815x4.class)).mo9641e1();
        }
        if (this.f13272p == 4 && (finderHomeTabFragment = this.f13267h) != null) {
            FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0();
            if (!z5 || !((i = Nx0.f158541r) == 7 || i == 8 || i == 10)) {
                this.f13260U.f1779g.f1759a = -100;
            } else {
                this.f13260U.f1779g.f1759a = -200;
            }
            ((C63586o) rVar.mo62445d(finderHomeTabFragment).mo75002a(C63586o.class)).mo88437f3();
        }
        C20480e0.f57583a.mo32030c();
        return z5;
    }

    /* renamed from: U */
    public C9500j mo2611U() {
        return new FinderTimelinePresenter$buildItemCoverts$1(this);
    }

    /* renamed from: X2 */
    public C11184p0 mo2573X2(BaseFinderFeed baseFinderFeed, C60905o oVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        return new C2600q(this, baseFinderFeed, oVar);
    }

    /* renamed from: Y4 */
    public C11184p0 mo2574Y4(BaseFinderFeed baseFinderFeed, int i, C60905o oVar, C32224a<C13598b0> aVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        return new C2589o(this, baseFinderFeed, aVar, oVar, i);
    }

    /* renamed from: d7 */
    public C11182m0 mo2568d7(BaseFinderFeed baseFinderFeed, C77407n nVar, C60905o oVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        C87412m.m108594g(oVar, "holder");
        return new C2585l(this, baseFinderFeed, nVar, oVar);
    }

    /* renamed from: e4 */
    public void mo2612e4(boolean z) {
        C9603s sVar = this.f13285z.f13843f;
        RefreshLoadMoreLayout refreshLoadMoreLayout = null;
        if (sVar != null && sVar.f29879l) {
            Log.m105924i(this.f13249I, "loadMoreData: wait show unread feed refresh end");
            C9878n9 n9Var = this.f13269j;
            if (n9Var != null) {
                refreshLoadMoreLayout = n9Var.mo10416c();
            }
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.setLoadingMore(false);
                return;
            }
            return;
        }
        C7453v vVar = C7453v.f25647a;
        MMActivity mMActivity = this.f13266g;
        int i = this.f13272p;
        int J1 = mo2600J1();
        boolean z2 = this.f13263X;
        int K1 = mo2601K1();
        C87412m.m108594g(mMActivity, "context");
        if (!vVar.mo8600a()) {
            Log.m105924i("Finder.HomeActionReporter", "[onLoadMoreStart] tabType:" + i + " itemCount:" + J1 + " isAuto:" + z2 + " curPosition:" + K1);
            C7453v.f25651e = i;
            C7453v.C7455b c = vVar.mo8602c(i);
            c.f25657a = J1;
            c.f25659c = true;
            c.f25658b = K1;
            vVar.mo8607h(i, 7, z2);
            vVar.mo8606g(mMActivity, i, new C13604l(7, 8), false);
        }
        C61926c.m72656A((String) null, new C2605u(this, z));
    }

    /* renamed from: f5 */
    public C47269o0 mo2575f5(C77407n nVar, BaseFinderFeed baseFinderFeed, int i, C60905o oVar) {
        C87412m.m108594g(nVar, "bottomSheet");
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        return new C2588n(this, baseFinderFeed, nVar, oVar, i);
    }

    public MMActivity getActivity() {
        return this.f13266g;
    }

    public List<C60898l.C60899a> getHeaderInfo() {
        FinderHomeTabFragment finderHomeTabFragment;
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC, 0);
        int j2 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC, 0);
        int j3 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, 0);
        int j4 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, 0);
        C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_FOLLOW_ACCEPT_INT_SYNC, 0);
        int j5 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_FRIEND_RECOMMEND_INT_SYNC, 0);
        C0735h hVar = this.f13255P;
        hVar.f1753d = j + j2 + j3 + j4 + j5;
        hVar.f1755f = j;
        hVar.f1754e = j2 + j3 + j4;
        hVar.f1756g = j5;
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_AVATAR_STRING_SYNC, "");
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
        hVar.getClass();
        hVar.f1757h = (String) f;
        String str = this.f13249I;
        Log.m105924i(str, "commentCnt " + j + ", likeCnt " + j2 + " objectLikeLikeCnt " + j3 + " objectRecommendLikeCnt friendRecommendCnt:" + j5 + ' ' + j4 + " avatar: " + this.f13255P.f1757h + " tabType " + this.f13272p);
        if (!(((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e() || 3 == this.f13272p || (finderHomeTabFragment = this.f13267h) == null)) {
            C63586o oVar = (C63586o) C39818r.f106831a.mo62445d(finderHomeTabFragment).mo75002a(C63586o.class);
            C0755n0 n0Var = this.f13260U;
            oVar.getClass();
            C87412m.m108594g(n0Var, "headerFullMergedData");
            oVar.f180310j = n0Var;
            ViewGroup viewGroup = (ViewGroup) oVar.findViewById(C0966R.C0970id.f5376dh);
            viewGroup.setVisibility(0);
            oVar.f180311n = new C14576n2(this);
            LayoutInflater b = C85868k2.m106137b(oVar.getContext());
            C87412m.m108591d(oVar.f180311n);
            View inflate = b.inflate(C0966R.C0971layout.f6242g, viewGroup, false);
            viewGroup.addView(inflate);
            C60905o oVar2 = new C60905o(inflate);
            oVar2.f173504F = oVar.mo88435d3();
            oVar.f180312o = oVar2;
            oVar2.f173503E = n0Var;
            C14576n2 n2Var = oVar.f180311n;
            if (n2Var != null) {
                n2Var.mo45f(oVar.mo88435d3(), oVar2, 2019);
                n2Var.mo44e(oVar2, n0Var, 0, 2019, false, (List<Object>) null);
            }
        }
        return C64186f0.f181907d;
    }

    public void keep(C9486a aVar) {
        C87412m.m108594g(aVar, "p0");
        this.f13268i.add(aVar);
    }

    /* renamed from: n6 */
    public void mo2577n6(FinderItem finderItem, boolean z, C60905o oVar, int i) {
        C87412m.m108594g(finderItem, "feed");
        C55031t.f154490a.mo76085a(this.f13266g, finderItem, z, 2, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0283  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttach(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            kf1.n9 r1 = (kf1.C9878n9) r1
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.Class<rs1.s1> r3 = rs1.C13426s1.class
            java.lang.Class<rs1.s8> r4 = rs1.C13442s8.class
            java.lang.String r5 = "viewCallback"
            gy3.C87412m.m108594g(r1, r5)
            r0.f13269j = r1
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r5 = r0.f13285z
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r5 = r5.getDataListJustForAdapter()
            int r6 = r0.f13272p
            r1.mo10420w(r5, r6)
            com.tencent.mm.plugin.finder.video.FinderVideoCore r5 = r0.f13242B
            com.tencent.mm.ui.MMActivity r6 = r0.f13266g
            kf1.ib r7 = new kf1.ib
            r7.<init>(r1, r0)
            r8 = 1
            r5.mo79536E1(r6, r7, r8)
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$commentChangeEventListener$1 r5 = r0.f13247G
            r5.alive()
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$autoRefreshEventListener$1 r5 = r0.f13248H
            r5.alive()
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r5 = r0.f13285z
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            androidx.recyclerview.widget.RecyclerView r7 = r1.getRecyclerView()
            r6.<init>(r7)
            r5.f13847j = r6
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r5 = r0.f13285z
            zp3.w r6 = r0.f13243C
            r5.register(r6)
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r5 = r0.f13267h
            r6 = 3
            r7 = 0
            r9 = 0
            if (r5 == 0) goto L_0x009f
            up1.f r10 = up1.C37521f.f99374d
            r10.getClass()
            pe1.c<java.lang.Integer> r10 = up1.C37521f.f99284S5
            java.lang.Object r10 = r10.mo60266n()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 != r8) goto L_0x0066
            r10 = 1
            goto L_0x0067
        L_0x0066:
            r10 = 0
        L_0x0067:
            if (r10 == 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r5 = r9
        L_0x006b:
            if (r5 == 0) goto L_0x009f
            int r10 = r0.f13272p
            if (r10 != r6) goto L_0x007f
            bl3.r r10 = bl3.C39818r.f106831a
            bl3.r$a r10 = r10.mo62445d(r5)
            androidx.lifecycle.i0 r10 = r10.mo75002a(r3)
            rs1.s1 r10 = (rs1.C13426s1) r10
            r10.f38009g = r7
        L_0x007f:
            bl3.r r10 = bl3.C39818r.f106831a
            bl3.r$a r11 = r10.mo62445d(r5)
            androidx.lifecycle.i0 r11 = r11.mo75002a(r3)
            rs1.s1 r11 = (rs1.C13426s1) r11
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r12 = r0.f13285z
            r11.f38010h = r12
            bl3.r$a r5 = r10.mo62445d(r5)
            androidx.lifecycle.i0 r3 = r5.mo75002a(r3)
            rs1.s1 r3 = (rs1.C13426s1) r3
            androidx.recyclerview.widget.RecyclerView r5 = r1.getRecyclerView()
            r3.f38011i = r5
        L_0x009f:
            er1.w3 r3 = er1.C58784w3.f168295a
            int r5 = r0.f13272p
            int r3 = r3.mo83890O(r5)
            rx3.g r5 = r0.f13245E
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            com.tencent.mm.plugin.finder.feed.model.r r5 = (com.tencent.p014mm.plugin.finder.feed.model.C55776r) r5
            r10 = 2
            kf1.jb r11 = new kf1.jb
            r11.<init>(r1, r0)
            r5.mo77389H1(r10, r3, r11)
            bl3.r r3 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r5 = r0.f13266g
            bl3.r$a r5 = r3.mo62444c(r5)
            androidx.lifecycle.i0 r5 = r5.mo75002a(r4)
            rs1.s8 r5 = (rs1.C13442s8) r5
            int r10 = r0.f13272p
            ef1.c r5 = r5.mo12856l3(r10)
            if (r5 == 0) goto L_0x00e0
            r5.mo83450a(r0)
            rx3.g r10 = r0.f13245E
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            com.tencent.mm.plugin.finder.feed.model.r r10 = (com.tencent.p014mm.plugin.finder.feed.model.C55776r) r10
            r5.mo83450a(r10)
        L_0x00e0:
            rx3.g r5 = r0.f13246F
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            ht1.z2 r5 = (ht1.C8819z2) r5
            kf1.kb r10 = new kf1.kb
            r10.<init>(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
            r5.mo9646T0(r10, r1)
            com.tencent.mm.ui.MMActivity r1 = r0.f13266g
            bl3.r$a r1 = r3.mo62444c(r1)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r4)
            rs1.s8 r1 = (rs1.C13442s8) r1
            int r5 = r0.f13272p
            ef1.c r1 = r1.mo12856l3(r5)
            if (r1 == 0) goto L_0x011e
            r1.mo83450a(r0)
            rx3.g r5 = r0.f13246F
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            ht1.z2 r5 = (ht1.C8819z2) r5
            ef1.d r5 = r5.mo9650n()
            r1.mo83450a(r5)
        L_0x011e:
            boolean r1 = r19.mo2604N1()
            r5 = 4
            if (r1 == 0) goto L_0x012b
            int r1 = r0.f13272p
            if (r1 != r5) goto L_0x012b
            r1 = 1
            goto L_0x012c
        L_0x012b:
            r1 = 0
        L_0x012c:
            bl3.r$a r10 = r3.mo62446e(r2)
            java.lang.Class<os1.f> r11 = os1.C11739f.class
            androidx.lifecycle.i0 r10 = r10.mo75002a(r11)
            os1.f r10 = (os1.C11739f) r10
            if (r1 == 0) goto L_0x013d
            r1 = 114(0x72, float:1.6E-43)
            goto L_0x013f
        L_0x013d:
            int r1 = r0.f13272p
        L_0x013f:
            os1.f$a r1 = r10.mo11600c3(r1)
            r0.f13271o = r1
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$feedExposeInfoChangeListener$1 r1 = r0.f13254N
            r1.alive()
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$feedProgressListener$1 r1 = r0.f13284y0
            r1.alive()
            int r1 = r0.f13272p
            if (r1 == r8) goto L_0x0155
            if (r1 != r5) goto L_0x0161
        L_0x0155:
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r1 = r0.f13285z
            com.tencent.mm.plugin.finder.view.ContactUninterestEventListener r10 = new com.tencent.mm.plugin.finder.view.ContactUninterestEventListener
            r10.<init>(r1)
            r0.f13244D = r10
            r10.alive()
        L_0x0161:
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r1 = r0.f13285z
            com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(r1, r7, r8, r9)
            java.lang.Class<bo1.r> r1 = bo1.C54505r.class
            bl3.r$a r9 = r3.mo62446e(r2)
            androidx.lifecycle.i0 r9 = r9.mo75002a(r1)
            java.lang.String r10 = "UICProvider.of(FinderCom…ePreloadCore::class.java)"
            gy3.C87412m.m108593f(r9, r10)
            bo1.r r9 = (bo1.C54505r) r9
            com.tencent.mm.ui.MMActivity r11 = r0.f13266g
            android.content.Intent r11 = r11.getIntent()
            java.lang.String r12 = "business_type"
            int r11 = r11.getIntExtra(r12, r7)
            if (r11 != r8) goto L_0x0187
            r11 = 1
            goto L_0x0188
        L_0x0187:
            r11 = 0
        L_0x0188:
            com.tencent.mm.ui.MMActivity r12 = r0.f13266g
            android.content.Intent r12 = r12.getIntent()
            java.lang.String r13 = "finder_user_name"
            java.lang.String r12 = r12.getStringExtra(r13)
            if (r12 != 0) goto L_0x0198
            java.lang.String r12 = ""
        L_0x0198:
            boolean r13 = r19.mo2604N1()
            if (r13 == 0) goto L_0x028b
            int r13 = r0.f13272p
            if (r13 != r5) goto L_0x028b
            long r13 = r19.mo2602L1()
            r15 = 0
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 == 0) goto L_0x028b
            long r13 = r19.mo2602L1()
            vp1.e r5 = vp1.C65834e.f189316a
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo89871e(r13)
            if (r5 == 0) goto L_0x0288
            java.lang.String r13 = r0.f13249I
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r7 = "load share feed hit cache objectId="
            r14.append(r7)
            long r6 = r19.mo2602L1()
            r14.append(r6)
            java.lang.String r6 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r6)
            bl3.r$a r2 = r3.mo62446e(r2)
            androidx.lifecycle.i0 r1 = r2.mo75002a(r1)
            gy3.C87412m.m108593f(r1, r10)
            bo1.r r1 = (bo1.C54505r) r1
            long r6 = r5.getTimestamps()
            int r2 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x0203
            long r6 = eb0.C31543z5.m39453c()
            long r13 = r5.getTimestamps()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r5.getFeedObject()
            int r2 = r2.urlValidDuration
            r15 = r9
            long r8 = (long) r2
            r17 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r17
            long r13 = r13 + r8
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x0201
            goto L_0x0204
        L_0x0201:
            r2 = 0
            goto L_0x0205
        L_0x0203:
            r15 = r9
        L_0x0204:
            r2 = 1
        L_0x0205:
            java.lang.String r6 = r0.f13249I
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "checkCacheState isFinderToTimelinePreload="
            r7.append(r8)
            boolean r8 = r1.mo75344e3()
            r7.append(r8)
            java.lang.String r8 = " isNotExpired="
            r7.append(r8)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            boolean r6 = r1.mo75344e3()
            if (r6 == 0) goto L_0x022f
            if (r2 != 0) goto L_0x0235
        L_0x022f:
            boolean r1 = r1.mo75344e3()
            if (r1 != 0) goto L_0x0237
        L_0x0235:
            r8 = 1
            goto L_0x0238
        L_0x0237:
            r8 = 0
        L_0x0238:
            if (r8 == 0) goto L_0x0283
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r1 = r0.f13285z
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r1 = r1.getDataList()
            int r1 = r1.size()
            if (r1 != 0) goto L_0x028b
            java.lang.String r1 = r0.f13249I
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "preload data list size = 0 feedId="
            r2.append(r6)
            long r6 = r5.getId()
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            wp1.f$a r1 = wp1.C15585f.f42211a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r1.mo14348k(r5)
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r2 = r0.f13285z
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r2 = r2.getDataList()
            r2.add(r1)
            kf1.n9 r1 = r0.f13269j
            if (r1 == 0) goto L_0x028b
            androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
            if (r1 == 0) goto L_0x028b
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            if (r1 == 0) goto L_0x028b
            r1.notifyDataSetChanged()
            goto L_0x028b
        L_0x0283:
            r9 = r15
            r0.mo2597G1(r9, r11, r12)
            goto L_0x028b
        L_0x0288:
            r0.mo2597G1(r9, r11, r12)
        L_0x028b:
            boolean r1 = com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore.f160304p
            if (r1 == 0) goto L_0x02e4
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r1 = r0.f13267h
            if (r1 == 0) goto L_0x0298
            bl3.r$a r1 = r3.mo62445d(r1)
            goto L_0x029e
        L_0x0298:
            com.tencent.mm.ui.MMActivity r1 = r0.f13266g
            bl3.r$a r1 = r3.mo62444c(r1)
        L_0x029e:
            java.lang.Class<rs1.e> r2 = rs1.C63547e.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            rs1.e r1 = (rs1.C63547e) r1
            com.tencent.mm.ui.MMActivity r2 = r0.f13266g
            bl3.r$a r2 = r3.mo62444c(r2)
            androidx.lifecycle.i0 r2 = r2.mo75002a(r4)
            rs1.s8 r2 = (rs1.C13442s8) r2
            int r3 = r0.f13272p
            ef1.c r9 = r2.mo12856l3(r3)
            if (r9 == 0) goto L_0x02d4
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r2 = r0.f13285z
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r6 = r2.getDataListJustForAdapter()
            jq3.l r2 = r19.mo2599I1()
            if (r2 == 0) goto L_0x02cb
            int r7 = r2.mo85796c6()
            goto L_0x02cc
        L_0x02cb:
            r7 = 0
        L_0x02cc:
            com.tencent.mm.plugin.finder.video.FinderVideoCore r8 = r0.f13242B
            int r10 = r0.f13272p
            r5 = r1
            r5.mo88403c3(r6, r7, r8, r9, r10)
        L_0x02d4:
            com.tencent.mm.ui.MMActivity r2 = r0.f13266g
            int r2 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r2)
            com.tencent.mm.ui.MMActivity r3 = r0.f13266g
            int r3 = com.tencent.p014mm.p136ui.C75044y4.m89989a(r3)
            int r2 = r2 + r3
            r1.mo88404d3(r2)
        L_0x02e4:
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r1 = r0.f13285z
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r1 = r1.f13847j
            if (r1 == 0) goto L_0x02fa
            java.lang.Object r1 = r1.get()
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 == 0) goto L_0x02fa
            kf1.gb r2 = new kf1.gb
            r2.<init>(r0)
            r1.post(r2)
        L_0x02fa:
            int r1 = r0.f13272p
            r2 = 3
            if (r1 != r2) goto L_0x031f
            kf1.hb r1 = new kf1.hb
            r1.<init>(r0)
            r0.f13277t = r1
            java.lang.Class<md3.b> r1 = md3.C47001b.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            md3.b r1 = (md3.C47001b) r1
            md3.b$a r2 = r0.f13277t
            r1.mo71281st(r2)
            com.tencent.mm.app.f r1 = com.tencent.p014mm.app.C40008f.f107254d
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$onAttach$12 r2 = new com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$onAttach$12
            r2.<init>(r0, r1)
            r0.f13278u = r2
            r2.alive()
        L_0x031f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter.onAttach(java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:151:0x028b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0288  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDetach() {
        /*
            r20 = this;
            r0 = r20
            java.lang.Class<os1.f> r1 = os1.C11739f.class
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.Class<rs1.s8> r3 = rs1.C13442s8.class
            java.lang.String r4 = r0.f13249I
            java.lang.String r5 = "onDestroy"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            vp1.f r4 = vp1.C65838f.f189333a
            r4.mo89882c()
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$commentChangeEventListener$1 r4 = r0.f13247G
            r4.dead()
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$autoRefreshEventListener$1 r4 = r0.f13248H
            r4.dead()
            kf1.n9 r4 = r0.f13269j
            r5 = 0
            if (r4 == 0) goto L_0x02f1
            androidx.recyclerview.widget.RecyclerView r6 = r4.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r6 = r6.getLayoutManager()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            gy3.C87412m.m108592e(r6, r7)
            androidx.recyclerview.widget.LinearLayoutManager r6 = (androidx.recyclerview.widget.LinearLayoutManager) r6
            int r6 = r6.mo16957C()
            jq3.l r7 = r20.mo2599I1()
            r8 = 0
            if (r7 == 0) goto L_0x0042
            int r7 = r7.mo85796c6()
            goto L_0x0043
        L_0x0042:
            r7 = 0
        L_0x0043:
            int r7 = r6 - r7
            androidx.recyclerview.widget.RecyclerView r4 = r4.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView$z r4 = r4.mo17024J0(r6, r8)
            if (r4 == 0) goto L_0x0059
            android.view.View r4 = r4.f44854d
            if (r4 == 0) goto L_0x0059
            int r4 = r4.getTop()
            r12 = r4
            goto L_0x005a
        L_0x0059:
            r12 = 0
        L_0x005a:
            boolean r4 = r20.mo2604N1()
            java.lang.String r6 = "UICProvider.of(FinderCom…meTabStateVM::class.java)"
            r15 = 4
            r14 = 1
            if (r4 == 0) goto L_0x0144
            int r4 = r0.f13272p
            if (r4 == r15) goto L_0x006a
            goto L_0x0144
        L_0x006a:
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r2 = r4.mo62446e(r2)
            androidx.lifecycle.i0 r1 = r2.mo75002a(r1)
            gy3.C87412m.m108593f(r1, r6)
            r9 = r1
            os1.f r9 = (os1.C11739f) r9
            r10 = 114(0x72, float:1.6E-43)
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r1 = r0.f13285z
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r13 = r1.getDataListJustForAdapter()
            r1 = 0
            r2 = 0
            r16 = 0
            r17 = 0
            r18 = 240(0xf0, float:3.36E-43)
            r19 = 0
            r11 = r7
            r6 = 1
            r14 = r1
            r1 = 4
            r15 = r2
            os1.C11739f.m11436j3(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.tencent.mm.ui.MMActivity r2 = r0.f13266g
            bl3.r$a r2 = r4.mo62444c(r2)
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            rs1.s8 r2 = (rs1.C13442s8) r2
            te3.hj1 r2 = r2.mo12861q3()
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r4 = r0.f13285z
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r4 = r4.getDataListJustForAdapter()
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00b8:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x00ec
            java.lang.Object r10 = r4.next()
            r11 = r10
            cm1.i2 r11 = (cm1.C0740i2) r11
            boolean r12 = r11 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r12 == 0) goto L_0x00e5
            rx3.g r12 = r0.f13283y
            rx3.n r12 = (rx3.C36570n) r12
            java.lang.Object r12 = r12.getValue()
            os1.q r12 = (os1.C11749q) r12
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r11
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.mo3513o()
            long r13 = r11.getId()
            boolean r11 = r12.mo11614e3(r1, r13)
            if (r11 != 0) goto L_0x00e5
            r14 = 1
            goto L_0x00e6
        L_0x00e5:
            r14 = 0
        L_0x00e6:
            if (r14 == 0) goto L_0x00b8
            r9.add(r10)
            goto L_0x00b8
        L_0x00ec:
            java.util.Iterator r4 = r9.iterator()
        L_0x00f0:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0133
            java.lang.Object r8 = r4.next()
            cm1.i2 r8 = (cm1.C0740i2) r8
            boolean r9 = r8 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r9 == 0) goto L_0x00f0
            te3.do1 r9 = new te3.do1
            r9.<init>()
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r8
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r8.mo3513o()
            long r10 = r10.getId()
            r9.f132446d = r10
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.mo3513o()
            java.lang.String r8 = r8.getObjectNonceId()
            r9.f132447e = r8
            java.lang.Class<dp1.y0> r8 = dp1.C58417y0.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            dp1.y0 r8 = (dp1.C58417y0) r8
            long r10 = r9.f132446d
            int r12 = r2.f134675i
            java.lang.String r8 = r8.mo83281Cu(r10, r12)
            r9.f132449g = r8
            r9.f132448f = r1
            r7.add(r9)
            goto L_0x00f0
        L_0x0133:
            boolean r1 = r7.isEmpty()
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x02f1
            je1.f r1 = new je1.f
            r1.<init>(r7, r2)
            r1.mo9225i()
            goto L_0x02f1
        L_0x0144:
            r4 = 4
            r15 = 1
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r9 = r0.f13285z
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r9 = r9.getDataListJustForAdapter()
            java.util.Iterator r9 = r9.iterator()
        L_0x0150:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0166
            java.lang.Object r10 = r9.next()
            cm1.i2 r10 = (cm1.C0740i2) r10
            boolean r11 = r10 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r11 == 0) goto L_0x0150
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r10 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r10
            r10.mo3482P()
            goto L_0x0150
        L_0x0166:
            bl3.r r9 = bl3.C39818r.f106831a
            bl3.r$a r2 = r9.mo62446e(r2)
            androidx.lifecycle.i0 r1 = r2.mo75002a(r1)
            gy3.C87412m.m108593f(r1, r6)
            r9 = r1
            os1.f r9 = (os1.C11739f) r9
            int r10 = r0.f13272p
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r1 = r0.f13285z
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r13 = r1.getDataListJustForAdapter()
            r14 = 0
            r1 = 0
            r16 = 0
            r17 = 0
            r18 = 240(0xf0, float:3.36E-43)
            r19 = 0
            r11 = r7
            r2 = 1
            r15 = r1
            os1.C11739f.m11436j3(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99416h6
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x01a3
            r14 = 1
            goto L_0x01a4
        L_0x01a3:
            r14 = 0
        L_0x01a4:
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99425i6
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 == r2) goto L_0x01b6
            if (r14 != 0) goto L_0x01b6
            goto L_0x02f1
        L_0x01b6:
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r1 = r0.f13285z
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r1 = r1.getDataListJustForAdapter()
            java.lang.Object r1 = sx3.C110818d0.m150917O(r1, r7)
            cm1.i2 r1 = (cm1.C0740i2) r1
            if (r1 == 0) goto L_0x01c9
            boolean r6 = r1 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r6 == 0) goto L_0x01c9
            goto L_0x01ca
        L_0x01c9:
            r1 = r5
        L_0x01ca:
            java.lang.String r6 = r0.f13249I
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "refreshFirstPage: feedPos="
            r9.append(r10)
            r9.append(r7)
            java.lang.String r10 = ", feed="
            r9.append(r10)
            r9.append(r1)
            java.lang.String r10 = ", tabType="
            r9.append(r10)
            int r11 = r0.f13272p
            r9.append(r11)
            java.lang.String r11 = ", showUnreadFeed="
            r9.append(r11)
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            int r6 = r0.f13272p
            r9 = 3
            if (r6 == r9) goto L_0x0205
            if (r6 == r2) goto L_0x0205
            if (r6 == r4) goto L_0x0205
            goto L_0x02f1
        L_0x0205:
            if (r7 != 0) goto L_0x020b
            if (r14 != 0) goto L_0x020b
            goto L_0x02f1
        L_0x020b:
            if (r1 == 0) goto L_0x02f1
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            vp1.o$a r6 = vp1.C14937o.f40972a
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r9 = r0.f13285z
            int r9 = r9.getPageName()
            r11 = 2
            java.util.List r6 = vp1.C14937o.C14938a.m14143i(r6, r9, r5, r11, r5)
            r4.addAll(r6)
            boolean r6 = r4.isEmpty()
            r6 = r6 ^ r2
            if (r6 == 0) goto L_0x022c
            r4.removeFirst()
        L_0x022c:
            r4.addFirst(r1)
            if (r14 == 0) goto L_0x02e2
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r1 = r0.f13285z
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r1 = r1.getDataListJustForAdapter()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
            r9 = 0
        L_0x0241:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x0291
            java.lang.Object r11 = r1.next()
            int r12 = r9 + 1
            if (r9 < 0) goto L_0x028d
            r13 = r11
            cm1.i2 r13 = (cm1.C0740i2) r13
            if (r9 <= r7) goto L_0x0285
            boolean r9 = r13 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r9 == 0) goto L_0x025c
            r14 = r13
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r14 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r14
            goto L_0x025d
        L_0x025c:
            r14 = r5
        L_0x025d:
            if (r14 == 0) goto L_0x0267
            boolean r14 = r14.mo3515p()
            if (r14 != 0) goto L_0x0267
            r14 = 1
            goto L_0x0268
        L_0x0267:
            r14 = 0
        L_0x0268:
            if (r14 == 0) goto L_0x0285
            if (r9 == 0) goto L_0x026f
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r13 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r13
            goto L_0x0270
        L_0x026f:
            r13 = r5
        L_0x0270:
            if (r13 == 0) goto L_0x0280
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r13.mo3513o()
            if (r9 == 0) goto L_0x0280
            boolean r9 = r9.isSupportCache()
            if (r9 != r2) goto L_0x0280
            r14 = 1
            goto L_0x0281
        L_0x0280:
            r14 = 0
        L_0x0281:
            if (r14 == 0) goto L_0x0285
            r14 = 1
            goto L_0x0286
        L_0x0285:
            r14 = 0
        L_0x0286:
            if (r14 == 0) goto L_0x028b
            r6.add(r11)
        L_0x028b:
            r9 = r12
            goto L_0x0241
        L_0x028d:
            sx3.C64197v.m75542k()
            throw r5
        L_0x0291:
            java.lang.Object r1 = sx3.C110818d0.m150916N(r6)
            boolean r6 = r1 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r6 == 0) goto L_0x029c
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r1
            goto L_0x029d
        L_0x029c:
            r1 = r5
        L_0x029d:
            if (r1 == 0) goto L_0x02aa
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r6 = r0.f13285z
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r6 = r6.getDataListJustForAdapter()
            int r6 = r6.indexOf(r1)
            goto L_0x02ab
        L_0x02aa:
            r6 = -1
        L_0x02ab:
            java.lang.String r7 = r0.f13249I
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "refreshFirstPage: cacheUnreadIndex="
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = ", cacheUnReadFeed="
            r8.append(r6)
            r8.append(r1)
            r8.append(r10)
            int r6 = r0.f13272p
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            if (r1 == 0) goto L_0x02e2
            r1.mo3514o0(r2)
            int r6 = r4.size()
            if (r6 <= r2) goto L_0x02df
            r4.remove(r2)
        L_0x02df:
            r4.add(r2, r1)
        L_0x02e2:
            wp1.f$a r1 = wp1.C15585f.f42211a
            er1.w3 r6 = er1.C58784w3.f168295a
            int r7 = r0.f13272p
            int r6 = r6.mo83887M1(r7)
            java.lang.String r7 = ""
            r1.mo14346i(r4, r6, r7, r2)
        L_0x02f1:
            md3.b$a r1 = r0.f13277t
            if (r1 == 0) goto L_0x0302
            java.lang.Class<md3.b> r2 = md3.C47001b.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            md3.b r2 = (md3.C47001b) r2
            r2.mo71279fN(r1)
            r0.f13277t = r5
        L_0x0302:
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ModNewContactEvent> r1 = r0.f13278u
            if (r1 == 0) goto L_0x030b
            r1.dead()
            r0.f13278u = r5
        L_0x030b:
            java.util.concurrent.CopyOnWriteArraySet<jp3.a> r1 = r0.f13268i
            java.util.Iterator r1 = r1.iterator()
        L_0x0311:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0321
            java.lang.Object r2 = r1.next()
            jp3.a r2 = (jp3.C9486a) r2
            r2.dead()
            goto L_0x0311
        L_0x0321:
            java.util.concurrent.CopyOnWriteArraySet<jp3.a> r1 = r0.f13268i
            r1.clear()
            bl3.r r1 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r2 = r0.f13266g
            bl3.r$a r2 = r1.mo62444c(r2)
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            rs1.s8 r2 = (rs1.C13442s8) r2
            int r4 = r0.f13272p
            ef1.c r2 = r2.mo12856l3(r4)
            if (r2 == 0) goto L_0x034c
            r2.mo83453d(r0)
            rx3.g r4 = r0.f13245E
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            com.tencent.mm.plugin.finder.feed.model.r r4 = (com.tencent.p014mm.plugin.finder.feed.model.C55776r) r4
            r2.mo83453d(r4)
        L_0x034c:
            rx3.g r2 = r0.f13245E
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            com.tencent.mm.plugin.finder.feed.model.r r2 = (com.tencent.p014mm.plugin.finder.feed.model.C55776r) r2
            r2.onDetach()
            com.tencent.mm.ui.MMActivity r2 = r0.f13266g
            bl3.r$a r1 = r1.mo62444c(r2)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r3)
            rs1.s8 r1 = (rs1.C13442s8) r1
            int r2 = r0.f13272p
            ef1.c r1 = r1.mo12856l3(r2)
            if (r1 == 0) goto L_0x0381
            r1.mo83453d(r0)
            rx3.g r2 = r0.f13246F
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            ht1.z2 r2 = (ht1.C8819z2) r2
            ef1.d r2 = r2.mo9650n()
            r1.mo83453d(r2)
        L_0x0381:
            rx3.g r1 = r0.f13246F
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            ht1.z2 r1 = (ht1.C8819z2) r1
            r1.onDetach()
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r1 = r0.f13285z
            zp3.w r2 = r0.f13243C
            r1.unregister(r2)
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$feedExposeInfoChangeListener$1 r1 = r0.f13254N
            r1.dead()
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$feedProgressListener$1 r1 = r0.f13284y0
            r1.dead()
            com.tencent.mm.plugin.finder.view.ContactUninterestEventListener r1 = r0.f13244D
            if (r1 == 0) goto L_0x03a6
            r1.dead()
        L_0x03a6:
            r0.f13269j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter.onDetach():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:179:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0532  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0704  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0706  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x071c  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x046e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:346:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRefreshEnd(com.tencent.p014mm.view.RefreshLoadMoreLayout.C7080c<java.lang.Object> r36) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC> r2 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC.class
            java.lang.Class<rs1.o> r3 = rs1.C63586o.class
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r4 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.String r5 = "reason"
            gy3.C87412m.m108594g(r1, r5)
            boolean r5 = r0.f13252L
            r6 = 1000(0x3e8, double:4.94E-321)
            r8 = 4
            r11 = 0
            if (r5 == 0) goto L_0x0110
            int r5 = r0.f13272p
            if (r5 != r8) goto L_0x0110
            com.tencent.mm.ui.MMActivity r5 = r0.f13266g
            androidx.fragment.app.FragmentManager r5 = r5.getSupportFragmentManager()
            java.util.List r5 = r5.getFragments()
            java.lang.String r12 = "getActivity().supportFragmentManager.fragments"
            gy3.C87412m.m108593f(r5, r12)
            java.lang.Class<com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment> r12 = com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment.class
            java.util.List r5 = sx3.C13798c0.m13102z(r5, r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = sx3.C36907w.m41090l(r5, r13)
            r12.<init>(r13)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0041:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L_0x0057
            java.lang.Object r13 = r5.next()
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r13 = (com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment) r13
            int r13 = r13.f17334o
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.add(r13)
            goto L_0x0041
        L_0x0057:
            java.util.Iterator r5 = r12.iterator()
        L_0x005b:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L_0x010e
            java.lang.Object r12 = r5.next()
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            int r13 = r0.f13272p
            if (r12 == r13) goto L_0x0109
            bl3.r r13 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r14 = r0.f13266g
            bl3.r$a r14 = r13.mo62444c(r14)
            java.lang.Class<rs1.pa> r15 = rs1.C13367pa.class
            androidx.lifecycle.i0 r14 = r14.mo75002a(r15)
            rs1.pa r14 = (rs1.C13367pa) r14
            r14.getClass()
            bl3.r$a r15 = r13.mo62446e(r4)
            java.lang.Class<com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore> r8 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class
            androidx.lifecycle.i0 r8 = r15.mo75002a(r8)
            com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore r8 = (com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) r8
            te3.vl1 r8 = r8.mo78458g3()
            int r8 = r8.f185931K
            long r9 = (long) r8
            long r9 = r9 * r6
            rx3.g r8 = r14.f37880f
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            os1.f r8 = (os1.C11739f) r8
            boolean r8 = r8.mo11603f3(r12)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "startPreload: delayTimeSec = "
            r15.append(r6)
            r15.append(r9)
            java.lang.String r6 = ", tabType = "
            r15.append(r6)
            r15.append(r12)
            java.lang.String r6 = " isAutoRefresh = "
            r15.append(r6)
            r15.append(r8)
            java.lang.String r6 = r15.toString()
            java.lang.String r7 = "FinderTabPreloadUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            r6 = 0
            int r15 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r15 > 0) goto L_0x00d3
            goto L_0x0109
        L_0x00d3:
            if (r8 == 0) goto L_0x00f0
            rs1.qa r6 = new rs1.qa
            r6.<init>(r14, r12)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            java.util.HashMap<java.lang.Integer, java.lang.Runnable> r8 = r14.f37879e
            r8.put(r7, r6)
            rx3.g r7 = r14.f37878d
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            com.tencent.mm.sdk.platformtools.MMHandler r7 = (com.tencent.p014mm.sdk.platformtools.MMHandler) r7
            r7.postDelayed(r6, r9)
        L_0x00f0:
            androidx.appcompat.app.AppCompatActivity r6 = r14.getActivity()
            bl3.r$a r6 = r13.mo62444c(r6)
            androidx.lifecycle.i0 r6 = r6.mo75002a(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r6 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC) r6
            java.util.concurrent.CopyOnWriteArraySet<com.tencent.mm.plugin.finder.view.v2> r6 = r6.f18653j
            boolean r7 = r6.contains(r14)
            if (r7 != 0) goto L_0x0109
            r6.add(r14)
        L_0x0109:
            r6 = 1000(0x3e8, double:4.94E-321)
            r8 = 4
            goto L_0x005b
        L_0x010e:
            r0.f13252L = r11
        L_0x0110:
            java.util.concurrent.CopyOnWriteArrayList<com.tencent.mm.plugin.finder.view.n> r5 = f13240R0
            java.util.Iterator r5 = r5.iterator()
        L_0x0116:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x012a
            java.lang.Object r6 = r5.next()
            com.tencent.mm.plugin.finder.view.n r6 = (com.tencent.p014mm.plugin.finder.view.C4119n) r6
            int r7 = r0.f13272p
            int r8 = r1.f24953h
            r6.mo5001a(r7, r8)
            goto L_0x0116
        L_0x012a:
            di3.d r5 = di3.C86312j.m106911c(r4)
            com.tencent.mm.plugin.FinderCommonFeatureService r5 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r5
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r5 = r5.Nt0()
            int r6 = r0.f13272p
            java.lang.String r6 = r5.mo77283w(r6)
            java.util.concurrent.ConcurrentSkipListSet<java.lang.String> r5 = r5.f158530g
            r5.remove(r6)
            com.tencent.mm.ui.MMActivity r5 = r0.f13266g
            android.content.Intent r5 = r5.getIntent()
            java.lang.String r6 = "KEY_TASK_ID"
            java.lang.String r5 = r5.getStringExtra(r6)
            java.lang.String r6 = ""
            if (r5 != 0) goto L_0x0150
            r5 = r6
        L_0x0150:
            boolean r7 = r0.f13251K
            r8 = 5
            r9 = 3
            r10 = 6
            r12 = 2
            r13 = 1
            if (r7 == 0) goto L_0x018e
            int r7 = r5.length()
            if (r7 <= 0) goto L_0x0161
            r7 = 1
            goto L_0x0162
        L_0x0161:
            r7 = 0
        L_0x0162:
            if (r7 == 0) goto L_0x018e
            r0.f13251K = r11
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r14 = 23669(0x5c75, float:3.3167E-41)
            java.lang.Object[] r15 = new java.lang.Object[r10]
            r15[r11] = r5
            java.lang.String r5 = "feed_got"
            r15[r13] = r5
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.Long r5 = java.lang.Long.valueOf(r16)
            r15[r12] = r5
            r15[r9] = r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            r6 = 4
            r15[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            r15[r8] = r5
            r7.mo160131h(r14, r15)
        L_0x018e:
            kf1.n9 r5 = r0.f13269j
            if (r5 == 0) goto L_0x0197
            r5.mo10414C0(r11)
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x0197:
            boolean r5 = r1.f24956k
            r6 = 11
            if (r5 != 0) goto L_0x01a1
            int r5 = r1.f24957l
            if (r5 != r6) goto L_0x01b8
        L_0x01a1:
            boolean r5 = r1.f24954i
            if (r5 == 0) goto L_0x01b8
            boolean r5 = r1.f24951f
            if (r5 == 0) goto L_0x01b8
            kf1.n9 r5 = r0.f13269j
            if (r5 == 0) goto L_0x01b8
            androidx.recyclerview.widget.RecyclerView r5 = r5.getRecyclerView()
            if (r5 == 0) goto L_0x01b8
            r0.mo2609S1(r5)
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x01b8:
            kf1.n9 r5 = r0.f13269j
            if (r5 == 0) goto L_0x01c1
            androidx.recyclerview.widget.RecyclerView r5 = r5.getRecyclerView()
            goto L_0x01c2
        L_0x01c1:
            r5 = 0
        L_0x01c2:
            if (r5 != 0) goto L_0x01c5
            goto L_0x01c8
        L_0x01c5:
            r5.setLayoutFrozen(r11)
        L_0x01c8:
            java.lang.Class<dp1.y0> r5 = dp1.C58417y0.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            dp1.y0 r5 = (dp1.C58417y0) r5
            java.lang.String r14 = r35.mo2595E()
            java.lang.String r15 = "EndCgi"
            r5.N40(r14, r15)
            com.tencent.mm.plugin.finder.video.FinderVideoCore r5 = r0.f13242B
            hr1.k r5 = r5.f161828n
            if (r5 == 0) goto L_0x020d
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r15 = r0.f13267h
            if (r15 == 0) goto L_0x01f1
            java.lang.Class r15 = r15.getClass()
            java.lang.String r15 = r15.getSimpleName()
            goto L_0x01f2
        L_0x01f1:
            r15 = 0
        L_0x01f2:
            r14.append(r15)
            java.lang.String r15 = "#onAttach"
            r14.append(r15)
            java.lang.String r17 = r14.toString()
            r18 = 0
            r19 = 0
            r20 = 4
            r21 = 0
            r16 = r5
            hr1.C8730k.C8731a.m8556a(r16, r17, r18, r19, r20, r21)
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x020d:
            java.lang.String r5 = r0.f13249I
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "[onRefreshEnd] reason="
            r14.append(r15)
            r14.append(r1)
            java.lang.String r15 = ", isShowUnreadFeedRefresh="
            r14.append(r15)
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r15 = r0.f13285z
            ke1.s r15 = r15.f13843f
            if (r15 == 0) goto L_0x022e
            boolean r15 = r15.f29879l
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            goto L_0x022f
        L_0x022e:
            r15 = 0
        L_0x022f:
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r14)
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r5 = r0.f13285z
            ke1.s r14 = r5.f13843f
            if (r14 != 0) goto L_0x0240
            goto L_0x0242
        L_0x0240:
            r14.f29879l = r11
        L_0x0242:
            int r14 = r1.f24953h
            if (r14 <= 0) goto L_0x02d9
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r5 = r5.getDataListJustForAdapter()
            int r14 = r5.size()
            java.util.ListIterator r5 = r5.listIterator(r14)
        L_0x0252:
            boolean r14 = r5.hasPrevious()
            if (r14 == 0) goto L_0x0278
            java.lang.Object r14 = r5.previous()
            cm1.i2 r14 = (cm1.C0740i2) r14
            boolean r7 = r14 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r7 == 0) goto L_0x0265
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r14 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r14
            goto L_0x0266
        L_0x0265:
            r14 = 0
        L_0x0266:
            if (r14 == 0) goto L_0x0270
            boolean r7 = r14.mo3477K()
            if (r7 != r13) goto L_0x0270
            r7 = 1
            goto L_0x0271
        L_0x0270:
            r7 = 0
        L_0x0271:
            if (r7 == 0) goto L_0x0252
            int r5 = r5.nextIndex()
            goto L_0x0279
        L_0x0278:
            r5 = -1
        L_0x0279:
            if (r5 < 0) goto L_0x02d5
            kf1.n9 r7 = r0.f13269j
            if (r7 == 0) goto L_0x02d6
            androidx.recyclerview.widget.RecyclerView r7 = r7.getRecyclerView()
            if (r7 == 0) goto L_0x02d6
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r17 = k20.C60958c.f173611a
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
            r14.mo10233c(r15)
            java.lang.Object[] r18 = r14.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter"
            java.lang.String r20 = "onRefreshEnd"
            java.lang.String r21 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V"
            java.lang.String r22 = "Undefined"
            java.lang.String r23 = "scrollToPosition"
            java.lang.String r24 = "(I)V"
            r17 = r7
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r14 = r14.mo10231a(r11)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r7.mo17115r1(r14)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter"
            java.lang.String r19 = "onRefreshEnd"
            java.lang.String r20 = "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V"
            java.lang.String r21 = "Undefined"
            java.lang.String r22 = "scrollToPosition"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            int r14 = r1.f24957l
            if (r14 == r6) goto L_0x02d2
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$z r6 = new com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$z
            r6.<init>(r7, r5)
            r7.post(r6)
        L_0x02d2:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            goto L_0x02d6
        L_0x02d5:
            r5 = -1
        L_0x02d6:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            goto L_0x02da
        L_0x02d9:
            r5 = -1
        L_0x02da:
            rx3.g r6 = r0.f13250J
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            com.tencent.mm.plugin.finder.view.whatnews.FinderWhatsNewView r6 = (com.tencent.p014mm.plugin.finder.view.whatnews.FinderWhatsNewView) r6
            if (r6 == 0) goto L_0x0313
            rx3.g r6 = r0.f13250J
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            com.tencent.mm.plugin.finder.view.whatnews.FinderWhatsNewView r6 = (com.tencent.p014mm.plugin.finder.view.whatnews.FinderWhatsNewView) r6
            if (r6 == 0) goto L_0x02fa
            boolean r6 = r6.isAttachedToWindow()
            if (r6 != r13) goto L_0x02fa
            r6 = 1
            goto L_0x02fb
        L_0x02fa:
            r6 = 0
        L_0x02fb:
            if (r6 == 0) goto L_0x0313
            rx3.g r2 = r0.f13250J
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            com.tencent.mm.plugin.finder.view.whatnews.FinderWhatsNewView r2 = (com.tencent.p014mm.plugin.finder.view.whatnews.FinderWhatsNewView) r2
            if (r2 != 0) goto L_0x030a
            goto L_0x0312
        L_0x030a:
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$a0 r3 = new com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$a0
            r3.<init>(r0, r1)
            r2.setDetachFinish(r3)
        L_0x0312:
            return
        L_0x0313:
            int r6 = r1.f24953h
            if (r6 > 0) goto L_0x032e
            kf1.n9 r6 = r0.f13269j
            if (r6 == 0) goto L_0x032b
            com.tencent.mm.view.RefreshLoadMoreLayout r6 = r6.mo10416c()
            if (r6 == 0) goto L_0x032b
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$b0 r7 = com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter.C2563b0.f13291d
            r14 = 0
            r6.mo82448Q(r14, r7)
            rx3.b0 r6 = rx3.C13598b0.f38549a
            goto L_0x0333
        L_0x032b:
            r14 = 0
            goto L_0x0333
        L_0x032e:
            r14 = 0
            r0.mo2603M1(r14, r11)
        L_0x0333:
            kf1.fb r6 = new kf1.fb
            r6.<init>(r1, r0)
            o40.C61926c.m72668M(r6)
            kf1.n9 r6 = r0.f13269j
            if (r6 == 0) goto L_0x034d
            androidx.recyclerview.widget.RecyclerView r6 = r6.getRecyclerView()
            if (r6 == 0) goto L_0x034d
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$y r7 = new com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$y
            r7.<init>(r0)
            r6.post(r7)
        L_0x034d:
            r0.mo2596F1(r1, r13)
            di3.d r4 = di3.C86312j.m106911c(r4)
            com.tencent.mm.plugin.FinderCommonFeatureService r4 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r4
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r4 = r4.Nt0()
            int r6 = r0.f13272p
            java.lang.String r7 = "Discovery"
            java.lang.String r14 = "onRefreshEnd"
            java.lang.String r15 = "FinderEntrance"
            if (r6 == r13) goto L_0x0396
            if (r6 == r9) goto L_0x0379
            r9 = 4
            if (r6 == r9) goto L_0x036a
            goto L_0x03b2
        L_0x036a:
            boolean r6 = r35.mo2604N1()
            if (r6 != 0) goto L_0x03b2
            java.lang.String r6 = "finder_tl_hot_tab"
            r4.mo77263e(r6, r14)
            r4.mo77239M5(r6)
            goto L_0x03b2
        L_0x0379:
            java.lang.String r6 = "TLFollow"
            r4.mo77263e(r6, r14)
            r4.mo77239M5(r6)
            boolean r9 = r35.mo2604N1()
            if (r9 == 0) goto L_0x03b2
            com.tencent.mm.plugin.finder.extension.reddot.s0 r6 = r4.mo77227G5(r6)
            if (r6 == 0) goto L_0x03b2
            r4.mo77267g(r6, r15, r11)
            r4.mo77267g(r6, r7, r11)
            rx3.b0 r6 = rx3.C13598b0.f38549a
            goto L_0x03b2
        L_0x0396:
            java.lang.String r6 = "TLRecommendTab"
            r4.mo77263e(r6, r14)
            r4.mo77239M5(r6)
            boolean r9 = r35.mo2604N1()
            if (r9 == 0) goto L_0x03b2
            com.tencent.mm.plugin.finder.extension.reddot.s0 r6 = r4.mo77227G5(r6)
            if (r6 == 0) goto L_0x03b2
            r4.mo77267g(r6, r15, r11)
            r4.mo77267g(r6, r7, r11)
            rx3.b0 r6 = rx3.C13598b0.f38549a
        L_0x03b2:
            com.tencent.mm.plugin.finder.extension.reddot.s0 r6 = r4.mo77227G5(r15)
            if (r6 == 0) goto L_0x03ff
            java.util.concurrent.ConcurrentHashMap<java.lang.String, te3.nn1> r7 = r6.f158583D
            int r7 = r7.size()
            if (r7 != r13) goto L_0x03fd
            te3.yi1 r7 = r6.f158585F
            int r7 = r7.f186555p
            int r9 = r0.f13272p
            if (r7 != r9) goto L_0x03fd
            java.lang.String r7 = r0.f13249I
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = "onRefreshEnd: dispose finder entrance red dot, tabType="
            r9.append(r14)
            int r14 = r0.f13272p
            r9.append(r14)
            java.lang.String r14 = ", tipsId="
            r9.append(r14)
            java.lang.String r14 = r6.field_tipsId
            r9.append(r14)
            java.lang.String r14 = ", feedId="
            r9.append(r14)
            te3.yi1 r6 = r6.f158585F
            long r13 = r6.f186549g
            java.lang.String r6 = o40.C61926c.m72691p(r13)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            r4.mo77239M5(r15)
        L_0x03fd:
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x03ff:
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r4 = r0.f13285z
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r4 = r4.getDataListJustForAdapter()
            int r6 = r4.size()
            if (r6 > 0) goto L_0x040c
            goto L_0x0440
        L_0x040c:
            java.util.Iterator r4 = r4.iterator()
        L_0x0410:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0433
            java.lang.Object r6 = r4.next()
            r7 = r6
            cm1.i2 r7 = (cm1.C0740i2) r7
            boolean r9 = r7 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r9 == 0) goto L_0x0424
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7
            goto L_0x0425
        L_0x0424:
            r7 = 0
        L_0x0425:
            if (r7 == 0) goto L_0x042f
            boolean r7 = r7.mo3477K()
            if (r7 != 0) goto L_0x042f
            r7 = 1
            goto L_0x0430
        L_0x042f:
            r7 = 0
        L_0x0430:
            if (r7 == 0) goto L_0x0410
            goto L_0x0434
        L_0x0433:
            r6 = 0
        L_0x0434:
            cm1.i2 r6 = (cm1.C0740i2) r6
            if (r6 == 0) goto L_0x0440
            int r4 = r6.mo75c()
            if (r4 != r12) goto L_0x0440
            r4 = 1
            goto L_0x0441
        L_0x0440:
            r4 = 0
        L_0x0441:
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r6 = r0.f13285z
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r6 = r6.getDataListJustForAdapter()
            java.util.Iterator r6 = r6.iterator()
        L_0x044b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x046e
            java.lang.Object r7 = r6.next()
            r9 = r7
            cm1.i2 r9 = (cm1.C0740i2) r9
            boolean r13 = r9 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r13 == 0) goto L_0x045f
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r9 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r9
            goto L_0x0460
        L_0x045f:
            r9 = 0
        L_0x0460:
            if (r9 == 0) goto L_0x046a
            boolean r9 = r9.mo3477K()
            if (r9 != 0) goto L_0x046a
            r9 = 1
            goto L_0x046b
        L_0x046a:
            r9 = 0
        L_0x046b:
            if (r9 == 0) goto L_0x044b
            goto L_0x046f
        L_0x046e:
            r7 = 0
        L_0x046f:
            cm1.i2 r7 = (cm1.C0740i2) r7
            if (r7 == 0) goto L_0x0488
            int r6 = r7.mo75c()
            r9 = 4
            if (r6 != r9) goto L_0x047c
            r6 = 1
            goto L_0x047d
        L_0x047c:
            r6 = 0
        L_0x047d:
            if (r6 == 0) goto L_0x0480
            goto L_0x0481
        L_0x0480:
            r7 = 0
        L_0x0481:
            if (r7 == 0) goto L_0x0488
            long r6 = r7.getItemId()
            goto L_0x048a
        L_0x0488:
            r6 = 0
        L_0x048a:
            dp1.e0 r25 = dp1.C20480e0.f57583a
            int r9 = r0.f13272p
            r27 = 0
            bl3.r r13 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r14 = r0.f13266g
            bl3.r$a r14 = r13.mo62444c(r14)
            java.lang.Class<rs1.s8> r15 = rs1.C13442s8.class
            androidx.lifecycle.i0 r14 = r14.mo75002a(r15)
            rs1.s8 r14 = (rs1.C13442s8) r14
            te3.hj1 r28 = r14.mo12861q3()
            r32 = 0
            r33 = 32
            r34 = 0
            r26 = r9
            r29 = r4
            r30 = r6
            dp1.C20480e0.m22094n(r25, r26, r27, r28, r29, r30, r32, r33, r34)
            r14 = 0
            if (r4 == 0) goto L_0x04ce
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x04ce
            com.tencent.mm.ui.MMActivity r4 = r0.f13266g
            bl3.r$a r4 = r13.mo62444c(r4)
            bl3.t r2 = r4.mo62449e(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r2 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC) r2
            if (r2 == 0) goto L_0x04ce
            r2.mo5134j3()
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x04ce:
            dp1.v r2 = dp1.C7453v.f25647a
            com.tencent.mm.ui.MMActivity r4 = r0.f13266g
            int r6 = r0.f13272p
            int r7 = r35.mo2600J1()
            int r9 = r35.mo2601K1()
            java.lang.String r14 = "context"
            gy3.C87412m.m108594g(r4, r14)
            boolean r14 = r2.mo8600a()
            if (r14 == 0) goto L_0x04e8
            goto L_0x052e
        L_0x04e8:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "[onRefreshEnd] tabType:"
            r14.append(r15)
            r14.append(r6)
            java.lang.String r15 = " itemCount:"
            r14.append(r15)
            r14.append(r7)
            java.lang.String r15 = " curPosition:"
            r14.append(r15)
            r14.append(r9)
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "Finder.HomeActionReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r14)
            dp1.C7453v.f25651e = r6
            dp1.v$b r14 = r2.mo8602c(r6)
            r14.f25657a = r7
            r14.f25659c = r11
            r14.f25658b = r9
            r2.mo8607h(r6, r10, r11)
            rx3.l r7 = new rx3.l
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.<init>(r9, r8)
            r8 = 1
            r2.mo8606g(r4, r6, r7, r8)
        L_0x052e:
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r2 = r0.f13267h
            if (r2 == 0) goto L_0x06fa
            bl3.r$a r4 = r13.mo62445d(r2)
            java.lang.Class<rs1.v3> r6 = rs1.C13484v3.class
            androidx.lifecycle.i0 r4 = r4.mo75002a(r6)
            rs1.v3 r4 = (rs1.C13484v3) r4
            kf1.n9 r6 = r0.f13269j
            if (r6 == 0) goto L_0x0547
            androidx.recyclerview.widget.RecyclerView r6 = r6.getRecyclerView()
            goto L_0x0548
        L_0x0547:
            r6 = 0
        L_0x0548:
            r4.f38206d = r6
            if (r6 == 0) goto L_0x0554
            rs1.w3 r7 = new rs1.w3
            r7.<init>(r4)
            r6.mo17043c(r7)
        L_0x0554:
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r6 = r0.f13285z
            if (r6 == 0) goto L_0x0565
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r6 = r6.getDataListJustForAdapter()
            if (r6 == 0) goto L_0x0565
            java.lang.Object r6 = sx3.C110818d0.m150917O(r6, r11)
            cm1.i2 r6 = (cm1.C0740i2) r6
            goto L_0x0566
        L_0x0565:
            r6 = 0
        L_0x0566:
            boolean r7 = r6 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r7 == 0) goto L_0x057b
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r6
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
            int r6 = r6.getMediaType()
            r7 = 15
            if (r6 != r7) goto L_0x057b
            r6 = 1
            r4.f38209g = r6
        L_0x057b:
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r6 = r0.f13285z
            if (r6 == 0) goto L_0x0591
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r6 = r6.getDataListJustForAdapter()
            if (r6 == 0) goto L_0x0591
            if (r5 < 0) goto L_0x0589
            int r5 = r5 + r12
            goto L_0x058a
        L_0x0589:
            r5 = 1
        L_0x058a:
            java.lang.Object r5 = sx3.C110818d0.m150917O(r6, r5)
            cm1.i2 r5 = (cm1.C0740i2) r5
            goto L_0x0592
        L_0x0591:
            r5 = 0
        L_0x0592:
            r4.mo12893d3(r5)
            boolean r5 = r1.f24956k
            if (r5 == 0) goto L_0x059f
            boolean r5 = r1.f24955j
            if (r5 == 0) goto L_0x059f
            r5 = 1
            goto L_0x05a0
        L_0x059f:
            r5 = 0
        L_0x05a0:
            r4.mo12892c3(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            E r4 = r1.f24950e
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader.C2757d
            if (r5 == 0) goto L_0x06fa
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader.TimelineResponse"
            gy3.C87412m.m108592e(r4, r5)
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$d r4 = (com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader.C2757d) r4
            te3.bm1 r5 = r4.f13874c
            te3.wl1 r6 = r4.f13875d
            java.lang.Object r4 = r4.getRequest()
            boolean r7 = r4 instanceof com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader.C2756c
            if (r7 == 0) goto L_0x05c1
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader$c r4 = (com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader.C2756c) r4
            goto L_0x05c2
        L_0x05c1:
            r4 = 0
        L_0x05c2:
            if (r4 == 0) goto L_0x05cf
            te3.am1 r7 = r4.f13871d
            if (r7 == 0) goto L_0x05cf
            int r7 = r7.f130635j
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x05d0
        L_0x05cf:
            r7 = 0
        L_0x05d0:
            if (r4 == 0) goto L_0x05d9
            long r8 = r4.f13870c
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            goto L_0x05da
        L_0x05d9:
            r4 = 0
        L_0x05da:
            java.lang.String r8 = r0.f13249I
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "[onRefreshEnd] title=["
            r9.append(r10)
            if (r5 == 0) goto L_0x05ef
            te3.nn1 r10 = r5.f131200e
            if (r10 == 0) goto L_0x05ef
            java.lang.String r10 = r10.f184504f
            goto L_0x05f0
        L_0x05ef:
            r10 = 0
        L_0x05f0:
            r9.append(r10)
            r10 = 45
            r9.append(r10)
            if (r5 == 0) goto L_0x0609
            te3.nn1 r10 = r5.f131200e
            if (r10 == 0) goto L_0x0609
            te3.s7 r10 = r10.f184519x
            if (r10 == 0) goto L_0x0609
            te3.f00 r10 = r10.f185355d
            if (r10 == 0) goto L_0x0609
            java.lang.String r10 = r10.f183065d
            goto L_0x060a
        L_0x0609:
            r10 = 0
        L_0x060a:
            r9.append(r10)
            java.lang.String r10 = "] tabType="
            r9.append(r10)
            int r10 = r0.f13272p
            r9.append(r10)
            java.lang.String r10 = " requestId="
            r9.append(r10)
            r9.append(r4)
            java.lang.String r4 = " from_tab_type="
            r9.append(r4)
            r9.append(r7)
            java.lang.String r4 = " tipsShowInfo={show_reddot="
            r9.append(r4)
            if (r5 == 0) goto L_0x0635
            int r4 = r5.f131199d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0636
        L_0x0635:
            r4 = 0
        L_0x0636:
            r9.append(r4)
            java.lang.String r4 = ", tab_tips_object_id="
            r9.append(r4)
            if (r5 == 0) goto L_0x0643
            long r14 = r5.f131202g
            goto L_0x0645
        L_0x0643:
            r14 = 0
        L_0x0645:
            java.lang.String r4 = o40.C61926c.m72691p(r14)
            r9.append(r4)
            java.lang.String r4 = ", show_seconds="
            r9.append(r4)
            if (r5 == 0) goto L_0x065a
            int r7 = r5.f131201f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x065b
        L_0x065a:
            r7 = 0
        L_0x065b:
            r9.append(r7)
            java.lang.String r7 = ", show_type="
            r9.append(r7)
            if (r5 == 0) goto L_0x066c
            te3.nn1 r7 = r5.f131200e
            if (r7 == 0) goto L_0x066c
            int r7 = r7.f184502d
            goto L_0x066d
        L_0x066c:
            r7 = -1
        L_0x066d:
            r9.append(r7)
            java.lang.String r7 = "} recommendTips={wording="
            r9.append(r7)
            if (r6 == 0) goto L_0x067b
            java.lang.String r7 = r6.f144121d
            goto L_0x067c
        L_0x067b:
            r7 = 0
        L_0x067c:
            r9.append(r7)
            r9.append(r4)
            if (r6 == 0) goto L_0x068b
            int r4 = r6.f144122e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            goto L_0x068c
        L_0x068b:
            r7 = 0
        L_0x068c:
            r9.append(r7)
            r4 = 125(0x7d, float:1.75E-43)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            if (r5 == 0) goto L_0x06b8
            int r4 = r5.f131199d
            if (r4 == 0) goto L_0x06b8
            cm1.n0 r4 = r0.f13260U
            cm1.h2 r4 = r4.f1779g
            r4.f1761c = r5
            r5 = 1
            r4.f1759a = r5
            bl3.r$a r4 = r13.mo62445d(r2)
            androidx.lifecycle.i0 r4 = r4.mo75002a(r3)
            rs1.o r4 = (rs1.C63586o) r4
            r4.mo88437f3()
            goto L_0x06cd
        L_0x06b8:
            cm1.n0 r4 = r0.f13260U
            cm1.h2 r4 = r4.f1779g
            r5 = -100
            r4.f1759a = r5
            bl3.r$a r4 = r13.mo62445d(r2)
            androidx.lifecycle.i0 r4 = r4.mo75002a(r3)
            rs1.o r4 = (rs1.C63586o) r4
            r4.mo88437f3()
        L_0x06cd:
            if (r6 == 0) goto L_0x06fa
            int r4 = r6.f144122e
            if (r4 <= 0) goto L_0x06fa
            bl3.r$a r2 = r13.mo62445d(r2)
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            java.lang.String r3 = "UICProvider.of(it).get(F…arOverlayUIC::class.java)"
            gy3.C87412m.m108593f(r2, r3)
            r25 = r2
            rs1.o r25 = (rs1.C63586o) r25
            r26 = 1
            java.lang.String r2 = r6.f144121d
            int r3 = r6.f144122e
            long r3 = (long) r3
            r5 = 1000(0x3e8, double:4.94E-321)
            long r28 = r3 * r5
            r30 = 0
            r31 = 8
            r32 = 0
            r27 = r2
            rs1.C63586o.m74921g3(r25, r26, r27, r28, r30, r31, r32)
        L_0x06fa:
            int r2 = r1.f24946a
            r3 = 1
            if (r2 != r3) goto L_0x0706
            int r2 = r1.f24953h
            if (r2 <= 0) goto L_0x0704
            goto L_0x0706
        L_0x0704:
            r8 = -1
            goto L_0x0707
        L_0x0706:
            r8 = 1
        L_0x0707:
            r0.f13265Z = r8
            com.tencent.mm.ui.MMActivity r2 = r0.f13266g
            android.content.Intent r2 = r2.getIntent()
            java.lang.String r3 = "KEY_PUSH_RETURN_TO"
            int r2 = r2.getIntExtra(r3, r11)
            if (r2 <= 0) goto L_0x0734
            int r1 = r1.f24947b
            r2 = -1
            if (r1 != r2) goto L_0x0734
            com.tencent.mm.ui.MMActivity r1 = r0.f13266g
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r2 = "KEY_PUSH_FAIL_RETURN_READY"
            r3 = 1
            r1.putExtra(r2, r3)
            com.tencent.mm.ui.MMActivity r1 = r0.f13266g
            r1.finish()
            java.lang.String r1 = r0.f13249I
            java.lang.String r2 = "finish for app push"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
        L_0x0734:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter.onRefreshEnd(com.tencent.mm.view.RefreshLoadMoreLayout$c):void");
    }

    /* renamed from: p1 */
    public FinderVideoCore mo2578p1() {
        return this.f13242B;
    }

    /* renamed from: r5 */
    public C56597e1 mo2579r5() {
        return ((C63545b1) C39818r.f106831a.mo62444c(this.f13266g).mo75002a(C63545b1.class)).f180225d;
    }

    public void requestRefresh() {
        int i;
        Class cls = FinderCommonFeatureService.class;
        Class<BaseFinderFeed> cls2 = BaseFinderFeed.class;
        ArrayList arrayList = new ArrayList();
        int i2 = this.f13272p;
        if (i2 == 3 || i2 == 1) {
            List<E> listOfType = this.f13285z.getListOfType(cls2);
            C58784w3 w3Var = C58784w3.f168295a;
            List<E> d0 = w3Var.mo83922d0(this.f13285z.getDataList().getBuffer(), cls2);
            String str = this.f13249I;
            Log.m105924i(str, "[requestRefresh] tabType=" + this.f13272p + ", dataList=" + listOfType.size() + " buffer=" + ((ArrayList) d0).size());
            listOfType.addAll(d0);
            arrayList.addAll(w3Var.mo83968u0(listOfType, this.f13272p));
            for (BaseFinderFeed o : C110818d0.m150936h0(arrayList)) {
                this.f13285z.remove(o.mo3513o().field_id, true);
            }
            String str2 = this.f13249I;
            StringBuilder sb = new StringBuilder();
            sb.append("[requestRefresh] tabType=");
            sb.append(this.f13272p);
            sb.append(", unreadList=");
            sb.append(arrayList.size());
            sb.append(" first=");
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) C110818d0.m150925W(arrayList);
            sb.append(C61926c.m72691p(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0));
            sb.append(" isFirstLoad=");
            sb.append(this.f13285z.f13842e);
            Log.m105924i(str2, sb.toString());
        }
        if (this.f13272p == 4) {
            if (this.f13266g.getIntent().getIntExtra("KEY_SOURCE_TYPE", 0) == 2 && this.f13285z.f13842e == 0) {
                C9878n9 n9Var = this.f13269j;
                RecyclerView recyclerView = n9Var != null ? n9Var.getRecyclerView() : null;
                if (recyclerView != null) {
                    recyclerView.setLayoutFrozen(true);
                }
            }
            C39622i0 a = C39818r.f106831a.mo62446e(cls).mo75002a(C11739f.class);
            C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
            long j = ((C11739f) a).mo11600c3(this.f13272p).f34373f;
            if (j != 0) {
                Iterator it = this.f13285z.getDataList().iterator();
                i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((C0740i2) it.next()).getItemId() == j) {
                        break;
                    }
                    i++;
                }
            } else {
                i = 0;
            }
            String str3 = this.f13249I;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("showUnreadCacheFeed=");
            C9603s sVar = this.f13285z.f13843f;
            sb4.append(sVar != null && sVar.f29879l);
            sb4.append(" lastIndex=");
            sb4.append(i);
            Log.m105924i(str3, sb4.toString());
        }
        C7453v vVar = C7453v.f25647a;
        MMActivity mMActivity = this.f13266g;
        int i3 = this.f13272p;
        int J1 = mo2600J1();
        int K1 = mo2601K1();
        C87412m.m108594g(mMActivity, "context");
        if (!vVar.mo8600a()) {
            Log.m105924i("Finder.HomeActionReporter", "[onRefreshStart] tabType:" + i3 + " itemCount:" + J1 + " curPosition:" + K1);
            C7453v.f25651e = i3;
            C7453v.C7455b c = vVar.mo8602c(i3);
            c.f25657a = J1;
            c.f25659c = true;
            c.f25658b = K1;
            vVar.mo8607h(i3, 5, false);
            vVar.mo8606g(mMActivity, i3, new C13604l(5, 0), false);
        }
        if (this.f13285z.f13842e == 0) {
            FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0();
            Nx0.f158530g.add(Nx0.mo77283w(this.f13272p));
        }
        C61926c.m72656A((String) null, new C2571f0(this, arrayList));
    }

    /* renamed from: s3 */
    public int mo2617s3() {
        return this.f13272p;
    }

    /* renamed from: t3 */
    public void mo2618t3() {
        C61926c.m72656A((String) null, new C2567d0(this));
    }

    /* renamed from: u0 */
    public boolean mo2497u0() {
        return false;
    }

    /* renamed from: u4 */
    public C11183n0 mo2580u4(BaseFinderFeed baseFinderFeed, C77407n nVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C2599p(this, baseFinderFeed);
    }

    /* renamed from: v3 */
    public void mo2581v3(BaseFinderFeed baseFinderFeed, boolean z, boolean z2, int i, boolean z3) {
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        C87412m.m108594g(baseFinderFeed, "feed");
        C0768q0.f1810a.mo710a(((C13442s8) C39818r.f106831a.mo62444c(this.f13266g).mo75002a(C13442s8.class)).mo12861q3(), i, baseFinderFeed.mo3513o(), z, z2, 2, baseFinderFeed.mo3468B(), z3, C58739j4.f168176a.mo83688Q(baseFinderFeed.mo3507l()));
    }

    /* renamed from: w1 */
    public C11182m0 mo2582w1(BaseFinderFeed baseFinderFeed, C77407n nVar, int i) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C2579j(this, baseFinderFeed, nVar);
    }

    /* renamed from: z1 */
    public boolean mo2333z1(C58553c cVar, C7637b bVar) {
        C87412m.m108594g(cVar, "dispatcher");
        C87412m.m108594g(bVar, "event");
        if (bVar instanceof C7642k) {
            int i = ((C7642k) bVar).f25951b;
            return i == 0 || i == 5;
        } else if (!(bVar instanceof C7322a.C7323a)) {
            return false;
        } else {
            int i2 = ((C7322a.C7323a) bVar).f25435b;
            return i2 == 1 || i2 == 2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$a */
    public static final class C2559a implements C16389w {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelinePresenter f13286d;

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter$a$a */
        public static final class C2560a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderTimelinePresenter f13287d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2560a(FinderTimelinePresenter finderTimelinePresenter) {
                super(0);
                this.f13287d = finderTimelinePresenter;
            }

            public Object invoke() {
                FinderTimelinePresenter finderTimelinePresenter = this.f13287d;
                ConcurrentHashMap<String, RefreshLoadMoreLayout.C7080c<Object>> concurrentHashMap = FinderTimelinePresenter.f13239Q0;
                finderTimelinePresenter.getClass();
                ((C8815x4) C39818r.f106831a.mo62444c(finderTimelinePresenter.f13266g).mo62447c(C8815x4.class)).mo9641e1();
                return C13598b0.f38549a;
            }
        }

        public C2559a(FinderTimelinePresenter finderTimelinePresenter) {
            this.f13286d = finderTimelinePresenter;
        }

        public void onChanged() {
            RefreshLoadMoreLayout c;
            C9878n9 n9Var = this.f13286d.f13269j;
            if (n9Var != null && (c = n9Var.mo10416c()) != null) {
                c.onChanged();
            }
        }

        public void onItemRangeChanged(int i, int i2) {
            RefreshLoadMoreLayout c;
            C9878n9 n9Var = this.f13286d.f13269j;
            if (n9Var != null && (c = n9Var.mo10416c()) != null) {
                C60898l<C60905o> I1 = this.f13286d.mo2599I1();
                c.onItemRangeChanged(i + (I1 != null ? I1.mo85796c6() : 0), i2);
            }
        }

        public void onItemRangeInserted(int i, int i2) {
            RefreshLoadMoreLayout c;
            C9878n9 n9Var = this.f13286d.f13269j;
            if (n9Var != null && (c = n9Var.mo10416c()) != null) {
                C60898l<C60905o> I1 = this.f13286d.mo2599I1();
                c.onItemRangeInserted(i + (I1 != null ? I1.mo85796c6() : 0), i2);
            }
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            RefreshLoadMoreLayout c;
            C9878n9 n9Var = this.f13286d.f13269j;
            if (n9Var != null && (c = n9Var.mo10416c()) != null) {
                C60898l<C60905o> I1 = this.f13286d.mo2599I1();
                int i4 = 0;
                int c6 = i + (I1 != null ? I1.mo85796c6() : 0);
                C60898l<C60905o> I12 = this.f13286d.mo2599I1();
                if (I12 != null) {
                    i4 = I12.mo85796c6();
                }
                c.onItemRangeMoved(c6, i2 + i4, i3);
            }
        }

        public void onItemRangeRemoved(int i, int i2) {
            RefreshLoadMoreLayout c;
            C9878n9 n9Var = this.f13286d.f13269j;
            if (n9Var != null && (c = n9Var.mo10416c()) != null) {
                C60898l<C60905o> I1 = this.f13286d.mo2599I1();
                c.onItemRangeRemoved(i + (I1 != null ? I1.mo85796c6() : 0), i2);
            }
        }

        public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            RefreshLoadMoreLayout c;
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            C9878n9 n9Var = this.f13286d.f13269j;
            if (n9Var != null && (c = n9Var.mo10416c()) != null) {
                c.mo82441G(cVar);
            }
        }

        public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            RefreshLoadMoreLayout c;
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            C9878n9 n9Var = this.f13286d.f13269j;
            if (n9Var != null && (c = n9Var.mo10416c()) != null) {
                c.onPreFinishLoadMoreSmooth(cVar);
            }
        }

        public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            RefreshLoadMoreLayout c;
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            C37521f.f99374d.getClass();
            if (C37521f.f99254P2.mo60266n().intValue() == 1) {
                DataBuffer dataList = this.f13286d.f13285z.getDataList();
                ArrayList<C0740i2> arrayList = new ArrayList<>();
                for (Object next : dataList) {
                    C0740i2 i2Var = (C0740i2) next;
                    if ((i2Var instanceof BaseFinderFeed) && ((BaseFinderFeed) i2Var).mo3467A()) {
                        arrayList.add(next);
                    }
                }
                for (C0740i2 i2Var2 : arrayList) {
                    C58784w3 w3Var = C58784w3.f168295a;
                    C87412m.m108592e(i2Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                    w3Var.mo83881K1(((BaseFinderFeed) i2Var2).mo3513o().field_id, false, -1);
                }
            }
            FinderTimelinePresenter finderTimelinePresenter = this.f13286d;
            if (finderTimelinePresenter.f13272p == 3 && cVar.f24953h <= 0) {
                E e = cVar.f24949d;
                C13921q qVar = e instanceof C13921q ? (C13921q) e : null;
                if (qVar != null && qVar.f39119e) {
                    Log.m105924i(finderTimelinePresenter.f13249I, "[checkDataReplace] data replace true");
                    cVar.f24953h++;
                }
            }
            C9878n9 n9Var = this.f13286d.f13269j;
            if (!(n9Var == null || (c = n9Var.mo10416c()) == null)) {
                c.onPreFinishRefresh(cVar);
            }
            FinderTimelinePresenter finderTimelinePresenter2 = this.f13286d;
            if (finderTimelinePresenter2.f13276s) {
                finderTimelinePresenter2.f13276s = false;
                C61926c.m72666K(150, new C2560a(finderTimelinePresenter2));
            }
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            RefreshLoadMoreLayout c;
            C9878n9 n9Var = this.f13286d.f13269j;
            if (n9Var != null && (c = n9Var.mo10416c()) != null) {
                C60898l<C60905o> I1 = this.f13286d.mo2599I1();
                c.onItemRangeChanged(i + (I1 != null ? I1.mo85796c6() : 0), i2, obj);
            }
        }
    }
}
