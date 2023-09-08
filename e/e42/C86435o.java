package e42;

import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81461w;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;
import js0.C9514m;

/* renamed from: e42.o */
public final class C86435o extends C81461w {

    /* renamed from: d */
    public final C40427l0 f251230d;

    public C86435o(C40427l0 l0Var) {
        C87412m.m108594g(l0Var, "pkg");
        this.f251230d = l0Var;
    }

    public boolean accept(String str) {
        C81410b0 b0Var = C81410b0.OK;
        C40427l0 l0Var = this.f251230d;
        if (str == null) {
            str = "";
        }
        Map<String, Long> map = C81291m0.f238702a;
        C87412m.m108594g(l0Var, "<this>");
        return (l0Var.openReadPartialInfo(str) != null ? b0Var : C81410b0.RET_NOT_EXISTS) == b0Var;
    }

    public C81410b0 access(String str) {
        C87412m.m108594g(str, "url");
        Log.m105924i("MicroMsg.MBAssetPkgFileSystem", "access");
        C40427l0 l0Var = this.f251230d;
        Map<String, Long> map = C81291m0.f238702a;
        C87412m.m108594g(l0Var, "<this>");
        return l0Var.openReadPartialInfo(str) != null ? C81410b0.OK : C81410b0.RET_NOT_EXISTS;
    }

    public C81410b0 readFile(String str, C9514m<ByteBuffer> mVar) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(mVar, "pByteBuffer");
        Log.m105924i("MicroMsg.MBAssetPkgFileSystem", "read File,url:" + str);
        return C81291m0.m99668d(this.f251230d, str, mVar);
    }

    public InputStream readStream(String str) {
        C87412m.m108594g(str, "url");
        Log.m105924i("MicroMsg.MBAssetPkgFileSystem", "read readStream,url:" + str);
        return this.f251230d.mo63188a(str);
    }

    public C81410b0 readFile(String str, long j, long j2, C9514m<ByteBuffer> mVar) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(mVar, "pByteBuffer");
        Log.m105924i("MicroMsg.MBAssetPkgFileSystem", "read File,url:" + str + ",position:" + j + ",length:" + j2);
        return C81291m0.m99667c(this.f251230d, str, j, j2, mVar);
    }
}
