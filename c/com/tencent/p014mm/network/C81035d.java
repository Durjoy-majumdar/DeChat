package com.tencent.p014mm.network;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

/* renamed from: com.tencent.mm.network.d */
public final class C81035d {

    /* renamed from: a */
    public static C81036a f238037a;

    /* renamed from: com.tencent.mm.network.d$a */
    public interface C81036a {
        /* renamed from: a */
        C114770g mo112932a();
    }

    /* renamed from: a */
    public static int m98960a(C92871c0 c0Var) {
        try {
            return c0Var.mo112916a() != 200 ? -1 : 0;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.GprsSetting", "exception:%s", Util.stackTraceToString(e));
            return -3;
        }
    }

    /* renamed from: b */
    public static InputStream m98961b(String str, int i, int i2) {
        C81034b0 d = m98963d(str, (C81037b) null);
        d.mo112919d(i);
        d.mo112923g(i2);
        d.mo112930l("GET");
        if (m98960a(d) != 0) {
            return null;
        }
        return d.getInputStream();
    }

    /* renamed from: c */
    public static HttpClient m98962c() {
        return new DefaultHttpClient();
    }

    /* renamed from: d */
    public static C81034b0 m98963d(String str, C81037b bVar) {
        if (bVar == null) {
            bVar = new C81037b(str);
        }
        Log.m105925i("MicroMsg.GprsSetting", "hy: url redirect host: %s, url: %s, ip: %s, dns_type: %d", bVar.f238038a, bVar.f238039b, bVar.f238040c, Integer.valueOf(bVar.f238041d));
        C81034b0 b0Var = new C81034b0(bVar.f238039b, bVar.f238041d);
        b0Var.f238034c = bVar.f238040c;
        if (1 == bVar.f238041d) {
            b0Var.mo112921e("Host", bVar.f238038a);
            b0Var.mo112921e("X-Online-Host", bVar.f238038a);
        }
        return b0Var;
    }

    /* renamed from: e */
    public static C81038d0 m98964e(String str, C81037b bVar) {
        if (bVar == null) {
            bVar = new C81037b(str);
        }
        C81038d0 d0Var = new C81038d0(str, bVar.f238041d);
        d0Var.f238052h = bVar.f238040c;
        if (1 == bVar.f238041d) {
            d0Var.mo112921e("Host", bVar.f238038a);
            d0Var.mo112921e("X-Online-Host", bVar.f238038a);
        }
        return d0Var;
    }

    /* renamed from: f */
    public static int m98965f(String str, boolean z, List<String> list) {
        C81036a aVar = f238037a;
        if (aVar == null || aVar.mo112932a() == null) {
            return -1;
        }
        return f238037a.mo112932a().mo55462T4(str, z, list);
    }

    /* renamed from: g */
    public static void m98966g(String str) {
        C81036a aVar = f238037a;
        if (aVar != null && aVar.mo112932a() != null) {
            f238037a.mo112932a().mo55474g0(str);
        }
    }

    /* renamed from: h */
    public static void m98967h(C81036a aVar) {
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(aVar == null);
        objArr[1] = Util.getStack();
        Log.m105925i("MicroMsg.GprsSetting", "sethostimpl %b, [%s]", objArr);
        f238037a = aVar;
    }

    /* renamed from: com.tencent.mm.network.d$b */
    public static class C81037b {

        /* renamed from: a */
        public String f238038a;

        /* renamed from: b */
        public URL f238039b;

        /* renamed from: c */
        public String f238040c;

        /* renamed from: d */
        public int f238041d;

        /* renamed from: e */
        public ArrayList<String> f238042e;

        /* renamed from: f */
        public String f238043f;

        /* renamed from: g */
        public boolean f238044g;

        public C81037b(String str) {
            Object obj;
            this.f238038a = null;
            this.f238039b = null;
            this.f238040c = "";
            this.f238041d = 0;
            this.f238042e = new ArrayList<>();
            this.f238044g = false;
            this.f238043f = str;
            try {
                URL url = new URL(str);
                this.f238039b = url;
                this.f238038a = url.getHost();
                ArrayList arrayList = new ArrayList();
                C81036a aVar = C81035d.f238037a;
                if (aVar != null) {
                    if (aVar.mo112932a() != null) {
                        int w3 = C81035d.f238037a.mo112932a().mo55493w3(this.f238038a, arrayList);
                        this.f238041d = w3;
                        Log.m105919d("MicroMsg.GprsSetting", "[Arth.302] dnsType:%d  host:%s url:%s", Integer.valueOf(w3), this.f238038a, str);
                        if (arrayList.size() <= 0) {
                            this.f238041d = 0;
                            return;
                        } else if (1 == this.f238041d) {
                            String str2 = (String) arrayList.remove(0);
                            this.f238040c = str2;
                            if (mo112933a(str2)) {
                                str2 = "[" + str2 + "]";
                            }
                            this.f238039b = new URL(str.replaceFirst(this.f238038a, str2));
                            return;
                        } else {
                            return;
                        }
                    }
                }
                Object[] objArr = new Object[2];
                C81036a aVar2 = C81035d.f238037a;
                if (aVar2 == null) {
                    obj = "-1";
                } else {
                    obj = aVar2.mo112932a();
                }
                objArr[0] = obj;
                objArr[1] = Util.getStack();
                Log.m105921e("MicroMsg.GprsSetting", "UrlRedirct ERR:AUTOAUTH NULL:%s  [%s]", objArr);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.GprsSetting", "exception:%s", Util.stackTraceToString(e));
            }
        }

        /* renamed from: a */
        public final boolean mo112933a(String str) {
            try {
                return !(InetAddress.getByName(str) instanceof Inet4Address);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.GprsSetting", "exception:%s", Util.stackTraceToString(e));
                return !str.contains(".");
            }
        }

        public C81037b(String str, boolean z) {
            Object obj;
            this.f238038a = null;
            this.f238039b = null;
            this.f238040c = "";
            this.f238041d = 0;
            this.f238042e = new ArrayList<>();
            this.f238044g = z;
            this.f238043f = str;
            try {
                URL url = new URL(str);
                this.f238039b = url;
                this.f238038a = url.getHost();
                C81036a aVar = C81035d.f238037a;
                if (aVar != null) {
                    if (aVar.mo112932a() != null) {
                        int T4 = C81035d.f238037a.mo112932a().mo55462T4(this.f238038a, z, this.f238042e);
                        this.f238041d = T4;
                        Log.m105919d("MicroMsg.GprsSetting", "[Arth.302] dnsType:%d  host:%s url:%s ips:%s", Integer.valueOf(T4), this.f238038a, str, this.f238042e);
                        if (this.f238042e.size() <= 0) {
                            this.f238041d = 0;
                            return;
                        } else if (1 == this.f238041d) {
                            String remove = this.f238042e.remove(0);
                            this.f238040c = remove;
                            if (mo112933a(remove)) {
                                this.f238040c = "[" + this.f238040c + "]";
                            }
                            this.f238039b = new URL(str.replaceFirst(this.f238038a, this.f238040c));
                            return;
                        } else {
                            return;
                        }
                    }
                }
                Object[] objArr = new Object[2];
                C81036a aVar2 = C81035d.f238037a;
                if (aVar2 == null) {
                    obj = "-1";
                } else {
                    obj = aVar2.mo112932a();
                }
                objArr[0] = obj;
                objArr[1] = Util.getStack();
                Log.m105921e("MicroMsg.GprsSetting", "UrlRedirct ERR:AUTOAUTH NULL:%s  [%s]", objArr);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.GprsSetting", "exception:%s", Util.stackTraceToString(e));
            }
        }
    }
}
