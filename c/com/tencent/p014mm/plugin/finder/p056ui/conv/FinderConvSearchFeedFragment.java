package com.tencent.p014mm.plugin.finder.p056ui.conv;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C54219z;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig;
import com.tencent.p014mm.plugin.finder.view.FinderRefreshLayout;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.p014mm.plugin.finder.view.refreshloader.FinderLoaderMoreFooter;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.xweb.util.WXWebReporter;
import ef1.C58556f;
import eq1.C58665a;
import eq1.C58666b;
import eq1.C58669d;
import eq1.C58670e;
import eq1.C58673h;
import eq1.C58675j;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jq3.C60896i;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import oq3.C21804c;
import p525fr.C59311b;
import rs1.C13317l7;
import rs1.C13442s8;
import sx3.C110823p;
import sx3.C110826x0;
import sx3.C64197v;
import te3.C64658qj1;
import te3.C64682rk1;
import wp1.C15585f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lfr/b;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment */
public final class FinderConvSearchFeedFragment extends FinderHomeTabFragment implements C59311b {

    /* renamed from: q */
    public final String f161190q;

    /* renamed from: r */
    public final C54219z<List<C64658qj1>> f161191r = new C54219z<>();

    /* renamed from: s */
    public boolean f161192s;

    /* renamed from: t */
    public boolean f161193t;

    /* renamed from: u */
    public String f161194u = "";

    /* renamed from: v */
    public C58665a f161195v;

    /* renamed from: w */
    public C58666b f161196w;

    /* renamed from: com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment$a */
    public static final class C56383a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ FinderConvSearchFeedFragment f161197d;

        public C56383a(FinderConvSearchFeedFragment finderConvSearchFeedFragment) {
            this.f161197d = finderConvSearchFeedFragment;
        }

        public void onChanged(Object obj) {
            List<C64658qj1> list = (List) obj;
            FinderConvSearchFeedFragment finderConvSearchFeedFragment = this.f161197d;
            C58665a aVar = finderConvSearchFeedFragment.f161195v;
            if (aVar != null) {
                String str = finderConvSearchFeedFragment.f161194u;
                C87412m.m108593f(list, LocaleUtil.ITALIAN);
                C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
                Log.m105924i("FinderConvSearchFeedPresenter", "onSearchResult size=" + list.size());
                aVar.f167945d.size();
                aVar.f167945d.clear();
                long j = -1;
                for (C64658qj1 qj12 : list) {
                    long j2 = qj12.f185037d;
                    C64682rk1 rk12 = qj12.f185039f;
                    long j3 = qj12.f185038e;
                    if (!(j2 == 0 || rk12 == null || j3 == 0)) {
                        long a = C74763a.m89510e().mo103933a(new Date(j3));
                        FinderItem a2 = FinderItem.Companion.mo79056a(C58784w3.f168295a.mo83967u(rk12), 16);
                        a2.setMsgId(j2);
                        BaseFinderFeed k = C15585f.f42211a.mo14348k(a2);
                        if (a != j) {
                            aVar.f167945d.add(new C58675j(j3));
                            j = a;
                        }
                        aVar.f167945d.add(k);
                    }
                }
                aVar.mo83536e().f167952f = str;
                RecyclerView.C16613e adapter = aVar.mo83536e().mo83538b().getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                C58666b e = aVar.mo83536e();
                FrameLayout frameLayout = e.f167956j;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                    View view = e.f167959m;
                    if (view != null) {
                        view.setOnClickListener((View.OnClickListener) null);
                        aVar.mo83536e().mo83539c().mo26604l(true);
                        aVar.mo83536e().mo83539c().mo26642z(true);
                        int i = 0;
                        if (aVar.f167945d.isEmpty()) {
                            C58666b e2 = aVar.mo83536e();
                            FrameLayout frameLayout2 = e2.f167956j;
                            if (frameLayout2 != null) {
                                frameLayout2.setVisibility(0);
                                View view2 = e2.f167957k;
                                if (view2 != null) {
                                    C9556a aVar2 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar2.mo10233c(8);
                                    View view3 = view2;
                                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    View view4 = e2.f167958l;
                                    if (view4 != null) {
                                        C9556a aVar3 = new C9556a();
                                        aVar3.mo10233c(0);
                                        View view5 = view4;
                                        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                        C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        View view6 = e2.f167959m;
                                        if (view6 != null) {
                                            C9556a aVar4 = new C9556a();
                                            aVar4.mo10233c(8);
                                            View view7 = view6;
                                            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                            C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            C21804c loadMoreFooter = aVar.mo83536e().mo83539c().getLoadMoreFooter();
                                            View view8 = loadMoreFooter != null ? loadMoreFooter.getView() : null;
                                            if (view8 != null) {
                                                C9556a aVar5 = new C9556a();
                                                aVar5.mo10233c(8);
                                                View view9 = view8;
                                                C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedPresenter", "onSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                                view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                                                C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedPresenter", "onSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            }
                                        } else {
                                            C87412m.m108603p("retryView");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("nothingView");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("loadingView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("loadingLayout");
                                throw null;
                            }
                        } else {
                            C21804c loadMoreFooter2 = aVar.mo83536e().mo83539c().getLoadMoreFooter();
                            View view10 = loadMoreFooter2 != null ? loadMoreFooter2.getView() : null;
                            if (view10 != null) {
                                C9556a aVar6 = new C9556a();
                                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                aVar6.mo10233c(0);
                                View view11 = view10;
                                C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedPresenter", "onSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                                C117292a.m165359e(view11, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedPresenter", "onSearchResult", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        }
                        C58666b e3 = aVar.mo83536e();
                        if (Util.isNullOrNil((List) e3.f167949c.f167945d)) {
                            View view12 = e3.f167960n;
                            if (view12 != null) {
                                C9556a aVar7 = new C9556a();
                                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                                aVar7.mo10233c(8);
                                View view13 = view12;
                                C117292a.m165358d(view13, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "initDateHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view12.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                                C117292a.m165359e(view13, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "initDateHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                return;
                            }
                            C87412m.m108603p("dateHeaderContainer");
                            throw null;
                        }
                        View view14 = e3.f167960n;
                        if (view14 != null) {
                            C9556a aVar8 = new C9556a();
                            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                            aVar8.mo10233c(0);
                            View view15 = view14;
                            C117292a.m165358d(view15, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "initDateHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view14.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                            C117292a.m165359e(view15, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "initDateHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            int[] iArr = new int[2];
                            RecyclerView.LayoutManager layoutManager = e3.mo83538b().getLayoutManager();
                            FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = layoutManager instanceof FinderStaggeredGridLayoutManager ? (FinderStaggeredGridLayoutManager) layoutManager : null;
                            if (finderStaggeredGridLayoutManager != null) {
                                finderStaggeredGridLayoutManager.mo17394A(iArr);
                            }
                            Integer Q = C110823p.m150991Q(iArr);
                            int intValue = Q != null ? Q.intValue() : 0;
                            Iterator<C9493c> it = e3.f167949c.f167945d.iterator();
                            while (it.hasNext()) {
                                C9493c next = it.next();
                                int i2 = i + 1;
                                if (i >= 0) {
                                    C9493c cVar = next;
                                    C58675j jVar = cVar instanceof C58675j ? (C58675j) cVar : null;
                                    if (jVar != null && intValue >= i) {
                                        TextView textView = e3.f167961o;
                                        if (textView != null) {
                                            textView.setText(C74763a.m89510e().mo103935c(new Date(jVar.f167971d), e3.f167947a));
                                        } else {
                                            C87412m.m108603p("dateHeaderTv");
                                            throw null;
                                        }
                                    }
                                    i = i2;
                                } else {
                                    C64197v.m75542k();
                                    throw null;
                                }
                            }
                            return;
                        }
                        C87412m.m108603p("dateHeaderContainer");
                        throw null;
                    }
                    C87412m.m108603p("retryView");
                    throw null;
                }
                C87412m.m108603p("loadingLayout");
                throw null;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    public FinderConvSearchFeedFragment(String str) {
        C87412m.m108594g(str, "conversation");
        this.f161190q = str;
    }

    /* renamed from: I */
    public void mo79132I(String str, List<? extends C64658qj1> list) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(list, "dataList");
        Log.m105924i("Finder.ConvSearchFeedFragment", "onSearchResult query=" + str + " size=" + list.size());
        this.f161194u = str;
        this.f161191r.postValue(list);
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C110826x0.m151017e(C13442s8.class, C13317l7.class);
    }

    /* renamed from: R */
    public int mo2203R() {
        return WXWebReporter.WXWEB_IDKEY_LOCAL_TO_OVERSEA;
    }

    /* renamed from: U */
    public int mo4179U() {
        return 3;
    }

    /* renamed from: c */
    public Fragment mo79133c() {
        return this;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7198wo;
    }

    /* renamed from: n */
    public void mo79134n() {
        if (this.f161192s) {
            C58666b bVar = this.f161196w;
            if (bVar != null) {
                FrameLayout frameLayout = bVar.f167956j;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                    View view = bVar.f167959m;
                    if (view != null) {
                        view.setOnClickListener((View.OnClickListener) null);
                    } else {
                        C87412m.m108603p("retryView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("loadingLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f161195v == null) {
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        this.f161195v = new C58665a();
        FragmentActivity requireActivity = requireActivity();
        C87412m.m108593f(requireActivity, "requireActivity()");
        C58665a aVar = this.f161195v;
        if (aVar != null) {
            C58666b bVar = new C58666b(requireActivity, this, aVar, view, this.f161190q);
            this.f161196w = bVar;
            C58665a aVar2 = this.f161195v;
            if (aVar2 != null) {
                aVar2.f167946e = bVar;
                C58666b e = aVar2.mo83536e();
                e.f167956j = (FrameLayout) e.mo83537a(C0966R.C0970id.cjg);
                e.f167957k = e.mo83537a(C0966R.C0970id.i7j);
                e.f167958l = e.mo83537a(C0966R.C0970id.cj7);
                e.f167959m = e.mo83537a(C0966R.C0970id.is_);
                e.f167953g = (FinderRefreshLayout) e.mo83537a(C0966R.C0970id.ivb);
                View a = e.mo83537a(C0966R.C0970id.f358064ok2);
                e.f167960n = a;
                a.setBackgroundColor(e.f167947a.getResources().getColor(C0966R.color.f2929c));
                View view2 = e.f167960n;
                if (view2 != null) {
                    View findViewById = view2.findViewById(C0966R.C0970id.f358063ok1);
                    C87412m.m108593f(findViewById, "dateHeaderContainer.find…finder_date_header_title)");
                    e.f167961o = (TextView) findViewById;
                    FinderLoaderMoreFooter finderLoaderMoreFooter = new FinderLoaderMoreFooter(e.f167947a, (AttributeSet) null);
                    finderLoaderMoreFooter.mo79990j(C0966R.C0971layout.b7t);
                    e.f167963q = finderLoaderMoreFooter;
                    FinderRefreshLayout c = e.mo83539c();
                    C21804c cVar = e.f167963q;
                    C87412m.m108591d(cVar);
                    c.mo26641y(cVar);
                    RecyclerView recyclerView = e.mo83539c().getRecyclerView();
                    C87412m.m108592e(recyclerView, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerView");
                    e.f167955i = (WxRecyclerView) recyclerView;
                    e.mo83538b().setLayoutManager(e.f167962p.mo3666d(e.f167947a));
                    e.mo83538b().setItemAnimator((RecyclerView.C16616j) null);
                    FinderConvSearchFeedStaggeredConfig finderConvSearchFeedStaggeredConfig = (FinderConvSearchFeedStaggeredConfig) e.f167962p;
                    finderConvSearchFeedStaggeredConfig.getClass();
                    e.f167954h = new WxRecyclerAdapter<>(new FinderConvSearchFeedStaggeredConfig$getItemConvertFactory$1(finderConvSearchFeedStaggeredConfig, (C32226l<? super Integer, ? extends C60896i<?>>) null), e.f167949c.f167945d, false);
                    WxRecyclerView b = e.mo83538b();
                    ((FinderStaggeredConfig) e.f167962p).getClass();
                    b.mo17085h0(new FinderStaggeredConfig.C3631b());
                    WxRecyclerView b2 = e.mo83538b();
                    WxRecyclerAdapter<?> wxRecyclerAdapter = e.f167954h;
                    if (wxRecyclerAdapter != null) {
                        b2.setAdapter(wxRecyclerAdapter);
                        e.mo83538b().mo17043c(new C58669d(e));
                        C13442s8 s8Var = (C13442s8) C39818r.f106831a.mo62445d(e.f167948b).mo62449e(C13442s8.class);
                        if (s8Var != null) {
                            C13442s8.C13443a aVar3 = C13442s8.f38060Q0;
                            C58556f j3 = s8Var.mo12854j3(-1);
                            if (j3 != null) {
                                j3.mo83455c(e.mo83538b());
                            }
                        }
                        WxRecyclerAdapter<?> wxRecyclerAdapter2 = e.f167954h;
                        if (wxRecyclerAdapter2 != null) {
                            wxRecyclerAdapter2.f173488o = new C58670e(e);
                            if (wxRecyclerAdapter2 != null) {
                                wxRecyclerAdapter2.f173487n = new C58673h(e);
                                this.f161191r.observe(requireActivity(), new C56383a(this));
                                this.f161192s = true;
                                if (this.f161193t) {
                                    mo79135z();
                                    return;
                                }
                                return;
                            }
                            C87412m.m108603p("adapter");
                            throw null;
                        }
                        C87412m.m108603p("adapter");
                        throw null;
                    }
                    C87412m.m108603p("adapter");
                    throw null;
                }
                C87412m.m108603p("dateHeaderContainer");
                throw null;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: z */
    public void mo79135z() {
        if (this.f161192s) {
            C58666b bVar = this.f161196w;
            if (bVar != null) {
                FrameLayout frameLayout = bVar.f167956j;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                    View view = bVar.f167957k;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view2 = bVar.f167958l;
                        if (view2 != null) {
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(8);
                            View view3 = view2;
                            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            View view4 = bVar.f167959m;
                            if (view4 != null) {
                                C9556a aVar3 = new C9556a();
                                aVar3.mo10233c(8);
                                View view5 = view4;
                                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                return;
                            }
                            C87412m.m108603p("retryView");
                            throw null;
                        }
                        C87412m.m108603p("nothingView");
                        throw null;
                    }
                    C87412m.m108603p("loadingView");
                    throw null;
                }
                C87412m.m108603p("loadingLayout");
                throw null;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
        this.f161193t = true;
    }
}
