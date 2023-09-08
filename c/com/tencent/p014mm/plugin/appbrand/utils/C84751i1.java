package com.tencent.p014mm.plugin.appbrand.utils;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.i1 */
public class C84751i1 {

    /* renamed from: a */
    public static final String[][] f247166a = {new String[]{"\\", "\\\\"}, new String[]{"'", "\\'"}, new String[]{FastJsonResponse.QUOTE, "\\\""}, new String[]{"\n", "\\n"}, new String[]{"\t", "\\t"}, new String[]{"\b", "\\b"}, new String[]{"\f", "\\f"}, new String[]{"\r", "\\r"}, new String[]{" ", "\\u2028"}, new String[]{" ", "\\u2029"}};

    /* renamed from: a */
    public static String m104412a(String str) {
        if (Util.isNullOrNil(str)) {
            return str;
        }
        String[][] strArr = f247166a;
        for (int i = 0; i < 10; i++) {
            String[] strArr2 = strArr[i];
            str = str.replace(strArr2[0], strArr2[1]);
        }
        return str;
    }
}
