package vn1;

import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import er1.C58741j5;
import vn1.C52962a;

/* renamed from: vn1.b */
public final class C52970b implements Runnable {

    /* renamed from: d */
    public static final C52970b f147854d = new C52970b();

    public final void run() {
        StringBuilder sb = new StringBuilder();
        C58741j5 j5Var = C58741j5.f168184a;
        sb.append(C58741j5.f168194k);
        sb.append("order-search-history.info");
        String sb4 = sb.toString();
        C86009m1 m1Var = new C86009m1(sb4);
        C52962a.C52968e eVar = C52962a.C52968e.f147848a;
        byte[] byteArray = C52962a.C52968e.f147849b.toByteArray();
        if (!C86013q1.m106450k(String.valueOf(m1Var.mo119974l()))) {
            C86013q1.m106461v(String.valueOf(m1Var.mo119974l()));
        }
        C86013q1.m106437S(sb4, byteArray);
    }
}
