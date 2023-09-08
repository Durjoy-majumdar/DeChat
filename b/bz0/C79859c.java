package bz0;

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: bz0.c */
public final class C79859c implements InputFilter {
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        valueOf.setSpan(new C79905u(Util.currentTicks()), 0, valueOf.length(), 18);
        return valueOf;
    }
}
