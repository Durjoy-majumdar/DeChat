package com.tencent.p014mm.plugin.appbrand.p026ui.recommend;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherUI;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import es0.C31692r;
import es0.C58801k;
import es0.C7929p;
import es0.C86647a;
import es0.C86669m;
import es0.C86671o;
import es0.C86672q;
import es0.C86673s;
import es0.C86674t;
import es0.C86675u;
import es0.C86678x;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandLauncherRecommendList;", "Lcom/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUI$Fragment;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.recommend.AppBrandLauncherRecommendList */
public final class AppBrandLauncherRecommendList extends AppBrandLauncherUI.Fragment {

    /* renamed from: h */
    public final C13601g f246991h = C36568h.m40985a(new C84663a(this));

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.recommend.AppBrandLauncherRecommendList$a */
    public static final class C84663a extends C87413o implements C32224a<AppBrandLauncherRecommendList$uiLogic$2$1> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandLauncherRecommendList f246992d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84663a(AppBrandLauncherRecommendList appBrandLauncherRecommendList) {
            super(0);
            this.f246992d = appBrandLauncherRecommendList;
        }

        public Object invoke() {
            FragmentActivity activity = this.f246992d.getActivity();
            C87412m.m108591d(activity);
            return new AppBrandLauncherRecommendList$uiLogic$2$1(this.f246992d, activity);
        }
    }

    /* renamed from: L */
    public void mo117065L() {
        Log.m105924i("MicroMsg.AppBrandLauncherRecommendsList", "onTitleDoubleTap");
        LoadMoreRecyclerView g = ((AppBrandRecommendUILogic) ((C36570n) this.f246991h).getValue()).mo117377g();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(g, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandLauncherRecommendList", "onTitleDoubleTap", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        g.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(g, "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandLauncherRecommendList", "onTitleDoubleTap", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }

    public int getLayoutId() {
        return -1;
    }

    public void initView() {
        AppBrandRecommendUILogic appBrandRecommendUILogic = (AppBrandRecommendUILogic) ((C36570n) this.f246991h).getValue();
        appBrandRecommendUILogic.mo117377g().setLayoutManager(appBrandRecommendUILogic.f247002n);
        View c = appBrandRecommendUILogic.mo117371c();
        C87412m.m108592e(c, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((FrameLayout) c).addView(appBrandRecommendUILogic.mo117377g(), new ViewGroup.LayoutParams(-1, -1));
        appBrandRecommendUILogic.f247000i.setHasStableIds(true);
        C86647a aVar = appBrandRecommendUILogic.f247000i;
        C86673s sVar = new C86673s(appBrandRecommendUILogic);
        aVar.getClass();
        aVar.f251612f = sVar;
        C86647a aVar2 = appBrandRecommendUILogic.f247000i;
        C86674t tVar = new C86674t(appBrandRecommendUILogic);
        aVar2.getClass();
        aVar2.f251614h = tVar;
        C86647a aVar3 = appBrandRecommendUILogic.f247000i;
        C86675u uVar = new C86675u(appBrandRecommendUILogic);
        aVar3.getClass();
        aVar3.f251613g = uVar;
        appBrandRecommendUILogic.mo117377g().setAdapter(appBrandRecommendUILogic.f247000i);
        boolean z = false;
        if (appBrandRecommendUILogic.mo117373f()) {
            appBrandRecommendUILogic.mo117377g().addHeaderView(appBrandRecommendUILogic.f247003o.f246981g);
            ViewGroup viewGroup = appBrandRecommendUILogic.f247003o.f246981g;
            if (viewGroup != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar4.mo10233c(8);
                C117292a.m165358d(viewGroup, aVar4.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic", "initHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                viewGroup.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(viewGroup, "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic", "initHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            appBrandRecommendUILogic.f247003o.mo117280e();
            appBrandRecommendUILogic.f247003o.mo117315i(0);
            appBrandRecommendUILogic.f247003o.mo117370r();
        }
        View inflate = LayoutInflater.from(appBrandRecommendUILogic.f246996e).inflate(C0966R.C0971layout.f6460fg, appBrandRecommendUILogic.mo117377g(), false);
        appBrandRecommendUILogic.mo117377g().addHeaderView(inflate);
        View findViewById = inflate.findViewById(C0966R.C0970id.evl);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(appBrandRecommendUILogic.mo117372d());
        inflate.setOnLongClickListener(C7929p.f26615d);
        appBrandRecommendUILogic.mo117377g().setLoadingView(appBrandRecommendUILogic.mo117376e().f246975a);
        C86678x.m107497b(appBrandRecommendUILogic, false);
        C86678x.m107498c(appBrandRecommendUILogic, false);
        appBrandRecommendUILogic.mo117376e().getClass();
        View view = appBrandRecommendUILogic.mo117376e().f246977c;
        if (view != null) {
            view.setBackgroundResource(C0966R.color.ahf);
        }
        appBrandRecommendUILogic.f247001j.f247013a = appBrandRecommendUILogic.mo117375b().f257080h;
        appBrandRecommendUILogic.f247001j.f247015c = appBrandRecommendUILogic.mo117375b().f257079g > 0;
        appBrandRecommendUILogic.mo117375b().f257086n = new C86671o(appBrandRecommendUILogic);
        if (!appBrandRecommendUILogic.mo117375b().mo123547c().isEmpty() && appBrandRecommendUILogic.mo117375b().f257081i) {
            z = true;
        }
        C86678x.m107497b(appBrandRecommendUILogic, true);
        C86678x.m107498c(appBrandRecommendUILogic, true);
        appBrandRecommendUILogic.f246999h.post(new C31692r(new C86669m(appBrandRecommendUILogic, z)));
        if (!z) {
            C58801k.m68584b(2);
        }
        appBrandRecommendUILogic.mo117377g().setOnLoadingStateChangedListener(new C86672q(appBrandRecommendUILogic));
        appBrandRecommendUILogic.mo117377g().mo17043c(appBrandRecommendUILogic.f247012x);
        appBrandRecommendUILogic.f247004p.mo121063b();
        appBrandRecommendUILogic.f247000i.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.AppBrandLauncherRecommendsList", "onCreate");
        getLifecycle().addObserver((AppBrandRecommendUILogic) ((C36570n) this.f246991h).getValue());
    }

    public void onDestroyView() {
        super.onDestroyView();
        Log.m105924i("MicroMsg.AppBrandLauncherRecommendsList", "onDestroyView");
        getLifecycle().getCurrentState();
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.AppBrandLauncherRecommendsList", "onPause");
    }
}
