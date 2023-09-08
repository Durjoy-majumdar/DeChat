package sx3;

import com.google.firebase.analytics.FirebaseAnalytics;
import fy3.C32226l;
import gy3.C32617c;
import gy3.C87412m;
import hy3.C33145a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import my3.C34690i;
import my3.C61594j;
import y04.C112346d;
import y04.C15925h;
import z04.C66724o;

/* renamed from: sx3.p */
public class C110823p extends C110821n {

    /* renamed from: sx3.p$a */
    public static final class C101707a implements Iterable<T>, C33145a {

        /* renamed from: d */
        public final /* synthetic */ Object[] f297764d;

        public C101707a(Object[] objArr) {
            this.f297764d = objArr;
        }

        public Iterator<T> iterator() {
            return C32617c.m39769a(this.f297764d);
        }
    }

    /* renamed from: sx3.p$b */
    public static final class C101708b implements C15925h<T> {

        /* renamed from: a */
        public final /* synthetic */ Object[] f297765a;

        public C101708b(Object[] objArr) {
            this.f297765a = objArr;
        }

        public Iterator<T> iterator() {
            return C32617c.m39769a(this.f297765a);
        }
    }

    /* renamed from: A */
    public static final int m150975A(int[] iArr) {
        C87412m.m108594g(iArr, "<this>");
        if (!(iArr.length == 0)) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: B */
    public static final <T> T m150976B(T[] tArr) {
        C87412m.m108594g(tArr, "<this>");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: C */
    public static final Integer m150977C(int[] iArr) {
        C87412m.m108594g(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    /* renamed from: D */
    public static final <T> T m150978D(T[] tArr) {
        C87412m.m108594g(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: E */
    public static final <T> int m150979E(T[] tArr) {
        C87412m.m108594g(tArr, "<this>");
        return tArr.length - 1;
    }

    /* renamed from: F */
    public static final Character m150980F(char[] cArr, int i) {
        C87412m.m108594g(cArr, "<this>");
        if (i < 0 || i > cArr.length - 1) {
            return null;
        }
        return Character.valueOf(cArr[i]);
    }

    /* renamed from: G */
    public static final Integer m150981G(int[] iArr, int i) {
        C87412m.m108594g(iArr, "<this>");
        if (i < 0 || i > iArr.length - 1) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    /* renamed from: H */
    public static final <T> T m150982H(T[] tArr, int i) {
        C87412m.m108594g(tArr, "<this>");
        if (i < 0 || i > tArr.length - 1) {
            return null;
        }
        return tArr[i];
    }

    /* renamed from: I */
    public static final int m150983I(int[] iArr, int i) {
        C87412m.m108594g(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: J */
    public static final <T> int m150984J(T[] tArr, T t) {
        C87412m.m108594g(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (C87412m.m108589b(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: K */
    public static final <T, A extends Appendable> A m150985K(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C32226l<? super T, ? extends CharSequence> lVar) {
        C87412m.m108594g(tArr, "<this>");
        C87412m.m108594g(a, "buffer");
        C87412m.m108594g(charSequence, "separator");
        C87412m.m108594g(charSequence2, "prefix");
        C87412m.m108594g(charSequence3, "postfix");
        C87412m.m108594g(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C66724o.m78727a(a, t, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: L */
    public static String m150986L(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C32226l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        C87412m.m108594g(bArr, "<this>");
        C87412m.m108594g(charSequence, "separator");
        C87412m.m108594g(charSequence2, "prefix");
        C87412m.m108594g(charSequence3, "postfix");
        C87412m.m108594g(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int i3 = 0;
        for (byte b : bArr) {
            i3++;
            if (i3 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i3 > i) {
                break;
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.invoke(Byte.valueOf(b)));
            } else {
                sb.append(String.valueOf(b));
            }
        }
        if (i >= 0 && i3 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb4;
    }

    /* renamed from: M */
    public static String m150987M(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C32226l lVar, int i2, Object obj) {
        String str = (i2 & 1) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i3 = (i2 & 8) != 0 ? -1 : i;
        String str2 = (i2 & 16) != 0 ? "..." : charSequence4;
        C32226l lVar2 = (i2 & 32) != 0 ? null : lVar;
        Object[] objArr2 = objArr;
        C87412m.m108594g(objArr, "<this>");
        C87412m.m108594g(str, "separator");
        C87412m.m108594g(charSequence6, "prefix");
        C87412m.m108594g(charSequence5, "postfix");
        C87412m.m108594g(str2, "truncated");
        StringBuilder sb = new StringBuilder();
        m150985K(objArr, sb, str, charSequence6, charSequence5, i3, str2, lVar2);
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb4;
    }

    /* renamed from: N */
    public static final int m150988N(int[] iArr) {
        C87412m.m108594g(iArr, "<this>");
        if (!(iArr.length == 0)) {
            return iArr[iArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: O */
    public static final <T> T m150989O(T[] tArr) {
        C87412m.m108594g(tArr, "<this>");
        if (!(tArr.length == 0)) {
            return tArr[tArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: P */
    public static final Integer m150990P(int[] iArr) {
        C87412m.m108594g(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        C36904l0 i2 = new C61594j(1, iArr.length - 1).iterator();
        while (((C34690i) i2).f93287f) {
            int i3 = iArr[i2.mo59695a()];
            if (i < i3) {
                i = i3;
            }
        }
        return Integer.valueOf(i);
    }

    /* renamed from: Q */
    public static final Integer m150991Q(int[] iArr) {
        C87412m.m108594g(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        C36904l0 i2 = new C61594j(1, iArr.length - 1).iterator();
        while (((C34690i) i2).f93287f) {
            int i3 = iArr[i2.mo59695a()];
            if (i > i3) {
                i = i3;
            }
        }
        return Integer.valueOf(i);
    }

    /* renamed from: R */
    public static final char m150992R(char[] cArr) {
        C87412m.m108594g(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: S */
    public static final <T> T m150993S(T[] tArr) {
        C87412m.m108594g(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return tArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: T */
    public static final List<Float> m150994T(float[] fArr, C61594j jVar) {
        C87412m.m108594g(fArr, "<this>");
        C87412m.m108594g(jVar, "indices");
        if (jVar.isEmpty()) {
            return C64186f0.f181907d;
        }
        int intValue = jVar.mo59687f0().intValue();
        int intValue2 = jVar.mo59688g0().intValue() + 1;
        C64192l.m75528a(intValue2, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, intValue, intValue2);
        C87412m.m108593f(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return new C64193o(copyOfRange);
    }

    /* renamed from: U */
    public static final <T> List<T> m150995U(T[] tArr, Comparator<? super T> comparator) {
        C87412m.m108594g(tArr, "<this>");
        C87412m.m108594g(comparator, "comparator");
        if (!(tArr.length == 0)) {
            tArr = Arrays.copyOf(tArr, tArr.length);
            C87412m.m108593f(tArr, "copyOf(this, size)");
            C110821n.m150973t(tArr, comparator);
        }
        return C110821n.m150958e(tArr);
    }

    /* renamed from: V */
    public static final <T> List<T> m150996V(T[] tArr, int i) {
        C87412m.m108594g(tArr, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return C64186f0.f181907d;
        } else {
            if (i >= tArr.length) {
                return m151001a0(tArr);
            }
            if (i == 1) {
                return C26236u.m33719b(tArr[0]);
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (T add : tArr) {
                arrayList.add(add);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
    }

    /* renamed from: W */
    public static final <T, C extends Collection<? super T>> C m150997W(T[] tArr, C c) {
        C87412m.m108594g(tArr, "<this>");
        C87412m.m108594g(c, FirebaseAnalytics.C113379b.DESTINATION);
        for (T add : tArr) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: X */
    public static final List<Float> m150998X(float[] fArr) {
        C87412m.m108594g(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return C64186f0.f181907d;
        }
        if (length == 1) {
            return C26236u.m33719b(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: Y */
    public static final List<Integer> m150999Y(int[] iArr) {
        C87412m.m108594g(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? m151002b0(iArr) : C26236u.m33719b(Integer.valueOf(iArr[0])) : C64186f0.f181907d;
    }

    /* renamed from: Z */
    public static final List<Long> m151000Z(long[] jArr) {
        C87412m.m108594g(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return C64186f0.f181907d;
        }
        if (length == 1) {
            return C26236u.m33719b(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: a0 */
    public static final <T> List<T> m151001a0(T[] tArr) {
        C87412m.m108594g(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? m151003c0(tArr) : C26236u.m33719b(tArr[0]) : C64186f0.f181907d;
    }

    /* renamed from: b0 */
    public static final List<Integer> m151002b0(int[] iArr) {
        C87412m.m108594g(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: c0 */
    public static final <T> List<T> m151003c0(T[] tArr) {
        C87412m.m108594g(tArr, "<this>");
        return new ArrayList(new C64189j(tArr, false));
    }

    /* renamed from: d0 */
    public static final <T> Set<T> m151004d0(T[] tArr) {
        C87412m.m108594g(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return C64187h0.f181908d;
        }
        if (length == 1) {
            return C22415w0.m26092a(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C90363p0.m113142a(tArr.length));
        m150997W(tArr, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: u */
    public static final <T> Iterable<T> m151005u(T[] tArr) {
        C87412m.m108594g(tArr, "<this>");
        return tArr.length == 0 ? C64186f0.f181907d : new C101707a(tArr);
    }

    /* renamed from: v */
    public static final <T> C15925h<T> m151006v(T[] tArr) {
        C87412m.m108594g(tArr, "<this>");
        return tArr.length == 0 ? C112346d.f336375a : new C101708b(tArr);
    }

    /* renamed from: w */
    public static final boolean m151007w(char[] cArr, char c) {
        C87412m.m108594g(cArr, "<this>");
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (c == cArr[i]) {
                break;
            } else {
                i++;
            }
        }
        return i >= 0;
    }

    /* renamed from: x */
    public static final boolean m151008x(int[] iArr, int i) {
        C87412m.m108594g(iArr, "<this>");
        return m150983I(iArr, i) >= 0;
    }

    /* renamed from: y */
    public static final <T> boolean m151009y(T[] tArr, T t) {
        C87412m.m108594g(tArr, "<this>");
        return m150984J(tArr, t) >= 0;
    }

    /* renamed from: z */
    public static final <T> List<T> m151010z(T[] tArr) {
        C87412m.m108594g(tArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
