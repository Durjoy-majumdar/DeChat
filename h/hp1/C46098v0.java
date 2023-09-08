package hp1;

import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import er1.C58741j5;
import hp1.C46091u0;

/* renamed from: hp1.v0 */
public final class C46098v0 implements Runnable {

    /* renamed from: d */
    public static final C46098v0 f124266d = new C46098v0();

    public final void run() {
        StringBuilder sb = new StringBuilder();
        C58741j5 j5Var = C58741j5.f168184a;
        sb.append(C58741j5.f168194k);
        sb.append("search-history.info");
        String sb4 = sb.toString();
        C86009m1 m1Var = new C86009m1(sb4);
        C46091u0.C46096e eVar = C46091u0.C46096e.f124260a;
        byte[] byteArray = C46091u0.C46096e.f124261b.toByteArray();
        if (!C86013q1.m106450k(String.valueOf(m1Var.mo119974l()))) {
            C86013q1.m106461v(String.valueOf(m1Var.mo119974l()));
        }
        C86013q1.m106437S(sb4, byteArray);
    }
}
