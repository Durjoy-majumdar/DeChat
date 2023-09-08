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

/* renamed from: vq1.c0 */
public final class C14954c0 implements C65231j<C14955d0> {

    /* renamed from: a */
    public final /* synthetic */ C14951b0 f41002a;

    /* renamed from: b */
    public final /* synthetic */ C14961i f41003b;

    public C14954c0(C14951b0 b0Var, C14961i iVar) {
        this.f41002a = b0Var;
        this.f41003b = iVar;
    }

    /* renamed from: a */
    public void mo539a(C65220d dVar, C65234n nVar) {
        C14955d0 d0Var = (C14955d0) dVar;
        C87412m.m108594g(d0Var, "task");
        C87412m.m108594g(nVar, "status");
        C14951b0 b0Var = C14951b0.f40992g;
        Log.m105924i("Finder.WordingActionMgr", "task callback " + nVar);
        if (nVar == C65234n.OK) {
            C14951b0 b0Var2 = this.f41002a;
            C14961i iVar = this.f41003b;
            b0Var2.getClass();
            ArrayList<C14961i> arrayList = null;
            if (iVar instanceof C52983e) {
                ConcurrentLinkedQueue<C14961i> concurrentLinkedQueue = b0Var2.f40994b;
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
                    Log.m105924i("Finder.WordingActionMgr", "drop action now action " + iVar + ' ' + iVar3);
                    b0Var2.f40994b.remove(iVar3);
                }
            }
            this.f41002a.mo14002d();
            return;
        }
        if (d0Var.f41005g) {
            this.f41002a.f40994b.add(d0Var.f41004f);
        }
        MMHandlerThread.removeRunnable(this.f41002a.f40998f);
        MMHandlerThread.postToMainThreadDelayed(this.f41002a.f40998f, C14950a.f40991a);
    }
}
