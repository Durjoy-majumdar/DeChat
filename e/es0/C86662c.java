package es0;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.p026ui.recommend.AppBrandRecommendVideoUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import te3.C90419io3;

/* renamed from: es0.c */
public final class C86662c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C86647a f251639d;

    /* renamed from: e */
    public final /* synthetic */ C90419io3 f251640e;

    /* renamed from: f */
    public final /* synthetic */ int f251641f;

    public C86662c(C86647a aVar, C90419io3 io32, int i) {
        this.f251639d = aVar;
        this.f251640e = io32;
        this.f251641f = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$onBindViewHolder$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent(this.f251639d.f251610d, AppBrandRecommendVideoUI.class);
        intent.putExtra("1", this.f251640e.f259588i);
        Activity activity = this.f251639d.f251610d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Activity activity2 = activity;
        C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$onBindViewHolder$1$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity2, "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$onBindViewHolder$1$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f251639d.f251614h.invoke(this.f251640e, Integer.valueOf(this.f251641f));
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$onBindViewHolder$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
