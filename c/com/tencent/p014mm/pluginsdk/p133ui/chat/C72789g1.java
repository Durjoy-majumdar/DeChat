package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import yd3.C66622a;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.g1 */
public final class C72789g1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72852z0 f212150d;

    public C72789g1(C72852z0 z0Var) {
        this.f212150d = z0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$chatFooterEnterFullScreenBtn$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f212150d.mo100698k();
        C66622a.f191567a.mo90685a(2, this.f212150d.mo100690c());
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$chatFooterEnterFullScreenBtn$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
