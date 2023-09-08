package i61;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import java.util.regex.Pattern;

/* renamed from: i61.e */
public class C33212e {

    /* renamed from: c */
    public static C33212e f90108c;

    /* renamed from: a */
    public boolean f90109a = false;

    /* renamed from: b */
    public Pattern f90110b = Pattern.compile("_\\d");

    /* renamed from: b */
    public static C33212e m39992b() {
        if (f90108c == null) {
            synchronized (C33212e.class) {
                f90108c = new C33212e();
            }
        }
        return f90108c;
    }

    /* renamed from: a */
    public void mo59025a(String str) {
        C86009m1[] u;
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119967g() && m1Var.mo119977o() && (u = m1Var.mo119984u()) != null && u.length > 0) {
            for (C86009m1 m1Var2 : u) {
                if (m1Var2.mo119977o()) {
                    mo59025a(m1Var2.mo119976n());
                } else {
                    m1Var2.getName();
                    m1Var2.mo119966f();
                }
            }
        }
    }

    /* renamed from: c */
    public void mo59026c(String str) {
        C86009m1[] u;
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119967g() && m1Var.mo119977o() && (u = m1Var.mo119984u()) != null && u.length > 0) {
            int length = u.length;
            int i = 0;
            while (i < length) {
                C86009m1 m1Var2 = u[i];
                if (this.f90109a) {
                    if (m1Var2.mo119977o()) {
                        mo59026c(m1Var2.mo119976n());
                    } else {
                        String name = m1Var2.getName();
                        if (this.f90110b.matcher(name).find() || name.startsWith("temp")) {
                            m1Var2.mo119966f();
                        }
                    }
                    i++;
                } else {
                    Log.m105924i("MicroMsg.emoji.EmojiFileCleanTaskManager", "stop run");
                    return;
                }
            }
        }
    }
}
