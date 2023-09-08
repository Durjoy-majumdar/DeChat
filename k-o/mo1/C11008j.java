package mo1;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0719c2;
import cm1.C0747l;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.FinderSelectContract$SelectPresenter;
import com.tencent.p014mm.plugin.finder.feed.FinderSelectContract$SelectViewCallback$initView$2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import dp1.C58417y0;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.regex.Pattern;
import jq3.C33631s;
import jq3.C60898l;
import kf1.C9626a9;
import kf1.C9637b9;
import kf1.C9673c9;
import kf1.C9689d9;
import kf1.C9700e9;
import kf1.C9719f9;
import kf1.C9748g9;
import lp3.C88643g;
import o40.C61926c;
import rs1.C13442s8;
import te3.C49712hj1;
import zc1.C66785b;

/* renamed from: mo1.j */
public final class C11008j extends UIComponent {

    /* renamed from: d */
    public FinderSelectContract$SelectPresenter f32724d;

    /* renamed from: e */
    public C9673c9 f32725e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11008j(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ap6;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getActivity().getIntent().getStringExtra("finder_username");
        this.f32724d = new FinderSelectContract$SelectPresenter(true, stringExtra);
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) activity;
        View rootView = getRootView();
        FinderSelectContract$SelectPresenter finderSelectContract$SelectPresenter = this.f32724d;
        C49712hj1 hj12 = null;
        if (finderSelectContract$SelectPresenter != null) {
            C9673c9 c9Var = new C9673c9(mMActivity, rootView, finderSelectContract$SelectPresenter, false, 8, (C8480h) null);
            this.f32725e = c9Var;
            FinderSelectContract$SelectPresenter finderSelectContract$SelectPresenter2 = this.f32724d;
            if (finderSelectContract$SelectPresenter2 != null) {
                finderSelectContract$SelectPresenter2.f13223i = c9Var;
                Pattern pattern = C61926c.f176038a;
                C61926c.m72665J(C61926c.m72701z(C88643g.m110546d(), new C9626a9(finderSelectContract$SelectPresenter2)), new C9637b9(finderSelectContract$SelectPresenter2));
                finderSelectContract$SelectPresenter2.mo2589e(false);
                if (finderSelectContract$SelectPresenter2.f13218d) {
                    C86709a0.m107524d().mo123455a(6833, finderSelectContract$SelectPresenter2);
                } else {
                    C86709a0.m107524d().mo123455a(5839, finderSelectContract$SelectPresenter2);
                }
                finderSelectContract$SelectPresenter2.f13226o.alive();
                C9673c9 c9Var2 = this.f32725e;
                if (c9Var2 != null) {
                    View findViewById = c9Var2.f30049e.findViewById(C0966R.C0970id.ivb);
                    C87412m.m108593f(findViewById, "contentView.findViewById(R.id.rl_layout)");
                    RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById;
                    c9Var2.f30053i = refreshLoadMoreLayout;
                    refreshLoadMoreLayout.setLimitTopRequest(((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.a8a)) - ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3709c2)));
                    RefreshLoadMoreLayout refreshLoadMoreLayout2 = c9Var2.f30053i;
                    if (refreshLoadMoreLayout2 != null) {
                        refreshLoadMoreLayout2.setRefreshTargetY(((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3758d_)) - ((int) MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.a8a)));
                        RefreshLoadMoreLayout refreshLoadMoreLayout3 = c9Var2.f30053i;
                        if (refreshLoadMoreLayout3 != null) {
                            refreshLoadMoreLayout3.setDamping(1.85f);
                            RefreshLoadMoreLayout refreshLoadMoreLayout4 = c9Var2.f30053i;
                            if (refreshLoadMoreLayout4 != null) {
                                refreshLoadMoreLayout4.setEnablePullDownHeader(false);
                                refreshLoadMoreLayout4.setActionCallback(new C9689d9(c9Var2, refreshLoadMoreLayout4));
                                if (!c9Var2.f30051g) {
                                    RefreshLoadMoreLayout refreshLoadMoreLayout5 = c9Var2.f30053i;
                                    if (refreshLoadMoreLayout5 != null) {
                                        refreshLoadMoreLayout5.setSuperNestedScroll(true);
                                    } else {
                                        C87412m.m108603p("rlLayout");
                                        throw null;
                                    }
                                }
                                RefreshLoadMoreLayout refreshLoadMoreLayout6 = c9Var2.f30053i;
                                if (refreshLoadMoreLayout6 != null) {
                                    refreshLoadMoreLayout6.setEnablePullDownHeader(false);
                                    RefreshLoadMoreLayout refreshLoadMoreLayout7 = c9Var2.f30053i;
                                    if (refreshLoadMoreLayout7 != null) {
                                        RecyclerView recyclerView = refreshLoadMoreLayout7.getRecyclerView();
                                        c9Var2.f30052h = recyclerView;
                                        if (recyclerView != null) {
                                            recyclerView.setLayoutManager(new LinearLayoutManager(c9Var2.f30048d));
                                            RecyclerView recyclerView2 = c9Var2.f30052h;
                                            if (recyclerView2 != null) {
                                                recyclerView2.setHasFixedSize(true);
                                                RecyclerView recyclerView3 = c9Var2.f30052h;
                                                if (recyclerView3 != null) {
                                                    recyclerView3.setItemViewCacheSize(5);
                                                    WxRecyclerAdapter<C0747l> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderSelectContract$SelectViewCallback$initView$2(), c9Var2.f30050f.f13222h, true);
                                                    c9Var2.f30059r = wxRecyclerAdapter;
                                                    wxRecyclerAdapter.f165737C = new C9700e9(c9Var2);
                                                    if (c9Var2.f30051g) {
                                                        C60898l.m71328U5(wxRecyclerAdapter, new C0719c2(C0966R.string.czk), false, 2, (Object) null);
                                                    }
                                                    RecyclerView recyclerView4 = c9Var2.f30052h;
                                                    if (recyclerView4 != null) {
                                                        recyclerView4.setAdapter(c9Var2.f30059r);
                                                        WxRecyclerAdapter<C0747l> wxRecyclerAdapter2 = c9Var2.f30059r;
                                                        if (wxRecyclerAdapter2 != null) {
                                                            wxRecyclerAdapter2.f173488o = new C9719f9(c9Var2);
                                                        }
                                                        View findViewById2 = c9Var2.f30049e.findViewById(C0966R.C0970id.kne);
                                                        C87412m.m108593f(findViewById2, "contentView.findViewById(R.id.tips_loading)");
                                                        c9Var2.f30054j = (ProgressBar) findViewById2;
                                                        View findViewById3 = c9Var2.f30049e.findViewById(C0966R.C0970id.knl);
                                                        C87412m.m108593f(findViewById3, "contentView.findViewById(R.id.tips_retry)");
                                                        c9Var2.f30055n = (TextView) findViewById3;
                                                        View findViewById4 = c9Var2.f30049e.findViewById(C0966R.C0970id.i5g);
                                                        C87412m.m108593f(findViewById4, "contentView.findViewById…_loading_state_container)");
                                                        c9Var2.f30056o = (FrameLayout) findViewById4;
                                                        TextView textView = c9Var2.f30055n;
                                                        if (textView != null) {
                                                            textView.setOnClickListener(new C9748g9(c9Var2));
                                                            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                                                            long j = C87412m.m108589b(stringExtra, C66785b.f191882e.mo90662O5()) ? 1 : 0;
                                                            C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
                                                            if (f != null) {
                                                                hj12 = f.mo12861q3();
                                                            }
                                                            y0Var.yy0(j, "1", 3, "", hj12);
                                                            return;
                                                        }
                                                        C87412m.m108603p("retryTextView");
                                                        throw null;
                                                    }
                                                    C87412m.m108603p("recyclerView");
                                                    throw null;
                                                }
                                                C87412m.m108603p("recyclerView");
                                                throw null;
                                            }
                                            C87412m.m108603p("recyclerView");
                                            throw null;
                                        }
                                        C87412m.m108603p("recyclerView");
                                        throw null;
                                    }
                                    C87412m.m108603p("rlLayout");
                                    throw null;
                                }
                                C87412m.m108603p("rlLayout");
                                throw null;
                            }
                            C87412m.m108603p("rlLayout");
                            throw null;
                        }
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            C87412m.m108603p("selectPresenter");
            throw null;
        }
        C87412m.m108603p("selectPresenter");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        FinderSelectContract$SelectPresenter finderSelectContract$SelectPresenter = this.f32724d;
        if (finderSelectContract$SelectPresenter != null) {
            finderSelectContract$SelectPresenter.onDetach();
        } else {
            C87412m.m108603p("selectPresenter");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("Finder.ProfileActivityUIC", "onResume");
    }

    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        Log.m105924i("Finder.ProfileActivityUIC", "onUserVisibleFocused");
        C9673c9 c9Var = this.f32725e;
        if (c9Var != null) {
            String str = C9673c9.f30047s;
            Log.m105924i(str, "onUserVisibleFocused : " + c9Var.f30058q);
            LinkedList<C33631s> linkedList = c9Var.f30058q;
            if (linkedList != null) {
                c9Var.mo10292p(linkedList);
                return;
            }
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }
}
