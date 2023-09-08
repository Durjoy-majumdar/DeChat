package com.tencent.p014mm.plugin.appbrand.debugger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84186b0;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/debugger/DebuggerShellClientProcessHelper$receiver$1", "Landroid/content/BroadcastReceiver;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.debugger.DebuggerShellClientProcessHelper$receiver$1 */
public final class DebuggerShellClientProcessHelper$receiver$1 extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        DebuggerShell.m100245a();
        C84186b0.m103777f();
    }
}
