package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.t1 */
public class C82484t1 extends C82430g {
    /* renamed from: b */
    public C82446i mo114803b(C82381f fVar, String str, JSONObject jSONObject) {
        C81410b0 unlink = fVar.getFileSystem().unlink(str);
        int ordinal = unlink.ordinal();
        if (ordinal == 0) {
            return new C82446i("ok", new Object[0]);
        }
        if (ordinal == 4) {
            return new C82446i("fail permission denied, open \"%s\"", str);
        } else if (ordinal == 6) {
            return new C82446i("fail no such file or directory \"%s\"", str);
        } else if (ordinal != 9) {
            return new C82446i("fail " + unlink.name(), new Object[0]);
        } else {
            return new C82446i("fail operation not permitted, unlink \"%s\"", str);
        }
    }
}
