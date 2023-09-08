package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.ThreeDotsLoadingView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.x */
public final class C84657x {

    /* renamed from: a */
    public final View f246975a;

    /* renamed from: b */
    public ThreeDotsLoadingView f246976b;

    /* renamed from: c */
    public View f246977c;

    /* renamed from: d */
    public View f246978d;

    public C84657x(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6449f6, viewGroup, false);
        this.f246975a = inflate;
        this.f246976b = (ThreeDotsLoadingView) inflate.findViewById(C0966R.C0970id.g3t);
        this.f246977c = inflate.findViewById(C0966R.C0970id.edk);
        this.f246978d = inflate.findViewById(C0966R.C0970id.cjz);
    }

    /* renamed from: a */
    public void mo117364a(boolean z) {
        if (z) {
            ThreeDotsLoadingView threeDotsLoadingView = this.f246976b;
            if (threeDotsLoadingView != null) {
                threeDotsLoadingView.setVisibility(0);
                this.f246976b.mo119903e();
            }
            View view = this.f246978d;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        ThreeDotsLoadingView threeDotsLoadingView2 = this.f246976b;
        if (threeDotsLoadingView2 != null) {
            threeDotsLoadingView2.mo119904f();
            this.f246976b.setVisibility(8);
        }
        View view3 = this.f246978d;
        if (view3 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListFooter", "setLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
