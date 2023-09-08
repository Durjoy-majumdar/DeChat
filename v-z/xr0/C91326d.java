package xr0;

import androidx.recyclerview.widget.C54248l;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.p026ui.collection.AppBrandCollectionDisplayVerticalList;
import gy3.C87412m;
import java.util.List;

/* renamed from: xr0.d */
public final class C91326d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandCollectionDisplayVerticalList f261946d;

    /* renamed from: e */
    public final /* synthetic */ List<LocalUsageInfo> f261947e;

    /* renamed from: f */
    public final /* synthetic */ C54248l.C54251c f261948f;

    public C91326d(AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList, List<? extends LocalUsageInfo> list, C54248l.C54251c cVar) {
        this.f261946d = appBrandCollectionDisplayVerticalList;
        this.f261947e = list;
        this.f261948f = cVar;
    }

    public final void run() {
        C91331k kVar = this.f261946d.f246625i;
        if (kVar != null) {
            List<LocalUsageInfo> list = this.f261947e;
            C54248l.C54251c cVar = this.f261948f;
            C87412m.m108594g(list, "list");
            synchronized (kVar.f261958d) {
                kVar.f261958d.clear();
                kVar.f261958d.addAll(list);
            }
            cVar.mo75046b(kVar);
        }
    }
}
