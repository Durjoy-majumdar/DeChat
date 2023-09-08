package ms2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ms2.i */
public class C47097i extends C47465a {

    /* renamed from: d */
    public String f126564d;

    /* renamed from: e */
    public int f126565e;

    public boolean compareContent(C47465a aVar) {
        SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCount");
        if (aVar == null || !(aVar instanceof C47097i)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCount");
            return false;
        }
        C47097i iVar = (C47097i) aVar;
        if (!C46238a.m51546a(this.f126564d, iVar.f126564d)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCount");
            return false;
        } else if (!C46238a.m51546a(Integer.valueOf(this.f126565e), Integer.valueOf(iVar.f126565e))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCount");
            return false;
        } else {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCount");
            return true;
        }
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCount");
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f126564d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f126565e);
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCount");
            return 0;
        } else if (i == 1) {
            String str2 = this.f126564d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int e = i2 + C52418a.m58678e(2, this.f126565e);
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCount");
            return e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCount");
            return 0;
        } else if (i == 3) {
            C102122a aVar3 = objArr[0];
            C47097i iVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                iVar.f126564d = aVar3.mo141633k(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCount");
                return 0;
            } else if (intValue != 2) {
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCount");
                return -1;
            } else {
                iVar.f126565e = aVar3.mo141629g(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCount");
                return 0;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsPostCount");
            return -1;
        }
    }
}
