package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vp0 */
public class C51722vp0 extends C49335eu3 {

    /* renamed from: d */
    public C51270sn1 f143613d;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51722vp0)) {
            return false;
        }
        C51722vp0 vp02 = (C51722vp0) aVar;
        return C46238a.m51546a(this.BaseResponse, vp02.BaseResponse) && C46238a.m51546a(this.f143613d, vp02.f143613d);
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
            C51270sn1 sn12 = this.f143613d;
            if (sn12 != null) {
                aVar.mo74322i(2, sn12.computeSize());
                this.f143613d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C51270sn1 sn13 = this.f143613d;
            return sn13 != null ? i2 + C52418a.m58682i(2, sn13.computeSize()) : i2;
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
            C51722vp0 vp02 = objArr[1];
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
                    vp02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51270sn1 sn14 = new C51270sn1();
                    if (bArr2 != null && bArr2.length > 0) {
                        sn14.parseFrom(bArr2);
                    }
                    vp02.f143613d = sn14;
                }
                return 0;
            }
        }
    }
}
