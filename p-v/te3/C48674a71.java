package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a71 */
public class C48674a71 extends C49335eu3 {

    /* renamed from: d */
    public C64265bq2 f130339d;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48674a71)) {
            return false;
        }
        C48674a71 a712 = (C48674a71) aVar;
        return C46238a.m51546a(this.BaseResponse, a712.BaseResponse) && C46238a.m51546a(this.f130339d, a712.f130339d);
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
            C64265bq2 bq22 = this.f130339d;
            if (bq22 != null) {
                aVar.mo74322i(2, bq22.computeSize());
                this.f130339d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C64265bq2 bq23 = this.f130339d;
            return bq23 != null ? i2 + C52418a.m58682i(2, bq23.computeSize()) : i2;
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
            C48674a71 a712 = objArr[1];
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
                    a712.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64265bq2 bq24 = new C64265bq2();
                    if (bArr2 != null && bArr2.length > 0) {
                        bq24.parseFrom(bArr2);
                    }
                    a712.f130339d = bq24;
                }
                return 0;
            }
        }
    }
}
