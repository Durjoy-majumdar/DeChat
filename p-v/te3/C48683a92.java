package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a92 */
public class C48683a92 extends C49335eu3 {

    /* renamed from: d */
    public int f130387d;

    /* renamed from: e */
    public String f130388e;

    /* renamed from: f */
    public String f130389f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48683a92)) {
            return false;
        }
        C48683a92 a922 = (C48683a92) aVar;
        return C46238a.m51546a(this.BaseResponse, a922.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f130387d), Integer.valueOf(a922.f130387d)) && C46238a.m51546a(this.f130388e, a922.f130388e) && C46238a.m51546a(this.f130389f, a922.f130389f);
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
                aVar.mo74318e(2, this.f130387d);
                String str = this.f130388e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f130389f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f130387d);
            String str3 = this.f130388e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f130389f;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
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
            C48683a92 a922 = objArr[1];
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
                    a922.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                a922.f130387d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                a922.f130388e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                a922.f130389f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
