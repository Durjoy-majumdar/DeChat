package com.tencent.p014mm.plugin.expansions;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Process;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.expansions.ExpansionsClassLoaderInitializer */
public final class ExpansionsClassLoaderInitializer {
    private static final String TAG = "MicroMsg.ExpansionsClassLoaderInitializer";

    public void initializeClassLoader(Application application, ClassLoader classLoader) {
        String str;
        C29890o.m38898a(TAG, "[+] Enter initializeClassLoader.");
        String str2 = null;
        if (application != null) {
            int myPid = Process.myPid();
            Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) application.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid && (str = next.processName) != null && !str.equals("")) {
                    str2 = next.processName;
                    break;
                }
            }
        }
        if (str2.endsWith(":push")) {
            C29890o.m38898a(TAG, "[!] push process needn't initialize Expansions.");
        } else if (str2.endsWith(":isolated_process0")) {
            C29890o.m38898a(TAG, "[!] tbs isolated process cannot initialize Expansions.");
        } else {
            byte[] bArr = C85178q.f248171a;
            Delivery.isEnabled();
        }
        C29890o.m38898a(TAG, "[+] Exit initializeClassLoader.");
    }
}
