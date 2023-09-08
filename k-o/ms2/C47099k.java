package ms2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ms2.k */
public class C47099k extends C47465a {

    /* renamed from: d */
    public LinkedList<C47098j> f126568d = new LinkedList<>();

    /* renamed from: e */
    public C47097i f126569e;

    public boolean compareContent(C47465a aVar) {
        SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsRedDotList");
        if (aVar == null || !(aVar instanceof C47099k)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsRedDotList");
            return false;
        }
        C47099k kVar = (C47099k) aVar;
        if (!C46238a.m51546a(this.f126568d, kVar.f126568d)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsRedDotList");
            return false;
        } else if (!C46238a.m51546a(this.f126569e, kVar.f126569e)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsRedDotList");
            return false;
        } else {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsRedDotList");
            return true;
        }
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsRedDotList");
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f126568d);
            C47097i iVar = this.f126569e;
            if (iVar != null) {
                aVar.mo74322i(2, iVar.computeSize());
                this.f126569e.writeFields(aVar);
            }
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsRedDotList");
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f126568d) + 0;
            C47097i iVar2 = this.f126569e;
            if (iVar2 != null) {
                g += C52418a.m58682i(2, iVar2.computeSize());
            }
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsRedDotList");
            return g;
        } else if (i == 2) {
            this.f126568d.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsRedDotList");
            return 0;
        } else if (i == 3) {
            C102122a aVar3 = objArr[0];
            C47099k kVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C47098j jVar = new C47098j();
                    if (bArr != null && bArr.length > 0) {
                        jVar.parseFrom(bArr);
                    }
                    kVar.f126568d.add(jVar);
                }
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsRedDotList");
                return 0;
            } else if (intValue != 2) {
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsRedDotList");
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C47097i iVar3 = new C47097i();
                    if (bArr2 != null && bArr2.length > 0) {
                        iVar3.parseFrom(bArr2);
                    }
                    kVar.f126569e = iVar3;
                }
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsRedDotList");
                return 0;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsRedDotList");
            return -1;
        }
    }
}
