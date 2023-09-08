package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.util.Base64;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import p170ic.C87687a;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.d */
public final class C6222d extends C15053a {

    /* renamed from: d */
    public static final C6222d f22950d;

    /* renamed from: e */
    public static final int f22951e = 479;

    /* renamed from: f */
    public static final String f22952f = "getPackagesResource";

    /* renamed from: g */
    public static final String f22953g = (VFSStrategy.m163776d("luckymoney") + XVFSFile.SEPARATOR_CHAR);

    /* renamed from: h */
    public static final String f22954h = "23000/wxpaylibpag.wasm";

    static {
        C6222d dVar = new C6222d();
        f22950d = dVar;
        C87687a.m109085a(dVar);
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        String str;
        byte[] O;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105924i("MicroMsg.JsApiGetPackagesResource", "handled, params: " + h1Var.f38983a);
        Object obj = h1Var.f38983a.get("fromLocale");
        String obj2 = obj != null ? obj.toString() : null;
        Object obj3 = h1Var.f38983a.get("subtype");
        String obj4 = obj3 != null ? obj3.toString() : null;
        Object obj5 = h1Var.f38983a.get(FFmpegMetadataRetriever.METADATA_KEY_FILENAME);
        String obj6 = obj5 != null ? obj5.toString() : null;
        Log.m105919d("MicroMsg.JsApiGetPackagesResource", "getPagFromFile，subtype：%s，filename：%s，getSDK：%s", obj4, obj6, obj2);
        if ((obj2 == null || obj2.length() == 0) || !C87412m.m108589b("true", obj2)) {
            if (!(obj4 == null || obj4.length() == 0)) {
                if (!(obj6 == null || obj6.length() == 0)) {
                    str = f22953g + obj4 + XVFSFile.SEPARATOR_CHAR + obj6;
                }
            }
            Log.m105924i("MicroMsg.JsApiGetPackagesResource", "fail：subtype.isNullOrEmpty() || filename.isNullOrEmpty()");
            jVar.f39001d.mo10774a(h1Var.f38990c, f22952f + ":fail invalid subtype or filename", (Map<String, Object>) null);
            return true;
        }
        str = f22953g + f22954h;
        long l = C86013q1.m106451l(str);
        Log.m105924i("MicroMsg.JsApiGetPackagesResource", "getPagFromFile，path：" + str + " fileLength： " + l);
        if (l <= 0 || l >= 4194304 || (O = C86013q1.m106433O(str, 0, -1)) == null) {
            Log.m105924i("MicroMsg.JsApiGetPackagesResource", "fail：no file");
            jVar.f39001d.mo10774a(h1Var.f38990c, f22952f + ":fail no file", (Map<String, Object>) null);
            return true;
        }
        HashMap hashMap = new HashMap();
        String encodeToString = Base64.encodeToString(O, 0);
        C87412m.m108593f(encodeToString, "encodeToString(buff, Base64.DEFAULT)");
        hashMap.put("file", encodeToString);
        Log.m105924i("MicroMsg.JsApiGetPackagesResource", "success：get file");
        jVar.f39001d.mo10774a(h1Var.f38990c, f22952f + ":ok", hashMap);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f22951e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f22952f;
    }
}
