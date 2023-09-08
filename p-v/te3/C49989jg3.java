package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jg3 */
public class C49989jg3 extends C49335eu3 {

    /* renamed from: d */
    public ke4 f136109d;

    /* renamed from: e */
    public LinkedList<ke4> f136110e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49989jg3)) {
            return false;
        }
        C49989jg3 jg32 = (C49989jg3) aVar;
        return C46238a.m51546a(this.BaseResponse, jg32.BaseResponse) && C46238a.m51546a(this.f136109d, jg32.f136109d) && C46238a.m51546a(this.f136110e, jg32.f136110e);
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
                ke4 ke4 = this.f136109d;
                if (ke4 != null) {
                    aVar.mo74322i(2, ke4.computeSize());
                    this.f136109d.writeFields(aVar);
                }
                aVar.mo74320g(3, 8, this.f136110e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            ke4 ke42 = this.f136109d;
            if (ke42 != null) {
                i2 += C52418a.m58682i(2, ke42.computeSize());
            }
            return i2 + C52418a.m58680g(3, 8, this.f136110e);
        } else if (i == 2) {
            this.f136110e.clear();
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
            C49989jg3 jg32 = objArr[1];
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
                    jg32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    ke4 ke43 = new ke4();
                    if (bArr2 != null && bArr2.length > 0) {
                        ke43.parseFrom(bArr2);
                    }
                    jg32.f136109d = ke43;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    ke4 ke44 = new ke4();
                    if (bArr3 != null && bArr3.length > 0) {
                        ke44.parseFrom(bArr3);
                    }
                    jg32.f136110e.add(ke44);
                }
                return 0;
            }
        }
    }
}
