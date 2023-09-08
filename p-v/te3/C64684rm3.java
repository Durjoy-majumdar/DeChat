package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rm3 */
public class C64684rm3 extends C49335eu3 {

    /* renamed from: d */
    public C64712sm3 f185205d;

    /* renamed from: e */
    public int f185206e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64684rm3)) {
            return false;
        }
        C64684rm3 rm32 = (C64684rm3) aVar;
        return C46238a.m51546a(this.f185205d, rm32.f185205d) && C46238a.m51546a(Integer.valueOf(this.f185206e), Integer.valueOf(rm32.f185206e)) && C46238a.m51546a(this.BaseResponse, rm32.BaseResponse);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64712sm3 sm32 = this.f185205d;
            if (sm32 == null) {
                throw new C52419b("Not all required fields were included: rcptinfolist");
            } else if (this.BaseResponse != null) {
                if (sm32 != null) {
                    aVar.mo74322i(1, sm32.computeSize());
                    this.f185205d.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f185206e);
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
            C64712sm3 sm33 = this.f185205d;
            if (sm33 != null) {
                i2 = 0 + C52418a.m58682i(1, sm33.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f185206e);
            C49966ja jaVar2 = this.BaseResponse;
            return jaVar2 != null ? e + C52418a.m58682i(3, jaVar2.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f185205d == null) {
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
            C64684rm3 rm32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64712sm3 sm34 = new C64712sm3();
                    if (bArr != null && bArr.length > 0) {
                        sm34.parseFrom(bArr);
                    }
                    rm32.f185205d = sm34;
                }
                return 0;
            } else if (intValue == 2) {
                rm32.f185206e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr2 != null && bArr2.length > 0) {
                        jaVar3.parseFrom(bArr2);
                    }
                    rm32.BaseResponse = jaVar3;
                }
                return 0;
            }
        }
    }
}
