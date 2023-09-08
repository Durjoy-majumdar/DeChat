package p155g0;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p1166z0.C112545k;
import p436a1.C103220a;
import p436a1.C103229d0;
import p436a1.C103251o;
import p436a1.C103274x;
import p436a1.C103276y;
import p544h2.C32658d;
import p868x0.C111978c;
import p868x0.C111985j;

/* renamed from: g0.d */
public final class C107614d extends C87413o implements C32226l<C111978c, C111985j> {

    /* renamed from: d */
    public final /* synthetic */ long f321990d;

    /* renamed from: e */
    public final /* synthetic */ boolean f321991e;

    /* renamed from: f */
    public final /* synthetic */ C32658d f321992f;

    /* renamed from: g */
    public final /* synthetic */ boolean f321993g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107614d(long j, boolean z, C32658d dVar, boolean z2) {
        super(1);
        this.f321990d = j;
        this.f321991e = z;
        this.f321992f = dVar;
        this.f321993g = z2;
    }

    public Object invoke(Object obj) {
        C111978c cVar = (C111978c) obj;
        C87412m.m108594g(cVar, "$this$drawWithCache");
        C103229d0 d = C107594a.m145755d(cVar, C112545k.m153758d(cVar.mo163642e()) / 2.0f);
        long j = this.f321990d;
        return cVar.mo163641a(new C107609c(this.f321991e, this.f321992f, this.f321993g, d, new C103274x(Build.VERSION.SDK_INT >= 29 ? C103251o.f304456a.mo143024a(j, 5) : new PorterDuffColorFilter(C103276y.m136796g(j), C103220a.m136601b(5)))));
    }
}
