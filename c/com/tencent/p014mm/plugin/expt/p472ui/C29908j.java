package com.tencent.p014mm.plugin.expt.p472ui;

import android.view.View;
import android.widget.TextView;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import ma1.C117543a;
import oa1.C47346c;
import te3.C50782p5;

/* renamed from: com.tencent.mm.plugin.expt.ui.j */
public class C29908j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExptDebugUI f81011d;

    public C29908j(ExptDebugUI exptDebugUI) {
        this.f81011d = exptDebugUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/expt/ui/ExptDebugUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(this.f81011d.f111428p));
        C117543a.Cx0().Nx0(0, arrayList2, (List<C47346c>) null, (List<C50782p5>) null);
        TextView textView = this.f81011d.f111424i;
        textView.setText(" del :" + this.f81011d.f111428p);
        C117292a.m165361g(this, "com/tencent/mm/plugin/expt/ui/ExptDebugUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
