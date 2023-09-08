package r60;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import x60.C102564a;

/* renamed from: r60.e */
public final class C101344e {

    /* renamed from: b */
    public static final C101346b f296885b = new C101346b((C8480h) null);

    /* renamed from: c */
    public static final C13601g<C101344e> f296886c = C36568h.m40985a(C101345a.f296889d);

    /* renamed from: d */
    public static final String f296887d = "MicroMsg.Loader.TargetCenter";

    /* renamed from: a */
    public ConcurrentHashMap<Integer, C13604l<C102564a<?>, C101342d<Object>>> f296888a = new ConcurrentHashMap<>();

    /* renamed from: r60.e$a */
    public static final class C101345a extends C87413o implements C32224a<C101344e> {

        /* renamed from: d */
        public static final C101345a f296889d = new C101345a();

        public C101345a() {
            super(0);
        }

        public Object invoke() {
            return new C101344e();
        }
    }

    /* renamed from: r60.e$b */
    public static final class C101346b {
        public C101346b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C101344e mo140836a() {
            return (C101344e) ((C36570n) C101344e.f296886c).getValue();
        }
    }

    /* renamed from: a */
    public final void mo140835a(C101342d<Object> dVar, C102564a<?> aVar, String str) {
        C87412m.m108594g(dVar, "target");
        C87412m.m108594g(aVar, "data");
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_REASON);
        C13604l lVar = this.f296888a.get(Integer.valueOf(dVar.mo140831c()));
        if (lVar != null && C87412m.m108589b(lVar.f38555d, aVar)) {
            this.f296888a.remove(Integer.valueOf(dVar.mo140831c()));
        }
    }
}
