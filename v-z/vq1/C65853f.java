package vq1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import u60.C65220d;
import u60.C65231j;
import u60.C65234n;

/* renamed from: vq1.f */
public final class C65853f implements C65231j<C65856h> {

    /* renamed from: a */
    public final /* synthetic */ C65854g f189371a;

    /* renamed from: b */
    public final /* synthetic */ C14961i f189372b;

    public C65853f(C65854g gVar, C14961i iVar) {
        this.f189371a = gVar;
        this.f189372b = iVar;
    }

    /* renamed from: a */
    public void mo539a(C65220d dVar, C65234n nVar) {
        C65856h hVar = (C65856h) dVar;
        C87412m.m108594g(hVar, "task");
        C87412m.m108594g(nVar, "status");
        C65854g gVar = C65854g.f189373e;
        Log.m105924i("Finder.FavActionMgr", "task callback " + nVar);
        if (nVar == C65234n.OK) {
            C65854g gVar2 = this.f189371a;
            C14961i iVar = this.f189372b;
            gVar2.getClass();
            ArrayList<C14961i> arrayList = null;
            if (iVar instanceof C52983e) {
                ConcurrentLinkedQueue<C14961i> concurrentLinkedQueue = gVar2.f189375b;
                ArrayList arrayList2 = new ArrayList();
                Iterator<C14961i> it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    C14961i next = it.next();
                    C14961i iVar2 = next;
                    C52983e eVar = iVar2 instanceof C52983e ? (C52983e) iVar2 : null;
                    boolean z = false;
                    if (eVar != null && eVar.f147881d == ((C52983e) iVar2).f147881d && iVar.f41018b > iVar2.f41018b) {
                        z = true;
                    }
                    if (z) {
                        arrayList2.add(next);
                    }
                }
                arrayList = arrayList2;
            }
            if (arrayList != null) {
                for (C14961i iVar3 : arrayList) {
                    Log.m105924i("Finder.FavActionMgr", "drop action now action " + iVar + ' ' + iVar3);
                    gVar2.f189375b.remove(iVar3);
                }
            }
            this.f189371a.mo89895e();
            return;
        }
        if (hVar.f189380g) {
            this.f189371a.f189375b.add(hVar.f189379f);
        }
        MMHandlerThread.removeRunnable(this.f189371a.f189377d);
        MMHandlerThread.postToMainThreadDelayed(this.f189371a.f189377d, C14950a.f40991a);
    }
}
