package com.tencent.p014mm.wallet_core.model;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75129p;
import te3.C64692rv;

/* renamed from: com.tencent.mm.wallet_core.model.q */
public class C75134q implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f221067d;

    /* renamed from: e */
    public final /* synthetic */ C64692rv f221068e;

    /* renamed from: f */
    public final /* synthetic */ Object f221069f;

    /* renamed from: g */
    public final /* synthetic */ C75129p.C75132c f221070g;

    public C75134q(Context context, C64692rv rvVar, Object obj, C75129p.C75132c cVar) {
        this.f221067d = context;
        this.f221068e = rvVar;
        this.f221069f = obj;
        this.f221070g = cVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.JumpItemUtil", "showCheckWin() right_button click!");
        C75129p.m90108c(this.f221067d, this.f221068e.f185304h, this.f221069f, this.f221070g);
    }
}
