package com.tencent.p014mm.plugin.expt.p472ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import ma1.C117543a;

/* renamed from: com.tencent.mm.plugin.expt.ui.g */
public class C29906g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExptDebugUI f81009d;

    public C29906g(ExptDebugUI exptDebugUI) {
        this.f81009d = exptDebugUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/expt/ui/ExptDebugUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ExptDebugUI exptDebugUI = this.f81009d;
        C117543a.Cx0().Fx0(exptDebugUI.f111427o.getText().toString().trim());
        exptDebugUI.f111427o.setText("");
        C117292a.m165361g(this, "com/tencent/mm/plugin/expt/ui/ExptDebugUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
