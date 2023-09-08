package com.tencent.p014mm.plugin.finder.view;

import android.widget.Button;
import android.widget.CompoundButton;

/* renamed from: com.tencent.mm.plugin.finder.view.e4 */
public final class C4049e4 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Button f18150a;

    public C4049e4(Button button) {
        this.f18150a = button;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f18150a.setEnabled(z);
    }
}
