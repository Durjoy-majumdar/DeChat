package hc3;

import gy3.C87412m;
import sm2.C101650a;

/* renamed from: hc3.k0 */
public class C98359k0 extends C101650a {

    /* renamed from: f */
    public String f288341f = "";

    /* renamed from: g */
    public String f288342g = "";

    /* renamed from: h */
    public String f288343h = "";

    /* renamed from: i */
    public String f288344i = "";

    /* renamed from: j */
    public int f288345j = -1;

    public C98359k0() {
        this.f297564a = C98360l0.class;
    }

    /* renamed from: A */
    public int mo55018A() {
        return this.f288345j;
    }

    /* renamed from: B */
    public String mo55019B() {
        return this.f288344i;
    }

    /* renamed from: C */
    public String mo55020C() {
        return this.f288343h;
    }

    /* renamed from: D */
    public String mo55021D() {
        return this.f288342g;
    }

    /* renamed from: E */
    public String mo55022E() {
        return this.f288341f;
    }

    /* renamed from: F */
    public void mo55023F(int i) {
        this.f288345j = i;
    }

    /* renamed from: G */
    public void mo55024G(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f288344i = str;
    }

    /* renamed from: H */
    public void mo55025H(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f288343h = str;
    }

    /* renamed from: I */
    public void mo55026I(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f288342g = str;
    }

    /* renamed from: J */
    public void mo55027J(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f288341f = str;
    }

    /* renamed from: a */
    public boolean mo53884a(String str, Object obj, boolean z) {
        C87412m.m108594g(str, "fieldSerializeName");
        boolean a = super.mo53884a(str, obj, z);
        if (a || !C87412m.m108589b(str, "authIcon") || !C87412m.m108589b(obj, -1) || !z) {
            return a;
        }
        return true;
    }
}
