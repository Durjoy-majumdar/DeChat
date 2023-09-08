package z04;

import gy3.C87412m;
import java.util.NoSuchElementException;

/* renamed from: z04.g0 */
public class C91602g0 extends C91601e0 {
    /* renamed from: k0 */
    public static final char m114943k0(CharSequence charSequence) {
        C87412m.m108594g(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: l0 */
    public static final Character m114944l0(CharSequence charSequence) {
        C87412m.m108594g(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    /* renamed from: m0 */
    public static final char m114945m0(CharSequence charSequence) {
        C87412m.m108594g(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(C112550d0.m153765A(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: n0 */
    public static final char m114946n0(CharSequence charSequence) {
        C87412m.m108594g(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        } else if (length == 1) {
            return charSequence.charAt(0);
        } else {
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
    }

    /* renamed from: o0 */
    public static final String m114947o0(String str, int i) {
        C87412m.m108594g(str, "<this>");
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(0, i);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: p0 */
    public static final String m114948p0(String str, int i) {
        C87412m.m108594g(str, "<this>");
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(length - i);
            C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
