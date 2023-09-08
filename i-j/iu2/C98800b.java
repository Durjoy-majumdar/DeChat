package iu2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gu2.C98214b;
import gy3.C87412m;
import java.util.Comparator;

/* renamed from: iu2.b */
public final class C98800b implements Comparator<C98214b> {
    public int compare(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveSnsInfoComparator");
        C98214b bVar = (C98214b) obj;
        C98214b bVar2 = (C98214b) obj2;
        SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveSnsInfoComparator");
        C87412m.m108594g(bVar, "o1");
        C87412m.m108594g(bVar2, "o2");
        int i = bVar2.getCreateTime() != bVar.getCreateTime() ? C87412m.m108596i(bVar2.getCreateTime(), bVar.getCreateTime()) : bVar2.mo137504B2().compareTo(bVar.mo137504B2());
        SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveSnsInfoComparator");
        SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveSnsInfoComparator");
        return i;
    }
}
