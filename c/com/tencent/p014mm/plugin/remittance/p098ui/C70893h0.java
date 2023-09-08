package com.tencent.p014mm.plugin.remittance.p098ui;

import android.view.View;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.h0 */
public class C70893h0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C70896i0 f205304g;

    public C70893h0(C70896i0 i0Var) {
        this.f205304g = i0Var;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        View.OnClickListener onClickListener = this.f205304g.f205311f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
            this.f205304g.dismiss();
        }
    }
}
