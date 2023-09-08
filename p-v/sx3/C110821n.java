package sx3;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: sx3.n */
public class C110821n extends C110820m {

    /* renamed from: sx3.n$a */
    public static final class C110822a extends C64177c<Integer> implements RandomAccess {

        /* renamed from: e */
        public final /* synthetic */ int[] f331546e;

        public C110822a(int[] iArr) {
            this.f331546e = iArr;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return C110823p.m151008x(this.f331546e, ((Number) obj).intValue());
        }

        /* renamed from: f */
        public int mo52189f() {
            return this.f331546e.length;
        }

        public Object get(int i) {
            return Integer.valueOf(this.f331546e[i]);
        }

        public final int indexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return C110823p.m150983I(this.f331546e, ((Number) obj).intValue());
        }

        public boolean isEmpty() {
            return this.f331546e.length == 0;
        }

        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            int intValue = ((Number) obj).intValue();
            int[] iArr = this.f331546e;
            C87412m.m108594g(iArr, "<this>");
            int length = iArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (intValue == iArr[length]) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        }
    }

    /* renamed from: d */
    public static final List<Integer> m150957d(int[] iArr) {
        C87412m.m108594g(iArr, "<this>");
        return new C110822a(iArr);
    }

    /* renamed from: e */
    public static final <T> List<T> m150958e(T[] tArr) {
        C87412m.m108594g(tArr, "<this>");
        List<T> asList = Arrays.asList(tArr);
        C87412m.m108593f(asList, "asList(this)");
        return asList;
    }

    /* renamed from: f */
    public static int m150959f(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        C87412m.m108594g(objArr, "<this>");
        return Arrays.binarySearch(objArr, i, i2, obj);
    }

    /* renamed from: g */
    public static final byte[] m150960g(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        C87412m.m108594g(bArr, "<this>");
        C87412m.m108594g(bArr2, FirebaseAnalytics.C113379b.DESTINATION);
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    /* renamed from: h */
    public static final char[] m150961h(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        C87412m.m108594g(cArr, "<this>");
        C87412m.m108594g(cArr2, FirebaseAnalytics.C113379b.DESTINATION);
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
        return cArr2;
    }

    /* renamed from: i */
    public static final int[] m150962i(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        C87412m.m108594g(iArr, "<this>");
        C87412m.m108594g(iArr2, FirebaseAnalytics.C113379b.DESTINATION);
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    /* renamed from: j */
    public static final <T> T[] m150963j(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        C87412m.m108594g(tArr, "<this>");
        C87412m.m108594g(tArr2, FirebaseAnalytics.C113379b.DESTINATION);
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    /* renamed from: k */
    public static float[] m150964k(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        C87412m.m108594g(fArr, "<this>");
        C87412m.m108594g(fArr2, FirebaseAnalytics.C113379b.DESTINATION);
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    /* renamed from: l */
    public static /* synthetic */ int[] m150965l(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        m150962i(iArr, iArr2, i, i2, i3);
        return iArr2;
    }

    /* renamed from: m */
    public static /* synthetic */ Object[] m150966m(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        m150963j(objArr, objArr2, i, i2, i3);
        return objArr2;
    }

    /* renamed from: n */
    public static final <T> T[] m150967n(T[] tArr, int i, int i2) {
        C87412m.m108594g(tArr, "<this>");
        C64192l.m75528a(i2, tArr.length);
        T[] copyOfRange = Arrays.copyOfRange(tArr, i, i2);
        C87412m.m108593f(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: o */
    public static final <T> void m150968o(T[] tArr, T t, int i, int i2) {
        C87412m.m108594g(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    /* renamed from: p */
    public static void m150969p(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        C87412m.m108594g(objArr, "<this>");
        Arrays.fill(objArr, i, i2, obj);
    }

    /* renamed from: q */
    public static void m150970q(boolean[] zArr, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = zArr.length;
        }
        C87412m.m108594g(zArr, "<this>");
        Arrays.fill(zArr, i, i2, z);
    }

    /* renamed from: r */
    public static final int[] m150971r(int[] iArr, int i) {
        C87412m.m108594g(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i;
        return copyOf;
    }

    /* renamed from: s */
    public static final <T> T[] m150972s(T[] tArr, T[] tArr2) {
        C87412m.m108594g(tArr, "<this>");
        C87412m.m108594g(tArr2, "elements");
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] copyOf = Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, copyOf, length, length2);
        C87412m.m108593f(copyOf, "result");
        return copyOf;
    }

    /* renamed from: t */
    public static final <T> void m150973t(T[] tArr, Comparator<? super T> comparator) {
        C87412m.m108594g(tArr, "<this>");
        C87412m.m108594g(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
