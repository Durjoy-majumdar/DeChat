package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.widget.Button;
import android.widget.CompoundButton;
import com.tencent.p014mm.autogen.mmdata.rpt.ModifyAliasLogStruct;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.p2 */
public class C5392p2 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Button f21076a;

    public C5392p2(SettingsModifyAliasUI settingsModifyAliasUI, Button button) {
        this.f21076a = button;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ModifyAliasLogStruct modifyAliasLogStruct = new ModifyAliasLogStruct();
        modifyAliasLogStruct.mo1043s(SettingsAliasUI.f20811q);
        modifyAliasLogStruct.f9998e = 5;
        modifyAliasLogStruct.mo86054n();
        this.f21076a.setEnabled(z);
    }
}
