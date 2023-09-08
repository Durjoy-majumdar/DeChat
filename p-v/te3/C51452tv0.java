package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tv0 */
public class C51452tv0 extends C49335eu3 {

    /* renamed from: d */
    public C51215sa1 f142436d;

    /* renamed from: e */
    public int f142437e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51452tv0)) {
            return false;
        }
        C51452tv0 tv02 = (C51452tv0) aVar;
        return C46238a.m51546a(this.BaseResponse, tv02.BaseResponse) && C46238a.m51546a(this.f142436d, tv02.f142436d) && C46238a.m51546a(Integer.valueOf(this.f142437e), Integer.valueOf(tv02.f142437e));
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
            C51215sa1 sa12 = this.f142436d;
            if (sa12 != null) {
                aVar.mo74322i(2, sa12.computeSize());
                this.f142436d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f142437e);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C51215sa1 sa13 = this.f142436d;
            if (sa13 != null) {
                i2 += C52418a.m58682i(2, sa13.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f142437e);
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
            C51452tv0 tv02 = objArr[1];
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
                    tv02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51215sa1 sa14 = new C51215sa1();
                    if (bArr2 != null && bArr2.length > 0) {
                        sa14.parseFrom(bArr2);
                    }
                    tv02.f142436d = sa14;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                tv02.f142437e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
