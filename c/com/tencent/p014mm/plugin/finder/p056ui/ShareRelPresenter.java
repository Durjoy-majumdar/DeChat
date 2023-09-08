package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C0751m0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedDeleteEvent;
import com.tencent.p014mm.autogen.events.FinderShareGuideShowEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.recyclerview.DynamicViewCacheExtension;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.ContactUninterestEventListener;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.ITPEventID;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import dp1.C20480e0;
import en3.C97675c;
import en3.C97680h;
import er1.C58739j4;
import er1.C58784w3;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32226l;
import gy3.C24564k0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C60905o;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import kf1.C10037x1;
import kf1.C9707f;
import kf1.C9854m5;
import mf1.C10820g1;
import nj3.C76874e0;
import nj3.C76912y0;
import pe1.C35464c;
import qo3.C77407n;
import rs1.C13426s1;
import rs1.C13442s8;
import rx3.C13598b0;
import sf1.C13672b;
import sx3.C64197v;
import te3.C50687oi1;
import up1.C37521f;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.ui.ShareRelPresenter */
public final class ShareRelPresenter extends C10037x1 {

    /* renamed from: K */
    public boolean f17206K;

    /* renamed from: L */
    public String f17207L = "Finder.FinderShareFeedDetailUI";

    /* renamed from: M */
    public ContactUninterestEventListener f17208M;

    /* renamed from: N */
    public final LinkedList<IListener<FinderShareGuideShowEvent>> f17209N = new LinkedList<>();

    /* renamed from: P */
    public Long f17210P = 0L;

    /* renamed from: Q */
    public int f17211Q;

    /* renamed from: R */
    public int f17212R = -1;

    /* renamed from: S */
    public BaseFinderFeed f17213S;

    /* renamed from: T */
    public boolean f17214T;

    /* renamed from: U */
    public boolean f17215U;

    /* renamed from: V */
    public boolean f17216V;

    /* renamed from: W */
    public final ShareRelPresenter$feedProgressListener$1 f17217W;

    /* renamed from: com.tencent.mm.plugin.finder.ui.ShareRelPresenter$a */
    public static final class C3762a extends C87413o implements C32226l<Integer, List<? extends Long>> {

        /* renamed from: d */
        public final /* synthetic */ ShareRelPresenter f17218d;

        /* renamed from: e */
        public final /* synthetic */ int f17219e;

        /* renamed from: f */
        public final /* synthetic */ BaseFinderFeed f17220f;

        /* renamed from: g */
        public final /* synthetic */ boolean f17221g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3762a(ShareRelPresenter shareRelPresenter, int i, BaseFinderFeed baseFinderFeed, boolean z) {
            super(1);
            this.f17218d = shareRelPresenter;
            this.f17219e = i;
            this.f17220f = baseFinderFeed;
            this.f17221g = z;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            LinkedList linkedList = new LinkedList();
            String str = this.f17218d.f17207L;
            Log.m105924i(str, "[not interested] removeAt " + this.f17219e + " subType=" + intValue + ' ' + this.f17220f.mo3513o());
            linkedList.add(Long.valueOf(this.f17220f.mo3513o().getCreateTime()));
            if (this.f17221g) {
                FeedDeleteEvent feedDeleteEvent = new FeedDeleteEvent();
                feedDeleteEvent.f9154d.f9155a = this.f17220f.mo3513o().getId();
                feedDeleteEvent.publish();
            } else {
                ShareRelPresenter shareRelPresenter = this.f17218d;
                shareRelPresenter.f17213S = this.f17220f;
                shareRelPresenter.f17212R = this.f17219e;
            }
            Long l = this.f17218d.f17210P;
            long id = this.f17220f.mo3513o().getId();
            if (l != null && l.longValue() == id) {
                this.f17218d.f17214T = true;
            }
            return linkedList;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.ShareRelPresenter$b */
    public static final class C3763b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ShareRelPresenter f17222d;

        public C3763b(ShareRelPresenter shareRelPresenter) {
            this.f17222d = shareRelPresenter;
        }

        public final void run() {
            C20480e0.f57583a.mo32029b(this.f17222d.f29967j);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.ShareRelPresenter$c */
    public static final class C3764c extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C9854m5 f17223d;

        /* renamed from: e */
        public final /* synthetic */ ShareRelPresenter f17224e;

        public C3764c(C9854m5 m5Var, ShareRelPresenter shareRelPresenter) {
            this.f17223d = m5Var;
            this.f17224e = shareRelPresenter;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            DataBuffer<C0740i2> dataListJustForAdapter;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/ShareRelPresenter$onAttach$7", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                RecyclerView.LayoutManager layoutManager = this.f17223d.getRecyclerView().getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int C = ((LinearLayoutManager) layoutManager).mo16957C();
                RecyclerView.LayoutManager layoutManager2 = this.f17223d.getRecyclerView().getLayoutManager();
                C87412m.m108592e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int E = ((LinearLayoutManager) layoutManager2).mo16959E();
                ShareRelPresenter shareRelPresenter = this.f17224e;
                int i2 = shareRelPresenter.f17212R;
                if (!(i2 == -1 || shareRelPresenter.f17213S == null || C == i2 || C != E)) {
                    BaseFeedLoader<C0740i2> baseFeedLoader = shareRelPresenter.f13124s;
                    if (!(baseFeedLoader == null || (dataListJustForAdapter = baseFeedLoader.getDataListJustForAdapter()) == null)) {
                        C24564k0.m30737a(dataListJustForAdapter).remove(this.f17224e.f17213S);
                    }
                    C9707f fVar = this.f17224e.f29964g;
                    if (fVar != null) {
                        fVar.mo10312p().notifyItemRemoved(this.f17224e.f17212R);
                    }
                    ShareRelPresenter shareRelPresenter2 = this.f17224e;
                    shareRelPresenter2.f17212R = -1;
                    shareRelPresenter2.f17213S = null;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/ShareRelPresenter$onAttach$7", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/ShareRelPresenter$onAttach$7", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/ShareRelPresenter$onAttach$7", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareRelPresenter(int i, MMActivity mMActivity, boolean z, int i2, boolean z2) {
        super(i, mMActivity, z, false, i2, 8, (C8480h) null);
        C87412m.m108594g(mMActivity, "context");
        this.f17206K = z2;
        this.f17217W = new ShareRelPresenter$feedProgressListener$1(mMActivity, this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: cm1.i2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2545A7(com.tencent.p014mm.view.RefreshLoadMoreLayout.C7080c<java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "reason"
            gy3.C87412m.m108594g(r12, r0)
            super.mo2545A7(r12)
            dp1.e0 r1 = dp1.C20480e0.f57583a
            int r2 = r11.f29967j
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 60
            r10 = 0
            dp1.C20480e0.m22094n(r1, r2, r3, r4, r5, r6, r8, r9, r10)
            boolean r0 = r12.f24954i
            r1 = 1
            if (r0 == 0) goto L_0x0059
            boolean r0 = r12.f24951f
            if (r0 == 0) goto L_0x0059
            kf1.f r0 = r11.f29964g
            if (r0 == 0) goto L_0x0059
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            if (r0 == 0) goto L_0x0059
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r0.getLayoutManager()
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager"
            gy3.C87412m.m108592e(r2, r3)
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager r2 = (com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager) r2
            int r2 = r2.mo16957C()
            int r2 = r2 + r1
            java.lang.String r3 = r11.f17207L
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[smoothScrollToNextPosition] nextPosition="
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.mm.plugin.finder.ui.n4 r3 = new com.tencent.mm.plugin.finder.ui.n4
            r3.<init>(r0, r2)
            r0.post(r3)
        L_0x0059:
            boolean r12 = r12.f24951f
            if (r12 == 0) goto L_0x009c
            bl3.r r12 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r0 = r11.f29961d
            bl3.r$a r12 = r12.mo62444c(r0)
            java.lang.Class<rs1.v3> r0 = rs1.C13484v3.class
            androidx.lifecycle.i0 r12 = r12.mo75002a(r0)
            rs1.v3 r12 = (rs1.C13484v3) r12
            kf1.f r0 = r11.f29964g
            r2 = 0
            if (r0 == 0) goto L_0x0077
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            goto L_0x0078
        L_0x0077:
            r0 = r2
        L_0x0078:
            r12.f38206d = r0
            if (r0 == 0) goto L_0x0084
            rs1.w3 r3 = new rs1.w3
            r3.<init>(r12)
            r0.mo17043c(r3)
        L_0x0084:
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r0 = r11.f13124s
            if (r0 == 0) goto L_0x0095
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataListJustForAdapter()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r1)
            r2 = r0
            cm1.i2 r2 = (cm1.C0740i2) r2
        L_0x0095:
            r12.mo12893d3(r2)
            r0 = 0
            r12.mo12892c3(r0)
        L_0x009c:
            r11.mo4147C1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.ShareRelPresenter.mo2545A7(com.tencent.mm.view.RefreshLoadMoreLayout$c):void");
    }

    /* renamed from: C1 */
    public final void mo4147C1() {
        C9707f fVar;
        RefreshLoadMoreLayout D;
        RefreshLoadMoreLayout D2;
        if (!this.f17216V) {
            C9707f fVar2 = this.f29964g;
            boolean z = false;
            if (!(fVar2 == null || (D2 = fVar2.mo10308D()) == null || !D2.getEnableLoadMore())) {
                z = true;
            }
            if (z) {
                this.f17216V = true;
                int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_SHARE_PREFETCH_LAST_FEED_OUNT_INT_SYNC, 3);
                String str = this.f17207L;
                Log.m105924i(str, "addLoadMorePreload: add load more preload, loadMoreThreshold=" + j);
                if (j > 0 && (fVar = this.f29964g) != null && (D = fVar.mo10308D()) != null) {
                    D.getRecyclerView().mo17043c(new C10820g1(this.f17207L, D, j));
                }
            }
        }
    }

    /* renamed from: J0 */
    public void mo2572J0(BaseFinderFeed baseFinderFeed, boolean z, int i) {
        C87412m.m108594g(baseFinderFeed, "feed");
        int i2 = 0;
        C0751m0.f1769a.mo706a(this.f29961d, ((C13442s8) C39818r.f106831a.mo62444c(this.f29961d).mo75002a(C13442s8.class)).mo12861q3(), baseFinderFeed, z ? 1 : 2, true, this.f29961d.getIntent().getBooleanExtra("is_from_ad", false) ? 22 : i);
        C58961d.C58963b bVar = C58961d.f168673a;
        C58969q l = baseFinderFeed.mo3507l();
        String username = l != null ? l.getUsername() : "";
        if (z) {
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C58969q.f168705a2;
            i2 = C58969q.f168707c2;
        } else {
            IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = C58969q.f168705a2;
        }
        bVar.mo84161i(username, i2);
    }

    /* renamed from: M0 */
    public boolean mo4148M0(BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(baseFinderFeed, "feed");
        if (!mo10275L0(baseFinderFeed)) {
            if (this.f29967j != 1001) {
                Long l = this.f17210P;
                long id = baseFinderFeed.mo3513o().getId();
                if (!(l == null || l.longValue() != id || this.f17211Q == 16)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public String mo2546N() {
        return this.f17207L;
    }

    /* renamed from: U */
    public C9500j mo2488U() {
        return new ShareRelPresenter$buildItemCoverts$1(this);
    }

    /* renamed from: j0 */
    public void mo4149j0(BaseFinderFeed baseFinderFeed, int i) {
        RefreshLoadMoreLayout D;
        RefreshLoadMoreLayout D2;
        RefreshLoadMoreLayout D3;
        C87412m.m108594g(baseFinderFeed, "feed");
        int e = mo2490e(baseFinderFeed);
        if (e >= 0) {
            ArrayList<C0740i2> n = mo2492n();
            boolean z = false;
            boolean z2 = (n != null ? n.size() : 0) > 1;
            C13672b.f38719a.mo13059a(this.f29961d, baseFinderFeed.mo3513o().getId(), baseFinderFeed.mo3513o().getObjectNonceId(), Boolean.FALSE, new C3762a(this, i, baseFinderFeed, z2));
            View view = null;
            if (!z2) {
                C9707f fVar = this.f29964g;
                if (!(fVar == null || (D3 = fVar.mo10308D()) == null)) {
                    view = D3.getLoadMoreFooter();
                }
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/ShareRelPresenter", "handleNoInterest", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/ui/ShareRelPresenter", "handleNoInterest", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C9707f fVar2 = this.f29964g;
                if (!(fVar2 == null || (D2 = fVar2.mo10308D()) == null)) {
                    D2.mo82498t();
                }
            } else {
                C9707f fVar3 = this.f29964g;
                if (!(fVar3 == null || (D = fVar3.mo10308D()) == null)) {
                    view = D.getLoadMoreFooter();
                }
                if (view != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(4);
                    View view3 = view;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/ShareRelPresenter", "handleNoInterest", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/ui/ShareRelPresenter", "handleNoInterest", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            C50687oi1 oi12 = C66785b.f191882e.mo90673n0().mo62397b().f140461E;
            if (oi12 != null && oi12.f139196d == 1) {
                z = true;
            }
            String string = z ? this.f29961d.getResources().getString(C0966R.string.f8158pz) : this.f29961d.getResources().getString(C0966R.string.emj);
            C87412m.m108593f(string, "if(FinderAccountAccess.a…mmendation)\n            }");
            C76912y0.m92769h(this.f29961d, string, C0966R.raw.icons_filled_done);
            return;
        }
        String str = this.f17207L;
        Log.m105924i(str, "[UNINTEREST] pos error " + e);
    }

    public void onDetach() {
        super.onDetach();
        ContactUninterestEventListener contactUninterestEventListener = this.f17208M;
        if (contactUninterestEventListener != null) {
            contactUninterestEventListener.dead();
        }
        this.f17217W.dead();
        for (IListener dead : this.f17209N) {
            dead.dead();
        }
    }

    public void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        super.onRefreshEnd(cVar);
        C20480e0.m22094n(C20480e0.f57583a, this.f29967j, false, ((C13442s8) C39818r.f106831a.mo62444c(this.f29961d).mo75002a(C13442s8.class)).mo12861q3(), false, 0, false, 56, (Object) null);
    }

    /* renamed from: q */
    public void mo4150q(BaseFinderFeed baseFinderFeed, C76874e0 e0Var, C77407n nVar, int i) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(e0Var, "menu");
        C87412m.m108594g(nVar, "sheet");
        super.mo4150q(baseFinderFeed, e0Var, nVar, i);
        if (this.f17206K) {
            e0Var.removeItem(103);
            e0Var.removeItem(114);
        }
    }

    /* renamed from: t */
    public void mo2496t(BaseFinderFeed baseFinderFeed, C76874e0 e0Var, C77407n nVar, C60905o oVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(e0Var, "menu");
        C87412m.m108594g(nVar, "sheet");
        C87412m.m108594g(oVar, "holder");
        if (this.f29967j == 1001 && mo10275L0(baseFinderFeed) && !C58739j4.f168176a.mo83686O(baseFinderFeed)) {
            e0Var.mo107135b(108, C0966R.string.f7944x1, C0966R.raw.icons_outlined_delete);
            MMActivity mMActivity = this.f29961d;
            C87412m.m108594g(mMActivity, "context");
            if (baseFinderFeed.mo3513o().isCommentClose() || !C58784w3.f168295a.mo83889N0()) {
                e0Var.mo107144g(107, mMActivity.getString(C0966R.string.d9v), C0966R.raw.icons_outlined_comment);
            } else {
                e0Var.mo107144g(106, mMActivity.getString(C0966R.string.d8r), C0966R.raw.icons_outlined_comment_close);
            }
        }
        super.mo2496t(baseFinderFeed, e0Var, nVar, oVar);
        if (this.f17206K) {
            e0Var.removeItem(ITPEventID.RICH_MEDIA_SYNCHRONIZER_DESELECT_DONE);
            e0Var.removeItem(ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET);
            if (!mo10275L0(baseFinderFeed)) {
                e0Var.removeItem(101);
                e0Var.removeItem(99);
            }
        }
    }

    /* renamed from: t1 */
    public void mo2547t1(BaseFinderFeedLoader baseFinderFeedLoader, C9854m5 m5Var) {
        DynamicViewCacheExtension d;
        C9854m5 m5Var2 = m5Var;
        Class cls = C13426s1.class;
        C87412m.m108594g(baseFinderFeedLoader, "model");
        C87412m.m108594g(m5Var2, "callback");
        super.mo2547t1(baseFinderFeedLoader, m5Var);
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            ContactUninterestEventListener contactUninterestEventListener = new ContactUninterestEventListener(baseFeedLoader);
            this.f17208M = contactUninterestEventListener;
            contactUninterestEventListener.alive();
        }
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        C35464c<Integer> cVar = C37521f.f99277R7;
        boolean z = false;
        if (cVar.mo60266n().intValue() >= 1 && (d = C97675c.m125886d(m5Var.getRecyclerView(), 1, 10, false, (C97680h) null, (MMHandler) null, 28, (Object) null)) != null) {
            fVar.getClass();
            d.f56358c = cVar.mo60266n().intValue() == 2;
        }
        fVar.getClass();
        if (cVar.mo60266n().intValue() == -1) {
            RecyclerView recyclerView = m5Var.getRecyclerView();
            C13598b0 b0Var = C13598b0.f38549a;
            C97675c.m125887e(recyclerView, C64197v.m75537f(new int[]{4, 6}, new int[]{2, 3}, new int[]{9, 3}), (C97680h) null, (MMHandler) null, 6, (Object) null);
        }
        m5Var.getRecyclerView().post(new C3763b(this));
        this.f17217W.alive();
        m5Var.getRecyclerView().mo17043c(new C3764c(m5Var2, this));
        C39818r rVar = C39818r.f106831a;
        C13426s1 s1Var = (C13426s1) rVar.mo62444c(this.f29961d).mo75002a(cls);
        int i = this.f29962e;
        if (i == 25 || i == 38) {
            z = true;
        }
        s1Var.f38009g = z;
        ((C13426s1) rVar.mo62444c(this.f29961d).mo75002a(cls)).f38010h = this.f13124s;
        ((C13426s1) rVar.mo62444c(this.f29961d).mo75002a(cls)).f38011i = m5Var.getRecyclerView();
    }
}
