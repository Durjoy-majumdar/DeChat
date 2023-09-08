package q40;

import gy3.C87412m;
import te3.C49335eu3;
import z04.C112550d0;

/* renamed from: q40.d */
public final class C12040d extends Exception {

    /* renamed from: d */
    public final String f35056d;

    /* renamed from: e */
    public final int f35057e;

    /* renamed from: f */
    public final int f35058f;

    /* renamed from: g */
    public final String f35059g;

    /* renamed from: h */
    public final C49335eu3 f35060h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12040d(String str, int i, int i2, String str2, C49335eu3 eu32) {
        super("CGI[" + C112550d0.m153794d0(str, "/", "") + "] returns error: errorType=" + i + ", errorCode=" + i2 + ", resMsg=" + str2);
        C87412m.m108594g(str, "uri");
        C87412m.m108594g(eu32, "resp");
        this.f35056d = str;
        this.f35057e = i;
        this.f35058f = i2;
        this.f35059g = str2;
        this.f35060h = eu32;
    }

    public String toString() {
        return "uri:" + this.f35056d + ", errorType: " + this.f35057e + " errorCode: " + this.f35058f + " msg: " + this.f35059g;
    }
}
