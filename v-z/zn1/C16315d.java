package zn1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.playlist.FinderPlayListDrawer;
import com.tencent.p014mm.plugin.finder.playlist.FinderPlayListDrawerPresenter$getAdapter$1;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: zn1.d */
public final class C16315d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f43618d;

    /* renamed from: e */
    public final /* synthetic */ FrameLayout.LayoutParams f43619e;

    /* renamed from: f */
    public final /* synthetic */ View f43620f;

    /* renamed from: g */
    public final /* synthetic */ FinderPlayListDrawer f43621g;

    /* renamed from: h */
    public final /* synthetic */ C16322k f43622h;

    public C16315d(Context context, FrameLayout.LayoutParams layoutParams, View view, FinderPlayListDrawer finderPlayListDrawer, C16322k kVar) {
        this.f43618d = context;
        this.f43619e = layoutParams;
        this.f43620f = view;
        this.f43621g = finderPlayListDrawer;
        this.f43622h = kVar;
    }

    public final void run() {
        int e = C75044y4.m89993e(this.f43618d);
        Log.m105924i("Finder.FinderPlayListDrawer", "[initView] bottomMargin= " + e);
        this.f43619e.bottomMargin = e;
        View view = this.f43620f;
        C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((FrameLayout) view).addView(this.f43621g, this.f43619e);
        C16322k kVar = this.f43622h;
        Context context = this.f43618d;
        FrameLayout headerLayout = this.f43621g.getHeaderLayout();
        kVar.getClass();
        C87412m.m108594g(context, "context");
        C87412m.m108594g(headerLayout, "headerLayout");
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.d2d, headerLayout);
        View findViewById = inflate.findViewById(C0966R.C0970id.f357887ca2);
        C87412m.m108593f(findViewById, "header.findViewById(R.id.drawer_header_tv)");
        kVar.f43631f = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.nkl);
        C87412m.m108593f(findViewById2, "header.findViewById(R.id.drawer_header_desc_tv)");
        kVar.f43632g = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.nkm);
        C87412m.m108593f(findViewById3, "header.findViewById(R.id.drawer_header_line)");
        kVar.f43633h = findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.nkk);
        C87412m.m108593f(findViewById4, "header.findViewById(R.id.drawer_header_arrow)");
        kVar.f43634i = findViewById4;
        View findViewById5 = inflate.findViewById(C0966R.C0970id.nkn);
        C87412m.m108593f(findViewById5, "header.findViewById(R.id.drawer_more_iv)");
        ImageView imageView = (ImageView) findViewById5;
        kVar.f43635j = imageView;
        imageView.setOnClickListener(new C16320i(kVar));
        TextView textView = kVar.f43631f;
        if (textView != null) {
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            FinderPlayListDrawer h = kVar.mo14806h();
            ImageView imageView2 = kVar.f43635j;
            if (imageView2 != null) {
                h.mo82528c(imageView2);
                C16322k kVar2 = this.f43622h;
                Context context2 = this.f43618d;
                RefreshLoadMoreLayout centerLayout = this.f43621g.getCenterLayout();
                kVar2.getClass();
                C87412m.m108594g(context2, "context");
                C87412m.m108594g(centerLayout, "rlLayout");
                kVar2.f43640r = centerLayout;
                View inflate2 = C85868k2.m106137b(context2).inflate(C0966R.C0971layout.d2g, (ViewGroup) null);
                C87412m.m108593f(inflate2, "getInflater(context).inf…t_load_more_footer, null)");
                centerLayout.setLoadMoreFooter(inflate2);
                centerLayout.setLimitTopRequest(((int) context2.getResources().getDimension(C0966R.dimen.a8a)) - ((int) context2.getResources().getDimension(C0966R.dimen.f3709c2)));
                centerLayout.setDamping(1.85f);
                RecyclerView recyclerView = centerLayout.getRecyclerView();
                recyclerView.setHasFixedSize(true);
                recyclerView.setItemViewCacheSize(4);
                RecyclerView.C16616j itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.f44810f = 0;
                }
                recyclerView.setLayoutManager(new FinderLinearLayoutManager(context2));
                C16323l lVar = kVar2.f43629d;
                lVar.getClass();
                WxRecyclerAdapter<?> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderPlayListDrawerPresenter$getAdapter$1(), lVar.f43643b.f43693a, false);
                lVar.f43647f = wxRecyclerAdapter;
                wxRecyclerAdapter.f173488o = new C16330n(lVar);
                recyclerView.setAdapter(wxRecyclerAdapter);
                C16322k kVar3 = this.f43622h;
                Context context3 = this.f43618d;
                FrameLayout loadingLayout = this.f43621g.getLoadingLayout();
                kVar3.getClass();
                C87412m.m108594g(context3, "context");
                C87412m.m108594g(loadingLayout, "loadingLayout");
                kVar3.f43636n = loadingLayout;
                View inflate3 = LayoutInflater.from(context3).inflate(C0966R.C0971layout.d2h, loadingLayout, true);
                View findViewById6 = inflate3.findViewById(C0966R.C0970id.non);
                C87412m.m108593f(findViewById6, "loadingContentLayout.fin….id.playlist_loading_bar)");
                kVar3.f43637o = findViewById6;
                View findViewById7 = inflate3.findViewById(C0966R.C0970id.noi);
                C87412m.m108593f(findViewById7, "loadingContentLayout.fin…Id(R.id.no_playlist_hint)");
                kVar3.f43638p = findViewById7;
                View findViewById8 = inflate3.findViewById(C0966R.C0970id.np_);
                C87412m.m108593f(findViewById8, "loadingContentLayout.fin…id.retry_playlist_layout)");
                kVar3.f43639q = findViewById8;
                View view2 = kVar3.f43637o;
                if (view2 != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View d = kVar3.mo14805d();
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(8);
                    View view4 = d;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    d.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View i = kVar3.mo14807i();
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    View view5 = i;
                    C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                C87412m.m108603p("loadingView");
                throw null;
            }
            C87412m.m108603p("headerMoreIv");
            throw null;
        }
        C87412m.m108603p("headerTitleTv");
        throw null;
    }
}
