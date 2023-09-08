package do1;

import bo1.C54511w;
import bo1.C54512y;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import je1.C9342n1;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: do1.o */
public final class C58351o implements C54511w {

    /* renamed from: a */
    public final /* synthetic */ C58341h f167087a;

    /* renamed from: do1.o$a */
    public static final class C58352a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58341h f167088d;

        /* renamed from: e */
        public final /* synthetic */ String f167089e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58352a(C58341h hVar, String str) {
            super(0);
            this.f167088d = hVar;
            this.f167089e = str;
        }

        public Object invoke() {
            C9342n1.C9346d dVar = this.f167088d.f167040p.f167044b;
            if (C87412m.m108589b(dVar != null ? dVar.f29213Q : null, this.f167089e)) {
                this.f167088d.mo83088d("preloadVideoWorker");
            }
            return C13598b0.f38549a;
        }
    }

    public C58351o(C58341h hVar) {
        this.f167087a = hVar;
    }

    /* renamed from: a */
    public void mo12829a(String str, C54512y yVar) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(yVar, "task");
    }

    /* renamed from: b */
    public void mo12830b(String str, int i, int i2, String str2, String str3, C54512y yVar) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(str2, "fileFormat");
        C87412m.m108594g(str3, "codingFormat");
        C87412m.m108594g(yVar, "task");
    }

    /* renamed from: c */
    public void mo12831c(String str, int i, long j) {
        C87412m.m108594g(str, "mediaId");
    }

    /* renamed from: d */
    public void mo12832d(String str, String str2, C54512y yVar) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(str2, "msg");
        C87412m.m108594g(yVar, "task");
    }

    /* renamed from: e */
    public void mo12833e(String str) {
        C87412m.m108594g(str, "mediaId");
    }

    /* renamed from: f */
    public void mo12834f(String str, boolean z, int i, C54512y yVar, long j) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(yVar, "task");
        C61926c.m72666K(0, new C58352a(this.f167087a, str));
    }
}
