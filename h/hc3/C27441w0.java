package hc3;

import gy3.C87412m;
import sm2.C101650a;

/* renamed from: hc3.w0 */
public class C27441w0 extends C101650a {

    /* renamed from: f */
    public String f76099f = "";

    /* renamed from: g */
    public int f76100g = -1;

    /* renamed from: h */
    public String f76101h = "";

    /* renamed from: i */
    public String f76102i = "";

    /* renamed from: j */
    public String f76103j = "";

    /* renamed from: k */
    public C27421t0 f76104k;

    /* renamed from: l */
    public C27403q0 f76105l;

    public C27441w0() {
        this.f297564a = C27475x0.class;
    }

    /* renamed from: A */
    public String mo55111A() {
        return this.f76102i;
    }

    /* renamed from: B */
    public String mo55112B() {
        return this.f76101h;
    }

    /* renamed from: C */
    public String mo55113C() {
        return this.f76103j;
    }

    /* renamed from: D */
    public String mo55114D() {
        return this.f76099f;
    }

    /* renamed from: E */
    public C27403q0 mo55115E() {
        return this.f76105l;
    }

    /* renamed from: F */
    public C27421t0 mo55116F() {
        return this.f76104k;
    }

    /* renamed from: G */
    public int mo55117G() {
        return this.f76100g;
    }

    /* renamed from: H */
    public void mo55118H(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f76102i = str;
    }

    /* renamed from: I */
    public void mo55119I(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f76101h = str;
    }

    /* renamed from: J */
    public void mo55120J(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f76103j = str;
    }

    /* renamed from: K */
    public void mo55121K(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f76099f = str;
    }

    /* renamed from: L */
    public void mo55122L(C27403q0 q0Var) {
        this.f76105l = q0Var;
    }

    /* renamed from: M */
    public void mo55123M(C27421t0 t0Var) {
        this.f76104k = t0Var;
    }

    /* renamed from: N */
    public void mo55124N(int i) {
        this.f76100g = i;
    }

    /* renamed from: a */
    public boolean mo53884a(String str, Object obj, boolean z) {
        C87412m.m108594g(str, "fieldSerializeName");
        boolean a = super.mo53884a(str, obj, z);
        if (a || !C87412m.m108589b(str, "topicType") || !C87412m.m108589b(obj, -1) || !z) {
            return a;
        }
        return true;
    }
}
