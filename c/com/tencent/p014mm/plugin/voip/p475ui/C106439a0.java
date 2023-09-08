package com.tencent.p014mm.plugin.voip.p475ui;

import android.os.Bundle;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import y33.C112390a;

/* renamed from: com.tencent.mm.plugin.voip.ui.a0 */
public final class C106439a0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C106440b0 f317964d;

    public C106439a0(C106440b0 b0Var) {
        this.f317964d = b0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voip/ui/VoIPMainBtnControl$showCalledConnecting$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C112390a.C112391a.m153348a(this.f317964d.f317965d, C112390a.C112392b.HANGUP_BTN_CLICK, (Bundle) null, 2, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/VoIPMainBtnControl$showCalledConnecting$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
