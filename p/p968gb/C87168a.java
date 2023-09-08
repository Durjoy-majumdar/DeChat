package p968gb;

import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import p284zb.C91635f;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tm0.C14018d;

/* renamed from: gb.a */
public final class C87168a extends C14018d<C91635f> {

    /* renamed from: c */
    public static final C13601g<C87171b> f252808c = C36568h.m40985a(C87169a.f252809d);

    /* renamed from: gb.a$a */
    public static final class C87169a extends C87413o implements C32224a<C87171b> {

        /* renamed from: d */
        public static final C87169a f252809d = new C87169a();

        public C87169a() {
            super(0);
        }

        public Object invoke() {
            return new C87171b();
        }
    }

    /* renamed from: gb.a$b */
    public static final class C87170b {
        public C87170b(C8480h hVar) {
        }
    }

    static {
        new C87170b((C8480h) null);
    }

    /* renamed from: c */
    public Map<String, Object> mo13449b(String str, C91635f fVar) {
        C87412m.m108594g(str, "type");
        C87412m.m108594g(fVar, "component");
        C13601g<C87171b> gVar = f252808c;
        ((C87171b) ((C36570n) gVar).getValue()).getClass();
        Map<String, Object> b = C87412m.m108589b("windowInfo", str) ? ((C87171b) ((C36570n) gVar).getValue()).mo13450a(str, fVar) : null;
        return b == null ? super.mo13448a(str, fVar) : b;
    }
}
