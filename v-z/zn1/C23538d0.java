package zn1;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.finder.view.FinderRefreshLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: zn1.d0 */
public final class C23538d0 {

    /* renamed from: a */
    public final Activity f67495a;

    /* renamed from: b */
    public final C23541z f67496b;

    /* renamed from: c */
    public FinderRefreshLayout f67497c;

    /* renamed from: d */
    public WxRecyclerView f67498d;

    /* renamed from: e */
    public FrameLayout f67499e;

    /* renamed from: f */
    public View f67500f;

    /* renamed from: g */
    public View f67501g;

    /* renamed from: h */
    public View f67502h;

    public C23538d0(Activity activity, C23541z zVar) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(zVar, "presenter");
        this.f67495a = activity;
        this.f67496b = zVar;
    }

    /* renamed from: a */
    public final FrameLayout mo36995a() {
        FrameLayout frameLayout = this.f67499e;
        if (frameLayout != null) {
            return frameLayout;
        }
        C87412m.m108603p("loadingLayout");
        throw null;
    }

    /* renamed from: b */
    public final WxRecyclerView mo36996b() {
        WxRecyclerView wxRecyclerView = this.f67498d;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    /* renamed from: c */
    public final View mo36997c() {
        View view = this.f67502h;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("retryView");
        throw null;
    }

    /* renamed from: d */
    public final FinderRefreshLayout mo36998d() {
        FinderRefreshLayout finderRefreshLayout = this.f67497c;
        if (finderRefreshLayout != null) {
            return finderRefreshLayout;
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }

    /* renamed from: e */
    public final void mo36999e() {
        mo36995a().setVisibility(8);
        mo36997c().setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: f */
    public final void mo37000f() {
        mo36995a().setVisibility(0);
        View view = this.f67500f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f67501g;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View c = mo36997c();
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view4 = c;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/playlist/FinderPlayListViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C87412m.m108603p("nothingView");
            throw null;
        }
        C87412m.m108603p("loadingView");
        throw null;
    }
}
