package com.tencent.p014mm.plugin.appbrand.utils;

import android.text.style.ClickableSpan;
import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.d2 */
public final class C2034d2 extends ClickableSpan {
    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/utils/StringSpanHelper$Companion$emptySpanIcon$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/utils/StringSpanHelper$Companion$emptySpanIcon$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }
}
