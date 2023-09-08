package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.p */
public final class C1526p implements View.OnClickListener {

    /* renamed from: d */
    public static final C1526p f10896d = new C1526p();

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintPanelFloatWindow$view$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.AppBrand.ConsolePrintPanelFloatWindow", "onClick#realPanel");
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/debugger/console/ConsolePrintPanelFloatWindow$view$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
