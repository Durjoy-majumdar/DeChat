package yg1;

import ah1.C0044a;
import bh1.C28315a;
import bh1.C28318b;
import bh1.C28319c;
import ch1.C0503f;
import ch1.C0504g;
import ch1.C0505p;
import ch1.C39951a;
import ch1.C54717b;
import ch1.C54718c;
import ch1.C54719d;
import ch1.C54720e;
import ch1.C54721h;
import ch1.C54723j;
import ch1.C54724k;
import ch1.C54725l;
import ch1.C54726m;
import ch1.C54727n;
import ch1.C54728o;
import cl1.C39970c;
import cl1.C54943a1;
import fh1.C8032b1;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import sx3.C64197v;
import te3.C48742ao0;
import te3.C52013xs0;
import te3.C64674r41;
import yg1.C39014a;
import zg1.C16178l;

/* renamed from: yg1.e */
public class C66636e extends C39970c<C45795b> {

    /* renamed from: f */
    public final String f191611f = "FinderLiveMsgRespChain";

    /* renamed from: g */
    public final C13601g f191612g;

    /* renamed from: h */
    public final List<C39016i> f191613h;

    /* renamed from: yg1.e$a */
    public static final class C66637a extends C87413o implements C32226l<C13604l<? extends LinkedList<C64674r41>, ? extends LinkedList<C52013xs0>>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66636e f191614d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66637a(C66636e eVar) {
            super(1);
            this.f191614d = eVar;
        }

        public Object invoke(Object obj) {
            C13604l lVar = (C13604l) obj;
            C87412m.m108594g(lVar, "pair");
            C66636e eVar = this.f191614d;
            C61926c.m72659D(eVar.f191611f, false, new C66635d(eVar, lVar), 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: yg1.e$b */
    public static final class C66638b extends C87413o implements C32224a<C16178l> {

        /* renamed from: d */
        public final /* synthetic */ C45795b f191615d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66638b(C45795b bVar) {
            super(0);
            this.f191615d = bVar;
        }

        public Object invoke() {
            return new C16178l(this.f191615d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66636e(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        this.f191612g = C36568h.m40985a(new C66638b(bVar));
        this.f191613h = C64197v.m75537f(new C28315a(), new C28319c(bVar), new C28318b(), new C54727n(bVar), new C54723j(bVar), new C54721h(), new C54725l(), new C54724k(bVar), new C0505p(bVar), new C8032b1(bVar), new C54728o(bVar), new C54726m(bVar), new C0504g(bVar), new C16178l(bVar), new C0503f(bVar), new C0044a(bVar), new C54718c(), new C16008j(bVar), new C54719d(bVar), new C54717b(bVar), new C39951a(bVar), new C54720e(bVar));
    }

    /* renamed from: c3 */
    public final void mo90686c3() {
        onCleared();
        ((C54943a1) business(C54943a1.class)).f153976g = new C66637a(this);
    }

    /* renamed from: d3 */
    public final void mo90687d3(LinkedList<C64674r41> linkedList, LinkedList<C52013xs0> linkedList2) {
        C87412m.m108594g(linkedList, "msgList");
        C87412m.m108594g(linkedList2, "appMsgList");
        C48742ao0 ao02 = new C48742ao0();
        ao02.f130677e = linkedList;
        ao02.f130689t = linkedList2;
        ((C16178l) ((C36570n) this.f191612g).getValue()).mo49b(new C39014a.C39015a(ao02, 0, 2, (C8480h) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x000e A[LOOP:0: B:1:0x000e->B:4:0x001e, LOOP_START, PHI: r1 
      PHI: (r1v1 boolean) = (r1v0 boolean), (r1v5 boolean) binds: [B:0:0x0000, B:4:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo89859e3(yg1.C39014a r4) {
        /*
            r3 = this;
            java.lang.String r0 = "cgiResp"
            gy3.C87412m.m108594g(r4, r0)
            java.util.List r0 = r3.mo89860f3()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x000e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0020
            java.lang.Object r1 = r0.next()
            yg1.i r1 = (yg1.C39016i) r1
            boolean r1 = r1.mo55917a(r4)
            if (r1 != 0) goto L_0x000e
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yg1.C66636e.mo89859e3(yg1.a):boolean");
    }

    /* renamed from: f3 */
    public List<C39016i> mo89860f3() {
        return this.f191613h;
    }

    public void onCleared() {
        List<C39016i> f3 = mo89860f3();
        ArrayList<C39016i> arrayList = new ArrayList<>();
        for (T next : f3) {
            if (((C39016i) next) instanceof C66639f) {
                arrayList.add(next);
            }
        }
        ArrayList<C66639f> arrayList2 = new ArrayList<>(C36907w.m41090l(arrayList, 10));
        for (C39016i iVar : arrayList) {
            C87412m.m108592e(iVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.component.msginterceptor.IAfterCheckInterceptor");
            arrayList2.add((C66639f) iVar);
        }
        for (C66639f c : arrayList2) {
            c.mo75610c();
        }
    }
}
