package eb0;

import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C116756s5;

/* renamed from: eb0.g5 */
public class C116732g5 extends C116756s5.C116757a {
    public C116732g5(C116756s5 s5Var) {
        super(s5Var, (C116732g5) null);
    }

    /* renamed from: a */
    public boolean mo180719a(C58543t4 t4Var) {
        if (System.currentTimeMillis() - t4Var.f167585f <= 3600000 || Util.getInt(t4Var.f167584e, 0) <= 0) {
            return false;
        }
        C116756s5.m164689b(23, t4Var.f167584e + "_" + 3);
        t4Var.f167584e = "0";
        t4Var.f167585f = System.currentTimeMillis();
        return true;
    }
}
