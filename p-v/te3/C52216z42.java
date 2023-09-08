package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z42 */
public class C52216z42 extends C49335eu3 {

    /* renamed from: d */
    public int f145690d;

    /* renamed from: e */
    public C51792w63 f145691e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52216z42)) {
            return false;
        }
        C52216z42 z422 = (C52216z42) aVar;
        return C46238a.m51546a(this.BaseResponse, z422.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f145690d), Integer.valueOf(z422.f145690d)) && C46238a.m51546a(this.f145691e, z422.f145691e);
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
            aVar.mo74318e(2, this.f145690d);
            C51792w63 w632 = this.f145691e;
            if (w632 != null) {
                aVar.mo74322i(3, w632.computeSize());
                this.f145691e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f145690d);
            C51792w63 w633 = this.f145691e;
            return w633 != null ? e + C52418a.m58682i(3, w633.computeSize()) : e;
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
            C52216z42 z422 = objArr[1];
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
                    z422.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                z422.f145690d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51792w63 w634 = new C51792w63();
                    if (bArr2 != null && bArr2.length > 0) {
                        w634.parseFrom(bArr2);
                    }
                    z422.f145691e = w634;
                }
                return 0;
            }
        }
    }
}
