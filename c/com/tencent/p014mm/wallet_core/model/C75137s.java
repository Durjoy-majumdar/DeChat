package com.tencent.p014mm.wallet_core.model;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75129p;
import te3.C52296zq3;

/* renamed from: com.tencent.mm.wallet_core.model.s */
public class C75137s implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f221076d;

    /* renamed from: e */
    public final /* synthetic */ C52296zq3 f221077e;

    /* renamed from: f */
    public final /* synthetic */ Object f221078f;

    /* renamed from: g */
    public final /* synthetic */ C75129p.C75132c f221079g;

    public C75137s(Context context, C52296zq3 zq32, Object obj, C75129p.C75132c cVar) {
        this.f221076d = context;
        this.f221077e = zq32;
        this.f221078f = obj;
        this.f221079g = cVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.JumpItemUtil", "showRemindWin3() right_button click!");
        C75129p.m90108c(this.f221076d, this.f221077e.f146184f, this.f221078f, this.f221079g);
    }
}
