package kb2;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import c14.C54637q;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import d14.C58057l;
import gy3.C87412m;
import java.util.ArrayList;
import te3.C64470jh3;
import te3.C64506kz3;
import te3.C64525lh3;

/* renamed from: kb2.j */
public final class C60996j extends C53996a<C60995i> {

    /* renamed from: d */
    public final C64525lh3 f173718d;

    public C60996j(C64525lh3 lh32) {
        C87412m.m108594g(lh32, "previewItemObj");
        this.f173718d = lh32;
    }

    /* renamed from: b */
    public C45252f<C39534d<C60995i>> mo70650e(LifecycleScope lifecycleScope, C53998c<C60995i> cVar) {
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C39534d dVar = new C39534d(cVar);
        C54637q qVar = new C54637q();
        int size = this.f173718d.f184107e.size();
        for (int i = 0; i < size; i++) {
            C64506kz3 kz32 = this.f173718d.f184107e.get(i);
            C64470jh3 jh32 = kz32.f184006d;
            if (jh32 != null) {
                boolean z = C87412m.m108589b(this.f173718d.f184108f, kz32.f184007e) && C87412m.m108589b(this.f173718d.f184109g, jh32.f183796d);
                ArrayList<T> arrayList = dVar.f106151b;
                String str = jh32.f183796d;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                String str3 = kz32.f184007e;
                if (str3 != null) {
                    str2 = str3;
                }
                C60995i iVar = new C60995i(str, 0, jh32, str2);
                iVar.f173715h = true;
                iVar.f173716i = z;
                arrayList.add(iVar);
            }
        }
        qVar.mo75539t(dVar);
        return new C58057l(qVar);
    }
}
