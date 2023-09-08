package nj0;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import j20.C117292a;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C64197v;
import z04.C112550d0;
import z04.C66731x;

/* renamed from: nj0.z */
public abstract class C88986z<T> {

    /* renamed from: b */
    public static final C13601g<List<C88986z<?>>> f256578b = C36568h.m40985a(C88987a.f256580d);

    /* renamed from: a */
    public T f256579a;

    /* renamed from: nj0.z$a */
    public static final class C88987a extends C87413o implements C32224a<List<C88986z<?>>> {

        /* renamed from: d */
        public static final C88987a f256580d = new C88987a();

        public C88987a() {
            super(0);
        }

        public Object invoke() {
            List<C88986z> h = C64197v.m75539h(C88968h.f256558c, C88966f.f256550c, C88964d.f256548c, C88982v.f256574c, C88983w.f256575c, C88976p.f256568c, C88970j.f256560c, C88979s.f256571c, C88984x.f256576c, C88973l.f256565c, C88975n.f256567c, C88965e.f256549c, C88977q.f256569c, C88978r.f256570c);
            h.add(C88969i.f256559c);
            Collection<C88971k> values = C88971k.f256561f.values();
            C87412m.m108593f(values, "registry.values");
            h.addAll(values);
            C13601g<List<C88986z<?>>> gVar = C88986z.f256578b;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C88986z d : h) {
                String d2 = d.mo123349d();
                if (d2 != null) {
                    linkedHashSet.contains(d2);
                    linkedHashSet.add(d2);
                }
            }
            return h;
        }
    }

    /* renamed from: nj0.z$b */
    public static final class C88988b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C88988b f256581d = new C88988b();

        public final void onClick(DialogInterface dialogInterface, int i) {
            Context context = MMApplicationContext.getContext();
            PendingIntent activity = PendingIntent.getActivity(context, -1, context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()), 268435456);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            C87412m.m108591d(alarmManager);
            C9556a aVar = new C9556a();
            aVar.mo10233c(activity);
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Long.valueOf(System.currentTimeMillis() + ((long) 100)));
            aVar.mo10233c(1);
            C117292a.m165358d(alarmManager, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/game/util/WAGameSelfRestart", "prepare_restart", "()V", "android/app/AlarmManager_EXEC_", "set", "(IJLandroid/app/PendingIntent;)V");
            int intValue = ((Integer) aVar.mo10231a(0)).intValue();
            C60958c.f173611a.set(aVar);
            alarmManager.set(intValue, ((Long) aVar.mo10231a(1)).longValue(), (PendingIntent) C60958c.m71441a().mo10231a(2));
            C117292a.m165359e(alarmManager, "com/tencent/mm/plugin/appbrand/game/util/WAGameSelfRestart", "prepare_restart", "()V", "android/app/AlarmManager_EXEC_", "set", "(IJLandroid/app/PendingIntent;)V");
            Object systemService = MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            C87412m.m108593f(runningAppProcesses, "am.runningAppProcesses");
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                String str = runningAppProcessInfo.processName;
                C87412m.m108593f(str, "it.processName");
                if (C112550d0.m153801u(str, MMApplicationContext.getPackageName() + XVFSFile.PATH_SEPARATOR_CHAR, false)) {
                    int i2 = runningAppProcessInfo.pid;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Integer.valueOf(i2));
                    Object obj = new Object();
                    C117292a.m165358d(obj, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/game/util/WAGameSelfRestart", "suicide", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    Process.killProcess(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(obj, "com/tencent/mm/plugin/appbrand/game/util/WAGameSelfRestart", "suicide", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                }
            }
            int myPid = Process.myPid();
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(Integer.valueOf(myPid));
            Object obj2 = new Object();
            C117292a.m165358d(obj2, aVar3.mo10232b(), "com/tencent/mm/plugin/appbrand/game/util/WAGameSelfRestart", "suicide", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            Process.killProcess(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(obj2, "com/tencent/mm/plugin/appbrand/game/util/WAGameSelfRestart", "suicide", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
    }

    /* renamed from: a */
    public final void mo123352a(Context context, String str) {
        new AlertDialog.Builder(context).setTitle("").setMessage(str).setNegativeButton("cancel", (DialogInterface.OnClickListener) null).setPositiveButton("restart", C88988b.f256581d).show();
    }

    /* renamed from: b */
    public C32735h.C32737c mo123346b() {
        return null;
    }

    /* renamed from: c */
    public boolean mo123351c() {
        return true;
    }

    /* renamed from: d */
    public String mo123349d() {
        return null;
    }

    /* renamed from: e */
    public T mo123353e() {
        T t;
        String Y60;
        T t2 = this.f256579a;
        if (t2 != null) {
            return t2;
        }
        if (mo123349d() != null) {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("WAGameDynamicConfig");
            t = null;
            String decodeString = mmkv.decodeString("WAGameDynamicConfig" + mo123349d(), (String) null);
            if (decodeString != null) {
                t = mo123348g(decodeString);
            }
            if (t != null) {
                Log.m105924i("WAGameDynamicConfig", "hit localstorage");
                this.f256579a = t;
                return t;
            }
        }
        if (mo123346b() == null || (Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(mo123346b(), "")) == null || (t = mo123348g(Y60)) == null) {
            t = mo123347f();
        } else {
            Log.m105924i("WAGameDynamicConfig", "hit ABTest");
        }
        this.f256579a = t;
        return t;
    }

    /* renamed from: f */
    public abstract T mo123347f();

    /* renamed from: g */
    public abstract T mo123348g(String str);

    /* renamed from: h */
    public final Boolean mo123354h(String str) {
        if (str == null) {
            return null;
        }
        if ("true".contentEquals(str)) {
            return Boolean.TRUE;
        }
        if ("false".contentEquals(str)) {
            return Boolean.FALSE;
        }
        Integer e = C66731x.m78731e(str);
        if (e == null) {
            return null;
        }
        if (e.intValue() > 0) {
            return Boolean.TRUE;
        }
        if (e.intValue() == 0 || e.intValue() == -1) {
            return Boolean.FALSE;
        }
        throw new IllegalStateException("Ambiguity name");
    }
}
