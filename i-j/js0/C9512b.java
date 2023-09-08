package js0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: js0.b */
public class C9512b {
    /* renamed from: a */
    public static PackageInfo m9207a(Context context, String str) {
        if (str == null) {
            Log.m105920e("Luggage.AndroidPackageUtil", "getPackageInfo fail, packageName is null");
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.m105928w("Luggage.AndroidPackageUtil", e.getMessage());
            return null;
        }
    }
}
