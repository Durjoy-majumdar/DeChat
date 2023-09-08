package rq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Collection;
import java.util.Map;

/* renamed from: rq2.k */
public final class C101425k {
    /* renamed from: a */
    public static <T> boolean m133097a(Collection<T> collection) {
        SnsMethodCalculate.markStartTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z = collection == null || collection.isEmpty();
        SnsMethodCalculate.markEndTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z;
    }

    /* renamed from: b */
    public static <K, V> boolean m133098b(Map<K, V> map) {
        SnsMethodCalculate.markStartTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z = map == null || map.isEmpty();
        SnsMethodCalculate.markEndTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z;
    }

    /* renamed from: c */
    public static <T> boolean m133099c(T[] tArr) {
        SnsMethodCalculate.markStartTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z = tArr == null || tArr.length == 0;
        SnsMethodCalculate.markEndTimeMs("isEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z;
    }

    /* renamed from: d */
    public static <T> boolean m133100d(Collection<T> collection) {
        SnsMethodCalculate.markStartTimeMs("notEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z = !m133097a(collection);
        SnsMethodCalculate.markEndTimeMs("notEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z;
    }

    /* renamed from: e */
    public static <K, V> boolean m133101e(Map<K, V> map) {
        SnsMethodCalculate.markStartTimeMs("notEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z = !m133098b(map);
        SnsMethodCalculate.markEndTimeMs("notEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z;
    }

    /* renamed from: f */
    public static <T> boolean m133102f(T[] tArr) {
        SnsMethodCalculate.markStartTimeMs("notEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        boolean z = !m133099c(tArr);
        SnsMethodCalculate.markEndTimeMs("notEmpty", "com.tencent.mm.plugin.sns.ad.utils.CollectionUtils");
        return z;
    }
}
