package xf2;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.message.BasicNameValuePair;
import p156gj.C87200o;
import qe3.C89625d;
import xf2.C91196d;

/* renamed from: xf2.c */
public class C91195c extends C91196d {

    /* renamed from: f */
    public static final String f261459f;

    /* renamed from: a */
    public HttpClient f261460a = null;

    /* renamed from: b */
    public HttpRequestBase f261461b = null;

    /* renamed from: c */
    public HttpResponse f261462c = null;

    /* renamed from: d */
    public int f261463d = 0;

    /* renamed from: e */
    public boolean f261464e = false;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("weixin/");
        int i = C89625d.f257835a;
        sb.append(C87200o.f252868a);
        sb.append("/0x");
        sb.append(Integer.toHexString(C89625d.f257841g));
        f261459f = sb.toString();
    }

    /* renamed from: a */
    public void mo125254a() {
        Log.m105918d("MicroMsg.HttpClientUtil", "cancel conection.");
        this.f261464e = true;
        HttpRequestBase httpRequestBase = this.f261461b;
        if (httpRequestBase != null && !httpRequestBase.isAborted()) {
            this.f261461b.abort();
        }
        HttpClient httpClient = this.f261460a;
        if (httpClient != null) {
            httpClient.getConnectionManager().shutdown();
        }
    }

    /* JADX WARNING: type inference failed for: r2v21, types: [java.util.Map, java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: type inference failed for: r2v25 */
    /* JADX WARNING: type inference failed for: r2v29, types: [java.util.Map, java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v32 */
    /* JADX WARNING: type inference failed for: r2v33 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x0268 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x027f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x0295 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x02ab */
    /* JADX WARNING: Missing exception handler attribute for start block: B:135:0x02c2 */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0166 A[SYNTHETIC, Splitter:B:52:0x0166] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0199 A[Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb, all -> 0x0223 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ac A[Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb, all -> 0x0223 }, LOOP:0: B:60:0x01a2->B:64:0x01ac, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c4 A[Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb, all -> 0x0223 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01d7 A[SYNTHETIC, Splitter:B:75:0x01d7] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:135:0x02c2=Splitter:B:135:0x02c2, B:123:0x0295=Splitter:B:123:0x0295, B:111:0x0268=Splitter:B:111:0x0268, B:129:0x02ab=Splitter:B:129:0x02ab, B:117:0x027f=Splitter:B:117:0x027f} */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xf2.C91196d.C91202f mo125255e(java.lang.String r19, java.lang.String r20, xf2.C91196d.C91201e r21, xf2.C91196d.C91200d r22) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            r3 = r21
            java.lang.String r4 = "default_attach_name"
            java.lang.String r5 = "Content-Length"
            java.lang.String r6 = "Content-Disposition"
            java.lang.String r7 = "Content-Encoding"
            java.lang.String r8 = "set-cookie"
            java.lang.String r9 = "http unavailable"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "uri="
            r10.append(r11)
            r10.append(r2)
            java.lang.String r12 = ", "
            r10.append(r12)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            java.lang.String r13 = "MicroMsg.HttpClientUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r10)
            r14 = 0
            r15 = 0
            r1.f261464e = r14     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.client.HttpClient r10 = com.tencent.p014mm.network.C81035d.m98962c()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r1.f261460a = r10     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            int r10 = r3.f261475a     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            if (r10 != 0) goto L_0x0050
            org.apache.http.client.methods.HttpGet r10 = new org.apache.http.client.methods.HttpGet     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.util.Map<java.lang.String, java.lang.String> r14 = r3.f261476b     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.String r0 = xf2.C91196d.m114463c(r0, r2, r14)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r10.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r1.f261461b = r10     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            goto L_0x005b
        L_0x0050:
            org.apache.http.client.methods.HttpPost r10 = new org.apache.http.client.methods.HttpPost     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.String r0 = xf2.C91196d.m114463c(r0, r2, r15)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r10.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r1.f261461b = r10     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
        L_0x005b:
            org.apache.http.client.methods.HttpRequestBase r0 = r1.f261461b     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.String r10 = "User-Agent"
            java.lang.String r14 = f261459f     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r0.addHeader(r10, r14)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.String r0 = "http.keepAlive"
            java.lang.String r10 = "false"
            java.lang.System.setProperty(r0, r10)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.client.methods.HttpRequestBase r0 = r1.f261461b     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.String r10 = "Accept-Charset"
            java.lang.String r14 = "utf-8"
            r0.addHeader(r10, r14)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.client.methods.HttpRequestBase r0 = r1.f261461b     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.String r10 = "Accept-Encoding"
            java.lang.String r14 = "compress;q=0.5, gzip;q=1.0"
            r0.addHeader(r10, r14)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.client.methods.HttpRequestBase r0 = r1.f261461b     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.String r10 = "Content-Type"
            java.lang.String r14 = "text/html"
            r0.addHeader(r10, r14)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.client.methods.HttpRequestBase r0 = r1.f261461b     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.String r10 = "Cookie"
            java.util.Map<java.lang.String, java.lang.String> r14 = r3.f261477c     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.String r14 = xf2.C91196d.m114462b(r14)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r0.addHeader(r10, r14)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            int r0 = r3.f261475a     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r10 = 1
            if (r0 != r10) goto L_0x009f
            org.apache.http.client.methods.HttpRequestBase r0 = r1.f261461b     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r1.mo125256f(r3, r0)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
        L_0x009f:
            org.apache.http.client.HttpClient r0 = r1.f261460a     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.client.methods.HttpRequestBase r14 = r1.f261461b     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.HttpResponse r0 = r0.execute(r14)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r1.f261462c = r0     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.StatusLine r0 = r0.getStatusLine()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            int r0 = r0.getStatusCode()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r1.f261463d = r0     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.HttpResponse r0 = r1.f261462c     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.Header r0 = r0.getFirstHeader(r8)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            if (r0 == 0) goto L_0x00c6
            org.apache.http.HttpResponse r0 = r1.f261462c     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.Header r0 = r0.getFirstHeader(r8)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.String r0 = r0.getValue()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            goto L_0x00c7
        L_0x00c6:
            r0 = r15
        L_0x00c7:
            org.apache.http.HttpResponse r8 = r1.f261462c     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.Header r8 = r8.getFirstHeader(r7)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            if (r8 == 0) goto L_0x00da
            org.apache.http.HttpResponse r8 = r1.f261462c     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.Header r7 = r8.getFirstHeader(r7)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.String r7 = r7.getValue()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            goto L_0x00db
        L_0x00da:
            r7 = r15
        L_0x00db:
            org.apache.http.HttpResponse r8 = r1.f261462c     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.Header r8 = r8.getFirstHeader(r6)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            if (r8 == 0) goto L_0x00ee
            org.apache.http.HttpResponse r8 = r1.f261462c     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.Header r6 = r8.getFirstHeader(r6)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.String r6 = r6.getValue()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            goto L_0x00ef
        L_0x00ee:
            r6 = r15
        L_0x00ef:
            if (r6 == 0) goto L_0x0103
            java.lang.String r8 = "attachment;"
            boolean r6 = r6.contains(r8)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            if (r6 == 0) goto L_0x0103
            java.lang.String r6 = "download"
            boolean r6 = r2.contains(r6)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            if (r6 == 0) goto L_0x0103
            r6 = 1
            goto L_0x0104
        L_0x0103:
            r6 = 0
        L_0x0104:
            if (r6 != 0) goto L_0x0144
            org.apache.http.HttpResponse r8 = r1.f261462c     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.Header r8 = r8.getFirstHeader(r5)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            if (r8 == 0) goto L_0x0119
            org.apache.http.HttpResponse r8 = r1.f261462c     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.Header r5 = r8.getFirstHeader(r5)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.String r5 = r5.getValue()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            goto L_0x011a
        L_0x0119:
            r5 = r15
        L_0x011a:
            boolean r8 = android.text.TextUtils.isEmpty(r5)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            if (r8 != 0) goto L_0x0144
            r8 = 0
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r8)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r8 = r11
            long r10 = (long) r5     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r16 = 5242880(0x500000, double:2.590327E-317)
            int r5 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x0145
            xf2.d$f r0 = new xf2.d$f     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r2 = -10000(0xffffffffffffd8f0, float:NaN)
            java.lang.String r3 = "mail content to large"
            r0.<init>(r2, r15, r3)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.client.HttpClient r2 = r1.f261460a
            if (r2 == 0) goto L_0x0143
            org.apache.http.conn.ClientConnectionManager r2 = r2.getConnectionManager()
            r2.shutdown()
        L_0x0143:
            return r0
        L_0x0144:
            r8 = r11
        L_0x0145:
            org.apache.http.HttpResponse r5 = r1.f261462c     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.HttpEntity r5 = r5.getEntity()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r5.getContentLength()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.io.InputStream r10 = r5.getContent()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            if (r7 == 0) goto L_0x0162
            java.lang.String r11 = "gzip"
            boolean r7 = r7.contains(r11)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            if (r7 == 0) goto L_0x0162
            java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r7.<init>(r10)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r10 = r7
        L_0x0162:
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x0199
            com.tencent.mm.vfs.m1 r11 = new com.tencent.mm.vfs.m1     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r14.<init>()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r14.append(r7)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.util.Map<java.lang.String, java.lang.String> r15 = r3.f261476b     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.Object r15 = r15.get(r4)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            if (r15 != 0) goto L_0x0181
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            goto L_0x0189
        L_0x0181:
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f261476b     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.io.Serializable r3 = (java.io.Serializable) r3     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
        L_0x0189:
            r14.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.String r3 = r14.toString()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r11.<init>((java.lang.String) r7, (java.lang.String) r3)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r3 = 1
            java.io.OutputStream r3 = com.tencent.p014mm.vfs.C86013q1.m106427I(r11, r3)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            goto L_0x019e
        L_0x0199:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r3.<init>()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
        L_0x019e:
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
        L_0x01a2:
            boolean r11 = r1.f261464e     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            if (r11 != 0) goto L_0x01c0
            int r11 = r10.read(r4)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            if (r11 <= 0) goto L_0x01c0
            r14 = 0
            r3.write(r4, r14, r11)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r3.flush()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r11 = r22
            ag2.c0$b r11 = (ag2.C79540c0.C79542b) r11     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r11.mo109600a()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            goto L_0x01a2
        L_0x01bb:
            r0 = move-exception
            goto L_0x0226
        L_0x01bd:
            r0 = move-exception
            goto L_0x0247
        L_0x01c0:
            boolean r4 = r1.f261464e     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            if (r4 == 0) goto L_0x01d7
            r3.flush()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r3.close()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.client.HttpClient r0 = r1.f261460a
            if (r0 == 0) goto L_0x01d5
            org.apache.http.conn.ClientConnectionManager r0 = r0.getConnectionManager()
            r0.shutdown()
        L_0x01d5:
            r2 = 0
            return r2
        L_0x01d7:
            xf2.d$f r4 = new xf2.d$f     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            int r11 = r1.f261463d     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.util.Map r0 = xf2.C91196d.m114464d(r0)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            if (r6 == 0) goto L_0x01e2
            goto L_0x01ee
        L_0x01e2:
            java.lang.String r7 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r6 = r3
            java.io.ByteArrayOutputStream r6 = (java.io.ByteArrayOutputStream) r6     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            byte[] r6 = r6.toByteArray()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r7.<init>(r6)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
        L_0x01ee:
            r4.<init>(r11, r0, r7)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r3.flush()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r3.close()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r5.consumeContent()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            if (r10 == 0) goto L_0x01ff
            r10.close()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
        L_0x01ff:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r0.<init>()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r0.append(r8)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r0.append(r2)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r0.append(r12)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            r0.append(r4)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            java.lang.String r0 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r0)     // Catch:{ UnsupportedEncodingException -> 0x02c2, UnknownHostException -> 0x02ab, ClientProtocolException -> 0x0295, IllegalStateException -> 0x027f, FileNotFoundException -> 0x0268, Exception -> 0x01bd, OutOfMemoryError -> 0x01bb }
            org.apache.http.client.HttpClient r0 = r1.f261460a
            if (r0 == 0) goto L_0x0222
            org.apache.http.conn.ClientConnectionManager r0 = r0.getConnectionManager()
            r0.shutdown()
        L_0x0222:
            return r4
        L_0x0223:
            r0 = move-exception
            goto L_0x02d9
        L_0x0226:
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0223 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r9, r2)     // Catch:{ all -> 0x0223 }
            xf2.d$f r0 = new xf2.d$f     // Catch:{ all -> 0x0223 }
            int r2 = r1.f261463d     // Catch:{ all -> 0x0223 }
            if (r2 != 0) goto L_0x0236
            r2 = 0
            r10 = 503(0x1f7, float:7.05E-43)
            goto L_0x0238
        L_0x0236:
            r10 = r2
            r2 = 0
        L_0x0238:
            r0.<init>(r10, r2, r2)     // Catch:{ all -> 0x0223 }
            org.apache.http.client.HttpClient r2 = r1.f261460a
            if (r2 == 0) goto L_0x0246
            org.apache.http.conn.ClientConnectionManager r2 = r2.getConnectionManager()
            r2.shutdown()
        L_0x0246:
            return r0
        L_0x0247:
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0223 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r9, r2)     // Catch:{ all -> 0x0223 }
            xf2.d$f r0 = new xf2.d$f     // Catch:{ all -> 0x0223 }
            int r2 = r1.f261463d     // Catch:{ all -> 0x0223 }
            if (r2 != 0) goto L_0x0257
            r2 = 0
            r10 = 503(0x1f7, float:7.05E-43)
            goto L_0x0259
        L_0x0257:
            r10 = r2
            r2 = 0
        L_0x0259:
            r0.<init>(r10, r2, r2)     // Catch:{ all -> 0x0223 }
            org.apache.http.client.HttpClient r2 = r1.f261460a
            if (r2 == 0) goto L_0x0267
            org.apache.http.conn.ClientConnectionManager r2 = r2.getConnectionManager()
            r2.shutdown()
        L_0x0267:
            return r0
        L_0x0268:
            xf2.d$f r0 = new xf2.d$f     // Catch:{ all -> 0x0223 }
            r2 = -10004(0xffffffffffffd8ec, float:NaN)
            java.lang.String r3 = "output file not found"
            r4 = 0
            r0.<init>(r2, r4, r3)     // Catch:{ all -> 0x0223 }
            org.apache.http.client.HttpClient r2 = r1.f261460a
            if (r2 == 0) goto L_0x027e
            org.apache.http.conn.ClientConnectionManager r2 = r2.getConnectionManager()
            r2.shutdown()
        L_0x027e:
            return r0
        L_0x027f:
            xf2.d$f r0 = new xf2.d$f     // Catch:{ all -> 0x0223 }
            r2 = -10003(0xffffffffffffd8ed, float:NaN)
            java.lang.String r3 = "illegal state"
            r4 = 0
            r0.<init>(r2, r4, r3)     // Catch:{ all -> 0x0223 }
            org.apache.http.client.HttpClient r2 = r1.f261460a
            if (r2 == 0) goto L_0x0294
            org.apache.http.conn.ClientConnectionManager r2 = r2.getConnectionManager()
            r2.shutdown()
        L_0x0294:
            return r0
        L_0x0295:
            xf2.d$f r0 = new xf2.d$f     // Catch:{ all -> 0x0223 }
            r2 = -10002(0xffffffffffffd8ee, float:NaN)
            java.lang.String r3 = "client protocol error"
            r4 = 0
            r0.<init>(r2, r4, r3)     // Catch:{ all -> 0x0223 }
            org.apache.http.client.HttpClient r2 = r1.f261460a
            if (r2 == 0) goto L_0x02aa
            org.apache.http.conn.ClientConnectionManager r2 = r2.getConnectionManager()
            r2.shutdown()
        L_0x02aa:
            return r0
        L_0x02ab:
            xf2.d$f r0 = new xf2.d$f     // Catch:{ all -> 0x0223 }
            r2 = -10005(0xffffffffffffd8eb, float:NaN)
            java.lang.String r3 = "unknow host"
            r4 = 0
            r0.<init>(r2, r4, r3)     // Catch:{ all -> 0x0223 }
            org.apache.http.client.HttpClient r2 = r1.f261460a
            if (r2 == 0) goto L_0x02c1
            org.apache.http.conn.ClientConnectionManager r2 = r2.getConnectionManager()
            r2.shutdown()
        L_0x02c1:
            return r0
        L_0x02c2:
            xf2.d$f r0 = new xf2.d$f     // Catch:{ all -> 0x0223 }
            r2 = -10001(0xffffffffffffd8ef, float:NaN)
            java.lang.String r3 = "unsupported ecoding"
            r4 = 0
            r0.<init>(r2, r4, r3)     // Catch:{ all -> 0x0223 }
            org.apache.http.client.HttpClient r2 = r1.f261460a
            if (r2 == 0) goto L_0x02d8
            org.apache.http.conn.ClientConnectionManager r2 = r2.getConnectionManager()
            r2.shutdown()
        L_0x02d8:
            return r0
        L_0x02d9:
            org.apache.http.client.HttpClient r2 = r1.f261460a
            if (r2 == 0) goto L_0x02e4
            org.apache.http.conn.ClientConnectionManager r2 = r2.getConnectionManager()
            r2.shutdown()
        L_0x02e4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xf2.C91195c.mo125255e(java.lang.String, java.lang.String, xf2.d$e, xf2.d$d):xf2.d$f");
    }

    /* renamed from: f */
    public final void mo125256f(C91196d.C91201e eVar, HttpRequestBase httpRequestBase) {
        if (eVar.f261476b != null) {
            ArrayList arrayList = new ArrayList();
            for (String next : eVar.f261476b.keySet()) {
                arrayList.add(new BasicNameValuePair(next, eVar.f261476b.get(next)));
            }
            ((HttpPost) httpRequestBase).setEntity(new UrlEncodedFormEntity(arrayList, "utf-8"));
        }
    }
}
