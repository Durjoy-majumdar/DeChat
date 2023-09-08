package sx3;

import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import rx3.C110661w;
import rx3.C110663z;
import rx3.C63683s;
import rx3.C63686u;

/* renamed from: sx3.m */
public class C110820m extends C64192l {
    /* renamed from: b */
    public static final <T> String m150955b(T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        int length = tArr.length;
        if (length > 429496729) {
            length = 429496729;
        }
        StringBuilder sb = new StringBuilder((length * 5) + 2);
        m150956c(tArr, sb, new ArrayList());
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder(capacity).…builderAction).toString()");
        return sb4;
    }

    /* renamed from: c */
    public static final <T> void m150956c(T[] tArr, StringBuilder sb, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            T t = tArr[i];
            String str = "null";
            if (t == null) {
                sb.append(str);
            } else if (t instanceof Object[]) {
                m150956c((Object[]) t, sb, list);
            } else if (t instanceof byte[]) {
                String arrays = Arrays.toString((byte[]) t);
                C87412m.m108593f(arrays, "toString(this)");
                sb.append(arrays);
            } else if (t instanceof short[]) {
                String arrays2 = Arrays.toString((short[]) t);
                C87412m.m108593f(arrays2, "toString(this)");
                sb.append(arrays2);
            } else if (t instanceof int[]) {
                String arrays3 = Arrays.toString((int[]) t);
                C87412m.m108593f(arrays3, "toString(this)");
                sb.append(arrays3);
            } else if (t instanceof long[]) {
                String arrays4 = Arrays.toString((long[]) t);
                C87412m.m108593f(arrays4, "toString(this)");
                sb.append(arrays4);
            } else if (t instanceof float[]) {
                String arrays5 = Arrays.toString((float[]) t);
                C87412m.m108593f(arrays5, "toString(this)");
                sb.append(arrays5);
            } else if (t instanceof double[]) {
                String arrays6 = Arrays.toString((double[]) t);
                C87412m.m108593f(arrays6, "toString(this)");
                sb.append(arrays6);
            } else if (t instanceof char[]) {
                String arrays7 = Arrays.toString((char[]) t);
                C87412m.m108593f(arrays7, "toString(this)");
                sb.append(arrays7);
            } else if (t instanceof boolean[]) {
                String arrays8 = Arrays.toString((boolean[]) t);
                C87412m.m108593f(arrays8, "toString(this)");
                sb.append(arrays8);
            } else if (t instanceof C63683s) {
                byte[] bArr = ((C63683s) t).f180538d;
                if (bArr != null) {
                    str = C110818d0.m150921S(new C63683s(bArr), ", ", "[", "]", 0, (CharSequence) null, (C32226l) null, 56, (Object) null);
                }
                sb.append(str);
            } else if (t instanceof C110663z) {
                short[] sArr = ((C110663z) t).f331067d;
                if (sArr != null) {
                    str = C110818d0.m150921S(new C110663z(sArr), ", ", "[", "]", 0, (CharSequence) null, (C32226l) null, 56, (Object) null);
                }
                sb.append(str);
            } else if (t instanceof C63686u) {
                int[] iArr = ((C63686u) t).f180542d;
                if (iArr != null) {
                    str = C110818d0.m150921S(new C63686u(iArr), ", ", "[", "]", 0, (CharSequence) null, (C32226l) null, 56, (Object) null);
                }
                sb.append(str);
            } else if (t instanceof C110661w) {
                long[] jArr = ((C110661w) t).f331065d;
                if (jArr != null) {
                    str = C110818d0.m150921S(new C110661w(jArr), ", ", "[", "]", 0, (CharSequence) null, (C32226l) null, 56, (Object) null);
                }
                sb.append(str);
            } else {
                sb.append(t.toString());
            }
        }
        sb.append(']');
        list.remove(C64197v.m75536e(list));
    }
}
