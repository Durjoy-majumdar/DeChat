package com.tencent.live2.jsplugin;

import android.text.TextUtils;
import com.tencent.liteav.base.util.LiteavLog;

public class LiveURLParser {
    private static final String TAG = "LiveURLParser";

    public static String getStreamId(String str) {
        int i;
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            int lastIndexOf = str.lastIndexOf("/");
            int indexOf = str.contains("?") ? str.indexOf("?") : str.length();
            if (!(lastIndexOf == -1 || indexOf == -1 || indexOf <= (i = lastIndexOf + 1))) {
                return str.substring(i, indexOf);
            }
            return "";
        } catch (Exception unused) {
            LiteavLog.m16898e(TAG, "getStreamId fail, url:".concat(String.valueOf(str)));
        }
    }

    public static String getURLParams(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String[] split = str.split("\\?");
            if (split.length < 2) {
                return "";
            }
            for (String str3 : split[1].split("&")) {
                if (str3.indexOf("=") > 0) {
                    String substring = str3.substring(0, str3.indexOf("="));
                    String substring2 = str3.substring(str3.indexOf("=") + 1);
                    if (substring.equalsIgnoreCase(str2)) {
                        return substring2;
                    }
                }
            }
        }
        return "";
    }
}
