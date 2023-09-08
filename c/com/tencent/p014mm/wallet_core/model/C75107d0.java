package com.tencent.p014mm.wallet_core.model;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.MMActivity;

/* renamed from: com.tencent.mm.wallet_core.model.d0 */
public class C75107d0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMActivity f221021d;

    public C75107d0(C75113f0 f0Var, MMActivity mMActivity) {
        this.f221021d = mMActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f221021d.finish();
    }
}
