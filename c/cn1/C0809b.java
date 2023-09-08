package cn1;

import an1.C0088a;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import ke3.C88144b;

/* renamed from: cn1.b */
public final class C0809b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0088a f1888d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f1889e;

    public C0809b(C0088a aVar, C60905o oVar) {
        this.f1888d = aVar;
        this.f1889e = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AdConvert$onBindViewHolder$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = this.f1888d.f522e;
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str != null) {
            C60905o oVar = this.f1889e;
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            intent.putExtra("useJs", true);
            C88144b.m109791i(oVar.f173499A, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AdConvert$onBindViewHolder$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
