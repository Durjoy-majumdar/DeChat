package mc0;

import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;

/* renamed from: mc0.b */
public class C34542b {

    /* renamed from: a */
    public static final String f92924a = (C112760b.m154195C() + ".tmp");

    /* renamed from: b */
    public static long f92925b = 0;

    /* renamed from: a */
    public static boolean m40382a() {
        C86009m1 m1Var = new C86009m1(f92924a);
        try {
            if (m1Var.mo119967g()) {
                if (!m1Var.mo119978p()) {
                    m40383b(m1Var, true);
                }
            }
            return true;
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] clean tmp file path exception.");
            return false;
        }
    }

    /* renamed from: b */
    public static void m40383b(C86009m1 m1Var, boolean z) {
        if (m1Var != null && m1Var.mo119967g() && m1Var.mo119977o()) {
            C86009m1[] u = m1Var.mo119984u();
            if (u != null && u.length > 0) {
                for (C86009m1 m1Var2 : u) {
                    if (m1Var2 != null && m1Var2.mo119967g()) {
                        if (!m1Var2.mo119978p()) {
                            long q = m1Var2.mo119979q();
                            long currentTimeMillis = System.currentTimeMillis();
                            boolean z2 = true;
                            Log.m105919d("MicroMsg.imageloader.ImageTmpFilehUtils", "[cpan] can delete current time:%d,listModified:%d", Long.valueOf(currentTimeMillis), Long.valueOf(q));
                            if (currentTimeMillis - q < 259200000) {
                                z2 = false;
                            }
                            if (z2 && z) {
                                m40383b(m1Var2, false);
                            }
                        } else if (m1Var2.mo119978p() && m1Var2.mo119967g()) {
                            m1Var2.mo119966f();
                        }
                    }
                }
            }
            m1Var.mo119966f();
        }
    }
}
