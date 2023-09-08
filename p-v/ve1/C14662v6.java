package ve1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import gy3.C8479f0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: ve1.v6 */
public final class C14662v6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14678w6 f40547d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<String> f40548e;

    public C14662v6(C14678w6 w6Var, C8479f0<String> f0Var) {
        this.f40547d = w6Var;
        this.f40548e = f0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderPoiManageItemConvert$onBindViewHolder$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C14678w6 w6Var = this.f40547d;
        Context context = view.getContext();
        C87412m.m108593f(context, "it.context");
        String str = (String) this.f40548e.f27484d;
        w6Var.getClass();
        if (!(str == null || str.length() == 0)) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderPoiManageItemConvert$onBindViewHolder$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
