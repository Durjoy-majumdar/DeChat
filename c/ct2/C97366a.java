package ct2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Comparator;
import te3.C101804kv2;
import ux3.C65486b;

/* renamed from: ct2.a */
public final class C97366a<T> implements Comparator {
    public final int compare(T t, T t2) {
        SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateSnsCoverInfo$$inlined$sortBy$1");
        int a = C65486b.m77169a(Float.valueOf(((C101804kv2) t).f298698p.f298876e), Float.valueOf(((C101804kv2) t2).f298698p.f298876e));
        SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel$updateSnsCoverInfo$$inlined$sortBy$1");
        return a;
    }
}
