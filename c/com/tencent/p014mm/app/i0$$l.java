package com.tencent.p014mm.app;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Process;
import android.os.SystemClock;
import android.util.Base64;
import com.tencent.p014mm.plugin.sandbox.SubCoreSandBox;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import eb0.C7624i3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kj2.C117407d;
import p757xv.C91355x;
import s72.C90149c;

/* renamed from: com.tencent.mm.app.i0$$l */
public class i0$$l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80600i0 f235815d;

    public i0$$l(C80600i0 i0Var, i0$$g i0__g) {
        this.f235815d = i0Var;
    }

    /* renamed from: a */
    public final ActivityManager.ProcessErrorStateInfo mo112341a() {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getProcessesInErrorState();
        if (processesInErrorState == null) {
            return null;
        }
        for (ActivityManager.ProcessErrorStateInfo next : processesInErrorState) {
            if (next.uid == Process.myUid() && next.condition == 2) {
                return next;
            }
        }
        return null;
    }

    public void run() {
        ArrayList arrayList;
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105924i("MicroMsg.MMCrashReporter", "ANR Parser started.");
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo = null;
        while (this.f235815d.f235807e.block(10000)) {
            this.f235815d.f235807e.close();
            try {
                Thread.sleep(500);
            } catch (Exception unused) {
            }
            processErrorStateInfo = mo112341a();
            if (processErrorStateInfo != null) {
                break;
            }
        }
        if (processErrorStateInfo == null && (processErrorStateInfo = mo112341a()) == null) {
            Log.m105928w("MicroMsg.MMCrashReporter", "ANR process not found, exit thread.");
            this.f235815d.f235810h = null;
            return;
        }
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo2 = processErrorStateInfo;
        Log.m105924i("MicroMsg.MMCrashReporter", "Got ANR process: " + processErrorStateInfo2.processName + " @ " + processErrorStateInfo2.pid);
        synchronized (this.f235815d.f235804b) {
            arrayList = new ArrayList(this.f235815d.f235804b.size());
            int lastIndexOf = this.f235815d.f235806d.lastIndexOf(46);
            if (lastIndexOf != -1) {
                String str = this.f235815d.f235806d.substring(0, lastIndexOf) + '_' + processErrorStateInfo2.processName + this.f235815d.f235806d.substring(lastIndexOf);
                if (this.f235815d.f235804b.remove(str)) {
                    arrayList.add(str);
                }
            }
            C80600i0 i0Var = this.f235815d;
            if (i0Var.f235804b.remove(i0Var.f235806d)) {
                arrayList.add(this.f235815d.f235806d);
            }
            arrayList.addAll(this.f235815d.f235804b);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = this.f235815d.f235805c + XVFSFile.SEPARATOR_CHAR + ((String) it.next());
            String i = this.f235815d.mo112321i(str2, processErrorStateInfo2.pid, currentTimeMillis, processErrorStateInfo2);
            if (i != null) {
                Log.m105925i("MicroMsg.MMCrashReporter", "Parse ANR trace '%s': OK.", str2);
                C80600i0 i0Var2 = this.f235815d;
                int i2 = processErrorStateInfo2.pid;
                i0Var2.getClass();
                C117407d dVar = C117407d.INSTANCE;
                dVar.mo160140o(11339, true, true, 5000, 0);
                dVar.idkeyStat(26, 0, 1, true);
                C80600i0.m98223h(i);
                dVar.mo160139n();
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - i0Var2.f235803a >= 120000) {
                    i0Var2.f235803a = currentTimeMillis2;
                    C0989k.m942a(MMApplicationContext.getContext(), MMApplicationContext.getProcessName(), "anr");
                    StringBuilder sb = new StringBuilder(4096);
                    sb.append(C80600i0.m98220b("", true, BuildInfo.CLIENT_VERSION, (C91355x) null));
                    sb.append("******* ANR Trace *******\n");
                    if (i.length() > 51200) {
                        i = i.substring(0, 51200);
                    }
                    sb.append(i);
                    if (C90149c.f258834a != null) {
                        Intent intent = new Intent();
                        intent.setAction("uncatch_exception");
                        intent.putExtra("tag", "anr");
                        intent.putExtra("exceptionPid", i2);
                        intent.putExtra("exceptionTime", SystemClock.elapsedRealtime());
                        intent.putExtra("userName", C7624i3.f25910c.mo19a("login_user_name", "never_login_crash"));
                        intent.putExtra("exceptionMsg", Base64.encodeToString(sb.toString().getBytes(), 2));
                        ((SubCoreSandBox) C90149c.f258834a).mo118745d(MMApplicationContext.getContext(), intent);
                    }
                }
            } else {
                Log.m105925i("MicroMsg.MMCrashReporter", "Parse ANR trace '%s': Not found.", str2);
            }
        }
        Log.m105924i("MicroMsg.MMCrashReporter", "ANR Parser ended.");
        this.f235815d.f235810h = null;
    }
}
