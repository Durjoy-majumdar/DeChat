package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.l1 */
public class C82457l1 extends C82430g {
    /* renamed from: b */
    public C82446i mo114803b(C82381f fVar, String str, JSONObject jSONObject) {
        C81410b0 isdir = fVar.getFileSystem().isdir(str);
        int ordinal = isdir.ordinal();
        boolean z = true;
        if (ordinal != 0) {
            if (ordinal == 6) {
                return new C82446i("fail no such file or directory \"%s\"", str);
            } else if (ordinal != 8) {
                return new C82446i("fail " + isdir.name(), new Object[0]);
            }
        }
        C82446i iVar = new C82446i("ok", new Object[0]);
        if (isdir != C81410b0.OK) {
            z = false;
        }
        ((HashMap) iVar.f242316a).put("result", Boolean.valueOf(z));
        return iVar;
    }
}
