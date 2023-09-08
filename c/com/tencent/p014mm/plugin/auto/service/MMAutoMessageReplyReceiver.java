package com.tencent.p014mm.plugin.auto.service;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import d62.C7250m;
import eb0.C45628s0;
import kj2.C117407d;
import uu0.C78281a;

/* renamed from: com.tencent.mm.plugin.auto.service.MMAutoMessageReplyReceiver */
public class MMAutoMessageReplyReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String stringExtra = IntentUtil.getStringExtra(intent, "key_username");
        if (stringExtra != null) {
            Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
            CharSequence charSequence = resultsFromIntent != null ? resultsFromIntent.getCharSequence("key_voice_reply_text") : null;
            if (charSequence == null) {
                Log.m105925i("MicroMsg.auto.MMAutoMessageReplyReceiver", "username %s reply null", stringExtra);
            } else if (C78281a.m94567B()) {
                if (!C78281a.m94568D()) {
                    Log.m105924i("MicroMsg.auto.MMAutoMessageReplyReceiver", "not open car mode");
                } else if (!C78281a.m94569q()) {
                    Log.m105924i("MicroMsg.auto.MMAutoMessageReplyReceiver", "not install auto app");
                } else {
                    C117407d.INSTANCE.idkeyStat(1496, 1, 1, false);
                    Log.m105925i("MicroMsg.auto.MMAutoMessageReplyReceiver", "username %s reply %s", stringExtra, charSequence.toString());
                    C7250m.m7431a().mo136257Tm(stringExtra, charSequence.toString(), C45628s0.m50810y(stringExtra), 0);
                }
            }
        }
    }
}
