package com.tencent.p014mm.network;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.network.b0 */
public class C81034b0 implements C92871c0 {

    /* renamed from: a */
    public HttpURLConnection f238032a;

    /* renamed from: b */
    public int f238033b;

    /* renamed from: c */
    public String f238034c;

    /* renamed from: d */
    public URL f238035d;

    /* renamed from: e */
    public Map<String, List<String>> f238036e = null;

    public C81034b0(URL url, int i) {
        this.f238035d = url;
        this.f238033b = i;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        this.f238032a = httpURLConnection;
        if (1 == this.f238033b) {
            httpURLConnection.setInstanceFollowRedirects(false);
        }
    }

    /* renamed from: a */
    public int mo112916a() {
        if (1 == this.f238033b && this.f238036e == null) {
            this.f238036e = this.f238032a.getRequestProperties();
        }
        int i = -1;
        try {
            i = this.f238032a.getResponseCode();
            int i2 = this.f238033b;
            if (1 == i2 && 302 == i) {
                String headerField = this.f238032a.getHeaderField("Location");
                if (headerField == null) {
                    return i;
                }
                this.f238035d = new URL(this.f238035d, headerField);
                try {
                    this.f238032a.getInputStream().close();
                } catch (Exception e) {
                    e.getMessage();
                }
                this.f238032a.disconnect();
                HttpURLConnection httpURLConnection = (HttpURLConnection) this.f238035d.openConnection();
                this.f238032a = httpURLConnection;
                httpURLConnection.setInstanceFollowRedirects(false);
                Map<String, List<String>> map = this.f238036e;
                if (map != null) {
                    for (String next : map.keySet()) {
                        if (!next.equals("Host")) {
                            if (!next.equals("X-Online-Host")) {
                                List list = this.f238036e.get(next);
                                for (int i3 = 0; i3 < list.size(); i3++) {
                                    this.f238032a.setRequestProperty(next, (String) list.get(i3));
                                }
                            }
                        }
                    }
                }
                this.f238032a.setRequestProperty("Host", this.f238035d.getHost());
                this.f238032a.setRequestProperty("X-Online-Host", this.f238035d.getHost());
                return mo112916a();
            }
            if (1 == i2 && 200 != i && NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
                C81035d.m98966g(this.f238034c);
            }
            return i;
        } catch (Exception e2) {
            if (1 == this.f238033b && 200 != i && NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
                C81035d.m98966g(this.f238034c);
            }
            throw e2;
        }
    }

    /* renamed from: b */
    public void mo112917b(String str) {
        this.f238032a.setRequestProperty("Referer", str);
    }

    /* renamed from: c */
    public void mo112918c(boolean z) {
        this.f238032a.setUseCaches(z);
    }

    /* renamed from: d */
    public void mo112919d(int i) {
        this.f238032a.setConnectTimeout(i);
    }

    public void disconnect() {
        HttpURLConnection httpURLConnection = this.f238032a;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.getInputStream().close();
            } catch (Exception e) {
                e.getMessage();
            }
            this.f238032a.disconnect();
        }
    }

    /* renamed from: e */
    public void mo112921e(String str, String str2) {
        this.f238032a.setRequestProperty(str, str2);
    }

    /* renamed from: f */
    public String mo112922f(String str) {
        if (1 == this.f238033b && this.f238036e == null) {
            this.f238036e = this.f238032a.getRequestProperties();
        }
        return this.f238032a.getHeaderField(str);
    }

    /* renamed from: g */
    public void mo112923g(int i) {
        this.f238032a.setReadTimeout(i);
    }

    public String getContentType() {
        return this.f238032a.getContentType();
    }

    public InputStream getInputStream() {
        if (1 == this.f238033b) {
            if (this.f238036e == null) {
                this.f238036e = this.f238032a.getRequestProperties();
            }
            mo112916a();
        }
        return this.f238032a.getInputStream();
    }

    /* renamed from: h */
    public void mo112926h() {
        if (1 == this.f238033b && this.f238036e == null) {
            this.f238036e = this.f238032a.getRequestProperties();
        }
        this.f238032a.connect();
    }

    /* renamed from: i */
    public Map<String, List<String>> mo112927i() {
        if (1 == this.f238033b && this.f238036e == null) {
            this.f238036e = this.f238032a.getRequestProperties();
        }
        return this.f238032a.getHeaderFields();
    }

    /* renamed from: j */
    public String mo112928j() {
        return this.f238035d.getHost();
    }

    /* renamed from: k */
    public OutputStream mo112929k() {
        if (1 == this.f238033b) {
            if (this.f238036e == null) {
                this.f238036e = this.f238032a.getRequestProperties();
            }
            mo112916a();
        }
        return this.f238032a.getOutputStream();
    }

    /* renamed from: l */
    public void mo112930l(String str) {
        this.f238032a.setRequestMethod(str);
    }

    public String toString() {
        return this.f238032a.toString();
    }
}
