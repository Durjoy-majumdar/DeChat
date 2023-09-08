package pl1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import o60.C100284b;
import rx3.C13598b0;
import t60.C101725g;
import up1.C27696y;
import w60.C102352d;
import x60.C102564a;

/* renamed from: pl1.a0 */
public final class C100800a0 extends C100284b<C100810g0> {

    /* renamed from: pl1.a0$a */
    public static final class C100801a {

        /* renamed from: a */
        public static final C100801a f295277a = new C100801a();

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0077 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final w60.C102352d mo140263a(java.lang.String r9) {
            /*
                r8 = this;
                java.lang.String r0 = "reDirector error [httpURLConnectionGet "
                java.lang.String r1 = "url"
                gy3.C87412m.m108594g(r9, r1)
                java.net.HttpURLConnection r9 = r8.mo140264b(r9)
                int r1 = r9.getResponseCode()
                r2 = 300(0x12c, float:4.2E-43)
                if (r1 < r2) goto L_0x0093
                r9.disconnect()
                java.lang.String r3 = "Finder.ImageDownloader"
                r4 = 0
                if (r1 == r2) goto L_0x0030
                r5 = 301(0x12d, float:4.22E-43)
                if (r1 == r5) goto L_0x0030
                r5 = 302(0x12e, float:4.23E-43)
                if (r1 == r5) goto L_0x0030
                r5 = 303(0x12f, float:4.25E-43)
                if (r1 != r5) goto L_0x002a
                goto L_0x0030
            L_0x002a:
                java.lang.String r9 = "dz[httpURLConnectionGet 300]"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r9)
                return r4
            L_0x0030:
                java.lang.String r5 = "location"
                java.lang.String r5 = r9.getHeaderField(r5)     // Catch:{ Exception -> 0x0078 }
                if (r5 == 0) goto L_0x0074
                int r6 = r5.length()     // Catch:{ Exception -> 0x0078 }
                r7 = 1
                if (r6 != 0) goto L_0x0042
                r6 = 1
                goto L_0x0043
            L_0x0042:
                r6 = 0
            L_0x0043:
                r6 = r6 ^ r7
                if (r6 == 0) goto L_0x0047
                goto L_0x0048
            L_0x0047:
                r5 = r4
            L_0x0048:
                if (r5 == 0) goto L_0x0074
                pl1.a0$a r9 = f295277a     // Catch:{ Exception -> 0x0078 }
                java.net.HttpURLConnection r9 = r9.mo140264b(r5)     // Catch:{ Exception -> 0x0078 }
                int r1 = r9.getResponseCode()     // Catch:{ Exception -> 0x0078 }
                if (r1 < r2) goto L_0x0071
                r9.disconnect()     // Catch:{ Exception -> 0x0078 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0078 }
                r9.<init>()     // Catch:{ Exception -> 0x0078 }
                r9.append(r0)     // Catch:{ Exception -> 0x0078 }
                r9.append(r1)     // Catch:{ Exception -> 0x0078 }
                r2 = 33
                r9.append(r2)     // Catch:{ Exception -> 0x0078 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0078 }
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r9)     // Catch:{ Exception -> 0x0078 }
                return r4
            L_0x0071:
                rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x0078 }
                goto L_0x0075
            L_0x0074:
                r0 = r4
            L_0x0075:
                if (r0 != 0) goto L_0x0093
                return r4
            L_0x0078:
                r9 = move-exception
                er1.j4 r2 = er1.C58739j4.f168176a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                r3.append(r1)
                r0 = 93
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.mo83712h0(r9, r0)
                return r4
            L_0x0093:
                java.io.InputStream r0 = r9.getInputStream()
                java.lang.String r1 = r9.getContentType()
                byte[] r0 = p60.C100636f.m131649a(r0)
                r9.disconnect()
                w60.d r9 = new w60.d
                w60.c r2 = new w60.c
                r2.<init>(r0)
                r9.<init>(r0, r1, r2)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: pl1.C100800a0.C100801a.mo140263a(java.lang.String):w60.d");
        }

        /* renamed from: b */
        public final HttpURLConnection mo140264b(String str) {
            C87412m.m108594g(str, "url");
            Log.m105924i("Finder.ImageDownloader", "[openConnection] url:" + str);
            URLConnection openConnection = new URL(str).openConnection();
            C87412m.m108592e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(20000);
            return httpURLConnection;
        }
    }

    /* renamed from: a */
    public void mo95802a(C102564a<C100810g0> aVar, C101725g gVar, C100284b.C100285a aVar2) {
        C13598b0 b0Var;
        C87412m.m108594g(aVar, "item");
        C87412m.m108594g(gVar, "fileNameCreator");
        C87412m.m108594g(aVar2, "callback");
        try {
            C100810g0 g0Var = (C100810g0) aVar.f301995a;
            String url = g0Var.getMediaType() == C27696y.RAW_IMAGE ? g0Var.getUrl() : g0Var.getThumbUrl();
            Log.m105924i("Finder.ImageDownloader", "loadDataImp http " + g0Var.getMediaType() + " thumbUrl " + g0Var.getThumbUrl() + " url " + g0Var.getUrl());
            C102352d a = C100801a.f295277a.mo140263a(url);
            if (a != null) {
                aVar2.mo129425b(a);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                aVar2.mo129424a();
            }
        } catch (InterruptedException e) {
            Log.m105921e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", Util.stackTraceToString(e));
            aVar2.mo129424a();
        } catch (UnknownHostException e2) {
            Log.m105921e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", Util.stackTraceToString(e2));
            aVar2.mo129424a();
        } catch (SSLHandshakeException e3) {
            Log.m105921e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", Util.stackTraceToString(e3));
            aVar2.mo129424a();
        } catch (SocketException e4) {
            Log.m105921e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", Util.stackTraceToString(e4));
            aVar2.mo129424a();
        } catch (SocketTimeoutException e5) {
            Log.m105921e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", Util.stackTraceToString(e5));
            aVar2.mo129424a();
        } catch (IOException e6) {
            Log.m105921e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", Util.stackTraceToString(e6));
            aVar2.mo129424a();
        } catch (Exception e7) {
            Log.m105921e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", Util.stackTraceToString(e7));
            aVar2.mo129424a();
        }
    }
}
