package com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldmodel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.autogen.events.BackupUSBStopActionEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.BakOldUSBReceiver */
public class BakOldUSBReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            String action = intent.getAction();
            if ("MMBakchatServiceStart".equalsIgnoreCase(action)) {
                C88144b.m109807y(new Intent().setClassName(context, "com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.BakOldUSBService").putExtra("url", intent.getStringExtra("url")));
                Log.m105918d("MicroMsg.BakOldUSBReceiver", "START_ACTION onReceive start end");
            } else if ("MMBakchatServiceStop".equalsIgnoreCase(action)) {
                BackupUSBStopActionEvent backupUSBStopActionEvent = new BackupUSBStopActionEvent();
                backupUSBStopActionEvent.f78726d.f78727a = context;
                backupUSBStopActionEvent.publish();
                Log.m105918d("MicroMsg.BakOldUSBReceiver", "STOP_ACTION onReceive stop end");
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BakOldUSBReceiver", e, "onReceive:", new Object[0]);
        }
    }
}
