package mp0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lp0.C88620b;
import nj3.C76874e0;
import nj3.C76875f0;
import p757xv.C91353u;
import qo3.C77407n;

/* renamed from: mp0.c */
public final class C88795c implements C88620b<C83928t1> {
    /* renamed from: a */
    public void mo115970a(Context context, C83780d1 d1Var, String str) {
        String str2;
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        C83928t1 t1Var = (C83928t1) d1Var;
        if (WeChatEnvironment.hasDebugger()) {
            ((MemoryWatchDog) ((C91353u) C86312j.m106911c(C91353u.class)).mo112623CU()).mo118578d(true);
        }
        LayoutInflater.from(context);
        C77407n nVar = new C77407n(context, 1, false);
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        if (context != null && (activityManager = (ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)) != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            int myPid = Process.myPid();
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    str2 = next.processName;
                    break;
                }
            }
        }
        str2 = null;
        C11072a aVar = new C11072a(this, t1Var, str2, context);
        C88793b bVar = new C88793b(this, t1Var, context);
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C76875f0 f0Var = (C76875f0) ((MenuItem) it4.next());
            f0Var.f224728w = null;
            f0Var.f224729x = null;
        }
        arrayList.clear();
        C76874e0 e0Var = new C76874e0(context);
        aVar.onCreateMMMenu(e0Var);
        if (e0Var.mo107176v()) {
            Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            return;
        }
        nVar.f225771i = aVar;
        nVar.f225782p = bVar;
        nVar.f225761d = null;
        nVar.f225725D = null;
        nVar.mo107573q();
    }

    /* renamed from: b */
    public String mo115971b(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        return context.getString(C0966R.string.f7590kk);
    }

    /* renamed from: c */
    public boolean mo115972c(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        return WeChatEnvironment.hasDebugger() || C84072q1.m103586a(str).f245471o;
    }
}
