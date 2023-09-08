package hp1;

import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import er1.C58741j5;
import hp1.C8690s0;
import te3.C49145dh1;

/* renamed from: hp1.t0 */
public final class C8698t0 implements Runnable {

    /* renamed from: d */
    public static final C8698t0 f27922d = new C8698t0();

    public final void run() {
        StringBuilder sb = new StringBuilder();
        C58741j5 j5Var = C58741j5.f168184a;
        sb.append(C58741j5.f168194k);
        sb.append("popular.info");
        String sb4 = sb.toString();
        C86009m1 m1Var = new C86009m1(sb4);
        C49145dh1 dh12 = C8690s0.C8695e.f27918c;
        byte[] byteArray = dh12 != null ? dh12.toByteArray() : null;
        if (!C86013q1.m106450k(String.valueOf(m1Var.mo119974l()))) {
            C86013q1.m106461v(String.valueOf(m1Var.mo119974l()));
        }
        C86013q1.m106437S(sb4, byteArray);
    }
}
