package wq1;

import br1.C54545a;
import br1.C54546b;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import xq1.C66408e;
import xq1.C66410g;

/* renamed from: wq1.e */
public final class C66176e implements C66410g {

    /* renamed from: a */
    public final ArrayList<C66410g> f190190a;

    public C66176e() {
        ArrayList<C66410g> arrayList = new ArrayList<>();
        this.f190190a = arrayList;
        arrayList.add(new C54545a());
        arrayList.add(new C54546b());
    }

    /* renamed from: a */
    public void mo75420a(String str, C66408e eVar, C66408e eVar2) {
        C87412m.m108594g(str, "taskId");
        C87412m.m108594g(eVar, "from");
        C87412m.m108594g(eVar2, "to");
        StringBuilder sb = new StringBuilder();
        sb.append("PostLog transfer from:");
        C66174c cVar = C66174c.f190185a;
        sb.append(cVar.mo90268c(eVar));
        sb.append(", to:");
        sb.append(cVar.mo90268c(eVar2));
        Log.m105924i("Finder.FinderPostStageMonitor", sb.toString());
        for (C66410g a : this.f190190a) {
            a.mo75420a(str, eVar, eVar2);
        }
    }

    /* renamed from: b */
    public void mo75421b(String str, C66408e eVar) {
        C87412m.m108594g(str, "taskId");
        C87412m.m108594g(eVar, "beginStage");
        Log.m105924i("Finder.FinderPostStageMonitor", "PostLog begin:" + C66174c.f190185a.mo90268c(eVar));
        for (C66410g b : this.f190190a) {
            b.mo75421b(str, eVar);
        }
    }

    /* renamed from: c */
    public void mo75422c(String str, C66408e eVar) {
        C87412m.m108594g(str, "taskId");
        C87412m.m108594g(eVar, "endStage");
        Log.m105924i("Finder.FinderPostStageMonitor", "PostLog end:" + C66174c.f190185a.mo90268c(eVar));
        for (C66410g c : this.f190190a) {
            c.mo75422c(str, eVar);
        }
    }
}
