package ms2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ms2.h */
public class C61577h extends C47465a {

    /* renamed from: d */
    public String f175143d;

    /* renamed from: e */
    public int f175144e;

    /* renamed from: f */
    public String f175145f;

    /* renamed from: g */
    public long f175146g;

    public boolean compareContent(C47465a aVar) {
        SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
        if (aVar == null || !(aVar instanceof C61577h)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return false;
        }
        C61577h hVar = (C61577h) aVar;
        if (!C46238a.m51546a(this.f175143d, hVar.f175143d)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return false;
        } else if (!C46238a.m51546a(Integer.valueOf(this.f175144e), Integer.valueOf(hVar.f175144e))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return false;
        } else if (!C46238a.m51546a(this.f175145f, hVar.f175145f)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return false;
        } else if (!C46238a.m51546a(Long.valueOf(this.f175146g), Long.valueOf(hVar.f175146g))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return false;
        } else {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return true;
        }
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f175143d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f175144e);
            String str2 = this.f175145f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74321h(4, this.f175146g);
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return 0;
        } else if (i == 1) {
            String str3 = this.f175143d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f175144e);
            String str4 = this.f175145f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            int h = e + C52418a.m58681h(4, this.f175146g);
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return 0;
        } else if (i == 3) {
            C102122a aVar3 = objArr[0];
            C61577h hVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                hVar.f175143d = aVar3.mo141633k(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
                return 0;
            } else if (intValue == 2) {
                hVar.f175144e = aVar3.mo141629g(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
                return 0;
            } else if (intValue == 3) {
                hVar.f175145f = aVar3.mo141633k(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
                return 0;
            } else if (intValue != 4) {
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
                return -1;
            } else {
                hVar.f175146g = aVar3.mo141631i(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
                return 0;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCgiReportObj");
            return -1;
        }
    }
}
