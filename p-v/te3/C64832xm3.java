package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xm3 */
public class C64832xm3 extends C49335eu3 {

    /* renamed from: d */
    public int f186337d;

    /* renamed from: e */
    public C64712sm3 f186338e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64832xm3)) {
            return false;
        }
        C64832xm3 xm32 = (C64832xm3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186337d), Integer.valueOf(xm32.f186337d)) && C46238a.m51546a(this.f186338e, xm32.f186338e) && C46238a.m51546a(this.BaseResponse, xm32.BaseResponse);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f186338e == null) {
                throw new C52419b("Not all required fields were included: rcptinfolist");
            } else if (this.BaseResponse != null) {
                aVar.mo74318e(1, this.f186337d);
                C64712sm3 sm32 = this.f186338e;
                if (sm32 != null) {
                    aVar.mo74322i(2, sm32.computeSize());
                    this.f186338e.writeFields(aVar);
                }
                C49966ja jaVar = this.BaseResponse;
                if (jaVar != null) {
                    aVar.mo74322i(3, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: BaseResponse");
            }
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f186337d) + 0;
            C64712sm3 sm33 = this.f186338e;
            if (sm33 != null) {
                e += C52418a.m58682i(2, sm33.computeSize());
            }
            C49966ja jaVar2 = this.BaseResponse;
            return jaVar2 != null ? e + C52418a.m58682i(3, jaVar2.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f186338e == null) {
                throw new C52419b("Not all required fields were included: rcptinfolist");
            } else if (this.BaseResponse != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: BaseResponse");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64832xm3 xm32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xm32.f186337d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64712sm3 sm34 = new C64712sm3();
                    if (bArr != null && bArr.length > 0) {
                        sm34.parseFrom(bArr);
                    }
                    xm32.f186338e = sm34;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr2 != null && bArr2.length > 0) {
                        jaVar3.parseFrom(bArr2);
                    }
                    xm32.BaseResponse = jaVar3;
                }
                return 0;
            }
        }
    }
}
