package p434ig;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import sm2.C101650a;

/* renamed from: ig.g */
public class C98674g extends C101650a {

    /* renamed from: f */
    public String f289362f = "";

    /* renamed from: g */
    public String f289363g = "";

    /* renamed from: h */
    public List<C98672d> f289364h = new ArrayList();

    /* renamed from: i */
    public long f289365i;

    /* renamed from: j */
    public String f289366j = "";

    /* renamed from: k */
    public int f289367k;

    public C98674g() {
        this.f297564a = C98675h.class;
    }

    /* renamed from: A */
    public List<C98672d> mo55348A() {
        return this.f289364h;
    }

    /* renamed from: B */
    public String mo55349B() {
        return this.f289363g;
    }

    /* renamed from: C */
    public long mo55350C() {
        return this.f289365i;
    }

    /* renamed from: D */
    public String mo55351D() {
        return this.f289366j;
    }

    /* renamed from: E */
    public String mo55352E() {
        return this.f289362f;
    }

    /* renamed from: F */
    public int mo55353F() {
        return this.f289367k;
    }

    /* renamed from: G */
    public void mo55354G(int i) {
        this.f289367k = i;
    }

    /* renamed from: H */
    public void mo55355H(List<C98672d> list) {
        C87412m.m108594g(list, "<set-?>");
        this.f289364h = list;
    }

    /* renamed from: I */
    public void mo55356I(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f289363g = str;
    }

    /* renamed from: J */
    public void mo55357J(long j) {
        this.f289365i = j;
    }

    /* renamed from: K */
    public void mo55358K(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f289366j = str;
    }

    /* renamed from: L */
    public void mo55359L(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f289362f = str;
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
