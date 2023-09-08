package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import nc0.C76850a;
import p214om.C11502f;

/* renamed from: com.tencent.mm.plugin.account.ui.MobileInputUI$$j */
public class MobileInputUI$$j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MobileInputUI f196672d;

    public MobileInputUI$$j(MobileInputUI mobileInputUI) {
        this.f196672d = mobileInputUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/MobileInputUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((ArrayList) C76850a.m92630b(view.getContext(), this.f196672d.getString(C0966R.string.bvs))).size() > 1) {
            Intent intent = new Intent();
            intent.putExtra("country_name", this.f196672d.f344676G);
            intent.putExtra("couttry_code", this.f196672d.f344677H);
            intent.putExtra("iso_code", this.f196672d.f344678I);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93177j(intent, this.f196672d, 100);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MobileInputUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
