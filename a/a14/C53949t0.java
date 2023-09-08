package a14;

import f14.C58876e0;
import f14.C58901s;

/* renamed from: a14.t0 */
public final class C53949t0 {

    /* renamed from: a */
    public static final C53960w0 f151198a;

    static {
        String str;
        C53960w0 w0Var;
        int i = C58876e0.f168513a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (!(str != null ? Boolean.parseBoolean(str) : false)) {
            w0Var = C53946s0.f151194n;
        } else {
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            k2Var.mo74590i0();
            w0Var = !(k2Var instanceof C53960w0) ? C53946s0.f151194n : (C53960w0) k2Var;
        }
        f151198a = w0Var;
    }
}
