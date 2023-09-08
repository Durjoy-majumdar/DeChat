package hw2;

import java.util.Comparator;
import kw2.C99264e;
import ux3.C65486b;

/* renamed from: hw2.c */
public final class C98558c<T> implements Comparator {
    public final int compare(T t, T t2) {
        C99264e eVar = (C99264e) t2;
        long j = eVar.field_updateTime;
        if (j == 0) {
            j = ((long) eVar.field_storyPostTime) * 1000;
        }
        Long valueOf = Long.valueOf(j);
        C99264e eVar2 = (C99264e) t;
        long j2 = eVar2.field_updateTime;
        if (j2 == 0) {
            j2 = ((long) eVar2.field_storyPostTime) * 1000;
        }
        return C65486b.m77169a(valueOf, Long.valueOf(j2));
    }
}
