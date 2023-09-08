package com.tencent.p014mm.plugin.wepkg.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.plugin.wepkg.model.C44488a;
import com.tencent.p014mm.plugin.wepkg.model.WepkgCrossProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import k00.C46633d;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.wepkg.utils.d */
public final class C44536d {

    /* renamed from: a */
    public static final Object f120770a = new Object();

    /* renamed from: b */
    public static volatile MMHandler f120771b;

    /* renamed from: c */
    public static final Set<Object> f120772c = new HashSet();

    /* renamed from: com.tencent.mm.plugin.wepkg.utils.d$a */
    public class C44537a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WepkgCrossProcessTask f120773d;

        /* renamed from: e */
        public final /* synthetic */ C44488a f120774e;

        public C44537a(WepkgCrossProcessTask wepkgCrossProcessTask, C44488a aVar) {
            this.f120773d = wepkgCrossProcessTask;
            this.f120774e = aVar;
        }

        public void run() {
            this.f120773d.mo1553j();
            C44488a aVar = this.f120774e;
            if (aVar != null) {
                aVar.mo66027a(this.f120773d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.utils.d$b */
    public class C44538b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f120775d;

        /* renamed from: e */
        public final /* synthetic */ C44488a f120776e;

        /* renamed from: f */
        public final /* synthetic */ WepkgCrossProcessTask f120777f;

        public C44538b(long j, C44488a aVar, WepkgCrossProcessTask wepkgCrossProcessTask) {
            this.f120775d = j;
            this.f120776e = aVar;
            this.f120777f = wepkgCrossProcessTask;
        }

        public void run() {
            Log.m105925i("MicroMsg.Wepkg.WepkgUtil", "bind service time:%s", Long.valueOf(System.currentTimeMillis() - this.f120775d));
            C44488a aVar = this.f120776e;
            if (aVar != null) {
                aVar.mo66027a(this.f120777f);
            }
            this.f120777f.mo114397h();
        }
    }

    /* renamed from: a */
    public static void m48915a(String str, C44488a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
        wepkgCrossProcessTask.f120618h = 1001;
        wepkgCrossProcessTask.f120624q = str;
        if (MMApplicationContext.isMMProcess()) {
            m48918d().postToWorker(new C44537a(wepkgCrossProcessTask, aVar));
            return;
        }
        wepkgCrossProcessTask.f120625r = new C44538b(currentTimeMillis, aVar, wepkgCrossProcessTask);
        wepkgCrossProcessTask.mo114395c();
    }

    /* renamed from: b */
    public static boolean m48916b(String str) {
        try {
            C86009m1 m1Var = new C86009m1(str);
            if (m1Var.mo119967g() && m1Var.mo119977o()) {
                return true;
            }
            m1Var.mo119987x();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static String m48917c(String str, String str2) {
        return C90193h.m112878f((str + "_" + str2).getBytes());
    }

    /* renamed from: d */
    public static MMHandler m48918d() {
        if (f120771b == null) {
            synchronized (f120770a) {
                if (f120771b == null) {
                    f120771b = new MMHandler("WebviewCache#WorkerThread");
                }
            }
        }
        return f120771b;
    }

    /* renamed from: e */
    public static boolean m48919e(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.importance == 100) {
                if (next.processName.equals(MMApplicationContext.getApplicationId())) {
                    return true;
                }
                String str = next.processName;
                if (str.equals(MMApplicationContext.getApplicationId() + ":tools")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m48920f(String str) {
        if (Util.isNullOrNil(C46633d.m51936a(str))) {
            return false;
        }
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("we_pkg_sp", 4);
        if (sharedPreferences != null && sharedPreferences.getBoolean("disable_we_pkg", false)) {
            Log.m105924i("MicroMsg.Wepkg.WepkgUtil", "disable wepkg");
            C44532a.m48912c("EnterWeb", str, C46633d.m51936a(str), (String) null, 0, 0, C44532a.m48913d(11));
            return false;
        } else if (!C41853c.m45367a()) {
            return true;
        } else {
            Log.m105924i("MicroMsg.Wepkg.WepkgUtil", "config wepkg disable");
            C44532a.m48912c("EnterWeb", str, C46633d.m51936a(str), (String) null, 0, 0, C44532a.m48913d(12));
            return false;
        }
    }
}
