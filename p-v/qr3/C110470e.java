package qr3;

import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import rx3.C110660q;

/* renamed from: qr3.e */
public final class C110470e {

    /* renamed from: a */
    public static int f330363a;

    /* renamed from: b */
    public static final C110471a f330364b = new C110471a((C8480h) null);

    /* renamed from: qr3.e$a */
    public static final class C110471a {
        public C110471a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String[] mo161949a(Map<String, String> map) {
            C87412m.m108595h(map, "strMap");
            int size = map.size() * 2;
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = new String();
            }
            Object[] array = map.keySet().toArray(new String[0]);
            if (array != null) {
                String[] strArr2 = (String[]) array;
                int length = strArr2.length;
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 * 2;
                    strArr[i3] = strArr2[i2];
                    int i4 = i3 + 1;
                    String str = map.get(strArr2[i2]);
                    if (str == null) {
                        str = "";
                    }
                    strArr[i4] = str;
                }
                return strArr;
            }
            throw new C110660q("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
