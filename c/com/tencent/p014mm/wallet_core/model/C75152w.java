package com.tencent.p014mm.wallet_core.model;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75129p;
import te3.C51341t4;

/* renamed from: com.tencent.mm.wallet_core.model.w */
public class C75152w implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f221129d;

    /* renamed from: e */
    public final /* synthetic */ C51341t4 f221130e;

    /* renamed from: f */
    public final /* synthetic */ double f221131f;

    /* renamed from: g */
    public final /* synthetic */ C75129p.C75132c f221132g;

    public C75152w(Context context, C51341t4 t4Var, double d, C75129p.C75132c cVar) {
        this.f221129d = context;
        this.f221130e = t4Var;
        this.f221131f = d;
        this.f221132g = cVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.JumpItemUtil", "showAmountRemindWin() left_button click!");
        C75129p.m90108c(this.f221129d, this.f221130e.f141939e, Double.valueOf(this.f221131f), this.f221132g);
    }
}
