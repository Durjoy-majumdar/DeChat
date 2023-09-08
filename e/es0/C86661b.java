package es0;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import es0.C86647a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.C90419io3;

/* renamed from: es0.b */
public final class C86661b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C86647a f251634d;

    /* renamed from: e */
    public final /* synthetic */ C86647a.C86650c f251635e;

    /* renamed from: f */
    public final /* synthetic */ WxaAttributes f251636f;

    /* renamed from: g */
    public final /* synthetic */ C90419io3 f251637g;

    /* renamed from: h */
    public final /* synthetic */ int f251638h;

    public C86661b(C86647a aVar, C86647a.C86650c cVar, WxaAttributes wxaAttributes, C90419io3 io32, int i) {
        this.f251634d = aVar;
        this.f251635e = cVar;
        this.f251636f = wxaAttributes;
        this.f251637g = io32;
        this.f251638h = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C86647a aVar = this.f251634d;
        Context context = this.f251635e.f44854d.getContext();
        C87412m.m108593f(context, "baseViewHolder.itemView.context");
        aVar.mo121056O4(context, this.f251636f, this.f251637g, this.f251638h, true);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
