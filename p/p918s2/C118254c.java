package p918s2;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* renamed from: s2.c */
public final class C118254c {

    /* renamed from: s2.c$a */
    public static class C118255a {
        /* renamed from: a */
        public static int m166814a(AppOpsManager appOpsManager, String str, int i, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        /* renamed from: b */
        public static String m166815b(Context context) {
            return context.getOpPackageName();
        }

        /* renamed from: c */
        public static AppOpsManager m166816c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m166812a(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }

    /* renamed from: b */
    public static String m166813b(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }
}
