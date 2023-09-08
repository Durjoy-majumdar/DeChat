package r40;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Field;

/* renamed from: r40.e */
public final class C47925e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    public Application f128612d;

    public C47925e(Application application) {
        this.f128612d = application;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
        try {
            Class<?> cls = Class.forName("com.samsung.android.emergencymode.SemEmergencyManager");
            Field declaredField = cls.getDeclaredField("sInstance");
            declaredField.setAccessible(true);
            Object obj = declaredField.get((Object) null);
            Field declaredField2 = cls.getDeclaredField("mContext");
            declaredField2.setAccessible(true);
            declaredField2.set(obj, this.f128612d);
        } catch (Exception unused) {
        }
        this.f128612d.unregisterActivityLifecycleCallbacks(this);
    }

    public void onActivityPaused(Activity activity) {
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
