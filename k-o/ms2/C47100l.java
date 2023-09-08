package ms2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ms2.l */
public class C47100l extends C47465a {

    /* renamed from: d */
    public String f126570d;

    /* renamed from: e */
    public int f126571e;

    public boolean compareContent(C47465a aVar) {
        SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsTagSearchReportObj");
        if (aVar == null || !(aVar instanceof C47100l)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsTagSearchReportObj");
            return false;
        }
        C47100l lVar = (C47100l) aVar;
        if (!C46238a.m51546a(this.f126570d, lVar.f126570d)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsTagSearchReportObj");
            return false;
        } else if (!C46238a.m51546a(Integer.valueOf(this.f126571e), Integer.valueOf(lVar.f126571e))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsTagSearchReportObj");
            return false;
        } else {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsTagSearchReportObj");
            return true;
        }
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsTagSearchReportObj");
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f126570d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f126571e);
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsTagSearchReportObj");
            return 0;
        } else if (i == 1) {
            String str2 = this.f126570d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f126571e);
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsTagSearchReportObj");
            return e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsTagSearchReportObj");
            return 0;
        } else if (i == 3) {
            C102122a aVar3 = objArr[0];
            C47100l lVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lVar.f126570d = aVar3.mo141633k(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsTagSearchReportObj");
                return 0;
            } else if (intValue != 2) {
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsTagSearchReportObj");
                return -1;
            } else {
                lVar.f126571e = aVar3.mo141629g(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsTagSearchReportObj");
                return 0;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsTagSearchReportObj");
            return -1;
        }
    }
}
