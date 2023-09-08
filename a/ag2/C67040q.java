package ag2;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Comparator;

/* renamed from: ag2.q */
public class C67040q implements Comparator<C67038p> {

    /* renamed from: d */
    public final /* synthetic */ C67042s f192585d;

    public C67040q(C67042s sVar) {
        this.f192585d = sVar;
    }

    public int compare(Object obj, Object obj2) {
        C67038p pVar = (C67038p) obj;
        C67038p pVar2 = (C67038p) obj2;
        if (Util.isAlpha(C67042s.m79223a(this.f192585d, pVar.f192578h)) && Util.isAlpha(C67042s.m79223a(this.f192585d, pVar2.f192578h))) {
            return pVar.f192578h.compareTo(pVar2.f192578h);
        }
        if (Util.isAlpha(C67042s.m79223a(this.f192585d, pVar.f192578h))) {
            return -1;
        }
        if (Util.isAlpha(C67042s.m79223a(this.f192585d, pVar2.f192578h))) {
            return 1;
        }
        return pVar.f192578h.compareTo(pVar2.f192578h);
    }
}
