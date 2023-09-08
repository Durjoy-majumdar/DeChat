package ud0;

import gy3.C87412m;
import java.util.ArrayList;
import ud0.C22624a;
import wd0.C22894a;
import zd0.C23489q;

/* renamed from: ud0.g */
public final class C22641g implements C23489q {

    /* renamed from: a */
    public final /* synthetic */ C22624a.C22626b f65130a;

    public C22641g(C22624a.C22626b bVar) {
        this.f65130a = bVar;
    }

    /* renamed from: a */
    public void mo22182a(String str, boolean z, int i) {
        C87412m.m108594g(str, "templateId");
        C22894a aVar = C22894a.f65798a;
        if (i < C22894a.f65801d) {
            ArrayList arrayList = (ArrayList) C22894a.f65800c;
            arrayList.set(i, Integer.valueOf(((Number) arrayList.get(i)).intValue() + 1));
        }
        aVar.mo36069a(5, this.f65130a.f65096s);
    }
}
