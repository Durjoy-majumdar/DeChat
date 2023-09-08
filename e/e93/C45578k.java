package e93;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.webcompt.C44404a;
import ex0.C45700h;

/* renamed from: e93.k */
public final class C45578k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C45579l f123286d;

    public C45578k(C45579l lVar) {
        this.f123286d = lVar;
    }

    public final void run() {
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[9];
        C45700h.C45703c cVar = this.f123286d.f123289c;
        int i = 0;
        objArr[0] = cVar != null ? cVar.f123524j : null;
        objArr[1] = Integer.valueOf(cVar != null ? cVar.f123518d : 0);
        C45700h.C45703c cVar2 = this.f123286d.f123289c;
        if (cVar2 != null) {
            i = cVar2.f123522h;
        }
        objArr[2] = Integer.valueOf(i);
        String str = this.f123286d.f123288b;
        objArr[3] = str;
        objArr[4] = C44404a.m48764a(str);
        objArr[5] = Long.valueOf(this.f123286d.f123290d);
        objArr[6] = Long.valueOf(this.f123286d.f123291e);
        objArr[7] = Integer.valueOf(this.f123286d.f123292f);
        objArr[8] = 1;
        nVar.mo160131h(25512, objArr);
    }
}
