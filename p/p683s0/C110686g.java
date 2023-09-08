package p683s0;

import gy3.C87412m;
import java.util.List;
import java.util.Map;
import p175j0.C60647d0;
import p683s0.C110679f;

/* renamed from: s0.g */
public final class C110686g implements C60647d0 {

    /* renamed from: a */
    public final /* synthetic */ C110679f.C110682c f331108a;

    /* renamed from: b */
    public final /* synthetic */ C110679f f331109b;

    /* renamed from: c */
    public final /* synthetic */ Object f331110c;

    public C110686g(C110679f.C110682c cVar, C110679f fVar, Object obj) {
        this.f331108a = cVar;
        this.f331109b = fVar;
        this.f331110c = obj;
    }

    public void dispose() {
        C110679f.C110682c cVar = this.f331108a;
        Map<Object, Map<String, List<Object>>> map = this.f331109b.f331092a;
        cVar.getClass();
        C87412m.m108594g(map, "map");
        if (cVar.f331098b) {
            map.put(cVar.f331097a, ((C36599j) cVar.f331099c).mo60746c());
        }
        this.f331109b.f331093b.remove(this.f331110c);
    }
}
