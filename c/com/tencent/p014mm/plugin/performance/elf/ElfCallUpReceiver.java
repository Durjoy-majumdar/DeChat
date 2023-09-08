package com.tencent.p014mm.plugin.performance.elf;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.performance.elf.ElfCallUpReceiver */
public class ElfCallUpReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static int f20092a = -1;

    public void onReceive(Context context, Intent intent) {
        Log.m105924i("MicroMsg.ElfCallUpReceiver", "[onReceive] call up! ");
        if (getClass().getName().equals(intent.getAction())) {
            f20092a = intent.getIntExtra("processId", 0);
        }
    }
}
