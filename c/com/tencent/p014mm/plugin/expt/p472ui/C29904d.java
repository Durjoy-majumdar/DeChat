package com.tencent.p014mm.plugin.expt.p472ui;

import android.content.Context;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import ma1.C117543a;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.expt.ui.d */
public class C29904d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExptAppDebugUI f81007d;

    public C29904d(ExptAppDebugUI exptAppDebugUI) {
        this.f81007d = exptAppDebugUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C117543a.Cx0().Mx0(1);
        C76701a.makeText((Context) this.f81007d.getContext(), (CharSequence) "start req expt", 0).show();
        C117292a.m165361g(this, "com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
