package x92;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.widget.TextView;
import di3.C86312j;
import gy3.C87412m;
import kg3.C76577a;
import p629ny.C76979h;

/* renamed from: x92.a */
public final class C15628a {

    /* renamed from: a */
    public static final C15628a f42254a = new C15628a();

    /* renamed from: a */
    public final CharSequence mo14374a(TextView textView, CharSequence charSequence, int i) {
        C87412m.m108594g(textView, "tv");
        CharSequence charSequence2 = charSequence;
        C87412m.m108594g(charSequence2, "spanText");
        Context context = textView.getContext();
        C87412m.m108593f(context, "tv.context");
        int b = C76577a.m92151b(context, (i * 12) + 1);
        Context context2 = textView.getContext();
        C87412m.m108593f(context2, "tv.context");
        int b2 = C76577a.m92151b(context2, ((i + 1) * 12) + 1);
        CharSequence charSequence3 = charSequence;
        StaticLayout staticLayout = new StaticLayout(charSequence3, 0, charSequence.length(), textView.getPaint(), b, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (new StaticLayout(charSequence3, 0, charSequence.length(), textView.getPaint(), b2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
            return charSequence2;
        }
        int lineEnd = staticLayout.getLineEnd(0);
        Context context3 = textView.getContext();
        StringBuilder sb = new StringBuilder();
        String substring = charSequence.toString().substring(0, lineEnd);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append("...");
        SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context3, sb.toString());
        C87412m.m108593f(T1, "{\n            val ellips…Start) + \"...\")\n        }");
        return T1;
    }
}
