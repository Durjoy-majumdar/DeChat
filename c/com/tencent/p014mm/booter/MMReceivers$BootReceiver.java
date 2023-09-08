package com.tencent.p014mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.booter.MMReceivers$BootReceiver */
public class MMReceivers$BootReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (context != null) {
            Process.myPid();
            if (!C80811b.m98664a(context, "auto", true)) {
                MMReceivers$AlarmReceiver.m161348b(context);
                Log.appenderFlush();
            }
        }
    }
}
