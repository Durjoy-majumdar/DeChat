package qk1;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: qk1.a0 */
public final class C63195a0 implements InputFilter {

    /* renamed from: d */
    public final /* synthetic */ C63257t f179299d;

    public C63195a0(C63257t tVar) {
        this.f179299d = tVar;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence.toString().contentEquals("\n")) {
            this.f179299d.f179518u = false;
        } else if (charSequence.toString().contentEquals(" ")) {
            C63257t tVar = this.f179299d;
            if (!tVar.f179518u) {
                tVar.f179518u = true;
                return null;
            }
        } else {
            this.f179299d.f179518u = false;
            return null;
        }
        return "";
    }
}
