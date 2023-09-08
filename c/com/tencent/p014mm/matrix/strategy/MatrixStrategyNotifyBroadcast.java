package com.tencent.p014mm.matrix.strategy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.matrix.C80992k;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatPermissions;
import p723vf.C118672d;

/* renamed from: com.tencent.mm.matrix.strategy.MatrixStrategyNotifyBroadcast */
public class MatrixStrategyNotifyBroadcast extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f237879a = WeChatPermissions.PERMISSION_MATRIX_STRATEGYNOTIFY();

    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            C118672d.m167352b("Matrix.StrategyNotifyBroadcast", "MatrixStrategyNotifyBroadcast intent == null", new Object[0]);
            return;
        }
        C118672d.m167353c("Matrix.StrategyNotifyBroadcast", "receive MatrixStrategyNotifyBroadcast, process: %s, strategy:%s action:%s", MMApplicationContext.getProcessName(), null, intent.getAction());
        C80992k.m98890b(context, intent);
    }
}
