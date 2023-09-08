package p1132m5;

import coil.memory.MemoryCache$Key;
import gy3.C87412m;
import p1106e5.C107230c;
import p1132m5.C109518n;

/* renamed from: m5.l */
public final class C109514l {

    /* renamed from: a */
    public final C107230c f327767a;

    /* renamed from: b */
    public final C109527r f327768b;

    /* renamed from: c */
    public final C109530u f327769c;

    public C109514l(C107230c cVar, C109527r rVar, C109530u uVar) {
        C87412m.m108594g(cVar, "referenceCounter");
        C87412m.m108594g(rVar, "strongMemoryCache");
        C87412m.m108594g(uVar, "weakMemoryCache");
        this.f327767a = cVar;
        this.f327768b = rVar;
        this.f327769c = uVar;
    }

    /* renamed from: a */
    public final C109518n.C109519a mo160743a(MemoryCache$Key memoryCache$Key) {
        if (memoryCache$Key == null) {
            return null;
        }
        C109518n.C109519a b = this.f327768b.mo160732b(memoryCache$Key);
        if (b == null) {
            b = this.f327769c.mo160735b(memoryCache$Key);
        }
        if (b != null) {
            this.f327767a.mo157703c(b.getBitmap());
        }
        return b;
    }
}
