package com.tencent.p014mm.plugin.shake.p103ui;

import android.content.Context;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import kg3.C76577a;
import nj3.C11184p0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI$$b */
public final /* synthetic */ class ShakePersonalInfoUI$$b implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ ShakePersonalInfoUI f21106d;

    public /* synthetic */ ShakePersonalInfoUI$$b(ShakePersonalInfoUI shakePersonalInfoUI) {
        this.f21106d = shakePersonalInfoUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        ShakePersonalInfoUI shakePersonalInfoUI = this.f21106d;
        int i2 = ShakePersonalInfoUI.f21103e;
        shakePersonalInfoUI.getClass();
        if (menuItem.getItemId() == 1) {
            C77407n nVar = new C77407n((Context) shakePersonalInfoUI.getContext(), 1, true);
            TextView textView = new TextView(shakePersonalInfoUI.getContext());
            textView.setGravity(17);
            textView.setHeight(C76577a.m92155f(shakePersonalInfoUI.getContext(), C0966R.dimen.f3758d_));
            textView.setTextSize(0, (float) C76577a.m92155f(shakePersonalInfoUI.getContext(), C0966R.dimen.f3957lf));
            textView.setTextColor(C76577a.m92153d(shakePersonalInfoUI.getContext(), C0966R.color.BW_0_Alpha_0_5));
            textView.setText(C76577a.m92166q(shakePersonalInfoUI.getContext(), C0966R.string.j3o));
            nVar.mo107569n(textView, false);
            nVar.f225784p1 = true;
            nVar.f225771i = new ShakePersonalInfoUI$$c(shakePersonalInfoUI);
            nVar.f225782p = new ShakePersonalInfoUI$$d(shakePersonalInfoUI);
            nVar.mo107573q();
        }
    }
}
