package ao1;

import android.text.InputFilter;
import android.text.Spanned;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: ao1.p */
public final class C0177p implements InputFilter {
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence == null) {
            return charSequence;
        }
        String obj = charSequence.toString();
        return C112550d0.m153803w(obj, "\n", false, 2, (Object) null) ? C112551y.m153816p(obj, "\n", "", false, 4, (Object) null) : charSequence;
    }
}
