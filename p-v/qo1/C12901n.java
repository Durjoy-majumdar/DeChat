package qo1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import z04.C112550d0;

/* renamed from: qo1.n */
public final class C12901n implements C63294j {

    /* renamed from: a */
    public static final C12901n f36884a = new C12901n();

    /* renamed from: a */
    public void mo12426a(long j) {
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1267, 1, 1);
        nVar.mo175913w(1267, 2, j);
        Log.m105918d("Finder.FinderStat", "reportNormalFolderClearCost " + 1267 + ", key:1,2, costTime:" + j);
    }

    /* renamed from: b */
    public void mo12427b(boolean z) {
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1253, 40, 1);
        if (z) {
            nVar.mo175913w(1523, 40, 1);
        }
    }

    /* renamed from: c */
    public void mo12428c(boolean z) {
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1253, 45, 1);
        if (z) {
            nVar.mo175913w(1523, 45, 1);
        }
    }

    /* renamed from: d */
    public void mo12429d(boolean z) {
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1253, 44, 1);
        if (z) {
            nVar.mo175913w(1523, 44, 1);
        }
    }

    /* renamed from: e */
    public void mo12430e(boolean z) {
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1253, 46, 1);
        if (z) {
            nVar.mo175913w(1523, 46, 1);
        }
    }

    /* renamed from: f */
    public void mo12431f(List<Long> list) {
        C87412m.m108594g(list, "list");
        String M = C112550d0.m153777M(C112550d0.m153780P(list.toString(), "]"), "[");
        Log.m105924i("Finder.FinderStat", "report 18896: " + M);
        C115669n.INSTANCE.kvStat(18896, M);
    }

    /* renamed from: g */
    public void mo12432g(boolean z) {
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1253, 43, 1);
        if (z) {
            nVar.mo175913w(1523, 43, 1);
        }
    }

    /* renamed from: h */
    public void mo12433h() {
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1253, 51, 1);
        nVar.mo175913w(1523, 51, 1);
    }

    /* renamed from: i */
    public void mo12434i(long j) {
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1267, 3, 1);
        nVar.mo175913w(1267, 4, j);
        Log.m105918d("Finder.FinderStat", "reportNormalFolderMarkCost " + 1267 + ", key:3,4, costTime:" + j);
    }
}
