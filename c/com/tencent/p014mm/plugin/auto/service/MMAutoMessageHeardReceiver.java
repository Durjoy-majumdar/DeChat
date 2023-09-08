package com.tencent.p014mm.plugin.auto.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44660i2;
import eb0.C97625j3;
import f40.C86709a0;
import kj2.C117407d;
import uu0.C78281a;

/* renamed from: com.tencent.mm.plugin.auto.service.MMAutoMessageHeardReceiver */
public class MMAutoMessageHeardReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String stringExtra = IntentUtil.getStringExtra(intent, "key_username");
        if (stringExtra != null) {
            Log.m105925i("MicroMsg.auto.MMAutoMessageHeardReceiver", "username %s heard", stringExtra);
            if (!C86709a0.m107528h().f251735l || !C86709a0.m107523b().mo121114l()) {
                Log.m105920e("MicroMsg.auto.MMAutoMessageHeardReceiver", "kernel or account not ready.");
            } else if (C78281a.m94567B()) {
                if (!C78281a.m94568D()) {
                    Log.m105924i("MicroMsg.auto.MMAutoMessageHeardReceiver", "not open car mode");
                } else if (!C78281a.m94569q()) {
                    Log.m105924i("MicroMsg.auto.MMAutoMessageHeardReceiver", "not install auto app");
                } else {
                    C117407d.INSTANCE.idkeyStat(1496, 2, 1, false);
                    ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0(stringExtra);
                }
            }
        }
    }
}
