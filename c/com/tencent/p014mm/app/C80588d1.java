package com.tencent.p014mm.app;

import android.os.Build;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import iv3.C87824b;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.tencent.mm.app.d1 */
public class C80588d1 {
    /* renamed from: a */
    public static boolean m98204a(StackTraceElement[] stackTraceElementArr) {
        for (StackTraceElement className : stackTraceElementArr) {
            String className2 = className.getClassName();
            if (className2 != null && (className2.contains("de.robv.android.xposed.XposedBridge") || className2.contains("com.zte.heartyservice.SCC.FrameworkBridge"))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m98205b(Throwable th) {
        ApplicationLike applicationLike = C80589e.f235760a;
        if (applicationLike == null || applicationLike.getApplication() == null) {
            ShareTinkerLog.m106533v("TinkerCrashProtect", "applicationlike is null", new Object[0]);
        } else if (!C87824b.m109281c(applicationLike)) {
            ShareTinkerLog.m106533v("TinkerCrashProtect", "tinker is not loaded", new Object[0]);
        } else {
            String str = Build.MODEL;
            boolean z = str.contains("ZUK") || str.contains("zuk");
            boolean z2 = false;
            while (th != null) {
                if (!z2) {
                    z2 = m98204a(th.getStackTrace());
                }
                if (z2) {
                    if ((th instanceof IllegalAccessError) && th.getMessage().contains("Class ref in pre-verified class resolved to unexpected implementation")) {
                        ShareTinkerLog.m106533v("TinkerCrashProtect", "have xposed: just clean tinker", new Object[0]);
                        ShareTinkerInternals.killAllOtherProcess(applicationLike.getApplication());
                        C87824b.m109279a(applicationLike);
                        ShareTinkerInternals.setTinkerDisableWithSharedPreferences(applicationLike.getApplication());
                        return;
                    }
                }
                if (z) {
                    ShareTinkerLog.m106533v("TinkerCrashProtect", "it is zuk model here, crash:" + th.getMessage(), new Object[0]);
                    if ((th instanceof XmlPullParserException) && th.getMessage().contains("tag requires a 'drawable' attribute or child tag defining a drawable")) {
                        ShareTinkerLog.m106533v("TinkerCrashProtect", "have zuk parse error: just clean tinker", new Object[0]);
                        ShareTinkerInternals.killAllOtherProcess(applicationLike.getApplication());
                        C87824b.m109279a(applicationLike);
                        ShareTinkerInternals.setTinkerDisableWithSharedPreferences(applicationLike.getApplication());
                        return;
                    }
                }
                th = th.getCause();
            }
        }
    }
}
