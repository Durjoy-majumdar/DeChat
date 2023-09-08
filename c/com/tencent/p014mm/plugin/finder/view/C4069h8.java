package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Calendar;
import xp1.C15869b;
import ze1.C16145a;

/* renamed from: com.tencent.mm.plugin.finder.view.h8 */
public final class C4069h8 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TestPreloadPreview f18197d;

    public C4069h8(TestPreloadPreview testPreloadPreview) {
        this.f18197d = testPreloadPreview;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/TestPreloadPreview$notifyChange$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C15869b bVar = C15869b.f42722a;
        Context context = this.f18197d.getContext();
        C87412m.m108593f(context, "context");
        Calendar calendar = C16145a.f43335a;
        C15869b.m14793c(bVar, context, C16145a.f43336b, (String) null, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null, 60, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/TestPreloadPreview$notifyChange$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
