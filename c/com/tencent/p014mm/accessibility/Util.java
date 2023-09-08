package com.tencent.p014mm.accessibility;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.View;
import com.eclipsesource.mmv8.Platform;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: com.tencent.mm.accessibility.Util */
public class Util {
    public static Activity getActivityOfView(View view) {
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static String getViewIdName(View view) {
        String str;
        if (view == null) {
            return "NO_ID";
        }
        int id = view.getId();
        StringBuilder sb = new StringBuilder(128);
        if (id != -1) {
            Resources resources = view.getResources();
            if (resourceHasPackage(id) && resources != null) {
                int i = -16777216 & id;
                if (i == 16777216) {
                    str = Platform.ANDROID;
                } else if (i != 2130706432) {
                    try {
                        str = resources.getResourcePackageName(id);
                    } catch (Throwable unused) {
                    }
                } else {
                    str = "app";
                }
                String resourceTypeName = resources.getResourceTypeName(id);
                String resourceEntryName = resources.getResourceEntryName(id);
                sb.append(" ");
                sb.append(str);
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(resourceTypeName);
                sb.append("/");
                sb.append(resourceEntryName);
            }
        }
        return sb.toString();
    }

    public static boolean resourceHasPackage(int i) {
        return (i >>> 24) != 0;
    }
}
