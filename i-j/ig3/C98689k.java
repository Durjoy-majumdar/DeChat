package ig3;

import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import gy3.C87412m;
import hd0.C98408n0;
import i21.C98590g;
import p682rz.C101491u;

/* renamed from: ig3.k */
public final class C98689k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f289400d;

    /* renamed from: e */
    public final /* synthetic */ boolean f289401e;

    public C98689k(C72963f4 f4Var, boolean z) {
        this.f289400d = f4Var;
        this.f289401e = z;
    }

    public final void run() {
        C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(this.f289400d.mo108765s2());
        if (Zd != null) {
            C72963f4 f4Var = this.f289400d;
            boolean z = this.f289401e;
            int i = 1;
            C87412m.m108594g(true & true ? "" : null, "fromUser");
            String t = f4Var.mo108768t();
            C87412m.m108593f(t, "msg.talker");
            long y2 = f4Var.mo108774y2();
            long createTime = f4Var.getCreateTime();
            int i2 = Zd.f288539G > 0 ? 2 : 1;
            int i3 = Zd.f288562i;
            if (i3 == 199) {
                i = 3;
            } else if (i3 == 112 || i3 == 113) {
                i = 2;
            } else if (i3 != 111) {
                i = (i3 != 198 || f4Var.mo108769t2() == 1) ? 0 : 4;
            }
            ((C98590g) C86312j.m106911c(C98590g.class)).mo137964pp(y2, t, (long) i2, (long) i, createTime, z);
        }
    }
}
