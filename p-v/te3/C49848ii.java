package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ii */
public class C49848ii extends C49335eu3 {

    /* renamed from: d */
    public int f135350d;

    /* renamed from: e */
    public C89349b f135351e;

    /* renamed from: f */
    public C48738am3 f135352f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49848ii)) {
            return false;
        }
        C49848ii iiVar = (C49848ii) aVar;
        return C46238a.m51546a(this.BaseResponse, iiVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f135350d), Integer.valueOf(iiVar.f135350d)) && C46238a.m51546a(this.f135351e, iiVar.f135351e) && C46238a.m51546a(this.f135352f, iiVar.f135352f);
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
                aVar.mo74318e(2, this.f135350d);
                C89349b bVar = this.f135351e;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                C48738am3 am32 = this.f135352f;
                if (am32 != null) {
                    aVar.mo74322i(4, am32.computeSize());
                    this.f135352f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f135350d);
            C89349b bVar2 = this.f135351e;
            if (bVar2 != null) {
                e += C52418a.m58675b(3, bVar2);
            }
            C48738am3 am33 = this.f135352f;
            return am33 != null ? e + C52418a.m58682i(4, am33.computeSize()) : e;
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
            C49848ii iiVar = objArr[1];
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
                    iiVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                iiVar.f135350d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                iiVar.f135351e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48738am3 am34 = new C48738am3();
                    if (bArr2 != null && bArr2.length > 0) {
                        am34.parseFrom(bArr2);
                    }
                    iiVar.f135352f = am34;
                }
                return 0;
            }
        }
    }
}
