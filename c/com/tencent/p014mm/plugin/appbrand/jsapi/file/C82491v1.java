package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82432h;
import com.tencent.p014mm.plugin.appbrand.utils.C84782s1;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.json.JSONObject;
import p225rc.C89912a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.v1 */
public class C82491v1 extends C82430g {
    /* renamed from: b */
    public C82446i mo114803b(C82381f fVar, String str, JSONObject jSONObject) {
        InputStream inputStream;
        C82432h hVar;
        boolean optBoolean = jSONObject.optBoolean("append", false);
        String optString = jSONObject.optString("encoding");
        C84782s1.m104462c(fVar.getJsRuntime(), (C82870p) null, jSONObject, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class));
        Object opt = jSONObject.opt("data");
        if (opt instanceof String) {
            if (Util.isNullOrNil(optString)) {
                hVar = (C82432h) ((HashMap) C82432h.C82433a.f241519a).get("utf8");
            } else {
                hVar = (C82432h) ((HashMap) C82432h.C82433a.f241519a).get(optString.toLowerCase());
                if (hVar == null) {
                    return new C82446i("fail invalid encoding", new Object[0]);
                }
            }
            try {
                inputStream = new C89912a(hVar.mo114813a((String) opt));
            } catch (Exception e) {
                return new C82446i("fail " + e.getMessage(), new Object[0]);
            }
        } else if (opt instanceof ByteBuffer) {
            inputStream = new C89912a((ByteBuffer) opt);
        } else if (opt != null) {
            return new C82446i("fail invalid data", new Object[0]);
        } else {
            if (optBoolean) {
                return new C82446i("ok", new Object[0]);
            }
            inputStream = new ByteArrayInputStream(new byte[0]);
        }
        C81410b0 writeFile = fVar.getFileSystem().writeFile(str, inputStream, optBoolean);
        int ordinal = writeFile.ordinal();
        if (ordinal == 0) {
            return new C82446i("ok", new Object[0]);
        }
        if (ordinal == 10) {
            return new C82446i("fail \"%s\" is not a regular file", str);
        } else if (ordinal == 15) {
            return new C82446i("fail the maximum size of the file storage limit is exceeded", new Object[0]);
        } else {
            if (ordinal == 3) {
                return new C82446i("fail no such file or directory, open \"%s\"", str);
            } else if (ordinal == 4) {
                return new C82446i("fail permission denied, open \"%s\"", str);
            } else if (ordinal == 5) {
                return new C82446i("fail illegal operation on a directory, open \"%s\"", str);
            } else if (ordinal != 6) {
                return new C82446i("fail " + writeFile.name(), new Object[0]);
            } else {
                return new C82446i("fail no such file \"%s\"", str);
            }
        }
    }
}
