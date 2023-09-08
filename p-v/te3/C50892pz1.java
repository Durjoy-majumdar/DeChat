package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pz1 */
public class C50892pz1 extends C49335eu3 {

    /* renamed from: d */
    public C101776f80 f140062d;

    /* renamed from: e */
    public LinkedList<C101800k70> f140063e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50892pz1)) {
            return false;
        }
        C50892pz1 pz12 = (C50892pz1) aVar;
        return C46238a.m51546a(this.BaseResponse, pz12.BaseResponse) && C46238a.m51546a(this.f140062d, pz12.f140062d) && C46238a.m51546a(this.f140063e, pz12.f140063e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f140062d != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C101776f80 f802 = this.f140062d;
                if (f802 != null) {
                    aVar.mo74322i(2, f802.computeSize());
                    this.f140062d.writeFields(aVar);
                }
                aVar.mo74320g(3, 8, this.f140063e);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: EmotionDetail");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C101776f80 f803 = this.f140062d;
            if (f803 != null) {
                i2 += C52418a.m58682i(2, f803.computeSize());
            }
            return i2 + C52418a.m58680g(3, 8, this.f140063e);
        } else if (i == 2) {
            this.f140063e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f140062d != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: EmotionDetail");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50892pz1 pz12 = objArr[1];
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
                    pz12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C101776f80 f804 = new C101776f80();
                    if (bArr2 != null && bArr2.length > 0) {
                        f804.parseFrom(bArr2);
                    }
                    pz12.f140062d = f804;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C101800k70 k702 = new C101800k70();
                    if (bArr3 != null && bArr3.length > 0) {
                        k702.parseFrom(bArr3);
                    }
                    pz12.f140063e.add(k702);
                }
                return 0;
            }
        }
    }
}
