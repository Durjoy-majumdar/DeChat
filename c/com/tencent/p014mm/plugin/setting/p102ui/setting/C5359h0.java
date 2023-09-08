package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.h0 */
public class C5359h0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SelfQRCodeUI f21002d;

    public C5359h0(SelfQRCodeUI selfQRCodeUI) {
        this.f21002d = selfQRCodeUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C88144b.m109789g(this.f21002d, "setting", ".ui.setting.SettingsAddMeUI");
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SelfQRCodeUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
