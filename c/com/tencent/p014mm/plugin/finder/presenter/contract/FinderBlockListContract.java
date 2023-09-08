package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.os.SystemClock;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0738i;
import cm1.C0754n;
import cm1.C0767q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.HeadFooterLayout;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58784w3;
import f40.C86709a0;
import fo1.C59264a;
import fo1.C8178c;
import gy3.C8478d0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C60898l;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import pe1.C35464c;
import pe3.C89349b;
import sf0.C48372d;
import sx3.C36907w;
import up1.C14364t0;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract;", "", "<init>", "()V", "BlockListPresenter", "BlockListViewCallback", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract */
public final class FinderBlockListContract {

    /* renamed from: a */
    public static final String f15893a = "Finder.FinderBlockListContract";

    /* renamed from: b */
    public static long f15894b = SystemClock.uptimeMillis();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListPresenter;", "Lfo1/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback;", "Lob0/n;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListPresenter */
    public static final class BlockListPresenter implements C59264a<BlockListViewCallback>, C11385n {

        /* renamed from: d */
        public C14364t0 f15895d;

        /* renamed from: e */
        public BlockListViewCallback f15896e;

        /* renamed from: f */
        public final ArrayList<C0767q> f15897f = new ArrayList<>();

        /* renamed from: g */
        public C89349b f15898g;

        public BlockListPresenter(C14364t0 t0Var) {
            C87412m.m108594g(t0Var, "config");
            this.f15895d = t0Var;
        }

        /* renamed from: e */
        public final void mo3714e() {
            if (C14364t0.C14365a.m13678a(this.f15895d, (C89349b) null, 1, (Object) null) != null) {
                C86709a0.m107524d().mo123460f(this.f15895d.mo13649k(this.f15898g));
            }
        }

        /* renamed from: n */
        public final void mo3715n() {
            ArrayList arrayList = new ArrayList();
            LinkedList<FinderContact> l = this.f15895d.mo13650l();
            if (l != null) {
                for (FinderContact qVar : l) {
                    arrayList.add(new C0767q(qVar));
                }
            }
            if (!arrayList.isEmpty()) {
                BlockListViewCallback blockListViewCallback = this.f15896e;
                if (blockListViewCallback != null) {
                    blockListViewCallback.mo3721y(arrayList, true);
                }
            } else {
                BlockListViewCallback blockListViewCallback2 = this.f15896e;
                if (blockListViewCallback2 != null) {
                    blockListViewCallback2.mo3716D();
                }
            }
            C61926c.m72666K(300, new FinderBlockListContract$BlockListPresenter$initData$1(this));
        }

        public void onDetach() {
            this.f15896e = null;
            C117747y a = C14364t0.C14365a.m13678a(this.f15895d, (C89349b) null, 1, (Object) null);
            if (a != null) {
                C86709a0.m107524d().mo123470p(a.getType(), this);
            }
            C48372d<FinderContact> e = this.f15895d.mo13643e();
            if (e != null) {
                e.mo73081a();
            }
            ArrayList<C0767q> arrayList = this.f15897f;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            for (C0767q qVar : arrayList) {
                arrayList2.add(qVar.f1809d);
            }
            LinkedList linkedList = new LinkedList(arrayList2);
            C48372d<FinderContact> e2 = this.f15895d.mo13643e();
            if (e2 != null) {
                e2.mo73083c(linkedList);
            }
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            String str2 = FinderBlockListContract.f15893a;
            StringBuilder sb = new StringBuilder();
            sb.append("errType ");
            sb.append(i);
            sb.append(", errCode ");
            sb.append(i2);
            sb.append(" errMsg ");
            sb.append(str);
            sb.append(" requestScene ");
            boolean z = true;
            sb.append(C14364t0.C14365a.m13678a(this.f15895d, (C89349b) null, 1, (Object) null));
            Log.m105924i(str2, sb.toString());
            if (i == 0 && i2 == 0) {
                ArrayList arrayList = new ArrayList();
                LinkedList<FinderContact> n = this.f15895d.mo13652n(yVar);
                if (n != null) {
                    for (FinderContact qVar : n) {
                        arrayList.add(new C0767q(qVar));
                    }
                }
                BlockListViewCallback blockListViewCallback = this.f15896e;
                if (blockListViewCallback != null) {
                    if (this.f15898g != null) {
                        z = false;
                    }
                    blockListViewCallback.mo3721y(arrayList, z);
                }
                this.f15898g = this.f15895d.mo13653o(yVar);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback;", "Lfo1/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListPresenter;", "Lcom/tencent/mm/view/HeadFooterLayout$a;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback */
    public static final class BlockListViewCallback implements C8178c<BlockListPresenter>, HeadFooterLayout.C57874a {

        /* renamed from: d */
        public final BlockListPresenter f15899d;

        /* renamed from: e */
        public final MMActivity f15900e;

        /* renamed from: f */
        public final View f15901f;

        /* renamed from: g */
        public RecyclerView f15902g;

        /* renamed from: h */
        public RefreshLoadMoreLayout f15903h;

        /* renamed from: i */
        public C0738i f15904i;

        /* renamed from: j */
        public WxRecyclerAdapter<C0767q> f15905j;

        public BlockListViewCallback(MMActivity mMActivity, View view, BlockListPresenter blockListPresenter) {
            C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(view, "rootView");
            C87412m.m108594g(blockListPresenter, "presenter");
            this.f15899d = blockListPresenter;
            this.f15900e = mMActivity;
            this.f15901f = view;
        }

        /* renamed from: D */
        public final void mo3716D() {
            if (this.f15899d.f15897f.size() == 0) {
                View findViewById = this.f15901f.findViewById(C0966R.C0970id.ivb);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = this.f15901f.findViewById(C0966R.C0970id.ijp);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((TextView) this.f15901f.findViewById(C0966R.C0970id.ijp)).setText(this.f15899d.f15895d.mo13645g(this.f15900e));
                C58784w3 w3Var = C58784w3.f168295a;
                View findViewById3 = this.f15901f.findViewById(C0966R.C0970id.ijp);
                C87412m.m108593f(findViewById3, "contentView.findViewById…xtView>(R.id.refresh_tip)");
                w3Var.mo83876I1((TextView) findViewById3, new SpannableString(this.f15899d.f15895d.mo13645g(this.f15900e)));
                return;
            }
            View findViewById4 = this.f15901f.findViewById(C0966R.C0970id.ivb);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view3 = findViewById4;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById5 = this.f15901f.findViewById(C0966R.C0970id.ijp);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view4 = findViewById5;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        /* renamed from: a */
        public final void mo3717a() {
            View findViewById = this.f15901f.findViewById(C0966R.C0970id.ivb);
            C87412m.m108593f(findViewById, "contentView.findViewById(R.id.rl_layout)");
            RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById;
            this.f15903h = refreshLoadMoreLayout;
            refreshLoadMoreLayout.setLimitTopRequest(((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.a8a)) - ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3709c2)));
            RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f15903h;
            if (refreshLoadMoreLayout2 != null) {
                refreshLoadMoreLayout2.setRefreshTargetY(((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3758d_)) - ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.a8a)));
                RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f15903h;
                if (refreshLoadMoreLayout3 != null) {
                    refreshLoadMoreLayout3.setDamping(1.85f);
                    RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f15903h;
                    if (refreshLoadMoreLayout4 != null) {
                        RecyclerView recyclerView = refreshLoadMoreLayout4.getRecyclerView();
                        this.f15902g = recyclerView;
                        if (recyclerView != null) {
                            recyclerView.setLayoutManager(new LinearLayoutManager(this.f15900e));
                            RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.f15903h;
                            if (refreshLoadMoreLayout5 != null) {
                                refreshLoadMoreLayout5.setEnableLoadMore(this.f15899d.f15895d.mo13640b());
                                boolean z = true;
                                this.f15905j = new WxRecyclerAdapter<>(new FinderBlockListContract$BlockListViewCallback$initView$1(), this.f15899d.f15897f, true);
                                if (this.f15904i == null) {
                                    this.f15904i = new C0738i();
                                }
                                WxRecyclerAdapter<C0767q> wxRecyclerAdapter = this.f15905j;
                                C87412m.m108591d(wxRecyclerAdapter);
                                C0738i iVar = this.f15904i;
                                C87412m.m108591d(iVar);
                                C60898l.m71328U5(wxRecyclerAdapter, iVar, false, 2, (Object) null);
                                RecyclerView recyclerView2 = this.f15902g;
                                if (recyclerView2 != null) {
                                    recyclerView2.post(new FinderBlockListContract$BlockListViewCallback$initView$2(this));
                                    CharSequence d = this.f15899d.f15895d.mo13642d(this.f15900e);
                                    if (!(d == null || d.length() == 0)) {
                                        z = false;
                                    }
                                    if (!z) {
                                        WxRecyclerAdapter<C0767q> wxRecyclerAdapter2 = this.f15905j;
                                        C87412m.m108591d(wxRecyclerAdapter2);
                                        C60898l.m71328U5(wxRecyclerAdapter2, new C0754n(this.f15899d.f15895d), false, 2, (Object) null);
                                    }
                                    WxRecyclerAdapter<C0767q> wxRecyclerAdapter3 = this.f15905j;
                                    if (wxRecyclerAdapter3 != null) {
                                        wxRecyclerAdapter3.f173488o = new FinderBlockListContract$BlockListViewCallback$initView$3(this);
                                    }
                                    if (wxRecyclerAdapter3 != null) {
                                        wxRecyclerAdapter3.f173487n = new FinderBlockListContract$BlockListViewCallback$initView$4(this);
                                    }
                                    RecyclerView recyclerView3 = this.f15902g;
                                    if (recyclerView3 != null) {
                                        recyclerView3.setAdapter(wxRecyclerAdapter3);
                                        RefreshLoadMoreLayout refreshLoadMoreLayout6 = this.f15903h;
                                        if (refreshLoadMoreLayout6 != null) {
                                            refreshLoadMoreLayout6.setOverCallback(this);
                                            RefreshLoadMoreLayout refreshLoadMoreLayout7 = this.f15903h;
                                            if (refreshLoadMoreLayout7 != null) {
                                                refreshLoadMoreLayout7.setActionCallback(new FinderBlockListContract$BlockListViewCallback$initView$5(this));
                                            } else {
                                                C87412m.m108603p("rlLayout");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("rlLayout");
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
                                C87412m.m108603p("rlLayout");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("rlLayout");
                throw null;
            }
        }

        public MMFragmentActivity getActivity() {
            return this.f15900e;
        }

        /* renamed from: p */
        public boolean mo3718p(int i, int i2, int i3, boolean z, boolean z2) {
            String str = FinderBlockListContract.f15893a;
            Log.m105924i(str, "[onOverEnd] dy=" + i2);
            return false;
        }

        /* renamed from: v */
        public boolean mo3719v(int i, int i2, int i3, boolean z, boolean z2) {
            String str = FinderBlockListContract.f15893a;
            Log.m105924i(str, "[onOverStart] dy=" + i2);
            return false;
        }

        /* renamed from: x */
        public void mo3720x(int i) {
            Log.m105924i(FinderBlockListContract.f15893a, "[onOverStop]");
        }

        /* renamed from: y */
        public final void mo3721y(List<C0767q> list, boolean z) {
            long j;
            C87412m.m108594g(list, "newList");
            C8478d0 d0Var = new C8478d0();
            d0Var.f27483d = this.f15899d.f15897f.size();
            long uptimeMillis = SystemClock.uptimeMillis() - FinderBlockListContract.f15894b;
            C37521f fVar = C37521f.f99374d;
            fVar.getClass();
            C35464c<Long> cVar = C37521f.f99343Z1;
            if (uptimeMillis >= cVar.mo60266n().longValue()) {
                j = 0;
            } else {
                fVar.getClass();
                j = cVar.mo60266n().longValue() - uptimeMillis;
            }
            C61926c.m72666K(j, new FinderBlockListContract$BlockListViewCallback$finishLoadMore$1(z, this, list, d0Var));
        }
    }

    static {
        new FinderBlockListContract();
    }

    private FinderBlockListContract() {
    }
}
