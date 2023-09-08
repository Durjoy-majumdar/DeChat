package p385u2;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import java.util.Objects;
import p918s2.C118254c;

/* renamed from: u2.b */
public final class C118562b {
    /* renamed from: a */
    public static int m167229a(Context context, String str) {
        return m167230b(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    /* renamed from: b */
    public static int m167230b(Context context, String str, int i, int i2, String str2) {
        int i3;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String b = C118254c.m166813b(str);
        if (b == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (!(Process.myUid() == i2 && Objects.equals(context.getPackageName(), str2))) {
            i3 = C118254c.m166812a(context, b, str2);
        } else if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager c = C118254c.C118255a.m166816c(context);
            i3 = C118254c.C118255a.m166814a(c, b, Binder.getCallingUid(), str2);
            if (i3 == 0) {
                i3 = C118254c.C118255a.m166814a(c, b, i2, C118254c.C118255a.m166815b(context));
            }
        } else {
            i3 = C118254c.m166812a(context, b, str2);
        }
        return i3 == 0 ? 0 : -2;
    }
}
