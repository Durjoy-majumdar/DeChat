package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bw1 */
public class C48916bw1 extends C49335eu3 {

    /* renamed from: d */
    public C48738am3 f131342d;

    /* renamed from: e */
    public C49275ef f131343e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48916bw1)) {
            return false;
        }
        C48916bw1 bw12 = (C48916bw1) aVar;
        return C46238a.m51546a(this.BaseResponse, bw12.BaseResponse) && C46238a.m51546a(this.f131342d, bw12.f131342d) && C46238a.m51546a(this.f131343e, bw12.f131343e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f131342d != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C48738am3 am32 = this.f131342d;
                if (am32 != null) {
                    aVar.mo74322i(2, am32.computeSize());
                    this.f131342d.writeFields(aVar);
                }
                C49275ef efVar = this.f131343e;
                if (efVar != null) {
                    aVar.mo74322i(3, efVar.computeSize());
                    this.f131343e.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: qy_base_resp");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C48738am3 am33 = this.f131342d;
            if (am33 != null) {
                i2 += C52418a.m58682i(2, am33.computeSize());
            }
            C49275ef efVar2 = this.f131343e;
            return efVar2 != null ? i2 + C52418a.m58682i(3, efVar2.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f131342d != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: qy_base_resp");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48916bw1 bw12 = objArr[1];
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
                    bw12.BaseResponse = jaVar3;
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
                    bw12.f131342d = am34;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49275ef efVar3 = new C49275ef();
                    if (bArr3 != null && bArr3.length > 0) {
                        efVar3.parseFrom(bArr3);
                    }
                    bw12.f131343e = efVar3;
                }
                return 0;
            }
        }
    }
}
