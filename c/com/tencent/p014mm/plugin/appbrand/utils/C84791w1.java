package com.tencent.p014mm.plugin.appbrand.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import js0.C9514m;
import p823sg.C48377f;
import s24.C90124b;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.w1 */
public class C84791w1 {
    /* renamed from: a */
    public static String m104471a(AppBrandRuntimeWC appBrandRuntimeWC, String str, String str2) {
        Uri parse = Uri.parse(str2);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(MMApplicationContext.getContext().getContentResolver().openInputStream(parse));
            OutputStream outputStream = null;
            try {
                String c = C90124b.m112768c(parse.getPath());
                if (TextUtils.isEmpty(c)) {
                    c = "";
                }
                if (!TextUtils.isEmpty(c) && !c.startsWith(".")) {
                    c = "." + c;
                }
                String i = new C86009m1(str, "opensdkfile_" + System.currentTimeMillis() + c).mo119971i();
                C86009m1 m1Var = new C86009m1(i);
                C86013q1.m106461v(m1Var.mo119973k());
                try {
                    outputStream = C86013q1.m106426H(m1Var);
                    C48377f.m53722a(bufferedInputStream, outputStream);
                    C9514m mVar = new C9514m();
                    ((C82419d1) appBrandRuntimeWC.f238163z).createTempFileFrom(new C86009m1(i), c, true, mVar);
                    return (String) mVar.f29691a;
                } catch (FileNotFoundException e) {
                    Log.printErrStackTrace("MicroMsg.OpenSdkJsApiProcessor", e, "", new Object[0]);
                    Util.qualityClose(bufferedInputStream);
                    Util.qualityClose(outputStream);
                    return "";
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.OpenSdkJsApiProcessor", e2, "", new Object[0]);
                return "";
            } finally {
                Util.qualityClose(bufferedInputStream);
                Util.qualityClose(outputStream);
            }
        } catch (Exception e3) {
            Log.printErrStackTrace("MicroMsg.OpenSdkJsApiProcessor", e3, "", new Object[0]);
            return "";
        }
    }
}
