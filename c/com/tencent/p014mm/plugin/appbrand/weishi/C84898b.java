package com.tencent.p014mm.plugin.appbrand.weishi;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.weishi.b */
public class C84898b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C84899c f247425d;

    public C84898b(C84899c cVar) {
        this.f247425d = cVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/weishi/AppBrandThumbLoadingSplash$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.AppBrandThumbLoadingSplash", "[weishi] splash click close button");
        C84905f.m104622c();
        AppBrandRuntime appBrandRuntime = this.f247425d.f247426d;
        if (appBrandRuntime != null) {
            C83231l.m102146g(appBrandRuntime.f238147j, C83231l.C83235e.CLOSE);
            this.f247425d.f247426d.mo113063k();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/weishi/AppBrandThumbLoadingSplash$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
