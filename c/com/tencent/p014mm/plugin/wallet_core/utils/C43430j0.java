package com.tencent.p014mm.plugin.wallet_core.utils;

import android.app.Dialog;
import android.view.View;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.j0 */
public class C43430j0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ Dialog f117392g;

    public C43430j0(Dialog dialog) {
        this.f117392g = dialog;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        if (this.f117392g.isShowing()) {
            this.f117392g.dismiss();
        }
    }
}
