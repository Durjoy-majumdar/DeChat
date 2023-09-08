package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jh */
public class C49990jh extends C49335eu3 {

    /* renamed from: d */
    public C49421fh f136114d;

    /* renamed from: e */
    public int f136115e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49990jh)) {
            return false;
        }
        C49990jh jhVar = (C49990jh) aVar;
        return C46238a.m51546a(this.BaseResponse, jhVar.BaseResponse) && C46238a.m51546a(this.f136114d, jhVar.f136114d) && C46238a.m51546a(Integer.valueOf(this.f136115e), Integer.valueOf(jhVar.f136115e));
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
                C49421fh fhVar = this.f136114d;
                if (fhVar != null) {
                    aVar.mo74322i(2, fhVar.computeSize());
                    this.f136114d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f136115e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C49421fh fhVar2 = this.f136114d;
            if (fhVar2 != null) {
                i2 += C52418a.m58682i(2, fhVar2.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f136115e);
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
            C49990jh jhVar = objArr[1];
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
                    jhVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49421fh fhVar3 = new C49421fh();
                    if (bArr2 != null && bArr2.length > 0) {
                        fhVar3.parseFrom(bArr2);
                    }
                    jhVar.f136114d = fhVar3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                jhVar.f136115e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
