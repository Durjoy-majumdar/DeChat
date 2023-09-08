package p871zj;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p001ak.C54053a;
import p006bk.C54485h;
import p848dk.C58302f;
import p848dk.C58303g;
import p850ek.C58614e;
import p871zj.C66846j;

/* renamed from: zj.h */
public class C66843h {

    /* renamed from: a */
    public final List<C54053a> f192012a;

    /* renamed from: b */
    public final C58303g<C54053a> f192013b;

    /* renamed from: c */
    public final C58302f f192014c;

    /* renamed from: d */
    public final AtomicBoolean f192015d;

    /* renamed from: e */
    public volatile long f192016e = -1;

    /* renamed from: zj.h$a */
    public class C66844a implements C58303g.C58305b<C54053a> {
        public C66844a(C66843h hVar) {
        }
    }

    public C66843h(C58302f fVar, C66846j.C66847a aVar) {
        this.f192014c = fVar;
        this.f192013b = new C58303g<>(aVar, new C66844a(this));
        this.f192012a = new LinkedList();
        this.f192015d = new AtomicBoolean(false);
    }

    /* renamed from: a */
    public void mo90838a(C54053a aVar) {
        mo90840c();
        C58614e.m68064a("DanmakuDataSource", "addLast: danmaku = " + aVar);
        C58303g<C54053a> gVar = this.f192013b;
        if (aVar == null) {
            gVar.getClass();
        } else {
            C58303g.C58304a<T> aVar2 = gVar.f166941a.f166947c;
            while (aVar2 != gVar.f166941a && gVar.f166942b.compare(aVar2.f166945a, aVar) > 0) {
                aVar2 = aVar2.f166947c;
            }
            if (!aVar.equals(aVar2.f166945a)) {
                C58303g.C58304a<T> aVar3 = aVar2.f166946b;
                C58303g.C58304a<T> aVar4 = new C58303g.C58304a<>(aVar, aVar3, aVar2);
                aVar3.f166947c = aVar4;
                aVar2.f166946b = aVar4;
                gVar.f166944d++;
            }
        }
        mo90841d();
    }

    /* renamed from: b */
    public void mo90839b() {
        C58614e.m68067d("DanmakuDataSource", "clear danmaku queue");
        mo90840c();
        C58303g<C54053a> gVar = this.f192013b;
        C58303g.C58304a<T> aVar = gVar.f166941a;
        aVar.f166946b = aVar;
        aVar.f166947c = aVar;
        gVar.f166944d = 0;
        mo90841d();
    }

    /* renamed from: c */
    public final void mo90840c() {
        while (!this.f192015d.compareAndSet(false, true)) {
            C58614e.m68064a("DanmakuDataSource", "lock is blocked");
            Thread.yield();
        }
    }

    /* renamed from: d */
    public final void mo90841d() {
        C54485h hVar;
        while (!this.f192015d.compareAndSet(true, false)) {
            if (C58614e.f167821b >= 1 && (hVar = C58614e.f167820a) != null) {
                hVar.mo14327e("DanmakuDataSource", "update end is blocked! this can not happend!");
            }
            Thread.yield();
        }
    }
}
