package com.tencent.p014mm.plugin.appbrand.page;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.protocal.protobuf.AppCommentModule;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$b */
public final /* synthetic */ class AppBrandMenuHeader$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandMenuHeader f244389d;

    /* renamed from: e */
    public final /* synthetic */ AppCommentModule f244390e;

    /* renamed from: f */
    public final /* synthetic */ String f244391f;

    public /* synthetic */ AppBrandMenuHeader$$b(AppBrandMenuHeader appBrandMenuHeader, AppCommentModule appCommentModule, String str) {
        this.f244389d = appBrandMenuHeader;
        this.f244390e = appCommentModule;
        this.f244391f = str;
    }

    public final void onClick(View view) {
        AppBrandMenuHeader appBrandMenuHeader = this.f244389d;
        AppCommentModule appCommentModule = this.f244390e;
        String str = this.f244391f;
        int i = AppBrandMenuHeader.f244378q;
        appBrandMenuHeader.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(appCommentModule);
        arrayList.add(str);
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", appBrandMenuHeader, array);
        appBrandMenuHeader.mo116016c(appCommentModule.more_appid, appCommentModule.more_path, appCommentModule.more_query);
        C84240s.m103845k(str, 2, 1);
        C117292a.m165361g(appBrandMenuHeader, "com/tencent/mm/plugin/appbrand/page/AppBrandMenuHeader", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
