package p1014o4;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import p1169a5.C112758b;
import p1206p4.C117975g;
import p1206p4.C117979k;
import p1222y4.C118920e;

/* renamed from: o4.v */
public abstract class C117706v {
    /* renamed from: a */
    public final C117696p mo182397a(C100281w wVar) {
        List singletonList = Collections.singletonList(wVar);
        C117979k kVar = (C117979k) this;
        if (!singletonList.isEmpty()) {
            C117975g gVar = new C117975g(kVar, singletonList);
            if (!gVar.f352596h) {
                C118920e eVar = new C118920e(gVar);
                ((C112758b) kVar.f352607d).mo164514a(eVar);
                gVar.f352597i = eVar.f356200e;
            } else {
                C117693m.m165966c().mo182392f(C117975g.f352588j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", gVar.f352593e)}), new Throwable[0]);
            }
            return gVar.f352597i;
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }
}
