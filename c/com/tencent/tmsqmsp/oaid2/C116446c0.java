package com.tencent.tmsqmsp.oaid2;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1574a3;
import com.tencent.youtu.sdkkitframework.common.StateEvent;

/* renamed from: com.tencent.tmsqmsp.oaid2.c0 */
public class C116446c0 {

    /* renamed from: a */
    public static final Uri f349362a = Uri.parse("content://cn.nubia.identity/identity");

    /* renamed from: a */
    public static String m164141a(Context context, String str) {
        try {
            int i = Build.VERSION.SDK_INT;
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f349362a);
            Bundle call = acquireUnstableContentProviderClient.call("getAAID", str, (Bundle) null);
            if (i >= 24) {
                acquireUnstableContentProviderClient.close();
            } else {
                acquireUnstableContentProviderClient.release();
            }
            if (call.getInt("code", -1) == 0) {
                String string = call.getString("id");
                C116445c.m164140c("NubiaLog succeed:".concat(String.valueOf(string)));
                return string;
            }
            String string2 = call.getString(StateEvent.Name.MESSAGE);
            C116445c.m164140c("NubiaLog failed:".concat(String.valueOf(string2)));
            return string2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m164143b(Context context) {
        try {
            int i = Build.VERSION.SDK_INT;
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f349362a);
            Bundle call = acquireUnstableContentProviderClient.call(C1574a3.NAME, (String) null, (Bundle) null);
            if (i >= 24) {
                acquireUnstableContentProviderClient.close();
            } else {
                acquireUnstableContentProviderClient.release();
            }
            if (call.getInt("code", -1) == 0) {
                String string = call.getString("id");
                C116445c.m164140c("NubiaLog succeed:".concat(String.valueOf(string)));
                return string;
            }
            String string2 = call.getString(StateEvent.Name.MESSAGE);
            C116445c.m164140c("NubiaLog failed:".concat(String.valueOf(string2)));
            return string2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m164142a(Context context) {
        try {
            int i = Build.VERSION.SDK_INT;
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f349362a);
            Bundle call = acquireUnstableContentProviderClient.call("isSupport", (String) null, (Bundle) null);
            if (i >= 24) {
                acquireUnstableContentProviderClient.close();
            } else {
                acquireUnstableContentProviderClient.release();
            }
            if (call.getInt("code", -1) == 0) {
                C116445c.m164140c("NubiaLog succeed");
                return call.getBoolean("issupport", true);
            }
            String string = call.getString(StateEvent.Name.MESSAGE);
            C116445c.m164140c("NubiaLog failed:" + string);
            return false;
        } catch (Exception unused) {
        }
    }
}
