package os0;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.regex.Matcher;
import jn0.C87989a;
import kn0.C88230c;
import kn0.C88235m;
import p300c8.C79951n;
import z04.C66731x;

/* renamed from: os0.c */
public final class C89295c extends FilterInputStream {

    /* renamed from: e */
    public static final C32226l<String, C89295c> f257244e = C89296a.f257246d;

    /* renamed from: d */
    public final C89292a f257245d;

    /* renamed from: os0.c$a */
    public static final class C89296a extends C87413o implements C32226l<String, C89295c> {

        /* renamed from: d */
        public static final C89296a f257246d = new C89296a();

        public C89296a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "src");
            Uri parse = Uri.parse(str);
            C89292a aVar = new C89292a(MMApplicationContext.getContext(), C88235m.f255053a, C89293b.f257243r.createDataSource(), (C79951n) null, 8, (C8480h) null);
            C87412m.m108593f(parse, "uri");
            return new C89295c(aVar, new C87989a(aVar, parse, (InputStream) null, 4, (C8480h) null), (C8480h) null);
        }
    }

    public C89295c(C89292a aVar, InputStream inputStream, C8480h hVar) {
        super(inputStream);
        this.f257245d = aVar;
    }

    /* renamed from: a */
    public final String mo123635a() {
        HttpURLConnection httpURLConnection = this.f257245d.f257241a.f234209i;
        String headerField = httpURLConnection != null ? httpURLConnection.getHeaderField("Content-Type") : null;
        Log.m105924i("MicroMsg.AppBrand.FinalUrlAccessibleHttpDataSource", "getContentType, contentType: " + headerField);
        return headerField;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.getURL();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo123636b() {
        /*
            r3 = this;
            os0.a r0 = r3.f257245d
            os0.b r0 = r0.f257241a
            java.net.HttpURLConnection r0 = r0.f234209i
            if (r0 == 0) goto L_0x0013
            java.net.URL r0 = r0.getURL()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r0.toString()
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getFinalUrl, finalUrl: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.AppBrand.FinalUrlAccessibleHttpDataSource"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: os0.C89295c.mo123636b():java.lang.String");
    }

    /* renamed from: c */
    public final Long mo123637c() {
        HttpURLConnection httpURLConnection = this.f257245d.f257241a.f234209i;
        Long l = null;
        String headerField = httpURLConnection != null ? httpURLConnection.getHeaderField("Content-Range") : null;
        Log.m105924i("MicroMsg.AppBrand.FinalUrlAccessibleHttpDataSource", "getTotalContentLength, contentRange: " + headerField);
        if (headerField != null) {
            Matcher matcher = C88230c.f255043a.matcher(headerField);
            if (matcher.matches() && 3 == matcher.groupCount()) {
                String group = matcher.group(3);
                if (group != null) {
                    l = C66731x.m78732f(group);
                }
                Log.m105924i("MicroMsg.AppBrand.FinalUrlAccessibleHttpDataSource", "getTotalContentLength, totalContentLength: " + l);
            }
        }
        return l;
    }

    /* renamed from: d */
    public final String mo123638d() {
        HttpURLConnection httpURLConnection = this.f257245d.f257241a.f234209i;
        String headerField = httpURLConnection != null ? httpURLConnection.getHeaderField("Transfer-Encoding") : null;
        Log.m105924i("MicroMsg.AppBrand.FinalUrlAccessibleHttpDataSource", "getTransferEncoding, transferEncoding: " + headerField);
        return headerField;
    }
}
