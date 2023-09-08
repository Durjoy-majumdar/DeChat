package in0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p333e8.C20551y;

/* renamed from: in0.h */
public class C87762h {

    /* renamed from: a */
    public static String f254092a;

    /* renamed from: a */
    public static String m109196a(Context context) {
        ApplicationInfo applicationInfo;
        if (!Util.isNullOrNil(f254092a)) {
            return f254092a;
        }
        f254092a = context.getPackageName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(f254092a, 0);
            if (!(packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || Util.isNullOrNil(applicationInfo.name))) {
                f254092a = packageInfo.applicationInfo.name;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.printErrStackTrace("MicroMsg.AppBrand.Video.Utils", e, "getUserAgent exception", new Object[0]);
        }
        return C20551y.m22319i(context, f254092a);
    }
}
