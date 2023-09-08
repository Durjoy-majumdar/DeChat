package f02;

import com.tencent.p014mm.plugin.handoff.model.HandOff;
import java.util.Comparator;
import ux3.C65486b;

/* renamed from: f02.f */
public final class C31811f<T> implements Comparator {
    public final int compare(T t, T t2) {
        return C65486b.m77169a(Long.valueOf(-((HandOff) t).getCreateTime()), Long.valueOf(-((HandOff) t2).getCreateTime()));
    }
}
