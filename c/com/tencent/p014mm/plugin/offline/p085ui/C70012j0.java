package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import ie3.C76331i;

/* renamed from: com.tencent.mm.plugin.offline.ui.j0 */
public class C70012j0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C70034w f202034d;

    public C70012j0(C70034w wVar) {
        this.f202034d = wVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C76331i.m91759c(this.f202034d.f202060a, 0);
        Log.m105924i("MicroMsg.OfflineLogicMgr", "do startBindBankcard");
    }
}
