package com.tencent.luggage.sdk.processes;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import com.tencent.luggage.sdk.processes.C80278n;
import com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80924w;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import k20.C60958c;
import k20.C9556a;
import p963fc.C86812g;
import sx3.C36907w;
import u24.C90599h;

/* renamed from: com.tencent.luggage.sdk.processes.c */
public abstract class C80250c<PARAMS extends C80278n> {

    /* renamed from: f */
    public static final C80251a f234939f = new C80251a((C8480h) null);

    /* renamed from: a */
    public final Set<C80264l> f234940a;

    /* renamed from: b */
    public AtomicBoolean f234941b = new AtomicBoolean(false);

    /* renamed from: c */
    public LuggageServiceType f234942c = LuggageServiceType.NIL;

    /* renamed from: d */
    public LuggageServiceType f234943d = null;

    /* renamed from: e */
    public final C80924w f234944e = new C80252b(this);

    /* renamed from: com.tencent.luggage.sdk.processes.c$a */
    public static final class C80251a {
        public C80251a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo111376a(Class<?> cls) {
            String str;
            C87412m.m108594g(cls, "clazz");
            try {
                PackageManager packageManager = MMApplicationContext.getContext().getPackageManager();
                ActivityInfo activityInfo = packageManager != null ? packageManager.getActivityInfo(new ComponentName(MMApplicationContext.getContext(), cls), 128) : null;
                return (activityInfo == null || (str = activityInfo.processName) == null) ? "" : str;
            } catch (PackageManager.NameNotFoundException e) {
                Log.m105920e("Luggage.LuggageMiniProgramProcess", "processNameOfComponent: catch cmpClass[" + cls + "] " + e.getMessage());
                return null;
            }
        }
    }

    /* renamed from: com.tencent.luggage.sdk.processes.c$b */
    public static final class C80252b implements C80924w {

        /* renamed from: a */
        public final /* synthetic */ C80250c<PARAMS> f234945a;

        public C80252b(C80250c<PARAMS> cVar) {
            this.f234945a = cVar;
        }

        /* renamed from: a */
        public final void mo111377a() {
            boolean l = this.f234945a.mo111367l();
            if (l) {
                this.f234945a.f234940a.clear();
            }
            this.f234945a.f234941b.set(false);
            Log.m105925i("Luggage.LuggageMiniProgramProcess", "[%s] died, isAliveBefore[%b]", this.f234945a.mo111363h(), Boolean.valueOf(l));
        }
    }

    public C80250c() {
        Set<C80264l> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        C87412m.m108593f(newSetFromMap, "newSetFromMap(ConcurrentHashMap())");
        this.f234940a = newSetFromMap;
    }

    /* renamed from: p */
    public static void m97639p(C80250c cVar, LuggageClientProcessMessage luggageClientProcessMessage, C32224a aVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                aVar = null;
            }
            cVar.getClass();
            C87412m.m108594g(luggageClientProcessMessage, StateEvent.Name.MESSAGE);
            C80907o.m98781d(cVar.mo111363h(), luggageClientProcessMessage, C28643s.class, new C0933d(aVar));
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessageToLuggageProcess");
    }

    /* renamed from: a */
    public C80264l mo111356a(String str, int i, String str2, boolean z) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "instanceId");
        return mo111370o(str, z, i, str2);
    }

    /* renamed from: b */
    public C80264l mo111357b(String str, int i, boolean z) {
        C87412m.m108594g(str, "appId");
        return new C80264l(str, i, C80265m.INIT, z);
    }

    /* renamed from: c */
    public final void mo111358c(C80264l lVar) {
        C87412m.m108594g(lVar, "record");
        if (lVar.f234968d) {
            Log.m105925i("Luggage.LuggageMiniProgramProcess", "detachApp: [%s][%d] is persistent, do not detach", lVar.f234965a, Integer.valueOf(lVar.f234966b));
            return;
        }
        if (!this.f234940a.remove(lVar)) {
            Log.m105929w("Luggage.LuggageMiniProgramProcess", "detachApp: detach[%s] fail", lVar);
        }
        if (mo111366k()) {
            this.f234942c = LuggageServiceType.NIL;
        }
    }

    /* renamed from: d */
    public final C80264l mo111359d(String str) {
        T t;
        C87412m.m108594g(str, "appId");
        Iterator<T> it = this.f234940a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C80264l) t).f234965a, str)) {
                break;
            }
        }
        return (C80264l) t;
    }

    /* renamed from: e */
    public final Collection<String> mo111360e() {
        Set<C80264l> set = this.f234940a;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(set, 10));
        for (C80264l lVar : set) {
            arrayList.add(lVar.f234965a);
        }
        return new ArrayList(arrayList);
    }

    /* renamed from: f */
    public final Collection<C80264l> mo111361f() {
        return new ArrayList(this.f234940a);
    }

    /* renamed from: g */
    public abstract Class<? extends Activity> mo111362g();

    /* renamed from: h */
    public final String mo111363h() {
        return f234939f.mo111376a(mo111364i());
    }

    /* renamed from: i */
    public abstract Class<? extends Activity> mo111364i();

    /* renamed from: j */
    public final void mo111365j() {
        boolean z;
        String h = mo111363h();
        if (h != null) {
            AtomicBoolean atomicBoolean = this.f234941b;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            z = true;
            if (!C90599h.m113509b(MMApplicationContext.getProcessName(), h)) {
                try {
                    Object systemService = context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                    Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) systemService).getRunningAppProcesses().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str = it.next().processName;
                        if (str != null && C87412m.m108589b(str, h)) {
                            break;
                        }
                    }
                } catch (Exception e) {
                    Log.m105929w("Luggage.LuggageMiniProgramProcess", "isProcessRunning: ", android.util.Log.getStackTraceString(e));
                }
            }
            atomicBoolean.set(z);
        }
        return;
        z = false;
        atomicBoolean.set(z);
    }

    /* renamed from: k */
    public final boolean mo111366k() {
        return this.f234940a.isEmpty();
    }

    /* renamed from: l */
    public final boolean mo111367l() {
        return this.f234941b.get();
    }

    /* renamed from: m */
    public abstract void mo111368m(C80249b bVar);

    /* renamed from: n */
    public void mo111369n() {
        Object systemService = MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) systemService).getRunningAppProcesses()) {
            String str = next.processName;
            if (str != null && C87412m.m108589b(str, mo111363h())) {
                Log.m105924i("Luggage.LuggageMiniProgramProcess", "killProcess " + next.processName + " pid:" + next.pid);
                try {
                    int i = next.pid;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i));
                    Object obj = new Object();
                    C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/luggage/sdk/processes/LuggageMiniProgramProcess", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(obj, "com/tencent/luggage/sdk/processes/LuggageMiniProgramProcess", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    return;
                } catch (Exception e) {
                    Log.m105920e("Luggage.LuggageMiniProgramProcess", "killProcess " + next.processName + " pid:" + next.pid + " error:" + e.getMessage());
                    return;
                }
            }
        }
    }

    /* renamed from: o */
    public final C80264l mo111370o(String str, boolean z, int i, String str2) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "instanceId");
        C80264l d = mo111359d(str);
        if (d != null && d.f234968d == z && d.f234966b == i) {
            Log.m105924i("Luggage.LuggageMiniProgramProcess", "registerApp: use existed");
        } else {
            Log.m105925i("Luggage.LuggageMiniProgramProcess", "registerApp: createRecord stack:[%s]", android.util.Log.getStackTraceString(new Throwable()));
            d = mo111357b(str, i, z);
        }
        Log.m105925i("Luggage.LuggageMiniProgramProcess", "registerApp: appId[%s]isPersistent[%s]record_hash[%s]instanceId[%s]", str, Boolean.valueOf(z), Integer.valueOf(d.hashCode()), str2);
        d.f234971g = str2;
        if (!this.f234940a.add(d)) {
            Log.m105928w("Luggage.LuggageMiniProgramProcess", "registerApp: " + d + " already added");
        }
        return d;
    }

    /* renamed from: q */
    public final void mo111371q(LuggageClientProcessMessage<? extends C86812g> luggageClientProcessMessage) {
        C87412m.m108594g(luggageClientProcessMessage, StateEvent.Name.MESSAGE);
        C80907o.m98783f(mo111363h(), luggageClientProcessMessage, C28642q.class);
    }

    /* renamed from: r */
    public final void mo111372r() {
        C80907o.m98783f(mo111363h(), new IPCString(mo111363h()), C0932a.class);
        C80907o.m98778a(mo111363h(), this.f234944e);
        this.f234941b.set(true);
    }

    /* renamed from: s */
    public final void mo111373s(LuggageServiceType luggageServiceType) {
        if (!(luggageServiceType != LuggageServiceType.NIL)) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (this.f234943d == null) {
            this.f234943d = luggageServiceType;
        } else {
            throw new IllegalStateException("const field");
        }
    }

    /* renamed from: t */
    public final boolean mo111374t(LuggageServiceType luggageServiceType) {
        C87412m.m108594g(luggageServiceType, "type");
        LuggageServiceType luggageServiceType2 = this.f234943d;
        return luggageServiceType2 == null || luggageServiceType2 == luggageServiceType;
    }

    public String toString() {
        return "LuggageMiniProgramProcess(appList=" + this.f234940a + ", isProcessAlive=" + this.f234941b + ", processName='" + mo111363h() + "', usedAs=" + this.f234942c + ", isNoAppAttached=" + mo111366k() + ", allAppId=" + mo111360e() + ", supportType=" + this.f234943d + ", uiClass=" + mo111364i() + ", pluginUIClass=" + mo111362g() + ')';
    }
}
