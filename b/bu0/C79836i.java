package bu0;

import android.view.View;
import bu0.C79819c;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.page.C83754a0;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.plugin.appbrand.page.C83974y0;
import com.tencent.p014mm.plugin.appbrand.page.x$$g;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: bu0.i */
public class C79836i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79819c f233986d;

    public C79836i(C79819c cVar) {
        this.f233986d = cVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f233986d.mo110003f(this.f233986d.f233941e.indexOfChild(view));
        C79819c cVar = this.f233986d;
        C79819c.C79830j jVar = cVar.f233948o;
        if (jVar != null) {
            int i = cVar.f233947n;
            String str = cVar.f233945i.get(i).f233969a;
            C83754a0 a0Var = (C83754a0) jVar;
            C83849m0 container = a0Var.f244476b.getContainer();
            container.getClass();
            container.mo116338c0(new C83974y0(container, str));
            HashMap hashMap = new HashMap();
            hashMap.put("pagePath", str);
            hashMap.put(MimeTypes.BASE_TYPE_TEXT, a0Var.f244475a.f239644g.get(i).f239646b);
            hashMap.put(FirebaseAnalytics.C113379b.INDEX, Integer.valueOf(i));
            C83780d1 currentPageView = a0Var.f244476b.getCurrentPageView();
            if (currentPageView != null) {
                x$$g x__g = new x$$g();
                x__g.mo115165o(hashMap);
                currentPageView.mo109669n(x__g, (int[]) null);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/tabbar/AppBrandPageTabBar$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
