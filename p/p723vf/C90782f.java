package p723vf;

import android.app.ActivityManager;
import android.app.Application;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import p761yd.C91441c;

/* renamed from: vf.f */
public final class C90782f {

    /* renamed from: a */
    public static final ActivityManager f260693a;

    /* renamed from: b */
    public static final int f260694b;

    /* renamed from: c */
    public static final int f260695c;

    static {
        if (C91441c.m114729c()) {
            C91441c d = C91441c.m114730d();
            C87412m.m108593f(d, "Matrix.with()");
            Application application = d.f262168b;
            Object systemService = application != null ? application.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME) : null;
            if (systemService != null) {
                ActivityManager activityManager = (ActivityManager) systemService;
                f260693a = activityManager;
                f260694b = activityManager.getMemoryClass();
                f260695c = activityManager.getLargeMemoryClass();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
        throw new IllegalStateException("Matrix is NOT installed or MemoryInfoFactory is not initialized!!!");
    }
}
