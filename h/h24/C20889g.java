package h24;

import d24.C106982e;
import d24.C20387b0;
import d24.C20414o;
import d24.C20423t;
import d24.C20431y;
import g24.C20783c;
import g24.C20788g;
import java.util.List;

/* renamed from: h24.g */
public final class C20889g implements C20423t.C20424a {

    /* renamed from: a */
    public final List<C20423t> f59016a;

    /* renamed from: b */
    public final C20788g f59017b;

    /* renamed from: c */
    public final C20886c f59018c;

    /* renamed from: d */
    public final C20783c f59019d;

    /* renamed from: e */
    public final int f59020e;

    /* renamed from: f */
    public final C20431y f59021f;

    /* renamed from: g */
    public final C106982e f59022g;

    /* renamed from: h */
    public final C20414o f59023h;

    /* renamed from: i */
    public final int f59024i;

    /* renamed from: j */
    public final int f59025j;

    /* renamed from: k */
    public final int f59026k;

    /* renamed from: l */
    public int f59027l;

    public C20889g(List<C20423t> list, C20788g gVar, C20886c cVar, C20783c cVar2, int i, C20431y yVar, C106982e eVar, C20414o oVar, int i2, int i3, int i4) {
        this.f59016a = list;
        this.f59019d = cVar2;
        this.f59017b = gVar;
        this.f59018c = cVar;
        this.f59020e = i;
        this.f59021f = yVar;
        this.f59022g = eVar;
        this.f59023h = oVar;
        this.f59024i = i2;
        this.f59025j = i3;
        this.f59026k = i4;
    }

    /* renamed from: a */
    public C20387b0 mo32602a(C20431y yVar, C20788g gVar, C20886c cVar, C20783c cVar2) {
        if (this.f59020e < this.f59016a.size()) {
            this.f59027l++;
            if (this.f59018c == null) {
                C20431y yVar2 = yVar;
            } else if (!this.f59019d.mo32476j(yVar.f57340a)) {
                throw new IllegalStateException("network interceptor " + this.f59016a.get(this.f59020e - 1) + " must retain the same host and port");
            }
            if (this.f59018c == null || this.f59027l <= 1) {
                List<C20423t> list = this.f59016a;
                int i = this.f59020e;
                C106982e eVar = this.f59022g;
                C20414o oVar = this.f59023h;
                int i2 = this.f59024i;
                int i3 = this.f59025j;
                int i4 = i2;
                int i5 = i;
                int i6 = i4;
                String str = "network interceptor ";
                String str2 = " must call proceed() exactly once";
                C20889g gVar2 = new C20889g(list, gVar, cVar, cVar2, i + 1, yVar, eVar, oVar, i6, i3, this.f59026k);
                C20423t tVar = list.get(i5);
                C20387b0 a = tVar.mo31952a(gVar2);
                if (cVar != null && this.f59020e + 1 < this.f59016a.size() && gVar2.f59027l != 1) {
                    throw new IllegalStateException(str + tVar + str2);
                } else if (a == null) {
                    throw new NullPointerException("interceptor " + tVar + " returned null");
                } else if (a.f57131j != null) {
                    return a;
                } else {
                    throw new IllegalStateException("interceptor " + tVar + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + this.f59016a.get(this.f59020e - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }
}
