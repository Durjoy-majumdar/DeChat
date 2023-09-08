package tm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: tm0.e */
public final class C90534e extends C14018d<C81879g> {

    /* renamed from: c */
    public static final C13601g<C90556u0> f260144c = C36568h.m40985a(C90535a.f260145d);

    /* renamed from: tm0.e$a */
    public static final class C90535a extends C87413o implements C32224a<C90556u0> {

        /* renamed from: d */
        public static final C90535a f260145d = new C90535a();

        public C90535a() {
            super(0);
        }

        public Object invoke() {
            return new C90556u0();
        }
    }

    /* renamed from: tm0.e$b */
    public static final class C90536b {
        public C90536b(C8480h hVar) {
        }
    }

    static {
        new C90536b((C8480h) null);
    }

    /* renamed from: b */
    public Map<String, Object> mo13448a(String str, C81879g gVar) {
        C87412m.m108594g(str, "type");
        C87412m.m108594g(gVar, "component");
        C13601g<C90556u0> gVar2 = f260144c;
        ((C90556u0) ((C36570n) gVar2).getValue()).getClass();
        Map<String, Object> b = C87412m.m108589b("windowInfo", str) ? ((C90556u0) ((C36570n) gVar2).getValue()).mo13450a(str, gVar) : null;
        return b == null ? super.mo13448a(str, gVar) : b;
    }
}
