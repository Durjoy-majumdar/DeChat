package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.webview.model.f2 */
public class C6032f2 {
    /* renamed from: a */
    public static String m5914a(String str) {
        Log.m105925i("MicroMsg.WebviewJSSDKConstants", "genLocalIdByFilePath, file path is ：%s", str);
        if (Util.isNullOrNil(str)) {
            return null;
        }
        String str2 = "weixin://resourceid/" + MD5Util.getMD5String(str);
        Log.m105925i("MicroMsg.WebviewJSSDKConstants", "gen local id by filepath, filepath : %s, localid : %s", str, str2);
        return str2;
    }
}
