package hc3;

import fc3.C97856d;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hc3.z0 */
public class C98381z0 extends C97856d {

    /* renamed from: l */
    public C98361l1 f288419l;

    /* renamed from: m */
    public List<C27313m> f288420m = new ArrayList();

    /* renamed from: n */
    public String f288421n = "";

    /* renamed from: o */
    public String f288422o = "";

    /* renamed from: p */
    public long f288423p;

    /* renamed from: q */
    public String f288424q = "";

    /* renamed from: r */
    public int f288425r;

    public C98381z0() {
        this.f297564a = C98338a1.class;
    }

    /* renamed from: M */
    public List<C27313m> mo54699M() {
        return this.f288420m;
    }

    /* renamed from: N */
    public long mo54700N() {
        return this.f288423p;
    }

    /* renamed from: O */
    public String mo54701O() {
        return this.f288424q;
    }

    /* renamed from: P */
    public String mo54702P() {
        return this.f288422o;
    }

    /* renamed from: Q */
    public String mo54703Q() {
        return this.f288421n;
    }

    /* renamed from: R */
    public C98361l1 mo54704R() {
        return this.f288419l;
    }

    /* renamed from: S */
    public int mo54705S() {
        return this.f288425r;
    }

    /* renamed from: T */
    public void mo54706T(int i) {
        this.f288425r = i;
    }

    /* renamed from: U */
    public void mo54707U(List<C27313m> list) {
        C87412m.m108594g(list, "<set-?>");
        this.f288420m = list;
    }

    /* renamed from: V */
    public void mo54708V(long j) {
        this.f288423p = j;
    }

    /* renamed from: W */
    public void mo54709W(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f288424q = str;
    }

    /* renamed from: X */
    public void mo54710X(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f288422o = str;
    }

    /* renamed from: Y */
    public void mo54711Y(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f288421n = str;
    }

    /* renamed from: Z */
    public void mo54712Z(C98361l1 l1Var) {
        this.f288419l = l1Var;
    }

    /* renamed from: i */
    public boolean mo137669i(String str, String str2, boolean z) {
        C87412m.m108594g(str, "tagName");
        C87412m.m108594g(str2, "itemTagName");
        if (C87412m.m108589b(str, "datalist")) {
            return true;
        }
        super.mo137669i(str, str2, z);
        return false;
    }
}
