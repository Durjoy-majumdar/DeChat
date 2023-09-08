package ao3;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: ao3.b */
public final class C113067b implements C113066a {

    /* renamed from: d */
    public static final C113067b f338452d = new C113067b();

    /* renamed from: e */
    public static final ArrayList<Application.ActivityLifecycleCallbacks> f338453e = new ArrayList<>();

    /* renamed from: a */
    public final Application.ActivityLifecycleCallbacks[] mo165572a() {
        Object[] objArr;
        ArrayList<Application.ActivityLifecycleCallbacks> arrayList = f338453e;
        synchronized (arrayList) {
            if (arrayList.size() > 0) {
                objArr = arrayList.toArray(new Application.ActivityLifecycleCallbacks[0]);
                C87412m.m108592e(objArr, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            } else {
                objArr = null;
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        return (Application.ActivityLifecycleCallbacks[]) objArr;
    }

    /* renamed from: b */
    public final boolean mo165573b() {
        return Build.VERSION.SDK_INT < 29;
    }

    /* renamed from: bF */
    public void mo33186bF(Activity activity) {
        C87412m.m108594g(activity, "caller");
        Application.ActivityLifecycleCallbacks[] a = mo165572a();
        if (a != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                boolean z = activityLifecycleCallbacks instanceof C113066a;
                if (z) {
                    C113066a aVar = z ? (C113066a) activityLifecycleCallbacks : null;
                    if (aVar != null) {
                        aVar.mo33186bF(activity);
                    }
                }
            }
        }
    }

    /* renamed from: jo */
    public void mo33187jo(Activity activity) {
        C87412m.m108594g(activity, "caller");
        Application.ActivityLifecycleCallbacks[] a = mo165572a();
        if (a != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                boolean z = activityLifecycleCallbacks instanceof C113066a;
                if (z) {
                    C113066a aVar = z ? (C113066a) activityLifecycleCallbacks : null;
                    if (aVar != null) {
                        aVar.mo33187jo(activity);
                    }
                }
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MicroMsg.VAS.VASLifeCycleMonitor", "onActivityCreated() called with: activity = " + activity + ", savedInstanceState = " + bundle);
        Application.ActivityLifecycleCallbacks[] a = mo165572a();
        if (a != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                if (!(activityLifecycleCallbacks instanceof Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                }
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MicroMsg.VAS.VASLifeCycleMonitor", "onActivityDestroyed() called with: activity = " + activity);
        Application.ActivityLifecycleCallbacks[] a = mo165572a();
        if (a != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                if (!(activityLifecycleCallbacks instanceof Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityDestroyed(activity);
                }
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MicroMsg.VAS.VASLifeCycleMonitor", "onActivityPaused() called with: activity = " + activity);
        Application.ActivityLifecycleCallbacks[] a = mo165572a();
        if (a != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                if (!(activityLifecycleCallbacks instanceof Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityPaused(activity);
                }
            }
        }
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        Application.ActivityLifecycleCallbacks[] a;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MicroMsg.VAS.VASLifeCycleMonitor", "onActivityPostCreated() called with: activity = " + activity + ", savedInstanceState = " + bundle);
        if (!mo165573b() && (a = mo165572a()) != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                if (!(activityLifecycleCallbacks instanceof Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityPostCreated(activity, bundle);
                }
            }
        }
    }

    public void onActivityPostDestroyed(Activity activity) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(activity);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "onActivityPostDestroyed", "(Landroid/app/Activity;)V", this, array);
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MicroMsg.VAS.VASLifeCycleMonitor", "onActivityPostDestroyed() called with: activity = " + activity);
        if (mo165573b()) {
            C117292a.m165361g(this, "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "onActivityPostDestroyed", "(Landroid/app/Activity;)V");
            return;
        }
        Application.ActivityLifecycleCallbacks[] a = mo165572a();
        if (a != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                if (!(activityLifecycleCallbacks instanceof Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityPostDestroyed(activity);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "onActivityPostDestroyed", "(Landroid/app/Activity;)V");
    }

    public void onActivityPostPaused(Activity activity) {
        Application.ActivityLifecycleCallbacks[] a;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MicroMsg.VAS.VASLifeCycleMonitor", "onActivityPostPaused() called with: activity = " + activity);
        if (!mo165573b() && (a = mo165572a()) != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                if (!(activityLifecycleCallbacks instanceof Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityPostPaused(activity);
                }
            }
        }
    }

    public void onActivityPostResumed(Activity activity) {
        Application.ActivityLifecycleCallbacks[] a;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MicroMsg.VAS.VASLifeCycleMonitor", "onActivityPostResumed() called with: activity = " + activity);
        if (!mo165573b() && (a = mo165572a()) != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                if (!(activityLifecycleCallbacks instanceof Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityPostResumed(activity);
                }
            }
        }
    }

    public void onActivityPostStarted(Activity activity) {
        Application.ActivityLifecycleCallbacks[] a;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MicroMsg.VAS.VASLifeCycleMonitor", "onActivityPostStarted() called with: activity = " + activity);
        if (!mo165573b() && (a = mo165572a()) != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                if (!(activityLifecycleCallbacks instanceof Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityPostStarted(activity);
                }
            }
        }
    }

    public void onActivityPostStopped(Activity activity) {
        Application.ActivityLifecycleCallbacks[] a;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MicroMsg.VAS.VASLifeCycleMonitor", "onActivityPostStopped() called with: activity = " + activity);
        if (!mo165573b() && (a = mo165572a()) != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                if (!(activityLifecycleCallbacks instanceof Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityPostStopped(activity);
                }
            }
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(activity);
        arrayList.add(bundle);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", this, array);
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MicroMsg.VAS.VASLifeCycleMonitor", "onActivityPreCreated() called with: activity = " + activity + ", savedInstanceState = " + bundle);
        if (mo165573b()) {
            C117292a.m165361g(this, "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V");
            return;
        }
        Application.ActivityLifecycleCallbacks[] a = mo165572a();
        if (a != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                if (!(activityLifecycleCallbacks instanceof Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityPreCreated(activity, bundle);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "com/tencent/mm/ui/vas/lifecycle/VASLifeCycleMonitor", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V");
    }

    public void onActivityPreDestroyed(Activity activity) {
        Application.ActivityLifecycleCallbacks[] a;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MicroMsg.VAS.VASLifeCycleMonitor", "onActivityPreDestroyed() called with: activity = " + activity);
        if (!mo165573b() && (a = mo165572a()) != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                if (!(activityLifecycleCallbacks instanceof Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityPreDestroyed(activity);
                }
            }
        }
    }

    public void onActivityPrePaused(Activity activity) {
        Application.ActivityLifecycleCallbacks[] a;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MicroMsg.VAS.VASLifeCycleMonitor", "onActivityPrePaused() called with: activity = " + activity);
        if (!mo165573b() && (a = mo165572a()) != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                if (!(activityLifecycleCallbacks instanceof Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityPrePaused(activity);
                }
            }
        }
    }

    public void onActivityPreResumed(Activity activity) {
        Application.ActivityLifecycleCallbacks[] a;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MicroMsg.VAS.VASLifeCycleMonitor", "onActivityPreResumed() called with: activity = " + activity);
        if (!mo165573b() && (a = mo165572a()) != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                if (!(activityLifecycleCallbacks instanceof Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityPreResumed(activity);
                }
            }
        }
    }

    public void onActivityPreStarted(Activity activity) {
        Application.ActivityLifecycleCallbacks[] a;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MicroMsg.VAS.VASLifeCycleMonitor", "onActivityPreStarted() called with: activity = " + activity);
        if (!mo165573b() && (a = mo165572a()) != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                if (!(activityLifecycleCallbacks instanceof Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityPreStarted(activity);
                }
            }
        }
    }

    public void onActivityPreStopped(Activity activity) {
        Application.ActivityLifecycleCallbacks[] a;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MicroMsg.VAS.VASLifeCycleMonitor", "onActivityPreStopped() called with: activity = " + activity);
        if (!mo165573b() && (a = mo165572a()) != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                if (!(activityLifecycleCallbacks instanceof Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityPreStopped(activity);
                }
            }
        }
    }

    public void onActivityResumed(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MicroMsg.VAS.VASLifeCycleMonitor", "onActivityResumed() called with: activity = " + activity);
        Application.ActivityLifecycleCallbacks[] a = mo165572a();
        if (a != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                if (!(activityLifecycleCallbacks instanceof Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityResumed(activity);
                }
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MicroMsg.VAS.VASLifeCycleMonitor", "onActivityStarted() called with: activity = " + activity);
        Application.ActivityLifecycleCallbacks[] a = mo165572a();
        if (a != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                if (!(activityLifecycleCallbacks instanceof Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityStarted(activity);
                }
            }
        }
    }

    public void onActivityStopped(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Log.m105918d("MicroMsg.VAS.VASLifeCycleMonitor", "onActivityStopped() called with: activity = " + activity);
        Application.ActivityLifecycleCallbacks[] a = mo165572a();
        if (a != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                if (!(activityLifecycleCallbacks instanceof Application.ActivityLifecycleCallbacks)) {
                    activityLifecycleCallbacks = null;
                }
                if (activityLifecycleCallbacks != null) {
                    activityLifecycleCallbacks.onActivityStopped(activity);
                }
            }
        }
    }

    public void r50(Object obj, Intent intent) {
        C87412m.m108594g(obj, "caller");
        Application.ActivityLifecycleCallbacks[] a = mo165572a();
        if (a != null) {
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : a) {
                boolean z = activityLifecycleCallbacks instanceof C113066a;
                if (z) {
                    C113066a aVar = z ? (C113066a) activityLifecycleCallbacks : null;
                    if (aVar != null) {
                        aVar.r50(obj, intent);
                    }
                }
            }
        }
    }
}
