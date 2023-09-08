package ms2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ms2.o */
public class C61578o extends C47465a {

    /* renamed from: d */
    public LinkedList<C61579p> f175147d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C61579p> f175148e = new LinkedList<>();

    /* renamed from: f */
    public boolean f175149f;

    public boolean compareContent(C47465a aVar) {
        SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
        if (aVar == null || !(aVar instanceof C61578o)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return false;
        }
        C61578o oVar = (C61578o) aVar;
        if (!C46238a.m51546a(this.f175147d, oVar.f175147d)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return false;
        } else if (!C46238a.m51546a(this.f175148e, oVar.f175148e)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return false;
        } else if (!C46238a.m51546a(Boolean.valueOf(this.f175149f), Boolean.valueOf(oVar.f175149f))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return false;
        } else {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return true;
        }
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f175147d);
            aVar.mo74320g(2, 8, this.f175148e);
            aVar.mo74314a(3, this.f175149f);
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f175147d) + 0 + C52418a.m58680g(2, 8, this.f175148e) + C52418a.m58674a(3, this.f175149f);
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return g;
        } else if (i == 2) {
            this.f175147d.clear();
            this.f175148e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return 0;
        } else if (i == 3) {
            C102122a aVar3 = objArr[0];
            C61578o oVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C61579p pVar = new C61579p();
                    if (bArr != null && bArr.length > 0) {
                        pVar.parseFrom(bArr);
                    }
                    oVar.f175147d.add(pVar);
                }
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C61579p pVar2 = new C61579p();
                    if (bArr2 != null && bArr2.length > 0) {
                        pVar2.parseFrom(bArr2);
                    }
                    oVar.f175148e.add(pVar2);
                }
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
                return 0;
            } else if (intValue != 3) {
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
                return -1;
            } else {
                oVar.f175149f = aVar3.mo141625c(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
                return 0;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsUploadRecentRange");
            return -1;
        }
    }
}
