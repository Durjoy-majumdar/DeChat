package lz2;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import lz2.C46927m;
import rx3.C13598b0;

/* renamed from: lz2.n */
public final class C46939n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f126189d;

    public C46939n(String str) {
        this.f126189d = str;
    }

    public final void run() {
        Map<Integer, C46927m.C46933f> map = C46927m.f126174b;
        String str = this.f126189d;
        synchronized (map) {
            ArrayList<Number> arrayList = new ArrayList<>();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (C87412m.m108589b(((C46927m.C46933f) entry.getValue()).f126180a, str)) {
                    if (((C46927m.C46933f) entry.getValue()).mo72121a().get() == null) {
                        arrayList.add(entry.getKey());
                    } else {
                        C46927m.C46933f fVar = (C46927m.C46933f) entry.getValue();
                        if (fVar.mo72121a().get() != null) {
                            fVar.mo72122b();
                        }
                    }
                }
            }
            for (Number intValue : arrayList) {
                C46927m.f126174b.remove(Integer.valueOf(intValue.intValue()));
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
