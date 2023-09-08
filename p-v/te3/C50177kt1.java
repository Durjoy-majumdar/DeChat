package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kt1 */
public class C50177kt1 extends C49335eu3 {

    /* renamed from: d */
    public C50308lt1 f137035d;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50177kt1)) {
            return false;
        }
        C50177kt1 kt12 = (C50177kt1) aVar;
        return C46238a.m51546a(this.BaseResponse, kt12.BaseResponse) && C46238a.m51546a(this.f137035d, kt12.f137035d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f137035d != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C50308lt1 lt12 = this.f137035d;
                if (lt12 != null) {
                    aVar.mo74322i(2, lt12.computeSize());
                    this.f137035d.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: vlogresp");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C50308lt1 lt13 = this.f137035d;
            return lt13 != null ? i2 + C52418a.m58682i(2, lt13.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f137035d != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: vlogresp");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50177kt1 kt12 = objArr[1];
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
                    kt12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50308lt1 lt14 = new C50308lt1();
                    if (bArr2 != null && bArr2.length > 0) {
                        lt14.parseFrom(bArr2);
                    }
                    kt12.f137035d = lt14;
                }
                return 0;
            }
        }
    }
}
