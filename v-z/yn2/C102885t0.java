package yn2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import java.util.Comparator;

/* renamed from: yn2.t0 */
public final class C102885t0<T> implements Comparator {

    /* renamed from: d */
    public static final C102885t0<T> f303688d = new C102885t0<>();

    public int compare(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.SnsFinderPostManager$sortVideoBitrate$1");
        C102873a aVar = (C102873a) obj;
        C102873a aVar2 = (C102873a) obj2;
        SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.SnsFinderPostManager$sortVideoBitrate$1");
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ABAResult");
        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ABAResult");
        int a = aVar.mo142585a();
        int a2 = aVar2.mo142585a();
        int i = a2 < a ? -1 : a < a2 ? 1 : 0;
        SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.SnsFinderPostManager$sortVideoBitrate$1");
        SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.SnsFinderPostManager$sortVideoBitrate$1");
        return i;
    }
}
