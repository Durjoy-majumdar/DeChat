package dj0;

import java.util.HashMap;
import java.util.Map;

/* renamed from: dj0.e */
public abstract class C86328e implements C86327d {

    /* renamed from: a */
    public C86329a f251019a;

    /* renamed from: b */
    public String f251020b;

    /* renamed from: c */
    public String f251021c;

    /* renamed from: d */
    public String f251022d;

    /* renamed from: e */
    public Map<String, String> f251023e = new HashMap();

    /* renamed from: dj0.e$a */
    public enum C86329a {
        POST("POST"),
        SUBSCRIBE("SUBSCRIBE"),
        UNSUBSCRIBE("UNSUBSCRIBE");

        /* access modifiers changed from: public */
        C86329a(String str) {
        }
    }

    public C86328e(String str, String str2) {
        this.f251021c = str;
        this.f251022d = str2;
        this.f251020b = mo120719b();
        this.f251019a = C86329a.POST;
    }

    /* renamed from: b */
    public abstract String mo120719b();

    /* renamed from: c */
    public Map<String, String> mo120720c() {
        return this.f251023e;
    }

    /* renamed from: d */
    public C86329a mo120721d() {
        return this.f251019a;
    }

    /* renamed from: e */
    public String mo120722e() {
        return this.f251021c;
    }

    /* renamed from: f */
    public void mo120723f(String str, String str2) {
        ((HashMap) this.f251023e).put(str, str2);
    }

    /* renamed from: g */
    public void mo120724g() {
        mo120723f("Content-Type", "text/xml;charset=\"utf-8\"");
        mo120723f("Connection", "close");
    }
}
