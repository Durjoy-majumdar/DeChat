package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.View;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0751m0;
import cm1.C0768q0;
import cm1.C55031t;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.C56437x0;
import com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.view.C56597e1;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C7430d1;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C58556f;
import er1.C58739j4;
import fe1.C58961d;
import fe1.C58969q;
import fo1.C59264a;
import fo1.C8178c;
import fy3.C32224a;
import gy3.C87412m;
import ht1.C60172g4;
import ht1.C8819z2;
import j20.C117292a;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Pattern;
import jp3.C9486a;
import jp3.C9487b;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kf1.C10008v1;
import kotlin.Metadata;
import lp3.C88643g;
import nj3.C11182m0;
import nj3.C11183n0;
import nj3.C11184p0;
import nj3.C47269o0;
import o40.C61926c;
import qo3.C77407n;
import rs1.C13442s8;
import rs1.C63545b1;
import rs1.C63547e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36570n;
import vp1.C65838f;
import wc3.C15133e0;

@Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract;", "", "()V", "LikedTimelinePresenter", "LikedTimelineViewCallback", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract */
public final class FinderLikedFeedContract {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter;", "Lfo1/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback;", "Lkf1/v1;", "Ljp3/b;", "Ljp3/a;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter */
    public static final class LikedTimelinePresenter implements C59264a<LikedTimelineViewCallback>, C10008v1, C9487b<C9486a> {

        /* renamed from: d */
        public final MMActivity f15975d;

        /* renamed from: e */
        public final CopyOnWriteArraySet<C9486a> f15976e = new CopyOnWriteArraySet<>();

        /* renamed from: f */
        public final C15133e0 f15977f = ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0();

        /* renamed from: g */
        public final BaseFinderFeedLoader f15978g;

        /* renamed from: h */
        public final C13601g f15979h;

        /* renamed from: i */
        public C58555d f15980i;

        /* renamed from: j */
        public final C55776r f15981j;

        /* renamed from: n */
        public final C8819z2 f15982n;

        /* renamed from: o */
        public final String f15983o;

        /* renamed from: p */
        public LikedTimelineViewCallback f15984p;

        /* renamed from: q */
        public final FinderVideoCore f15985q;

        /* renamed from: r */
        public final C3393x2e7fba1e f15986r;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public LikedTimelinePresenter(com.tencent.p014mm.p136ui.MMActivity r12, java.lang.String r13, java.lang.String r14, java.util.LinkedList<java.lang.String> r15) {
            /*
                r11 = this;
                java.lang.String r0 = "context"
                gy3.C87412m.m108594g(r12, r0)
                java.lang.String r0 = "query"
                gy3.C87412m.m108594g(r13, r0)
                java.lang.String r0 = "requestId"
                gy3.C87412m.m108594g(r14, r0)
                java.lang.String r0 = "tags"
                gy3.C87412m.m108594g(r15, r0)
                r11.<init>()
                r11.f15975d = r12
                java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
                r0.<init>()
                r11.f15976e = r0
                java.lang.Class<wc3.e0> r0 = wc3.C15133e0.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                wc3.e0 r0 = (wc3.C15133e0) r0
                wc3.e0 r0 = r0.Ct0()
                r11.f15977f = r0
                bl3.r r0 = bl3.C39818r.f106831a
                bl3.r$a r1 = r0.mo62444c(r12)
                java.lang.Class<rs1.s8> r2 = rs1.C13442s8.class
                androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
                rs1.s8 r1 = (rs1.C13442s8) r1
                te3.hj1 r3 = r1.mo12861q3()
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
                java.lang.String r9 = "context.intent"
                r10 = 1
                if (r1 == 0) goto L_0x0071
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r15)
                if (r1 == 0) goto L_0x0071
                com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader r13 = new com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader
                tf1.i r14 = tf1.C13908i.FEED_LIKED_TIMELINE
                r13.<init>(r10, r14, r3)
                android.content.Intent r14 = r12.getIntent()
                gy3.C87412m.m108593f(r14, r9)
                r13.initFromCache(r14)
                com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$1$1 r14 = new com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$1$1
                r14.<init>(r11, r13)
                r13.setInitDone(r14)
                com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$1$2 r14 = new com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$1$2
                r14.<init>(r11)
                r13.f13710g = r14
                goto L_0x0096
            L_0x0071:
                com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader r1 = new com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader
                r4 = 1
                r8 = 1
                r2 = r1
                r5 = r13
                r6 = r14
                r7 = r15
                r2.<init>(r3, r4, r5, r6, r7, r8)
                android.content.Intent r13 = r12.getIntent()
                gy3.C87412m.m108593f(r13, r9)
                r1.initFromCache(r13)
                com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$2$1 r13 = new com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$2$1
                r13.<init>(r11, r1)
                r1.setInitDone(r13)
                com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$2$2 r13 = new com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$2$2
                r13.<init>(r11)
                r1.f13660i = r13
                r13 = r1
            L_0x0096:
                r11.f15978g = r13
                com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$mediaBannerViewPool$2 r13 = com.tencent.p014mm.plugin.finder.presenter.contract.C3408xa1b96142.f16035d
                rx3.g r13 = rx3.C36568h.m40985a(r13)
                r11.f15979h = r13
                bl3.r$a r13 = r0.mo62444c(r12)
                java.lang.Class<rs1.c1> r14 = rs1.C13133c1.class
                androidx.lifecycle.i0 r13 = r13.mo75002a(r14)
                rs1.c1 r13 = (rs1.C13133c1) r13
                com.tencent.mm.plugin.finder.feed.model.r r13 = r13.f37371d
                r11.f15981j = r13
                bl3.r$a r12 = r0.mo62444c(r12)
                java.lang.Class<ht1.y2> r13 = ht1.C8817y2.class
                bl3.c r12 = r12.mo62447c(r13)
                ht1.y2 r12 = (ht1.C8817y2) r12
                ht1.z2 r12 = r12.mo9643v2()
                r11.f15982n = r12
                java.lang.String r12 = "Finder.FinderLikedFeedContract.LikedTimelinePresenter"
                r11.f15983o = r12
                com.tencent.mm.plugin.finder.video.FinderVideoCore r12 = new com.tencent.mm.plugin.finder.video.FinderVideoCore
                r13 = 0
                r14 = 0
                r12.<init>(r13, r10, r14)
                r11.f15985q = r12
                com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$feedExposeInfoChangeListener$1 r12 = new com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$feedExposeInfoChangeListener$1
                r12.<init>(r11)
                r11.f15986r = r12
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract.LikedTimelinePresenter.<init>(com.tencent.mm.ui.MMActivity, java.lang.String, java.lang.String, java.util.LinkedList):void");
        }

        /* renamed from: A1 */
        public C11182m0 mo2569A1(BaseFinderFeed baseFinderFeed, C77407n nVar) {
            C87412m.m108594g(baseFinderFeed, "feed");
            C87412m.m108594g(nVar, "sheet");
            return new C3397xd17b6a0d(baseFinderFeed, this, nVar);
        }

        /* renamed from: B5 */
        public C11182m0 mo2570B5(BaseFinderFeed baseFinderFeed, C77407n nVar) {
            C87412m.m108594g(baseFinderFeed, "feed");
            C87412m.m108594g(nVar, "sheet");
            return C3399xdbd050dc.f16015d;
        }

        /* renamed from: D1 */
        public RecyclerView.C16623q mo2571D1() {
            return (RecyclerView.C16623q) ((C36570n) this.f15979h).getValue();
        }

        /* renamed from: J0 */
        public void mo2572J0(BaseFinderFeed baseFinderFeed, boolean z, int i) {
            int i2;
            C87412m.m108594g(baseFinderFeed, "feed");
            C0751m0.m691b(C0751m0.f1769a, this.f15975d, ((C13442s8) C39818r.f106831a.mo62444c(this.f15975d).mo75002a(C13442s8.class)).mo12861q3(), baseFinderFeed, z ? 1 : 2, false, i, 16, (Object) null);
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

        /* renamed from: X2 */
        public C11184p0 mo2573X2(BaseFinderFeed baseFinderFeed, C60905o oVar) {
            C87412m.m108594g(baseFinderFeed, "feed");
            C87412m.m108594g(oVar, "holder");
            return C3407xfaead96e.f16033d;
        }

        /* renamed from: Y4 */
        public C11184p0 mo2574Y4(BaseFinderFeed baseFinderFeed, int i, C60905o oVar, C32224a<C13598b0> aVar) {
            C87412m.m108594g(baseFinderFeed, "feed");
            C87412m.m108594g(oVar, "holder");
            return new C3401x1209cddc(aVar, this, oVar, baseFinderFeed, i);
        }

        /* renamed from: d7 */
        public C11182m0 mo2568d7(BaseFinderFeed baseFinderFeed, C77407n nVar, C60905o oVar) {
            C87412m.m108594g(baseFinderFeed, "feed");
            C87412m.m108594g(nVar, "sheet");
            C87412m.m108594g(oVar, "holder");
            return new C3398x66d0f71e(this, baseFinderFeed, nVar);
        }

        /* renamed from: e */
        public void mo3738e(LikedTimelineViewCallback likedTimelineViewCallback) {
            C58553c a;
            C58553c a2;
            C58553c a3;
            C87412m.m108594g(likedTimelineViewCallback, "callback");
            this.f15984p = likedTimelineViewCallback;
            this.f15986r.alive();
            FinderVideoCore finderVideoCore = this.f15985q;
            LikedTimelineViewCallback likedTimelineViewCallback2 = this.f15984p;
            C87412m.m108591d(likedTimelineViewCallback2);
            FinderVideoCore.m65069F1(finderVideoCore, likedTimelineViewCallback2.f15989f, new FinderLikedFeedContract$LikedTimelinePresenter$initVideoAbout$1(this), false, 4, (Object) null);
            this.f15981j.mo77389H1(2, 2, new FinderLikedFeedContract$LikedTimelinePresenter$onAttach$1(this));
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C13442s8 f = aVar.mo12873f(this.f15975d);
            C58553c cVar = null;
            if (!(f == null || (a3 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
                a3.mo83450a(this.f15981j);
            }
            C8819z2 z2Var = this.f15982n;
            FinderLikedFeedContract$LikedTimelinePresenter$onAttach$2 finderLikedFeedContract$LikedTimelinePresenter$onAttach$2 = new FinderLikedFeedContract$LikedTimelinePresenter$onAttach$2(this);
            LikedTimelineViewCallback likedTimelineViewCallback3 = this.f15984p;
            z2Var.mo9646T0(finderLikedFeedContract$LikedTimelinePresenter$onAttach$2, likedTimelineViewCallback3 != null ? likedTimelineViewCallback3.getRecyclerView() : null);
            C13442s8 f2 = aVar.mo12873f(this.f15975d);
            if (!(f2 == null || (a2 = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) == null)) {
                a2.mo83450a(this.f15982n.mo9650n());
            }
            C39818r rVar = C39818r.f106831a;
            this.f15980i = new C7430d1(((C13442s8) rVar.mo62444c(this.f15975d).mo75002a(C13442s8.class)).mo12861q3()).f25618b;
            C13442s8 f3 = aVar.mo12873f(this.f15975d);
            if (!(f3 == null || (a = C60172g4.C60173a.m70189a(f3, 0, 1, (Object) null)) == null)) {
                C58555d dVar = this.f15980i;
                if (dVar != null) {
                    a.mo83450a(dVar);
                } else {
                    C87412m.m108603p("observerForExposeReport");
                    throw null;
                }
            }
            ((FinderFeedMegaVideoBtnAnimUIC) rVar.mo62444c(this.f15975d).mo75002a(FinderFeedMegaVideoBtnAnimUIC.class)).mo80031d3(likedTimelineViewCallback.getRecyclerView());
            likedTimelineViewCallback.getRecyclerView().post(new FinderLikedFeedContract$LikedTimelinePresenter$onAttach$3(this));
            boolean z = MediaPreloadCore.f160304p;
            if (MediaPreloadCore.f160304p) {
                C63547e eVar = (C63547e) rVar.mo62444c(this.f15975d).mo75002a(C63547e.class);
                DataBuffer dataListJustForAdapter = this.f15978g.getDataListJustForAdapter();
                FinderVideoCore finderVideoCore2 = this.f15985q;
                C13442s8 f4 = aVar.mo12873f(this.f15975d);
                if (f4 != null) {
                    cVar = C60172g4.C60173a.m70189a(f4, 0, 1, (Object) null);
                }
                eVar.mo88403c3(dataListJustForAdapter, 0, finderVideoCore2, cVar, -1);
            }
        }

        /* renamed from: f5 */
        public C47269o0 mo2575f5(C77407n nVar, BaseFinderFeed baseFinderFeed, int i, C60905o oVar) {
            C87412m.m108594g(nVar, "bottomSheet");
            C87412m.m108594g(baseFinderFeed, "feed");
            C87412m.m108594g(oVar, "holder");
            return new C3400x91c4d978(this, nVar);
        }

        public MMActivity getActivity() {
            return this.f15975d;
        }

        public void keep(C9486a aVar) {
            C87412m.m108594g(aVar, "p0");
            this.f15976e.add(aVar);
        }

        /* renamed from: n6 */
        public void mo2577n6(FinderItem finderItem, boolean z, C60905o oVar, int i) {
            C87412m.m108594g(finderItem, "feed");
            C55031t.f154490a.mo76085a(this.f15975d, finderItem, z, 2, i);
        }

        public void onDetach() {
            C58553c a;
            C58553c a2;
            C58553c a3;
            this.f15981j.onDetach();
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C13442s8 f = aVar.mo12873f(this.f15975d);
            if (!(f == null || (a3 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
                a3.mo83453d(this.f15981j);
            }
            this.f15982n.onDetach();
            C13442s8 f2 = aVar.mo12873f(this.f15975d);
            if (!(f2 == null || (a2 = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) == null)) {
                a2.mo83453d(this.f15982n.mo9650n());
            }
            C65838f.f189333a.mo89882c();
            for (C9486a dead : this.f15976e) {
                dead.dead();
            }
            C13442s8 f3 = C13442s8.f38060Q0.mo12873f(this.f15975d);
            if (!(f3 == null || (a = C60172g4.C60173a.m70189a(f3, 0, 1, (Object) null)) == null)) {
                C58555d dVar = this.f15980i;
                if (dVar != null) {
                    a.mo83453d(dVar);
                } else {
                    C87412m.m108603p("observerForExposeReport");
                    throw null;
                }
            }
            this.f15976e.clear();
            this.f15984p = null;
            this.f15986r.dead();
            this.f15977f.dead();
        }

        /* renamed from: p1 */
        public FinderVideoCore mo2578p1() {
            return this.f15985q;
        }

        /* renamed from: r5 */
        public C56597e1 mo2579r5() {
            return ((C63545b1) C39818r.f106831a.mo62444c(this.f15975d).mo75002a(C63545b1.class)).f180225d;
        }

        /* renamed from: u0 */
        public boolean mo2497u0() {
            return false;
        }

        /* renamed from: u4 */
        public C11183n0 mo2580u4(BaseFinderFeed baseFinderFeed, C77407n nVar) {
            C87412m.m108594g(baseFinderFeed, "feed");
            C87412m.m108594g(nVar, "sheet");
            return new C3406xe76bb392(this, baseFinderFeed);
        }

        /* renamed from: v3 */
        public void mo2581v3(BaseFinderFeed baseFinderFeed, boolean z, boolean z2, int i, boolean z3) {
            BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
            C87412m.m108594g(baseFinderFeed, "feed");
            C0768q0.f1810a.mo710a(((C13442s8) C39818r.f106831a.mo62444c(this.f15975d).mo75002a(C13442s8.class)).mo12861q3(), i, baseFinderFeed.mo3513o(), z, z2, 2, baseFinderFeed.mo3468B(), z3, C58739j4.f168176a.mo83688Q(baseFinderFeed.mo3507l()));
        }

        /* renamed from: w1 */
        public C11182m0 mo2582w1(BaseFinderFeed baseFinderFeed, C77407n nVar, int i) {
            C87412m.m108594g(baseFinderFeed, "feed");
            C87412m.m108594g(nVar, "sheet");
            return new C3394x32abef4a(this, baseFinderFeed, i, nVar);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback;", "Lfo1/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback */
    public static final class LikedTimelineViewCallback implements C8178c<LikedTimelinePresenter> {

        /* renamed from: d */
        public final String f15987d = "Finder.FinderProfileContract.LikedTimelineViewCallback";

        /* renamed from: e */
        public final LikedTimelinePresenter f15988e;

        /* renamed from: f */
        public final MMActivity f15989f;

        /* renamed from: g */
        public RefreshLoadMoreLayout f15990g;

        /* renamed from: h */
        public RecyclerView f15991h;

        /* renamed from: i */
        public View f15992i;

        public LikedTimelineViewCallback(MMActivity mMActivity, LikedTimelinePresenter likedTimelinePresenter) {
            C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(likedTimelinePresenter, "presenter");
            this.f15988e = likedTimelinePresenter;
            this.f15989f = mMActivity;
        }

        /* renamed from: a */
        public final void mo3739a() {
            View findViewById = this.f15989f.findViewById(C0966R.C0970id.cjg);
            C87412m.m108593f(findViewById, "context.findViewById(R.id.empty_view)");
            this.f15992i = findViewById;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelineViewCallback", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = this.f15989f.findViewById(C0966R.C0970id.ivb);
            C87412m.m108593f(findViewById2, "context.findViewById(R.id.rl_layout)");
            this.f15990g = (RefreshLoadMoreLayout) findViewById2;
            RecyclerView recyclerView = mo3741p().getRecyclerView();
            this.f15991h = recyclerView;
            if (recyclerView != null) {
                FinderLinearLayoutManager finderLinearLayoutManager = new FinderLinearLayoutManager(this.f15989f);
                finderLinearLayoutManager.f162360w = 25.0f;
                finderLinearLayoutManager.f162361x = 100;
                recyclerView.setLayoutManager(finderLinearLayoutManager);
                RecyclerView recyclerView2 = this.f15991h;
                if (recyclerView2 != null) {
                    LikedTimelinePresenter likedTimelinePresenter = this.f15988e;
                    likedTimelinePresenter.getClass();
                    recyclerView2.setAdapter(new WxRecyclerAdapter(new C3388x3f85a07f(likedTimelinePresenter), this.f15988e.f15978g.getDataList(), false));
                    mo3741p().setActionCallback(new FinderLikedFeedContract$LikedTimelineViewCallback$initView$2(this, this.f15989f.findViewById(C0966R.C0970id.bso)));
                    C56437x0 x0Var = new C56437x0();
                    RecyclerView recyclerView3 = this.f15991h;
                    if (recyclerView3 != null) {
                        x0Var.mo75025b(recyclerView3);
                        Pattern pattern = C61926c.f176038a;
                        C61926c.m72701z(C88643g.m110546d(), new FinderLikedFeedContract$LikedTimelineViewCallback$initView$3(this));
                        C39622i0 a = C39818r.f106831a.mo62444c(this.f15989f).mo75002a(C13442s8.class);
                        C87412m.m108593f(a, "UICProvider.of(context).…rReporterUIC::class.java)");
                        C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
                        C58556f j3 = ((C13442s8) a).mo12854j3(-1);
                        if (j3 != null) {
                            RecyclerView recyclerView4 = this.f15991h;
                            if (recyclerView4 != null) {
                                j3.mo83455c(recyclerView4);
                            } else {
                                C87412m.m108603p("recyclerView");
                                throw null;
                            }
                        }
                        RecyclerView recyclerView5 = this.f15991h;
                        if (recyclerView5 == null) {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        } else if ((recyclerView5 instanceof FinderRecyclerView) && (recyclerView5.getLayoutManager() instanceof LinearLayoutManager)) {
                            RecyclerView recyclerView6 = this.f15991h;
                            if (recyclerView6 != null) {
                                RecyclerView.LayoutManager layoutManager = recyclerView6.getLayoutManager();
                                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                                FinderRecyclerView.m63293z1((FinderRecyclerView) recyclerView6, (LinearLayoutManager) layoutManager, (String) null, 2, (Object) null);
                                return;
                            }
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("recyclerView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }

        public MMFragmentActivity getActivity() {
            return this.f15989f;
        }

        public final RecyclerView getRecyclerView() {
            RecyclerView recyclerView = this.f15991h;
            if (recyclerView != null) {
                return recyclerView;
            }
            C87412m.m108603p("recyclerView");
            throw null;
        }

        /* renamed from: p */
        public final RefreshLoadMoreLayout mo3741p() {
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f15990g;
            if (refreshLoadMoreLayout != null) {
                return refreshLoadMoreLayout;
            }
            C87412m.m108603p("rlLayout");
            throw null;
        }
    }

    static {
        new FinderLikedFeedContract();
    }

    private FinderLikedFeedContract() {
    }
}
