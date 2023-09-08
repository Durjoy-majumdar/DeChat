package p875ci;

import android.content.Context;
import p645pj.C77095h;

/* renamed from: ci.t */
public class C67378t {

    /* renamed from: a */
    public C67373b f193242a = new C67373b();

    /* renamed from: b */
    public C67374c f193243b = new C67374c();

    /* renamed from: c */
    public C67375d f193244c = new C67375d();

    /* renamed from: d */
    public C67379u f193245d = new C67379u();

    /* renamed from: e */
    public C67372a f193246e = new C67372a();

    /* renamed from: f */
    public Context f193247f;

    /* renamed from: g */
    public int f193248g;

    /* renamed from: h */
    public int f193249h;

    /* renamed from: i */
    public int f193250i;

    /* renamed from: j */
    public boolean f193251j;

    /* renamed from: k */
    public boolean f193252k;

    /* renamed from: l */
    public boolean f193253l;

    public C67378t(Context context) {
        this.f193247f = context;
    }

    /* renamed from: a */
    public static String m79736a(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        String str = "";
        for (long j : jArr) {
            str = str + String.valueOf(j) + ",";
        }
        return str.isEmpty() ? str : str.substring(0, str.length() - 1);
    }

    /* renamed from: b */
    public int mo91520b() {
        if (this.f193250i == -1) {
            this.f193250i = C77095h.m93059b();
        }
        return this.f193250i;
    }
}
