package com.tencent.p014mm.plugin.performance.elf;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kj2.C117407d;

/* renamed from: com.tencent.mm.plugin.performance.elf.AbstractProcessChecker */
public abstract class AbstractProcessChecker extends BroadcastReceiver {

    /* renamed from: a */
    public MMHandler f248543a;

    /* renamed from: b */
    public C85318b f248544b = new C85318b((C30340a) null);

    /* renamed from: c */
    public boolean f248545c = true;

    /* renamed from: com.tencent.mm.plugin.performance.elf.AbstractProcessChecker$a */
    public class C30340a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Intent f81887d;

        public C30340a(Intent intent) {
            this.f81887d = intent;
        }

        public void run() {
            if ("ACTION_ELF_CHECK".equals(this.f81887d.getAction())) {
                ElfCheckRequest elfCheckRequest = (ElfCheckRequest) this.f81887d.getParcelableExtra("MicroMsg.ElfCheckRequest");
                if (elfCheckRequest == null) {
                    Log.m105928w("MicroMsg.AbstractProcessChecker", "pass this check,because request is null! ????");
                    return;
                }
                boolean l = AbstractProcessChecker.this.mo118558l((long) Process.myPid(), elfCheckRequest.f81889d);
                AbstractProcessChecker.this.getClass();
                AbstractProcessChecker abstractProcessChecker = AbstractProcessChecker.this;
                abstractProcessChecker.getClass();
                Log.m105925i("MicroMsg.AbstractProcessChecker", "[onReceive] begin to check process[%s] isCanKill:%s isNeedReCall:%s", MMApplicationContext.getProcessName(), Boolean.valueOf(l), Boolean.valueOf(true ^ (abstractProcessChecker instanceof ToolProcessChecker)));
                if (l) {
                    AbstractProcessChecker.this.mo118555i();
                } else {
                    AbstractProcessChecker.this.mo118561o(false);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.performance.elf.AbstractProcessChecker$b */
    public class C85318b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: d */
        public String f248546d = "";

        /* renamed from: e */
        public boolean f248547e = false;

        /* renamed from: f */
        public boolean f248548f = true;

        public C85318b(C30340a aVar) {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity.getClass().getSimpleName().endsWith("WeChatSplashActivity")) {
                this.f248547e = true;
                Log.m105924i(AbstractProcessChecker.this.mo57299e(), "WeChatSplashActivity was created!");
            }
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
            if (Util.isNullOrNil(this.f248546d)) {
                this.f248546d = activity.getClass().getName();
            }
        }

        public void onActivityResumed(Activity activity) {
            this.f248546d = activity.getClass().getName();
            this.f248548f = true;
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
            if (Util.isNullOrNil(this.f248546d)) {
                this.f248546d = activity.getClass().getName();
            }
            this.f248548f = false;
        }
    }

    public AbstractProcessChecker() {
        ((Application) MMApplicationContext.getContext()).registerActivityLifecycleCallbacks(this.f248544b);
        if (ElfCallUpReceiver.f20092a > 0) {
            mo118557k(Process.myPid(), ElfCallUpReceiver.f20092a);
        } else {
            Log.m105928w(mo57299e(), "not processElf call up!");
        }
    }

    /* renamed from: b */
    public static long m105293b() {
        try {
            String d = m105294d(String.format("/proc/%s/schedstat", new Object[]{Integer.valueOf(Process.myPid())}));
            if (d == null) {
                return -1;
            }
            return Util.safeParseLong(d.replaceAll("\n", "").split(" ")[2]);
        } catch (Exception unused) {
            return -2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064 A[SYNTHETIC, Splitter:B:26:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m105294d(java.lang.String r5) {
        /*
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)
            java.lang.String r0 = r5.getPath()
            if (r0 == 0) goto L_0x0025
            r1 = 0
            java.lang.String r0 = com.tencent.p014mm.vfs.C116299g2.m163855k(r0, r1, r1)
            java.lang.String r1 = r5.getPath()
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0025
            android.net.Uri$Builder r5 = r5.buildUpon()
            android.net.Uri$Builder r5 = r5.path(r0)
            android.net.Uri r5 = r5.build()
        L_0x0025:
            r0 = 0
            com.tencent.mm.vfs.f0 r1 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ all -> 0x0068 }
            com.tencent.mm.vfs.f0$h r1 = r1.mo177799l(r5, r0)     // Catch:{ all -> 0x0068 }
            java.io.InputStream r5 = com.tencent.p014mm.vfs.C86013q1.m106421C(r5, r1)     // Catch:{ all -> 0x0068 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
            r1.<init>()     // Catch:{ all -> 0x005b }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0061 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0061 }
            r3.<init>(r5)     // Catch:{ all -> 0x0061 }
            r2.<init>(r3)     // Catch:{ all -> 0x0061 }
        L_0x003f:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x004e
            r1.append(r0)     // Catch:{ all -> 0x005d }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x005d }
            goto L_0x003f
        L_0x004e:
            r2.close()     // Catch:{ all -> 0x005b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005b }
            if (r5 == 0) goto L_0x005a
            r5.close()
        L_0x005a:
            return r0
        L_0x005b:
            r0 = move-exception
            goto L_0x006c
        L_0x005d:
            r0 = move-exception
            r1 = r0
            r0 = r2
            goto L_0x0062
        L_0x0061:
            r1 = move-exception
        L_0x0062:
            if (r0 == 0) goto L_0x0067
            r0.close()     // Catch:{ all -> 0x005b }
        L_0x0067:
            throw r1     // Catch:{ all -> 0x005b }
        L_0x0068:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
        L_0x006c:
            if (r5 == 0) goto L_0x0071
            r5.close()
        L_0x0071:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.performance.elf.AbstractProcessChecker.m105294d(java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    public static long m105295f() {
        String str;
        Pattern compile = Pattern.compile("\\d+");
        int i = 0;
        try {
            String[] split = m105294d(String.format("/proc/%s/status", new Object[]{Integer.valueOf(Process.myPid())})).trim().split("\n");
            int length = split.length;
            while (true) {
                if (i >= length) {
                    str = split[12];
                    break;
                }
                str = split[i];
                if (str.startsWith("VmSize")) {
                    break;
                }
                i++;
            }
        } catch (Exception unused) {
            str = "";
        }
        Matcher matcher = compile.matcher(str);
        if (matcher.find()) {
            return ((long) Util.safeParseInt(matcher.group())) * 1000;
        }
        return -1;
    }

    /* renamed from: a */
    public abstract long mo118551a();

    /* renamed from: c */
    public String mo118552c() {
        return String.format("ProcessEfl found exception!kill process[%s] %s %s %s", new Object[]{Integer.valueOf(Process.myPid()), Long.valueOf(m105295f()), Long.valueOf(Debug.getNativeHeapSize()), Long.valueOf(Runtime.getRuntime().totalMemory())});
    }

    /* renamed from: e */
    public String mo57299e() {
        return "AbstractProcessChecker";
    }

    /* renamed from: g */
    public abstract boolean mo118553g();

    /* renamed from: h */
    public boolean mo118554h() {
        ActivityManager activityManager = (ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager == null) {
            Log.m105920e("MicroMsg.AbstractProcessChecker", "[isHighPriorityProcess] mActivityManager is null.");
            return false;
        }
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(50);
        if (runningServices != null) {
            for (ActivityManager.RunningServiceInfo next : runningServices) {
                if (next.foreground) {
                    Log.m105925i(mo57299e(), "foreground service:%s process:%s ", next.service, next.process);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public void mo118555i() {
        BufferedReader bufferedReader;
        if (this.f248545c || this.f248544b.f248548f) {
            Log.m105928w("MicroMsg.AbstractProcessChecker", "pass this kill! app is on foreground!");
            C117407d.INSTANCE.idkeyStat(959, 6, 1, true);
            mo118561o(false);
            return;
        }
        mo118561o(true);
        Log.m105920e("MicroMsg.AbstractProcessChecker", "[MAPPINGS]");
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/maps"), 1024);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                Log.m105920e("MicroMsg.AbstractProcessChecker", readLine);
            }
            bufferedReader.close();
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.AbstractProcessChecker", e, "Cannot print maps file.", new Object[0]);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        Log.appenderFlush();
        throw new RuntimeException(mo118552c());
        throw th;
    }

    /* renamed from: j */
    public void mo118556j(boolean z) {
        this.f248545c = z;
    }

    /* renamed from: k */
    public void mo118557k(int i, int i2) {
    }

    /* renamed from: l */
    public abstract boolean mo118558l(long j, long j2);

    /* renamed from: m */
    public abstract void mo118559m();

    /* renamed from: n */
    public abstract void mo118560n();

    /* renamed from: o */
    public final void mo118561o(boolean z) {
        ElfCheckResponse elfCheckResponse = new ElfCheckResponse(mo118553g(), mo118551a(), z, !(this instanceof ToolProcessChecker), MMApplicationContext.getProcessName(), ElfCallUpReceiver.class.getName(), 1000);
        Bundle bundle = new Bundle();
        bundle.putInt("processId", Process.myPid());
        elfCheckResponse.f81898o = bundle;
        Intent intent = new Intent("ACTION_ELF_CHECK_RESPONSE");
        intent.putExtra("MicroMsg.ElfCheckResponse", elfCheckResponse);
        MMApplicationContext.getContext().sendBroadcast(intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if ("ACTION_ELF_CHECK".equals(intent.getAction())) {
            MMHandler mMHandler = this.f248543a;
            if (mMHandler == null || mMHandler.isQuit()) {
                this.f248543a = new MMHandler("ProcessChecker");
            }
            this.f248543a.post(new C30340a(intent));
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            mo118559m();
        } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            mo118560n();
        }
    }
}
