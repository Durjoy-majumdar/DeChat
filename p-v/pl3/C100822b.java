package pl3;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import gy3.C87412m;

/* renamed from: pl3.b */
public final class C100822b {

    /* renamed from: a */
    public final int f295334a;

    /* renamed from: b */
    public CharSequence f295335b = "";

    public C100822b(int i, int i2, int i3) {
        this.f295334a = i3;
    }

    /* renamed from: a */
    public final boolean mo140271a(CharSequence charSequence) {
        C87412m.m108594g(charSequence, "newText");
        CharSequence charSequence2 = this.f295335b;
        C87412m.m108594g(charSequence2, "currentText");
        if ((charSequence instanceof String ? charSequence.hashCode() : ((charSequence instanceof SpannableString) || (charSequence instanceof SpannableStringBuilder) || (charSequence instanceof SpannedString)) ? charSequence.toString().hashCode() : -1) != (((charSequence2 instanceof SpannableString) || (charSequence2 instanceof SpannableStringBuilder) || (charSequence2 instanceof SpannedString)) ? charSequence2.toString().hashCode() : charSequence2 instanceof String ? charSequence2.hashCode() : 0)) {
            return false;
        }
        return C87412m.m108589b(charSequence2.toString(), charSequence.toString());
    }
}
