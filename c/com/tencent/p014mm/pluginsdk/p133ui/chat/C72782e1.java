package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.e1 */
public final class C72782e1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72852z0 f212144d;

    public C72782e1(C72852z0 z0Var) {
        this.f212144d = z0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$btnCloseFullScreenEdt$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f212144d.mo100688a();
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$btnCloseFullScreenEdt$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
