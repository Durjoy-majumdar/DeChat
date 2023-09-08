package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import j20.C117292a;
import java.util.ArrayList;
import qg0.C12215a;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.q2 */
public class C5394q2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsModifyAliasUI f21079d;

    public C5394q2(SettingsModifyAliasUI settingsModifyAliasUI) {
        this.f21079d = settingsModifyAliasUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SettingsModifyAliasUI settingsModifyAliasUI = this.f21079d;
        C12215a.m11778c(settingsModifyAliasUI, settingsModifyAliasUI.getString(C0966R.string.imc, new Object[]{LocaleUtil.getApplicationLanguage()}), 0, true);
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
