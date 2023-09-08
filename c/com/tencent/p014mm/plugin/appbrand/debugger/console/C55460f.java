package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.f */
public final class C55460f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C55463j f158029d;

    public C55460f(C55463j jVar) {
        this.f158029d = jVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintControlFloatWindow$view$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32224a<C13598b0> aVar = this.f158029d.f158036a;
        if (aVar != null) {
            aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintControlFloatWindow$view$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
