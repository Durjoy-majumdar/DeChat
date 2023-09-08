package ms2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ms2.e */
public class C99965e extends C47465a {

    /* renamed from: d */
    public long f292906d;

    /* renamed from: e */
    public int f292907e;

    /* renamed from: f */
    public int f292908f;

    /* renamed from: g */
    public String f292909g;

    /* renamed from: h */
    public String f292910h;

    public boolean compareContent(C47465a aVar) {
        SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
        if (aVar == null || !(aVar instanceof C99965e)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return false;
        }
        C99965e eVar = (C99965e) aVar;
        if (!C46238a.m51546a(Long.valueOf(this.f292906d), Long.valueOf(eVar.f292906d))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return false;
        } else if (!C46238a.m51546a(Integer.valueOf(this.f292907e), Integer.valueOf(eVar.f292907e))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return false;
        } else if (!C46238a.m51546a(Integer.valueOf(this.f292908f), Integer.valueOf(eVar.f292908f))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return false;
        } else if (!C46238a.m51546a(this.f292909g, eVar.f292909g)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return false;
        } else if (!C46238a.m51546a(this.f292910h, eVar.f292910h)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return false;
        } else {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return true;
        }
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f292906d);
            aVar.mo74318e(2, this.f292907e);
            aVar.mo74318e(3, this.f292908f);
            String str = this.f292909g;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            String str2 = this.f292910h;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f292906d) + 0 + C52418a.m58678e(2, this.f292907e) + C52418a.m58678e(3, this.f292908f);
            String str3 = this.f292909g;
            if (str3 != null) {
                h += C52418a.m58683j(6, str3);
            }
            String str4 = this.f292910h;
            if (str4 != null) {
                h += C52418a.m58683j(7, str4);
            }
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return 0;
        } else if (i == 3) {
            C102122a aVar3 = objArr[0];
            C99965e eVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                eVar.f292906d = aVar3.mo141631i(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
                return 0;
            } else if (intValue == 2) {
                eVar.f292907e = aVar3.mo141629g(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
                return 0;
            } else if (intValue == 3) {
                eVar.f292908f = aVar3.mo141629g(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
                return 0;
            } else if (intValue == 6) {
                eVar.f292909g = aVar3.mo141633k(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
                return 0;
            } else if (intValue != 7) {
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
                return -1;
            } else {
                eVar.f292910h = aVar3.mo141633k(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
                return 0;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsFailComment");
            return -1;
        }
    }
}
