package u60;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import rx3.C13598b0;

/* renamed from: u60.e */
public final class C65221e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65222f<C65220d> f187741d;

    /* renamed from: e */
    public final /* synthetic */ C65220d f187742e;

    /* renamed from: f */
    public final /* synthetic */ boolean f187743f;

    /* renamed from: g */
    public final /* synthetic */ C65231j<C65220d> f187744g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65221e(C65222f<C65220d> fVar, C65220d dVar, boolean z, C65231j<C65220d> jVar) {
        super(0);
        this.f187741d = fVar;
        this.f187742e = dVar;
        this.f187743f = z;
        this.f187744g = jVar;
    }

    public Object invoke() {
        T t;
        T t2;
        LinkedList<C65232k<C65220d, C65231j<T>>> linkedList = this.f187741d.f187749e;
        C65220d dVar = this.f187742e;
        Iterator<T> it = linkedList.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (C87412m.m108589b(((C65220d) ((C65232k) t2).f187766a).mo11854d(), dVar.mo11854d())) {
                break;
            }
        }
        C65232k kVar = (C65232k) t2;
        if (kVar != null) {
            C65220d dVar2 = this.f187742e;
            C65231j<C65220d> jVar = this.f187744g;
            C65222f<C65220d> fVar = this.f187741d;
            if (((C65220d) kVar.f187766a).mo89346c(dVar2)) {
                kVar.f187767b.clear();
            }
            if (jVar != null) {
                kVar.f187767b.add(jVar);
            }
            Log.m105924i("MicroMsg.Loader.DefaultTaskLoader", fVar.mo89351e() + "this task already in task in mPendingQueue " + dVar2 + ' ' + dVar2.mo11854d() + " callback=" + jVar + " callback size=" + kVar.f187767b.size());
            fVar.mo89350d();
        } else {
            LinkedList<C65232k<C65220d, C65231j<T>>> linkedList2 = this.f187741d.f187750f;
            C65220d dVar3 = this.f187742e;
            Iterator<T> it4 = linkedList2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                T next = it4.next();
                if (C87412m.m108589b(((C65220d) ((C65232k) next).f187766a).mo11854d(), dVar3.mo11854d())) {
                    t = next;
                    break;
                }
            }
            C65232k kVar2 = (C65232k) t;
            if (kVar2 != null) {
                C65220d dVar4 = this.f187742e;
                C65231j<C65220d> jVar2 = this.f187744g;
                C65222f<C65220d> fVar2 = this.f187741d;
                if (((C65220d) kVar2.f187766a).mo89346c(dVar4)) {
                    kVar2.f187767b.clear();
                }
                if (jVar2 != null) {
                    kVar2.f187767b.add(jVar2);
                }
                Log.m105924i("MicroMsg.Loader.DefaultTaskLoader", fVar2.mo89351e() + "this task already in task in mRunningQueue " + dVar4 + ' ' + dVar4.mo11854d() + " callback=" + jVar2 + " callback size=" + kVar2.f187767b.size());
                fVar2.mo89350d();
            } else {
                C65220d dVar5 = this.f187742e;
                Log.m105925i("MicroMsg.Loader.DefaultTaskLoader", this.f187741d.mo89351e() + " task in mRunningQueue %s %s", dVar5, dVar5.mo11854d());
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                C65231j<C65220d> jVar3 = this.f187744g;
                if (jVar3 != null) {
                    concurrentLinkedQueue.add(jVar3);
                }
                if (this.f187743f) {
                    this.f187741d.f187749e.addFirst(new C65232k(this.f187742e, concurrentLinkedQueue));
                } else {
                    this.f187741d.f187749e.add(new C65232k(this.f187742e, concurrentLinkedQueue));
                }
                this.f187741d.mo89350d();
            }
        }
        return C13598b0.f38549a;
    }
}
