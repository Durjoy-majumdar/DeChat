package com.tencent.p014mm.plugin.offline.p085ui;

import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import id2.C46218k;
import kd2.C76559f;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.offline.ui.a0 */
public class C69988a0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C70034w f202002d;

    public C69988a0(C70034w wVar) {
        this.f202002d = wVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        C76559f.m92105a();
        Activity activity = this.f202002d.f202060a;
        C76879j.m92726T(activity, activity.getResources().getString(C0966R.string.lap));
        C70034w wVar = this.f202002d;
        wVar.getClass();
        Log.m105924i("MicroMsg.OfflineLogicMgr", "closeOffline");
        C69990b bVar = wVar.f202061b;
        if (bVar != null) {
            ((WalletOfflineCoinPurseUI) bVar).doSceneProgress(new C46218k(""), false);
        }
    }
}
