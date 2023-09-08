package com.tencent.p014mm.plugin.finder.search.p055ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kp1.C10377b;
import kp1.C10378c;
import kp1.C10379d;
import kp1.C10381f;
import kp1.C10382g;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/ui/search/FTSSearchView$e;", "Lcom/tencent/mm/ui/search/FTSEditTextView$l;", "Landroid/view/View;", "view", "Lrx3/b0;", "onClickBackBtn", "onClickCancelBtn", "onClickClearTextBtn", "v", "Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "setLoadingView", "(Landroid/view/View;)V", "loadingView", "w", "getUiContainer", "setUiContainer", "uiContainer", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.search.ui.FinderSearchBaseUI */
public abstract class FinderSearchBaseUI extends MMFinderUI implements FTSSearchView.C6995e, FTSEditTextView.C45051l {

    /* renamed from: o */
    public final String f16668o = "Finder.FinderSearchBaseUI";

    /* renamed from: p */
    public FTSSearchView f16669p;

    /* renamed from: q */
    public String f16670q = "";

    /* renamed from: r */
    public WxRecyclerAdapter<C0740i2> f16671r;

    /* renamed from: s */
    public RefreshLoadMoreLayout f16672s;

    /* renamed from: t */
    public RecyclerView f16673t;

    /* renamed from: u */
    public TextView f16674u;

    /* renamed from: v */
    public View f16675v;

    /* renamed from: w */
    public View f16676w;

    /* renamed from: D */
    public void mo3000D(boolean z) {
    }

    /* renamed from: N7 */
    public abstract C10381f mo3104N7();

    /* renamed from: O7 */
    public final TextView mo3958O7() {
        TextView textView = this.f16674u;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("noResultView");
        throw null;
    }

    /* renamed from: P7 */
    public final RefreshLoadMoreLayout mo3959P7() {
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f16672s;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout;
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }

    /* renamed from: Q7 */
    public final FTSSearchView mo3960Q7() {
        FTSSearchView fTSSearchView = this.f16669p;
        if (fTSSearchView != null) {
            return fTSSearchView;
        }
        C87412m.m108603p("searchView");
        throw null;
    }

    /* renamed from: R7 */
    public abstract C10382g mo3105R7();

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        String str3;
        if (str == null || (str3 = C112550d0.m153799i0(str).toString()) == null) {
            str3 = "";
        }
        if (Util.isNullOrNil(str3)) {
            View view = this.f16675v;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo3958O7().setVisibility(8);
                mo3959P7().setVisibility(8);
                return;
            }
            C87412m.m108603p("loadingView");
            throw null;
        }
    }

    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.f16673t;
        if (recyclerView != null) {
            return recyclerView;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
    }

    public void onBackPressed() {
        finish();
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
        mo3960Q7().getFtsEditText().mo70355k();
        showVKB();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16669p = new FTSSearchView((Context) this, false);
        mo3960Q7().setSearchViewListener(this);
        mo3960Q7().getFtsEditText().setHint(getString(C0966R.string.czk));
        mo3960Q7().getFtsEditText().setFtsEditTextListener(this);
        mo3960Q7().getFtsEditText().setCanDeleteTag(false);
        mo3960Q7().getFtsEditText().mo70338f();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91114y(mo3960Q7());
        }
        WeImageView weImageView = (WeImageView) mo3960Q7().findViewById(C0966R.C0970id.f357484a32);
        if (weImageView != null) {
            weImageView.setVisibility(0);
            weImageView.setOnClickListener(new C10379d(this));
        }
        this.f16670q = "";
        mo3960Q7().getFtsEditText().mo70355k();
        mo3960Q7().getFtsEditText().mo70361q();
        View findViewById = getContext().findViewById(C0966R.C0970id.ivb);
        C87412m.m108593f(findViewById, "context.findViewById(R.id.rl_layout)");
        this.f16672s = (RefreshLoadMoreLayout) findViewById;
        RecyclerView recyclerView = mo3959P7().getRecyclerView();
        C87412m.m108594g(recyclerView, "<set-?>");
        this.f16673t = recyclerView;
        View findViewById2 = getContext().findViewById(C0966R.C0970id.hgr);
        C87412m.m108593f(findViewById2, "context.findViewById(R.id.no_result_tv)");
        this.f16674u = (TextView) findViewById2;
        View findViewById3 = getContext().findViewById(C0966R.C0970id.g3e);
        C87412m.m108593f(findViewById3, "context.findViewById(R.id.loading_layout)");
        setLoadingView(findViewById3);
        View findViewById4 = getContext().findViewById(C0966R.C0970id.kzk);
        C87412m.m108593f(findViewById4, "context.findViewById(R.id.uiContainer)");
        setUiContainer(findViewById4);
        getRecyclerView().setLayoutManager(mo3105R7().mo3950b(this));
        RecyclerView.C0129l a = mo3105R7().mo3949a();
        if (a != null) {
            getRecyclerView().mo17085h0(a);
        }
        this.f16671r = new WxRecyclerAdapter<>(mo3105R7().mo3948U(), mo3104N7().mo3946c(), true);
        RecyclerView recyclerView2 = getRecyclerView();
        WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = this.f16671r;
        if (wxRecyclerAdapter != null) {
            recyclerView2.setAdapter(wxRecyclerAdapter);
            View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
            RefreshLoadMoreLayout P7 = mo3959P7();
            C87412m.m108593f(inflate, "loadmoreFooter");
            P7.setLoadMoreFooter(inflate);
            mo3958O7().setTextColor(getResources().getColor(C0966R.color.f3563xt));
            getRecyclerView().setOnTouchListener(new C10377b(this));
            mo3959P7().setEnablePullDownHeader(false);
            mo3959P7().setActionCallback(new C10378c(this));
            mo3960Q7().getFtsEditText().mo70356l(this.f16670q, (List<FTSSearchView.C6996f>) null);
            return;
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    public void onDestroy() {
        hideVKB();
        super.onDestroy();
    }

    public void onSwipeBack() {
        super.onSwipeBack();
        hideVKB();
    }

    public final void setLoadingView(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f16675v = view;
    }

    public final void setUiContainer(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f16676w = view;
    }

    /* renamed from: y */
    public boolean mo3009y() {
        String str;
        hideVKB();
        String totalQuery = mo3960Q7().getFtsEditText().getTotalQuery();
        if (totalQuery == null || (str = C112550d0.m153799i0(totalQuery).toString()) == null) {
            str = "";
        }
        if (Util.isNullOrNil(str)) {
            return true;
        }
        String str2 = this.f16668o;
        Log.m105924i(str2, "startSearch query:" + str);
        this.f16670q = str;
        mo3104N7().mo3945b(str);
        View view = this.f16675v;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "startSearch", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo3958O7().setVisibility(8);
            mo3959P7().setVisibility(8);
            RecyclerView recyclerView = getRecyclerView();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            RecyclerView recyclerView2 = recyclerView;
            C117292a.m165358d(recyclerView2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI", "startSearch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
            return false;
        }
        C87412m.m108603p("loadingView");
        throw null;
    }
}
