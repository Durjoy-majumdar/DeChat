package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83176n;
import com.tencent.p014mm.plugin.appbrand.utils.C84751i1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.y6 */
public class C83133y6 {
    /* renamed from: a */
    public static void m101968a(C40482o oVar, String str, String str2, int i) {
        C83176n nVar;
        if (!(oVar instanceof C83165i) || (nVar = (C83176n) ((C83165i) oVar).mo63321n0(C83176n.class)) == null) {
            oVar.evaluateJavascript(m101970c(C84751i1.m104412a(str), str2, i), (ValueCallback<String>) null);
            return;
        }
        if (Util.isNullOrNil(str2)) {
            str2 = "{}";
        }
        nVar.mo115413h0(str, str2, i, m101969b());
    }

    /* renamed from: b */
    public static String m101969b() {
        try {
            return new JSONObject().put("nativeTime", System.currentTimeMillis()).toString();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsScriptEvaluator", "makeExtStatJson e = %s", e);
            return "{}";
        }
    }

    /* renamed from: c */
    public static String m101970c(String str, String str2, int i) {
        String str3;
        if (Util.isNullOrNil(str2)) {
            str2 = "{}";
        }
        try {
            Locale locale = Locale.ENGLISH;
            Object[] objArr = new Object[4];
            objArr[0] = str;
            objArr[1] = str2;
            if (i == 0) {
                str3 = "undefined";
            } else {
                str3 = i + "";
            }
            objArr[2] = str3;
            objArr[3] = m101969b();
            return String.format(locale, "WeixinJSCoreAndroid.subscribeHandler(\"%s\", %s, %s, %s)", objArr);
        } catch (OutOfMemoryError e) {
            String format = String.format(Locale.ENGLISH, "oom:%s, event:%s, data.size:%d", new Object[]{e.getMessage(), str, Integer.valueOf(Util.nullAsNil(str2).length())});
            Log.m105921e("MicroMsg.JsScriptEvaluator", "message:%s", format);
            throw new OutOfMemoryError(format);
        }
    }
}
