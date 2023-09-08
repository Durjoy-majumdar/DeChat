package vp1;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import te3.C50140kk0;

/* renamed from: vp1.i */
public final class C14932i extends C87413o implements C32226l<C50140kk0, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ long f40963d;

    /* renamed from: e */
    public final /* synthetic */ C8477a0 f40964e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14932i(long j, C8477a0 a0Var) {
        super(1);
        this.f40963d = j;
        this.f40964e = a0Var;
    }

    public Object invoke(Object obj) {
        C50140kk0 kk02 = (C50140kk0) obj;
        C87412m.m108594g(kk02, "item");
        boolean z = false;
        if (kk02.f136842i == 0 && kk02.f136837d != 2) {
            FinderObject finderObject = kk02.f136839f;
            if (finderObject != null && finderObject.f164794id == this.f40963d) {
                z = true;
            }
        }
        if (z) {
            this.f40964e.f27482d = true;
        }
        return Boolean.valueOf(z);
    }
}
