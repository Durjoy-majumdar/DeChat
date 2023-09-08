package com.tencent.p014mm.xwebutil;

import android.content.ComponentName;
import android.content.Intent;
import com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.XWebSdk;

/* renamed from: com.tencent.mm.xwebutil.n */
public class C86032n {
    /* renamed from: a */
    public static void m106475a(Intent intent) {
        if (!C44594n1.m49046b() && intent != null) {
            intent.setComponent(new ComponentName(C74928u.C74930g.f220310a, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
            MMApplicationContext.getContext().sendBroadcast(intent);
        }
    }

    /* renamed from: b */
    public static void m106476b(String str) {
        Log.m105924i("XWeb.MM.XWebToolsProcessUtil", "sendBroadCastToToolsProcess, action:" + str);
        if (!AppUIForegroundOwner.INSTANCE.isForeground() && "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS".equals(str)) {
            Log.printInfoStack("XWeb.MM.XWebToolsProcessUtil", "sendBroadCastToToolsProcess, ignore in background", new Object[0]);
        } else if (!C44594n1.m49046b() || !"com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS".equals(str)) {
            if ("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS".equals(str)) {
                if (!MMApplicationContext.isProcessExist(MMApplicationContext.getPackageName() + ":tools")) {
                    return;
                }
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(C74928u.C74930g.f220310a, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
            intent.putExtra("tools_process_action_code_key", str);
            MMApplicationContext.getContext().sendBroadcast(intent);
        } else if (!XWebSdk.getDowngradeToSys()) {
            Log.m105924i("XWeb.MM.XWebToolsProcessUtil", "sendBroadCastToToolsProcess, preinit child process");
            XWebSdk.preInitRenderProcess();
            XWebSdk.preInitGpuProcess();
        } else {
            Log.m105924i("XWeb.MM.XWebToolsProcessUtil", "sendBroadCastToToolsProcess, already downgrade to sys");
        }
    }
}
