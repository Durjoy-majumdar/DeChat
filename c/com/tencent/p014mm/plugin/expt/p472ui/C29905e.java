package com.tencent.p014mm.plugin.expt.p472ui;

import android.view.View;
import android.widget.TextView;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import ma1.C117543a;
import oa1.C61982a;

/* renamed from: com.tencent.mm.plugin.expt.ui.e */
public class C29905e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExptAppDebugUI f81008d;

    public C29905e(ExptAppDebugUI exptAppDebugUI) {
        this.f81008d = exptAppDebugUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(this.f81008d.f158361j));
        C117543a.Cx0().Ox0(0, arrayList2, (List<C61982a>) null);
        C117543a.Cx0().Jx0(false);
        TextView textView = this.f81008d.f158360i;
        textView.setText(" del :" + this.f81008d.f158361j + " true");
        C117292a.m165361g(this, "com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
