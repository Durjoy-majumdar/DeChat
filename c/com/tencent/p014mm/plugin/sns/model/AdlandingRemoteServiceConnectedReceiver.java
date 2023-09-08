package com.tencent.p014mm.plugin.sns.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.model.AdlandingRemoteServiceConnectedReceiver */
public class AdlandingRemoteServiceConnectedReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f82002a = 0;

    public void onReceive(Context context, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.model.AdlandingRemoteServiceConnectedReceiver");
        if (intent != null) {
            boolean equals = "com.tencnet.mm.action.adlanding.connected".equals(intent.getAction());
        }
        SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.model.AdlandingRemoteServiceConnectedReceiver");
    }
}
