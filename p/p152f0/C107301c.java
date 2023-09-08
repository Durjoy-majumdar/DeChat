package p152f0;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p1166z0.C112545k;
import p155g0.C107594a;
import p436a1.C103220a;
import p436a1.C103229d0;
import p436a1.C103251o;
import p436a1.C103274x;
import p436a1.C103276y;
import p868x0.C111978c;
import p868x0.C111985j;

/* renamed from: f0.c */
public final class C107301c extends C87413o implements C32226l<C111978c, C111985j> {

    /* renamed from: d */
    public final /* synthetic */ long f321036d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107301c(long j) {
        super(1);
        this.f321036d = j;
    }

    public Object invoke(Object obj) {
        C111978c cVar = (C111978c) obj;
        C87412m.m108594g(cVar, "$this$drawWithCache");
        float d = C112545k.m153758d(cVar.mo163642e()) / 2.0f;
        C103229d0 d2 = C107594a.m145755d(cVar, d);
        long j = this.f321036d;
        return cVar.mo163641a(new C107297b(d, d2, new C103274x(Build.VERSION.SDK_INT >= 29 ? C103251o.f304456a.mo143024a(j, 5) : new PorterDuffColorFilter(C103276y.m136796g(j), C103220a.m136601b(5)))));
    }
}
