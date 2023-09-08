package com.tencent.p014mm.plugin.webview.modeltools;

import android.net.Uri;
import android.webkit.CookieManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.o */
public final class C43757o {

    /* renamed from: a */
    public static ArrayList<String> f118236a;

    /* renamed from: a */
    public static void m47604a(List<String> list) {
        String str;
        CookieManager instance = CookieManager.getInstance();
        for (String next : list) {
            Log.m105925i("MicroMsg.WebView.SysWebViewDataCleanHelper", "cookies cleanup: url(%s)", next);
            String cookie = instance.getCookie(next);
            LinkedList<String> linkedList = null;
            if (!Util.isNullOrNil(cookie)) {
                String[] split = cookie.split(";");
                int length = split.length;
                for (int i = 0; i < length; i++) {
                    split[i] = split[i].trim();
                }
                LinkedList linkedList2 = new LinkedList();
                for (String str2 : split) {
                    if (!Util.isNullOrNil(str2) && str2.contains("=")) {
                        linkedList2.add(str2.split("=")[0]);
                    }
                }
                if (!linkedList2.isEmpty()) {
                    linkedList = linkedList2;
                }
            }
            if (!Util.isNullOrNil((List) linkedList)) {
                String host = Uri.parse(next).getHost();
                String[] split2 = host.split("\\.");
                if (split2.length <= 1) {
                    str = "";
                } else {
                    str = split2[split2.length - 2] + "." + split2[split2.length - 1];
                }
                Log.m105919d("MicroMsg.WebView.SysWebViewDataCleanHelper", "host(%s)", host);
                Log.m105919d("MicroMsg.WebView.SysWebViewDataCleanHelper", "domain(%s)", str);
                for (String str3 : linkedList) {
                    if (!Util.isNullOrNil(str3)) {
                        instance.setCookie(next, str3 + "=");
                        instance.setCookie(next, str3 + "=;path=/");
                        if (!Util.isNullOrNil(str)) {
                            instance.setCookie(str, str3 + "=;domain=." + str + ";path=/");
                        }
                    }
                }
            }
        }
    }
}
