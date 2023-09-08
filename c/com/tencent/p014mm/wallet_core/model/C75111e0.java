package com.tencent.p014mm.wallet_core.model;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.MMActivity;

/* renamed from: com.tencent.mm.wallet_core.model.e0 */
public class C75111e0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMActivity f221030d;

    /* renamed from: e */
    public final /* synthetic */ C75113f0 f221031e;

    public C75111e0(C75113f0 f0Var, MMActivity mMActivity) {
        this.f221031e = f0Var;
        this.f221030d = mMActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f221031e.mo73087n1()) {
            this.f221030d.finish();
        }
    }
}
