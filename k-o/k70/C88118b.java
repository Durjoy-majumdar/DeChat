package k70;

import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81461w;
import gy3.C87412m;
import java.nio.ByteBuffer;
import js0.C9514m;
import k70.C88119c;

/* renamed from: k70.b */
public class C88118b extends C81461w {

    /* renamed from: d */
    public final C88119c f254873d;

    public C88118b(C88119c cVar) {
        C87412m.m108594g(cVar, "selector");
        this.f254873d = cVar;
    }

    public C81410b0 access(String str) {
        C87412m.m108594g(str, "url");
        C88119c.C88122d d = this.f254873d.mo122513d(str);
        if (d == null) {
            return C81410b0.ERR_PERMISSION_DENIED;
        }
        String str2 = d.f254880b;
        C40427l0 l0Var = d.f254881c;
        C87412m.m108594g(l0Var, "<this>");
        C87412m.m108594g(str2, "path");
        return l0Var.openReadPartialInfo(str2) != null ? C81410b0.OK : C81410b0.RET_NOT_EXISTS;
    }

    public C81410b0 readFile(String str, C9514m<ByteBuffer> mVar) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(mVar, "pByteBuffer");
        C88119c.C88122d d = this.f254873d.mo122513d(str);
        if (d == null) {
            return C81410b0.ERR_PERMISSION_DENIED;
        }
        return C81291m0.m99668d(d.f254881c, d.f254880b, mVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = r0.f254881c.mo63188a(r0.f254880b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.InputStream readStream(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "url"
            gy3.C87412m.m108594g(r3, r0)
            k70.c r0 = r2.f254873d
            k70.c$d r0 = r0.mo122513d(r3)
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = r0.f254880b
            com.tencent.mm.plugin.appbrand.appcache.l0 r0 = r0.f254881c
            java.io.InputStream r0 = r0.mo63188a(r1)
            if (r0 != 0) goto L_0x001c
        L_0x0018:
            java.io.InputStream r0 = super.readStream(r3)
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k70.C88118b.readStream(java.lang.String):java.io.InputStream");
    }

    public C81410b0 readFile(String str, long j, long j2, C9514m<ByteBuffer> mVar) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(mVar, "pByteBuffer");
        C88119c.C88122d d = this.f254873d.mo122513d(str);
        if (d == null) {
            return C81410b0.ERR_PERMISSION_DENIED;
        }
        return C81291m0.m99667c(d.f254881c, d.f254880b, j, j2, mVar);
    }
}
