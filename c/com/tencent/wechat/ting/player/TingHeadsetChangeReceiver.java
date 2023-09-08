package com.tencent.wechat.ting.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/wechat/ting/player/TingHeadsetChangeReceiver;", "Landroid/content/BroadcastReceiver;", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class TingHeadsetChangeReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        if (TextUtils.equals(intent.getAction(), "android.intent.action.HEADSET_PLUG") && intent.hasExtra("state") && intent.getIntExtra("state", 2) != 0 && intent.getIntExtra("state", 2) == 1) {
            throw null;
        }
    }
}
