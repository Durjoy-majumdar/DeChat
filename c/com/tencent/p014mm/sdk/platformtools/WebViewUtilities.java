package com.tencent.p014mm.sdk.platformtools;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: com.tencent.mm.sdk.platformtools.WebViewUtilities */
public class WebViewUtilities {
    private static final String TAG = "MicroMsg.WebViewUtilities";

    public static String doUrlEncode(String str) {
        if (!Util.isNullOrNil(str)) {
            try {
                return URLEncoder.encode(str, "utf-8");
            } catch (UnsupportedEncodingException e) {
                Log.m105921e(TAG, "URLEncode fail, throw : %s", e.getMessage());
            }
        }
        return str;
    }
}
