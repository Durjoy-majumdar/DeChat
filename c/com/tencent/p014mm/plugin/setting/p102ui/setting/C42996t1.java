package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.view.View;
import com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsAuthUI;
import j20.C117292a;
import java.util.ArrayList;
import te3.io4;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.t1 */
public final class C42996t1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsAuthUI.C42929a f116408d;

    /* renamed from: e */
    public final /* synthetic */ int f116409e;

    /* renamed from: f */
    public final /* synthetic */ io4 f116410f;

    public C42996t1(SettingsAuthUI.C42929a aVar, int i, io4 io4) {
        this.f116408d = aVar;
        this.f116409e = i;
        this.f116410f = io4;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$SettingsAuthListAdapter$updateAuthItem$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SettingsAuthUI.C42929a.C42932c cVar = this.f116408d.f116257j;
        if (cVar != null) {
            cVar.mo67131b(this.f116409e, this.f116410f);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$SettingsAuthListAdapter$updateAuthItem$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
