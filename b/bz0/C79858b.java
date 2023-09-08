package bz0;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import gy3.C87412m;

/* renamed from: bz0.b */
public final class C79858b extends Spannable.Factory {
    public Spannable newSpannable(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        C87412m.m108593f(valueOf, "valueOf(source ?: \"\")");
        return valueOf;
    }
}
