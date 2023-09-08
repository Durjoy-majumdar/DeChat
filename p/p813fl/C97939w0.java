package p813fl;

import gy3.C87412m;
import p490dl.C58320u;

/* renamed from: fl.w0 */
public final class C97939w0 extends C97927q0 {

    /* renamed from: b */
    public final C58320u f287274b;

    /* renamed from: c */
    public final boolean f287275c;

    /* renamed from: d */
    public final int f287276d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97939w0(C58320u uVar, boolean z, int i) {
        super(1);
        C87412m.m108594g(uVar, "smileyInfo");
        this.f287274b = uVar;
        this.f287275c = z;
        this.f287276d = i;
    }

    public boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof C97939w0)) {
            C97939w0 w0Var = (C97939w0) obj;
            return w0Var.f287275c == this.f287275c && C87412m.m108589b(w0Var.f287274b.f166996a, this.f287274b.f166996a);
        }
    }
}
