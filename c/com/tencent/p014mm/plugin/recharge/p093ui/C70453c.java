package com.tencent.p014mm.plugin.recharge.p093ui;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.recharge.ui.c */
public class C70453c implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ MallEditText f203607d;

    public C70453c(MallEditText mallEditText) {
        this.f203607d = mallEditText;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/MallEditText$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        MallEditText mallEditText = this.f203607d;
        mallEditText.f203499y = mallEditText.f203487j.getItem(i);
        if (this.f203607d.f203499y != null) {
            Log.m105918d("MicroMsg.MallEditText", "onItemClick record.record " + this.f203607d.f203499y.f224103a + ", record.name " + this.f203607d.f203499y.f224104b);
            MallEditText mallEditText2 = this.f203607d;
            mallEditText2.setInput(mallEditText2.f203499y);
        }
        this.f203607d.f203484g.dismissDropDown();
        C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/MallEditText$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
