package oz3;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: oz3.y */
public final class C21911y {

    /* renamed from: a */
    public static final C21911y f61967a = new C21911y();

    /* renamed from: a */
    public final String[] mo34954a(String... strArr) {
        C87412m.m108594g(strArr, "signatures");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        Object[] array = arrayList.toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: b */
    public final Set<String> mo34955b(String str, String... strArr) {
        C87412m.m108594g(str, "internalName");
        C87412m.m108594g(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public final Set<String> mo34956c(String str, String... strArr) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(strArr, "signatures");
        return mo34955b(mo34959f(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: d */
    public final Set<String> mo34957d(String str, String... strArr) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(strArr, "signatures");
        return mo34955b(mo34960g(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: e */
    public final String mo34958e(String str) {
        C87412m.m108594g(str, "name");
        return "java/util/function/" + str;
    }

    /* renamed from: f */
    public final String mo34959f(String str) {
        C87412m.m108594g(str, "name");
        return "java/lang/" + str;
    }

    /* renamed from: g */
    public final String mo34960g(String str) {
        C87412m.m108594g(str, "name");
        return "java/util/" + str;
    }
}
