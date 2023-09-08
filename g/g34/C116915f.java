package g34;

import e34.C116679a;
import e34.C116680b;
import j34.C117296c;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* renamed from: g34.f */
public class C116915f {

    /* renamed from: a */
    public String f350336a;

    /* renamed from: b */
    public C87131j f350337b;

    /* renamed from: c */
    public C116914e f350338c = new C116914e();

    /* renamed from: d */
    public C116914e f350339d = new C116914e();

    /* renamed from: e */
    public Map<String, String> f350340e = new HashMap();

    /* renamed from: f */
    public HttpURLConnection f350341f;

    public C116915f(C87131j jVar, String str) {
        this.f350337b = jVar;
        this.f350336a = str;
    }

    /* renamed from: a */
    public C116916g mo180882a() {
        this.f350341f.setRequestMethod(this.f350337b.name());
        HttpURLConnection httpURLConnection = this.f350341f;
        for (String str : ((HashMap) this.f350340e).keySet()) {
            httpURLConnection.setRequestProperty(str, (String) ((HashMap) this.f350340e).get(str));
        }
        if (this.f350337b.equals(C87131j.PUT) || this.f350337b.equals(C87131j.POST)) {
            HttpURLConnection httpURLConnection2 = this.f350341f;
            try {
                byte[] bytes = this.f350339d.mo180881a().getBytes(Charset.defaultCharset().name());
                httpURLConnection2.setRequestProperty("Content-Length", String.valueOf(bytes.length));
                if (httpURLConnection2.getRequestProperty("Content-Type") == null) {
                    httpURLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                }
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.getOutputStream().write(bytes);
            } catch (UnsupportedEncodingException e) {
                throw new C116680b("Unsupported Charset: " + Charset.defaultCharset().name(), e);
            }
        }
        return new C116916g(this.f350341f);
    }

    /* renamed from: b */
    public String mo180883b() {
        C116914e eVar = this.f350338c;
        String str = this.f350336a;
        eVar.getClass();
        C117296c.m165375b(str, "Cannot append to null URL");
        String a = eVar.mo180881a();
        if (a.equals("")) {
            return str;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str));
        sb.append(str.indexOf(63) != -1 ? "&" : '?');
        return String.valueOf(sb.toString()) + a;
    }

    /* renamed from: c */
    public C116916g mo180884c() {
        try {
            String b = mo180883b();
            if (this.f350341f == null) {
                System.setProperty("http.keepAlive", "false");
                this.f350341f = (HttpURLConnection) new URL(b).openConnection();
            }
            return mo180882a();
        } catch (Exception e) {
            throw new C116679a(e);
        }
    }
}
