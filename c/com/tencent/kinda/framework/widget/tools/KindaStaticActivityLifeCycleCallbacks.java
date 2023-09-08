package com.tencent.kinda.framework.widget.tools;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.app.C114657b1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kj2.C117407d;

public class KindaStaticActivityLifeCycleCallbacks implements C114657b1 {
    private static final String TAG = "KindaContext";

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Log.m105918d(TAG, "onActivityCreated：" + activity);
        String topActivityName2 = Util.getTopActivityName2(MMApplicationContext.getContext());
        String className = activity.getComponentName().getClassName();
        if (className.contains(".")) {
            className = className.substring(className.lastIndexOf(".") + 1);
        }
        if (Util.isNullOrNil(topActivityName2) || !className.equals(topActivityName2)) {
            ComponentName topActivityByAppTasks = Util.getTopActivityByAppTasks(MMApplicationContext.getContext());
            Log.m105929w(TAG, "created activity: %s not in the top, top is %s, fullClassName: %s", className, topActivityName2, topActivityByAppTasks != null ? topActivityByAppTasks.getClassName() : "");
            C117407d.INSTANCE.mo182089r(1589, 2, 1);
        }
        KindaContext.getContextStack().push(new WeakReference(activity));
        Log.m105924i(TAG, "sContextStack.push：" + activity);
    }

    public void onActivityDestroyed(Activity activity) {
        WeakReference weakReference;
        Iterator<WeakReference<Context>> it = KindaContext.getContextStack().iterator();
        while (true) {
            if (!it.hasNext()) {
                weakReference = null;
                break;
            }
            weakReference = it.next();
            if (weakReference.get() == activity) {
                break;
            }
        }
        if (weakReference != null) {
            KindaContext.getContextStack().remove(weakReference);
            Log.m105924i(TAG, "The context is destroy, so sContextStack.remove:[" + activity + "]");
        }
    }

    public void onActivityPaused(Activity activity) {
        Log.m105918d(TAG, "onActivityPaused：" + activity);
        if (activity.isFinishing()) {
            WeakReference weakReference = null;
            Iterator<WeakReference<Context>> it = KindaContext.getContextStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference next = it.next();
                if (next.get() == activity) {
                    weakReference = next;
                    break;
                }
            }
            if (weakReference != null) {
                KindaContext.getContextStack().remove(weakReference);
                Log.m105924i(TAG, "The context is finishing, so sContextStack.remove:[" + activity + "]");
            }
        }
    }

    public /* bridge */ /* synthetic */ void onActivityPostCreated(Activity activity, Bundle bundle) {
    }

    public /* bridge */ /* synthetic */ void onActivityPostDestroyed(Activity activity) {
    }

    public /* bridge */ /* synthetic */ void onActivityPostPaused(Activity activity) {
    }

    public /* bridge */ /* synthetic */ void onActivityPostResumed(Activity activity) {
    }

    public /* bridge */ /* synthetic */ void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
    }

    public /* bridge */ /* synthetic */ void onActivityPostStarted(Activity activity) {
    }

    public /* bridge */ /* synthetic */ void onActivityPostStopped(Activity activity) {
    }

    public /* bridge */ /* synthetic */ void onActivityPreCreated(Activity activity, Bundle bundle) {
    }

    public /* bridge */ /* synthetic */ void onActivityPreDestroyed(Activity activity) {
    }

    public /* bridge */ /* synthetic */ void onActivityPrePaused(Activity activity) {
    }

    public /* bridge */ /* synthetic */ void onActivityPreResumed(Activity activity) {
    }

    public /* bridge */ /* synthetic */ void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
    }

    public /* bridge */ /* synthetic */ void onActivityPreStarted(Activity activity) {
    }

    public /* bridge */ /* synthetic */ void onActivityPreStopped(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
