package p918s2;

import android.app.ActivityOptions;
import android.os.Build;
import android.os.Bundle;

/* renamed from: s2.b */
public class C118252b {

    /* renamed from: s2.b$a */
    public static class C118253a extends C118252b {

        /* renamed from: a */
        public final ActivityOptions f353441a;

        public C118253a(ActivityOptions activityOptions) {
            this.f353441a = activityOptions;
        }

        /* renamed from: b */
        public Bundle mo183044b() {
            return this.f353441a.toBundle();
        }
    }

    /* renamed from: a */
    public static C118252b m166809a() {
        return Build.VERSION.SDK_INT >= 23 ? new C118253a(ActivityOptions.makeBasic()) : new C118252b();
    }

    /* renamed from: b */
    public Bundle mo183044b() {
        return null;
    }
}
