package mq1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import u60.C65220d;
import u60.C65231j;
import u60.C65234n;
import vq1.C14950a;

/* renamed from: mq1.f */
public final class C61559f implements C65231j<C61560g> {

    /* renamed from: a */
    public final /* synthetic */ C61557e f174969a;

    /* renamed from: b */
    public final /* synthetic */ C61552a f174970b;

    public C61559f(C61557e eVar, C61552a aVar) {
        this.f174969a = eVar;
        this.f174970b = aVar;
    }

    /* renamed from: a */
    public void mo539a(C65220d dVar, C65234n nVar) {
        C65234n nVar2 = nVar;
        C61560g gVar = (C61560g) dVar;
        C87412m.m108594g(gVar, "task");
        C87412m.m108594g(nVar2, "status");
        C61557e eVar = C61557e.f174962f;
        Log.m105924i("MicroMsg.MusicUni.FinderLikeActionMgr", "task callback " + nVar2);
        if (nVar2 == C65234n.OK) {
            C61557e eVar2 = this.f174969a;
            C61552a aVar = this.f174970b;
            eVar2.getClass();
            ArrayList<C61552a> arrayList = null;
            if (aVar instanceof C61564i) {
                ConcurrentLinkedQueue<C61552a> concurrentLinkedQueue = eVar2.f174964b;
                ArrayList arrayList2 = new ArrayList();
                Iterator<C61552a> it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    C61552a next = it.next();
                    C61552a aVar2 = next;
                    C61564i iVar = aVar2 instanceof C61564i ? (C61564i) aVar2 : null;
                    boolean z = false;
                    if (iVar != null) {
                        C61564i iVar2 = (C61564i) aVar2;
                        if (iVar.f174979g == iVar2.f174979g && iVar.f174976d.mo88875m2() == iVar2.f174976d.mo88875m2() && aVar.f174953b > aVar2.f174953b) {
                            z = true;
                        }
                    }
                    if (z) {
                        arrayList2.add(next);
                    }
                }
                arrayList = arrayList2;
            }
            if (arrayList != null) {
                for (C61552a aVar3 : arrayList) {
                    Log.m105924i("MicroMsg.MusicUni.FinderLikeActionMgr", "drop action now action " + aVar + ' ' + aVar3);
                    eVar2.f174964b.remove(aVar3);
                }
            }
            this.f174969a.mo86495d();
            return;
        }
        if (gVar.f174972g) {
            this.f174969a.f174964b.add(gVar.f174971f);
        }
        MMHandlerThread.removeRunnable(this.f174969a.f174967e);
        MMHandlerThread.postToMainThreadDelayed(this.f174969a.f174967e, C14950a.f40991a);
    }
}
