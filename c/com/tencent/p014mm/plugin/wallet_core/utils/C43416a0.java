package com.tencent.p014mm.plugin.wallet_core.utils;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.a0 */
public class C43416a0 implements MMSwitchBtn.C7041b {

    /* renamed from: a */
    public final /* synthetic */ View f117374a;

    public C43416a0(View view) {
        this.f117374a = view;
    }

    public void onStatusChange(boolean z) {
        View view = this.f117374a;
        if (view != null) {
            view.setEnabled(z);
        }
    }
}
