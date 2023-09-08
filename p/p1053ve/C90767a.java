package p1053ve;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tencent.matrix.openglleak.hook.OpenGLHook;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Objects;
import p723vf.C118672d;

/* renamed from: ve.a */
public class C90767a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e */
    public static final C90767a f260660e = new C90767a();

    /* renamed from: d */
    public C90768a f260661d = null;

    /* renamed from: ve.a$a */
    public static class C90768a {

        /* renamed from: a */
        public int f260662a;

        /* renamed from: b */
        public String f260663b;

        public C90768a(int i, String str) {
            this.f260662a = i;
            this.f260663b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C90768a.class != obj.getClass()) {
                return false;
            }
            C90768a aVar = (C90768a) obj;
            return this.f260662a == aVar.f260662a && Objects.equals(this.f260663b, aVar.f260663b);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f260662a), this.f260663b});
        }

        public String toString() {
            return this.f260662a + " : " + this.f260663b;
        }
    }

    /* renamed from: a */
    public static Activity m113828a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke((Object) null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object next : ((Map) declaredField.get(invoke)).values()) {
                Class<?> cls2 = next.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(next)) {
                    Field declaredField3 = cls2.getDeclaredField(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(next);
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: b */
    public static C90768a m113829b(String str) {
        if (str == null || str.isEmpty()) {
            return new C90768a(-1, "null");
        }
        try {
            String[] split = str.split(" : ");
            return new C90768a(Integer.parseInt(split[0]), split[1]);
        } catch (Throwable th) {
            C118672d.m167354d("matrix.ActivityRecorder", th, "", new Object[0]);
            return new C90768a(-1, "");
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f260661d = new C90768a(activity.hashCode(), activity.getLocalClassName());
        OpenGLHook.getInstance().updateCurrActivity(this.f260661d.toString());
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
        this.f260661d = new C90768a(activity.hashCode(), activity.getLocalClassName());
        OpenGLHook.getInstance().updateCurrActivity(this.f260661d.toString());
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
