package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import p206nj.C117627q;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.c4 */
public class C6221c4 {
    /* renamed from: a */
    public static String m6514a(C13851h1 h1Var, String str) {
        Map<String, Object> map = h1Var.f38995h;
        return (map == null || !((HashMap) map).containsKey(str)) ? "" : String.valueOf(((HashMap) h1Var.f38995h).get(str));
    }

    /* renamed from: b */
    public static String m6515b(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        try {
            return Util.nullAsNil(C117627q.m165908a(str));
        } catch (Exception unused) {
            return "";
        }
    }
}
