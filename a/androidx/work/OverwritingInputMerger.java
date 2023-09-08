package androidx.work;

import androidx.work.C113041b;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p1014o4.C117688h;

public final class OverwritingInputMerger extends C117688h {
    /* renamed from: a */
    public C113041b mo165502a(List<C113041b> list) {
        C113041b.C113042a aVar = new C113041b.C113042a();
        HashMap hashMap = new HashMap();
        for (C113041b bVar : list) {
            hashMap.putAll(Collections.unmodifiableMap(bVar.f338353a));
        }
        aVar.mo165526a(hashMap);
        C113041b bVar2 = new C113041b((Map<String, ?>) aVar.f338354a);
        C113041b.m154668c(bVar2);
        return bVar2;
    }
}
