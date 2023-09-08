package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class zd4 extends C49335eu3 {

    /* renamed from: d */
    public boolean f145845d;

    /* renamed from: e */
    public boolean f145846e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof zd4)) {
            return false;
        }
        zd4 zd4 = (zd4) aVar;
        return C46238a.m51546a(this.BaseResponse, zd4.BaseResponse) && C46238a.m51546a(Boolean.valueOf(this.f145845d), Boolean.valueOf(zd4.f145845d)) && C46238a.m51546a(Boolean.valueOf(this.f145846e), Boolean.valueOf(zd4.f145846e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74314a(2, this.f145845d);
                aVar.mo74314a(3, this.f145846e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58674a(2, this.f145845d) + C52418a.m58674a(3, this.f145846e);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            zd4 zd4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    zd4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                zd4.f145845d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                zd4.f145846e = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
