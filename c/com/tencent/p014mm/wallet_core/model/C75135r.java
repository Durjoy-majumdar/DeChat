package com.tencent.p014mm.wallet_core.model;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75129p;
import te3.C64692rv;

/* renamed from: com.tencent.mm.wallet_core.model.r */
public class C75135r implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f221071d;

    /* renamed from: e */
    public final /* synthetic */ C64692rv f221072e;

    /* renamed from: f */
    public final /* synthetic */ Object f221073f;

    /* renamed from: g */
    public final /* synthetic */ C75129p.C75132c f221074g;

    public C75135r(Context context, C64692rv rvVar, Object obj, C75129p.C75132c cVar) {
        this.f221071d = context;
        this.f221072e = rvVar;
        this.f221073f = obj;
        this.f221074g = cVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.JumpItemUtil", "showCheckWin() left_button click!");
        C75129p.m90108c(this.f221071d, this.f221072e.f185303g, this.f221073f, this.f221074g);
    }
}
