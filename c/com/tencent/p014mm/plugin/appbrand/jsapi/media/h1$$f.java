package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import a70.C112760b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import ck0.C92423c;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import fl0.C86920e;
import fl0.C86921f;
import java.io.InputStream;
import js0.C9514m;
import p1016ob.C89131a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.h1$$f */
public class h1$$f implements h1$$e {
    public h1$$f(C1736i1 i1Var) {
    }

    /* renamed from: a */
    public h1$$c mo1723a(C82381f fVar, String str, int i, int i2, int i3) {
        if (fVar == null || !(fVar instanceof C81925i2)) {
            Log.m105928w("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:not in service context");
            return new h1$$c(false, "fail:internal error invalid js component", C86920e.f252314d);
        }
        C81415h0 fileSystem = fVar.getFileSystem();
        if (fileSystem == null) {
            Log.m105928w("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:runtime fileSystem is null");
            return new h1$$c(false, "fail:runtime fileSystem is null", C86920e.f252314d);
        }
        InputStream m = C81247g3.m99557m(((C81925i2) fVar).getRuntime(), str);
        if (m == null) {
            Log.m105928w("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:file doesn't exist");
            return new h1$$c(false, "fail:file doesn't exist", C86921f.f252327a);
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            C1737l0 l0Var = (C1737l0) fVar.mo109668l(C1737l0.class);
            if (l0Var == null) {
                l0Var = C1737l0.f11455j0;
            }
            Bitmap jg = l0Var.mo1726jg(m, (Rect) null, options);
            if (jg == null) {
                Log.m105920e("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:decode image fail");
                return new h1$$c(false, "fail:decode image fail", C86921f.f252328b);
            }
            Bitmap w = C1734h1.m1786w(jg, (float) i2, (float) i3);
            String str2 = C89131a.m111396d(options) ? "jpg" : "png";
            String str3 = C112760b.m154203K() + "microMsg.tmp." + System.currentTimeMillis() + "." + str2;
            BitmapUtil.saveBitmapToImage(w, i, C89131a.m111396d(options) ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, str3, true);
            if (C89131a.m111396d(options)) {
                C92423c.m116248a(m, str3);
            }
            C9514m mVar = new C9514m();
            if (fileSystem.createTempFileFrom(new C86009m1(str3), str2, false, mVar) != C81410b0.OK) {
                Log.m105928w("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:create tmp file fail");
                return new h1$$c(false, "fail:create tmp file fail", C86921f.f252329c);
            }
            Log.m105925i("MicroMsg.JsApiCompressImage.javayhu", "compressImage ok, dstPath:%s, tmpPath:%s", str3, mVar.f29691a);
            return new h1$$c(true, (String) mVar.f29691a, C86920e.f252311a);
        } catch (OutOfMemoryError e) {
            Log.m105921e("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:compress image OOM", e);
            return new h1$$c(false, "fail:compress image OOM", C86920e.f252325o);
        } catch (NullPointerException e2) {
            Log.m105921e("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:compress image NPE", e2);
            return new h1$$c(false, "fail:compress image NPE", C86921f.f252330d);
        } catch (Exception e3) {
            Log.m105921e("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:compress image exception:%s", e3);
            C86013q1.m106447h((String) null);
            return new h1$$c(false, "fail:compress image exception", C86921f.f252330d);
        }
    }
}
