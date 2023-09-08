package ms2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: ms2.b */
public class C47094b extends C47465a {

    /* renamed from: d */
    public LinkedList<Long> f126556d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAbTestIgnoreId");
        if (aVar == null || !(aVar instanceof C47094b)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAbTestIgnoreId");
            return false;
        } else if (!C46238a.m51546a(this.f126556d, ((C47094b) aVar).f126556d)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAbTestIgnoreId");
            return false;
        } else {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAbTestIgnoreId");
            return true;
        }
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAbTestIgnoreId");
        if (i == 0) {
            objArr[0].mo74320g(1, 3, this.f126556d);
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAbTestIgnoreId");
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 3, this.f126556d) + 0;
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAbTestIgnoreId");
            return g;
        } else if (i == 2) {
            this.f126556d.clear();
            C102122a aVar = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.mo141624b();
                }
            }
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAbTestIgnoreId");
            return 0;
        } else if (i == 3) {
            C102122a aVar2 = objArr[0];
            C47094b bVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAbTestIgnoreId");
                return -1;
            }
            bVar.f126556d.add(Long.valueOf(aVar2.mo141631i(intValue)));
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAbTestIgnoreId");
            return 0;
        } else {
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAbTestIgnoreId");
            return -1;
        }
    }
}
