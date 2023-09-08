package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fh1 */
public class C49422fh1 extends C49335eu3 {

    /* renamed from: d */
    public C50409mj f133495d;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49422fh1)) {
            return false;
        }
        C49422fh1 fh12 = (C49422fh1) aVar;
        return C46238a.m51546a(this.BaseResponse, fh12.BaseResponse) && C46238a.m51546a(this.f133495d, fh12.f133495d);
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
            C50409mj mjVar = this.f133495d;
            if (mjVar != null) {
                aVar.mo74322i(2, mjVar.computeSize());
                this.f133495d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C50409mj mjVar2 = this.f133495d;
            return mjVar2 != null ? i2 + C52418a.m58682i(2, mjVar2.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49422fh1 fh12 = objArr[1];
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
                    fh12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50409mj mjVar3 = new C50409mj();
                    if (bArr2 != null && bArr2.length > 0) {
                        mjVar3.parseFrom(bArr2);
                    }
                    fh12.f133495d = mjVar3;
                }
                return 0;
            }
        }
    }
}
