package ms2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ms2.p */
public class C61579p extends C47465a {

    /* renamed from: d */
    public String f175150d;

    /* renamed from: e */
    public int f175151e;

    public boolean compareContent(C47465a aVar) {
        SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
        if (aVar == null || !(aVar instanceof C61579p)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
            return false;
        }
        C61579p pVar = (C61579p) aVar;
        if (!C46238a.m51546a(this.f175150d, pVar.f175150d)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
            return false;
        } else if (!C46238a.m51546a(Integer.valueOf(this.f175151e), Integer.valueOf(pVar.f175151e))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
            return false;
        } else {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
            return true;
        }
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f175150d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f175151e);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
                return 0;
            }
            C52419b bVar = new C52419b("Not all required fields were included: name");
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
            throw bVar;
        } else if (i == 1) {
            String str2 = this.f175150d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f175151e);
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
            return e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f175150d != null) {
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
                return 0;
            }
            C52419b bVar2 = new C52419b("Not all required fields were included: name");
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
            throw bVar2;
        } else if (i == 3) {
            C102122a aVar3 = objArr[0];
            C61579p pVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                pVar.f175150d = aVar3.mo141633k(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
                return 0;
            } else if (intValue != 2) {
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
                return -1;
            } else {
                pVar.f175151e = aVar3.mo141629g(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
                return 0;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRangeItem");
            return -1;
        }
    }
}
