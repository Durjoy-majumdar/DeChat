package gx3;

import android.content.Context;
import android.os.Build;

/* renamed from: gx3.b */
public final class C87405b {
    /* renamed from: a */
    public static boolean m108580a(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        return (context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) && (context.checkSelfPermission("android.permission.INTERNET") == 0);
    }
}
