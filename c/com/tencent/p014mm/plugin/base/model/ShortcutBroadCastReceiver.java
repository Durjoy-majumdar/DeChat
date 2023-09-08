package com.tencent.p014mm.plugin.base.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.base.model.ShortcutBroadCastReceiver */
public class ShortcutBroadCastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            Log.m105920e("MicroMsg.ShortcutBroadCastReceiver", "alvinluo shortcut receiver intent is null");
        } else {
            C76879j.m92726T(context, context.getString(C0966R.string.f7568jx));
        }
    }
}
