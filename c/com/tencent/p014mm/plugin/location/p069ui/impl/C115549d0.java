package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import com.tencent.p014mm.plugin.location.p069ui.impl.C115538c0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.d0 */
public class C115549d0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C115538c0 f346572d;

    public C115549d0(C115538c0 c0Var) {
        this.f346572d = c0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C115538c0 c0Var = this.f346572d;
        if (!c0Var.f346504J) {
            c0Var.f346504J = true;
            c0Var.f346540j.setVisibility(8);
            c0Var.f346542k1 = false;
            if (c0Var.f346514S) {
                c0Var.mo175571C();
            }
            c0Var.mo175583y(C115538c0.C115548i.OPENED);
            c0Var.mo175572D();
            c0Var.f346523W0.setText("");
            c0Var.f346525X0.setVisibility(8);
            c0Var.f346546p.mo101727b();
            c0Var.f346546p.removeFooterView(c0Var.f346548q);
            c0Var.f346551t.mo175610b();
            c0Var.f346551t.notifyDataSetChanged();
            c0Var.f346546p.setVisibility(0);
            c0Var.f346545o.setVisibility(8);
            View view2 = c0Var.f346552u;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "enterSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "enterSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c0Var.f346496B.setVisibility(8);
            c0Var.f346538i.setVisibility(8);
            c0Var.mo175577s(false);
            c0Var.f346536g1 = c0Var.f346553v.isSelected();
            c0Var.f346553v.setSelected(false);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
