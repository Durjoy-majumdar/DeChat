package com.tencent.p014mm.plugin.account.p024ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.account.ui.MobileInputUI$$o */
public class MobileInputUI$$o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MobileInputUI f10742d;

    public MobileInputUI$$o(MobileInputUI mobileInputUI) {
        this.f10742d = mobileInputUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/MobileInputUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MobileInputUI.m161865M7(this.f10742d, this.f10742d.getString(C0966R.string.f26, new Object[]{LocaleUtil.getApplicationLanguage()}));
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MobileInputUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
