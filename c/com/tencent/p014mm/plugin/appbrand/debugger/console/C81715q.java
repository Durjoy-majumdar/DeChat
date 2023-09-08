package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.q */
public final class C81715q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C81707l f239823d;

    public C81715q(C81707l lVar) {
        this.f239823d = lVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintPanelFloatWindow$view$2$1$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.AppBrand.ConsolePrintPanelFloatWindow", "onClick#realPanelContainer");
        this.f239823d.mo114067a();
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintPanelFloatWindow$view$2$1$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
