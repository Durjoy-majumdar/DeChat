package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.InputStream;
import java.io.OutputStream;
import p823sg.C48377f;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.h1 */
public final class C81257h1 {
    /* renamed from: a */
    public static String m99577a(WxaPkg wxaPkg, String str) {
        if (wxaPkg == null || Util.isNullOrNil(str)) {
            return null;
        }
        wxaPkg.mo63189b();
        InputStream a = wxaPkg.mo63188a(str);
        if (a == null) {
            return null;
        }
        try {
            a.mark(a.available());
            String b = C90193h.m112874b(a, 4096);
            a.reset();
            C86009m1 m1Var = new C86009m1(wxaPkg.mo63190c() + "_xdir" + "/" + str);
            C86009m1 l = m1Var.mo119974l();
            if (l.mo119967g() && l.mo119978p()) {
                l.mo119966f();
            }
            l.mo119987x();
            if (!b.equals(C86013q1.m106456q(m1Var.mo119976n()))) {
                if (m1Var.mo119977o()) {
                    Runtime runtime = Runtime.getRuntime();
                    runtime.exec("rm -r " + m1Var.mo119971i());
                } else {
                    m1Var.mo119966f();
                }
                OutputStream H = C86013q1.m106426H(m1Var);
                C48377f.m53722a(a, H);
                Util.qualityClose(H);
            }
            return m1Var.mo119971i();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrand.PkgPartialCopy", e, "copy failed", new Object[0]);
            return null;
        } finally {
            Util.qualityClose(a);
        }
    }
}
