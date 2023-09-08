package wd3;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.InputStream;
import java.net.HttpURLConnection;
import jc0.C21210b;

/* renamed from: wd3.k */
public final class C22900k {

    /* renamed from: a */
    public static final C22900k f65834a = new C22900k();

    /* renamed from: a */
    public final C21210b mo36077a(String str, boolean z, C22902m mVar) {
        C87412m.m108594g(str, "url");
        C22901l lVar = new C22901l(str, z, mVar);
        try {
            HttpURLConnection e = lVar.mo36082e();
            int d = lVar.mo36081d();
            HttpURLConnection httpURLConnection = lVar.f65835a;
            InputStream inputStream = httpURLConnection != null ? httpURLConnection.getInputStream() : null;
            if (d >= 300) {
                lVar.mo36078a(inputStream);
                lVar.mo36079b();
                Log.m105929w("MicroMsg.BizImageHttpClientFactory", "httpURLConnectionGet responseCode: %d", Integer.valueOf(d));
                lVar.mo36083f(d);
                return null;
            }
            C21210b c = lVar.mo36080c(inputStream);
            lVar.mo36078a(inputStream);
            lVar.mo36079b();
            lVar.mo36084g(c);
            return c;
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.BizImageHttpClientFactory", e2, "alvinluo httpURLConnectionGet exception: ", new Object[0]);
            lVar.mo36083f(-1);
            return null;
        }
    }
}
