package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C0654b;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import mq3.C47093a;
import nr3.C89059e;
import o40.C61926c;
import ob0.C89132b;
import qg1.C62611b0;
import qk1.C63218h0;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C50249le;
import te3.C50328ly3;
import te3.C64273c21;
import te3.C64281ca1;
import te3.C64504ky3;
import vf1.C65734v1;
import vf1.C65736w1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/ui/search/FTSSearchView$e;", "Lcom/tencent/mm/ui/search/FTSEditTextView$l;", "Landroid/view/View;", "view", "Lrx3/b0;", "onClickBackBtn", "onClickClearTextBtn", "onClickCancelBtn", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI */
public final class FinderLiveBizSearchUI extends MMFinderUI implements FTSSearchView.C6995e, FTSEditTextView.C45051l {

    /* renamed from: o */
    public WxRefreshLayout f158970o;

    /* renamed from: p */
    public RecyclerView f158971p;

    /* renamed from: q */
    public FTSSearchView f158972q;

    /* renamed from: r */
    public View f158973r;

    /* renamed from: s */
    public View f158974s;

    /* renamed from: t */
    public View f158975t;

    /* renamed from: u */
    public final C63218h0 f158976u = new C63218h0();

    /* renamed from: v */
    public int f158977v;

    /* renamed from: w */
    public String f158978w;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI$a */
    public static final class C55821a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveBizSearchUI f158979d;

        public C55821a(FinderLiveBizSearchUI finderLiveBizSearchUI) {
            this.f158979d = finderLiveBizSearchUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f158979d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI$b */
    public static final class C55822b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveBizSearchUI f158980a;

        /* renamed from: b */
        public final /* synthetic */ C32228q<Integer, Integer, C50328ly3, C13598b0> f158981b;

        public C55822b(FinderLiveBizSearchUI finderLiveBizSearchUI, C32228q<? super Integer, ? super Integer, ? super C50328ly3, C13598b0> qVar) {
            this.f158980a = finderLiveBizSearchUI;
            this.f158981b = qVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C62611b0.C35849a aVar = C62611b0.f177808u;
            C87412m.m108593f(cVar, LocaleUtil.ITALIAN);
            C50328ly3 ly32 = (C50328ly3) aVar.mo60444a(cVar, new C50328ly3());
            if (ly32 != null) {
                FinderLiveBizSearchUI finderLiveBizSearchUI = this.f158980a;
                C32228q<Integer, Integer, C50328ly3, C13598b0> qVar = this.f158981b;
                if (!(cVar.f256793a == 0) || cVar.f256794b != 0) {
                    int i = FinderLiveBizListUI.f158960v;
                    Log.m105920e("finder_live_biz_list", "SearchScreenCastReq Request Fail! errType = " + cVar.f256793a + ", errCode = " + cVar.f256794b + ", errMsg = " + cVar.f256795c);
                } else {
                    finderLiveBizSearchUI.f158977v = ly32.f137720f;
                    finderLiveBizSearchUI.f158978w = ly32.f137721g;
                }
                C61926c.m72668M(new C29957l(qVar, cVar, ly32));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI$c */
    public static final class C55823c extends C87413o implements C32228q<Integer, Integer, C50328ly3, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveBizSearchUI f158982d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55823c(FinderLiveBizSearchUI finderLiveBizSearchUI) {
            super(3);
            this.f158982d = finderLiveBizSearchUI;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            C50328ly3 ly32 = (C50328ly3) obj3;
            C87412m.m108594g(ly32, "resp");
            View view = this.f158982d.f158975t;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C63218h0 h0Var = this.f158982d.f158976u;
                LinkedList<C50249le> linkedList = ly32.f137718d;
                C87412m.m108593f(linkedList, "resp.list");
                h0Var.getClass();
                h0Var.f179392d = linkedList;
                h0Var.notifyDataSetChanged();
                if (intValue != 0 || intValue2 != 0) {
                    View view2 = this.f158982d.f158974s;
                    if (view2 != null) {
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(8);
                        View view3 = view2;
                        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view4 = this.f158982d.f158973r;
                        if (view4 != null) {
                            C9556a aVar3 = new C9556a();
                            aVar3.mo10233c(0);
                            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            C87412m.m108603p("retryView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("noResultView");
                        throw null;
                    }
                } else if (ly32.f137718d.isEmpty()) {
                    View view5 = this.f158982d.f158973r;
                    if (view5 != null) {
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(8);
                        View view6 = view5;
                        C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view7 = this.f158982d.f158974s;
                        if (view7 != null) {
                            C9556a aVar5 = new C9556a();
                            aVar5.mo10233c(0);
                            View view8 = view7;
                            C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                            C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            C87412m.m108603p("noResultView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("retryView");
                        throw null;
                    }
                } else {
                    View view9 = this.f158982d.f158973r;
                    if (view9 != null) {
                        C9556a aVar6 = new C9556a();
                        aVar6.mo10233c(8);
                        View view10 = view9;
                        C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view11 = this.f158982d.f158974s;
                        if (view11 != null) {
                            C9556a aVar7 = new C9556a();
                            aVar7.mo10233c(8);
                            View view12 = view11;
                            C117292a.m165358d(view12, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view11.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                            C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI$search$1", "invoke", "(IILcom/tencent/mm/protocal/protobuf/SearchScreenCastAppMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            C87412m.m108603p("noResultView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("retryView");
                        throw null;
                    }
                }
                return C13598b0.f38549a;
            }
            C87412m.m108603p("loadingView");
            throw null;
        }
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
    }

    /* renamed from: N7 */
    public final void mo77424N7(String str, C32228q<? super Integer, ? super Integer, ? super C50328ly3, C13598b0> qVar) {
        C64273c21 c212;
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C0654b bVar = (C0654b) finderLiveService.mo77630e(C0654b.class);
        String str2 = null;
        String str3 = bVar != null ? bVar.f1545g : null;
        if (str3 == null || str3.length() == 0) {
            C54991o oVar = (C54991o) finderLiveService.mo77630e(cls2);
            str3 = oVar != null ? oVar.f154377v3 : null;
        }
        C54991o oVar2 = (C54991o) finderLiveService.mo77630e(cls2);
        if (oVar2 != null) {
            str2 = oVar2.f154345o;
        }
        C55001u uVar = (C55001u) finderLiveService.mo77630e(cls);
        long j = 0;
        long j2 = uVar != null ? uVar.f154416j : 0;
        C55001u uVar2 = (C55001u) finderLiveService.mo77630e(cls);
        if (!(uVar2 == null || (c212 = uVar2.f154420q) == null)) {
            j = c212.f182392d;
        }
        Log.m105924i("finder_live_biz_list", "username = " + str2 + ", objectId = " + C61926c.m72691p(j2) + ", liveId = " + j + ", biz username = " + str3);
        C64281ca1 ca12 = new C64281ca1();
        ca12.f182457f = 1;
        ca12.f182458g = str2;
        ca12.f182455d = j2;
        ca12.f182456e = j;
        C64504ky3 ky32 = new C64504ky3();
        ky32.f183998d = str3;
        ky32.f183999e = this.f158977v;
        ky32.f184002h = this.f158978w;
        ky32.f184000f = 15;
        ky32.f184001g = str;
        C13598b0 b0Var = C13598b0.f38549a;
        C89059e i = new C62611b0("/cgi-bin/mmbiz-bin/finderlivesearchscreencastappmsg", 11675, ky32, ca12, (C49712hj1) null).mo9225i();
        i.mo123420E(new C55822b(this, qVar));
        i.mo11397F(this);
    }

    /* renamed from: O7 */
    public final void mo77425O7(String str) {
        this.f158977v = 0;
        this.f158978w = null;
        View view = this.f158973r;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI", "search", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI", "search", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f158974s;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI", "search", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI", "search", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view4 = this.f158975t;
                if (view4 != null) {
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(0);
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI", "search", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveBizSearchUI", "search", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    mo77424N7(str, new C55823c(this));
                    return;
                }
                C87412m.m108603p("loadingView");
                throw null;
            }
            C87412m.m108603p("noResultView");
            throw null;
        }
        C87412m.m108603p("retryView");
        throw null;
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d1q;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return null;
    }

    public final void init() {
        View findViewById = findViewById(C0966R.C0970id.is8);
        C87412m.m108593f(findViewById, "findViewById(R.id.retry_layout)");
        this.f158973r = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.hgr);
        C87412m.m108593f(findViewById2, "findViewById(R.id.no_result_tv)");
        this.f158974s = findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.g3t);
        C87412m.m108593f(findViewById3, "findViewById(R.id.loading_view)");
        this.f158975t = findViewById3;
        View view = this.f158973r;
        if (view != null) {
            view.setOnClickListener(new C65736w1(this));
            FTSSearchView fTSSearchView = new FTSSearchView((Context) this, false);
            this.f158972q = fTSSearchView;
            fTSSearchView.setSearchViewListener(this);
            FTSSearchView fTSSearchView2 = this.f158972q;
            if (fTSSearchView2 != null) {
                fTSSearchView2.getFtsEditText().setHint(getString(C0966R.string.a2p));
                FTSSearchView fTSSearchView3 = this.f158972q;
                if (fTSSearchView3 != null) {
                    fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
                    FTSSearchView fTSSearchView4 = this.f158972q;
                    if (fTSSearchView4 != null) {
                        fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
                        FTSSearchView fTSSearchView5 = this.f158972q;
                        if (fTSSearchView5 != null) {
                            fTSSearchView5.getFtsEditText().mo70338f();
                            ActionBar supportActionBar = getSupportActionBar();
                            C87412m.m108591d(supportActionBar);
                            FTSSearchView fTSSearchView6 = this.f158972q;
                            if (fTSSearchView6 != null) {
                                supportActionBar.mo91114y(fTSSearchView6);
                                FTSSearchView fTSSearchView7 = this.f158972q;
                                if (fTSSearchView7 != null) {
                                    fTSSearchView7.getFtsEditText().mo70355k();
                                    FTSSearchView fTSSearchView8 = this.f158972q;
                                    if (fTSSearchView8 != null) {
                                        fTSSearchView8.getFtsEditText().mo70361q();
                                        View findViewById4 = findViewById(C0966R.C0970id.nin);
                                        C87412m.m108593f(findViewById4, "findViewById(R.id.biz_list)");
                                        RecyclerView recyclerView = (RecyclerView) findViewById4;
                                        this.f158971p = recyclerView;
                                        recyclerView.setAdapter(this.f158976u);
                                        RecyclerView recyclerView2 = this.f158971p;
                                        if (recyclerView2 != null) {
                                            recyclerView2.setLayoutManager(new LinearLayoutManager(this));
                                            View findViewById5 = findViewById(C0966R.C0970id.ml8);
                                            C87412m.m108593f(findViewById5, "findViewById(R.id.refresh_layout)");
                                            WxRefreshLayout wxRefreshLayout = (WxRefreshLayout) findViewById5;
                                            this.f158970o = wxRefreshLayout;
                                            C47093a aVar = new C47093a();
                                            aVar.f126539a = 0.5f;
                                            aVar.f126540b = 300;
                                            aVar.f126541c = false;
                                            aVar.f126543e = true;
                                            aVar.f126544f = true;
                                            aVar.f126545g = true;
                                            aVar.f126546h = true;
                                            aVar.f126547i = false;
                                            aVar.f126548j = true;
                                            aVar.f126549k = true;
                                            aVar.f126550l = true;
                                            aVar.f126551m = false;
                                            aVar.f126552n = false;
                                            aVar.f126553o = true;
                                            aVar.f126554p = false;
                                            aVar.f126555q = false;
                                            wxRefreshLayout.setCommonConfig(aVar);
                                            WxRefreshLayout wxRefreshLayout2 = this.f158970o;
                                            if (wxRefreshLayout2 != null) {
                                                wxRefreshLayout2.setOnSimpleAction(new C65734v1(this));
                                                setBackBtn(new C55821a(this));
                                                return;
                                            }
                                            C87412m.m108603p("refreshLayout");
                                            throw null;
                                        }
                                        C87412m.m108603p("bizList");
                                        throw null;
                                    }
                                    C87412m.m108603p("searchView");
                                    throw null;
                                }
                                C87412m.m108603p("searchView");
                                throw null;
                            }
                            C87412m.m108603p("searchView");
                            throw null;
                        }
                        C87412m.m108603p("searchView");
                        throw null;
                    }
                    C87412m.m108603p("searchView");
                    throw null;
                }
                C87412m.m108603p("searchView");
                throw null;
            }
            C87412m.m108603p("searchView");
            throw null;
        }
        C87412m.m108603p("retryView");
        throw null;
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        String string;
        if (i == 5 && i2 == -1 && intent != null && (extras = intent.getExtras()) != null && (string = extras.getString("finder_biz_live_article_url")) != null) {
            Intent intent2 = new Intent();
            intent2.putExtra("finder_biz_live_article_url", string);
            setResult(-1, intent2);
            finish();
        }
    }

    public void onClickBackBtn(View view) {
        hideVKB();
        finish();
    }

    public void onClickCancelBtn(View view) {
        hideVKB();
        finish();
    }

    public void onClickClearTextBtn(View view) {
        FTSSearchView fTSSearchView = this.f158972q;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70336d();
        } else {
            C87412m.m108603p("searchView");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        init();
    }

    /* renamed from: y */
    public boolean mo3009y() {
        hideVKB();
        FTSSearchView fTSSearchView = this.f158972q;
        if (fTSSearchView != null) {
            mo77425O7(fTSSearchView.getFtsEditText().getEditText().getText().toString());
            return true;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
