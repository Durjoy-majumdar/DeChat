package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tencent.mm.ui.r4 */
public class C85924r4 {

    /* renamed from: c */
    public static final AtomicBoolean f250284c = new AtomicBoolean(false);

    /* renamed from: d */
    public static final boolean f250285d;

    /* renamed from: e */
    public static final WeakHashMap<Activity, C85924r4> f250286e = new WeakHashMap<>();

    /* renamed from: a */
    public WindowInsets f250287a;

    /* renamed from: b */
    public final Set<View.OnApplyWindowInsetsListener> f250288b = new HashSet();

    /* renamed from: com.tencent.mm.ui.r4$a */
    public class C85925a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Activity f250289d;

        /* renamed from: com.tencent.mm.ui.r4$a$a */
        public class C85926a implements View.OnApplyWindowInsetsListener {
            public C85926a() {
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                LinkedList<View.OnApplyWindowInsetsListener> linkedList;
                synchronized (C85924r4.this) {
                    C85924r4.this.f250287a = new WindowInsets(windowInsets);
                }
                synchronized (C85924r4.this.f250288b) {
                    linkedList = new LinkedList<>(C85924r4.this.f250288b);
                }
                for (View.OnApplyWindowInsetsListener onApplyWindowInsets : linkedList) {
                    onApplyWindowInsets.onApplyWindowInsets(view, windowInsets);
                }
                return view.onApplyWindowInsets(windowInsets);
            }
        }

        public C85925a(Activity activity) {
            this.f250289d = activity;
        }

        public void run() {
            this.f250289d.getWindow().getDecorView().setOnApplyWindowInsetsListener(new C85926a());
        }
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 23) {
            z = true;
        }
        f250285d = z;
    }

    public C85924r4(Activity activity) {
        activity.runOnUiThread(new C85925a(activity));
    }

    /* renamed from: b */
    public static WindowInsets m106237b(Activity activity) {
        WindowInsets windowInsets = null;
        if (f250285d) {
            C85924r4 c = m106238c(activity, false);
            if (c != null) {
                synchronized (c) {
                    windowInsets = c.f250287a;
                }
            }
            return windowInsets;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return activity.getWindow().getDecorView().getRootWindowInsets();
        } else {
            return null;
        }
    }

    /* renamed from: c */
    public static C85924r4 m106238c(Activity activity, boolean z) {
        C85924r4 r4Var;
        WeakHashMap<Activity, C85924r4> weakHashMap = f250286e;
        synchronized (weakHashMap) {
            r4Var = weakHashMap.get(activity);
            if (r4Var == null && z) {
                r4Var = new C85924r4(activity);
                weakHashMap.put(activity, r4Var);
                AtomicBoolean atomicBoolean = f250284c;
                if (!atomicBoolean.get() && activity.getApplication() != null) {
                    activity.getApplication().registerActivityLifecycleCallbacks(new C85923q4(new C85922p4()));
                    atomicBoolean.set(true);
                }
            }
        }
        return r4Var;
    }

    /* renamed from: a */
    public void mo119830a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        if (onApplyWindowInsetsListener != null) {
            synchronized (this.f250288b) {
                ((HashSet) this.f250288b).add(onApplyWindowInsetsListener);
            }
        }
    }
}
