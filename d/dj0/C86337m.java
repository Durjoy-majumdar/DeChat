package dj0;

import dj0.C86328e;

/* renamed from: dj0.m */
public class C86337m extends C86328e {
    public C86337m(String str, String str2) {
        super(str, "");
        this.f251019a = C86328e.C86329a.SUBSCRIBE;
        mo120723f("Nt", "upnp:event");
        mo120723f("Timeout", "Second-10800");
        mo120723f("Callback", "<" + str2 + ">");
    }

    /* renamed from: a */
    public String mo120718a() {
        return "";
    }

    /* renamed from: b */
    public String mo120719b() {
        return "SUBSCRIBE";
    }
}
