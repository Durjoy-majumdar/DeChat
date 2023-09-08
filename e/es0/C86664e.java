package es0;

import android.app.Activity;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import j20.C117292a;
import java.util.ArrayList;
import te3.C90419io3;

/* renamed from: es0.e */
public final class C86664e implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C86647a f251648d;

    /* renamed from: e */
    public final /* synthetic */ C90419io3 f251649e;

    public C86664e(C86647a aVar, C90419io3 io32) {
        this.f251648d = aVar;
        this.f251649e = io32;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$onBindViewHolder$1$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        Activity activity = this.f251648d.f251610d;
        ClipboardHelper.setText(activity, "", this.f251649e.f259594r + ',' + this.f251649e.f259597u + ',' + this.f251649e.f259585f);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$onBindViewHolder$1$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
