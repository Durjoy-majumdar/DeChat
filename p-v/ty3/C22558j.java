package ty3;

import fy3.C32224a;
import gy3.C87413o;
import java.util.Set;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sx3.C110826x0;
import vz3.C22826c;
import vz3.C22830f;

/* renamed from: ty3.j */
public enum C22558j {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    

    /* renamed from: h */
    public static final Set<C22558j> f64873h = null;

    /* renamed from: d */
    public final C22830f f64883d;

    /* renamed from: e */
    public final C22830f f64884e;

    /* renamed from: f */
    public final C13601g f64885f;

    /* renamed from: g */
    public final C13601g f64886g;

    /* renamed from: ty3.j$a */
    public static final class C22559a extends C87413o implements C32224a<C22826c> {

        /* renamed from: d */
        public final /* synthetic */ C22558j f64887d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22559a(C22558j jVar) {
            super(0);
            this.f64887d = jVar;
        }

        public Object invoke() {
            return C26343l.f73376j.mo35974c(this.f64887d.f64884e);
        }
    }

    /* renamed from: ty3.j$b */
    public static final class C22560b extends C87413o implements C32224a<C22826c> {

        /* renamed from: d */
        public final /* synthetic */ C22558j f64888d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22560b(C22558j jVar) {
            super(0);
            this.f64888d = jVar;
        }

        public Object invoke() {
            return C26343l.f73376j.mo35974c(this.f64888d.f64883d);
        }
    }

    /* access modifiers changed from: public */
    static {
        C22558j jVar;
        C22558j jVar2;
        C22558j jVar3;
        C22558j jVar4;
        C22558j jVar5;
        C22558j jVar6;
        C22558j jVar7;
        f64873h = C110826x0.m151017e(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7);
    }

    /* access modifiers changed from: public */
    C22558j(String str) {
        this.f64883d = C22830f.m26794f(str);
        this.f64884e = C22830f.m26794f(str + "Array");
        C13602i iVar = C13602i.PUBLICATION;
        this.f64885f = C36568h.m40986b(iVar, new C22560b(this));
        this.f64886g = C36568h.m40986b(iVar, new C22559a(this));
    }
}
