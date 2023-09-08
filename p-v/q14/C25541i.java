package q14;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;
import n14.C25217e;

/* renamed from: q14.i */
public final class C25541i {
    /* renamed from: a */
    public static final C89447g m33033a(Number number, String str, String str2) {
        C87412m.m108594g(number, "value");
        C87412m.m108594g(str, "type");
        C87412m.m108594g(str2, "output");
        return new C89447g('\'' + number + "' is not a valid '" + str + "' as per JSON specification. " + "You can enable 'serializeSpecialFloatingPointValues' property to serialize such values\n" + "Current output: " + m33036d(str2, -1));
    }

    /* renamed from: b */
    public static final C89447g m33034b(C25217e eVar) {
        C87412m.m108594g(eVar, "keyDescriptor");
        return new C89447g("Value of type '" + eVar.mo52328j() + "' can't be used in JSON as a key in the map. " + "It should have either primitive or enum kind, but its kind is '" + eVar.mo52323f() + ".'\n" + "You can convert such maps to arrays [key1, value1, key2, value2,...] using 'JsonBuilder.allowStructuredMapKeys' property");
    }

    /* renamed from: c */
    public static final C89446d m33035c(int i, String str, String str2) {
        C87412m.m108594g(str, StateEvent.Name.MESSAGE);
        C87412m.m108594g(str2, "input");
        return new C89446d(i, str + ".\n JSON input: " + m33036d(str2, i));
    }

    /* renamed from: d */
    public static final String m33036d(String str, int i) {
        if (str.length() < 200) {
            return str;
        }
        String str2 = ".....";
        if (i == -1) {
            int length = str.length() - 60;
            if (length <= 0) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            String substring = str.substring(length);
            C87412m.m108593f(substring, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            return sb.toString();
        }
        int i2 = i - 30;
        int i3 = i + 30;
        String str3 = i2 <= 0 ? "" : str2;
        if (i3 >= str.length()) {
            str2 = "";
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str3);
        if (i2 < 0) {
            i2 = 0;
        }
        int length2 = str.length();
        if (i3 > length2) {
            i3 = length2;
        }
        String substring2 = str.substring(i2, i3);
        C87412m.m108593f(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb4.append(substring2);
        sb4.append(str2);
        return sb4.toString();
    }
}
