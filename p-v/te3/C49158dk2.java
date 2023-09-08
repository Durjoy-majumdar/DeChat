package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dk2 */
public class C49158dk2 extends C49335eu3 {

    /* renamed from: d */
    public C49713hj2 f132382d;

    /* renamed from: e */
    public LinkedList<C51458tw3> f132383e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49158dk2)) {
            return false;
        }
        C49158dk2 dk22 = (C49158dk2) aVar;
        return C46238a.m51546a(this.BaseResponse, dk22.BaseResponse) && C46238a.m51546a(this.f132382d, dk22.f132382d) && C46238a.m51546a(this.f132383e, dk22.f132383e);
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
                C49713hj2 hj22 = this.f132382d;
                if (hj22 != null) {
                    aVar.mo74322i(2, hj22.computeSize());
                    this.f132382d.writeFields(aVar);
                }
                aVar.mo74320g(3, 8, this.f132383e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C49713hj2 hj23 = this.f132382d;
            if (hj23 != null) {
                i2 += C52418a.m58682i(2, hj23.computeSize());
            }
            return i2 + C52418a.m58680g(3, 8, this.f132383e);
        } else if (i == 2) {
            this.f132383e.clear();
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
            C49158dk2 dk22 = objArr[1];
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
                    dk22.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49713hj2 hj24 = new C49713hj2();
                    if (bArr2 != null && bArr2.length > 0) {
                        hj24.parseFrom(bArr2);
                    }
                    dk22.f132382d = hj24;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51458tw3 tw32 = new C51458tw3();
                    if (bArr3 != null && bArr3.length > 0) {
                        tw32.parseFrom(bArr3);
                    }
                    dk22.f132383e.add(tw32);
                }
                return 0;
            }
        }
    }
}
