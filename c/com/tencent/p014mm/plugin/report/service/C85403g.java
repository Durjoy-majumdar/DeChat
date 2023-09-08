package com.tencent.p014mm.plugin.report.service;

import android.os.Process;
import com.tencent.mars.Mars;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C75681p0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.report.service.g */
public class C85403g implements Runnable {
    public C85403g(KVCommCrossProcessReceiver kVCommCrossProcessReceiver) {
    }

    public void run() {
        if (C75681p0.m90937d(MMApplicationContext.getContext())) {
            Log.m105920e("MicroMsg.ReportManagerKvCheck", "KVCommCrossProcessReceiver shut_down_weixin need to kill process");
            Log.appenderFlushSync();
            Mars.onSingalCrash(0);
            int myPid = Process.myPid();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(myPid));
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/report/service/KVCommCrossProcessReceiver$4", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(obj, "com/tencent/mm/plugin/report/service/KVCommCrossProcessReceiver$4", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
    }
}
