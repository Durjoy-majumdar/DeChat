package com.tencent.p014mm.plugin.expt.resource;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.expt.resource.MMResReporter;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/expt/resource/MMResReporter$reportReceiver$1", "Landroid/content/BroadcastReceiver;", "plugin-expt_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.expt.resource.MMResReporter$reportReceiver$1 */
public final class MMResReporter$reportReceiver$1 extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        StringBuilder sb = new StringBuilder();
        sb.append("onReceive() called with: context = ");
        sb.append(context);
        sb.append(" action = ");
        String str = null;
        sb.append(intent != null ? intent.getAction() : null);
        Log.m105918d("AssetMonitor", sb.toString());
        if (intent != null) {
            str = intent.getAction();
        }
        if (C87412m.m108589b(str, "com.tencent.mm.plugin.expt.resource.MMResReporter")) {
            MMResReporter.f80989a.mo56980e(MMResReporter.C29899b.broadcast);
        }
    }
}
