package com.tencent.p014mm.plugin.wallet_core.utils;

import android.view.View;
import android.widget.CompoundButton;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.b0 */
public class C43417b0 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ View f117375a;

    public C43417b0(View view) {
        this.f117375a = view;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        View view = this.f117375a;
        if (view != null) {
            view.setEnabled(z);
        }
    }
}
