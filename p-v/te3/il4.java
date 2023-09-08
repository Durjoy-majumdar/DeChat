package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class il4 extends C49335eu3 {

    /* renamed from: d */
    public C48738am3 f135472d;

    /* renamed from: e */
    public C51960xe f135473e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof il4)) {
            return false;
        }
        il4 il4 = (il4) aVar;
        return C46238a.m51546a(this.BaseResponse, il4.BaseResponse) && C46238a.m51546a(this.f135472d, il4.f135472d) && C46238a.m51546a(this.f135473e, il4.f135473e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f135472d != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C48738am3 am32 = this.f135472d;
                if (am32 != null) {
                    aVar.mo74322i(2, am32.computeSize());
                    this.f135472d.writeFields(aVar);
                }
                C51960xe xeVar = this.f135473e;
                if (xeVar != null) {
                    aVar.mo74322i(3, xeVar.computeSize());
                    this.f135473e.writeFields(aVar);
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
            C48738am3 am33 = this.f135472d;
            if (am33 != null) {
                i2 += C52418a.m58682i(2, am33.computeSize());
            }
            C51960xe xeVar2 = this.f135473e;
            return xeVar2 != null ? i2 + C52418a.m58682i(3, xeVar2.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f135472d != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: qy_base_resp");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            il4 il4 = objArr[1];
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
                    il4.BaseResponse = jaVar3;
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
                    il4.f135472d = am34;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51960xe xeVar3 = new C51960xe();
                    if (bArr3 != null && bArr3.length > 0) {
                        xeVar3.parseFrom(bArr3);
                    }
                    il4.f135473e = xeVar3;
                }
                return 0;
            }
        }
    }
}
