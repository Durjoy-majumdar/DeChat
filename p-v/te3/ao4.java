package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ao4 extends C49335eu3 {

    /* renamed from: d */
    public yn4 f130700d;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ao4)) {
            return false;
        }
        ao4 ao4 = (ao4) aVar;
        return C46238a.m51546a(this.BaseResponse, ao4.BaseResponse) && C46238a.m51546a(this.f130700d, ao4.f130700d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f130700d != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                yn4 yn4 = this.f130700d;
                if (yn4 != null) {
                    aVar.mo74322i(2, yn4.computeSize());
                    this.f130700d.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: UploadCtx");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            yn4 yn42 = this.f130700d;
            return yn42 != null ? i2 + C52418a.m58682i(2, yn42.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f130700d != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: UploadCtx");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ao4 ao4 = objArr[1];
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
                    ao4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    yn4 yn43 = new yn4();
                    if (bArr2 != null && bArr2.length > 0) {
                        yn43.parseFrom(bArr2);
                    }
                    ao4.f130700d = yn43;
                }
                return 0;
            }
        }
    }
}
