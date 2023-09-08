package com.tencent.p014mm.splash;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import com.tencent.p014mm.legacy.app.C80965k;
import com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateAuxActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.lang.reflect.Field;
import java.util.HashSet;
import p787ai.C79546a;

/* renamed from: com.tencent.mm.splash.j */
public class C85785j extends Instrumentation {

    /* renamed from: a */
    public Instrumentation f249852a;

    public C85785j(Instrumentation instrumentation) {
        this.f249852a = instrumentation;
        Field[] declaredFields = Instrumentation.class.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            declaredFields[i].setAccessible(true);
            declaredFields[i].set(this, declaredFields[i].get(this.f249852a));
        }
    }

    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) {
        Activity a;
        if (C85781g.f249829g != null && C79546a.m96577a(512) && MMApplicationContext.getLaunchName().equals(str)) {
            C79546a.f233251w = true;
            Log.m105924i("MicroMsg.BlinkStartup", "report this time");
        }
        if (C85781g.f249831i && !C85781g.f249837o.getCanonicalName().equals(str)) {
            boolean contains = ((HashSet) C85781g.f249838p).contains(str);
            C85781g.m105955c("WxSplash.Splash", "ignore activity %s ?, %s", str, Boolean.valueOf(contains));
            if (!contains && !ExtStorageMigrateAuxActivity.class.getName().equals(str)) {
                SplashHackActivity splashHackActivity = new SplashHackActivity(C85793p.m105966a(MMApplicationContext.getContext()));
                splashHackActivity.f249821d = str;
                C85781g.m105955c("WxSplash.SplashHackInstrumentation", "new splash hack activity. replace activity %s", str);
                C85781g.f249823a.add(splashHackActivity);
                return splashHackActivity;
            }
        }
        Activity newActivity = super.newActivity(classLoader, str, intent);
        C85778c cVar = C85781g.f249828f;
        if (!(cVar == null || (a = ((C80965k.C80966a) cVar).mo112744a(newActivity)) == newActivity)) {
            C85781g.m105955c("WxSplash.SplashHackInstrumentation", "Activity %s is intercepted by %s.", str, a);
            newActivity = a;
        }
        if (C85784i.f249847n) {
            C85781g.m105955c("WxSplash.SplashHackInstrumentation", "processing relaunch activity.", new Object[0]);
            intent.putExtra("splash-hack-activity-recreate", true);
        }
        return newActivity;
    }
}
