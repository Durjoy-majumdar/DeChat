package com.tencent.p014mm.plugin.updater.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.pluginsdk.platformtools.C85623c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p620nm.C89013r;

/* renamed from: com.tencent.mm.plugin.updater.model.SuicideListener */
public class SuicideListener extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Log.m105924i("Tinker.TinkerResponseProcessor", "do suicide");
        C85623c.C85624a aVar = C85623c.f249568a;
        Context context2 = MMApplicationContext.getContext();
        ((C89013r.C89016c) aVar).getClass();
        MMAppMgr.m85985e(context2, true);
    }
}
