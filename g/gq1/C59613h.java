package gq1;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.fav.FinderGlobalFavFeedFragment;
import com.tencent.p014mm.plugin.finder.p056ui.fav.FinderGlobalFavLoaderMoreFooter;
import com.tencent.p014mm.plugin.finder.p056ui.fav.FinderGlobalFavStaggeredConfig;
import com.tencent.p014mm.plugin.finder.view.FinderRefreshLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.xweb.util.WXWebReporter;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import p525fr.C59313e;
import rx3.C13598b0;
import up1.C14367u0;

/* renamed from: gq1.h */
public final class C59613h {

    /* renamed from: a */
    public final Activity f170327a;

    /* renamed from: b */
    public final FinderGlobalFavFeedFragment f170328b;

    /* renamed from: c */
    public final C59604a f170329c;

    /* renamed from: d */
    public final View f170330d;

    /* renamed from: e */
    public FinderRefreshLayout f170331e;

    /* renamed from: f */
    public WxRecyclerAdapter<?> f170332f;

    /* renamed from: g */
    public WxRecyclerView f170333g;

    /* renamed from: h */
    public FrameLayout f170334h;

    /* renamed from: i */
    public View f170335i;

    /* renamed from: j */
    public View f170336j;

    /* renamed from: k */
    public View f170337k;

    /* renamed from: l */
    public final C32229r<C60905o, BaseFinderFeed, Integer, Boolean, C13598b0> f170338l;

    /* renamed from: m */
    public final C14367u0 f170339m;

    /* renamed from: n */
    public FinderGlobalFavLoaderMoreFooter f170340n;

    /* renamed from: gq1.h$a */
    public static final class C59614a extends C87413o implements C32229r<C60905o, BaseFinderFeed, Integer, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59613h f170341d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59614a(C59613h hVar) {
            super(4);
            this.f170341d = hVar;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            C59313e eVar;
            int intValue = ((Number) obj3).intValue();
            boolean booleanValue = ((Boolean) obj4).booleanValue();
            C87412m.m108594g((C60905o) obj, "holder");
            C87412m.m108594g((BaseFinderFeed) obj2, "item");
            C59604a aVar = this.f170341d.f170329c;
            C59605b bVar = aVar instanceof C59605b ? (C59605b) aVar : null;
            if (!(bVar == null || (eVar = bVar.f170315g) == null)) {
                eVar.mo84412I5(intValue, booleanValue ? 111 : WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS);
            }
            return C13598b0.f38549a;
        }
    }

    public C59613h(Activity activity, FinderGlobalFavFeedFragment finderGlobalFavFeedFragment, C59604a aVar, View view) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(finderGlobalFavFeedFragment, "fragment");
        C87412m.m108594g(aVar, "presenter");
        this.f170327a = activity;
        this.f170328b = finderGlobalFavFeedFragment;
        this.f170329c = aVar;
        this.f170330d = view;
        C59614a aVar2 = new C59614a(this);
        this.f170338l = aVar2;
        this.f170339m = new FinderGlobalFavStaggeredConfig(aVar2);
    }

    /* renamed from: a */
    public final <T extends View> T mo84628a(int i) {
        View view = this.f170330d;
        T findViewById = view != null ? view.findViewById(i) : null;
        if (findViewById != null) {
            return findViewById;
        }
        T findViewById2 = this.f170327a.findViewById(i);
        C87412m.m108593f(findViewById2, "context.findViewById(id)");
        return findViewById2;
    }

    /* renamed from: b */
    public final WxRecyclerView mo84629b() {
        WxRecyclerView wxRecyclerView = this.f170333g;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    /* renamed from: c */
    public final FinderRefreshLayout mo84630c() {
        FinderRefreshLayout finderRefreshLayout = this.f170331e;
        if (finderRefreshLayout != null) {
            return finderRefreshLayout;
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }

    /* renamed from: d */
    public final void mo84631d() {
        FrameLayout frameLayout = this.f170334h;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            View view = this.f170335i;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = this.f170336j;
                if (view2 != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view4 = this.f170337k;
                    if (view4 != null) {
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(8);
                        View view5 = view4;
                        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
}
