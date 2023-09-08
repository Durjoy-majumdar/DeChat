package pj0;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import s24.C90125c;

/* renamed from: pj0.g */
public class C89362g {

    /* renamed from: a */
    public static final ClassLoader f257343a = C89362g.class.getClassLoader();

    /* renamed from: b */
    public static boolean f257344b = false;

    /* renamed from: a */
    public static C86009m1 m111693a(String str, String str2) {
        BufferedOutputStream bufferedOutputStream;
        Throwable th;
        BufferedInputStream bufferedInputStream;
        C86009m1 c = C86009m1.m106378c(MMApplicationContext.getContext().getDir("magicbrush", 0));
        if (c.mo119967g() || c.mo119987x()) {
            C86009m1 m1Var = new C86009m1(c, str);
            try {
                bufferedInputStream = new BufferedInputStream(C86013q1.m106423E(str2));
                try {
                    bufferedOutputStream = new BufferedOutputStream(C86013q1.m106426H(m1Var));
                    try {
                        C90125c.m112775b(bufferedInputStream, bufferedOutputStream);
                        C90125c.m112774a(bufferedInputStream);
                        C90125c.m112774a(bufferedOutputStream);
                        return m1Var;
                    } catch (Throwable th4) {
                        th = th4;
                        C90125c.m112774a(bufferedInputStream);
                        C90125c.m112774a(bufferedOutputStream);
                        throw th;
                    }
                } catch (Throwable th5) {
                    Throwable th6 = th5;
                    bufferedOutputStream = null;
                    th = th6;
                    C90125c.m112774a(bufferedInputStream);
                    C90125c.m112774a(bufferedOutputStream);
                    throw th;
                }
            } catch (Throwable th7) {
                bufferedInputStream = null;
                th = th7;
                bufferedOutputStream = null;
                C90125c.m112774a(bufferedInputStream);
                C90125c.m112774a(bufferedOutputStream);
                throw th;
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
