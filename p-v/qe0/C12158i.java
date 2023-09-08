package qe0;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: qe0.i */
public class C12158i {
    /* renamed from: a */
    public static boolean m11772a() {
        PackageInfo packageInfo = null;
        try {
            packageInfo = MMApplicationContext.getContext().getPackageManager().getPackageInfo("com.tencent.wework", 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.m105928w("MicroMsg.PackageUtil", e.getMessage());
        }
        return packageInfo != null;
    }
}
