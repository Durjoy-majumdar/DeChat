package com.tencent.p014mm.plugin.expt.p472ui;

import android.view.View;
import f40.C86709a0;
import g81.C32343a;
import g81.C59378c;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.expt.ui.c */
public class C29903c implements View.OnClickListener {
    public C29903c(ExptAppDebugUI exptAppDebugUI) {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32343a.m39684a().getClass();
        C86709a0.m107524d().mo123460f(new C59378c());
        C117292a.m165361g(this, "com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
