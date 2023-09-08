package z04;

import java.util.regex.Matcher;

/* renamed from: z04.l */
public final class C53732l {
    /* renamed from: a */
    public static final C66716g m60231a(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new C66717h(matcher, charSequence);
    }
}
