package ym1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import os3.C62180a;
import rx3.C13598b0;

/* renamed from: ym1.c */
public final class C66669c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderItem f191691d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66669c(FinderItem finderItem) {
        super(0);
        this.f191691d = finderItem;
    }

    public Object invoke() {
        C66668b bVar = new C66668b(this.f191691d);
        C62180a.C62181a aVar = new C62180a.C62181a(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (C8480h) null);
        C62180a.f176787b = aVar;
        bVar.invoke(aVar);
        StringBuilder sb = new StringBuilder();
        sb.append("saveCurrentTestRedDot currentRedDotData: ");
        C62180a.C62181a aVar2 = C62180a.f176787b;
        if (aVar2 != null) {
            sb.append(aVar2);
            Log.m105924i("NearbyRedDotGenerate", sb.toString());
            return C13598b0.f38549a;
        }
        C87412m.m108603p("currentRedDotData");
        throw null;
    }
}
