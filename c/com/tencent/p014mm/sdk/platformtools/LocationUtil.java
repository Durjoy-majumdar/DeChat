package com.tencent.p014mm.sdk.platformtools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.sdk.platformtools.LocationUtil */
public class LocationUtil {
    private static final String TAG = "MicroMsg.LocationUtil";
    private byte _hellAccFlag_;

    public static boolean isGpsEnable() {
        try {
            return ((LocationManager) MMApplicationContext.getContext().getSystemService(FirebaseAnalytics.C113379b.LOCATION)).isProviderEnabled("gps");
        } catch (Exception e) {
            Log.m105921e(TAG, "exception:%s", Util.stackTraceToString(e));
            return false;
        }
    }

    public static boolean isNetworkProviderEnable() {
        try {
            return ((LocationManager) MMApplicationContext.getContext().getSystemService(FirebaseAnalytics.C113379b.LOCATION)).isProviderEnabled("network");
        } catch (Exception e) {
            Log.m105921e(TAG, "exception:%s", Util.stackTraceToString(e));
            return false;
        }
    }

    public static void jumpToOpenGps(Context context) {
        jumpToOpenGps(context, -1);
    }

    public static void jumpToOpenGps(Context context, int i) {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        if (context instanceof Activity) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            aVar.mo10233c(intent);
            C117292a.m165364j((Activity) context, aVar.mo10232b(), "com/tencent/mm/sdk/platformtools/LocationUtil", "jumpToOpenGps", "(Landroid/content/Context;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            return;
        }
        intent.addFlags(268435456);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/sdk/platformtools/LocationUtil", "jumpToOpenGps", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/sdk/platformtools/LocationUtil", "jumpToOpenGps", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
