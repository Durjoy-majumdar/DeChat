package yy1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: yy1.e */
public class C53643e extends C49335eu3 {

    /* renamed from: d */
    public C53639a f150692d;

    /* renamed from: e */
    public boolean f150693e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53643e)) {
            return false;
        }
        C53643e eVar = (C53643e) aVar;
        return C46238a.m51546a(this.BaseResponse, eVar.BaseResponse) && C46238a.m51546a(this.f150692d, eVar.f150692d) && C46238a.m51546a(Boolean.valueOf(this.f150693e), Boolean.valueOf(eVar.f150693e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            C53639a aVar2 = this.f150692d;
            if (aVar2 != null) {
                aVar.mo74322i(2, aVar2.computeSize());
                this.f150692d.writeFields(aVar);
            }
            aVar.mo74314a(3, this.f150693e);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C53639a aVar3 = this.f150692d;
            if (aVar3 != null) {
                i2 += C52418a.m58682i(2, aVar3.computeSize());
            }
            return i2 + C52418a.m58674a(3, this.f150693e);
        } else if (i == 2) {
            C102122a aVar4 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar4); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar4)) {
                if (!super.populateBuilderWithField(aVar4, this, nextFieldNumber)) {
                    aVar4.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar5 = objArr[0];
            C53643e eVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar5.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    eVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar5.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C53639a aVar6 = new C53639a();
                    if (bArr2 != null && bArr2.length > 0) {
                        aVar6.parseFrom(bArr2);
                    }
                    eVar.f150692d = aVar6;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                eVar.f150693e = aVar5.mo141625c(intValue);
                return 0;
            }
        }
    }
}
