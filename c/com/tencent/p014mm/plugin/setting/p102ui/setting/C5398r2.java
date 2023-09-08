package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.ModifyAliasLogStruct;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.r2 */
public class C5398r2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f21085d;

    public C5398r2(SettingsModifyAliasUI settingsModifyAliasUI, C101218e0 e0Var) {
        this.f21085d = e0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ModifyAliasLogStruct modifyAliasLogStruct = new ModifyAliasLogStruct();
        modifyAliasLogStruct.mo1043s(SettingsAliasUI.f20811q);
        modifyAliasLogStruct.f9998e = 7;
        modifyAliasLogStruct.f10000g = 3;
        modifyAliasLogStruct.mo86054n();
        this.f21085d.mo140680z();
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
