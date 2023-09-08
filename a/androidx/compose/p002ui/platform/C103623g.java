package androidx.compose.p002ui.platform;

import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C8480h;
import gy3.C87412m;
import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: androidx.compose.ui.platform.g */
public final class C103623g extends C103605a {

    /* renamed from: d */
    public static C103623g f306078d;

    /* renamed from: c */
    public BreakIterator f306079c;

    public C103623g(Locale locale, C8480h hVar) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        C87412m.m108593f(wordInstance, "getWordInstance(locale)");
        this.f306079c = wordInstance;
    }

    /* renamed from: a */
    public int[] mo144709a(int i) {
        if (mo144708d().length() <= 0 || i >= mo144708d().length()) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (!mo144724g(i)) {
            boolean z = true;
            if (!mo144724g(i) || (i != 0 && mo144724g(i - 1))) {
                z = false;
            }
            if (z) {
                break;
            }
            BreakIterator breakIterator = this.f306079c;
            if (breakIterator != null) {
                i = breakIterator.following(i);
                if (i == -1) {
                    return null;
                }
            } else {
                C87412m.m108603p("impl");
                throw null;
            }
        }
        BreakIterator breakIterator2 = this.f306079c;
        if (breakIterator2 != null) {
            int following = breakIterator2.following(i);
            if (following == -1 || !mo144723f(following)) {
                return null;
            }
            return mo144707c(i, following);
        }
        C87412m.m108603p("impl");
        throw null;
    }

    /* renamed from: b */
    public int[] mo144710b(int i) {
        int length = mo144708d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && !mo144724g(i - 1) && !mo144723f(i)) {
            BreakIterator breakIterator = this.f306079c;
            if (breakIterator != null) {
                i = breakIterator.preceding(i);
                if (i == -1) {
                    return null;
                }
            } else {
                C87412m.m108603p("impl");
                throw null;
            }
        }
        BreakIterator breakIterator2 = this.f306079c;
        if (breakIterator2 != null) {
            int preceding = breakIterator2.preceding(i);
            if (preceding != -1) {
                boolean z = true;
                if (!mo144724g(preceding) || (preceding != 0 && mo144724g(preceding - 1))) {
                    z = false;
                }
                if (z) {
                    return mo144707c(preceding, i);
                }
            }
            return null;
        }
        C87412m.m108603p("impl");
        throw null;
    }

    /* renamed from: e */
    public void mo144722e(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        this.f306049a = str;
        BreakIterator breakIterator = this.f306079c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            C87412m.m108603p("impl");
            throw null;
        }
    }

    /* renamed from: f */
    public final boolean mo144723f(int i) {
        return i > 0 && mo144724g(i + -1) && (i == mo144708d().length() || !mo144724g(i));
    }

    /* renamed from: g */
    public final boolean mo144724g(int i) {
        if (i < 0 || i >= mo144708d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(mo144708d().codePointAt(i));
    }
}
