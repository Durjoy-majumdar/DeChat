package p000ag;

import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81461w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.nio.ByteBuffer;
import js0.C9514m;

/* renamed from: ag.c */
public final class C79535c extends C81461w {

    /* renamed from: d */
    public C40427l0 f233186d;

    /* renamed from: b */
    public final C40427l0 mo109574b() {
        C29315z2 b = C27884e.f77039a.mo55661b();
        if (b == null) {
            Log.m105924i("MagicPlayablePackageManager", "record null");
            return null;
        }
        String str = b.field_pkgPath;
        Log.m105924i("MagicPlayablePackageManager", "pkgPath:" + str);
        if (!C86013q1.m106450k(str)) {
            return null;
        }
        WxaPkg wxaPkg = new WxaPkg(str);
        wxaPkg.mo63189b();
        this.f233186d = wxaPkg;
        return wxaPkg;
    }

    public C81410b0 readFile(String str, long j, long j2, C9514m<ByteBuffer> mVar) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(mVar, "pByteBuffer");
        C40427l0 l0Var = this.f233186d;
        if (l0Var != null) {
            return C81291m0.m99667c(l0Var, str, j, j2, mVar);
        }
        C87412m.m108603p("playablePkg");
        throw null;
    }

    public C81410b0 readFile(String str, C9514m<ByteBuffer> mVar) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(mVar, "pByteBuffer");
        C40427l0 l0Var = this.f233186d;
        if (l0Var != null) {
            return C81291m0.m99668d(l0Var, str, mVar);
        }
        C87412m.m108603p("playablePkg");
        throw null;
    }
}
