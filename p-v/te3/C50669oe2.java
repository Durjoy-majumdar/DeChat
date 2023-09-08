package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oe2 */
public class C50669oe2 extends C49335eu3 {

    /* renamed from: d */
    public C52278zk2 f139117d;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50669oe2)) {
            return false;
        }
        C50669oe2 oe22 = (C50669oe2) aVar;
        return C46238a.m51546a(this.BaseResponse, oe22.BaseResponse) && C46238a.m51546a(this.f139117d, oe22.f139117d);
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
            C52278zk2 zk22 = this.f139117d;
            if (zk22 != null) {
                aVar.mo74322i(2, zk22.computeSize());
                this.f139117d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C52278zk2 zk23 = this.f139117d;
            return zk23 != null ? i2 + C52418a.m58682i(2, zk23.computeSize()) : i2;
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
            C50669oe2 oe22 = objArr[1];
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
                    oe22.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52278zk2 zk24 = new C52278zk2();
                    if (bArr2 != null && bArr2.length > 0) {
                        zk24.parseFrom(bArr2);
                    }
                    oe22.f139117d = zk24;
                }
                return 0;
            }
        }
    }
}
