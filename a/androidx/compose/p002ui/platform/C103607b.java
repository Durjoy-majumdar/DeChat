package androidx.compose.p002ui.platform;

import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C8480h;
import gy3.C87412m;
import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: androidx.compose.ui.platform.b */
public class C103607b extends C103605a {

    /* renamed from: d */
    public static C103607b f306053d;

    /* renamed from: c */
    public BreakIterator f306054c;

    public C103607b(Locale locale, C8480h hVar) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        C87412m.m108593f(characterInstance, "getCharacterInstance(locale)");
        this.f306054c = characterInstance;
    }

    /* renamed from: a */
    public int[] mo144709a(int i) {
        int length = mo144708d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.f306054c;
            if (breakIterator == null) {
                C87412m.m108603p("impl");
                throw null;
            } else if (!breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.f306054c;
                if (breakIterator2 != null) {
                    i = breakIterator2.following(i);
                } else {
                    C87412m.m108603p("impl");
                    throw null;
                }
            } else {
                BreakIterator breakIterator3 = this.f306054c;
                if (breakIterator3 != null) {
                    int following = breakIterator3.following(i);
                    if (following == -1) {
                        return null;
                    }
                    return mo144707c(i, following);
                }
                C87412m.m108603p("impl");
                throw null;
            }
        } while (i != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f306054c;
            if (breakIterator == null) {
                C87412m.m108603p("impl");
                throw null;
            } else if (!breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.f306054c;
                if (breakIterator2 != null) {
                    i = breakIterator2.preceding(i);
                } else {
                    C87412m.m108603p("impl");
                    throw null;
                }
            } else {
                BreakIterator breakIterator3 = this.f306054c;
                if (breakIterator3 != null) {
                    int preceding = breakIterator3.preceding(i);
                    if (preceding == -1) {
                        return null;
                    }
                    return mo144707c(preceding, i);
                }
                C87412m.m108603p("impl");
                throw null;
            }
        } while (i != -1);
        return null;
    }

    /* renamed from: e */
    public void mo144711e(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        this.f306049a = str;
        BreakIterator breakIterator = this.f306054c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            C87412m.m108603p("impl");
            throw null;
        }
    }
}
