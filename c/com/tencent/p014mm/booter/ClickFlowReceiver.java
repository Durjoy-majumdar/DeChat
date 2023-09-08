package com.tencent.p014mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.modelstat.C81016b;
import com.tencent.p014mm.modelstat.C81024d;

/* renamed from: com.tencent.mm.booter.ClickFlowReceiver */
public class ClickFlowReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C81016b i = C81016b.m98929i();
        i.getClass();
        if (intent != null && intent.getAction().equals("com.tencent.mm.Intent.ACTION_CLICK_FLOW_REPORT")) {
            i.f237961a.post(new C81024d(i, intent));
        }
    }
}
