package p1028re;

import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import sx3.C64197v;

/* renamed from: re.b */
public final class C89929b {

    /* renamed from: a */
    public final boolean f258421a;

    /* renamed from: b */
    public final ArrayList<Long> f258422b;

    public C89929b() {
        this(false, (ArrayList) null, 3, (C8480h) null);
    }

    public C89929b(boolean z, ArrayList<Long> arrayList) {
        C87412m.m108594g(arrayList, "delayMillis");
        this.f258421a = z;
        this.f258422b = arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C89929b)) {
            return false;
        }
        C89929b bVar = (C89929b) obj;
        return this.f258421a == bVar.f258421a && C87412m.m108589b(this.f258422b, bVar.f258422b);
    }

    public int hashCode() {
        boolean z = this.f258421a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        ArrayList<Long> arrayList = this.f258422b;
        return i + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public String toString() {
        return "TrimMemoryConfig(enable=" + this.f258421a + ", delayMillis=" + this.f258422b + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C89929b(boolean z, ArrayList arrayList, int i, C8480h hVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C64197v.m75534c(Long.valueOf(TimeUnit.MINUTES.toMillis(1))) : arrayList);
    }
}
