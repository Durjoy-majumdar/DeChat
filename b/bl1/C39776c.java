package bl1;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import te3.C51836wi;

/* renamed from: bl1.c */
public final class C39776c extends C87413o implements C32226l<C51836wi, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C51836wi f106738d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39776c(C51836wi wiVar) {
        super(1);
        this.f106738d = wiVar;
    }

    public Object invoke(Object obj) {
        C51836wi wiVar = (C51836wi) obj;
        boolean z = false;
        if ((wiVar != null && wiVar.f144058d == this.f106738d.f144058d) && C87412m.m108589b(wiVar.f144060f, this.f106738d.f144060f)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
