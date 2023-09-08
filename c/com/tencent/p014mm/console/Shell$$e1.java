package com.tencent.p014mm.console;

import android.app.ActivityManager;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;

/* renamed from: com.tencent.mm.console.Shell$$e1 */
public class Shell$$e1 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        for (ActivityManager.AppTask finishAndRemoveTask : ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getAppTasks()) {
            finishAndRemoveTask.finishAndRemoveTask();
        }
    }
}
