package com.tencent.p014mm.sdk.vendor;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import p206nj.C47264o;

/* renamed from: com.tencent.mm.sdk.vendor.Meizu */
public class Meizu {
    private static int getStatusBarHeight(Context context) {
        return C47264o.m52556a(context, 0);
    }

    public static boolean hasSmartBar() {
        try {
            return ((Boolean) Class.forName("android.os.Build").getMethod("hasSmartBar", new Class[0]).invoke((Object) null, new Object[0])).booleanValue();
        } catch (Exception unused) {
            String str = Build.DEVICE;
            if (str.equals("mx2")) {
                return true;
            }
            if (!str.equals("mx")) {
                str.equals("m9");
            }
            return false;
        }
    }

    public static void hideMeizuSmartBar(Activity activity, View view) {
        if (hasSmartBar() && activity.getResources().getConfiguration().orientation != 2) {
            activity.getWindow().setFlags(1024, 1024);
            activity.getWindow().addFlags(2048);
            view.setPadding(0, getStatusBarHeight(activity), 0, 0);
        }
    }
}
