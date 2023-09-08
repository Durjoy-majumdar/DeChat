package ce1;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedStickyEvent;
import com.tencent.p014mm.plugin.finder.activity.base.uic.FinderBaseContentUIC;
import com.tencent.p014mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter;
import gy3.C87412m;
import kf1.C10048y;
import on1.C11548q;
import te3.C52271zj0;

/* renamed from: ce1.g0 */
public class C0468g0 extends FinderBaseContentUIC {

    /* renamed from: p */
    public C11548q<C0740i2> f1152p;

    /* renamed from: q */
    public FinderCampaignFeedUIContract$TopicFeedPresenter f1153q;

    /* renamed from: r */
    public C10048y f1154r;

    /* renamed from: ce1.g0$a */
    public static final class C0469a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C0468g0 f1155d;

        public C0469a(C0468g0 g0Var) {
            this.f1155d = g0Var;
        }

        public final void run() {
            String str;
            C0468g0 g0Var = this.f1155d;
            C10048y yVar = g0Var.f1154r;
            if (yVar != null) {
                C52271zj0 zj02 = g0Var.f12462i;
                if (zj02 == null || (str = zj02.f146010i) == null) {
                    str = "";
                }
                yVar.mo10500K0(str);
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0468g0(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a8l;
    }

    /* renamed from: k3 */
    public void mo521k3(FeedStickyEvent feedStickyEvent) {
        if (feedStickyEvent != null && feedStickyEvent.f9169d.f9172c == 1001 && this.f12457d == 1) {
            FinderCampaignFeedUIContract$TopicFeedPresenter finderCampaignFeedUIContract$TopicFeedPresenter = this.f1153q;
            if (finderCampaignFeedUIContract$TopicFeedPresenter != null) {
                finderCampaignFeedUIContract$TopicFeedPresenter.requestRefresh();
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        }
    }

    /* renamed from: l3 */
    public void mo522l3() {
        C10048y yVar = this.f1154r;
        if (yVar != null) {
            TextView textView = yVar.f30795v;
            if (textView != null) {
                textView.setVisibility(0);
                return;
            }
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: m3 */
    public void mo523m3(C52271zj0 zj02) {
        String str;
        C10048y yVar = this.f1154r;
        if (yVar != null) {
            if (zj02 == null || (str = zj02.f146010i) == null) {
                str = "";
            }
            yVar.mo10500K0(str);
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0074, code lost:
        r5 = r5.getView();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r28) {
        /*
            r27 = this;
            r0 = r27
            super.onCreate(r28)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "topic:"
            r1.append(r2)
            java.lang.String r2 = r0.f12458e
            r1.append(r2)
            java.lang.String r2 = " topicType:"
            r1.append(r2)
            r2 = 7
            r1.append(r2)
            java.lang.String r3 = " tabType:"
            r1.append(r3)
            int r4 = r0.f12457d
            r1.append(r4)
            java.lang.String r4 = " eventTopicId:"
            r1.append(r4)
            long r4 = r0.f12460g
            r1.append(r4)
            java.lang.String r4 = " encryptedEventTopicId:"
            r1.append(r4)
            java.lang.String r4 = r0.f12461h
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "SimpleUIComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            java.lang.Class<rs1.s8> r1 = rs1.C13442s8.class
            kf1.y r14 = new kf1.y
            androidx.appcompat.app.AppCompatActivity r5 = r27.getActivity()
            java.lang.String r15 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r5, r15)
            r6 = r5
            com.tencent.mm.ui.MMActivity r6 = (com.tencent.p014mm.p136ui.MMActivity) r6
            boolean r10 = r0 instanceof ud1.C14174s
            r7 = 2
            r8 = 59
            r9 = 0
            r11 = 0
            r12 = 40
            r13 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r5 = r0.f12458e
            java.lang.String r6 = "<set-?>"
            gy3.C87412m.m108594g(r5, r6)
            r14.f30788o = r5
            r14.f30787n = r2
            androidx.fragment.app.Fragment r5 = r27.getFragment()
            if (r5 == 0) goto L_0x0084
            android.view.View r5 = r5.getView()
            if (r5 == 0) goto L_0x0084
            r8 = 2131312597(0x7f093fd5, float:1.8243567E38)
            android.view.View r5 = r5.findViewById(r8)
            com.tencent.mm.view.RefreshLoadMoreLayout r5 = (com.tencent.p014mm.view.RefreshLoadMoreLayout) r5
            goto L_0x0085
        L_0x0084:
            r5 = 0
        L_0x0085:
            if (r5 != 0) goto L_0x0099
            rx3.g r5 = r0.f12463j
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            ye1.c r5 = (ye1.C15968c) r5
            com.tencent.mm.view.RefreshLoadMoreLayout r5 = r5.f42865a
            java.lang.String r8 = "uiBinding.rlLayout"
            gy3.C87412m.m108593f(r5, r8)
        L_0x0099:
            r14.f30513h = r5
            r8 = 1
            r5.setSuperNestedScroll(r8)
            android.content.Intent r5 = r27.getIntent()
            r9 = 0
            java.lang.String r10 = "key_has_cover"
            boolean r5 = r5.getBooleanExtra(r10, r9)
            if (r5 == 0) goto L_0x00b4
            com.tencent.mm.view.RefreshLoadMoreLayout r5 = r14.f30513h
            r9 = 2131101688(0x7f0607f8, float:1.7815793E38)
            r5.setBackgroundResource(r9)
        L_0x00b4:
            int r5 = r0.f12457d
            r14.f30791r = r5
            androidx.fragment.app.Fragment r5 = r27.getFragment()
            if (r5 == 0) goto L_0x00cc
            android.view.View r5 = r5.getView()
            if (r5 == 0) goto L_0x00cc
            r9 = 2131301640(0x7f091508, float:1.8221344E38)
            android.view.View r5 = r5.findViewById(r9)
            goto L_0x00cd
        L_0x00cc:
            r5 = 0
        L_0x00cd:
            r14.f30793t = r5
            r0.f1154r = r14
            android.content.Intent r5 = r27.getIntent()
            r9 = 0
            java.lang.String r11 = "key_feed_ref_id"
            long r11 = r5.getLongExtra(r11, r9)
            bl3.r r5 = bl3.C39818r.f106831a
            androidx.fragment.app.Fragment r13 = r27.getFragment()
            gy3.C87412m.m108591d(r13)
            bl3.r$a r13 = r5.mo62445d(r13)
            androidx.lifecycle.i0 r13 = r13.mo75002a(r1)
            rs1.s8 r13 = (rs1.C13442s8) r13
            te3.hj1 r24 = r13.mo12861q3()
            long r13 = r0.f12460g
            r2 = 95
            int r16 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r16 != 0) goto L_0x0113
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = r0.f12457d
            r9.append(r10)
            r9.append(r2)
            java.lang.String r2 = r0.f12461h
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            goto L_0x0129
        L_0x0113:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = r0.f12457d
            r9.append(r10)
            r9.append(r2)
            long r13 = r0.f12460g
            r9.append(r13)
            java.lang.String r2 = r9.toString()
        L_0x0129:
            sd1.a r9 = new sd1.a
            int r10 = r0.f12457d
            int r17 = r0.mo316c3(r10)
            long r13 = r0.f12460g
            java.lang.Long r20 = java.lang.Long.valueOf(r11)
            java.lang.String r10 = r0.f12461h
            int r7 = r0.f12457d
            r23 = 0
            java.lang.String r8 = r0.f12459f
            r16 = r9
            r18 = r13
            r21 = r10
            r22 = r7
            r25 = r8
            r26 = r2
            r16.<init>(r17, r18, r20, r21, r22, r23, r24, r25, r26)
            sd1.c r7 = new sd1.c
            r7.<init>(r2)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "finderEventTopicId:"
            r8.append(r10)
            long r13 = r0.f12460g
            r8.append(r13)
            java.lang.String r10 = " refObjectId:"
            r8.append(r10)
            r8.append(r11)
            java.lang.String r10 = " cacheKey:"
            r8.append(r10)
            r8.append(r2)
            r8.append(r3)
            int r2 = r0.f12457d
            r8.append(r2)
            r2 = 32
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            on1.i0 r2 = new on1.i0
            kf1.y r3 = r0.f1154r
            java.lang.String r4 = "viewCallback"
            if (r3 == 0) goto L_0x02fa
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r3.f30513h
            r8 = 1
            r10 = 0
            r2.<init>(r3, r8, r10, r10)
            androidx.fragment.app.Fragment r3 = r27.getFragment()
            gy3.C87412m.m108591d(r3)
            bl3.r$a r3 = r5.mo62445d(r3)
            java.lang.Class<on1.q> r8 = on1.C11548q.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r8)
            java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.newloader.Loader<T of com.tencent.mm.plugin.finder.newloader.Loader.LoaderBuilder>"
            gy3.C87412m.m108592e(r3, r8)
            on1.q r3 = (on1.C11548q) r3
            r3.f33888f = r7
            r3.f33889g = r10
            r3.f33890h = r9
            r3.f33891i = r9
            r3.f33892j = r9
            r3.f33893n = r2
            r0.f1152p = r3
            int r2 = r0.f12457d
            r7 = 2
            if (r2 != r7) goto L_0x01fa
            on1.k r2 = new on1.k
            androidx.fragment.app.Fragment r18 = r27.getFragment()
            gy3.C87412m.m108591d(r18)
            r19 = 0
            r20 = 4
            r21 = 0
            r16 = r2
            r17 = r3
            r16.<init>(r17, r18, r19, r20, r21)
            java.lang.Class<lr.b> r3 = p599lr.C61381b.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            lr.b r3 = (p599lr.C61381b) r3
            qo1.g r3 = r3.mo78545UQ()
            r3.mo12412e(r2)
            com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedDeleteListener$1 r3 = r2.f33863g
            r3.alive()
            com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$liveUninterestedListener$1 r3 = r2.f33865i
            r3.alive()
            com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedChangeListener$1 r3 = r2.f33866j
            r3.alive()
            com.tencent.mm.plugin.finder.newloader.FinderDefaultLoaderActions$feedProgressListener$1 r2 = r2.f33864h
            r2.alive()
        L_0x01fa:
            com.tencent.mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter r2 = new com.tencent.mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter
            androidx.appcompat.app.AppCompatActivity r3 = r27.getActivity()
            gy3.C87412m.m108592e(r3, r15)
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
            on1.q<cm1.i2> r8 = r0.f1152p
            if (r8 == 0) goto L_0x02f3
            r9 = 59
            r2.<init>(r3, r7, r9, r8)
            java.lang.String r3 = r0.f12458e
            gy3.C87412m.m108594g(r3, r6)
            r2.f13017i = r3
            r3 = 7
            r2.f13016h = r3
            r0.f1153q = r2
            androidx.fragment.app.Fragment r2 = r27.getFragment()
            if (r2 == 0) goto L_0x0264
            kf1.y r3 = r0.f1154r
            if (r3 == 0) goto L_0x025f
            bl3.r$a r6 = r5.mo62445d(r2)
            androidx.lifecycle.i0 r1 = r6.mo75002a(r1)
            java.lang.String r6 = "UICProvider.of(fragment)…rReporterUIC::class.java)"
            gy3.C87412m.m108593f(r1, r6)
            rs1.s8 r1 = (rs1.C13442s8) r1
            rs1.s8$a r6 = rs1.C13442s8.f38060Q0
            r6 = -1
            ef1.f r1 = r1.mo12854j3(r6)
            if (r1 == 0) goto L_0x0245
            com.tencent.mm.view.RefreshLoadMoreLayout r6 = r3.f30513h
            androidx.recyclerview.widget.RecyclerView r6 = r6.getRecyclerView()
            r1.mo83455c(r6)
        L_0x0245:
            r3.f30792s = r2
            long r6 = r0.f12460g
            bl3.r$a r1 = r5.mo62445d(r2)
            java.lang.Class<rs1.l7> r2 = rs1.C13317l7.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            rs1.l7 r1 = (rs1.C13317l7) r1
            java.lang.String r2 = o40.C61926c.m72691p(r6)
            java.lang.String r3 = "activityid"
            r1.mo12758c3(r3, r2)
            goto L_0x0264
        L_0x025f:
            gy3.C87412m.m108603p(r4)
            r1 = 0
            throw r1
        L_0x0264:
            kf1.y r1 = r0.f1154r
            if (r1 == 0) goto L_0x02ee
            com.tencent.mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter r2 = r0.f1153q
            if (r2 == 0) goto L_0x02e7
            r1.f30511f = r2
            r2.f30444f = r1
            r2.mo2477n()
            kf1.o<T> r1 = r2.f30444f
            if (r1 == 0) goto L_0x028d
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.f30513h
            if (r1 == 0) goto L_0x028d
            on1.i0 r3 = new on1.i0
            kf1.k r4 = new kf1.k
            r4.<init>(r2)
            kf1.l r6 = new kf1.l
            r6.<init>(r2)
            r7 = 1
            r3.<init>(r1, r7, r4, r6)
            r2.f30445g = r3
        L_0x028d:
            on1.i0<T> r1 = r2.f30445g
            if (r1 == 0) goto L_0x029d
            on1.q<T> r3 = r2.f30443e
            r3.f33893n = r1
            kf1.m r4 = new kf1.m
            r4.<init>(r1)
            r3.mo11507j3(r4)
        L_0x029d:
            kf1.o<T> r1 = r2.f30444f
            if (r1 == 0) goto L_0x02d4
            int r3 = r2.f13016h
            r4 = 7
            if (r3 != r4) goto L_0x02b2
            com.tencent.mm.app.f r3 = com.tencent.p014mm.app.C40008f.f107254d
            com.tencent.mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter$initListener$1 r4 = new com.tencent.mm.plugin.finder.feed.FinderCampaignFeedUIContract$TopicFeedPresenter$initListener$1
            r4.<init>(r2, r3)
            r2.f13019n = r4
            r4.alive()
        L_0x02b2:
            on1.q<T> r3 = r2.f30443e
            kf1.w r4 = new kf1.w
            r4.<init>(r2)
            r3.mo11507j3(r4)
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.f30513h
            r1.getRecyclerView()
            java.lang.Class<ns3.d> r1 = ns3.C11266d.class
            bl3.r$a r1 = r5.mo62446e(r1)
            java.lang.Class<ns3.b> r3 = ns3.C11264b.class
            bl3.c r1 = r1.mo62447c(r3)
            ns3.b r1 = (ns3.C11264b) r1
            com.tencent.mm.ui.MMActivity r3 = r2.f30442d
            r1.mo11321n2(r3)
        L_0x02d4:
            on1.q<T> r4 = r2.f30443e
            r4.getClass()
            on1.t r7 = new on1.t
            r1 = 0
            r7.<init>(r4, r1)
            r5 = 0
            r6 = 0
            r8 = 3
            r9 = 0
            bl3.C0317e.launch$default(r4, r5, r6, r7, r8, r9)
            return
        L_0x02e7:
            java.lang.String r1 = "presenter"
            gy3.C87412m.m108603p(r1)
            r1 = 0
            throw r1
        L_0x02ee:
            r1 = 0
            gy3.C87412m.m108603p(r4)
            throw r1
        L_0x02f3:
            r1 = 0
            java.lang.String r2 = "newLoader"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x02fa:
            r1 = 0
            gy3.C87412m.m108603p(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ce1.C0468g0.onCreate(android.os.Bundle):void");
    }

    public void onPreDestroyed() {
        super.onPreDestroyed();
        FinderCampaignFeedUIContract$TopicFeedPresenter finderCampaignFeedUIContract$TopicFeedPresenter = this.f1153q;
        if (finderCampaignFeedUIContract$TopicFeedPresenter != null) {
            finderCampaignFeedUIContract$TopicFeedPresenter.onDetach();
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    public void setCoveredStyle() {
        getRootView().post(new C0469a(this));
    }
}
