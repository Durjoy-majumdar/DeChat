package androidx.compose.foundation.lazy.layout;

import gy3.C87412m;
import java.util.List;
import sx3.C64197v;

/* renamed from: androidx.compose.foundation.lazy.layout.d */
public final class C54151d {
    /* renamed from: a */
    public static final <T> int m60872a(C54150c<T> cVar, int i) {
        C87412m.m108594g(cVar, "<this>");
        if (i < 0 || i >= cVar.getTotalSize()) {
            throw new IndexOutOfBoundsException("Index " + i + ", size " + cVar.getTotalSize());
        }
        List<C54149b<T>> a = cVar.mo74967a();
        int e = C64197v.m75536e(a);
        int i2 = 0;
        while (i2 < e) {
            int i3 = ((e - i2) / 2) + i2;
            int i4 = a.get(i3).f152074a;
            if (i4 != i) {
                if (i4 < i) {
                    i2 = i3 + 1;
                    if (i < a.get(i2).f152074a) {
                    }
                } else {
                    e = i3 - 1;
                }
            }
            return i3;
        }
        return i2;
    }
}
