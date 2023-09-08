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

/* renamed from: vq1.q */
public final class C65860q implements C65231j<C65863s> {

    /* renamed from: a */
    public final /* synthetic */ C65861r f189393a;

    /* renamed from: b */
    public final /* synthetic */ C14961i f189394b;

    public C65860q(C65861r rVar, C14961i iVar) {
        this.f189393a = rVar;
        this.f189394b = iVar;
    }

    /* renamed from: a */
    public void mo539a(C65220d dVar, C65234n nVar) {
        C65863s sVar = (C65863s) dVar;
        C87412m.m108594g(sVar, "task");
        C87412m.m108594g(nVar, "status");
        C65861r rVar = C65861r.f189395e;
        Log.m105924i("Finder.FollowActionMgr", "task callback " + nVar);
        if (nVar == C65234n.OK) {
            C65861r rVar2 = this.f189393a;
            C14961i iVar = this.f189394b;
            rVar2.getClass();
            ArrayList<C14961i> arrayList = null;
            if (iVar instanceof C65859p) {
                ConcurrentLinkedQueue<C14961i> concurrentLinkedQueue = rVar2.f189397b;
                ArrayList arrayList2 = new ArrayList();
                Iterator<C14961i> it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    C14961i next = it.next();
                    C14961i iVar2 = next;
                    C65859p pVar = iVar2 instanceof C65859p ? (C65859p) iVar2 : null;
                    boolean z = false;
                    if (pVar != null && C87412m.m108589b(pVar.f189384c, ((C65859p) iVar2).f189384c) && iVar.f41018b > iVar2.f41018b) {
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
                    Log.m105924i("Finder.FollowActionMgr", "drop action now action " + iVar + ' ' + iVar3);
                    rVar2.f189397b.remove(iVar3);
                }
            }
            this.f189393a.mo89901e();
            return;
        }
        if (sVar.f189402g) {
            this.f189393a.f189397b.add(sVar.f189401f);
        }
        MMHandlerThread.removeRunnable(this.f189393a.f189399d);
        MMHandlerThread.postToMainThreadDelayed(this.f189393a.f189399d, C14950a.f40991a);
    }
}
