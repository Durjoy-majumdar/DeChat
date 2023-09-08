package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.ModifyAliasLogStruct;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import nj3.C76879j;
import xm2.C15860k;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.o2 */
public class C5388o2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f21067d;

    /* renamed from: e */
    public final /* synthetic */ SettingsModifyAliasUI f21068e;

    public C5388o2(SettingsModifyAliasUI settingsModifyAliasUI, String str) {
        this.f21068e = settingsModifyAliasUI;
        this.f21067d = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SettingsModifyAliasUI settingsModifyAliasUI = this.f21068e;
        String str = this.f21067d;
        int i = SettingsModifyAliasUI.f20852r;
        settingsModifyAliasUI.getClass();
        HashMap hashMap = new HashMap();
        ArrayList<Integer> arrayList2 = settingsModifyAliasUI.f20861p;
        if (!(arrayList2 == null || settingsModifyAliasUI.f20862q == null || arrayList2.size() != settingsModifyAliasUI.f20862q.size())) {
            for (int i2 = 0; i2 < settingsModifyAliasUI.f20861p.size(); i2++) {
                hashMap.put(settingsModifyAliasUI.f20861p.get(i2), settingsModifyAliasUI.f20862q.get(i2));
            }
        }
        settingsModifyAliasUI.f20860o = new C15860k(1, str, hashMap);
        settingsModifyAliasUI.f20858j = C76879j.m92723Q(settingsModifyAliasUI.getContext(), settingsModifyAliasUI.getString(C0966R.string.gvh), settingsModifyAliasUI.getString(C0966R.string.gvc), false, false, (DialogInterface.OnCancelListener) null);
        C86709a0.m107524d().mo123460f(settingsModifyAliasUI.f20860o);
        ModifyAliasLogStruct modifyAliasLogStruct = new ModifyAliasLogStruct();
        modifyAliasLogStruct.mo1043s(SettingsAliasUI.f20811q);
        modifyAliasLogStruct.f9998e = 6;
        modifyAliasLogStruct.mo86054n();
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyAliasUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
