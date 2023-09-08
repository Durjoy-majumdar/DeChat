package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.vfs.C86009m1;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.q1 */
public final class C82472q1 extends C82430g {
    /* renamed from: b */
    public C82446i mo114803b(C82381f fVar, String str, JSONObject jSONObject) {
        C81415h0 fileSystem = fVar.getFileSystem();
        if (fileSystem == null) {
            return new C82446i("fail:internal error", new Object[0]);
        }
        String optString = jSONObject.optString("newPath");
        Locale locale = Locale.US;
        String format = String.format(locale, "fail no such file or directory, rename \"%s\" -> \"%s\"", new Object[]{str, optString});
        String format2 = String.format(locale, "fail permission denied, rename \"%s\" -> \"%s\"", new Object[]{str, optString});
        if (!fileSystem.canRenameFile(str)) {
            return new C82446i(format2, new Object[0]);
        }
        C86009m1 absoluteFile = fVar.getFileSystem().getAbsoluteFile(str, true);
        if (absoluteFile == null || !absoluteFile.mo119967g()) {
            return new C82446i(format, new Object[0]);
        }
        if (C81412d0.m99867a(absoluteFile)) {
            return new C82446i("fail \"%s\" not a regular file", str);
        }
        C81410b0 copyTo = fVar.getFileSystem().copyTo(optString, absoluteFile, true);
        int ordinal = copyTo.ordinal();
        if (ordinal == 0) {
            return new C82446i("ok", new Object[0]);
        }
        if (ordinal == 2) {
            return new C82446i("fail sdcard not mounted", new Object[0]);
        }
        if (ordinal == 3) {
            return new C82446i(format, new Object[0]);
        }
        if (ordinal == 4) {
            return new C82446i(format2, new Object[0]);
        }
        return new C82446i("fail " + copyTo.name(), new Object[0]);
    }

    /* renamed from: c */
    public String mo114812c(JSONObject jSONObject) {
        return jSONObject.optString("oldPath");
    }
}
