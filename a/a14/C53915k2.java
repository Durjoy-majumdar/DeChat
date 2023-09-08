package a14;

import f14.C58901s;

/* renamed from: a14.k2 */
public abstract class C53915k2 extends C53896h0 {
    /* renamed from: i0 */
    public abstract C53915k2 mo74590i0();

    public String toString() {
        String str;
        C53915k2 k2Var;
        C53896h0 h0Var = C53872d1.f151117a;
        C53915k2 k2Var2 = C58901s.f168555a;
        if (this == k2Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                k2Var = k2Var2.mo74590i0();
            } catch (UnsupportedOperationException unused) {
                k2Var = null;
            }
            str = this == k2Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + C53942r0.m60572a(this);
    }
}
