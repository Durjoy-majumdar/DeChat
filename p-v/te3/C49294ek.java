package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ek */
public class C49294ek extends C49335eu3 {

    /* renamed from: d */
    public int f132966d;

    /* renamed from: e */
    public String f132967e;

    /* renamed from: f */
    public int f132968f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49294ek)) {
            return false;
        }
        C49294ek ekVar = (C49294ek) aVar;
        return C46238a.m51546a(this.BaseResponse, ekVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f132966d), Integer.valueOf(ekVar.f132966d)) && C46238a.m51546a(this.f132967e, ekVar.f132967e) && C46238a.m51546a(Integer.valueOf(this.f132968f), Integer.valueOf(ekVar.f132968f));
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
                aVar.mo74318e(2, this.f132966d);
                String str = this.f132967e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74318e(4, this.f132968f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f132966d);
            String str2 = this.f132967e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            return e + C52418a.m58678e(4, this.f132968f);
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
            C49294ek ekVar = objArr[1];
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
                    ekVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ekVar.f132966d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ekVar.f132967e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ekVar.f132968f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
