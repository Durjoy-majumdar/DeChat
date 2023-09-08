package qk1;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: qk1.g1 */
public final class C12801g1 implements InputFilter {

    /* renamed from: d */
    public final /* synthetic */ C12794c1 f36639d;

    public C12801g1(C12794c1 c1Var) {
        this.f36639d = c1Var;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence.toString().contentEquals("\n")) {
            this.f36639d.f36625j = false;
        } else if (charSequence.toString().contentEquals(" ")) {
            C12794c1 c1Var = this.f36639d;
            if (!c1Var.f36625j) {
                c1Var.f36625j = true;
                return null;
            }
        } else {
            this.f36639d.f36625j = false;
            return null;
        }
        return "";
    }
}
