package androidx.paging.compose;

import a14.C53872d1;
import a14.C53896h0;
import a14.C53915k2;
import d14.C45252f;
import f14.C58901s;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import p247u3.C65006a0;
import p247u3.C65007a1;
import p247u3.C65048d2;
import p247u3.C65066h0;
import p247u3.C65079m;
import p247u3.C65081m1;
import p247u3.C65093n1;
import p247u3.C65165s;
import sx3.C64175a0;
import sx3.C64186f0;

/* renamed from: androidx.paging.compose.c */
public final class C54222c<T> {

    /* renamed from: a */
    public final C45252f<C65081m1<T>> f152186a;

    /* renamed from: b */
    public final C60690y0 f152187b = C108500f2.m146996c(new C65006a0(0, 0, C64186f0.f181907d), (C108497e2) null, 2, (Object) null);

    /* renamed from: c */
    public final C54224b f152188c;

    /* renamed from: d */
    public final C60690y0 f152189d;

    /* renamed from: androidx.paging.compose.c$a */
    public static final class C54223a implements C65165s {

        /* renamed from: a */
        public final /* synthetic */ C54222c<T> f152190a;

        public C54223a(C54222c<T> cVar) {
            this.f152190a = cVar;
        }

        /* renamed from: a */
        public void mo75008a(int i, int i2) {
            if (i2 > 0) {
                C54222c.m60907a(this.f152190a);
            }
        }

        /* renamed from: b */
        public void mo75009b(int i, int i2) {
            if (i2 > 0) {
                C54222c.m60907a(this.f152190a);
            }
        }

        /* renamed from: c */
        public void mo75010c(int i, int i2) {
            if (i2 > 0) {
                C54222c.m60907a(this.f152190a);
            }
        }
    }

    /* renamed from: androidx.paging.compose.c$b */
    public static final class C54224b extends C65093n1<T> {

        /* renamed from: l */
        public final /* synthetic */ C54222c<T> f152191l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54224b(C54222c<T> cVar, C65165s sVar, C53915k2 k2Var) {
            super(sVar, k2Var);
            this.f152191l = cVar;
        }
    }

    public C54222c(C45252f<C65081m1<T>> fVar) {
        C87412m.m108594g(fVar, "flow");
        this.f152186a = fVar;
        C53896h0 h0Var = C53872d1.f151117a;
        C53915k2 k2Var = C58901s.f168555a;
        this.f152188c = new C54224b(this, new C54223a(this), k2Var);
        C65066h0 h0Var2 = C54225d.f152192a;
        this.f152189d = C108500f2.m146996c(new C65079m(h0Var2.f187269a, h0Var2.f187270b, h0Var2.f187271c, h0Var2, (C65066h0) null, 16, (C8480h) null), (C108497e2) null, 2, (Object) null);
    }

    /* renamed from: a */
    public static final void m60907a(C54222c cVar) {
        C65007a1<T> a1Var = cVar.f152188c.f187352a;
        int i = a1Var.f187141c;
        int i2 = a1Var.f187142d;
        List<C65048d2<T>> list = a1Var.f187139a;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C64175a0.m75508p(arrayList, ((C65048d2) it.next()).f187233b);
        }
        ((C108494d2) cVar.f152187b).setValue(new C65006a0(i, i2, arrayList));
    }

    /* renamed from: b */
    public final int mo75006b() {
        return ((C65006a0) ((C108494d2) this.f152187b).getValue()).mo52189f();
    }

    /* renamed from: c */
    public final C65079m mo75007c() {
        return (C65079m) this.f152189d.getValue();
    }
}
