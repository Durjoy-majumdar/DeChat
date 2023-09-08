package com.tencent.p014mm.p136ui.component.support;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39623j;
import bl3.C113199a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import rx3.C13598b0;
import rx3.C36568h;

/* renamed from: com.tencent.mm.ui.component.support.ActivityLifecycleInjector */
public final class ActivityLifecycleInjector {

    /* renamed from: a */
    public static final ActivityLifecycleInjector f348353a = new ActivityLifecycleInjector();

    /* renamed from: b */
    public static final ArrayList<C113199a> f348354b = new ArrayList<>();

    /* renamed from: c */
    public static final C116078c f348355c = new C116078c();

    /* renamed from: com.tencent.mm.ui.component.support.ActivityLifecycleInjector$b */
    public static final class C30845b extends C87413o implements C32224a<Instrumentation> {

        /* renamed from: d */
        public static final C30845b f82866d = new C30845b();

        public C30845b() {
            super(0);
        }

        public Object invoke() {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke((Object) null, new Object[0]);
            Field declaredField = invoke.getClass().getDeclaredField("mInstrumentation");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            C87412m.m108592e(obj, "null cannot be cast to non-null type android.app.Instrumentation");
            Instrumentation instrumentation = (Instrumentation) obj;
            Log.m105924i("ActivityLifecycleInjector", "rawInstrumentation=" + instrumentation);
            return instrumentation;
        }
    }

    /* renamed from: com.tencent.mm.ui.component.support.ActivityLifecycleInjector$a */
    public static final class C116077a implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public void onActivityDestroyed(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public void onActivityPaused(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            ActivityLifecycleInjector.f348355c.mo177385a(activity, bundle);
        }

        public void onActivityPostDestroyed(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            ActivityLifecycleInjector.f348355c.mo177386b(activity);
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            ActivityLifecycleInjector.f348355c.mo177387c(activity, bundle);
        }

        public void onActivityPreDestroyed(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            ActivityLifecycleInjector.f348355c.mo177388d(activity);
        }

        public void onActivityResumed(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(bundle, "outState");
        }

        public void onActivityStarted(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public void onActivityStopped(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }
    }

    /* renamed from: com.tencent.mm.ui.component.support.ActivityLifecycleInjector$c */
    public static final class C116078c {
        /* renamed from: a */
        public void mo177385a(Activity activity, Bundle bundle) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            ArrayList<C113199a> a = ActivityLifecycleInjector.m163363a(ActivityLifecycleInjector.f348353a);
            if (a != null) {
                for (C113199a onActivityPostCreated : a) {
                    onActivityPostCreated.onActivityPostCreated(activity, bundle);
                }
            }
        }

        /* renamed from: b */
        public void mo177386b(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            ArrayList<C113199a> a = ActivityLifecycleInjector.m163363a(ActivityLifecycleInjector.f348353a);
            if (a != null) {
                for (C113199a onActivityPostDestroyed : a) {
                    onActivityPostDestroyed.onActivityPostDestroyed(activity);
                }
            }
        }

        /* renamed from: c */
        public void mo177387c(Activity activity, Bundle bundle) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            ArrayList<C113199a> a = ActivityLifecycleInjector.m163363a(ActivityLifecycleInjector.f348353a);
            if (a != null) {
                for (C113199a onActivityPreCreated : a) {
                    onActivityPreCreated.onActivityPreCreated(activity, bundle);
                }
            }
        }

        /* renamed from: d */
        public void mo177388d(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            ArrayList<C113199a> a = ActivityLifecycleInjector.m163363a(ActivityLifecycleInjector.f348353a);
            if (a != null) {
                for (C113199a onActivityPreDestroyed : a) {
                    onActivityPreDestroyed.onActivityPreDestroyed(activity);
                }
            }
        }
    }

    static {
        C36568h.m40985a(C30845b.f82866d);
        if (Build.VERSION.SDK_INT < 29) {
            Context context = MMApplicationContext.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Application");
            ((Application) context).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    C39623j lifecycle;
                    C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    boolean z = activity instanceof AppCompatActivity;
                    if (z) {
                        ActivityLifecycleInjector.f348355c.mo177387c(activity, bundle);
                    }
                    AppCompatActivity appCompatActivity = z ? (AppCompatActivity) activity : null;
                    if (appCompatActivity != null && (lifecycle = appCompatActivity.getLifecycle()) != null) {
                        lifecycle.addObserver(new ActivityLifecycleInjector$1$onActivityCreated$1(activity, bundle));
                    }
                }

                public void onActivityDestroyed(Activity activity) {
                    C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    if (activity instanceof AppCompatActivity) {
                        ActivityLifecycleInjector.f348355c.mo177386b(activity);
                    }
                }

                public void onActivityPaused(Activity activity) {
                    C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                }

                public void onActivityResumed(Activity activity) {
                    C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    C87412m.m108594g(bundle, "outState");
                }

                public void onActivityStarted(Activity activity) {
                    C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                }

                public void onActivityStopped(Activity activity) {
                    C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                }
            });
            return;
        }
        Context context2 = MMApplicationContext.getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Application");
        ((Application) context2).registerActivityLifecycleCallbacks(new C116077a());
    }

    /* renamed from: a */
    public static final ArrayList m163363a(ActivityLifecycleInjector activityLifecycleInjector) {
        ArrayList arrayList;
        activityLifecycleInjector.getClass();
        ArrayList<C113199a> arrayList2 = f348354b;
        synchronized (arrayList2) {
            arrayList = arrayList2.isEmpty() ^ true ? new ArrayList(arrayList2) : null;
            C13598b0 b0Var = C13598b0.f38549a;
        }
        return arrayList;
    }
}
