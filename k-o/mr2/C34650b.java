package mr2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.vfs.C86001b0;
import java.util.Comparator;
import ux3.C65486b;

/* renamed from: mr2.b */
public final class C34650b<T> implements Comparator {
    public final int compare(T t, T t2) {
        SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager$cleanSnsDraftDir$$inlined$sortedByDescending$1");
        int a = C65486b.m77169a(Long.valueOf(((C86001b0) t2).f250475e), Long.valueOf(((C86001b0) t).f250475e));
        SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager$cleanSnsDraftDir$$inlined$sortedByDescending$1");
        return a;
    }
}
