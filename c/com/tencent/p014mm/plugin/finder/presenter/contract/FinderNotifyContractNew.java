package com.tencent.p014mm.plugin.finder.presenter.contract;

import a14.C53934p0;
import am1.C54137b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C0317e;
import bl3.C39818r;
import cm1.C39993q1;
import cm1.C55011a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.presenter.contract.message.FinderMessageCgiSource;
import com.tencent.p014mm.plugin.finder.presenter.contract.message.FinderMessageDbSource;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.HeadFooterLayout;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58739j4;
import fo1.C59264a;
import fo1.C8178c;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import jq3.C60898l;
import kotlin.Metadata;
import o40.C61926c;
import on1.C11548q;
import on1.C11570v;
import te3.C64586nn1;
import uo3.C78253a;
import wx3.C15601d;
import wx3.C66212f;
import zc1.C66785b;
import zp3.C23564m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew;", "", "<init>", "()V", "NotifyPresenter", "NotifyViewCallback", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew */
public final class FinderNotifyContractNew {

    /* renamed from: a */
    public static final FinderNotifyContractNew f160522a = new FinderNotifyContractNew();

    /* renamed from: b */
    public static final FinderMsgUIItemBrowseStruct f160523b = new FinderMsgUIItemBrowseStruct();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew$NotifyPresenter;", "Lfo1/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew$NotifyViewCallback;", "Companion", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter */
    public static final class NotifyPresenter implements C59264a<NotifyViewCallback> {

        /* renamed from: w */
        public static final String f160524w;

        /* renamed from: d */
        public final Fragment f160525d;

        /* renamed from: e */
        public final int f160526e;

        /* renamed from: f */
        public final int f160527f;

        /* renamed from: g */
        public final int[] f160528g;

        /* renamed from: h */
        public final int f160529h;

        /* renamed from: i */
        public final String f160530i;

        /* renamed from: j */
        public boolean f160531j;

        /* renamed from: n */
        public long f160532n;

        /* renamed from: o */
        public long f160533o;

        /* renamed from: p */
        public long f160534p;

        /* renamed from: q */
        public long f160535q;

        /* renamed from: r */
        public C11548q<C55011a> f160536r;

        /* renamed from: s */
        public C54137b f160537s;

        /* renamed from: t */
        public NotifyViewCallback f160538t;

        /* renamed from: u */
        public FinderMessageDbSource f160539u;

        /* renamed from: v */
        public final FinderNotifyContractNew$NotifyPresenter$msgUpdateListener$1 f160540v;

        @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew$NotifyPresenter$Companion;", "", "()V", "TAG", "", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$Companion */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C8480h hVar) {
                this();
            }
        }

        static {
            Companion companion = new Companion((C8480h) null);
            f160524w = "Finder.NotifyPresenter." + companion.hashCode();
        }

        public NotifyPresenter(Fragment fragment, int i, int i2, int[] iArr, int i3) {
            String O5;
            C87412m.m108594g(fragment, "fragment");
            C87412m.m108594g(iArr, "msgTypes");
            this.f160525d = fragment;
            this.f160526e = i;
            this.f160527f = i2;
            this.f160528g = iArr;
            this.f160529h = i3;
            String str = "";
            if (i == 1 && (O5 = C66785b.f191882e.mo90662O5()) != null) {
                str = O5;
            }
            this.f160530i = str;
            this.f160540v = new FinderNotifyContractNew$NotifyPresenter$msgUpdateListener$1(this, C40008f.f107254d);
        }

        /* renamed from: e */
        public final ArrayList<C55011a> mo78501e() {
            C11548q<C55011a> qVar = this.f160536r;
            if (qVar != null) {
                List<T> list = qVar.f33886d;
                C87412m.m108592e(list, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.model.BaseFinderMsg>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.plugin.finder.model.BaseFinderMsg> }");
                return (ArrayList) list;
            }
            C87412m.m108603p("loader");
            throw null;
        }

        /* renamed from: n */
        public void mo78502n(NotifyViewCallback notifyViewCallback) {
            C87412m.m108594g(notifyViewCallback, "callback");
            String str = f160524w;
            Log.m105924i(str, "onAttach " + this.f160526e + ' ' + this.f160527f);
            this.f160538t = notifyViewCallback;
            this.f160540v.alive();
            FinderMessageDbSource finderMessageDbSource = new FinderMessageDbSource(this.f160528g, this.f160526e, (String) null, 4, (C8480h) null);
            finderMessageDbSource.f160596h = MAlarmHandler.NEXT_FIRE_INTERVAL;
            finderMessageDbSource.f160597i = 20;
            this.f160539u = finderMessageDbSource;
            FinderMessageCgiSource finderMessageCgiSource = new FinderMessageCgiSource(this.f160526e, this.f160527f, this.f160528g, (String) null, 8, (C8480h) null);
            FinderMessageDbSource finderMessageDbSource2 = this.f160539u;
            if (finderMessageDbSource2 != null) {
                NotifyViewCallback notifyViewCallback2 = this.f160538t;
                if (notifyViewCallback2 != null) {
                    RefreshLoadMoreLayout refreshLoadMoreLayout = notifyViewCallback2.f160545g;
                    Fragment fragment = this.f160525d;
                    C87412m.m108594g(fragment, "fragment");
                    C39622i0 a = C39818r.f106831a.mo62445d(fragment).mo75002a(C11548q.class);
                    C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.newloader.Loader<T of com.tencent.mm.plugin.finder.newloader.Loader.LoaderBuilder>");
                    C11548q<C55011a> qVar = (C11548q) a;
                    qVar.f33888f = finderMessageDbSource;
                    qVar.f33889g = null;
                    qVar.f33890h = finderMessageCgiSource;
                    qVar.f33891i = finderMessageDbSource2;
                    qVar.f33892j = null;
                    qVar.f33893n = refreshLoadMoreLayout;
                    this.f160536r = qVar;
                    qVar.mo11507j3(new FinderNotifyContractNew$NotifyPresenter$observeLoaderState$1(this));
                    int i = this.f160526e;
                    C11548q<C55011a> qVar2 = this.f160536r;
                    if (qVar2 != null) {
                        NotifyViewCallback notifyViewCallback3 = this.f160538t;
                        if (notifyViewCallback3 != null) {
                            this.f160537s = new C54137b(i, qVar2, notifyViewCallback3);
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("loader");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            } else {
                C87412m.m108603p("dbSource");
                throw null;
            }
        }

        public void onDetach() {
            String str = f160524w;
            Log.m105924i(str, "onDetach " + this.f160526e + ' ' + this.f160527f);
            this.f160540v.dead();
        }

        /* renamed from: q */
        public final void mo78503q() {
            Log.m105924i(f160524w, "requestRefresh:");
            NotifyViewCallback notifyViewCallback = this.f160538t;
            if (notifyViewCallback != null) {
                notifyViewCallback.mo78504D((String) null, 0, false);
                this.f160534p = C31543z5.m39451a();
                C11548q<C55011a> qVar = this.f160536r;
                if (qVar != null) {
                    C0317e.launch$default(qVar, (C66212f) null, (C53934p0) null, new C11570v(qVar, (C15601d<? super C11570v>) null), 3, (Object) null);
                } else {
                    C87412m.m108603p("loader");
                    throw null;
                }
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew$NotifyViewCallback;", "Lfo1/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew$NotifyPresenter;", "Lcom/tencent/mm/view/HeadFooterLayout$a;", "Companion", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback */
    public static final class NotifyViewCallback implements C8178c<NotifyPresenter>, HeadFooterLayout.C57874a {

        /* renamed from: s */
        public static final String f160541s;

        /* renamed from: d */
        public final Fragment f160542d;

        /* renamed from: e */
        public final NotifyPresenter f160543e;

        /* renamed from: f */
        public final int f160544f;

        /* renamed from: g */
        public RefreshLoadMoreLayout f160545g;

        /* renamed from: h */
        public volatile Runnable f160546h;

        /* renamed from: i */
        public final Context f160547i;

        /* renamed from: j */
        public final View f160548j;

        /* renamed from: n */
        public MMProcessBar f160549n;

        /* renamed from: o */
        public TextView f160550o;

        /* renamed from: p */
        public RecyclerView f160551p;

        /* renamed from: q */
        public C78253a f160552q;

        /* renamed from: r */
        public WxRecyclerAdapter<C55011a> f160553r;

        @Metadata(mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContractNew$NotifyViewCallback$Companion;", "", "()V", "MENU_ID_BLOCK_MENTION", "", "MENU_ID_DEL_MENTION", "TAG", "", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$Companion */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C8480h hVar) {
                this();
            }
        }

        static {
            Companion companion = new Companion((C8480h) null);
            f160541s = "Finder.NotifyViewCallback." + companion.hashCode();
        }

        public NotifyViewCallback(Fragment fragment, View view, NotifyPresenter notifyPresenter, int i) {
            C87412m.m108594g(fragment, "fragment");
            C87412m.m108594g(view, "notifyView");
            C87412m.m108594g(notifyPresenter, "presenter");
            this.f160542d = fragment;
            this.f160543e = notifyPresenter;
            this.f160544f = i;
            Context context = fragment.getContext();
            this.f160547i = context;
            this.f160548j = view;
            RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) view.findViewById(C0966R.C0970id.ivb);
            this.f160545g = refreshLoadMoreLayout;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.setEnableRefresh(false);
                if (notifyPresenter.f160526e == 1) {
                    String str = "";
                    C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77246R5(i != 0 ? i != 1 ? i != 2 ? str : "NotificationCenterFollow" : "NotificationCenterComment" : "NotificationCenterLike");
                    if (R5 != null) {
                        long j = 1;
                        if (i == 0) {
                            str = C8178c.C8179a.m8259a(this).getString(C0966R.string.fz6, new Object[]{String.valueOf(R5.f184503e)});
                            C87412m.m108593f(str, "getResources().getString…                        )");
                        } else if (i == 1) {
                            j = 2;
                            str = C8178c.C8179a.m8259a(this).getString(C0966R.string.fz4, new Object[]{String.valueOf(R5.f184503e)});
                            C87412m.m108593f(str, "getResources().getString…                        )");
                        } else if (i == 2) {
                            j = 4;
                            str = C8178c.C8179a.m8259a(this).getString(C0966R.string.fz5, new Object[]{String.valueOf(R5.f184503e)});
                            C87412m.m108593f(str, "getResources().getString…                        )");
                        }
                        if (!C58739j4.f168176a.mo83684M(j)) {
                            View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.c98, (ViewGroup) null);
                            ((TextView) inflate.findViewById(C0966R.C0970id.izo)).setText(str);
                            RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f160545g;
                            if (refreshLoadMoreLayout2 != null) {
                                int i2 = HeadFooterLayout.f165569t;
                                refreshLoadMoreLayout2.mo82391b(inflate, true);
                            }
                        }
                    }
                }
                refreshLoadMoreLayout.setLimitTopRequest(((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.a8a)) - ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3709c2)));
                refreshLoadMoreLayout.setRefreshTargetY(((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3758d_)) - ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.a8a)));
                refreshLoadMoreLayout.setDamping(1.85f);
                this.f160549n = (MMProcessBar) view.findViewById(C0966R.C0970id.ive);
                refreshLoadMoreLayout.setActionCallback(new FinderNotifyContractNew$NotifyViewCallback$initRefreshLayout$1$1(refreshLoadMoreLayout, this));
                refreshLoadMoreLayout.setOverCallback(this);
            }
        }

        /* renamed from: y */
        public static final C55011a m64288y(NotifyViewCallback notifyViewCallback, RecyclerView.C16613e eVar, int i) {
            notifyViewCallback.getClass();
            C87412m.m108592e(eVar, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<com.tencent.mm.view.recyclerview.SimpleViewHolder>");
            int c6 = i - ((C60898l) eVar).mo85796c6();
            ArrayList<C55011a> e = notifyViewCallback.f160543e.mo78501e();
            if (c6 < 0 || c6 >= e.size()) {
                return null;
            }
            C55011a aVar = e.get(c6);
            C87412m.m108593f(aVar, "dataList[fixPos]");
            C55011a aVar2 = aVar;
            if (aVar2 instanceof C39993q1) {
                return null;
            }
            String str = f160541s;
            Log.m105924i(str, "filterMention " + c6);
            return aVar2;
        }

        /* renamed from: D */
        public final void mo78504D(String str, int i, boolean z) {
            C61926c.m72668M(new FinderNotifyContractNew$NotifyViewCallback$showRefreshTip$1(str, this, z, i));
        }

        /* renamed from: a */
        public final void mo78505a() {
            this.f160552q = new C78253a(getActivity());
            View findViewById = this.f160548j.findViewById(C0966R.C0970id.hk8);
            C87412m.m108593f(findViewById, "contentView.findViewById….id.notify_recycler_view)");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            this.f160551p = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f160547i));
            TextView textView = (TextView) this.f160548j.findViewById(C0966R.C0970id.hk9);
            this.f160550o = textView;
            if (textView != null) {
                textView.setOnClickListener(new FinderNotifyContractNew$NotifyViewCallback$initView$1(this));
            }
            WxRecyclerAdapter<C55011a> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderNotifyContractNew$NotifyViewCallback$initAdapter$1(this), this.f160543e.mo78501e(), true);
            this.f160553r = wxRecyclerAdapter;
            RecyclerView recyclerView2 = this.f160551p;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(wxRecyclerAdapter);
                WxRecyclerAdapter<C55011a> wxRecyclerAdapter2 = this.f160553r;
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.f173488o = new C56198x4f0d29de(this);
                }
                if (wxRecyclerAdapter2 != null) {
                    wxRecyclerAdapter2.f173487n = new C56199x4f0d29df(this);
                }
                RecyclerView recyclerView3 = this.f160551p;
                if (recyclerView3 != null) {
                    C23564m.m28137g(recyclerView3, new FinderNotifyContractNew$NotifyViewCallback$reportExpose$1(this));
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
            FragmentActivity activity = this.f160542d.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            return (MMFragmentActivity) activity;
        }

        /* renamed from: p */
        public boolean mo3718p(int i, int i2, int i3, boolean z, boolean z2) {
            String str = f160541s;
            Log.m105924i(str, "[onOverEnd] dy=" + i2);
            return false;
        }

        /* renamed from: v */
        public boolean mo3719v(int i, int i2, int i3, boolean z, boolean z2) {
            MMProcessBar mMProcessBar = this.f160549n;
            if (mMProcessBar == null) {
                return false;
            }
            mMProcessBar.mo82301a(((float) i2) / ((float) ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3733cm))));
            return false;
        }

        /* renamed from: x */
        public void mo3720x(int i) {
            Log.m105924i(f160541s, "[onOverStop]");
            MMProcessBar mMProcessBar = this.f160549n;
            if (mMProcessBar != null) {
                mMProcessBar.mo82303c();
            }
        }
    }

    private FinderNotifyContractNew() {
    }
}
