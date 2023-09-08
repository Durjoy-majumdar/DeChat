package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h24 */
public class C49648h24 extends C49335eu3 {

    /* renamed from: d */
    public C48738am3 f134420d;

    /* renamed from: e */
    public C50122kf f134421e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49648h24)) {
            return false;
        }
        C49648h24 h242 = (C49648h24) aVar;
        return C46238a.m51546a(this.BaseResponse, h242.BaseResponse) && C46238a.m51546a(this.f134420d, h242.f134420d) && C46238a.m51546a(this.f134421e, h242.f134421e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f134420d == null) {
                throw new C52419b("Not all required fields were included: qy_base_resp");
            } else if (this.f134421e != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C48738am3 am32 = this.f134420d;
                if (am32 != null) {
                    aVar.mo74322i(2, am32.computeSize());
                    this.f134420d.writeFields(aVar);
                }
                C50122kf kfVar = this.f134421e;
                if (kfVar != null) {
                    aVar.mo74322i(3, kfVar.computeSize());
                    this.f134421e.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: attr");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C48738am3 am33 = this.f134420d;
            if (am33 != null) {
                i2 += C52418a.m58682i(2, am33.computeSize());
            }
            C50122kf kfVar2 = this.f134421e;
            return kfVar2 != null ? i2 + C52418a.m58682i(3, kfVar2.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f134420d == null) {
                throw new C52419b("Not all required fields were included: qy_base_resp");
            } else if (this.f134421e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: attr");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49648h24 h242 = objArr[1];
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
                    h242.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48738am3 am34 = new C48738am3();
                    if (bArr2 != null && bArr2.length > 0) {
                        am34.parseFrom(bArr2);
                    }
                    h242.f134420d = am34;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C50122kf kfVar3 = new C50122kf();
                    if (bArr3 != null && bArr3.length > 0) {
                        kfVar3.parseFrom(bArr3);
                    }
                    h242.f134421e = kfVar3;
                }
                return 0;
            }
        }
    }
}
