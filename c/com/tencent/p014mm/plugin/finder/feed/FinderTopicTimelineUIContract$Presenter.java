package com.tencent.p014mm.plugin.finder.feed;

import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ActivityFeedRemoveEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.ITPEventID;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import ef1.C58553c;
import f40.C86709a0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C8817y2;
import ht1.C8819z2;
import java.util.LinkedList;
import jq3.C60905o;
import kf1.C10019vb;
import kf1.C10035wb;
import kf1.C9707f;
import kf1.C9854m5;
import mf1.C10802c;
import nj3.C76874e0;
import qo3.C77407n;
import rs1.C13133c1;
import rs1.C13442s8;
import tf0.C13887q1;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Presenter */
public final class FinderTopicTimelineUIContract$Presenter extends FinderLoaderFeedUIContract$Presenter {

    /* renamed from: t */
    public final int f13452t;

    /* renamed from: u */
    public final int f13453u;

    /* renamed from: v */
    public final C10802c f13454v = new C10802c();

    /* renamed from: w */
    public final C55776r f13455w;

    /* renamed from: x */
    public final C8819z2 f13456x;

    /* renamed from: y */
    public IListener<ActivityFeedRemoveEvent> f13457y;

    /* renamed from: z */
    public String f13458z;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Presenter$a */
    public static final class C2628a extends C87413o implements C32226l<Integer, C0740i2> {

        /* renamed from: d */
        public final /* synthetic */ FinderTopicTimelineUIContract$Presenter f13459d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2628a(FinderTopicTimelineUIContract$Presenter finderTopicTimelineUIContract$Presenter) {
            super(1);
            this.f13459d = finderTopicTimelineUIContract$Presenter;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r1 = r1.getDataListJustForAdapter();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                r0 = 0
                if (r3 < 0) goto L_0x0032
                com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Presenter r1 = r2.f13459d
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r1 = r1.f13124s
                if (r1 == 0) goto L_0x001a
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r1 = r1.getDataListJustForAdapter()
                if (r1 == 0) goto L_0x001a
                int r1 = r1.size()
                goto L_0x001b
            L_0x001a:
                r1 = 0
            L_0x001b:
                if (r3 >= r1) goto L_0x0032
                com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Presenter r1 = r2.f13459d
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r1 = r1.f13124s
                if (r1 == 0) goto L_0x002a
                java.lang.Object r3 = r1.get(r3)
                cm1.i2 r3 = (cm1.C0740i2) r3
                goto L_0x002b
            L_0x002a:
                r3 = r0
            L_0x002b:
                boolean r1 = r3 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r1 == 0) goto L_0x0032
                r0 = r3
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            L_0x0032:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTopicTimelineUIContract$Presenter.C2628a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Presenter$b */
    public static final class C2629b extends C87413o implements C32227p<Integer, Integer, LinkedList<C0740i2>> {

        /* renamed from: d */
        public final /* synthetic */ FinderTopicTimelineUIContract$Presenter f13460d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2629b(FinderTopicTimelineUIContract$Presenter finderTopicTimelineUIContract$Presenter) {
            super(2);
            this.f13460d = finderTopicTimelineUIContract$Presenter;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13316LA(this.f13460d.f13124s, ((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTopicTimelineUIContract$Presenter(MMActivity mMActivity, int i, int i2) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, "context");
        this.f13452t = i;
        this.f13453u = i2;
        C39818r rVar = C39818r.f106831a;
        this.f13455w = ((C13133c1) rVar.mo62444c(mMActivity).mo75002a(C13133c1.class)).f37371d;
        this.f13456x = ((C8817y2) rVar.mo62444c(mMActivity).mo62447c(C8817y2.class)).mo9643v2();
    }

    /* renamed from: A7 */
    public void mo2545A7(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        C9707f fVar = this.f29964g;
        if (fVar instanceof C10019vb) {
            C87412m.m108592e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract.ViewCallback");
            C10019vb vbVar = (C10019vb) fVar;
            if (cVar.f24951f) {
                RecyclerView recyclerView = vbVar.mo10308D().getRecyclerView();
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
                int C = ((FinderLinearLayoutManager) layoutManager).mo16957C() + 1;
                if (C < vbVar.mo10312p().getData().size()) {
                    recyclerView.post(new C10035wb(recyclerView, C));
                }
            }
        }
    }

    /* renamed from: o */
    public void mo2494o() {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, (Object) null);
        }
    }

    public void onDetach() {
        C58553c a;
        C58553c a2;
        this.f13455w.onDetach();
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f29961d);
        if (!(f == null || (a2 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a2.mo83453d(this.f13455w);
        }
        C10802c cVar = this.f13454v;
        cVar.getClass();
        C86709a0.m107524d().mo123470p(5909, cVar);
        this.f13456x.onDetach();
        IListener<ActivityFeedRemoveEvent> iListener = this.f13457y;
        if (iListener != null) {
            iListener.dead();
        }
        C13442s8 f2 = aVar.mo12873f(this.f29961d);
        if (!(f2 == null || (a = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) == null)) {
            a.mo83453d(this.f13456x.mo9650n());
        }
        super.onDetach();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        r2 = r2.getDataList();
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRefreshEnd(com.tencent.p014mm.view.RefreshLoadMoreLayout.C7080c<java.lang.Object> r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = "reason"
            r2 = r18
            gy3.C87412m.m108594g(r2, r1)
            int r1 = r0.f13453u
            r2 = 16
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L_0x00df
            kf1.f r1 = r0.f29964g
            if (r1 == 0) goto L_0x00df
            androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
            if (r1 == 0) goto L_0x00df
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r1.getLayoutManager()
            if (r1 == 0) goto L_0x00df
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r2 = r0.f13124s
            if (r2 == 0) goto L_0x0034
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r2 = r2.getDataList()
            if (r2 == 0) goto L_0x0034
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r3
            if (r2 != r3) goto L_0x0034
            r2 = 1
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            if (r2 == 0) goto L_0x00df
            com.tencent.mm.ui.MMActivity r2 = r0.f29961d
            android.content.Intent r2 = r2.getIntent()
            r5 = 0
            java.lang.String r7 = "key_ref_object_id"
            long r5 = r2.getLongExtra(r7, r5)
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r2 = r0.f13124s
            r7 = -1
            if (r2 == 0) goto L_0x0073
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r2 = r2.getDataList()
            if (r2 == 0) goto L_0x0073
            java.util.Iterator r2 = r2.iterator()
            r8 = 0
        L_0x0055:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0073
            java.lang.Object r9 = r2.next()
            cm1.i2 r9 = (cm1.C0740i2) r9
            long r9 = r9.getItemId()
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x006b
            r9 = 1
            goto L_0x006c
        L_0x006b:
            r9 = 0
        L_0x006c:
            if (r9 == 0) goto L_0x0070
            r7 = r8
            goto L_0x0073
        L_0x0070:
            int r8 = r8 + 1
            goto L_0x0055
        L_0x0073:
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r2 = r0.f13124s
            if (r2 == 0) goto L_0x0082
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r2 = r2.getDataList()
            if (r2 == 0) goto L_0x0082
            int r2 = r2.size()
            goto L_0x0083
        L_0x0082:
            r2 = 0
        L_0x0083:
            if (r7 < 0) goto L_0x0089
            if (r7 >= r2) goto L_0x0089
            r2 = 1
            goto L_0x008a
        L_0x0089:
            r2 = 0
        L_0x008a:
            if (r2 == 0) goto L_0x00df
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r1 = (com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r5)
            java.lang.Object[] r9 = r2.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$Presenter"
            java.lang.String r11 = "checkPlay"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "Undefined"
            java.lang.String r14 = "scrollToPositionWithOffset"
            java.lang.String r15 = "(II)V"
            r8 = r1
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r5 = r2.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.mo16973V(r5, r2)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$Presenter"
            java.lang.String r10 = "checkPlay"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "Undefined"
            java.lang.String r13 = "scrollToPositionWithOffset"
            java.lang.String r14 = "(II)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
        L_0x00df:
            int r1 = r0.f13453u
            ak1.f0$q r2 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD
            t91.c$a r5 = t91.C64208c.f181951a
            t91.C64208c.f181962l = r3
            r5 = 2
            if (r5 != r1) goto L_0x00ed
            t91.C64208c.f181962l = r3
            goto L_0x00f6
        L_0x00ed:
            if (r3 != r1) goto L_0x00f6
            ak1.f0$q r2 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR
            t91.C64208c.f181962l = r4
            java.lang.String r1 = "9"
            goto L_0x00f8
        L_0x00f6:
            java.lang.String r1 = "27"
        L_0x00f8:
            op3.b r1 = op3.C117882j.m166284c(r2, r1)
            java.lang.Class<ht1.j5> r2 = ht1.C8777j5.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            java.lang.String r5 = "getService(IHellLiveReport::class.java)"
            gy3.C87412m.m108593f(r2, r5)
            r6 = r2
            ht1.j5 r6 = (ht1.C8777j5) r6
            kf1.f r2 = r0.f29964g
            if (r2 == 0) goto L_0x0113
            androidx.recyclerview.widget.RecyclerView r2 = r2.getRecyclerView()
            goto L_0x0114
        L_0x0113:
            r2 = 0
        L_0x0114:
            r7 = r2
            java.lang.Object r2 = r1.mo182596a(r4)
            java.lang.String r4 = "tuple2.`$1`()"
            gy3.C87412m.m108593f(r2, r4)
            r8 = r2
            ak1.f0$q r8 = (ak1.C54067f0.C54078q) r8
            java.lang.Object r1 = r1.mo182596a(r3)
            java.lang.String r2 = "tuple2.`$2`()"
            gy3.C87412m.m108593f(r1, r2)
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            ak1.i r10 = ak1.C0075i.EVENT_ON_REFRESH
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 112(0x70, float:1.57E-43)
            r16 = 0
            ht1.C8777j5.C8778a.m8602c(r6, r7, r8, r9, r10, r11, r12, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTopicTimelineUIContract$Presenter.onRefreshEnd(com.tencent.mm.view.RefreshLoadMoreLayout$c):void");
    }

    public void requestRefresh() {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            baseFeedLoader.requestRefresh();
        }
    }

    /* renamed from: t */
    public void mo2496t(BaseFinderFeed baseFinderFeed, C76874e0 e0Var, C77407n nVar, C60905o oVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(e0Var, "menu");
        C87412m.m108594g(nVar, "sheet");
        C87412m.m108594g(oVar, "holder");
        if (this.f13453u == 7) {
            boolean z = false;
            if (!Util.isNullOrNil(this.f13458z) && C87412m.m108589b(this.f13458z, C66785b.f191882e.mo90662O5())) {
                if (baseFinderFeed.mo3513o().isPostFinish()) {
                    e0Var.mo107144g(5001, this.f29961d.getString(C0966R.string.czf), C0966R.raw.icons_outlined_remove_from_list);
                }
                BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
                C87412m.m108592e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract.Loader");
                if (((FinderTopicTimelineUIContract$Loader) baseFeedLoader).f13436n == 1) {
                    C10802c cVar = this.f13454v;
                    MMActivity mMActivity = this.f29961d;
                    cVar.getClass();
                    C87412m.m108594g(mMActivity, "context");
                    if (baseFinderFeed.mo3513o().getStickyTime() > 0) {
                        z = true;
                    }
                    if (z) {
                        e0Var.mo107144g(5003, mMActivity.getString(C0966R.string.d2u), C0966R.raw.icons_outlined_top_off);
                    } else {
                        e0Var.mo107144g(5002, mMActivity.getString(C0966R.string.eom), C0966R.raw.icons_outlined_top);
                    }
                }
            }
        }
        super.mo2496t(baseFinderFeed, e0Var, nVar, oVar);
        if (this.f13453u == 16) {
            e0Var.removeItem(ITPEventID.RICH_MEDIA_SYNCHRONIZER_DESELECT_DONE);
            e0Var.removeItem(ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET);
        }
    }

    /* renamed from: t1 */
    public void mo2547t1(BaseFinderFeedLoader baseFinderFeedLoader, C9854m5 m5Var) {
        C58553c a;
        C58553c a2;
        C87412m.m108594g(baseFinderFeedLoader, "model");
        C87412m.m108594g(m5Var, "callback");
        super.mo2547t1(baseFinderFeedLoader, m5Var);
        this.f13455w.mo77389H1(this.f13452t, this.f29962e, new C2628a(this));
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f29961d);
        if (!(f == null || (a2 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a2.mo83450a(this.f13455w);
        }
        C10802c cVar = this.f13454v;
        cVar.getClass();
        C86709a0.m107524d().mo123455a(5909, cVar);
        C10802c cVar2 = this.f13454v;
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        cVar2.f32286d = baseFeedLoader instanceof BaseFinderFeedLoader ? (BaseFinderFeedLoader) baseFeedLoader : null;
        C8819z2 z2Var = this.f13456x;
        C2629b bVar = new C2629b(this);
        C9707f fVar = this.f29964g;
        z2Var.mo9646T0(bVar, fVar != null ? fVar.getRecyclerView() : null);
        if (this.f13453u == 7) {
            this.f13454v.f32287e = this.f29961d.getIntent().getIntExtra("key_activity_max_top_count", 3);
            this.f13458z = this.f29961d.getIntent().getStringExtra("key_creator_finder_name");
            FinderTopicTimelineUIContract$Presenter$onAttach$3 finderTopicTimelineUIContract$Presenter$onAttach$3 = new FinderTopicTimelineUIContract$Presenter$onAttach$3(this, C40008f.f107254d);
            this.f13457y = finderTopicTimelineUIContract$Presenter$onAttach$3;
            finderTopicTimelineUIContract$Presenter$onAttach$3.alive();
        }
        C13442s8 f2 = aVar.mo12873f(this.f29961d);
        if (f2 != null && (a = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) != null) {
            a.mo83450a(this.f13456x.mo9650n());
        }
    }

    /* renamed from: u0 */
    public boolean mo2497u0() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009c, code lost:
        r9 = r9.event;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2647x(com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r8, android.view.MenuItem r9, int r10, int r11, jq3.C60905o r12) {
        /*
            r7 = this;
            java.lang.String r0 = "feed"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "menuItem"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r12, r0)
            int r0 = r9.getItemId()
            r1 = 101(0x65, float:1.42E-43)
            r2 = 0
            java.lang.String r3 = "context"
            r4 = 1
            if (r0 == r1) goto L_0x008b
            switch(r0) {
                case 5001: goto L_0x0035;
                case 5002: goto L_0x002c;
                case 5003: goto L_0x0023;
                default: goto L_0x001e;
            }
        L_0x001e:
            super.mo2647x(r8, r9, r10, r11, r12)
            goto L_0x0115
        L_0x0023:
            mf1.c r9 = r7.f13454v
            com.tencent.mm.ui.MMActivity r10 = r7.f29961d
            r9.mo11041a(r10, r2, r8)
            goto L_0x0115
        L_0x002c:
            mf1.c r9 = r7.f13454v
            com.tencent.mm.ui.MMActivity r10 = r7.f29961d
            r9.mo11041a(r10, r4, r8)
            goto L_0x0115
        L_0x0035:
            mf1.c r9 = r7.f13454v
            com.tencent.mm.ui.MMActivity r10 = r7.f29961d
            r9.getClass()
            gy3.C87412m.m108594g(r10, r3)
            r9.f32290h = r8
            qo3.n r8 = r9.f32289g
            if (r8 != 0) goto L_0x007c
            qo3.n r8 = new qo3.n
            r8.<init>((android.content.Context) r10, (int) r4, (boolean) r4)
            android.content.res.Resources r11 = r10.getResources()
            r12 = 2131826103(0x7f1115b7, float:1.928508E38)
            java.lang.String r11 = r11.getString(r12)
            r12 = 17
            android.content.res.Resources r0 = r10.getResources()
            r1 = 2131165652(0x7f0701d4, float:1.7945527E38)
            int r0 = r0.getDimensionPixelSize(r1)
            r8.mo107568m(r11, r12, r0)
            mf1.e r11 = new mf1.e
            r11.<init>(r10)
            r8.f225771i = r11
            mf1.f r11 = new mf1.f
            r11.<init>(r9, r10)
            r8.f225782p = r11
            mf1.g r10 = new mf1.g
            r10.<init>(r9)
            r8.f225761d = r10
            r9.f32289g = r8
        L_0x007c:
            qo3.n r8 = r9.f32289g
            if (r8 == 0) goto L_0x0115
            boolean r9 = r8.mo107563h()
            if (r9 != 0) goto L_0x0115
            r8.mo107573q()
            goto L_0x0115
        L_0x008b:
            int r0 = r7.f13453u
            r1 = 7
            if (r0 != r1) goto L_0x0112
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r8.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r9 = r9.objectDesc
            if (r9 == 0) goto L_0x00a3
            te3.ef1 r9 = r9.event
            if (r9 == 0) goto L_0x00a3
            long r9 = r9.f132898d
            goto L_0x00a5
        L_0x00a3:
            r9 = 0
        L_0x00a5:
            com.tencent.mm.ui.MMActivity r12 = r7.f29961d
            gy3.C87412m.m108594g(r12, r3)
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r5 = 68
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r2] = r5
            java.lang.String r9 = o40.C61926c.m72691p(r9)
            r1[r4] = r9
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r10 = "https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&topic_id=%s"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            java.lang.String r10 = "format(format, *args)"
            gy3.C87412m.m108593f(r9, r10)
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            java.lang.String r1 = "rawUrl"
            r10.putExtra(r1, r9)
            java.lang.String r9 = "webview"
            java.lang.String r1 = ".ui.tools.WebViewUI"
            r2 = 0
            ke3.C88144b.m109791i(r12, r9, r1, r10, r2)
            com.tencent.mm.ui.MMActivity r9 = r7.f29961d
            java.lang.String r10 = "button_complaint"
            long r5 = r8.getItemId()
            gy3.C87412m.m108594g(r9, r3)
            dp1.f2 r8 = dp1.C7435f2.f25626a
            rs1.s8$a r12 = rs1.C13442s8.f38060Q0
            rs1.s8 r9 = r12.mo12873f(r9)
            if (r9 == 0) goto L_0x00f6
            te3.hj1 r2 = r9.mo12861q3()
        L_0x00f6:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            if (r11 != r4) goto L_0x00fe
            r0 = 1
        L_0x00fe:
            java.lang.String r11 = "from_action"
            r9.put(r11, r0)
            java.lang.String r11 = o40.C61926c.m72691p(r5)
            java.lang.String r12 = "feedid"
            r9.put(r12, r11)
            rx3.b0 r11 = rx3.C13598b0.f38549a
            r8.mo8577a(r2, r10, r4, r9)
            goto L_0x0115
        L_0x0112:
            super.mo2647x(r8, r9, r10, r11, r12)
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderTopicTimelineUIContract$Presenter.mo2647x(com.tencent.mm.plugin.finder.model.BaseFinderFeed, android.view.MenuItem, int, int, jq3.o):void");
    }
}
