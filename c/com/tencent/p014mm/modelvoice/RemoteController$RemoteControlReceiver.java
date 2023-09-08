package com.tencent.p014mm.modelvoice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.modelvoice.RemoteController$RemoteControlReceiver */
public class RemoteController$RemoteControlReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent != null && !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
            Log.m105918d("MicroMsg.RemoteControlReceiver", "unknown action, ignore" + intent.getAction());
        }
    }
}
