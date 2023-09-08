package p721v0;

import fy3.C32226l;
import gy3.C87412m;
import java.util.List;

/* renamed from: v0.l */
public final class C111306l {
    /* renamed from: a */
    public static String m151789a(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C32226l lVar, int i2, Object obj) {
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
        C87412m.m108594g(list, "<this>");
        C87412m.m108594g(charSequence, "separator");
        C87412m.m108594g(charSequence2, "prefix");
        C87412m.m108594g(charSequence3, "postfix");
        C87412m.m108594g(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj2 = list.get(i4);
            i3++;
            boolean z = true;
            if (i3 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i3 > i) {
                break;
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.invoke(obj2));
            } else {
                if (obj2 != null) {
                    z = obj2 instanceof CharSequence;
                }
                if (z) {
                    sb.append((CharSequence) obj2);
                } else if (obj2 instanceof Character) {
                    sb.append(((Character) obj2).charValue());
                } else {
                    sb.append(String.valueOf(obj2));
                }
            }
        }
        if (i >= 0 && i3 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb4;
    }
}
