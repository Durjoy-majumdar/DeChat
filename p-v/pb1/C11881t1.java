package pb1;

import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import f40.C86709a0;
import java.util.Set;
import wa3.C15059k;

/* renamed from: pb1.t1 */
public class C11881t1 {

    /* renamed from: a */
    public static String f34719a = "";

    /* renamed from: b */
    public static Set<String> f34720b;

    static {
        if (!C15059k.f41193a) {
            synchronized (C15059k.class) {
                if (!C15059k.f41193a) {
                    C15059k.m14229a();
                    C15059k.f41193a = true;
                }
            }
        }
    }

    /* renamed from: a */
    public static String m11563a(boolean z) {
        if (z) {
            return C86709a0.m107535s().f251806d;
        }
        if (Util.isNullOrNil(f34719a)) {
            f34719a = C112760b.m154231g();
        }
        return f34719a;
    }

    /* renamed from: b */
    public static String m11564b() {
        StringBuilder sb = new StringBuilder();
        C86009m1 m1Var = new C86009m1(m11563a(false), "wenote/html/upload");
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        sb.append(m1Var.mo119971i());
        sb.append("/");
        sb.append("wenoteupload.htm");
        return sb.toString();
    }

    /* renamed from: c */
    public static String m11565c() {
        C86009m1 m1Var = new C86009m1(m11563a(true), "wenote/image/localpath");
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        return m1Var.mo119971i();
    }
}
