package ms2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ms2.m */
public class C99967m extends C47465a {

    /* renamed from: d */
    public LinkedList<C99968n> f292913d = new LinkedList<>();

    /* renamed from: e */
    public long f292914e;

    /* renamed from: f */
    public long f292915f;

    public boolean compareContent(C47465a aVar) {
        SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFault");
        if (aVar == null || !(aVar instanceof C99967m)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFault");
            return false;
        }
        C99967m mVar = (C99967m) aVar;
        if (!C46238a.m51546a(this.f292913d, mVar.f292913d)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFault");
            return false;
        } else if (!C46238a.m51546a(Long.valueOf(this.f292914e), Long.valueOf(mVar.f292914e))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFault");
            return false;
        } else if (!C46238a.m51546a(Long.valueOf(this.f292915f), Long.valueOf(mVar.f292915f))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFault");
            return false;
        } else {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFault");
            return true;
        }
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFault");
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f292913d);
            aVar.mo74321h(2, this.f292914e);
            aVar.mo74321h(3, this.f292915f);
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFault");
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f292913d) + 0 + C52418a.m58681h(2, this.f292914e) + C52418a.m58681h(3, this.f292915f);
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFault");
            return g;
        } else if (i == 2) {
            this.f292913d.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFault");
            return 0;
        } else if (i == 3) {
            C102122a aVar3 = objArr[0];
            C99967m mVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C99968n nVar = new C99968n();
                    if (bArr != null && bArr.length > 0) {
                        nVar.parseFrom(bArr);
                    }
                    mVar.f292913d.add(nVar);
                }
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFault");
                return 0;
            } else if (intValue == 2) {
                mVar.f292914e = aVar3.mo141631i(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFault");
                return 0;
            } else if (intValue != 3) {
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFault");
                return -1;
            } else {
                mVar.f292915f = aVar3.mo141631i(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFault");
                return 0;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFault");
            return -1;
        }
    }
}
