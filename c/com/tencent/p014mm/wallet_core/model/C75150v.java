package com.tencent.p014mm.wallet_core.model;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75129p;
import te3.C51341t4;

/* renamed from: com.tencent.mm.wallet_core.model.v */
public class C75150v implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f221124d;

    /* renamed from: e */
    public final /* synthetic */ C51341t4 f221125e;

    /* renamed from: f */
    public final /* synthetic */ double f221126f;

    /* renamed from: g */
    public final /* synthetic */ C75129p.C75132c f221127g;

    public C75150v(Context context, C51341t4 t4Var, double d, C75129p.C75132c cVar) {
        this.f221124d = context;
        this.f221125e = t4Var;
        this.f221126f = d;
        this.f221127g = cVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.JumpItemUtil", "showAmountRemindWin() right_button click!");
        C75129p.m90108c(this.f221124d, this.f221125e.f141940f, Double.valueOf(this.f221126f), this.f221127g);
    }
}
