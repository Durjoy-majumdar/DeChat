package p174iz;

import di3.C86312j;
import f62.C31924c1;
import java.util.Map;
import o03.C21723h;
import o03.C47322f;
import ob0.C35136m;

/* renamed from: iz.e */
public class C33452e implements C31924c1 {
    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        if (map != null && str != null && str.equals("mmsearch_reddot_new")) {
            C47322f fVar = (C47322f) C86312j.m106911c(C47322f.class);
            C21723h hVar = fVar.f127003e;
            if (hVar == null) {
                synchronized (fVar) {
                    hVar = fVar.f127003e;
                    if (hVar == null) {
                        hVar = new C21723h();
                        fVar.f127003e = hVar;
                    }
                }
            }
            hVar.mo34000k(map, "");
        }
    }
}
