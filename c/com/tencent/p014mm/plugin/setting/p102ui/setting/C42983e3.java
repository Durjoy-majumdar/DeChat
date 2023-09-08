package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.e3 */
public class C42983e3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsSearchAuthUI f116388d;

    public C42983e3(SettingsSearchAuthUI settingsSearchAuthUI) {
        this.f116388d = settingsSearchAuthUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View view2 = this.f116388d.f116353w;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = this.f116388d.f116354x;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SettingsSearchAuthUI settingsSearchAuthUI = this.f116388d;
        SettingsSearchAuthUI.m46626I7(settingsSearchAuthUI, settingsSearchAuthUI.f116346p, settingsSearchAuthUI.f116349s);
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSearchAuthUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
