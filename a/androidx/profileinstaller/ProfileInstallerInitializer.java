package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import p1062x3.f$$a;
import p1062x3.g$$a;
import p1109f4.C107471b;

public class ProfileInstallerInitializer implements C107471b<C103774c> {

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    public static class C103772a {
        /* renamed from: a */
        public static void m138185a(Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new g$$a(runnable));
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    public static class C103773b {
        /* renamed from: a */
        public static Handler m138186a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$c */
    public static class C103774c {
    }

    /* renamed from: a */
    public Object mo119723a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C103774c();
        }
        C103772a.m138185a(new f$$a(this, context.getApplicationContext()));
        return new C103774c();
    }

    public List<Class<? extends C107471b<?>>> dependencies() {
        return Collections.emptyList();
    }
}
