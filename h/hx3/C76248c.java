package hx3;

import java.net.URL;

/* renamed from: hx3.c */
public final class C76248c {

    /* renamed from: a */
    public String f223343a;

    /* renamed from: b */
    public String f223344b;

    public C76248c(String str) {
        this.f223343a = str;
    }

    /* renamed from: a */
    public final URL mo106503a() {
        try {
            return new URL(this.f223343a);
        } catch (Exception unused) {
            return null;
        }
    }
}
