package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.ipcall.p065ui.C105408f0;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.i0 */
public class C105419i0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C105408f0 f313421d;

    public C105419i0(C105408f0 f0Var) {
        this.f313421d = f0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C105408f0.C105410b bVar = (C105408f0.C105410b) view.getTag();
        if (!bVar.f313412c) {
            bVar.f313412c = true;
        } else {
            bVar.f313412c = false;
        }
        C105408f0 f0Var = this.f313421d;
        TextView textView = (TextView) view;
        int i = C105408f0.f313376M;
        f0Var.getClass();
        textView.setTextSize(0, f0Var.getContext().getResources().getDimension(C0966R.dimen.a5x) * C76577a.m92165p(f0Var.getContext()));
        if (((C105408f0.C105410b) textView.getTag()).f313412c) {
            textView.setBackgroundResource(f0Var.f313387K);
            textView.setTextColor(f0Var.f313393h.getResources().getColor(f0Var.f313388L));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            textView.setBackgroundResource(f0Var.f313385I);
            textView.setTextColor(f0Var.f313393h.getResources().getColor(f0Var.f313386J));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
