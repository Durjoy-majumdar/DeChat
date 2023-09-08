package ms2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ms2.f */
public class C47096f extends C47465a {

    /* renamed from: d */
    public long f126561d;

    /* renamed from: e */
    public int f126562e;

    /* renamed from: f */
    public int f126563f;

    public boolean compareContent(C47465a aVar) {
        SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsObjToDel");
        if (aVar == null || !(aVar instanceof C47096f)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsObjToDel");
            return false;
        }
        C47096f fVar = (C47096f) aVar;
        if (!C46238a.m51546a(Long.valueOf(this.f126561d), Long.valueOf(fVar.f126561d))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsObjToDel");
            return false;
        } else if (!C46238a.m51546a(Integer.valueOf(this.f126562e), Integer.valueOf(fVar.f126562e))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsObjToDel");
            return false;
        } else if (!C46238a.m51546a(Integer.valueOf(this.f126563f), Integer.valueOf(fVar.f126563f))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsObjToDel");
            return false;
        } else {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsObjToDel");
            return true;
        }
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsObjToDel");
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f126561d);
            aVar.mo74318e(2, this.f126562e);
            aVar.mo74318e(3, this.f126563f);
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsObjToDel");
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f126561d) + 0 + C52418a.m58678e(2, this.f126562e) + C52418a.m58678e(3, this.f126563f);
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsObjToDel");
            return h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsObjToDel");
            return 0;
        } else if (i == 3) {
            C102122a aVar3 = objArr[0];
            C47096f fVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                fVar.f126561d = aVar3.mo141631i(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsObjToDel");
                return 0;
            } else if (intValue == 2) {
                fVar.f126562e = aVar3.mo141629g(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsObjToDel");
                return 0;
            } else if (intValue != 3) {
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsObjToDel");
                return -1;
            } else {
                fVar.f126563f = aVar3.mo141629g(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsObjToDel");
                return 0;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsObjToDel");
            return -1;
        }
    }
}
