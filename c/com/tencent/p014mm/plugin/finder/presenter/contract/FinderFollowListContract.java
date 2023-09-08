package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0748l0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.view.HeadFooterLayout;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import f40.C86709a0;
import fo1.C59264a;
import fo1.C8178c;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87412m;
import h81.C32735h;
import ht1.C8808v4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.regex.Pattern;
import je1.C9319i3;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import lp3.C88643g;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe1.C35464c;
import pe3.C47465a;
import pe3.C89349b;
import sx3.C64175a0;
import te3.C49026cn0;
import te3.C49169dn0;
import te3.C64317dl0;
import uo3.C78253a;
import up1.C37521f;
import vp1.C14930g;

@Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract;", "", "()V", "FollowListPresent", "FollowListViewCallback", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract */
public final class FinderFollowListContract {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListPresent;", "Lfo1/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback;", "Lob0/n;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent */
    public static final class FollowListPresent implements C59264a<FollowListViewCallback>, C11385n {

        /* renamed from: d */
        public final String f15927d = ("Finder.FinderFollowListContract.FollowListPresent." + hashCode());

        /* renamed from: e */
        public FollowListViewCallback f15928e;

        /* renamed from: f */
        public C89349b f15929f;

        /* renamed from: g */
        public final ArrayList<C0748l0> f15930g = new ArrayList<>();

        /* renamed from: h */
        public final C14930g f15931h = new C14930g("followList.fp");

        /* renamed from: i */
        public boolean f15932i = true;

        /* renamed from: j */
        public boolean f15933j;

        /* renamed from: n */
        public long f15934n = SystemClock.uptimeMillis();

        /* renamed from: e */
        public final void mo3727e(boolean z) {
            this.f15934n = SystemClock.uptimeMillis();
            this.f15933j = z;
            C86709a0.m107524d().mo123460f(new C9319i3(this.f15929f));
        }

        public void onDetach() {
            C86709a0.m107524d().mo123470p(713, this);
            C86709a0.m107524d().mo123470p(3867, this);
            FollowListViewCallback followListViewCallback = this.f15928e;
            if (followListViewCallback != null) {
                RecyclerView recyclerView = followListViewCallback.f15943o;
                if (recyclerView != null) {
                    recyclerView.mo17098m1(followListViewCallback.f15947s);
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            long j;
            String str2 = this.f15927d;
            StringBuilder sb = new StringBuilder();
            sb.append("errType ");
            sb.append(i);
            sb.append(", errCode ");
            sb.append(i2);
            sb.append(", errMsg ");
            sb.append(str);
            sb.append(" scene type ");
            sb.append(yVar != null ? Integer.valueOf(yVar.getType()) : null);
            Log.m105924i(str2, sb.toString());
            Integer valueOf = yVar != null ? Integer.valueOf(yVar.getType()) : null;
            boolean z = false;
            if (valueOf != null && valueOf.intValue() == 713) {
                C8479f0 f0Var = new C8479f0();
                if (i == 0 && i2 == 0) {
                    C8477a0 a0Var = new C8477a0();
                    C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderGetFollowList");
                    C9319i3 i3Var = (C9319i3) yVar;
                    C47465a aVar = i3Var.f29110g.f127055a.f127080a;
                    C49026cn0 cn02 = aVar instanceof C49026cn0 ? (C49026cn0) aVar : null;
                    if (!C87412m.m108589b(this.f15929f, cn02 != null ? cn02.f131834d : null)) {
                        Log.m105924i(this.f15927d, "not my buf, ignore!");
                        return;
                    }
                    if (this.f15929f == null) {
                        FollowListViewCallback followListViewCallback = this.f15928e;
                        if (followListViewCallback != null) {
                            followListViewCallback.mo3729Z();
                            a0Var.f27482d = true;
                            Pattern pattern = C61926c.f176038a;
                            C61926c.m72701z(C88643g.m110546d(), new FinderFollowListContract$FollowListPresent$onSceneEnd$1$1(this, yVar));
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    }
                    C47465a aVar2 = i3Var.f29110g.f127056b.f127083a;
                    C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListResponse");
                    if (((C49169dn0) aVar2).f132431f != 0) {
                        z = true;
                    }
                    this.f15932i = z;
                    this.f15929f = i3Var.mo10071n();
                    f0Var.f27484d = new FinderFollowListContract$FollowListPresent$onSceneEnd$2(this, a0Var, yVar);
                }
                long uptimeMillis = SystemClock.uptimeMillis() - this.f15934n;
                if (!this.f15933j) {
                    C37521f.f99374d.getClass();
                    C35464c<Long> cVar = C37521f.f99343Z1;
                    if (uptimeMillis < cVar.mo60266n().longValue()) {
                        j = cVar.mo60266n().longValue() - uptimeMillis;
                        C61926c.m72666K(j, new FinderFollowListContract$FollowListPresent$onSceneEnd$3(f0Var));
                    }
                }
                j = 0;
                C61926c.m72666K(j, new FinderFollowListContract$FollowListPresent$onSceneEnd$3(f0Var));
            } else if (valueOf != null && valueOf.intValue() == 3867 && i == 0 && i2 == 0) {
                C114799u reqResp = yVar.getReqResp();
                C47350c cVar2 = reqResp instanceof C47350c ? (C47350c) reqResp : null;
                C47465a aVar3 = cVar2 != null ? cVar2.f127055a.f127080a : null;
                C64317dl0 dl02 = aVar3 instanceof C64317dl0 ? (C64317dl0) aVar3 : null;
                String str3 = (dl02 == null || dl02.f182763e != 2) ? "" : dl02.f182762d;
                if (!Util.isNullOrNil(str3)) {
                    C64175a0.m75512t(this.f15930g, new FinderFollowListContract$FollowListPresent$onSceneEnd$4(str3));
                    FollowListViewCallback followListViewCallback2 = this.f15928e;
                    if (followListViewCallback2 != null) {
                        followListViewCallback2.mo3728D(false, -1, -1);
                        C85801v1 i3 = C86709a0.m107535s().mo121142i();
                        C72994y1.C72995a aVar4 = C72994y1.C72995a.USERINFO_FINDER_FOLLOW_COUNT_INT_SYNC;
                        int j2 = i3.mo119689j(aVar4, 0);
                        Log.m105925i(this.f15927d, "oldFollowCnt %d", Integer.valueOf(j2));
                        if (j2 > 0) {
                            C86709a0.m107535s().mo121142i().mo119677K(aVar4, Integer.valueOf(j2 - 1));
                        }
                        FollowListViewCallback followListViewCallback3 = this.f15928e;
                        if (followListViewCallback3 != null) {
                            followListViewCallback3.mo3729Z();
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                }
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback;", "Lfo1/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListPresent;", "Lcom/tencent/mm/view/HeadFooterLayout$a;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback */
    public static final class FollowListViewCallback implements C8178c<FollowListPresent>, HeadFooterLayout.C57874a {

        /* renamed from: d */
        public final MMActivity f15935d;

        /* renamed from: e */
        public final View f15936e;

        /* renamed from: f */
        public final FollowListPresent f15937f;

        /* renamed from: g */
        public final boolean f15938g;

        /* renamed from: h */
        public final String f15939h = ("Finder.FinderFollowListContract.FollowListViewCallback." + hashCode());

        /* renamed from: i */
        public final int f15940i = 1001;

        /* renamed from: j */
        public TextView f15941j;

        /* renamed from: n */
        public C78253a f15942n;

        /* renamed from: o */
        public RecyclerView f15943o;

        /* renamed from: p */
        public RefreshLoadMoreLayout f15944p;

        /* renamed from: q */
        public MMProcessBar f15945q;

        /* renamed from: r */
        public WxRecyclerAdapter<C0748l0> f15946r;

        /* renamed from: s */
        public final C3383xe4bc0a2a f15947s = new C3383xe4bc0a2a();

        public FollowListViewCallback(MMActivity mMActivity, View view, FollowListPresent followListPresent, boolean z) {
            C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(view, "contentView");
            C87412m.m108594g(followListPresent, "presenter");
            this.f15935d = mMActivity;
            this.f15936e = view;
            this.f15937f = followListPresent;
            this.f15938g = z;
        }

        /* renamed from: D */
        public final void mo3728D(boolean z, int i, int i2) {
            if (i < 0 || i2 <= 0) {
                WxRecyclerAdapter<C0748l0> wxRecyclerAdapter = this.f15946r;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
            } else {
                WxRecyclerAdapter<C0748l0> wxRecyclerAdapter2 = this.f15946r;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.notifyItemRangeInserted(i, i2);
                }
            }
            if (z) {
                RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
                cVar.f24951f = this.f15937f.f15932i;
                cVar.f24953h = i2;
                if (i2 > 0) {
                    cVar.f24952g = false;
                }
                RefreshLoadMoreLayout refreshLoadMoreLayout = this.f15944p;
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.onPreFinishLoadMoreSmooth(cVar);
                } else {
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
            } else {
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f15944p;
                if (refreshLoadMoreLayout2 != null) {
                    refreshLoadMoreLayout2.mo82442H(0);
                    mo3731y();
                    return;
                }
                C87412m.m108603p("rlLayout");
                throw null;
            }
        }

        /* renamed from: Z */
        public final void mo3729Z() {
            int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_FOLLOW_COUNT_INT_SYNC, 0);
            this.f15935d.setMMTitle(C8178c.C8179a.m8259a(this).getString(C0966R.string.ee5, new Object[]{Integer.valueOf(j)}));
            if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
                this.f15935d.setMMSubTitle(C8178c.C8179a.m8259a(this).getString(C0966R.string.eqw));
            }
            if (j == 0) {
                TextView textView = this.f15941j;
                if (textView != null) {
                    textView.setVisibility(0);
                    TextView textView2 = this.f15941j;
                    if (textView2 != null) {
                        textView2.setText(this.f15935d.getString(C0966R.string.d_n));
                    } else {
                        C87412m.m108603p("emptyTip");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("emptyTip");
                    throw null;
                }
            } else {
                TextView textView3 = this.f15941j;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                } else {
                    C87412m.m108603p("emptyTip");
                    throw null;
                }
            }
        }

        /* renamed from: a */
        public final void mo3730a() {
            View findViewById = this.f15936e.findViewById(C0966R.C0970id.ivb);
            C87412m.m108593f(findViewById, "contentView.findViewById(R.id.rl_layout)");
            RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById;
            this.f15944p = refreshLoadMoreLayout;
            refreshLoadMoreLayout.setLimitTopRequest(((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.a8a)) - ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3709c2)));
            RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f15944p;
            if (refreshLoadMoreLayout2 != null) {
                refreshLoadMoreLayout2.setRefreshTargetY(((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3758d_)) - ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.a8a)));
                RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f15944p;
                if (refreshLoadMoreLayout3 != null) {
                    refreshLoadMoreLayout3.setDamping(1.85f);
                    View findViewById2 = this.f15936e.findViewById(C0966R.C0970id.ive);
                    C87412m.m108593f(findViewById2, "contentView.findViewById…ar>(R.id.rl_loading_icon)");
                    this.f15945q = (MMProcessBar) findViewById2;
                    RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f15944p;
                    if (refreshLoadMoreLayout4 != null) {
                        RecyclerView recyclerView = refreshLoadMoreLayout4.getRecyclerView();
                        this.f15943o = recyclerView;
                        if (recyclerView != null) {
                            recyclerView.setLayoutManager(new LinearLayoutManager(this.f15935d));
                            boolean z = true;
                            WxRecyclerAdapter<C0748l0> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderFollowListContract$FollowListViewCallback$initView$1(this), this.f15937f.f15930g, true);
                            this.f15946r = wxRecyclerAdapter;
                            RecyclerView recyclerView2 = this.f15943o;
                            if (recyclerView2 != null) {
                                recyclerView2.setAdapter(wxRecyclerAdapter);
                                WxRecyclerAdapter<C0748l0> wxRecyclerAdapter2 = this.f15946r;
                                C87412m.m108591d(wxRecyclerAdapter2);
                                wxRecyclerAdapter2.f173488o = new FinderFollowListContract$FollowListViewCallback$initView$2(this);
                                WxRecyclerAdapter<C0748l0> wxRecyclerAdapter3 = this.f15946r;
                                C87412m.m108591d(wxRecyclerAdapter3);
                                wxRecyclerAdapter3.f173487n = new FinderFollowListContract$FollowListViewCallback$initView$3(this);
                                RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.f15944p;
                                if (refreshLoadMoreLayout5 != null) {
                                    refreshLoadMoreLayout5.setOverCallback(this);
                                    RefreshLoadMoreLayout refreshLoadMoreLayout6 = this.f15944p;
                                    if (refreshLoadMoreLayout6 != null) {
                                        refreshLoadMoreLayout6.setActionCallback(new FinderFollowListContract$FollowListViewCallback$initView$4(this));
                                        View findViewById3 = this.f15936e.findViewById(C0966R.C0970id.cj7);
                                        C87412m.m108593f(findViewById3, "contentView.findViewById<TextView>(R.id.empty_tip)");
                                        this.f15941j = (TextView) findViewById3;
                                        mo3729Z();
                                        this.f15942n = new C78253a(this.f15935d);
                                        this.f15935d.setBackBtn(new FinderFollowListContract$FollowListViewCallback$initView$5(this));
                                        FollowListPresent followListPresent = this.f15937f;
                                        followListPresent.getClass();
                                        Pattern pattern = C61926c.f176038a;
                                        C61926c.m72665J(C61926c.m72701z(C88643g.m110546d(), new FinderFollowListContract$FollowListPresent$loadStart$1(followListPresent)), new FinderFollowListContract$FollowListPresent$loadStart$2(followListPresent));
                                        followListPresent.mo3727e(false);
                                        C37521f.f99374d.getClass();
                                        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_finder_search_watchlist_android, 1) != 1) {
                                            z = false;
                                        }
                                        if (z && !((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
                                            this.f15935d.addIconOptionMenu(0, C0966R.raw.icons_outlined_search, new FinderFollowListContract$FollowListViewCallback$initView$6(this));
                                        }
                                        RecyclerView recyclerView3 = this.f15943o;
                                        if (recyclerView3 != null) {
                                            recyclerView3.mo17043c(this.f15947s);
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
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("rlLayout");
                throw null;
            }
        }

        public MMFragmentActivity getActivity() {
            return this.f15935d;
        }

        /* renamed from: p */
        public boolean mo3718p(int i, int i2, int i3, boolean z, boolean z2) {
            String str = this.f15939h;
            Log.m105924i(str, "[onOverEnd] dy=" + i2);
            return false;
        }

        /* renamed from: v */
        public boolean mo3719v(int i, int i2, int i3, boolean z, boolean z2) {
            String str = this.f15939h;
            Log.m105924i(str, "[onOverStart] dy=" + i2);
            MMProcessBar mMProcessBar = this.f15945q;
            if (mMProcessBar != null) {
                mMProcessBar.mo82301a(((float) i2) / ((float) ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3733cm))));
                return false;
            }
            C87412m.m108603p("rlProcessBar");
            throw null;
        }

        /* renamed from: x */
        public void mo3720x(int i) {
            Log.m105924i(this.f15939h, "[onOverStop]");
            MMProcessBar mMProcessBar = this.f15945q;
            if (mMProcessBar != null) {
                mMProcessBar.mo82303c();
            } else {
                C87412m.m108603p("rlProcessBar");
                throw null;
            }
        }

        /* renamed from: y */
        public final void mo3731y() {
            TextView textView;
            int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_FOLLOW_COUNT_INT_SYNC, 0);
            if (!this.f15937f.f15932i) {
                C37521f.f99374d.getClass();
                View view = null;
                if (C37521f.f99504r6.mo60266n().intValue() == 1) {
                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f15944p;
                    if (refreshLoadMoreLayout != null) {
                        View loadMoreFooter = refreshLoadMoreLayout.getLoadMoreFooter();
                        if (!(loadMoreFooter == null || (textView = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                            textView.setText(textView.getContext().getResources().getString(C0966R.string.n6y, new Object[]{Integer.valueOf(j)}));
                            textView.setVisibility(0);
                        }
                        RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f15944p;
                        if (refreshLoadMoreLayout2 != null) {
                            View loadMoreFooter2 = refreshLoadMoreLayout2.getLoadMoreFooter();
                            if (loadMoreFooter2 != null) {
                                view = loadMoreFooter2.findViewById(C0966R.C0970id.g2s);
                            }
                            if (view != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                View view2 = view;
                                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback", "refreshFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback", "refreshFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                return;
                            }
                            return;
                        }
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
                RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f15944p;
                if (refreshLoadMoreLayout3 != null) {
                    RefreshLoadMoreLayout.m66896C(refreshLoadMoreLayout3, (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
                } else {
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
            }
        }
    }

    static {
        new FinderFollowListContract();
    }

    private FinderFollowListContract() {
    }
}
