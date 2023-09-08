package com.tencent.p014mm.wallet_core.model;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75129p;
import te3.C52296zq3;

/* renamed from: com.tencent.mm.wallet_core.model.t */
public class C75139t implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f221084d;

    /* renamed from: e */
    public final /* synthetic */ C52296zq3 f221085e;

    /* renamed from: f */
    public final /* synthetic */ Object f221086f;

    /* renamed from: g */
    public final /* synthetic */ C75129p.C75132c f221087g;

    public C75139t(Context context, C52296zq3 zq32, Object obj, C75129p.C75132c cVar) {
        this.f221084d = context;
        this.f221085e = zq32;
        this.f221086f = obj;
        this.f221087g = cVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.JumpItemUtil", "showRemindWin3() left_button click!");
        C75129p.m90108c(this.f221084d, this.f221085e.f146183e, this.f221086f, this.f221087g);
    }
}
