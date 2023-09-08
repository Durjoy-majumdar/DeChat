package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.view.View;
import com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsAuthUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.io4;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.u1 */
public final class C42997u1 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsAuthUI.C42929a f116411d;

    /* renamed from: e */
    public final /* synthetic */ int f116412e;

    /* renamed from: f */
    public final /* synthetic */ io4 f116413f;

    public C42997u1(SettingsAuthUI.C42929a aVar, int i, io4 io4) {
        this.f116411d = aVar;
        this.f116412e = i;
        this.f116413f = io4;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$SettingsAuthListAdapter$updateAuthItem$1$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        SettingsAuthUI.C42929a.C42932c cVar = this.f116411d.f116257j;
        if (cVar != null) {
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            int i = this.f116412e;
            io4 io4 = this.f116413f;
            SettingsAuthUI.C42929a aVar = this.f116411d;
            cVar.mo67130a(view, i, io4, aVar.f116258n, aVar.f116259o);
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAuthUI$SettingsAuthListAdapter$updateAuthItem$1$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
