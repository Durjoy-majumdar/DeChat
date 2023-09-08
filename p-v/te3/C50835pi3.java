package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pi3 */
public class C50835pi3 extends C49335eu3 {

    /* renamed from: d */
    public int f139775d;

    /* renamed from: e */
    public long f139776e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50835pi3)) {
            return false;
        }
        C50835pi3 pi32 = (C50835pi3) aVar;
        return C46238a.m51546a(this.BaseResponse, pi32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f139775d), Integer.valueOf(pi32.f139775d)) && C46238a.m51546a(Long.valueOf(this.f139776e), Long.valueOf(pi32.f139776e));
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
                aVar.mo74318e(2, this.f139775d);
                aVar.mo74321h(3, this.f139776e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f139775d) + C52418a.m58681h(3, this.f139776e);
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
            C50835pi3 pi32 = objArr[1];
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
                    pi32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                pi32.f139775d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                pi32.f139776e = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
