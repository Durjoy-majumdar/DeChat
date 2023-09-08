package com.tencent.p014mm.plugin.shake.p103ui;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import eb0.C97625j3;
import kg3.C76577a;
import nj3.C11184p0;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI$$d */
public final /* synthetic */ class ShakePersonalInfoUI$$d implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ ShakePersonalInfoUI f21108d;

    public /* synthetic */ ShakePersonalInfoUI$$d(ShakePersonalInfoUI shakePersonalInfoUI) {
        this.f21108d = shakePersonalInfoUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        ShakePersonalInfoUI shakePersonalInfoUI = this.f21108d;
        int i2 = ShakePersonalInfoUI.f21103e;
        shakePersonalInfoUI.getClass();
        if (menuItem.getItemId() == 2) {
            C97625j3.m125812b().mo105906u().mo119676J(4110, Boolean.TRUE);
            C76912y0.m92769h(shakePersonalInfoUI, C76577a.m92166q(shakePersonalInfoUI.getContext(), C0966R.string.j5j), C0966R.raw.icons_filled_done);
        }
    }
}
