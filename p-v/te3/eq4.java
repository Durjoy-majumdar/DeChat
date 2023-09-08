package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class eq4 extends C49335eu3 {

    /* renamed from: d */
    public String f133075d;

    /* renamed from: e */
    public int f133076e;

    /* renamed from: f */
    public int f133077f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof eq4)) {
            return false;
        }
        eq4 eq4 = (eq4) aVar;
        return C46238a.m51546a(this.BaseResponse, eq4.BaseResponse) && C46238a.m51546a(this.f133075d, eq4.f133075d) && C46238a.m51546a(Integer.valueOf(this.f133076e), Integer.valueOf(eq4.f133076e)) && C46238a.m51546a(Integer.valueOf(this.f133077f), Integer.valueOf(eq4.f133077f));
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
                String str = this.f133075d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f133076e);
                aVar.mo74318e(4, this.f133077f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str2 = this.f133075d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58678e(3, this.f133076e) + C52418a.m58678e(4, this.f133077f);
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
            eq4 eq4 = objArr[1];
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
                    eq4.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                eq4.f133075d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                eq4.f133076e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                eq4.f133077f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
