package com.tencent.p014mm.view.manager;

import android.view.View;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.view.manager.a */
public class C75075a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SmileyPanelManager f220881d;

    public C75075a(SmileyPanelManager smileyPanelManager) {
        this.f220881d = smileyPanelManager;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/view/manager/SmileyPanelManager$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C72837v1 v1Var = this.f220881d.f285696A;
        if (v1Var != null) {
            v1Var.mo65587a();
        }
        C117292a.m165361g(this, "com/tencent/mm/view/manager/SmileyPanelManager$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
