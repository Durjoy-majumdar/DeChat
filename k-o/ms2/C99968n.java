package ms2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ms2.n */
public class C99968n extends C47465a {

    /* renamed from: d */
    public LinkedList<Long> f292916d = new LinkedList<>();

    /* renamed from: e */
    public long f292917e;

    /* renamed from: f */
    public int f292918f;

    /* renamed from: g */
    public LinkedList<Long> f292919g = new LinkedList<>();

    /* renamed from: h */
    public int f292920h;

    /* renamed from: i */
    public int f292921i;

    /* renamed from: j */
    public int f292922j;

    /* renamed from: n */
    public LinkedList<String> f292923n = new LinkedList<>();

    /* renamed from: o */
    public LinkedList<Long> f292924o = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
        if (aVar == null || !(aVar instanceof C99968n)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        }
        C99968n nVar = (C99968n) aVar;
        if (!C46238a.m51546a(this.f292916d, nVar.f292916d)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        } else if (!C46238a.m51546a(Long.valueOf(this.f292917e), Long.valueOf(nVar.f292917e))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        } else if (!C46238a.m51546a(Integer.valueOf(this.f292918f), Integer.valueOf(nVar.f292918f))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        } else if (!C46238a.m51546a(this.f292919g, nVar.f292919g)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        } else if (!C46238a.m51546a(Integer.valueOf(this.f292920h), Integer.valueOf(nVar.f292920h))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        } else if (!C46238a.m51546a(Integer.valueOf(this.f292921i), Integer.valueOf(nVar.f292921i))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        } else if (!C46238a.m51546a(Integer.valueOf(this.f292922j), Integer.valueOf(nVar.f292922j))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        } else if (!C46238a.m51546a(this.f292923n, nVar.f292923n)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        } else if (!C46238a.m51546a(this.f292924o, nVar.f292924o)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return false;
        } else {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return true;
        }
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 3, this.f292916d);
            aVar.mo74321h(2, this.f292917e);
            aVar.mo74318e(3, this.f292918f);
            aVar.mo74320g(4, 3, this.f292919g);
            aVar.mo74318e(5, this.f292920h);
            aVar.mo74318e(6, this.f292921i);
            aVar.mo74318e(7, this.f292922j);
            aVar.mo74320g(8, 1, this.f292923n);
            aVar.mo74320g(9, 3, this.f292924o);
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return 0;
        } else if (i2 == 1) {
            int g = C52418a.m58680g(1, 3, this.f292916d) + 0 + C52418a.m58681h(2, this.f292917e) + C52418a.m58678e(3, this.f292918f) + C52418a.m58680g(4, 3, this.f292919g) + C52418a.m58678e(5, this.f292920h) + C52418a.m58678e(6, this.f292921i) + C52418a.m58678e(7, this.f292922j) + C52418a.m58680g(8, 1, this.f292923n) + C52418a.m58680g(9, 3, this.f292924o);
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return g;
        } else if (i2 == 2) {
            this.f292916d.clear();
            this.f292919g.clear();
            this.f292923n.clear();
            this.f292924o.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return 0;
        } else if (i2 == 3) {
            C102122a aVar3 = objArr[0];
            C99968n nVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    nVar.f292916d.add(Long.valueOf(aVar3.mo141631i(intValue)));
                    SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                    return 0;
                case 2:
                    nVar.f292917e = aVar3.mo141631i(intValue);
                    SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                    return 0;
                case 3:
                    nVar.f292918f = aVar3.mo141629g(intValue);
                    SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                    return 0;
                case 4:
                    nVar.f292919g.add(Long.valueOf(aVar3.mo141631i(intValue)));
                    SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                    return 0;
                case 5:
                    nVar.f292920h = aVar3.mo141629g(intValue);
                    SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                    return 0;
                case 6:
                    nVar.f292921i = aVar3.mo141629g(intValue);
                    SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                    return 0;
                case 7:
                    nVar.f292922j = aVar3.mo141629g(intValue);
                    SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                    return 0;
                case 8:
                    nVar.f292923n.add(aVar3.mo141633k(intValue));
                    SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                    return 0;
                case 9:
                    nVar.f292924o.add(Long.valueOf(aVar3.mo141631i(intValue)));
                    SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                    return 0;
                default:
                    SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
                    return -1;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUnreadTipFaultItem");
            return -1;
        }
    }
}
