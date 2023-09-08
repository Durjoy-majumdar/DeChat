package pl0;

import com.tencent.tencentmap.mapsdk.map.TencentMap;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: pl0.l */
public class C118076l implements TencentMap.OnMapLoadedListener {

    /* renamed from: a */
    public final /* synthetic */ C118022a f352968a;

    public C118076l(C118022a aVar) {
        this.f352968a = aVar;
    }

    public void onMapLoaded() {
        this.f352968a.getClass();
        C118022a.m166456d0(this.f352968a);
        C118022a aVar = this.f352968a;
        aVar.f352809B = true;
        if (aVar.f352821N.size() > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f352968a.f352821N);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f352968a.mo182819P((String) it.next());
            }
            this.f352968a.f352821N.clear();
        }
    }
}
