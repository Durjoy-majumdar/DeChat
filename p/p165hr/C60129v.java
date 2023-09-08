package p165hr;

import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60184m;
import java.util.Iterator;
import java.util.LinkedList;
import o40.C61926c;
import ob0.C89132b;
import p565ir.C60606n;
import rx3.C13598b0;
import rx3.C13605o;
import te3.C48654a21;
import te3.C50516na1;
import te3.C51576uo2;
import te3.C51713vn0;
import te3.C64273c21;
import te3.C64456ix0;

/* renamed from: hr.v */
public final class C60129v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C89132b.C89134c<C51713vn0> f171632d;

    /* renamed from: e */
    public final /* synthetic */ C60106t f171633e;

    /* renamed from: f */
    public final /* synthetic */ long f171634f;

    /* renamed from: g */
    public final /* synthetic */ C60606n.C60609c f171635g;

    /* renamed from: hr.v$a */
    public static final class C60130a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60606n.C60609c f171636d;

        /* renamed from: e */
        public final /* synthetic */ long f171637e;

        /* renamed from: f */
        public final /* synthetic */ int f171638f;

        /* renamed from: g */
        public final /* synthetic */ C89132b.C89134c<C51713vn0> f171639g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60130a(C60606n.C60609c cVar, long j, int i, C89132b.C89134c<C51713vn0> cVar2) {
            super(0);
            this.f171636d = cVar;
            this.f171637e = j;
            this.f171638f = i;
            this.f171639g = cVar2;
        }

        public Object invoke() {
            C60606n.C60609c cVar = this.f171636d;
            if (cVar != null) {
                cVar.onLiveStatusCallback(this.f171637e, this.f171638f, this.f171639g.f256796d);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hr.v$b */
    public static final class C60131b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60606n.C60609c f171640d;

        /* renamed from: e */
        public final /* synthetic */ long f171641e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60131b(C60606n.C60609c cVar, long j) {
            super(0);
            this.f171640d = cVar;
            this.f171641e = j;
        }

        public Object invoke() {
            C60606n.C60609c cVar = this.f171640d;
            if (cVar != null) {
                cVar.onLiveStatusCallback(this.f171641e, 1, new C51713vn0());
            }
            return C13598b0.f38549a;
        }
    }

    public C60129v(C89132b.C89134c<C51713vn0> cVar, C60106t tVar, long j, C60606n.C60609c cVar2) {
        this.f171632d = cVar;
        this.f171633e = tVar;
        this.f171634f = j;
        this.f171635g = cVar2;
    }

    public final void run() {
        C48654a21 a212;
        C64273c21 c212;
        C64273c21 c213;
        LinkedList<C50516na1> linkedList;
        LinkedList<C48654a21> linkedList2;
        T t;
        boolean z;
        C51576uo2 uo22;
        C89132b.C89134c<C51713vn0> cVar = this.f171632d;
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C51713vn0 vn02 = (C51713vn0) cVar.f256796d;
            C64273c21 c214 = vn02.f143572d;
            int i = c214 != null ? c214.f182394f : 1;
            boolean z2 = false;
            if (!(vn02 == null || (uo22 = vn02.f143580o) == null)) {
                C60106t tVar = this.f171633e;
                long j = this.f171634f;
                String str = uo22.f142984d;
                if (!(str == null || str.length() == 0)) {
                    String str2 = uo22.f142984d + Util.nullAsNil(uo22.f142985e);
                    tVar.getClass();
                    C87412m.m108594g(str2, "url");
                    tVar.f171509A.put(Long.valueOf(j), str2);
                }
            }
            C51713vn0 vn03 = (C51713vn0) this.f171632d.f256796d;
            String str3 = null;
            if (vn03 == null || (linkedList2 = vn03.f143586u) == null) {
                a212 = null;
            } else {
                Iterator<T> it = linkedList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((C48654a21) t).f130235i == 2) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                a212 = (C48654a21) t;
            }
            String str4 = a212 != null ? a212.f130230d : null;
            if (str4 == null || str4.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                StringBuilder sb = new StringBuilder();
                sb.append(a212 != null ? a212.f130230d : null);
                if (a212 != null) {
                    str3 = a212.f130231e;
                }
                sb.append(Util.nullAsNil(str3));
                String sb4 = sb.toString();
                C60106t tVar2 = this.f171633e;
                long j2 = this.f171634f;
                tVar2.getClass();
                C87412m.m108594g(sb4, "url");
                tVar2.f171509A.put(Long.valueOf(j2), sb4);
            }
            C61926c.m72668M(new C60130a(this.f171635g, this.f171634f, i, this.f171632d));
            this.f171633e.f171510g.put(Long.valueOf(this.f171634f), new C13605o(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()), this.f171632d.f256796d));
            C51713vn0 vn04 = (C51713vn0) this.f171632d.f256796d;
            if (!(vn04 == null || (c213 = vn04.f143572d) == null || (linkedList = c213.f182379U0) == null)) {
                this.f171633e.f171511h.put(Long.valueOf(this.f171634f), linkedList);
            }
            C60184m.f171717b = ((C51713vn0) this.f171632d.f256796d).f143574f;
            if (C32444a.f86207v1.mo60266n().intValue() == 1 && (c212 = ((C51713vn0) this.f171632d.f256796d).f143572d) != null) {
                C64456ix0 ix02 = new C64456ix0();
                ix02.f183745d = 1;
                ix02.f183746e = "屏蔽测试\nBAN_TEST";
                c212.f182386Y = ix02;
                return;
            }
            return;
        }
        C61926c.m72668M(new C60131b(this.f171635g, this.f171634f));
    }
}
