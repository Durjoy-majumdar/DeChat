package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import java.nio.ByteBuffer;
import java.util.Locale;
import js0.C9514m;
import org.json.JSONObject;
import p225rc.C89912a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.k1 */
public final class C82454k1 extends C82430g {
    /* renamed from: b */
    public C82446i mo114803b(C82381f fVar, String str, JSONObject jSONObject) {
        C81410b0 b0Var;
        String optString = jSONObject.optString("destPath");
        Locale locale = Locale.US;
        String format = String.format(locale, "fail no such file or directory, copyFile \"%s\" -> \"%s\"", new Object[]{str, optString});
        String format2 = String.format(locale, "fail permission denied, copyFile \"%s\" -> \"%s\"", new Object[]{str, optString});
        C86009m1 absoluteFile = fVar.getFileSystem().getAbsoluteFile(str);
        boolean canSaveToLocal = fVar.getFileSystem().canSaveToLocal(str);
        if (absoluteFile == null || !absoluteFile.mo119967g() || !absoluteFile.mo119978p()) {
            if (!canSaveToLocal) {
                return new C82446i(format2, new Object[0]);
            }
            C9514m mVar = new C9514m();
            fVar.getFileSystem().readFile(str, mVar);
            if (mVar.f29691a == null) {
                return new C82446i(format, new Object[0]);
            }
            C89912a aVar = new C89912a((ByteBuffer) mVar.f29691a);
            b0Var = fVar.getFileSystem().writeFile(optString, aVar, false);
            Util.qualityClose(aVar);
        } else if (C81412d0.m99867a(absoluteFile)) {
            return new C82446i("fail \"%s\" not a regular file", str);
        } else {
            b0Var = fVar.getFileSystem().copyTo(optString, absoluteFile, false);
        }
        int ordinal = b0Var.ordinal();
        if (ordinal == 0) {
            return new C82446i("ok", new Object[0]);
        }
        if (ordinal == 10) {
            return new C82446i("fail \"%s\" is not a regular file", optString);
        } else if (ordinal == 15) {
            return new C82446i("fail the maximum size of the file storage limit is exceeded", new Object[0]);
        } else {
            if (ordinal == 2) {
                return new C82446i("fail sdcard not mounted", new Object[0]);
            }
            if (ordinal == 3) {
                return new C82446i(format, new Object[0]);
            }
            if (ordinal == 4) {
                return new C82446i(format2, new Object[0]);
            }
            if (ordinal != 5) {
                return new C82446i("fail " + b0Var.name(), new Object[0]);
            }
            return new C82446i("fail illegal operation on a directory, open \"%s\"", optString);
        }
    }

    /* renamed from: c */
    public String mo114812c(JSONObject jSONObject) {
        return jSONObject.optString("srcPath");
    }
}
