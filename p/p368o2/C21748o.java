package p368o2;

import java.util.ArrayList;
import p368o2.C21735e;

/* renamed from: o2.o */
public class C21748o {

    /* renamed from: a */
    public int f61663a;

    /* renamed from: b */
    public int f61664b;

    /* renamed from: c */
    public int f61665c;

    /* renamed from: d */
    public int f61666d;

    /* renamed from: e */
    public ArrayList<C21749a> f61667e = new ArrayList<>();

    /* renamed from: o2.o$a */
    public static class C21749a {

        /* renamed from: a */
        public C21735e f61668a;

        /* renamed from: b */
        public C21735e f61669b;

        /* renamed from: c */
        public int f61670c;

        /* renamed from: d */
        public C21735e.C21736a f61671d;

        /* renamed from: e */
        public int f61672e;

        public C21749a(C21735e eVar) {
            this.f61668a = eVar;
            this.f61669b = eVar.f61533d;
            this.f61670c = eVar.mo34025b();
            this.f61671d = eVar.f61536g;
            this.f61672e = eVar.f61537h;
        }
    }

    public C21748o(C21738f fVar) {
        this.f61663a = fVar.f61559I;
        this.f61664b = fVar.f61560J;
        this.f61665c = fVar.mo34049q();
        this.f61666d = fVar.mo34043k();
        ArrayList<C21735e> g = fVar.mo34039g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            this.f61667e.add(new C21749a(g.get(i)));
        }
    }
}
