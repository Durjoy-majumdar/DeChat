package p735w1;

import gy3.C87412m;
import java.util.List;

/* renamed from: w1.f */
public final class C111691f {
    /* renamed from: a */
    public static final int m152222a(List<C111693h> list, int i) {
        C87412m.m108594g(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C111693h hVar = list.get(i3);
            char c = hVar.f334330b > i ? 1 : hVar.f334331c <= i ? (char) 65535 : 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else if (c <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: b */
    public static final int m152223b(List<C111693h> list, int i) {
        C87412m.m108594g(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C111693h hVar = list.get(i3);
            char c = hVar.f334332d > i ? 1 : hVar.f334333e <= i ? (char) 65535 : 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else if (c <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: c */
    public static final int m152224c(List<C111693h> list, float f) {
        C87412m.m108594g(list, "paragraphInfoList");
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C111693h hVar = list.get(i2);
            char c = hVar.f334334f > f ? 1 : hVar.f334335g <= f ? (char) 65535 : 0;
            if (c < 0) {
                i = i2 + 1;
            } else if (c <= 0) {
                return i2;
            } else {
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }
}
