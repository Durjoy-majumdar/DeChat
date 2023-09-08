package ea3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;

/* renamed from: ea3.a */
public class C7607a {
    /* renamed from: a */
    public static void m7741a(C86009m1 m1Var) {
        if (m1Var != null) {
            if (m1Var.mo119977o()) {
                for (C86009m1 a : m1Var.mo119984u()) {
                    m7741a(a);
                }
            }
            Log.m105925i("MicroMsg.ABI64WebViewCompat", "delete isSuccessDelete: %s fileName: %s", Boolean.valueOf(m1Var.mo119966f()), m1Var.mo119971i());
        }
    }
}
