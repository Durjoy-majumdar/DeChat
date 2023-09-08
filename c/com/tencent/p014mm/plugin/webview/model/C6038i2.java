package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.webview.model.i2 */
public class C6038i2 {

    /* renamed from: a */
    public static Map<String, String> f22316a = new HashMap();

    /* renamed from: a */
    public static void m5917a(String str, String str2) {
        Log.m105925i("MicroMsg.WebviewSharedUrlCache", "rawurl:[%s], shareUrl:[%s]", str, str2);
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            Log.m105920e("MicroMsg.WebviewSharedUrlCache", "rawurl is null or share url is null");
        } else if (((HashMap) f22316a).containsKey(str)) {
            Log.m105924i("MicroMsg.WebviewSharedUrlCache", "has add this rawurl");
        } else {
            ((HashMap) f22316a).put(str, str2);
        }
    }

    /* renamed from: b */
    public static String m5918b(String str) {
        Log.m105925i("MicroMsg.WebviewSharedUrlCache", "rawUrl:[%s]", str);
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.WebviewSharedUrlCache", "rawUrl is null");
            return null;
        }
        String str2 = (String) ((HashMap) f22316a).get(str);
        if (Util.isNullOrNil(str2)) {
            int indexOf = str.indexOf("#");
            str2 = (String) ((HashMap) f22316a).get(indexOf < 0 ? str : str.substring(0, indexOf));
        }
        if (Util.isNullOrNil(str2)) {
            if (str.startsWith(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/")) {
                str2 = (String) ((HashMap) f22316a).get(str.replaceFirst(HttpWrapperBase.PROTOCAL_HTTPS, HttpWrapperBase.PROTOCAL_HTTP));
            }
        }
        return Util.isNullOrNil(str2) ? str : str2;
    }
}
